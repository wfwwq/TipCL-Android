package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.LWJGLException;
import org.lwjgl.LWJGLUtil;
import org.lwjgl.PointerBuffer;
import org.lwjgl.Sys;
import org.lwjgl.glfw.GLFW;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/opengl/ContextGL.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/opengl/ContextGL.class */
final class ContextGL implements Context {
    private static final ThreadLocal<ContextGL> current_context_local = new ThreadLocal<>();
    private final long handle;
    private final PeerInfo peer_info;
    private final ContextAttribs contextAttribs;
    private final boolean forwardCompatible;
    private boolean destroyed;
    private boolean destroy_requested;
    private Thread thread;
    private boolean isCurrent;

    static {
        Sys.initialize();
    }

    PeerInfo getPeerInfo() {
        return this.peer_info;
    }

    ContextAttribs getContextAttribs() {
        return this.contextAttribs;
    }

    static ContextGL getCurrentContext() {
        return current_context_local.get();
    }

    ContextGL(long handle) {
        this.peer_info = null;
        this.contextAttribs = null;
        this.forwardCompatible = false;
        this.handle = handle;
        System.out.println("LWJGLX: ready-handle context created");
    }

    ContextGL(PeerInfo peer_info, ContextAttribs attribs, ContextGL shared_context) throws LWJGLException {
        ContextGL context_lock = shared_context != null ? shared_context : this;
        synchronized (context_lock) {
            if (shared_context != null) {
                if (shared_context.destroyed) {
                    throw new IllegalArgumentException("Shared context is destroyed");
                }
            }
            this.peer_info = peer_info;
            this.contextAttribs = attribs;
            this.forwardCompatible = false;
            long share = 0;
            this.handle = GLFW.nglfwCreateContext(shared_context != null ? shared_context.handle : share);
        }
    }

    @Override // org.lwjgl.opengl.Context
    public void releaseCurrent() throws LWJGLException {
        ContextGL current_context = getCurrentContext();
        if (current_context != null) {
            GLFW.glfwMakeContextCurrent(0L);
            this.isCurrent = false;
            current_context_local.set(null);
            synchronized (current_context) {
                current_context.thread = null;
                current_context.checkDestroy();
            }
        }
    }

    @Override // org.lwjgl.opengl.Context
    public synchronized void releaseDrawable() throws LWJGLException {
        if (this.destroyed) {
            throw new IllegalStateException("Context is destroyed");
        }
    }

    public synchronized void update() {
        if (this.destroyed) {
            throw new IllegalStateException("Context is destroyed");
        }
    }

    public static void swapBuffers() throws LWJGLException {
        Display.swapBuffers();
    }

    private boolean canAccess() {
        return this.thread == null || Thread.currentThread() == this.thread;
    }

    private void checkAccess() {
        if (!canAccess()) {
            throw new IllegalStateException("From thread " + Thread.currentThread() + ": " + this.thread + " already has the context current");
        }
    }

    @Override // org.lwjgl.opengl.Context
    public synchronized void makeCurrent() throws LWJGLException {
        checkAccess();
        if (this.destroyed) {
            throw new IllegalStateException("Context is destroyed");
        }
        this.thread = Thread.currentThread();
        current_context_local.set(this);
        GLFW.glfwMakeContextCurrent(this.handle);
        GLContext.initCapabilities();
        this.isCurrent = true;
    }

    ByteBuffer getHandle() {
        return null;
    }

    @Override // org.lwjgl.opengl.Context
    public synchronized boolean isCurrent() throws LWJGLException {
        if (this.destroyed) {
            throw new IllegalStateException("Context is destroyed");
        }
        return this.isCurrent;
    }

    private void checkDestroy() {
        if (!this.destroyed && this.destroy_requested) {
            try {
                releaseDrawable();
                this.destroyed = true;
                this.thread = null;
                Display.destroy();
            } catch (LWJGLException e) {
                LWJGLUtil.log("Exception occurred while destroying context: " + e);
            }
        }
    }

    public static void setSwapInterval(int value) {
        GLFW.glfwSwapInterval(value);
    }

    public synchronized void forceDestroy() throws LWJGLException {
        checkAccess();
        destroy();
    }

    public synchronized void destroy() throws LWJGLException {
        if (this.destroyed) {
            return;
        }
        this.destroy_requested = true;
        boolean was_current = isCurrent();
        int error = 0;
        if (was_current) {
            if (GLContext.getCapabilities() != null && GLContext.getCapabilities().OpenGL11) {
                error = GL11.glGetError();
            }
            releaseCurrent();
        }
        checkDestroy();
        if (was_current && error != 0) {
            throw new OpenGLException(error);
        }
    }

    public synchronized void setCLSharingProperties(PointerBuffer properties) throws InterruptedException, LWJGLException {
        this.peer_info.lockAndGetHandle();
    }
}
