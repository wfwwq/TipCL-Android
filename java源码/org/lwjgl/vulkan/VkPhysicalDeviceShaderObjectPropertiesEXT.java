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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderObjectPropertiesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderObjectPropertiesEXT.class */
public class VkPhysicalDeviceShaderObjectPropertiesEXT extends Struct<VkPhysicalDeviceShaderObjectPropertiesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int SHADERBINARYUUID;
    public static final int SHADERBINARYVERSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __array(1, 16), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SHADERBINARYUUID = layout.offsetof(2);
        SHADERBINARYVERSION = layout.offsetof(3);
    }

    protected VkPhysicalDeviceShaderObjectPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDeviceShaderObjectPropertiesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(address, container);
    }

    public VkPhysicalDeviceShaderObjectPropertiesEXT(ByteBuffer container) {
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

    @NativeType("void *")
    public long pNext() {
        return npNext(address());
    }

    @NativeType("uint8_t[VK_UUID_SIZE]")
    public ByteBuffer shaderBinaryUUID() {
        return nshaderBinaryUUID(address());
    }

    @NativeType("uint8_t")
    public byte shaderBinaryUUID(int index) {
        return nshaderBinaryUUID(address(), index);
    }

    @NativeType("uint32_t")
    public int shaderBinaryVersion() {
        return nshaderBinaryVersion(address());
    }

    public VkPhysicalDeviceShaderObjectPropertiesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderObjectPropertiesEXT sType$Default() {
        return sType(EXTShaderObject.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT);
    }

    public VkPhysicalDeviceShaderObjectPropertiesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDeviceShaderObjectPropertiesEXT set(int sType, long pNext) {
        sType(sType);
        pNext(pNext);
        return this;
    }

    public VkPhysicalDeviceShaderObjectPropertiesEXT set(VkPhysicalDeviceShaderObjectPropertiesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDeviceShaderObjectPropertiesEXT malloc() {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderObjectPropertiesEXT calloc() {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderObjectPropertiesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDeviceShaderObjectPropertiesEXT create(long address) {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(address, null);
    }

    public static VkPhysicalDeviceShaderObjectPropertiesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(address, null);
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

    public static VkPhysicalDeviceShaderObjectPropertiesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDeviceShaderObjectPropertiesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDeviceShaderObjectPropertiesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer nshaderBinaryUUID(long struct) {
        return MemoryUtil.memByteBuffer(struct + SHADERBINARYUUID, 16);
    }

    public static byte nshaderBinaryUUID(long struct, int index) {
        return MemoryUtil.memGetByte(struct + SHADERBINARYUUID + (Checks.check(index, 16) * 1));
    }

    public static int nshaderBinaryVersion(long struct) {
        return MemoryUtil.memGetInt(struct + SHADERBINARYVERSION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderObjectPropertiesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDeviceShaderObjectPropertiesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceShaderObjectPropertiesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDeviceShaderObjectPropertiesEXT ELEMENT_FACTORY = VkPhysicalDeviceShaderObjectPropertiesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDeviceShaderObjectPropertiesEXT.SIZEOF);
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
        public VkPhysicalDeviceShaderObjectPropertiesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDeviceShaderObjectPropertiesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDeviceShaderObjectPropertiesEXT.npNext(address());
        }

        @NativeType("uint8_t[VK_UUID_SIZE]")
        public ByteBuffer shaderBinaryUUID() {
            return VkPhysicalDeviceShaderObjectPropertiesEXT.nshaderBinaryUUID(address());
        }

        @NativeType("uint8_t")
        public byte shaderBinaryUUID(int index) {
            return VkPhysicalDeviceShaderObjectPropertiesEXT.nshaderBinaryUUID(address(), index);
        }

        @NativeType("uint32_t")
        public int shaderBinaryVersion() {
            return VkPhysicalDeviceShaderObjectPropertiesEXT.nshaderBinaryVersion(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDeviceShaderObjectPropertiesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(EXTShaderObject.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_OBJECT_PROPERTIES_EXT);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDeviceShaderObjectPropertiesEXT.npNext(address(), value);
            return this;
        }
    }
}
