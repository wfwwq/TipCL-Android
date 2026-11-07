package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryProperties.class */
public class VkExternalMemoryProperties extends Struct<VkExternalMemoryProperties> {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int EXTERNALMEMORYFEATURES;
    public static final int EXPORTFROMIMPORTEDHANDLETYPES;
    public static final int COMPATIBLEHANDLETYPES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        EXTERNALMEMORYFEATURES = layout.offsetof(0);
        EXPORTFROMIMPORTEDHANDLETYPES = layout.offsetof(1);
        COMPATIBLEHANDLETYPES = layout.offsetof(2);
    }

    protected VkExternalMemoryProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExternalMemoryProperties create(long address, ByteBuffer container) {
        return new VkExternalMemoryProperties(address, container);
    }

    public VkExternalMemoryProperties(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("VkExternalMemoryFeatureFlags")
    public int externalMemoryFeatures() {
        return nexternalMemoryFeatures(address());
    }

    @NativeType("VkExternalMemoryHandleTypeFlags")
    public int exportFromImportedHandleTypes() {
        return nexportFromImportedHandleTypes(address());
    }

    @NativeType("VkExternalMemoryHandleTypeFlags")
    public int compatibleHandleTypes() {
        return ncompatibleHandleTypes(address());
    }

    public static VkExternalMemoryProperties create(long address) {
        return new VkExternalMemoryProperties(address, null);
    }

    public static VkExternalMemoryProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalMemoryProperties(address, null);
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

    public static int nexternalMemoryFeatures(long struct) {
        return MemoryUtil.memGetInt(struct + EXTERNALMEMORYFEATURES);
    }

    public static int nexportFromImportedHandleTypes(long struct) {
        return MemoryUtil.memGetInt(struct + EXPORTFROMIMPORTEDHANDLETYPES);
    }

    public static int ncompatibleHandleTypes(long struct) {
        return MemoryUtil.memGetInt(struct + COMPATIBLEHANDLETYPES);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalMemoryProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkExternalMemoryProperties, Buffer> {
        private static final VkExternalMemoryProperties ELEMENT_FACTORY = VkExternalMemoryProperties.create(-1);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExternalMemoryProperties.SIZEOF);
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
        public VkExternalMemoryProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkExternalMemoryFeatureFlags")
        public int externalMemoryFeatures() {
            return VkExternalMemoryProperties.nexternalMemoryFeatures(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlags")
        public int exportFromImportedHandleTypes() {
            return VkExternalMemoryProperties.nexportFromImportedHandleTypes(address());
        }

        @NativeType("VkExternalMemoryHandleTypeFlags")
        public int compatibleHandleTypes() {
            return VkExternalMemoryProperties.ncompatibleHandleTypes(address());
        }
    }
}
