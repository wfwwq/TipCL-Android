package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfoKHR.class */
public class VkSamplerYcbcrConversionCreateInfoKHR extends VkSamplerYcbcrConversionCreateInfo {
    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public /* bridge */ /* synthetic */ VkSamplerYcbcrConversionCreateInfo components(Consumer consumer) {
        return components((Consumer<VkComponentMapping>) consumer);
    }

    protected VkSamplerYcbcrConversionCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo, org.lwjgl.system.Struct
    public VkSamplerYcbcrConversionCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkSamplerYcbcrConversionCreateInfoKHR(address, container);
    }

    public VkSamplerYcbcrConversionCreateInfoKHR(ByteBuffer container) {
        super(container);
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public VkSamplerYcbcrConversionCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public VkSamplerYcbcrConversionCreateInfoKHR sType$Default() {
        return sType(1000156000);
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public VkSamplerYcbcrConversionCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public VkSamplerYcbcrConversionCreateInfoKHR format(@NativeType("VkFormat") int value) {
        nformat(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public VkSamplerYcbcrConversionCreateInfoKHR ycbcrModel(@NativeType("VkSamplerYcbcrModelConversion") int value) {
        nycbcrModel(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public VkSamplerYcbcrConversionCreateInfoKHR ycbcrRange(@NativeType("VkSamplerYcbcrRange") int value) {
        nycbcrRange(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public VkSamplerYcbcrConversionCreateInfoKHR components(VkComponentMapping value) {
        ncomponents(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public VkSamplerYcbcrConversionCreateInfoKHR components(Consumer<VkComponentMapping> consumer) {
        consumer.accept(components());
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public VkSamplerYcbcrConversionCreateInfoKHR xChromaOffset(@NativeType("VkChromaLocation") int value) {
        nxChromaOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public VkSamplerYcbcrConversionCreateInfoKHR yChromaOffset(@NativeType("VkChromaLocation") int value) {
        nyChromaOffset(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public VkSamplerYcbcrConversionCreateInfoKHR chromaFilter(@NativeType("VkFilter") int value) {
        nchromaFilter(address(), value);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public VkSamplerYcbcrConversionCreateInfoKHR forceExplicitReconstruction(@NativeType("VkBool32") boolean value) {
        nforceExplicitReconstruction(address(), value ? 1 : 0);
        return this;
    }

    @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo
    public VkSamplerYcbcrConversionCreateInfoKHR set(int sType, long pNext, int format, int ycbcrModel, int ycbcrRange, VkComponentMapping components, int xChromaOffset, int yChromaOffset, int chromaFilter, boolean forceExplicitReconstruction) {
        sType(sType);
        pNext(pNext);
        format(format);
        ycbcrModel(ycbcrModel);
        ycbcrRange(ycbcrRange);
        components(components);
        xChromaOffset(xChromaOffset);
        yChromaOffset(yChromaOffset);
        chromaFilter(chromaFilter);
        forceExplicitReconstruction(forceExplicitReconstruction);
        return this;
    }

    public VkSamplerYcbcrConversionCreateInfoKHR set(VkSamplerYcbcrConversionCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerYcbcrConversionCreateInfoKHR malloc() {
        return new VkSamplerYcbcrConversionCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionCreateInfoKHR calloc() {
        return new VkSamplerYcbcrConversionCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerYcbcrConversionCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerYcbcrConversionCreateInfoKHR create(long address) {
        return new VkSamplerYcbcrConversionCreateInfoKHR(address, null);
    }

    public static VkSamplerYcbcrConversionCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerYcbcrConversionCreateInfoKHR(address, null);
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

    public static VkSamplerYcbcrConversionCreateInfoKHR malloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerYcbcrConversionCreateInfoKHR calloc(MemoryStack stack) {
        return new VkSamplerYcbcrConversionCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerYcbcrConversionCreateInfoKHR$Buffer.class */
    public static class Buffer extends VkSamplerYcbcrConversionCreateInfo.Buffer {
        private static final VkSamplerYcbcrConversionCreateInfoKHR ELEMENT_FACTORY = VkSamplerYcbcrConversionCreateInfoKHR.create(-1L);

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public /* bridge */ /* synthetic */ VkSamplerYcbcrConversionCreateInfo.Buffer components(Consumer consumer) {
            return components((Consumer<VkComponentMapping>) consumer);
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
        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer, org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer, org.lwjgl.system.StructBuffer
        public VkSamplerYcbcrConversionCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerYcbcrConversionCreateInfoKHR.nsType(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public Buffer sType$Default() {
            return sType(1000156000);
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public Buffer pNext(@NativeType("void const *") long value) {
            VkSamplerYcbcrConversionCreateInfoKHR.npNext(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public Buffer format(@NativeType("VkFormat") int value) {
            VkSamplerYcbcrConversionCreateInfoKHR.nformat(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public Buffer ycbcrModel(@NativeType("VkSamplerYcbcrModelConversion") int value) {
            VkSamplerYcbcrConversionCreateInfoKHR.nycbcrModel(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public Buffer ycbcrRange(@NativeType("VkSamplerYcbcrRange") int value) {
            VkSamplerYcbcrConversionCreateInfoKHR.nycbcrRange(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public Buffer components(VkComponentMapping value) {
            VkSamplerYcbcrConversionCreateInfoKHR.ncomponents(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public Buffer components(Consumer<VkComponentMapping> consumer) {
            consumer.accept(components());
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public Buffer xChromaOffset(@NativeType("VkChromaLocation") int value) {
            VkSamplerYcbcrConversionCreateInfoKHR.nxChromaOffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public Buffer yChromaOffset(@NativeType("VkChromaLocation") int value) {
            VkSamplerYcbcrConversionCreateInfoKHR.nyChromaOffset(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public Buffer chromaFilter(@NativeType("VkFilter") int value) {
            VkSamplerYcbcrConversionCreateInfoKHR.nchromaFilter(address(), value);
            return this;
        }

        @Override // org.lwjgl.vulkan.VkSamplerYcbcrConversionCreateInfo.Buffer
        public Buffer forceExplicitReconstruction(@NativeType("VkBool32") boolean value) {
            VkSamplerYcbcrConversionCreateInfoKHR.nforceExplicitReconstruction(address(), value ? 1 : 0);
            return this;
        }
    }
}
