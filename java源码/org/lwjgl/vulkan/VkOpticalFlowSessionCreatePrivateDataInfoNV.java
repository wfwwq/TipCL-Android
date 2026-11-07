package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreatePrivateDataInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreatePrivateDataInfoNV.class */
public class VkOpticalFlowSessionCreatePrivateDataInfoNV extends Struct<VkOpticalFlowSessionCreatePrivateDataInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ID;
    public static final int SIZE;
    public static final int PPRIVATEDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ID = layout.offsetof(2);
        SIZE = layout.offsetof(3);
        PPRIVATEDATA = layout.offsetof(4);
    }

    protected VkOpticalFlowSessionCreatePrivateDataInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkOpticalFlowSessionCreatePrivateDataInfoNV create(long address, ByteBuffer container) {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(address, container);
    }

    public VkOpticalFlowSessionCreatePrivateDataInfoNV(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int id() {
        return nid(address());
    }

    @NativeType("uint32_t")
    public int size() {
        return nsize(address());
    }

    @NativeType("void const *")
    public long pPrivateData() {
        return npPrivateData(address());
    }

    public VkOpticalFlowSessionCreatePrivateDataInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreatePrivateDataInfoNV sType$Default() {
        return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV);
    }

    public VkOpticalFlowSessionCreatePrivateDataInfoNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreatePrivateDataInfoNV id(@NativeType("uint32_t") int value) {
        nid(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreatePrivateDataInfoNV size(@NativeType("uint32_t") int value) {
        nsize(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreatePrivateDataInfoNV pPrivateData(@NativeType("void const *") long value) {
        npPrivateData(address(), value);
        return this;
    }

    public VkOpticalFlowSessionCreatePrivateDataInfoNV set(int sType, long pNext, int id, int size, long pPrivateData) {
        sType(sType);
        pNext(pNext);
        id(id);
        size(size);
        pPrivateData(pPrivateData);
        return this;
    }

    public VkOpticalFlowSessionCreatePrivateDataInfoNV set(VkOpticalFlowSessionCreatePrivateDataInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV malloc() {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV calloc() {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV create(long address) {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(address, null);
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(address, null);
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

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV malloc(MemoryStack stack) {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkOpticalFlowSessionCreatePrivateDataInfoNV calloc(MemoryStack stack) {
        return new VkOpticalFlowSessionCreatePrivateDataInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nid(long struct) {
        return MemoryUtil.memGetInt(struct + ID);
    }

    public static int nsize(long struct) {
        return MemoryUtil.memGetInt(struct + SIZE);
    }

    public static long npPrivateData(long struct) {
        return MemoryUtil.memGetAddress(struct + PPRIVATEDATA);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nid(long struct, int value) {
        MemoryUtil.memPutInt(struct + ID, value);
    }

    public static void nsize(long struct, int value) {
        MemoryUtil.memPutInt(struct + SIZE, value);
    }

    public static void npPrivateData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PPRIVATEDATA, Checks.check(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PPRIVATEDATA));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreatePrivateDataInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkOpticalFlowSessionCreatePrivateDataInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkOpticalFlowSessionCreatePrivateDataInfoNV, Buffer> implements NativeResource {
        private static final VkOpticalFlowSessionCreatePrivateDataInfoNV ELEMENT_FACTORY = VkOpticalFlowSessionCreatePrivateDataInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkOpticalFlowSessionCreatePrivateDataInfoNV.SIZEOF);
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
        public VkOpticalFlowSessionCreatePrivateDataInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkOpticalFlowSessionCreatePrivateDataInfoNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkOpticalFlowSessionCreatePrivateDataInfoNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int id() {
            return VkOpticalFlowSessionCreatePrivateDataInfoNV.nid(address());
        }

        @NativeType("uint32_t")
        public int size() {
            return VkOpticalFlowSessionCreatePrivateDataInfoNV.nsize(address());
        }

        @NativeType("void const *")
        public long pPrivateData() {
            return VkOpticalFlowSessionCreatePrivateDataInfoNV.npPrivateData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkOpticalFlowSessionCreatePrivateDataInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVOpticalFlow.VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_PRIVATE_DATA_INFO_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkOpticalFlowSessionCreatePrivateDataInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer id(@NativeType("uint32_t") int value) {
            VkOpticalFlowSessionCreatePrivateDataInfoNV.nid(address(), value);
            return this;
        }

        public Buffer size(@NativeType("uint32_t") int value) {
            VkOpticalFlowSessionCreatePrivateDataInfoNV.nsize(address(), value);
            return this;
        }

        public Buffer pPrivateData(@NativeType("void const *") long value) {
            VkOpticalFlowSessionCreatePrivateDataInfoNV.npPrivateData(address(), value);
            return this;
        }
    }
}
