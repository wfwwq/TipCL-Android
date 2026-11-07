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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAmigoProfilingFeaturesSEC.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAmigoProfilingFeaturesSEC.class */
public class VkPhysicalDeviceAmigoProfilingFeaturesSEC extends Struct<VkPhysicalDeviceAmigoProfilingFeaturesSEC> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int AMIGOPROFILING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        AMIGOPROFILING = layout.offsetof(2);
    }

    protected VkPhysicalDeviceAmigoProfilingFeaturesSEC(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceAmigoProfilingFeaturesSEC create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(address, container);
    }

    public VkPhysicalDeviceAmigoProfilingFeaturesSEC(ByteBuffer container) {
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
    public boolean amigoProfiling() {
        return namigoProfiling(address()) != 0;
    }

    public VkPhysicalDeviceAmigoProfilingFeaturesSEC sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceAmigoProfilingFeaturesSEC sType$Default() {
        return sType(SECAmigoProfiling.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC);
    }

    public VkPhysicalDeviceAmigoProfilingFeaturesSEC pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceAmigoProfilingFeaturesSEC amigoProfiling(@NativeType("VkBool32") boolean value) {
        namigoProfiling(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceAmigoProfilingFeaturesSEC set(int sType, long pNext, boolean amigoProfiling) {
        sType(sType);
        pNext(pNext);
        amigoProfiling(amigoProfiling);
        return this;
    }

    public VkPhysicalDeviceAmigoProfilingFeaturesSEC set(VkPhysicalDeviceAmigoProfilingFeaturesSEC src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC malloc() {
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC calloc() {
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC create(long address) {
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(address, null);
    }

    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(address, null);
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

    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC malloc(MemoryStack stack) {
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceAmigoProfilingFeaturesSEC calloc(MemoryStack stack) {
        return new VkPhysicalDeviceAmigoProfilingFeaturesSEC(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int namigoProfiling(long struct) {
        return MemoryUtil.memGetInt(struct + AMIGOPROFILING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void namigoProfiling(long struct, int value) {
        MemoryUtil.memPutInt(struct + AMIGOPROFILING, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAmigoProfilingFeaturesSEC$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceAmigoProfilingFeaturesSEC$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceAmigoProfilingFeaturesSEC, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceAmigoProfilingFeaturesSEC ELEMENT_FACTORY = VkPhysicalDeviceAmigoProfilingFeaturesSEC.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceAmigoProfilingFeaturesSEC.SIZEOF);
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
        public VkPhysicalDeviceAmigoProfilingFeaturesSEC getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceAmigoProfilingFeaturesSEC.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceAmigoProfilingFeaturesSEC.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean amigoProfiling() {
            return VkPhysicalDeviceAmigoProfilingFeaturesSEC.namigoProfiling(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceAmigoProfilingFeaturesSEC.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(SECAmigoProfiling.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_AMIGO_PROFILING_FEATURES_SEC);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceAmigoProfilingFeaturesSEC.npNext(address(), value);
            return this;
        }

        public Buffer amigoProfiling(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceAmigoProfilingFeaturesSEC.namigoProfiling(address(), value ? 1 : 0);
            return this;
        }
    }
}
