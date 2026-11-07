package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainTimeDomainPropertiesEXT.class */
public class VkSwapchainTimeDomainPropertiesEXT extends Struct<VkSwapchainTimeDomainPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TIMEDOMAINCOUNT;
    public static final int PTIMEDOMAINS;
    public static final int PTIMEDOMAINIDS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TIMEDOMAINCOUNT = layout.offsetof(2);
        PTIMEDOMAINS = layout.offsetof(3);
        PTIMEDOMAINIDS = layout.offsetof(4);
    }

    protected VkSwapchainTimeDomainPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSwapchainTimeDomainPropertiesEXT create(long address, ByteBuffer container) {
        return new VkSwapchainTimeDomainPropertiesEXT(address, container);
    }

    public VkSwapchainTimeDomainPropertiesEXT(ByteBuffer container) {
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
    public int timeDomainCount() {
        return ntimeDomainCount(address());
    }

    @NativeType("VkTimeDomainKHR *")
    public IntBuffer pTimeDomains() {
        return npTimeDomains(address());
    }

    @NativeType("uint64_t *")
    public LongBuffer pTimeDomainIds() {
        return npTimeDomainIds(address());
    }

    public VkSwapchainTimeDomainPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSwapchainTimeDomainPropertiesEXT sType$Default() {
        return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT);
    }

    public VkSwapchainTimeDomainPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSwapchainTimeDomainPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkSwapchainTimeDomainPropertiesEXT set(VkSwapchainTimeDomainPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSwapchainTimeDomainPropertiesEXT malloc() {
        return new VkSwapchainTimeDomainPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSwapchainTimeDomainPropertiesEXT calloc() {
        return new VkSwapchainTimeDomainPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSwapchainTimeDomainPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSwapchainTimeDomainPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSwapchainTimeDomainPropertiesEXT create(long address) {
        return new VkSwapchainTimeDomainPropertiesEXT(address, null);
    }

    public static VkSwapchainTimeDomainPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSwapchainTimeDomainPropertiesEXT(address, null);
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

    public static VkSwapchainTimeDomainPropertiesEXT malloc(MemoryStack stack) {
        return new VkSwapchainTimeDomainPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSwapchainTimeDomainPropertiesEXT calloc(MemoryStack stack) {
        return new VkSwapchainTimeDomainPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntimeDomainCount(long struct) {
        return MemoryUtil.memGetInt(struct + TIMEDOMAINCOUNT);
    }

    public static IntBuffer npTimeDomains(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PTIMEDOMAINS), ntimeDomainCount(struct));
    }

    public static LongBuffer npTimeDomainIds(long struct) {
        return MemoryUtil.memLongBufferSafe(MemoryUtil.memGetAddress(struct + PTIMEDOMAINIDS), ntimeDomainCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSwapchainTimeDomainPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSwapchainTimeDomainPropertiesEXT, Buffer> implements NativeResource {
        private static final VkSwapchainTimeDomainPropertiesEXT ELEMENT_FACTORY = VkSwapchainTimeDomainPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSwapchainTimeDomainPropertiesEXT.SIZEOF);
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
        public VkSwapchainTimeDomainPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSwapchainTimeDomainPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkSwapchainTimeDomainPropertiesEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int timeDomainCount() {
            return VkSwapchainTimeDomainPropertiesEXT.ntimeDomainCount(address());
        }

        @NativeType("VkTimeDomainKHR *")
        public IntBuffer pTimeDomains() {
            return VkSwapchainTimeDomainPropertiesEXT.npTimeDomains(address());
        }

        @NativeType("uint64_t *")
        public LongBuffer pTimeDomainIds() {
            return VkSwapchainTimeDomainPropertiesEXT.npTimeDomainIds(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSwapchainTimeDomainPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTPresentTiming.VK_STRUCTURE_TYPE_SWAPCHAIN_TIME_DOMAIN_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkSwapchainTimeDomainPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
