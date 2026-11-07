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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineExecutableInternalRepresentationKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineExecutableInternalRepresentationKHR.class */
public class VkPipelineExecutableInternalRepresentationKHR extends Struct<VkPipelineExecutableInternalRepresentationKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int NAME;
    public static final int DESCRIPTION;
    public static final int ISTEXT;
    public static final int DATASIZE;
    public static final int PDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __array(1, 256), __array(1, 256), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NAME = layout.offsetof(2);
        DESCRIPTION = layout.offsetof(3);
        ISTEXT = layout.offsetof(4);
        DATASIZE = layout.offsetof(5);
        PDATA = layout.offsetof(6);
    }

    protected VkPipelineExecutableInternalRepresentationKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineExecutableInternalRepresentationKHR create(long address, ByteBuffer container) {
        return new VkPipelineExecutableInternalRepresentationKHR(address, container);
    }

    public VkPipelineExecutableInternalRepresentationKHR(ByteBuffer container) {
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

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String nameString() {
        return nnameString(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public ByteBuffer description() {
        return ndescription(address());
    }

    @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
    public String descriptionString() {
        return ndescriptionString(address());
    }

    @NativeType("VkBool32")
    public boolean isText() {
        return nisText(address()) != 0;
    }

    @NativeType("size_t")
    public long dataSize() {
        return ndataSize(address());
    }

    @NativeType("void *")
    public ByteBuffer pData() {
        return npData(address());
    }

    public VkPipelineExecutableInternalRepresentationKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineExecutableInternalRepresentationKHR sType$Default() {
        return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR);
    }

    public VkPipelineExecutableInternalRepresentationKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineExecutableInternalRepresentationKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPipelineExecutableInternalRepresentationKHR set(VkPipelineExecutableInternalRepresentationKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineExecutableInternalRepresentationKHR malloc() {
        return new VkPipelineExecutableInternalRepresentationKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineExecutableInternalRepresentationKHR calloc() {
        return new VkPipelineExecutableInternalRepresentationKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineExecutableInternalRepresentationKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineExecutableInternalRepresentationKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineExecutableInternalRepresentationKHR create(long address) {
        return new VkPipelineExecutableInternalRepresentationKHR(address, null);
    }

    public static VkPipelineExecutableInternalRepresentationKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineExecutableInternalRepresentationKHR(address, null);
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

    public static VkPipelineExecutableInternalRepresentationKHR malloc(MemoryStack stack) {
        return new VkPipelineExecutableInternalRepresentationKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineExecutableInternalRepresentationKHR calloc(MemoryStack stack) {
        return new VkPipelineExecutableInternalRepresentationKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBuffer(struct + NAME, 256);
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memUTF8(struct + NAME);
    }

    public static ByteBuffer ndescription(long struct) {
        return MemoryUtil.memByteBuffer(struct + DESCRIPTION, 256);
    }

    public static String ndescriptionString(long struct) {
        return MemoryUtil.memUTF8(struct + DESCRIPTION);
    }

    public static int nisText(long struct) {
        return MemoryUtil.memGetInt(struct + ISTEXT);
    }

    public static long ndataSize(long struct) {
        return MemoryUtil.memGetAddress(struct + DATASIZE);
    }

    public static ByteBuffer npData(long struct) {
        return MemoryUtil.memByteBufferSafe(MemoryUtil.memGetAddress(struct + PDATA), (int) ndataSize(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineExecutableInternalRepresentationKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineExecutableInternalRepresentationKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineExecutableInternalRepresentationKHR, Buffer> implements NativeResource {
        private static final VkPipelineExecutableInternalRepresentationKHR ELEMENT_FACTORY = VkPipelineExecutableInternalRepresentationKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineExecutableInternalRepresentationKHR.SIZEOF);
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
        public VkPipelineExecutableInternalRepresentationKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineExecutableInternalRepresentationKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPipelineExecutableInternalRepresentationKHR.npNext(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer name() {
            return VkPipelineExecutableInternalRepresentationKHR.nname(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String nameString() {
            return VkPipelineExecutableInternalRepresentationKHR.nnameString(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public ByteBuffer description() {
            return VkPipelineExecutableInternalRepresentationKHR.ndescription(address());
        }

        @NativeType("char[VK_MAX_DESCRIPTION_SIZE]")
        public String descriptionString() {
            return VkPipelineExecutableInternalRepresentationKHR.ndescriptionString(address());
        }

        @NativeType("VkBool32")
        public boolean isText() {
            return VkPipelineExecutableInternalRepresentationKHR.nisText(address()) != 0;
        }

        @NativeType("size_t")
        public long dataSize() {
            return VkPipelineExecutableInternalRepresentationKHR.ndataSize(address());
        }

        @NativeType("void *")
        public ByteBuffer pData() {
            return VkPipelineExecutableInternalRepresentationKHR.npData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineExecutableInternalRepresentationKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRPipelineExecutableProperties.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INTERNAL_REPRESENTATION_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPipelineExecutableInternalRepresentationKHR.npNext(address(), value);
            return this;
        }
    }
}
