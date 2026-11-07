package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderStatisticsInfoAMD.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderStatisticsInfoAMD.class */
public class VkShaderStatisticsInfoAMD extends Struct<VkShaderStatisticsInfoAMD> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SHADERSTAGEMASK;
    public static final int RESOURCEUSAGE;
    public static final int NUMPHYSICALVGPRS;
    public static final int NUMPHYSICALSGPRS;
    public static final int NUMAVAILABLEVGPRS;
    public static final int NUMAVAILABLESGPRS;
    public static final int COMPUTEWORKGROUPSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(VkShaderResourceUsageAMD.SIZEOF, VkShaderResourceUsageAMD.ALIGNOF), __member(4), __member(4), __member(4), __member(4), __array(4, 3));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SHADERSTAGEMASK = layout.offsetof(0);
        RESOURCEUSAGE = layout.offsetof(1);
        NUMPHYSICALVGPRS = layout.offsetof(2);
        NUMPHYSICALSGPRS = layout.offsetof(3);
        NUMAVAILABLEVGPRS = layout.offsetof(4);
        NUMAVAILABLESGPRS = layout.offsetof(5);
        COMPUTEWORKGROUPSIZE = layout.offsetof(6);
    }

    protected VkShaderStatisticsInfoAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkShaderStatisticsInfoAMD create(long address, ByteBuffer container) {
        return new VkShaderStatisticsInfoAMD(address, container);
    }

    public VkShaderStatisticsInfoAMD(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkShaderStageFlags")
    public int shaderStageMask() {
        return nshaderStageMask(address());
    }

    public VkShaderResourceUsageAMD resourceUsage() {
        return nresourceUsage(address());
    }

    @NativeType("uint32_t")
    public int numPhysicalVgprs() {
        return nnumPhysicalVgprs(address());
    }

    @NativeType("uint32_t")
    public int numPhysicalSgprs() {
        return nnumPhysicalSgprs(address());
    }

    @NativeType("uint32_t")
    public int numAvailableVgprs() {
        return nnumAvailableVgprs(address());
    }

    @NativeType("uint32_t")
    public int numAvailableSgprs() {
        return nnumAvailableSgprs(address());
    }

    @NativeType("uint32_t[3]")
    public IntBuffer computeWorkGroupSize() {
        return ncomputeWorkGroupSize(address());
    }

    @NativeType("uint32_t")
    public int computeWorkGroupSize(int index) {
        return ncomputeWorkGroupSize(address(), index);
    }

    public static VkShaderStatisticsInfoAMD create(long address) {
        return new VkShaderStatisticsInfoAMD(address, null);
    }

    public static VkShaderStatisticsInfoAMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkShaderStatisticsInfoAMD(address, null);
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

    public static int nshaderStageMask(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERSTAGEMASK);
    }

    public static VkShaderResourceUsageAMD nresourceUsage(long struct) {
        return VkShaderResourceUsageAMD.create(struct + RESOURCEUSAGE);
    }

    public static int nnumPhysicalVgprs(long struct) {
        return MemoryUtil.memGetInt(struct + NUMPHYSICALVGPRS);
    }

    public static int nnumPhysicalSgprs(long struct) {
        return MemoryUtil.memGetInt(struct + NUMPHYSICALSGPRS);
    }

    public static int nnumAvailableVgprs(long struct) {
        return MemoryUtil.memGetInt(struct + NUMAVAILABLEVGPRS);
    }

    public static int nnumAvailableSgprs(long struct) {
        return MemoryUtil.memGetInt(struct + NUMAVAILABLESGPRS);
    }

    public static IntBuffer ncomputeWorkGroupSize(long struct) {
        return MemoryUtil.memIntBuffer(struct + COMPUTEWORKGROUPSIZE, 3);
    }

    public static int ncomputeWorkGroupSize(long struct, int index) {
        return MemoryUtil.memGetInt(struct + COMPUTEWORKGROUPSIZE + (Checks.check(index, 3) * 4));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderStatisticsInfoAMD$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderStatisticsInfoAMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkShaderStatisticsInfoAMD, Buffer> {
        private static final VkShaderStatisticsInfoAMD ELEMENT_FACTORY = VkShaderStatisticsInfoAMD.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkShaderStatisticsInfoAMD.SIZEOF);
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
        public VkShaderStatisticsInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkShaderStageFlags")
        public int shaderStageMask() {
            return VkShaderStatisticsInfoAMD.nshaderStageMask(address());
        }

        public VkShaderResourceUsageAMD resourceUsage() {
            return VkShaderStatisticsInfoAMD.nresourceUsage(address());
        }

        @NativeType("uint32_t")
        public int numPhysicalVgprs() {
            return VkShaderStatisticsInfoAMD.nnumPhysicalVgprs(address());
        }

        @NativeType("uint32_t")
        public int numPhysicalSgprs() {
            return VkShaderStatisticsInfoAMD.nnumPhysicalSgprs(address());
        }

        @NativeType("uint32_t")
        public int numAvailableVgprs() {
            return VkShaderStatisticsInfoAMD.nnumAvailableVgprs(address());
        }

        @NativeType("uint32_t")
        public int numAvailableSgprs() {
            return VkShaderStatisticsInfoAMD.nnumAvailableSgprs(address());
        }

        @NativeType("uint32_t[3]")
        public IntBuffer computeWorkGroupSize() {
            return VkShaderStatisticsInfoAMD.ncomputeWorkGroupSize(address());
        }

        @NativeType("uint32_t")
        public int computeWorkGroupSize(int index) {
            return VkShaderStatisticsInfoAMD.ncomputeWorkGroupSize(address(), index);
        }
    }
}
