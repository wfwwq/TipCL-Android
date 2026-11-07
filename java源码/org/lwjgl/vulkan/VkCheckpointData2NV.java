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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCheckpointData2NV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCheckpointData2NV.class */
public class VkCheckpointData2NV extends Struct<VkCheckpointData2NV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STAGE;
    public static final int PCHECKPOINTMARKER;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STAGE = layout.offsetof(2);
        PCHECKPOINTMARKER = layout.offsetof(3);
    }

    protected VkCheckpointData2NV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCheckpointData2NV create(long address, ByteBuffer container) {
        return new VkCheckpointData2NV(address, container);
    }

    public VkCheckpointData2NV(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkPipelineStageFlags2")
    public long stage() {
        return nstage(address());
    }

    @NativeType("void *")
    public long pCheckpointMarker() {
        return npCheckpointMarker(address());
    }

    public VkCheckpointData2NV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCheckpointData2NV sType$Default() {
        return sType(NVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV);
    }

    public VkCheckpointData2NV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCheckpointData2NV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkCheckpointData2NV set(VkCheckpointData2NV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCheckpointData2NV malloc() {
        return new VkCheckpointData2NV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCheckpointData2NV calloc() {
        return new VkCheckpointData2NV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCheckpointData2NV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCheckpointData2NV(MemoryUtil.memAddress(container), container);
    }

    public static VkCheckpointData2NV create(long address) {
        return new VkCheckpointData2NV(address, null);
    }

    public static VkCheckpointData2NV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCheckpointData2NV(address, null);
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

    public static VkCheckpointData2NV malloc(MemoryStack stack) {
        return new VkCheckpointData2NV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCheckpointData2NV calloc(MemoryStack stack) {
        return new VkCheckpointData2NV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nstage(long struct) {
        return MemoryUtil.memGetLong(struct + STAGE);
    }

    public static long npCheckpointMarker(long struct) {
        return MemoryUtil.memGetAddress(struct + PCHECKPOINTMARKER);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCheckpointData2NV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCheckpointData2NV$Buffer.class */
    public static class Buffer extends StructBuffer<VkCheckpointData2NV, Buffer> implements NativeResource {
        private static final VkCheckpointData2NV ELEMENT_FACTORY = VkCheckpointData2NV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCheckpointData2NV.SIZEOF);
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
        public VkCheckpointData2NV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCheckpointData2NV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkCheckpointData2NV.npNext(address());
        }

        @NativeType("VkPipelineStageFlags2")
        public long stage() {
            return VkCheckpointData2NV.nstage(address());
        }

        @NativeType("void *")
        public long pCheckpointMarker() {
            return VkCheckpointData2NV.npCheckpointMarker(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCheckpointData2NV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceDiagnosticCheckpoints.VK_STRUCTURE_TYPE_CHECKPOINT_DATA_2_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkCheckpointData2NV.npNext(address(), value);
            return this;
        }
    }
}
