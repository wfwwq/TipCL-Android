package org.lwjgl.system;

import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.freebsd.FreeBSDLibrary;
import org.lwjgl.system.libffi.FFICIF;
import org.lwjgl.system.libffi.FFIType;
import org.lwjgl.system.libffi.LibFFI;
import org.lwjgl.system.linux.LinuxLibrary;
import org.lwjgl.system.macosx.MacOSXLibrary;
import org.lwjgl.system.windows.User32;
import org.lwjgl.system.windows.WindowsLibrary;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/APIUtil.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/APIUtil.class */
public final class APIUtil {
    public static final PrintStream DEBUG_STREAM = getDebugStream();
    private static final Pattern API_VERSION_PATTERN = Pattern.compile("^[^\\d\\n\\r]*(\\d+)[.](\\d+)(?:[.](\\S+))?(?:\\s+(.+?))?\\s*$", 32);

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/APIUtil$Encoder.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/APIUtil$Encoder.class */
    public interface Encoder {
        ByteBuffer encode(CharSequence charSequence, boolean z);
    }

    private static PrintStream getDebugStream() {
        PrintStream debugStream = System.err;
        Object state = Configuration.DEBUG_STREAM.get();
        if (state instanceof String) {
            try {
                Supplier<PrintStream> factory = (Supplier) Class.forName((String) state).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                debugStream = factory.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (state instanceof Supplier) {
            debugStream = (PrintStream) ((Supplier) state).get();
        } else if (state instanceof PrintStream) {
            debugStream = (PrintStream) state;
        }
        return debugStream;
    }

    private APIUtil() {
    }

    public static void apiLog(CharSequence msg) {
        if (Checks.DEBUG) {
            DEBUG_STREAM.print("[LWJGL] " + ((Object) msg) + StringUtils.LF);
        }
    }

    public static void apiLogMore(CharSequence msg) {
        if (Checks.DEBUG) {
            DEBUG_STREAM.print("\t" + ((Object) msg) + StringUtils.LF);
        }
    }

    public static void apiLogMissing(String api, ByteBuffer functionName) {
        if (Checks.DEBUG) {
            String function = MemoryUtil.memASCII(functionName, functionName.remaining() - 1);
            DEBUG_STREAM.print("[LWJGL] Failed to locate address for " + api + " function " + function + StringUtils.LF);
        }
    }

    public static String apiFindLibrary(String start, String name) throws IOException {
        String libName = Platform.get().mapLibraryName(name);
        try {
            Stream<Path> paths = Files.find(Paths.get(start, new String[0]).toAbsolutePath(), Integer.MAX_VALUE, (path, attributes) -> {
                return attributes.isRegularFile() && path.getFileName().toString().equals(libName);
            }, new FileVisitOption[0]);
            try {
                String str = (String) paths.findFirst().map((v0) -> {
                    return v0.toString();
                }).orElse(name);
                if (paths != null) {
                    paths.close();
                }
                return str;
            } finally {
            }
        } catch (IOException e) {
            return name;
        }
    }

    public static SharedLibrary apiCreateLibrary(String name) {
        switch (Platform.get()) {
            case FREEBSD:
                return new FreeBSDLibrary(name);
            case LINUX:
                return new LinuxLibrary(name);
            case MACOSX:
                return MacOSXLibrary.create(name);
            case WINDOWS:
                return new WindowsLibrary(name);
            default:
                throw new IllegalStateException();
        }
    }

    public static long apiGetFunctionAddress(FunctionProvider provider, String functionName) {
        long a = provider.getFunctionAddress(functionName);
        if (a == 0) {
            requiredFunctionMissing(functionName);
        }
        return a;
    }

    private static void requiredFunctionMissing(String functionName) {
        if (!Configuration.DISABLE_FUNCTION_CHECKS.get(false).booleanValue()) {
            throw new NullPointerException("A required function is missing: " + functionName);
        }
    }

    public static long apiGetFunctionAddressOptional(SharedLibrary library, String functionName) {
        long a = library.getFunctionAddress(functionName);
        if (Checks.DEBUG_FUNCTIONS && a == 0) {
            optionalFunctionMissing(library, functionName);
        }
        return a;
    }

    private static void optionalFunctionMissing(SharedLibrary library, String functionName) {
        if (Checks.DEBUG) {
            DEBUG_STREAM.print("[LWJGL] Failed to locate address for " + library.getName() + " function " + functionName + StringUtils.LF);
        }
    }

    public static ByteBuffer apiGetMappedBuffer(ByteBuffer buffer, long mappedAddress, int capacity) {
        if (buffer != null && MemoryUtil.memAddress(buffer) == mappedAddress && buffer.capacity() == capacity) {
            return buffer;
        }
        if (mappedAddress == 0) {
            return null;
        }
        return MemoryUtil.wrapBufferByte(mappedAddress, capacity);
    }

    public static long apiGetBytes(int elements, int elementShift) {
        return (elements & 4294967295L) << elementShift;
    }

    public static long apiCheckAllocation(int elements, long bytes, long maxBytes) {
        if (Checks.DEBUG) {
            if (elements < 0) {
                throw new IllegalArgumentException("Invalid number of elements");
            }
            if (maxBytes - Long.MIN_VALUE < bytes - Long.MIN_VALUE) {
                throw new IllegalArgumentException("The request allocation is too large");
            }
        }
        return bytes;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/APIUtil$APIVersion.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/APIUtil$APIVersion.class */
    public static class APIVersion implements Comparable<APIVersion> {
        public final int major;
        public final int minor;
        public final String revision;
        public final String implementation;

        public APIVersion(int major, int minor) {
            this(major, minor, null, null);
        }

        public APIVersion(int major, int minor, String revision, String implementation) {
            this.major = major;
            this.minor = minor;
            this.revision = revision;
            this.implementation = implementation;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(16);
            sb.append(this.major).append('.').append(this.minor);
            if (this.revision != null) {
                sb.append('.').append(this.revision);
            }
            if (this.implementation != null) {
                sb.append(" (").append(this.implementation).append(')');
            }
            return sb.toString();
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof APIVersion)) {
                return false;
            }
            APIVersion that = (APIVersion) o;
            return this.major == that.major && this.minor == that.major && Objects.equals(this.revision, that.revision) && Objects.equals(this.implementation, that.implementation);
        }

        public int hashCode() {
            int result = this.major;
            return (31 * ((31 * ((31 * result) + this.minor)) + (this.revision != null ? this.revision.hashCode() : 0))) + (this.implementation != null ? this.implementation.hashCode() : 0);
        }

        @Override // java.lang.Comparable
        public int compareTo(APIVersion other) {
            if (this.major != other.major) {
                return Integer.compare(this.major, other.major);
            }
            if (this.minor != other.minor) {
                return Integer.compare(this.minor, other.minor);
            }
            return 0;
        }
    }

    public static APIVersion apiParseVersion(Configuration<?> option) {
        APIVersion version;
        Object state = option.get();
        if (state instanceof String) {
            version = apiParseVersion((String) state);
        } else if (state instanceof APIVersion) {
            version = (APIVersion) state;
        } else {
            version = null;
        }
        return version;
    }

    public static APIVersion apiParseVersion(String version) {
        Matcher matcher = API_VERSION_PATTERN.matcher(version);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(String.format("Malformed API version string [%s]", version));
        }
        return new APIVersion(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), matcher.group(3), matcher.group(4));
    }

    public static void apiFilterExtensions(Set<String> extensions, Configuration<Object> option) {
        Object value = option.get();
        if (value == null) {
            return;
        }
        if (!(value instanceof String)) {
            if (value instanceof List) {
                List<String> list = (List) value;
                extensions.removeAll(list);
                return;
            } else {
                if (value instanceof Predicate) {
                    Predicate<String> predicate = (Predicate) value;
                    extensions.removeIf(predicate);
                    return;
                }
                throw new IllegalStateException("Unsupported " + option.getProperty() + " value specified.");
            }
        }
        String s = (String) value;
        if (s.indexOf(46) != -1) {
            try {
                Predicate<String> predicate2 = (Predicate) Class.forName(s).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                extensions.removeIf(predicate2);
                return;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        for (String extension : s.split(",")) {
            extensions.remove(extension);
        }
    }

    public static String apiUnknownToken(int token) {
        return apiUnknownToken("Unknown", token);
    }

    public static String apiUnknownToken(String description, int token) {
        return String.format("%s [0x%X]", description, Integer.valueOf(token));
    }

    public static Map<Integer, String> apiClassTokens(BiPredicate<Field, Integer> filter, Map<Integer, String> target, Class<?>... tokenClasses) {
        if (target == null) {
            target = new HashMap(64);
        }
        for (Class<?> tokenClass : tokenClasses) {
            for (Field field : tokenClass.getDeclaredFields()) {
                if ((field.getModifiers() & 25) == 25 && field.getType() == Integer.TYPE) {
                    try {
                        Integer value = Integer.valueOf(field.getInt(null));
                        if (filter == null || filter.test(field, value)) {
                            String name = target.get(value);
                            target.put(value, name == null ? field.getName() : name + "|" + field.getName());
                        }
                    } catch (IllegalAccessException e) {
                    }
                }
            }
        }
        return target;
    }

    public static long apiArray(MemoryStack stack, long... addresses) {
        PointerBuffer pointers = MemoryUtil.memPointerBuffer(stack.nmalloc(MemoryStack.POINTER_SIZE, addresses.length << MemoryStack.POINTER_SHIFT), addresses.length);
        for (long address : addresses) {
            pointers.put(address);
        }
        return pointers.address;
    }

    public static long apiArray(MemoryStack stack, ByteBuffer... buffers) {
        PointerBuffer pointers = MemoryUtil.memPointerBuffer(stack.nmalloc(MemoryStack.POINTER_SIZE, buffers.length << MemoryStack.POINTER_SHIFT), buffers.length);
        for (ByteBuffer buffer : buffers) {
            pointers.put(buffer);
        }
        return pointers.address;
    }

    public static long apiArrayp(MemoryStack stack, ByteBuffer... buffers) {
        long pointers = apiArray(stack, buffers);
        PointerBuffer lengths = stack.mallocPointer(buffers.length);
        for (ByteBuffer buffer : buffers) {
            lengths.put(buffer.remaining());
        }
        return pointers;
    }

    public static long apiArray(MemoryStack stack, Encoder encoder, CharSequence... strings) {
        PointerBuffer pointers = stack.mallocPointer(strings.length);
        for (CharSequence s : strings) {
            pointers.put(encoder.encode(s, true));
        }
        return pointers.address;
    }

    public static long apiArrayi(MemoryStack stack, Encoder encoder, CharSequence... strings) {
        PointerBuffer pointers = stack.mallocPointer(strings.length);
        IntBuffer lengths = stack.mallocInt(strings.length);
        for (CharSequence s : strings) {
            ByteBuffer buffer = encoder.encode(s, false);
            pointers.put(buffer);
            lengths.put(buffer.capacity());
        }
        return pointers.address;
    }

    public static long apiArrayp(MemoryStack stack, Encoder encoder, CharSequence... strings) {
        PointerBuffer pointers = stack.mallocPointer(strings.length);
        PointerBuffer lengths = stack.mallocPointer(strings.length);
        for (CharSequence s : strings) {
            ByteBuffer buffer = encoder.encode(s, false);
            pointers.put(buffer);
            lengths.put(buffer.capacity());
        }
        return pointers.address;
    }

    public static void apiArrayFree(long pointers, int length) {
        int i = length;
        while (true) {
            i--;
            if (i >= 0) {
                MemoryUtil.nmemFree(MemoryUtil.memGetAddress(pointers + (Integer.toUnsignedLong(i) * MemoryStack.POINTER_SIZE)));
            } else {
                return;
            }
        }
    }

    public static FFIType apiCreateStruct(FFIType... members) {
        MemoryUtil.MemoryAllocator allocator = MemoryUtil.getAllocator();
        PointerBuffer elementBuffer = PointerBuffer.create(allocator.malloc((members.length + 1) * MemoryStack.POINTER_SIZE), members.length + 1);
        for (int i = 0; i < members.length; i++) {
            elementBuffer.put(i, members[i]);
        }
        elementBuffer.put(members.length, 0L);
        return FFIType.create(allocator.calloc(1L, FFIType.SIZEOF)).type((short) 13).elements(elementBuffer);
    }

    private static FFIType prep(FFIType type) {
        MemoryStack stack = MemoryStack.stackPush();
        try {
            FFICIF cif = FFICIF.calloc(stack);
            if (LibFFI.ffi_prep_cif(cif, LibFFI.FFI_DEFAULT_ABI, type, null) != 0) {
                throw new IllegalStateException("Failed to prepare LibFFI type.");
            }
            if (stack != null) {
                stack.close();
            }
            return type;
        } catch (Throwable th) {
            if (stack != null) {
                try {
                    stack.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static FFIType apiCreateUnion(FFIType... members) {
        MemoryUtil.MemoryAllocator allocator = MemoryUtil.getAllocator();
        FFIType maxType = prep(members[0]);
        short maxAlignment = members[0].alignment();
        for (int i = 1; i < members.length; i++) {
            FFIType type = prep(members[i]);
            if (maxType.size() < type.size()) {
                maxType = type;
            }
            if (maxAlignment < type.alignment()) {
                maxAlignment = type.alignment();
            }
        }
        return FFIType.create(allocator.malloc(FFIType.SIZEOF)).size(maxType.size()).alignment(maxAlignment).type((short) 13).elements(PointerBuffer.create(allocator.malloc(2 * MemoryStack.POINTER_SIZE), 2).put(0, maxType).put(1, 0L));
    }

    public static FFIType apiCreateArray(FFIType type, int length) {
        MemoryUtil.MemoryAllocator allocator = MemoryUtil.getAllocator();
        PointerBuffer elementBuffer = PointerBuffer.create(allocator.malloc((length + 1) * MemoryStack.POINTER_SIZE), length + 1);
        for (int i = 0; i < length; i++) {
            elementBuffer.put(i, type);
        }
        elementBuffer.put(length, 0L);
        return FFIType.create(allocator.calloc(1L, FFIType.SIZEOF)).type((short) 13).elements(elementBuffer);
    }

    public static FFICIF apiCreateCIF(FFIType rtype, FFIType... atypes) {
        return apiCreateCIF(LibFFI.FFI_DEFAULT_ABI, rtype, atypes);
    }

    public static FFICIF apiCreateCIF(int abi, FFIType rtype, FFIType... atypes) {
        MemoryUtil.MemoryAllocator allocator = MemoryUtil.getAllocator();
        PointerBuffer pArgTypes = PointerBuffer.create(allocator.malloc(atypes.length * MemoryStack.POINTER_SIZE), atypes.length);
        for (int i = 0; i < atypes.length; i++) {
            pArgTypes.put(i, atypes[i]);
        }
        FFICIF cif = FFICIF.create(allocator.malloc(FFICIF.SIZEOF));
        int errcode = LibFFI.ffi_prep_cif(cif, abi, rtype, pArgTypes);
        if (errcode != 0) {
            throw new IllegalStateException("Failed to prepare libffi CIF: " + errcode);
        }
        return cif;
    }

    public static FFICIF apiCreateCIFVar(int nfixedargs, FFIType rtype, FFIType... atypes) {
        return apiCreateCIFVar(LibFFI.FFI_DEFAULT_ABI, nfixedargs, rtype, atypes);
    }

    public static FFICIF apiCreateCIFVar(int abi, int nfixedargs, FFIType rtype, FFIType... atypes) {
        MemoryUtil.MemoryAllocator allocator = MemoryUtil.getAllocator();
        PointerBuffer pArgTypes = PointerBuffer.create(allocator.malloc(atypes.length * MemoryStack.POINTER_SIZE), atypes.length);
        for (int i = 0; i < atypes.length; i++) {
            pArgTypes.put(i, atypes[i]);
        }
        FFICIF cif = FFICIF.create(allocator.malloc(FFICIF.SIZEOF));
        int errcode = LibFFI.ffi_prep_cif_var(cif, abi, nfixedargs, rtype, pArgTypes);
        if (errcode != 0) {
            throw new IllegalStateException("Failed to prepare libffi var CIF: " + errcode);
        }
        return cif;
    }

    public static int apiStdcall() {
        return (MemoryStack.BITS64 || Platform.get() != Platform.WINDOWS) ? LibFFI.FFI_DEFAULT_ABI : LibFFI.FFI_STDCALL;
    }

    public static void apiClosureRet(long ret, boolean __result) {
        MemoryUtil.memPutAddress(ret, __result ? 1L : 0L);
    }

    public static void apiClosureRet(long ret, byte __result) {
        MemoryUtil.memPutAddress(ret, __result & 255);
    }

    public static void apiClosureRet(long ret, short __result) {
        MemoryUtil.memPutAddress(ret, __result & User32.HWND_BROADCAST);
    }

    public static void apiClosureRet(long ret, int __result) {
        MemoryUtil.memPutAddress(ret, __result & 4294967295L);
    }

    public static void apiClosureRetL(long ret, long __result) {
        MemoryUtil.memPutLong(ret, __result);
    }

    public static void apiClosureRetP(long ret, long __result) {
        MemoryUtil.memPutAddress(ret, __result);
    }

    public static void apiClosureRet(long ret, float __result) {
        MemoryUtil.memPutFloat(ret, __result);
    }

    public static void apiClosureRet(long ret, double __result) {
        MemoryUtil.memPutDouble(ret, __result);
    }
}
