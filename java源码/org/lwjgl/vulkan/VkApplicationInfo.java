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
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkApplicationInfo.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkApplicationInfo.class */
public class VkApplicationInfo extends Struct<VkApplicationInfo> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int STYPE;
    public static final int PNEXT;
    public static final int PAPPLICATIONNAME;
    public static final int APPLICATIONVERSION;
    public static final int PENGINENAME;
    public static final int ENGINEVERSION;
    public static final int APIVERSION;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(4));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PAPPLICATIONNAME = layout.offsetof(2);
        APPLICATIONVERSION = layout.offsetof(3);
        PENGINENAME = layout.offsetof(4);
        ENGINEVERSION = layout.offsetof(5);
        APIVERSION = layout.offsetof(6);
    }

    protected VkApplicationInfo(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public VkApplicationInfo create(long address, ByteBuffer container) {
        return new VkApplicationInfo(address, container);
    }

    public VkApplicationInfo(ByteBuffer container) {
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

    @NativeType("char const *")
    public ByteBuffer pApplicationName() {
        return npApplicationName(address());
    }

    @NativeType("char const *")
    public String pApplicationNameString() {
        return npApplicationNameString(address());
    }

    @NativeType("uint32_t")
    public int applicationVersion() {
        return napplicationVersion(address());
    }

    @NativeType("char const *")
    public ByteBuffer pEngineName() {
        return npEngineName(address());
    }

    @NativeType("char const *")
    public String pEngineNameString() {
        return npEngineNameString(address());
    }

    @NativeType("uint32_t")
    public int engineVersion() {
        return nengineVersion(address());
    }

    @NativeType("uint32_t")
    public int apiVersion() {
        return napiVersion(address());
    }

    public VkApplicationInfo sType(@NativeType("VkStructureType") int value) {
        nsType(address(), value);
        return this;
    }

    public VkApplicationInfo sType$Default() {
        return sType(0);
    }

    public VkApplicationInfo pNext(@NativeType("void const *") long value) {
        npNext(address(), value);
        return this;
    }

    public VkApplicationInfo pApplicationName(@NativeType("char const *") ByteBuffer value) {
        npApplicationName(address(), value);
        return this;
    }

    public VkApplicationInfo applicationVersion(@NativeType("uint32_t") int value) {
        napplicationVersion(address(), value);
        return this;
    }

    public VkApplicationInfo pEngineName(@NativeType("char const *") ByteBuffer value) {
        npEngineName(address(), value);
        return this;
    }

    public VkApplicationInfo engineVersion(@NativeType("uint32_t") int value) {
        nengineVersion(address(), value);
        return this;
    }

    public VkApplicationInfo apiVersion(@NativeType("uint32_t") int value) {
        napiVersion(address(), value);
        return this;
    }

    public VkApplicationInfo set(int sType, long pNext, ByteBuffer pApplicationName, int applicationVersion, ByteBuffer pEngineName, int engineVersion, int apiVersion) {
        sType(sType);
        pNext(pNext);
        pApplicationName(pApplicationName);
        applicationVersion(applicationVersion);
        pEngineName(pEngineName);
        engineVersion(engineVersion);
        apiVersion(apiVersion);
        return this;
    }

    public VkApplicationInfo set(VkApplicationInfo src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static VkApplicationInfo malloc() {
        return new VkApplicationInfo(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static VkApplicationInfo calloc() {
        return new VkApplicationInfo(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static VkApplicationInfo create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkApplicationInfo(MemoryUtil.memAddress(container), container);
    }

    public static VkApplicationInfo create(long address) {
        return new VkApplicationInfo(address, null);
    }

    public static VkApplicationInfo createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new VkApplicationInfo(address, null);
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

    public static VkApplicationInfo malloc(MemoryStack stack) {
        return new VkApplicationInfo(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static VkApplicationInfo calloc(MemoryStack stack) {
        return new VkApplicationInfo(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
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

    public static ByteBuffer npApplicationName(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + PAPPLICATIONNAME));
    }

    public static String npApplicationNameString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + PAPPLICATIONNAME));
    }

    public static int napplicationVersion(long struct) {
        return MemoryUtil.memGetInt(struct + APPLICATIONVERSION);
    }

    public static ByteBuffer npEngineName(long struct) {
        return MemoryUtil.memByteBufferNT1Safe(MemoryUtil.memGetAddress(struct + PENGINENAME));
    }

    public static String npEngineNameString(long struct) {
        return MemoryUtil.memUTF8Safe(MemoryUtil.memGetAddress(struct + PENGINENAME));
    }

    public static int nengineVersion(long struct) {
        return MemoryUtil.memGetInt(struct + ENGINEVERSION);
    }

    public static int napiVersion(long struct) {
        return MemoryUtil.memGetInt(struct + APIVERSION);
    }

    public static void nsType(long struct, int value) {
        MemoryUtil.memPutInt(struct + STYPE, value);
    }

    public static void npNext(long struct, long value) {
        MemoryUtil.memPutAddress(struct + PNEXT, value);
    }

    public static void npApplicationName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + PAPPLICATIONNAME, MemoryUtil.memAddressSafe(value));
    }

    public static void napplicationVersion(long struct, int value) {
        MemoryUtil.memPutInt(struct + APPLICATIONVERSION, value);
    }

    public static void npEngineName(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(value);
        }
        MemoryUtil.memPutAddress(struct + PENGINENAME, MemoryUtil.memAddressSafe(value));
    }

    public static void nengineVersion(long struct, int value) {
        MemoryUtil.memPutInt(struct + ENGINEVERSION, value);
    }

    public static void napiVersion(long struct, int value) {
        MemoryUtil.memPutInt(struct + APIVERSION, value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkApplicationInfo$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-vulkan.jar:org/lwjgl/vulkan/VkApplicationInfo$Buffer.class */
    public static class Buffer extends StructBuffer<VkApplicationInfo, Buffer> implements NativeResource {
        private static final VkApplicationInfo ELEMENT_FACTORY = VkApplicationInfo.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / VkApplicationInfo.SIZEOF);
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
        public VkApplicationInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("VkStructureType")
        public int sType() {
            return VkApplicationInfo.nsType(address());
        }

        @NativeType("void const *")
        public long pNext() {
            return VkApplicationInfo.npNext(address());
        }

        @NativeType("char const *")
        public ByteBuffer pApplicationName() {
            return VkApplicationInfo.npApplicationName(address());
        }

        @NativeType("char const *")
        public String pApplicationNameString() {
            return VkApplicationInfo.npApplicationNameString(address());
        }

        @NativeType("uint32_t")
        public int applicationVersion() {
            return VkApplicationInfo.napplicationVersion(address());
        }

        @NativeType("char const *")
        public ByteBuffer pEngineName() {
            return VkApplicationInfo.npEngineName(address());
        }

        @NativeType("char const *")
        public String pEngineNameString() {
            return VkApplicationInfo.npEngineNameString(address());
        }

        @NativeType("uint32_t")
        public int engineVersion() {
            return VkApplicationInfo.nengineVersion(address());
        }

        @NativeType("uint32_t")
        public int apiVersion() {
            return VkApplicationInfo.napiVersion(address());
        }

        public Buffer sType(@NativeType("VkStructureType") int value) {
            VkApplicationInfo.nsType(address(), value);
            return this;
        }

        public Buffer sType$Default() {
            return sType(0);
        }

        public Buffer pNext(@NativeType("void const *") long value) {
            VkApplicationInfo.npNext(address(), value);
            return this;
        }

        public Buffer pApplicationName(@NativeType("char const *") ByteBuffer value) {
            VkApplicationInfo.npApplicationName(address(), value);
            return this;
        }

        public Buffer applicationVersion(@NativeType("uint32_t") int value) {
            VkApplicationInfo.napplicationVersion(address(), value);
            return this;
        }

        public Buffer pEngineName(@NativeType("char const *") ByteBuffer value) {
            VkApplicationInfo.npEngineName(address(), value);
            return this;
        }

        public Buffer engineVersion(@NativeType("uint32_t") int value) {
            VkApplicationInfo.nengineVersion(address(), value);
            return this;
        }

        public Buffer apiVersion(@NativeType("uint32_t") int value) {
            VkApplicationInfo.napiVersion(address(), value);
            return this;
        }
    }
}
