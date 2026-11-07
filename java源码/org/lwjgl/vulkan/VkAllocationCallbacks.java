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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAllocationCallbacks.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAllocationCallbacks.class */
public class VkAllocationCallbacks extends Struct<VkAllocationCallbacks> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int PUSERDATA;
    public static final int PFNALLOCATION;
    public static final int PFNREALLOCATION;
    public static final int PFNFREE;
    public static final int PFNINTERNALALLOCATION;
    public static final int PFNINTERNALFREE;

    static {
        Struct.Layout layout = __struct(__member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        PUSERDATA = layout.offsetof(0);
        PFNALLOCATION = layout.offsetof(1);
        PFNREALLOCATION = layout.offsetof(2);
        PFNFREE = layout.offsetof(3);
        PFNINTERNALALLOCATION = layout.offsetof(4);
        PFNINTERNALFREE = layout.offsetof(5);
    }

    protected VkAllocationCallbacks(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkAllocationCallbacks create(long address, ByteBuffer container) {
        return new VkAllocationCallbacks(address, container);
    }

    public VkAllocationCallbacks(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("void *")
    public long pUserData() {
        return npUserData(address());
    }

    @NativeType("PFN_vkAllocationFunction")
    public VkAllocationFunction pfnAllocation() {
        return npfnAllocation(address());
    }

    @NativeType("PFN_vkReallocationFunction")
    public VkReallocationFunction pfnReallocation() {
        return npfnReallocation(address());
    }

    @NativeType("PFN_vkFreeFunction")
    public VkFreeFunction pfnFree() {
        return npfnFree(address());
    }

    @NativeType("PFN_vkInternalAllocationNotification")
    public VkInternalAllocationNotification pfnInternalAllocation() {
        return npfnInternalAllocation(address());
    }

    @NativeType("PFN_vkInternalFreeNotification")
    public VkInternalFreeNotification pfnInternalFree() {
        return npfnInternalFree(address());
    }

    public VkAllocationCallbacks pUserData(@NativeType("void *") long value) {
        npUserData(address(), value);
        return this;
    }

    public VkAllocationCallbacks pfnAllocation(@NativeType("PFN_vkAllocationFunction") VkAllocationFunctionI value) {
        npfnAllocation(address(), value);
        return this;
    }

    public VkAllocationCallbacks pfnReallocation(@NativeType("PFN_vkReallocationFunction") VkReallocationFunctionI value) {
        npfnReallocation(address(), value);
        return this;
    }

    public VkAllocationCallbacks pfnFree(@NativeType("PFN_vkFreeFunction") VkFreeFunctionI value) {
        npfnFree(address(), value);
        return this;
    }

    public VkAllocationCallbacks pfnInternalAllocation(@NativeType("PFN_vkInternalAllocationNotification") VkInternalAllocationNotificationI value) {
        npfnInternalAllocation(address(), value);
        return this;
    }

    public VkAllocationCallbacks pfnInternalFree(@NativeType("PFN_vkInternalFreeNotification") VkInternalFreeNotificationI value) {
        npfnInternalFree(address(), value);
        return this;
    }

    public VkAllocationCallbacks set(long pUserData, VkAllocationFunctionI pfnAllocation, VkReallocationFunctionI pfnReallocation, VkFreeFunctionI pfnFree, VkInternalAllocationNotificationI pfnInternalAllocation, VkInternalFreeNotificationI pfnInternalFree) {
        pUserData(pUserData);
        pfnAllocation(pfnAllocation);
        pfnReallocation(pfnReallocation);
        pfnFree(pfnFree);
        pfnInternalAllocation(pfnInternalAllocation);
        pfnInternalFree(pfnInternalFree);
        return this;
    }

    public VkAllocationCallbacks set(VkAllocationCallbacks src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkAllocationCallbacks malloc() {
        return new VkAllocationCallbacks(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkAllocationCallbacks calloc() {
        return new VkAllocationCallbacks(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkAllocationCallbacks create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkAllocationCallbacks(MemoryUtil.memAddress(container), container);
    }

    public static VkAllocationCallbacks create(long address) {
        return new VkAllocationCallbacks(address, null);
    }

    public static VkAllocationCallbacks createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkAllocationCallbacks(address, null);
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

    public static VkAllocationCallbacks malloc(MemoryStack stack) {
        return new VkAllocationCallbacks(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkAllocationCallbacks calloc(MemoryStack stack) {
        return new VkAllocationCallbacks(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static long npUserData(long struct) {
        return MemoryUtil.memGetAddress(struct + PUSERDATA);
    }

    public static VkAllocationFunction npfnAllocation(long struct) {
        return VkAllocationFunction.createSafe(MemoryUtil.memGetAddress(struct + PFNALLOCATION));
    }

    public static VkReallocationFunction npfnReallocation(long struct) {
        return VkReallocationFunction.createSafe(MemoryUtil.memGetAddress(struct + PFNREALLOCATION));
    }

    public static VkFreeFunction npfnFree(long struct) {
        return VkFreeFunction.createSafe(MemoryUtil.memGetAddress(struct + PFNFREE));
    }

    public static VkInternalAllocationNotification npfnInternalAllocation(long struct) {
        return VkInternalAllocationNotification.createSafe(MemoryUtil.memGetAddress(struct + PFNINTERNALALLOCATION));
    }

    public static VkInternalFreeNotification npfnInternalFree(long struct) {
        return VkInternalFreeNotification.createSafe(MemoryUtil.memGetAddress(struct + PFNINTERNALFREE));
    }

    public static void npUserData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PUSERDATA, value);
    }

    public static void npfnAllocation(long struct, VkAllocationFunctionI value) {
        MemoryUtil.memPutAddress(struct + PFNALLOCATION, MemoryUtil.memAddressSafe(value));
    }

    public static void npfnReallocation(long struct, VkReallocationFunctionI value) {
        MemoryUtil.memPutAddress(struct + PFNREALLOCATION, MemoryUtil.memAddressSafe(value));
    }

    public static void npfnFree(long struct, VkFreeFunctionI value) {
        MemoryUtil.memPutAddress(struct + PFNFREE, MemoryUtil.memAddressSafe(value));
    }

    public static void npfnInternalAllocation(long struct, VkInternalAllocationNotificationI value) {
        MemoryUtil.memPutAddress(struct + PFNINTERNALALLOCATION, MemoryUtil.memAddressSafe(value));
    }

    public static void npfnInternalFree(long struct, VkInternalFreeNotificationI value) {
        MemoryUtil.memPutAddress(struct + PFNINTERNALFREE, MemoryUtil.memAddressSafe(value));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAllocationCallbacks$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkAllocationCallbacks$Buffer.class */
    public static class Buffer extends StructBuffer<VkAllocationCallbacks, Buffer> implements NativeResource {
        private static final VkAllocationCallbacks ELEMENT_FACTORY = VkAllocationCallbacks.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkAllocationCallbacks.SIZEOF);
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
        public VkAllocationCallbacks getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("void *")
        public long pUserData() {
            return VkAllocationCallbacks.npUserData(address());
        }

        @NativeType("PFN_vkAllocationFunction")
        public VkAllocationFunction pfnAllocation() {
            return VkAllocationCallbacks.npfnAllocation(address());
        }

        @NativeType("PFN_vkReallocationFunction")
        public VkReallocationFunction pfnReallocation() {
            return VkAllocationCallbacks.npfnReallocation(address());
        }

        @NativeType("PFN_vkFreeFunction")
        public VkFreeFunction pfnFree() {
            return VkAllocationCallbacks.npfnFree(address());
        }

        @NativeType("PFN_vkInternalAllocationNotification")
        public VkInternalAllocationNotification pfnInternalAllocation() {
            return VkAllocationCallbacks.npfnInternalAllocation(address());
        }

        @NativeType("PFN_vkInternalFreeNotification")
        public VkInternalFreeNotification pfnInternalFree() {
            return VkAllocationCallbacks.npfnInternalFree(address());
        }

        public Buffer pUserData(@NativeType("void *") long value) {
            VkAllocationCallbacks.npUserData(address(), value);
            return this;
        }

        public Buffer pfnAllocation(@NativeType("PFN_vkAllocationFunction") VkAllocationFunctionI value) {
            VkAllocationCallbacks.npfnAllocation(address(), value);
            return this;
        }

        public Buffer pfnReallocation(@NativeType("PFN_vkReallocationFunction") VkReallocationFunctionI value) {
            VkAllocationCallbacks.npfnReallocation(address(), value);
            return this;
        }

        public Buffer pfnFree(@NativeType("PFN_vkFreeFunction") VkFreeFunctionI value) {
            VkAllocationCallbacks.npfnFree(address(), value);
            return this;
        }

        public Buffer pfnInternalAllocation(@NativeType("PFN_vkInternalAllocationNotification") VkInternalAllocationNotificationI value) {
            VkAllocationCallbacks.npfnInternalAllocation(address(), value);
            return this;
        }

        public Buffer pfnInternalFree(@NativeType("PFN_vkInternalFreeNotification") VkInternalFreeNotificationI value) {
            VkAllocationCallbacks.npfnInternalFree(address(), value);
            return this;
        }
    }
}
