package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalFenceProperties.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalFenceProperties.class */
public class VkExternalFenceProperties extends Struct<VkExternalFenceProperties> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int EXPORTFROMIMPORTEDHANDLETYPES;
    public static final int COMPATIBLEHANDLETYPES;
    public static final int EXTERNALFENCEFEATURES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        EXPORTFROMIMPORTEDHANDLETYPES = layout.offsetof(2);
        COMPATIBLEHANDLETYPES = layout.offsetof(3);
        EXTERNALFENCEFEATURES = layout.offsetof(4);
    }

    protected VkExternalFenceProperties(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkExternalFenceProperties create(long address, ByteBuffer container) {
        return new VkExternalFenceProperties(address, container);
    }

    public VkExternalFenceProperties(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("VkExternalFenceHandleTypeFlags")
    public int exportFromImportedHandleTypes() {
        return nexportFromImportedHandleTypes(address());
    }

    @NativeType("VkExternalFenceHandleTypeFlags")
    public int compatibleHandleTypes() {
        return ncompatibleHandleTypes(address());
    }

    @NativeType("VkExternalFenceFeatureFlags")
    public int externalFenceFeatures() {
        return nexternalFenceFeatures(address());
    }

    public VkExternalFenceProperties sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkExternalFenceProperties sType$Default() {
        return sType(1000112001);
    }

    public VkExternalFenceProperties pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkExternalFenceProperties set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkExternalFenceProperties set(VkExternalFenceProperties src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkExternalFenceProperties malloc() {
        return new VkExternalFenceProperties(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkExternalFenceProperties calloc() {
        return new VkExternalFenceProperties(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkExternalFenceProperties create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkExternalFenceProperties(MemoryUtil.memAddress(container), container);
    }

    public static VkExternalFenceProperties create(long address) {
        return new VkExternalFenceProperties(address, null);
    }

    public static VkExternalFenceProperties createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkExternalFenceProperties(address, null);
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

    public static VkExternalFenceProperties malloc(MemoryStack stack) {
        return new VkExternalFenceProperties(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkExternalFenceProperties calloc(MemoryStack stack) {
        return new VkExternalFenceProperties(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nexportFromImportedHandleTypes(long struct) {
        return MemoryUtil.memGetInt(struct + EXPORTFROMIMPORTEDHANDLETYPES);
    }

    public static int ncompatibleHandleTypes(long struct) {
        return MemoryUtil.memGetInt(struct + COMPATIBLEHANDLETYPES);
    }

    public static int nexternalFenceFeatures(long struct) {
        return MemoryUtil.memGetInt(struct + EXTERNALFENCEFEATURES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalFenceProperties$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkExternalFenceProperties$Buffer.class */
    public static class Buffer extends StructBuffer<VkExternalFenceProperties, Buffer> implements NativeResource {
        private static final VkExternalFenceProperties ELEMENT_FACTORY = VkExternalFenceProperties.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkExternalFenceProperties.SIZEOF);
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
        public VkExternalFenceProperties getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkExternalFenceProperties.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkExternalFenceProperties.npNext(address());
        }

        @NativeType("VkExternalFenceHandleTypeFlags")
        public int exportFromImportedHandleTypes() {
            return VkExternalFenceProperties.nexportFromImportedHandleTypes(address());
        }

        @NativeType("VkExternalFenceHandleTypeFlags")
        public int compatibleHandleTypes() {
            return VkExternalFenceProperties.ncompatibleHandleTypes(address());
        }

        @NativeType("VkExternalFenceFeatureFlags")
        public int externalFenceFeatures() {
            return VkExternalFenceProperties.nexternalFenceFeatures(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkExternalFenceProperties.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000112001);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkExternalFenceProperties.npNext(address(), value);
            return this;
        }
    }
}
