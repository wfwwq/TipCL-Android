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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice4444FormatsFeaturesEXT.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice4444FormatsFeaturesEXT.class */
public class VkPhysicalDevice4444FormatsFeaturesEXT extends Struct<VkPhysicalDevice4444FormatsFeaturesEXT> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int FORMATA4R4G4B4;
    public static final int FORMATA4B4G4R4;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMATA4R4G4B4 = layout.offsetof(2);
        FORMATA4B4G4R4 = layout.offsetof(3);
    }

    protected VkPhysicalDevice4444FormatsFeaturesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPhysicalDevice4444FormatsFeaturesEXT create(long address, ByteBuffer container) {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(address, container);
    }

    public VkPhysicalDevice4444FormatsFeaturesEXT(ByteBuffer container) {
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

    @NativeType("VkBool32")
    public boolean formatA4R4G4B4() {
        return nformatA4R4G4B4(address()) != 0;
    }

    @NativeType("VkBool32")
    public boolean formatA4B4G4R4() {
        return nformatA4B4G4R4(address()) != 0;
    }

    public VkPhysicalDevice4444FormatsFeaturesEXT sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPhysicalDevice4444FormatsFeaturesEXT sType$Default() {
        return sType(1000340000);
    }

    public VkPhysicalDevice4444FormatsFeaturesEXT pNext(@NativeType("void *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4R4G4B4(@NativeType("VkBool32") boolean value) {
        nformatA4R4G4B4(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevice4444FormatsFeaturesEXT formatA4B4G4R4(@NativeType("VkBool32") boolean value) {
        nformatA4B4G4R4(address(), value ? 1 : 0);
        return this;
    }

    public VkPhysicalDevice4444FormatsFeaturesEXT set(int sType, long pNext, boolean formatA4R4G4B4, boolean formatA4B4G4R4) {
        sType(sType);
        pNext(pNext);
        formatA4R4G4B4(formatA4R4G4B4);
        formatA4B4G4R4(formatA4B4G4R4);
        return this;
    }

    public VkPhysicalDevice4444FormatsFeaturesEXT set(VkPhysicalDevice4444FormatsFeaturesEXT src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPhysicalDevice4444FormatsFeaturesEXT malloc() {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPhysicalDevice4444FormatsFeaturesEXT calloc() {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPhysicalDevice4444FormatsFeaturesEXT create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDevice4444FormatsFeaturesEXT(MemoryUtil.memAddress(container), container);
    }

    public static VkPhysicalDevice4444FormatsFeaturesEXT create(long address) {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(address, null);
    }

    public static VkPhysicalDevice4444FormatsFeaturesEXT createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPhysicalDevice4444FormatsFeaturesEXT(address, null);
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

    public static VkPhysicalDevice4444FormatsFeaturesEXT malloc(MemoryStack stack) {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPhysicalDevice4444FormatsFeaturesEXT calloc(MemoryStack stack) {
        return new VkPhysicalDevice4444FormatsFeaturesEXT(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int nformatA4R4G4B4(long struct) {
        return MemoryUtil.memGetInt(struct + FORMATA4R4G4B4);
    }

    public static int nformatA4B4G4R4(long struct) {
        return MemoryUtil.memGetInt(struct + FORMATA4B4G4R4);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void nformatA4R4G4B4(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMATA4R4G4B4, value);
    }

    public static void nformatA4B4G4R4(long struct, int value) {
        MemoryUtil.memPutInt(struct + FORMATA4B4G4R4, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice4444FormatsFeaturesEXT$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPhysicalDevice4444FormatsFeaturesEXT$Buffer.class */
    public static class Buffer extends StructBuffer<VkPhysicalDevice4444FormatsFeaturesEXT, Buffer> implements NativeResource {
        private static final VkPhysicalDevice4444FormatsFeaturesEXT ELEMENT_FACTORY = VkPhysicalDevice4444FormatsFeaturesEXT.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPhysicalDevice4444FormatsFeaturesEXT.SIZEOF);
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
        public VkPhysicalDevice4444FormatsFeaturesEXT getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPhysicalDevice4444FormatsFeaturesEXT.nsType(address());
        }

        @NativeType("void *")
        public long pNext() {
            return VkPhysicalDevice4444FormatsFeaturesEXT.npNext(address());
        }

        @NativeType("VkBool32")
        public boolean formatA4R4G4B4() {
            return VkPhysicalDevice4444FormatsFeaturesEXT.nformatA4R4G4B4(address()) != 0;
        }

        @NativeType("VkBool32")
        public boolean formatA4B4G4R4() {
            return VkPhysicalDevice4444FormatsFeaturesEXT.nformatA4B4G4R4(address()) != 0;
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPhysicalDevice4444FormatsFeaturesEXT.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(1000340000);
        }

        public Buffer pNext(@NativeType("void *") long value) {
            VkPhysicalDevice4444FormatsFeaturesEXT.npNext(address(), value);
            return this;
        }

        public Buffer formatA4R4G4B4(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevice4444FormatsFeaturesEXT.nformatA4R4G4B4(address(), value ? 1 : 0);
            return this;
        }

        public Buffer formatA4B4G4R4(@NativeType("VkBool32") boolean value) {
            VkPhysicalDevice4444FormatsFeaturesEXT.nformatA4B4G4R4(address(), value ? 1 : 0);
            return this;
        }
    }
}
