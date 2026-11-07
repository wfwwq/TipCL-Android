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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.class */
public class VkQueryPoolVideoEncodeFeedbackCreateInfoKHR extends Struct<VkQueryPoolVideoEncodeFeedbackCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ENCODEFEEDBACKFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ENCODEFEEDBACKFLAGS = layout.offsetof(2);
    }

    protected VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(address, container);
    }

    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkVideoEncodeFeedbackFlagsKHR")
    public int encodeFeedbackFlags() {
        return nencodeFeedbackFlags(address());
    }

    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR sType$Default() {
        return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR);
    }

    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR encodeFeedbackFlags(@NativeType("VkVideoEncodeFeedbackFlagsKHR") int value) {
        nencodeFeedbackFlags(address(), value);
        return this;
    }

    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR set(int sType, long pNext, int encodeFeedbackFlags) {
        sType(sType);
        pNext(pNext);
        encodeFeedbackFlags(encodeFeedbackFlags);
        return this;
    }

    public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR set(VkQueryPoolVideoEncodeFeedbackCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR malloc() {
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR calloc() {
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR create(long address) {
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(address, null);
    }

    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(address, null);
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

    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR malloc(MemoryStack stack) {
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueryPoolVideoEncodeFeedbackCreateInfoKHR calloc(MemoryStack stack) {
        return new VkQueryPoolVideoEncodeFeedbackCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nencodeFeedbackFlags(long struct) {
        return MemoryUtil.memGetInt(struct + ENCODEFEEDBACKFLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nencodeFeedbackFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENCODEFEEDBACKFLAGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolVideoEncodeFeedbackCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueryPoolVideoEncodeFeedbackCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkQueryPoolVideoEncodeFeedbackCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkQueryPoolVideoEncodeFeedbackCreateInfoKHR ELEMENT_FACTORY = VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.SIZEOF);
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
        public VkQueryPoolVideoEncodeFeedbackCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.npNext(address());
        }

        @NativeType("VkVideoEncodeFeedbackFlagsKHR")
        public int encodeFeedbackFlags() {
            return VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.nencodeFeedbackFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoEncodeQueue.VK_STRUCTURE_TYPE_QUERY_POOL_VIDEO_ENCODE_FEEDBACK_CREATE_INFO_KHR);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer encodeFeedbackFlags(@NativeType("VkVideoEncodeFeedbackFlagsKHR") int value) {
            VkQueryPoolVideoEncodeFeedbackCreateInfoKHR.nencodeFeedbackFlags(address(), value);
            return this;
        }
    }
}
