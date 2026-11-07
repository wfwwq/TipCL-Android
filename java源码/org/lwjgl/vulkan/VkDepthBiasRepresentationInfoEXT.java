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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDepthBiasRepresentationInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDepthBiasRepresentationInfoEXT.class */
public class VkDepthBiasRepresentationInfoEXT extends Struct<VkDepthBiasRepresentationInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEPTHBIASREPRESENTATION;
    public static final int DEPTHBIASEXACT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPTHBIASREPRESENTATION = layout.offsetof(2);
        DEPTHBIASEXACT = layout.offsetof(3);
    }

    protected VkDepthBiasRepresentationInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDepthBiasRepresentationInfoEXT create(long address, ByteBuffer container) {
        return new VkDepthBiasRepresentationInfoEXT(address, container);
    }

    public VkDepthBiasRepresentationInfoEXT(ByteBuffer container) {
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

    @NativeType("VkDepthBiasRepresentationEXT")
    public int depthBiasRepresentation() {
        return ndepthBiasRepresentation(address());
    }

    @NativeType("VkBool32")
    public boolean depthBiasExact() {
        return ndepthBiasExact(address()) != 0;
    }

    public VkDepthBiasRepresentationInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDepthBiasRepresentationInfoEXT sType$Default() {
        return sType(EXTDepthBiasControl.VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT);
    }

    public VkDepthBiasRepresentationInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDepthBiasRepresentationInfoEXT depthBiasRepresentation(@NativeType("VkDepthBiasRepresentationEXT") int value) {
        ndepthBiasRepresentation(address(), value);
        return this;
    }

    public VkDepthBiasRepresentationInfoEXT depthBiasExact(@NativeType("VkBool32") boolean value) {
        ndepthBiasExact(address(), value ? 1 : 0);
        return this;
    }

    public VkDepthBiasRepresentationInfoEXT set(int sType, long pNext, int depthBiasRepresentation, boolean depthBiasExact) {
        sType(sType);
        pNext(pNext);
        depthBiasRepresentation(depthBiasRepresentation);
        depthBiasExact(depthBiasExact);
        return this;
    }

    public VkDepthBiasRepresentationInfoEXT set(VkDepthBiasRepresentationInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDepthBiasRepresentationInfoEXT malloc() {
        return new VkDepthBiasRepresentationInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDepthBiasRepresentationInfoEXT calloc() {
        return new VkDepthBiasRepresentationInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDepthBiasRepresentationInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDepthBiasRepresentationInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDepthBiasRepresentationInfoEXT create(long address) {
        return new VkDepthBiasRepresentationInfoEXT(address, null);
    }

    public static VkDepthBiasRepresentationInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDepthBiasRepresentationInfoEXT(address, null);
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

    public static VkDepthBiasRepresentationInfoEXT malloc(MemoryStack stack) {
        return new VkDepthBiasRepresentationInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDepthBiasRepresentationInfoEXT calloc(MemoryStack stack) {
        return new VkDepthBiasRepresentationInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndepthBiasRepresentation(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHBIASREPRESENTATION);
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

    public static void ndepthBiasRepresentation(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHBIASREPRESENTATION, value);
    }

    public static void ndepthBiasExact(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHBIASEXACT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDepthBiasRepresentationInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDepthBiasRepresentationInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDepthBiasRepresentationInfoEXT, Buffer> implements NativeResource {
        private static final VkDepthBiasRepresentationInfoEXT ELEMENT_FACTORY = VkDepthBiasRepresentationInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDepthBiasRepresentationInfoEXT.SIZEOF);
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
        public VkDepthBiasRepresentationInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDepthBiasRepresentationInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDepthBiasRepresentationInfoEXT.npNext(address());
        }

        @NativeType("VkDepthBiasRepresentationEXT")
        public int depthBiasRepresentation() {
            return VkDepthBiasRepresentationInfoEXT.ndepthBiasRepresentation(address());
        }

        @NativeType("VkBool32")
        public boolean depthBiasExact() {
            return VkDepthBiasRepresentationInfoEXT.ndepthBiasExact(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDepthBiasRepresentationInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDepthBiasControl.VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDepthBiasRepresentationInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer depthBiasRepresentation(@NativeType("VkDepthBiasRepresentationEXT") int value) {
            VkDepthBiasRepresentationInfoEXT.ndepthBiasRepresentation(address(), value);
            return this;
        }

        public Buffer depthBiasExact(@NativeType("VkBool32") boolean value) {
            VkDepthBiasRepresentationInfoEXT.ndepthBiasExact(address(), value ? 1 : 0);
            return this;
        }
    }
}
