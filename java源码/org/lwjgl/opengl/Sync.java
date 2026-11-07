package org.lwjgl.opengl;

import org.lwjgl.Sys;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/opengl/Sync.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/opengl/Sync.class */
class Sync {
    private static final long NANOS_IN_SECOND = 1000000000;
    private static long nextFrame = 0;
    private static long lastFrameTime = 0;
    private static long lastDelay = 0;
    private static boolean initialised = false;
    private static RunningAvg sleepDurations = new RunningAvg(10);
    private static RunningAvg yieldDurations = new RunningAvg(10);

    Sync() {
    }

    public static void sync(int fps) throws InterruptedException {
        if (fps <= 0) {
            return;
        }
        preciseSync(fps);
    }

    private static void fastSync(int fps) throws InterruptedException {
        if (!initialised) {
            initialised = true;
            lastFrameTime = getTime();
        }
        long currentFrameTime = getTime();
        long deltaMs = (currentFrameTime - lastFrameTime) / 1000000;
        long deltaFrame = 1000 / fps;
        if (deltaMs < deltaFrame) {
            try {
                Thread.sleep(Math.min((deltaFrame - deltaMs) + lastDelay, deltaFrame));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lastDelay = 0L;
        } else {
            lastDelay = deltaMs - deltaFrame;
        }
        lastFrameTime = getTime();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [long, org.lwjgl.opengl.Sync$RunningAvg] */
    /* JADX WARN: Type inference failed for: r0v16, types: [long, org.lwjgl.opengl.Sync$RunningAvg] */
    private static void preciseSync(int fps) throws InterruptedException {
        if (!initialised) {
            initialise();
        }
        try {
            long t0 = getTime();
            while (nextFrame - t0 > sleepDurations.avg()) {
                Thread.sleep(1L);
                ?? r0 = sleepDurations;
                long t1 = getTime();
                r0.add(r0 - t0);
                t0 = t1;
            }
            sleepDurations.dampenForLowResTicker();
            long t02 = getTime();
            while (nextFrame - t02 > yieldDurations.avg()) {
                Thread.yield();
                ?? r02 = yieldDurations;
                long t12 = getTime();
                r02.add(r02 - t02);
                t02 = t12;
            }
        } catch (InterruptedException e) {
        }
        nextFrame = Math.max(nextFrame + (1000000000 / fps), getTime());
    }

    private static void initialise() {
        initialised = true;
        sleepDurations.init(1000000L);
        yieldDurations.init((int) ((-(getTime() - getTime())) * 1.333d));
        nextFrame = getTime();
    }

    private static long getTime() {
        return (Sys.getTime() * 1000000000) / Sys.getTimerResolution();
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl-lwjglx.jar:org/lwjgl/opengl/Sync$RunningAvg.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-lwjglx.jar:org/lwjgl/opengl/Sync$RunningAvg.class */
    private static class RunningAvg {
        private final long[] slots;
        private int offset = 0;
        private static final long DAMPEN_THRESHOLD = 10000000;
        private static final float DAMPEN_FACTOR = 0.9f;

        public RunningAvg(int slotCount) {
            this.slots = new long[slotCount];
        }

        public void init(long value) {
            while (this.offset < this.slots.length) {
                long[] jArr = this.slots;
                int i = this.offset;
                this.offset = i + 1;
                jArr[i] = value;
            }
        }

        public void add(long value) {
            long[] jArr = this.slots;
            int i = this.offset;
            this.offset = i + 1;
            jArr[i % this.slots.length] = value;
            this.offset %= this.slots.length;
        }

        public long avg() {
            long sum = 0;
            for (int i = 0; i < this.slots.length; i++) {
                sum += this.slots[i];
            }
            return sum / this.slots.length;
        }

        public void dampenForLowResTicker() {
            if (avg() > DAMPEN_THRESHOLD) {
                for (int i = 0; i < this.slots.length; i++) {
                    this.slots[i] = (long) (r0[r1] * 0.9f);
                }
            }
        }
    }
}
