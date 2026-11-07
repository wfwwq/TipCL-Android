package org.lwjgl;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/PointerWrapperAbstract.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/PointerWrapperAbstract.class */
public abstract class PointerWrapperAbstract implements PointerWrapper {
    protected final long pointer;

    protected PointerWrapperAbstract(long pointer) {
        this.pointer = pointer;
    }

    public boolean isValid() {
        return this.pointer != 0;
    }

    public final void checkValid() {
        if (LWJGLUtil.DEBUG && !isValid()) {
            throw new IllegalStateException("This " + getClass().getSimpleName() + " pointer is not valid.");
        }
    }

    @Override // org.lwjgl.PointerWrapper
    public final long getPointer() {
        checkValid();
        return this.pointer;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PointerWrapperAbstract)) {
            return false;
        }
        PointerWrapperAbstract that = (PointerWrapperAbstract) o;
        return this.pointer == that.pointer;
    }

    public int hashCode() {
        return (int) (this.pointer ^ (this.pointer >>> 32));
    }

    public String toString() {
        return getClass().getSimpleName() + " pointer (0x" + Long.toHexString(this.pointer).toUpperCase() + ")";
    }
}
