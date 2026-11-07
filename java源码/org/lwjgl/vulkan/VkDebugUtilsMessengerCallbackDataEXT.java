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
import org.lwjgl.vulkan.VkDebugUtilsLabelEXT;
import org.lwjgl.vulkan.VkDebugUtilsObjectNameInfoEXT;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackDataEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackDataEXT.class */
public class VkDebugUtilsMessengerCallbackDataEXT extends Struct<VkDebugUtilsMessengerCallbackDataEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int PMESSAGEIDNAME;
    public static final int MESSAGEIDNUMBER;
    public static final int PMESSAGE;
    public static final int QUEUELABELCOUNT;
    public static final int PQUEUELABELS;
    public static final int CMDBUFLABELCOUNT;
    public static final int PCMDBUFLABELS;
    public static final int OBJECTCOUNT;
    public static final int POBJECTS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PMESSAGEIDNAME = layout.offsetof(3);
        MESSAGEIDNUMBER = layout.offsetof(4);
        PMESSAGE = layout.offsetof(5);
        QUEUELABELCOUNT = layout.offsetof(6);
        PQUEUELABELS = layout.offsetof(7);
        CMDBUFLABELCOUNT = layout.offsetof(8);
        PCMDBUFLABELS = layout.offsetof(9);
        OBJECTCOUNT = layout.offsetof(10);
        POBJECTS = layout.offsetof(11);
    }

    protected VkDebugUtilsMessengerCallbackDataEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDebugUtilsMessengerCallbackDataEXT create(long address, ByteBuffer container) {
        return new VkDebugUtilsMessengerCallbackDataEXT(address, container);
    }

    public VkDebugUtilsMessengerCallbackDataEXT(ByteBuffer container) {
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

    @NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("char const *")
    public ByteBuffer pMessageIdName() {
        return npMessageIdName(address());
    }

    @NativeType("char const *")
    public String pMessageIdNameString() {
        return npMessageIdNameString(address());
    }

    @NativeType("int32_t")
    public int messageIdNumber() {
        return nmessageIdNumber(address());
    }

    @NativeType("char const *")
    public ByteBuffer pMessage() {
        return npMessage(address());
    }

    @NativeType("char const *")
    public String pMessageString() {
        return npMessageString(address());
    }

    @NativeType("uint32_t")
    public int queueLabelCount() {
        return nqueueLabelCount(address());
    }

    @NativeType("VkDebugUtilsLabelEXT const *")
    public VkDebugUtilsLabelEXT.Buffer pQueueLabels() {
        return npQueueLabels(address());
    }

    @NativeType("uint32_t")
    public int cmdBufLabelCount() {
        return ncmdBufLabelCount(address());
    }

    @NativeType("VkDebugUtilsLabelEXT const *")
    public VkDebugUtilsLabelEXT.Buffer pCmdBufLabels() {
        return npCmdBufLabels(address());
    }

    @NativeType("uint32_t")
    public int objectCount() {
        return nobjectCount(address());
    }

    @NativeType("VkDebugUtilsObjectNameInfoEXT const *")
    public VkDebugUtilsObjectNameInfoEXT.Buffer pObjects() {
        return npObjects(address());
    }

    public VkDebugUtilsMessengerCallbackDataEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCallbackDataEXT sType$Default() {
        return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT);
    }

    public VkDebugUtilsMessengerCallbackDataEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCallbackDataEXT pNext(VkDeviceAddressBindingCallbackDataEXT value) {
        return pNext(value.pNext(pNext()).address());
    }

    public VkDebugUtilsMessengerCallbackDataEXT flags(@NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCallbackDataEXT pMessageIdName(@NativeType("char const *") ByteBuffer value) {
        npMessageIdName(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCallbackDataEXT messageIdNumber(@NativeType("int32_t") int value) {
        nmessageIdNumber(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCallbackDataEXT pMessage(@NativeType("char const *") ByteBuffer value) {
        npMessage(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCallbackDataEXT pQueueLabels(@NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT.Buffer value) {
        npQueueLabels(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCallbackDataEXT pCmdBufLabels(@NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT.Buffer value) {
        npCmdBufLabels(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCallbackDataEXT pObjects(@NativeType("VkDebugUtilsObjectNameInfoEXT const *") VkDebugUtilsObjectNameInfoEXT.Buffer value) {
        npObjects(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCallbackDataEXT set(int sType, long pNext, int flags, ByteBuffer pMessageIdName, int messageIdNumber, ByteBuffer pMessage, VkDebugUtilsLabelEXT.Buffer pQueueLabels, VkDebugUtilsLabelEXT.Buffer pCmdBufLabels, VkDebugUtilsObjectNameInfoEXT.Buffer pObjects) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        pMessageIdName(pMessageIdName);
        messageIdNumber(messageIdNumber);
        pMessage(pMessage);
        pQueueLabels(pQueueLabels);
        pCmdBufLabels(pCmdBufLabels);
        pObjects(pObjects);
        return this;
    }

    public VkDebugUtilsMessengerCallbackDataEXT set(VkDebugUtilsMessengerCallbackDataEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDebugUtilsMessengerCallbackDataEXT malloc() {
        return new VkDebugUtilsMessengerCallbackDataEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDebugUtilsMessengerCallbackDataEXT calloc() {
        return new VkDebugUtilsMessengerCallbackDataEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDebugUtilsMessengerCallbackDataEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDebugUtilsMessengerCallbackDataEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDebugUtilsMessengerCallbackDataEXT create(long address) {
        return new VkDebugUtilsMessengerCallbackDataEXT(address, null);
    }

    public static VkDebugUtilsMessengerCallbackDataEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDebugUtilsMessengerCallbackDataEXT(address, null);
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

    public static VkDebugUtilsMessengerCallbackDataEXT malloc(MemoryStack stack) {
        return new VkDebugUtilsMessengerCallbackDataEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDebugUtilsMessengerCallbackDataEXT calloc(MemoryStack stack) {
        return new VkDebugUtilsMessengerCallbackDataEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer npMessageIdName(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + PMESSAGEIDNAME));
    }

    public static String npMessageIdNameString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + PMESSAGEIDNAME));
    }

    public static int nmessageIdNumber(long struct) {
        return MemoryUtil.memGetInt(struct + MESSAGEIDNUMBER);
    }

    public static ByteBuffer npMessage(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + PMESSAGE));
    }

    public static String npMessageString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + PMESSAGE));
    }

    public static int nqueueLabelCount(long struct) {
        return MemoryUtil.memGetInt(struct + QUEUELABELCOUNT);
    }

    public static VkDebugUtilsLabelEXT.Buffer npQueueLabels(long struct) {
        return VkDebugUtilsLabelEXT.createSafe(MemoryUtil.memGetAddress(struct + PQUEUELABELS), nqueueLabelCount(struct));
    }

    public static int ncmdBufLabelCount(long struct) {
        return MemoryUtil.memGetInt(struct + CMDBUFLABELCOUNT);
    }

    public static VkDebugUtilsLabelEXT.Buffer npCmdBufLabels(long struct) {
        return VkDebugUtilsLabelEXT.createSafe(MemoryUtil.memGetAddress(struct + PCMDBUFLABELS), ncmdBufLabelCount(struct));
    }

    public static int nobjectCount(long struct) {
        return MemoryUtil.memGetInt(struct + OBJECTCOUNT);
    }

    public static VkDebugUtilsObjectNameInfoEXT.Buffer npObjects(long struct) {
        return VkDebugUtilsObjectNameInfoEXT.createSafe(MemoryUtil.memGetAddress(struct + POBJECTS), nobjectCount(struct));
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

    public static void npMessageIdName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + PMESSAGEIDNAME, MemoryUtil.memAddressSafe(value));
    }

    public static void nmessageIdNumber(long struct, int value) {
        MemoryUtil.memPutInt(struct + MESSAGEIDNUMBER, value);
    }

    public static void npMessage(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + PMESSAGE, MemoryUtil.memAddressSafe(value));
    }

    public static void nqueueLabelCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + QUEUELABELCOUNT, value);
    }

    public static void npQueueLabels(long struct, VkDebugUtilsLabelEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PQUEUELABELS, MemoryUtil.memAddressSafe(value));
        nqueueLabelCount(struct, value == null ? 0 : value.remaining());
    }

    public static void ncmdBufLabelCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + CMDBUFLABELCOUNT, value);
    }

    public static void npCmdBufLabels(long struct, VkDebugUtilsLabelEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + PCMDBUFLABELS, MemoryUtil.memAddressSafe(value));
        ncmdBufLabelCount(struct, value == null ? 0 : value.remaining());
    }

    public static void nobjectCount(long struct, int value) {
        MemoryUtil.memPutInt(struct + OBJECTCOUNT, value);
    }

    public static void npObjects(long struct, VkDebugUtilsObjectNameInfoEXT.Buffer value) {
        MemoryUtil.memPutAddress(struct + POBJECTS, MemoryUtil.memAddressSafe(value));
        nobjectCount(struct, value == null ? 0 : value.remaining());
    }

    public static void validate(long struct) {
        int queueLabelCount = nqueueLabelCount(struct);
        if (queueLabelCount != 0) {
            long pQueueLabels = MemoryUtil.memGetAddress(struct + PQUEUELABELS);
            Checks.check(pQueueLabels);
            validate(pQueueLabels, queueLabelCount, VkDebugUtilsLabelEXT.SIZEOF, VkDebugUtilsLabelEXT::validate);
        }
        int cmdBufLabelCount = ncmdBufLabelCount(struct);
        if (cmdBufLabelCount != 0) {
            long pCmdBufLabels = MemoryUtil.memGetAddress(struct + PCMDBUFLABELS);
            Checks.check(pCmdBufLabels);
            validate(pCmdBufLabels, cmdBufLabelCount, VkDebugUtilsLabelEXT.SIZEOF, VkDebugUtilsLabelEXT::validate);
        }
        if (nobjectCount(struct) != 0) {
            Checks.check(MemoryUtil.memGetAddress(struct + POBJECTS));
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackDataEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCallbackDataEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDebugUtilsMessengerCallbackDataEXT, Buffer> implements NativeResource {
        private static final VkDebugUtilsMessengerCallbackDataEXT ELEMENT_FACTORY = VkDebugUtilsMessengerCallbackDataEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDebugUtilsMessengerCallbackDataEXT.SIZEOF);
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
        public VkDebugUtilsMessengerCallbackDataEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDebugUtilsMessengerCallbackDataEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDebugUtilsMessengerCallbackDataEXT.npNext(address());
        }

        @NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT")
        public int flags() {
            return VkDebugUtilsMessengerCallbackDataEXT.nflags(address());
        }

        @NativeType("char const *")
        public ByteBuffer pMessageIdName() {
            return VkDebugUtilsMessengerCallbackDataEXT.npMessageIdName(address());
        }

        @NativeType("char const *")
        public String pMessageIdNameString() {
            return VkDebugUtilsMessengerCallbackDataEXT.npMessageIdNameString(address());
        }

        @NativeType("int32_t")
        public int messageIdNumber() {
            return VkDebugUtilsMessengerCallbackDataEXT.nmessageIdNumber(address());
        }

        @NativeType("char const *")
        public ByteBuffer pMessage() {
            return VkDebugUtilsMessengerCallbackDataEXT.npMessage(address());
        }

        @NativeType("char const *")
        public String pMessageString() {
            return VkDebugUtilsMessengerCallbackDataEXT.npMessageString(address());
        }

        @NativeType("uint32_t")
        public int queueLabelCount() {
            return VkDebugUtilsMessengerCallbackDataEXT.nqueueLabelCount(address());
        }

        @NativeType("VkDebugUtilsLabelEXT const *")
        public VkDebugUtilsLabelEXT.Buffer pQueueLabels() {
            return VkDebugUtilsMessengerCallbackDataEXT.npQueueLabels(address());
        }

        @NativeType("uint32_t")
        public int cmdBufLabelCount() {
            return VkDebugUtilsMessengerCallbackDataEXT.ncmdBufLabelCount(address());
        }

        @NativeType("VkDebugUtilsLabelEXT const *")
        public VkDebugUtilsLabelEXT.Buffer pCmdBufLabels() {
            return VkDebugUtilsMessengerCallbackDataEXT.npCmdBufLabels(address());
        }

        @NativeType("uint32_t")
        public int objectCount() {
            return VkDebugUtilsMessengerCallbackDataEXT.nobjectCount(address());
        }

        @NativeType("VkDebugUtilsObjectNameInfoEXT const *")
        public VkDebugUtilsObjectNameInfoEXT.Buffer pObjects() {
            return VkDebugUtilsMessengerCallbackDataEXT.npObjects(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDebugUtilsMessengerCallbackDataEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDebugUtilsMessengerCallbackDataEXT.npNext(address(), value);
            return this;
        }

        public Buffer pNext(VkDeviceAddressBindingCallbackDataEXT value) {
            return pNext(value.pNext(pNext()).address());
        }

        public Buffer flags(@NativeType("VkDebugUtilsMessengerCallbackDataFlagsEXT") int value) {
            VkDebugUtilsMessengerCallbackDataEXT.nflags(address(), value);
            return this;
        }

        public Buffer pMessageIdName(@NativeType("char const *") ByteBuffer value) {
            VkDebugUtilsMessengerCallbackDataEXT.npMessageIdName(address(), value);
            return this;
        }

        public Buffer messageIdNumber(@NativeType("int32_t") int value) {
            VkDebugUtilsMessengerCallbackDataEXT.nmessageIdNumber(address(), value);
            return this;
        }

        public Buffer pMessage(@NativeType("char const *") ByteBuffer value) {
            VkDebugUtilsMessengerCallbackDataEXT.npMessage(address(), value);
            return this;
        }

        public Buffer pQueueLabels(@NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT.Buffer value) {
            VkDebugUtilsMessengerCallbackDataEXT.npQueueLabels(address(), value);
            return this;
        }

        public Buffer pCmdBufLabels(@NativeType("VkDebugUtilsLabelEXT const *") VkDebugUtilsLabelEXT.Buffer value) {
            VkDebugUtilsMessengerCallbackDataEXT.npCmdBufLabels(address(), value);
            return this;
        }

        public Buffer pObjects(@NativeType("VkDebugUtilsObjectNameInfoEXT const *") VkDebugUtilsObjectNameInfoEXT.Buffer value) {
            VkDebugUtilsMessengerCallbackDataEXT.npObjects(address(), value);
            return this;
        }
    }
}
