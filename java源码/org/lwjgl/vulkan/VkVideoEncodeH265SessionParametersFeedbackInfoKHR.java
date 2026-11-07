package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersFeedbackInfoKHR.class */
public class VkVideoEncodeH265SessionParametersFeedbackInfoKHR extends Struct<VkVideoEncodeH265SessionParametersFeedbackInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int HASSTDVPSOVERRIDES;
    public static final int HASSTDSPSOVERRIDES;
    public static final int HASSTDPPSOVERRIDES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        HASSTDVPSOVERRIDES = layout.offsetof(2);
        HASSTDSPSOVERRIDES = layout.offsetof(3);
        HASSTDPPSOVERRIDES = layout.offsetof(4);
    }

    protected VkVideoEncodeH265SessionParametersFeedbackInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR create(long address, ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(address, container);
    }

    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR(ByteBuffer container) {
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
    public boolean hasStdVPSOverrides() {
        return nhasStdVPSOverrides(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean hasStdSPSOverrides() {
        return nhasStdSPSOverrides(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean hasStdPPSOverrides() {
        return nhasStdPPSOverrides(address()) != 0;
    }

    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR sType$Default() {
        return sType(1000039014);
    }

    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeH265SessionParametersFeedbackInfoKHR set(VkVideoEncodeH265SessionParametersFeedbackInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR malloc() {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR calloc() {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR create(long address) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(address, null);
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(address, null);
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

    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoKHR calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nhasStdVPSOverrides(long struct) {
        return MemoryUtil.memGetInt(struct + HASSTDVPSOVERRIDES);
    }

    public static int nhasStdSPSOverrides(long struct) {
        return MemoryUtil.memGetInt(struct + HASSTDSPSOVERRIDES);
    }

    public static int nhasStdPPSOverrides(long struct) {
        return MemoryUtil.memGetInt(struct + HASSTDPPSOVERRIDES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersFeedbackInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersFeedbackInfoKHR, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265SessionParametersFeedbackInfoKHR ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersFeedbackInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265SessionParametersFeedbackInfoKHR.SIZEOF);
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
        public VkVideoEncodeH265SessionParametersFeedbackInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean hasStdVPSOverrides() {
            return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.nhasStdVPSOverrides(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean hasStdSPSOverrides() {
            return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.nhasStdSPSOverrides(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean hasStdPPSOverrides() {
            return VkVideoEncodeH265SessionParametersFeedbackInfoKHR.nhasStdPPSOverrides(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265SessionParametersFeedbackInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039014);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeH265SessionParametersFeedbackInfoKHR.npNext(address(), value);
            return this;
        }
    }
}
