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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpacityMicromapFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpacityMicromapFeaturesEXT.class */
public class VkPhysicalDeviceOpacityMicromapFeaturesEXT extends Struct<VkPhysicalDeviceOpacityMicromapFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MICROMAP;
    public static final int MICROMAPCAPTUREREPLAY;
    public static final int MICROMAPHOSTCOMMANDS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MICROMAP = layout.offsetof(2);
        MICROMAPCAPTUREREPLAY = layout.offsetof(3);
        MICROMAPHOSTCOMMANDS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceOpacityMicromapFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceOpacityMicromapFeaturesEXT(ByteBuffer container) {
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
    public boolean micromap() {
        return nmicromap(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean micromapCaptureReplay() {
        return nmicromapCaptureReplay(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean micromapHostCommands() {
        return nmicromapHostCommands(address()) != 0;
    }

    public VkPhysicalDeviceOpacityMicromapFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceOpacityMicromapFeaturesEXT sType$Default() {
        return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT);
    }

    public VkPhysicalDeviceOpacityMicromapFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromap(@NativeType("VkBool32") boolean value) {
        nmicromap(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapCaptureReplay(@NativeType("VkBool32") boolean value) {
        nmicromapCaptureReplay(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceOpacityMicromapFeaturesEXT micromapHostCommands(@NativeType("VkBool32") boolean value) {
        nmicromapHostCommands(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceOpacityMicromapFeaturesEXT set(int sType, long pNext, boolean micromap, boolean micromapCaptureReplay, boolean micromapHostCommands) {
        sType(sType);
        pNext(pNext);
        micromap(micromap);
        micromapCaptureReplay(micromapCaptureReplay);
        micromapHostCommands(micromapHostCommands);
        return this;
    }

    public VkPhysicalDeviceOpacityMicromapFeaturesEXT set(VkPhysicalDeviceOpacityMicromapFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT malloc() {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT calloc() {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT create(long address) {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmicromap(long struct) {
        return MemoryUtil.memGetInt(struct + MICROMAP);
    }

    public static int nmicromapCaptureReplay(long struct) {
        return MemoryUtil.memGetInt(struct + MICROMAPCAPTUREREPLAY);
    }

    public static int nmicromapHostCommands(long struct) {
        return MemoryUtil.memGetInt(struct + MICROMAPHOSTCOMMANDS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmicromap(long struct, int value) {
        MemoryUtil.memPutInt(struct + MICROMAP, value);
    }

    public static void nmicromapCaptureReplay(long struct, int value) {
        MemoryUtil.memPutInt(struct + MICROMAPCAPTUREREPLAY, value);
    }

    public static void nmicromapHostCommands(long struct, int value) {
        MemoryUtil.memPutInt(struct + MICROMAPHOSTCOMMANDS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpacityMicromapFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceOpacityMicromapFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceOpacityMicromapFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceOpacityMicromapFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceOpacityMicromapFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceOpacityMicromapFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceOpacityMicromapFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceOpacityMicromapFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceOpacityMicromapFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean micromap() {
            return VkPhysicalDeviceOpacityMicromapFeaturesEXT.nmicromap(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean micromapCaptureReplay() {
            return VkPhysicalDeviceOpacityMicromapFeaturesEXT.nmicromapCaptureReplay(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean micromapHostCommands() {
            return VkPhysicalDeviceOpacityMicromapFeaturesEXT.nmicromapHostCommands(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceOpacityMicromapFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTOpacityMicromap.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceOpacityMicromapFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer micromap(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceOpacityMicromapFeaturesEXT.nmicromap(address(), value ? 1 : 0);
            return this;
        }

        public Buffer micromapCaptureReplay(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceOpacityMicromapFeaturesEXT.nmicromapCaptureReplay(address(), value ? 1 : 0);
            return this;
        }

        public Buffer micromapHostCommands(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceOpacityMicromapFeaturesEXT.nmicromapHostCommands(address(), value ? 1 : 0);
            return this;
        }
    }
}
