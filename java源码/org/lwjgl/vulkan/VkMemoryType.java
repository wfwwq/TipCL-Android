package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryType.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryType.class */
public class VkMemoryType extends Struct<VkMemoryType> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PROPERTYFLAGS;
    public static final int HEAPINDEX;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PROPERTYFLAGS = layout.offsetof(0);
        HEAPINDEX = layout.offsetof(1);
    }

    protected VkMemoryType(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryType create(long address, ByteBuffer container) {
        return new VkMemoryType(address, container);
    }

    public VkMemoryType(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkMemoryPropertyFlags")
    public int propertyFlags() {
        return npropertyFlags(address());
    }

    @NativeType("uint32_t")
    public int heapIndex() {
        return nheapIndex(address());
    }

    public static VkMemoryType create(long address) {
        return new VkMemoryType(address, null);
    }

    public static VkMemoryType createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryType(address, null);
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

    public static int npropertyFlags(long struct) {
        return MemoryUtil.memGetInt(struct + PROPERTYFLAGS);
    }

    public static int nheapIndex(long struct) {
        return MemoryUtil.memGetInt(struct + HEAPINDEX);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryType$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryType$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryType, Buffer> {
        private static final VkMemoryType ELEMENT_FACTORY = VkMemoryType.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryType.SIZEOF);
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
        public VkMemoryType getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkMemoryPropertyFlags")
        public int propertyFlags() {
            return VkMemoryType.npropertyFlags(address());
        }

        @NativeType("uint32_t")
        public int heapIndex() {
            return VkMemoryType.nheapIndex(address());
        }
    }
}
