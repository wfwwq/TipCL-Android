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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceBufferMemoryRequirements.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceBufferMemoryRequirements.class */
public class VkDeviceBufferMemoryRequirements extends Struct<VkDeviceBufferMemoryRequirements> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PCREATEINFO;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PCREATEINFO = layout.offsetof(2);
    }

    protected VkDeviceBufferMemoryRequirements(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDeviceBufferMemoryRequirements create(long address, ByteBuffer container) {
        return new VkDeviceBufferMemoryRequirements(address, container);
    }

    public VkDeviceBufferMemoryRequirements(ByteBuffer container) {
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

    @NativeType("VkBufferCreateInfo const *")
    public VkBufferCreateInfo pCreateInfo() {
        return npCreateInfo(address());
    }

    public VkDeviceBufferMemoryRequirements sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDeviceBufferMemoryRequirements sType$Default() {
        return sType(1000413002);
    }

    public VkDeviceBufferMemoryRequirements pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDeviceBufferMemoryRequirements pCreateInfo(@NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo value) {
        npCreateInfo(address(), value);
        return this;
    }

    public VkDeviceBufferMemoryRequirements set(int sType, long pNext, VkBufferCreateInfo pCreateInfo) {
        sType(sType);
        pNext(pNext);
        pCreateInfo(pCreateInfo);
        return this;
    }

    public VkDeviceBufferMemoryRequirements set(VkDeviceBufferMemoryRequirements src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDeviceBufferMemoryRequirements malloc() {
        return new VkDeviceBufferMemoryRequirements(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDeviceBufferMemoryRequirements calloc() {
        return new VkDeviceBufferMemoryRequirements(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDeviceBufferMemoryRequirements create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDeviceBufferMemoryRequirements(MemoryUtil.memAddress(container), container);
    }

    public static VkDeviceBufferMemoryRequirements create(long address) {
        return new VkDeviceBufferMemoryRequirements(address, null);
    }

    public static VkDeviceBufferMemoryRequirements createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDeviceBufferMemoryRequirements(address, null);
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

    public static VkDeviceBufferMemoryRequirements malloc(MemoryStack stack) {
        return new VkDeviceBufferMemoryRequirements(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDeviceBufferMemoryRequirements calloc(MemoryStack stack) {
        return new VkDeviceBufferMemoryRequirements(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static VkBufferCreateInfo npCreateInfo(long struct) {
        return VkBufferCreateInfo.create(MemoryUtil.memGetAddress(struct + PCREATEINFO));
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npCreateInfo(long struct, VkBufferCreateInfo value) {
        MemoryUtil.memPutAddress(struct + PCREATEINFO, value.address());
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + PCREATEINFO));
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceBufferMemoryRequirements$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDeviceBufferMemoryRequirements$Buffer.class */
    public static class Buffer extends StructBuffer<VkDeviceBufferMemoryRequirements, Buffer> implements NativeResource {
        private static final VkDeviceBufferMemoryRequirements ELEMENT_FACTORY = VkDeviceBufferMemoryRequirements.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDeviceBufferMemoryRequirements.SIZEOF);
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
        public VkDeviceBufferMemoryRequirements getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDeviceBufferMemoryRequirements.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDeviceBufferMemoryRequirements.npNext(address());
        }

        @NativeType("VkBufferCreateInfo const *")
        public VkBufferCreateInfo pCreateInfo() {
            return VkDeviceBufferMemoryRequirements.npCreateInfo(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDeviceBufferMemoryRequirements.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000413002);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDeviceBufferMemoryRequirements.npNext(address(), value);
            return this;
        }

        public Buffer pCreateInfo(@NativeType("VkBufferCreateInfo const *") VkBufferCreateInfo value) {
            VkDeviceBufferMemoryRequirements.npCreateInfo(address(), value);
            return this;
        }
    }
}
