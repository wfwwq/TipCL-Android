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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice16BitStorageFeatures.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice16BitStorageFeatures.class */
public class VkPhysicalDevice16BitStorageFeatures extends Struct<VkPhysicalDevice16BitStorageFeatures> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STORAGEBUFFER16BITACCESS;
    public static final int UNIFORMANDSTORAGEBUFFER16BITACCESS;
    public static final int STORAGEPUSHCONSTANT16;
    public static final int STORAGEINPUTOUTPUT16;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STORAGEBUFFER16BITACCESS = layout.offsetof(2);
        UNIFORMANDSTORAGEBUFFER16BITACCESS = layout.offsetof(3);
        STORAGEPUSHCONSTANT16 = layout.offsetof(4);
        STORAGEINPUTOUTPUT16 = layout.offsetof(5);
    }

    protected VkPhysicalDevice16BitStorageFeatures(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevice16BitStorageFeatures create(long address, ByteBuffer container) {
        return new VkPhysicalDevice16BitStorageFeatures(address, container);
    }

    public VkPhysicalDevice16BitStorageFeatures(ByteBuffer container) {
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
    public boolean storageBuffer16BitAccess() {
        return nstorageBuffer16BitAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean uniformAndStorageBuffer16BitAccess() {
        return nuniformAndStorageBuffer16BitAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean storagePushConstant16() {
        return nstoragePushConstant16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean storageInputOutput16() {
        return nstorageInputOutput16(address()) != 0;
    }

    public VkPhysicalDevice16BitStorageFeatures sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevice16BitStorageFeatures sType$Default() {
        return sType(1000083000);
    }

    public VkPhysicalDevice16BitStorageFeatures pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevice16BitStorageFeatures storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) {
        nstorageBuffer16BitAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevice16BitStorageFeatures uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) {
        nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevice16BitStorageFeatures storagePushConstant16(@NativeType("VkBool32") boolean value) {
        nstoragePushConstant16(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevice16BitStorageFeatures storageInputOutput16(@NativeType("VkBool32") boolean value) {
        nstorageInputOutput16(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevice16BitStorageFeatures set(int sType, long pNext, boolean storageBuffer16BitAccess, boolean uniformAndStorageBuffer16BitAccess, boolean storagePushConstant16, boolean storageInputOutput16) {
        sType(sType);
        pNext(pNext);
        storageBuffer16BitAccess(storageBuffer16BitAccess);
        uniformAndStorageBuffer16BitAccess(uniformAndStorageBuffer16BitAccess);
        storagePushConstant16(storagePushConstant16);
        storageInputOutput16(storageInputOutput16);
        return this;
    }

    public VkPhysicalDevice16BitStorageFeatures set(VkPhysicalDevice16BitStorageFeatures src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevice16BitStorageFeatures malloc() {
        return new VkPhysicalDevice16BitStorageFeatures(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevice16BitStorageFeatures calloc() {
        return new VkPhysicalDevice16BitStorageFeatures(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevice16BitStorageFeatures create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevice16BitStorageFeatures(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevice16BitStorageFeatures create(long address) {
        return new VkPhysicalDevice16BitStorageFeatures(address, null);
    }

    public static VkPhysicalDevice16BitStorageFeatures createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevice16BitStorageFeatures(address, null);
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

    public static VkPhysicalDevice16BitStorageFeatures malloc(MemoryStack stack) {
        return new VkPhysicalDevice16BitStorageFeatures(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevice16BitStorageFeatures calloc(MemoryStack stack) {
        return new VkPhysicalDevice16BitStorageFeatures(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstorageBuffer16BitAccess(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGEBUFFER16BITACCESS);
    }

    public static int nuniformAndStorageBuffer16BitAccess(long struct) {
        return MemoryUtil.memGetInt(struct + UNIFORMANDSTORAGEBUFFER16BITACCESS);
    }

    public static int nstoragePushConstant16(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGEPUSHCONSTANT16);
    }

    public static int nstorageInputOutput16(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGEINPUTOUTPUT16);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstorageBuffer16BitAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + STORAGEBUFFER16BITACCESS, value);
    }

    public static void nuniformAndStorageBuffer16BitAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + UNIFORMANDSTORAGEBUFFER16BITACCESS, value);
    }

    public static void nstoragePushConstant16(long struct, int value) {
        MemoryUtil.memPutInt(struct + STORAGEPUSHCONSTANT16, value);
    }

    public static void nstorageInputOutput16(long struct, int value) {
        MemoryUtil.memPutInt(struct + STORAGEINPUTOUTPUT16, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice16BitStorageFeatures$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice16BitStorageFeatures$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevice16BitStorageFeatures, Buffer> implements NativeResource {
        private static final VkPhysicalDevice16BitStorageFeatures ELEMENT_FACTORY = VkPhysicalDevice16BitStorageFeatures.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevice16BitStorageFeatures.SIZEOF);
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
        public VkPhysicalDevice16BitStorageFeatures getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevice16BitStorageFeatures.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevice16BitStorageFeatures.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean storageBuffer16BitAccess() {
            return VkPhysicalDevice16BitStorageFeatures.nstorageBuffer16BitAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean uniformAndStorageBuffer16BitAccess() {
            return VkPhysicalDevice16BitStorageFeatures.nuniformAndStorageBuffer16BitAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean storagePushConstant16() {
            return VkPhysicalDevice16BitStorageFeatures.nstoragePushConstant16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean storageInputOutput16() {
            return VkPhysicalDevice16BitStorageFeatures.nstorageInputOutput16(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevice16BitStorageFeatures.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000083000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevice16BitStorageFeatures.npNext(address(), value);
            return this;
        }

        public Buffer storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevice16BitStorageFeatures.nstorageBuffer16BitAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevice16BitStorageFeatures.nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer storagePushConstant16(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevice16BitStorageFeatures.nstoragePushConstant16(address(), value ? 1 : 0);
            return this;
        }

        public Buffer storageInputOutput16(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevice16BitStorageFeatures.nstorageInputOutput16(address(), value ? 1 : 0);
            return this;
        }
    }
}
