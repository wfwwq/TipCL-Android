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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthBiasControlFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthBiasControlFeaturesEXT.class */
public class VkPhysicalDeviceDepthBiasControlFeaturesEXT extends Struct<VkPhysicalDeviceDepthBiasControlFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEPTHBIASCONTROL;
    public static final int LEASTREPRESENTABLEVALUEFORCEUNORMREPRESENTATION;
    public static final int FLOATREPRESENTATION;
    public static final int DEPTHBIASEXACT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPTHBIASCONTROL = layout.offsetof(2);
        LEASTREPRESENTABLEVALUEFORCEUNORMREPRESENTATION = layout.offsetof(3);
        FLOATREPRESENTATION = layout.offsetof(4);
        DEPTHBIASEXACT = layout.offsetof(5);
    }

    protected VkPhysicalDeviceDepthBiasControlFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceDepthBiasControlFeaturesEXT(ByteBuffer container) {
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
    public boolean depthBiasControl() {
        return ndepthBiasControl(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean leastRepresentableValueForceUnormRepresentation() {
        return nleastRepresentableValueForceUnormRepresentation(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean floatRepresentation() {
        return nfloatRepresentation(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean depthBiasExact() {
        return ndepthBiasExact(address()) != 0;
    }

    public VkPhysicalDeviceDepthBiasControlFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDepthBiasControlFeaturesEXT sType$Default() {
        return sType(EXTDepthBiasControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT);
    }

    public VkPhysicalDeviceDepthBiasControlFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasControl(@NativeType("VkBool32") boolean value) {
        ndepthBiasControl(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDepthBiasControlFeaturesEXT leastRepresentableValueForceUnormRepresentation(@NativeType("VkBool32") boolean value) {
        nleastRepresentableValueForceUnormRepresentation(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDepthBiasControlFeaturesEXT floatRepresentation(@NativeType("VkBool32") boolean value) {
        nfloatRepresentation(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDepthBiasControlFeaturesEXT depthBiasExact(@NativeType("VkBool32") boolean value) {
        ndepthBiasExact(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDepthBiasControlFeaturesEXT set(int sType, long pNext, boolean depthBiasControl, boolean leastRepresentableValueForceUnormRepresentation, boolean floatRepresentation, boolean depthBiasExact) {
        sType(sType);
        pNext(pNext);
        depthBiasControl(depthBiasControl);
        leastRepresentableValueForceUnormRepresentation(leastRepresentableValueForceUnormRepresentation);
        floatRepresentation(floatRepresentation);
        depthBiasExact(depthBiasExact);
        return this;
    }

    public VkPhysicalDeviceDepthBiasControlFeaturesEXT set(VkPhysicalDeviceDepthBiasControlFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT malloc() {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT calloc() {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT create(long address) {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndepthBiasControl(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHBIASCONTROL);
    }

    public static int nleastRepresentableValueForceUnormRepresentation(long struct) {
        return MemoryUtil.memGetInt(struct + LEASTREPRESENTABLEVALUEFORCEUNORMREPRESENTATION);
    }

    public static int nfloatRepresentation(long struct) {
        return MemoryUtil.memGetInt(struct + FLOATREPRESENTATION);
    }

    public static int ndepthBiasExact(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHBIASEXACT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndepthBiasControl(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHBIASCONTROL, value);
    }

    public static void nleastRepresentableValueForceUnormRepresentation(long struct, int value) {
        MemoryUtil.memPutInt(struct + LEASTREPRESENTABLEVALUEFORCEUNORMREPRESENTATION, value);
    }

    public static void nfloatRepresentation(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLOATREPRESENTATION, value);
    }

    public static void ndepthBiasExact(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHBIASEXACT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthBiasControlFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDepthBiasControlFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDepthBiasControlFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDepthBiasControlFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceDepthBiasControlFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDepthBiasControlFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceDepthBiasControlFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDepthBiasControlFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDepthBiasControlFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean depthBiasControl() {
            return VkPhysicalDeviceDepthBiasControlFeaturesEXT.ndepthBiasControl(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean leastRepresentableValueForceUnormRepresentation() {
            return VkPhysicalDeviceDepthBiasControlFeaturesEXT.nleastRepresentableValueForceUnormRepresentation(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean floatRepresentation() {
            return VkPhysicalDeviceDepthBiasControlFeaturesEXT.nfloatRepresentation(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean depthBiasExact() {
            return VkPhysicalDeviceDepthBiasControlFeaturesEXT.ndepthBiasExact(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDepthBiasControlFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDepthBiasControl.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDepthBiasControlFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer depthBiasControl(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDepthBiasControlFeaturesEXT.ndepthBiasControl(address(), value ? 1 : 0);
            return this;
        }

        public Buffer leastRepresentableValueForceUnormRepresentation(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDepthBiasControlFeaturesEXT.nleastRepresentableValueForceUnormRepresentation(address(), value ? 1 : 0);
            return this;
        }

        public Buffer floatRepresentation(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDepthBiasControlFeaturesEXT.nfloatRepresentation(address(), value ? 1 : 0);
            return this;
        }

        public Buffer depthBiasExact(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDepthBiasControlFeaturesEXT.ndepthBiasExact(address(), value ? 1 : 0);
            return this;
        }
    }
}
