package org.lwjgl.util.shaderc;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

@NativeType("struct glslang_input_t")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLangInput.class */
public class GLSLangInput extends Struct<GLSLangInput> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int LANGUAGE;
    public static final int STAGE;
    public static final int CLIENT;
    public static final int CLIENT_VERSION;
    public static final int TARGET_LANGUAGE;
    public static final int TARGET_LANGUAGE_VERSION;
    public static final int CODE;
    public static final int DEFAULT_VERSION;
    public static final int DEFAULT_PROFILE;
    public static final int FORCE_DEFAULT_VERSION_AND_PROFILE;
    public static final int FORWARD_COMPATIBLE;
    public static final int MESSAGES;
    public static final int RESOURCE;
    public static final int CALLBACKS;
    public static final int CALLBACKS_CTX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(GLSLIncludeCallbacks.SIZEOF, GLSLIncludeCallbacks.ALIGNOF), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        LANGUAGE = layout.offsetof(0);
        STAGE = layout.offsetof(1);
        CLIENT = layout.offsetof(2);
        CLIENT_VERSION = layout.offsetof(3);
        TARGET_LANGUAGE = layout.offsetof(4);
        TARGET_LANGUAGE_VERSION = layout.offsetof(5);
        CODE = layout.offsetof(6);
        DEFAULT_VERSION = layout.offsetof(7);
        DEFAULT_PROFILE = layout.offsetof(8);
        FORCE_DEFAULT_VERSION_AND_PROFILE = layout.offsetof(9);
        FORWARD_COMPATIBLE = layout.offsetof(10);
        MESSAGES = layout.offsetof(11);
        RESOURCE = layout.offsetof(12);
        CALLBACKS = layout.offsetof(13);
        CALLBACKS_CTX = layout.offsetof(14);
    }

    protected GLSLangInput(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public GLSLangInput create(long address, ByteBuffer container) {
        return new GLSLangInput(address, container);
    }

    public GLSLangInput(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("glslang_source_t")
    public int language() {
        return nlanguage(address());
    }

    @NativeType("glslang_stage_t")
    public int stage() {
        return nstage(address());
    }

    @NativeType("glslang_client_t")
    public int client() {
        return nclient(address());
    }

    @NativeType("glslang_target_client_version_t")
    public int client_version() {
        return nclient_version(address());
    }

    @NativeType("glslang_target_language_t")
    public int target_language() {
        return ntarget_language(address());
    }

    @NativeType("glslang_target_language_version_t")
    public int target_language_version() {
        return ntarget_language_version(address());
    }

    @NativeType("char const *")
    public ByteBuffer code() {
        return ncode(address());
    }

    @NativeType("char const *")
    public String codeString() {
        return ncodeString(address());
    }

    public int default_version() {
        return ndefault_version(address());
    }

    @NativeType("glslang_profile_t")
    public int default_profile() {
        return ndefault_profile(address());
    }

    @NativeType("int")
    public boolean force_default_version_and_profile() {
        return nforce_default_version_and_profile(address()) != 0;
    }

    @NativeType("int")
    public boolean forward_compatible() {
        return nforward_compatible(address()) != 0;
    }

    @NativeType("glslang_messages_t")
    public int messages() {
        return nmessages(address());
    }

    @NativeType("glslang_resource_t const *")
    public GLSLangResource resource() {
        return nresource(address());
    }

    @NativeType("glsl_include_callbacks_t")
    public GLSLIncludeCallbacks callbacks() {
        return ncallbacks(address());
    }

    @NativeType("void *")
    public long callbacks_ctx() {
        return ncallbacks_ctx(address());
    }

    public GLSLangInput language(@NativeType("glslang_source_t") int value) {
        nlanguage(address(), value);
        return this;
    }

    public GLSLangInput stage(@NativeType("glslang_stage_t") int value) {
        nstage(address(), value);
        return this;
    }

    public GLSLangInput client(@NativeType("glslang_client_t") int value) {
        nclient(address(), value);
        return this;
    }

    public GLSLangInput client_version(@NativeType("glslang_target_client_version_t") int value) {
        nclient_version(address(), value);
        return this;
    }

    public GLSLangInput target_language(@NativeType("glslang_target_language_t") int value) {
        ntarget_language(address(), value);
        return this;
    }

    public GLSLangInput target_language_version(@NativeType("glslang_target_language_version_t") int value) {
        ntarget_language_version(address(), value);
        return this;
    }

    public GLSLangInput code(@NativeType("char const *") ByteBuffer value) {
        ncode(address(), value);
        return this;
    }

    public GLSLangInput default_version(int value) {
        ndefault_version(address(), value);
        return this;
    }

    public GLSLangInput default_profile(@NativeType("glslang_profile_t") int value) {
        ndefault_profile(address(), value);
        return this;
    }

    public GLSLangInput force_default_version_and_profile(@NativeType("int") boolean value) {
        nforce_default_version_and_profile(address(), value ? 1 : 0);
        return this;
    }

    public GLSLangInput forward_compatible(@NativeType("int") boolean value) {
        nforward_compatible(address(), value ? 1 : 0);
        return this;
    }

    public GLSLangInput messages(@NativeType("glslang_messages_t") int value) {
        nmessages(address(), value);
        return this;
    }

    public GLSLangInput resource(@NativeType("glslang_resource_t const *") GLSLangResource value) {
        nresource(address(), value);
        return this;
    }

    public GLSLangInput callbacks(@NativeType("glsl_include_callbacks_t") GLSLIncludeCallbacks value) {
        ncallbacks(address(), value);
        return this;
    }

    public GLSLangInput callbacks(Consumer<GLSLIncludeCallbacks> consumer) {
        consumer.accept(callbacks());
        return this;
    }

    public GLSLangInput callbacks_ctx(@NativeType("void *") long value) {
        ncallbacks_ctx(address(), value);
        return this;
    }

    public GLSLangInput set(int language, int stage, int client, int client_version, int target_language, int target_language_version, ByteBuffer code, int default_version, int default_profile, boolean force_default_version_and_profile, boolean forward_compatible, int messages, GLSLangResource resource, GLSLIncludeCallbacks callbacks, long callbacks_ctx) {
        language(language);
        stage(stage);
        client(client);
        client_version(client_version);
        target_language(target_language);
        target_language_version(target_language_version);
        code(code);
        default_version(default_version);
        default_profile(default_profile);
        force_default_version_and_profile(force_default_version_and_profile);
        forward_compatible(forward_compatible);
        messages(messages);
        resource(resource);
        callbacks(callbacks);
        callbacks_ctx(callbacks_ctx);
        return this;
    }

    public GLSLangInput set(GLSLangInput src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static GLSLangInput malloc() {
        return new GLSLangInput(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static GLSLangInput calloc() {
        return new GLSLangInput(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static GLSLangInput create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new GLSLangInput(MemoryUtil.memAddress(container), container);
    }

    public static GLSLangInput create(long address) {
        return new GLSLangInput(address, null);
    }

    public static GLSLangInput createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new GLSLangInput(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static GLSLangInput malloc(MemoryStack stack) {
        return new GLSLangInput(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static GLSLangInput calloc(MemoryStack stack) {
        return new GLSLangInput(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nlanguage(long struct) {
        return MemoryUtil.memGetInt(struct + LANGUAGE);
    }

    public static int nstage(long struct) {
        return MemoryUtil.memGetInt(struct + STAGE);
    }

    public static int nclient(long struct) {
        return MemoryUtil.memGetInt(struct + CLIENT);
    }

    public static int nclient_version(long struct) {
        return MemoryUtil.memGetInt(struct + CLIENT_VERSION);
    }

    public static int ntarget_language(long struct) {
        return MemoryUtil.memGetInt(struct + TARGET_LANGUAGE);
    }

    public static int ntarget_language_version(long struct) {
        return MemoryUtil.memGetInt(struct + TARGET_LANGUAGE_VERSION);
    }

    public static ByteBuffer ncode(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + CODE));
    }

    public static String ncodeString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + CODE));
    }

    public static int ndefault_version(long struct) {
        return MemoryUtil.memGetInt(struct + DEFAULT_VERSION);
    }

    public static int ndefault_profile(long struct) {
        return MemoryUtil.memGetInt(struct + DEFAULT_PROFILE);
    }

    public static int nforce_default_version_and_profile(long struct) {
        return MemoryUtil.memGetInt(struct + FORCE_DEFAULT_VERSION_AND_PROFILE);
    }

    public static int nforward_compatible(long struct) {
        return MemoryUtil.memGetInt(struct + FORWARD_COMPATIBLE);
    }

    public static int nmessages(long struct) {
        return MemoryUtil.memGetInt(struct + MESSAGES);
    }

    public static GLSLangResource nresource(long struct) {
        return GLSLangResource.createSafe(MemoryUtil.memGetAddress(struct + RESOURCE));
    }

    public static GLSLIncludeCallbacks ncallbacks(long struct) {
        return GLSLIncludeCallbacks.create(struct + CALLBACKS);
    }

    public static long ncallbacks_ctx(long struct) {
        return MemoryUtil.memGetAddress(struct + CALLBACKS_CTX);
    }

    public static void nlanguage(long struct, int value) {
        MemoryUtil.memPutInt(struct + LANGUAGE, value);
    }

    public static void nstage(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGE, value);
    }

    public static void nclient(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLIENT, value);
    }

    public static void nclient_version(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLIENT_VERSION, value);
    }

    public static void ntarget_language(long struct, int value) {
        MemoryUtil.memPutInt(struct + TARGET_LANGUAGE, value);
    }

    public static void ntarget_language_version(long struct, int value) {
        MemoryUtil.memPutInt(struct + TARGET_LANGUAGE_VERSION, value);
    }

    public static void ncode(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + CODE, MemoryUtil.memAddressSafe(value));
    }

    public static void ndefault_version(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEFAULT_VERSION, value);
    }

    public static void ndefault_profile(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEFAULT_PROFILE, value);
    }

    public static void nforce_default_version_and_profile(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORCE_DEFAULT_VERSION_AND_PROFILE, value);
    }

    public static void nforward_compatible(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORWARD_COMPATIBLE, value);
    }

    public static void nmessages(long struct, int value) {
        MemoryUtil.memPutInt(struct + MESSAGES, value);
    }

    public static void nresource(long struct, GLSLangResource value) {
        MemoryUtil.memPutAddress(struct + RESOURCE, MemoryUtil.memAddressSafe(value));
    }

    public static void ncallbacks(long struct, GLSLIncludeCallbacks value) {
        MemoryUtil.memCopy(value.address(), struct + CALLBACKS, GLSLIncludeCallbacks.SIZEOF);
    }

    public static void ncallbacks_ctx(long struct, long value) {
        MemoryUtil.memPutAddress(struct + CALLBACKS_CTX, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-shaderc.jar:org/lwjgl/util/shaderc/GLSLangInput$Buffer.class */
    public static class Buffer extends StructBuffer<GLSLangInput, Buffer> implements NativeResource {
        private static final GLSLangInput ELEMENT_FACTORY = GLSLangInput.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / GLSLangInput.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public GLSLangInput getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("glslang_source_t")
        public int language() {
            return GLSLangInput.nlanguage(address());
        }

        @NativeType("glslang_stage_t")
        public int stage() {
            return GLSLangInput.nstage(address());
        }

        @NativeType("glslang_client_t")
        public int client() {
            return GLSLangInput.nclient(address());
        }

        @NativeType("glslang_target_client_version_t")
        public int client_version() {
            return GLSLangInput.nclient_version(address());
        }

        @NativeType("glslang_target_language_t")
        public int target_language() {
            return GLSLangInput.ntarget_language(address());
        }

        @NativeType("glslang_target_language_version_t")
        public int target_language_version() {
            return GLSLangInput.ntarget_language_version(address());
        }

        @NativeType("char const *")
        public ByteBuffer code() {
            return GLSLangInput.ncode(address());
        }

        @NativeType("char const *")
        public String codeString() {
            return GLSLangInput.ncodeString(address());
        }

        public int default_version() {
            return GLSLangInput.ndefault_version(address());
        }

        @NativeType("glslang_profile_t")
        public int default_profile() {
            return GLSLangInput.ndefault_profile(address());
        }

        @NativeType("int")
        public boolean force_default_version_and_profile() {
            return GLSLangInput.nforce_default_version_and_profile(address()) != 0;
        }

        @NativeType("int")
        public boolean forward_compatible() {
            return GLSLangInput.nforward_compatible(address()) != 0;
        }

        @NativeType("glslang_messages_t")
        public int messages() {
            return GLSLangInput.nmessages(address());
        }

        @NativeType("glslang_resource_t const *")
        public GLSLangResource resource() {
            return GLSLangInput.nresource(address());
        }

        @NativeType("glsl_include_callbacks_t")
        public GLSLIncludeCallbacks callbacks() {
            return GLSLangInput.ncallbacks(address());
        }

        @NativeType("void *")
        public long callbacks_ctx() {
            return GLSLangInput.ncallbacks_ctx(address());
        }

        public Buffer language(@NativeType("glslang_source_t") int value) {
            GLSLangInput.nlanguage(address(), value);
            return this;
        }

        public Buffer stage(@NativeType("glslang_stage_t") int value) {
            GLSLangInput.nstage(address(), value);
            return this;
        }

        public Buffer client(@NativeType("glslang_client_t") int value) {
            GLSLangInput.nclient(address(), value);
            return this;
        }

        public Buffer client_version(@NativeType("glslang_target_client_version_t") int value) {
            GLSLangInput.nclient_version(address(), value);
            return this;
        }

        public Buffer target_language(@NativeType("glslang_target_language_t") int value) {
            GLSLangInput.ntarget_language(address(), value);
            return this;
        }

        public Buffer target_language_version(@NativeType("glslang_target_language_version_t") int value) {
            GLSLangInput.ntarget_language_version(address(), value);
            return this;
        }

        public Buffer code(@NativeType("char const *") ByteBuffer value) {
            GLSLangInput.ncode(address(), value);
            return this;
        }

        public Buffer default_version(int value) {
            GLSLangInput.ndefault_version(address(), value);
            return this;
        }

        public Buffer default_profile(@NativeType("glslang_profile_t") int value) {
            GLSLangInput.ndefault_profile(address(), value);
            return this;
        }

        public Buffer force_default_version_and_profile(@NativeType("int") boolean value) {
            GLSLangInput.nforce_default_version_and_profile(address(), value ? 1 : 0);
            return this;
        }

        public Buffer forward_compatible(@NativeType("int") boolean value) {
            GLSLangInput.nforward_compatible(address(), value ? 1 : 0);
            return this;
        }

        public Buffer messages(@NativeType("glslang_messages_t") int value) {
            GLSLangInput.nmessages(address(), value);
            return this;
        }

        public Buffer resource(@NativeType("glslang_resource_t const *") GLSLangResource value) {
            GLSLangInput.nresource(address(), value);
            return this;
        }

        public Buffer callbacks(@NativeType("glsl_include_callbacks_t") GLSLIncludeCallbacks value) {
            GLSLangInput.ncallbacks(address(), value);
            return this;
        }

        public Buffer callbacks(Consumer<GLSLIncludeCallbacks> consumer) {
            consumer.accept(callbacks());
            return this;
        }

        public Buffer callbacks_ctx(@NativeType("void *") long value) {
            GLSLangInput.ncallbacks_ctx(address(), value);
            return this;
        }
    }
}
