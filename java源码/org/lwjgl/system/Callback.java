package org.lwjgl.system;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.ConcurrentHashMap;
import org.lwjgl.system.libffi.FFICIF;
import org.lwjgl.system.libffi.FFIClosure;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Callback.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Callback.class */
public abstract class Callback implements Pointer, NativeResource {
    private long address;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Callback$ClosureRegistry.class */
    private interface ClosureRegistry {
        void put(long j, FFIClosure fFIClosure);

        FFIClosure get(long j);

        FFIClosure remove(long j);
    }

    protected Callback(Descriptor descriptor) {
        this.address = Upcalls.upcallCreate(descriptor, this);
    }

    protected Callback(long address) {
        if (Checks.CHECKS) {
            Checks.check(address);
        }
        this.address = address;
    }

    @Override // org.lwjgl.system.Pointer
    public long address() {
        return this.address;
    }

    /* renamed from: org.lwjgl.system.Callback$1, reason: invalid class name */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Callback$1.class */
    class AnonymousClass1 implements ClosureRegistry {
        AnonymousClass1() {
        }

        @Override // org.lwjgl.system.Callback.ClosureRegistry
        public void put(long executableAddress, FFIClosure closure) {
        }

        @Override // org.lwjgl.system.Callback.ClosureRegistry
        public FFIClosure get(long executableAddress) {
            return FFIClosure.create(executableAddress);
        }

        @Override // org.lwjgl.system.Callback.ClosureRegistry
        public FFIClosure remove(long executableAddress) {
            return get(executableAddress);
        }
    }

    @Override // org.lwjgl.system.NativeResource
    public void free() {
        free(address());
    }

    public static <T extends CallbackI> T get(long j) {
        return (T) Upcalls.upcallGet(j);
    }

    /* renamed from: org.lwjgl.system.Callback$2, reason: invalid class name */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Callback$2.class */
    class AnonymousClass2 implements ClosureRegistry {
        private final ConcurrentHashMap<Long, FFIClosure> map = new ConcurrentHashMap<>();

        AnonymousClass2() {
        }

        @Override // org.lwjgl.system.Callback.ClosureRegistry
        public void put(long executableAddress, FFIClosure closure) {
            this.map.put(Long.valueOf(executableAddress), closure);
        }

        @Override // org.lwjgl.system.Callback.ClosureRegistry
        public FFIClosure get(long executableAddress) {
            return this.map.get(Long.valueOf(executableAddress));
        }

        @Override // org.lwjgl.system.Callback.ClosureRegistry
        public FFIClosure remove(long executableAddress) {
            return this.map.remove(Long.valueOf(executableAddress));
        }
    }

    public static <T extends CallbackI> T getSafe(long j) {
        if (j == 0) {
            return null;
        }
        return (T) get(j);
    }

    public static void free(long functionPointer) {
        Upcalls.upcallFree(functionPointer);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Callback)) {
            return false;
        }
        Callback that = (Callback) o;
        return this.address == that.address();
    }

    public int hashCode() {
        return (int) (this.address ^ (this.address >>> 32));
    }

    public String toString() {
        return String.format("%s pointer [0x%X]", getClass().getSimpleName(), Long.valueOf(this.address));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Callback$Descriptor.class */
    public static final class Descriptor {
        final MethodHandles.Lookup lookup;
        final FFICIF cif;

        public Descriptor(MethodHandles.Lookup lookup, FFICIF cif) {
            this.lookup = lookup;
            this.cif = cif;
        }
    }
}
