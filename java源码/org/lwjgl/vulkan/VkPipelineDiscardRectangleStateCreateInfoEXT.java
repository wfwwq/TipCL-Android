package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkRect2D;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineDiscardRectangleStateCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineDiscardRectangleStateCreateInfoEXT.class */
public class VkPipelineDiscardRectangleStateCreateInfoEXT extends Struct<VkPipelineDiscardRectangleStateCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int DISCARDRECTANGLEMODE;
    public static final int DISCARDRECTANGLECOUNT;
    public static final int PDISCARDRECTANGLES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DISCARDRECTANGLEMODE = layout.offsetof(3);
        DISCARDRECTANGLECOUNT = layout.offsetof(4);
        PDISCARDRECTANGLES = layout.offsetof(5);
    }

    protected VkPipelineDiscardRectangleStateCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineDiscardRectangleStateCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(address, container);
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkDiscardRectangleModeEXT")
    public int discardRectangleMode() {
        return ndiscardRectangleMode(address());
    }

    @NativeType("uint32_t")
    public int discardRectangleCount() {
        return ndiscardRectangleCount(address());
    }

    @NativeType("VkRect2D const *")
    public VkRect2D.Buffer pDiscardRectangles() {
        return npDiscardRectangles(address());
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT sType$Default() {
        return sType(1000099001);
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT flags(@NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleMode(@NativeType("VkDiscardRectangleModeEXT") int value) {
        ndiscardRectangleMode(address(), value);
        return this;
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT discardRectangleCount(@NativeType("uint32_t") int value) {
        ndiscardRectangleCount(address(), value);
        return this;
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT pDiscardRectangles(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
        npDiscardRectangles(address(), value);
        return this;
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT set(int sType, long pNext, int flags, int discardRectangleMode, int discardRectangleCount, VkRect2D.Buffer pDiscardRectangles) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        discardRectangleMode(discardRectangleMode);
        discardRectangleCount(discardRectangleCount);
        pDiscardRectangles(pDiscardRectangles);
        return this;
    }

    public VkPipelineDiscardRectangleStateCreateInfoEXT set(VkPipelineDiscardRectangleStateCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT malloc() {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT calloc() {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT create(long address) {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(address, null);
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(address, null);
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

    public static VkPipelineDiscardRectangleStateCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineDiscardRectangleStateCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineDiscardRectangleStateCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static int ndiscardRectangleMode(long struct) {
        return MemoryUtil.memGetInt(struct + DISCARDRECTANGLEMODE);
    }

    public static int ndiscardRectangleCount(long struct) {
        return MemoryUtil.memGetInt(struct + DISCARDRECTANGLECOUNT);
    }

    public static VkRect2D.Buffer npDiscardRectangles(long struct) {
        return VkRect2D.createSafe(MemoryUtil.memGetAddress(struct + PDISCARDRECTANGLES), ndiscardRectangleCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    public static void ndiscardRectangleMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + DISCARDRECTANGLEMODE, value);
    }

    public static void ndiscardRectangleCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DISCARDRECTANGLECOUNT, value);
    }

    public static void npDiscardRectangles(long struct, VkRect2D.Buffer value) {
        MemoryUtil.memPutAddress(struct + PDISCARDRECTANGLES, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            ndiscardRectangleCount(struct, value.remaining());
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineDiscardRectangleStateCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineDiscardRectangleStateCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkPipelineDiscardRectangleStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineDiscardRectangleStateCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineDiscardRectangleStateCreateInfoEXT.SIZEOF);
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
        public VkPipelineDiscardRectangleStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineDiscardRectangleStateCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineDiscardRectangleStateCreateInfoEXT.npNext(address());
        }

        @NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT")
        public int flags() {
            return VkPipelineDiscardRectangleStateCreateInfoEXT.nflags(address());
        }

        @NativeType("VkDiscardRectangleModeEXT")
        public int discardRectangleMode() {
            return VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleMode(address());
        }

        @NativeType("uint32_t")
        public int discardRectangleCount() {
            return VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleCount(address());
        }

        @NativeType("VkRect2D const *")
        public VkRect2D.Buffer pDiscardRectangles() {
            return VkPipelineDiscardRectangleStateCreateInfoEXT.npDiscardRectangles(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineDiscardRectangleStateCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000099001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineDiscardRectangleStateCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPipelineDiscardRectangleStateCreateFlagsEXT") int value) {
            VkPipelineDiscardRectangleStateCreateInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer discardRectangleMode(@NativeType("VkDiscardRectangleModeEXT") int value) {
            VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleMode(address(), value);
            return this;
        }

        public Buffer discardRectangleCount(@NativeType("uint32_t") int value) {
            VkPipelineDiscardRectangleStateCreateInfoEXT.ndiscardRectangleCount(address(), value);
            return this;
        }

        public Buffer pDiscardRectangles(@NativeType("VkRect2D const *") VkRect2D.Buffer value) {
            VkPipelineDiscardRectangleStateCreateInfoEXT.npDiscardRectangles(address(), value);
            return this;
        }
    }
}
