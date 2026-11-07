package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLineRasterizationFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLineRasterizationFeaturesEXT.class */
public class VkPhysicalDeviceLineRasterizationFeaturesEXT extends VkPhysicalDeviceLineRasterizationFeatures {
    protected VkPhysicalDeviceLineRasterizationFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures, org.lwjgl.system.Struct
    public VkPhysicalDeviceLineRasterizationFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(address, container);
    }

    public VkPhysicalDeviceLineRasterizationFeaturesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesEXT sType$Default() {
        return sType(1000259000);
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesEXT rectangularLines(@NativeType("VkBool32") boolean value) {
        nrectangularLines(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesEXT bresenhamLines(@NativeType("VkBool32") boolean value) {
        nbresenhamLines(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesEXT smoothLines(@NativeType("VkBool32") boolean value) {
        nsmoothLines(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesEXT stippledRectangularLines(@NativeType("VkBool32") boolean value) {
        nstippledRectangularLines(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesEXT stippledBresenhamLines(@NativeType("VkBool32") boolean value) {
        nstippledBresenhamLines(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesEXT stippledSmoothLines(@NativeType("VkBool32") boolean value) {
        nstippledSmoothLines(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures
    public VkPhysicalDeviceLineRasterizationFeaturesEXT set(int sType, long pNext, boolean rectangularLines, boolean bresenhamLines, boolean smoothLines, boolean stippledRectangularLines, boolean stippledBresenhamLines, boolean stippledSmoothLines) {
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

    public VkPhysicalDeviceLineRasterizationFeaturesEXT set(VkPhysicalDeviceLineRasterizationFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceLineRasterizationFeaturesEXT malloc() {
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceLineRasterizationFeaturesEXT calloc() {
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceLineRasterizationFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceLineRasterizationFeaturesEXT create(long address) {
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(address, null);
    }

    public static VkPhysicalDeviceLineRasterizationFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(address, null);
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

    public static VkPhysicalDeviceLineRasterizationFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceLineRasterizationFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLineRasterizationFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLineRasterizationFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceLineRasterizationFeaturesEXT$Buffer.class */
    public static class Buffer extends VkPhysicalDeviceLineRasterizationFeatures.Buffer {
        private static final VkPhysicalDeviceLineRasterizationFeaturesEXT ELEMENT_FACTORY = VkPhysicalDeviceLineRasterizationFeaturesEXT.create(-1L);

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
        public VkPhysicalDeviceLineRasterizationFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceLineRasterizationFeaturesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer sType$Default() {
            return sType(1000259000);
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceLineRasterizationFeaturesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer rectangularLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeaturesEXT.nrectangularLines(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer bresenhamLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeaturesEXT.nbresenhamLines(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer smoothLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeaturesEXT.nsmoothLines(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer stippledRectangularLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeaturesEXT.nstippledRectangularLines(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer stippledBresenhamLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeaturesEXT.nstippledBresenhamLines(address(), value ? 1 : 0);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeatures.Buffer
        public Buffer stippledSmoothLines(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceLineRasterizationFeaturesEXT.nstippledSmoothLines(address(), value ? 1 : 0);
            return this;
        }
    }
}
