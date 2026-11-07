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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAccelerationStructureFeaturesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAccelerationStructureFeaturesKHR.class */
public class VkPhysicalDeviceAccelerationStructureFeaturesKHR extends Struct<VkPhysicalDeviceAccelerationStructureFeaturesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ACCELERATIONSTRUCTURE;
    public static final int ACCELERATIONSTRUCTURECAPTUREREPLAY;
    public static final int ACCELERATIONSTRUCTUREINDIRECTBUILD;
    public static final int ACCELERATIONSTRUCTUREHOSTCOMMANDS;
    public static final int DESCRIPTORBINDINGACCELERATIONSTRUCTUREUPDATEAFTERBIND;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ACCELERATIONSTRUCTURE = layout.offsetof(2);
        ACCELERATIONSTRUCTURECAPTUREREPLAY = layout.offsetof(3);
        ACCELERATIONSTRUCTUREINDIRECTBUILD = layout.offsetof(4);
        ACCELERATIONSTRUCTUREHOSTCOMMANDS = layout.offsetof(5);
        DESCRIPTORBINDINGACCELERATIONSTRUCTUREUPDATEAFTERBIND = layout.offsetof(6);
    }

    protected VkPhysicalDeviceAccelerationStructureFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR(ByteBuffer container) {
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
    public boolean accelerationStructure() {
        return naccelerationStructure(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean accelerationStructureCaptureReplay() {
        return naccelerationStructureCaptureReplay(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean accelerationStructureIndirectBuild() {
        return naccelerationStructureIndirectBuild(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean accelerationStructureHostCommands() {
        return naccelerationStructureHostCommands(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean descriptorBindingAccelerationStructureUpdateAfterBind() {
        return ndescriptorBindingAccelerationStructureUpdateAfterBind(address()) != 0;
    }

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR sType$Default() {
        return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR);
    }

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructure(@NativeType("VkBool32") boolean value) {
        naccelerationStructure(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureCaptureReplay(@NativeType("VkBool32") boolean value) {
        naccelerationStructureCaptureReplay(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureIndirectBuild(@NativeType("VkBool32") boolean value) {
        naccelerationStructureIndirectBuild(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR accelerationStructureHostCommands(@NativeType("VkBool32") boolean value) {
        naccelerationStructureHostCommands(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR descriptorBindingAccelerationStructureUpdateAfterBind(@NativeType("VkBool32") boolean value) {
        ndescriptorBindingAccelerationStructureUpdateAfterBind(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR set(int sType, long pNext, boolean accelerationStructure, boolean accelerationStructureCaptureReplay, boolean accelerationStructureIndirectBuild, boolean accelerationStructureHostCommands, boolean descriptorBindingAccelerationStructureUpdateAfterBind) {
        sType(sType);
        pNext(pNext);
        accelerationStructure(accelerationStructure);
        accelerationStructureCaptureReplay(accelerationStructureCaptureReplay);
        accelerationStructureIndirectBuild(accelerationStructureIndirectBuild);
        accelerationStructureHostCommands(accelerationStructureHostCommands);
        descriptorBindingAccelerationStructureUpdateAfterBind(descriptorBindingAccelerationStructureUpdateAfterBind);
        return this;
    }

    public VkPhysicalDeviceAccelerationStructureFeaturesKHR set(VkPhysicalDeviceAccelerationStructureFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR malloc() {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR calloc() {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR create(long address) {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int naccelerationStructure(long struct) {
        return MemoryUtil.memGetInt(struct + ACCELERATIONSTRUCTURE);
    }

    public static int naccelerationStructureCaptureReplay(long struct) {
        return MemoryUtil.memGetInt(struct + ACCELERATIONSTRUCTURECAPTUREREPLAY);
    }

    public static int naccelerationStructureIndirectBuild(long struct) {
        return MemoryUtil.memGetInt(struct + ACCELERATIONSTRUCTUREINDIRECTBUILD);
    }

    public static int naccelerationStructureHostCommands(long struct) {
        return MemoryUtil.memGetInt(struct + ACCELERATIONSTRUCTUREHOSTCOMMANDS);
    }

    public static int ndescriptorBindingAccelerationStructureUpdateAfterBind(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORBINDINGACCELERATIONSTRUCTUREUPDATEAFTERBIND);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void naccelerationStructure(long struct, int value) {
        MemoryUtil.memPutInt(struct + ACCELERATIONSTRUCTURE, value);
    }

    public static void naccelerationStructureCaptureReplay(long struct, int value) {
        MemoryUtil.memPutInt(struct + ACCELERATIONSTRUCTURECAPTUREREPLAY, value);
    }

    public static void naccelerationStructureIndirectBuild(long struct, int value) {
        MemoryUtil.memPutInt(struct + ACCELERATIONSTRUCTUREINDIRECTBUILD, value);
    }

    public static void naccelerationStructureHostCommands(long struct, int value) {
        MemoryUtil.memPutInt(struct + ACCELERATIONSTRUCTUREHOSTCOMMANDS, value);
    }

    public static void ndescriptorBindingAccelerationStructureUpdateAfterBind(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORBINDINGACCELERATIONSTRUCTUREUPDATEAFTERBIND, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAccelerationStructureFeaturesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAccelerationStructureFeaturesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceAccelerationStructureFeaturesKHR, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceAccelerationStructureFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceAccelerationStructureFeaturesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceAccelerationStructureFeaturesKHR.SIZEOF);
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
        public VkPhysicalDeviceAccelerationStructureFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceAccelerationStructureFeaturesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceAccelerationStructureFeaturesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean accelerationStructure() {
            return VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructure(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean accelerationStructureCaptureReplay() {
            return VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureCaptureReplay(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean accelerationStructureIndirectBuild() {
            return VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureIndirectBuild(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean accelerationStructureHostCommands() {
            return VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureHostCommands(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean descriptorBindingAccelerationStructureUpdateAfterBind() {
            return VkPhysicalDeviceAccelerationStructureFeaturesKHR.ndescriptorBindingAccelerationStructureUpdateAfterBind(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceAccelerationStructureFeaturesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRAccelerationStructure.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceAccelerationStructureFeaturesKHR.npNext(address(), value);
            return this;
        }

        public Buffer accelerationStructure(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructure(address(), value ? 1 : 0);
            return this;
        }

        public Buffer accelerationStructureCaptureReplay(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureCaptureReplay(address(), value ? 1 : 0);
            return this;
        }

        public Buffer accelerationStructureIndirectBuild(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureIndirectBuild(address(), value ? 1 : 0);
            return this;
        }

        public Buffer accelerationStructureHostCommands(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceAccelerationStructureFeaturesKHR.naccelerationStructureHostCommands(address(), value ? 1 : 0);
            return this;
        }

        public Buffer descriptorBindingAccelerationStructureUpdateAfterBind(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceAccelerationStructureFeaturesKHR.ndescriptorBindingAccelerationStructureUpdateAfterBind(address(), value ? 1 : 0);
            return this;
        }
    }
}
