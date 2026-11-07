package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Pointer.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Pointer.class */
public interface Pointer {
    public static final int POINTER_SIZE = MemoryAccessJNI.getPointerSize();
    public static final int POINTER_SHIFT;
    public static final int CLONG_SIZE;
    public static final int CLONG_SHIFT;
    public static final boolean BITS32;
    public static final boolean BITS64;

    long address();

    static {
        POINTER_SHIFT = POINTER_SIZE == 8 ? 3 : 2;
        CLONG_SIZE = (POINTER_SIZE == 8 && Platform.get() == Platform.WINDOWS) ? 4 : POINTER_SIZE;
        CLONG_SHIFT = CLONG_SIZE == 8 ? 3 : 2;
        BITS32 = POINTER_SIZE * 8 == 32;
        BITS64 = POINTER_SIZE * 8 == 64;
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/Pointer$Default.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/Pointer$Default.class */
    public static abstract class Default implements Pointer {
        protected long address;

        protected Default(long address) {
            if (Checks.CHECKS && address == 0) {
                throw new NullPointerException();
            }
            this.address = address;
        }

        @Override // org.lwjgl.system.Pointer
        public long address() {
            return this.address;
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Pointer)) {
                return false;
            }
            Pointer that = (Pointer) o;
            return this.address == that.address();
        }

        public int hashCode() {
            return (int) (this.address ^ (this.address >>> 32));
        }

        public String toString() {
            return String.format("%s pointer [0x%X]", getClass().getSimpleName(), Long.valueOf(this.address));
        }
    }
}
