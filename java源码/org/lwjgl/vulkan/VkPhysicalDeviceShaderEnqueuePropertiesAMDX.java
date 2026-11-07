package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueuePropertiesAMDX.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueuePropertiesAMDX.class */
public class VkPhysicalDeviceShaderEnqueuePropertiesAMDX extends Struct<VkPhysicalDeviceShaderEnqueuePropertiesAMDX> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int MAXEXECUTIONGRAPHDEPTH;
    public static final int MAXEXECUTIONGRAPHSHADEROUTPUTNODES;
    public static final int MAXEXECUTIONGRAPHSHADERPAYLOADSIZE;
    public static final int MAXEXECUTIONGRAPHSHADERPAYLOADCOUNT;
    public static final int EXECUTIONGRAPHDISPATCHADDRESSALIGNMENT;
    public static final int MAXEXECUTIONGRAPHWORKGROUPCOUNT;
    public static final int MAXEXECUTIONGRAPHWORKGROUPS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __array(4, 3), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        MAXEXECUTIONGRAPHDEPTH = layout.offsetof(2);
        MAXEXECUTIONGRAPHSHADEROUTPUTNODES = layout.offsetof(3);
        MAXEXECUTIONGRAPHSHADERPAYLOADSIZE = layout.offsetof(4);
        MAXEXECUTIONGRAPHSHADERPAYLOADCOUNT = layout.offsetof(5);
        EXECUTIONGRAPHDISPATCHADDRESSALIGNMENT = layout.offsetof(6);
        MAXEXECUTIONGRAPHWORKGROUPCOUNT = layout.offsetof(7);
        MAXEXECUTIONGRAPHWORKGROUPS = layout.offsetof(8);
    }

    protected VkPhysicalDeviceShaderEnqueuePropertiesAMDX(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(address, container);
    }

    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int maxExecutionGraphDepth() {
        return nmaxExecutionGraphDepth(address());
    }

    @NativeType("uint32_t")
    public int maxExecutionGraphShaderOutputNodes() {
        return nmaxExecutionGraphShaderOutputNodes(address());
    }

    @NativeType("uint32_t")
    public int maxExecutionGraphShaderPayloadSize() {
        return nmaxExecutionGraphShaderPayloadSize(address());
    }

    @NativeType("uint32_t")
    public int maxExecutionGraphShaderPayloadCount() {
        return nmaxExecutionGraphShaderPayloadCount(address());
    }

    @NativeType("uint32_t")
    public int executionGraphDispatchAddressAlignment() {
        return nexecutionGraphDispatchAddressAlignment(address());
    }

    @NativeType("uint32_t[3]")
    public IntBuffer maxExecutionGraphWorkgroupCount() {
        return nmaxExecutionGraphWorkgroupCount(address());
    }

    @NativeType("uint32_t")
    public int maxExecutionGraphWorkgroupCount(int index) {
        return nmaxExecutionGraphWorkgroupCount(address(), index);
    }

    @NativeType("uint32_t")
    public int maxExecutionGraphWorkgroups() {
        return nmaxExecutionGraphWorkgroups(address());
    }

    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX sType$Default() {
        return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX);
    }

    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceShaderEnqueuePropertiesAMDX set(VkPhysicalDeviceShaderEnqueuePropertiesAMDX src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX malloc() {
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX calloc() {
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX create(long address) {
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(address, null);
    }

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(address, null);
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

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderEnqueuePropertiesAMDX calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderEnqueuePropertiesAMDX(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmaxExecutionGraphDepth(long struct) {
        return MemoryUtil.memGetInt(struct + MAXEXECUTIONGRAPHDEPTH);
    }

    public static int nmaxExecutionGraphShaderOutputNodes(long struct) {
        return MemoryUtil.memGetInt(struct + MAXEXECUTIONGRAPHSHADEROUTPUTNODES);
    }

    public static int nmaxExecutionGraphShaderPayloadSize(long struct) {
        return MemoryUtil.memGetInt(struct + MAXEXECUTIONGRAPHSHADERPAYLOADSIZE);
    }

    public static int nmaxExecutionGraphShaderPayloadCount(long struct) {
        return MemoryUtil.memGetInt(struct + MAXEXECUTIONGRAPHSHADERPAYLOADCOUNT);
    }

    public static int nexecutionGraphDispatchAddressAlignment(long struct) {
        return MemoryUtil.memGetInt(struct + EXECUTIONGRAPHDISPATCHADDRESSALIGNMENT);
    }

    public static IntBuffer nmaxExecutionGraphWorkgroupCount(long struct) {
        return MemoryUtil.memIntBuffer(struct + MAXEXECUTIONGRAPHWORKGROUPCOUNT, 3);
    }

    public static int nmaxExecutionGraphWorkgroupCount(long struct, int index) {
        return MemoryUtil.memGetInt(struct + MAXEXECUTIONGRAPHWORKGROUPCOUNT + (Checks.check(index, 3) * 4));
    }

    public static int nmaxExecutionGraphWorkgroups(long struct) {
        return MemoryUtil.memGetInt(struct + MAXEXECUTIONGRAPHWORKGROUPS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderEnqueuePropertiesAMDX$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderEnqueuePropertiesAMDX, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderEnqueuePropertiesAMDX ELEMENT_FACTORY = VkPhysicalDeviceShaderEnqueuePropertiesAMDX.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderEnqueuePropertiesAMDX.SIZEOF);
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
        public VkPhysicalDeviceShaderEnqueuePropertiesAMDX getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.npNext(address());
        }

        @NativeType("uint32_t")
        public int maxExecutionGraphDepth() {
            return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphDepth(address());
        }

        @NativeType("uint32_t")
        public int maxExecutionGraphShaderOutputNodes() {
            return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderOutputNodes(address());
        }

        @NativeType("uint32_t")
        public int maxExecutionGraphShaderPayloadSize() {
            return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderPayloadSize(address());
        }

        @NativeType("uint32_t")
        public int maxExecutionGraphShaderPayloadCount() {
            return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphShaderPayloadCount(address());
        }

        @NativeType("uint32_t")
        public int executionGraphDispatchAddressAlignment() {
            return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nexecutionGraphDispatchAddressAlignment(address());
        }

        @NativeType("uint32_t[3]")
        public IntBuffer maxExecutionGraphWorkgroupCount() {
            return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphWorkgroupCount(address());
        }

        @NativeType("uint32_t")
        public int maxExecutionGraphWorkgroupCount(int index) {
            return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphWorkgroupCount(address(), index);
        }

        @NativeType("uint32_t")
        public int maxExecutionGraphWorkgroups() {
            return VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nmaxExecutionGraphWorkgroups(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderEnqueuePropertiesAMDX.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDXShaderEnqueue.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ENQUEUE_PROPERTIES_AMDX);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderEnqueuePropertiesAMDX.npNext(address(), value);
            return this;
        }
    }
}
