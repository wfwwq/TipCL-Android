package com.tungsten.fclauncher.keycodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/* loaded from: classes12.dex */
public class GamepadKeycodeMap {
    public static final HashMap<Integer, Integer> KEY_MAP = new HashMap<>();
    public static final int LEFT_JOYSTICK_DOWN = 2006;
    public static final int LEFT_JOYSTICK_LEFT = 2004;
    public static final int LEFT_JOYSTICK_RIGHT = 2000;
    public static final int LEFT_JOYSTICK_UP = 2002;
    private static final int MOUSE_LEFT = 1000;
    private static final int MOUSE_MIDDLE = 1001;
    private static final int MOUSE_RIGHT = 1002;
    private static final int MOUSE_SCROLL_DOWN = 1004;
    private static final int MOUSE_SCROLL_UP = 1003;

    static {
        add(96, 57);
        add(97, 16);
        add(99, 18);
        add(100, 33);
        add(102, 1003);
        add(103, 1004);
        add(104, 1000);
        add(105, 1002);
        add(106, 29);
        add(107, 42);
        add(108, 1);
        add(109, 15);
        add(19, 42);
        add(20, 24);
        add(21, 36);
        add(22, 37);
        add(LEFT_JOYSTICK_UP, 17);
        add(LEFT_JOYSTICK_DOWN, 31);
        add(LEFT_JOYSTICK_LEFT, 30);
        add(2000, 32);
    }

    private static void add(int key, int value) {
        KEY_MAP.put(Integer.valueOf(key), Integer.valueOf(value));
    }

    public static int convert(Map<Integer, Integer> keyMap, int key) {
        return ((Integer) Optional.ofNullable(keyMap.get(Integer.valueOf(key))).orElse(-1)).intValue();
    }
}
