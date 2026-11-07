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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchIndirectCommand.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchIndirectCommand.class */
public class VkDispatchIndirectCommand extends Struct<VkDispatchIndirectCommand> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int X;
    public static final int Y;
    public static final int Z;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        Z = layout.offsetof(2);
    }

    protected VkDispatchIndirectCommand(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDispatchIndirectCommand create(long address, ByteBuffer container) {
        return new VkDispatchIndirectCommand(address, container);
    }

    public VkDispatchIndirectCommand(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int x() {
        return nx(address());
    }

    @NativeType("uint32_t")
    public int y() {
        return ny(address());
    }

    @NativeType("uint32_t")
    public int z() {
        return nz(address());
    }

    public VkDispatchIndirectCommand x(@NativeType("uint32_t") int value) {
        nx(address(), value);
        return this;
    }

    public VkDispatchIndirectCommand y(@NativeType("uint32_t") int value) {
        ny(address(), value);
        return this;
    }

    public VkDispatchIndirectCommand z(@NativeType("uint32_t") int value) {
        nz(address(), value);
        return this;
    }

    public VkDispatchIndirectCommand set(int x, int y, int z) {
        x(x);
        y(y);
        z(z);
        return this;
    }

    public VkDispatchIndirectCommand set(VkDispatchIndirectCommand src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDispatchIndirectCommand malloc() {
        return new VkDispatchIndirectCommand(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDispatchIndirectCommand calloc() {
        return new VkDispatchIndirectCommand(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDispatchIndirectCommand create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDispatchIndirectCommand(MemoryUtil.memAddress(container), container);
    }

    public static VkDispatchIndirectCommand create(long address) {
        return new VkDispatchIndirectCommand(address, null);
    }

    public static VkDispatchIndirectCommand createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDispatchIndirectCommand(address, null);
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

    public static VkDispatchIndirectCommand malloc(MemoryStack stack) {
        return new VkDispatchIndirectCommand(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDispatchIndirectCommand calloc(MemoryStack stack) {
        return new VkDispatchIndirectCommand(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nx(long struct) {
        return MemoryUtil.memGetInt(struct + X);
    }

    public static int ny(long struct) {
        return MemoryUtil.memGetInt(struct + Y);
    }

    public static int nz(long struct) {
        return MemoryUtil.memGetInt(struct + Z);
    }

    public static void nx(long struct, int value) {
        MemoryUtil.memPutInt(struct + X, value);
    }

    public static void ny(long struct, int value) {
        MemoryUtil.memPutInt(struct + Y, value);
    }

    public static void nz(long struct, int value) {
        MemoryUtil.memPutInt(struct + Z, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchIndirectCommand$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDispatchIndirectCommand$Buffer.class */
    public static class Buffer extends StructBuffer<VkDispatchIndirectCommand, Buffer> implements NativeResource {
        private static final VkDispatchIndirectCommand ELEMENT_FACTORY = VkDispatchIndirectCommand.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDispatchIndirectCommand.SIZEOF);
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
        public VkDispatchIndirectCommand getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int x() {
            return VkDispatchIndirectCommand.nx(address());
        }

        @NativeType("uint32_t")
        public int y() {
            return VkDispatchIndirectCommand.ny(address());
        }

        @NativeType("uint32_t")
        public int z() {
            return VkDispatchIndirectCommand.nz(address());
        }

        public Buffer x(@NativeType("uint32_t") int value) {
            VkDispatchIndirectCommand.nx(address(), value);
            return this;
        }

        public Buffer y(@NativeType("uint32_t") int value) {
            VkDispatchIndirectCommand.ny(address(), value);
            return this;
        }

        public Buffer z(@NativeType("uint32_t") int value) {
            VkDispatchIndirectCommand.nz(address(), value);
            return this;
        }
    }
}
