package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassSampleLocationsEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassSampleLocationsEXT.class */
public class VkSubpassSampleLocationsEXT extends Struct<VkSubpassSampleLocationsEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int SUBPASSINDEX;
    public static final int SAMPLELOCATIONSINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(VkSampleLocationsInfoEXT.SIZEOF, VkSampleLocationsInfoEXT.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        SUBPASSINDEX = layout.offsetof(0);
        SAMPLELOCATIONSINFO = layout.offsetof(1);
    }

    protected VkSubpassSampleLocationsEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubpassSampleLocationsEXT create(long address, ByteBuffer container) {
        return new VkSubpassSampleLocationsEXT(address, container);
    }

    public VkSubpassSampleLocationsEXT(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("uint32_t")
    public int subpassIndex() {
        return nsubpassIndex(address());
    }

    public VkSampleLocationsInfoEXT sampleLocationsInfo() {
        return nsampleLocationsInfo(address());
    }

    public VkSubpassSampleLocationsEXT subpassIndex(@NativeType("uint32_t") int value) {
        nsubpassIndex(address(), value);
        return this;
    }

    public VkSubpassSampleLocationsEXT sampleLocationsInfo(VkSampleLocationsInfoEXT value) {
        nsampleLocationsInfo(address(), value);
        return this;
    }

    public VkSubpassSampleLocationsEXT sampleLocationsInfo(Consumer<VkSampleLocationsInfoEXT> consumer) {
        consumer.accept(sampleLocationsInfo());
        return this;
    }

    public VkSubpassSampleLocationsEXT set(int subpassIndex, VkSampleLocationsInfoEXT sampleLocationsInfo) {
        subpassIndex(subpassIndex);
        sampleLocationsInfo(sampleLocationsInfo);
        return this;
    }

    public VkSubpassSampleLocationsEXT set(VkSubpassSampleLocationsEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassSampleLocationsEXT malloc() {
        return new VkSubpassSampleLocationsEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassSampleLocationsEXT calloc() {
        return new VkSubpassSampleLocationsEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassSampleLocationsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassSampleLocationsEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassSampleLocationsEXT create(long address) {
        return new VkSubpassSampleLocationsEXT(address, null);
    }

    public static VkSubpassSampleLocationsEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassSampleLocationsEXT(address, null);
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

    public static VkSubpassSampleLocationsEXT malloc(MemoryStack stack) {
        return new VkSubpassSampleLocationsEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassSampleLocationsEXT calloc(MemoryStack stack) {
        return new VkSubpassSampleLocationsEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nsubpassIndex(long struct) {
        return MemoryUtil.memGetInt(struct + SUBPASSINDEX);
    }

    public static VkSampleLocationsInfoEXT nsampleLocationsInfo(long struct) {
        return VkSampleLocationsInfoEXT.create(struct + SAMPLELOCATIONSINFO);
    }

    public static void nsubpassIndex(long struct, int value) {
        MemoryUtil.memPutInt(struct + SUBPASSINDEX, value);
    }

    public static void nsampleLocationsInfo(long struct, VkSampleLocationsInfoEXT value) {
        MemoryUtil.memCopy(value.address(), struct + SAMPLELOCATIONSINFO, VkSampleLocationsInfoEXT.SIZEOF);
    }

    public static void validate(long struct) {
        VkSampleLocationsInfoEXT.validate(struct + SAMPLELOCATIONSINFO);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassSampleLocationsEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassSampleLocationsEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubpassSampleLocationsEXT, Buffer> implements NativeResource {
        private static final VkSubpassSampleLocationsEXT ELEMENT_FACTORY = VkSubpassSampleLocationsEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubpassSampleLocationsEXT.SIZEOF);
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
        public VkSubpassSampleLocationsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("uint32_t")
        public int subpassIndex() {
            return VkSubpassSampleLocationsEXT.nsubpassIndex(address());
        }

        public VkSampleLocationsInfoEXT sampleLocationsInfo() {
            return VkSubpassSampleLocationsEXT.nsampleLocationsInfo(address());
        }

        public Buffer subpassIndex(@NativeType("uint32_t") int value) {
            VkSubpassSampleLocationsEXT.nsubpassIndex(address(), value);
            return this;
        }

        public Buffer sampleLocationsInfo(VkSampleLocationsInfoEXT value) {
            VkSubpassSampleLocationsEXT.nsampleLocationsInfo(address(), value);
            return this;
        }

        public Buffer sampleLocationsInfo(Consumer<VkSampleLocationsInfoEXT> consumer) {
            consumer.accept(sampleLocationsInfo());
            return this;
        }
    }
}
