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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineSampleLocationsStateCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineSampleLocationsStateCreateInfoEXT.class */
public class VkPipelineSampleLocationsStateCreateInfoEXT extends Struct<VkPipelineSampleLocationsStateCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SAMPLELOCATIONSENABLE;
    public static final int SAMPLELOCATIONSINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkSampleLocationsInfoEXT.SIZEOF, VkSampleLocationsInfoEXT.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SAMPLELOCATIONSENABLE = layout.offsetof(2);
        SAMPLELOCATIONSINFO = layout.offsetof(3);
    }

    protected VkPipelineSampleLocationsStateCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineSampleLocationsStateCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkPipelineSampleLocationsStateCreateInfoEXT(address, container);
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean sampleLocationsEnable() {
        return nsampleLocationsEnable(address()) != 0;
    }

    public VkSampleLocationsInfoEXT sampleLocationsInfo() {
        return nsampleLocationsInfo(address());
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT sType$Default() {
        return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT);
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsEnable(@NativeType("VkBool32") boolean value) {
        nsampleLocationsEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo(VkSampleLocationsInfoEXT value) {
        nsampleLocationsInfo(address(), value);
        return this;
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT sampleLocationsInfo(Consumer<VkSampleLocationsInfoEXT> consumer) {
        consumer.accept(sampleLocationsInfo());
        return this;
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT set(int sType, long pNext, boolean sampleLocationsEnable, VkSampleLocationsInfoEXT sampleLocationsInfo) {
        sType(sType);
        pNext(pNext);
        sampleLocationsEnable(sampleLocationsEnable);
        sampleLocationsInfo(sampleLocationsInfo);
        return this;
    }

    public VkPipelineSampleLocationsStateCreateInfoEXT set(VkPipelineSampleLocationsStateCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineSampleLocationsStateCreateInfoEXT malloc() {
        return new VkPipelineSampleLocationsStateCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineSampleLocationsStateCreateInfoEXT calloc() {
        return new VkPipelineSampleLocationsStateCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineSampleLocationsStateCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineSampleLocationsStateCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineSampleLocationsStateCreateInfoEXT create(long address) {
        return new VkPipelineSampleLocationsStateCreateInfoEXT(address, null);
    }

    public static VkPipelineSampleLocationsStateCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineSampleLocationsStateCreateInfoEXT(address, null);
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

    public static VkPipelineSampleLocationsStateCreateInfoEXT malloc(MemoryStack stack) {
        return new VkPipelineSampleLocationsStateCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineSampleLocationsStateCreateInfoEXT calloc(MemoryStack stack) {
        return new VkPipelineSampleLocationsStateCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nsampleLocationsEnable(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLELOCATIONSENABLE);
    }

    public static VkSampleLocationsInfoEXT nsampleLocationsInfo(long struct) {
        return VkSampleLocationsInfoEXT.create(struct + SAMPLELOCATIONSINFO);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nsampleLocationsEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLELOCATIONSENABLE, value);
    }

    public static void nsampleLocationsInfo(long struct, VkSampleLocationsInfoEXT value) {
        MemoryUtil.memCopy(value.address(), struct + SAMPLELOCATIONSINFO, VkSampleLocationsInfoEXT.SIZEOF);
    }

    public static void validate(long struct) {
        VkSampleLocationsInfoEXT.validate(struct + SAMPLELOCATIONSINFO);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineSampleLocationsStateCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineSampleLocationsStateCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineSampleLocationsStateCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkPipelineSampleLocationsStateCreateInfoEXT ELEMENT_FACTORY = VkPipelineSampleLocationsStateCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineSampleLocationsStateCreateInfoEXT.SIZEOF);
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
        public VkPipelineSampleLocationsStateCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineSampleLocationsStateCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineSampleLocationsStateCreateInfoEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean sampleLocationsEnable() {
            return VkPipelineSampleLocationsStateCreateInfoEXT.nsampleLocationsEnable(address()) != 0;
        }

        public VkSampleLocationsInfoEXT sampleLocationsInfo() {
            return VkPipelineSampleLocationsStateCreateInfoEXT.nsampleLocationsInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineSampleLocationsStateCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTSampleLocations.VK_STRUCTURE_TYPE_PIPELINE_SAMPLE_LOCATIONS_STATE_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineSampleLocationsStateCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer sampleLocationsEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineSampleLocationsStateCreateInfoEXT.nsampleLocationsEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer sampleLocationsInfo(VkSampleLocationsInfoEXT value) {
            VkPipelineSampleLocationsStateCreateInfoEXT.nsampleLocationsInfo(address(), value);
            return this;
        }

        public Buffer sampleLocationsInfo(Consumer<VkSampleLocationsInfoEXT> consumer) {
            consumer.accept(sampleLocationsInfo());
            return this;
        }
    }
}
