package org.lwjgl.sdl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import kotlin.UByte;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLStdinc.class */
public class SDLStdinc {
    public static final float SDL_FLT_EPSILON = 1.1920929E-7f;
    public static final int SDL_INVALID_UNICODE_CODEPOINT = 65533;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLStdinc$Functions.class */
    public static final class Functions {
        public static final long malloc = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_malloc");
        public static final long calloc = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_calloc");
        public static final long realloc = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_realloc");
        public static final long free = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_free");
        public static final long GetOriginalMemoryFunctions = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetOriginalMemoryFunctions");
        public static final long GetMemoryFunctions = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetMemoryFunctions");
        public static final long SetMemoryFunctions = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetMemoryFunctions");
        public static final long aligned_alloc = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_aligned_alloc");
        public static final long aligned_free = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_aligned_free");
        public static final long GetNumAllocations = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetNumAllocations");
        public static final long GetEnvironment = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetEnvironment");
        public static final long CreateEnvironment = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateEnvironment");
        public static final long GetEnvironmentVariable = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetEnvironmentVariable");
        public static final long GetEnvironmentVariables = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetEnvironmentVariables");
        public static final long SetEnvironmentVariable = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetEnvironmentVariable");
        public static final long UnsetEnvironmentVariable = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UnsetEnvironmentVariable");
        public static final long DestroyEnvironment = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyEnvironment");
        public static final long getenv = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_getenv");
        public static final long getenv_unsafe = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_getenv_unsafe");
        public static final long setenv_unsafe = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_setenv_unsafe");
        public static final long unsetenv_unsafe = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_unsetenv_unsafe");
        public static final long qsort = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_qsort");
        public static final long bsearch = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_bsearch");
        public static final long qsort_r = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_qsort_r");
        public static final long bsearch_r = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_bsearch_r");
        public static final long crc16 = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_crc16");
        public static final long crc32 = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_crc32");
        public static final long murmur3_32 = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_murmur3_32");
        public static final long memset4 = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_memset4");
        public static final long memcmp = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_memcmp");
        public static final long srand = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_srand");
        public static final long rand = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_rand");
        public static final long randf = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_randf");
        public static final long rand_bits = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_rand_bits");
        public static final long rand_r = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_rand_r");
        public static final long randf_r = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_randf_r");
        public static final long rand_bits_r = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_rand_bits_r");

        private Functions() {
        }
    }

    protected SDLStdinc() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_malloc(long size) {
        long __functionAddress = Functions.malloc;
        return JNI.invokePP(size, __functionAddress);
    }

    @NativeType("void *")
    public static ByteBuffer SDL_malloc(@NativeType("size_t") long size) {
        long __result = nSDL_malloc(size);
        return MemoryUtil.memByteBufferSafe(__result, (int) size);
    }

    public static long nSDL_calloc(long nmemb, long size) {
        long __functionAddress = Functions.calloc;
        return JNI.invokePPP(nmemb, size, __functionAddress);
    }

    @NativeType("void *")
    public static ByteBuffer SDL_calloc(@NativeType("size_t") long nmemb, @NativeType("size_t") long size) {
        long __result = nSDL_calloc(nmemb, size);
        return MemoryUtil.memByteBufferSafe(__result, ((int) nmemb) * ((int) size));
    }

    public static long nSDL_realloc(long mem, long size) {
        long __functionAddress = Functions.realloc;
        return JNI.invokePPP(mem, size, __functionAddress);
    }

    @NativeType("void *")
    public static ByteBuffer SDL_realloc(@NativeType("void *") ByteBuffer mem, @NativeType("size_t") long size) {
        long __result = nSDL_realloc(MemoryUtil.memAddressSafe(mem), size);
        return MemoryUtil.memByteBufferSafe(__result, (int) size);
    }

    public static void nSDL_free(long mem) {
        long __functionAddress = Functions.free;
        JNI.invokePV(mem, __functionAddress);
    }

    public static void SDL_free(@NativeType("void *") ByteBuffer mem) {
        nSDL_free(MemoryUtil.memAddressSafe(mem));
    }

    public static void SDL_free(@NativeType("void *") IntBuffer mem) {
        nSDL_free(MemoryUtil.memAddressSafe(mem));
    }

    public static void SDL_free(@NativeType("void *") LongBuffer mem) {
        nSDL_free(MemoryUtil.memAddressSafe(mem));
    }

    public static void SDL_free(@NativeType("void *") PointerBuffer mem) {
        nSDL_free(MemoryUtil.memAddressSafe(mem));
    }

    public static void nSDL_GetOriginalMemoryFunctions(long malloc_func, long calloc_func, long realloc_func, long free_func) {
        long __functionAddress = Functions.GetOriginalMemoryFunctions;
        JNI.invokePPPPV(malloc_func, calloc_func, realloc_func, free_func, __functionAddress);
    }

    public static void SDL_GetOriginalMemoryFunctions(@NativeType("SDL_malloc_func *") PointerBuffer malloc_func, @NativeType("SDL_calloc_func *") PointerBuffer calloc_func, @NativeType("SDL_realloc_func *") PointerBuffer realloc_func, @NativeType("SDL_free_func *") PointerBuffer free_func) {
        if (Checks.CHECKS) {
            Checks.checkSafe((CustomBuffer<?>) malloc_func, 1);
            Checks.checkSafe((CustomBuffer<?>) calloc_func, 1);
            Checks.checkSafe((CustomBuffer<?>) realloc_func, 1);
            Checks.checkSafe((CustomBuffer<?>) free_func, 1);
        }
        nSDL_GetOriginalMemoryFunctions(MemoryUtil.memAddressSafe(malloc_func), MemoryUtil.memAddressSafe(calloc_func), MemoryUtil.memAddressSafe(realloc_func), MemoryUtil.memAddressSafe(free_func));
    }

    public static void nSDL_GetMemoryFunctions(long malloc_func, long calloc_func, long realloc_func, long free_func) {
        long __functionAddress = Functions.GetMemoryFunctions;
        JNI.invokePPPPV(malloc_func, calloc_func, realloc_func, free_func, __functionAddress);
    }

    public static void SDL_GetMemoryFunctions(@NativeType("SDL_malloc_func *") PointerBuffer malloc_func, @NativeType("SDL_calloc_func *") PointerBuffer calloc_func, @NativeType("SDL_realloc_func *") PointerBuffer realloc_func, @NativeType("SDL_free_func *") PointerBuffer free_func) {
        if (Checks.CHECKS) {
            Checks.checkSafe((CustomBuffer<?>) malloc_func, 1);
            Checks.checkSafe((CustomBuffer<?>) calloc_func, 1);
            Checks.checkSafe((CustomBuffer<?>) realloc_func, 1);
            Checks.checkSafe((CustomBuffer<?>) free_func, 1);
        }
        nSDL_GetMemoryFunctions(MemoryUtil.memAddressSafe(malloc_func), MemoryUtil.memAddressSafe(calloc_func), MemoryUtil.memAddressSafe(realloc_func), MemoryUtil.memAddressSafe(free_func));
    }

    public static boolean nSDL_SetMemoryFunctions(long malloc_func, long calloc_func, long realloc_func, long free_func) {
        long __functionAddress = Functions.SetMemoryFunctions;
        return JNI.invokePPPPZ(malloc_func, calloc_func, realloc_func, free_func, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetMemoryFunctions(@NativeType("SDL_malloc_func") SDL_malloc_funcI malloc_func, @NativeType("SDL_calloc_func") SDL_calloc_funcI calloc_func, @NativeType("SDL_realloc_func") SDL_realloc_funcI realloc_func, @NativeType("SDL_free_func") SDL_free_funcI free_func) {
        return nSDL_SetMemoryFunctions(malloc_func.address(), calloc_func.address(), realloc_func.address(), free_func.address());
    }

    public static long nSDL_aligned_alloc(long alignment, long size) {
        long __functionAddress = Functions.aligned_alloc;
        return JNI.invokePPP(alignment, size, __functionAddress);
    }

    @NativeType("void *")
    public static ByteBuffer SDL_aligned_alloc(@NativeType("size_t") long alignment, @NativeType("size_t") long size) {
        long __result = nSDL_aligned_alloc(alignment, size);
        return MemoryUtil.memByteBufferSafe(__result, (int) size);
    }

    public static void nSDL_aligned_free(long mem) {
        long __functionAddress = Functions.aligned_free;
        JNI.invokePV(mem, __functionAddress);
    }

    public static void SDL_aligned_free(@NativeType("void *") ByteBuffer mem) {
        nSDL_aligned_free(MemoryUtil.memAddressSafe(mem));
    }

    public static int SDL_GetNumAllocations() {
        long __functionAddress = Functions.GetNumAllocations;
        return JNI.invokeI(__functionAddress);
    }

    @NativeType("SDL_Environment *")
    public static long SDL_GetEnvironment() {
        long __functionAddress = Functions.GetEnvironment;
        return JNI.invokeP(__functionAddress);
    }

    @NativeType("SDL_Environment *")
    public static long SDL_CreateEnvironment(@NativeType("bool") boolean populated) {
        long __functionAddress = Functions.CreateEnvironment;
        return JNI.invokeP(populated, __functionAddress);
    }

    public static long nSDL_GetEnvironmentVariable(long env, long name) {
        long __functionAddress = Functions.GetEnvironmentVariable;
        if (Checks.CHECKS) {
            Checks.check(env);
        }
        return JNI.invokePPP(env, name, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetEnvironmentVariable(@NativeType("SDL_Environment *") long env, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        long __result = nSDL_GetEnvironmentVariable(env, MemoryUtil.memAddress(name));
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("char const *")
    public static String SDL_GetEnvironmentVariable(@NativeType("SDL_Environment *") long env, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long __result = nSDL_GetEnvironmentVariable(env, nameEncoded);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            stack.setPointer(stackPointer);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("void *")
    public static long SDL_GetEnvironmentVariables(@NativeType("SDL_Environment *") long env) {
        long __functionAddress = Functions.GetEnvironmentVariables;
        if (Checks.CHECKS) {
            Checks.check(env);
        }
        return JNI.invokePP(env, __functionAddress);
    }

    public static boolean nSDL_SetEnvironmentVariable(long env, long name, long value, boolean overwrite) {
        long __functionAddress = Functions.SetEnvironmentVariable;
        if (Checks.CHECKS) {
            Checks.check(env);
        }
        return JNI.invokePPPZ(env, name, value, overwrite, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_SetEnvironmentVariable(@NativeType("SDL_Environment *") long env, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value, @NativeType("bool") boolean overwrite) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
            Checks.checkNT1(value);
        }
        return nSDL_SetEnvironmentVariable(env, MemoryUtil.memAddress(name), MemoryUtil.memAddress(value), overwrite);
    }

    @NativeType("bool")
    public static boolean SDL_SetEnvironmentVariable(@NativeType("SDL_Environment *") long env, @NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence value, @NativeType("bool") boolean overwrite) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(value, true);
            long valueEncoded = stack.getPointerAddress();
            boolean zNSDL_SetEnvironmentVariable = nSDL_SetEnvironmentVariable(env, nameEncoded, valueEncoded, overwrite);
            stack.setPointer(stackPointer);
            return zNSDL_SetEnvironmentVariable;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static boolean nSDL_UnsetEnvironmentVariable(long env, long name) {
        long __functionAddress = Functions.UnsetEnvironmentVariable;
        if (Checks.CHECKS) {
            Checks.check(env);
        }
        return JNI.invokePPZ(env, name, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_UnsetEnvironmentVariable(@NativeType("SDL_Environment *") long env, @NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_UnsetEnvironmentVariable(env, MemoryUtil.memAddress(name));
    }

    @NativeType("bool")
    public static boolean SDL_UnsetEnvironmentVariable(@NativeType("SDL_Environment *") long env, @NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            boolean zNSDL_UnsetEnvironmentVariable = nSDL_UnsetEnvironmentVariable(env, nameEncoded);
            stack.setPointer(stackPointer);
            return zNSDL_UnsetEnvironmentVariable;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void SDL_DestroyEnvironment(@NativeType("SDL_Environment *") long env) {
        long __functionAddress = Functions.DestroyEnvironment;
        if (Checks.CHECKS) {
            Checks.check(env);
        }
        JNI.invokePV(env, __functionAddress);
    }

    public static long nSDL_getenv(long name) {
        long __functionAddress = Functions.getenv;
        return JNI.invokePP(name, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_getenv(@NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        long __result = nSDL_getenv(MemoryUtil.memAddress(name));
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("char const *")
    public static String SDL_getenv(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long __result = nSDL_getenv(nameEncoded);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            stack.setPointer(stackPointer);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_getenv_unsafe(long name) {
        long __functionAddress = Functions.getenv_unsafe;
        return JNI.invokePP(name, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_getenv_unsafe(@NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        long __result = nSDL_getenv_unsafe(MemoryUtil.memAddress(name));
        return MemoryUtil.memUTF8Safe(__result);
    }

    @NativeType("char const *")
    public static String SDL_getenv_unsafe(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            long __result = nSDL_getenv_unsafe(nameEncoded);
            String strMemUTF8Safe = MemoryUtil.memUTF8Safe(__result);
            stack.setPointer(stackPointer);
            return strMemUTF8Safe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nSDL_setenv_unsafe(long name, long value, int overwrite) {
        long __functionAddress = Functions.setenv_unsafe;
        return JNI.invokePPI(name, value, overwrite, __functionAddress);
    }

    public static int SDL_setenv_unsafe(@NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value, int overwrite) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
            Checks.checkNT1(value);
        }
        return nSDL_setenv_unsafe(MemoryUtil.memAddress(name), MemoryUtil.memAddress(value), overwrite);
    }

    public static int SDL_setenv_unsafe(@NativeType("char const *") CharSequence name, @NativeType("char const *") CharSequence value, int overwrite) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(value, true);
            long valueEncoded = stack.getPointerAddress();
            int iNSDL_setenv_unsafe = nSDL_setenv_unsafe(nameEncoded, valueEncoded, overwrite);
            stack.setPointer(stackPointer);
            return iNSDL_setenv_unsafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static int nSDL_unsetenv_unsafe(long name) {
        long __functionAddress = Functions.unsetenv_unsafe;
        return JNI.invokePI(name, __functionAddress);
    }

    public static int SDL_unsetenv_unsafe(@NativeType("char const *") ByteBuffer name) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        return nSDL_unsetenv_unsafe(MemoryUtil.memAddress(name));
    }

    public static int SDL_unsetenv_unsafe(@NativeType("char const *") CharSequence name) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            int iNSDL_unsetenv_unsafe = nSDL_unsetenv_unsafe(nameEncoded);
            stack.setPointer(stackPointer);
            return iNSDL_unsetenv_unsafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_qsort(long base, long nmemb, long size, long compare) {
        long __functionAddress = Functions.qsort;
        JNI.invokePPPPV(base, nmemb, size, compare, __functionAddress);
    }

    public static void SDL_qsort(@NativeType("void *") ByteBuffer base, @NativeType("size_t") long nmemb, @NativeType("size_t") long size, @NativeType("SDL_CompareCallback") SDL_CompareCallbackI compare) {
        if (Checks.CHECKS) {
            Checks.check(base, nmemb * size);
        }
        nSDL_qsort(MemoryUtil.memAddress(base), nmemb, size, compare.address());
    }

    public static long nSDL_bsearch(long key, long base, long nmemb, long size, long compare) {
        long __functionAddress = Functions.bsearch;
        return JNI.invokePPPPPP(key, base, nmemb, size, compare, __functionAddress);
    }

    @NativeType("void *")
    public static ByteBuffer SDL_bsearch(@NativeType("void const *") ByteBuffer key, @NativeType("void const *") ByteBuffer base, @NativeType("size_t") long nmemb, @NativeType("size_t") long size, @NativeType("SDL_CompareCallback") SDL_CompareCallbackI compare) {
        if (Checks.CHECKS) {
            Checks.check(key, size);
            Checks.check(base, nmemb * size);
        }
        long __result = nSDL_bsearch(MemoryUtil.memAddress(key), MemoryUtil.memAddress(base), nmemb, size, compare.address());
        return MemoryUtil.memByteBufferSafe(__result, (int) size);
    }

    public static void nSDL_qsort_r(long base, long nmemb, long size, long compare, long userdata) {
        long __functionAddress = Functions.qsort_r;
        JNI.invokePPPPPV(base, nmemb, size, compare, userdata, __functionAddress);
    }

    public static void SDL_qsort_r(@NativeType("void *") ByteBuffer base, @NativeType("size_t") long nmemb, @NativeType("size_t") long size, @NativeType("SDL_CompareCallback_r") SDL_CompareCallback_rI compare, @NativeType("void *") long userdata) {
        if (Checks.CHECKS) {
            Checks.check(base, nmemb * size);
        }
        nSDL_qsort_r(MemoryUtil.memAddress(base), nmemb, size, compare.address(), userdata);
    }

    public static long nSDL_bsearch_r(long key, long base, long nmemb, long size, long compare, long userdata) {
        long __functionAddress = Functions.bsearch_r;
        return JNI.invokePPPPPPP(key, base, nmemb, size, compare, userdata, __functionAddress);
    }

    @NativeType("void *")
    public static ByteBuffer SDL_bsearch_r(@NativeType("void const *") ByteBuffer key, @NativeType("void const *") ByteBuffer base, @NativeType("size_t") long nmemb, @NativeType("size_t") long size, @NativeType("SDL_CompareCallback_r") SDL_CompareCallback_rI compare, @NativeType("void *") long userdata) {
        if (Checks.CHECKS) {
            Checks.check(key, size);
            Checks.check(base, nmemb * size);
        }
        long __result = nSDL_bsearch_r(MemoryUtil.memAddress(key), MemoryUtil.memAddress(base), nmemb, size, compare.address(), userdata);
        return MemoryUtil.memByteBufferSafe(__result, (int) size);
    }

    public static short nSDL_crc16(short crc, long data, long len) {
        long __functionAddress = Functions.crc16;
        return JNI.invokeCPPC(crc, data, len, __functionAddress);
    }

    @NativeType("Uint16")
    public static short SDL_crc16(@NativeType("Uint16") short crc, @NativeType("void const *") ByteBuffer data) {
        return nSDL_crc16(crc, MemoryUtil.memAddress(data), data.remaining());
    }

    public static int nSDL_crc32(int crc, long data, long len) {
        long __functionAddress = Functions.crc32;
        return JNI.invokePPI(crc, data, len, __functionAddress);
    }

    @NativeType("Uint32")
    public static int SDL_crc32(@NativeType("Uint32") int crc, @NativeType("void const *") ByteBuffer data) {
        return nSDL_crc32(crc, MemoryUtil.memAddress(data), data.remaining());
    }

    public static int nSDL_murmur3_32(long data, long len, int seed) {
        long __functionAddress = Functions.murmur3_32;
        return JNI.invokePPI(data, len, seed, __functionAddress);
    }

    @NativeType("Uint32")
    public static int SDL_murmur3_32(@NativeType("void const *") ByteBuffer data, @NativeType("Uint32") int seed) {
        return nSDL_murmur3_32(MemoryUtil.memAddress(data), data.remaining(), seed);
    }

    public static long nSDL_memset4(long dst, int val, long dwords) {
        long __functionAddress = Functions.memset4;
        return JNI.invokePPP(dst, val, dwords, __functionAddress);
    }

    @NativeType("void *")
    public static long SDL_memset4(@NativeType("void *") ByteBuffer dst, @NativeType("Uint32") int val) {
        return nSDL_memset4(MemoryUtil.memAddress(dst), val, Integer.toUnsignedLong(dst.remaining()) >> 2);
    }

    @NativeType("void *")
    public static long SDL_memset4(@NativeType("void *") IntBuffer dst, @NativeType("Uint32") int val) {
        return nSDL_memset4(MemoryUtil.memAddress(dst), val, Integer.toUnsignedLong(dst.remaining()));
    }

    public static int nSDL_memcmp(long s1, long s2, long len) {
        long __functionAddress = Functions.memcmp;
        return JNI.invokePPPI(s1, s2, len, __functionAddress);
    }

    public static int SDL_memcmp(@NativeType("void const *") ByteBuffer s1, @NativeType("void const *") ByteBuffer s2) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) s2, s1.remaining());
        }
        return nSDL_memcmp(MemoryUtil.memAddress(s1), MemoryUtil.memAddress(s2), s1.remaining());
    }

    public static void SDL_srand(@NativeType("Uint64") long seed) {
        long __functionAddress = Functions.srand;
        JNI.invokeJV(seed, __functionAddress);
    }

    @NativeType("Sint32")
    public static int SDL_rand(@NativeType("Sint32") int n) {
        long __functionAddress = Functions.rand;
        return JNI.invokeI(n, __functionAddress);
    }

    public static float SDL_randf() {
        long __functionAddress = Functions.randf;
        return JNI.invokeF(__functionAddress);
    }

    @NativeType("Uint32")
    public static int SDL_rand_bits() {
        long __functionAddress = Functions.rand_bits;
        return JNI.invokeI(__functionAddress);
    }

    public static int nSDL_rand_r(long state, int n) {
        long __functionAddress = Functions.rand_r;
        return JNI.invokePI(state, n, __functionAddress);
    }

    @NativeType("Sint32")
    public static int SDL_rand_r(@NativeType("Uint64 *") LongBuffer state, @NativeType("Sint32") int n) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) state, 1);
        }
        return nSDL_rand_r(MemoryUtil.memAddress(state), n);
    }

    public static float nSDL_randf_r(long state) {
        long __functionAddress = Functions.randf_r;
        return JNI.invokePF(state, __functionAddress);
    }

    public static float SDL_randf_r(@NativeType("Uint64 *") LongBuffer state) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) state, 1);
        }
        return nSDL_randf_r(MemoryUtil.memAddress(state));
    }

    public static int nSDL_rand_bits_r(long state) {
        long __functionAddress = Functions.rand_bits_r;
        return JNI.invokePI(state, __functionAddress);
    }

    @NativeType("Uint32")
    public static int SDL_rand_bits_r(@NativeType("Uint64 *") LongBuffer state) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) state, 1);
        }
        return nSDL_rand_bits_r(MemoryUtil.memAddress(state));
    }

    @NativeType("uint32_t")
    public static int SDL_FOURCC(@NativeType("uint8_t") byte A, @NativeType("uint8_t") byte B, @NativeType("uint8_t") byte C, @NativeType("uint8_t") byte D) {
        return ((A & UByte.MAX_VALUE) << 0) | ((B & UByte.MAX_VALUE) << 8) | ((C & UByte.MAX_VALUE) << 16) | ((D & UByte.MAX_VALUE) << 24);
    }
}
