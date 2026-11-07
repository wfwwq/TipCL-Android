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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentTimeGOOGLE.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentTimeGOOGLE.class */
public class VkPresentTimeGOOGLE extends Struct<VkPresentTimeGOOGLE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PRESENTID;
    public static final int DESIREDPRESENTTIME;

    static {
        Struct.Layout layout = __struct(__member(4), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PRESENTID = layout.offsetof(0);
        DESIREDPRESENTTIME = layout.offsetof(1);
    }

    protected VkPresentTimeGOOGLE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPresentTimeGOOGLE create(long address, ByteBuffer container) {
        return new VkPresentTimeGOOGLE(address, container);
    }

    public VkPresentTimeGOOGLE(ByteBuffer container) {
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

    public VkPresentTimeGOOGLE presentID(@NativeType("uint32_t") int value) {
        npresentID(address(), value);
        return this;
    }

    public VkPresentTimeGOOGLE desiredPresentTime(@NativeType("uint64_t") long value) {
        ndesiredPresentTime(address(), value);
        return this;
    }

    public VkPresentTimeGOOGLE set(int presentID, long desiredPresentTime) {
        presentID(presentID);
        desiredPresentTime(desiredPresentTime);
        return this;
    }

    public VkPresentTimeGOOGLE set(VkPresentTimeGOOGLE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPresentTimeGOOGLE malloc() {
        return new VkPresentTimeGOOGLE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPresentTimeGOOGLE calloc() {
        return new VkPresentTimeGOOGLE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPresentTimeGOOGLE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPresentTimeGOOGLE(MemoryUtil.memAddress(container), container);
    }

    public static VkPresentTimeGOOGLE create(long address) {
        return new VkPresentTimeGOOGLE(address, null);
    }

    public static VkPresentTimeGOOGLE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPresentTimeGOOGLE(address, null);
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

    public static VkPresentTimeGOOGLE malloc(MemoryStack stack) {
        return new VkPresentTimeGOOGLE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPresentTimeGOOGLE calloc(MemoryStack stack) {
        return new VkPresentTimeGOOGLE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static void npresentID(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRESENTID, value);
    }

    public static void ndesiredPresentTime(long struct, long value) {
        MemoryUtil.memPutLong(struct + DESIREDPRESENTTIME, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentTimeGOOGLE$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPresentTimeGOOGLE$Buffer.class */
    public static class Buffer extends StructBuffer<VkPresentTimeGOOGLE, Buffer> implements NativeResource {
        private static final VkPresentTimeGOOGLE ELEMENT_FACTORY = VkPresentTimeGOOGLE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPresentTimeGOOGLE.SIZEOF);
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
        public VkPresentTimeGOOGLE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int presentID() {
            return VkPresentTimeGOOGLE.npresentID(address());
        }

        @NativeType("uint64_t")
        public long desiredPresentTime() {
            return VkPresentTimeGOOGLE.ndesiredPresentTime(address());
        }

        public Buffer presentID(@NativeType("uint32_t") int value) {
            VkPresentTimeGOOGLE.npresentID(address(), value);
            return this;
        }

        public Buffer desiredPresentTime(@NativeType("uint64_t") long value) {
            VkPresentTimeGOOGLE.ndesiredPresentTime(address(), value);
            return this;
        }
    }
}
