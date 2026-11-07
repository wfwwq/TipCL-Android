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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice8BitStorageFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice8BitStorageFeatures.class */
public class VkPhysicalDevice8BitStorageFeatures extends Struct<VkPhysicalDevice8BitStorageFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STORAGEBUFFER8BITACCESS;
    public static final int UNIFORMANDSTORAGEBUFFER8BITACCESS;
    public static final int STORAGEPUSHCONSTANT8;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STORAGEBUFFER8BITACCESS = layout.offsetof(2);
        UNIFORMANDSTORAGEBUFFER8BITACCESS = layout.offsetof(3);
        STORAGEPUSHCONSTANT8 = layout.offsetof(4);
    }

    protected VkPhysicalDevice8BitStorageFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevice8BitStorageFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDevice8BitStorageFeatures(address, container);
    }

    public VkPhysicalDevice8BitStorageFeatures(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean storageBuffer8BitAccess() {
        return nstorageBuffer8BitAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean uniformAndStorageBuffer8BitAccess() {
        return nuniformAndStorageBuffer8BitAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean storagePushConstant8() {
        return nstoragePushConstant8(address()) != 0;
    }

    public VkPhysicalDevice8BitStorageFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevice8BitStorageFeatures sType$Default() {
        return sType(1000177000);
    }

    public VkPhysicalDevice8BitStorageFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevice8BitStorageFeatures storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) {
        nstorageBuffer8BitAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevice8BitStorageFeatures uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) {
        nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevice8BitStorageFeatures storagePushConstant8(@NativeType("VkBool32") boolean value) {
        nstoragePushConstant8(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevice8BitStorageFeatures set(int sType, long pNext, boolean storageBuffer8BitAccess, boolean uniformAndStorageBuffer8BitAccess, boolean storagePushConstant8) {
        sType(sType);
        pNext(pNext);
        storageBuffer8BitAccess(storageBuffer8BitAccess);
        uniformAndStorageBuffer8BitAccess(uniformAndStorageBuffer8BitAccess);
        storagePushConstant8(storagePushConstant8);
        return this;
    }

    public VkPhysicalDevice8BitStorageFeatures set(VkPhysicalDevice8BitStorageFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevice8BitStorageFeatures malloc() {
        return new VkPhysicalDevice8BitStorageFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevice8BitStorageFeatures calloc() {
        return new VkPhysicalDevice8BitStorageFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevice8BitStorageFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevice8BitStorageFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevice8BitStorageFeatures create(long address) {
        return new VkPhysicalDevice8BitStorageFeatures(address, null);
    }

    public static VkPhysicalDevice8BitStorageFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevice8BitStorageFeatures(address, null);
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

    public static VkPhysicalDevice8BitStorageFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDevice8BitStorageFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevice8BitStorageFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDevice8BitStorageFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstorageBuffer8BitAccess(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGEBUFFER8BITACCESS);
    }

    public static int nuniformAndStorageBuffer8BitAccess(long struct) {
        return MemoryUtil.memGetInt(struct + UNIFORMANDSTORAGEBUFFER8BITACCESS);
    }

    public static int nstoragePushConstant8(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGEPUSHCONSTANT8);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstorageBuffer8BitAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + STORAGEBUFFER8BITACCESS, value);
    }

    public static void nuniformAndStorageBuffer8BitAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + UNIFORMANDSTORAGEBUFFER8BITACCESS, value);
    }

    public static void nstoragePushConstant8(long struct, int value) {
        MemoryUtil.memPutInt(struct + STORAGEPUSHCONSTANT8, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice8BitStorageFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice8BitStorageFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevice8BitStorageFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDevice8BitStorageFeatures ELEMENT_FACTORY = VkPhysicalDevice8BitStorageFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevice8BitStorageFeatures.SIZEOF);
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
        public VkPhysicalDevice8BitStorageFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevice8BitStorageFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevice8BitStorageFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean storageBuffer8BitAccess() {
            return VkPhysicalDevice8BitStorageFeatures.nstorageBuffer8BitAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean uniformAndStorageBuffer8BitAccess() {
            return VkPhysicalDevice8BitStorageFeatures.nuniformAndStorageBuffer8BitAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean storagePushConstant8() {
            return VkPhysicalDevice8BitStorageFeatures.nstoragePushConstant8(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevice8BitStorageFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000177000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevice8BitStorageFeatures.npNext(address(), value);
            return this;
        }

        public Buffer storageBuffer8BitAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevice8BitStorageFeatures.nstorageBuffer8BitAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer uniformAndStorageBuffer8BitAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevice8BitStorageFeatures.nuniformAndStorageBuffer8BitAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer storagePushConstant8(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevice8BitStorageFeatures.nstoragePushConstant8(address(), value ? 1 : 0);
            return this;
        }
    }
}
