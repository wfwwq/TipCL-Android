package org.apache.commons.lang3;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.apache.commons.lang3.Streams;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.function.Failable;
import org.apache.commons.lang3.function.FailableBooleanSupplier;

@Deprecated
/* loaded from: classes24.dex */
public class Functions {

    @FunctionalInterface
    @Deprecated
    public interface FailableBiConsumer<O1, O2, T extends Throwable> {
        void accept(O1 o1, O2 o2) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableBiFunction<O1, O2, R, T extends Throwable> {
        R apply(O1 o1, O2 o2) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableBiPredicate<O1, O2, T extends Throwable> {
        boolean test(O1 o1, O2 o2) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableCallable<R, T extends Throwable> {
        R call() throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableConsumer<O, T extends Throwable> {
        void accept(O o) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableFunction<I, R, T extends Throwable> {
        R apply(I i) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface FailablePredicate<I, T extends Throwable> {
        boolean test(I i) throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableRunnable<T extends Throwable> {
        void run() throws Throwable;
    }

    @FunctionalInterface
    @Deprecated
    public interface FailableSupplier<R, T extends Throwable> {
        R get() throws Throwable;
    }

    public static <O1, O2, T extends Throwable> void accept(final FailableBiConsumer<O1, O2, T> consumer, final O1 object1, final O2 object2) {
        run(new FailableRunnable() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.Functions.FailableRunnable
            public final void run() throws Throwable {
                consumer.accept(object1, object2);
            }
        });
    }

    public static <O, T extends Throwable> void accept(final FailableConsumer<O, T> consumer, final O object) {
        run(new FailableRunnable() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda14
            @Override // org.apache.commons.lang3.Functions.FailableRunnable
            public final void run() throws Throwable {
                consumer.accept(object);
            }
        });
    }

    public static <O1, O2, O, T extends Throwable> O apply(final FailableBiFunction<O1, O2, O, T> failableBiFunction, final O1 o1, final O2 o2) {
        return (O) get(new FailableSupplier() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda2
            @Override // org.apache.commons.lang3.Functions.FailableSupplier
            public final Object get() {
                return failableBiFunction.apply(o1, o2);
            }
        });
    }

    public static <I, O, T extends Throwable> O apply(final FailableFunction<I, O, T> failableFunction, final I i) {
        return (O) get(new FailableSupplier() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda11
            @Override // org.apache.commons.lang3.Functions.FailableSupplier
            public final Object get() {
                return failableFunction.apply(i);
            }
        });
    }

    public static <O1, O2> BiConsumer<O1, O2> asBiConsumer(final FailableBiConsumer<O1, O2, ?> consumer) {
        return new BiConsumer() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda8
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Functions.accept(consumer, obj, obj2);
            }
        };
    }

    public static <O1, O2, O> BiFunction<O1, O2, O> asBiFunction(final FailableBiFunction<O1, O2, O, ?> function) {
        return new BiFunction() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda12
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return Functions.apply(function, obj, obj2);
            }
        };
    }

    public static <O1, O2> BiPredicate<O1, O2> asBiPredicate(final FailableBiPredicate<O1, O2, ?> predicate) {
        return new BiPredicate() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda4
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                return Functions.test(predicate, obj, obj2);
            }
        };
    }

    public static <O> Callable<O> asCallable(final FailableCallable<O, ?> callable) {
        return new Callable() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Functions.call(callable);
            }
        };
    }

    public static <I> Consumer<I> asConsumer(final FailableConsumer<I, ?> consumer) {
        return new Consumer() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Functions.accept(consumer, obj);
            }
        };
    }

    public static <I, O> Function<I, O> asFunction(final FailableFunction<I, O, ?> function) {
        return new Function() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Functions.apply(function, obj);
            }
        };
    }

    public static <I> Predicate<I> asPredicate(final FailablePredicate<I, ?> predicate) {
        return new Predicate() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Functions.test(predicate, obj);
            }
        };
    }

    public static Runnable asRunnable(final FailableRunnable<?> runnable) {
        return new Runnable() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                Functions.run(runnable);
            }
        };
    }

    public static <O> Supplier<O> asSupplier(final FailableSupplier<O, ?> supplier) {
        return new Supplier() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda13
            @Override // java.util.function.Supplier
            public final Object get() {
                return Functions.get(supplier);
            }
        };
    }

    public static <O, T extends Throwable> O call(final FailableCallable<O, T> failableCallable) {
        Objects.requireNonNull(failableCallable);
        return (O) get(new FailableSupplier() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda9
            @Override // org.apache.commons.lang3.Functions.FailableSupplier
            public final Object get() {
                return failableCallable.call();
            }
        });
    }

    public static <O, T extends Throwable> O get(FailableSupplier<O, T> supplier) {
        try {
            return supplier.get();
        } catch (Throwable t) {
            throw rethrow(t);
        }
    }

    private static <T extends Throwable> boolean getAsBoolean(FailableBooleanSupplier<T> supplier) {
        try {
            return supplier.getAsBoolean();
        } catch (Throwable t) {
            throw rethrow(t);
        }
    }

    public static RuntimeException rethrow(Throwable throwable) {
        Objects.requireNonNull(throwable, "throwable");
        ExceptionUtils.throwUnchecked(throwable);
        if (throwable instanceof IOException) {
            throw new UncheckedIOException((IOException) throwable);
        }
        throw new UndeclaredThrowableException(throwable);
    }

    public static <T extends Throwable> void run(FailableRunnable<T> runnable) {
        try {
            runnable.run();
        } catch (Throwable t) {
            throw rethrow(t);
        }
    }

    public static <O> Streams.FailableStream<O> stream(Collection<O> collection) {
        return new Streams.FailableStream<>(collection.stream());
    }

    public static <O> Streams.FailableStream<O> stream(Stream<O> stream) {
        return new Streams.FailableStream<>(stream);
    }

    public static <O1, O2, T extends Throwable> boolean test(final FailableBiPredicate<O1, O2, T> predicate, final O1 object1, final O2 object2) {
        return getAsBoolean(new FailableBooleanSupplier() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda5
            @Override // org.apache.commons.lang3.function.FailableBooleanSupplier
            public final boolean getAsBoolean() {
                return predicate.test(object1, object2);
            }
        });
    }

    public static <O, T extends Throwable> boolean test(final FailablePredicate<O, T> predicate, final O object) {
        return getAsBoolean(new FailableBooleanSupplier() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda7
            @Override // org.apache.commons.lang3.function.FailableBooleanSupplier
            public final boolean getAsBoolean() {
                return predicate.test(object);
            }
        });
    }

    @SafeVarargs
    public static void tryWithResources(final FailableRunnable<? extends Throwable> action, final FailableConsumer<Throwable, ? extends Throwable> errorHandler, final FailableRunnable<? extends Throwable>... resources) {
        org.apache.commons.lang3.function.FailableConsumer failableConsumer;
        org.apache.commons.lang3.function.FailableRunnable<?>[] fr = new org.apache.commons.lang3.function.FailableRunnable[resources.length];
        Arrays.setAll(fr, new IntFunction() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda17
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return Functions.lambda$tryWithResources$16(resources, i);
            }
        });
        Objects.requireNonNull(action);
        org.apache.commons.lang3.function.FailableRunnable failableRunnable = new org.apache.commons.lang3.function.FailableRunnable() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda18
            @Override // org.apache.commons.lang3.function.FailableRunnable
            public final void run() throws Throwable {
                action.run();
            }
        };
        if (errorHandler != null) {
            Objects.requireNonNull(errorHandler);
            failableConsumer = new org.apache.commons.lang3.function.FailableConsumer() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda19
                @Override // org.apache.commons.lang3.function.FailableConsumer
                public final void accept(Object obj) throws Throwable {
                    errorHandler.accept((Throwable) obj);
                }
            };
        } else {
            failableConsumer = null;
        }
        Failable.tryWithResources(failableRunnable, failableConsumer, fr);
    }

    static /* synthetic */ org.apache.commons.lang3.function.FailableRunnable lambda$tryWithResources$16(final FailableRunnable[] resources, final int i) {
        return new org.apache.commons.lang3.function.FailableRunnable() { // from class: org.apache.commons.lang3.Functions$$ExternalSyntheticLambda15
            @Override // org.apache.commons.lang3.function.FailableRunnable
            public final void run() throws Throwable {
                resources[i].run();
            }
        };
    }

    @SafeVarargs
    public static void tryWithResources(FailableRunnable<? extends Throwable> action, FailableRunnable<? extends Throwable>... resources) {
        tryWithResources(action, null, resources);
    }
}
