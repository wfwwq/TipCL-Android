package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUVulkanOptions.class */
public class SDL_GPUVulkanOptions extends Struct<SDL_GPUVulkanOptions> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VULKAN_API_VERSION;
    public static final int FEATURE_LIST;
    public static final int VULKAN_10_PHYSICAL_DEVICE_FEATURES;
    public static final int DEVICE_EXTENSION_COUNT;
    public static final int DEVICE_EXTENSION_NAMES;
    public static final int INSTANCE_EXTENSION_COUNT;
    public static final int INSTANCE_EXTENSION_NAMES;

    static {
        Struct.Layout layout = __struct(__member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE), __member(4), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VULKAN_API_VERSION = layout.offsetof(0);
        FEATURE_LIST = layout.offsetof(1);
        VULKAN_10_PHYSICAL_DEVICE_FEATURES = layout.offsetof(2);
        DEVICE_EXTENSION_COUNT = layout.offsetof(3);
        DEVICE_EXTENSION_NAMES = layout.offsetof(4);
        INSTANCE_EXTENSION_COUNT = layout.offsetof(5);
        INSTANCE_EXTENSION_NAMES = layout.offsetof(6);
    }

    protected SDL_GPUVulkanOptions(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_GPUVulkanOptions create(long address, ByteBuffer container) {
        return new SDL_GPUVulkanOptions(address, container);
    }

    public SDL_GPUVulkanOptions(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Uint32")
    public int vulkan_api_version() {
        return nvulkan_api_version(address());
    }

    @NativeType("void *")
    public long feature_list() {
        return nfeature_list(address());
    }

    @NativeType("void *")
    public long vulkan_10_physical_device_features() {
        return nvulkan_10_physical_device_features(address());
    }

    @NativeType("Uint32")
    public int device_extension_count() {
        return ndevice_extension_count(address());
    }

    @NativeType("char const **")
    public PointerBuffer device_extension_names() {
        return ndevice_extension_names(address());
    }

    @NativeType("Uint32")
    public int instance_extension_count() {
        return ninstance_extension_count(address());
    }

    @NativeType("char const **")
    public PointerBuffer instance_extension_names() {
        return ninstance_extension_names(address());
    }

    public SDL_GPUVulkanOptions vulkan_api_version(@NativeType("Uint32") int value) {
        nvulkan_api_version(address(), value);
        return this;
    }

    public SDL_GPUVulkanOptions feature_list(@NativeType("void *") long value) {
        nfeature_list(address(), value);
        return this;
    }

    public SDL_GPUVulkanOptions vulkan_10_physical_device_features(@NativeType("void *") long value) {
        nvulkan_10_physical_device_features(address(), value);
        return this;
    }

    public SDL_GPUVulkanOptions device_extension_count(@NativeType("Uint32") int value) {
        ndevice_extension_count(address(), value);
        return this;
    }

    public SDL_GPUVulkanOptions device_extension_names(@NativeType("char const **") PointerBuffer value) {
        ndevice_extension_names(address(), value);
        return this;
    }

    public SDL_GPUVulkanOptions instance_extension_count(@NativeType("Uint32") int value) {
        ninstance_extension_count(address(), value);
        return this;
    }

    public SDL_GPUVulkanOptions instance_extension_names(@NativeType("char const **") PointerBuffer value) {
        ninstance_extension_names(address(), value);
        return this;
    }

    public SDL_GPUVulkanOptions set(int vulkan_api_version, long feature_list, long vulkan_10_physical_device_features, int device_extension_count, PointerBuffer device_extension_names, int instance_extension_count, PointerBuffer instance_extension_names) {
        vulkan_api_version(vulkan_api_version);
        feature_list(feature_list);
        vulkan_10_physical_device_features(vulkan_10_physical_device_features);
        device_extension_count(device_extension_count);
        device_extension_names(device_extension_names);
        instance_extension_count(instance_extension_count);
        instance_extension_names(instance_extension_names);
        return this;
    }

    public SDL_GPUVulkanOptions set(SDL_GPUVulkanOptions src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_GPUVulkanOptions malloc() {
        return new SDL_GPUVulkanOptions(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_GPUVulkanOptions calloc() {
        return new SDL_GPUVulkanOptions(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_GPUVulkanOptions create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_GPUVulkanOptions(MemoryUtil.memAddress(container), container);
    }

    public static SDL_GPUVulkanOptions create(long address) {
        return new SDL_GPUVulkanOptions(address, null);
    }

    public static SDL_GPUVulkanOptions createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_GPUVulkanOptions(address, null);
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

    public static SDL_GPUVulkanOptions malloc(MemoryStack stack) {
        return new SDL_GPUVulkanOptions(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_GPUVulkanOptions calloc(MemoryStack stack) {
        return new SDL_GPUVulkanOptions(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nvulkan_api_version(long struct) {
        return MemoryUtil.memGetInt(struct + VULKAN_API_VERSION);
    }

    public static long nfeature_list(long struct) {
        return MemoryUtil.memGetAddress(struct + FEATURE_LIST);
    }

    public static long nvulkan_10_physical_device_features(long struct) {
        return MemoryUtil.memGetAddress(struct + VULKAN_10_PHYSICAL_DEVICE_FEATURES);
    }

    public static int ndevice_extension_count(long struct) {
        return MemoryUtil.memGetInt(struct + DEVICE_EXTENSION_COUNT);
    }

    public static PointerBuffer ndevice_extension_names(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + DEVICE_EXTENSION_NAMES), ndevice_extension_count(struct));
    }

    public static int ninstance_extension_count(long struct) {
        return MemoryUtil.memGetInt(struct + INSTANCE_EXTENSION_COUNT);
    }

    public static PointerBuffer ninstance_extension_names(long struct) {
        return MemoryUtil.memPointerBufferSafe(MemoryUtil.memGetAddress(struct + INSTANCE_EXTENSION_NAMES), ninstance_extension_count(struct));
    }

    public static void nvulkan_api_version(long struct, int value) {
        MemoryUtil.memPutInt(struct + VULKAN_API_VERSION, value);
    }

    public static void nfeature_list(long struct, long value) {
        MemoryUtil.memPutAddress(struct + FEATURE_LIST, value);
    }

    public static void nvulkan_10_physical_device_features(long struct, long value) {
        MemoryUtil.memPutAddress(struct + VULKAN_10_PHYSICAL_DEVICE_FEATURES, value);
    }

    public static void ndevice_extension_count(long struct, int value) {
        MemoryUtil.memPutInt(struct + DEVICE_EXTENSION_COUNT, value);
    }

    public static void ndevice_extension_names(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + DEVICE_EXTENSION_NAMES, MemoryUtil.memAddressSafe(value));
        ndevice_extension_count(struct, value == null ? 0 : value.remaining());
    }

    public static void ninstance_extension_count(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTANCE_EXTENSION_COUNT, value);
    }

    public static void ninstance_extension_names(long struct, PointerBuffer value) {
        MemoryUtil.memPutAddress(struct + INSTANCE_EXTENSION_NAMES, MemoryUtil.memAddressSafe(value));
        ninstance_extension_count(struct, value == null ? 0 : value.remaining());
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_GPUVulkanOptions$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_GPUVulkanOptions, Buffer> implements NativeResource {
        private static final SDL_GPUVulkanOptions ELEMENT_FACTORY = SDL_GPUVulkanOptions.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_GPUVulkanOptions.SIZEOF);
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
        public SDL_GPUVulkanOptions getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint32")
        public int vulkan_api_version() {
            return SDL_GPUVulkanOptions.nvulkan_api_version(address());
        }

        @NativeType("void *")
        public long feature_list() {
            return SDL_GPUVulkanOptions.nfeature_list(address());
        }

        @NativeType("void *")
        public long vulkan_10_physical_device_features() {
            return SDL_GPUVulkanOptions.nvulkan_10_physical_device_features(address());
        }

        @NativeType("Uint32")
        public int device_extension_count() {
            return SDL_GPUVulkanOptions.ndevice_extension_count(address());
        }

        @NativeType("char const **")
        public PointerBuffer device_extension_names() {
            return SDL_GPUVulkanOptions.ndevice_extension_names(address());
        }

        @NativeType("Uint32")
        public int instance_extension_count() {
            return SDL_GPUVulkanOptions.ninstance_extension_count(address());
        }

        @NativeType("char const **")
        public PointerBuffer instance_extension_names() {
            return SDL_GPUVulkanOptions.ninstance_extension_names(address());
        }

        public Buffer vulkan_api_version(@NativeType("Uint32") int value) {
            SDL_GPUVulkanOptions.nvulkan_api_version(address(), value);
            return this;
        }

        public Buffer feature_list(@NativeType("void *") long value) {
            SDL_GPUVulkanOptions.nfeature_list(address(), value);
            return this;
        }

        public Buffer vulkan_10_physical_device_features(@NativeType("void *") long value) {
            SDL_GPUVulkanOptions.nvulkan_10_physical_device_features(address(), value);
            return this;
        }

        public Buffer device_extension_count(@NativeType("Uint32") int value) {
            SDL_GPUVulkanOptions.ndevice_extension_count(address(), value);
            return this;
        }

        public Buffer device_extension_names(@NativeType("char const **") PointerBuffer value) {
            SDL_GPUVulkanOptions.ndevice_extension_names(address(), value);
            return this;
        }

        public Buffer instance_extension_count(@NativeType("Uint32") int value) {
            SDL_GPUVulkanOptions.ninstance_extension_count(address(), value);
            return this;
        }

        public Buffer instance_extension_names(@NativeType("char const **") PointerBuffer value) {
            SDL_GPUVulkanOptions.ninstance_extension_names(address(), value);
            return this;
        }
    }
}
