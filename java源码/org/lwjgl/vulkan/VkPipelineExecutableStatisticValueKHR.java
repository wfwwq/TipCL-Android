package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineExecutableStatisticValueKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineExecutableStatisticValueKHR.class */
public class VkPipelineExecutableStatisticValueKHR extends Struct<VkPipelineExecutableStatisticValueKHR> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int B32;
    public static final int I64;
    public static final int U64;
    public static final int F64;

    static {
        Struct.Layout layout = __union(__member(4), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        B32 = layout.offsetof(0);
        I64 = layout.offsetof(1);
        U64 = layout.offsetof(2);
        F64 = layout.offsetof(3);
    }

    protected VkPipelineExecutableStatisticValueKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineExecutableStatisticValueKHR create(long address, ByteBuffer container) {
        return new VkPipelineExecutableStatisticValueKHR(address, container);
    }

    public VkPipelineExecutableStatisticValueKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkBool32")
    public boolean b32() {
        return nb32(address()) != 0;
    }

    @NativeType("int64_t")
    public long i64() {
        return ni64(address());
    }

    @NativeType("uint64_t")
    public long u64() {
        return nu64(address());
    }

    public double f64() {
        return nf64(address());
    }

    public static VkPipelineExecutableStatisticValueKHR create(long address) {
        return new VkPipelineExecutableStatisticValueKHR(address, null);
    }

    public static VkPipelineExecutableStatisticValueKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineExecutableStatisticValueKHR(address, null);
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

    public static int nb32(long struct) {
        return MemoryUtil.memGetInt(struct + B32);
    }

    public static long ni64(long struct) {
        return MemoryUtil.memGetLong(struct + I64);
    }

    public static long nu64(long struct) {
        return MemoryUtil.memGetLong(struct + U64);
    }

    public static double nf64(long struct) {
        return MemoryUtil.memGetDouble(struct + F64);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineExecutableStatisticValueKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineExecutableStatisticValueKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineExecutableStatisticValueKHR, Buffer> {
        private static final VkPipelineExecutableStatisticValueKHR ELEMENT_FACTORY = VkPipelineExecutableStatisticValueKHR.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineExecutableStatisticValueKHR.SIZEOF);
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
        public VkPipelineExecutableStatisticValueKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkBool32")
        public boolean b32() {
            return VkPipelineExecutableStatisticValueKHR.nb32(address()) != 0;
        }

        @NativeType("int64_t")
        public long i64() {
            return VkPipelineExecutableStatisticValueKHR.ni64(address());
        }

        @NativeType("uint64_t")
        public long u64() {
            return VkPipelineExecutableStatisticValueKHR.nu64(address());
        }

        public double f64() {
            return VkPipelineExecutableStatisticValueKHR.nf64(address());
        }
    }
}
