package net.java.openjdk.cacio.ctc;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCAndroidInput.class */
public class CTCAndroidInput {
    public static final int EVENT_TYPE_CHAR = 1000;
    public static final int EVENT_TYPE_CURSOR_POS = 1003;
    public static final int EVENT_TYPE_KEY = 1005;
    public static final int EVENT_TYPE_MOUSE_BUTTON = 1006;
    public static final int EVENT_TYPE_SCROLL = 1007;
    public static CTCRobotPeer mRobotPeer = new CTCRobotPeer();

    public static void receiveData(int type, int i1, int i2, int i3, int i4) {
        switch (type) {
            case 1000:
                mRobotPeer.keyPressUnchecked((char) i1);
                break;
            case 1003:
                mRobotPeer.mouseMove(i1, i2);
                break;
            case 1005:
                if (i3 != 1) {
                    mRobotPeer.keyRelease(i2);
                    break;
                } else {
                    mRobotPeer.keyPress(i2);
                    break;
                }
            case 1006:
                if (i2 == 1) {
                    mRobotPeer.mousePress(i1);
                    break;
                } else {
                    mRobotPeer.mouseRelease(i1);
                    break;
                }
        }
    }
}
