package org.libsdl.app;

import android.content.Context;
import android.graphics.Insets;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.tungsten.fcl.game.sdl.SdlBridge;
import org.libsdl.app.SDLActivity;
import org.lwjgl.glfw.CallbackBridge;

/* loaded from: classes9.dex */
public class SDLSurface extends SurfaceView implements SurfaceHolder.Callback, View.OnApplyWindowInsetsListener, View.OnKeyListener, View.OnTouchListener, SensorEventListener, ScaleGestureDetector.OnScaleGestureListener {
    static Surface mNativeSurface;
    protected Display mDisplay;
    protected float mHeight;
    protected boolean mIsSurfaceReady;
    protected SensorManager mSensorManager;
    protected float mWidth;
    private final ScaleGestureDetector scaleGestureDetector;

    public SDLSurface(Context context) {
        super(context);
        getHolder().addCallback(this);
        this.scaleGestureDetector = new ScaleGestureDetector(context, this);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        setOnApplyWindowInsetsListener(this);
        setOnKeyListener(this);
        setOnTouchListener(this);
        this.mDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.mSensorManager = (SensorManager) context.getSystemService("sensor");
        setOnGenericMotionListener(SDLActivity.getMotionListener());
        this.mWidth = CallbackBridge.windowWidth;
        this.mHeight = CallbackBridge.windowHeight;
        this.mIsSurfaceReady = false;
    }

    protected void handlePause() {
        enableSensor(1, false);
    }

    protected void handleResume() {
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        setOnApplyWindowInsetsListener(this);
        setOnKeyListener(this);
        setOnTouchListener(this);
        enableSensor(1, true);
    }

    public static Surface getNativeSurface() {
        return mNativeSurface;
    }

    public static void setNativeSurface(Surface nativeSurface) {
        if (nativeSurface == null || !nativeSurface.isValid()) {
            return;
        }
        mNativeSurface = nativeSurface;
        SDLActivity.getSDLSurface().surfaceCreated(null);
    }

    public static void clearNativeSurface() {
        mNativeSurface = null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        if (SdlBridge.getSdlEnabled()) {
            Log.v("SDL", "surfaceCreated()");
            SDLActivity.onNativeSurfaceCreated();
        }
    }

    public void surfaceDestroyed() {
        surfaceDestroyed(null);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        if (SdlBridge.getSdlEnabled()) {
            SDLActivity.mNextNativeState = SDLActivity.NativeState.PAUSED;
            SDLActivity.handleNativeState();
            this.mIsSurfaceReady = false;
            SDLActivity.onNativeSurfaceDestroyed();
        }
        mNativeSurface = null;
    }

    public void surfaceChanged() {
        surfaceChanged(null, 0, CallbackBridge.windowWidth, CallbackBridge.windowHeight);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        if (SdlBridge.getSdlEnabled()) {
            Log.v("SDL", "surfaceChanged()");
            if (SDLActivity.mSingleton != null) {
                this.mWidth = width;
                this.mHeight = height;
                int nDeviceWidth = width;
                int nDeviceHeight = height;
                try {
                    DisplayMetrics realMetrics = new DisplayMetrics();
                    this.mDisplay.getRealMetrics(realMetrics);
                    nDeviceWidth = realMetrics.widthPixels;
                    nDeviceHeight = realMetrics.heightPixels;
                    float density = realMetrics.densityDpi / 160.0f;
                } catch (Exception e) {
                }
                synchronized (SDLActivity.getContext()) {
                    SDLActivity.getContext().notifyAll();
                }
                Log.v("SDL", "Window size: " + width + "x" + height);
                Log.v("SDL", "Device size: " + nDeviceWidth + "x" + nDeviceHeight);
                boolean skip = false;
                int requestedOrientation = SDLActivity.mSingleton.getRequestedOrientation();
                if (requestedOrientation == 1 || requestedOrientation == 7) {
                    if (this.mWidth > this.mHeight) {
                        skip = true;
                    }
                } else if ((requestedOrientation == 0 || requestedOrientation == 6) && this.mWidth < this.mHeight) {
                    skip = true;
                }
                if (skip) {
                    double min = Math.min(this.mWidth, this.mHeight);
                    double max = Math.max(this.mWidth, this.mHeight);
                    if (max / min < 1.2d) {
                        Log.v("SDL", "Don't skip on such aspect-ratio. Could be a square resolution.");
                        skip = false;
                    }
                }
                if (skip) {
                    skip = false;
                }
                if (skip) {
                    Log.v("SDL", "Skip .. Surface is not ready.");
                    this.mIsSurfaceReady = false;
                } else {
                    SDLActivity.onNativeSurfaceChanged();
                    this.mIsSurfaceReady = true;
                    SDLActivity.mNextNativeState = SDLActivity.NativeState.RESUMED;
                    SDLActivity.handleNativeState();
                }
            }
        }
    }

    public void nativeResize(int w, int h) {
        DisplayMetrics realMetrics = new DisplayMetrics();
        this.mDisplay.getRealMetrics(realMetrics);
        SDLActivity.nativeSetScreenResolution(w, h, w, h, realMetrics.densityDpi / 160.0f, this.mDisplay.getRefreshRate());
        SDLActivity.onNativeResize();
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View v, WindowInsets insets) {
        if (Build.VERSION.SDK_INT >= 30) {
            Insets combined = insets.getInsets(WindowInsets.Type.systemBars() | WindowInsets.Type.systemGestures() | WindowInsets.Type.mandatorySystemGestures() | WindowInsets.Type.tappableElement() | WindowInsets.Type.displayCutout());
            SDLActivity.onNativeInsetsChanged(combined.left, combined.right, combined.top, combined.bottom);
            SdlImeController.notifyVisibilityChanged(insets.isVisible(WindowInsets.Type.ime()));
        }
        return insets;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View v, int keyCode, KeyEvent event) {
        return SDLActivity.handleKeyEvent(v, keyCode, event, null);
    }

    private float getNormalizedX(float x) {
        if (this.mWidth <= 1.0f) {
            return 0.5f;
        }
        return x / (this.mWidth - 1.0f);
    }

    private float getNormalizedY(float y) {
        if (this.mHeight <= 1.0f) {
            return 0.5f;
        }
        return y / (this.mHeight - 1.0f);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View v, MotionEvent event) {
        return false;
    }

    protected void enableSensor(int sensortype, boolean enabled) {
        if (enabled) {
            SDLSensorManager.registerListener(this.mSensorManager, this, this.mSensorManager.getDefaultSensor(sensortype), 1);
        } else {
            SDLSensorManager.unregisterListener(this.mSensorManager, this, this.mSensorManager.getDefaultSensor(sensortype));
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent event) {
        float x;
        float y;
        int newRotation;
        if (event.sensor.getType() == 1) {
            switch (this.mDisplay.getRotation()) {
                case 1:
                    x = -event.values[1];
                    y = event.values[0];
                    newRotation = 90;
                    break;
                case 2:
                    x = -event.values[0];
                    y = -event.values[1];
                    newRotation = 180;
                    break;
                case 3:
                    x = event.values[1];
                    y = -event.values[0];
                    newRotation = 270;
                    break;
                default:
                    x = event.values[0];
                    y = event.values[1];
                    newRotation = 0;
                    break;
            }
            if (newRotation != SDLActivity.mCurrentRotation) {
                SDLActivity.mCurrentRotation = newRotation;
                SDLActivity.onNativeRotationChanged(newRotation);
            }
            SDLActivity.onNativeAccel((-x) / 9.80665f, y / 9.80665f, event.values[2] / 9.80665f);
        }
    }

    @Override // android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent event, int pointerIndex) {
        try {
            return super.onResolvePointerIcon(event, pointerIndex);
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override // android.view.View
    public boolean onCapturedPointerEvent(MotionEvent event) {
        int action;
        int action2 = event.getActionMasked();
        int pointerCount = event.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            switch (action2) {
                case 2:
                case 7:
                    float x = event.getX(i);
                    float y = event.getY(i);
                    SDLActivity.onNativeMouse(0, action2, x, y, true);
                    return true;
                case 8:
                    float x2 = event.getAxisValue(10, i);
                    float y2 = event.getAxisValue(9, i);
                    SDLActivity.onNativeMouse(0, action2, x2, y2, false);
                    return true;
                case 11:
                case 12:
                    if (action2 == 11) {
                        action = 0;
                    } else {
                        action = 1;
                    }
                    float x3 = event.getX(i);
                    float y3 = event.getY(i);
                    int button = event.getButtonState();
                    SDLActivity.onNativeMouse(button, action, x3, y3, true);
                    return true;
                default:
            }
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector detector) {
        float scale = detector.getScaleFactor();
        SDLActivity.onNativePinchUpdate(scale);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        SDLActivity.onNativePinchStart();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector detector) {
        SDLActivity.onNativePinchEnd();
    }
}
