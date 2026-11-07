package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPresentInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPresentInfoKHR.class */
public class VkDisplayPresentInfoKHR extends Struct<VkDisplayPresentInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SRCRECT;
    public static final int DSTRECT;
    public static final int PERSISTENT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF), __member(VkRect2D.SIZEOF, VkRect2D.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCRECT = layout.offsetof(2);
        DSTRECT = layout.offsetof(3);
        PERSISTENT = layout.offsetof(4);
    }

    protected VkDisplayPresentInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDisplayPresentInfoKHR create(long address, ByteBuffer container) {
        return new VkDisplayPresentInfoKHR(address, container);
    }

    public VkDisplayPresentInfoKHR(ByteBuffer container) {
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

    public VkRect2D srcRect() {
        return nsrcRect(address());
    }

    public VkRect2D dstRect() {
        return ndstRect(address());
    }

    @NativeType("VkBool32")
    public boolean persistent() {
        return npersistent(address()) != 0;
    }

    public VkDisplayPresentInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDisplayPresentInfoKHR sType$Default() {
        return sType(KHRDisplaySwapchain.VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR);
    }

    public VkDisplayPresentInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDisplayPresentInfoKHR srcRect(VkRect2D value) {
        nsrcRect(address(), value);
        return this;
    }

    public VkDisplayPresentInfoKHR srcRect(Consumer<VkRect2D> consumer) {
        consumer.accept(srcRect());
        return this;
    }

    public VkDisplayPresentInfoKHR dstRect(VkRect2D value) {
        ndstRect(address(), value);
        return this;
    }

    public VkDisplayPresentInfoKHR dstRect(Consumer<VkRect2D> consumer) {
        consumer.accept(dstRect());
        return this;
    }

    public VkDisplayPresentInfoKHR persistent(@NativeType("VkBool32") boolean value) {
        npersistent(address(), value ? 1 : 0);
        return this;
    }

    public VkDisplayPresentInfoKHR set(int sType, long pNext, VkRect2D srcRect, VkRect2D dstRect, boolean persistent) {
        sType(sType);
        pNext(pNext);
        srcRect(srcRect);
        dstRect(dstRect);
        persistent(persistent);
        return this;
    }

    public VkDisplayPresentInfoKHR set(VkDisplayPresentInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDisplayPresentInfoKHR malloc() {
        return new VkDisplayPresentInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDisplayPresentInfoKHR calloc() {
        return new VkDisplayPresentInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDisplayPresentInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayPresentInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDisplayPresentInfoKHR create(long address) {
        return new VkDisplayPresentInfoKHR(address, null);
    }

    public static VkDisplayPresentInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDisplayPresentInfoKHR(address, null);
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

    public static VkDisplayPresentInfoKHR malloc(MemoryStack stack) {
        return new VkDisplayPresentInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDisplayPresentInfoKHR calloc(MemoryStack stack) {
        return new VkDisplayPresentInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkRect2D nsrcRect(long struct) {
        return VkRect2D.create(struct + SRCRECT);
    }

    public static VkRect2D ndstRect(long struct) {
        return VkRect2D.create(struct + DSTRECT);
    }

    public static int npersistent(long struct) {
        return MemoryUtil.memGetInt(struct + PERSISTENT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsrcRect(long struct, VkRect2D value) {
        MemoryUtil.memCopy(value.address(), struct + SRCRECT, VkRect2D.SIZEOF);
    }

    public static void ndstRect(long struct, VkRect2D value) {
        MemoryUtil.memCopy(value.address(), struct + DSTRECT, VkRect2D.SIZEOF);
    }

    public static void npersistent(long struct, int value) {
        MemoryUtil.memPutInt(struct + PERSISTENT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPresentInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPresentInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDisplayPresentInfoKHR, Buffer> implements NativeResource {
        private static final VkDisplayPresentInfoKHR ELEMENT_FACTORY = VkDisplayPresentInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDisplayPresentInfoKHR.SIZEOF);
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
        public VkDisplayPresentInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDisplayPresentInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDisplayPresentInfoKHR.npNext(address());
        }

        public VkRect2D srcRect() {
            return VkDisplayPresentInfoKHR.nsrcRect(address());
        }

        public VkRect2D dstRect() {
            return VkDisplayPresentInfoKHR.ndstRect(address());
        }

        @NativeType("VkBool32")
        public boolean persistent() {
            return VkDisplayPresentInfoKHR.npersistent(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDisplayPresentInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRDisplaySwapchain.VK_STRUCTURE_TYPE_DISPLAY_PRESENT_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDisplayPresentInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer srcRect(VkRect2D value) {
            VkDisplayPresentInfoKHR.nsrcRect(address(), value);
            return this;
        }

        public Buffer srcRect(Consumer<VkRect2D> consumer) {
            consumer.accept(srcRect());
            return this;
        }

        public Buffer dstRect(VkRect2D value) {
            VkDisplayPresentInfoKHR.ndstRect(address(), value);
            return this;
        }

        public Buffer dstRect(Consumer<VkRect2D> consumer) {
            consumer.accept(dstRect());
            return this;
        }

        public Buffer persistent(@NativeType("VkBool32") boolean value) {
            VkDisplayPresentInfoKHR.npersistent(address(), value ? 1 : 0);
            return this;
        }
    }
}
