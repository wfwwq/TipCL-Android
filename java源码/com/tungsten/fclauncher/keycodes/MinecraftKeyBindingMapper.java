package com.tungsten.fclauncher.keycodes;

/* loaded from: classes12.dex */
public final class MinecraftKeyBindingMapper {
    public static final String BINDING_CHAT = "key_key.chat";
    public static final String BINDING_DROP = "key_key.drop";
    public static final String BINDING_HOTBAR_1 = "key_key.hotbar.1";
    public static final String BINDING_HOTBAR_2 = "key_key.hotbar.2";
    public static final String BINDING_HOTBAR_3 = "key_key.hotbar.3";
    public static final String BINDING_HOTBAR_4 = "key_key.hotbar.4";
    public static final String BINDING_HOTBAR_5 = "key_key.hotbar.5";
    public static final String BINDING_HOTBAR_6 = "key_key.hotbar.6";
    public static final String BINDING_HOTBAR_7 = "key_key.hotbar.7";
    public static final String BINDING_HOTBAR_8 = "key_key.hotbar.8";
    public static final String BINDING_HOTBAR_9 = "key_key.hotbar.9";
    public static final String BINDING_SWAP_HANDS = "key_key.swapHands";

    private MinecraftKeyBindingMapper() {
    }

    public static int mapBindingToKeycode(String key, int defaultKeycode) throws NumberFormatException {
        if (key == null) {
            return defaultKeycode;
        }
        if (key.startsWith("key.")) {
            Short glfwKeycode = getGlfwKeycode(key);
            return glfwKeycode == null ? defaultKeycode : glfwKeycode.shortValue();
        }
        try {
            int lwjgl2Keycode = Integer.parseInt(key);
            return lwjgl2Keycode;
        } catch (NumberFormatException e) {
            return defaultKeycode;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0594  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Short getGlfwKeycode(java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 2796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tungsten.fclauncher.keycodes.MinecraftKeyBindingMapper.getGlfwKeycode(java.lang.String):java.lang.Short");
    }
}
