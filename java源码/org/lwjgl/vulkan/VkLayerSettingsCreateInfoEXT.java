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
import org.lwjgl.vulkan.VkLayerSettingEXT;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLayerSettingsCreateInfoEXT.class */
public class VkLayerSettingsCreateInfoEXT extends Struct<VkLayerSettingsCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SETTINGCOUNT;
    public static final int PSETTINGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SETTINGCOUNT = layout.offsetof(2);
        PSETTINGS = layout.offsetof(3);
    }

    protected VkLayerSettingsCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkLayerSettingsCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkLayerSettingsCreateInfoEXT(address, container);
    }

    public VkLayerSettingsCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int settingCount() {
        return nsettingCount(address());
    }

    @NativeType("VkLayerSettingEXT const *")
    public VkLayerSettingEXT.Buffer pSettings() {
        return npSettings(address());
    }

    public VkLayerSettingsCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkLayerSettingsCreateInfoEXT sType$Default() {
        return sType(EXTLayerSettings.VK_STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT);
    }

    public VkLayerSettingsCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkLayerSettingsCreateInfoEXT pSettings(@NativeType("VkLayerSettingEXT const *") VkLayerSettingEXT.Buffer value) {
        npSettings(address(), value);
        return this;
    }

    public VkLayerSettingsCreateInfoEXT set(int sType, long pNext, VkLayerSettingEXT.Buffer pSettings) {
        sType(sType);
        pNext(pNext);
        pSettings(pSettings);
        return this;
    }

    public VkLayerSettingsCreateInfoEXT set(VkLayerSettingsCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkLayerSettingsCreateInfoEXT malloc() {
        return new VkLayerSettingsCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkLayerSettingsCreateInfoEXT calloc() {
        return new VkLayerSettingsCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkLayerSettingsCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkLayerSettingsCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkLayerSettingsCreateInfoEXT create(long address) {
        return new VkLayerSettingsCreateInfoEXT(address, null);
    }

    public static VkLayerSettingsCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkLayerSettingsCreateInfoEXT(address, null);
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

    public static VkLayerSettingsCreateInfoEXT malloc(MemoryStack stack) {
        return new VkLayerSettingsCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkLayerSettingsCreateInfoEXT calloc(MemoryStack stack) {
        return new VkLayerSettingsCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsettingCount(long struct) {
        return MemoryUtil.memGetInt(struct + SETTINGCOUNT);
    }

    public static VkLayerSettingEXT.Buffer npSettings(long struct) {
        return VkLayerSettingEXT.createSafe(MemoryUtil.memGetAddress(struct + PSETTINGS), nsettingCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsettingCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + SETTINGCOUNT, value);
    }

    public static void npSettings(long struct, VkLayerSettingEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PSETTINGS, MemoryUtil.memAddressSafe(value));
        nsettingCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        int settingCount = nsettingCount(struct);
        if (settingCount != 0) {
            long pSettings = MemoryUtil.memGetAddress(struct + PSETTINGS);
            Checks.check(pSettings);
            validate(pSettings, settingCount, VkLayerSettingEXT.SIZEOF, VkLayerSettingEXT::validate);
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkLayerSettingsCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkLayerSettingsCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkLayerSettingsCreateInfoEXT ELEMENT_FACTORY = VkLayerSettingsCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkLayerSettingsCreateInfoEXT.SIZEOF);
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
        public VkLayerSettingsCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkLayerSettingsCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkLayerSettingsCreateInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int settingCount() {
            return VkLayerSettingsCreateInfoEXT.nsettingCount(address());
        }

        @NativeType("VkLayerSettingEXT const *")
        public VkLayerSettingEXT.Buffer pSettings() {
            return VkLayerSettingsCreateInfoEXT.npSettings(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkLayerSettingsCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTLayerSettings.VK_STRUCTURE_TYPE_LAYER_SETTINGS_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkLayerSettingsCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pSettings(@NativeType("VkLayerSettingEXT const *") VkLayerSettingEXT.Buffer value) {
            VkLayerSettingsCreateInfoEXT.npSettings(address(), value);
            return this;
        }
    }
}
