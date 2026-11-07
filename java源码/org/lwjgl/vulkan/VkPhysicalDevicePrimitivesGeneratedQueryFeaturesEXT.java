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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.class */
public class VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT extends Struct<VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PRIMITIVESGENERATEDQUERY;
    public static final int PRIMITIVESGENERATEDQUERYWITHRASTERIZERDISCARD;
    public static final int PRIMITIVESGENERATEDQUERYWITHNONZEROSTREAMS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRIMITIVESGENERATEDQUERY = layout.offsetof(2);
        PRIMITIVESGENERATEDQUERYWITHRASTERIZERDISCARD = layout.offsetof(3);
        PRIMITIVESGENERATEDQUERYWITHNONZEROSTREAMS = layout.offsetof(4);
    }

    protected VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(address, container);
    }

    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(ByteBuffer container) {
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
    public boolean primitivesGeneratedQuery() {
        return nprimitivesGeneratedQuery(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean primitivesGeneratedQueryWithRasterizerDiscard() {
        return nprimitivesGeneratedQueryWithRasterizerDiscard(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean primitivesGeneratedQueryWithNonZeroStreams() {
        return nprimitivesGeneratedQueryWithNonZeroStreams(address()) != 0;
    }

    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT sType$Default() {
        return sType(1000382000);
    }

    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQuery(@NativeType("VkBool32") boolean value) {
        nprimitivesGeneratedQuery(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithRasterizerDiscard(@NativeType("VkBool32") boolean value) {
        nprimitivesGeneratedQueryWithRasterizerDiscard(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT primitivesGeneratedQueryWithNonZeroStreams(@NativeType("VkBool32") boolean value) {
        nprimitivesGeneratedQueryWithNonZeroStreams(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT set(int sType, long pNext, boolean primitivesGeneratedQuery, boolean primitivesGeneratedQueryWithRasterizerDiscard, boolean primitivesGeneratedQueryWithNonZeroStreams) {
        sType(sType);
        pNext(pNext);
        primitivesGeneratedQuery(primitivesGeneratedQuery);
        primitivesGeneratedQueryWithRasterizerDiscard(primitivesGeneratedQueryWithRasterizerDiscard);
        primitivesGeneratedQueryWithNonZeroStreams(primitivesGeneratedQueryWithNonZeroStreams);
        return this;
    }

    public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT set(VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT malloc() {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT calloc() {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT create(long address) {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(address, null);
    }

    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(address, null);
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

    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nprimitivesGeneratedQuery(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMITIVESGENERATEDQUERY);
    }

    public static int nprimitivesGeneratedQueryWithRasterizerDiscard(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMITIVESGENERATEDQUERYWITHRASTERIZERDISCARD);
    }

    public static int nprimitivesGeneratedQueryWithNonZeroStreams(long struct) {
        return MemoryUtil.memGetInt(struct + PRIMITIVESGENERATEDQUERYWITHNONZEROSTREAMS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nprimitivesGeneratedQuery(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIMITIVESGENERATEDQUERY, value);
    }

    public static void nprimitivesGeneratedQueryWithRasterizerDiscard(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIMITIVESGENERATEDQUERYWITHRASTERIZERDISCARD, value);
    }

    public static void nprimitivesGeneratedQueryWithNonZeroStreams(long struct, int value) {
        MemoryUtil.memPutInt(struct + PRIMITIVESGENERATEDQUERYWITHNONZEROSTREAMS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.SIZEOF);
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
        public VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean primitivesGeneratedQuery() {
            return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nprimitivesGeneratedQuery(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean primitivesGeneratedQueryWithRasterizerDiscard() {
            return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nprimitivesGeneratedQueryWithRasterizerDiscard(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean primitivesGeneratedQueryWithNonZeroStreams() {
            return VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nprimitivesGeneratedQueryWithNonZeroStreams(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000382000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer primitivesGeneratedQuery(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nprimitivesGeneratedQuery(address(), value ? 1 : 0);
            return this;
        }

        public Buffer primitivesGeneratedQueryWithRasterizerDiscard(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nprimitivesGeneratedQueryWithRasterizerDiscard(address(), value ? 1 : 0);
            return this;
        }

        public Buffer primitivesGeneratedQueryWithNonZeroStreams(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT.nprimitivesGeneratedQueryWithNonZeroStreams(address(), value ? 1 : 0);
            return this;
        }
    }
}
