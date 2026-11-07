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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDiagnosticsConfigFeaturesNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDiagnosticsConfigFeaturesNV.class */
public class VkPhysicalDeviceDiagnosticsConfigFeaturesNV extends Struct<VkPhysicalDeviceDiagnosticsConfigFeaturesNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DIAGNOSTICSCONFIG;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DIAGNOSTICSCONFIG = layout.offsetof(2);
    }

    protected VkPhysicalDeviceDiagnosticsConfigFeaturesNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(address, container);
    }

    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV(ByteBuffer container) {
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
    public boolean diagnosticsConfig() {
        return ndiagnosticsConfig(address()) != 0;
    }

    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV sType$Default() {
        return sType(NVDeviceDiagnosticsConfig.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV);
    }

    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV diagnosticsConfig(@NativeType("VkBool32") boolean value) {
        ndiagnosticsConfig(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV set(int sType, long pNext, boolean diagnosticsConfig) {
        sType(sType);
        pNext(pNext);
        diagnosticsConfig(diagnosticsConfig);
        return this;
    }

    public VkPhysicalDeviceDiagnosticsConfigFeaturesNV set(VkPhysicalDeviceDiagnosticsConfigFeaturesNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV malloc() {
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV calloc() {
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV create(long address) {
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(address, null);
    }

    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(address, null);
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

    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV malloc(MemoryStack stack) {
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceDiagnosticsConfigFeaturesNV calloc(MemoryStack stack) {
        return new VkPhysicalDeviceDiagnosticsConfigFeaturesNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndiagnosticsConfig(long struct) {
        return MemoryUtil.memGetInt(struct + DIAGNOSTICSCONFIG);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndiagnosticsConfig(long struct, int value) {
        MemoryUtil.memPutInt(struct + DIAGNOSTICSCONFIG, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDiagnosticsConfigFeaturesNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceDiagnosticsConfigFeaturesNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceDiagnosticsConfigFeaturesNV, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceDiagnosticsConfigFeaturesNV ELEMENT_FACTORY = VkPhysicalDeviceDiagnosticsConfigFeaturesNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceDiagnosticsConfigFeaturesNV.SIZEOF);
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
        public VkPhysicalDeviceDiagnosticsConfigFeaturesNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceDiagnosticsConfigFeaturesNV.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceDiagnosticsConfigFeaturesNV.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean diagnosticsConfig() {
            return VkPhysicalDeviceDiagnosticsConfigFeaturesNV.ndiagnosticsConfig(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceDiagnosticsConfigFeaturesNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceDiagnosticsConfig.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DIAGNOSTICS_CONFIG_FEATURES_NV);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceDiagnosticsConfigFeaturesNV.npNext(address(), value);
            return this;
        }

        public Buffer diagnosticsConfig(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceDiagnosticsConfigFeaturesNV.ndiagnosticsConfig(address(), value ? 1 : 0);
            return this;
        }
    }
}
