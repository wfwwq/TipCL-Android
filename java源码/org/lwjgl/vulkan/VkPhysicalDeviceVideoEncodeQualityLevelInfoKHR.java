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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.class */
public class VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR extends Struct<VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PVIDEOPROFILE;
    public static final int QUALITYLEVEL;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PVIDEOPROFILE = layout.offsetof(2);
        QUALITYLEVEL = layout.offsetof(3);
    }

    protected VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(address, container);
    }

    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoProfileInfoKHR const *")
    public VkVideoProfileInfoKHR pVideoProfile() {
        return npVideoProfile(address());
    }

    @NativeType("uint32_t")
    public int qualityLevel() {
        return nqualityLevel(address());
    }

    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR sType$Default() {
        return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR);
    }

    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR pVideoProfile(@NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR value) {
        npVideoProfile(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR qualityLevel(@NativeType("uint32_t") int value) {
        nqualityLevel(address(), value);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR set(int sType, long pNext, VkVideoProfileInfoKHR pVideoProfile, int qualityLevel) {
        sType(sType);
        pNext(pNext);
        pVideoProfile(pVideoProfile);
        qualityLevel(qualityLevel);
        return this;
    }

    public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR set(VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR malloc() {
        return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR calloc() {
        return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR create(long address) {
        return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(address, null);
    }

    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(address, null);
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

    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkVideoProfileInfoKHR npVideoProfile(long struct) {
        return VkVideoProfileInfoKHR.create(MemoryUtil.memGetAddress(struct + PVIDEOPROFILE));
    }

    public static int nqualityLevel(long struct) {
        return MemoryUtil.memGetInt(struct + QUALITYLEVEL);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npVideoProfile(long struct, VkVideoProfileInfoKHR value) {
        MemoryUtil.memPutAddress(struct + PVIDEOPROFILE, value.address());
    }

    public static void nqualityLevel(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUALITYLEVEL, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PVIDEOPROFILE));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR ELEMENT_FACTORY = VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.SIZEOF);
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
        public VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.npNext(address());
        }

        @NativeType("VkVideoProfileInfoKHR const *")
        public VkVideoProfileInfoKHR pVideoProfile() {
            return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.npVideoProfile(address());
        }

        @NativeType("uint32_t")
        public int qualityLevel() {
            return VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.nqualityLevel(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VIDEO_ENCODE_QUALITY_LEVEL_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer pVideoProfile(@NativeType("VkVideoProfileInfoKHR const *") VkVideoProfileInfoKHR value) {
            VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.npVideoProfile(address(), value);
            return this;
        }

        public Buffer qualityLevel(@NativeType("uint32_t") int value) {
            VkPhysicalDeviceVideoEncodeQualityLevelInfoKHR.nqualityLevel(address(), value);
            return this;
        }
    }
}
