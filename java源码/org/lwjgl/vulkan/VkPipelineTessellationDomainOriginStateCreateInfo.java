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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineTessellationDomainOriginStateCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineTessellationDomainOriginStateCreateInfo.class */
public class VkPipelineTessellationDomainOriginStateCreateInfo extends Struct<VkPipelineTessellationDomainOriginStateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DOMAINORIGIN;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DOMAINORIGIN = layout.offsetof(2);
    }

    protected VkPipelineTessellationDomainOriginStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineTessellationDomainOriginStateCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineTessellationDomainOriginStateCreateInfo(address, container);
    }

    public VkPipelineTessellationDomainOriginStateCreateInfo(ByteBuffer container) {
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

    @NativeType("VkTessellationDomainOrigin")
    public int domainOrigin() {
        return ndomainOrigin(address());
    }

    public VkPipelineTessellationDomainOriginStateCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineTessellationDomainOriginStateCreateInfo sType$Default() {
        return sType(1000117003);
    }

    public VkPipelineTessellationDomainOriginStateCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineTessellationDomainOriginStateCreateInfo domainOrigin(@NativeType("VkTessellationDomainOrigin") int value) {
        ndomainOrigin(address(), value);
        return this;
    }

    public VkPipelineTessellationDomainOriginStateCreateInfo set(int sType, long pNext, int domainOrigin) {
        sType(sType);
        pNext(pNext);
        domainOrigin(domainOrigin);
        return this;
    }

    public VkPipelineTessellationDomainOriginStateCreateInfo set(VkPipelineTessellationDomainOriginStateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfo malloc() {
        return new VkPipelineTessellationDomainOriginStateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfo calloc() {
        return new VkPipelineTessellationDomainOriginStateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineTessellationDomainOriginStateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfo create(long address) {
        return new VkPipelineTessellationDomainOriginStateCreateInfo(address, null);
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineTessellationDomainOriginStateCreateInfo(address, null);
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

    public static VkPipelineTessellationDomainOriginStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineTessellationDomainOriginStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineTessellationDomainOriginStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineTessellationDomainOriginStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndomainOrigin(long struct) {
        return MemoryUtil.memGetInt(struct + DOMAINORIGIN);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndomainOrigin(long struct, int value) {
        MemoryUtil.memPutInt(struct + DOMAINORIGIN, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineTessellationDomainOriginStateCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineTessellationDomainOriginStateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineTessellationDomainOriginStateCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineTessellationDomainOriginStateCreateInfo ELEMENT_FACTORY = VkPipelineTessellationDomainOriginStateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineTessellationDomainOriginStateCreateInfo.SIZEOF);
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
        public VkPipelineTessellationDomainOriginStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineTessellationDomainOriginStateCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineTessellationDomainOriginStateCreateInfo.npNext(address());
        }

        @NativeType("VkTessellationDomainOrigin")
        public int domainOrigin() {
            return VkPipelineTessellationDomainOriginStateCreateInfo.ndomainOrigin(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineTessellationDomainOriginStateCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000117003);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineTessellationDomainOriginStateCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer domainOrigin(@NativeType("VkTessellationDomainOrigin") int value) {
            VkPipelineTessellationDomainOriginStateCreateInfo.ndomainOrigin(address(), value);
            return this;
        }
    }
}
