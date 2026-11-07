package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapVersionInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapVersionInfoEXT.class */
public class VkMicromapVersionInfoEXT extends Struct<VkMicromapVersionInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PVERSIONDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PVERSIONDATA = layout.offsetof(2);
    }

    protected VkMicromapVersionInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkMicromapVersionInfoEXT create(long address, ByteBuffer container) {
        return new VkMicromapVersionInfoEXT(address, container);
    }

    public VkMicromapVersionInfoEXT(ByteBuffer container) {
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

    @NativeType("uint8_t const *")
    public ByteBuffer pVersionData(int capacity) {
        return npVersionData(address(), capacity);
    }

    public VkMicromapVersionInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkMicromapVersionInfoEXT sType$Default() {
        return sType(1000396001);
    }

    public VkMicromapVersionInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkMicromapVersionInfoEXT pVersionData(@NativeType("uint8_t const *") ByteBuffer value) {
        npVersionData(address(), value);
        return this;
    }

    public VkMicromapVersionInfoEXT set(int sType, long pNext, ByteBuffer pVersionData) {
        sType(sType);
        pNext(pNext);
        pVersionData(pVersionData);
        return this;
    }

    public VkMicromapVersionInfoEXT set(VkMicromapVersionInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkMicromapVersionInfoEXT malloc() {
        return new VkMicromapVersionInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkMicromapVersionInfoEXT calloc() {
        return new VkMicromapVersionInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkMicromapVersionInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkMicromapVersionInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkMicromapVersionInfoEXT create(long address) {
        return new VkMicromapVersionInfoEXT(address, null);
    }

    public static VkMicromapVersionInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkMicromapVersionInfoEXT(address, null);
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

    public static VkMicromapVersionInfoEXT malloc(MemoryStack stack) {
        return new VkMicromapVersionInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkMicromapVersionInfoEXT calloc(MemoryStack stack) {
        return new VkMicromapVersionInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer npVersionData(long struct, int capacity) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PVERSIONDATA), capacity);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npVersionData(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PVERSIONDATA, MemoryUtil.memAddress(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PVERSIONDATA));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapVersionInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkMicromapVersionInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkMicromapVersionInfoEXT, Buffer> implements NativeResource {
        private static final VkMicromapVersionInfoEXT ELEMENT_FACTORY = VkMicromapVersionInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkMicromapVersionInfoEXT.SIZEOF);
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
        public VkMicromapVersionInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkMicromapVersionInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkMicromapVersionInfoEXT.npNext(address());
        }

        @NativeType("uint8_t const *")
        public ByteBuffer pVersionData(int capacity) {
            return VkMicromapVersionInfoEXT.npVersionData(address(), capacity);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkMicromapVersionInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000396001);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkMicromapVersionInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer pVersionData(@NativeType("uint8_t const *") ByteBuffer value) {
            VkMicromapVersionInfoEXT.npVersionData(address(), value);
            return this;
        }
    }
}
