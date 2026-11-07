package kotlin;

import androidx.autofill.HintConstants;
import kotlin.Result;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Result.kt */
@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0081\u0080\u0004b\u0002\b\u0004b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u001a)\u0010\b\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\nH\u0081\u0080\u0004b\u0002\b\u0004b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\u0010\u000b\u001a>\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\n\"\u0004\b\u0000\u0010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0087\u0088\u0004b\u0002\b\u0011b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001aS\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\r0\n\"\u0004\b\u0000\u0010\u0012\"\u0004\b\u0001\u0010\r*\u0002H\u00122\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u0002H\u0012\u0012\u0004\u0012\u0002H\r0\u0013¢\u0006\u0002\b\u0014H\u0087\u0088\u0004b\u0002\b\u0011b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a1\u0010\u0016\u001a\u0002H\u0012\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\nH\u0087\u0088\u0004b\u0002\b\u0011b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\u0010\u0017\u001an\u0010\u0018\u001a\u0002H\r\"\u0004\b\u0000\u0010\r\"\b\b\u0001\u0010\u0012*\u0002H\r*\b\u0012\u0004\u0012\u0002H\u00120\n2!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u0002H\r0\u0013H\u0087\u0088\u0004b\u0002\b\u0011b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0015\u001aC\u0010\u001c\u001a\u0002H\r\"\u0004\b\u0000\u0010\r\"\b\b\u0001\u0010\u0012*\u0002H\r*\b\u0012\u0004\u0012\u0002H\u00120\n2\u0006\u0010\u001d\u001a\u0002H\rH\u0087\u0088\u0004b\u0002\b\u0011b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\u0010\u001e\u001a\u0097\u0001\u0010\u001f\u001a\u0002H\r\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\n2!\u0010 \u001a\u001d\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(!\u0012\u0004\u0012\u0002H\r0\u00132!\u0010\u0019\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u0002H\r0\u0013H\u0087\u0088\u0004b\u0002\b\u0011b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007ø\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0002\u0010\"\u001ap\u0010#\u001a\b\u0012\u0004\u0012\u0002H\r0\n\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\n2!\u0010$\u001a\u001d\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(!\u0012\u0004\u0012\u0002H\r0\u0013H\u0087\u0088\u0004b\u0002\b\u0011b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0015\u001ac\u0010%\u001a\b\u0012\u0004\u0012\u0002H\r0\n\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\n2!\u0010$\u001a\u001d\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(!\u0012\u0004\u0012\u0002H\r0\u0013H\u0087\u0088\u0004b\u0002\b\u0011b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001at\u0010&\u001a\b\u0012\u0004\u0012\u0002H\r0\n\"\u0004\b\u0000\u0010\r\"\b\b\u0001\u0010\u0012*\u0002H\r*\b\u0012\u0004\u0012\u0002H\u00120\n2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u0002H\r0\u0013H\u0087\u0088\u0004b\u0002\b\u0011b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0015\u001ag\u0010'\u001a\b\u0012\u0004\u0012\u0002H\r0\n\"\u0004\b\u0000\u0010\r\"\b\b\u0001\u0010\u0012*\u0002H\r*\b\u0012\u0004\u0012\u0002H\u00120\n2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u0002H\r0\u0013H\u0087\u0088\u0004b\u0002\b\u0011b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001an\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00120\n\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\n2!\u0010(\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\t0\u0013H\u0087\u0088\bb\u0002\b\u0011b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007b\u0002\b)ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0015\u001an\u0010 \u001a\b\u0012\u0004\u0012\u0002H\u00120\n\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\n2!\u0010(\u001a\u001d\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\t0\u0013H\u0087\u0088\bb\u0002\b\u0011b\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007b\u0002\b)ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006*"}, d2 = {"createFailure", "", "exception", "", "Lkotlin/PublishedApi;", "Lkotlin/SinceKotlin;", "version", "1.3", "throwOnFailure", "", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "runCatching", "R", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lkotlin/internal/InlineOnly;", "T", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getOrThrow", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrElse", "onFailure", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getOrDefault", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "fold", "onSuccess", "value", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "map", "transform", "mapCatching", "recover", "recoverCatching", "action", "Lkotlin/IgnorableReturnValue;", "kotlin-stdlib"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes24.dex */
public final class ResultKt {
    public static final Object createFailure(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new Result.Failure(exception);
    }

    public static final void throwOnFailure(Object $this$throwOnFailure) {
        if ($this$throwOnFailure instanceof Result.Failure) {
            throw ((Result.Failure) $this$throwOnFailure).exception;
        }
    }

    private static final <R> Object runCatching(Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8116constructorimpl(block.invoke());
        } catch (Throwable e) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8116constructorimpl(createFailure(e));
        }
    }

    private static final <T, R> Object runCatching(T t, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.INSTANCE;
            return Result.m8116constructorimpl(block.invoke(t));
        } catch (Throwable e) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8116constructorimpl(createFailure(e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> T getOrThrow(Object obj) {
        throwOnFailure(obj);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <R, T extends R> R getOrElse(Object obj, Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Throwable exception = Result.m8119exceptionOrNullimpl(obj);
        return exception == null ? obj : onFailure.invoke(exception);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <R, T extends R> R getOrDefault(Object obj, R r) {
        return Result.m8122isFailureimpl(obj) ? r : obj;
    }

    private static final <R, T> R fold(Object $this$fold, Function1<? super T, ? extends R> onSuccess, Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Throwable exception = Result.m8119exceptionOrNullimpl($this$fold);
        return exception == null ? onSuccess.invoke($this$fold) : onFailure.invoke(exception);
    }

    private static final <R, T> Object map(Object $this$map, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (!Result.m8123isSuccessimpl($this$map)) {
            return Result.m8116constructorimpl($this$map);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m8116constructorimpl(transform.invoke($this$map));
    }

    private static final <R, T> Object mapCatching(Object $this$mapCatching, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (Result.m8123isSuccessimpl($this$mapCatching)) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Object $this$mapCatching_u24lambda_u240 = Result.m8116constructorimpl(transform.invoke($this$mapCatching));
                return $this$mapCatching_u24lambda_u240;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m8116constructorimpl(createFailure(th));
            }
        }
        return Result.m8116constructorimpl($this$mapCatching);
    }

    private static final <R, T extends R> Object recover(Object $this$recover, Function1<? super Throwable, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable exception = Result.m8119exceptionOrNullimpl($this$recover);
        if (exception == null) {
            return $this$recover;
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m8116constructorimpl(transform.invoke(exception));
    }

    private static final <R, T extends R> Object recoverCatching(Object $this$recoverCatching, Function1<? super Throwable, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable exception = Result.m8119exceptionOrNullimpl($this$recoverCatching);
        if (exception == null) {
            return $this$recoverCatching;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Object $this$recoverCatching_u24lambda_u240 = Result.m8116constructorimpl(transform.invoke(exception));
            return $this$recoverCatching_u24lambda_u240;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m8116constructorimpl(createFailure(th));
        }
    }

    @IgnorableReturnValue
    private static final <T> Object onFailure(Object $this$onFailure, Function1<? super Throwable, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Throwable it = Result.m8119exceptionOrNullimpl($this$onFailure);
        if (it != null) {
            action.invoke(it);
        }
        return $this$onFailure;
    }

    @IgnorableReturnValue
    private static final <T> Object onSuccess(Object $this$onSuccess, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Result.m8123isSuccessimpl($this$onSuccess)) {
            action.invoke($this$onSuccess);
        }
        return $this$onSuccess;
    }
}
