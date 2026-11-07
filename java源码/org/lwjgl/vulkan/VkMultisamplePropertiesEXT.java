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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultisamplePropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultisamplePropertiesEXT.class */
public class VkMultisamplePropertiesEXT extends Struct<VkMultisamplePropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXSAMPLELOCATIONGRIDSIZE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXSAMPLELOCATIONGRIDSIZE = layout.offsetof(2);
    }

    protected VkMultisamplePropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMultisamplePropertiesEXT create(long address, ByteBuffer container) {
        return new VkMultisamplePropertiesEXT(address, container);
    }

    public VkMultisamplePropertiesEXT(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    public VkExtent2D maxSampleLocationGridSize() {
        return nmaxSampleLocationGridSize(address());
    }

    public VkMultisamplePropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMultisamplePropertiesEXT sType$Default() {
        return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT);
    }

    public VkMultisamplePropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMultisamplePropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkMultisamplePropertiesEXT set(VkMultisamplePropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMultisamplePropertiesEXT malloc() {
        return new VkMultisamplePropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMultisamplePropertiesEXT calloc() {
        return new VkMultisamplePropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMultisamplePropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMultisamplePropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMultisamplePropertiesEXT create(long address) {
        return new VkMultisamplePropertiesEXT(address, null);
    }

    public static VkMultisamplePropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMultisamplePropertiesEXT(address, null);
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

    public static VkMultisamplePropertiesEXT malloc(MemoryStack stack) {
        return new VkMultisamplePropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMultisamplePropertiesEXT calloc(MemoryStack stack) {
        return new VkMultisamplePropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkExtent2D nmaxSampleLocationGridSize(long struct) {
        return VkExtent2D.create(struct + MAXSAMPLELOCATIONGRIDSIZE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultisamplePropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMultisamplePropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMultisamplePropertiesEXT, Buffer> implements NativeResource {
        private static final VkMultisamplePropertiesEXT ELEMENT_FACTORY = VkMultisamplePropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMultisamplePropertiesEXT.SIZEOF);
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
        public VkMultisamplePropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMultisamplePropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkMultisamplePropertiesEXT.npNext(address());
        }

        public VkExtent2D maxSampleLocationGridSize() {
            return VkMultisamplePropertiesEXT.nmaxSampleLocationGridSize(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMultisamplePropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkMultisamplePropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
