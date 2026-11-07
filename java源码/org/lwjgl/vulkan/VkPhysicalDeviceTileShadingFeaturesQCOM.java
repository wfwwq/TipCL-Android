package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTileShadingFeaturesQCOM.class */
public class VkPhysicalDeviceTileShadingFeaturesQCOM extends Struct<VkPhysicalDeviceTileShadingFeaturesQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TILESHADING;
    public static final int TILESHADINGFRAGMENTSTAGE;
    public static final int TILESHADINGCOLORATTACHMENTS;
    public static final int TILESHADINGDEPTHATTACHMENTS;
    public static final int TILESHADINGSTENCILATTACHMENTS;
    public static final int TILESHADINGINPUTATTACHMENTS;
    public static final int TILESHADINGSAMPLEDATTACHMENTS;
    public static final int TILESHADINGPERTILEDRAW;
    public static final int TILESHADINGPERTILEDISPATCH;
    public static final int TILESHADINGDISPATCHTILE;
    public static final int TILESHADINGAPRON;
    public static final int TILESHADINGANISOTROPICAPRON;
    public static final int TILESHADINGATOMICOPS;
    public static final int TILESHADINGIMAGEPROCESSING;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TILESHADING = layout.offsetof(2);
        TILESHADINGFRAGMENTSTAGE = layout.offsetof(3);
        TILESHADINGCOLORATTACHMENTS = layout.offsetof(4);
        TILESHADINGDEPTHATTACHMENTS = layout.offsetof(5);
        TILESHADINGSTENCILATTACHMENTS = layout.offsetof(6);
        TILESHADINGINPUTATTACHMENTS = layout.offsetof(7);
        TILESHADINGSAMPLEDATTACHMENTS = layout.offsetof(8);
        TILESHADINGPERTILEDRAW = layout.offsetof(9);
        TILESHADINGPERTILEDISPATCH = layout.offsetof(10);
        TILESHADINGDISPATCHTILE = layout.offsetof(11);
        TILESHADINGAPRON = layout.offsetof(12);
        TILESHADINGANISOTROPICAPRON = layout.offsetof(13);
        TILESHADINGATOMICOPS = layout.offsetof(14);
        TILESHADINGIMAGEPROCESSING = layout.offsetof(15);
    }

    protected VkPhysicalDeviceTileShadingFeaturesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceTileShadingFeaturesQCOM create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(address, container);
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM(ByteBuffer container) {
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
    public boolean tileShading() {
        return ntileShading(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileShadingFragmentStage() {
        return ntileShadingFragmentStage(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileShadingColorAttachments() {
        return ntileShadingColorAttachments(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileShadingDepthAttachments() {
        return ntileShadingDepthAttachments(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileShadingStencilAttachments() {
        return ntileShadingStencilAttachments(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileShadingInputAttachments() {
        return ntileShadingInputAttachments(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileShadingSampledAttachments() {
        return ntileShadingSampledAttachments(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileShadingPerTileDraw() {
        return ntileShadingPerTileDraw(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileShadingPerTileDispatch() {
        return ntileShadingPerTileDispatch(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileShadingDispatchTile() {
        return ntileShadingDispatchTile(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileShadingApron() {
        return ntileShadingApron(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileShadingAnisotropicApron() {
        return ntileShadingAnisotropicApron(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileShadingAtomicOps() {
        return ntileShadingAtomicOps(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean tileShadingImageProcessing() {
        return ntileShadingImageProcessing(address()) != 0;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM sType$Default() {
        return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM);
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShading(@NativeType("VkBool32") boolean value) {
        ntileShading(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingFragmentStage(@NativeType("VkBool32") boolean value) {
        ntileShadingFragmentStage(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingColorAttachments(@NativeType("VkBool32") boolean value) {
        ntileShadingColorAttachments(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDepthAttachments(@NativeType("VkBool32") boolean value) {
        ntileShadingDepthAttachments(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingStencilAttachments(@NativeType("VkBool32") boolean value) {
        ntileShadingStencilAttachments(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingInputAttachments(@NativeType("VkBool32") boolean value) {
        ntileShadingInputAttachments(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingSampledAttachments(@NativeType("VkBool32") boolean value) {
        ntileShadingSampledAttachments(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDraw(@NativeType("VkBool32") boolean value) {
        ntileShadingPerTileDraw(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingPerTileDispatch(@NativeType("VkBool32") boolean value) {
        ntileShadingPerTileDispatch(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingDispatchTile(@NativeType("VkBool32") boolean value) {
        ntileShadingDispatchTile(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingApron(@NativeType("VkBool32") boolean value) {
        ntileShadingApron(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAnisotropicApron(@NativeType("VkBool32") boolean value) {
        ntileShadingAnisotropicApron(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingAtomicOps(@NativeType("VkBool32") boolean value) {
        ntileShadingAtomicOps(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM tileShadingImageProcessing(@NativeType("VkBool32") boolean value) {
        ntileShadingImageProcessing(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM set(int sType, long pNext, boolean tileShading, boolean tileShadingFragmentStage, boolean tileShadingColorAttachments, boolean tileShadingDepthAttachments, boolean tileShadingStencilAttachments, boolean tileShadingInputAttachments, boolean tileShadingSampledAttachments, boolean tileShadingPerTileDraw, boolean tileShadingPerTileDispatch, boolean tileShadingDispatchTile, boolean tileShadingApron, boolean tileShadingAnisotropicApron, boolean tileShadingAtomicOps, boolean tileShadingImageProcessing) {
        sType(sType);
        pNext(pNext);
        tileShading(tileShading);
        tileShadingFragmentStage(tileShadingFragmentStage);
        tileShadingColorAttachments(tileShadingColorAttachments);
        tileShadingDepthAttachments(tileShadingDepthAttachments);
        tileShadingStencilAttachments(tileShadingStencilAttachments);
        tileShadingInputAttachments(tileShadingInputAttachments);
        tileShadingSampledAttachments(tileShadingSampledAttachments);
        tileShadingPerTileDraw(tileShadingPerTileDraw);
        tileShadingPerTileDispatch(tileShadingPerTileDispatch);
        tileShadingDispatchTile(tileShadingDispatchTile);
        tileShadingApron(tileShadingApron);
        tileShadingAnisotropicApron(tileShadingAnisotropicApron);
        tileShadingAtomicOps(tileShadingAtomicOps);
        tileShadingImageProcessing(tileShadingImageProcessing);
        return this;
    }

    public VkPhysicalDeviceTileShadingFeaturesQCOM set(VkPhysicalDeviceTileShadingFeaturesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceTileShadingFeaturesQCOM malloc() {
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceTileShadingFeaturesQCOM calloc() {
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceTileShadingFeaturesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceTileShadingFeaturesQCOM create(long address) {
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(address, null);
    }

    public static VkPhysicalDeviceTileShadingFeaturesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(address, null);
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

    public static VkPhysicalDeviceTileShadingFeaturesQCOM malloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceTileShadingFeaturesQCOM calloc(MemoryStack stack) {
        return new VkPhysicalDeviceTileShadingFeaturesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ntileShading(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADING);
    }

    public static int ntileShadingFragmentStage(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADINGFRAGMENTSTAGE);
    }

    public static int ntileShadingColorAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADINGCOLORATTACHMENTS);
    }

    public static int ntileShadingDepthAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADINGDEPTHATTACHMENTS);
    }

    public static int ntileShadingStencilAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADINGSTENCILATTACHMENTS);
    }

    public static int ntileShadingInputAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADINGINPUTATTACHMENTS);
    }

    public static int ntileShadingSampledAttachments(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADINGSAMPLEDATTACHMENTS);
    }

    public static int ntileShadingPerTileDraw(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADINGPERTILEDRAW);
    }

    public static int ntileShadingPerTileDispatch(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADINGPERTILEDISPATCH);
    }

    public static int ntileShadingDispatchTile(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADINGDISPATCHTILE);
    }

    public static int ntileShadingApron(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADINGAPRON);
    }

    public static int ntileShadingAnisotropicApron(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADINGANISOTROPICAPRON);
    }

    public static int ntileShadingAtomicOps(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADINGATOMICOPS);
    }

    public static int ntileShadingImageProcessing(long struct) {
        return MemoryUtil.memGetInt(struct + TILESHADINGIMAGEPROCESSING);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntileShading(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADING, value);
    }

    public static void ntileShadingFragmentStage(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADINGFRAGMENTSTAGE, value);
    }

    public static void ntileShadingColorAttachments(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADINGCOLORATTACHMENTS, value);
    }

    public static void ntileShadingDepthAttachments(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADINGDEPTHATTACHMENTS, value);
    }

    public static void ntileShadingStencilAttachments(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADINGSTENCILATTACHMENTS, value);
    }

    public static void ntileShadingInputAttachments(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADINGINPUTATTACHMENTS, value);
    }

    public static void ntileShadingSampledAttachments(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADINGSAMPLEDATTACHMENTS, value);
    }

    public static void ntileShadingPerTileDraw(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADINGPERTILEDRAW, value);
    }

    public static void ntileShadingPerTileDispatch(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADINGPERTILEDISPATCH, value);
    }

    public static void ntileShadingDispatchTile(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADINGDISPATCHTILE, value);
    }

    public static void ntileShadingApron(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADINGAPRON, value);
    }

    public static void ntileShadingAnisotropicApron(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADINGANISOTROPICAPRON, value);
    }

    public static void ntileShadingAtomicOps(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADINGATOMICOPS, value);
    }

    public static void ntileShadingImageProcessing(long struct, int value) {
        MemoryUtil.memPutInt(struct + TILESHADINGIMAGEPROCESSING, value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceTileShadingFeaturesQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceTileShadingFeaturesQCOM, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceTileShadingFeaturesQCOM ELEMENT_FACTORY = VkPhysicalDeviceTileShadingFeaturesQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceTileShadingFeaturesQCOM.SIZEOF);
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
        public VkPhysicalDeviceTileShadingFeaturesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean tileShading() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShading(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileShadingFragmentStage() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingFragmentStage(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileShadingColorAttachments() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingColorAttachments(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileShadingDepthAttachments() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingDepthAttachments(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileShadingStencilAttachments() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingStencilAttachments(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileShadingInputAttachments() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingInputAttachments(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileShadingSampledAttachments() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingSampledAttachments(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileShadingPerTileDraw() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingPerTileDraw(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileShadingPerTileDispatch() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingPerTileDispatch(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileShadingDispatchTile() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingDispatchTile(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileShadingApron() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingApron(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileShadingAnisotropicApron() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingAnisotropicApron(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileShadingAtomicOps() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingAtomicOps(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean tileShadingImageProcessing() {
            return VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingImageProcessing(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMTileShading.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_SHADING_FEATURES_QCOM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.npNext(address(), value);
            return this;
        }

        public Buffer tileShading(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShading(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileShadingFragmentStage(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingFragmentStage(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileShadingColorAttachments(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingColorAttachments(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileShadingDepthAttachments(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingDepthAttachments(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileShadingStencilAttachments(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingStencilAttachments(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileShadingInputAttachments(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingInputAttachments(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileShadingSampledAttachments(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingSampledAttachments(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileShadingPerTileDraw(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingPerTileDraw(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileShadingPerTileDispatch(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingPerTileDispatch(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileShadingDispatchTile(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingDispatchTile(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileShadingApron(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingApron(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileShadingAnisotropicApron(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingAnisotropicApron(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileShadingAtomicOps(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingAtomicOps(address(), value ? 1 : 0);
            return this;
        }

        public Buffer tileShadingImageProcessing(@NativeType("VkBool32") boolean value) {
            VkPhysicalDeviceTileShadingFeaturesQCOM.ntileShadingImageProcessing(address(), value ? 1 : 0);
            return this;
        }
    }
}
