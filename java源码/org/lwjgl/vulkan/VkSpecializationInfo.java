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
import org.lwjgl.vulkan.VkSpecializationMapEntry;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSpecializationInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSpecializationInfo.class */
public class VkSpecializationInfo extends Struct<VkSpecializationInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int MAPENTRYCOUNT;
    public static final int PMAPENTRIES;
    public static final int DATASIZE;
    public static final int PDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        MAPENTRYCOUNT = layout.offsetof(0);
        PMAPENTRIES = layout.offsetof(1);
        DATASIZE = layout.offsetof(2);
        PDATA = layout.offsetof(3);
    }

    protected VkSpecializationInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSpecializationInfo create(long address, ByteBuffer container) {
        return new VkSpecializationInfo(address, container);
    }

    public VkSpecializationInfo(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int mapEntryCount() {
        return nmapEntryCount(address());
    }

    @NativeType("VkSpecializationMapEntry const *")
    public VkSpecializationMapEntry.Buffer pMapEntries() {
        return npMapEntries(address());
    }

    @NativeType("size_t")
    public long dataSize() {
        return ndataSize(address());
    }

    @NativeType("void const *")
    public ByteBuffer pData() {
        return npData(address());
    }

    public VkSpecializationInfo pMapEntries(@NativeType("VkSpecializationMapEntry const *") VkSpecializationMapEntry.Buffer value) {
        npMapEntries(address(), value);
        return this;
    }

    public VkSpecializationInfo pData(@NativeType("void const *") ByteBuffer value) {
        npData(address(), value);
        return this;
    }

    public VkSpecializationInfo set(VkSpecializationMapEntry.Buffer pMapEntries, ByteBuffer pData) {
        pMapEntries(pMapEntries);
        pData(pData);
        return this;
    }

    public VkSpecializationInfo set(VkSpecializationInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSpecializationInfo malloc() {
        return new VkSpecializationInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSpecializationInfo calloc() {
        return new VkSpecializationInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSpecializationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSpecializationInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSpecializationInfo create(long address) {
        return new VkSpecializationInfo(address, null);
    }

    public static VkSpecializationInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSpecializationInfo(address, null);
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

    public static VkSpecializationInfo malloc(MemoryStack stack) {
        return new VkSpecializationInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSpecializationInfo calloc(MemoryStack stack) {
        return new VkSpecializationInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nmapEntryCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAPENTRYCOUNT);
    }

    public static VkSpecializationMapEntry.Buffer npMapEntries(long struct) {
        return VkSpecializationMapEntry.createSafe(MemoryUtil.memGetAddress(struct + PMAPENTRIES), nmapEntryCount(struct));
    }

    public static long ndataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + DATASIZE);
    }

    public static ByteBuffer npData(long struct) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + PDATA), (int) ndataSize(struct));
    }

    public static void nmapEntryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAPENTRYCOUNT, value);
    }

    public static void npMapEntries(long struct, VkSpecializationMapEntry.Buffer value) {
        MemoryUtil.memPutAddress(struct + PMAPENTRIES, MemoryUtil.memAddressSafe(value));
        nmapEntryCount(struct, value == null ? 0 : value.remaining());
    }

    public static void ndataSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + DATASIZE, value);
    }

    public static void npData(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PDATA, MemoryUtil.memAddressSafe(value));
        ndataSize(struct, value == null ? 0L : value.remaining());
    }

    public static void validate(long struct) {
        if (nmapEntryCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PMAPENTRIES));
        }
        if (ndataSize(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PDATA));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSpecializationInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSpecializationInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSpecializationInfo, Buffer> implements NativeResource {
        private static final VkSpecializationInfo ELEMENT_FACTORY = VkSpecializationInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSpecializationInfo.SIZEOF);
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
        public VkSpecializationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int mapEntryCount() {
            return VkSpecializationInfo.nmapEntryCount(address());
        }

        @NativeType("VkSpecializationMapEntry const *")
        public VkSpecializationMapEntry.Buffer pMapEntries() {
            return VkSpecializationInfo.npMapEntries(address());
        }

        @NativeType("size_t")
        public long dataSize() {
            return VkSpecializationInfo.ndataSize(address());
        }

        @NativeType("void const *")
        public ByteBuffer pData() {
            return VkSpecializationInfo.npData(address());
        }

        public Buffer pMapEntries(@NativeType("VkSpecializationMapEntry const *") VkSpecializationMapEntry.Buffer value) {
            VkSpecializationInfo.npMapEntries(address(), value);
            return this;
        }

        public Buffer pData(@NativeType("void const *") ByteBuffer value) {
            VkSpecializationInfo.npData(address(), value);
            return this;
        }
    }
}
