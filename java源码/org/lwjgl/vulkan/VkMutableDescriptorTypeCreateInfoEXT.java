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
import org.lwjgl.vulkan.VkMutableDescriptorTypeListEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeCreateInfoEXT.class */
public class VkMutableDescriptorTypeCreateInfoEXT extends Struct<VkMutableDescriptorTypeCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MUTABLEDESCRIPTORTYPELISTCOUNT;
    public static final int PMUTABLEDESCRIPTORTYPELISTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MUTABLEDESCRIPTORTYPELISTCOUNT = layout.offsetof(2);
        PMUTABLEDESCRIPTORTYPELISTS = layout.offsetof(3);
    }

    protected VkMutableDescriptorTypeCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMutableDescriptorTypeCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkMutableDescriptorTypeCreateInfoEXT(address, container);
    }

    public VkMutableDescriptorTypeCreateInfoEXT(ByteBuffer container) {
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
    public int mutableDescriptorTypeListCount() {
        return nmutableDescriptorTypeListCount(address());
    }

    @NativeType("VkMutableDescriptorTypeListEXT const *")
    public VkMutableDescriptorTypeListEXT.Buffer pMutableDescriptorTypeLists() {
        return npMutableDescriptorTypeLists(address());
    }

    public VkMutableDescriptorTypeCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMutableDescriptorTypeCreateInfoEXT sType$Default() {
        return sType(1000351002);
    }

    public VkMutableDescriptorTypeCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMutableDescriptorTypeCreateInfoEXT pMutableDescriptorTypeLists(@NativeType("VkMutableDescriptorTypeListEXT const *") VkMutableDescriptorTypeListEXT.Buffer value) {
        npMutableDescriptorTypeLists(address(), value);
        return this;
    }

    public VkMutableDescriptorTypeCreateInfoEXT set(int sType, long pNext, VkMutableDescriptorTypeListEXT.Buffer pMutableDescriptorTypeLists) {
        sType(sType);
        pNext(pNext);
        pMutableDescriptorTypeLists(pMutableDescriptorTypeLists);
        return this;
    }

    public VkMutableDescriptorTypeCreateInfoEXT set(VkMutableDescriptorTypeCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMutableDescriptorTypeCreateInfoEXT malloc() {
        return new VkMutableDescriptorTypeCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMutableDescriptorTypeCreateInfoEXT calloc() {
        return new VkMutableDescriptorTypeCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMutableDescriptorTypeCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMutableDescriptorTypeCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMutableDescriptorTypeCreateInfoEXT create(long address) {
        return new VkMutableDescriptorTypeCreateInfoEXT(address, null);
    }

    public static VkMutableDescriptorTypeCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMutableDescriptorTypeCreateInfoEXT(address, null);
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

    public static VkMutableDescriptorTypeCreateInfoEXT malloc(MemoryStack stack) {
        return new VkMutableDescriptorTypeCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMutableDescriptorTypeCreateInfoEXT calloc(MemoryStack stack) {
        return new VkMutableDescriptorTypeCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmutableDescriptorTypeListCount(long struct) {
        return MemoryUtil.memGetInt(struct + MUTABLEDESCRIPTORTYPELISTCOUNT);
    }

    public static VkMutableDescriptorTypeListEXT.Buffer npMutableDescriptorTypeLists(long struct) {
        return VkMutableDescriptorTypeListEXT.createSafe(MemoryUtil.memGetAddress(struct + PMUTABLEDESCRIPTORTYPELISTS), nmutableDescriptorTypeListCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nmutableDescriptorTypeListCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + MUTABLEDESCRIPTORTYPELISTCOUNT, value);
    }

    public static void npMutableDescriptorTypeLists(long struct, VkMutableDescriptorTypeListEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PMUTABLEDESCRIPTORTYPELISTS, MemoryUtil.memAddressSafe(value));
        nmutableDescriptorTypeListCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        int mutableDescriptorTypeListCount = nmutableDescriptorTypeListCount(struct);
        if (mutableDescriptorTypeListCount != 0) {
            long pMutableDescriptorTypeLists = MemoryUtil.memGetAddress(struct + PMUTABLEDESCRIPTORTYPELISTS);
            Checks.check(pMutableDescriptorTypeLists);
            validate(pMutableDescriptorTypeLists, mutableDescriptorTypeListCount, VkMutableDescriptorTypeListEXT.SIZEOF, VkMutableDescriptorTypeListEXT::validate);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMutableDescriptorTypeCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMutableDescriptorTypeCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkMutableDescriptorTypeCreateInfoEXT ELEMENT_FACTORY = VkMutableDescriptorTypeCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMutableDescriptorTypeCreateInfoEXT.SIZEOF);
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
        public VkMutableDescriptorTypeCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMutableDescriptorTypeCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMutableDescriptorTypeCreateInfoEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int mutableDescriptorTypeListCount() {
            return VkMutableDescriptorTypeCreateInfoEXT.nmutableDescriptorTypeListCount(address());
        }

        @NativeType("VkMutableDescriptorTypeListEXT const *")
        public VkMutableDescriptorTypeListEXT.Buffer pMutableDescriptorTypeLists() {
            return VkMutableDescriptorTypeCreateInfoEXT.npMutableDescriptorTypeLists(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMutableDescriptorTypeCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000351002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMutableDescriptorTypeCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pMutableDescriptorTypeLists(@NativeType("VkMutableDescriptorTypeListEXT const *") VkMutableDescriptorTypeListEXT.Buffer value) {
            VkMutableDescriptorTypeCreateInfoEXT.npMutableDescriptorTypeLists(address(), value);
            return this;
        }
    }
}
