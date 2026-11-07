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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceASTCDecodeFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceASTCDecodeFeaturesEXT.class */
public class VkPhysicalDeviceASTCDecodeFeaturesEXT extends Struct<VkPhysicalDeviceASTCDecodeFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DECODEMODESHAREDEXPONENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DECODEMODESHAREDEXPONENT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceASTCDecodeFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceASTCDecodeFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceASTCDecodeFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceASTCDecodeFeaturesEXT(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean decodeModeSharedExponent() {
        return ndecodeModeSharedExponent(address()) != 0;
    }

    public VkPhysicalDeviceASTCDecodeFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceASTCDecodeFeaturesEXT sType$Default() {
        return sType(EXTAstcDecodeMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT);
    }

    public VkPhysicalDeviceASTCDecodeFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceASTCDecodeFeaturesEXT decodeModeSharedExponent(@NativeType("VkBool32") boolean value) {
        ndecodeModeSharedExponent(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceASTCDecodeFeaturesEXT set(int sType, long pNext, boolean decodeModeSharedExponent) {
        sType(sType);
        pNext(pNext);
        decodeModeSharedExponent(decodeModeSharedExponent);
        return this;
    }

    public VkPhysicalDeviceASTCDecodeFeaturesEXT set(VkPhysicalDeviceASTCDecodeFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceASTCDecodeFeaturesEXT malloc() {
        return new VkPhysicalDeviceASTCDecodeFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceASTCDecodeFeaturesEXT calloc() {
        return new VkPhysicalDeviceASTCDecodeFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceASTCDecodeFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceASTCDecodeFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceASTCDecodeFeaturesEXT create(long address) {
        return new VkPhysicalDeviceASTCDecodeFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceASTCDecodeFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceASTCDecodeFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceASTCDecodeFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceASTCDecodeFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceASTCDecodeFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceASTCDecodeFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndecodeModeSharedExponent(long struct) {
        return MemoryUtil.memGetInt(struct + DECODEMODESHAREDEXPONENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndecodeModeSharedExponent(long struct, int value) {
        MemoryUtil.memPutInt(struct + DECODEMODESHAREDEXPONENT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceASTCDecodeFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceASTCDecodeFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceASTCDecodeFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceASTCDecodeFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceASTCDecodeFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceASTCDecodeFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceASTCDecodeFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceASTCDecodeFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceASTCDecodeFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean decodeModeSharedExponent() {
            return VkPhysicalDeviceASTCDecodeFeaturesEXT.ndecodeModeSharedExponent(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceASTCDecodeFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTAstcDecodeMode.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceASTCDecodeFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer decodeModeSharedExponent(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceASTCDecodeFeaturesEXT.ndecodeModeSharedExponent(address(), value ? 1 : 0);
            return this;
        }
    }
}
