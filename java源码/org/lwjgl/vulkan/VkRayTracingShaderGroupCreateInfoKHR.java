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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoKHR.class */
public class VkRayTracingShaderGroupCreateInfoKHR extends Struct<VkRayTracingShaderGroupCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TYPE;
    public static final int GENERALSHADER;
    public static final int CLOSESTHITSHADER;
    public static final int ANYHITSHADER;
    public static final int INTERSECTIONSHADER;
    public static final int PSHADERGROUPCAPTUREREPLAYHANDLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        GENERALSHADER = layout.offsetof(3);
        CLOSESTHITSHADER = layout.offsetof(4);
        ANYHITSHADER = layout.offsetof(5);
        INTERSECTIONSHADER = layout.offsetof(6);
        PSHADERGROUPCAPTUREREPLAYHANDLE = layout.offsetof(7);
    }

    protected VkRayTracingShaderGroupCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkRayTracingShaderGroupCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkRayTracingShaderGroupCreateInfoKHR(address, container);
    }

    public VkRayTracingShaderGroupCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("void const *")
    public long pShaderGroupCaptureReplayHandle() {
        return npShaderGroupCaptureReplayHandle(address());
    }

    public VkRayTracingShaderGroupCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoKHR sType$Default() {
        return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR);
    }

    public VkRayTracingShaderGroupCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoKHR type(@NativeType("VkRayTracingShaderGroupTypeKHR") int value) {
        ntype(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoKHR generalShader(@NativeType("uint32_t") int value) {
        ngeneralShader(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoKHR closestHitShader(@NativeType("uint32_t") int value) {
        nclosestHitShader(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoKHR anyHitShader(@NativeType("uint32_t") int value) {
        nanyHitShader(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoKHR intersectionShader(@NativeType("uint32_t") int value) {
        nintersectionShader(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoKHR pShaderGroupCaptureReplayHandle(@NativeType("void const *") long value) {
        npShaderGroupCaptureReplayHandle(address(), value);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoKHR set(int sType, long pNext, int type, int generalShader, int closestHitShader, int anyHitShader, int intersectionShader, long pShaderGroupCaptureReplayHandle) {
        sType(sType);
        pNext(pNext);
        type(type);
        generalShader(generalShader);
        closestHitShader(closestHitShader);
        anyHitShader(anyHitShader);
        intersectionShader(intersectionShader);
        pShaderGroupCaptureReplayHandle(pShaderGroupCaptureReplayHandle);
        return this;
    }

    public VkRayTracingShaderGroupCreateInfoKHR set(VkRayTracingShaderGroupCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkRayTracingShaderGroupCreateInfoKHR malloc() {
        return new VkRayTracingShaderGroupCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkRayTracingShaderGroupCreateInfoKHR calloc() {
        return new VkRayTracingShaderGroupCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkRayTracingShaderGroupCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkRayTracingShaderGroupCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkRayTracingShaderGroupCreateInfoKHR create(long address) {
        return new VkRayTracingShaderGroupCreateInfoKHR(address, null);
    }

    public static VkRayTracingShaderGroupCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkRayTracingShaderGroupCreateInfoKHR(address, null);
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

    public static VkRayTracingShaderGroupCreateInfoKHR malloc(MemoryStack stack) {
        return new VkRayTracingShaderGroupCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkRayTracingShaderGroupCreateInfoKHR calloc(MemoryStack stack) {
        return new VkRayTracingShaderGroupCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long npShaderGroupCaptureReplayHandle(long struct) {
        return MemoryUtil.memGetAddress(struct + PSHADERGROUPCAPTUREREPLAYHANDLE);
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

    public static void npShaderGroupCaptureReplayHandle(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PSHADERGROUPCAPTUREREPLAYHANDLE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkRayTracingShaderGroupCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkRayTracingShaderGroupCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkRayTracingShaderGroupCreateInfoKHR ELEMENT_FACTORY = VkRayTracingShaderGroupCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkRayTracingShaderGroupCreateInfoKHR.SIZEOF);
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
        public VkRayTracingShaderGroupCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkRayTracingShaderGroupCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkRayTracingShaderGroupCreateInfoKHR.npNext(address());
        }

        @NativeType("VkRayTracingShaderGroupTypeKHR")
        public int type() {
            return VkRayTracingShaderGroupCreateInfoKHR.ntype(address());
        }

        @NativeType("uint32_t")
        public int generalShader() {
            return VkRayTracingShaderGroupCreateInfoKHR.ngeneralShader(address());
        }

        @NativeType("uint32_t")
        public int closestHitShader() {
            return VkRayTracingShaderGroupCreateInfoKHR.nclosestHitShader(address());
        }

        @NativeType("uint32_t")
        public int anyHitShader() {
            return VkRayTracingShaderGroupCreateInfoKHR.nanyHitShader(address());
        }

        @NativeType("uint32_t")
        public int intersectionShader() {
            return VkRayTracingShaderGroupCreateInfoKHR.nintersectionShader(address());
        }

        @NativeType("void const *")
        public long pShaderGroupCaptureReplayHandle() {
            return VkRayTracingShaderGroupCreateInfoKHR.npShaderGroupCaptureReplayHandle(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkRayTracingShaderGroupCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRRayTracingPipeline.VK_STRUCTURE_TYPE_RAY_TRACING_SHADER_GROUP_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkRayTracingShaderGroupCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkRayTracingShaderGroupTypeKHR") int value) {
            VkRayTracingShaderGroupCreateInfoKHR.ntype(address(), value);
            return this;
        }

        public Buffer generalShader(@NativeType("uint32_t") int value) {
            VkRayTracingShaderGroupCreateInfoKHR.ngeneralShader(address(), value);
            return this;
        }

        public Buffer closestHitShader(@NativeType("uint32_t") int value) {
            VkRayTracingShaderGroupCreateInfoKHR.nclosestHitShader(address(), value);
            return this;
        }

        public Buffer anyHitShader(@NativeType("uint32_t") int value) {
            VkRayTracingShaderGroupCreateInfoKHR.nanyHitShader(address(), value);
            return this;
        }

        public Buffer intersectionShader(@NativeType("uint32_t") int value) {
            VkRayTracingShaderGroupCreateInfoKHR.nintersectionShader(address(), value);
            return this;
        }

        public Buffer pShaderGroupCaptureReplayHandle(@NativeType("void const *") long value) {
            VkRayTracingShaderGroupCreateInfoKHR.npShaderGroupCaptureReplayHandle(address(), value);
            return this;
        }
    }
}
