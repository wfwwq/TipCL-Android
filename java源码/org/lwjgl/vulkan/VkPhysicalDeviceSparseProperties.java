package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSparseProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSparseProperties.class */
public class VkPhysicalDeviceSparseProperties extends Struct<VkPhysicalDeviceSparseProperties> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int RESIDENCYSTANDARD2DBLOCKSHAPE;
    public static final int RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE;
    public static final int RESIDENCYSTANDARD3DBLOCKSHAPE;
    public static final int RESIDENCYALIGNEDMIPSIZE;
    public static final int RESIDENCYNONRESIDENTSTRICT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        RESIDENCYSTANDARD2DBLOCKSHAPE = layout.offsetof(0);
        RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE = layout.offsetof(1);
        RESIDENCYSTANDARD3DBLOCKSHAPE = layout.offsetof(2);
        RESIDENCYALIGNEDMIPSIZE = layout.offsetof(3);
        RESIDENCYNONRESIDENTSTRICT = layout.offsetof(4);
    }

    protected VkPhysicalDeviceSparseProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceSparseProperties create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceSparseProperties(address, container);
    }

    public VkPhysicalDeviceSparseProperties(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkBool32")
    public boolean residencyStandard2DBlockShape() {
        return nresidencyStandard2DBlockShape(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean residencyStandard2DMultisampleBlockShape() {
        return nresidencyStandard2DMultisampleBlockShape(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean residencyStandard3DBlockShape() {
        return nresidencyStandard3DBlockShape(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean residencyAlignedMipSize() {
        return nresidencyAlignedMipSize(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean residencyNonResidentStrict() {
        return nresidencyNonResidentStrict(address()) != 0;
    }

    public static VkPhysicalDeviceSparseProperties create(long address) {
        return new VkPhysicalDeviceSparseProperties(address, null);
    }

    public static VkPhysicalDeviceSparseProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceSparseProperties(address, null);
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

    public static int nresidencyStandard2DBlockShape(long struct) {
        return MemoryUtil.memGetInt(struct + RESIDENCYSTANDARD2DBLOCKSHAPE);
    }

    public static int nresidencyStandard2DMultisampleBlockShape(long struct) {
        return MemoryUtil.memGetInt(struct + RESIDENCYSTANDARD2DMULTISAMPLEBLOCKSHAPE);
    }

    public static int nresidencyStandard3DBlockShape(long struct) {
        return MemoryUtil.memGetInt(struct + RESIDENCYSTANDARD3DBLOCKSHAPE);
    }

    public static int nresidencyAlignedMipSize(long struct) {
        return MemoryUtil.memGetInt(struct + RESIDENCYALIGNEDMIPSIZE);
    }

    public static int nresidencyNonResidentStrict(long struct) {
        return MemoryUtil.memGetInt(struct + RESIDENCYNONRESIDENTSTRICT);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSparseProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceSparseProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceSparseProperties, Buffer> {
        private static final VkPhysicalDeviceSparseProperties ELEMENT_FACTORY = VkPhysicalDeviceSparseProperties.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceSparseProperties.SIZEOF);
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
        public VkPhysicalDeviceSparseProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkBool32")
        public boolean residencyStandard2DBlockShape() {
            return VkPhysicalDeviceSparseProperties.nresidencyStandard2DBlockShape(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean residencyStandard2DMultisampleBlockShape() {
            return VkPhysicalDeviceSparseProperties.nresidencyStandard2DMultisampleBlockShape(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean residencyStandard3DBlockShape() {
            return VkPhysicalDeviceSparseProperties.nresidencyStandard3DBlockShape(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean residencyAlignedMipSize() {
            return VkPhysicalDeviceSparseProperties.nresidencyAlignedMipSize(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean residencyNonResidentStrict() {
            return VkPhysicalDeviceSparseProperties.nresidencyNonResidentStrict(address()) != 0;
        }
    }
}
