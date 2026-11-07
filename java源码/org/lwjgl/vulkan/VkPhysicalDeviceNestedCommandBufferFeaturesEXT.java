package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceNestedCommandBufferFeaturesEXT.class */
public class VkPhysicalDeviceNestedCommandBufferFeaturesEXT extends Struct<VkPhysicalDeviceNestedCommandBufferFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int NESTEDCOMMANDBUFFER;
    public static final int NESTEDCOMMANDBUFFERRENDERING;
    public static final int NESTEDCOMMANDBUFFERSIMULTANEOUSUSE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        NESTEDCOMMANDBUFFER = layout.offsetof(2);
        NESTEDCOMMANDBUFFERRENDERING = layout.offsetof(3);
        NESTEDCOMMANDBUFFERSIMULTANEOUSUSE = layout.offsetof(4);
    }

    protected VkPhysicalDeviceNestedCommandBufferFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT(ByteBuffer container) {
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
    public boolean nestedCommandBuffer() {
        return nnestedCommandBuffer(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean nestedCommandBufferRendering() {
        return nnestedCommandBufferRendering(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean nestedCommandBufferSimultaneousUse() {
        return nnestedCommandBufferSimultaneousUse(address()) != 0;
    }

    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT sType$Default() {
        return sType(1000451000);
    }

    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBuffer(@NativeType("VkBool32") boolean value) {
        nnestedCommandBuffer(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferRendering(@NativeType("VkBool32") boolean value) {
        nnestedCommandBufferRendering(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT nestedCommandBufferSimultaneousUse(@NativeType("VkBool32") boolean value) {
        nnestedCommandBufferSimultaneousUse(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT set(int sType, long pNext, boolean nestedCommandBuffer, boolean nestedCommandBufferRendering, boolean nestedCommandBufferSimultaneousUse) {
        sType(sType);
        pNext(pNext);
        nestedCommandBuffer(nestedCommandBuffer);
        nestedCommandBufferRendering(nestedCommandBufferRendering);
        nestedCommandBufferSimultaneousUse(nestedCommandBufferSimultaneousUse);
        return this;
    }

    public VkPhysicalDeviceNestedCommandBufferFeaturesEXT set(VkPhysicalDeviceNestedCommandBufferFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT malloc() {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT calloc() {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT create(long address) {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceNestedCommandBufferFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceNestedCommandBufferFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nnestedCommandBuffer(long struct) {
        return MemoryUtil.memGetInt(struct + NESTEDCOMMANDBUFFER);
    }

    public static int nnestedCommandBufferRendering(long struct) {
        return MemoryUtil.memGetInt(struct + NESTEDCOMMANDBUFFERRENDERING);
    }

    public static int nnestedCommandBufferSimultaneousUse(long struct) {
        return MemoryUtil.memGetInt(struct + NESTEDCOMMANDBUFFERSIMULTANEOUSUSE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nnestedCommandBuffer(long struct, int value) {
        MemoryUtil.memPutInt(struct + NESTEDCOMMANDBUFFER, value);
    }

    public static void nnestedCommandBufferRendering(long struct, int value) {
        MemoryUtil.memPutInt(struct + NESTEDCOMMANDBUFFERRENDERING, value);
    }

    public static void nnestedCommandBufferSimultaneousUse(long struct, int value) {
        MemoryUtil.memPutInt(struct + NESTEDCOMMANDBUFFERSIMULTANEOUSUSE, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceNestedCommandBufferFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceNestedCommandBufferFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceNestedCommandBufferFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceNestedCommandBufferFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceNestedCommandBufferFeaturesEXT.SIZEOF);
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
        public VkPhysicalDeviceNestedCommandBufferFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean nestedCommandBuffer() {
            return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nnestedCommandBuffer(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean nestedCommandBufferRendering() {
            return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nnestedCommandBufferRendering(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean nestedCommandBufferSimultaneousUse() {
            return VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nnestedCommandBufferSimultaneousUse(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000451000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceNestedCommandBufferFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer nestedCommandBuffer(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nnestedCommandBuffer(address(), value ? 1 : 0);
            return this;
        }

        public Buffer nestedCommandBufferRendering(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nnestedCommandBufferRendering(address(), value ? 1 : 0);
            return this;
        }

        public Buffer nestedCommandBufferSimultaneousUse(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceNestedCommandBufferFeaturesEXT.nnestedCommandBufferSimultaneousUse(address(), value ? 1 : 0);
            return this;
        }
    }
}
