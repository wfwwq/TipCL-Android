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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCreateInfo.class */
public class VkSamplerCreateInfo extends Struct<VkSamplerCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int MAGFILTER;
    public static final int MINFILTER;
    public static final int MIPMAPMODE;
    public static final int ADDRESSMODEU;
    public static final int ADDRESSMODEV;
    public static final int ADDRESSMODEW;
    public static final int MIPLODBIAS;
    public static final int ANISOTROPYENABLE;
    public static final int MAXANISOTROPY;
    public static final int COMPAREENABLE;
    public static final int COMPAREOP;
    public static final int MINLOD;
    public static final int MAXLOD;
    public static final int BORDERCOLOR;
    public static final int UNNORMALIZEDCOORDINATES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MAGFILTER = layout.offsetof(3);
        MINFILTER = layout.offsetof(4);
        MIPMAPMODE = layout.offsetof(5);
        ADDRESSMODEU = layout.offsetof(6);
        ADDRESSMODEV = layout.offsetof(7);
        ADDRESSMODEW = layout.offsetof(8);
        MIPLODBIAS = layout.offsetof(9);
        ANISOTROPYENABLE = layout.offsetof(10);
        MAXANISOTROPY = layout.offsetof(11);
        COMPAREENABLE = layout.offsetof(12);
        COMPAREOP = layout.offsetof(13);
        MINLOD = layout.offsetof(14);
        MAXLOD = layout.offsetof(15);
        BORDERCOLOR = layout.offsetof(16);
        UNNORMALIZEDCOORDINATES = layout.offsetof(17);
    }

    protected VkSamplerCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSamplerCreateInfo create(long address, ByteBuffer container) {
        return new VkSamplerCreateInfo(address, container);
    }

    public VkSamplerCreateInfo(ByteBuffer container) {
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

    @NativeType("VkSamplerCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkFilter")
    public int magFilter() {
        return nmagFilter(address());
    }

    @NativeType("VkFilter")
    public int minFilter() {
        return nminFilter(address());
    }

    @NativeType("VkSamplerMipmapMode")
    public int mipmapMode() {
        return nmipmapMode(address());
    }

    @NativeType("VkSamplerAddressMode")
    public int addressModeU() {
        return naddressModeU(address());
    }

    @NativeType("VkSamplerAddressMode")
    public int addressModeV() {
        return naddressModeV(address());
    }

    @NativeType("VkSamplerAddressMode")
    public int addressModeW() {
        return naddressModeW(address());
    }

    public float mipLodBias() {
        return nmipLodBias(address());
    }

    @NativeType("VkBool32")
    public boolean anisotropyEnable() {
        return nanisotropyEnable(address()) != 0;
    }

    public float maxAnisotropy() {
        return nmaxAnisotropy(address());
    }

    @NativeType("VkBool32")
    public boolean compareEnable() {
        return ncompareEnable(address()) != 0;
    }

    @NativeType("VkCompareOp")
    public int compareOp() {
        return ncompareOp(address());
    }

    public float minLod() {
        return nminLod(address());
    }

    public float maxLod() {
        return nmaxLod(address());
    }

    @NativeType("VkBorderColor")
    public int borderColor() {
        return nborderColor(address());
    }

    @NativeType("VkBool32")
    public boolean unnormalizedCoordinates() {
        return nunnormalizedCoordinates(address()) != 0;
    }

    public VkSamplerCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSamplerCreateInfo sType$Default() {
        return sType(31);
    }

    public VkSamplerCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSamplerCreateInfo pNext(VkDebugUtilsObjectNameInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSamplerCreateInfo pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSamplerCreateInfo pNext(VkSamplerBlockMatchWindowCreateInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSamplerCreateInfo pNext(VkSamplerBorderColorComponentMappingCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSamplerCreateInfo pNext(VkSamplerCubicWeightsCreateInfoQCOM value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSamplerCreateInfo pNext(VkSamplerCustomBorderColorCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSamplerCreateInfo pNext(VkSamplerCustomBorderColorIndexCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSamplerCreateInfo pNext(VkSamplerReductionModeCreateInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSamplerCreateInfo pNext(VkSamplerReductionModeCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSamplerCreateInfo pNext(VkSamplerYcbcrConversionInfo value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSamplerCreateInfo pNext(VkSamplerYcbcrConversionInfoKHR value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkSamplerCreateInfo flags(@NativeType("VkSamplerCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkSamplerCreateInfo magFilter(@NativeType("VkFilter") int value) {
        nmagFilter(address(), value);
        return this;
    }

    public VkSamplerCreateInfo minFilter(@NativeType("VkFilter") int value) {
        nminFilter(address(), value);
        return this;
    }

    public VkSamplerCreateInfo mipmapMode(@NativeType("VkSamplerMipmapMode") int value) {
        nmipmapMode(address(), value);
        return this;
    }

    public VkSamplerCreateInfo addressModeU(@NativeType("VkSamplerAddressMode") int value) {
        naddressModeU(address(), value);
        return this;
    }

    public VkSamplerCreateInfo addressModeV(@NativeType("VkSamplerAddressMode") int value) {
        naddressModeV(address(), value);
        return this;
    }

    public VkSamplerCreateInfo addressModeW(@NativeType("VkSamplerAddressMode") int value) {
        naddressModeW(address(), value);
        return this;
    }

    public VkSamplerCreateInfo mipLodBias(float value) {
        nmipLodBias(address(), value);
        return this;
    }

    public VkSamplerCreateInfo anisotropyEnable(@NativeType("VkBool32") boolean value) {
        nanisotropyEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkSamplerCreateInfo maxAnisotropy(float value) {
        nmaxAnisotropy(address(), value);
        return this;
    }

    public VkSamplerCreateInfo compareEnable(@NativeType("VkBool32") boolean value) {
        ncompareEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkSamplerCreateInfo compareOp(@NativeType("VkCompareOp") int value) {
        ncompareOp(address(), value);
        return this;
    }

    public VkSamplerCreateInfo minLod(float value) {
        nminLod(address(), value);
        return this;
    }

    public VkSamplerCreateInfo maxLod(float value) {
        nmaxLod(address(), value);
        return this;
    }

    public VkSamplerCreateInfo borderColor(@NativeType("VkBorderColor") int value) {
        nborderColor(address(), value);
        return this;
    }

    public VkSamplerCreateInfo unnormalizedCoordinates(@NativeType("VkBool32") boolean value) {
        nunnormalizedCoordinates(address(), value ? 1 : 0);
        return this;
    }

    public VkSamplerCreateInfo set(int sType, long pNext, int flags, int magFilter, int minFilter, int mipmapMode, int addressModeU, int addressModeV, int addressModeW, float mipLodBias, boolean anisotropyEnable, float maxAnisotropy, boolean compareEnable, int compareOp, float minLod, float maxLod, int borderColor, boolean unnormalizedCoordinates) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        magFilter(magFilter);
        minFilter(minFilter);
        mipmapMode(mipmapMode);
        addressModeU(addressModeU);
        addressModeV(addressModeV);
        addressModeW(addressModeW);
        mipLodBias(mipLodBias);
        anisotropyEnable(anisotropyEnable);
        maxAnisotropy(maxAnisotropy);
        compareEnable(compareEnable);
        compareOp(compareOp);
        minLod(minLod);
        maxLod(maxLod);
        borderColor(borderColor);
        unnormalizedCoordinates(unnormalizedCoordinates);
        return this;
    }

    public VkSamplerCreateInfo set(VkSamplerCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSamplerCreateInfo malloc() {
        return new VkSamplerCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSamplerCreateInfo calloc() {
        return new VkSamplerCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSamplerCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSamplerCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSamplerCreateInfo create(long address) {
        return new VkSamplerCreateInfo(address, null);
    }

    public static VkSamplerCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSamplerCreateInfo(address, null);
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

    public static VkSamplerCreateInfo malloc(MemoryStack stack) {
        return new VkSamplerCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSamplerCreateInfo calloc(MemoryStack stack) {
        return new VkSamplerCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmagFilter(long struct) {
        return MemoryUtil.memGetInt(struct + MAGFILTER);
    }

    public static int nminFilter(long struct) {
        return MemoryUtil.memGetInt(struct + MINFILTER);
    }

    public static int nmipmapMode(long struct) {
        return MemoryUtil.memGetInt(struct + MIPMAPMODE);
    }

    public static int naddressModeU(long struct) {
        return MemoryUtil.memGetInt(struct + ADDRESSMODEU);
    }

    public static int naddressModeV(long struct) {
        return MemoryUtil.memGetInt(struct + ADDRESSMODEV);
    }

    public static int naddressModeW(long struct) {
        return MemoryUtil.memGetInt(struct + ADDRESSMODEW);
    }

    public static float nmipLodBias(long struct) {
        return MemoryUtil.memGetFloat(struct + MIPLODBIAS);
    }

    public static int nanisotropyEnable(long struct) {
        return MemoryUtil.memGetInt(struct + ANISOTROPYENABLE);
    }

    public static float nmaxAnisotropy(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXANISOTROPY);
    }

    public static int ncompareEnable(long struct) {
        return MemoryUtil.memGetInt(struct + COMPAREENABLE);
    }

    public static int ncompareOp(long struct) {
        return MemoryUtil.memGetInt(struct + COMPAREOP);
    }

    public static float nminLod(long struct) {
        return MemoryUtil.memGetFloat(struct + MINLOD);
    }

    public static float nmaxLod(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXLOD);
    }

    public static int nborderColor(long struct) {
        return MemoryUtil.memGetInt(struct + BORDERCOLOR);
    }

    public static int nunnormalizedCoordinates(long struct) {
        return MemoryUtil.memGetInt(struct + UNNORMALIZEDCOORDINATES);
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

    public static void nmagFilter(long struct, int value) {
        MemoryUtil.memPutInt(struct + MAGFILTER, value);
    }

    public static void nminFilter(long struct, int value) {
        MemoryUtil.memPutInt(struct + MINFILTER, value);
    }

    public static void nmipmapMode(long struct, int value) {
        MemoryUtil.memPutInt(struct + MIPMAPMODE, value);
    }

    public static void naddressModeU(long struct, int value) {
        MemoryUtil.memPutInt(struct + ADDRESSMODEU, value);
    }

    public static void naddressModeV(long struct, int value) {
        MemoryUtil.memPutInt(struct + ADDRESSMODEV, value);
    }

    public static void naddressModeW(long struct, int value) {
        MemoryUtil.memPutInt(struct + ADDRESSMODEW, value);
    }

    public static void nmipLodBias(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MIPLODBIAS, value);
    }

    public static void nanisotropyEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + ANISOTROPYENABLE, value);
    }

    public static void nmaxAnisotropy(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAXANISOTROPY, value);
    }

    public static void ncompareEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPAREENABLE, value);
    }

    public static void ncompareOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPAREOP, value);
    }

    public static void nminLod(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MINLOD, value);
    }

    public static void nmaxLod(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAXLOD, value);
    }

    public static void nborderColor(long struct, int value) {
        MemoryUtil.memPutInt(struct + BORDERCOLOR, value);
    }

    public static void nunnormalizedCoordinates(long struct, int value) {
        MemoryUtil.memPutInt(struct + UNNORMALIZEDCOORDINATES, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSamplerCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSamplerCreateInfo, Buffer> implements NativeResource {
        private static final VkSamplerCreateInfo ELEMENT_FACTORY = VkSamplerCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSamplerCreateInfo.SIZEOF);
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
        public VkSamplerCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSamplerCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSamplerCreateInfo.npNext(address());
        }

        @NativeType("VkSamplerCreateFlags")
        public int flags() {
            return VkSamplerCreateInfo.nflags(address());
        }

        @NativeType("VkFilter")
        public int magFilter() {
            return VkSamplerCreateInfo.nmagFilter(address());
        }

        @NativeType("VkFilter")
        public int minFilter() {
            return VkSamplerCreateInfo.nminFilter(address());
        }

        @NativeType("VkSamplerMipmapMode")
        public int mipmapMode() {
            return VkSamplerCreateInfo.nmipmapMode(address());
        }

        @NativeType("VkSamplerAddressMode")
        public int addressModeU() {
            return VkSamplerCreateInfo.naddressModeU(address());
        }

        @NativeType("VkSamplerAddressMode")
        public int addressModeV() {
            return VkSamplerCreateInfo.naddressModeV(address());
        }

        @NativeType("VkSamplerAddressMode")
        public int addressModeW() {
            return VkSamplerCreateInfo.naddressModeW(address());
        }

        public float mipLodBias() {
            return VkSamplerCreateInfo.nmipLodBias(address());
        }

        @NativeType("VkBool32")
        public boolean anisotropyEnable() {
            return VkSamplerCreateInfo.nanisotropyEnable(address()) != 0;
        }

        public float maxAnisotropy() {
            return VkSamplerCreateInfo.nmaxAnisotropy(address());
        }

        @NativeType("VkBool32")
        public boolean compareEnable() {
            return VkSamplerCreateInfo.ncompareEnable(address()) != 0;
        }

        @NativeType("VkCompareOp")
        public int compareOp() {
            return VkSamplerCreateInfo.ncompareOp(address());
        }

        public float minLod() {
            return VkSamplerCreateInfo.nminLod(address());
        }

        public float maxLod() {
            return VkSamplerCreateInfo.nmaxLod(address());
        }

        @NativeType("VkBorderColor")
        public int borderColor() {
            return VkSamplerCreateInfo.nborderColor(address());
        }

        @NativeType("VkBool32")
        public boolean unnormalizedCoordinates() {
            return VkSamplerCreateInfo.nunnormalizedCoordinates(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSamplerCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(31);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSamplerCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDebugUtilsObjectNameInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkOpaqueCaptureDescriptorDataCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerBlockMatchWindowCreateInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerBorderColorComponentMappingCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerCubicWeightsCreateInfoQCOM value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerCustomBorderColorCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerCustomBorderColorIndexCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerReductionModeCreateInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerReductionModeCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerYcbcrConversionInfo value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkSamplerYcbcrConversionInfoKHR value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkSamplerCreateFlags") int value) {
            VkSamplerCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer magFilter(@NativeType("VkFilter") int value) {
            VkSamplerCreateInfo.nmagFilter(address(), value);
            return this;
        }

        public Buffer minFilter(@NativeType("VkFilter") int value) {
            VkSamplerCreateInfo.nminFilter(address(), value);
            return this;
        }

        public Buffer mipmapMode(@NativeType("VkSamplerMipmapMode") int value) {
            VkSamplerCreateInfo.nmipmapMode(address(), value);
            return this;
        }

        public Buffer addressModeU(@NativeType("VkSamplerAddressMode") int value) {
            VkSamplerCreateInfo.naddressModeU(address(), value);
            return this;
        }

        public Buffer addressModeV(@NativeType("VkSamplerAddressMode") int value) {
            VkSamplerCreateInfo.naddressModeV(address(), value);
            return this;
        }

        public Buffer addressModeW(@NativeType("VkSamplerAddressMode") int value) {
            VkSamplerCreateInfo.naddressModeW(address(), value);
            return this;
        }

        public Buffer mipLodBias(float value) {
            VkSamplerCreateInfo.nmipLodBias(address(), value);
            return this;
        }

        public Buffer anisotropyEnable(@NativeType("VkBool32") boolean value) {
            VkSamplerCreateInfo.nanisotropyEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer maxAnisotropy(float value) {
            VkSamplerCreateInfo.nmaxAnisotropy(address(), value);
            return this;
        }

        public Buffer compareEnable(@NativeType("VkBool32") boolean value) {
            VkSamplerCreateInfo.ncompareEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer compareOp(@NativeType("VkCompareOp") int value) {
            VkSamplerCreateInfo.ncompareOp(address(), value);
            return this;
        }

        public Buffer minLod(float value) {
            VkSamplerCreateInfo.nminLod(address(), value);
            return this;
        }

        public Buffer maxLod(float value) {
            VkSamplerCreateInfo.nmaxLod(address(), value);
            return this;
        }

        public Buffer borderColor(@NativeType("VkBorderColor") int value) {
            VkSamplerCreateInfo.nborderColor(address(), value);
            return this;
        }

        public Buffer unnormalizedCoordinates(@NativeType("VkBool32") boolean value) {
            VkSamplerCreateInfo.nunnormalizedCoordinates(address(), value ? 1 : 0);
            return this;
        }
    }
}
