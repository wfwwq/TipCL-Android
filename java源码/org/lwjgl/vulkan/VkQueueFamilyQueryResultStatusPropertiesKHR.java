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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyQueryResultStatusPropertiesKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyQueryResultStatusPropertiesKHR.class */
public class VkQueueFamilyQueryResultStatusPropertiesKHR extends Struct<VkQueueFamilyQueryResultStatusPropertiesKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int QUERYRESULTSTATUSSUPPORT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        QUERYRESULTSTATUSSUPPORT = layout.offsetof(2);
    }

    protected VkQueueFamilyQueryResultStatusPropertiesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkQueueFamilyQueryResultStatusPropertiesKHR create(long address, ByteBuffer container) {
        return new VkQueueFamilyQueryResultStatusPropertiesKHR(address, container);
    }

    public VkQueueFamilyQueryResultStatusPropertiesKHR(ByteBuffer container) {
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
    public boolean queryResultStatusSupport() {
        return nqueryResultStatusSupport(address()) != 0;
    }

    public VkQueueFamilyQueryResultStatusPropertiesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkQueueFamilyQueryResultStatusPropertiesKHR sType$Default() {
        return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR);
    }

    public VkQueueFamilyQueryResultStatusPropertiesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkQueueFamilyQueryResultStatusPropertiesKHR set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkQueueFamilyQueryResultStatusPropertiesKHR set(VkQueueFamilyQueryResultStatusPropertiesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkQueueFamilyQueryResultStatusPropertiesKHR malloc() {
        return new VkQueueFamilyQueryResultStatusPropertiesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkQueueFamilyQueryResultStatusPropertiesKHR calloc() {
        return new VkQueueFamilyQueryResultStatusPropertiesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkQueueFamilyQueryResultStatusPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkQueueFamilyQueryResultStatusPropertiesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkQueueFamilyQueryResultStatusPropertiesKHR create(long address) {
        return new VkQueueFamilyQueryResultStatusPropertiesKHR(address, null);
    }

    public static VkQueueFamilyQueryResultStatusPropertiesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkQueueFamilyQueryResultStatusPropertiesKHR(address, null);
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

    public static VkQueueFamilyQueryResultStatusPropertiesKHR malloc(MemoryStack stack) {
        return new VkQueueFamilyQueryResultStatusPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkQueueFamilyQueryResultStatusPropertiesKHR calloc(MemoryStack stack) {
        return new VkQueueFamilyQueryResultStatusPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nqueryResultStatusSupport(long struct) {
        return MemoryUtil.memGetInt(struct + QUERYRESULTSTATUSSUPPORT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyQueryResultStatusPropertiesKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkQueueFamilyQueryResultStatusPropertiesKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkQueueFamilyQueryResultStatusPropertiesKHR, Buffer> implements NativeResource {
        private static final VkQueueFamilyQueryResultStatusPropertiesKHR ELEMENT_FACTORY = VkQueueFamilyQueryResultStatusPropertiesKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkQueueFamilyQueryResultStatusPropertiesKHR.SIZEOF);
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
        public VkQueueFamilyQueryResultStatusPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkQueueFamilyQueryResultStatusPropertiesKHR.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkQueueFamilyQueryResultStatusPropertiesKHR.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean queryResultStatusSupport() {
            return VkQueueFamilyQueryResultStatusPropertiesKHR.nqueryResultStatusSupport(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkQueueFamilyQueryResultStatusPropertiesKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(KHRVideoQueue.VK_STRUCTURE_TYPE_QUEUE_FAMILY_QUERY_RESULT_STATUS_PROPERTIES_KHR);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkQueueFamilyQueryResultStatusPropertiesKHR.npNext(address(), value);
            return this;
        }
    }
}
