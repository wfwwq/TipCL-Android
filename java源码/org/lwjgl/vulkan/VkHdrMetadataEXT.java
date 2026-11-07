package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHdrMetadataEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHdrMetadataEXT.class */
public class VkHdrMetadataEXT extends Struct<VkHdrMetadataEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DISPLAYPRIMARYRED;
    public static final int DISPLAYPRIMARYGREEN;
    public static final int DISPLAYPRIMARYBLUE;
    public static final int WHITEPOINT;
    public static final int MAXLUMINANCE;
    public static final int MINLUMINANCE;
    public static final int MAXCONTENTLIGHTLEVEL;
    public static final int MAXFRAMEAVERAGELIGHTLEVEL;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkXYColorEXT.SIZEOF, VkXYColorEXT.ALIGNOF), __member(VkXYColorEXT.SIZEOF, VkXYColorEXT.ALIGNOF), __member(VkXYColorEXT.SIZEOF, VkXYColorEXT.ALIGNOF), __member(VkXYColorEXT.SIZEOF, VkXYColorEXT.ALIGNOF), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISPLAYPRIMARYRED = layout.offsetof(2);
        DISPLAYPRIMARYGREEN = layout.offsetof(3);
        DISPLAYPRIMARYBLUE = layout.offsetof(4);
        WHITEPOINT = layout.offsetof(5);
        MAXLUMINANCE = layout.offsetof(6);
        MINLUMINANCE = layout.offsetof(7);
        MAXCONTENTLIGHTLEVEL = layout.offsetof(8);
        MAXFRAMEAVERAGELIGHTLEVEL = layout.offsetof(9);
    }

    protected VkHdrMetadataEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkHdrMetadataEXT create(long address, ByteBuffer container) {
        return new VkHdrMetadataEXT(address, container);
    }

    public VkHdrMetadataEXT(ByteBuffer container) {
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

    public VkXYColorEXT displayPrimaryRed() {
        return ndisplayPrimaryRed(address());
    }

    public VkXYColorEXT displayPrimaryGreen() {
        return ndisplayPrimaryGreen(address());
    }

    public VkXYColorEXT displayPrimaryBlue() {
        return ndisplayPrimaryBlue(address());
    }

    public VkXYColorEXT whitePoint() {
        return nwhitePoint(address());
    }

    public float maxLuminance() {
        return nmaxLuminance(address());
    }

    public float minLuminance() {
        return nminLuminance(address());
    }

    public float maxContentLightLevel() {
        return nmaxContentLightLevel(address());
    }

    public float maxFrameAverageLightLevel() {
        return nmaxFrameAverageLightLevel(address());
    }

    public VkHdrMetadataEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkHdrMetadataEXT sType$Default() {
        return sType(EXTHdrMetadata.VK_STRUCTURE_TYPE_HDR_METADATA_EXT);
    }

    public VkHdrMetadataEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkHdrMetadataEXT pNext(VkHdrVividDynamicMetadataHUAWEI value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkHdrMetadataEXT displayPrimaryRed(VkXYColorEXT value) {
        ndisplayPrimaryRed(address(), value);
        return this;
    }

    public VkHdrMetadataEXT displayPrimaryRed(Consumer<VkXYColorEXT> consumer) {
        consumer.accept(displayPrimaryRed());
        return this;
    }

    public VkHdrMetadataEXT displayPrimaryGreen(VkXYColorEXT value) {
        ndisplayPrimaryGreen(address(), value);
        return this;
    }

    public VkHdrMetadataEXT displayPrimaryGreen(Consumer<VkXYColorEXT> consumer) {
        consumer.accept(displayPrimaryGreen());
        return this;
    }

    public VkHdrMetadataEXT displayPrimaryBlue(VkXYColorEXT value) {
        ndisplayPrimaryBlue(address(), value);
        return this;
    }

    public VkHdrMetadataEXT displayPrimaryBlue(Consumer<VkXYColorEXT> consumer) {
        consumer.accept(displayPrimaryBlue());
        return this;
    }

    public VkHdrMetadataEXT whitePoint(VkXYColorEXT value) {
        nwhitePoint(address(), value);
        return this;
    }

    public VkHdrMetadataEXT whitePoint(Consumer<VkXYColorEXT> consumer) {
        consumer.accept(whitePoint());
        return this;
    }

    public VkHdrMetadataEXT maxLuminance(float value) {
        nmaxLuminance(address(), value);
        return this;
    }

    public VkHdrMetadataEXT minLuminance(float value) {
        nminLuminance(address(), value);
        return this;
    }

    public VkHdrMetadataEXT maxContentLightLevel(float value) {
        nmaxContentLightLevel(address(), value);
        return this;
    }

    public VkHdrMetadataEXT maxFrameAverageLightLevel(float value) {
        nmaxFrameAverageLightLevel(address(), value);
        return this;
    }

    public VkHdrMetadataEXT set(int sType, long pNext, VkXYColorEXT displayPrimaryRed, VkXYColorEXT displayPrimaryGreen, VkXYColorEXT displayPrimaryBlue, VkXYColorEXT whitePoint, float maxLuminance, float minLuminance, float maxContentLightLevel, float maxFrameAverageLightLevel) {
        sType(sType);
        pNext(pNext);
        displayPrimaryRed(displayPrimaryRed);
        displayPrimaryGreen(displayPrimaryGreen);
        displayPrimaryBlue(displayPrimaryBlue);
        whitePoint(whitePoint);
        maxLuminance(maxLuminance);
        minLuminance(minLuminance);
        maxContentLightLevel(maxContentLightLevel);
        maxFrameAverageLightLevel(maxFrameAverageLightLevel);
        return this;
    }

    public VkHdrMetadataEXT set(VkHdrMetadataEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkHdrMetadataEXT malloc() {
        return new VkHdrMetadataEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkHdrMetadataEXT calloc() {
        return new VkHdrMetadataEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkHdrMetadataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkHdrMetadataEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkHdrMetadataEXT create(long address) {
        return new VkHdrMetadataEXT(address, null);
    }

    public static VkHdrMetadataEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkHdrMetadataEXT(address, null);
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

    public static VkHdrMetadataEXT malloc(MemoryStack stack) {
        return new VkHdrMetadataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkHdrMetadataEXT calloc(MemoryStack stack) {
        return new VkHdrMetadataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkXYColorEXT ndisplayPrimaryRed(long struct) {
        return VkXYColorEXT.create(struct + DISPLAYPRIMARYRED);
    }

    public static VkXYColorEXT ndisplayPrimaryGreen(long struct) {
        return VkXYColorEXT.create(struct + DISPLAYPRIMARYGREEN);
    }

    public static VkXYColorEXT ndisplayPrimaryBlue(long struct) {
        return VkXYColorEXT.create(struct + DISPLAYPRIMARYBLUE);
    }

    public static VkXYColorEXT nwhitePoint(long struct) {
        return VkXYColorEXT.create(struct + WHITEPOINT);
    }

    public static float nmaxLuminance(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXLUMINANCE);
    }

    public static float nminLuminance(long struct) {
        return MemoryUtil.memGetFloat(struct + MINLUMINANCE);
    }

    public static float nmaxContentLightLevel(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXCONTENTLIGHTLEVEL);
    }

    public static float nmaxFrameAverageLightLevel(long struct) {
        return MemoryUtil.memGetFloat(struct + MAXFRAMEAVERAGELIGHTLEVEL);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndisplayPrimaryRed(long struct, VkXYColorEXT value) {
        MemoryUtil.memCopy(value.address(), struct + DISPLAYPRIMARYRED, VkXYColorEXT.SIZEOF);
    }

    public static void ndisplayPrimaryGreen(long struct, VkXYColorEXT value) {
        MemoryUtil.memCopy(value.address(), struct + DISPLAYPRIMARYGREEN, VkXYColorEXT.SIZEOF);
    }

    public static void ndisplayPrimaryBlue(long struct, VkXYColorEXT value) {
        MemoryUtil.memCopy(value.address(), struct + DISPLAYPRIMARYBLUE, VkXYColorEXT.SIZEOF);
    }

    public static void nwhitePoint(long struct, VkXYColorEXT value) {
        MemoryUtil.memCopy(value.address(), struct + WHITEPOINT, VkXYColorEXT.SIZEOF);
    }

    public static void nmaxLuminance(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAXLUMINANCE, value);
    }

    public static void nminLuminance(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MINLUMINANCE, value);
    }

    public static void nmaxContentLightLevel(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAXCONTENTLIGHTLEVEL, value);
    }

    public static void nmaxFrameAverageLightLevel(long struct, float value) {
        MemoryUtil.memPutFloat(struct + MAXFRAMEAVERAGELIGHTLEVEL, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHdrMetadataEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkHdrMetadataEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkHdrMetadataEXT, Buffer> implements NativeResource {
        private static final VkHdrMetadataEXT ELEMENT_FACTORY = VkHdrMetadataEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkHdrMetadataEXT.SIZEOF);
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
        public VkHdrMetadataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkHdrMetadataEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkHdrMetadataEXT.npNext(address());
        }

        public VkXYColorEXT displayPrimaryRed() {
            return VkHdrMetadataEXT.ndisplayPrimaryRed(address());
        }

        public VkXYColorEXT displayPrimaryGreen() {
            return VkHdrMetadataEXT.ndisplayPrimaryGreen(address());
        }

        public VkXYColorEXT displayPrimaryBlue() {
            return VkHdrMetadataEXT.ndisplayPrimaryBlue(address());
        }

        public VkXYColorEXT whitePoint() {
            return VkHdrMetadataEXT.nwhitePoint(address());
        }

        public float maxLuminance() {
            return VkHdrMetadataEXT.nmaxLuminance(address());
        }

        public float minLuminance() {
            return VkHdrMetadataEXT.nminLuminance(address());
        }

        public float maxContentLightLevel() {
            return VkHdrMetadataEXT.nmaxContentLightLevel(address());
        }

        public float maxFrameAverageLightLevel() {
            return VkHdrMetadataEXT.nmaxFrameAverageLightLevel(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkHdrMetadataEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTHdrMetadata.VK_STRUCTURE_TYPE_HDR_METADATA_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkHdrMetadataEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkHdrVividDynamicMetadataHUAWEI value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer displayPrimaryRed(VkXYColorEXT value) {
            VkHdrMetadataEXT.ndisplayPrimaryRed(address(), value);
            return this;
        }

        public Buffer displayPrimaryRed(Consumer<VkXYColorEXT> consumer) {
            consumer.accept(displayPrimaryRed());
            return this;
        }

        public Buffer displayPrimaryGreen(VkXYColorEXT value) {
            VkHdrMetadataEXT.ndisplayPrimaryGreen(address(), value);
            return this;
        }

        public Buffer displayPrimaryGreen(Consumer<VkXYColorEXT> consumer) {
            consumer.accept(displayPrimaryGreen());
            return this;
        }

        public Buffer displayPrimaryBlue(VkXYColorEXT value) {
            VkHdrMetadataEXT.ndisplayPrimaryBlue(address(), value);
            return this;
        }

        public Buffer displayPrimaryBlue(Consumer<VkXYColorEXT> consumer) {
            consumer.accept(displayPrimaryBlue());
            return this;
        }

        public Buffer whitePoint(VkXYColorEXT value) {
            VkHdrMetadataEXT.nwhitePoint(address(), value);
            return this;
        }

        public Buffer whitePoint(Consumer<VkXYColorEXT> consumer) {
            consumer.accept(whitePoint());
            return this;
        }

        public Buffer maxLuminance(float value) {
            VkHdrMetadataEXT.nmaxLuminance(address(), value);
            return this;
        }

        public Buffer minLuminance(float value) {
            VkHdrMetadataEXT.nminLuminance(address(), value);
            return this;
        }

        public Buffer maxContentLightLevel(float value) {
            VkHdrMetadataEXT.nmaxContentLightLevel(address(), value);
            return this;
        }

        public Buffer maxFrameAverageLightLevel(float value) {
            VkHdrMetadataEXT.nmaxFrameAverageLightLevel(address(), value);
            return this;
        }
    }
}
