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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTilePropertiesQCOM.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTilePropertiesQCOM.class */
public class VkTilePropertiesQCOM extends Struct<VkTilePropertiesQCOM> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int TILESIZE;
    public static final int APRONSIZE;
    public static final int ORIGIN;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF), __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF), __member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        TILESIZE = layout.offsetof(2);
        APRONSIZE = layout.offsetof(3);
        ORIGIN = layout.offsetof(4);
    }

    protected VkTilePropertiesQCOM(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkTilePropertiesQCOM create(long address, ByteBuffer container) {
        return new VkTilePropertiesQCOM(address, container);
    }

    public VkTilePropertiesQCOM(ByteBuffer container) {
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

    public VkExtent3D tileSize() {
        return ntileSize(address());
    }

    public VkExtent2D apronSize() {
        return napronSize(address());
    }

    public VkOffset2D origin() {
        return norigin(address());
    }

    public VkTilePropertiesQCOM sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkTilePropertiesQCOM sType$Default() {
        return sType(QCOMTileProperties.VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM);
    }

    public VkTilePropertiesQCOM pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkTilePropertiesQCOM tileSize(VkExtent3D value) {
        ntileSize(address(), value);
        return this;
    }

    public VkTilePropertiesQCOM tileSize(Consumer<VkExtent3D> consumer) {
        consumer.accept(tileSize());
        return this;
    }

    public VkTilePropertiesQCOM apronSize(VkExtent2D value) {
        napronSize(address(), value);
        return this;
    }

    public VkTilePropertiesQCOM apronSize(Consumer<VkExtent2D> consumer) {
        consumer.accept(apronSize());
        return this;
    }

    public VkTilePropertiesQCOM origin(VkOffset2D value) {
        norigin(address(), value);
        return this;
    }

    public VkTilePropertiesQCOM origin(Consumer<VkOffset2D> consumer) {
        consumer.accept(origin());
        return this;
    }

    public VkTilePropertiesQCOM set(int sType, long pNext, VkExtent3D tileSize, VkExtent2D apronSize, VkOffset2D origin) {
        sType(sType);
        pNext(pNext);
        tileSize(tileSize);
        apronSize(apronSize);
        origin(origin);
        return this;
    }

    public VkTilePropertiesQCOM set(VkTilePropertiesQCOM src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkTilePropertiesQCOM malloc() {
        return new VkTilePropertiesQCOM(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkTilePropertiesQCOM calloc() {
        return new VkTilePropertiesQCOM(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkTilePropertiesQCOM create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkTilePropertiesQCOM(MemoryUtil.memAddress(container), container);
    }

    public static VkTilePropertiesQCOM create(long address) {
        return new VkTilePropertiesQCOM(address, null);
    }

    public static VkTilePropertiesQCOM createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkTilePropertiesQCOM(address, null);
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

    public static VkTilePropertiesQCOM malloc(MemoryStack stack) {
        return new VkTilePropertiesQCOM(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkTilePropertiesQCOM calloc(MemoryStack stack) {
        return new VkTilePropertiesQCOM(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkExtent3D ntileSize(long struct) {
        return VkExtent3D.create(struct + TILESIZE);
    }

    public static VkExtent2D napronSize(long struct) {
        return VkExtent2D.create(struct + APRONSIZE);
    }

    public static VkOffset2D norigin(long struct) {
        return VkOffset2D.create(struct + ORIGIN);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ntileSize(long struct, VkExtent3D value) {
        MemoryUtil.memCopy(value.address(), struct + TILESIZE, VkExtent3D.SIZEOF);
    }

    public static void napronSize(long struct, VkExtent2D value) {
        MemoryUtil.memCopy(value.address(), struct + APRONSIZE, VkExtent2D.SIZEOF);
    }

    public static void norigin(long struct, VkOffset2D value) {
        MemoryUtil.memCopy(value.address(), struct + ORIGIN, VkOffset2D.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTilePropertiesQCOM$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkTilePropertiesQCOM$Buffer.class */
    public static class Buffer extends StructBuffer<VkTilePropertiesQCOM, Buffer> implements NativeResource {
        private static final VkTilePropertiesQCOM ELEMENT_FACTORY = VkTilePropertiesQCOM.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkTilePropertiesQCOM.SIZEOF);
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
        public VkTilePropertiesQCOM getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkTilePropertiesQCOM.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkTilePropertiesQCOM.npNext(address());
        }

        public VkExtent3D tileSize() {
            return VkTilePropertiesQCOM.ntileSize(address());
        }

        public VkExtent2D apronSize() {
            return VkTilePropertiesQCOM.napronSize(address());
        }

        public VkOffset2D origin() {
            return VkTilePropertiesQCOM.norigin(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkTilePropertiesQCOM.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(QCOMTileProperties.VK_STRUCTURE_TYPE_TILE_PROPERTIES_QCOM);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkTilePropertiesQCOM.npNext(address(), value);
            return this;
        }

        public Buffer tileSize(VkExtent3D value) {
            VkTilePropertiesQCOM.ntileSize(address(), value);
            return this;
        }

        public Buffer tileSize(Consumer<VkExtent3D> consumer) {
            consumer.accept(tileSize());
            return this;
        }

        public Buffer apronSize(VkExtent2D value) {
            VkTilePropertiesQCOM.napronSize(address(), value);
            return this;
        }

        public Buffer apronSize(Consumer<VkExtent2D> consumer) {
            consumer.accept(apronSize());
            return this;
        }

        public Buffer origin(VkOffset2D value) {
            VkTilePropertiesQCOM.norigin(address(), value);
            return this;
        }

        public Buffer origin(Consumer<VkOffset2D> consumer) {
            consumer.accept(origin());
            return this;
        }
    }
}
