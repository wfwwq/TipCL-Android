#!/usr/bin/env python3
"""Generate / verify THIRD-PARTY-NOTICES.md for the TipCL Android tree.

DATA SOURCES (all in-repo; no network, no environment variables, no secrets)
-------------------------------------------------------------------------
1. android-app/gradle/libs.versions.toml
     - [versions]  : version aliases (e.g. coreKtx = "1.13.1")
     - [libraries] : alias -> { group, name, version.ref = "<alias>" }
                     (an entry without version.ref is BOM/platform-managed)
2. android-app/**/build.gradle.kts
     Only the `dependencies { ... }` blocks are read. Recognised forms:
       implementation(libs.foo) / testImplementation(libs.foo) / api(...) /
       debugImplementation(...) / compileOnly(...) / runtimeOnly(...)
       implementation(platform(libs.foo))          -> the platform artifact itself
       testImplementation(kotlin("test"))          -> org.jetbrains.kotlin:kotlin-test
       testImplementation("g:a:v")                 -> inline coordinate
       api(project(":core-input"))                 -> SKIPPED (in-repo, not third-party)
3. LICENSE_TABLE (below): "group:artifact" -> (SPDX license id, homepage).

RULES
-----
* The listed component set is the UNION of third-party dependencies actually
  declared by the modules. It is derived from the repo, never hard-coded.
* Version column = the version declared for that artifact. "-" means the
  version is not declared at this level (managed by the compose BOM / platform).
* Ordering = sorted by (group, artifact).  (Sorting by the joined
  "group:artifact" string does NOT reproduce the artifact: it would place
  androidx.compose:compose-bom after androidx.compose.material3:material3.)
* Output line endings are CRLF, because the committed artifact
  THIRD-PARTY-NOTICES.md is stored as CRLF (`git ls-files --eol` -> i/crlf).
  Reproducing the artifact byte-for-byte requires matching that.
* A dependency that is NOT in LICENSE_TABLE is a HARD ERROR (exit 2), never a
  silent omission: a compliance list must not silently lose entries. This is
  what surfaced org.json:json, which was missing until R31.

LICENSE_TABLE provenance
------------------------
Each entry's SPDX id + homepage is a compliance statement, not something this
script may invent. The `org.json:json` entry (SPDX `JSON`) was ratified by the
project owner on 2026-11-15 (R31); adding further entries requires the same
kind of human decision.

USAGE
-----
    python -I tools/notices/generate_notices.py --check          # CI: compare, exit 1 if stale
    python -I tools/notices/generate_notices.py --write          # regenerate the artifact
    python -I tools/notices/generate_notices.py --emit OUT.md    # audit: write elsewhere, touch nothing
    python -I tools/notices/generate_notices.py --check --root <repo-root>

Requires CPython >= 3.11 (stdlib `tomllib`). No third-party imports.
"""

from __future__ import annotations

import argparse
import difflib
import re
import sys
from pathlib import Path

try:
    import tomllib
except ModuleNotFoundError:  # pragma: no cover
    print("ERROR: this script needs CPython >= 3.11 (stdlib tomllib).", file=sys.stderr)
    raise SystemExit(2)

ARTIFACT_REL = "THIRD-PARTY-NOTICES.md"
CATALOG_REL = "android-app/gradle/libs.versions.toml"
MODULES_GLOB = "android-app/**/build.gradle.kts"

# "group:artifact" -> (SPDX license id, homepage)
LICENSE_TABLE: dict[str, tuple[str, str]] = {
    "androidx.activity:activity-compose": (
        "Apache-2.0",
        "https://developer.android.com/jetpack/androidx/releases/activity",
    ),
    "androidx.compose:compose-bom": (
        "Apache-2.0",
        "https://developer.android.com/jetpack/compose/bom",
    ),
    "androidx.compose.material3:material3": (
        "Apache-2.0",
        "https://developer.android.com/jetpack/compose/material3",
    ),
    "androidx.compose.ui:ui": (
        "Apache-2.0",
        "https://developer.android.com/jetpack/compose",
    ),
    "androidx.compose.ui:ui-graphics": (
        "Apache-2.0",
        "https://developer.android.com/jetpack/compose",
    ),
    "androidx.compose.ui:ui-tooling": (
        "Apache-2.0",
        "https://developer.android.com/jetpack/compose",
    ),
    "androidx.compose.ui:ui-tooling-preview": (
        "Apache-2.0",
        "https://developer.android.com/jetpack/compose",
    ),
    "androidx.core:core-ktx": (
        "Apache-2.0",
        "https://developer.android.com/jetpack/androidx/releases/core",
    ),
    "androidx.lifecycle:lifecycle-runtime-ktx": (
        "Apache-2.0",
        "https://developer.android.com/jetpack/androidx/releases/lifecycle",
    ),
    "com.google.android.material:material": (
        "Apache-2.0",
        "https://material.io/develop/android",
    ),
    "com.squareup.okhttp3:okhttp": (
        "Apache-2.0",
        "https://square.github.io/okhttp/",
    ),
    "junit:junit": ("EPL-1.0", "https://junit.org/junit4/"),
    "org.jetbrains.kotlin:kotlin-test": ("Apache-2.0", "https://kotlinlang.org/"),
    "org.jetbrains.kotlinx:kotlinx-serialization-json": (
        "Apache-2.0",
        "https://github.com/Kotlin/kotlinx.serialization",
    ),
    # Test-only dependency of core-ui (android.jar only ships a throwing stub for
    # org.json, so the real artifact is used by the OverlayLayoutJson round-trip test).
    # Ratified by the project owner on 2026-11-15 (R31): SPDX `JSON`.
    "org.json:json": ("JSON", "https://json.org/"),
}

PROSE = """\
<!-- AUTO-GENERATED by tools/notices/generate_notices.py -- do not edit by hand. -->
<!-- Regenerate: python tools/notices/generate_notices.py --write -->

# Third-Party Notices

This file is **auto-generated** by `tools/notices/generate_notices.py`, which scans the
`android-app/` Gradle modules (`**/build.gradle.kts` dependency declarations and
`gradle/libs.versions.toml`) and maps each library to its license via a built-in
SPDX lookup table. It is verified monthly by the `.github/workflows/notices.yml`
cron workflow (`--check`); a failing job means the file is stale and needs
regeneration (`--write`).

To add or update a license entry, extend `LICENSE_TABLE` in the generator script.
"""

# ---------------------------------------------------------------------------
# parsing
# ---------------------------------------------------------------------------

_DEP_CALL_RE = re.compile(
    r"""^\s*
        (?P<config>[A-Za-z]+)\s*\(\s*              # configuration name, e.g. implementation
        (?P<arg>.*?)
        \s*\)\s*(?://.*)?$                         # trailing line comment ignored
    """,
    re.VERBOSE,
)

_LIBS_RE = re.compile(r"^libs\.([A-Za-z0-9_.]+)$")
_COORD_RE = re.compile(r'^"([^":]+):([^":]+):([^"]+)"$')
_KOTLIN_TEST_RE = re.compile(r'^kotlin\("test"\)$')
_PLATFORM_RE = re.compile(r"^platform\(libs\.([A-Za-z0-9_.]+)\)$")
_PROJECT_RE = re.compile(r'^project\("(:[^"]*)"\)$')
_BLOCK_COMMENT_RE = re.compile(r"/\*.*?\*/", re.DOTALL)


def _strip_comments(text: str) -> str:
    return _BLOCK_COMMENT_RE.sub("", text)


def load_catalog(root: Path) -> tuple[dict[str, str], dict[str, dict]]:
    """Return ([versions] table, [libraries] table) from libs.versions.toml."""
    path = root / CATALOG_REL
    with path.open("rb") as fh:
        data = tomllib.load(fh)
    return data.get("versions", {}), data.get("libraries", {})


def _alias_entry(alias: str, libs: dict[str, dict]) -> dict | None:
    """Look up a version-catalog alias used in Kotlin DSL (`libs.a.b-c`)."""
    if alias in libs:
        return libs[alias]
    # Gradle treats '-' and '_' as interchangeable in catalog keys.
    for cand in (alias.replace(".", "-"), alias.replace("_", "-")):
        if cand in libs:
            return libs[cand]
    return None


def _alias_to_key(alias: str, libs: dict[str, dict]) -> str | None:
    entry = _alias_entry(alias, libs)
    if entry is None:
        return None
    group, name = entry.get("group"), entry.get("name")
    if not group or not name:
        return None
    return f"{group}:{name}"


def _resolve_version(alias: str, libs: dict[str, dict], versions: dict[str, str]) -> str | None:
    entry = _alias_entry(alias, libs)
    if entry is None:
        return None
    ver = entry.get("version")
    if isinstance(ver, str):
        return ver
    if isinstance(ver, dict):
        if "ref" in ver:
            return versions.get(ver["ref"])
        if "require" in ver:
            return ver["require"]
    return None


def collect_dependencies(root: Path) -> list[tuple[str, str | None]]:
    """Return the sorted, de-duplicated list of (group:artifact, version|None)."""
    versions, libs = load_catalog(root)
    found: dict[str, str | None] = {}

    for module in sorted(root.glob(MODULES_GLOB)):
        text = _strip_comments(module.read_text(encoding="utf-8"))
        in_deps = False
        depth = 0
        for raw_line in text.splitlines():
            if not in_deps:
                if re.match(r"^\s*dependencies\s*\{\s*$", raw_line):
                    in_deps = True
                    depth = 1
                continue
            depth += raw_line.count("{") - raw_line.count("}")
            if depth <= 0:
                in_deps = False
                continue
            match = _DEP_CALL_RE.match(raw_line)
            if not match:
                continue
            arg = match.group("arg").strip()

            if _PROJECT_RE.match(arg):
                continue  # in-repo module, not a third-party component

            key: str | None = None
            version: str | None = None

            m = _PLATFORM_RE.match(arg)
            if m:
                key = _alias_to_key(m.group(1), libs)
                version = _resolve_version(m.group(1), libs, versions)

            if key is None:
                m = _LIBS_RE.match(arg)
                if m:
                    key = _alias_to_key(m.group(1), libs)
                    version = _resolve_version(m.group(1), libs, versions)

            if key is None and _KOTLIN_TEST_RE.match(arg):
                key = "org.jetbrains.kotlin:kotlin-test"
                # `kotlin("test")` inherits the Kotlin *plugin* version.
                version = versions.get("kotlin")

            if key is None:
                m = _COORD_RE.match(arg)
                if m:
                    key, version = f"{m.group(1)}:{m.group(2)}", m.group(3)

            if key is None:
                continue

            # First declaration wins; the same artifact may appear in several modules.
            found.setdefault(key, version)

    return sorted(found.items(), key=lambda kv: tuple(kv[0].split(":", 1)))


def render(deps: list[tuple[str, str | None]]) -> str:
    unmapped = [key for key, _ in deps if key not in LICENSE_TABLE]
    if unmapped:
        # Distinct exit code so CI can tell "the dependency list is incomplete"
        # (=2) apart from "the artifact is merely stale" (=1).
        print(
            "ERROR: dependency/dependencies declared in android-app/**/build.gradle.kts but "
            "missing from LICENSE_TABLE:\n"
            + "\n".join(f"  - {key}" for key in unmapped)
            + "\n\nThis is deliberate: a compliance list must not silently drop entries.\n"
            "Decide the SPDX id + homepage and add them to LICENSE_TABLE, then re-run.",
            file=sys.stderr,
        )
        raise SystemExit(2)

    lines = PROSE.split("\n")
    lines += [
        "| Component | Version | License | Homepage |",
        "| --- | --- | --- | --- |",
    ]
    for key, version in deps:
        license_id, homepage = LICENSE_TABLE[key]
        lines.append(f"| {key} | {version or '-'} | {license_id} | {homepage} |")
    return "".join(line + "\r\n" for line in lines)


# ---------------------------------------------------------------------------
# CLI
# ---------------------------------------------------------------------------


def main(argv: list[str] | None = None) -> int:
    parser = argparse.ArgumentParser(
        description="Generate or verify THIRD-PARTY-NOTICES.md (TipCL Android)."
    )
    mode = parser.add_mutually_exclusive_group()
    mode.add_argument("--check", action="store_true", help="compare artifact with generated output (default)")
    mode.add_argument("--write", action="store_true", help="overwrite the artifact in place")
    mode.add_argument("--emit", metavar="PATH", help="write generated output to PATH instead (audit mode)")
    parser.add_argument("--root", metavar="PATH", help="repository root (default: inferred from script location)")
    args = parser.parse_args(argv)

    if args.root:
        root = Path(args.root).resolve()
    else:
        root = Path(__file__).resolve().parents[2]
    if not (root / CATALOG_REL).is_file():
        print(f"ERROR: not a TipCL-Android root (missing {CATALOG_REL}): {root}", file=sys.stderr)
        return 2

    deps = collect_dependencies(root)
    generated = render(deps)
    generated_bytes = generated.encode("utf-8")

    print(f"modules scanned : {MODULES_GLOB}")
    print(f"components found: {len(deps)} (third-party, de-duplicated)")
    for key, version in deps:
        print(f"  {key} {version or '-'}")

    if args.emit:
        out = Path(args.emit)
        out.write_bytes(generated_bytes)
        print(f"\nemitted {len(generated_bytes)} bytes -> {out}")
        return 0

    if not args.write:
        args.check = True

    artifact = root / ARTIFACT_REL
    if args.write:
        artifact.write_bytes(generated_bytes)
        print(f"\nwrote {len(generated_bytes)} bytes -> {artifact}")
        return 0

    if not artifact.is_file():
        print(f"ERROR: artifact not found: {artifact}", file=sys.stderr)
        return 1

    actual_bytes = artifact.read_bytes()
    if actual_bytes == generated_bytes:
        print(f"\nOK: {ARTIFACT_REL} is up to date ({len(actual_bytes)} bytes, byte-identical).")
        return 0

    print(f"\nSTALE: {ARTIFACT_REL} differs from generated output.", file=sys.stderr)
    print(f"  artifact : {len(actual_bytes)} bytes", file=sys.stderr)
    print(f"  generated: {len(generated_bytes)} bytes", file=sys.stderr)
    # Normalise CRLF only for the human-readable diff; the verdict above is bytewise.
    actual_text = "".join(
        line + "\n" for line in actual_bytes.decode("utf-8").split("\r\n")
    )
    wanted_text = "".join(line + "\n" for line in generated.split("\r\n"))
    diff = difflib.unified_diff(
        actual_text.splitlines(keepends=True),
        wanted_text.splitlines(keepends=True),
        fromfile=f"{ARTIFACT_REL} (committed)",
        tofile=f"{ARTIFACT_REL} (generated)",
    )
    sys.stderr.write("".join(diff))
    return 1


if __name__ == "__main__":
    raise SystemExit(main())
