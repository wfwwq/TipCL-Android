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
import org.lwjgl.vulkan.VkPipelineBinaryDataKHR;
import org.lwjgl.vulkan.VkPipelineBinaryKeyKHR;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryKeysAndDataKHR.class */
public class VkPipelineBinaryKeysAndDataKHR extends Struct<VkPipelineBinaryKeysAndDataKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int BINARYCOUNT;
    public static final int PPIPELINEBINARYKEYS;
    public static final int PPIPELINEBINARYDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        BINARYCOUNT = layout.offsetof(0);
        PPIPELINEBINARYKEYS = layout.offsetof(1);
        PPIPELINEBINARYDATA = layout.offsetof(2);
    }

    protected VkPipelineBinaryKeysAndDataKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineBinaryKeysAndDataKHR create(long address, ByteBuffer container) {
        return new VkPipelineBinaryKeysAndDataKHR(address, container);
    }

    public VkPipelineBinaryKeysAndDataKHR(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int binaryCount() {
        return nbinaryCount(address());
    }

    @NativeType("VkPipelineBinaryKeyKHR const *")
    public VkPipelineBinaryKeyKHR.Buffer pPipelineBinaryKeys() {
        return npPipelineBinaryKeys(address());
    }

    @NativeType("VkPipelineBinaryDataKHR const *")
    public VkPipelineBinaryDataKHR.Buffer pPipelineBinaryData() {
        return npPipelineBinaryData(address());
    }

    public VkPipelineBinaryKeysAndDataKHR binaryCount(@NativeType("uint32_t") int value) {
        nbinaryCount(address(), value);
        return this;
    }

    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryKeys(@NativeType("VkPipelineBinaryKeyKHR const *") VkPipelineBinaryKeyKHR.Buffer value) {
        npPipelineBinaryKeys(address(), value);
        return this;
    }

    public VkPipelineBinaryKeysAndDataKHR pPipelineBinaryData(@NativeType("VkPipelineBinaryDataKHR const *") VkPipelineBinaryDataKHR.Buffer value) {
        npPipelineBinaryData(address(), value);
        return this;
    }

    public VkPipelineBinaryKeysAndDataKHR set(int binaryCount, VkPipelineBinaryKeyKHR.Buffer pPipelineBinaryKeys, VkPipelineBinaryDataKHR.Buffer pPipelineBinaryData) {
        binaryCount(binaryCount);
        pPipelineBinaryKeys(pPipelineBinaryKeys);
        pPipelineBinaryData(pPipelineBinaryData);
        return this;
    }

    public VkPipelineBinaryKeysAndDataKHR set(VkPipelineBinaryKeysAndDataKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineBinaryKeysAndDataKHR malloc() {
        return new VkPipelineBinaryKeysAndDataKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineBinaryKeysAndDataKHR calloc() {
        return new VkPipelineBinaryKeysAndDataKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineBinaryKeysAndDataKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineBinaryKeysAndDataKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineBinaryKeysAndDataKHR create(long address) {
        return new VkPipelineBinaryKeysAndDataKHR(address, null);
    }

    public static VkPipelineBinaryKeysAndDataKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineBinaryKeysAndDataKHR(address, null);
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

    public static VkPipelineBinaryKeysAndDataKHR malloc(MemoryStack stack) {
        return new VkPipelineBinaryKeysAndDataKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineBinaryKeysAndDataKHR calloc(MemoryStack stack) {
        return new VkPipelineBinaryKeysAndDataKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nbinaryCount(long struct) {
        return MemoryUtil.memGetInt(struct + BINARYCOUNT);
    }

    public static VkPipelineBinaryKeyKHR.Buffer npPipelineBinaryKeys(long struct) {
        return VkPipelineBinaryKeyKHR.create(MemoryUtil.memGetAddress(struct + PPIPELINEBINARYKEYS), nbinaryCount(struct));
    }

    public static VkPipelineBinaryDataKHR.Buffer npPipelineBinaryData(long struct) {
        return VkPipelineBinaryDataKHR.create(MemoryUtil.memGetAddress(struct + PPIPELINEBINARYDATA), nbinaryCount(struct));
    }

    public static void nbinaryCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + BINARYCOUNT, value);
    }

    public static void npPipelineBinaryKeys(long struct, VkPipelineBinaryKeyKHR.Buffer value) {
        MemoryUtil.memPutAddress(struct + PPIPELINEBINARYKEYS, value.address());
    }

    public static void npPipelineBinaryData(long struct, VkPipelineBinaryDataKHR.Buffer value) {
        MemoryUtil.memPutAddress(struct + PPIPELINEBINARYDATA, value.address());
    }

    public static void validate(long struct) {
        int binaryCount = nbinaryCount(struct);
        Checks.check(MemoryUtil.memGetAddress(struct + PPIPELINEBINARYKEYS));
        long pPipelineBinaryData = MemoryUtil.memGetAddress(struct + PPIPELINEBINARYDATA);
        Checks.check(pPipelineBinaryData);
        validate(pPipelineBinaryData, binaryCount, VkPipelineBinaryDataKHR.SIZEOF, VkPipelineBinaryDataKHR::validate);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineBinaryKeysAndDataKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineBinaryKeysAndDataKHR, Buffer> implements NativeResource {
        private static final VkPipelineBinaryKeysAndDataKHR ELEMENT_FACTORY = VkPipelineBinaryKeysAndDataKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineBinaryKeysAndDataKHR.SIZEOF);
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
        public VkPipelineBinaryKeysAndDataKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int binaryCount() {
            return VkPipelineBinaryKeysAndDataKHR.nbinaryCount(address());
        }

        @NativeType("VkPipelineBinaryKeyKHR const *")
        public VkPipelineBinaryKeyKHR.Buffer pPipelineBinaryKeys() {
            return VkPipelineBinaryKeysAndDataKHR.npPipelineBinaryKeys(address());
        }

        @NativeType("VkPipelineBinaryDataKHR const *")
        public VkPipelineBinaryDataKHR.Buffer pPipelineBinaryData() {
            return VkPipelineBinaryKeysAndDataKHR.npPipelineBinaryData(address());
        }

        public Buffer binaryCount(@NativeType("uint32_t") int value) {
            VkPipelineBinaryKeysAndDataKHR.nbinaryCount(address(), value);
            return this;
        }

        public Buffer pPipelineBinaryKeys(@NativeType("VkPipelineBinaryKeyKHR const *") VkPipelineBinaryKeyKHR.Buffer value) {
            VkPipelineBinaryKeysAndDataKHR.npPipelineBinaryKeys(address(), value);
            return this;
        }

        public Buffer pPipelineBinaryData(@NativeType("VkPipelineBinaryDataKHR const *") VkPipelineBinaryDataKHR.Buffer value) {
            VkPipelineBinaryKeysAndDataKHR.npPipelineBinaryData(address(), value);
            return this;
        }
    }
}
