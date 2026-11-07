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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceDiagnosticsConfigCreateInfoNV.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceDiagnosticsConfigCreateInfoNV.class */
public class VkDeviceDiagnosticsConfigCreateInfoNV extends Struct<VkDeviceDiagnosticsConfigCreateInfoNV> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
    }

    protected VkDeviceDiagnosticsConfigCreateInfoNV(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceDiagnosticsConfigCreateInfoNV create(long address, ByteBuffer container) {
        return new VkDeviceDiagnosticsConfigCreateInfoNV(address, container);
    }

    public VkDeviceDiagnosticsConfigCreateInfoNV(ByteBuffer container) {
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

    @NativeType("VkDeviceDiagnosticsConfigFlagsNV")
    public int flags() {
        return nflags(address());
    }

    public VkDeviceDiagnosticsConfigCreateInfoNV sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceDiagnosticsConfigCreateInfoNV sType$Default() {
        return sType(NVDeviceDiagnosticsConfig.VK_STRUCTURE_TYPE_DEVICE_DIAGNOSTICS_CONFIG_CREATE_INFO_NV);
    }

    public VkDeviceDiagnosticsConfigCreateInfoNV pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceDiagnosticsConfigCreateInfoNV flags(@NativeType("VkDeviceDiagnosticsConfigFlagsNV") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDeviceDiagnosticsConfigCreateInfoNV set(int sType, long pNext, int flags) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        return this;
    }

    public VkDeviceDiagnosticsConfigCreateInfoNV set(VkDeviceDiagnosticsConfigCreateInfoNV src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceDiagnosticsConfigCreateInfoNV malloc() {
        return new VkDeviceDiagnosticsConfigCreateInfoNV(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceDiagnosticsConfigCreateInfoNV calloc() {
        return new VkDeviceDiagnosticsConfigCreateInfoNV(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceDiagnosticsConfigCreateInfoNV create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceDiagnosticsConfigCreateInfoNV(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceDiagnosticsConfigCreateInfoNV create(long address) {
        return new VkDeviceDiagnosticsConfigCreateInfoNV(address, null);
    }

    public static VkDeviceDiagnosticsConfigCreateInfoNV createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceDiagnosticsConfigCreateInfoNV(address, null);
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

    public static VkDeviceDiagnosticsConfigCreateInfoNV malloc(MemoryStack stack) {
        return new VkDeviceDiagnosticsConfigCreateInfoNV(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceDiagnosticsConfigCreateInfoNV calloc(MemoryStack stack) {
        return new VkDeviceDiagnosticsConfigCreateInfoNV(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nflags(long struct) {
        return MemoryUtil.memGetInt(struct + FLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nflags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FLAGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceDiagnosticsConfigCreateInfoNV$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceDiagnosticsConfigCreateInfoNV$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceDiagnosticsConfigCreateInfoNV, Buffer> implements NativeResource {
        private static final VkDeviceDiagnosticsConfigCreateInfoNV ELEMENT_FACTORY = VkDeviceDiagnosticsConfigCreateInfoNV.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceDiagnosticsConfigCreateInfoNV.SIZEOF);
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
        public VkDeviceDiagnosticsConfigCreateInfoNV getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceDiagnosticsConfigCreateInfoNV.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceDiagnosticsConfigCreateInfoNV.npNext(address());
        }

        @NativeType("VkDeviceDiagnosticsConfigFlagsNV")
        public int flags() {
            return VkDeviceDiagnosticsConfigCreateInfoNV.nflags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceDiagnosticsConfigCreateInfoNV.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(NVDeviceDiagnosticsConfig.VK_STRUCTURE_TYPE_DEVICE_DIAGNOSTICS_CONFIG_CREATE_INFO_NV);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceDiagnosticsConfigCreateInfoNV.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkDeviceDiagnosticsConfigFlagsNV") int value) {
            VkDeviceDiagnosticsConfigCreateInfoNV.nflags(address(), value);
            return this;
        }
    }
}
