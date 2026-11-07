package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.sdl.SDL_VirtualJoystickSensorDesc;
import org.lwjgl.sdl.SDL_VirtualJoystickTouchpadDesc;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDesc.class */
public class SDL_VirtualJoystickDesc extends Struct<SDL_VirtualJoystickDesc> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int VERSION;
    public static final int TYPE;
    public static final int PADDING;
    public static final int VENDOR_ID;
    public static final int PRODUCT_ID;
    public static final int NAXES;
    public static final int NBUTTONS;
    public static final int NBALLS;
    public static final int NHATS;
    public static final int NTOUCHPADS;
    public static final int NSENSORS;
    public static final int PADDING2;
    public static final int BUTTON_MASK;
    public static final int AXIS_MASK;
    public static final int NAME;
    public static final int TOUCHPADS;
    public static final int SENSORS;
    public static final int USERDATA;
    public static final int UPDATE;
    public static final int SETPLAYERINDEX;
    public static final int RUMBLE;
    public static final int RUMBLETRIGGERS;
    public static final int SETLED;
    public static final int SENDEFFECT;
    public static final int SETSENSORSENABLED;
    public static final int CLEANUP;

    static {
        Struct.Layout layout = __struct(__member(4), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __member(2), __array(2, 2), __member(4), __member(4), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE), __member(POINTER_SIZE));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        VERSION = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        PADDING = layout.offsetof(2);
        VENDOR_ID = layout.offsetof(3);
        PRODUCT_ID = layout.offsetof(4);
        NAXES = layout.offsetof(5);
        NBUTTONS = layout.offsetof(6);
        NBALLS = layout.offsetof(7);
        NHATS = layout.offsetof(8);
        NTOUCHPADS = layout.offsetof(9);
        NSENSORS = layout.offsetof(10);
        PADDING2 = layout.offsetof(11);
        BUTTON_MASK = layout.offsetof(12);
        AXIS_MASK = layout.offsetof(13);
        NAME = layout.offsetof(14);
        TOUCHPADS = layout.offsetof(15);
        SENSORS = layout.offsetof(16);
        USERDATA = layout.offsetof(17);
        UPDATE = layout.offsetof(18);
        SETPLAYERINDEX = layout.offsetof(19);
        RUMBLE = layout.offsetof(20);
        RUMBLETRIGGERS = layout.offsetof(21);
        SETLED = layout.offsetof(22);
        SENDEFFECT = layout.offsetof(23);
        SETSENSORSENABLED = layout.offsetof(24);
        CLEANUP = layout.offsetof(25);
    }

    protected SDL_VirtualJoystickDesc(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_VirtualJoystickDesc create(long address, ByteBuffer container) {
        return new SDL_VirtualJoystickDesc(address, container);
    }

    public SDL_VirtualJoystickDesc(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Uint32")
    public int version() {
        return nversion(address());
    }

    @NativeType("Uint16")
    public short type() {
        return ntype(address());
    }

    @NativeType("Uint16")
    public short vendor_id() {
        return nvendor_id(address());
    }

    @NativeType("Uint16")
    public short product_id() {
        return nproduct_id(address());
    }

    @NativeType("Uint16")
    public short naxes() {
        return nnaxes(address());
    }

    @NativeType("Uint16")
    public short nbuttons() {
        return nnbuttons(address());
    }

    @NativeType("Uint16")
    public short nballs() {
        return nnballs(address());
    }

    @NativeType("Uint16")
    public short nhats() {
        return nnhats(address());
    }

    @NativeType("Uint16")
    public short ntouchpads() {
        return nntouchpads(address());
    }

    @NativeType("Uint16")
    public short nsensors() {
        return nnsensors(address());
    }

    @NativeType("Uint32")
    public int button_mask() {
        return nbutton_mask(address());
    }

    @NativeType("Uint32")
    public int axis_mask() {
        return naxis_mask(address());
    }

    @NativeType("char const *")
    public ByteBuffer name() {
        return nname(address());
    }

    @NativeType("char const *")
    public String nameString() {
        return nnameString(address());
    }

    @NativeType("SDL_VirtualJoystickTouchpadDesc const *")
    public SDL_VirtualJoystickTouchpadDesc.Buffer touchpads() {
        return ntouchpads(address());
    }

    @NativeType("SDL_VirtualJoystickSensorDesc const *")
    public SDL_VirtualJoystickSensorDesc.Buffer sensors() {
        return nsensors(address());
    }

    @NativeType("void *")
    public long userdata() {
        return nuserdata(address());
    }

    @NativeType("void (*) (void *)")
    public SDL_VirtualJoystickDescUpdateCallback Update() {
        return nUpdate(address());
    }

    @NativeType("void (*) (void *, int)")
    public SDL_VirtualJoystickDescSetPlayerIndexCallback SetPlayerIndex() {
        return nSetPlayerIndex(address());
    }

    @NativeType("bool (*) (void *, Uint16, Uint16)")
    public SDL_VirtualJoystickDescRumbleCallback Rumble() {
        return nRumble(address());
    }

    @NativeType("bool (*) (void *, Uint16, Uint16)")
    public SDL_VirtualJoystickDescRumbleTriggersCallback RumbleTriggers() {
        return nRumbleTriggers(address());
    }

    @NativeType("bool (*) (void *, Uint8, Uint8, Uint8)")
    public SDL_VirtualJoystickDescSetLEDCallback SetLED() {
        return nSetLED(address());
    }

    @NativeType("bool (*) (void *, void const *, int)")
    public SDL_VirtualJoystickDescSendEffectCallback SendEffect() {
        return nSendEffect(address());
    }

    @NativeType("bool (*) (void *, bool)")
    public SDL_VirtualJoystickDescSetSensorsEnabledCallback SetSensorsEnabled() {
        return nSetSensorsEnabled(address());
    }

    @NativeType("void (*) (void *)")
    public SDL_VirtualJoystickDescCleanupCallback Cleanup() {
        return nCleanup(address());
    }

    public SDL_VirtualJoystickDesc version(@NativeType("Uint32") int value) {
        nversion(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc type(@NativeType("Uint16") short value) {
        ntype(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc vendor_id(@NativeType("Uint16") short value) {
        nvendor_id(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc product_id(@NativeType("Uint16") short value) {
        nproduct_id(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc naxes(@NativeType("Uint16") short value) {
        nnaxes(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc nbuttons(@NativeType("Uint16") short value) {
        nnbuttons(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc nballs(@NativeType("Uint16") short value) {
        nnballs(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc nhats(@NativeType("Uint16") short value) {
        nnhats(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc ntouchpads(@NativeType("Uint16") short value) {
        nntouchpads(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc nsensors(@NativeType("Uint16") short value) {
        nnsensors(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc button_mask(@NativeType("Uint32") int value) {
        nbutton_mask(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc axis_mask(@NativeType("Uint32") int value) {
        naxis_mask(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc name(@NativeType("char const *") ByteBuffer value) {
        nname(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc touchpads(@NativeType("SDL_VirtualJoystickTouchpadDesc const *") SDL_VirtualJoystickTouchpadDesc.Buffer value) {
        ntouchpads(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc sensors(@NativeType("SDL_VirtualJoystickSensorDesc const *") SDL_VirtualJoystickSensorDesc.Buffer value) {
        nsensors(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc userdata(@NativeType("void *") long value) {
        nuserdata(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc Update(@NativeType("void (*) (void *)") SDL_VirtualJoystickDescUpdateCallbackI value) {
        nUpdate(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc SetPlayerIndex(@NativeType("void (*) (void *, int)") SDL_VirtualJoystickDescSetPlayerIndexCallbackI value) {
        nSetPlayerIndex(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc Rumble(@NativeType("bool (*) (void *, Uint16, Uint16)") SDL_VirtualJoystickDescRumbleCallbackI value) {
        nRumble(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc RumbleTriggers(@NativeType("bool (*) (void *, Uint16, Uint16)") SDL_VirtualJoystickDescRumbleTriggersCallbackI value) {
        nRumbleTriggers(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc SetLED(@NativeType("bool (*) (void *, Uint8, Uint8, Uint8)") SDL_VirtualJoystickDescSetLEDCallbackI value) {
        nSetLED(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc SendEffect(@NativeType("bool (*) (void *, void const *, int)") SDL_VirtualJoystickDescSendEffectCallbackI value) {
        nSendEffect(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc SetSensorsEnabled(@NativeType("bool (*) (void *, bool)") SDL_VirtualJoystickDescSetSensorsEnabledCallbackI value) {
        nSetSensorsEnabled(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc Cleanup(@NativeType("void (*) (void *)") SDL_VirtualJoystickDescCleanupCallbackI value) {
        nCleanup(address(), value);
        return this;
    }

    public SDL_VirtualJoystickDesc set(int version, short type, short vendor_id, short product_id, short naxes, short nbuttons, short nballs, short nhats, short ntouchpads, short nsensors, int button_mask, int axis_mask, ByteBuffer name, SDL_VirtualJoystickTouchpadDesc.Buffer touchpads, SDL_VirtualJoystickSensorDesc.Buffer sensors, long userdata, SDL_VirtualJoystickDescUpdateCallbackI Update, SDL_VirtualJoystickDescSetPlayerIndexCallbackI SetPlayerIndex, SDL_VirtualJoystickDescRumbleCallbackI Rumble, SDL_VirtualJoystickDescRumbleTriggersCallbackI RumbleTriggers, SDL_VirtualJoystickDescSetLEDCallbackI SetLED, SDL_VirtualJoystickDescSendEffectCallbackI SendEffect, SDL_VirtualJoystickDescSetSensorsEnabledCallbackI SetSensorsEnabled, SDL_VirtualJoystickDescCleanupCallbackI Cleanup) {
        version(version);
        type(type);
        vendor_id(vendor_id);
        product_id(product_id);
        naxes(naxes);
        nbuttons(nbuttons);
        nballs(nballs);
        nhats(nhats);
        ntouchpads(ntouchpads);
        nsensors(nsensors);
        button_mask(button_mask);
        axis_mask(axis_mask);
        name(name);
        touchpads(touchpads);
        sensors(sensors);
        userdata(userdata);
        Update(Update);
        SetPlayerIndex(SetPlayerIndex);
        Rumble(Rumble);
        RumbleTriggers(RumbleTriggers);
        SetLED(SetLED);
        SendEffect(SendEffect);
        SetSensorsEnabled(SetSensorsEnabled);
        Cleanup(Cleanup);
        return this;
    }

    public SDL_VirtualJoystickDesc set(SDL_VirtualJoystickDesc src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_VirtualJoystickDesc malloc() {
        return new SDL_VirtualJoystickDesc(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_VirtualJoystickDesc calloc() {
        return new SDL_VirtualJoystickDesc(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_VirtualJoystickDesc create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_VirtualJoystickDesc(MemoryUtil.memAddress(container), container);
    }

    public static SDL_VirtualJoystickDesc create(long address) {
        return new SDL_VirtualJoystickDesc(address, null);
    }

    public static SDL_VirtualJoystickDesc createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_VirtualJoystickDesc(address, null);
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

    public static SDL_VirtualJoystickDesc malloc(MemoryStack stack) {
        return new SDL_VirtualJoystickDesc(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_VirtualJoystickDesc calloc(MemoryStack stack) {
        return new SDL_VirtualJoystickDesc(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int nversion(long struct) {
        return MemoryUtil.memGetInt(struct + VERSION);
    }

    public static short ntype(long struct) {
        return MemoryUtil.memGetShort(struct + TYPE);
    }

    public static short npadding(long struct) {
        return MemoryUtil.memGetShort(struct + PADDING);
    }

    public static short nvendor_id(long struct) {
        return MemoryUtil.memGetShort(struct + VENDOR_ID);
    }

    public static short nproduct_id(long struct) {
        return MemoryUtil.memGetShort(struct + PRODUCT_ID);
    }

    public static short nnaxes(long struct) {
        return MemoryUtil.memGetShort(struct + NAXES);
    }

    public static short nnbuttons(long struct) {
        return MemoryUtil.memGetShort(struct + NBUTTONS);
    }

    public static short nnballs(long struct) {
        return MemoryUtil.memGetShort(struct + NBALLS);
    }

    public static short nnhats(long struct) {
        return MemoryUtil.memGetShort(struct + NHATS);
    }

    public static short nntouchpads(long struct) {
        return MemoryUtil.memGetShort(struct + NTOUCHPADS);
    }

    public static short nnsensors(long struct) {
        return MemoryUtil.memGetShort(struct + NSENSORS);
    }

    public static ShortBuffer npadding2(long struct) {
        return MemoryUtil.memShortBuffer(struct + PADDING2, 2);
    }

    public static short npadding2(long struct, int index) {
        return MemoryUtil.memGetShort(struct + PADDING2 + (Checks.check(index, 2) * 2));
    }

    public static int nbutton_mask(long struct) {
        return MemoryUtil.memGetInt(struct + BUTTON_MASK);
    }

    public static int naxis_mask(long struct) {
        return MemoryUtil.memGetInt(struct + AXIS_MASK);
    }

    public static ByteBuffer nname(long struct) {
        return MemoryUtil.memByteBufferNT1(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static String nnameString(long struct) {
        return MemoryUtil.memUTF8(MemoryUtil.memGetAddress(struct + NAME));
    }

    public static SDL_VirtualJoystickTouchpadDesc.Buffer ntouchpads(long struct) {
        return SDL_VirtualJoystickTouchpadDesc.createSafe(MemoryUtil.memGetAddress(struct + TOUCHPADS), Short.toUnsignedInt(nntouchpads(struct)));
    }

    public static SDL_VirtualJoystickSensorDesc.Buffer nsensors(long struct) {
        return SDL_VirtualJoystickSensorDesc.createSafe(MemoryUtil.memGetAddress(struct + SENSORS), Short.toUnsignedInt(nnsensors(struct)));
    }

    public static long nuserdata(long struct) {
        return MemoryUtil.memGetAddress(struct + USERDATA);
    }

    public static SDL_VirtualJoystickDescUpdateCallback nUpdate(long struct) {
        return SDL_VirtualJoystickDescUpdateCallback.createSafe(MemoryUtil.memGetAddress(struct + UPDATE));
    }

    public static SDL_VirtualJoystickDescSetPlayerIndexCallback nSetPlayerIndex(long struct) {
        return SDL_VirtualJoystickDescSetPlayerIndexCallback.createSafe(MemoryUtil.memGetAddress(struct + SETPLAYERINDEX));
    }

    public static SDL_VirtualJoystickDescRumbleCallback nRumble(long struct) {
        return SDL_VirtualJoystickDescRumbleCallback.createSafe(MemoryUtil.memGetAddress(struct + RUMBLE));
    }

    public static SDL_VirtualJoystickDescRumbleTriggersCallback nRumbleTriggers(long struct) {
        return SDL_VirtualJoystickDescRumbleTriggersCallback.createSafe(MemoryUtil.memGetAddress(struct + RUMBLETRIGGERS));
    }

    public static SDL_VirtualJoystickDescSetLEDCallback nSetLED(long struct) {
        return SDL_VirtualJoystickDescSetLEDCallback.createSafe(MemoryUtil.memGetAddress(struct + SETLED));
    }

    public static SDL_VirtualJoystickDescSendEffectCallback nSendEffect(long struct) {
        return SDL_VirtualJoystickDescSendEffectCallback.createSafe(MemoryUtil.memGetAddress(struct + SENDEFFECT));
    }

    public static SDL_VirtualJoystickDescSetSensorsEnabledCallback nSetSensorsEnabled(long struct) {
        return SDL_VirtualJoystickDescSetSensorsEnabledCallback.createSafe(MemoryUtil.memGetAddress(struct + SETSENSORSENABLED));
    }

    public static SDL_VirtualJoystickDescCleanupCallback nCleanup(long struct) {
        return SDL_VirtualJoystickDescCleanupCallback.createSafe(MemoryUtil.memGetAddress(struct + CLEANUP));
    }

    public static void nversion(long struct, int value) {
        MemoryUtil.memPutInt(struct + VERSION, value);
    }

    public static void ntype(long struct, short value) {
        MemoryUtil.memPutShort(struct + TYPE, value);
    }

    public static void npadding(long struct, short value) {
        MemoryUtil.memPutShort(struct + PADDING, value);
    }

    public static void nvendor_id(long struct, short value) {
        MemoryUtil.memPutShort(struct + VENDOR_ID, value);
    }

    public static void nproduct_id(long struct, short value) {
        MemoryUtil.memPutShort(struct + PRODUCT_ID, value);
    }

    public static void nnaxes(long struct, short value) {
        MemoryUtil.memPutShort(struct + NAXES, value);
    }

    public static void nnbuttons(long struct, short value) {
        MemoryUtil.memPutShort(struct + NBUTTONS, value);
    }

    public static void nnballs(long struct, short value) {
        MemoryUtil.memPutShort(struct + NBALLS, value);
    }

    public static void nnhats(long struct, short value) {
        MemoryUtil.memPutShort(struct + NHATS, value);
    }

    public static void nntouchpads(long struct, short value) {
        MemoryUtil.memPutShort(struct + NTOUCHPADS, value);
    }

    public static void nnsensors(long struct, short value) {
        MemoryUtil.memPutShort(struct + NSENSORS, value);
    }

    public static void npadding2(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 2);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PADDING2, value.remaining() * 2);
    }

    public static void npadding2(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + PADDING2 + (Checks.check(index, 2) * 2), value);
    }

    public static void nbutton_mask(long struct, int value) {
        MemoryUtil.memPutInt(struct + BUTTON_MASK, value);
    }

    public static void naxis_mask(long struct, int value) {
        MemoryUtil.memPutInt(struct + AXIS_MASK, value);
    }

    public static void nname(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(value);
        }
        MemoryUtil.memPutAddress(struct + NAME, MemoryUtil.memAddress(value));
    }

    public static void ntouchpads(long struct, SDL_VirtualJoystickTouchpadDesc.Buffer value) {
        MemoryUtil.memPutAddress(struct + TOUCHPADS, MemoryUtil.memAddressSafe(value));
        nntouchpads(struct, value == null ? (short) 0 : (short) value.remaining());
    }

    public static void nsensors(long struct, SDL_VirtualJoystickSensorDesc.Buffer value) {
        MemoryUtil.memPutAddress(struct + SENSORS, MemoryUtil.memAddressSafe(value));
        nnsensors(struct, value == null ? (short) 0 : (short) value.remaining());
    }

    public static void nuserdata(long struct, long value) {
        MemoryUtil.memPutAddress(struct + USERDATA, value);
    }

    public static void nUpdate(long struct, SDL_VirtualJoystickDescUpdateCallbackI value) {
        MemoryUtil.memPutAddress(struct + UPDATE, MemoryUtil.memAddressSafe(value));
    }

    public static void nSetPlayerIndex(long struct, SDL_VirtualJoystickDescSetPlayerIndexCallbackI value) {
        MemoryUtil.memPutAddress(struct + SETPLAYERINDEX, MemoryUtil.memAddressSafe(value));
    }

    public static void nRumble(long struct, SDL_VirtualJoystickDescRumbleCallbackI value) {
        MemoryUtil.memPutAddress(struct + RUMBLE, MemoryUtil.memAddressSafe(value));
    }

    public static void nRumbleTriggers(long struct, SDL_VirtualJoystickDescRumbleTriggersCallbackI value) {
        MemoryUtil.memPutAddress(struct + RUMBLETRIGGERS, MemoryUtil.memAddressSafe(value));
    }

    public static void nSetLED(long struct, SDL_VirtualJoystickDescSetLEDCallbackI value) {
        MemoryUtil.memPutAddress(struct + SETLED, MemoryUtil.memAddressSafe(value));
    }

    public static void nSendEffect(long struct, SDL_VirtualJoystickDescSendEffectCallbackI value) {
        MemoryUtil.memPutAddress(struct + SENDEFFECT, MemoryUtil.memAddressSafe(value));
    }

    public static void nSetSensorsEnabled(long struct, SDL_VirtualJoystickDescSetSensorsEnabledCallbackI value) {
        MemoryUtil.memPutAddress(struct + SETSENSORSENABLED, MemoryUtil.memAddressSafe(value));
    }

    public static void nCleanup(long struct, SDL_VirtualJoystickDescCleanupCallbackI value) {
        MemoryUtil.memPutAddress(struct + CLEANUP, MemoryUtil.memAddressSafe(value));
    }

    public static void validate(long struct) {
        Checks.check(MemoryUtil.memGetAddress(struct + NAME));
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_VirtualJoystickDesc$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_VirtualJoystickDesc, Buffer> implements NativeResource {
        private static final SDL_VirtualJoystickDesc ELEMENT_FACTORY = SDL_VirtualJoystickDesc.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_VirtualJoystickDesc.SIZEOF);
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
        public SDL_VirtualJoystickDesc getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint32")
        public int version() {
            return SDL_VirtualJoystickDesc.nversion(address());
        }

        @NativeType("Uint16")
        public short type() {
            return SDL_VirtualJoystickDesc.ntype(address());
        }

        @NativeType("Uint16")
        public short vendor_id() {
            return SDL_VirtualJoystickDesc.nvendor_id(address());
        }

        @NativeType("Uint16")
        public short product_id() {
            return SDL_VirtualJoystickDesc.nproduct_id(address());
        }

        @NativeType("Uint16")
        public short naxes() {
            return SDL_VirtualJoystickDesc.nnaxes(address());
        }

        @NativeType("Uint16")
        public short nbuttons() {
            return SDL_VirtualJoystickDesc.nnbuttons(address());
        }

        @NativeType("Uint16")
        public short nballs() {
            return SDL_VirtualJoystickDesc.nnballs(address());
        }

        @NativeType("Uint16")
        public short nhats() {
            return SDL_VirtualJoystickDesc.nnhats(address());
        }

        @NativeType("Uint16")
        public short ntouchpads() {
            return SDL_VirtualJoystickDesc.nntouchpads(address());
        }

        @NativeType("Uint16")
        public short nsensors() {
            return SDL_VirtualJoystickDesc.nnsensors(address());
        }

        @NativeType("Uint32")
        public int button_mask() {
            return SDL_VirtualJoystickDesc.nbutton_mask(address());
        }

        @NativeType("Uint32")
        public int axis_mask() {
            return SDL_VirtualJoystickDesc.naxis_mask(address());
        }

        @NativeType("char const *")
        public ByteBuffer name() {
            return SDL_VirtualJoystickDesc.nname(address());
        }

        @NativeType("char const *")
        public String nameString() {
            return SDL_VirtualJoystickDesc.nnameString(address());
        }

        @NativeType("SDL_VirtualJoystickTouchpadDesc const *")
        public SDL_VirtualJoystickTouchpadDesc.Buffer touchpads() {
            return SDL_VirtualJoystickDesc.ntouchpads(address());
        }

        @NativeType("SDL_VirtualJoystickSensorDesc const *")
        public SDL_VirtualJoystickSensorDesc.Buffer sensors() {
            return SDL_VirtualJoystickDesc.nsensors(address());
        }

        @NativeType("void *")
        public long userdata() {
            return SDL_VirtualJoystickDesc.nuserdata(address());
        }

        @NativeType("void (*) (void *)")
        public SDL_VirtualJoystickDescUpdateCallback Update() {
            return SDL_VirtualJoystickDesc.nUpdate(address());
        }

        @NativeType("void (*) (void *, int)")
        public SDL_VirtualJoystickDescSetPlayerIndexCallback SetPlayerIndex() {
            return SDL_VirtualJoystickDesc.nSetPlayerIndex(address());
        }

        @NativeType("bool (*) (void *, Uint16, Uint16)")
        public SDL_VirtualJoystickDescRumbleCallback Rumble() {
            return SDL_VirtualJoystickDesc.nRumble(address());
        }

        @NativeType("bool (*) (void *, Uint16, Uint16)")
        public SDL_VirtualJoystickDescRumbleTriggersCallback RumbleTriggers() {
            return SDL_VirtualJoystickDesc.nRumbleTriggers(address());
        }

        @NativeType("bool (*) (void *, Uint8, Uint8, Uint8)")
        public SDL_VirtualJoystickDescSetLEDCallback SetLED() {
            return SDL_VirtualJoystickDesc.nSetLED(address());
        }

        @NativeType("bool (*) (void *, void const *, int)")
        public SDL_VirtualJoystickDescSendEffectCallback SendEffect() {
            return SDL_VirtualJoystickDesc.nSendEffect(address());
        }

        @NativeType("bool (*) (void *, bool)")
        public SDL_VirtualJoystickDescSetSensorsEnabledCallback SetSensorsEnabled() {
            return SDL_VirtualJoystickDesc.nSetSensorsEnabled(address());
        }

        @NativeType("void (*) (void *)")
        public SDL_VirtualJoystickDescCleanupCallback Cleanup() {
            return SDL_VirtualJoystickDesc.nCleanup(address());
        }

        public Buffer version(@NativeType("Uint32") int value) {
            SDL_VirtualJoystickDesc.nversion(address(), value);
            return this;
        }

        public Buffer type(@NativeType("Uint16") short value) {
            SDL_VirtualJoystickDesc.ntype(address(), value);
            return this;
        }

        public Buffer vendor_id(@NativeType("Uint16") short value) {
            SDL_VirtualJoystickDesc.nvendor_id(address(), value);
            return this;
        }

        public Buffer product_id(@NativeType("Uint16") short value) {
            SDL_VirtualJoystickDesc.nproduct_id(address(), value);
            return this;
        }

        public Buffer naxes(@NativeType("Uint16") short value) {
            SDL_VirtualJoystickDesc.nnaxes(address(), value);
            return this;
        }

        public Buffer nbuttons(@NativeType("Uint16") short value) {
            SDL_VirtualJoystickDesc.nnbuttons(address(), value);
            return this;
        }

        public Buffer nballs(@NativeType("Uint16") short value) {
            SDL_VirtualJoystickDesc.nnballs(address(), value);
            return this;
        }

        public Buffer nhats(@NativeType("Uint16") short value) {
            SDL_VirtualJoystickDesc.nnhats(address(), value);
            return this;
        }

        public Buffer ntouchpads(@NativeType("Uint16") short value) {
            SDL_VirtualJoystickDesc.nntouchpads(address(), value);
            return this;
        }

        public Buffer nsensors(@NativeType("Uint16") short value) {
            SDL_VirtualJoystickDesc.nnsensors(address(), value);
            return this;
        }

        public Buffer button_mask(@NativeType("Uint32") int value) {
            SDL_VirtualJoystickDesc.nbutton_mask(address(), value);
            return this;
        }

        public Buffer axis_mask(@NativeType("Uint32") int value) {
            SDL_VirtualJoystickDesc.naxis_mask(address(), value);
            return this;
        }

        public Buffer name(@NativeType("char const *") ByteBuffer value) {
            SDL_VirtualJoystickDesc.nname(address(), value);
            return this;
        }

        public Buffer touchpads(@NativeType("SDL_VirtualJoystickTouchpadDesc const *") SDL_VirtualJoystickTouchpadDesc.Buffer value) {
            SDL_VirtualJoystickDesc.ntouchpads(address(), value);
            return this;
        }

        public Buffer sensors(@NativeType("SDL_VirtualJoystickSensorDesc const *") SDL_VirtualJoystickSensorDesc.Buffer value) {
            SDL_VirtualJoystickDesc.nsensors(address(), value);
            return this;
        }

        public Buffer userdata(@NativeType("void *") long value) {
            SDL_VirtualJoystickDesc.nuserdata(address(), value);
            return this;
        }

        public Buffer Update(@NativeType("void (*) (void *)") SDL_VirtualJoystickDescUpdateCallbackI value) {
            SDL_VirtualJoystickDesc.nUpdate(address(), value);
            return this;
        }

        public Buffer SetPlayerIndex(@NativeType("void (*) (void *, int)") SDL_VirtualJoystickDescSetPlayerIndexCallbackI value) {
            SDL_VirtualJoystickDesc.nSetPlayerIndex(address(), value);
            return this;
        }

        public Buffer Rumble(@NativeType("bool (*) (void *, Uint16, Uint16)") SDL_VirtualJoystickDescRumbleCallbackI value) {
            SDL_VirtualJoystickDesc.nRumble(address(), value);
            return this;
        }

        public Buffer RumbleTriggers(@NativeType("bool (*) (void *, Uint16, Uint16)") SDL_VirtualJoystickDescRumbleTriggersCallbackI value) {
            SDL_VirtualJoystickDesc.nRumbleTriggers(address(), value);
            return this;
        }

        public Buffer SetLED(@NativeType("bool (*) (void *, Uint8, Uint8, Uint8)") SDL_VirtualJoystickDescSetLEDCallbackI value) {
            SDL_VirtualJoystickDesc.nSetLED(address(), value);
            return this;
        }

        public Buffer SendEffect(@NativeType("bool (*) (void *, void const *, int)") SDL_VirtualJoystickDescSendEffectCallbackI value) {
            SDL_VirtualJoystickDesc.nSendEffect(address(), value);
            return this;
        }

        public Buffer SetSensorsEnabled(@NativeType("bool (*) (void *, bool)") SDL_VirtualJoystickDescSetSensorsEnabledCallbackI value) {
            SDL_VirtualJoystickDesc.nSetSensorsEnabled(address(), value);
            return this;
        }

        public Buffer Cleanup(@NativeType("void (*) (void *)") SDL_VirtualJoystickDescCleanupCallbackI value) {
            SDL_VirtualJoystickDesc.nCleanup(address(), value);
            return this;
        }
    }
}
