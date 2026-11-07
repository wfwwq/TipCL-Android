package com.tungsten.fclauncher.keycodes;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class LwjglKeycodeMap {
    private static final Map<Integer, Integer> KEY_MAP = new HashMap();

    static {
        add(268, 102);
        add(256, 1);
        add(48, 11);
        add(49, 2);
        add(50, 3);
        add(51, 4);
        add(52, 5);
        add(53, 6);
        add(54, 7);
        add(55, 8);
        add(56, 9);
        add(57, 10);
        add(265, 103);
        add(264, 108);
        add(263, 105);
        add(262, 106);
        add(65, 30);
        add(66, 48);
        add(67, 46);
        add(68, 32);
        add(69, 18);
        add(70, 33);
        add(71, 34);
        add(72, 35);
        add(73, 23);
        add(74, 36);
        add(75, 37);
        add(76, 38);
        add(77, 50);
        add(78, 49);
        add(79, 24);
        add(80, 25);
        add(81, 16);
        add(82, 19);
        add(83, 31);
        add(84, 20);
        add(85, 22);
        add(86, 47);
        add(87, 17);
        add(88, 45);
        add(89, 21);
        add(90, 44);
        add(44, 51);
        add(46, 52);
        add(342, 56);
        add(346, 100);
        add(340, 42);
        add(344, 54);
        add(258, 15);
        add(32, 57);
        add(257, 28);
        add(259, 14);
        add(96, 41);
        add(45, 12);
        add(61, 13);
        add(91, 26);
        add(93, 27);
        add(92, 43);
        add(59, 39);
        add(39, 40);
        add(47, 53);
        add(266, 104);
        add(267, 109);
        add(256, 1);
        add(341, 29);
        add(345, 97);
        add(280, 58);
        add(284, 119);
        add(269, 107);
        add(260, 110);
        add(290, 59);
        add(291, 60);
        add(292, 61);
        add(293, 62);
        add(294, 63);
        add(295, 64);
        add(296, 65);
        add(297, 66);
        add(298, 67);
        add(299, 68);
        add(300, 87);
        add(301, 88);
        add(282, 69);
        add(320, 82);
        add(321, 79);
        add(322, 80);
        add(323, 81);
        add(324, 75);
        add(325, 76);
        add(326, 77);
        add(327, 71);
        add(328, 72);
        add(329, 73);
        add(330, 83);
        add(333, 74);
        add(332, 55);
        add(334, 78);
        add(331, 98);
        add(335, 96);
        add(336, 117);
        add(261, 111);
    }

    private static void add(int lwjglKeycode, int fclKeycode) {
        KEY_MAP.put(Integer.valueOf(fclKeycode), Integer.valueOf(lwjglKeycode));
    }

    public static int convertKeycode(int fclKeycode) {
        Integer key = KEY_MAP.get(Integer.valueOf(fclKeycode));
        if (key != null) {
            return key.intValue();
        }
        return 0;
    }
}
