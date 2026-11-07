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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugMarkerObjectNameInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugMarkerObjectNameInfoEXT.class */
public class VkDebugMarkerObjectNameInfoEXT extends Struct<VkDebugMarkerObjectNameInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int OBJECTTYPE;
    public static final int OBJECT;
    public static final int POBJECTNAME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OBJECTTYPE = layout.offsetof(2);
        OBJECT = layout.offsetof(3);
        POBJECTNAME = layout.offsetof(4);
    }

    protected VkDebugMarkerObjectNameInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDebugMarkerObjectNameInfoEXT create(long address, ByteBuffer container) {
        return new VkDebugMarkerObjectNameInfoEXT(address, container);
    }

    public VkDebugMarkerObjectNameInfoEXT(ByteBuffer container) {
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

    @NativeType("char const *")
    public ByteBuffer pObjectName() {
        return npObjectName(address());
    }

    @NativeType("char const *")
    public String pObjectNameString() {
        return npObjectNameString(address());
    }

    public VkDebugMarkerObjectNameInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDebugMarkerObjectNameInfoEXT sType$Default() {
        return sType(EXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT);
    }

    public VkDebugMarkerObjectNameInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDebugMarkerObjectNameInfoEXT objectType(@NativeType("VkDebugReportObjectTypeEXT") int value) {
        nobjectType(address(), value);
        return this;
    }

    public VkDebugMarkerObjectNameInfoEXT object(@NativeType("uint64_t") long value) {
        nobject(address(), value);
        return this;
    }

    public VkDebugMarkerObjectNameInfoEXT pObjectName(@NativeType("char const *") ByteBuffer value) {
        npObjectName(address(), value);
        return this;
    }

    public VkDebugMarkerObjectNameInfoEXT set(int sType, long pNext, int objectType, long object, ByteBuffer pObjectName) {
        sType(sType);
        pNext(pNext);
        objectType(objectType);
        object(object);
        pObjectName(pObjectName);
        return this;
    }

    public VkDebugMarkerObjectNameInfoEXT set(VkDebugMarkerObjectNameInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDebugMarkerObjectNameInfoEXT malloc() {
        return new VkDebugMarkerObjectNameInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDebugMarkerObjectNameInfoEXT calloc() {
        return new VkDebugMarkerObjectNameInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDebugMarkerObjectNameInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDebugMarkerObjectNameInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDebugMarkerObjectNameInfoEXT create(long address) {
        return new VkDebugMarkerObjectNameInfoEXT(address, null);
    }

    public static VkDebugMarkerObjectNameInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDebugMarkerObjectNameInfoEXT(address, null);
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

    public static VkDebugMarkerObjectNameInfoEXT malloc(MemoryStack stack) {
        return new VkDebugMarkerObjectNameInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDebugMarkerObjectNameInfoEXT calloc(MemoryStack stack) {
        return new VkDebugMarkerObjectNameInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer npObjectName(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + POBJECTNAME));
    }

    public static String npObjectNameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + POBJECTNAME));
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

    public static void npObjectName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + POBJECTNAME, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + POBJECTNAME));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugMarkerObjectNameInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugMarkerObjectNameInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDebugMarkerObjectNameInfoEXT, Buffer> implements NativeResource {
        private static final VkDebugMarkerObjectNameInfoEXT ELEMENT_FACTORY = VkDebugMarkerObjectNameInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDebugMarkerObjectNameInfoEXT.SIZEOF);
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
        public VkDebugMarkerObjectNameInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDebugMarkerObjectNameInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDebugMarkerObjectNameInfoEXT.npNext(address());
        }

        @NativeType("VkDebugReportObjectTypeEXT")
        public int objectType() {
            return VkDebugMarkerObjectNameInfoEXT.nobjectType(address());
        }

        @NativeType("uint64_t")
        public long object() {
            return VkDebugMarkerObjectNameInfoEXT.nobject(address());
        }

        @NativeType("char const *")
        public ByteBuffer pObjectName() {
            return VkDebugMarkerObjectNameInfoEXT.npObjectName(address());
        }

        @NativeType("char const *")
        public String pObjectNameString() {
            return VkDebugMarkerObjectNameInfoEXT.npObjectNameString(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDebugMarkerObjectNameInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_NAME_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDebugMarkerObjectNameInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer objectType(@NativeType("VkDebugReportObjectTypeEXT") int value) {
            VkDebugMarkerObjectNameInfoEXT.nobjectType(address(), value);
            return this;
        }

        public Buffer object(@NativeType("uint64_t") long value) {
            VkDebugMarkerObjectNameInfoEXT.nobject(address(), value);
            return this;
        }

        public Buffer pObjectName(@NativeType("char const *") ByteBuffer value) {
            VkDebugMarkerObjectNameInfoEXT.npObjectName(address(), value);
            return this;
        }
    }
}
