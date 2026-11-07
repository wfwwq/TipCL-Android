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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayModeCreateInfoKHR.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayModeCreateInfoKHR.class */
public class VkDisplayModeCreateInfoKHR extends Struct<VkDisplayModeCreateInfoKHR> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FLAGS;
    public static final int PARAMETERS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(VkDisplayModeParametersKHR.SIZEOF, VkDisplayModeParametersKHR.ALIGNOF));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        PARAMETERS = layout.offsetof(3);
    }

    protected VkDisplayModeCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDisplayModeCreateInfoKHR create(long address, ByteBuffer container) {
        return new VkDisplayModeCreateInfoKHR(address, container);
    }

    public VkDisplayModeCreateInfoKHR(ByteBuffer container) {
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

    @NativeType("VkDisplayModeCreateFlagsKHR")
    public int flags() {
        return nflags(address());
    }

    public VkDisplayModeParametersKHR parameters() {
        return nparameters(address());
    }

    public VkDisplayModeCreateInfoKHR sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDisplayModeCreateInfoKHR sType$Default() {
        return sType(1000002000);
    }

    public VkDisplayModeCreateInfoKHR pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDisplayModeCreateInfoKHR flags(@NativeType("VkDisplayModeCreateFlagsKHR") int value) {
        nflags(address(), value);
        return this;
    }

    public VkDisplayModeCreateInfoKHR parameters(VkDisplayModeParametersKHR value) {
        nparameters(address(), value);
        return this;
    }

    public VkDisplayModeCreateInfoKHR parameters(Consumer<VkDisplayModeParametersKHR> consumer) {
        consumer.accept(parameters());
        return this;
    }

    public VkDisplayModeCreateInfoKHR set(int sType, long pNext, int flags, VkDisplayModeParametersKHR parameters) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        parameters(parameters);
        return this;
    }

    public VkDisplayModeCreateInfoKHR set(VkDisplayModeCreateInfoKHR src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDisplayModeCreateInfoKHR malloc() {
        return new VkDisplayModeCreateInfoKHR(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDisplayModeCreateInfoKHR calloc() {
        return new VkDisplayModeCreateInfoKHR(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDisplayModeCreateInfoKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayModeCreateInfoKHR(MemoryUtil.memAddress(container), container);
    }

    public static VkDisplayModeCreateInfoKHR create(long address) {
        return new VkDisplayModeCreateInfoKHR(address, null);
    }

    public static VkDisplayModeCreateInfoKHR createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDisplayModeCreateInfoKHR(address, null);
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

    public static VkDisplayModeCreateInfoKHR malloc(MemoryStack stack) {
        return new VkDisplayModeCreateInfoKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDisplayModeCreateInfoKHR calloc(MemoryStack stack) {
        return new VkDisplayModeCreateInfoKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkDisplayModeParametersKHR nparameters(long struct) {
        return VkDisplayModeParametersKHR.create(struct + PARAMETERS);
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

    public static void nparameters(long struct, VkDisplayModeParametersKHR value) {
        MemoryUtil.memCopy(value.address(), struct + PARAMETERS, VkDisplayModeParametersKHR.SIZEOF);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayModeCreateInfoKHR$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayModeCreateInfoKHR$Buffer.class */
    public static class Buffer extends StructBuffer<VkDisplayModeCreateInfoKHR, Buffer> implements NativeResource {
        private static final VkDisplayModeCreateInfoKHR ELEMENT_FACTORY = VkDisplayModeCreateInfoKHR.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDisplayModeCreateInfoKHR.SIZEOF);
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
        public VkDisplayModeCreateInfoKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDisplayModeCreateInfoKHR.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDisplayModeCreateInfoKHR.npNext(address());
        }

        @NativeType("VkDisplayModeCreateFlagsKHR")
        public int flags() {
            return VkDisplayModeCreateInfoKHR.nflags(address());
        }

        public VkDisplayModeParametersKHR parameters() {
            return VkDisplayModeCreateInfoKHR.nparameters(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDisplayModeCreateInfoKHR.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000002000);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDisplayModeCreateInfoKHR.npNext(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("VkDisplayModeCreateFlagsKHR") int value) {
            VkDisplayModeCreateInfoKHR.nflags(address(), value);
            return this;
        }

        public Buffer parameters(VkDisplayModeParametersKHR value) {
            VkDisplayModeCreateInfoKHR.nparameters(address(), value);
            return this;
        }

        public Buffer parameters(Consumer<VkDisplayModeParametersKHR> consumer) {
            consumer.accept(parameters());
            return this;
        }
    }
}
