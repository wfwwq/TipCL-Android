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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkValidationFlagsEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkValidationFlagsEXT.class */
public class VkValidationFlagsEXT extends Struct<VkValidationFlagsEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int DISABLEDVALIDATIONCHECKCOUNT;
    public static final int PDISABLEDVALIDATIONCHECKS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        DISABLEDVALIDATIONCHECKCOUNT = layout.offsetof(2);
        PDISABLEDVALIDATIONCHECKS = layout.offsetof(3);
    }

    protected VkValidationFlagsEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkValidationFlagsEXT create(long address, ByteBuffer container) {
        return new VkValidationFlagsEXT(address, container);
    }

    public VkValidationFlagsEXT(ByteBuffer container) {
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
    public int disabledValidationCheckCount() {
        return ndisabledValidationCheckCount(address());
    }

    @NativeType("VkValidationCheckEXT const *")
    public IntBuffer pDisabledValidationChecks() {
        return npDisabledValidationChecks(address());
    }

    public VkValidationFlagsEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkValidationFlagsEXT sType$Default() {
        return sType(EXTValidationFlags.VK_STRUCTURE_TYPE_VALIDATION_FLAGS_EXT);
    }

    public VkValidationFlagsEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkValidationFlagsEXT pDisabledValidationChecks(@NativeType("VkValidationCheckEXT const *") IntBuffer value) {
        npDisabledValidationChecks(address(), value);
        return this;
    }

    public VkValidationFlagsEXT set(int sType, long pNext, IntBuffer pDisabledValidationChecks) {
        sType(sType);
        pNext(pNext);
        pDisabledValidationChecks(pDisabledValidationChecks);
        return this;
    }

    public VkValidationFlagsEXT set(VkValidationFlagsEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkValidationFlagsEXT malloc() {
        return new VkValidationFlagsEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkValidationFlagsEXT calloc() {
        return new VkValidationFlagsEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkValidationFlagsEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkValidationFlagsEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkValidationFlagsEXT create(long address) {
        return new VkValidationFlagsEXT(address, null);
    }

    public static VkValidationFlagsEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkValidationFlagsEXT(address, null);
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

    public static VkValidationFlagsEXT malloc(MemoryStack stack) {
        return new VkValidationFlagsEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkValidationFlagsEXT calloc(MemoryStack stack) {
        return new VkValidationFlagsEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ndisabledValidationCheckCount(long struct) {
        return MemoryUtil.memGetInt(struct + DISABLEDVALIDATIONCHECKCOUNT);
    }

    public static IntBuffer npDisabledValidationChecks(long struct) {
        return MemoryUtil.memIntBuffer(MemoryUtil.memGetAddress(struct + PDISABLEDVALIDATIONCHECKS), ndisabledValidationCheckCount(struct));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ndisabledValidationCheckCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + DISABLEDVALIDATIONCHECKCOUNT, value);
    }

    public static void npDisabledValidationChecks(long struct, IntBuffer value) {
        MemoryUtil.memPutAddress(struct + PDISABLEDVALIDATIONCHECKS, MemoryUtil.memAddress(value));
        ndisabledValidationCheckCount(struct, value.remaining());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PDISABLEDVALIDATIONCHECKS));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkValidationFlagsEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkValidationFlagsEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkValidationFlagsEXT, Buffer> implements NativeResource {
        private static final VkValidationFlagsEXT ELEMENT_FACTORY = VkValidationFlagsEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkValidationFlagsEXT.SIZEOF);
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
        public VkValidationFlagsEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkValidationFlagsEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkValidationFlagsEXT.npNext(address());
        }

        @NativeType("uint32_t")
        public int disabledValidationCheckCount() {
            return VkValidationFlagsEXT.ndisabledValidationCheckCount(address());
        }

        @NativeType("VkValidationCheckEXT const *")
        public IntBuffer pDisabledValidationChecks() {
            return VkValidationFlagsEXT.npDisabledValidationChecks(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkValidationFlagsEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTValidationFlags.VK_STRUCTURE_TYPE_VALIDATION_FLAGS_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkValidationFlagsEXT.npNext(address(), value);
            return this;
        }

        public Buffer pDisabledValidationChecks(@NativeType("VkValidationCheckEXT const *") IntBuffer value) {
            VkValidationFlagsEXT.npDisabledValidationChecks(address(), value);
            return this;
        }
    }
}
