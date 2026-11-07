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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayModePropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayModePropertiesKHR.class */
public class VkDisplayModePropertiesKHR extends Struct<VkDisplayModePropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DISPLAYMODE;
    public static final int PARAMETERS;

    static {
        Struct.Layout layout = __struct(__member(8), __member(VkDisplayModeParametersKHR.SIZEOF, VkDisplayModeParametersKHR.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DISPLAYMODE = layout.offsetof(0);
        PARAMETERS = layout.offsetof(1);
    }

    protected VkDisplayModePropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDisplayModePropertiesKHR create(long address, ByteBuffer container) {
        return new VkDisplayModePropertiesKHR(address, container);
    }

    public VkDisplayModePropertiesKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkDisplayModeKHR")
    public long displayMode() {
        return ndisplayMode(address());
    }

    public VkDisplayModeParametersKHR parameters() {
        return nparameters(address());
    }

    public static VkDisplayModePropertiesKHR malloc() {
        return new VkDisplayModePropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDisplayModePropertiesKHR calloc() {
        return new VkDisplayModePropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDisplayModePropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayModePropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDisplayModePropertiesKHR create(long address) {
        return new VkDisplayModePropertiesKHR(address, null);
    }

    public static VkDisplayModePropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDisplayModePropertiesKHR(address, null);
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

    public static VkDisplayModePropertiesKHR malloc(MemoryStack stack) {
        return new VkDisplayModePropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDisplayModePropertiesKHR calloc(MemoryStack stack) {
        return new VkDisplayModePropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long ndisplayMode(long struct) {
        return MemoryUtil.memGetLong(struct + DISPLAYMODE);
    }

    public static VkDisplayModeParametersKHR nparameters(long struct) {
        return VkDisplayModeParametersKHR.create(struct + PARAMETERS);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayModePropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayModePropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDisplayModePropertiesKHR, Buffer> implements NativeResource {
        private static final VkDisplayModePropertiesKHR ELEMENT_FACTORY = VkDisplayModePropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDisplayModePropertiesKHR.SIZEOF);
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
        public VkDisplayModePropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkDisplayModeKHR")
        public long displayMode() {
            return VkDisplayModePropertiesKHR.ndisplayMode(address());
        }

        public VkDisplayModeParametersKHR parameters() {
            return VkDisplayModePropertiesKHR.nparameters(address());
        }
    }
}
