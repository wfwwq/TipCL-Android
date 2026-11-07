package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLineRasterizationFeatures.class */
public class VkPhysicalDeviceLineRasterizationFeatures extends Struct<VkPhysicalDeviceLineRasterizationFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int RECTANGULARLINES;
    public static final int BRESENHAMLINES;
    public static final int SMOOTHLINES;
    public static final int STIPPLEDRECTANGULARLINES;
    public static final int STIPPLEDBRESENHAMLINES;
    public static final int STIPPLEDSMOOTHLINES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        RECTANGULARLINES = layout.offsetof(2);
        BRESENHAMLINES = layout.offsetof(3);
        SMOOTHLINES = layout.offsetof(4);
        STIPPLEDRECTANGULARLINES = layout.offsetof(5);
        STIPPLEDBRESENHAMLINES = layout.offsetof(6);
        STIPPLEDSMOOTHLINES = layout.offsetof(7);
    }

    protected VkPhysicalDeviceLineRasterizationFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceLineRasterizationFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceLineRasterizationFeatures(address, container);
    }

    public VkPhysicalDeviceLineRasterizationFeatures(ByteBuffer container) {
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
    public boolean rectangularLines() {
        return nrectangularLines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean bresenhamLines() {
        return nbresenhamLines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean smoothLines() {
        return nsmoothLines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean stippledRectangularLines() {
        return nstippledRectangularLines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean stippledBresenhamLines() {
        return nstippledBresenhamLines(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean stippledSmoothLines() {
        return nstippledSmoothLines(address()) != 0;
    }

    public VkPhysicalDeviceLineRasterizationFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceLineRasterizationFeatures sType$Default() {
        return sType(1000259000);
    }

    public VkPhysicalDeviceLineRasterizationFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceLineRasterizationFeatures rectangularLines(@NativeType("VkBool32") boolean value) {
        nrectangularLines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceLineRasterizationFeatures bresenhamLines(@NativeType("VkBool32") boolean value) {
        nbresenhamLines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceLineRasterizationFeatures smoothLines(@NativeType("VkBool32") boolean value) {
        nsmoothLines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceLineRasterizationFeatures stippledRectangularLines(@NativeType("VkBool32") boolean value) {
        nstippledRectangularLines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceLineRasterizationFeatures stippledBresenhamLines(@NativeType("VkBool32") boolean value) {
        nstippledBresenhamLines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceLineRasterizationFeatures stippledSmoothLines(@NativeType("VkBool32") boolean value) {
        nstippledSmoothLines(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceLineRasterizationFeatures set(int sType, long pNext, boolean rectangularLines, boolean bresenhamLines, boolean smoothLines, boolean stippledRectangularLines, boolean stippledBresenhamLines, boolean stippledSmoothLines) {
        sType(sType);
        pNext(pNext);
        rectangularLines(rectangularLines);
        bresenhamLines(bresenhamLines);
        smoothLines(smoothLines);
        stippledRectangularLines(stippledRectangularLines);
        stippledBresenhamLines(stippledBresenhamLines);
        stippledSmoothLines(stippledSmoothLines);
        return this;
    }

    public VkPhysicalDeviceLineRasterizationFeatures set(VkPhysicalDeviceLineRasterizationFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceLineRasterizationFeatures malloc() {
        return new VkPhysicalDeviceLineRasterizationFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceLineRasterizationFeatures calloc() {
        return new VkPhysicalDeviceLineRasterizationFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceLineRasterizationFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLineRasterizationFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceLineRasterizationFeatures create(long address) {
        return new VkPhysicalDeviceLineRasterizationFeatures(address, null);
    }

    public static VkPhysicalDeviceLineRasterizationFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceLineRasterizationFeatures(address, null);
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

    public static VkPhysicalDeviceLineRasterizationFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceLineRasterizationFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrectangularLines(long struct) {
        return MemoryUtil.memGetInt(struct + RECTANGULARLINES);
    }

    public static int nbresenhamLines(long struct) {
        return MemoryUtil.memGetInt(struct + BRESENHAMLINES);
    }

    public static int nsmoothLines(long struct) {
        return MemoryUtil.memGetInt(struct + SMOOTHLINES);
    }

    public static int nstippledRectangularLines(long struct) {
        return MemoryUtil.memGetInt(struct + STIPPLEDRECTANGULARLINES);
    }

    public static int nstippledBresenhamLines(long struct) {
        return MemoryUtil.memGetInt(struct + STIPPLEDBRESENHAMLINES);
    }

    public static int nstippledSmoothLines(long struct) {
        return MemoryUtil.memGetInt(struct + STIPPLEDSMOOTHLINES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrectangularLines(long struct, int value) {
        MemoryUtil.memPutInt(struct + RECTANGULARLINES, value);
    }

    public static void nbresenhamLines(long struct, int value) {
        MemoryUtil.memPutInt(struct + BRESENHAMLINES, value);
    }

    public static void nsmoothLines(long struct, int value) {
        MemoryUtil.memPutInt(struct + SMOOTHLINES, value);
    }

    public static void nstippledRectangularLines(long struct, int value) {
        MemoryUtil.memPutInt(struct + STIPPLEDRECTANGULARLINES, value);
    }

    public static void nstippledBresenhamLines(long struct, int value) {
        MemoryUtil.memPutInt(struct + STIPPLEDBRESENHAMLINES, value);
    }

    public static void nstippledSmoothLines(long struct, int value) {
        MemoryUtil.memPutInt(struct + STIPPLEDSMOOTHLINES, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLineRasterizationFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLineRasterizationFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceLineRasterizationFeatures ELEMENT_FACTORY = VkPhysicalDeviceLineRasterizationFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceLineRasterizationFeatures.SIZEOF);
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
        public VkPhysicalDeviceLineRasterizationFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceLineRasterizationFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceLineRasterizationFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean rectangularLines() {
            return VkPhysicalDeviceLineRasterizationFeatures.nrectangularLines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean bresenhamLines() {
            return VkPhysicalDeviceLineRasterizationFeatures.nbresenhamLines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean smoothLines() {
            return VkPhysicalDeviceLineRasterizationFeatures.nsmoothLines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean stippledRectangularLines() {
            return VkPhysicalDeviceLineRasterizationFeatures.nstippledRectangularLines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean stippledBresenhamLines() {
            return VkPhysicalDeviceLineRasterizationFeatures.nstippledBresenhamLines(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean stippledSmoothLines() {
            return VkPhysicalDeviceLineRasterizationFeatures.nstippledSmoothLines(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceLineRasterizationFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000259000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceLineRasterizationFeatures.npNext(address(), value);
            return this;
        }

        public Buffer rectangularLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeatures.nrectangularLines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer bresenhamLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeatures.nbresenhamLines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer smoothLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeatures.nsmoothLines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer stippledRectangularLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeatures.nstippledRectangularLines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer stippledBresenhamLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeatures.nstippledBresenhamLines(address(), value ? 1 : 0);
            return this;
        }

        public Buffer stippledSmoothLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeatures.nstippledSmoothLines(address(), value ? 1 : 0);
            return this;
        }
    }
}
