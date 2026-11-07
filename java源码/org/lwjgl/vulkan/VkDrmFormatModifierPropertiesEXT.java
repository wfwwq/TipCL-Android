package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrmFormatModifierPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrmFormatModifierPropertiesEXT.class */
public class VkDrmFormatModifierPropertiesEXT extends Struct<VkDrmFormatModifierPropertiesEXT> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DRMFORMATMODIFIER;
    public static final int DRMFORMATMODIFIERPLANECOUNT;
    public static final int DRMFORMATMODIFIERTILINGFEATURES;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DRMFORMATMODIFIER = layout.offsetof(0);
        DRMFORMATMODIFIERPLANECOUNT = layout.offsetof(1);
        DRMFORMATMODIFIERTILINGFEATURES = layout.offsetof(2);
    }

    protected VkDrmFormatModifierPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDrmFormatModifierPropertiesEXT create(long address, ByteBuffer container) {
        return new VkDrmFormatModifierPropertiesEXT(address, container);
    }

    public VkDrmFormatModifierPropertiesEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint64_t")
    public long drmFormatModifier() {
        return ndrmFormatModifier(address());
    }

    @NativeType("uint32_t")
    public int drmFormatModifierPlaneCount() {
        return ndrmFormatModifierPlaneCount(address());
    }

    @NativeType("VkFormatFeatureFlags")
    public int drmFormatModifierTilingFeatures() {
        return ndrmFormatModifierTilingFeatures(address());
    }

    public static VkDrmFormatModifierPropertiesEXT create(long address) {
        return new VkDrmFormatModifierPropertiesEXT(address, null);
    }

    public static VkDrmFormatModifierPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDrmFormatModifierPropertiesEXT(address, null);
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

    public static long ndrmFormatModifier(long struct) {
        return MemoryUtil.memGetLong(struct + DRMFORMATMODIFIER);
    }

    public static int ndrmFormatModifierPlaneCount(long struct) {
        return MemoryUtil.memGetInt(struct + DRMFORMATMODIFIERPLANECOUNT);
    }

    public static int ndrmFormatModifierTilingFeatures(long struct) {
        return MemoryUtil.memGetInt(struct + DRMFORMATMODIFIERTILINGFEATURES);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrmFormatModifierPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrmFormatModifierPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDrmFormatModifierPropertiesEXT, Buffer> {
        private static final VkDrmFormatModifierPropertiesEXT ELEMENT_FACTORY = VkDrmFormatModifierPropertiesEXT.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDrmFormatModifierPropertiesEXT.SIZEOF);
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
        public VkDrmFormatModifierPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint64_t")
        public long drmFormatModifier() {
            return VkDrmFormatModifierPropertiesEXT.ndrmFormatModifier(address());
        }

        @NativeType("uint32_t")
        public int drmFormatModifierPlaneCount() {
            return VkDrmFormatModifierPropertiesEXT.ndrmFormatModifierPlaneCount(address());
        }

        @NativeType("VkFormatFeatureFlags")
        public int drmFormatModifierTilingFeatures() {
            return VkDrmFormatModifierPropertiesEXT.ndrmFormatModifierTilingFeatures(address());
        }
    }
}
