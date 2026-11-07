package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineDynamicStateCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineDynamicStateCreateInfo.class */
public class VkPipelineDynamicStateCreateInfo extends Struct<VkPipelineDynamicStateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int DYNAMICSTATECOUNT;
    public static final int PDYNAMICSTATES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DYNAMICSTATECOUNT = layout.offsetof(3);
        PDYNAMICSTATES = layout.offsetof(4);
    }

    protected VkPipelineDynamicStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineDynamicStateCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineDynamicStateCreateInfo(address, container);
    }

    public VkPipelineDynamicStateCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineDynamicStateCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int dynamicStateCount() {
        return ndynamicStateCount(address());
    }

    @NativeType("VkDynamicState const *")
    public IntBuffer pDynamicStates() {
        return npDynamicStates(address());
    }

    public VkPipelineDynamicStateCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineDynamicStateCreateInfo sType$Default() {
        return sType(27);
    }

    public VkPipelineDynamicStateCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineDynamicStateCreateInfo flags(@NativeType("VkPipelineDynamicStateCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineDynamicStateCreateInfo pDynamicStates(@NativeType("VkDynamicState const *") IntBuffer value) {
        npDynamicStates(address(), value);
        return this;
    }

    public VkPipelineDynamicStateCreateInfo set(int sType, long pNext, int flags, IntBuffer pDynamicStates) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pDynamicStates(pDynamicStates);
        return this;
    }

    public VkPipelineDynamicStateCreateInfo set(VkPipelineDynamicStateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineDynamicStateCreateInfo malloc() {
        return new VkPipelineDynamicStateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineDynamicStateCreateInfo calloc() {
        return new VkPipelineDynamicStateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineDynamicStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineDynamicStateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineDynamicStateCreateInfo create(long address) {
        return new VkPipelineDynamicStateCreateInfo(address, null);
    }

    public static VkPipelineDynamicStateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineDynamicStateCreateInfo(address, null);
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

    public static VkPipelineDynamicStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineDynamicStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineDynamicStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineDynamicStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndynamicStateCount(long struct) {
        return MemoryUtil.memGetInt(struct + DYNAMICSTATECOUNT);
    }

    public static IntBuffer npDynamicStates(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PDYNAMICSTATES), ndynamicStateCount(struct));
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

    public static void ndynamicStateCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DYNAMICSTATECOUNT, value);
    }

    public static void npDynamicStates(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PDYNAMICSTATES, MemoryUtil.memAddressSafe(value));
        ndynamicStateCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (ndynamicStateCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PDYNAMICSTATES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineDynamicStateCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineDynamicStateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineDynamicStateCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineDynamicStateCreateInfo ELEMENT_FACTORY = VkPipelineDynamicStateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineDynamicStateCreateInfo.SIZEOF);
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
        public VkPipelineDynamicStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineDynamicStateCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineDynamicStateCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineDynamicStateCreateFlags")
        public int flags() {
            return VkPipelineDynamicStateCreateInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int dynamicStateCount() {
            return VkPipelineDynamicStateCreateInfo.ndynamicStateCount(address());
        }

        @NativeType("VkDynamicState const *")
        public IntBuffer pDynamicStates() {
            return VkPipelineDynamicStateCreateInfo.npDynamicStates(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineDynamicStateCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(27);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineDynamicStateCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPipelineDynamicStateCreateFlags") int value) {
            VkPipelineDynamicStateCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer pDynamicStates(@NativeType("VkDynamicState const *") IntBuffer value) {
            VkPipelineDynamicStateCreateInfo.npDynamicStates(address(), value);
            return this;
        }
    }
}
