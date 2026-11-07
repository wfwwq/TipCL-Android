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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryDedicatedRequirements.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryDedicatedRequirements.class */
public class VkMemoryDedicatedRequirements extends Struct<VkMemoryDedicatedRequirements> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PREFERSDEDICATEDALLOCATION;
    public static final int REQUIRESDEDICATEDALLOCATION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PREFERSDEDICATEDALLOCATION = layout.offsetof(2);
        REQUIRESDEDICATEDALLOCATION = layout.offsetof(3);
    }

    protected VkMemoryDedicatedRequirements(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMemoryDedicatedRequirements create(long address, ByteBuffer container) {
        return new VkMemoryDedicatedRequirements(address, container);
    }

    public VkMemoryDedicatedRequirements(ByteBuffer container) {
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
    public boolean prefersDedicatedAllocation() {
        return nprefersDedicatedAllocation(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean requiresDedicatedAllocation() {
        return nrequiresDedicatedAllocation(address()) != 0;
    }

    public VkMemoryDedicatedRequirements sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMemoryDedicatedRequirements sType$Default() {
        return sType(1000127000);
    }

    public VkMemoryDedicatedRequirements pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMemoryDedicatedRequirements set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkMemoryDedicatedRequirements set(VkMemoryDedicatedRequirements src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMemoryDedicatedRequirements malloc() {
        return new VkMemoryDedicatedRequirements(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMemoryDedicatedRequirements calloc() {
        return new VkMemoryDedicatedRequirements(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMemoryDedicatedRequirements create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMemoryDedicatedRequirements(MemoryUtil.memAddress(container), container);
    }

    public static VkMemoryDedicatedRequirements create(long address) {
        return new VkMemoryDedicatedRequirements(address, null);
    }

    public static VkMemoryDedicatedRequirements createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMemoryDedicatedRequirements(address, null);
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

    public static VkMemoryDedicatedRequirements malloc(MemoryStack stack) {
        return new VkMemoryDedicatedRequirements(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMemoryDedicatedRequirements calloc(MemoryStack stack) {
        return new VkMemoryDedicatedRequirements(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nprefersDedicatedAllocation(long struct) {
        return MemoryUtil.memGetInt(struct + PREFERSDEDICATEDALLOCATION);
    }

    public static int nrequiresDedicatedAllocation(long struct) {
        return MemoryUtil.memGetInt(struct + REQUIRESDEDICATEDALLOCATION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryDedicatedRequirements$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMemoryDedicatedRequirements$Buffer.class */
    public static class Buffer extends StructBuffer<VkMemoryDedicatedRequirements, Buffer> implements NativeResource {
        private static final VkMemoryDedicatedRequirements ELEMENT_FACTORY = VkMemoryDedicatedRequirements.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMemoryDedicatedRequirements.SIZEOF);
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
        public VkMemoryDedicatedRequirements getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMemoryDedicatedRequirements.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkMemoryDedicatedRequirements.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean prefersDedicatedAllocation() {
            return VkMemoryDedicatedRequirements.nprefersDedicatedAllocation(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean requiresDedicatedAllocation() {
            return VkMemoryDedicatedRequirements.nrequiresDedicatedAllocation(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMemoryDedicatedRequirements.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000127000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkMemoryDedicatedRequirements.npNext(address(), value);
            return this;
        }
    }
}
