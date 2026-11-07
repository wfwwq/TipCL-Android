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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan11Features.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan11Features.class */
public class VkPhysicalDeviceVulkan11Features extends Struct<VkPhysicalDeviceVulkan11Features> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int STORAGEBUFFER16BITACCESS;
    public static final int UNIFORMANDSTORAGEBUFFER16BITACCESS;
    public static final int STORAGEPUSHCONSTANT16;
    public static final int STORAGEINPUTOUTPUT16;
    public static final int MULTIVIEW;
    public static final int MULTIVIEWGEOMETRYSHADER;
    public static final int MULTIVIEWTESSELLATIONSHADER;
    public static final int VARIABLEPOINTERSSTORAGEBUFFER;
    public static final int VARIABLEPOINTERS;
    public static final int PROTECTEDMEMORY;
    public static final int SAMPLERYCBCRCONVERSION;
    public static final int SHADERDRAWPARAMETERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        STORAGEBUFFER16BITACCESS = layout.offsetof(2);
        UNIFORMANDSTORAGEBUFFER16BITACCESS = layout.offsetof(3);
        STORAGEPUSHCONSTANT16 = layout.offsetof(4);
        STORAGEINPUTOUTPUT16 = layout.offsetof(5);
        MULTIVIEW = layout.offsetof(6);
        MULTIVIEWGEOMETRYSHADER = layout.offsetof(7);
        MULTIVIEWTESSELLATIONSHADER = layout.offsetof(8);
        VARIABLEPOINTERSSTORAGEBUFFER = layout.offsetof(9);
        VARIABLEPOINTERS = layout.offsetof(10);
        PROTECTEDMEMORY = layout.offsetof(11);
        SAMPLERYCBCRCONVERSION = layout.offsetof(12);
        SHADERDRAWPARAMETERS = layout.offsetof(13);
    }

    protected VkPhysicalDeviceVulkan11Features(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceVulkan11Features create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceVulkan11Features(address, container);
    }

    public VkPhysicalDeviceVulkan11Features(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean storageBuffer16BitAccess() {
        return nstorageBuffer16BitAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean uniformAndStorageBuffer16BitAccess() {
        return nuniformAndStorageBuffer16BitAccess(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean storagePushConstant16() {
        return nstoragePushConstant16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean storageInputOutput16() {
        return nstorageInputOutput16(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean multiview() {
        return nmultiview(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean multiviewGeometryShader() {
        return nmultiviewGeometryShader(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean multiviewTessellationShader() {
        return nmultiviewTessellationShader(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean variablePointersStorageBuffer() {
        return nvariablePointersStorageBuffer(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean variablePointers() {
        return nvariablePointers(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean protectedMemory() {
        return nprotectedMemory(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean samplerYcbcrConversion() {
        return nsamplerYcbcrConversion(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean shaderDrawParameters() {
        return nshaderDrawParameters(address()) != 0;
    }

    public VkPhysicalDeviceVulkan11Features sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features sType$Default() {
        return sType(49);
    }

    public VkPhysicalDeviceVulkan11Features pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) {
        nstorageBuffer16BitAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) {
        nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features storagePushConstant16(@NativeType("VkBool32") boolean value) {
        nstoragePushConstant16(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features storageInputOutput16(@NativeType("VkBool32") boolean value) {
        nstorageInputOutput16(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features multiview(@NativeType("VkBool32") boolean value) {
        nmultiview(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features multiviewGeometryShader(@NativeType("VkBool32") boolean value) {
        nmultiviewGeometryShader(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features multiviewTessellationShader(@NativeType("VkBool32") boolean value) {
        nmultiviewTessellationShader(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) {
        nvariablePointersStorageBuffer(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features variablePointers(@NativeType("VkBool32") boolean value) {
        nvariablePointers(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features protectedMemory(@NativeType("VkBool32") boolean value) {
        nprotectedMemory(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features samplerYcbcrConversion(@NativeType("VkBool32") boolean value) {
        nsamplerYcbcrConversion(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features shaderDrawParameters(@NativeType("VkBool32") boolean value) {
        nshaderDrawParameters(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features set(int sType, long pNext, boolean storageBuffer16BitAccess, boolean uniformAndStorageBuffer16BitAccess, boolean storagePushConstant16, boolean storageInputOutput16, boolean multiview, boolean multiviewGeometryShader, boolean multiviewTessellationShader, boolean variablePointersStorageBuffer, boolean variablePointers, boolean protectedMemory, boolean samplerYcbcrConversion, boolean shaderDrawParameters) {
        sType(sType);
        pNext(pNext);
        storageBuffer16BitAccess(storageBuffer16BitAccess);
        uniformAndStorageBuffer16BitAccess(uniformAndStorageBuffer16BitAccess);
        storagePushConstant16(storagePushConstant16);
        storageInputOutput16(storageInputOutput16);
        multiview(multiview);
        multiviewGeometryShader(multiviewGeometryShader);
        multiviewTessellationShader(multiviewTessellationShader);
        variablePointersStorageBuffer(variablePointersStorageBuffer);
        variablePointers(variablePointers);
        protectedMemory(protectedMemory);
        samplerYcbcrConversion(samplerYcbcrConversion);
        shaderDrawParameters(shaderDrawParameters);
        return this;
    }

    public VkPhysicalDeviceVulkan11Features set(VkPhysicalDeviceVulkan11Features src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceVulkan11Features malloc() {
        return new VkPhysicalDeviceVulkan11Features(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan11Features calloc() {
        return new VkPhysicalDeviceVulkan11Features(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan11Features create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceVulkan11Features(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceVulkan11Features create(long address) {
        return new VkPhysicalDeviceVulkan11Features(address, null);
    }

    public static VkPhysicalDeviceVulkan11Features createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceVulkan11Features(address, null);
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

    public static VkPhysicalDeviceVulkan11Features malloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan11Features(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceVulkan11Features calloc(MemoryStack stack) {
        return new VkPhysicalDeviceVulkan11Features(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nstorageBuffer16BitAccess(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGEBUFFER16BITACCESS);
    }

    public static int nuniformAndStorageBuffer16BitAccess(long struct) {
        return MemoryUtil.memGetInt(struct + UNIFORMANDSTORAGEBUFFER16BITACCESS);
    }

    public static int nstoragePushConstant16(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGEPUSHCONSTANT16);
    }

    public static int nstorageInputOutput16(long struct) {
        return MemoryUtil.memGetInt(struct + STORAGEINPUTOUTPUT16);
    }

    public static int nmultiview(long struct) {
        return MemoryUtil.memGetInt(struct + MULTIVIEW);
    }

    public static int nmultiviewGeometryShader(long struct) {
        return MemoryUtil.memGetInt(struct + MULTIVIEWGEOMETRYSHADER);
    }

    public static int nmultiviewTessellationShader(long struct) {
        return MemoryUtil.memGetInt(struct + MULTIVIEWTESSELLATIONSHADER);
    }

    public static int nvariablePointersStorageBuffer(long struct) {
        return MemoryUtil.memGetInt(struct + VARIABLEPOINTERSSTORAGEBUFFER);
    }

    public static int nvariablePointers(long struct) {
        return MemoryUtil.memGetInt(struct + VARIABLEPOINTERS);
    }

    public static int nprotectedMemory(long struct) {
        return MemoryUtil.memGetInt(struct + PROTECTEDMEMORY);
    }

    public static int nsamplerYcbcrConversion(long struct) {
        return MemoryUtil.memGetInt(struct + SAMPLERYCBCRCONVERSION);
    }

    public static int nshaderDrawParameters(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERDRAWPARAMETERS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nstorageBuffer16BitAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + STORAGEBUFFER16BITACCESS, value);
    }

    public static void nuniformAndStorageBuffer16BitAccess(long struct, int value) {
        MemoryUtil.memPutInt(struct + UNIFORMANDSTORAGEBUFFER16BITACCESS, value);
    }

    public static void nstoragePushConstant16(long struct, int value) {
        MemoryUtil.memPutInt(struct + STORAGEPUSHCONSTANT16, value);
    }

    public static void nstorageInputOutput16(long struct, int value) {
        MemoryUtil.memPutInt(struct + STORAGEINPUTOUTPUT16, value);
    }

    public static void nmultiview(long struct, int value) {
        MemoryUtil.memPutInt(struct + MULTIVIEW, value);
    }

    public static void nmultiviewGeometryShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + MULTIVIEWGEOMETRYSHADER, value);
    }

    public static void nmultiviewTessellationShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + MULTIVIEWTESSELLATIONSHADER, value);
    }

    public static void nvariablePointersStorageBuffer(long struct, int value) {
        MemoryUtil.memPutInt(struct + VARIABLEPOINTERSSTORAGEBUFFER, value);
    }

    public static void nvariablePointers(long struct, int value) {
        MemoryUtil.memPutInt(struct + VARIABLEPOINTERS, value);
    }

    public static void nprotectedMemory(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROTECTEDMEMORY, value);
    }

    public static void nsamplerYcbcrConversion(long struct, int value) {
        MemoryUtil.memPutInt(struct + SAMPLERYCBCRCONVERSION, value);
    }

    public static void nshaderDrawParameters(long struct, int value) {
        MemoryUtil.memPutInt(struct + SHADERDRAWPARAMETERS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan11Features$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan11Features$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceVulkan11Features, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceVulkan11Features ELEMENT_FACTORY = VkPhysicalDeviceVulkan11Features.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceVulkan11Features.SIZEOF);
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
        public VkPhysicalDeviceVulkan11Features getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceVulkan11Features.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceVulkan11Features.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean storageBuffer16BitAccess() {
            return VkPhysicalDeviceVulkan11Features.nstorageBuffer16BitAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean uniformAndStorageBuffer16BitAccess() {
            return VkPhysicalDeviceVulkan11Features.nuniformAndStorageBuffer16BitAccess(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean storagePushConstant16() {
            return VkPhysicalDeviceVulkan11Features.nstoragePushConstant16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean storageInputOutput16() {
            return VkPhysicalDeviceVulkan11Features.nstorageInputOutput16(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean multiview() {
            return VkPhysicalDeviceVulkan11Features.nmultiview(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean multiviewGeometryShader() {
            return VkPhysicalDeviceVulkan11Features.nmultiviewGeometryShader(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean multiviewTessellationShader() {
            return VkPhysicalDeviceVulkan11Features.nmultiviewTessellationShader(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean variablePointersStorageBuffer() {
            return VkPhysicalDeviceVulkan11Features.nvariablePointersStorageBuffer(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean variablePointers() {
            return VkPhysicalDeviceVulkan11Features.nvariablePointers(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean protectedMemory() {
            return VkPhysicalDeviceVulkan11Features.nprotectedMemory(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean samplerYcbcrConversion() {
            return VkPhysicalDeviceVulkan11Features.nsamplerYcbcrConversion(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean shaderDrawParameters() {
            return VkPhysicalDeviceVulkan11Features.nshaderDrawParameters(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceVulkan11Features.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(49);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceVulkan11Features.npNext(address(), value);
            return this;
        }

        public Buffer storageBuffer16BitAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan11Features.nstorageBuffer16BitAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer uniformAndStorageBuffer16BitAccess(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan11Features.nuniformAndStorageBuffer16BitAccess(address(), value ? 1 : 0);
            return this;
        }

        public Buffer storagePushConstant16(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan11Features.nstoragePushConstant16(address(), value ? 1 : 0);
            return this;
        }

        public Buffer storageInputOutput16(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan11Features.nstorageInputOutput16(address(), value ? 1 : 0);
            return this;
        }

        public Buffer multiview(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan11Features.nmultiview(address(), value ? 1 : 0);
            return this;
        }

        public Buffer multiviewGeometryShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan11Features.nmultiviewGeometryShader(address(), value ? 1 : 0);
            return this;
        }

        public Buffer multiviewTessellationShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan11Features.nmultiviewTessellationShader(address(), value ? 1 : 0);
            return this;
        }

        public Buffer variablePointersStorageBuffer(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan11Features.nvariablePointersStorageBuffer(address(), value ? 1 : 0);
            return this;
        }

        public Buffer variablePointers(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan11Features.nvariablePointers(address(), value ? 1 : 0);
            return this;
        }

        public Buffer protectedMemory(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan11Features.nprotectedMemory(address(), value ? 1 : 0);
            return this;
        }

        public Buffer samplerYcbcrConversion(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan11Features.nsamplerYcbcrConversion(address(), value ? 1 : 0);
            return this;
        }

        public Buffer shaderDrawParameters(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceVulkan11Features.nshaderDrawParameters(address(), value ? 1 : 0);
            return this;
        }
    }
}
