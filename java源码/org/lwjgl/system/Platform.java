package org.lwjgl.system;

import com.pymcl.runtime.input.InputSettings;
import java.util.function.Function;
import java.util.regex.Pattern;
import org.apache.commons.lang3.SystemProperties;
import org.lwjgl.LWJGLUtil;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Platform.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Platform.class */
public enum Platform {
    FREEBSD("FreeBSD", "freebsd") { // from class: org.lwjgl.system.Platform.1
        private final Pattern SO = Pattern.compile("(?:^|/)lib\\w+[.]so(?:[.]\\d+)*$");

        @Override // org.lwjgl.system.Platform
        String mapLibraryName(String name) {
            if (this.SO.matcher(name).find()) {
                return name;
            }
            return System.mapLibraryName(name);
        }
    },
    LINUX("Linux", LWJGLUtil.PLATFORM_LINUX_NAME) { // from class: org.lwjgl.system.Platform.2
        private final Pattern SO = Pattern.compile("(?:^|/)lib\\w+[.]so(?:[.]\\d+)*$");

        @Override // org.lwjgl.system.Platform
        String mapLibraryName(String name) {
            if (this.SO.matcher(name).find()) {
                return name;
            }
            return System.mapLibraryName(name);
        }
    },
    MACOSX("macOS", "macos") { // from class: org.lwjgl.system.Platform.3
        private final Pattern DYLIB = Pattern.compile("(?:^|/)lib\\w+(?:[.]\\d+)*[.]dylib$");

        @Override // org.lwjgl.system.Platform
        String mapLibraryName(String name) {
            if (this.DYLIB.matcher(name).find()) {
                return name;
            }
            return System.mapLibraryName(name);
        }
    },
    WINDOWS("Windows", LWJGLUtil.PLATFORM_WINDOWS_NAME) { // from class: org.lwjgl.system.Platform.4
        @Override // org.lwjgl.system.Platform
        String mapLibraryName(String name) {
            if (name.endsWith(".dll")) {
                return name;
            }
            return System.mapLibraryName(name);
        }
    };

    private static final Platform current;
    private static final Function<String, String> bundledLibraryNameMapper;
    private static final Function<String, String> bundledLibraryPathMapper;
    private final String name;
    private final String nativePath;

    abstract String mapLibraryName(String str);

    static {
        String osName = System.getProperty(SystemProperties.OS_NAME);
        if (osName.startsWith("Windows")) {
            current = WINDOWS;
        } else if (osName.startsWith("FreeBSD")) {
            current = FREEBSD;
        } else if (osName.startsWith("Linux") || osName.startsWith("SunOS") || osName.startsWith("Unix")) {
            current = LINUX;
        } else if (osName.startsWith("Mac OS X") || osName.startsWith("Darwin")) {
            current = MACOSX;
        } else {
            throw new LinkageError("Unknown platform: " + osName);
        }
        bundledLibraryNameMapper = getMapper(Configuration.BUNDLED_LIBRARY_NAME_MAPPER.get(InputSettings.DEFAULT_LAYOUT), name -> {
            return name;
        }, name2 -> {
            return Architecture.current.is64Bit ? name2 : name2 + "32";
        });
        bundledLibraryPathMapper = getMapper(Configuration.BUNDLED_LIBRARY_PATH_MAPPER.get(InputSettings.DEFAULT_LAYOUT), name3 -> {
            return current.nativePath + "/" + Architecture.current.name().toLowerCase() + "/" + name3;
        }, name4 -> {
            return name4.substring(name4.lastIndexOf(47));
        });
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Platform$Architecture.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Platform$Architecture.class */
    public enum Architecture {
        X64(true),
        X86(false),
        ARM64(true),
        ARM32(false),
        PPC64LE(true),
        RISCV64(true);

        static final Architecture current;
        final boolean is64Bit;

        static {
            String osArch = System.getProperty(SystemProperties.OS_ARCH);
            boolean is64Bit = osArch.contains("64") || osArch.startsWith("armv8");
            if (osArch.startsWith("arm") || osArch.startsWith("aarch")) {
                current = is64Bit ? ARM64 : ARM32;
                return;
            }
            if (osArch.startsWith("ppc")) {
                if (!"ppc64le".equals(osArch)) {
                    throw new UnsupportedOperationException("Only PowerPC 64 LE is supported.");
                }
                current = PPC64LE;
            } else {
                if (osArch.startsWith("riscv")) {
                    if (!"riscv64".equals(osArch)) {
                        throw new UnsupportedOperationException("Only RISC-V 64 is supported.");
                    }
                    current = RISCV64;
                    return;
                }
                current = is64Bit ? X64 : X86;
            }
        }

        Architecture(boolean is64Bit) {
            this.is64Bit = is64Bit;
        }

        public boolean is32Bit() {
            return !this.is64Bit;
        }

        public boolean is64Bit() {
            return this.is64Bit;
        }
    }

    Platform(String name, String nativePath) {
        this.name = name;
        this.nativePath = nativePath;
    }

    public String getName() {
        return this.name;
    }

    public static Platform get() {
        return current;
    }

    public static Architecture getArchitecture() {
        return Architecture.current;
    }

    public static String mapLibraryNameBundled(String name) {
        return bundledLibraryNameMapper.apply(name);
    }

    static String mapLibraryPathBundled(String name) {
        return bundledLibraryPathMapper.apply(name);
    }

    private static Function<String, String> getMapper(Object mapper, Function<String, String> defaultMapper, Function<String, String> legacyMapper) {
        if (mapper == null || InputSettings.DEFAULT_LAYOUT.equals(mapper)) {
            return defaultMapper;
        }
        if ("legacy".equals(mapper)) {
            return legacyMapper;
        }
        if (mapper instanceof Function) {
            return (Function) mapper;
        }
        String className = mapper.toString();
        try {
            return (Function) Class.forName(className).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable t) {
            if (Checks.DEBUG) {
                t.printStackTrace(APIUtil.DEBUG_STREAM);
            }
            APIUtil.apiLog(String.format("Warning: Failed to instantiate bundled library mapper: %s. Using the default.", className));
            return defaultMapper;
        }
    }
}
