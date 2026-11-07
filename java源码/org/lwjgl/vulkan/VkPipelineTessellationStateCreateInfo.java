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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineTessellationStateCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineTessellationStateCreateInfo.class */
public class VkPipelineTessellationStateCreateInfo extends Struct<VkPipelineTessellationStateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int PATCHCONTROLPOINTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PATCHCONTROLPOINTS = layout.offsetof(3);
    }

    protected VkPipelineTessellationStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineTessellationStateCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineTessellationStateCreateInfo(address, container);
    }

    public VkPipelineTessellationStateCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineTessellationStateCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("uint32_t")
    public int patchControlPoints() {
        return npatchControlPoints(address());
    }

    public VkPipelineTessellationStateCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineTessellationStateCreateInfo sType$Default() {
        return sType(21);
    }

    public VkPipelineTessellationStateCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineTessellationStateCreateInfo pNext(VkPipelineTessellationDomainOriginStateCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineTessellationStateCreateInfo pNext(VkPipelineTessellationDomainOriginStateCreateInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineTessellationStateCreateInfo flags(@NativeType("VkPipelineTessellationStateCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineTessellationStateCreateInfo patchControlPoints(@NativeType("uint32_t") int value) {
        npatchControlPoints(address(), value);
        return this;
    }

    public VkPipelineTessellationStateCreateInfo set(int sType, long pNext, int flags, int patchControlPoints) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        patchControlPoints(patchControlPoints);
        return this;
    }

    public VkPipelineTessellationStateCreateInfo set(VkPipelineTessellationStateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineTessellationStateCreateInfo malloc() {
        return new VkPipelineTessellationStateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineTessellationStateCreateInfo calloc() {
        return new VkPipelineTessellationStateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineTessellationStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineTessellationStateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineTessellationStateCreateInfo create(long address) {
        return new VkPipelineTessellationStateCreateInfo(address, null);
    }

    public static VkPipelineTessellationStateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineTessellationStateCreateInfo(address, null);
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

    public static VkPipelineTessellationStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineTessellationStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineTessellationStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineTessellationStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npatchControlPoints(long struct) {
        return MemoryUtil.memGetInt(struct + PATCHCONTROLPOINTS);
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

    public static void npatchControlPoints(long struct, int value) {
        MemoryUtil.memPutInt(struct + PATCHCONTROLPOINTS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineTessellationStateCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineTessellationStateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineTessellationStateCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineTessellationStateCreateInfo ELEMENT_FACTORY = VkPipelineTessellationStateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineTessellationStateCreateInfo.SIZEOF);
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
        public VkPipelineTessellationStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineTessellationStateCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineTessellationStateCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineTessellationStateCreateFlags")
        public int flags() {
            return VkPipelineTessellationStateCreateInfo.nflags(address());
        }

        @NativeType("uint32_t")
        public int patchControlPoints() {
            return VkPipelineTessellationStateCreateInfo.npatchControlPoints(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineTessellationStateCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(21);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineTessellationStateCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineTessellationDomainOriginStateCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineTessellationDomainOriginStateCreateInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkPipelineTessellationStateCreateFlags") int value) {
            VkPipelineTessellationStateCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer patchControlPoints(@NativeType("uint32_t") int value) {
            VkPipelineTessellationStateCreateInfo.npatchControlPoints(address(), value);
            return this;
        }
    }
}
