package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import javax.annotation.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersFeedbackInfoEXT.class */
public class VkVideoEncodeH265SessionParametersFeedbackInfoEXT extends Struct<VkVideoEncodeH265SessionParametersFeedbackInfoEXT> implements NativeResource {
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

    protected VkVideoEncodeH265SessionParametersFeedbackInfoEXT(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoEncodeH265SessionParametersFeedbackInfoEXT create(long address, @Nullable ByteBuffer container) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(address, container);
    }

    public VkVideoEncodeH265SessionParametersFeedbackInfoEXT(ByteBuffer container) {
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

    public VkVideoEncodeH265SessionParametersFeedbackInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersFeedbackInfoEXT sType$Default() {
        return sType(1000039014);
    }

    public VkVideoEncodeH265SessionParametersFeedbackInfoEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoEncodeH265SessionParametersFeedbackInfoEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoEncodeH265SessionParametersFeedbackInfoEXT set(VkVideoEncodeH265SessionParametersFeedbackInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT malloc() {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT calloc() {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT create(long address) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(address, null);
    }

    @Nullable
    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(address, null);
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

    @Nullable
    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT malloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoEncodeH265SessionParametersFeedbackInfoEXT calloc(MemoryStack stack) {
        return new VkVideoEncodeH265SessionParametersFeedbackInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsType(long struct) {
        return UNSAFE.getInt((Object) null, struct + STYPE);
    }

    public static long npNext(long struct) {
        return MemoryUtil.memGetAddress(struct + PNEXT);
    }

    public static int nhasStdVPSOverrides(long struct) {
        return UNSAFE.getInt((Object) null, struct + HASSTDVPSOVERRIDES);
    }

    public static int nhasStdSPSOverrides(long struct) {
        return UNSAFE.getInt((Object) null, struct + HASSTDSPSOVERRIDES);
    }

    public static int nhasStdPPSOverrides(long struct) {
        return UNSAFE.getInt((Object) null, struct + HASSTDPPSOVERRIDES);
    }

    public static void nsType(long struct, int value) {
        UNSAFE.putInt((Object) null, struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoEncodeH265SessionParametersFeedbackInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoEncodeH265SessionParametersFeedbackInfoEXT, Buffer> implements NativeResource {
        private static final VkVideoEncodeH265SessionParametersFeedbackInfoEXT ELEMENT_FACTORY = VkVideoEncodeH265SessionParametersFeedbackInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoEncodeH265SessionParametersFeedbackInfoEXT.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public VkVideoEncodeH265SessionParametersFeedbackInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoEncodeH265SessionParametersFeedbackInfoEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoEncodeH265SessionParametersFeedbackInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean hasStdVPSOverrides() {
            return VkVideoEncodeH265SessionParametersFeedbackInfoEXT.nhasStdVPSOverrides(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean hasStdSPSOverrides() {
            return VkVideoEncodeH265SessionParametersFeedbackInfoEXT.nhasStdSPSOverrides(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean hasStdPPSOverrides() {
            return VkVideoEncodeH265SessionParametersFeedbackInfoEXT.nhasStdPPSOverrides(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoEncodeH265SessionParametersFeedbackInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000039014);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoEncodeH265SessionParametersFeedbackInfoEXT.npNext(address(), value);
            return this;
        }
    }
}
