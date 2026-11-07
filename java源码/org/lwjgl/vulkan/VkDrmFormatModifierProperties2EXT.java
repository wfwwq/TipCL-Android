package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrmFormatModifierProperties2EXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrmFormatModifierProperties2EXT.class */
public class VkDrmFormatModifierProperties2EXT extends Struct<VkDrmFormatModifierProperties2EXT> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int DRMFORMATMODIFIER;
    public static final int DRMFORMATMODIFIERPLANECOUNT;
    public static final int DRMFORMATMODIFIERTILINGFEATURES;

    static {
        Struct.Layout layout = __struct(__member(8), __member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        DRMFORMATMODIFIER = layout.offsetof(0);
        DRMFORMATMODIFIERPLANECOUNT = layout.offsetof(1);
        DRMFORMATMODIFIERTILINGFEATURES = layout.offsetof(2);
    }

    protected VkDrmFormatModifierProperties2EXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDrmFormatModifierProperties2EXT create(long address, ByteBuffer container) {
        return new VkDrmFormatModifierProperties2EXT(address, container);
    }

    public VkDrmFormatModifierProperties2EXT(ByteBuffer container) {
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

    @NativeType("VkFormatFeatureFlags2")
    public long drmFormatModifierTilingFeatures() {
        return ndrmFormatModifierTilingFeatures(address());
    }

    public static VkDrmFormatModifierProperties2EXT create(long address) {
        return new VkDrmFormatModifierProperties2EXT(address, null);
    }

    public static VkDrmFormatModifierProperties2EXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDrmFormatModifierProperties2EXT(address, null);
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

    public static long ndrmFormatModifierTilingFeatures(long struct) {
        return MemoryUtil.memGetLong(struct + DRMFORMATMODIFIERTILINGFEATURES);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrmFormatModifierProperties2EXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDrmFormatModifierProperties2EXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDrmFormatModifierProperties2EXT, Buffer> {
        private static final VkDrmFormatModifierProperties2EXT ELEMENT_FACTORY = VkDrmFormatModifierProperties2EXT.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDrmFormatModifierProperties2EXT.SIZEOF);
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
        public VkDrmFormatModifierProperties2EXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint64_t")
        public long drmFormatModifier() {
            return VkDrmFormatModifierProperties2EXT.ndrmFormatModifier(address());
        }

        @NativeType("uint32_t")
        public int drmFormatModifierPlaneCount() {
            return VkDrmFormatModifierProperties2EXT.ndrmFormatModifierPlaneCount(address());
        }

        @NativeType("VkFormatFeatureFlags2")
        public long drmFormatModifierTilingFeatures() {
            return VkDrmFormatModifierProperties2EXT.ndrmFormatModifierTilingFeatures(address());
        }
    }
}
