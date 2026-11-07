package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkBufferMemoryBarrier2;
import org.lwjgl.vulkan.VkImageMemoryBarrier2;
import org.lwjgl.vulkan.VkMemoryBarrier2;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDependencyInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDependencyInfo.class */
public class VkDependencyInfo extends Struct<VkDependencyInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DEPENDENCYFLAGS;
    public static final int MEMORYBARRIERCOUNT;
    public static final int PMEMORYBARRIERS;
    public static final int BUFFERMEMORYBARRIERCOUNT;
    public static final int PBUFFERMEMORYBARRIERS;
    public static final int IMAGEMEMORYBARRIERCOUNT;
    public static final int PIMAGEMEMORYBARRIERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DEPENDENCYFLAGS = layout.offsetof(2);
        MEMORYBARRIERCOUNT = layout.offsetof(3);
        PMEMORYBARRIERS = layout.offsetof(4);
        BUFFERMEMORYBARRIERCOUNT = layout.offsetof(5);
        PBUFFERMEMORYBARRIERS = layout.offsetof(6);
        IMAGEMEMORYBARRIERCOUNT = layout.offsetof(7);
        PIMAGEMEMORYBARRIERS = layout.offsetof(8);
    }

    protected VkDependencyInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDependencyInfo create(long address, ByteBuffer container) {
        return new VkDependencyInfo(address, container);
    }

    public VkDependencyInfo(ByteBuffer container) {
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

    @NativeType("VkDependencyFlags")
    public int dependencyFlags() {
        return ndependencyFlags(address());
    }

    @NativeType("uint32_t")
    public int memoryBarrierCount() {
        return nmemoryBarrierCount(address());
    }

    @NativeType("VkMemoryBarrier2 const *")
    public VkMemoryBarrier2.Buffer pMemoryBarriers() {
        return npMemoryBarriers(address());
    }

    @NativeType("uint32_t")
    public int bufferMemoryBarrierCount() {
        return nbufferMemoryBarrierCount(address());
    }

    @NativeType("VkBufferMemoryBarrier2 const *")
    public VkBufferMemoryBarrier2.Buffer pBufferMemoryBarriers() {
        return npBufferMemoryBarriers(address());
    }

    @NativeType("uint32_t")
    public int imageMemoryBarrierCount() {
        return nimageMemoryBarrierCount(address());
    }

    @NativeType("VkImageMemoryBarrier2 const *")
    public VkImageMemoryBarrier2.Buffer pImageMemoryBarriers() {
        return npImageMemoryBarriers(address());
    }

    public VkDependencyInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDependencyInfo sType$Default() {
        return sType(1000314003);
    }

    public VkDependencyInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDependencyInfo pNext(VkTensorDependencyInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDependencyInfo pNext(VkTensorMemoryBarrierARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDependencyInfo dependencyFlags(@NativeType("VkDependencyFlags") int value) {
        ndependencyFlags(address(), value);
        return this;
    }

    public VkDependencyInfo pMemoryBarriers(@NativeType("VkMemoryBarrier2 const *") VkMemoryBarrier2.Buffer value) {
        npMemoryBarriers(address(), value);
        return this;
    }

    public VkDependencyInfo pBufferMemoryBarriers(@NativeType("VkBufferMemoryBarrier2 const *") VkBufferMemoryBarrier2.Buffer value) {
        npBufferMemoryBarriers(address(), value);
        return this;
    }

    public VkDependencyInfo pImageMemoryBarriers(@NativeType("VkImageMemoryBarrier2 const *") VkImageMemoryBarrier2.Buffer value) {
        npImageMemoryBarriers(address(), value);
        return this;
    }

    public VkDependencyInfo set(int sType, long pNext, int dependencyFlags, VkMemoryBarrier2.Buffer pMemoryBarriers, VkBufferMemoryBarrier2.Buffer pBufferMemoryBarriers, VkImageMemoryBarrier2.Buffer pImageMemoryBarriers) {
        sType(sType);
        pNext(pNext);
        dependencyFlags(dependencyFlags);
        pMemoryBarriers(pMemoryBarriers);
        pBufferMemoryBarriers(pBufferMemoryBarriers);
        pImageMemoryBarriers(pImageMemoryBarriers);
        return this;
    }

    public VkDependencyInfo set(VkDependencyInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDependencyInfo malloc() {
        return new VkDependencyInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDependencyInfo calloc() {
        return new VkDependencyInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDependencyInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDependencyInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkDependencyInfo create(long address) {
        return new VkDependencyInfo(address, null);
    }

    public static VkDependencyInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDependencyInfo(address, null);
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

    public static VkDependencyInfo malloc(MemoryStack stack) {
        return new VkDependencyInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDependencyInfo calloc(MemoryStack stack) {
        return new VkDependencyInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndependencyFlags(long struct) {
        return MemoryUtil.memGetInt(struct + DEPENDENCYFLAGS);
    }

    public static int nmemoryBarrierCount(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYBARRIERCOUNT);
    }

    public static VkMemoryBarrier2.Buffer npMemoryBarriers(long struct) {
        return VkMemoryBarrier2.createSafe(MemoryUtil.memGetAddress(struct + PMEMORYBARRIERS), nmemoryBarrierCount(struct));
    }

    public static int nbufferMemoryBarrierCount(long struct) {
        return MemoryUtil.memGetInt(struct + BUFFERMEMORYBARRIERCOUNT);
    }

    public static VkBufferMemoryBarrier2.Buffer npBufferMemoryBarriers(long struct) {
        return VkBufferMemoryBarrier2.createSafe(MemoryUtil.memGetAddress(struct + PBUFFERMEMORYBARRIERS), nbufferMemoryBarrierCount(struct));
    }

    public static int nimageMemoryBarrierCount(long struct) {
        return MemoryUtil.memGetInt(struct + IMAGEMEMORYBARRIERCOUNT);
    }

    public static VkImageMemoryBarrier2.Buffer npImageMemoryBarriers(long struct) {
        return VkImageMemoryBarrier2.createSafe(MemoryUtil.memGetAddress(struct + PIMAGEMEMORYBARRIERS), nimageMemoryBarrierCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndependencyFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPENDENCYFLAGS, value);
    }

    public static void nmemoryBarrierCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MEMORYBARRIERCOUNT, value);
    }

    public static void npMemoryBarriers(long struct, VkMemoryBarrier2.Buffer value) {
        MemoryUtil.memPutAddress(struct + PMEMORYBARRIERS, MemoryUtil.memAddressSafe(value));
        nmemoryBarrierCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nbufferMemoryBarrierCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUFFERMEMORYBARRIERCOUNT, value);
    }

    public static void npBufferMemoryBarriers(long struct, VkBufferMemoryBarrier2.Buffer value) {
        MemoryUtil.memPutAddress(struct + PBUFFERMEMORYBARRIERS, MemoryUtil.memAddressSafe(value));
        nbufferMemoryBarrierCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nimageMemoryBarrierCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + IMAGEMEMORYBARRIERCOUNT, value);
    }

    public static void npImageMemoryBarriers(long struct, VkImageMemoryBarrier2.Buffer value) {
        MemoryUtil.memPutAddress(struct + PIMAGEMEMORYBARRIERS, MemoryUtil.memAddressSafe(value));
        nimageMemoryBarrierCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nmemoryBarrierCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PMEMORYBARRIERS));
        }
        if (nbufferMemoryBarrierCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PBUFFERMEMORYBARRIERS));
        }
        if (nimageMemoryBarrierCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PIMAGEMEMORYBARRIERS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDependencyInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDependencyInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkDependencyInfo, Buffer> implements NativeResource {
        private static final VkDependencyInfo ELEMENT_FACTORY = VkDependencyInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDependencyInfo.SIZEOF);
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
        public VkDependencyInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDependencyInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDependencyInfo.npNext(address());
        }

        @NativeType("VkDependencyFlags")
        public int dependencyFlags() {
            return VkDependencyInfo.ndependencyFlags(address());
        }

        @NativeType("uint32_t")
        public int memoryBarrierCount() {
            return VkDependencyInfo.nmemoryBarrierCount(address());
        }

        @NativeType("VkMemoryBarrier2 const *")
        public VkMemoryBarrier2.Buffer pMemoryBarriers() {
            return VkDependencyInfo.npMemoryBarriers(address());
        }

        @NativeType("uint32_t")
        public int bufferMemoryBarrierCount() {
            return VkDependencyInfo.nbufferMemoryBarrierCount(address());
        }

        @NativeType("VkBufferMemoryBarrier2 const *")
        public VkBufferMemoryBarrier2.Buffer pBufferMemoryBarriers() {
            return VkDependencyInfo.npBufferMemoryBarriers(address());
        }

        @NativeType("uint32_t")
        public int imageMemoryBarrierCount() {
            return VkDependencyInfo.nimageMemoryBarrierCount(address());
        }

        @NativeType("VkImageMemoryBarrier2 const *")
        public VkImageMemoryBarrier2.Buffer pImageMemoryBarriers() {
            return VkDependencyInfo.npImageMemoryBarriers(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDependencyInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000314003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDependencyInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkTensorDependencyInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkTensorMemoryBarrierARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer dependencyFlags(@NativeType("VkDependencyFlags") int value) {
            VkDependencyInfo.ndependencyFlags(address(), value);
            return this;
        }

        public Buffer pMemoryBarriers(@NativeType("VkMemoryBarrier2 const *") VkMemoryBarrier2.Buffer value) {
            VkDependencyInfo.npMemoryBarriers(address(), value);
            return this;
        }

        public Buffer pBufferMemoryBarriers(@NativeType("VkBufferMemoryBarrier2 const *") VkBufferMemoryBarrier2.Buffer value) {
            VkDependencyInfo.npBufferMemoryBarriers(address(), value);
            return this;
        }

        public Buffer pImageMemoryBarriers(@NativeType("VkImageMemoryBarrier2 const *") VkImageMemoryBarrier2.Buffer value) {
            VkDependencyInfo.npImageMemoryBarriers(address(), value);
            return this;
        }
    }
}
