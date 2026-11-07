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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.class */
public class VkPhysicalDeviceExtendedDynamicStateFeaturesEXT extends Struct<VkPhysicalDeviceExtendedDynamicStateFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int EXTENDEDDYNAMICSTATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTENDEDDYNAMICSTATE = layout.offsetof(2);
    }

    protected VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(ByteBuffer container) {
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
    public boolean extendedDynamicState() {
        return nextendedDynamicState(address()) != 0;
    }

    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT sType$Default() {
        return sType(1000267000);
    }

    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT extendedDynamicState(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT set(int sType, long pNext, boolean extendedDynamicState) {
        sType(sType);
        pNext(pNext);
        extendedDynamicState(extendedDynamicState);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT set(VkPhysicalDeviceExtendedDynamicStateFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT malloc() {
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT calloc() {
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT create(long address) {
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nextendedDynamicState(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nextendedDynamicState(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicStateFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicStateFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedDynamicStateFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceExtendedDynamicStateFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceExtendedDynamicStateFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState() {
            return VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.nextendedDynamicState(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000267000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer extendedDynamicState(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.nextendedDynamicState(address(), value ? 1 : 0);
            return this;
        }
    }
}
