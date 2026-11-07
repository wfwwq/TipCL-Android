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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandPoolCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandPoolCreateInfo.class */
public class VkCommandPoolCreateInfo extends Struct<VkCommandPoolCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int QUEUEFAMILYINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        QUEUEFAMILYINDEX = layout.offsetof(3);
    }

    protected VkCommandPoolCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkCommandPoolCreateInfo create(long address, ByteBuffer container) {
        return new VkCommandPoolCreateInfo(address, container);
    }

    public VkCommandPoolCreateInfo(ByteBuffer container) {
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

    @NativeType("VkCommandPoolCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int queueFamilyIndex() {
        return nqueueFamilyIndex(address());
    }

    public VkCommandPoolCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkCommandPoolCreateInfo sType$Default() {
        return sType(39);
    }

    public VkCommandPoolCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkCommandPoolCreateInfo pNext(VkDataGraphProcessingEngineCreateInfoARM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkCommandPoolCreateInfo flags(@NativeType("VkCommandPoolCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkCommandPoolCreateInfo queueFamilyIndex(@NativeType("uint32_t") int value) {
        nqueueFamilyIndex(address(), value);
        return this;
    }

    public VkCommandPoolCreateInfo set(int sType, long pNext, int flags, int queueFamilyIndex) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        queueFamilyIndex(queueFamilyIndex);
        return this;
    }

    public VkCommandPoolCreateInfo set(VkCommandPoolCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCommandPoolCreateInfo malloc() {
        return new VkCommandPoolCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCommandPoolCreateInfo calloc() {
        return new VkCommandPoolCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCommandPoolCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCommandPoolCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkCommandPoolCreateInfo create(long address) {
        return new VkCommandPoolCreateInfo(address, null);
    }

    public static VkCommandPoolCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCommandPoolCreateInfo(address, null);
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

    public static VkCommandPoolCreateInfo malloc(MemoryStack stack) {
        return new VkCommandPoolCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCommandPoolCreateInfo calloc(MemoryStack stack) {
        return new VkCommandPoolCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nqueueFamilyIndex(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUEFAMILYINDEX);
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

    public static void nqueueFamilyIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUEFAMILYINDEX, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandPoolCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCommandPoolCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkCommandPoolCreateInfo, Buffer> implements NativeResource {
        private static final VkCommandPoolCreateInfo ELEMENT_FACTORY = VkCommandPoolCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkCommandPoolCreateInfo.SIZEOF);
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
        public VkCommandPoolCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkCommandPoolCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkCommandPoolCreateInfo.npNext(address());
        }

        @NativeType("VkCommandPoolCreateFlags")
        public int flags() {
            return VkCommandPoolCreateInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int queueFamilyIndex() {
            return VkCommandPoolCreateInfo.nqueueFamilyIndex(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCommandPoolCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(39);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkCommandPoolCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDataGraphProcessingEngineCreateInfoARM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkCommandPoolCreateFlags") int value) {
            VkCommandPoolCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer queueFamilyIndex(@NativeType("uint32_t") int value) {
            VkCommandPoolCreateInfo.nqueueFamilyIndex(address(), value);
            return this;
        }
    }
}
