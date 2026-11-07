package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentScalingCapabilitiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentScalingCapabilitiesEXT.class */
public class VkSurfacePresentScalingCapabilitiesEXT extends VkSurfacePresentScalingCapabilitiesKHR {
    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR
    public /* bridge */ /* synthetic */ VkSurfacePresentScalingCapabilitiesKHR maxScaledImageExtent(Consumer consumer) {
        return maxScaledImageExtent((Consumer<VkExtent2D>) consumer);
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR
    public /* bridge */ /* synthetic */ VkSurfacePresentScalingCapabilitiesKHR minScaledImageExtent(Consumer consumer) {
        return minScaledImageExtent((Consumer<VkExtent2D>) consumer);
    }

    protected VkSurfacePresentScalingCapabilitiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR, org.lwjgl.system.Struct
    public VkSurfacePresentScalingCapabilitiesEXT create(long address, ByteBuffer container) {
        return new VkSurfacePresentScalingCapabilitiesEXT(address, container);
    }

    public VkSurfacePresentScalingCapabilitiesEXT(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR
    public VkSurfacePresentScalingCapabilitiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR
    public VkSurfacePresentScalingCapabilitiesEXT sType$Default() {
        return sType(1000274001);
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR
    public VkSurfacePresentScalingCapabilitiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentScaling(@NativeType("VkPresentScalingFlagsKHR") int value) {
        nsupportedPresentScaling(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) {
        nsupportedPresentGravityX(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR
    public VkSurfacePresentScalingCapabilitiesEXT supportedPresentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) {
        nsupportedPresentGravityY(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR
    public VkSurfacePresentScalingCapabilitiesEXT minScaledImageExtent(VkExtent2D value) {
        nminScaledImageExtent(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR
    public VkSurfacePresentScalingCapabilitiesEXT minScaledImageExtent(Consumer<VkExtent2D> consumer) {
        consumer.accept(minScaledImageExtent());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR
    public VkSurfacePresentScalingCapabilitiesEXT maxScaledImageExtent(VkExtent2D value) {
        nmaxScaledImageExtent(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR
    public VkSurfacePresentScalingCapabilitiesEXT maxScaledImageExtent(Consumer<VkExtent2D> consumer) {
        consumer.accept(maxScaledImageExtent());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR
    public VkSurfacePresentScalingCapabilitiesEXT set(int sType, long pNext, int supportedPresentScaling, int supportedPresentGravityX, int supportedPresentGravityY, VkExtent2D minScaledImageExtent, VkExtent2D maxScaledImageExtent) {
        sType(sType);
        pNext(pNext);
        supportedPresentScaling(supportedPresentScaling);
        supportedPresentGravityX(supportedPresentGravityX);
        supportedPresentGravityY(supportedPresentGravityY);
        minScaledImageExtent(minScaledImageExtent);
        maxScaledImageExtent(maxScaledImageExtent);
        return this;
    }

    public VkSurfacePresentScalingCapabilitiesEXT set(VkSurfacePresentScalingCapabilitiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSurfacePresentScalingCapabilitiesEXT malloc() {
        return new VkSurfacePresentScalingCapabilitiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSurfacePresentScalingCapabilitiesEXT calloc() {
        return new VkSurfacePresentScalingCapabilitiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSurfacePresentScalingCapabilitiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSurfacePresentScalingCapabilitiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkSurfacePresentScalingCapabilitiesEXT create(long address) {
        return new VkSurfacePresentScalingCapabilitiesEXT(address, null);
    }

    public static VkSurfacePresentScalingCapabilitiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSurfacePresentScalingCapabilitiesEXT(address, null);
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

    public static VkSurfacePresentScalingCapabilitiesEXT malloc(MemoryStack stack) {
        return new VkSurfacePresentScalingCapabilitiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSurfacePresentScalingCapabilitiesEXT calloc(MemoryStack stack) {
        return new VkSurfacePresentScalingCapabilitiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentScalingCapabilitiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSurfacePresentScalingCapabilitiesEXT$Buffer.class */
    public static class Buffer extends VkSurfacePresentScalingCapabilitiesKHR.Buffer {
        private static final VkSurfacePresentScalingCapabilitiesEXT ELEMENT_FACTORY = VkSurfacePresentScalingCapabilitiesEXT.create(-1L);

        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer
        public /* bridge */ /* synthetic */ VkSurfacePresentScalingCapabilitiesKHR.Buffer maxScaledImageExtent(Consumer consumer) {
            return maxScaledImageExtent((Consumer<VkExtent2D>) consumer);
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer
        public /* bridge */ /* synthetic */ VkSurfacePresentScalingCapabilitiesKHR.Buffer minScaledImageExtent(Consumer consumer) {
            return minScaledImageExtent((Consumer<VkExtent2D>) consumer);
        }

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
        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer, org.lwjgl.system.StructBuffer
        public VkSurfacePresentScalingCapabilitiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSurfacePresentScalingCapabilitiesEXT.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer
        public Buffer sType$Default() {
            return sType(1000274001);
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer
        public Buffer pNext(@NativeType("void *") long value) {
            VkSurfacePresentScalingCapabilitiesEXT.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer
        public Buffer supportedPresentScaling(@NativeType("VkPresentScalingFlagsKHR") int value) {
            VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentScaling(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer
        public Buffer supportedPresentGravityX(@NativeType("VkPresentGravityFlagsKHR") int value) {
            VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentGravityX(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer
        public Buffer supportedPresentGravityY(@NativeType("VkPresentGravityFlagsKHR") int value) {
            VkSurfacePresentScalingCapabilitiesEXT.nsupportedPresentGravityY(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer
        public Buffer minScaledImageExtent(VkExtent2D value) {
            VkSurfacePresentScalingCapabilitiesEXT.nminScaledImageExtent(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer
        public Buffer minScaledImageExtent(Consumer<VkExtent2D> consumer) {
            consumer.accept(minScaledImageExtent());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer
        public Buffer maxScaledImageExtent(VkExtent2D value) {
            VkSurfacePresentScalingCapabilitiesEXT.nmaxScaledImageExtent(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSurfacePresentScalingCapabilitiesKHR.Buffer
        public Buffer maxScaledImageExtent(Consumer<VkExtent2D> consumer) {
            consumer.accept(maxScaledImageExtent());
            return this;
        }
    }
}
