package org.lwjgl.vulkan;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;
import org.lwjgl.vulkan.VkPipelineColorBlendAttachmentState;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo.class */
public class VkPipelineColorBlendStateCreateInfo extends Struct<VkPipelineColorBlendStateCreateInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int LOGICOPENABLE;
    public static final int LOGICOP;
    public static final int ATTACHMENTCOUNT;
    public static final int PATTACHMENTS;
    public static final int BLENDCONSTANTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __array(4, 4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        LOGICOPENABLE = layout.offsetof(3);
        LOGICOP = layout.offsetof(4);
        ATTACHMENTCOUNT = layout.offsetof(5);
        PATTACHMENTS = layout.offsetof(6);
        BLENDCONSTANTS = layout.offsetof(7);
    }

    protected VkPipelineColorBlendStateCreateInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineColorBlendStateCreateInfo create(long address, ByteBuffer container) {
        return new VkPipelineColorBlendStateCreateInfo(address, container);
    }

    public VkPipelineColorBlendStateCreateInfo(ByteBuffer container) {
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

    @NativeType("VkPipelineColorBlendStateCreateFlags")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkBool32")
    public boolean logicOpEnable() {
        return nlogicOpEnable(address()) != 0;
    }

    @NativeType("VkLogicOp")
    public int logicOp() {
        return nlogicOp(address());
    }

    @NativeType("uint32_t")
    public int attachmentCount() {
        return nattachmentCount(address());
    }

    @NativeType("VkPipelineColorBlendAttachmentState const *")
    public VkPipelineColorBlendAttachmentState.Buffer pAttachments() {
        return npAttachments(address());
    }

    @NativeType("float[4]")
    public FloatBuffer blendConstants() {
        return nblendConstants(address());
    }

    public float blendConstants(int index) {
        return nblendConstants(address(), index);
    }

    public VkPipelineColorBlendStateCreateInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineColorBlendStateCreateInfo sType$Default() {
        return sType(26);
    }

    public VkPipelineColorBlendStateCreateInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineColorBlendStateCreateInfo pNext(VkPipelineColorBlendAdvancedStateCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineColorBlendStateCreateInfo pNext(VkPipelineColorWriteCreateInfoEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkPipelineColorBlendStateCreateInfo flags(@NativeType("VkPipelineColorBlendStateCreateFlags") int value) {
        nflags(address(), value);
        return this;
    }

    public VkPipelineColorBlendStateCreateInfo logicOpEnable(@NativeType("VkBool32") boolean value) {
        nlogicOpEnable(address(), value ? 1 : 0);
        return this;
    }

    public VkPipelineColorBlendStateCreateInfo logicOp(@NativeType("VkLogicOp") int value) {
        nlogicOp(address(), value);
        return this;
    }

    public VkPipelineColorBlendStateCreateInfo attachmentCount(@NativeType("uint32_t") int value) {
        nattachmentCount(address(), value);
        return this;
    }

    public VkPipelineColorBlendStateCreateInfo pAttachments(@NativeType("VkPipelineColorBlendAttachmentState const *") VkPipelineColorBlendAttachmentState.Buffer value) {
        npAttachments(address(), value);
        return this;
    }

    public VkPipelineColorBlendStateCreateInfo blendConstants(@NativeType("float[4]") FloatBuffer value) {
        nblendConstants(address(), value);
        return this;
    }

    public VkPipelineColorBlendStateCreateInfo blendConstants(int index, float value) {
        nblendConstants(address(), index, value);
        return this;
    }

    public VkPipelineColorBlendStateCreateInfo set(int sType, long pNext, int flags, boolean logicOpEnable, int logicOp, int attachmentCount, VkPipelineColorBlendAttachmentState.Buffer pAttachments, FloatBuffer blendConstants) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        logicOpEnable(logicOpEnable);
        logicOp(logicOp);
        attachmentCount(attachmentCount);
        pAttachments(pAttachments);
        blendConstants(blendConstants);
        return this;
    }

    public VkPipelineColorBlendStateCreateInfo set(VkPipelineColorBlendStateCreateInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineColorBlendStateCreateInfo malloc() {
        return new VkPipelineColorBlendStateCreateInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineColorBlendStateCreateInfo calloc() {
        return new VkPipelineColorBlendStateCreateInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineColorBlendStateCreateInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineColorBlendStateCreateInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineColorBlendStateCreateInfo create(long address) {
        return new VkPipelineColorBlendStateCreateInfo(address, null);
    }

    public static VkPipelineColorBlendStateCreateInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineColorBlendStateCreateInfo(address, null);
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

    public static VkPipelineColorBlendStateCreateInfo malloc(MemoryStack stack) {
        return new VkPipelineColorBlendStateCreateInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineColorBlendStateCreateInfo calloc(MemoryStack stack) {
        return new VkPipelineColorBlendStateCreateInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nlogicOpEnable(long struct) {
        return MemoryUtil.memGetInt(struct + LOGICOPENABLE);
    }

    public static int nlogicOp(long struct) {
        return MemoryUtil.memGetInt(struct + LOGICOP);
    }

    public static int nattachmentCount(long struct) {
        return MemoryUtil.memGetInt(struct + ATTACHMENTCOUNT);
    }

    public static VkPipelineColorBlendAttachmentState.Buffer npAttachments(long struct) {
        return VkPipelineColorBlendAttachmentState.createSafe(MemoryUtil.memGetAddress(struct + PATTACHMENTS), nattachmentCount(struct));
    }

    public static FloatBuffer nblendConstants(long struct) {
        return MemoryUtil.memFloatBuffer(struct + BLENDCONSTANTS, 4);
    }

    public static float nblendConstants(long struct, int index) {
        return MemoryUtil.memGetFloat(struct + BLENDCONSTANTS + (Checks.check(index, 4) * 4));
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

    public static void nlogicOpEnable(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOGICOPENABLE, value);
    }

    public static void nlogicOp(long struct, int value) {
        MemoryUtil.memPutInt(struct + LOGICOP, value);
    }

    public static void nattachmentCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + ATTACHMENTCOUNT, value);
    }

    public static void npAttachments(long struct, VkPipelineColorBlendAttachmentState.Buffer value) {
        MemoryUtil.memPutAddress(struct + PATTACHMENTS, MemoryUtil.memAddressSafe(value));
        if (value != null) {
            nattachmentCount(struct, value.remaining());
        }
    }

    public static void nblendConstants(long struct, FloatBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 4);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + BLENDCONSTANTS, value.remaining() * 4);
    }

    public static void nblendConstants(long struct, int index, float value) {
        MemoryUtil.memPutFloat(struct + BLENDCONSTANTS + (Checks.check(index, 4) * 4), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineColorBlendStateCreateInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineColorBlendStateCreateInfo, Buffer> implements NativeResource {
        private static final VkPipelineColorBlendStateCreateInfo ELEMENT_FACTORY = VkPipelineColorBlendStateCreateInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineColorBlendStateCreateInfo.SIZEOF);
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
        public VkPipelineColorBlendStateCreateInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineColorBlendStateCreateInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineColorBlendStateCreateInfo.npNext(address());
        }

        @NativeType("VkPipelineColorBlendStateCreateFlags")
        public int flags() {
            return VkPipelineColorBlendStateCreateInfo.nflags(address());
        }

        @NativeType("VkBool32")
        public boolean logicOpEnable() {
            return VkPipelineColorBlendStateCreateInfo.nlogicOpEnable(address()) != 0;
        }

        @NativeType("VkLogicOp")
        public int logicOp() {
            return VkPipelineColorBlendStateCreateInfo.nlogicOp(address());
        }

        @NativeType("uint32_t")
        public int attachmentCount() {
            return VkPipelineColorBlendStateCreateInfo.nattachmentCount(address());
        }

        @NativeType("VkPipelineColorBlendAttachmentState const *")
        public VkPipelineColorBlendAttachmentState.Buffer pAttachments() {
            return VkPipelineColorBlendStateCreateInfo.npAttachments(address());
        }

        @NativeType("float[4]")
        public FloatBuffer blendConstants() {
            return VkPipelineColorBlendStateCreateInfo.nblendConstants(address());
        }

        public float blendConstants(int index) {
            return VkPipelineColorBlendStateCreateInfo.nblendConstants(address(), index);
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineColorBlendStateCreateInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(26);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineColorBlendStateCreateInfo.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkPipelineColorBlendAdvancedStateCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer pNext(VkPipelineColorWriteCreateInfoEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkPipelineColorBlendStateCreateFlags") int value) {
            VkPipelineColorBlendStateCreateInfo.nflags(address(), value);
            return this;
        }

        public Buffer logicOpEnable(@NativeType("VkBool32") boolean value) {
            VkPipelineColorBlendStateCreateInfo.nlogicOpEnable(address(), value ? 1 : 0);
            return this;
        }

        public Buffer logicOp(@NativeType("VkLogicOp") int value) {
            VkPipelineColorBlendStateCreateInfo.nlogicOp(address(), value);
            return this;
        }

        public Buffer attachmentCount(@NativeType("uint32_t") int value) {
            VkPipelineColorBlendStateCreateInfo.nattachmentCount(address(), value);
            return this;
        }

        public Buffer pAttachments(@NativeType("VkPipelineColorBlendAttachmentState const *") VkPipelineColorBlendAttachmentState.Buffer value) {
            VkPipelineColorBlendStateCreateInfo.npAttachments(address(), value);
            return this;
        }

        public Buffer blendConstants(@NativeType("float[4]") FloatBuffer value) {
            VkPipelineColorBlendStateCreateInfo.nblendConstants(address(), value);
            return this;
        }

        public Buffer blendConstants(int index, float value) {
            VkPipelineColorBlendStateCreateInfo.nblendConstants(address(), index, value);
            return this;
        }
    }
}
