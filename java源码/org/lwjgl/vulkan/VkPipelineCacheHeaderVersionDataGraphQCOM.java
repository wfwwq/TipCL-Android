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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCacheHeaderVersionDataGraphQCOM.class */
public class VkPipelineCacheHeaderVersionDataGraphQCOM extends Struct<VkPipelineCacheHeaderVersionDataGraphQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int HEADERSIZE;
    public static final int HEADERVERSION;
    public static final int CACHETYPE;
    public static final int CACHEVERSION;
    public static final int TOOLCHAINVERSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(4), __array(4, 3));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        HEADERSIZE = layout.offsetof(0);
        HEADERVERSION = layout.offsetof(1);
        CACHETYPE = layout.offsetof(2);
        CACHEVERSION = layout.offsetof(3);
        TOOLCHAINVERSION = layout.offsetof(4);
    }

    protected VkPipelineCacheHeaderVersionDataGraphQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineCacheHeaderVersionDataGraphQCOM create(long address, ByteBuffer container) {
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(address, container);
    }

    public VkPipelineCacheHeaderVersionDataGraphQCOM(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int headerSize() {
        return nheaderSize(address());
    }

    @NativeType("VkPipelineCacheHeaderVersion")
    public int headerVersion() {
        return nheaderVersion(address());
    }

    @NativeType("VkDataGraphModelCacheTypeQCOM")
    public int cacheType() {
        return ncacheType(address());
    }

    @NativeType("uint32_t")
    public int cacheVersion() {
        return ncacheVersion(address());
    }

    @NativeType("uint32_t[VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM]")
    public IntBuffer toolchainVersion() {
        return ntoolchainVersion(address());
    }

    @NativeType("uint32_t")
    public int toolchainVersion(int index) {
        return ntoolchainVersion(address(), index);
    }

    public VkPipelineCacheHeaderVersionDataGraphQCOM headerSize(@NativeType("uint32_t") int value) {
        nheaderSize(address(), value);
        return this;
    }

    public VkPipelineCacheHeaderVersionDataGraphQCOM headerVersion(@NativeType("VkPipelineCacheHeaderVersion") int value) {
        nheaderVersion(address(), value);
        return this;
    }

    public VkPipelineCacheHeaderVersionDataGraphQCOM cacheType(@NativeType("VkDataGraphModelCacheTypeQCOM") int value) {
        ncacheType(address(), value);
        return this;
    }

    public VkPipelineCacheHeaderVersionDataGraphQCOM cacheVersion(@NativeType("uint32_t") int value) {
        ncacheVersion(address(), value);
        return this;
    }

    public VkPipelineCacheHeaderVersionDataGraphQCOM toolchainVersion(@NativeType("uint32_t[VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM]") IntBuffer value) {
        ntoolchainVersion(address(), value);
        return this;
    }

    public VkPipelineCacheHeaderVersionDataGraphQCOM toolchainVersion(int index, @NativeType("uint32_t") int value) {
        ntoolchainVersion(address(), index, value);
        return this;
    }

    public VkPipelineCacheHeaderVersionDataGraphQCOM set(int headerSize, int headerVersion, int cacheType, int cacheVersion, IntBuffer toolchainVersion) {
        headerSize(headerSize);
        headerVersion(headerVersion);
        cacheType(cacheType);
        cacheVersion(cacheVersion);
        toolchainVersion(toolchainVersion);
        return this;
    }

    public VkPipelineCacheHeaderVersionDataGraphQCOM set(VkPipelineCacheHeaderVersionDataGraphQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineCacheHeaderVersionDataGraphQCOM malloc() {
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineCacheHeaderVersionDataGraphQCOM calloc() {
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineCacheHeaderVersionDataGraphQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineCacheHeaderVersionDataGraphQCOM create(long address) {
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(address, null);
    }

    public static VkPipelineCacheHeaderVersionDataGraphQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(address, null);
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

    public static VkPipelineCacheHeaderVersionDataGraphQCOM malloc(MemoryStack stack) {
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineCacheHeaderVersionDataGraphQCOM calloc(MemoryStack stack) {
        return new VkPipelineCacheHeaderVersionDataGraphQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nheaderSize(long struct) {
        return MemoryUtil.memGetInt(struct + HEADERSIZE);
    }

    public static int nheaderVersion(long struct) {
        return MemoryUtil.memGetInt(struct + HEADERVERSION);
    }

    public static int ncacheType(long struct) {
        return MemoryUtil.memGetInt(struct + CACHETYPE);
    }

    public static int ncacheVersion(long struct) {
        return MemoryUtil.memGetInt(struct + CACHEVERSION);
    }

    public static IntBuffer ntoolchainVersion(long struct) {
        return MemoryUtil.memIntBuffer(struct + TOOLCHAINVERSION, 3);
    }

    public static int ntoolchainVersion(long struct, int index) {
        return MemoryUtil.memGetInt(struct + TOOLCHAINVERSION + (Checks.check(index, 3) * 4));
    }

    public static void nheaderSize(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEADERSIZE, value);
    }

    public static void nheaderVersion(long struct, int value) {
        MemoryUtil.memPutInt(struct + HEADERVERSION, value);
    }

    public static void ncacheType(long struct, int value) {
        MemoryUtil.memPutInt(struct + CACHETYPE, value);
    }

    public static void ncacheVersion(long struct, int value) {
        MemoryUtil.memPutInt(struct + CACHEVERSION, value);
    }

    public static void ntoolchainVersion(long struct, IntBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 3);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + TOOLCHAINVERSION, value.remaining() * 4);
    }

    public static void ntoolchainVersion(long struct, int index, int value) {
        MemoryUtil.memPutInt(struct + TOOLCHAINVERSION + (Checks.check(index, 3) * 4), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCacheHeaderVersionDataGraphQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineCacheHeaderVersionDataGraphQCOM, Buffer> implements NativeResource {
        private static final VkPipelineCacheHeaderVersionDataGraphQCOM ELEMENT_FACTORY = VkPipelineCacheHeaderVersionDataGraphQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineCacheHeaderVersionDataGraphQCOM.SIZEOF);
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
        public VkPipelineCacheHeaderVersionDataGraphQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int headerSize() {
            return VkPipelineCacheHeaderVersionDataGraphQCOM.nheaderSize(address());
        }

        @NativeType("VkPipelineCacheHeaderVersion")
        public int headerVersion() {
            return VkPipelineCacheHeaderVersionDataGraphQCOM.nheaderVersion(address());
        }

        @NativeType("VkDataGraphModelCacheTypeQCOM")
        public int cacheType() {
            return VkPipelineCacheHeaderVersionDataGraphQCOM.ncacheType(address());
        }

        @NativeType("uint32_t")
        public int cacheVersion() {
            return VkPipelineCacheHeaderVersionDataGraphQCOM.ncacheVersion(address());
        }

        @NativeType("uint32_t[VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM]")
        public IntBuffer toolchainVersion() {
            return VkPipelineCacheHeaderVersionDataGraphQCOM.ntoolchainVersion(address());
        }

        @NativeType("uint32_t")
        public int toolchainVersion(int index) {
            return VkPipelineCacheHeaderVersionDataGraphQCOM.ntoolchainVersion(address(), index);
        }

        public Buffer headerSize(@NativeType("uint32_t") int value) {
            VkPipelineCacheHeaderVersionDataGraphQCOM.nheaderSize(address(), value);
            return this;
        }

        public Buffer headerVersion(@NativeType("VkPipelineCacheHeaderVersion") int value) {
            VkPipelineCacheHeaderVersionDataGraphQCOM.nheaderVersion(address(), value);
            return this;
        }

        public Buffer cacheType(@NativeType("VkDataGraphModelCacheTypeQCOM") int value) {
            VkPipelineCacheHeaderVersionDataGraphQCOM.ncacheType(address(), value);
            return this;
        }

        public Buffer cacheVersion(@NativeType("uint32_t") int value) {
            VkPipelineCacheHeaderVersionDataGraphQCOM.ncacheVersion(address(), value);
            return this;
        }

        public Buffer toolchainVersion(@NativeType("uint32_t[VK_DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM]") IntBuffer value) {
            VkPipelineCacheHeaderVersionDataGraphQCOM.ntoolchainVersion(address(), value);
            return this;
        }

        public Buffer toolchainVersion(int index, @NativeType("uint32_t") int value) {
            VkPipelineCacheHeaderVersionDataGraphQCOM.ntoolchainVersion(address(), index, value);
            return this;
        }
    }
}
