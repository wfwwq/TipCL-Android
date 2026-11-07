package com.tungsten.fclauncher.keycodes;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.util.Arrays;
import org.lwjgl.glfw.CallbackBridge;

/* loaded from: classes12.dex */
public class EfficientAndroidLWJGLKeycode {
    private static final int KEYCODE_COUNT = 112;
    private static final char[] buffer;
    private static final KeyCharacterMap mKcm;
    private static final int[] sAndroidKeycodes = new int[112];
    private static final short[] sLwjglKeycodes = new short[112];
    private static int mTmpCount = 0;

    static {
        add(0, (short) 0);
        add(3, LwjglGlfwKeycode.KEY_HOME);
        add(4, LwjglGlfwKeycode.KEY_ESCAPE);
        add(7, (short) 48);
        add(8, (short) 49);
        add(9, (short) 50);
        add(10, (short) 51);
        add(11, (short) 52);
        add(12, (short) 53);
        add(13, (short) 54);
        add(14, (short) 55);
        add(15, (short) 56);
        add(16, (short) 57);
        add(18, (short) 51);
        add(19, LwjglGlfwKeycode.KEY_UP);
        add(20, LwjglGlfwKeycode.KEY_DOWN);
        add(21, LwjglGlfwKeycode.KEY_LEFT);
        add(22, LwjglGlfwKeycode.KEY_RIGHT);
        add(29, (short) 65);
        add(30, (short) 66);
        add(31, (short) 67);
        add(32, (short) 68);
        add(33, (short) 69);
        add(34, (short) 70);
        add(35, (short) 71);
        add(36, (short) 72);
        add(37, (short) 73);
        add(38, (short) 74);
        add(39, (short) 75);
        add(40, (short) 76);
        add(41, (short) 77);
        add(42, (short) 78);
        add(43, (short) 79);
        add(44, (short) 80);
        add(45, (short) 81);
        add(46, (short) 82);
        add(47, (short) 83);
        add(48, (short) 84);
        add(49, (short) 85);
        add(50, (short) 86);
        add(51, (short) 87);
        add(52, (short) 88);
        add(53, (short) 89);
        add(54, (short) 90);
        add(55, (short) 44);
        add(56, (short) 46);
        add(57, LwjglGlfwKeycode.KEY_LEFT_ALT);
        add(58, LwjglGlfwKeycode.KEY_RIGHT_ALT);
        add(59, LwjglGlfwKeycode.KEY_LEFT_SHIFT);
        add(60, LwjglGlfwKeycode.KEY_RIGHT_SHIFT);
        add(61, LwjglGlfwKeycode.KEY_TAB);
        add(62, (short) 32);
        add(66, LwjglGlfwKeycode.KEY_ENTER);
        add(67, LwjglGlfwKeycode.KEY_BACKSPACE);
        add(68, (short) 96);
        add(69, (short) 45);
        add(70, (short) 61);
        add(71, (short) 91);
        add(72, (short) 93);
        add(73, (short) 92);
        add(74, (short) 59);
        add(75, (short) 39);
        add(76, (short) 47);
        add(77, (short) 50);
        add(81, LwjglGlfwKeycode.KEY_KP_ADD);
        add(82, (short) 348);
        add(92, LwjglGlfwKeycode.KEY_PAGE_UP);
        add(93, LwjglGlfwKeycode.KEY_PAGE_DOWN);
        add(111, LwjglGlfwKeycode.KEY_ESCAPE);
        add(112, LwjglGlfwKeycode.KEY_DELETE);
        add(113, LwjglGlfwKeycode.KEY_LEFT_CONTROL);
        add(114, LwjglGlfwKeycode.KEY_RIGHT_CONTROL);
        add(115, LwjglGlfwKeycode.KEY_CAPS_LOCK);
        add(116, LwjglGlfwKeycode.KEY_SCROLL_LOCK);
        add(117, LwjglGlfwKeycode.KEY_LEFT_SUPER);
        add(118, LwjglGlfwKeycode.KEY_RIGHT_SUPER);
        add(120, LwjglGlfwKeycode.KEY_PRINT_SCREEN);
        add(121, LwjglGlfwKeycode.KEY_PAUSE);
        add(122, LwjglGlfwKeycode.KEY_HOME);
        add(123, LwjglGlfwKeycode.KEY_END);
        add(124, LwjglGlfwKeycode.KEY_INSERT);
        add(131, LwjglGlfwKeycode.KEY_F1);
        add(132, LwjglGlfwKeycode.KEY_F2);
        add(133, LwjglGlfwKeycode.KEY_F3);
        add(134, LwjglGlfwKeycode.KEY_F4);
        add(135, LwjglGlfwKeycode.KEY_F5);
        add(136, LwjglGlfwKeycode.KEY_F6);
        add(137, LwjglGlfwKeycode.KEY_F7);
        add(138, LwjglGlfwKeycode.KEY_F8);
        add(139, LwjglGlfwKeycode.KEY_F9);
        add(140, LwjglGlfwKeycode.KEY_F10);
        add(141, LwjglGlfwKeycode.KEY_F11);
        add(142, LwjglGlfwKeycode.KEY_F12);
        add(143, LwjglGlfwKeycode.KEY_NUM_LOCK);
        add(144, LwjglGlfwKeycode.KEY_KP_0);
        add(145, LwjglGlfwKeycode.KEY_KP_1);
        add(146, LwjglGlfwKeycode.KEY_KP_2);
        add(147, LwjglGlfwKeycode.KEY_KP_3);
        add(148, LwjglGlfwKeycode.KEY_KP_4);
        add(149, LwjglGlfwKeycode.KEY_KP_5);
        add(150, LwjglGlfwKeycode.KEY_KP_6);
        add(151, LwjglGlfwKeycode.KEY_KP_7);
        add(152, LwjglGlfwKeycode.KEY_KP_8);
        add(153, LwjglGlfwKeycode.KEY_KP_9);
        add(154, LwjglGlfwKeycode.KEY_KP_DIVIDE);
        add(155, LwjglGlfwKeycode.KEY_KP_MULTIPLY);
        add(156, LwjglGlfwKeycode.KEY_KP_SUBTRACT);
        add(157, LwjglGlfwKeycode.KEY_KP_ADD);
        add(158, LwjglGlfwKeycode.KEY_KP_DECIMAL);
        add(159, (short) 44);
        add(160, LwjglGlfwKeycode.KEY_KP_ENTER);
        add(161, LwjglGlfwKeycode.KEY_KP_EQUAL);
        mKcm = KeyCharacterMap.load(-1);
        buffer = new char[1];
    }

    public static boolean containsIndex(int index) {
        return index >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, java.awt.event.ActionListener[]] */
    public static void execKey(KeyEvent keyEvent, int valueIndex) {
        CallbackBridge.holdingAlt = keyEvent.isAltPressed();
        CallbackBridge.holdingCapslock = keyEvent.isCapsLockOn();
        CallbackBridge.holdingCtrl = keyEvent.getActionListeners();
        CallbackBridge.holdingNumlock = keyEvent.isNumLockOn();
        CallbackBridge.holdingShift = keyEvent.isShiftPressed();
        char key = (char) (keyEvent.getUnicodeChar() != 0 ? keyEvent.getUnicodeChar() : 0);
        CallbackBridge.sendKeyPress(getValueByIndex(valueIndex), key, keyEvent.getScanCode(), CallbackBridge.getCurrentMods(), keyEvent.getAWTComponent() == null);
    }

    public static void execKeyIndex(int index) {
        CallbackBridge.sendKeyPress(getValueByIndex(index));
    }

    public static short getValueByIndex(int index) {
        return sLwjglKeycodes[index];
    }

    public static int getIndexByKey(int key) {
        return Arrays.binarySearch(sAndroidKeycodes, key);
    }

    public static int getIndexByValue(int lwjglKey) {
        for (int i = 0; i < sLwjglKeycodes.length; i++) {
            if (sLwjglKeycodes[i] == lwjglKey) {
                return i;
            }
        }
        return -1;
    }

    private static void add(int androidKeycode, short LWJGLKeycode) {
        sAndroidKeycodes[mTmpCount] = androidKeycode;
        sLwjglKeycodes[mTmpCount] = LWJGLKeycode;
        mTmpCount++;
    }

    public static int getAndroidKeycode(int lwjglGlfwKeycode) {
        if (lwjglGlfwKeycode == 50) {
            return 9;
        }
        if (lwjglGlfwKeycode == 51) {
            return 10;
        }
        int index = getIndexByValue(lwjglGlfwKeycode);
        if (index >= 0 && index < sAndroidKeycodes.length) {
            return sAndroidKeycodes[index];
        }
        return 0;
    }

    public static int getSdlAndroidKeycode(int lwjglGlfwKeycode) {
        switch (lwjglGlfwKeycode) {
            case 256:
                return 111;
            case 261:
                return 112;
            case 268:
                return 122;
            case 269:
                return 123;
            case 330:
                return 158;
            case 334:
                return 157;
            case 335:
                return 160;
            case 336:
                return 161;
            case 343:
                return 117;
            case 347:
                return 118;
            case 348:
                return 82;
            default:
                return getAndroidKeycode(lwjglGlfwKeycode);
        }
    }

    public static int getAndroidKeycode(char c) {
        buffer[0] = c;
        KeyEvent[] events = mKcm.getEvents(buffer);
        if (events == null || events.length <= 0) {
            return 0;
        }
        return events[0].getKeyCode();
    }
}
