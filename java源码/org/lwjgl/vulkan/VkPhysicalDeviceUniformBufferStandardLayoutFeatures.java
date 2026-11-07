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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceUniformBufferStandardLayoutFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceUniformBufferStandardLayoutFeatures.class */
public class VkPhysicalDeviceUniformBufferStandardLayoutFeatures extends Struct<VkPhysicalDeviceUniformBufferStandardLayoutFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int UNIFORMBUFFERSTANDARDLAYOUT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        UNIFORMBUFFERSTANDARDLAYOUT = layout.offsetof(2);
    }

    protected VkPhysicalDeviceUniformBufferStandardLayoutFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeatures(address, container);
    }

    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures(ByteBuffer container) {
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
    public boolean uniformBufferStandardLayout() {
        return nuniformBufferStandardLayout(address()) != 0;
    }

    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures sType$Default() {
        return sType(1000253000);
    }

    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) {
        nuniformBufferStandardLayout(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures set(int sType, long pNext, boolean uniformBufferStandardLayout) {
        sType(sType);
        pNext(pNext);
        uniformBufferStandardLayout(uniformBufferStandardLayout);
        return this;
    }

    public VkPhysicalDeviceUniformBufferStandardLayoutFeatures set(VkPhysicalDeviceUniformBufferStandardLayoutFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures malloc() {
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures calloc() {
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures create(long address) {
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeatures(address, null);
    }

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeatures(address, null);
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

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceUniformBufferStandardLayoutFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceUniformBufferStandardLayoutFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nuniformBufferStandardLayout(long struct) {
        return MemoryUtil.memGetInt(struct + UNIFORMBUFFERSTANDARDLAYOUT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nuniformBufferStandardLayout(long struct, int value) {
        MemoryUtil.memPutInt(struct + UNIFORMBUFFERSTANDARDLAYOUT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceUniformBufferStandardLayoutFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceUniformBufferStandardLayoutFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceUniformBufferStandardLayoutFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceUniformBufferStandardLayoutFeatures ELEMENT_FACTORY = VkPhysicalDeviceUniformBufferStandardLayoutFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceUniformBufferStandardLayoutFeatures.SIZEOF);
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
        public VkPhysicalDeviceUniformBufferStandardLayoutFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceUniformBufferStandardLayoutFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceUniformBufferStandardLayoutFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean uniformBufferStandardLayout() {
            return VkPhysicalDeviceUniformBufferStandardLayoutFeatures.nuniformBufferStandardLayout(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceUniformBufferStandardLayoutFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000253000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceUniformBufferStandardLayoutFeatures.npNext(address(), value);
            return this;
        }

        public Buffer uniformBufferStandardLayout(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceUniformBufferStandardLayoutFeatures.nuniformBufferStandardLayout(address(), value ? 1 : 0);
            return this;
        }
    }
}
