package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsObjectTagInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsObjectTagInfoEXT.class */
public class VkDebugUtilsObjectTagInfoEXT extends Struct<VkDebugUtilsObjectTagInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int OBJECTTYPE;
    public static final int OBJECTHANDLE;
    public static final int TAGNAME;
    public static final int TAGSIZE;
    public static final int PTAG;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(8), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OBJECTTYPE = layout.offsetof(2);
        OBJECTHANDLE = layout.offsetof(3);
        TAGNAME = layout.offsetof(4);
        TAGSIZE = layout.offsetof(5);
        PTAG = layout.offsetof(6);
    }

    protected VkDebugUtilsObjectTagInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDebugUtilsObjectTagInfoEXT create(long address, ByteBuffer container) {
        return new VkDebugUtilsObjectTagInfoEXT(address, container);
    }

    public VkDebugUtilsObjectTagInfoEXT(ByteBuffer container) {
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

    @NativeType("VkObjectType")
    public int objectType() {
        return nobjectType(address());
    }

    @NativeType("uint64_t")
    public long objectHandle() {
        return nobjectHandle(address());
    }

    @NativeType("uint64_t")
    public long tagName() {
        return ntagName(address());
    }

    @NativeType("size_t")
    public long tagSize() {
        return ntagSize(address());
    }

    @NativeType("void const *")
    public ByteBuffer pTag() {
        return npTag(address());
    }

    public VkDebugUtilsObjectTagInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDebugUtilsObjectTagInfoEXT sType$Default() {
        return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT);
    }

    public VkDebugUtilsObjectTagInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDebugUtilsObjectTagInfoEXT objectType(@NativeType("VkObjectType") int value) {
        nobjectType(address(), value);
        return this;
    }

    public VkDebugUtilsObjectTagInfoEXT objectHandle(@NativeType("uint64_t") long value) {
        nobjectHandle(address(), value);
        return this;
    }

    public VkDebugUtilsObjectTagInfoEXT tagName(@NativeType("uint64_t") long value) {
        ntagName(address(), value);
        return this;
    }

    public VkDebugUtilsObjectTagInfoEXT pTag(@NativeType("void const *") ByteBuffer value) {
        npTag(address(), value);
        return this;
    }

    public VkDebugUtilsObjectTagInfoEXT set(int sType, long pNext, int objectType, long objectHandle, long tagName, ByteBuffer pTag) {
        sType(sType);
        pNext(pNext);
        objectType(objectType);
        objectHandle(objectHandle);
        tagName(tagName);
        pTag(pTag);
        return this;
    }

    public VkDebugUtilsObjectTagInfoEXT set(VkDebugUtilsObjectTagInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDebugUtilsObjectTagInfoEXT malloc() {
        return new VkDebugUtilsObjectTagInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDebugUtilsObjectTagInfoEXT calloc() {
        return new VkDebugUtilsObjectTagInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDebugUtilsObjectTagInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDebugUtilsObjectTagInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDebugUtilsObjectTagInfoEXT create(long address) {
        return new VkDebugUtilsObjectTagInfoEXT(address, null);
    }

    public static VkDebugUtilsObjectTagInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDebugUtilsObjectTagInfoEXT(address, null);
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

    public static VkDebugUtilsObjectTagInfoEXT malloc(MemoryStack stack) {
        return new VkDebugUtilsObjectTagInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDebugUtilsObjectTagInfoEXT calloc(MemoryStack stack) {
        return new VkDebugUtilsObjectTagInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nobjectType(long struct) {
        return MemoryUtil.memGetInt(struct + OBJECTTYPE);
    }

    public static long nobjectHandle(long struct) {
        return MemoryUtil.memGetLong(struct + OBJECTHANDLE);
    }

    public static long ntagName(long struct) {
        return MemoryUtil.memGetLong(struct + TAGNAME);
    }

    public static long ntagSize(long struct) {
        return MemoryUtil.memGetAddress(struct + TAGSIZE);
    }

    public static ByteBuffer npTag(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PTAG), (int) ntagSize(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nobjectType(long struct, int value) {
        MemoryUtil.memPutInt(struct + OBJECTTYPE, value);
    }

    public static void nobjectHandle(long struct, long value) {
        MemoryUtil.memPutLong(struct + OBJECTHANDLE, value);
    }

    public static void ntagName(long struct, long value) {
        MemoryUtil.memPutLong(struct + TAGNAME, value);
    }

    public static void ntagSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + TAGSIZE, value);
    }

    public static void npTag(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PTAG, MemoryUtil.memAddress(value));
        ntagSize(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PTAG));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsObjectTagInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsObjectTagInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDebugUtilsObjectTagInfoEXT, Buffer> implements NativeResource {
        private static final VkDebugUtilsObjectTagInfoEXT ELEMENT_FACTORY = VkDebugUtilsObjectTagInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDebugUtilsObjectTagInfoEXT.SIZEOF);
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
        public VkDebugUtilsObjectTagInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDebugUtilsObjectTagInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDebugUtilsObjectTagInfoEXT.npNext(address());
        }

        @NativeType("VkObjectType")
        public int objectType() {
            return VkDebugUtilsObjectTagInfoEXT.nobjectType(address());
        }

        @NativeType("uint64_t")
        public long objectHandle() {
            return VkDebugUtilsObjectTagInfoEXT.nobjectHandle(address());
        }

        @NativeType("uint64_t")
        public long tagName() {
            return VkDebugUtilsObjectTagInfoEXT.ntagName(address());
        }

        @NativeType("size_t")
        public long tagSize() {
            return VkDebugUtilsObjectTagInfoEXT.ntagSize(address());
        }

        @NativeType("void const *")
        public ByteBuffer pTag() {
            return VkDebugUtilsObjectTagInfoEXT.npTag(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDebugUtilsObjectTagInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_TAG_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDebugUtilsObjectTagInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer objectType(@NativeType("VkObjectType") int value) {
            VkDebugUtilsObjectTagInfoEXT.nobjectType(address(), value);
            return this;
        }

        public Buffer objectHandle(@NativeType("uint64_t") long value) {
            VkDebugUtilsObjectTagInfoEXT.nobjectHandle(address(), value);
            return this;
        }

        public Buffer tagName(@NativeType("uint64_t") long value) {
            VkDebugUtilsObjectTagInfoEXT.ntagName(address(), value);
            return this;
        }

        public Buffer pTag(@NativeType("void const *") ByteBuffer value) {
            VkDebugUtilsObjectTagInfoEXT.npTag(address(), value);
            return this;
        }
    }
}
