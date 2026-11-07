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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCreateInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCreateInfoEXT.class */
public class VkDebugUtilsMessengerCreateInfoEXT extends Struct<VkDebugUtilsMessengerCreateInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int MESSAGESEVERITY;
    public static final int MESSAGETYPE;
    public static final int PFNUSERCALLBACK;
    public static final int PUSERDATA;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        MESSAGESEVERITY = layout.offsetof(3);
        MESSAGETYPE = layout.offsetof(4);
        PFNUSERCALLBACK = layout.offsetof(5);
        PUSERDATA = layout.offsetof(6);
    }

    protected VkDebugUtilsMessengerCreateInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDebugUtilsMessengerCreateInfoEXT create(long address, ByteBuffer container) {
        return new VkDebugUtilsMessengerCreateInfoEXT(address, container);
    }

    public VkDebugUtilsMessengerCreateInfoEXT(ByteBuffer container) {
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

    @NativeType("VkDebugUtilsMessengerCreateFlagsEXT")
    public int flags() {
        return nflags(address());
    }

    @NativeType("VkDebugUtilsMessageSeverityFlagsEXT")
    public int messageSeverity() {
        return nmessageSeverity(address());
    }

    @NativeType("VkDebugUtilsMessageTypeFlagsEXT")
    public int messageType() {
        return nmessageType(address());
    }

    @NativeType("PFN_vkDebugUtilsMessengerCallbackEXT")
    public VkDebugUtilsMessengerCallbackEXT pfnUserCallback() {
        return npfnUserCallback(address());
    }

    @NativeType("void *")
    public long pUserData() {
        return npUserData(address());
    }

    public VkDebugUtilsMessengerCreateInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCreateInfoEXT sType$Default() {
        return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT);
    }

    public VkDebugUtilsMessengerCreateInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCreateInfoEXT flags(@NativeType("VkDebugUtilsMessengerCreateFlagsEXT") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCreateInfoEXT messageSeverity(@NativeType("VkDebugUtilsMessageSeverityFlagsEXT") int value) {
        nmessageSeverity(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCreateInfoEXT messageType(@NativeType("VkDebugUtilsMessageTypeFlagsEXT") int value) {
        nmessageType(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCreateInfoEXT pfnUserCallback(@NativeType("PFN_vkDebugUtilsMessengerCallbackEXT") VkDebugUtilsMessengerCallbackEXTI value) {
        npfnUserCallback(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCreateInfoEXT pUserData(@NativeType("void *") long value) {
        npUserData(address(), value);
        return this;
    }

    public VkDebugUtilsMessengerCreateInfoEXT set(int sType, long pNext, int flags, int messageSeverity, int messageType, VkDebugUtilsMessengerCallbackEXTI pfnUserCallback, long pUserData) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        messageSeverity(messageSeverity);
        messageType(messageType);
        pfnUserCallback(pfnUserCallback);
        pUserData(pUserData);
        return this;
    }

    public VkDebugUtilsMessengerCreateInfoEXT set(VkDebugUtilsMessengerCreateInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDebugUtilsMessengerCreateInfoEXT malloc() {
        return new VkDebugUtilsMessengerCreateInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDebugUtilsMessengerCreateInfoEXT calloc() {
        return new VkDebugUtilsMessengerCreateInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDebugUtilsMessengerCreateInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDebugUtilsMessengerCreateInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDebugUtilsMessengerCreateInfoEXT create(long address) {
        return new VkDebugUtilsMessengerCreateInfoEXT(address, null);
    }

    public static VkDebugUtilsMessengerCreateInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDebugUtilsMessengerCreateInfoEXT(address, null);
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

    public static VkDebugUtilsMessengerCreateInfoEXT malloc(MemoryStack stack) {
        return new VkDebugUtilsMessengerCreateInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDebugUtilsMessengerCreateInfoEXT calloc(MemoryStack stack) {
        return new VkDebugUtilsMessengerCreateInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nmessageSeverity(long struct) {
        return MemoryUtil.memGetInt(struct + MESSAGESEVERITY);
    }

    public static int nmessageType(long struct) {
        return MemoryUtil.memGetInt(struct + MESSAGETYPE);
    }

    public static VkDebugUtilsMessengerCallbackEXT npfnUserCallback(long struct) {
        return VkDebugUtilsMessengerCallbackEXT.create(MemoryUtil.memGetAddress(struct + PFNUSERCALLBACK));
    }

    public static long npUserData(long struct) {
        return MemoryUtil.memGetAddress(struct + PUSERDATA);
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

    public static void nmessageSeverity(long struct, int value) {
        MemoryUtil.memPutInt(struct + MESSAGESEVERITY, value);
    }

    public static void nmessageType(long struct, int value) {
        MemoryUtil.memPutInt(struct + MESSAGETYPE, value);
    }

    public static void npfnUserCallback(long struct, VkDebugUtilsMessengerCallbackEXTI value) {
        MemoryUtil.memPutAddress(struct + PFNUSERCALLBACK, value.address());
    }

    public static void npUserData(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PUSERDATA, value);
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PFNUSERCALLBACK));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCreateInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDebugUtilsMessengerCreateInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDebugUtilsMessengerCreateInfoEXT, Buffer> implements NativeResource {
        private static final VkDebugUtilsMessengerCreateInfoEXT ELEMENT_FACTORY = VkDebugUtilsMessengerCreateInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDebugUtilsMessengerCreateInfoEXT.SIZEOF);
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
        public VkDebugUtilsMessengerCreateInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDebugUtilsMessengerCreateInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDebugUtilsMessengerCreateInfoEXT.npNext(address());
        }

        @NativeType("VkDebugUtilsMessengerCreateFlagsEXT")
        public int flags() {
            return VkDebugUtilsMessengerCreateInfoEXT.nflags(address());
        }

        @NativeType("VkDebugUtilsMessageSeverityFlagsEXT")
        public int messageSeverity() {
            return VkDebugUtilsMessengerCreateInfoEXT.nmessageSeverity(address());
        }

        @NativeType("VkDebugUtilsMessageTypeFlagsEXT")
        public int messageType() {
            return VkDebugUtilsMessengerCreateInfoEXT.nmessageType(address());
        }

        @NativeType("PFN_vkDebugUtilsMessengerCallbackEXT")
        public VkDebugUtilsMessengerCallbackEXT pfnUserCallback() {
            return VkDebugUtilsMessengerCreateInfoEXT.npfnUserCallback(address());
        }

        @NativeType("void *")
        public long pUserData() {
            return VkDebugUtilsMessengerCreateInfoEXT.npUserData(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDebugUtilsMessengerCreateInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDebugUtils.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDebugUtilsMessengerCreateInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkDebugUtilsMessengerCreateFlagsEXT") int value) {
            VkDebugUtilsMessengerCreateInfoEXT.nflags(address(), value);
            return this;
        }

        public Buffer messageSeverity(@NativeType("VkDebugUtilsMessageSeverityFlagsEXT") int value) {
            VkDebugUtilsMessengerCreateInfoEXT.nmessageSeverity(address(), value);
            return this;
        }

        public Buffer messageType(@NativeType("VkDebugUtilsMessageTypeFlagsEXT") int value) {
            VkDebugUtilsMessengerCreateInfoEXT.nmessageType(address(), value);
            return this;
        }

        public Buffer pfnUserCallback(@NativeType("PFN_vkDebugUtilsMessengerCallbackEXT") VkDebugUtilsMessengerCallbackEXTI value) {
            VkDebugUtilsMessengerCreateInfoEXT.npfnUserCallback(address(), value);
            return this;
        }

        public Buffer pUserData(@NativeType("void *") long value) {
            VkDebugUtilsMessengerCreateInfoEXT.npUserData(address(), value);
            return this;
        }
    }
}
