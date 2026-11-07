package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderResourceUsageAMD.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderResourceUsageAMD.class */
public class VkShaderResourceUsageAMD extends Struct<VkShaderResourceUsageAMD> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int NUMUSEDVGPRS;
    public static final int NUMUSEDSGPRS;
    public static final int LDSSIZEPERLOCALWORKGROUP;
    public static final int LDSUSAGESIZEINBYTES;
    public static final int SCRATCHMEMUSAGEINBYTES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        NUMUSEDVGPRS = layout.offsetof(0);
        NUMUSEDSGPRS = layout.offsetof(1);
        LDSSIZEPERLOCALWORKGROUP = layout.offsetof(2);
        LDSUSAGESIZEINBYTES = layout.offsetof(3);
        SCRATCHMEMUSAGEINBYTES = layout.offsetof(4);
    }

    protected VkShaderResourceUsageAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkShaderResourceUsageAMD create(long address, ByteBuffer container) {
        return new VkShaderResourceUsageAMD(address, container);
    }

    public VkShaderResourceUsageAMD(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int numUsedVgprs() {
        return nnumUsedVgprs(address());
    }

    @NativeType("uint32_t")
    public int numUsedSgprs() {
        return nnumUsedSgprs(address());
    }

    @NativeType("uint32_t")
    public int ldsSizePerLocalWorkGroup() {
        return nldsSizePerLocalWorkGroup(address());
    }

    @NativeType("size_t")
    public long ldsUsageSizeInBytes() {
        return nldsUsageSizeInBytes(address());
    }

    @NativeType("size_t")
    public long scratchMemUsageInBytes() {
        return nscratchMemUsageInBytes(address());
    }

    public static VkShaderResourceUsageAMD create(long address) {
        return new VkShaderResourceUsageAMD(address, null);
    }

    public static VkShaderResourceUsageAMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkShaderResourceUsageAMD(address, null);
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

    public static int nnumUsedVgprs(long struct) {
        return MemoryUtil.memGetInt(struct + NUMUSEDVGPRS);
    }

    public static int nnumUsedSgprs(long struct) {
        return MemoryUtil.memGetInt(struct + NUMUSEDSGPRS);
    }

    public static int nldsSizePerLocalWorkGroup(long struct) {
        return MemoryUtil.memGetInt(struct + LDSSIZEPERLOCALWORKGROUP);
    }

    public static long nldsUsageSizeInBytes(long struct) {
        return MemoryUtil.memGetAddress(struct + LDSUSAGESIZEINBYTES);
    }

    public static long nscratchMemUsageInBytes(long struct) {
        return MemoryUtil.memGetAddress(struct + SCRATCHMEMUSAGEINBYTES);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderResourceUsageAMD$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderResourceUsageAMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkShaderResourceUsageAMD, Buffer> {
        private static final VkShaderResourceUsageAMD ELEMENT_FACTORY = VkShaderResourceUsageAMD.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkShaderResourceUsageAMD.SIZEOF);
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
        public VkShaderResourceUsageAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int numUsedVgprs() {
            return VkShaderResourceUsageAMD.nnumUsedVgprs(address());
        }

        @NativeType("uint32_t")
        public int numUsedSgprs() {
            return VkShaderResourceUsageAMD.nnumUsedSgprs(address());
        }

        @NativeType("uint32_t")
        public int ldsSizePerLocalWorkGroup() {
            return VkShaderResourceUsageAMD.nldsSizePerLocalWorkGroup(address());
        }

        @NativeType("size_t")
        public long ldsUsageSizeInBytes() {
            return VkShaderResourceUsageAMD.nldsUsageSizeInBytes(address());
        }

        @NativeType("size_t")
        public long scratchMemUsageInBytes() {
            return VkShaderResourceUsageAMD.nscratchMemUsageInBytes(address());
        }
    }
}
