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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLayerSettingEXT.class */
public class VkLayerSettingEXT extends Struct<VkLayerSettingEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PLAYERNAME;
    public static final int PSETTINGNAME;
    public static final int TYPE;
    public static final int VALUECOUNT;
    public static final int PVALUES;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PLAYERNAME = layout.offsetof(0);
        PSETTINGNAME = layout.offsetof(1);
        TYPE = layout.offsetof(2);
        VALUECOUNT = layout.offsetof(3);
        PVALUES = layout.offsetof(4);
    }

    protected VkLayerSettingEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkLayerSettingEXT create(long address, ByteBuffer container) {
        return new VkLayerSettingEXT(address, container);
    }

    public VkLayerSettingEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("char const *")
    public ByteBuffer pLayerName() {
        return npLayerName(address());
    }

    @NativeType("char const *")
    public String pLayerNameString() {
        return npLayerNameString(address());
    }

    @NativeType("char const *")
    public ByteBuffer pSettingName() {
        return npSettingName(address());
    }

    @NativeType("char const *")
    public String pSettingNameString() {
        return npSettingNameString(address());
    }

    @NativeType("VkLayerSettingTypeEXT")
    public int type() {
        return ntype(address());
    }

    @NativeType("uint32_t")
    public int valueCount() {
        return nvalueCount(address());
    }

    @NativeType("void const *")
    public ByteBuffer pValues(int capacity) {
        return npValues(address(), capacity);
    }

    public VkLayerSettingEXT pLayerName(@NativeType("char const *") ByteBuffer value) {
        npLayerName(address(), value);
        return this;
    }

    public VkLayerSettingEXT pSettingName(@NativeType("char const *") ByteBuffer value) {
        npSettingName(address(), value);
        return this;
    }

    public VkLayerSettingEXT type(@NativeType("VkLayerSettingTypeEXT") int value) {
        ntype(address(), value);
        return this;
    }

    public VkLayerSettingEXT valueCount(@NativeType("uint32_t") int value) {
        nvalueCount(address(), value);
        return this;
    }

    public VkLayerSettingEXT pValues(@NativeType("void const *") ByteBuffer value) {
        npValues(address(), value);
        return this;
    }

    public VkLayerSettingEXT set(ByteBuffer pLayerName, ByteBuffer pSettingName, int type, int valueCount, ByteBuffer pValues) {
        pLayerName(pLayerName);
        pSettingName(pSettingName);
        type(type);
        valueCount(valueCount);
        pValues(pValues);
        return this;
    }

    public VkLayerSettingEXT set(VkLayerSettingEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkLayerSettingEXT malloc() {
        return new VkLayerSettingEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkLayerSettingEXT calloc() {
        return new VkLayerSettingEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkLayerSettingEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLayerSettingEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkLayerSettingEXT create(long address) {
        return new VkLayerSettingEXT(address, null);
    }

    public static VkLayerSettingEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkLayerSettingEXT(address, null);
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

    public static VkLayerSettingEXT malloc(MemoryStack stack) {
        return new VkLayerSettingEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkLayerSettingEXT calloc(MemoryStack stack) {
        return new VkLayerSettingEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static ByteBuffer npLayerName(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + PLAYERNAME));
    }

    public static String npLayerNameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + PLAYERNAME));
    }

    public static ByteBuffer npSettingName(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + PSETTINGNAME));
    }

    public static String npSettingNameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + PSETTINGNAME));
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static int nvalueCount(long struct) {
        return MemoryUtil.memGetInt(struct + VALUECOUNT);
    }

    public static ByteBuffer npValues(long struct, int capacity) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + PVALUES), capacity);
    }

    public static void npLayerName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + PLAYERNAME, MemoryUtil.memAddress(value));
    }

    public static void npSettingName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + PSETTINGNAME, MemoryUtil.memAddress(value));
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void nvalueCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + VALUECOUNT, value);
    }

    public static void npValues(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PVALUES, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PLAYERNAME));
        Checks.check(MemoryUtil.memGetAddress(struct + PSETTINGNAME));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLayerSettingEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkLayerSettingEXT, Buffer> implements NativeResource {
        private static final VkLayerSettingEXT ELEMENT_FACTORY = VkLayerSettingEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkLayerSettingEXT.SIZEOF);
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
        public VkLayerSettingEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("char const *")
        public ByteBuffer pLayerName() {
            return VkLayerSettingEXT.npLayerName(address());
        }

        @NativeType("char const *")
        public String pLayerNameString() {
            return VkLayerSettingEXT.npLayerNameString(address());
        }

        @NativeType("char const *")
        public ByteBuffer pSettingName() {
            return VkLayerSettingEXT.npSettingName(address());
        }

        @NativeType("char const *")
        public String pSettingNameString() {
            return VkLayerSettingEXT.npSettingNameString(address());
        }

        @NativeType("VkLayerSettingTypeEXT")
        public int type() {
            return VkLayerSettingEXT.ntype(address());
        }

        @NativeType("uint32_t")
        public int valueCount() {
            return VkLayerSettingEXT.nvalueCount(address());
        }

        @NativeType("void const *")
        public ByteBuffer pValues(int capacity) {
            return VkLayerSettingEXT.npValues(address(), capacity);
        }

        public Buffer pLayerName(@NativeType("char const *") ByteBuffer value) {
            VkLayerSettingEXT.npLayerName(address(), value);
            return this;
        }

        public Buffer pSettingName(@NativeType("char const *") ByteBuffer value) {
            VkLayerSettingEXT.npSettingName(address(), value);
            return this;
        }

        public Buffer type(@NativeType("VkLayerSettingTypeEXT") int value) {
            VkLayerSettingEXT.ntype(address(), value);
            return this;
        }

        public Buffer valueCount(@NativeType("uint32_t") int value) {
            VkLayerSettingEXT.nvalueCount(address(), value);
            return this;
        }

        public Buffer pValues(@NativeType("void const *") ByteBuffer value) {
            VkLayerSettingEXT.npValues(address(), value);
            return this;
        }
    }
}
