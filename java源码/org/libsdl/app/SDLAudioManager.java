package org.libsdl.app;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Process;
import android.util.Log;

/* loaded from: classes9.dex */
class SDLAudioManager {
    protected static final String TAG = "SDLAudio";
    private static AudioDeviceCallback mAudioDeviceCallback;
    protected static Context mContext;

    static native void nativeAddAudioDevice(boolean z, String str, int i);

    static native void nativeRemoveAudioDevice(boolean z, int i);

    static native void nativeSetupJNI();

    SDLAudioManager() {
    }

    static void initialize() {
        mAudioDeviceCallback = null;
        mAudioDeviceCallback = new AudioDeviceCallback() { // from class: org.libsdl.app.SDLAudioManager.1
            /* JADX WARN: Type inference failed for: r2v0, types: [android.media.AudioDeviceInfo, com.github.caciocavallosilano.cacio.peer.CacioComponentPeer] */
            /* JADX WARN: Type inference failed for: r3v0, types: [boolean, java.awt.Component] */
            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
                for (?? r2 : audioDeviceInfoArr) {
                    SDLAudioManager.nativeAddAudioDevice(r2.getAWTComponent(), r2.getProductName().toString(), r2.getId());
                }
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [android.media.AudioDeviceInfo, com.github.caciocavallosilano.cacio.peer.CacioComponentPeer] */
            /* JADX WARN: Type inference failed for: r3v0, types: [boolean, java.awt.Component] */
            @Override // android.media.AudioDeviceCallback
            public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
                for (?? r2 : audioDeviceInfoArr) {
                    SDLAudioManager.nativeRemoveAudioDevice(r2.getAWTComponent(), r2.getId());
                }
            }
        };
    }

    static void setContext(Context context) {
        mContext = context;
    }

    static void release(Context context) {
    }

    private static AudioDeviceInfo getInputAudioDeviceInfo(int deviceId) {
        AudioManager audioManager = (AudioManager) mContext.getSystemService("audio");
        for (AudioDeviceInfo deviceInfo : audioManager.getDevices(1)) {
            if (deviceInfo.getId() == deviceId) {
                return deviceInfo;
            }
        }
        return null;
    }

    private static AudioDeviceInfo getPlaybackAudioDeviceInfo(int deviceId) {
        AudioManager audioManager = (AudioManager) mContext.getSystemService("audio");
        for (AudioDeviceInfo deviceInfo : audioManager.getDevices(2)) {
            if (deviceInfo.getId() == deviceId) {
                return deviceInfo;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.media.AudioDeviceInfo, com.github.caciocavallosilano.cacio.peer.CacioComponentPeer] */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean, java.awt.Component] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.media.AudioDeviceInfo, com.github.caciocavallosilano.cacio.peer.CacioComponentPeer] */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, java.awt.Component] */
    static void registerAudioDeviceCallback() {
        AudioManager audioManager = (AudioManager) mContext.getSystemService("audio");
        for (?? r5 : audioManager.getDevices(2)) {
            if (r5.getType() != 18) {
                nativeAddAudioDevice(r5.getAWTComponent(), r5.getProductName().toString(), r5.getId());
            }
        }
        for (?? r4 : audioManager.getDevices(1)) {
            nativeAddAudioDevice(r4.getAWTComponent(), r4.getProductName().toString(), r4.getId());
        }
        audioManager.registerAudioDeviceCallback(mAudioDeviceCallback, null);
    }

    static void unregisterAudioDeviceCallback() {
        AudioManager audioManager = (AudioManager) mContext.getSystemService("audio");
        audioManager.unregisterAudioDeviceCallback(mAudioDeviceCallback);
    }

    static void audioSetThreadPriority(boolean recording, int device_id) throws SecurityException, IllegalArgumentException {
        try {
            if (recording) {
                Thread.currentThread().setName("SDLAudioC" + device_id);
            } else {
                Thread.currentThread().setName("SDLAudioP" + device_id);
            }
            Process.setThreadPriority(-16);
        } catch (Exception e) {
            Log.v(TAG, "modify thread properties failed " + e.toString());
        }
    }
}
