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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoSessionMemoryRequirementsKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoSessionMemoryRequirementsKHR.class */
public class VkVideoSessionMemoryRequirementsKHR extends Struct<VkVideoSessionMemoryRequirementsKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MEMORYBINDINDEX;
    public static final int MEMORYREQUIREMENTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkMemoryRequirements.SIZEOF, VkMemoryRequirements.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MEMORYBINDINDEX = layout.offsetof(2);
        MEMORYREQUIREMENTS = layout.offsetof(3);
    }

    protected VkVideoSessionMemoryRequirementsKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkVideoSessionMemoryRequirementsKHR create(long address, ByteBuffer container) {
        return new VkVideoSessionMemoryRequirementsKHR(address, container);
    }

    public VkVideoSessionMemoryRequirementsKHR(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int memoryBindIndex() {
        return nmemoryBindIndex(address());
    }

    public VkMemoryRequirements memoryRequirements() {
        return nmemoryRequirements(address());
    }

    public VkVideoSessionMemoryRequirementsKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkVideoSessionMemoryRequirementsKHR sType$Default() {
        return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR);
    }

    public VkVideoSessionMemoryRequirementsKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkVideoSessionMemoryRequirementsKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkVideoSessionMemoryRequirementsKHR set(VkVideoSessionMemoryRequirementsKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkVideoSessionMemoryRequirementsKHR malloc() {
        return new VkVideoSessionMemoryRequirementsKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkVideoSessionMemoryRequirementsKHR calloc() {
        return new VkVideoSessionMemoryRequirementsKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkVideoSessionMemoryRequirementsKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkVideoSessionMemoryRequirementsKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkVideoSessionMemoryRequirementsKHR create(long address) {
        return new VkVideoSessionMemoryRequirementsKHR(address, null);
    }

    public static VkVideoSessionMemoryRequirementsKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkVideoSessionMemoryRequirementsKHR(address, null);
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

    public static VkVideoSessionMemoryRequirementsKHR malloc(MemoryStack stack) {
        return new VkVideoSessionMemoryRequirementsKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkVideoSessionMemoryRequirementsKHR calloc(MemoryStack stack) {
        return new VkVideoSessionMemoryRequirementsKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmemoryBindIndex(long struct) {
        return MemoryUtil.memGetInt(struct + MEMORYBINDINDEX);
    }

    public static VkMemoryRequirements nmemoryRequirements(long struct) {
        return VkMemoryRequirements.create(struct + MEMORYREQUIREMENTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoSessionMemoryRequirementsKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkVideoSessionMemoryRequirementsKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkVideoSessionMemoryRequirementsKHR, Buffer> implements NativeResource {
        private static final VkVideoSessionMemoryRequirementsKHR ELEMENT_FACTORY = VkVideoSessionMemoryRequirementsKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkVideoSessionMemoryRequirementsKHR.SIZEOF);
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
        public VkVideoSessionMemoryRequirementsKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkVideoSessionMemoryRequirementsKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkVideoSessionMemoryRequirementsKHR.npNext(address());
        }

        @NativeType("uint32_t")
        public int memoryBindIndex() {
            return VkVideoSessionMemoryRequirementsKHR.nmemoryBindIndex(address());
        }

        public VkMemoryRequirements memoryRequirements() {
            return VkVideoSessionMemoryRequirementsKHR.nmemoryRequirements(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkVideoSessionMemoryRequirementsKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_VIDEO_SESSION_MEMORY_REQUIREMENTS_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkVideoSessionMemoryRequirementsKHR.npNext(address(), value);
            return this;
        }
    }
}
