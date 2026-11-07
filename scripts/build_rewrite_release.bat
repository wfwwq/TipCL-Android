@echo off
rem ============================================================
rem TipCL-Android rewrite-project local release packager (self-contained)
rem
rem 1. Locates or downloads portable JDK17 + Gradle 8.7 + Android SDK
rem    into <repo>\.tools\ (domestic mirrors, overridable).
rem 2. Full release build (incl. core-runtime NDK/CMake; needs NDK r26+
rem    either via ANDROID_NDK_HOME or inside the SDK layout).
rem 3. Signing matches CI: inject keystore via env vars
rem    TIPCL_SIGNING_STORE_FILE / _STORE_PASSWORD / _KEY_ALIAS / _KEY_PASSWORD.
rem    Falls back to whatever gradle produced (debug signature) if unset.
rem 4. Output: dist\TipCL-<versionName>-android.apk
rem
rem Usage:
rem   scripts\build_rewrite_release.bat            normal build
rem   scripts\build_rewrite_release.bat --help     show help
rem Overridable variables (set before calling):
rem   MIRROR_JDK17     JDK17 portable zip URL (default: Tsinghua Adoptium)
rem   MIRROR_GRADLE    Gradle 8.7 zip URL (default: Tencent mirror)
rem   SDK_ZIP_URL      Android cmdline-tools zip URL (default: Tencent mirror)
rem   LOCAL_TOOLS_DIR  existing local tools dir (default: ..\..\tools)
rem
rem NOTE: this file is intentionally pure ASCII; cmd batch parsing is
rem codepage-sensitive and breaks on UTF-8 Chinese text.
rem ============================================================
setlocal enabledelayedexpansion

if "%~1"=="--help" goto :help
if "%~1"=="-h" goto :help

set "SCRIPT_DIR=%~dp0"
for %%I in ("%SCRIPT_DIR%..") do set "ROOT_DIR=%%~fI"
set "APP_DIR=%ROOT_DIR%\android-app"
set "TOOLS_DIR=%ROOT_DIR%\.tools"
set "DIST_DIR=%ROOT_DIR%\dist"

if not defined MIRROR_JDK17 set "MIRROR_JDK17=https://mirrors.tuna.tsinghua.edu.cn/Adoptium/17/jdk/x64/windows/OpenJDK17U-jdk_x64_windows_hotspot_17.0.12_7.zip"
if not defined MIRROR_GRADLE set "MIRROR_GRADLE=https://mirrors.cloud.tencent.com/gradle/gradle-8.7-bin.zip"
if not defined SDK_ZIP_URL set "SDK_ZIP_URL=https://mirrors.cloud.tencent.com/AndroidSDK/commandlinetools-win-11076708_latest.zip"

if not defined LOCAL_TOOLS_DIR set "LOCAL_TOOLS_DIR=%ROOT_DIR%\..\tools"

echo [1/5] Preparing toolchain (JDK17 / Gradle 8.7 / Android SDK)...
if not exist "%TOOLS_DIR%" mkdir "%TOOLS_DIR%"

rem --- JDK17: prefer local dir, then .tools cache, else download ---
set "JDK_HOME="
if exist "%LOCAL_TOOLS_DIR%\jdk\bin\java.exe" set "JDK_HOME=%LOCAL_TOOLS_DIR%\jdk"
if not defined JDK_HOME if exist "%TOOLS_DIR%\jdk\bin\java.exe" set "JDK_HOME=%TOOLS_DIR%\jdk"
if not defined JDK_HOME (
    echo   Downloading JDK17: %MIRROR_JDK17%
    call :download "%MIRROR_JDK17%" "%TOOLS_DIR%\jdk17.zip" || goto :fail
    call :unzip "%TOOLS_DIR%\jdk17.zip" "%TOOLS_DIR%\_jdk_tmp" || goto :fail
    call :move_single "%TOOLS_DIR%\_jdk_tmp" "%TOOLS_DIR%\jdk" || goto :fail
    if not exist "%TOOLS_DIR%\jdk\bin\java.exe" (
        echo [ERROR] bin\java.exe not found after JDK extraction
        goto :fail
    )
    set "JDK_HOME=%TOOLS_DIR%\jdk"
)
echo   JAVA_HOME=%JDK_HOME%

rem --- Gradle 8.7 ---
set "GRADLE_HOME="
if exist "%LOCAL_TOOLS_DIR%\gradle-8.7\bin\gradle.bat" set "GRADLE_HOME=%LOCAL_TOOLS_DIR%\gradle-8.7"
if not defined GRADLE_HOME if exist "%TOOLS_DIR%\gradle-8.7\bin\gradle.bat" set "GRADLE_HOME=%TOOLS_DIR%\gradle-8.7"
if not defined GRADLE_HOME (
    echo   Downloading Gradle: %MIRROR_GRADLE%
    call :download "%MIRROR_GRADLE%" "%TOOLS_DIR%\gradle-8.7-bin.zip" || goto :fail
    call :unzip "%TOOLS_DIR%\gradle-8.7-bin.zip" "%TOOLS_DIR%" || goto :fail
    if not exist "%TOOLS_DIR%\gradle-8.7\bin\gradle.bat" (
        echo [ERROR] bin\gradle.bat not found after Gradle extraction
        goto :fail
    )
    set "GRADLE_HOME=%TOOLS_DIR%\gradle-8.7"
)
echo   GRADLE_HOME=%GRADLE_HOME%

rem --- Android SDK ---
set "SDK_HOME="
if exist "%LOCAL_TOOLS_DIR%\android-sdk\platforms\android-35" set "SDK_HOME=%LOCAL_TOOLS_DIR%\android-sdk"
if not defined SDK_HOME if exist "%TOOLS_DIR%\android-sdk\platforms\android-35" set "SDK_HOME=%TOOLS_DIR%\android-sdk"
if not defined SDK_HOME (
    echo   Downloading Android cmdline-tools: %SDK_ZIP_URL%
    call :download "%SDK_ZIP_URL%" "%TOOLS_DIR%\cmdline-tools.zip" || goto :fail
    call :unzip "%TOOLS_DIR%\cmdline-tools.zip" "%TOOLS_DIR%\_sdk_tmp" || goto :fail
    call :move_single "%TOOLS_DIR%\_sdk_tmp" "%TOOLS_DIR%\android-sdk" || goto :fail
    if exist "%TOOLS_DIR%\android-sdk\cmdline-tools" if not exist "%TOOLS_DIR%\android-sdk\cmdline-tools\latest" (
        move "%TOOLS_DIR%\android-sdk\cmdline-tools" "%TOOLS_DIR%\android-sdk\_ct" >nul
        mkdir "%TOOLS_DIR%\android-sdk\cmdline-tools"
        move "%TOOLS_DIR%\android-sdk\_ct" "%TOOLS_DIR%\android-sdk\cmdline-tools\latest" >nul
    )
    echo   Installing platforms;android-35 + build-tools;34.0.0 + platform-tools via sdkmanager...
    set "JAVA_HOME=%JDK_HOME%"
    call "%TOOLS_DIR%\android-sdk\cmdline-tools\latest\bin\sdkmanager.bat" --sdk_root="%TOOLS_DIR%\android-sdk" "platforms;android-35" "build-tools;34.0.0" "platform-tools" || goto :fail
    if not exist "%TOOLS_DIR%\android-sdk\platforms\android-35" (
        echo [ERROR] SDK component install failed. Set HTTPS_PROXY and retry on restricted networks.
        goto :fail
    )
    set "SDK_HOME=%TOOLS_DIR%\android-sdk"
)
echo   ANDROID_HOME=%SDK_HOME%

rem --- NDK ---
if not defined ANDROID_NDK_HOME if exist "%LOCAL_TOOLS_DIR%\android-sdk\ndk" (
    for /d %%D in ("%LOCAL_TOOLS_DIR%\android-sdk\ndk\*") do set "ANDROID_NDK_HOME=%%~fD"
)
if not defined ANDROID_NDK_HOME if exist "%SDK_HOME%\ndk" (
    for /d %%D in ("%SDK_HOME%\ndk\*") do set "ANDROID_NDK_HOME=%%~fD"
)
if not defined ANDROID_NDK_HOME (
    echo [ERROR] NDK not found. core-runtime CMake needs NDK r26+.
    echo         Install it, then set ANDROID_NDK_HOME and rerun.
    goto :fail
)
echo   ANDROID_NDK_HOME=%ANDROID_NDK_HOME%

rem --- Build ---
echo [2/5] Building release APK (full build incl. NDK/CMake)...
set "JAVA_HOME=%JDK_HOME%"
set "ANDROID_HOME=%SDK_HOME%"
set "ANDROID_SDK_ROOT=%SDK_HOME%"
pushd "%APP_DIR%"
if exist "gradle\wrapper\gradle-wrapper.jar" (
    call gradlew.bat --no-daemon assembleRelease || (popd & goto :fail)
) else (
    echo   gradle-wrapper.jar missing, invoking local Gradle 8.7 directly
    call "%GRADLE_HOME%\bin\gradle.bat" --no-daemon assembleRelease || (popd & goto :fail)
)
popd

rem --- Locate APK and version ---
echo [3/5] Collecting artifacts...
set "APK="
for /r "%APP_DIR%\app\build\outputs\apk\release" %%F in (*.apk) do set "APK=%%~fF"
if not defined APK (
    echo [ERROR] no release APK found
    goto :fail
)
set "VERSION="
for /f "tokens=2 delims== " %%V in ('findstr "versionName" "%APP_DIR%\app\build.gradle.kts"') do (
    set "V=%%V"
    set V=!V:"=!
    if not defined VERSION set "VERSION=!V!"
)
if not defined VERSION (
    echo [WARN] could not parse versionName from build.gradle.kts, using "unknown"
    set "VERSION=unknown"
)
echo   version=%VERSION%

rem --- Sign (same logic as CI: env-injected keystore, else debug fallback) ---
echo [4/5] Signing...
if not exist "%DIST_DIR%" mkdir "%DIST_DIR%"
set "SIGNED_APK=%DIST_DIR%\TipCL-%VERSION%-android.apk"
copy /y "%APK%" "%SIGNED_APK%" >nul

set "APKSIGNER="
if exist "%SDK_HOME%\build-tools\34.0.0\apksigner.bat" set "APKSIGNER=%SDK_HOME%\build-tools\34.0.0\apksigner.bat"
if not defined APKSIGNER (
    echo [ERROR] build-tools\34.0.0\apksigner.bat not found
    goto :fail
)

if defined TIPCL_SIGNING_STORE_FILE (
    echo   Using keystore from env: %TIPCL_SIGNING_STORE_FILE%
    call "%APKSIGNER%" sign --ks "%TIPCL_SIGNING_STORE_FILE%" --ks-key-alias "%TIPCL_SIGNING_KEY_ALIAS%" --ks-pass env:TIPCL_SIGNING_STORE_PASSWORD --ks-key-pass env:TIPCL_SIGNING_KEY_PASSWORD "%SIGNED_APK%" || goto :fail
) else (
    echo   [WARN] TIPCL_SIGNING_STORE_FILE not set; APK keeps the signature Gradle
    echo          produced (debug fallback, local debugging only).
    echo          For a CI-equivalent release signature, set TIPCL_SIGNING_STORE_FILE /
    echo          TIPCL_SIGNING_STORE_PASSWORD / TIPCL_SIGNING_KEY_ALIAS /
    echo          TIPCL_SIGNING_KEY_PASSWORD and rerun.
)
call "%APKSIGNER%" verify "%SIGNED_APK%" || goto :fail

echo [5/5] Done: %SIGNED_APK%
exit /b 0

:fail
echo.
echo [FAILED] packaging did not complete; see log above.
exit /b 1

:help
echo Usage: scripts\build_rewrite_release.bat
echo   Self-contained packaging: locates/downloads JDK17 + Gradle 8.7 + Android SDK
echo   into .tools\ (domestic mirrors), full release build (incl. NDK/CMake),
echo   signs and produces dist\TipCL-^<version^>-android.apk.
echo.
echo Signing env vars (same as CI):
echo   TIPCL_SIGNING_STORE_FILE      keystore path (unset = debug-signature fallback)
echo   TIPCL_SIGNING_STORE_PASSWORD
echo   TIPCL_SIGNING_KEY_ALIAS
echo   TIPCL_SIGNING_KEY_PASSWORD
echo.
echo Overridable: MIRROR_JDK17 / MIRROR_GRADLE / SDK_ZIP_URL / LOCAL_TOOLS_DIR
exit /b 0

:download
rem %1=url  %2=dest
if exist "%~2" (
    echo   Cached copy already present: %~2
    exit /b 0
)
powershell -NoProfile -Command "[Net.ServicePointManager]::SecurityProtocol=[Net.SecurityProtocolType]::Tls12; Invoke-WebRequest -Uri '%~1' -OutFile '%~2' -UseBasicParsing" || exit /b 1
exit /b 0

:unzip
rem %1=zip  %2=destDir
if not exist "%~2" mkdir "%~2"
powershell -NoProfile -Command "Expand-Archive -LiteralPath '%~1' -DestinationPath '%~2' -Force" || exit /b 1
exit /b 0

:move_single
rem %1=srcDir (contains one top-level dir or loose files)  %2=destDir
set "INNER="
set "LOOSE="
for /d %%D in ("%~1\*") do set "INNER=%%~fD"
for %%F in ("%~1\*") do set "LOOSE=1"
if defined INNER if not defined LOOSE (
    move "%INNER%" "%~2" >nul
    rmdir /s /q "%~1"
) else (
    move "%~1" "%~2" >nul
)
exit /b 0
