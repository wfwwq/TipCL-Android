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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineInputAssemblyStateCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineInputAssemblyStateCreateInfo.class */
public class VkPipelineInputAssemblyStateCreateInfo extends Struct<VkPipelineInputAssemblyStateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int TOPOLOGY;
    public static final int PRIMITIVERESTARTENABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        TOPOLOGY = layout.offsetof(3);
        PRIMITIVERESTARTENABLE = layout.offsetof(4);
    }

    protected VkPipelineInputAssemblyStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineInputAssemblyStateCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineInputAssemblyStateCreateInfo(address, container);
    }

    public VkPipelineInputAssemblyStateCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineInputAssemblyStateCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkPrimitiveTopology")
    public int topology() {
        return ntopology(address());
    }

    @NativeType("VkBool32")
    public boolean primitiveRestartEnable() {
        return nprimitiveRestartEnable(address()) != 0;
    }

    public VkPipelineInputAssemblyStateCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineInputAssemblyStateCreateInfo sType$Default() {
        return sType(20);
    }

    public VkPipelineInputAssemblyStateCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineInputAssemblyStateCreateInfo flags(@NativeType("VkPipelineInputAssemblyStateCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineInputAssemblyStateCreateInfo topology(@NativeType("VkPrimitiveTopology") int value) {
        ntopology(address(), value);
        return this;
    }

    public VkPipelineInputAssemblyStateCreateInfo primitiveRestartEnable(@NativeType("VkBool32") boolean value) {
        nprimitiveRestartEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineInputAssemblyStateCreateInfo set(int sType, long pNext, int flags, int topology, boolean primitiveRestartEnable) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        topology(topology);
        primitiveRestartEnable(primitiveRestartEnable);
        return this;
    }

    public VkPipelineInputAssemblyStateCreateInfo set(VkPipelineInputAssemblyStateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineInputAssemblyStateCreateInfo malloc() {
        return new VkPipelineInputAssemblyStateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineInputAssemblyStateCreateInfo calloc() {
        return new VkPipelineInputAssemblyStateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineInputAssemblyStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineInputAssemblyStateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineInputAssemblyStateCreateInfo create(long address) {
        return new VkPipelineInputAssemblyStateCreateInfo(address, null);
    }

    public static VkPipelineInputAssemblyStateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineInputAssemblyStateCreateInfo(address, null);
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

    public static VkPipelineInputAssemblyStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineInputAssemblyStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineInputAssemblyStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineInputAssemblyStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntopology(long struct) {
        return MemoryUtil.memGetInt(struct + TOPOLOGY);
    }

    public static int nprimitiveRestartEnable(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMITIVERESTARTENABLE);
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

    public static void ntopology(long struct, int value) {
        MemoryUtil.memPutInt(struct + TOPOLOGY, value);
    }

    public static void nprimitiveRestartEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIMITIVERESTARTENABLE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineInputAssemblyStateCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineInputAssemblyStateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineInputAssemblyStateCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineInputAssemblyStateCreateInfo ELEMENT_FACTORY = VkPipelineInputAssemblyStateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineInputAssemblyStateCreateInfo.SIZEOF);
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
        public VkPipelineInputAssemblyStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineInputAssemblyStateCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineInputAssemblyStateCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineInputAssemblyStateCreateFlags")
        public int flags() {
            return VkPipelineInputAssemblyStateCreateInfo.nflags(address());
        }

        @NativeType("VkPrimitiveTopology")
        public int topology() {
            return VkPipelineInputAssemblyStateCreateInfo.ntopology(address());
        }

        @NativeType("VkBool32")
        public boolean primitiveRestartEnable() {
            return VkPipelineInputAssemblyStateCreateInfo.nprimitiveRestartEnable(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineInputAssemblyStateCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(20);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineInputAssemblyStateCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPipelineInputAssemblyStateCreateFlags") int value) {
            VkPipelineInputAssemblyStateCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer topology(@NativeType("VkPrimitiveTopology") int value) {
            VkPipelineInputAssemblyStateCreateInfo.ntopology(address(), value);
            return this;
        }

        public Buffer primitiveRestartEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineInputAssemblyStateCreateInfo.nprimitiveRestartEnable(address(), value ? 1 : 0);
            return this;
        }
    }
}
