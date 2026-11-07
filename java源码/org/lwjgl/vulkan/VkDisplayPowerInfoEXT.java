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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPowerInfoEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPowerInfoEXT.class */
public class VkDisplayPowerInfoEXT extends Struct<VkDisplayPowerInfoEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int POWERSTATE;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        POWERSTATE = layout.offsetof(2);
    }

    protected VkDisplayPowerInfoEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkDisplayPowerInfoEXT create(long address, ByteBuffer container) {
        return new VkDisplayPowerInfoEXT(address, container);
    }

    public VkDisplayPowerInfoEXT(ByteBuffer container) {
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

    @NativeType("VkDisplayPowerStateEXT")
    public int powerState() {
        return npowerState(address());
    }

    public VkDisplayPowerInfoEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkDisplayPowerInfoEXT sType$Default() {
        return sType(EXTDisplayControl.VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT);
    }

    public VkDisplayPowerInfoEXT pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkDisplayPowerInfoEXT powerState(@NativeType("VkDisplayPowerStateEXT") int value) {
        npowerState(address(), value);
        return this;
    }

    public VkDisplayPowerInfoEXT set(int sType, long pNext, int powerState) {
        sType(sType);
        pNext(pNext);
        powerState(powerState);
        return this;
    }

    public VkDisplayPowerInfoEXT set(VkDisplayPowerInfoEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkDisplayPowerInfoEXT malloc() {
        return new VkDisplayPowerInfoEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkDisplayPowerInfoEXT calloc() {
        return new VkDisplayPowerInfoEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkDisplayPowerInfoEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkDisplayPowerInfoEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkDisplayPowerInfoEXT create(long address) {
        return new VkDisplayPowerInfoEXT(address, null);
    }

    public static VkDisplayPowerInfoEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkDisplayPowerInfoEXT(address, null);
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

    public static VkDisplayPowerInfoEXT malloc(MemoryStack stack) {
        return new VkDisplayPowerInfoEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkDisplayPowerInfoEXT calloc(MemoryStack stack) {
        return new VkDisplayPowerInfoEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int npowerState(long struct) {
        return MemoryUtil.memGetInt(struct + POWERSTATE);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npowerState(long struct, int value) {
        MemoryUtil.memPutInt(struct + POWERSTATE, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPowerInfoEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkDisplayPowerInfoEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkDisplayPowerInfoEXT, Buffer> implements NativeResource {
        private static final VkDisplayPowerInfoEXT ELEMENT_FACTORY = VkDisplayPowerInfoEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkDisplayPowerInfoEXT.SIZEOF);
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
        public VkDisplayPowerInfoEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkDisplayPowerInfoEXT.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkDisplayPowerInfoEXT.npNext(address());
        }

        @NativeType("VkDisplayPowerStateEXT")
        public int powerState() {
            return VkDisplayPowerInfoEXT.npowerState(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkDisplayPowerInfoEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTDisplayControl.VK_STRUCTURE_TYPE_DISPLAY_POWER_INFO_EXT);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkDisplayPowerInfoEXT.npNext(address(), value);
            return this;
        }

        public Buffer powerState(@NativeType("VkDisplayPowerStateEXT") int value) {
            VkDisplayPowerInfoEXT.npowerState(address(), value);
            return this;
        }
    }
}
