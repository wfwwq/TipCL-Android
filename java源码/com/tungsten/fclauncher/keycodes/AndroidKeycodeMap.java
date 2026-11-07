package com.tungsten.fclauncher.keycodes;

import java.util.Arrays;

/* loaded from: classes12.dex */
public class AndroidKeycodeMap {
    private static final int[] ANDROID_KEYCODES = new int[99];
    private static final int[] FCL_KEYCODES = new int[99];
    private static int count = 0;

    static {
        add(3, 102);
        add(4, 1);
        add(7, 11);
        add(8, 2);
        add(9, 3);
        add(10, 4);
        add(11, 5);
        add(12, 6);
        add(13, 7);
        add(14, 8);
        add(15, 9);
        add(16, 10);
        add(18, 4);
        add(19, 103);
        add(20, 108);
        add(21, 105);
        add(22, 106);
        add(29, 30);
        add(30, 48);
        add(31, 46);
        add(32, 32);
        add(33, 18);
        add(34, 33);
        add(35, 34);
        add(36, 35);
        add(37, 23);
        add(38, 36);
        add(39, 37);
        add(40, 38);
        add(41, 50);
        add(42, 49);
        add(43, 24);
        add(44, 25);
        add(45, 16);
        add(46, 19);
        add(47, 31);
        add(48, 20);
        add(49, 22);
        add(50, 47);
        add(51, 17);
        add(52, 45);
        add(53, 21);
        add(54, 44);
        add(55, 51);
        add(56, 52);
        add(57, 56);
        add(58, 100);
        add(59, 42);
        add(60, 54);
        add(61, 15);
        add(62, 57);
        add(66, 28);
        add(67, 14);
        add(68, 41);
        add(69, 12);
        add(70, 13);
        add(71, 26);
        add(72, 27);
        add(73, 43);
        add(74, 39);
        add(75, 40);
        add(76, 53);
        add(77, 3);
        add(92, 104);
        add(93, 109);
        add(111, 1);
        add(113, 29);
        add(114, 97);
        add(115, 58);
        add(121, 119);
        add(123, 107);
        add(124, 110);
        add(131, 59);
        add(132, 60);
        add(133, 61);
        add(134, 62);
        add(135, 63);
        add(136, 64);
        add(137, 65);
        add(138, 66);
        add(139, 67);
        add(140, 68);
        add(141, 87);
        add(142, 88);
        add(143, 69);
        add(144, 82);
        add(145, 79);
        add(146, 80);
        add(147, 81);
        add(148, 75);
        add(149, 76);
        add(150, 77);
        add(151, 71);
        add(152, 72);
        add(153, 73);
        add(158, 83);
        add(159, 121);
        add(160, 96);
        add(161, 117);
    }

    private static void add(int androidKeycode, int fclKeycode) {
        ANDROID_KEYCODES[count] = androidKeycode;
        FCL_KEYCODES[count] = fclKeycode;
        count++;
    }

    public static int convertKeycode(int androidKeycode) {
        int index = Arrays.binarySearch(ANDROID_KEYCODES, androidKeycode);
        if (index >= 0) {
            return FCL_KEYCODES[index];
        }
        return 240;
    }
}
