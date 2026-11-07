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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPastPresentationTimingGOOGLE.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPastPresentationTimingGOOGLE.class */
public class VkPastPresentationTimingGOOGLE extends Struct<VkPastPresentationTimingGOOGLE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PRESENTID;
    public static final int DESIREDPRESENTTIME;
    public static final int ACTUALPRESENTTIME;
    public static final int EARLIESTPRESENTTIME;
    public static final int PRESENTMARGIN;

    static {
        Struct.Layout layout = __struct(__member(4), __member(8), __member(8), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PRESENTID = layout.offsetof(0);
        DESIREDPRESENTTIME = layout.offsetof(1);
        ACTUALPRESENTTIME = layout.offsetof(2);
        EARLIESTPRESENTTIME = layout.offsetof(3);
        PRESENTMARGIN = layout.offsetof(4);
    }

    protected VkPastPresentationTimingGOOGLE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPastPresentationTimingGOOGLE create(long address, ByteBuffer container) {
        return new VkPastPresentationTimingGOOGLE(address, container);
    }

    public VkPastPresentationTimingGOOGLE(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int presentID() {
        return npresentID(address());
    }

    @NativeType("uint64_t")
    public long desiredPresentTime() {
        return ndesiredPresentTime(address());
    }

    @NativeType("uint64_t")
    public long actualPresentTime() {
        return nactualPresentTime(address());
    }

    @NativeType("uint64_t")
    public long earliestPresentTime() {
        return nearliestPresentTime(address());
    }

    @NativeType("uint64_t")
    public long presentMargin() {
        return npresentMargin(address());
    }

    public static VkPastPresentationTimingGOOGLE malloc() {
        return new VkPastPresentationTimingGOOGLE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPastPresentationTimingGOOGLE calloc() {
        return new VkPastPresentationTimingGOOGLE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPastPresentationTimingGOOGLE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPastPresentationTimingGOOGLE(MemoryUtil.memAddress(container), container);
    }

    public static VkPastPresentationTimingGOOGLE create(long address) {
        return new VkPastPresentationTimingGOOGLE(address, null);
    }

    public static VkPastPresentationTimingGOOGLE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPastPresentationTimingGOOGLE(address, null);
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

    public static VkPastPresentationTimingGOOGLE malloc(MemoryStack stack) {
        return new VkPastPresentationTimingGOOGLE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPastPresentationTimingGOOGLE calloc(MemoryStack stack) {
        return new VkPastPresentationTimingGOOGLE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int npresentID(long struct) {
        return MemoryUtil.memGetInt(struct + PRESENTID);
    }

    public static long ndesiredPresentTime(long struct) {
        return MemoryUtil.memGetLong(struct + DESIREDPRESENTTIME);
    }

    public static long nactualPresentTime(long struct) {
        return MemoryUtil.memGetLong(struct + ACTUALPRESENTTIME);
    }

    public static long nearliestPresentTime(long struct) {
        return MemoryUtil.memGetLong(struct + EARLIESTPRESENTTIME);
    }

    public static long npresentMargin(long struct) {
        return MemoryUtil.memGetLong(struct + PRESENTMARGIN);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPastPresentationTimingGOOGLE$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPastPresentationTimingGOOGLE$Buffer.class */
    public static class Buffer extends StructBuffer<VkPastPresentationTimingGOOGLE, Buffer> implements NativeResource {
        private static final VkPastPresentationTimingGOOGLE ELEMENT_FACTORY = VkPastPresentationTimingGOOGLE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPastPresentationTimingGOOGLE.SIZEOF);
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
        public VkPastPresentationTimingGOOGLE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int presentID() {
            return VkPastPresentationTimingGOOGLE.npresentID(address());
        }

        @NativeType("uint64_t")
        public long desiredPresentTime() {
            return VkPastPresentationTimingGOOGLE.ndesiredPresentTime(address());
        }

        @NativeType("uint64_t")
        public long actualPresentTime() {
            return VkPastPresentationTimingGOOGLE.nactualPresentTime(address());
        }

        @NativeType("uint64_t")
        public long earliestPresentTime() {
            return VkPastPresentationTimingGOOGLE.nearliestPresentTime(address());
        }

        @NativeType("uint64_t")
        public long presentMargin() {
            return VkPastPresentationTimingGOOGLE.npresentMargin(address());
        }
    }
}
