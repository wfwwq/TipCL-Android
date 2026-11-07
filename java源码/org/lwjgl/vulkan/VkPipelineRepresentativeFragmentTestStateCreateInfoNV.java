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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRepresentativeFragmentTestStateCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRepresentativeFragmentTestStateCreateInfoNV.class */
public class VkPipelineRepresentativeFragmentTestStateCreateInfoNV extends Struct<VkPipelineRepresentativeFragmentTestStateCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int REPRESENTATIVEFRAGMENTTESTENABLE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        REPRESENTATIVEFRAGMENTTESTENABLE = layout.offsetof(2);
    }

    protected VkPipelineRepresentativeFragmentTestStateCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV create(long address, ByteBuffer container) {
        return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(address, container);
    }

    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV(ByteBuffer container) {
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
    public boolean representativeFragmentTestEnable() {
        return nrepresentativeFragmentTestEnable(address()) != 0;
    }

    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV sType$Default() {
        return sType(NVRepresentativeFragmentTest.VK_STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV);
    }

    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV representativeFragmentTestEnable(@NativeType("VkBool32") boolean value) {
        nrepresentativeFragmentTestEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV set(int sType, long pNext, boolean representativeFragmentTestEnable) {
        sType(sType);
        pNext(pNext);
        representativeFragmentTestEnable(representativeFragmentTestEnable);
        return this;
    }

    public VkPipelineRepresentativeFragmentTestStateCreateInfoNV set(VkPipelineRepresentativeFragmentTestStateCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV malloc() {
        return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV calloc() {
        return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV create(long address) {
        return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(address, null);
    }

    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(address, null);
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

    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV malloc(MemoryStack stack) {
        return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineRepresentativeFragmentTestStateCreateInfoNV calloc(MemoryStack stack) {
        return new VkPipelineRepresentativeFragmentTestStateCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nrepresentativeFragmentTestEnable(long struct) {
        return MemoryUtil.memGetInt(struct + REPRESENTATIVEFRAGMENTTESTENABLE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nrepresentativeFragmentTestEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + REPRESENTATIVEFRAGMENTTESTENABLE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRepresentativeFragmentTestStateCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineRepresentativeFragmentTestStateCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineRepresentativeFragmentTestStateCreateInfoNV, Buffer> implements NativeResource {
        private static final VkPipelineRepresentativeFragmentTestStateCreateInfoNV ELEMENT_FACTORY = VkPipelineRepresentativeFragmentTestStateCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineRepresentativeFragmentTestStateCreateInfoNV.SIZEOF);
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
        public VkPipelineRepresentativeFragmentTestStateCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineRepresentativeFragmentTestStateCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineRepresentativeFragmentTestStateCreateInfoNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean representativeFragmentTestEnable() {
            return VkPipelineRepresentativeFragmentTestStateCreateInfoNV.nrepresentativeFragmentTestEnable(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineRepresentativeFragmentTestStateCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVRepresentativeFragmentTest.VK_STRUCTURE_TYPE_PIPELINE_REPRESENTATIVE_FRAGMENT_TEST_STATE_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineRepresentativeFragmentTestStateCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer representativeFragmentTestEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineRepresentativeFragmentTestStateCreateInfoNV.nrepresentativeFragmentTestEnable(address(), value ? 1 : 0);
            return this;
        }
    }
}
