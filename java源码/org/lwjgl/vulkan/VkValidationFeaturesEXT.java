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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkValidationFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkValidationFeaturesEXT.class */
public class VkValidationFeaturesEXT extends Struct<VkValidationFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int ENABLEDVALIDATIONFEATURECOUNT;
    public static final int PENABLEDVALIDATIONFEATURES;
    public static final int DISABLEDVALIDATIONFEATURECOUNT;
    public static final int PDISABLEDVALIDATIONFEATURES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        ENABLEDVALIDATIONFEATURECOUNT = layout.offsetof(2);
        PENABLEDVALIDATIONFEATURES = layout.offsetof(3);
        DISABLEDVALIDATIONFEATURECOUNT = layout.offsetof(4);
        PDISABLEDVALIDATIONFEATURES = layout.offsetof(5);
    }

    protected VkValidationFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkValidationFeaturesEXT create(long address, ByteBuffer container) {
        return new VkValidationFeaturesEXT(address, container);
    }

    public VkValidationFeaturesEXT(ByteBuffer container) {
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

    @NativeType("uint32_t")
    public int enabledValidationFeatureCount() {
        return nenabledValidationFeatureCount(address());
    }

    @NativeType("VkValidationFeatureEnableEXT const *")
    public IntBuffer pEnabledValidationFeatures() {
        return npEnabledValidationFeatures(address());
    }

    @NativeType("uint32_t")
    public int disabledValidationFeatureCount() {
        return ndisabledValidationFeatureCount(address());
    }

    @NativeType("VkValidationFeatureDisableEXT const *")
    public IntBuffer pDisabledValidationFeatures() {
        return npDisabledValidationFeatures(address());
    }

    public VkValidationFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkValidationFeaturesEXT sType$Default() {
        return sType(EXTValidationFeatures.VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT);
    }

    public VkValidationFeaturesEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkValidationFeaturesEXT pEnabledValidationFeatures(@NativeType("VkValidationFeatureEnableEXT const *") IntBuffer value) {
        npEnabledValidationFeatures(address(), value);
        return this;
    }

    public VkValidationFeaturesEXT pDisabledValidationFeatures(@NativeType("VkValidationFeatureDisableEXT const *") IntBuffer value) {
        npDisabledValidationFeatures(address(), value);
        return this;
    }

    public VkValidationFeaturesEXT set(int sType, long pNext, IntBuffer pEnabledValidationFeatures, IntBuffer pDisabledValidationFeatures) {
        sType(sType);
        pNext(pNext);
        pEnabledValidationFeatures(pEnabledValidationFeatures);
        pDisabledValidationFeatures(pDisabledValidationFeatures);
        return this;
    }

    public VkValidationFeaturesEXT set(VkValidationFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkValidationFeaturesEXT malloc() {
        return new VkValidationFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkValidationFeaturesEXT calloc() {
        return new VkValidationFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkValidationFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkValidationFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkValidationFeaturesEXT create(long address) {
        return new VkValidationFeaturesEXT(address, null);
    }

    public static VkValidationFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkValidationFeaturesEXT(address, null);
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

    public static VkValidationFeaturesEXT malloc(MemoryStack stack) {
        return new VkValidationFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkValidationFeaturesEXT calloc(MemoryStack stack) {
        return new VkValidationFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nenabledValidationFeatureCount(long struct) {
        return MemoryUtil.memGetInt(struct + ENABLEDVALIDATIONFEATURECOUNT);
    }

    public static IntBuffer npEnabledValidationFeatures(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PENABLEDVALIDATIONFEATURES), nenabledValidationFeatureCount(struct));
    }

    public static int ndisabledValidationFeatureCount(long struct) {
        return MemoryUtil.memGetInt(struct + DISABLEDVALIDATIONFEATURECOUNT);
    }

    public static IntBuffer npDisabledValidationFeatures(long struct) {
        return MemoryUtil.memIntBufferSafe(MemoryUtil.memGetAddress(struct + PDISABLEDVALIDATIONFEATURES), ndisabledValidationFeatureCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nenabledValidationFeatureCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENABLEDVALIDATIONFEATURECOUNT, value);
    }

    public static void npEnabledValidationFeatures(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PENABLEDVALIDATIONFEATURES, MemoryUtil.memAddressSafe(value));
        nenabledValidationFeatureCount(struct, value == null ? 0 : value.remaining());
    }

    public static void ndisabledValidationFeatureCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DISABLEDVALIDATIONFEATURECOUNT, value);
    }

    public static void npDisabledValidationFeatures(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PDISABLEDVALIDATIONFEATURES, MemoryUtil.memAddressSafe(value));
        ndisabledValidationFeatureCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        if (nenabledValidationFeatureCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PENABLEDVALIDATIONFEATURES));
        }
        if (ndisabledValidationFeatureCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + PDISABLEDVALIDATIONFEATURES));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkValidationFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkValidationFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkValidationFeaturesEXT, Buffer> implements NativeResource {
        private static final VkValidationFeaturesEXT ELEMENT_FACTORY = VkValidationFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkValidationFeaturesEXT.SIZEOF);
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
        public VkValidationFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkValidationFeaturesEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkValidationFeaturesEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int enabledValidationFeatureCount() {
            return VkValidationFeaturesEXT.nenabledValidationFeatureCount(address());
        }

        @NativeType("VkValidationFeatureEnableEXT const *")
        public IntBuffer pEnabledValidationFeatures() {
            return VkValidationFeaturesEXT.npEnabledValidationFeatures(address());
        }

        @NativeType("uint32_t")
        public int disabledValidationFeatureCount() {
            return VkValidationFeaturesEXT.ndisabledValidationFeatureCount(address());
        }

        @NativeType("VkValidationFeatureDisableEXT const *")
        public IntBuffer pDisabledValidationFeatures() {
            return VkValidationFeaturesEXT.npDisabledValidationFeatures(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkValidationFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTValidationFeatures.VK_STRUCTURE_TYPE_VALIDATION_FEATURES_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkValidationFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer pEnabledValidationFeatures(@NativeType("VkValidationFeatureEnableEXT const *") IntBuffer value) {
            VkValidationFeaturesEXT.npEnabledValidationFeatures(address(), value);
            return this;
        }

        public Buffer pDisabledValidationFeatures(@NativeType("VkValidationFeatureDisableEXT const *") IntBuffer value) {
            VkValidationFeaturesEXT.npDisabledValidationFeatures(address(), value);
            return this;
        }
    }
}
