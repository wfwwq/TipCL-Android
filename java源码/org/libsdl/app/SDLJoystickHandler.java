package org.libsdl.app;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.lights.Light;
import android.hardware.lights.LightsManager;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: SDLControllerManager.java */
/* loaded from: classes9.dex */
class SDLJoystickHandler {
    private final ArrayList<SDLJoystick> mJoysticks = new ArrayList<>();

    /* compiled from: SDLControllerManager.java */
    static class SDLJoystick {
        Sensor accelerometerSensor;
        ArrayList<InputDevice.MotionRange> axes;
        String desc;
        int device_id;
        Sensor gyroscopeSensor;
        ArrayList<InputDevice.MotionRange> hats;
        ArrayList<Light> lights;
        LightsManager.LightsSession lightsSession;
        String name;
        SDLJoySensorListener sensorListener;
        SensorManager sensorManager;

        SDLJoystick() {
        }
    }

    /* compiled from: SDLControllerManager.java */
    static class RangeComparator implements Comparator<InputDevice.MotionRange> {
        RangeComparator() {
        }

        @Override // java.util.Comparator
        public int compare(InputDevice.MotionRange arg0, InputDevice.MotionRange arg1) {
            int arg0Axis = arg0.getAxis();
            int arg1Axis = arg1.getAxis();
            if (arg0Axis == 22) {
                arg0Axis = 23;
            } else if (arg0Axis == 23) {
                arg0Axis = 22;
            }
            if (arg1Axis == 22) {
                arg1Axis = 23;
            } else if (arg1Axis == 23) {
                arg1Axis = 22;
            }
            if (arg0Axis == 11) {
                arg0Axis = 13;
            } else if (arg0Axis > 11 && arg0Axis < 14) {
                arg0Axis--;
            }
            if (arg1Axis == 11) {
                arg1Axis = 13;
            } else if (arg1Axis > 11 && arg1Axis < 14) {
                arg1Axis--;
            }
            return arg0Axis - arg1Axis;
        }
    }

    SDLJoystickHandler() {
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.hardware.lights.LightsManager, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List, void] */
    synchronized void pollInputDevices() {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        int[] deviceIds = InputDevice.getDeviceIds();
        int i3 = 0;
        ?? length = deviceIds.length;
        while (i3 < length) {
            int i4 = deviceIds[i3];
            if (!SDLControllerManager.isDeviceSDLJoystick(i4)) {
                z = length == true ? 1 : 0;
                i = i3;
            } else if (getJoystick(i4) != null) {
                z = length == true ? 1 : 0;
                i = i3;
            } else {
                InputDevice device = InputDevice.getDevice(i4);
                SDLJoystick sDLJoystick = new SDLJoystick();
                sDLJoystick.device_id = i4;
                sDLJoystick.name = device.getName();
                sDLJoystick.desc = getJoystickDescriptor(device);
                sDLJoystick.axes = new ArrayList<>();
                sDLJoystick.hats = new ArrayList<>();
                HashSet hashSet = new HashSet();
                sDLJoystick.lights = new ArrayList<>();
                List<InputDevice.MotionRange> motionRanges = device.getMotionRanges();
                Collections.sort(motionRanges, new RangeComparator());
                for (InputDevice.MotionRange motionRange : motionRanges) {
                    if ((motionRange.getSource() & 16) != 0 && hashSet.add(Integer.valueOf(motionRange.getAxis()))) {
                        if (motionRange.getAxis() == 15 || motionRange.getAxis() == 16) {
                            sDLJoystick.hats.add(motionRange);
                        } else {
                            sDLJoystick.axes.add(motionRange);
                        }
                    }
                }
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                if (Build.VERSION.SDK_INT < 31) {
                    z = length == true ? 1 : 0;
                    i = i3;
                    z2 = false;
                    z3 = false;
                    z4 = false;
                    z5 = false;
                } else {
                    if (device.getVibratorManager().getVibratorIds().length > 0) {
                        z7 = true;
                    }
                    ?? lightsManager = device.getLightsManager();
                    boolean z10 = length;
                    for (Light light : lightsManager.setAccessible(length)) {
                        if (!light.hasRgbControl()) {
                            z6 = z10;
                            i2 = i3;
                        } else {
                            z6 = z10;
                            i2 = i3;
                            sDLJoystick.lights.add(light);
                        }
                        z10 = z6;
                        i3 = i2;
                    }
                    boolean z11 = z10;
                    i = i3;
                    if (!sDLJoystick.lights.isEmpty()) {
                        sDLJoystick.lightsSession = lightsManager.openSession();
                        z8 = true;
                    }
                    SensorManager sensorManager = device.getSensorManager();
                    if (sensorManager == null) {
                        z2 = z7;
                        z3 = z8;
                        z4 = false;
                        z5 = false;
                        z = z11;
                    } else {
                        sDLJoystick.sensorManager = sensorManager;
                        sDLJoystick.sensorListener = new SDLJoySensorListener(sDLJoystick.device_id);
                        sDLJoystick.accelerometerSensor = sensorManager.getDefaultSensor(1);
                        if (sDLJoystick.accelerometerSensor != null) {
                            z9 = true;
                        }
                        sDLJoystick.gyroscopeSensor = sensorManager.getDefaultSensor(4);
                        if (sDLJoystick.gyroscopeSensor == null) {
                            z2 = z7;
                            z3 = z8;
                            z4 = z9;
                            z5 = false;
                            z = z11;
                        } else {
                            z2 = z7;
                            z3 = z8;
                            z4 = z9;
                            z5 = true;
                            z = z11;
                        }
                    }
                }
                this.mJoysticks.add(sDLJoystick);
                SDLControllerManager.nativeAddJoystick(sDLJoystick.device_id, sDLJoystick.name, sDLJoystick.desc, getVendorId(device), getProductId(device), getButtonMask(device), sDLJoystick.axes.size(), getAxisMask(sDLJoystick.axes), sDLJoystick.hats.size() / 2, z2, z3, z4, z5);
            }
            i3 = i + 1;
            length = z;
        }
        Iterator<SDLJoystick> it = this.mJoysticks.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            int i5 = it.next().device_id;
            int i6 = 0;
            while (i6 < deviceIds.length && i5 != deviceIds[i6]) {
                i6++;
            }
            if (i6 == deviceIds.length) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(Integer.valueOf(i5));
            }
        }
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Integer) it2.next()).intValue();
                SDLControllerManager.nativeRemoveJoystick(iIntValue);
                int i7 = 0;
                while (true) {
                    if (i7 >= this.mJoysticks.size()) {
                        break;
                    }
                    if (this.mJoysticks.get(i7).device_id != iIntValue) {
                        i7++;
                    } else {
                        if (Build.VERSION.SDK_INT >= 31 && this.mJoysticks.get(i7).lightsSession != null) {
                            try {
                                this.mJoysticks.get(i7).lightsSession.close();
                            } catch (Exception e) {
                            }
                            this.mJoysticks.get(i7).lightsSession = null;
                        }
                        this.mJoysticks.remove(i7);
                    }
                }
            }
        }
    }

    protected synchronized SDLJoystick getJoystick(int device_id) {
        Iterator<SDLJoystick> it = this.mJoysticks.iterator();
        while (it.hasNext()) {
            SDLJoystick joystick = it.next();
            if (joystick.device_id == device_id) {
                return joystick;
            }
        }
        return null;
    }

    boolean handleMotionEvent(MotionEvent event) {
        SDLJoystick joystick;
        int actionPointerIndex = event.getActionIndex();
        int action = event.getActionMasked();
        if (action == 2 && (joystick = getJoystick(event.getDeviceId())) != null) {
            for (int i = 0; i < joystick.axes.size(); i++) {
                InputDevice.MotionRange range = joystick.axes.get(i);
                float value = (((event.getAxisValue(range.getAxis(), actionPointerIndex) - range.getMin()) / range.getRange()) * 2.0f) - 1.0f;
                SDLControllerManager.onNativeJoy(joystick.device_id, i, value);
            }
            for (int i2 = 0; i2 < joystick.hats.size() / 2; i2++) {
                int hatX = Math.round(event.getAxisValue(joystick.hats.get(i2 * 2).getAxis(), actionPointerIndex));
                int hatY = Math.round(event.getAxisValue(joystick.hats.get((i2 * 2) + 1).getAxis(), actionPointerIndex));
                SDLControllerManager.onNativeHat(joystick.device_id, i2, hatX, hatY);
            }
        }
        return true;
    }

    String getJoystickDescriptor(InputDevice joystickDevice) {
        String desc = joystickDevice.getDescriptor();
        if (desc != null && !desc.isEmpty()) {
            return desc;
        }
        return joystickDevice.getName();
    }

    int getProductId(InputDevice joystickDevice) {
        return joystickDevice.getProductId();
    }

    int getVendorId(InputDevice joystickDevice) {
        return joystickDevice.getVendorId();
    }

    int getAxisMask(List<InputDevice.MotionRange> ranges) {
        int axis_mask = 0;
        if (ranges.size() >= 2) {
            axis_mask = 0 | 3;
        }
        if (ranges.size() >= 4) {
            axis_mask |= 12;
        }
        if (ranges.size() >= 6) {
            axis_mask |= 48;
        }
        boolean have_z = false;
        boolean have_past_z_before_rz = false;
        for (InputDevice.MotionRange range : ranges) {
            int axis = range.getAxis();
            if (axis == 11) {
                have_z = true;
            } else if (axis > 11 && axis < 14) {
                have_past_z_before_rz = true;
            }
        }
        if (have_z && have_past_z_before_rz) {
            return axis_mask | 32768;
        }
        return axis_mask;
    }

    int getButtonMask(InputDevice joystickDevice) {
        int button_mask = 0;
        int[] keys = {96, 97, 99, 100, 4, 82, 110, 108, 106, 107, 102, 103, 19, 20, 21, 22, 109, 23, 104, 105, 98, 101, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203};
        int[] masks = {1, 2, 4, 8, 16, 64, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 16, 1, 32768, 65536, 131072, 262144, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824, Integer.MIN_VALUE, -1, -1, -1, -1};
        boolean[] has_keys = joystickDevice.hasKeys(keys);
        for (int i = 0; i < keys.length; i++) {
            if (has_keys[i]) {
                button_mask |= masks[i];
            }
        }
        return button_mask;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 ??, still in use, count: 1, list:
          (r4v1 ?? I:android.hardware.lights.LightsRequest) from 0x004e: INVOKE (r3v3 ?? I:android.hardware.lights.LightsManager$LightsSession), (r4v1 ?? I:android.hardware.lights.LightsRequest) VIRTUAL call: android.hardware.lights.LightsManager.LightsSession.requestLights(android.hardware.lights.LightsRequest):void A[MD:(android.hardware.lights.LightsRequest):void (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    void setLED(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 ??, still in use, count: 1, list:
          (r4v1 ?? I:android.hardware.lights.LightsRequest) from 0x004e: INVOKE (r3v3 ?? I:android.hardware.lights.LightsManager$LightsSession), (r4v1 ?? I:android.hardware.lights.LightsRequest) VIRTUAL call: android.hardware.lights.LightsManager.LightsSession.requestLights(android.hardware.lights.LightsRequest):void A[MD:(android.hardware.lights.LightsRequest):void (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
        */

    void setSensorsEnabled(int device_id, boolean enabled) {
        SDLJoystick joystick;
        if (Build.VERSION.SDK_INT < 31 || (joystick = getJoystick(device_id)) == null || joystick.sensorManager == null) {
            return;
        }
        if (enabled) {
            if (joystick.accelerometerSensor != null) {
                SDLSensorManager.registerListener(joystick.sensorManager, joystick.sensorListener, joystick.accelerometerSensor, 1);
            }
            if (joystick.gyroscopeSensor != null) {
                SDLSensorManager.registerListener(joystick.sensorManager, joystick.sensorListener, joystick.gyroscopeSensor, 1);
                return;
            }
            return;
        }
        if (joystick.accelerometerSensor != null) {
            SDLSensorManager.unregisterListener(joystick.sensorManager, joystick.sensorListener, joystick.accelerometerSensor);
        }
        if (joystick.gyroscopeSensor != null) {
            SDLSensorManager.unregisterListener(joystick.sensorManager, joystick.sensorListener, joystick.gyroscopeSensor);
        }
    }
}
