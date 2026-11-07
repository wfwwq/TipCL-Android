package org.lwjgl.util.spvc;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHLSLResourceBinding.class
 */
@NativeType("struct spvc_hlsl_resource_binding")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHLSLResourceBinding.class */
public class SpvcHLSLResourceBinding extends Struct<SpvcHLSLResourceBinding> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STAGE;
    public static final int DESC_SET;
    public static final int BINDING;
    public static final int CBV;
    public static final int UAV;
    public static final int SRV;
    public static final int SAMPLER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(SpvcHLSLResourceBindingMapping.SIZEOF, SpvcHLSLResourceBindingMapping.ALIGNOF), __member(SpvcHLSLResourceBindingMapping.SIZEOF, SpvcHLSLResourceBindingMapping.ALIGNOF), __member(SpvcHLSLResourceBindingMapping.SIZEOF, SpvcHLSLResourceBindingMapping.ALIGNOF), __member(SpvcHLSLResourceBindingMapping.SIZEOF, SpvcHLSLResourceBindingMapping.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STAGE = layout.offsetof(0);
        DESC_SET = layout.offsetof(1);
        BINDING = layout.offsetof(2);
        CBV = layout.offsetof(3);
        UAV = layout.offsetof(4);
        SRV = layout.offsetof(5);
        SAMPLER = layout.offsetof(6);
    }

    protected SpvcHLSLResourceBinding(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SpvcHLSLResourceBinding create(long address, ByteBuffer container) {
        return new SpvcHLSLResourceBinding(address, container);
    }

    public SpvcHLSLResourceBinding(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("SpvExecutionModel")
    public int stage() {
        return nstage(address());
    }

    @NativeType("unsigned")
    public int desc_set() {
        return ndesc_set(address());
    }

    @NativeType("unsigned")
    public int binding() {
        return nbinding(address());
    }

    @NativeType("spvc_hlsl_resource_binding_mapping")
    public SpvcHLSLResourceBindingMapping cbv() {
        return ncbv(address());
    }

    @NativeType("spvc_hlsl_resource_binding_mapping")
    public SpvcHLSLResourceBindingMapping uav() {
        return nuav(address());
    }

    @NativeType("spvc_hlsl_resource_binding_mapping")
    public SpvcHLSLResourceBindingMapping srv() {
        return nsrv(address());
    }

    @NativeType("spvc_hlsl_resource_binding_mapping")
    public SpvcHLSLResourceBindingMapping sampler() {
        return nsampler(address());
    }

    public SpvcHLSLResourceBinding stage(@NativeType("SpvExecutionModel") int value) {
        nstage(address(), value);
        return this;
    }

    public SpvcHLSLResourceBinding desc_set(@NativeType("unsigned") int value) {
        ndesc_set(address(), value);
        return this;
    }

    public SpvcHLSLResourceBinding binding(@NativeType("unsigned") int value) {
        nbinding(address(), value);
        return this;
    }

    public SpvcHLSLResourceBinding cbv(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) {
        ncbv(address(), value);
        return this;
    }

    public SpvcHLSLResourceBinding cbv(Consumer<SpvcHLSLResourceBindingMapping> consumer) {
        consumer.accept(cbv());
        return this;
    }

    public SpvcHLSLResourceBinding uav(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) {
        nuav(address(), value);
        return this;
    }

    public SpvcHLSLResourceBinding uav(Consumer<SpvcHLSLResourceBindingMapping> consumer) {
        consumer.accept(uav());
        return this;
    }

    public SpvcHLSLResourceBinding srv(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) {
        nsrv(address(), value);
        return this;
    }

    public SpvcHLSLResourceBinding srv(Consumer<SpvcHLSLResourceBindingMapping> consumer) {
        consumer.accept(srv());
        return this;
    }

    public SpvcHLSLResourceBinding sampler(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) {
        nsampler(address(), value);
        return this;
    }

    public SpvcHLSLResourceBinding sampler(Consumer<SpvcHLSLResourceBindingMapping> consumer) {
        consumer.accept(sampler());
        return this;
    }

    public SpvcHLSLResourceBinding set(int stage, int desc_set, int binding, SpvcHLSLResourceBindingMapping cbv, SpvcHLSLResourceBindingMapping uav, SpvcHLSLResourceBindingMapping srv, SpvcHLSLResourceBindingMapping sampler) {
        stage(stage);
        desc_set(desc_set);
        binding(binding);
        cbv(cbv);
        uav(uav);
        srv(srv);
        sampler(sampler);
        return this;
    }

    public SpvcHLSLResourceBinding set(SpvcHLSLResourceBinding src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SpvcHLSLResourceBinding malloc() {
        return new SpvcHLSLResourceBinding(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SpvcHLSLResourceBinding calloc() {
        return new SpvcHLSLResourceBinding(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SpvcHLSLResourceBinding create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SpvcHLSLResourceBinding(MemoryUtil.memAddress(container), container);
    }

    public static SpvcHLSLResourceBinding create(long address) {
        return new SpvcHLSLResourceBinding(address, null);
    }

    public static SpvcHLSLResourceBinding createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SpvcHLSLResourceBinding(address, null);
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

    public static SpvcHLSLResourceBinding malloc(MemoryStack stack) {
        return new SpvcHLSLResourceBinding(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SpvcHLSLResourceBinding calloc(MemoryStack stack) {
        return new SpvcHLSLResourceBinding(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nstage(long struct) {
        return MemoryUtil.memGetInt(struct + STAGE);
    }

    public static int ndesc_set(long struct) {
        return MemoryUtil.memGetInt(struct + DESC_SET);
    }

    public static int nbinding(long struct) {
        return MemoryUtil.memGetInt(struct + BINDING);
    }

    public static SpvcHLSLResourceBindingMapping ncbv(long struct) {
        return SpvcHLSLResourceBindingMapping.create(struct + CBV);
    }

    public static SpvcHLSLResourceBindingMapping nuav(long struct) {
        return SpvcHLSLResourceBindingMapping.create(struct + UAV);
    }

    public static SpvcHLSLResourceBindingMapping nsrv(long struct) {
        return SpvcHLSLResourceBindingMapping.create(struct + SRV);
    }

    public static SpvcHLSLResourceBindingMapping nsampler(long struct) {
        return SpvcHLSLResourceBindingMapping.create(struct + SAMPLER);
    }

    public static void nstage(long struct, int value) {
        MemoryUtil.memPutInt(struct + STAGE, value);
    }

    public static void ndesc_set(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESC_SET, value);
    }

    public static void nbinding(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINDING, value);
    }

    public static void ncbv(long struct, SpvcHLSLResourceBindingMapping value) {
        MemoryUtil.memCopy(value.address(), struct + CBV, SpvcHLSLResourceBindingMapping.SIZEOF);
    }

    public static void nuav(long struct, SpvcHLSLResourceBindingMapping value) {
        MemoryUtil.memCopy(value.address(), struct + UAV, SpvcHLSLResourceBindingMapping.SIZEOF);
    }

    public static void nsrv(long struct, SpvcHLSLResourceBindingMapping value) {
        MemoryUtil.memCopy(value.address(), struct + SRV, SpvcHLSLResourceBindingMapping.SIZEOF);
    }

    public static void nsampler(long struct, SpvcHLSLResourceBindingMapping value) {
        MemoryUtil.memCopy(value.address(), struct + SAMPLER, SpvcHLSLResourceBindingMapping.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHLSLResourceBinding$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-spvc.jar:org/lwjgl/util/spvc/SpvcHLSLResourceBinding$Buffer.class */
    public static class Buffer extends StructBuffer<SpvcHLSLResourceBinding, Buffer> implements NativeResource {
        private static final SpvcHLSLResourceBinding ELEMENT_FACTORY = SpvcHLSLResourceBinding.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SpvcHLSLResourceBinding.SIZEOF);
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
        public SpvcHLSLResourceBinding getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("SpvExecutionModel")
        public int stage() {
            return SpvcHLSLResourceBinding.nstage(address());
        }

        @NativeType("unsigned")
        public int desc_set() {
            return SpvcHLSLResourceBinding.ndesc_set(address());
        }

        @NativeType("unsigned")
        public int binding() {
            return SpvcHLSLResourceBinding.nbinding(address());
        }

        @NativeType("spvc_hlsl_resource_binding_mapping")
        public SpvcHLSLResourceBindingMapping cbv() {
            return SpvcHLSLResourceBinding.ncbv(address());
        }

        @NativeType("spvc_hlsl_resource_binding_mapping")
        public SpvcHLSLResourceBindingMapping uav() {
            return SpvcHLSLResourceBinding.nuav(address());
        }

        @NativeType("spvc_hlsl_resource_binding_mapping")
        public SpvcHLSLResourceBindingMapping srv() {
            return SpvcHLSLResourceBinding.nsrv(address());
        }

        @NativeType("spvc_hlsl_resource_binding_mapping")
        public SpvcHLSLResourceBindingMapping sampler() {
            return SpvcHLSLResourceBinding.nsampler(address());
        }

        public Buffer stage(@NativeType("SpvExecutionModel") int value) {
            SpvcHLSLResourceBinding.nstage(address(), value);
            return this;
        }

        public Buffer desc_set(@NativeType("unsigned") int value) {
            SpvcHLSLResourceBinding.ndesc_set(address(), value);
            return this;
        }

        public Buffer binding(@NativeType("unsigned") int value) {
            SpvcHLSLResourceBinding.nbinding(address(), value);
            return this;
        }

        public Buffer cbv(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) {
            SpvcHLSLResourceBinding.ncbv(address(), value);
            return this;
        }

        public Buffer cbv(Consumer<SpvcHLSLResourceBindingMapping> consumer) {
            consumer.accept(cbv());
            return this;
        }

        public Buffer uav(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) {
            SpvcHLSLResourceBinding.nuav(address(), value);
            return this;
        }

        public Buffer uav(Consumer<SpvcHLSLResourceBindingMapping> consumer) {
            consumer.accept(uav());
            return this;
        }

        public Buffer srv(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) {
            SpvcHLSLResourceBinding.nsrv(address(), value);
            return this;
        }

        public Buffer srv(Consumer<SpvcHLSLResourceBindingMapping> consumer) {
            consumer.accept(srv());
            return this;
        }

        public Buffer sampler(@NativeType("spvc_hlsl_resource_binding_mapping") SpvcHLSLResourceBindingMapping value) {
            SpvcHLSLResourceBinding.nsampler(address(), value);
            return this;
        }

        public Buffer sampler(Consumer<SpvcHLSLResourceBindingMapping> consumer) {
            consumer.accept(sampler());
            return this;
        }
    }
}
