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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCompilerControlCreateInfoAMD.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCompilerControlCreateInfoAMD.class */
public class VkPipelineCompilerControlCreateInfoAMD extends Struct<VkPipelineCompilerControlCreateInfoAMD> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int COMPILERCONTROLFLAGS;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        COMPILERCONTROLFLAGS = layout.offsetof(2);
    }

    protected VkPipelineCompilerControlCreateInfoAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkPipelineCompilerControlCreateInfoAMD create(long address, ByteBuffer container) {
        return new VkPipelineCompilerControlCreateInfoAMD(address, container);
    }

    public VkPipelineCompilerControlCreateInfoAMD(ByteBuffer container) {
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

    @NativeType("VkPipelineCompilerControlFlagsAMD")
    public int compilerControlFlags() {
        return ncompilerControlFlags(address());
    }

    public VkPipelineCompilerControlCreateInfoAMD sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkPipelineCompilerControlCreateInfoAMD sType$Default() {
        return sType(AMDPipelineCompilerControl.VK_STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD);
    }

    public VkPipelineCompilerControlCreateInfoAMD pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkPipelineCompilerControlCreateInfoAMD compilerControlFlags(@NativeType("VkPipelineCompilerControlFlagsAMD") int value) {
        ncompilerControlFlags(address(), value);
        return this;
    }

    public VkPipelineCompilerControlCreateInfoAMD set(int sType, long pNext, int compilerControlFlags) {
        sType(sType);
        pNext(pNext);
        compilerControlFlags(compilerControlFlags);
        return this;
    }

    public VkPipelineCompilerControlCreateInfoAMD set(VkPipelineCompilerControlCreateInfoAMD src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkPipelineCompilerControlCreateInfoAMD malloc() {
        return new VkPipelineCompilerControlCreateInfoAMD(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkPipelineCompilerControlCreateInfoAMD calloc() {
        return new VkPipelineCompilerControlCreateInfoAMD(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkPipelineCompilerControlCreateInfoAMD create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPipelineCompilerControlCreateInfoAMD(MemoryUtil.memAddress(container), container);
    }

    public static VkPipelineCompilerControlCreateInfoAMD create(long address) {
        return new VkPipelineCompilerControlCreateInfoAMD(address, null);
    }

    public static VkPipelineCompilerControlCreateInfoAMD createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkPipelineCompilerControlCreateInfoAMD(address, null);
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

    public static VkPipelineCompilerControlCreateInfoAMD malloc(MemoryStack stack) {
        return new VkPipelineCompilerControlCreateInfoAMD(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkPipelineCompilerControlCreateInfoAMD calloc(MemoryStack stack) {
        return new VkPipelineCompilerControlCreateInfoAMD(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static int ncompilerControlFlags(long struct) {
        return MemoryUtil.memGetInt(struct + COMPILERCONTROLFLAGS);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void ncompilerControlFlags(long struct, int value) {
        MemoryUtil.memPutInt(struct + COMPILERCONTROLFLAGS, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCompilerControlCreateInfoAMD$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkPipelineCompilerControlCreateInfoAMD$Buffer.class */
    public static class Buffer extends StructBuffer<VkPipelineCompilerControlCreateInfoAMD, Buffer> implements NativeResource {
        private static final VkPipelineCompilerControlCreateInfoAMD ELEMENT_FACTORY = VkPipelineCompilerControlCreateInfoAMD.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkPipelineCompilerControlCreateInfoAMD.SIZEOF);
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
        public VkPipelineCompilerControlCreateInfoAMD getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkPipelineCompilerControlCreateInfoAMD.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkPipelineCompilerControlCreateInfoAMD.npNext(address());
        }

        @NativeType("VkPipelineCompilerControlFlagsAMD")
        public int compilerControlFlags() {
            return VkPipelineCompilerControlCreateInfoAMD.ncompilerControlFlags(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkPipelineCompilerControlCreateInfoAMD.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(AMDPipelineCompilerControl.VK_STRUCTURE_TYPE_PIPELINE_COMPILER_CONTROL_CREATE_INFO_AMD);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkPipelineCompilerControlCreateInfoAMD.npNext(address(), value);
            return this;
        }

        public Buffer compilerControlFlags(@NativeType("VkPipelineCompilerControlFlagsAMD") int value) {
            VkPipelineCompilerControlCreateInfoAMD.ncompilerControlFlags(address(), value);
            return this;
        }
    }
}
