package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoNV.class */
public class VkRayTracingShaderGroupCreateInfoNV extends Struct<VkRayTracingShaderGroupCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TYPE;
    public static final int GENERALSHADER;
    public static final int CLOSESTHITSHADER;
    public static final int ANYHITSHADER;
    public static final int INTERSECTIONSHADER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        GENERALSHADER = layout.offsetof(3);
        CLOSESTHITSHADER = layout.offsetof(4);
        ANYHITSHADER = layout.offsetof(5);
        INTERSECTIONSHADER = layout.offsetof(6);
    }

    protected VkRayTracingShaderGroupCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRayTracingShaderGroupCreateInfoNV create(long address, ByteBuffer container) {
        return new VkRayTracingShaderGroupCreateInfoNV(address, container);
    }

    public VkRayTracingShaderGroupCreateInfoNV(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkStructureType")
    public int sType() {
        return nsType(address());
    }

    @NativeType("void const *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkRayTracingShaderGroupTypeKHR")
    public int type() {
        return ntype(address());
    }

    @NativeType("uint32_t")
    public int generalShader() {
        return ngeneralShader(address());
    }

    @NativeType("uint32_t")
    public int closestHitShader() {
        return nclosestHitShader(address());
    }

    @NativeType("uint32_t")
    public int anyHitShader() {
        return nanyHitShader(address());
    }

    @NativeType("uint32_t")
    public int intersectionShader() {
        return nintersectionShader(address());
    }

    public VkRayTracingShaderGroupCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoNV sType$Default() {
        return sType(NVRayTracing.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV);
    }

    public VkRayTracingShaderGroupCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoNV type(@NativeType("VkRayTracingShaderGroupTypeKHR") int value) {
        ntype(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoNV generalShader(@NativeType("uint32_t") int value) {
        ngeneralShader(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoNV closestHitShader(@NativeType("uint32_t") int value) {
        nclosestHitShader(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoNV anyHitShader(@NativeType("uint32_t") int value) {
        nanyHitShader(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoNV intersectionShader(@NativeType("uint32_t") int value) {
        nintersectionShader(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoNV set(int sType, long pNext, int type, int generalShader, int closestHitShader, int anyHitShader, int intersectionShader) {
        sType(sType);
        pNext(pNext);
        type(type);
        generalShader(generalShader);
        closestHitShader(closestHitShader);
        anyHitShader(anyHitShader);
        intersectionShader(intersectionShader);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoNV set(VkRayTracingShaderGroupCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRayTracingShaderGroupCreateInfoNV malloc() {
        return new VkRayTracingShaderGroupCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRayTracingShaderGroupCreateInfoNV calloc() {
        return new VkRayTracingShaderGroupCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRayTracingShaderGroupCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRayTracingShaderGroupCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkRayTracingShaderGroupCreateInfoNV create(long address) {
        return new VkRayTracingShaderGroupCreateInfoNV(address, null);
    }

    public static VkRayTracingShaderGroupCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRayTracingShaderGroupCreateInfoNV(address, null);
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

    public static VkRayTracingShaderGroupCreateInfoNV malloc(MemoryStack stack) {
        return new VkRayTracingShaderGroupCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRayTracingShaderGroupCreateInfoNV calloc(MemoryStack stack) {
        return new VkRayTracingShaderGroupCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return MemoryUtil.memGetInt(struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int ngeneralShader(long struct) {
        return MemoryUtil.memGetInt(struct + GENERALSHADER);
    }

    public static int nclosestHitShader(long struct) {
        return MemoryUtil.memGetInt(struct + CLOSESTHITSHADER);
    }

    public static int nanyHitShader(long struct) {
        return MemoryUtil.memGetInt(struct + ANYHITSHADER);
    }

    public static int nintersectionShader(long struct) {
        return MemoryUtil.memGetInt(struct + INTERSECTIONSHADER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void ngeneralShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + GENERALSHADER, value);
    }

    public static void nclosestHitShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + CLOSESTHITSHADER, value);
    }

    public static void nanyHitShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + ANYHITSHADER, value);
    }

    public static void nintersectionShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + INTERSECTIONSHADER, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkRayTracingShaderGroupCreateInfoNV, Buffer> implements NativeResource {
        private static final VkRayTracingShaderGroupCreateInfoNV ELEMENT_FACTORY = VkRayTracingShaderGroupCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRayTracingShaderGroupCreateInfoNV.SIZEOF);
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
        public VkRayTracingShaderGroupCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRayTracingShaderGroupCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRayTracingShaderGroupCreateInfoNV.npNext(address());
        }

        @NativeType("VkRayTracingShaderGroupTypeKHR")
        public int type() {
            return VkRayTracingShaderGroupCreateInfoNV.ntype(address());
        }

        @NativeType("uint32_t")
        public int generalShader() {
            return VkRayTracingShaderGroupCreateInfoNV.ngeneralShader(address());
        }

        @NativeType("uint32_t")
        public int closestHitShader() {
            return VkRayTracingShaderGroupCreateInfoNV.nclosestHitShader(address());
        }

        @NativeType("uint32_t")
        public int anyHitShader() {
            return VkRayTracingShaderGroupCreateInfoNV.nanyHitShader(address());
        }

        @NativeType("uint32_t")
        public int intersectionShader() {
            return VkRayTracingShaderGroupCreateInfoNV.nintersectionShader(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRayTracingShaderGroupCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRayTracing.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRayTracingShaderGroupCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkRayTracingShaderGroupTypeKHR") int value) {
            VkRayTracingShaderGroupCreateInfoNV.ntype(address(), value);
            return this;
        }

        public Buffer generalShader(@NativeType("uint32_t") int value) {
            VkRayTracingShaderGroupCreateInfoNV.ngeneralShader(address(), value);
            return this;
        }

        public Buffer closestHitShader(@NativeType("uint32_t") int value) {
            VkRayTracingShaderGroupCreateInfoNV.nclosestHitShader(address(), value);
            return this;
        }

        public Buffer anyHitShader(@NativeType("uint32_t") int value) {
            VkRayTracingShaderGroupCreateInfoNV.nanyHitShader(address(), value);
            return this;
        }

        public Buffer intersectionShader(@NativeType("uint32_t") int value) {
            VkRayTracingShaderGroupCreateInfoNV.nintersectionShader(address(), value);
            return this;
        }
    }
}
