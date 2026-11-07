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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsLabelEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsLabelEXT.class */
public class VkDebugUtilsLabelEXT extends Struct<VkDebugUtilsLabelEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PLABELNAME;
    public static final int COLOR;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __array(4, 4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PLABELNAME = layout.offsetof(2);
        COLOR = layout.offsetof(3);
    }

    protected VkDebugUtilsLabelEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDebugUtilsLabelEXT create(long address, ByteBuffer container) {
        return new VkDebugUtilsLabelEXT(address, container);
    }

    public VkDebugUtilsLabelEXT(ByteBuffer container) {
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
    public ByteBuffer pLabelName() {
        return npLabelName(address());
    }

    @NativeType("char const *")
    public String pLabelNameString() {
        return npLabelNameString(address());
    }

    @NativeType("float[4]")
    public FloatBuffer color() {
        return ncolor(address());
    }

    public float color(int index) {
        return ncolor(address(), index);
    }

    public VkDebugUtilsLabelEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDebugUtilsLabelEXT sType$Default() {
        return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT);
    }

    public VkDebugUtilsLabelEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDebugUtilsLabelEXT pLabelName(@NativeType("char const *") ByteBuffer value) {
        npLabelName(address(), value);
        return this;
    }

    public VkDebugUtilsLabelEXT color(@NativeType("float[4]") FloatBuffer value) {
        ncolor(address(), value);
        return this;
    }

    public VkDebugUtilsLabelEXT color(int index, float value) {
        ncolor(address(), index, value);
        return this;
    }

    public VkDebugUtilsLabelEXT set(int sType, long pNext, ByteBuffer pLabelName, FloatBuffer color) {
        sType(sType);
        pNext(pNext);
        pLabelName(pLabelName);
        color(color);
        return this;
    }

    public VkDebugUtilsLabelEXT set(VkDebugUtilsLabelEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDebugUtilsLabelEXT malloc() {
        return new VkDebugUtilsLabelEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDebugUtilsLabelEXT calloc() {
        return new VkDebugUtilsLabelEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDebugUtilsLabelEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDebugUtilsLabelEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDebugUtilsLabelEXT create(long address) {
        return new VkDebugUtilsLabelEXT(address, null);
    }

    public static VkDebugUtilsLabelEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDebugUtilsLabelEXT(address, null);
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

    public static VkDebugUtilsLabelEXT malloc(MemoryStack stack) {
        return new VkDebugUtilsLabelEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDebugUtilsLabelEXT calloc(MemoryStack stack) {
        return new VkDebugUtilsLabelEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer npLabelName(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + PLABELNAME));
    }

    public static String npLabelNameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + PLABELNAME));
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

    public static void npLabelName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + PLABELNAME, MemoryUtil.memAddress(value));
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
        Checks.check(MemoryUtil.memGetAddress(struct + PLABELNAME));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsLabelEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsLabelEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDebugUtilsLabelEXT, Buffer> implements NativeResource {
        private static final VkDebugUtilsLabelEXT ELEMENT_FACTORY = VkDebugUtilsLabelEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDebugUtilsLabelEXT.SIZEOF);
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
        public VkDebugUtilsLabelEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDebugUtilsLabelEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDebugUtilsLabelEXT.npNext(address());
        }

        @NativeType("char const *")
        public ByteBuffer pLabelName() {
            return VkDebugUtilsLabelEXT.npLabelName(address());
        }

        @NativeType("char const *")
        public String pLabelNameString() {
            return VkDebugUtilsLabelEXT.npLabelNameString(address());
        }

        @NativeType("float[4]")
        public FloatBuffer color() {
            return VkDebugUtilsLabelEXT.ncolor(address());
        }

        public float color(int index) {
            return VkDebugUtilsLabelEXT.ncolor(address(), index);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDebugUtilsLabelEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_LABEL_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDebugUtilsLabelEXT.npNext(address(), value);
            return this;
        }

        public Buffer pLabelName(@NativeType("char const *") ByteBuffer value) {
            VkDebugUtilsLabelEXT.npLabelName(address(), value);
            return this;
        }

        public Buffer color(@NativeType("float[4]") FloatBuffer value) {
            VkDebugUtilsLabelEXT.ncolor(address(), value);
            return this;
        }

        public Buffer color(int index, float value) {
            VkDebugUtilsLabelEXT.ncolor(address(), index, value);
            return this;
        }
    }
}
