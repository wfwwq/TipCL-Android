package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineDepthStencilStateCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineDepthStencilStateCreateInfo.class */
public class VkPipelineDepthStencilStateCreateInfo extends Struct<VkPipelineDepthStencilStateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int DEPTHTESTENABLE;
    public static final int DEPTHWRITEENABLE;
    public static final int DEPTHCOMPAREOP;
    public static final int DEPTHBOUNDSTESTENABLE;
    public static final int STENCILTESTENABLE;
    public static final int FRONT;
    public static final int BACK;
    public static final int MINDEPTHBOUNDS;
    public static final int MAXDEPTHBOUNDS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(VkStencilOpState.SIZEOF, VkStencilOpState.ALIGNOF), __member(VkStencilOpState.SIZEOF, VkStencilOpState.ALIGNOF), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        DEPTHTESTENABLE = layout.offsetof(3);
        DEPTHWRITEENABLE = layout.offsetof(4);
        DEPTHCOMPAREOP = layout.offsetof(5);
        DEPTHBOUNDSTESTENABLE = layout.offsetof(6);
        STENCILTESTENABLE = layout.offsetof(7);
        FRONT = layout.offsetof(8);
        BACK = layout.offsetof(9);
        MINDEPTHBOUNDS = layout.offsetof(10);
        MAXDEPTHBOUNDS = layout.offsetof(11);
    }

    protected VkPipelineDepthStencilStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineDepthStencilStateCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineDepthStencilStateCreateInfo(address, container);
    }

    public VkPipelineDepthStencilStateCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineDepthStencilStateCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkBool32")
    public boolean depthTestEnable() {
        return ndepthTestEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean depthWriteEnable() {
        return ndepthWriteEnable(address()) != 0;
    }

    @NativeType("VkCompareOp")
    public int depthCompareOp() {
        return ndepthCompareOp(address());
    }

    @NativeType("VkBool32")
    public boolean depthBoundsTestEnable() {
        return ndepthBoundsTestEnable(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean stencilTestEnable() {
        return nstencilTestEnable(address()) != 0;
    }

    public VkStencilOpState front() {
        return nfront(address());
    }

    public VkStencilOpState back() {
        return nback(address());
    }

    public float minDepthBounds() {
        return nminDepthBounds(address());
    }

    public float maxDepthBounds() {
        return nmaxDepthBounds(address());
    }

    public VkPipelineDepthStencilStateCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo sType$Default() {
        return sType(25);
    }

    public VkPipelineDepthStencilStateCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo flags(@NativeType("VkPipelineDepthStencilStateCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo depthTestEnable(@NativeType("VkBool32") boolean value) {
        ndepthTestEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo depthWriteEnable(@NativeType("VkBool32") boolean value) {
        ndepthWriteEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo depthCompareOp(@NativeType("VkCompareOp") int value) {
        ndepthCompareOp(address(), value);
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo depthBoundsTestEnable(@NativeType("VkBool32") boolean value) {
        ndepthBoundsTestEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo stencilTestEnable(@NativeType("VkBool32") boolean value) {
        nstencilTestEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo front(VkStencilOpState value) {
        nfront(address(), value);
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo front(Consumer<VkStencilOpState> consumer) {
        consumer.accept(front());
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo back(VkStencilOpState value) {
        nback(address(), value);
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo back(Consumer<VkStencilOpState> consumer) {
        consumer.accept(back());
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo minDepthBounds(float value) {
        nminDepthBounds(address(), value);
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo maxDepthBounds(float value) {
        nmaxDepthBounds(address(), value);
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo set(int sType, long pNext, int flags, boolean depthTestEnable, boolean depthWriteEnable, int depthCompareOp, boolean depthBoundsTestEnable, boolean stencilTestEnable, VkStencilOpState front, VkStencilOpState back, float minDepthBounds, float maxDepthBounds) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        depthTestEnable(depthTestEnable);
        depthWriteEnable(depthWriteEnable);
        depthCompareOp(depthCompareOp);
        depthBoundsTestEnable(depthBoundsTestEnable);
        stencilTestEnable(stencilTestEnable);
        front(front);
        back(back);
        minDepthBounds(minDepthBounds);
        maxDepthBounds(maxDepthBounds);
        return this;
    }

    public VkPipelineDepthStencilStateCreateInfo set(VkPipelineDepthStencilStateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineDepthStencilStateCreateInfo malloc() {
        return new VkPipelineDepthStencilStateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineDepthStencilStateCreateInfo calloc() {
        return new VkPipelineDepthStencilStateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineDepthStencilStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineDepthStencilStateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineDepthStencilStateCreateInfo create(long address) {
        return new VkPipelineDepthStencilStateCreateInfo(address, null);
    }

    public static VkPipelineDepthStencilStateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineDepthStencilStateCreateInfo(address, null);
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

    public static VkPipelineDepthStencilStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineDepthStencilStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineDepthStencilStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineDepthStencilStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndepthTestEnable(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHTESTENABLE);
    }

    public static int ndepthWriteEnable(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHWRITEENABLE);
    }

    public static int ndepthCompareOp(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHCOMPAREOP);
    }

    public static int ndepthBoundsTestEnable(long struct) {
        return MemoryUtil.memGetInt(struct + DEPTHBOUNDSTESTENABLE);
    }

    public static int nstencilTestEnable(long struct) {
        return MemoryUtil.memGetInt(struct + STENCILTESTENABLE);
    }

    public static VkStencilOpState nfront(long struct) {
        return VkStencilOpState.create(struct + FRONT);
    }

    public static VkStencilOpState nback(long struct) {
        return VkStencilOpState.create(struct + BACK);
    }

    public static float nminDepthBounds(long struct) {
        return MemoryUtil.memGetFloat(struct + MINDEPTHBOUNDS);
    }

    public static float nmaxDepthBounds(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXDEPTHBOUNDS);
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

    public static void ndepthTestEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHTESTENABLE, value);
    }

    public static void ndepthWriteEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHWRITEENABLE, value);
    }

    public static void ndepthCompareOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHCOMPAREOP, value);
    }

    public static void ndepthBoundsTestEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEPTHBOUNDSTESTENABLE, value);
    }

    public static void nstencilTestEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + STENCILTESTENABLE, value);
    }

    public static void nfront(long struct, VkStencilOpState value) {
        MemoryUtil.memCopy(value.address(), struct + FRONT, VkStencilOpState.SIZEOF);
    }

    public static void nback(long struct, VkStencilOpState value) {
        MemoryUtil.memCopy(value.address(), struct + BACK, VkStencilOpState.SIZEOF);
    }

    public static void nminDepthBounds(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MINDEPTHBOUNDS, value);
    }

    public static void nmaxDepthBounds(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAXDEPTHBOUNDS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineDepthStencilStateCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineDepthStencilStateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineDepthStencilStateCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineDepthStencilStateCreateInfo ELEMENT_FACTORY = VkPipelineDepthStencilStateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineDepthStencilStateCreateInfo.SIZEOF);
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
        public VkPipelineDepthStencilStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineDepthStencilStateCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineDepthStencilStateCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineDepthStencilStateCreateFlags")
        public int flags() {
            return VkPipelineDepthStencilStateCreateInfo.nflags(address());
        }

        @NativeType("VkBool32")
        public boolean depthTestEnable() {
            return VkPipelineDepthStencilStateCreateInfo.ndepthTestEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean depthWriteEnable() {
            return VkPipelineDepthStencilStateCreateInfo.ndepthWriteEnable(address()) != 0;
        }

        @NativeType("VkCompareOp")
        public int depthCompareOp() {
            return VkPipelineDepthStencilStateCreateInfo.ndepthCompareOp(address());
        }

        @NativeType("VkBool32")
        public boolean depthBoundsTestEnable() {
            return VkPipelineDepthStencilStateCreateInfo.ndepthBoundsTestEnable(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean stencilTestEnable() {
            return VkPipelineDepthStencilStateCreateInfo.nstencilTestEnable(address()) != 0;
        }

        public VkStencilOpState front() {
            return VkPipelineDepthStencilStateCreateInfo.nfront(address());
        }

        public VkStencilOpState back() {
            return VkPipelineDepthStencilStateCreateInfo.nback(address());
        }

        public float minDepthBounds() {
            return VkPipelineDepthStencilStateCreateInfo.nminDepthBounds(address());
        }

        public float maxDepthBounds() {
            return VkPipelineDepthStencilStateCreateInfo.nmaxDepthBounds(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineDepthStencilStateCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(25);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineDepthStencilStateCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkPipelineDepthStencilStateCreateFlags") int value) {
            VkPipelineDepthStencilStateCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer depthTestEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineDepthStencilStateCreateInfo.ndepthTestEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer depthWriteEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineDepthStencilStateCreateInfo.ndepthWriteEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer depthCompareOp(@NativeType("VkCompareOp") int value) {
            VkPipelineDepthStencilStateCreateInfo.ndepthCompareOp(address(), value);
            return this;
        }

        public Buffer depthBoundsTestEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineDepthStencilStateCreateInfo.ndepthBoundsTestEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer stencilTestEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineDepthStencilStateCreateInfo.nstencilTestEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer front(VkStencilOpState value) {
            VkPipelineDepthStencilStateCreateInfo.nfront(address(), value);
            return this;
        }

        public Buffer front(Consumer<VkStencilOpState> consumer) {
            consumer.accept(front());
            return this;
        }

        public Buffer back(VkStencilOpState value) {
            VkPipelineDepthStencilStateCreateInfo.nback(address(), value);
            return this;
        }

        public Buffer back(Consumer<VkStencilOpState> consumer) {
            consumer.accept(back());
            return this;
        }

        public Buffer minDepthBounds(float value) {
            VkPipelineDepthStencilStateCreateInfo.nminDepthBounds(address(), value);
            return this;
        }

        public Buffer maxDepthBounds(float value) {
            VkPipelineDepthStencilStateCreateInfo.nmaxDepthBounds(address(), value);
            return this;
        }
    }
}
