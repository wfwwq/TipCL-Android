package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: SpringEstimation.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a0\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007\u001a8\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007\u001a0\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0007\u001a(\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a@\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a0\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a0\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a9\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001aH\u0082\b\u001a\r\u0010\u001c\u001a\u00020\u001d*\u00020\u0004H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"MAX_LONG_MILLIS", "", "estimateAnimationDurationMillis", "stiffness", "", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "springConstant", "dampingCoefficient", "mass", "", "estimateCriticallyDamped", "firstRootReal", "p0", "v0", "estimateDurationInternal", "firstRootImaginary", "secondRootReal", "initialPosition", "estimateOverDamped", "estimateUnderDamped", "iterateNewtonsMethod", "x", "fn", "Lkotlin/Function1;", "fnPrime", "isNotFinite", "", "animation-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpringEstimationKt {
    private static final long MAX_LONG_MILLIS = 9223372036854L;

    public static final long estimateAnimationDurationMillis(float stiffness, float dampingRatio, float initialVelocity, float initialDisplacement, float delta) {
        if (dampingRatio == 0.0f) {
            return MAX_LONG_MILLIS;
        }
        return estimateAnimationDurationMillis(stiffness, dampingRatio, initialVelocity, initialDisplacement, delta);
    }

    public static final long estimateAnimationDurationMillis(double stiffness, double dampingRatio, double initialVelocity, double initialDisplacement, double delta) {
        double dampingCoefficient = 2.0d * dampingRatio * Math.sqrt(stiffness);
        double partialRoot = (dampingCoefficient * dampingCoefficient) - (4.0d * stiffness);
        double partialRootReal = partialRoot < 0.0d ? 0.0d : Math.sqrt(partialRoot);
        double partialRootImaginary = partialRoot < 0.0d ? Math.sqrt(Math.abs(partialRoot)) : 0.0d;
        double firstRootReal = ((-dampingCoefficient) + partialRootReal) * 0.5d;
        double firstRootImaginary = partialRootImaginary * 0.5d;
        double secondRootReal = ((-dampingCoefficient) - partialRootReal) * 0.5d;
        return estimateDurationInternal(firstRootReal, firstRootImaginary, secondRootReal, dampingRatio, initialVelocity, initialDisplacement, delta);
    }

    public static final long estimateAnimationDurationMillis(double springConstant, double dampingCoefficient, double mass, double initialVelocity, double initialDisplacement, double delta) {
        double criticalDamping = Math.sqrt(springConstant * mass) * 2.0d;
        double dampingRatio = dampingCoefficient / criticalDamping;
        double partialRoot = (dampingCoefficient * dampingCoefficient) - ((4.0d * mass) * springConstant);
        double divisor = 1.0d / (2.0d * mass);
        double partialRootReal = partialRoot < 0.0d ? 0.0d : Math.sqrt(partialRoot);
        double partialRootImaginary = partialRoot < 0.0d ? Math.sqrt(Math.abs(partialRoot)) : 0.0d;
        double firstRootReal = ((-dampingCoefficient) + partialRootReal) * divisor;
        double firstRootImaginary = partialRootImaginary * divisor;
        double secondRootReal = ((-dampingCoefficient) - partialRootReal) * divisor;
        return estimateDurationInternal(firstRootReal, firstRootImaginary, secondRootReal, dampingRatio, initialVelocity, initialDisplacement, delta);
    }

    private static final double estimateUnderDamped(double firstRootReal, double firstRootImaginary, double p0, double v0, double delta) {
        double c2 = (v0 - (firstRootReal * p0)) / firstRootImaginary;
        double c = Math.sqrt((p0 * p0) + (c2 * c2));
        return Math.log(delta / c) / firstRootReal;
    }

    private static final double estimateCriticallyDamped(double firstRootReal, double p0, double v0, double delta) {
        double r;
        double tCurr;
        double tConcavChange;
        double r2 = firstRootReal;
        double c2 = v0 - (r2 * p0);
        double t1 = Math.log(Math.abs(delta / p0)) / r2;
        double guess = Math.log(Math.abs(delta / c2));
        double t = guess;
        int i = 0;
        while (true) {
            r = r2;
            if (i >= 6) {
                break;
            }
            t = guess - Math.log(Math.abs(t / r));
            i++;
            r2 = r;
        }
        double t2 = t / r;
        if ((Double.doubleToRawLongBits(t1) & Long.MAX_VALUE) < 9218868437227405312L) {
            tCurr = !((Double.doubleToRawLongBits(t2) & Long.MAX_VALUE) < 9218868437227405312L) ? t1 : Math.max(t1, t2);
        } else {
            tCurr = t2;
        }
        double tInflection = (-((r * p0) + c2)) / (r * c2);
        double xInflection = (Math.exp(r * tInflection) * p0) + (c2 * tInflection * Math.exp(r * tInflection));
        if (Double.isNaN(tInflection) || tInflection <= 0.0d) {
            tConcavChange = -delta;
        } else if (tInflection <= 0.0d || (-xInflection) >= delta) {
            double tConcavChange2 = (-(2.0d / r)) - (p0 / c2);
            tCurr = tConcavChange2;
            tConcavChange = delta;
        } else {
            if (c2 < 0.0d && p0 > 0.0d) {
                tCurr = 0.0d;
            }
            tConcavChange = -delta;
        }
        double tDelta = Double.MAX_VALUE;
        int iterations = 0;
        while (tDelta > 0.001d && iterations < 100) {
            double tLast = tCurr;
            double t3 = tCurr;
            tCurr -= (((p0 + (c2 * t3)) * Math.exp(r * t3)) + tConcavChange) / (((((r * t3) + 1) * c2) + (p0 * r)) * Math.exp(r * t3));
            tDelta = Math.abs(tLast - tCurr);
            iterations++;
            tInflection = tInflection;
        }
        return tCurr;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final double estimateOverDamped(double r35, double r37, double r39, double r41, double r43) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SpringEstimationKt.estimateOverDamped(double, double, double, double, double):double");
    }

    private static final double estimateOverDamped$xInflection(double c1, double r1, double tInflection, double c2, double r2) {
        return (Math.exp(r1 * tInflection) * c1) + (Math.exp(r2 * tInflection) * c2);
    }

    private static final long estimateDurationInternal(double firstRootReal, double firstRootImaginary, double secondRootReal, double dampingRatio, double initialVelocity, double initialPosition, double delta) {
        double dEstimateCriticallyDamped;
        if (initialPosition == 0.0d) {
            if (initialVelocity == 0.0d) {
                return 0L;
            }
        }
        double v0 = initialPosition < 0.0d ? -initialVelocity : initialVelocity;
        double p0 = Math.abs(initialPosition);
        if (dampingRatio > 1.0d) {
            dEstimateCriticallyDamped = estimateOverDamped(firstRootReal, secondRootReal, p0, v0, delta);
        } else if (dampingRatio < 1.0d) {
            dEstimateCriticallyDamped = estimateUnderDamped(firstRootReal, firstRootImaginary, p0, v0, delta);
        } else {
            dEstimateCriticallyDamped = estimateCriticallyDamped(firstRootReal, p0, v0, delta);
        }
        return (long) (dEstimateCriticallyDamped * 1000.0d);
    }

    private static final double iterateNewtonsMethod(double x, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
        return x - (function1.invoke(Double.valueOf(x)).doubleValue() / function12.invoke(Double.valueOf(x)).doubleValue());
    }

    private static final boolean isNotFinite(double $this$isNotFinite) {
        return !((Double.doubleToRawLongBits($this$isNotFinite) & Long.MAX_VALUE) < 9218868437227405312L);
    }
}
