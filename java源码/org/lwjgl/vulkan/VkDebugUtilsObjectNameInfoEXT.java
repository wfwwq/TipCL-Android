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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsObjectNameInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsObjectNameInfoEXT.class */
public class VkDebugUtilsObjectNameInfoEXT extends Struct<VkDebugUtilsObjectNameInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int OBJECTTYPE;
    public static final int OBJECTHANDLE;
    public static final int POBJECTNAME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(8), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        OBJECTTYPE = layout.offsetof(2);
        OBJECTHANDLE = layout.offsetof(3);
        POBJECTNAME = layout.offsetof(4);
    }

    protected VkDebugUtilsObjectNameInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDebugUtilsObjectNameInfoEXT create(long address, ByteBuffer container) {
        return new VkDebugUtilsObjectNameInfoEXT(address, container);
    }

    public VkDebugUtilsObjectNameInfoEXT(ByteBuffer container) {
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

    @NativeType("char const *")
    public ByteBuffer pObjectName() {
        return npObjectName(address());
    }

    @NativeType("char const *")
    public String pObjectNameString() {
        return npObjectNameString(address());
    }

    public VkDebugUtilsObjectNameInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDebugUtilsObjectNameInfoEXT sType$Default() {
        return sType(1000128000);
    }

    public VkDebugUtilsObjectNameInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDebugUtilsObjectNameInfoEXT objectType(@NativeType("VkObjectType") int value) {
        nobjectType(address(), value);
        return this;
    }

    public VkDebugUtilsObjectNameInfoEXT objectHandle(@NativeType("uint64_t") long value) {
        nobjectHandle(address(), value);
        return this;
    }

    public VkDebugUtilsObjectNameInfoEXT pObjectName(@NativeType("char const *") ByteBuffer value) {
        npObjectName(address(), value);
        return this;
    }

    public VkDebugUtilsObjectNameInfoEXT set(int sType, long pNext, int objectType, long objectHandle, ByteBuffer pObjectName) {
        sType(sType);
        pNext(pNext);
        objectType(objectType);
        objectHandle(objectHandle);
        pObjectName(pObjectName);
        return this;
    }

    public VkDebugUtilsObjectNameInfoEXT set(VkDebugUtilsObjectNameInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDebugUtilsObjectNameInfoEXT malloc() {
        return new VkDebugUtilsObjectNameInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDebugUtilsObjectNameInfoEXT calloc() {
        return new VkDebugUtilsObjectNameInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDebugUtilsObjectNameInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDebugUtilsObjectNameInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDebugUtilsObjectNameInfoEXT create(long address) {
        return new VkDebugUtilsObjectNameInfoEXT(address, null);
    }

    public static VkDebugUtilsObjectNameInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDebugUtilsObjectNameInfoEXT(address, null);
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

    public static VkDebugUtilsObjectNameInfoEXT malloc(MemoryStack stack) {
        return new VkDebugUtilsObjectNameInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDebugUtilsObjectNameInfoEXT calloc(MemoryStack stack) {
        return new VkDebugUtilsObjectNameInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer npObjectName(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + POBJECTNAME));
    }

    public static String npObjectNameString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + POBJECTNAME));
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

    public static void npObjectName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + POBJECTNAME, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsObjectNameInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsObjectNameInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDebugUtilsObjectNameInfoEXT, Buffer> implements NativeResource {
        private static final VkDebugUtilsObjectNameInfoEXT ELEMENT_FACTORY = VkDebugUtilsObjectNameInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDebugUtilsObjectNameInfoEXT.SIZEOF);
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
        public VkDebugUtilsObjectNameInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDebugUtilsObjectNameInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDebugUtilsObjectNameInfoEXT.npNext(address());
        }

        @NativeType("VkObjectType")
        public int objectType() {
            return VkDebugUtilsObjectNameInfoEXT.nobjectType(address());
        }

        @NativeType("uint64_t")
        public long objectHandle() {
            return VkDebugUtilsObjectNameInfoEXT.nobjectHandle(address());
        }

        @NativeType("char const *")
        public ByteBuffer pObjectName() {
            return VkDebugUtilsObjectNameInfoEXT.npObjectName(address());
        }

        @NativeType("char const *")
        public String pObjectNameString() {
            return VkDebugUtilsObjectNameInfoEXT.npObjectNameString(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDebugUtilsObjectNameInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000128000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDebugUtilsObjectNameInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer objectType(@NativeType("VkObjectType") int value) {
            VkDebugUtilsObjectNameInfoEXT.nobjectType(address(), value);
            return this;
        }

        public Buffer objectHandle(@NativeType("uint64_t") long value) {
            VkDebugUtilsObjectNameInfoEXT.nobjectHandle(address(), value);
            return this;
        }

        public Buffer pObjectName(@NativeType("char const *") ByteBuffer value) {
            VkDebugUtilsObjectNameInfoEXT.npObjectName(address(), value);
            return this;
        }
    }
}
