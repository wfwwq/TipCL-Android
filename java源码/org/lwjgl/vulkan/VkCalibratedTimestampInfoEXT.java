package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCalibratedTimestampInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCalibratedTimestampInfoEXT.class */
public class VkCalibratedTimestampInfoEXT extends VkCalibratedTimestampInfoKHR {
    protected VkCalibratedTimestampInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR, org.lwjgl.system.Struct
    public VkCalibratedTimestampInfoEXT create(long address, ByteBuffer container) {
        return new VkCalibratedTimestampInfoEXT(address, container);
    }

    public VkCalibratedTimestampInfoEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR
    public VkCalibratedTimestampInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR
    public VkCalibratedTimestampInfoEXT sType$Default() {
        return sType(1000184000);
    }

    @Override // org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR
    public VkCalibratedTimestampInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR
    public VkCalibratedTimestampInfoEXT timeDomain(@NativeType("VkTimeDomainKHR") int value) {
        ntimeDomain(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR
    public VkCalibratedTimestampInfoEXT set(int sType, long pNext, int timeDomain) {
        sType(sType);
        pNext(pNext);
        timeDomain(timeDomain);
        return this;
    }

    public VkCalibratedTimestampInfoEXT set(VkCalibratedTimestampInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkCalibratedTimestampInfoEXT malloc() {
        return new VkCalibratedTimestampInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkCalibratedTimestampInfoEXT calloc() {
        return new VkCalibratedTimestampInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkCalibratedTimestampInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkCalibratedTimestampInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkCalibratedTimestampInfoEXT create(long address) {
        return new VkCalibratedTimestampInfoEXT(address, null);
    }

    public static VkCalibratedTimestampInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkCalibratedTimestampInfoEXT(address, null);
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

    public static VkCalibratedTimestampInfoEXT malloc(MemoryStack stack) {
        return new VkCalibratedTimestampInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkCalibratedTimestampInfoEXT calloc(MemoryStack stack) {
        return new VkCalibratedTimestampInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCalibratedTimestampInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkCalibratedTimestampInfoEXT$Buffer.class */
    public static class Buffer extends VkCalibratedTimestampInfoKHR.Buffer {
        private static final VkCalibratedTimestampInfoEXT ELEMENT_FACTORY = VkCalibratedTimestampInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkCalibratedTimestampInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkCalibratedTimestampInfoEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000184000);
        }

        @Override // org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkCalibratedTimestampInfoEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkCalibratedTimestampInfoKHR.Buffer
        public Buffer timeDomain(@NativeType("VkTimeDomainKHR") int value) {
            VkCalibratedTimestampInfoEXT.ntimeDomain(address(), value);
            return this;
        }
    }
}
