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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayModeParametersKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayModeParametersKHR.class */
public class VkDisplayModeParametersKHR extends Struct<VkDisplayModeParametersKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VISIBLEREGION;
    public static final int REFRESHRATE;

    static {
        Struct.Layout layout = __struct(__member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VISIBLEREGION = layout.offsetof(0);
        REFRESHRATE = layout.offsetof(1);
    }

    protected VkDisplayModeParametersKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDisplayModeParametersKHR create(long address, ByteBuffer container) {
        return new VkDisplayModeParametersKHR(address, container);
    }

    public VkDisplayModeParametersKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    public VkExtent2D visibleRegion() {
        return nvisibleRegion(address());
    }

    @NativeType("uint32_t")
    public int refreshRate() {
        return nrefreshRate(address());
    }

    public VkDisplayModeParametersKHR visibleRegion(VkExtent2D value) {
        nvisibleRegion(address(), value);
        return this;
    }

    public VkDisplayModeParametersKHR visibleRegion(Consumer<VkExtent2D> consumer) {
        consumer.accept(visibleRegion());
        return this;
    }

    public VkDisplayModeParametersKHR refreshRate(@NativeType("uint32_t") int value) {
        nrefreshRate(address(), value);
        return this;
    }

    public VkDisplayModeParametersKHR set(VkExtent2D visibleRegion, int refreshRate) {
        visibleRegion(visibleRegion);
        refreshRate(refreshRate);
        return this;
    }

    public VkDisplayModeParametersKHR set(VkDisplayModeParametersKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDisplayModeParametersKHR malloc() {
        return new VkDisplayModeParametersKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDisplayModeParametersKHR calloc() {
        return new VkDisplayModeParametersKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDisplayModeParametersKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayModeParametersKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDisplayModeParametersKHR create(long address) {
        return new VkDisplayModeParametersKHR(address, null);
    }

    public static VkDisplayModeParametersKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDisplayModeParametersKHR(address, null);
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

    public static VkDisplayModeParametersKHR malloc(MemoryStack stack) {
        return new VkDisplayModeParametersKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDisplayModeParametersKHR calloc(MemoryStack stack) {
        return new VkDisplayModeParametersKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static VkExtent2D nvisibleRegion(long struct) {
        return VkExtent2D.create(struct + VISIBLEREGION);
    }

    public static int nrefreshRate(long struct) {
        return MemoryUtil.memGetInt(struct + REFRESHRATE);
    }

    public static void nvisibleRegion(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + VISIBLEREGION, VkExtent2D.SIZEOF);
    }

    public static void nrefreshRate(long struct, int value) {
        MemoryUtil.memPutInt(struct + REFRESHRATE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayModeParametersKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayModeParametersKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDisplayModeParametersKHR, Buffer> implements NativeResource {
        private static final VkDisplayModeParametersKHR ELEMENT_FACTORY = VkDisplayModeParametersKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDisplayModeParametersKHR.SIZEOF);
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
        public VkDisplayModeParametersKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        public VkExtent2D visibleRegion() {
            return VkDisplayModeParametersKHR.nvisibleRegion(address());
        }

        @NativeType("uint32_t")
        public int refreshRate() {
            return VkDisplayModeParametersKHR.nrefreshRate(address());
        }

        public Buffer visibleRegion(VkExtent2D value) {
            VkDisplayModeParametersKHR.nvisibleRegion(address(), value);
            return this;
        }

        public Buffer visibleRegion(Consumer<VkExtent2D> consumer) {
            consumer.accept(visibleRegion());
            return this;
        }

        public Buffer refreshRate(@NativeType("uint32_t") int value) {
            VkDisplayModeParametersKHR.nrefreshRate(address(), value);
            return this;
        }
    }
}
