package org.lwjgl.system;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Callback;
import org.lwjgl.system.MemoryManage;
import org.lwjgl.system.jni.JNINativeInterface;
import org.lwjgl.system.libffi.FFIClosure;
import org.lwjgl.system.libffi.LibFFI;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Upcalls.class */
final class Upcalls {
    private static final boolean DEBUG_ALLOCATOR = Configuration.DEBUG_MEMORY_ALLOCATOR.get(false).booleanValue();
    private static final int CLOSURE_SIZE = (int) LibFFI.ffi_get_closure_size();
    private static final ClosureRegistry CLOSURE_REGISTRY;
    private static final long CALLBACK_HANDLER;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Upcalls$ClosureRegistry.class */
    private interface ClosureRegistry {
        void put(long j, FFIClosure fFIClosure);

        FFIClosure get(long j);

        FFIClosure remove(long j);
    }

    private static native long getCallbackHandler(Method method);

    static {
        MemoryStack stack = MemoryStack.stackPush();
        try {
            PointerBuffer code = stack.mallocPointer(1);
            FFIClosure closure = LibFFI.ffi_closure_alloc(CLOSURE_SIZE, code);
            if (closure == null) {
                throw new OutOfMemoryError();
            }
            if (code.get(0) == closure.address()) {
                APIUtil.apiLog("Closure Registry: simple");
                CLOSURE_REGISTRY = new ClosureRegistry() { // from class: org.lwjgl.system.Upcalls.1
                    @Override // org.lwjgl.system.Upcalls.ClosureRegistry
                    public void put(long executableAddress, FFIClosure closure2) {
                    }

                    @Override // org.lwjgl.system.Upcalls.ClosureRegistry
                    public FFIClosure get(long executableAddress) {
                        return FFIClosure.create(executableAddress);
                    }

                    @Override // org.lwjgl.system.Upcalls.ClosureRegistry
                    public FFIClosure remove(long executableAddress) {
                        return get(executableAddress);
                    }
                };
            } else {
                APIUtil.apiLog("Closure Registry: ConcurrentHashMap");
                CLOSURE_REGISTRY = new ClosureRegistry() { // from class: org.lwjgl.system.Upcalls.2
                    private final ConcurrentHashMap<Long, FFIClosure> map = new ConcurrentHashMap<>();

                    @Override // org.lwjgl.system.Upcalls.ClosureRegistry
                    public void put(long executableAddress, FFIClosure closure2) {
                        this.map.put(Long.valueOf(executableAddress), closure2);
                    }

                    @Override // org.lwjgl.system.Upcalls.ClosureRegistry
                    public FFIClosure get(long executableAddress) {
                        return this.map.get(Long.valueOf(executableAddress));
                    }

                    @Override // org.lwjgl.system.Upcalls.ClosureRegistry
                    public FFIClosure remove(long executableAddress) {
                        return this.map.remove(Long.valueOf(executableAddress));
                    }
                };
            }
            LibFFI.ffi_closure_free(closure);
            if (stack != null) {
                stack.close();
            }
            try {
                CALLBACK_HANDLER = getCallbackHandler(CallbackI.class.getDeclaredMethod("callback", Long.TYPE, Long.TYPE));
                MemoryUtil.getAllocator();
            } catch (Exception e) {
                throw new IllegalStateException("Failed to initialize the native callback handler.", e);
            }
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

    private Upcalls() {
    }

    static long upcallCreate(Callback.Descriptor descriptor, Object instance) {
        MemoryStack stack = MemoryStack.stackPush();
        try {
            PointerBuffer code = stack.mallocPointer(1);
            FFIClosure closure = LibFFI.ffi_closure_alloc(CLOSURE_SIZE, code);
            if (closure == null) {
                throw new OutOfMemoryError();
            }
            long executableAddress = code.get(0);
            if (DEBUG_ALLOCATOR) {
                MemoryManage.DebugAllocator.track(executableAddress, CLOSURE_SIZE);
            }
            if (stack != null) {
                stack.close();
            }
            long user_data = JNINativeInterface.NewGlobalRef(instance);
            int errcode = LibFFI.ffi_prep_closure_loc(closure, descriptor.cif, CALLBACK_HANDLER, user_data, executableAddress);
            if (errcode != 0) {
                JNINativeInterface.DeleteGlobalRef(user_data);
                LibFFI.ffi_closure_free(closure);
                throw new RuntimeException("Failed to prepare the libffi closure");
            }
            CLOSURE_REGISTRY.put(executableAddress, closure);
            return executableAddress;
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

    static <T extends CallbackI> T upcallGet(long functionPointer) {
        return (T) MemoryUtil.memGlobalRefToObject(CLOSURE_REGISTRY.get(functionPointer).user_data());
    }

    static void upcallFree(long functionPointer) {
        if (DEBUG_ALLOCATOR) {
            MemoryManage.DebugAllocator.untrack(functionPointer);
        }
        FFIClosure closure = CLOSURE_REGISTRY.remove(functionPointer);
        JNINativeInterface.DeleteGlobalRef(closure.user_data());
        LibFFI.ffi_closure_free(closure);
    }
}
