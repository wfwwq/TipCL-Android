package org.apache.commons.lang3.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.Function;
import org.apache.commons.lang3.exception.ExceptionUtils;

/* loaded from: classes24.dex */
public class Memoizer<I, O> implements Computable<I, O> {
    private final ConcurrentMap<I, Future<O>> cache;
    private final Function<? super I, ? extends Future<O>> mappingFunction;
    private final boolean recalculate;

    public Memoizer(Computable<I, O> computable) {
        this((Computable) computable, false);
    }

    public Memoizer(final Computable<I, O> computable, boolean recalculate) {
        this.cache = new ConcurrentHashMap();
        this.recalculate = recalculate;
        this.mappingFunction = new Function() { // from class: org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FutureTasks.run(new Callable() { // from class: org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return computable.compute(obj);
                    }
                });
            }
        };
    }

    public Memoizer(Function<I, O> function) {
        this((Function) function, false);
    }

    public Memoizer(final Function<I, O> function, boolean recalculate) {
        this.cache = new ConcurrentHashMap();
        this.recalculate = recalculate;
        this.mappingFunction = new Function() { // from class: org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return FutureTasks.run(new Callable() { // from class: org.apache.commons.lang3.concurrent.Memoizer$$ExternalSyntheticLambda2
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return function.apply(obj);
                    }
                });
            }
        };
    }

    @Override // org.apache.commons.lang3.concurrent.Computable
    public O compute(I arg) throws InterruptedException {
        while (true) {
            Future<O> future = this.cache.computeIfAbsent(arg, this.mappingFunction);
            try {
                return future.get();
            } catch (CancellationException e) {
                this.cache.remove(arg, future);
            } catch (ExecutionException e2) {
                if (this.recalculate) {
                    this.cache.remove(arg, future);
                }
                throw launderException(e2.getCause());
            }
        }
    }

    private RuntimeException launderException(Throwable throwable) {
        throw new IllegalStateException("Unchecked exception", ExceptionUtils.throwUnchecked(throwable));
    }
}
