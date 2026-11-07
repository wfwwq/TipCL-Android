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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVariablePointersFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVariablePointersFeatures.class */
public class VkPhysicalDeviceVariablePointersFeatures extends Struct<VkPhysicalDeviceVariablePointersFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int VARIABLEPOINTERSSTORAGEBUFFER;
    public static final int VARIABLEPOINTERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VARIABLEPOINTERSSTORAGEBUFFER = layout.offsetof(2);
        VARIABLEPOINTERS = layout.offsetof(3);
    }

    protected VkPhysicalDeviceVariablePointersFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVariablePointersFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVariablePointersFeatures(address, container);
    }

    public VkPhysicalDeviceVariablePointersFeatures(ByteBuffer container) {
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
    public boolean variablePointersStorageBuffer() {
        return nvariablePointersStorageBuffer(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean variablePointers() {
        return nvariablePointers(address()) != 0;
    }

    public VkPhysicalDeviceVariablePointersFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVariablePointersFeatures sType$Default() {
        return sType(1000120000);
    }

    public VkPhysicalDeviceVariablePointersFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVariablePointersFeatures variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) {
        nvariablePointersStorageBuffer(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVariablePointersFeatures variablePointers(@NativeType("VkBool32") boolean value) {
        nvariablePointers(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVariablePointersFeatures set(int sType, long pNext, boolean variablePointersStorageBuffer, boolean variablePointers) {
        sType(sType);
        pNext(pNext);
        variablePointersStorageBuffer(variablePointersStorageBuffer);
        variablePointers(variablePointers);
        return this;
    }

    public VkPhysicalDeviceVariablePointersFeatures set(VkPhysicalDeviceVariablePointersFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVariablePointersFeatures malloc() {
        return new VkPhysicalDeviceVariablePointersFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVariablePointersFeatures calloc() {
        return new VkPhysicalDeviceVariablePointersFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVariablePointersFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVariablePointersFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVariablePointersFeatures create(long address) {
        return new VkPhysicalDeviceVariablePointersFeatures(address, null);
    }

    public static VkPhysicalDeviceVariablePointersFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVariablePointersFeatures(address, null);
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

    public static VkPhysicalDeviceVariablePointersFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVariablePointersFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVariablePointersFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVariablePointersFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nvariablePointersStorageBuffer(long struct) {
        return MemoryUtil.memGetInt(struct + VARIABLEPOINTERSSTORAGEBUFFER);
    }

    public static int nvariablePointers(long struct) {
        return MemoryUtil.memGetInt(struct + VARIABLEPOINTERS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nvariablePointersStorageBuffer(long struct, int value) {
        MemoryUtil.memPutInt(struct + VARIABLEPOINTERSSTORAGEBUFFER, value);
    }

    public static void nvariablePointers(long struct, int value) {
        MemoryUtil.memPutInt(struct + VARIABLEPOINTERS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVariablePointersFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVariablePointersFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVariablePointersFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVariablePointersFeatures ELEMENT_FACTORY = VkPhysicalDeviceVariablePointersFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVariablePointersFeatures.SIZEOF);
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
        public VkPhysicalDeviceVariablePointersFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVariablePointersFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVariablePointersFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean variablePointersStorageBuffer() {
            return VkPhysicalDeviceVariablePointersFeatures.nvariablePointersStorageBuffer(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean variablePointers() {
            return VkPhysicalDeviceVariablePointersFeatures.nvariablePointers(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVariablePointersFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000120000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVariablePointersFeatures.npNext(address(), value);
            return this;
        }

        public Buffer variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVariablePointersFeatures.nvariablePointersStorageBuffer(address(), value ? 1 : 0);
            return this;
        }

        public Buffer variablePointers(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVariablePointersFeatures.nvariablePointers(address(), value ? 1 : 0);
            return this;
        }
    }
}
