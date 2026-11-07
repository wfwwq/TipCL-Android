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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkProtectedSubmitInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkProtectedSubmitInfo.class */
public class VkProtectedSubmitInfo extends Struct<VkProtectedSubmitInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PROTECTEDSUBMIT;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PROTECTEDSUBMIT = layout.offsetof(2);
    }

    protected VkProtectedSubmitInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkProtectedSubmitInfo create(long address, ByteBuffer container) {
        return new VkProtectedSubmitInfo(address, container);
    }

    public VkProtectedSubmitInfo(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean protectedSubmit() {
        return nprotectedSubmit(address()) != 0;
    }

    public VkProtectedSubmitInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkProtectedSubmitInfo sType$Default() {
        return sType(VK11.VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO);
    }

    public VkProtectedSubmitInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkProtectedSubmitInfo protectedSubmit(@NativeType("VkBool32") boolean value) {
        nprotectedSubmit(address(), value ? 1 : 0);
        return this;
    }

    public VkProtectedSubmitInfo set(int sType, long pNext, boolean protectedSubmit) {
        sType(sType);
        pNext(pNext);
        protectedSubmit(protectedSubmit);
        return this;
    }

    public VkProtectedSubmitInfo set(VkProtectedSubmitInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkProtectedSubmitInfo malloc() {
        return new VkProtectedSubmitInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkProtectedSubmitInfo calloc() {
        return new VkProtectedSubmitInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkProtectedSubmitInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkProtectedSubmitInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkProtectedSubmitInfo create(long address) {
        return new VkProtectedSubmitInfo(address, null);
    }

    public static VkProtectedSubmitInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkProtectedSubmitInfo(address, null);
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

    public static VkProtectedSubmitInfo malloc(MemoryStack stack) {
        return new VkProtectedSubmitInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkProtectedSubmitInfo calloc(MemoryStack stack) {
        return new VkProtectedSubmitInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nprotectedSubmit(long struct) {
        return MemoryUtil.memGetInt(struct + PROTECTEDSUBMIT);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nprotectedSubmit(long struct, int value) {
        MemoryUtil.memPutInt(struct + PROTECTEDSUBMIT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkProtectedSubmitInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkProtectedSubmitInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkProtectedSubmitInfo, Buffer> implements NativeResource {
        private static final VkProtectedSubmitInfo ELEMENT_FACTORY = VkProtectedSubmitInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkProtectedSubmitInfo.SIZEOF);
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
        public VkProtectedSubmitInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkProtectedSubmitInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkProtectedSubmitInfo.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean protectedSubmit() {
            return VkProtectedSubmitInfo.nprotectedSubmit(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkProtectedSubmitInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(VK11.VK_STRUCTURE_TYPE_PROTECTED_SUBMIT_INFO);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkProtectedSubmitInfo.npNext(address(), value);
            return this;
        }

        public Buffer protectedSubmit(@NativeType("VkBool32") boolean value) {
            VkProtectedSubmitInfo.nprotectedSubmit(address(), value ? 1 : 0);
            return this;
        }
    }
}
