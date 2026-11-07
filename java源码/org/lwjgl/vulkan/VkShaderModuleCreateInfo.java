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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderModuleCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderModuleCreateInfo.class */
public class VkShaderModuleCreateInfo extends Struct<VkShaderModuleCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int CODESIZE;
    public static final int PCODE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        CODESIZE = layout.offsetof(3);
        PCODE = layout.offsetof(4);
    }

    protected VkShaderModuleCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkShaderModuleCreateInfo create(long address, ByteBuffer container) {
        return new VkShaderModuleCreateInfo(address, container);
    }

    public VkShaderModuleCreateInfo(ByteBuffer container) {
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

    @NativeType("VkShaderModuleCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("size_t")
    public long codeSize() {
        return ncodeSize(address());
    }

    @NativeType("uint32_t const *")
    public ByteBuffer pCode() {
        return npCode(address());
    }

    public VkShaderModuleCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkShaderModuleCreateInfo sType$Default() {
        return sType(16);
    }

    public VkShaderModuleCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkShaderModuleCreateInfo pNext(VkShaderModuleValidationCacheCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkShaderModuleCreateInfo pNext(VkValidationFeaturesEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkShaderModuleCreateInfo flags(@NativeType("VkShaderModuleCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkShaderModuleCreateInfo pCode(@NativeType("uint32_t const *") ByteBuffer value) {
        npCode(address(), value);
        return this;
    }

    public VkShaderModuleCreateInfo set(int sType, long pNext, int flags, ByteBuffer pCode) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pCode(pCode);
        return this;
    }

    public VkShaderModuleCreateInfo set(VkShaderModuleCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkShaderModuleCreateInfo malloc() {
        return new VkShaderModuleCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkShaderModuleCreateInfo calloc() {
        return new VkShaderModuleCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkShaderModuleCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkShaderModuleCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkShaderModuleCreateInfo create(long address) {
        return new VkShaderModuleCreateInfo(address, null);
    }

    public static VkShaderModuleCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkShaderModuleCreateInfo(address, null);
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

    public static VkShaderModuleCreateInfo malloc(MemoryStack stack) {
        return new VkShaderModuleCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkShaderModuleCreateInfo calloc(MemoryStack stack) {
        return new VkShaderModuleCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static long ncodeSize(long struct) {
        return MemoryUtil.memGetAddress(struct + CODESIZE);
    }

    public static ByteBuffer npCode(long struct) {
        return MemoryUtil.memByteBuffer(MemoryUtil.memGetAddress(struct + PCODE), (int) ncodeSize(struct));
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

    public static void ncodeSize(long struct, long value) {
        MemoryUtil.memPutAddress(struct + CODESIZE, value);
    }

    public static void npCode(long struct, ByteBuffer value) {
        MemoryUtil.memPutAddress(struct + PCODE, MemoryUtil.memAddress(value));
        ncodeSize(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PCODE));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderModuleCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkShaderModuleCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkShaderModuleCreateInfo, Buffer> implements NativeResource {
        private static final VkShaderModuleCreateInfo ELEMENT_FACTORY = VkShaderModuleCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkShaderModuleCreateInfo.SIZEOF);
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
        public VkShaderModuleCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkShaderModuleCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkShaderModuleCreateInfo.npNext(address());
        }

        @NativeType("VkShaderModuleCreateFlags")
        public int flags() {
            return VkShaderModuleCreateInfo.nflags(address());
        }

        @NativeType("size_t")
        public long codeSize() {
            return VkShaderModuleCreateInfo.ncodeSize(address());
        }

        @NativeType("uint32_t const *")
        public ByteBuffer pCode() {
            return VkShaderModuleCreateInfo.npCode(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkShaderModuleCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(16);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkShaderModuleCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkShaderModuleValidationCacheCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkValidationFeaturesEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkShaderModuleCreateFlags") int value) {
            VkShaderModuleCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer pCode(@NativeType("uint32_t const *") ByteBuffer value) {
            VkShaderModuleCreateInfo.npCode(address(), value);
            return this;
        }
    }
}
