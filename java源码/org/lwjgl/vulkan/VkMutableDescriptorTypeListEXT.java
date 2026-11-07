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

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListEXT.class */
public class VkMutableDescriptorTypeListEXT extends Struct<VkMutableDescriptorTypeListEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DESCRIPTORTYPECOUNT;
    public static final int PDESCRIPTORTYPES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DESCRIPTORTYPECOUNT = layout.offsetof(0);
        PDESCRIPTORTYPES = layout.offsetof(1);
    }

    protected VkMutableDescriptorTypeListEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMutableDescriptorTypeListEXT create(long address, ByteBuffer container) {
        return new VkMutableDescriptorTypeListEXT(address, container);
    }

    public VkMutableDescriptorTypeListEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int descriptorTypeCount() {
        return ndescriptorTypeCount(address());
    }

    @NativeType("VkDescriptorType const *")
    public IntBuffer pDescriptorTypes() {
        return npDescriptorTypes(address());
    }

    public VkMutableDescriptorTypeListEXT pDescriptorTypes(@NativeType("VkDescriptorType const *") IntBuffer value) {
        npDescriptorTypes(address(), value);
        return this;
    }

    public VkMutableDescriptorTypeListEXT set(VkMutableDescriptorTypeListEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMutableDescriptorTypeListEXT malloc() {
        return new VkMutableDescriptorTypeListEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMutableDescriptorTypeListEXT calloc() {
        return new VkMutableDescriptorTypeListEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMutableDescriptorTypeListEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMutableDescriptorTypeListEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMutableDescriptorTypeListEXT create(long address) {
        return new VkMutableDescriptorTypeListEXT(address, null);
    }

    public static VkMutableDescriptorTypeListEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMutableDescriptorTypeListEXT(address, null);
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

    public static VkMutableDescriptorTypeListEXT malloc(MemoryStack stack) {
        return new VkMutableDescriptorTypeListEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMutableDescriptorTypeListEXT calloc(MemoryStack stack) {
        return new VkMutableDescriptorTypeListEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ndescriptorTypeCount(long struct) {
        return MemoryUtil.memGetInt(struct + DESCRIPTORTYPECOUNT);
    }

    public static IntBuffer npDescriptorTypes(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PDESCRIPTORTYPES), ndescriptorTypeCount(struct));
    }

    public static void ndescriptorTypeCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DESCRIPTORTYPECOUNT, value);
    }

    public static void npDescriptorTypes(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PDESCRIPTORTYPES, MemoryUtil.memAddressSafe(value));
        ndescriptorTypeCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (ndescriptorTypeCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PDESCRIPTORTYPES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeListEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMutableDescriptorTypeListEXT, Buffer> implements NativeResource {
        private static final VkMutableDescriptorTypeListEXT ELEMENT_FACTORY = VkMutableDescriptorTypeListEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMutableDescriptorTypeListEXT.SIZEOF);
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
        public VkMutableDescriptorTypeListEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int descriptorTypeCount() {
            return VkMutableDescriptorTypeListEXT.ndescriptorTypeCount(address());
        }

        @NativeType("VkDescriptorType const *")
        public IntBuffer pDescriptorTypes() {
            return VkMutableDescriptorTypeListEXT.npDescriptorTypes(address());
        }

        public Buffer pDescriptorTypes(@NativeType("VkDescriptorType const *") IntBuffer value) {
            VkMutableDescriptorTypeListEXT.npDescriptorTypes(address(), value);
            return this;
        }
    }
}
