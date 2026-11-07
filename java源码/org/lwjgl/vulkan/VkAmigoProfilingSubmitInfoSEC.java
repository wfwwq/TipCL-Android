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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAmigoProfilingSubmitInfoSEC.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAmigoProfilingSubmitInfoSEC.class */
public class VkAmigoProfilingSubmitInfoSEC extends Struct<VkAmigoProfilingSubmitInfoSEC> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FIRSTDRAWTIMESTAMP;
    public static final int SWAPBUFFERTIMESTAMP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(8), __member(8));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FIRSTDRAWTIMESTAMP = layout.offsetof(2);
        SWAPBUFFERTIMESTAMP = layout.offsetof(3);
    }

    protected VkAmigoProfilingSubmitInfoSEC(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAmigoProfilingSubmitInfoSEC create(long address, ByteBuffer container) {
        return new VkAmigoProfilingSubmitInfoSEC(address, container);
    }

    public VkAmigoProfilingSubmitInfoSEC(ByteBuffer container) {
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

    @NativeType("uint64_t")
    public long firstDrawTimestamp() {
        return nfirstDrawTimestamp(address());
    }

    @NativeType("uint64_t")
    public long swapBufferTimestamp() {
        return nswapBufferTimestamp(address());
    }

    public VkAmigoProfilingSubmitInfoSEC sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkAmigoProfilingSubmitInfoSEC sType$Default() {
        return sType(SECAmigoProfiling.VK_STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC);
    }

    public VkAmigoProfilingSubmitInfoSEC pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkAmigoProfilingSubmitInfoSEC firstDrawTimestamp(@NativeType("uint64_t") long value) {
        nfirstDrawTimestamp(address(), value);
        return this;
    }

    public VkAmigoProfilingSubmitInfoSEC swapBufferTimestamp(@NativeType("uint64_t") long value) {
        nswapBufferTimestamp(address(), value);
        return this;
    }

    public VkAmigoProfilingSubmitInfoSEC set(int sType, long pNext, long firstDrawTimestamp, long swapBufferTimestamp) {
        sType(sType);
        pNext(pNext);
        firstDrawTimestamp(firstDrawTimestamp);
        swapBufferTimestamp(swapBufferTimestamp);
        return this;
    }

    public VkAmigoProfilingSubmitInfoSEC set(VkAmigoProfilingSubmitInfoSEC src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAmigoProfilingSubmitInfoSEC malloc() {
        return new VkAmigoProfilingSubmitInfoSEC(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAmigoProfilingSubmitInfoSEC calloc() {
        return new VkAmigoProfilingSubmitInfoSEC(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAmigoProfilingSubmitInfoSEC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAmigoProfilingSubmitInfoSEC(MemoryUtil.memAddress(container), container);
    }

    public static VkAmigoProfilingSubmitInfoSEC create(long address) {
        return new VkAmigoProfilingSubmitInfoSEC(address, null);
    }

    public static VkAmigoProfilingSubmitInfoSEC createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAmigoProfilingSubmitInfoSEC(address, null);
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

    public static VkAmigoProfilingSubmitInfoSEC malloc(MemoryStack stack) {
        return new VkAmigoProfilingSubmitInfoSEC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAmigoProfilingSubmitInfoSEC calloc(MemoryStack stack) {
        return new VkAmigoProfilingSubmitInfoSEC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long nfirstDrawTimestamp(long struct) {
        return MemoryUtil.memGetLong(struct + FIRSTDRAWTIMESTAMP);
    }

    public static long nswapBufferTimestamp(long struct) {
        return MemoryUtil.memGetLong(struct + SWAPBUFFERTIMESTAMP);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nfirstDrawTimestamp(long struct, long value) {
        MemoryUtil.memPutLong(struct + FIRSTDRAWTIMESTAMP, value);
    }

    public static void nswapBufferTimestamp(long struct, long value) {
        MemoryUtil.memPutLong(struct + SWAPBUFFERTIMESTAMP, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAmigoProfilingSubmitInfoSEC$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAmigoProfilingSubmitInfoSEC$Buffer.class */
    public static class Buffer extends StructBuffer<VkAmigoProfilingSubmitInfoSEC, Buffer> implements NativeResource {
        private static final VkAmigoProfilingSubmitInfoSEC ELEMENT_FACTORY = VkAmigoProfilingSubmitInfoSEC.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAmigoProfilingSubmitInfoSEC.SIZEOF);
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
        public VkAmigoProfilingSubmitInfoSEC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkAmigoProfilingSubmitInfoSEC.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkAmigoProfilingSubmitInfoSEC.npNext(address());
        }

        @NativeType("uint64_t")
        public long firstDrawTimestamp() {
            return VkAmigoProfilingSubmitInfoSEC.nfirstDrawTimestamp(address());
        }

        @NativeType("uint64_t")
        public long swapBufferTimestamp() {
            return VkAmigoProfilingSubmitInfoSEC.nswapBufferTimestamp(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkAmigoProfilingSubmitInfoSEC.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(SECAmigoProfiling.VK_STRUCTURE_TYPE_AMIGO_PROFILING_SUBMIT_INFO_SEC);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkAmigoProfilingSubmitInfoSEC.npNext(address(), value);
            return this;
        }

        public Buffer firstDrawTimestamp(@NativeType("uint64_t") long value) {
            VkAmigoProfilingSubmitInfoSEC.nfirstDrawTimestamp(address(), value);
            return this;
        }

        public Buffer swapBufferTimestamp(@NativeType("uint64_t") long value) {
            VkAmigoProfilingSubmitInfoSEC.nswapBufferTimestamp(address(), value);
            return this;
        }
    }
}
