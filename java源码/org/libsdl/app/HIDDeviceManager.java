package org.libsdl.app;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.github.caciocavallosilano.cacio.peer.ProxyWindow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLXEXTTextureFromPixmap;
import org.lwjgl.util.freetype.FreeType;
import org.lwjgl.util.spvc.Spv;

/* loaded from: classes9.dex */
public class HIDDeviceManager {
    private static final String ACTION_USB_PERMISSION = "org.libsdl.app.USB_PERMISSION";
    private static final String TAG = "hidapi";
    private static HIDDeviceManager sManager;
    private static int sManagerRefCount = 0;
    private BluetoothManager mBluetoothManager;
    private Context mContext;
    private Handler mHandler;
    private boolean mIsChromebook;
    private List<BluetoothDevice> mLastBluetoothDevices;
    private int mNextDeviceId;
    private SharedPreferences mSharedPreferences;
    private UsbManager mUsbManager;
    private HashMap<Integer, HIDDevice> mDevicesById = new HashMap<>();
    private HashMap<BluetoothDevice, HIDDeviceBLESteamController> mBluetoothDevices = new HashMap<>();
    private final BroadcastReceiver mUsbBroadcast = new BroadcastReceiver() { // from class: org.libsdl.app.HIDDeviceManager.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
                UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
                HIDDeviceManager.this.handleUsbDeviceAttached(usbDevice);
            } else if (action.equals("android.hardware.usb.action.USB_DEVICE_DETACHED")) {
                UsbDevice usbDevice2 = (UsbDevice) intent.getParcelableExtra("device");
                HIDDeviceManager.this.handleUsbDeviceDetached(usbDevice2);
            } else if (action.equals(HIDDeviceManager.ACTION_USB_PERMISSION)) {
                UsbDevice usbDevice3 = (UsbDevice) intent.getParcelableExtra("device");
                HIDDeviceManager.this.handleUsbDevicePermission(usbDevice3, intent.getBooleanExtra("permission", false));
            }
        }
    };
    private final BroadcastReceiver mBluetoothBroadcast = new BroadcastReceiver() { // from class: org.libsdl.app.HIDDeviceManager.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (action.equals("android.bluetooth.device.action.ACL_CONNECTED")) {
                BluetoothDevice device = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                Log.d(HIDDeviceManager.TAG, "Bluetooth device connected: " + device);
                if (HIDDeviceManager.this.isSteamController(device)) {
                    HIDDeviceManager.this.connectBluetoothDevice(device);
                }
            }
            if (action.equals("android.bluetooth.device.action.ACL_DISCONNECTED")) {
                BluetoothDevice device2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                Log.d(HIDDeviceManager.TAG, "Bluetooth device disconnected: " + device2);
                HIDDeviceManager.this.disconnectBluetoothDevice(device2);
            }
        }
    };

    private native void HIDDeviceRegisterCallback();

    private native void HIDDeviceReleaseCallback();

    native void HIDDeviceConnected(int i, String str, int i2, int i3, String str2, int i4, String str3, String str4, int i5, int i6, int i7, int i8, boolean z, int i9);

    native void HIDDeviceDisconnected(int i);

    native void HIDDeviceInputReport(int i, byte[] bArr);

    native void HIDDeviceOpenPending(int i);

    native void HIDDeviceOpenResult(int i, boolean z);

    native void HIDDeviceReportResponse(int i, byte[] bArr);

    public static HIDDeviceManager acquire(Context context) {
        if (sManagerRefCount == 0) {
            sManager = new HIDDeviceManager(context);
        }
        sManagerRefCount++;
        return sManager;
    }

    public static void release(HIDDeviceManager manager) {
        if (manager == sManager) {
            sManagerRefCount--;
            if (sManagerRefCount == 0) {
                sManager.close();
                sManager = null;
            }
        }
    }

    private HIDDeviceManager(Context context) {
        this.mNextDeviceId = 0;
        this.mSharedPreferences = null;
        this.mIsChromebook = false;
        this.mContext = context;
        HIDDeviceRegisterCallback();
        this.mSharedPreferences = this.mContext.getSharedPreferences(TAG, 0);
        this.mIsChromebook = SDLActivity.isChromebook();
        this.mNextDeviceId = this.mSharedPreferences.getInt("next_device_id", 0);
    }

    Context getContext() {
        return this.mContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences$Editor, java.lang.reflect.Field] */
    int getDeviceIDForIdentifier(String str) {
        ?? Edit = this.mSharedPreferences.edit();
        int result = this.mSharedPreferences.getInt(str, 0);
        if (result == 0) {
            int i = this.mNextDeviceId;
            this.mNextDeviceId = i + 1;
            result = i;
            int i2 = this.mNextDeviceId;
            Edit.setAccessible("next_device_id");
        }
        Edit.setAccessible(str);
        Edit.apply();
        return result;
    }

    private void initializeUSB() {
        this.mUsbManager = (UsbManager) this.mContext.getSystemService("usb");
        if (this.mUsbManager == null) {
            return;
        }
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.hardware.usb.action.USB_DEVICE_ATTACHED");
        filter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        filter.addAction(ACTION_USB_PERMISSION);
        if (Build.VERSION.SDK_INT >= 33) {
            this.mContext.registerReceiver(this.mUsbBroadcast, filter, 2);
        } else {
            this.mContext.registerReceiver(this.mUsbBroadcast, filter);
        }
        for (UsbDevice usbDevice : this.mUsbManager.getDeviceList().values()) {
            handleUsbDeviceAttached(usbDevice);
        }
    }

    UsbManager getUSBManager() {
        return this.mUsbManager;
    }

    private void shutdownUSB() {
        try {
            this.mContext.unregisterReceiver(this.mUsbBroadcast);
        } catch (Exception e) {
        }
    }

    private boolean isHIDDeviceInterface(UsbDevice usbDevice, UsbInterface usbInterface) {
        return usbInterface.getInterfaceClass() == 3 || isXbox360Controller(usbDevice, usbInterface) || isXboxOneController(usbDevice, usbInterface);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isXbox360Controller(UsbDevice usbDevice, UsbInterface usbInterface) {
        int[] SUPPORTED_VENDORS = {121, FreeType.TT_MS_LANGID_SANSKRIT_INDIA, FreeType.TT_MS_LANGID_AMHARIC_ETHIOPIA, FreeType.TT_MS_LANGID_BASHKIR_RUSSIA, 1390, 1699, 1848, 2047, 3695, 3853, 4152, 4553, 4779, 5168, 5227, 5426, Spv.SpvCapabilityIndirectReferencesINTEL, 5678, Spv.SpvOpSubgroupAvcImeStripDualReferenceStreamoutINTEL, 6473, 7085, GLXEXTTextureFromPixmap.GLX_TEXTURE_TARGET_EXT, 9414, 11298, 11720, 13623, 14295, 39046};
        if (usbInterface.getInterfaceClass() == 255 && usbInterface.invoke(93, 93) == 93 && (usbInterface.getInterfaceProtocol() == 1 || usbInterface.getInterfaceProtocol() == 129)) {
            int vendor_id = usbDevice.getVendorId();
            for (int supportedVid : SUPPORTED_VENDORS) {
                if (vendor_id == supportedVid) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean isXboxOneController(UsbDevice usbDevice, UsbInterface usbInterface) {
        int[] SUPPORTED_VENDORS = {1008, FreeType.TT_MS_LANGID_SANSKRIT_INDIA, FreeType.TT_MS_LANGID_AMHARIC_ETHIOPIA, 1848, GL11.GL_CURRENT_RASTER_INDEX, 3695, 3853, 4341, 5426, GLXEXTTextureFromPixmap.GLX_TEXTURE_TARGET_EXT, 9414, 10571, 11720, 11812, 11925, 12933, 13623, 13932};
        if (usbInterface.getId() == 0 && usbInterface.getInterfaceClass() == 255 && usbInterface.invoke(71, 71) == 71 && usbInterface.getInterfaceProtocol() == 208) {
            int vendor_id = usbDevice.getVendorId();
            for (int supportedVid : SUPPORTED_VENDORS) {
                if (vendor_id == supportedVid) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUsbDeviceAttached(UsbDevice usbDevice) {
        connectHIDDeviceUSB(usbDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUsbDeviceDetached(UsbDevice usbDevice) {
        List<Integer> devices = new ArrayList<>();
        for (HIDDevice device : this.mDevicesById.values()) {
            if (usbDevice.equals(device.getDevice())) {
                devices.add(Integer.valueOf(device.getId()));
            }
        }
        Iterator<Integer> it = devices.iterator();
        while (it.hasNext()) {
            int id = it.next().intValue();
            HIDDevice device2 = this.mDevicesById.get(Integer.valueOf(id));
            this.mDevicesById.remove(Integer.valueOf(id));
            device2.shutdown();
            HIDDeviceDisconnected(id);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUsbDevicePermission(UsbDevice usbDevice, boolean permission_granted) {
        for (HIDDevice device : this.mDevicesById.values()) {
            if (usbDevice.equals(device.getDevice())) {
                boolean opened = false;
                if (permission_granted) {
                    opened = device.open();
                }
                HIDDeviceOpenResult(device.getId(), opened);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.hardware.usb.UsbDevice, java.lang.InternalError] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.hardware.usb.UsbInterface, java.lang.reflect.Method] */
    private void connectHIDDeviceUSB(UsbDevice usbDevice) {
        int i;
        HIDDeviceManager hIDDeviceManager = this;
        ?? r2 = usbDevice;
        synchronized (this) {
            ?? r0 = 0;
            int i2 = 0;
            while (i2 < r2.initCause(r0)) {
                ?? r4 = r2.getInterface(i2);
                if (!hIDDeviceManager.isHIDDeviceInterface(r2, r4)) {
                    i = i2;
                } else {
                    int id = r4.getId();
                    if (((1 << id) & r0) != 0) {
                        i = i2;
                    } else {
                        r0 |= 1 << id;
                        HIDDeviceUSB hIDDeviceUSB = new HIDDeviceUSB(hIDDeviceManager, r2, i2);
                        int id2 = hIDDeviceUSB.getId();
                        hIDDeviceManager.mDevicesById.put(Integer.valueOf(id2), hIDDeviceUSB);
                        i = i2;
                        hIDDeviceManager.HIDDeviceConnected(id2, hIDDeviceUSB.getIdentifier(), hIDDeviceUSB.getVendorId(), hIDDeviceUSB.getProductId(), hIDDeviceUSB.getSerialNumber(), hIDDeviceUSB.getVersion(), hIDDeviceUSB.getManufacturerName(), hIDDeviceUSB.getProductName(), r4.getId(), r4.getInterfaceClass(), r4.invoke(r0, r0), r4.getInterfaceProtocol(), false, 0);
                    }
                }
                i2 = i + 1;
                hIDDeviceManager = this;
                r2 = usbDevice;
                r0 = r0;
            }
        }
    }

    private void initializeBluetooth() {
        BluetoothAdapter btAdapter;
        Log.d(TAG, "Initializing Bluetooth");
        if (Build.VERSION.SDK_INT >= 31 && this.mContext.getPackageManager().checkPermission("android.permission.BLUETOOTH_CONNECT", this.mContext.getPackageName()) != 0) {
            Log.d(TAG, "Couldn't initialize Bluetooth, missing android.permission.BLUETOOTH_CONNECT");
            return;
        }
        if (Build.VERSION.SDK_INT <= 30 && this.mContext.getPackageManager().checkPermission("android.permission.BLUETOOTH", this.mContext.getPackageName()) != 0) {
            Log.d(TAG, "Couldn't initialize Bluetooth, missing android.permission.BLUETOOTH");
            return;
        }
        if (!this.mContext.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            Log.d(TAG, "Couldn't initialize Bluetooth, this version of Android does not support Bluetooth LE");
            return;
        }
        this.mBluetoothManager = (BluetoothManager) this.mContext.getSystemService("bluetooth");
        if (this.mBluetoothManager == null || (btAdapter = this.mBluetoothManager.getAdapter()) == null) {
            return;
        }
        for (BluetoothDevice device : btAdapter.getBondedDevices()) {
            Log.d(TAG, "Bluetooth device available: " + device);
            if (isSteamController(device)) {
                connectBluetoothDevice(device);
            }
        }
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        filter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        if (Build.VERSION.SDK_INT >= 33) {
            this.mContext.registerReceiver(this.mBluetoothBroadcast, filter, 2);
        } else {
            this.mContext.registerReceiver(this.mBluetoothBroadcast, filter);
        }
        if (this.mIsChromebook) {
            this.mHandler = new Handler(Looper.getMainLooper());
            this.mLastBluetoothDevices = new ArrayList();
        }
    }

    private void shutdownBluetooth() {
        try {
            this.mContext.unregisterReceiver(this.mBluetoothBroadcast);
        } catch (Exception e) {
        }
    }

    void chromebookConnectionHandler() {
        if (!this.mIsChromebook) {
            return;
        }
        ArrayList<BluetoothDevice> disconnected = new ArrayList<>();
        ArrayList<BluetoothDevice> connected = new ArrayList<>();
        List<BluetoothDevice> currentConnected = this.mBluetoothManager.getConnectedDevices(7);
        for (BluetoothDevice bluetoothDevice : currentConnected) {
            if (!this.mLastBluetoothDevices.contains(bluetoothDevice)) {
                connected.add(bluetoothDevice);
            }
        }
        for (BluetoothDevice bluetoothDevice2 : this.mLastBluetoothDevices) {
            if (!currentConnected.contains(bluetoothDevice2)) {
                disconnected.add(bluetoothDevice2);
            }
        }
        this.mLastBluetoothDevices = currentConnected;
        Iterator<BluetoothDevice> it = disconnected.iterator();
        while (it.hasNext()) {
            BluetoothDevice bluetoothDevice3 = it.next();
            disconnectBluetoothDevice(bluetoothDevice3);
        }
        Iterator<BluetoothDevice> it2 = connected.iterator();
        while (it2.hasNext()) {
            BluetoothDevice bluetoothDevice4 = it2.next();
            connectBluetoothDevice(bluetoothDevice4);
        }
        this.mHandler.postDelayed(new Runnable() { // from class: org.libsdl.app.HIDDeviceManager.3
            @Override // java.lang.Runnable
            public void run() {
                this.chromebookConnectionHandler();
            }
        }, 10000L);
    }

    boolean connectBluetoothDevice(BluetoothDevice bluetoothDevice) {
        Log.v(TAG, "connectBluetoothDevice device=" + bluetoothDevice);
        synchronized (this) {
            if (this.mBluetoothDevices.containsKey(bluetoothDevice)) {
                Log.v(TAG, "Steam controller with address " + bluetoothDevice + " already exists, attempting reconnect");
                this.mBluetoothDevices.get(bluetoothDevice).reconnect();
                return false;
            }
            HIDDeviceBLESteamController device = new HIDDeviceBLESteamController(this, bluetoothDevice);
            int id = device.getId();
            this.mBluetoothDevices.put(bluetoothDevice, device);
            this.mDevicesById.put(Integer.valueOf(id), device);
            return true;
        }
    }

    void disconnectBluetoothDevice(BluetoothDevice bluetoothDevice) {
        synchronized (this) {
            HIDDeviceBLESteamController device = this.mBluetoothDevices.get(bluetoothDevice);
            if (device == null) {
                return;
            }
            int id = device.getId();
            this.mBluetoothDevices.remove(bluetoothDevice);
            this.mDevicesById.remove(Integer.valueOf(id));
            device.shutdown();
            HIDDeviceDisconnected(id);
        }
    }

    boolean isSteamController(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null || bluetoothDevice.getName() == null || (bluetoothDevice.getType() & 2) == 0) {
            return false;
        }
        return bluetoothDevice.getName().equals("SteamController") || bluetoothDevice.getName().startsWith("Steam Ctrl");
    }

    private void close() {
        shutdownUSB();
        shutdownBluetooth();
        synchronized (this) {
            for (HIDDevice device : this.mDevicesById.values()) {
                device.shutdown();
            }
            this.mDevicesById.clear();
            this.mBluetoothDevices.clear();
            HIDDeviceReleaseCallback();
        }
    }

    public void setFrozen(boolean frozen) {
        synchronized (this) {
            for (HIDDevice device : this.mDevicesById.values()) {
                device.setFrozen(frozen);
            }
        }
    }

    private HIDDevice getDevice(int id) {
        HIDDevice result;
        synchronized (this) {
            result = this.mDevicesById.get(Integer.valueOf(id));
            if (result == null) {
                Log.v(TAG, "No device for id: " + id);
                Log.v(TAG, "Available devices: " + this.mDevicesById.keySet());
            }
        }
        return result;
    }

    boolean initialize(boolean usb, boolean bluetooth) {
        Log.v(TAG, "initialize(" + usb + ", " + bluetooth + ")");
        if (usb) {
            initializeUSB();
        }
        if (bluetooth) {
            initializeBluetooth();
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.app.PendingIntent, void] */
    boolean openDevice(int deviceID) {
        Log.v(TAG, "openDevice deviceID=" + deviceID);
        HIDDevice device = getDevice(deviceID);
        if (device == null) {
            HIDDeviceDisconnected(deviceID);
            return false;
        }
        UsbDevice usbDevice = device.getDevice();
        if (usbDevice != null && !this.mUsbManager.hasPermission(usbDevice)) {
            HIDDeviceOpenPending(deviceID);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                }
                Intent intent = new Intent(ACTION_USB_PERMISSION);
                intent.setPackage(this.mContext.getPackageName());
                this.mUsbManager.requestPermission(usbDevice, (PendingIntent) ProxyWindow.processKeyEvent(this.mContext));
            } catch (Exception e) {
                Log.v(TAG, "Couldn't request permission for USB device " + usbDevice);
                HIDDeviceOpenResult(deviceID, false);
            }
            return false;
        }
        try {
            return device.open();
        } catch (Exception e2) {
            Log.e(TAG, "Got exception: " + Log.getStackTraceString(e2));
            return false;
        }
    }

    int writeReport(int deviceID, byte[] report, boolean feature) {
        try {
            HIDDevice device = getDevice(deviceID);
            if (device == null) {
                HIDDeviceDisconnected(deviceID);
                return -1;
            }
            return device.writeReport(report, feature);
        } catch (Exception e) {
            Log.e(TAG, "Got exception: " + Log.getStackTraceString(e));
            return -1;
        }
    }

    boolean readReport(int deviceID, byte[] report, boolean feature) {
        try {
            HIDDevice device = getDevice(deviceID);
            if (device == null) {
                HIDDeviceDisconnected(deviceID);
                return false;
            }
            return device.readReport(report, feature);
        } catch (Exception e) {
            Log.e(TAG, "Got exception: " + Log.getStackTraceString(e));
            return false;
        }
    }

    void closeDevice(int deviceID) {
        try {
            Log.v(TAG, "closeDevice deviceID=" + deviceID);
            HIDDevice device = getDevice(deviceID);
            if (device == null) {
                HIDDeviceDisconnected(deviceID);
            } else {
                device.close();
            }
        } catch (Exception e) {
            Log.e(TAG, "Got exception: " + Log.getStackTraceString(e));
        }
    }
}
