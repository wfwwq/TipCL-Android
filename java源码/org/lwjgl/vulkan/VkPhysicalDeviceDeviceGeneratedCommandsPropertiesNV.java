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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.class */
public class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV extends Struct<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXGRAPHICSSHADERGROUPCOUNT;
    public static final int MAXINDIRECTSEQUENCECOUNT;
    public static final int MAXINDIRECTCOMMANDSTOKENCOUNT;
    public static final int MAXINDIRECTCOMMANDSSTREAMCOUNT;
    public static final int MAXINDIRECTCOMMANDSTOKENOFFSET;
    public static final int MAXINDIRECTCOMMANDSSTREAMSTRIDE;
    public static final int MINSEQUENCESCOUNTBUFFEROFFSETALIGNMENT;
    public static final int MINSEQUENCESINDEXBUFFEROFFSETALIGNMENT;
    public static final int MININDIRECTCOMMANDSBUFFEROFFSETALIGNMENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXGRAPHICSSHADERGROUPCOUNT = layout.offsetof(2);
        MAXINDIRECTSEQUENCECOUNT = layout.offsetof(3);
        MAXINDIRECTCOMMANDSTOKENCOUNT = layout.offsetof(4);
        MAXINDIRECTCOMMANDSSTREAMCOUNT = layout.offsetof(5);
        MAXINDIRECTCOMMANDSTOKENOFFSET = layout.offsetof(6);
        MAXINDIRECTCOMMANDSSTREAMSTRIDE = layout.offsetof(7);
        MINSEQUENCESCOUNTBUFFEROFFSETALIGNMENT = layout.offsetof(8);
        MINSEQUENCESINDEXBUFFEROFFSETALIGNMENT = layout.offsetof(9);
        MININDIRECTCOMMANDSBUFFEROFFSETALIGNMENT = layout.offsetof(10);
    }

    protected VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(address, container);
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int maxGraphicsShaderGroupCount() {
        return nmaxGraphicsShaderGroupCount(address());
    }

    @NativeType("uint32_t")
    public int maxIndirectSequenceCount() {
        return nmaxIndirectSequenceCount(address());
    }

    @NativeType("uint32_t")
    public int maxIndirectCommandsTokenCount() {
        return nmaxIndirectCommandsTokenCount(address());
    }

    @NativeType("uint32_t")
    public int maxIndirectCommandsStreamCount() {
        return nmaxIndirectCommandsStreamCount(address());
    }

    @NativeType("uint32_t")
    public int maxIndirectCommandsTokenOffset() {
        return nmaxIndirectCommandsTokenOffset(address());
    }

    @NativeType("uint32_t")
    public int maxIndirectCommandsStreamStride() {
        return nmaxIndirectCommandsStreamStride(address());
    }

    @NativeType("uint32_t")
    public int minSequencesCountBufferOffsetAlignment() {
        return nminSequencesCountBufferOffsetAlignment(address());
    }

    @NativeType("uint32_t")
    public int minSequencesIndexBufferOffsetAlignment() {
        return nminSequencesIndexBufferOffsetAlignment(address());
    }

    @NativeType("uint32_t")
    public int minIndirectCommandsBufferOffsetAlignment() {
        return nminIndirectCommandsBufferOffsetAlignment(address());
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV sType$Default() {
        return sType(1000277000);
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV set(VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV malloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV calloc() {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV create(long address) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(address, null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(address, null);
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

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxGraphicsShaderGroupCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXGRAPHICSSHADERGROUPCOUNT);
    }

    public static int nmaxIndirectSequenceCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINDIRECTSEQUENCECOUNT);
    }

    public static int nmaxIndirectCommandsTokenCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINDIRECTCOMMANDSTOKENCOUNT);
    }

    public static int nmaxIndirectCommandsStreamCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINDIRECTCOMMANDSSTREAMCOUNT);
    }

    public static int nmaxIndirectCommandsTokenOffset(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINDIRECTCOMMANDSTOKENOFFSET);
    }

    public static int nmaxIndirectCommandsStreamStride(long struct) {
        return MemoryUtil.memGetInt(struct + MAXINDIRECTCOMMANDSSTREAMSTRIDE);
    }

    public static int nminSequencesCountBufferOffsetAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + MINSEQUENCESCOUNTBUFFEROFFSETALIGNMENT);
    }

    public static int nminSequencesIndexBufferOffsetAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + MINSEQUENCESINDEXBUFFEROFFSETALIGNMENT);
    }

    public static int nminIndirectCommandsBufferOffsetAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + MININDIRECTCOMMANDSBUFFEROFFSETALIGNMENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV ELEMENT_FACTORY = VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.SIZEOF);
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
        public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxGraphicsShaderGroupCount() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxGraphicsShaderGroupCount(address());
        }

        @NativeType("uint32_t")
        public int maxIndirectSequenceCount() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectSequenceCount(address());
        }

        @NativeType("uint32_t")
        public int maxIndirectCommandsTokenCount() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectCommandsTokenCount(address());
        }

        @NativeType("uint32_t")
        public int maxIndirectCommandsStreamCount() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectCommandsStreamCount(address());
        }

        @NativeType("uint32_t")
        public int maxIndirectCommandsTokenOffset() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectCommandsTokenOffset(address());
        }

        @NativeType("uint32_t")
        public int maxIndirectCommandsStreamStride() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nmaxIndirectCommandsStreamStride(address());
        }

        @NativeType("uint32_t")
        public int minSequencesCountBufferOffsetAlignment() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nminSequencesCountBufferOffsetAlignment(address());
        }

        @NativeType("uint32_t")
        public int minSequencesIndexBufferOffsetAlignment() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nminSequencesIndexBufferOffsetAlignment(address());
        }

        @NativeType("uint32_t")
        public int minIndirectCommandsBufferOffsetAlignment() {
            return VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nminIndirectCommandsBufferOffsetAlignment(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000277000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.npNext(address(), value);
            return this;
        }
    }
}
