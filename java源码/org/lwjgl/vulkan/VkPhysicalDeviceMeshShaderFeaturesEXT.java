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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderFeaturesEXT.class */
public class VkPhysicalDeviceMeshShaderFeaturesEXT extends Struct<VkPhysicalDeviceMeshShaderFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TASKSHADER;
    public static final int MESHSHADER;
    public static final int MULTIVIEWMESHSHADER;
    public static final int PRIMITIVEFRAGMENTSHADINGRATEMESHSHADER;
    public static final int MESHSHADERQUERIES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TASKSHADER = layout.offsetof(2);
        MESHSHADER = layout.offsetof(3);
        MULTIVIEWMESHSHADER = layout.offsetof(4);
        PRIMITIVEFRAGMENTSHADINGRATEMESHSHADER = layout.offsetof(5);
        MESHSHADERQUERIES = layout.offsetof(6);
    }

    protected VkPhysicalDeviceMeshShaderFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceMeshShaderFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceMeshShaderFeaturesEXT(ByteBuffer container) {
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
    public boolean taskShader() {
        return ntaskShader(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean meshShader() {
        return nmeshShader(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean multiviewMeshShader() {
        return nmultiviewMeshShader(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean primitiveFragmentShadingRateMeshShader() {
        return nprimitiveFragmentShadingRateMeshShader(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean meshShaderQueries() {
        return nmeshShaderQueries(address()) != 0;
    }

    public VkPhysicalDeviceMeshShaderFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceMeshShaderFeaturesEXT sType$Default() {
        return sType(1000328000);
    }

    public VkPhysicalDeviceMeshShaderFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceMeshShaderFeaturesEXT taskShader(@NativeType("VkBool32") boolean value) {
        ntaskShader(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShader(@NativeType("VkBool32") boolean value) {
        nmeshShader(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMeshShaderFeaturesEXT multiviewMeshShader(@NativeType("VkBool32") boolean value) {
        nmultiviewMeshShader(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMeshShaderFeaturesEXT primitiveFragmentShadingRateMeshShader(@NativeType("VkBool32") boolean value) {
        nprimitiveFragmentShadingRateMeshShader(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMeshShaderFeaturesEXT meshShaderQueries(@NativeType("VkBool32") boolean value) {
        nmeshShaderQueries(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceMeshShaderFeaturesEXT set(int sType, long pNext, boolean taskShader, boolean meshShader, boolean multiviewMeshShader, boolean primitiveFragmentShadingRateMeshShader, boolean meshShaderQueries) {
        sType(sType);
        pNext(pNext);
        taskShader(taskShader);
        meshShader(meshShader);
        multiviewMeshShader(multiviewMeshShader);
        primitiveFragmentShadingRateMeshShader(primitiveFragmentShadingRateMeshShader);
        meshShaderQueries(meshShaderQueries);
        return this;
    }

    public VkPhysicalDeviceMeshShaderFeaturesEXT set(VkPhysicalDeviceMeshShaderFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceMeshShaderFeaturesEXT malloc() {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceMeshShaderFeaturesEXT calloc() {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceMeshShaderFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceMeshShaderFeaturesEXT create(long address) {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceMeshShaderFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceMeshShaderFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceMeshShaderFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntaskShader(long struct) {
        return MemoryUtil.memGetInt(struct + TASKSHADER);
    }

    public static int nmeshShader(long struct) {
        return MemoryUtil.memGetInt(struct + MESHSHADER);
    }

    public static int nmultiviewMeshShader(long struct) {
        return MemoryUtil.memGetInt(struct + MULTIVIEWMESHSHADER);
    }

    public static int nprimitiveFragmentShadingRateMeshShader(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMITIVEFRAGMENTSHADINGRATEMESHSHADER);
    }

    public static int nmeshShaderQueries(long struct) {
        return MemoryUtil.memGetInt(struct + MESHSHADERQUERIES);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntaskShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + TASKSHADER, value);
    }

    public static void nmeshShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + MESHSHADER, value);
    }

    public static void nmultiviewMeshShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + MULTIVIEWMESHSHADER, value);
    }

    public static void nprimitiveFragmentShadingRateMeshShader(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIMITIVEFRAGMENTSHADINGRATEMESHSHADER, value);
    }

    public static void nmeshShaderQueries(long struct, int value) {
        MemoryUtil.memPutInt(struct + MESHSHADERQUERIES, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceMeshShaderFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceMeshShaderFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceMeshShaderFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceMeshShaderFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceMeshShaderFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceMeshShaderFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceMeshShaderFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceMeshShaderFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean taskShader() {
            return VkPhysicalDeviceMeshShaderFeaturesEXT.ntaskShader(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean meshShader() {
            return VkPhysicalDeviceMeshShaderFeaturesEXT.nmeshShader(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean multiviewMeshShader() {
            return VkPhysicalDeviceMeshShaderFeaturesEXT.nmultiviewMeshShader(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean primitiveFragmentShadingRateMeshShader() {
            return VkPhysicalDeviceMeshShaderFeaturesEXT.nprimitiveFragmentShadingRateMeshShader(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean meshShaderQueries() {
            return VkPhysicalDeviceMeshShaderFeaturesEXT.nmeshShaderQueries(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceMeshShaderFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000328000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceMeshShaderFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer taskShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMeshShaderFeaturesEXT.ntaskShader(address(), value ? 1 : 0);
            return this;
        }

        public Buffer meshShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMeshShaderFeaturesEXT.nmeshShader(address(), value ? 1 : 0);
            return this;
        }

        public Buffer multiviewMeshShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMeshShaderFeaturesEXT.nmultiviewMeshShader(address(), value ? 1 : 0);
            return this;
        }

        public Buffer primitiveFragmentShadingRateMeshShader(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMeshShaderFeaturesEXT.nprimitiveFragmentShadingRateMeshShader(address(), value ? 1 : 0);
            return this;
        }

        public Buffer meshShaderQueries(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceMeshShaderFeaturesEXT.nmeshShaderQueries(address(), value ? 1 : 0);
            return this;
        }
    }
}
