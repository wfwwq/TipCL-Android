package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import java.util.function.Consumer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Event.class */
public class SDL_Event extends Struct<SDL_Event> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int TYPE;
    public static final int COMMON;
    public static final int DISPLAY;
    public static final int WINDOW;
    public static final int KDEVICE;
    public static final int KEY;
    public static final int EDIT;
    public static final int EDIT_CANDIDATES;
    public static final int TEXT;
    public static final int MDEVICE;
    public static final int MOTION;
    public static final int BUTTON;
    public static final int WHEEL;
    public static final int JDEVICE;
    public static final int JAXIS;
    public static final int JBALL;
    public static final int JHAT;
    public static final int JBUTTON;
    public static final int JBATTERY;
    public static final int GDEVICE;
    public static final int GAXIS;
    public static final int GBUTTON;
    public static final int GTOUCHPAD;
    public static final int GSENSOR;
    public static final int ADEVICE;
    public static final int CDEVICE;
    public static final int SENSOR;
    public static final int QUIT;
    public static final int USER;
    public static final int TFINGER;
    public static final int PINCH;
    public static final int PPROXIMITY;
    public static final int PTOUCH;
    public static final int PMOTION;
    public static final int PBUTTON;
    public static final int PAXIS;
    public static final int RENDER;
    public static final int DROP;
    public static final int CLIPBOARD;
    public static final int PADDING;

    static {
        Struct.Layout layout = __union(__member(4), __member(SDL_CommonEvent.SIZEOF, SDL_CommonEvent.ALIGNOF), __member(SDL_DisplayEvent.SIZEOF, SDL_DisplayEvent.ALIGNOF), __member(SDL_WindowEvent.SIZEOF, SDL_WindowEvent.ALIGNOF), __member(SDL_KeyboardDeviceEvent.SIZEOF, SDL_KeyboardDeviceEvent.ALIGNOF), __member(SDL_KeyboardEvent.SIZEOF, SDL_KeyboardEvent.ALIGNOF), __member(SDL_TextEditingEvent.SIZEOF, SDL_TextEditingEvent.ALIGNOF), __member(SDL_TextEditingCandidatesEvent.SIZEOF, SDL_TextEditingCandidatesEvent.ALIGNOF), __member(SDL_TextInputEvent.SIZEOF, SDL_TextInputEvent.ALIGNOF), __member(SDL_MouseDeviceEvent.SIZEOF, SDL_MouseDeviceEvent.ALIGNOF), __member(SDL_MouseMotionEvent.SIZEOF, SDL_MouseMotionEvent.ALIGNOF), __member(SDL_MouseButtonEvent.SIZEOF, SDL_MouseButtonEvent.ALIGNOF), __member(SDL_MouseWheelEvent.SIZEOF, SDL_MouseWheelEvent.ALIGNOF), __member(SDL_JoyDeviceEvent.SIZEOF, SDL_JoyDeviceEvent.ALIGNOF), __member(SDL_JoyAxisEvent.SIZEOF, SDL_JoyAxisEvent.ALIGNOF), __member(SDL_JoyBallEvent.SIZEOF, SDL_JoyBallEvent.ALIGNOF), __member(SDL_JoyHatEvent.SIZEOF, SDL_JoyHatEvent.ALIGNOF), __member(SDL_JoyButtonEvent.SIZEOF, SDL_JoyButtonEvent.ALIGNOF), __member(SDL_JoyBatteryEvent.SIZEOF, SDL_JoyBatteryEvent.ALIGNOF), __member(SDL_GamepadDeviceEvent.SIZEOF, SDL_GamepadDeviceEvent.ALIGNOF), __member(SDL_GamepadAxisEvent.SIZEOF, SDL_GamepadAxisEvent.ALIGNOF), __member(SDL_GamepadButtonEvent.SIZEOF, SDL_GamepadButtonEvent.ALIGNOF), __member(SDL_GamepadTouchpadEvent.SIZEOF, SDL_GamepadTouchpadEvent.ALIGNOF), __member(SDL_GamepadSensorEvent.SIZEOF, SDL_GamepadSensorEvent.ALIGNOF), __member(SDL_AudioDeviceEvent.SIZEOF, SDL_AudioDeviceEvent.ALIGNOF), __member(SDL_CameraDeviceEvent.SIZEOF, SDL_CameraDeviceEvent.ALIGNOF), __member(SDL_SensorEvent.SIZEOF, SDL_SensorEvent.ALIGNOF), __member(SDL_QuitEvent.SIZEOF, SDL_QuitEvent.ALIGNOF), __member(SDL_UserEvent.SIZEOF, SDL_UserEvent.ALIGNOF), __member(SDL_TouchFingerEvent.SIZEOF, SDL_TouchFingerEvent.ALIGNOF), __member(SDL_PinchFingerEvent.SIZEOF, SDL_PinchFingerEvent.ALIGNOF), __member(SDL_PenProximityEvent.SIZEOF, SDL_PenProximityEvent.ALIGNOF), __member(SDL_PenTouchEvent.SIZEOF, SDL_PenTouchEvent.ALIGNOF), __member(SDL_PenMotionEvent.SIZEOF, SDL_PenMotionEvent.ALIGNOF), __member(SDL_PenButtonEvent.SIZEOF, SDL_PenButtonEvent.ALIGNOF), __member(SDL_PenAxisEvent.SIZEOF, SDL_PenAxisEvent.ALIGNOF), __member(SDL_RenderEvent.SIZEOF, SDL_RenderEvent.ALIGNOF), __member(SDL_DropEvent.SIZEOF, SDL_DropEvent.ALIGNOF), __member(SDL_ClipboardEvent.SIZEOF, SDL_ClipboardEvent.ALIGNOF), __array(1, 128));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        TYPE = layout.offsetof(0);
        COMMON = layout.offsetof(1);
        DISPLAY = layout.offsetof(2);
        WINDOW = layout.offsetof(3);
        KDEVICE = layout.offsetof(4);
        KEY = layout.offsetof(5);
        EDIT = layout.offsetof(6);
        EDIT_CANDIDATES = layout.offsetof(7);
        TEXT = layout.offsetof(8);
        MDEVICE = layout.offsetof(9);
        MOTION = layout.offsetof(10);
        BUTTON = layout.offsetof(11);
        WHEEL = layout.offsetof(12);
        JDEVICE = layout.offsetof(13);
        JAXIS = layout.offsetof(14);
        JBALL = layout.offsetof(15);
        JHAT = layout.offsetof(16);
        JBUTTON = layout.offsetof(17);
        JBATTERY = layout.offsetof(18);
        GDEVICE = layout.offsetof(19);
        GAXIS = layout.offsetof(20);
        GBUTTON = layout.offsetof(21);
        GTOUCHPAD = layout.offsetof(22);
        GSENSOR = layout.offsetof(23);
        ADEVICE = layout.offsetof(24);
        CDEVICE = layout.offsetof(25);
        SENSOR = layout.offsetof(26);
        QUIT = layout.offsetof(27);
        USER = layout.offsetof(28);
        TFINGER = layout.offsetof(29);
        PINCH = layout.offsetof(30);
        PPROXIMITY = layout.offsetof(31);
        PTOUCH = layout.offsetof(32);
        PMOTION = layout.offsetof(33);
        PBUTTON = layout.offsetof(34);
        PAXIS = layout.offsetof(35);
        RENDER = layout.offsetof(36);
        DROP = layout.offsetof(37);
        CLIPBOARD = layout.offsetof(38);
        PADDING = layout.offsetof(39);
    }

    protected SDL_Event(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public SDL_Event create(long address, ByteBuffer container) {
        return new SDL_Event(address, container);
    }

    public SDL_Event(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("Uint32")
    public int type() {
        return ntype(address());
    }

    public SDL_CommonEvent common() {
        return ncommon(address());
    }

    public SDL_DisplayEvent display() {
        return ndisplay(address());
    }

    public SDL_WindowEvent window() {
        return nwindow(address());
    }

    public SDL_KeyboardDeviceEvent kdevice() {
        return nkdevice(address());
    }

    public SDL_KeyboardEvent key() {
        return nkey(address());
    }

    public SDL_TextEditingEvent edit() {
        return nedit(address());
    }

    public SDL_TextEditingCandidatesEvent edit_candidates() {
        return nedit_candidates(address());
    }

    public SDL_TextInputEvent text() {
        return ntext(address());
    }

    public SDL_MouseDeviceEvent mdevice() {
        return nmdevice(address());
    }

    public SDL_MouseMotionEvent motion() {
        return nmotion(address());
    }

    public SDL_MouseButtonEvent button() {
        return nbutton(address());
    }

    public SDL_MouseWheelEvent wheel() {
        return nwheel(address());
    }

    public SDL_JoyDeviceEvent jdevice() {
        return njdevice(address());
    }

    public SDL_JoyAxisEvent jaxis() {
        return njaxis(address());
    }

    public SDL_JoyBallEvent jball() {
        return njball(address());
    }

    public SDL_JoyHatEvent jhat() {
        return njhat(address());
    }

    public SDL_JoyButtonEvent jbutton() {
        return njbutton(address());
    }

    public SDL_JoyBatteryEvent jbattery() {
        return njbattery(address());
    }

    public SDL_GamepadDeviceEvent gdevice() {
        return ngdevice(address());
    }

    public SDL_GamepadAxisEvent gaxis() {
        return ngaxis(address());
    }

    public SDL_GamepadButtonEvent gbutton() {
        return ngbutton(address());
    }

    public SDL_GamepadTouchpadEvent gtouchpad() {
        return ngtouchpad(address());
    }

    public SDL_GamepadSensorEvent gsensor() {
        return ngsensor(address());
    }

    public SDL_AudioDeviceEvent adevice() {
        return nadevice(address());
    }

    public SDL_CameraDeviceEvent cdevice() {
        return ncdevice(address());
    }

    public SDL_SensorEvent sensor() {
        return nsensor(address());
    }

    public SDL_QuitEvent quit() {
        return nquit(address());
    }

    public SDL_UserEvent user() {
        return nuser(address());
    }

    public SDL_TouchFingerEvent tfinger() {
        return ntfinger(address());
    }

    public SDL_PinchFingerEvent pinch() {
        return npinch(address());
    }

    public SDL_PenProximityEvent pproximity() {
        return npproximity(address());
    }

    public SDL_PenTouchEvent ptouch() {
        return nptouch(address());
    }

    public SDL_PenMotionEvent pmotion() {
        return npmotion(address());
    }

    public SDL_PenButtonEvent pbutton() {
        return npbutton(address());
    }

    public SDL_PenAxisEvent paxis() {
        return npaxis(address());
    }

    public SDL_RenderEvent render() {
        return nrender(address());
    }

    public SDL_DropEvent drop() {
        return ndrop(address());
    }

    public SDL_ClipboardEvent clipboard() {
        return nclipboard(address());
    }

    public SDL_Event type(@NativeType("Uint32") int value) {
        ntype(address(), value);
        return this;
    }

    public SDL_Event common(SDL_CommonEvent value) {
        ncommon(address(), value);
        return this;
    }

    public SDL_Event common(Consumer<SDL_CommonEvent> consumer) {
        consumer.accept(common());
        return this;
    }

    public SDL_Event display(SDL_DisplayEvent value) {
        ndisplay(address(), value);
        return this;
    }

    public SDL_Event display(Consumer<SDL_DisplayEvent> consumer) {
        consumer.accept(display());
        return this;
    }

    public SDL_Event window(SDL_WindowEvent value) {
        nwindow(address(), value);
        return this;
    }

    public SDL_Event window(Consumer<SDL_WindowEvent> consumer) {
        consumer.accept(window());
        return this;
    }

    public SDL_Event kdevice(SDL_KeyboardDeviceEvent value) {
        nkdevice(address(), value);
        return this;
    }

    public SDL_Event kdevice(Consumer<SDL_KeyboardDeviceEvent> consumer) {
        consumer.accept(kdevice());
        return this;
    }

    public SDL_Event key(SDL_KeyboardEvent value) {
        nkey(address(), value);
        return this;
    }

    public SDL_Event key(Consumer<SDL_KeyboardEvent> consumer) {
        consumer.accept(key());
        return this;
    }

    public SDL_Event edit(SDL_TextEditingEvent value) {
        nedit(address(), value);
        return this;
    }

    public SDL_Event edit(Consumer<SDL_TextEditingEvent> consumer) {
        consumer.accept(edit());
        return this;
    }

    public SDL_Event edit_candidates(SDL_TextEditingCandidatesEvent value) {
        nedit_candidates(address(), value);
        return this;
    }

    public SDL_Event edit_candidates(Consumer<SDL_TextEditingCandidatesEvent> consumer) {
        consumer.accept(edit_candidates());
        return this;
    }

    public SDL_Event text(SDL_TextInputEvent value) {
        ntext(address(), value);
        return this;
    }

    public SDL_Event text(Consumer<SDL_TextInputEvent> consumer) {
        consumer.accept(text());
        return this;
    }

    public SDL_Event mdevice(SDL_MouseDeviceEvent value) {
        nmdevice(address(), value);
        return this;
    }

    public SDL_Event mdevice(Consumer<SDL_MouseDeviceEvent> consumer) {
        consumer.accept(mdevice());
        return this;
    }

    public SDL_Event motion(SDL_MouseMotionEvent value) {
        nmotion(address(), value);
        return this;
    }

    public SDL_Event motion(Consumer<SDL_MouseMotionEvent> consumer) {
        consumer.accept(motion());
        return this;
    }

    public SDL_Event button(SDL_MouseButtonEvent value) {
        nbutton(address(), value);
        return this;
    }

    public SDL_Event button(Consumer<SDL_MouseButtonEvent> consumer) {
        consumer.accept(button());
        return this;
    }

    public SDL_Event wheel(SDL_MouseWheelEvent value) {
        nwheel(address(), value);
        return this;
    }

    public SDL_Event wheel(Consumer<SDL_MouseWheelEvent> consumer) {
        consumer.accept(wheel());
        return this;
    }

    public SDL_Event jdevice(SDL_JoyDeviceEvent value) {
        njdevice(address(), value);
        return this;
    }

    public SDL_Event jdevice(Consumer<SDL_JoyDeviceEvent> consumer) {
        consumer.accept(jdevice());
        return this;
    }

    public SDL_Event jaxis(SDL_JoyAxisEvent value) {
        njaxis(address(), value);
        return this;
    }

    public SDL_Event jaxis(Consumer<SDL_JoyAxisEvent> consumer) {
        consumer.accept(jaxis());
        return this;
    }

    public SDL_Event jball(SDL_JoyBallEvent value) {
        njball(address(), value);
        return this;
    }

    public SDL_Event jball(Consumer<SDL_JoyBallEvent> consumer) {
        consumer.accept(jball());
        return this;
    }

    public SDL_Event jhat(SDL_JoyHatEvent value) {
        njhat(address(), value);
        return this;
    }

    public SDL_Event jhat(Consumer<SDL_JoyHatEvent> consumer) {
        consumer.accept(jhat());
        return this;
    }

    public SDL_Event jbutton(SDL_JoyButtonEvent value) {
        njbutton(address(), value);
        return this;
    }

    public SDL_Event jbutton(Consumer<SDL_JoyButtonEvent> consumer) {
        consumer.accept(jbutton());
        return this;
    }

    public SDL_Event jbattery(SDL_JoyBatteryEvent value) {
        njbattery(address(), value);
        return this;
    }

    public SDL_Event jbattery(Consumer<SDL_JoyBatteryEvent> consumer) {
        consumer.accept(jbattery());
        return this;
    }

    public SDL_Event gdevice(SDL_GamepadDeviceEvent value) {
        ngdevice(address(), value);
        return this;
    }

    public SDL_Event gdevice(Consumer<SDL_GamepadDeviceEvent> consumer) {
        consumer.accept(gdevice());
        return this;
    }

    public SDL_Event gaxis(SDL_GamepadAxisEvent value) {
        ngaxis(address(), value);
        return this;
    }

    public SDL_Event gaxis(Consumer<SDL_GamepadAxisEvent> consumer) {
        consumer.accept(gaxis());
        return this;
    }

    public SDL_Event gbutton(SDL_GamepadButtonEvent value) {
        ngbutton(address(), value);
        return this;
    }

    public SDL_Event gbutton(Consumer<SDL_GamepadButtonEvent> consumer) {
        consumer.accept(gbutton());
        return this;
    }

    public SDL_Event gtouchpad(SDL_GamepadTouchpadEvent value) {
        ngtouchpad(address(), value);
        return this;
    }

    public SDL_Event gtouchpad(Consumer<SDL_GamepadTouchpadEvent> consumer) {
        consumer.accept(gtouchpad());
        return this;
    }

    public SDL_Event gsensor(SDL_GamepadSensorEvent value) {
        ngsensor(address(), value);
        return this;
    }

    public SDL_Event gsensor(Consumer<SDL_GamepadSensorEvent> consumer) {
        consumer.accept(gsensor());
        return this;
    }

    public SDL_Event adevice(SDL_AudioDeviceEvent value) {
        nadevice(address(), value);
        return this;
    }

    public SDL_Event adevice(Consumer<SDL_AudioDeviceEvent> consumer) {
        consumer.accept(adevice());
        return this;
    }

    public SDL_Event cdevice(SDL_CameraDeviceEvent value) {
        ncdevice(address(), value);
        return this;
    }

    public SDL_Event cdevice(Consumer<SDL_CameraDeviceEvent> consumer) {
        consumer.accept(cdevice());
        return this;
    }

    public SDL_Event sensor(SDL_SensorEvent value) {
        nsensor(address(), value);
        return this;
    }

    public SDL_Event sensor(Consumer<SDL_SensorEvent> consumer) {
        consumer.accept(sensor());
        return this;
    }

    public SDL_Event quit(SDL_QuitEvent value) {
        nquit(address(), value);
        return this;
    }

    public SDL_Event quit(Consumer<SDL_QuitEvent> consumer) {
        consumer.accept(quit());
        return this;
    }

    public SDL_Event user(SDL_UserEvent value) {
        nuser(address(), value);
        return this;
    }

    public SDL_Event user(Consumer<SDL_UserEvent> consumer) {
        consumer.accept(user());
        return this;
    }

    public SDL_Event tfinger(SDL_TouchFingerEvent value) {
        ntfinger(address(), value);
        return this;
    }

    public SDL_Event tfinger(Consumer<SDL_TouchFingerEvent> consumer) {
        consumer.accept(tfinger());
        return this;
    }

    public SDL_Event pinch(SDL_PinchFingerEvent value) {
        npinch(address(), value);
        return this;
    }

    public SDL_Event pinch(Consumer<SDL_PinchFingerEvent> consumer) {
        consumer.accept(pinch());
        return this;
    }

    public SDL_Event pproximity(SDL_PenProximityEvent value) {
        npproximity(address(), value);
        return this;
    }

    public SDL_Event pproximity(Consumer<SDL_PenProximityEvent> consumer) {
        consumer.accept(pproximity());
        return this;
    }

    public SDL_Event ptouch(SDL_PenTouchEvent value) {
        nptouch(address(), value);
        return this;
    }

    public SDL_Event ptouch(Consumer<SDL_PenTouchEvent> consumer) {
        consumer.accept(ptouch());
        return this;
    }

    public SDL_Event pmotion(SDL_PenMotionEvent value) {
        npmotion(address(), value);
        return this;
    }

    public SDL_Event pmotion(Consumer<SDL_PenMotionEvent> consumer) {
        consumer.accept(pmotion());
        return this;
    }

    public SDL_Event pbutton(SDL_PenButtonEvent value) {
        npbutton(address(), value);
        return this;
    }

    public SDL_Event pbutton(Consumer<SDL_PenButtonEvent> consumer) {
        consumer.accept(pbutton());
        return this;
    }

    public SDL_Event paxis(SDL_PenAxisEvent value) {
        npaxis(address(), value);
        return this;
    }

    public SDL_Event paxis(Consumer<SDL_PenAxisEvent> consumer) {
        consumer.accept(paxis());
        return this;
    }

    public SDL_Event render(SDL_RenderEvent value) {
        nrender(address(), value);
        return this;
    }

    public SDL_Event render(Consumer<SDL_RenderEvent> consumer) {
        consumer.accept(render());
        return this;
    }

    public SDL_Event drop(SDL_DropEvent value) {
        ndrop(address(), value);
        return this;
    }

    public SDL_Event drop(Consumer<SDL_DropEvent> consumer) {
        consumer.accept(drop());
        return this;
    }

    public SDL_Event clipboard(SDL_ClipboardEvent value) {
        nclipboard(address(), value);
        return this;
    }

    public SDL_Event clipboard(Consumer<SDL_ClipboardEvent> consumer) {
        consumer.accept(clipboard());
        return this;
    }

    public SDL_Event set(SDL_Event src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static SDL_Event malloc() {
        return new SDL_Event(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static SDL_Event calloc() {
        return new SDL_Event(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static SDL_Event create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new SDL_Event(MemoryUtil.memAddress(container), container);
    }

    public static SDL_Event create(long address) {
        return new SDL_Event(address, null);
    }

    public static SDL_Event createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new SDL_Event(address, null);
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

    public static SDL_Event malloc(MemoryStack stack) {
        return new SDL_Event(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static SDL_Event calloc(MemoryStack stack) {
        return new SDL_Event(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static int ntype(long struct) {
        return MemoryUtil.memGetInt(struct + TYPE);
    }

    public static SDL_CommonEvent ncommon(long struct) {
        return SDL_CommonEvent.create(struct + COMMON);
    }

    public static SDL_DisplayEvent ndisplay(long struct) {
        return SDL_DisplayEvent.create(struct + DISPLAY);
    }

    public static SDL_WindowEvent nwindow(long struct) {
        return SDL_WindowEvent.create(struct + WINDOW);
    }

    public static SDL_KeyboardDeviceEvent nkdevice(long struct) {
        return SDL_KeyboardDeviceEvent.create(struct + KDEVICE);
    }

    public static SDL_KeyboardEvent nkey(long struct) {
        return SDL_KeyboardEvent.create(struct + KEY);
    }

    public static SDL_TextEditingEvent nedit(long struct) {
        return SDL_TextEditingEvent.create(struct + EDIT);
    }

    public static SDL_TextEditingCandidatesEvent nedit_candidates(long struct) {
        return SDL_TextEditingCandidatesEvent.create(struct + EDIT_CANDIDATES);
    }

    public static SDL_TextInputEvent ntext(long struct) {
        return SDL_TextInputEvent.create(struct + TEXT);
    }

    public static SDL_MouseDeviceEvent nmdevice(long struct) {
        return SDL_MouseDeviceEvent.create(struct + MDEVICE);
    }

    public static SDL_MouseMotionEvent nmotion(long struct) {
        return SDL_MouseMotionEvent.create(struct + MOTION);
    }

    public static SDL_MouseButtonEvent nbutton(long struct) {
        return SDL_MouseButtonEvent.create(struct + BUTTON);
    }

    public static SDL_MouseWheelEvent nwheel(long struct) {
        return SDL_MouseWheelEvent.create(struct + WHEEL);
    }

    public static SDL_JoyDeviceEvent njdevice(long struct) {
        return SDL_JoyDeviceEvent.create(struct + JDEVICE);
    }

    public static SDL_JoyAxisEvent njaxis(long struct) {
        return SDL_JoyAxisEvent.create(struct + JAXIS);
    }

    public static SDL_JoyBallEvent njball(long struct) {
        return SDL_JoyBallEvent.create(struct + JBALL);
    }

    public static SDL_JoyHatEvent njhat(long struct) {
        return SDL_JoyHatEvent.create(struct + JHAT);
    }

    public static SDL_JoyButtonEvent njbutton(long struct) {
        return SDL_JoyButtonEvent.create(struct + JBUTTON);
    }

    public static SDL_JoyBatteryEvent njbattery(long struct) {
        return SDL_JoyBatteryEvent.create(struct + JBATTERY);
    }

    public static SDL_GamepadDeviceEvent ngdevice(long struct) {
        return SDL_GamepadDeviceEvent.create(struct + GDEVICE);
    }

    public static SDL_GamepadAxisEvent ngaxis(long struct) {
        return SDL_GamepadAxisEvent.create(struct + GAXIS);
    }

    public static SDL_GamepadButtonEvent ngbutton(long struct) {
        return SDL_GamepadButtonEvent.create(struct + GBUTTON);
    }

    public static SDL_GamepadTouchpadEvent ngtouchpad(long struct) {
        return SDL_GamepadTouchpadEvent.create(struct + GTOUCHPAD);
    }

    public static SDL_GamepadSensorEvent ngsensor(long struct) {
        return SDL_GamepadSensorEvent.create(struct + GSENSOR);
    }

    public static SDL_AudioDeviceEvent nadevice(long struct) {
        return SDL_AudioDeviceEvent.create(struct + ADEVICE);
    }

    public static SDL_CameraDeviceEvent ncdevice(long struct) {
        return SDL_CameraDeviceEvent.create(struct + CDEVICE);
    }

    public static SDL_SensorEvent nsensor(long struct) {
        return SDL_SensorEvent.create(struct + SENSOR);
    }

    public static SDL_QuitEvent nquit(long struct) {
        return SDL_QuitEvent.create(struct + QUIT);
    }

    public static SDL_UserEvent nuser(long struct) {
        return SDL_UserEvent.create(struct + USER);
    }

    public static SDL_TouchFingerEvent ntfinger(long struct) {
        return SDL_TouchFingerEvent.create(struct + TFINGER);
    }

    public static SDL_PinchFingerEvent npinch(long struct) {
        return SDL_PinchFingerEvent.create(struct + PINCH);
    }

    public static SDL_PenProximityEvent npproximity(long struct) {
        return SDL_PenProximityEvent.create(struct + PPROXIMITY);
    }

    public static SDL_PenTouchEvent nptouch(long struct) {
        return SDL_PenTouchEvent.create(struct + PTOUCH);
    }

    public static SDL_PenMotionEvent npmotion(long struct) {
        return SDL_PenMotionEvent.create(struct + PMOTION);
    }

    public static SDL_PenButtonEvent npbutton(long struct) {
        return SDL_PenButtonEvent.create(struct + PBUTTON);
    }

    public static SDL_PenAxisEvent npaxis(long struct) {
        return SDL_PenAxisEvent.create(struct + PAXIS);
    }

    public static SDL_RenderEvent nrender(long struct) {
        return SDL_RenderEvent.create(struct + RENDER);
    }

    public static SDL_DropEvent ndrop(long struct) {
        return SDL_DropEvent.create(struct + DROP);
    }

    public static SDL_ClipboardEvent nclipboard(long struct) {
        return SDL_ClipboardEvent.create(struct + CLIPBOARD);
    }

    public static ByteBuffer npadding(long struct) {
        return MemoryUtil.memByteBuffer(struct + PADDING, 128);
    }

    public static byte npadding(long struct, int index) {
        return MemoryUtil.memGetByte(struct + PADDING + (Checks.check(index, 128) * 1));
    }

    public static void ntype(long struct, int value) {
        MemoryUtil.memPutInt(struct + TYPE, value);
    }

    public static void ncommon(long struct, SDL_CommonEvent value) {
        MemoryUtil.memCopy(value.address(), struct + COMMON, SDL_CommonEvent.SIZEOF);
    }

    public static void ndisplay(long struct, SDL_DisplayEvent value) {
        MemoryUtil.memCopy(value.address(), struct + DISPLAY, SDL_DisplayEvent.SIZEOF);
    }

    public static void nwindow(long struct, SDL_WindowEvent value) {
        MemoryUtil.memCopy(value.address(), struct + WINDOW, SDL_WindowEvent.SIZEOF);
    }

    public static void nkdevice(long struct, SDL_KeyboardDeviceEvent value) {
        MemoryUtil.memCopy(value.address(), struct + KDEVICE, SDL_KeyboardDeviceEvent.SIZEOF);
    }

    public static void nkey(long struct, SDL_KeyboardEvent value) {
        MemoryUtil.memCopy(value.address(), struct + KEY, SDL_KeyboardEvent.SIZEOF);
    }

    public static void nedit(long struct, SDL_TextEditingEvent value) {
        MemoryUtil.memCopy(value.address(), struct + EDIT, SDL_TextEditingEvent.SIZEOF);
    }

    public static void nedit_candidates(long struct, SDL_TextEditingCandidatesEvent value) {
        MemoryUtil.memCopy(value.address(), struct + EDIT_CANDIDATES, SDL_TextEditingCandidatesEvent.SIZEOF);
    }

    public static void ntext(long struct, SDL_TextInputEvent value) {
        MemoryUtil.memCopy(value.address(), struct + TEXT, SDL_TextInputEvent.SIZEOF);
    }

    public static void nmdevice(long struct, SDL_MouseDeviceEvent value) {
        MemoryUtil.memCopy(value.address(), struct + MDEVICE, SDL_MouseDeviceEvent.SIZEOF);
    }

    public static void nmotion(long struct, SDL_MouseMotionEvent value) {
        MemoryUtil.memCopy(value.address(), struct + MOTION, SDL_MouseMotionEvent.SIZEOF);
    }

    public static void nbutton(long struct, SDL_MouseButtonEvent value) {
        MemoryUtil.memCopy(value.address(), struct + BUTTON, SDL_MouseButtonEvent.SIZEOF);
    }

    public static void nwheel(long struct, SDL_MouseWheelEvent value) {
        MemoryUtil.memCopy(value.address(), struct + WHEEL, SDL_MouseWheelEvent.SIZEOF);
    }

    public static void njdevice(long struct, SDL_JoyDeviceEvent value) {
        MemoryUtil.memCopy(value.address(), struct + JDEVICE, SDL_JoyDeviceEvent.SIZEOF);
    }

    public static void njaxis(long struct, SDL_JoyAxisEvent value) {
        MemoryUtil.memCopy(value.address(), struct + JAXIS, SDL_JoyAxisEvent.SIZEOF);
    }

    public static void njball(long struct, SDL_JoyBallEvent value) {
        MemoryUtil.memCopy(value.address(), struct + JBALL, SDL_JoyBallEvent.SIZEOF);
    }

    public static void njhat(long struct, SDL_JoyHatEvent value) {
        MemoryUtil.memCopy(value.address(), struct + JHAT, SDL_JoyHatEvent.SIZEOF);
    }

    public static void njbutton(long struct, SDL_JoyButtonEvent value) {
        MemoryUtil.memCopy(value.address(), struct + JBUTTON, SDL_JoyButtonEvent.SIZEOF);
    }

    public static void njbattery(long struct, SDL_JoyBatteryEvent value) {
        MemoryUtil.memCopy(value.address(), struct + JBATTERY, SDL_JoyBatteryEvent.SIZEOF);
    }

    public static void ngdevice(long struct, SDL_GamepadDeviceEvent value) {
        MemoryUtil.memCopy(value.address(), struct + GDEVICE, SDL_GamepadDeviceEvent.SIZEOF);
    }

    public static void ngaxis(long struct, SDL_GamepadAxisEvent value) {
        MemoryUtil.memCopy(value.address(), struct + GAXIS, SDL_GamepadAxisEvent.SIZEOF);
    }

    public static void ngbutton(long struct, SDL_GamepadButtonEvent value) {
        MemoryUtil.memCopy(value.address(), struct + GBUTTON, SDL_GamepadButtonEvent.SIZEOF);
    }

    public static void ngtouchpad(long struct, SDL_GamepadTouchpadEvent value) {
        MemoryUtil.memCopy(value.address(), struct + GTOUCHPAD, SDL_GamepadTouchpadEvent.SIZEOF);
    }

    public static void ngsensor(long struct, SDL_GamepadSensorEvent value) {
        MemoryUtil.memCopy(value.address(), struct + GSENSOR, SDL_GamepadSensorEvent.SIZEOF);
    }

    public static void nadevice(long struct, SDL_AudioDeviceEvent value) {
        MemoryUtil.memCopy(value.address(), struct + ADEVICE, SDL_AudioDeviceEvent.SIZEOF);
    }

    public static void ncdevice(long struct, SDL_CameraDeviceEvent value) {
        MemoryUtil.memCopy(value.address(), struct + CDEVICE, SDL_CameraDeviceEvent.SIZEOF);
    }

    public static void nsensor(long struct, SDL_SensorEvent value) {
        MemoryUtil.memCopy(value.address(), struct + SENSOR, SDL_SensorEvent.SIZEOF);
    }

    public static void nquit(long struct, SDL_QuitEvent value) {
        MemoryUtil.memCopy(value.address(), struct + QUIT, SDL_QuitEvent.SIZEOF);
    }

    public static void nuser(long struct, SDL_UserEvent value) {
        MemoryUtil.memCopy(value.address(), struct + USER, SDL_UserEvent.SIZEOF);
    }

    public static void ntfinger(long struct, SDL_TouchFingerEvent value) {
        MemoryUtil.memCopy(value.address(), struct + TFINGER, SDL_TouchFingerEvent.SIZEOF);
    }

    public static void npinch(long struct, SDL_PinchFingerEvent value) {
        MemoryUtil.memCopy(value.address(), struct + PINCH, SDL_PinchFingerEvent.SIZEOF);
    }

    public static void npproximity(long struct, SDL_PenProximityEvent value) {
        MemoryUtil.memCopy(value.address(), struct + PPROXIMITY, SDL_PenProximityEvent.SIZEOF);
    }

    public static void nptouch(long struct, SDL_PenTouchEvent value) {
        MemoryUtil.memCopy(value.address(), struct + PTOUCH, SDL_PenTouchEvent.SIZEOF);
    }

    public static void npmotion(long struct, SDL_PenMotionEvent value) {
        MemoryUtil.memCopy(value.address(), struct + PMOTION, SDL_PenMotionEvent.SIZEOF);
    }

    public static void npbutton(long struct, SDL_PenButtonEvent value) {
        MemoryUtil.memCopy(value.address(), struct + PBUTTON, SDL_PenButtonEvent.SIZEOF);
    }

    public static void npaxis(long struct, SDL_PenAxisEvent value) {
        MemoryUtil.memCopy(value.address(), struct + PAXIS, SDL_PenAxisEvent.SIZEOF);
    }

    public static void nrender(long struct, SDL_RenderEvent value) {
        MemoryUtil.memCopy(value.address(), struct + RENDER, SDL_RenderEvent.SIZEOF);
    }

    public static void ndrop(long struct, SDL_DropEvent value) {
        MemoryUtil.memCopy(value.address(), struct + DROP, SDL_DropEvent.SIZEOF);
    }

    public static void nclipboard(long struct, SDL_ClipboardEvent value) {
        MemoryUtil.memCopy(value.address(), struct + CLIPBOARD, SDL_ClipboardEvent.SIZEOF);
    }

    public static void npadding(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 128);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + PADDING, value.remaining() * 1);
    }

    public static void npadding(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + PADDING + (Checks.check(index, 128) * 1), value);
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDL_Event$Buffer.class */
    public static class Buffer extends StructBuffer<SDL_Event, Buffer> implements NativeResource {
        private static final SDL_Event ELEMENT_FACTORY = SDL_Event.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SDL_Event.SIZEOF);
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
        public SDL_Event getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("Uint32")
        public int type() {
            return SDL_Event.ntype(address());
        }

        public SDL_CommonEvent common() {
            return SDL_Event.ncommon(address());
        }

        public SDL_DisplayEvent display() {
            return SDL_Event.ndisplay(address());
        }

        public SDL_WindowEvent window() {
            return SDL_Event.nwindow(address());
        }

        public SDL_KeyboardDeviceEvent kdevice() {
            return SDL_Event.nkdevice(address());
        }

        public SDL_KeyboardEvent key() {
            return SDL_Event.nkey(address());
        }

        public SDL_TextEditingEvent edit() {
            return SDL_Event.nedit(address());
        }

        public SDL_TextEditingCandidatesEvent edit_candidates() {
            return SDL_Event.nedit_candidates(address());
        }

        public SDL_TextInputEvent text() {
            return SDL_Event.ntext(address());
        }

        public SDL_MouseDeviceEvent mdevice() {
            return SDL_Event.nmdevice(address());
        }

        public SDL_MouseMotionEvent motion() {
            return SDL_Event.nmotion(address());
        }

        public SDL_MouseButtonEvent button() {
            return SDL_Event.nbutton(address());
        }

        public SDL_MouseWheelEvent wheel() {
            return SDL_Event.nwheel(address());
        }

        public SDL_JoyDeviceEvent jdevice() {
            return SDL_Event.njdevice(address());
        }

        public SDL_JoyAxisEvent jaxis() {
            return SDL_Event.njaxis(address());
        }

        public SDL_JoyBallEvent jball() {
            return SDL_Event.njball(address());
        }

        public SDL_JoyHatEvent jhat() {
            return SDL_Event.njhat(address());
        }

        public SDL_JoyButtonEvent jbutton() {
            return SDL_Event.njbutton(address());
        }

        public SDL_JoyBatteryEvent jbattery() {
            return SDL_Event.njbattery(address());
        }

        public SDL_GamepadDeviceEvent gdevice() {
            return SDL_Event.ngdevice(address());
        }

        public SDL_GamepadAxisEvent gaxis() {
            return SDL_Event.ngaxis(address());
        }

        public SDL_GamepadButtonEvent gbutton() {
            return SDL_Event.ngbutton(address());
        }

        public SDL_GamepadTouchpadEvent gtouchpad() {
            return SDL_Event.ngtouchpad(address());
        }

        public SDL_GamepadSensorEvent gsensor() {
            return SDL_Event.ngsensor(address());
        }

        public SDL_AudioDeviceEvent adevice() {
            return SDL_Event.nadevice(address());
        }

        public SDL_CameraDeviceEvent cdevice() {
            return SDL_Event.ncdevice(address());
        }

        public SDL_SensorEvent sensor() {
            return SDL_Event.nsensor(address());
        }

        public SDL_QuitEvent quit() {
            return SDL_Event.nquit(address());
        }

        public SDL_UserEvent user() {
            return SDL_Event.nuser(address());
        }

        public SDL_TouchFingerEvent tfinger() {
            return SDL_Event.ntfinger(address());
        }

        public SDL_PinchFingerEvent pinch() {
            return SDL_Event.npinch(address());
        }

        public SDL_PenProximityEvent pproximity() {
            return SDL_Event.npproximity(address());
        }

        public SDL_PenTouchEvent ptouch() {
            return SDL_Event.nptouch(address());
        }

        public SDL_PenMotionEvent pmotion() {
            return SDL_Event.npmotion(address());
        }

        public SDL_PenButtonEvent pbutton() {
            return SDL_Event.npbutton(address());
        }

        public SDL_PenAxisEvent paxis() {
            return SDL_Event.npaxis(address());
        }

        public SDL_RenderEvent render() {
            return SDL_Event.nrender(address());
        }

        public SDL_DropEvent drop() {
            return SDL_Event.ndrop(address());
        }

        public SDL_ClipboardEvent clipboard() {
            return SDL_Event.nclipboard(address());
        }

        public Buffer type(@NativeType("Uint32") int value) {
            SDL_Event.ntype(address(), value);
            return this;
        }

        public Buffer common(SDL_CommonEvent value) {
            SDL_Event.ncommon(address(), value);
            return this;
        }

        public Buffer common(Consumer<SDL_CommonEvent> consumer) {
            consumer.accept(common());
            return this;
        }

        public Buffer display(SDL_DisplayEvent value) {
            SDL_Event.ndisplay(address(), value);
            return this;
        }

        public Buffer display(Consumer<SDL_DisplayEvent> consumer) {
            consumer.accept(display());
            return this;
        }

        public Buffer window(SDL_WindowEvent value) {
            SDL_Event.nwindow(address(), value);
            return this;
        }

        public Buffer window(Consumer<SDL_WindowEvent> consumer) {
            consumer.accept(window());
            return this;
        }

        public Buffer kdevice(SDL_KeyboardDeviceEvent value) {
            SDL_Event.nkdevice(address(), value);
            return this;
        }

        public Buffer kdevice(Consumer<SDL_KeyboardDeviceEvent> consumer) {
            consumer.accept(kdevice());
            return this;
        }

        public Buffer key(SDL_KeyboardEvent value) {
            SDL_Event.nkey(address(), value);
            return this;
        }

        public Buffer key(Consumer<SDL_KeyboardEvent> consumer) {
            consumer.accept(key());
            return this;
        }

        public Buffer edit(SDL_TextEditingEvent value) {
            SDL_Event.nedit(address(), value);
            return this;
        }

        public Buffer edit(Consumer<SDL_TextEditingEvent> consumer) {
            consumer.accept(edit());
            return this;
        }

        public Buffer edit_candidates(SDL_TextEditingCandidatesEvent value) {
            SDL_Event.nedit_candidates(address(), value);
            return this;
        }

        public Buffer edit_candidates(Consumer<SDL_TextEditingCandidatesEvent> consumer) {
            consumer.accept(edit_candidates());
            return this;
        }

        public Buffer text(SDL_TextInputEvent value) {
            SDL_Event.ntext(address(), value);
            return this;
        }

        public Buffer text(Consumer<SDL_TextInputEvent> consumer) {
            consumer.accept(text());
            return this;
        }

        public Buffer mdevice(SDL_MouseDeviceEvent value) {
            SDL_Event.nmdevice(address(), value);
            return this;
        }

        public Buffer mdevice(Consumer<SDL_MouseDeviceEvent> consumer) {
            consumer.accept(mdevice());
            return this;
        }

        public Buffer motion(SDL_MouseMotionEvent value) {
            SDL_Event.nmotion(address(), value);
            return this;
        }

        public Buffer motion(Consumer<SDL_MouseMotionEvent> consumer) {
            consumer.accept(motion());
            return this;
        }

        public Buffer button(SDL_MouseButtonEvent value) {
            SDL_Event.nbutton(address(), value);
            return this;
        }

        public Buffer button(Consumer<SDL_MouseButtonEvent> consumer) {
            consumer.accept(button());
            return this;
        }

        public Buffer wheel(SDL_MouseWheelEvent value) {
            SDL_Event.nwheel(address(), value);
            return this;
        }

        public Buffer wheel(Consumer<SDL_MouseWheelEvent> consumer) {
            consumer.accept(wheel());
            return this;
        }

        public Buffer jdevice(SDL_JoyDeviceEvent value) {
            SDL_Event.njdevice(address(), value);
            return this;
        }

        public Buffer jdevice(Consumer<SDL_JoyDeviceEvent> consumer) {
            consumer.accept(jdevice());
            return this;
        }

        public Buffer jaxis(SDL_JoyAxisEvent value) {
            SDL_Event.njaxis(address(), value);
            return this;
        }

        public Buffer jaxis(Consumer<SDL_JoyAxisEvent> consumer) {
            consumer.accept(jaxis());
            return this;
        }

        public Buffer jball(SDL_JoyBallEvent value) {
            SDL_Event.njball(address(), value);
            return this;
        }

        public Buffer jball(Consumer<SDL_JoyBallEvent> consumer) {
            consumer.accept(jball());
            return this;
        }

        public Buffer jhat(SDL_JoyHatEvent value) {
            SDL_Event.njhat(address(), value);
            return this;
        }

        public Buffer jhat(Consumer<SDL_JoyHatEvent> consumer) {
            consumer.accept(jhat());
            return this;
        }

        public Buffer jbutton(SDL_JoyButtonEvent value) {
            SDL_Event.njbutton(address(), value);
            return this;
        }

        public Buffer jbutton(Consumer<SDL_JoyButtonEvent> consumer) {
            consumer.accept(jbutton());
            return this;
        }

        public Buffer jbattery(SDL_JoyBatteryEvent value) {
            SDL_Event.njbattery(address(), value);
            return this;
        }

        public Buffer jbattery(Consumer<SDL_JoyBatteryEvent> consumer) {
            consumer.accept(jbattery());
            return this;
        }

        public Buffer gdevice(SDL_GamepadDeviceEvent value) {
            SDL_Event.ngdevice(address(), value);
            return this;
        }

        public Buffer gdevice(Consumer<SDL_GamepadDeviceEvent> consumer) {
            consumer.accept(gdevice());
            return this;
        }

        public Buffer gaxis(SDL_GamepadAxisEvent value) {
            SDL_Event.ngaxis(address(), value);
            return this;
        }

        public Buffer gaxis(Consumer<SDL_GamepadAxisEvent> consumer) {
            consumer.accept(gaxis());
            return this;
        }

        public Buffer gbutton(SDL_GamepadButtonEvent value) {
            SDL_Event.ngbutton(address(), value);
            return this;
        }

        public Buffer gbutton(Consumer<SDL_GamepadButtonEvent> consumer) {
            consumer.accept(gbutton());
            return this;
        }

        public Buffer gtouchpad(SDL_GamepadTouchpadEvent value) {
            SDL_Event.ngtouchpad(address(), value);
            return this;
        }

        public Buffer gtouchpad(Consumer<SDL_GamepadTouchpadEvent> consumer) {
            consumer.accept(gtouchpad());
            return this;
        }

        public Buffer gsensor(SDL_GamepadSensorEvent value) {
            SDL_Event.ngsensor(address(), value);
            return this;
        }

        public Buffer gsensor(Consumer<SDL_GamepadSensorEvent> consumer) {
            consumer.accept(gsensor());
            return this;
        }

        public Buffer adevice(SDL_AudioDeviceEvent value) {
            SDL_Event.nadevice(address(), value);
            return this;
        }

        public Buffer adevice(Consumer<SDL_AudioDeviceEvent> consumer) {
            consumer.accept(adevice());
            return this;
        }

        public Buffer cdevice(SDL_CameraDeviceEvent value) {
            SDL_Event.ncdevice(address(), value);
            return this;
        }

        public Buffer cdevice(Consumer<SDL_CameraDeviceEvent> consumer) {
            consumer.accept(cdevice());
            return this;
        }

        public Buffer sensor(SDL_SensorEvent value) {
            SDL_Event.nsensor(address(), value);
            return this;
        }

        public Buffer sensor(Consumer<SDL_SensorEvent> consumer) {
            consumer.accept(sensor());
            return this;
        }

        public Buffer quit(SDL_QuitEvent value) {
            SDL_Event.nquit(address(), value);
            return this;
        }

        public Buffer quit(Consumer<SDL_QuitEvent> consumer) {
            consumer.accept(quit());
            return this;
        }

        public Buffer user(SDL_UserEvent value) {
            SDL_Event.nuser(address(), value);
            return this;
        }

        public Buffer user(Consumer<SDL_UserEvent> consumer) {
            consumer.accept(user());
            return this;
        }

        public Buffer tfinger(SDL_TouchFingerEvent value) {
            SDL_Event.ntfinger(address(), value);
            return this;
        }

        public Buffer tfinger(Consumer<SDL_TouchFingerEvent> consumer) {
            consumer.accept(tfinger());
            return this;
        }

        public Buffer pinch(SDL_PinchFingerEvent value) {
            SDL_Event.npinch(address(), value);
            return this;
        }

        public Buffer pinch(Consumer<SDL_PinchFingerEvent> consumer) {
            consumer.accept(pinch());
            return this;
        }

        public Buffer pproximity(SDL_PenProximityEvent value) {
            SDL_Event.npproximity(address(), value);
            return this;
        }

        public Buffer pproximity(Consumer<SDL_PenProximityEvent> consumer) {
            consumer.accept(pproximity());
            return this;
        }

        public Buffer ptouch(SDL_PenTouchEvent value) {
            SDL_Event.nptouch(address(), value);
            return this;
        }

        public Buffer ptouch(Consumer<SDL_PenTouchEvent> consumer) {
            consumer.accept(ptouch());
            return this;
        }

        public Buffer pmotion(SDL_PenMotionEvent value) {
            SDL_Event.npmotion(address(), value);
            return this;
        }

        public Buffer pmotion(Consumer<SDL_PenMotionEvent> consumer) {
            consumer.accept(pmotion());
            return this;
        }

        public Buffer pbutton(SDL_PenButtonEvent value) {
            SDL_Event.npbutton(address(), value);
            return this;
        }

        public Buffer pbutton(Consumer<SDL_PenButtonEvent> consumer) {
            consumer.accept(pbutton());
            return this;
        }

        public Buffer paxis(SDL_PenAxisEvent value) {
            SDL_Event.npaxis(address(), value);
            return this;
        }

        public Buffer paxis(Consumer<SDL_PenAxisEvent> consumer) {
            consumer.accept(paxis());
            return this;
        }

        public Buffer render(SDL_RenderEvent value) {
            SDL_Event.nrender(address(), value);
            return this;
        }

        public Buffer render(Consumer<SDL_RenderEvent> consumer) {
            consumer.accept(render());
            return this;
        }

        public Buffer drop(SDL_DropEvent value) {
            SDL_Event.ndrop(address(), value);
            return this;
        }

        public Buffer drop(Consumer<SDL_DropEvent> consumer) {
            consumer.accept(drop());
            return this;
        }

        public Buffer clipboard(SDL_ClipboardEvent value) {
            SDL_Event.nclipboard(address(), value);
            return this;
        }

        public Buffer clipboard(Consumer<SDL_ClipboardEvent> consumer) {
            consumer.accept(clipboard());
            return this;
        }
    }
}
