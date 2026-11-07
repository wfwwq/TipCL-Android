package org.lwjgl.system;

import org.lwjgl.system.Pointer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/SharedLibrary.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/SharedLibrary.class */
public interface SharedLibrary extends FunctionProvider, NativeResource, Pointer {
    String getName();

    String getPath();

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/SharedLibrary$Default.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/SharedLibrary$Default.class */
    public static abstract class Default extends Pointer.Default implements SharedLibrary {
        private final String name;

        protected Default(String name, long handle) {
            super(handle);
            this.name = name;
        }

        @Override // org.lwjgl.system.SharedLibrary
        public String getName() {
            return this.name;
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/SharedLibrary$Delegate.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/SharedLibrary$Delegate.class */
    public static abstract class Delegate implements SharedLibrary {
        protected final SharedLibrary library;

        protected Delegate(SharedLibrary library) {
            this.library = library;
        }

        @Override // org.lwjgl.system.SharedLibrary
        public String getName() {
            return this.library.getName();
        }

        @Override // org.lwjgl.system.SharedLibrary
        public String getPath() {
            return this.library.getPath();
        }

        @Override // org.lwjgl.system.Pointer
        public long address() {
            return this.library.address();
        }

        @Override // org.lwjgl.system.NativeResource
        public void free() {
            this.library.free();
        }
    }
}
