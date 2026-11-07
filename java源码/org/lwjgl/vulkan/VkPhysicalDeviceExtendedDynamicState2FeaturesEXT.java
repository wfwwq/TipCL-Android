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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.class */
public class VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extends Struct<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int EXTENDEDDYNAMICSTATE2;
    public static final int EXTENDEDDYNAMICSTATE2LOGICOP;
    public static final int EXTENDEDDYNAMICSTATE2PATCHCONTROLPOINTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXTENDEDDYNAMICSTATE2 = layout.offsetof(2);
        EXTENDEDDYNAMICSTATE2LOGICOP = layout.offsetof(3);
        EXTENDEDDYNAMICSTATE2PATCHCONTROLPOINTS = layout.offsetof(4);
    }

    protected VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(address, container);
    }

    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(ByteBuffer container) {
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
    public boolean extendedDynamicState2() {
        return nextendedDynamicState2(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState2LogicOp() {
        return nextendedDynamicState2LogicOp(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean extendedDynamicState2PatchControlPoints() {
        return nextendedDynamicState2PatchControlPoints(address()) != 0;
    }

    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT sType$Default() {
        return sType(1000377000);
    }

    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState2(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2LogicOp(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState2LogicOp(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT extendedDynamicState2PatchControlPoints(@NativeType("VkBool32") boolean value) {
        nextendedDynamicState2PatchControlPoints(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT set(int sType, long pNext, boolean extendedDynamicState2, boolean extendedDynamicState2LogicOp, boolean extendedDynamicState2PatchControlPoints) {
        sType(sType);
        pNext(pNext);
        extendedDynamicState2(extendedDynamicState2);
        extendedDynamicState2LogicOp(extendedDynamicState2LogicOp);
        extendedDynamicState2PatchControlPoints(extendedDynamicState2PatchControlPoints);
        return this;
    }

    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT set(VkPhysicalDeviceExtendedDynamicState2FeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT malloc() {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT calloc() {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT create(long address) {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(address, null);
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

    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nextendedDynamicState2(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE2);
    }

    public static int nextendedDynamicState2LogicOp(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE2LOGICOP);
    }

    public static int nextendedDynamicState2PatchControlPoints(long struct) {
        return MemoryUtil.memGetInt(struct + EXTENDEDDYNAMICSTATE2PATCHCONTROLPOINTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nextendedDynamicState2(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE2, value);
    }

    public static void nextendedDynamicState2LogicOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE2LOGICOP, value);
    }

    public static void nextendedDynamicState2PatchControlPoints(long struct, int value) {
        MemoryUtil.memPutInt(struct + EXTENDEDDYNAMICSTATE2PATCHCONTROLPOINTS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState2FeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceExtendedDynamicState2FeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceExtendedDynamicState2FeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceExtendedDynamicState2FeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState2() {
            return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState2LogicOp() {
            return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2LogicOp(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean extendedDynamicState2PatchControlPoints() {
            return VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2PatchControlPoints(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000377000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer extendedDynamicState2(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState2LogicOp(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2LogicOp(address(), value ? 1 : 0);
            return this;
        }

        public Buffer extendedDynamicState2PatchControlPoints(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.nextendedDynamicState2PatchControlPoints(address(), value ? 1 : 0);
            return this;
        }
    }
}
