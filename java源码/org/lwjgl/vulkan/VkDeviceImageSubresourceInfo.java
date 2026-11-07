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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageSubresourceInfo.class */
public class VkDeviceImageSubresourceInfo extends Struct<VkDeviceImageSubresourceInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PCREATEINFO;
    public static final int PSUBRESOURCE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PCREATEINFO = layout.offsetof(2);
        PSUBRESOURCE = layout.offsetof(3);
    }

    protected VkDeviceImageSubresourceInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceImageSubresourceInfo create(long address, ByteBuffer container) {
        return new VkDeviceImageSubresourceInfo(address, container);
    }

    public VkDeviceImageSubresourceInfo(ByteBuffer container) {
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

    @NativeType("VkImageCreateInfo const *")
    public VkImageCreateInfo pCreateInfo() {
        return npCreateInfo(address());
    }

    @NativeType("VkImageSubresource2 const *")
    public VkImageSubresource2 pSubresource() {
        return npSubresource(address());
    }

    public VkDeviceImageSubresourceInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceImageSubresourceInfo sType$Default() {
        return sType(1000470004);
    }

    public VkDeviceImageSubresourceInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceImageSubresourceInfo pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) {
        npCreateInfo(address(), value);
        return this;
    }

    public VkDeviceImageSubresourceInfo pSubresource(@NativeType("VkImageSubresource2 const *") VkImageSubresource2 value) {
        npSubresource(address(), value);
        return this;
    }

    public VkDeviceImageSubresourceInfo set(int sType, long pNext, VkImageCreateInfo pCreateInfo, VkImageSubresource2 pSubresource) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);
        pSubresource(pSubresource);
        return this;
    }

    public VkDeviceImageSubresourceInfo set(VkDeviceImageSubresourceInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceImageSubresourceInfo malloc() {
        return new VkDeviceImageSubresourceInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceImageSubresourceInfo calloc() {
        return new VkDeviceImageSubresourceInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceImageSubresourceInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceImageSubresourceInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceImageSubresourceInfo create(long address) {
        return new VkDeviceImageSubresourceInfo(address, null);
    }

    public static VkDeviceImageSubresourceInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceImageSubresourceInfo(address, null);
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

    public static VkDeviceImageSubresourceInfo malloc(MemoryStack stack) {
        return new VkDeviceImageSubresourceInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceImageSubresourceInfo calloc(MemoryStack stack) {
        return new VkDeviceImageSubresourceInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkImageCreateInfo npCreateInfo(long struct) {
        return VkImageCreateInfo.create(MemoryUtil.memGetAddress(struct + PCREATEINFO));
    }

    public static VkImageSubresource2 npSubresource(long struct) {
        return VkImageSubresource2.create(MemoryUtil.memGetAddress(struct + PSUBRESOURCE));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npCreateInfo(long struct, VkImageCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PCREATEINFO, value.address());
    }

    public static void npSubresource(long struct, VkImageSubresource2 value) {
        MemoryUtil.memPutAddress(struct + PSUBRESOURCE, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PCREATEINFO));
        Checks.check(MemoryUtil.memGetAddress(struct + PSUBRESOURCE));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageSubresourceInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceImageSubresourceInfo, Buffer> implements NativeResource {
        private static final VkDeviceImageSubresourceInfo ELEMENT_FACTORY = VkDeviceImageSubresourceInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceImageSubresourceInfo.SIZEOF);
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
        public VkDeviceImageSubresourceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceImageSubresourceInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceImageSubresourceInfo.npNext(address());
        }

        @NativeType("VkImageCreateInfo const *")
        public VkImageCreateInfo pCreateInfo() {
            return VkDeviceImageSubresourceInfo.npCreateInfo(address());
        }

        @NativeType("VkImageSubresource2 const *")
        public VkImageSubresource2 pSubresource() {
            return VkDeviceImageSubresourceInfo.npSubresource(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceImageSubresourceInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000470004);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceImageSubresourceInfo.npNext(address(), value);
            return this;
        }

        public Buffer pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) {
            VkDeviceImageSubresourceInfo.npCreateInfo(address(), value);
            return this;
        }

        public Buffer pSubresource(@NativeType("VkImageSubresource2 const *") VkImageSubresource2 value) {
            VkDeviceImageSubresourceInfo.npSubresource(address(), value);
            return this;
        }
    }
}
