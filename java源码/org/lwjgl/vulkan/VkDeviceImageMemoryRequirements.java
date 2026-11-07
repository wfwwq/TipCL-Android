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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirements.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirements.class */
public class VkDeviceImageMemoryRequirements extends Struct<VkDeviceImageMemoryRequirements> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PCREATEINFO;
    public static final int PLANEASPECT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PCREATEINFO = layout.offsetof(2);
        PLANEASPECT = layout.offsetof(3);
    }

    protected VkDeviceImageMemoryRequirements(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceImageMemoryRequirements create(long address, ByteBuffer container) {
        return new VkDeviceImageMemoryRequirements(address, container);
    }

    public VkDeviceImageMemoryRequirements(ByteBuffer container) {
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

    @NativeType("VkImageAspectFlagBits")
    public int planeAspect() {
        return nplaneAspect(address());
    }

    public VkDeviceImageMemoryRequirements sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceImageMemoryRequirements sType$Default() {
        return sType(1000413003);
    }

    public VkDeviceImageMemoryRequirements pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceImageMemoryRequirements pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) {
        npCreateInfo(address(), value);
        return this;
    }

    public VkDeviceImageMemoryRequirements planeAspect(@NativeType("VkImageAspectFlagBits") int value) {
        nplaneAspect(address(), value);
        return this;
    }

    public VkDeviceImageMemoryRequirements set(int sType, long pNext, VkImageCreateInfo pCreateInfo, int planeAspect) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);
        planeAspect(planeAspect);
        return this;
    }

    public VkDeviceImageMemoryRequirements set(VkDeviceImageMemoryRequirements src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceImageMemoryRequirements malloc() {
        return new VkDeviceImageMemoryRequirements(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceImageMemoryRequirements calloc() {
        return new VkDeviceImageMemoryRequirements(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceImageMemoryRequirements create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceImageMemoryRequirements(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceImageMemoryRequirements create(long address) {
        return new VkDeviceImageMemoryRequirements(address, null);
    }

    public static VkDeviceImageMemoryRequirements createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceImageMemoryRequirements(address, null);
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

    public static VkDeviceImageMemoryRequirements malloc(MemoryStack stack) {
        return new VkDeviceImageMemoryRequirements(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceImageMemoryRequirements calloc(MemoryStack stack) {
        return new VkDeviceImageMemoryRequirements(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nplaneAspect(long struct) {
        return MemoryUtil.memGetInt(struct + PLANEASPECT);
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

    public static void nplaneAspect(long struct, int value) {
        MemoryUtil.memPutInt(struct + PLANEASPECT, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PCREATEINFO));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirements$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceImageMemoryRequirements$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceImageMemoryRequirements, Buffer> implements NativeResource {
        private static final VkDeviceImageMemoryRequirements ELEMENT_FACTORY = VkDeviceImageMemoryRequirements.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceImageMemoryRequirements.SIZEOF);
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
        public VkDeviceImageMemoryRequirements getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceImageMemoryRequirements.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceImageMemoryRequirements.npNext(address());
        }

        @NativeType("VkImageCreateInfo const *")
        public VkImageCreateInfo pCreateInfo() {
            return VkDeviceImageMemoryRequirements.npCreateInfo(address());
        }

        @NativeType("VkImageAspectFlagBits")
        public int planeAspect() {
            return VkDeviceImageMemoryRequirements.nplaneAspect(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceImageMemoryRequirements.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000413003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceImageMemoryRequirements.npNext(address(), value);
            return this;
        }

        public Buffer pCreateInfo(@NativeType("VkImageCreateInfo const *") VkImageCreateInfo value) {
            VkDeviceImageMemoryRequirements.npCreateInfo(address(), value);
            return this;
        }

        public Buffer planeAspect(@NativeType("VkImageAspectFlagBits") int value) {
            VkDeviceImageMemoryRequirements.nplaneAspect(address(), value);
            return this;
        }
    }
}
