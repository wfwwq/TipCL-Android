package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLineRasterizationFeaturesKHR.class */
public class VkPhysicalDeviceLineRasterizationFeaturesKHR extends VkPhysicalDeviceLineRasterizationFeatures {
    protected VkPhysicalDeviceLineRasterizationFeaturesKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceLineRasterizationFeaturesKHR create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(address, container);
    }

    public VkPhysicalDeviceLineRasterizationFeaturesKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesKHR sType$Default() {
        return sType(1000259000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesKHR pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesKHR rectangularLines(@NativeType("VkBool32") boolean value) {
        nrectangularLines(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesKHR bresenhamLines(@NativeType("VkBool32") boolean value) {
        nbresenhamLines(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesKHR smoothLines(@NativeType("VkBool32") boolean value) {
        nsmoothLines(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledRectangularLines(@NativeType("VkBool32") boolean value) {
        nstippledRectangularLines(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledBresenhamLines(@NativeType("VkBool32") boolean value) {
        nstippledBresenhamLines(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesKHR stippledSmoothLines(@NativeType("VkBool32") boolean value) {
        nstippledSmoothLines(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesKHR set(int sType, long pNext, boolean rectangularLines, boolean bresenhamLines, boolean smoothLines, boolean stippledRectangularLines, boolean stippledBresenhamLines, boolean stippledSmoothLines) {
        sType(sType);
        pNext(pNext);
        rectangularLines(rectangularLines);
        bresenhamLines(bresenhamLines);
        smoothLines(smoothLines);
        stippledRectangularLines(stippledRectangularLines);
        stippledBresenhamLines(stippledBresenhamLines);
        stippledSmoothLines(stippledSmoothLines);
        return this;
    }

    public VkPhysicalDeviceLineRasterizationFeaturesKHR set(VkPhysicalDeviceLineRasterizationFeaturesKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceLineRasterizationFeaturesKHR malloc() {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceLineRasterizationFeaturesKHR calloc() {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceLineRasterizationFeaturesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceLineRasterizationFeaturesKHR create(long address) {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(address, null);
    }

    public static VkPhysicalDeviceLineRasterizationFeaturesKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(address, null);
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

    public static VkPhysicalDeviceLineRasterizationFeaturesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceLineRasterizationFeaturesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeaturesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLineRasterizationFeaturesKHR$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceLineRasterizationFeatures.Buffer {
        private static final VkPhysicalDeviceLineRasterizationFeaturesKHR ELEMENT_FACTORY = VkPhysicalDeviceLineRasterizationFeaturesKHR.create(-1L);

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
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer, org.lwjgl.system.StructBuffer
        public VkPhysicalDeviceLineRasterizationFeaturesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceLineRasterizationFeaturesKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000259000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceLineRasterizationFeaturesKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer rectangularLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeaturesKHR.nrectangularLines(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer bresenhamLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeaturesKHR.nbresenhamLines(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer smoothLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeaturesKHR.nsmoothLines(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer stippledRectangularLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledRectangularLines(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer stippledBresenhamLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledBresenhamLines(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer stippledSmoothLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeaturesKHR.nstippledSmoothLines(address(), value ? 1 : 0);
            return this;
        }
    }
}
