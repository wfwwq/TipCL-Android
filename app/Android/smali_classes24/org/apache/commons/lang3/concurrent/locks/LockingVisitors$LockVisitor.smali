.class public Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;
.super Ljava/lang/Object;
.source "LockingVisitors.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LockVisitor"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O:",
        "Ljava/lang/Object;",
        "L:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final lock:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "T",
            "L;"
        }
    .end annotation
.end field

.field private final object:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TO;"
        }
    .end annotation
.end field

.field private final readLockSupplier:Ljava/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Supplier<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;"
        }
    .end annotation
.end field

.field private final writeLockSupplier:Ljava/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Supplier<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method protected constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/Supplier;Ljava/util/function/Supplier;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TO;T",
            "L;",
            "Ljava/util/function/Supplier<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;",
            "Ljava/util/function/Supplier<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;)V"
        }
    .end annotation

    .line 120
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;, "Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor<TO;TL;>;"
    .local p1, "object":Ljava/lang/Object;, "TO;"
    .local p2, "lock":Ljava/lang/Object;, "TL;"
    .local p3, "readLockSupplier":Ljava/util/function/Supplier;, "Ljava/util/function/Supplier<Ljava/util/concurrent/locks/Lock;>;"
    .local p4, "writeLockSupplier":Ljava/util/function/Supplier;, "Ljava/util/function/Supplier<Ljava/util/concurrent/locks/Lock;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    const-string v0, "object"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->object:Ljava/lang/Object;

    .line 122
    const-string v0, "lock"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->lock:Ljava/lang/Object;

    .line 123
    const-string/jumbo v0, "readLockSupplier"

    invoke-static {p3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/function/Supplier;

    iput-object v0, p0, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->readLockSupplier:Ljava/util/function/Supplier;

    .line 124
    const-string/jumbo v0, "writeLockSupplier"

    invoke-static {p4, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/function/Supplier;

    iput-object v0, p0, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->writeLockSupplier:Ljava/util/function/Supplier;

    .line 125
    return-void
.end method


# virtual methods
.method public acceptReadLocked(Lorg/apache/commons/lang3/function/FailableConsumer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/commons/lang3/function/FailableConsumer<",
            "TO;*>;)V"
        }
    .end annotation

    .line 145
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;, "Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor<TO;TL;>;"
    .local p1, "consumer":Lorg/apache/commons/lang3/function/FailableConsumer;, "Lorg/apache/commons/lang3/function/FailableConsumer<TO;*>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->readLockSupplier:Ljava/util/function/Supplier;

    invoke-virtual {p0, v0, p1}, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->lockAcceptUnlock(Ljava/util/function/Supplier;Lorg/apache/commons/lang3/function/FailableConsumer;)V

    .line 146
    return-void
.end method

.method public acceptWriteLocked(Lorg/apache/commons/lang3/function/FailableConsumer;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/apache/commons/lang3/function/FailableConsumer<",
            "TO;*>;)V"
        }
    .end annotation

    .line 166
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;, "Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor<TO;TL;>;"
    .local p1, "consumer":Lorg/apache/commons/lang3/function/FailableConsumer;, "Lorg/apache/commons/lang3/function/FailableConsumer<TO;*>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->writeLockSupplier:Ljava/util/function/Supplier;

    invoke-virtual {p0, v0, p1}, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->lockAcceptUnlock(Ljava/util/function/Supplier;Lorg/apache/commons/lang3/function/FailableConsumer;)V

    .line 167
    return-void
.end method

.method public applyReadLocked(Lorg/apache/commons/lang3/function/FailableFunction;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/commons/lang3/function/FailableFunction<",
            "TO;TT;*>;)TT;"
        }
    .end annotation

    .line 205
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;, "Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor<TO;TL;>;"
    .local p1, "function":Lorg/apache/commons/lang3/function/FailableFunction;, "Lorg/apache/commons/lang3/function/FailableFunction<TO;TT;*>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->readLockSupplier:Ljava/util/function/Supplier;

    invoke-virtual {p0, v0, p1}, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->lockApplyUnlock(Ljava/util/function/Supplier;Lorg/apache/commons/lang3/function/FailableFunction;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public applyWriteLocked(Lorg/apache/commons/lang3/function/FailableFunction;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/apache/commons/lang3/function/FailableFunction<",
            "TO;TT;*>;)TT;"
        }
    .end annotation

    .line 232
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;, "Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor<TO;TL;>;"
    .local p1, "function":Lorg/apache/commons/lang3/function/FailableFunction;, "Lorg/apache/commons/lang3/function/FailableFunction<TO;TT;*>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->writeLockSupplier:Ljava/util/function/Supplier;

    invoke-virtual {p0, v0, p1}, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->lockApplyUnlock(Ljava/util/function/Supplier;Lorg/apache/commons/lang3/function/FailableFunction;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getLock()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()T",
            "L;"
        }
    .end annotation

    .line 241
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;, "Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor<TO;TL;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->lock:Ljava/lang/Object;

    return-object v0
.end method

.method public getObject()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TO;"
        }
    .end annotation

    .line 250
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;, "Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor<TO;TL;>;"
    iget-object v0, p0, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->object:Ljava/lang/Object;

    return-object v0
.end method

.method protected lockAcceptUnlock(Ljava/util/function/Supplier;Lorg/apache/commons/lang3/function/FailableConsumer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Supplier<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;",
            "Lorg/apache/commons/lang3/function/FailableConsumer<",
            "TO;*>;)V"
        }
    .end annotation

    .line 265
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;, "Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor<TO;TL;>;"
    .local p1, "lockSupplier":Ljava/util/function/Supplier;, "Ljava/util/function/Supplier<Ljava/util/concurrent/locks/Lock;>;"
    .local p2, "consumer":Lorg/apache/commons/lang3/function/FailableConsumer;, "Lorg/apache/commons/lang3/function/FailableConsumer<TO;*>;"
    invoke-interface {p1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/locks/Lock;

    .line 266
    .local v0, "lock":Ljava/util/concurrent/locks/Lock;
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 268
    :try_start_0
    iget-object v1, p0, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->object:Ljava/lang/Object;

    invoke-interface {p2, v1}, Lorg/apache/commons/lang3/function/FailableConsumer;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 272
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 273
    nop

    .line 274
    return-void

    .line 269
    :catchall_0
    move-exception v1

    .line 270
    .local v1, "t":Ljava/lang/Throwable;
    :try_start_1
    invoke-static {v1}, Lorg/apache/commons/lang3/function/Failable;->rethrow(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v2

    .end local v0    # "lock":Ljava/util/concurrent/locks/Lock;
    .end local p1    # "lockSupplier":Ljava/util/function/Supplier;, "Ljava/util/function/Supplier<Ljava/util/concurrent/locks/Lock;>;"
    .end local p2    # "consumer":Lorg/apache/commons/lang3/function/FailableConsumer;, "Lorg/apache/commons/lang3/function/FailableConsumer<TO;*>;"
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 272
    .end local v1    # "t":Ljava/lang/Throwable;
    .restart local v0    # "lock":Ljava/util/concurrent/locks/Lock;
    .restart local p1    # "lockSupplier":Ljava/util/function/Supplier;, "Ljava/util/function/Supplier<Ljava/util/concurrent/locks/Lock;>;"
    .restart local p2    # "consumer":Lorg/apache/commons/lang3/function/FailableConsumer;, "Lorg/apache/commons/lang3/function/FailableConsumer<TO;*>;"
    :catchall_1
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 273
    throw v1
.end method

.method protected lockApplyUnlock(Ljava/util/function/Supplier;Lorg/apache/commons/lang3/function/FailableFunction;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/function/Supplier<",
            "Ljava/util/concurrent/locks/Lock;",
            ">;",
            "Lorg/apache/commons/lang3/function/FailableFunction<",
            "TO;TT;*>;)TT;"
        }
    .end annotation

    .line 292
    .local p0, "this":Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;, "Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor<TO;TL;>;"
    .local p1, "lockSupplier":Ljava/util/function/Supplier;, "Ljava/util/function/Supplier<Ljava/util/concurrent/locks/Lock;>;"
    .local p2, "function":Lorg/apache/commons/lang3/function/FailableFunction;, "Lorg/apache/commons/lang3/function/FailableFunction<TO;TT;*>;"
    invoke-interface {p1}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/locks/Lock;

    .line 293
    .local v0, "lock":Ljava/util/concurrent/locks/Lock;
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 295
    :try_start_0
    iget-object v1, p0, Lorg/apache/commons/lang3/concurrent/locks/LockingVisitors$LockVisitor;->object:Ljava/lang/Object;

    invoke-interface {p2, v1}, Lorg/apache/commons/lang3/function/FailableFunction;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 299
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 295
    return-object v1

    .line 296
    :catchall_0
    move-exception v1

    .line 297
    .local v1, "t":Ljava/lang/Throwable;
    :try_start_1
    invoke-static {v1}, Lorg/apache/commons/lang3/function/Failable;->rethrow(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object v2

    .end local v0    # "lock":Ljava/util/concurrent/locks/Lock;
    .end local p1    # "lockSupplier":Ljava/util/function/Supplier;, "Ljava/util/function/Supplier<Ljava/util/concurrent/locks/Lock;>;"
    .end local p2    # "function":Lorg/apache/commons/lang3/function/FailableFunction;, "Lorg/apache/commons/lang3/function/FailableFunction<TO;TT;*>;"
    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 299
    .end local v1    # "t":Ljava/lang/Throwable;
    .restart local v0    # "lock":Ljava/util/concurrent/locks/Lock;
    .restart local p1    # "lockSupplier":Ljava/util/function/Supplier;, "Ljava/util/function/Supplier<Ljava/util/concurrent/locks/Lock;>;"
    .restart local p2    # "function":Lorg/apache/commons/lang3/function/FailableFunction;, "Lorg/apache/commons/lang3/function/FailableFunction<TO;TT;*>;"
    :catchall_1
    move-exception v1

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 300
    throw v1
.end method
