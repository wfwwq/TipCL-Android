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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassBeginInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassBeginInfo.class */
public class VkSubpassBeginInfo extends Struct<VkSubpassBeginInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int CONTENTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        CONTENTS = layout.offsetof(2);
    }

    protected VkSubpassBeginInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkSubpassBeginInfo create(long address, ByteBuffer container) {
        return new VkSubpassBeginInfo(address, container);
    }

    public VkSubpassBeginInfo(ByteBuffer container) {
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

    @NativeType("VkSubpassContents")
    public int contents() {
        return ncontents(address());
    }

    public VkSubpassBeginInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkSubpassBeginInfo sType$Default() {
        return sType(1000109005);
    }

    public VkSubpassBeginInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkSubpassBeginInfo contents(@NativeType("VkSubpassContents") int value) {
        ncontents(address(), value);
        return this;
    }

    public VkSubpassBeginInfo set(int sType, long pNext, int contents) {
        sType(sType);
        pNext(pNext);
        contents(contents);
        return this;
    }

    public VkSubpassBeginInfo set(VkSubpassBeginInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkSubpassBeginInfo malloc() {
        return new VkSubpassBeginInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkSubpassBeginInfo calloc() {
        return new VkSubpassBeginInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkSubpassBeginInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkSubpassBeginInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkSubpassBeginInfo create(long address) {
        return new VkSubpassBeginInfo(address, null);
    }

    public static VkSubpassBeginInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkSubpassBeginInfo(address, null);
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

    public static VkSubpassBeginInfo malloc(MemoryStack stack) {
        return new VkSubpassBeginInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkSubpassBeginInfo calloc(MemoryStack stack) {
        return new VkSubpassBeginInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncontents(long struct) {
        return MemoryUtil.memGetInt(struct + CONTENTS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncontents(long struct, int value) {
        MemoryUtil.memPutInt(struct + CONTENTS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassBeginInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkSubpassBeginInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkSubpassBeginInfo, Buffer> implements NativeResource {
        private static final VkSubpassBeginInfo ELEMENT_FACTORY = VkSubpassBeginInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkSubpassBeginInfo.SIZEOF);
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
        public VkSubpassBeginInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkSubpassBeginInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkSubpassBeginInfo.npNext(address());
        }

        @NativeType("VkSubpassContents")
        public int contents() {
            return VkSubpassBeginInfo.ncontents(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkSubpassBeginInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000109005);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkSubpassBeginInfo.npNext(address(), value);
            return this;
        }

        public Buffer contents(@NativeType("VkSubpassContents") int value) {
            VkSubpassBeginInfo.ncontents(address(), value);
            return this;
        }
    }
}
