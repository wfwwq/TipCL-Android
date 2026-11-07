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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugMarkerObjectTagInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugMarkerObjectTagInfoEXT.class */
public class VkDebugMarkerObjectTagInfoEXT extends Struct<VkDebugMarkerObjectTagInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int OBJECTTYPE;
    public static final int OBJECT;
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
        OBJECT = layout.offsetof(3);
        TAGNAME = layout.offsetof(4);
        TAGSIZE = layout.offsetof(5);
        PTAG = layout.offsetof(6);
    }

    protected VkDebugMarkerObjectTagInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDebugMarkerObjectTagInfoEXT create(long address, ByteBuffer container) {
        return new VkDebugMarkerObjectTagInfoEXT(address, container);
    }

    public VkDebugMarkerObjectTagInfoEXT(ByteBuffer container) {
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

    @NativeType("VkDebugReportObjectTypeEXT")
    public int objectType() {
        return nobjectType(address());
    }

    @NativeType("uint64_t")
    public long object() {
        return nobject(address());
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

    public VkDebugMarkerObjectTagInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDebugMarkerObjectTagInfoEXT sType$Default() {
        return sType(EXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT);
    }

    public VkDebugMarkerObjectTagInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDebugMarkerObjectTagInfoEXT objectType(@NativeType("VkDebugReportObjectTypeEXT") int value) {
        nobjectType(address(), value);
        return this;
    }

    public VkDebugMarkerObjectTagInfoEXT object(@NativeType("uint64_t") long value) {
        nobject(address(), value);
        return this;
    }

    public VkDebugMarkerObjectTagInfoEXT tagName(@NativeType("uint64_t") long value) {
        ntagName(address(), value);
        return this;
    }

    public VkDebugMarkerObjectTagInfoEXT pTag(@NativeType("void const *") ByteBuffer value) {
        npTag(address(), value);
        return this;
    }

    public VkDebugMarkerObjectTagInfoEXT set(int sType, long pNext, int objectType, long object, long tagName, ByteBuffer pTag) {
        sType(sType);
        pNext(pNext);
        objectType(objectType);
        object(object);
        tagName(tagName);
        pTag(pTag);
        return this;
    }

    public VkDebugMarkerObjectTagInfoEXT set(VkDebugMarkerObjectTagInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDebugMarkerObjectTagInfoEXT malloc() {
        return new VkDebugMarkerObjectTagInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDebugMarkerObjectTagInfoEXT calloc() {
        return new VkDebugMarkerObjectTagInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDebugMarkerObjectTagInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDebugMarkerObjectTagInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDebugMarkerObjectTagInfoEXT create(long address) {
        return new VkDebugMarkerObjectTagInfoEXT(address, null);
    }

    public static VkDebugMarkerObjectTagInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDebugMarkerObjectTagInfoEXT(address, null);
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

    public static VkDebugMarkerObjectTagInfoEXT malloc(MemoryStack stack) {
        return new VkDebugMarkerObjectTagInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDebugMarkerObjectTagInfoEXT calloc(MemoryStack stack) {
        return new VkDebugMarkerObjectTagInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nobject(long struct) {
        return MemoryUtil.memGetLong(struct + OBJECT);
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

    public static void nobject(long struct, long value) {
        MemoryUtil.memPutLong(struct + OBJECT, value);
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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugMarkerObjectTagInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugMarkerObjectTagInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDebugMarkerObjectTagInfoEXT, Buffer> implements NativeResource {
        private static final VkDebugMarkerObjectTagInfoEXT ELEMENT_FACTORY = VkDebugMarkerObjectTagInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDebugMarkerObjectTagInfoEXT.SIZEOF);
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
        public VkDebugMarkerObjectTagInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDebugMarkerObjectTagInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDebugMarkerObjectTagInfoEXT.npNext(address());
        }

        @NativeType("VkDebugReportObjectTypeEXT")
        public int objectType() {
            return VkDebugMarkerObjectTagInfoEXT.nobjectType(address());
        }

        @NativeType("uint64_t")
        public long object() {
            return VkDebugMarkerObjectTagInfoEXT.nobject(address());
        }

        @NativeType("uint64_t")
        public long tagName() {
            return VkDebugMarkerObjectTagInfoEXT.ntagName(address());
        }

        @NativeType("size_t")
        public long tagSize() {
            return VkDebugMarkerObjectTagInfoEXT.ntagSize(address());
        }

        @NativeType("void const *")
        public ByteBuffer pTag() {
            return VkDebugMarkerObjectTagInfoEXT.npTag(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDebugMarkerObjectTagInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDebugMarkerObjectTagInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer objectType(@NativeType("VkDebugReportObjectTypeEXT") int value) {
            VkDebugMarkerObjectTagInfoEXT.nobjectType(address(), value);
            return this;
        }

        public Buffer object(@NativeType("uint64_t") long value) {
            VkDebugMarkerObjectTagInfoEXT.nobject(address(), value);
            return this;
        }

        public Buffer tagName(@NativeType("uint64_t") long value) {
            VkDebugMarkerObjectTagInfoEXT.ntagName(address(), value);
            return this;
        }

        public Buffer pTag(@NativeType("void const *") ByteBuffer value) {
            VkDebugMarkerObjectTagInfoEXT.npTag(address(), value);
            return this;
        }
    }
}
