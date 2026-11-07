package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryHeap.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryHeap.class */
public class VkMemoryHeap extends Struct<VkMemoryHeap> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SIZE;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SIZE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
    }

    protected VkMemoryHeap(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryHeap create(long address, ByteBuffer container) {
        return new VkMemoryHeap(address, container);
    }

    public VkMemoryHeap(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDeviceSize")
    public long size() {
        return nsize(address());
    }

    @NativeType("VkMemoryHeapFlags")
    public int flags() {
        return nflags(address());
    }

    public static VkMemoryHeap create(long address) {
        return new VkMemoryHeap(address, null);
    }

    public static VkMemoryHeap createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryHeap(address, null);
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

    public static long nsize(long struct) {
        return MemoryUtil.memGetLong(struct + SIZE);
    }

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryHeap$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryHeap$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryHeap, Buffer> {
        private static final VkMemoryHeap ELEMENT_FACTORY = VkMemoryHeap.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryHeap.SIZEOF);
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
        public VkMemoryHeap getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDeviceSize")
        public long size() {
            return VkMemoryHeap.nsize(address());
        }

        @NativeType("VkMemoryHeapFlags")
        public int flags() {
            return VkMemoryHeap.nflags(address());
        }
    }
}
