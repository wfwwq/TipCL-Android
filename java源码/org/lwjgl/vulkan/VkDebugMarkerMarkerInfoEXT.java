package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugMarkerMarkerInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugMarkerMarkerInfoEXT.class */
public class VkDebugMarkerMarkerInfoEXT extends Struct<VkDebugMarkerMarkerInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PMARKERNAME;
    public static final int COLOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __array(4, 4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PMARKERNAME = layout.offsetof(2);
        COLOR = layout.offsetof(3);
    }

    protected VkDebugMarkerMarkerInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDebugMarkerMarkerInfoEXT create(long address, ByteBuffer container) {
        return new VkDebugMarkerMarkerInfoEXT(address, container);
    }

    public VkDebugMarkerMarkerInfoEXT(ByteBuffer container) {
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

    @NativeType("char const *")
    public ByteBuffer pMarkerName() {
        return npMarkerName(address());
    }

    @NativeType("char const *")
    public String pMarkerNameString() {
        return npMarkerNameString(address());
    }

    @NativeType("float[4]")
    public FloatBuffer color() {
        return ncolor(address());
    }

    public float color(int index) {
        return ncolor(address(), index);
    }

    public VkDebugMarkerMarkerInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDebugMarkerMarkerInfoEXT sType$Default() {
        return sType(EXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT);
    }

    public VkDebugMarkerMarkerInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDebugMarkerMarkerInfoEXT pMarkerName(@NativeType("char const *") ByteBuffer value) {
        npMarkerName(address(), value);
        return this;
    }

    public VkDebugMarkerMarkerInfoEXT color(@NativeType("float[4]") FloatBuffer value) {
        ncolor(address(), value);
        return this;
    }

    public VkDebugMarkerMarkerInfoEXT color(int index, float value) {
        ncolor(address(), index, value);
        return this;
    }

    public VkDebugMarkerMarkerInfoEXT set(int sType, long pNext, ByteBuffer pMarkerName, FloatBuffer color) {
        sType(sType);
        pNext(pNext);
        pMarkerName(pMarkerName);
        color(color);
        return this;
    }

    public VkDebugMarkerMarkerInfoEXT set(VkDebugMarkerMarkerInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDebugMarkerMarkerInfoEXT malloc() {
        return new VkDebugMarkerMarkerInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDebugMarkerMarkerInfoEXT calloc() {
        return new VkDebugMarkerMarkerInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDebugMarkerMarkerInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDebugMarkerMarkerInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDebugMarkerMarkerInfoEXT create(long address) {
        return new VkDebugMarkerMarkerInfoEXT(address, null);
    }

    public static VkDebugMarkerMarkerInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDebugMarkerMarkerInfoEXT(address, null);
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

    public static VkDebugMarkerMarkerInfoEXT malloc(MemoryStack stack) {
        return new VkDebugMarkerMarkerInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDebugMarkerMarkerInfoEXT calloc(MemoryStack stack) {
        return new VkDebugMarkerMarkerInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer npMarkerName(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + PMARKERNAME));
    }

    public static String npMarkerNameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + PMARKERNAME));
    }

    public static FloatBuffer ncolor(long struct) {
        return MemoryUtil.memFloatBuffer(struct + COLOR, 4);
    }

    public static float ncolor(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + COLOR + (Checks.check(index, 4) * 4));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npMarkerName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + PMARKERNAME, MemoryUtil.memAddress(value));
    }

    public static void ncolor(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + COLOR, value.remaining() * 4);
    }

    public static void ncolor(long struct, int index, float value) {
        MemoryUtil.memPutFloat(struct + COLOR + (Checks.check(index, 4) * 4), value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PMARKERNAME));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugMarkerMarkerInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugMarkerMarkerInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDebugMarkerMarkerInfoEXT, Buffer> implements NativeResource {
        private static final VkDebugMarkerMarkerInfoEXT ELEMENT_FACTORY = VkDebugMarkerMarkerInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDebugMarkerMarkerInfoEXT.SIZEOF);
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
        public VkDebugMarkerMarkerInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDebugMarkerMarkerInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDebugMarkerMarkerInfoEXT.npNext(address());
        }

        @NativeType("char const *")
        public ByteBuffer pMarkerName() {
            return VkDebugMarkerMarkerInfoEXT.npMarkerName(address());
        }

        @NativeType("char const *")
        public String pMarkerNameString() {
            return VkDebugMarkerMarkerInfoEXT.npMarkerNameString(address());
        }

        @NativeType("float[4]")
        public FloatBuffer color() {
            return VkDebugMarkerMarkerInfoEXT.ncolor(address());
        }

        public float color(int index) {
            return VkDebugMarkerMarkerInfoEXT.ncolor(address(), index);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDebugMarkerMarkerInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDebugMarker.VK_STRUCTURE_TYPE_DEBUG_MARKER_MARKER_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDebugMarkerMarkerInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pMarkerName(@NativeType("char const *") ByteBuffer value) {
            VkDebugMarkerMarkerInfoEXT.npMarkerName(address(), value);
            return this;
        }

        public Buffer color(@NativeType("float[4]") FloatBuffer value) {
            VkDebugMarkerMarkerInfoEXT.ncolor(address(), value);
            return this;
        }

        public Buffer color(int index, float value) {
            VkDebugMarkerMarkerInfoEXT.ncolor(address(), index, value);
            return this;
        }
    }
}
