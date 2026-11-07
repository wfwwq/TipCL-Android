.class public final Lcom/pymcl/android/ui/Destination$Companion;
.super Ljava/lang/Object;
.source "Destinations.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/ui/Destination;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDestinations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Destinations.kt\ncom/pymcl/android/ui/Destination$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n296#2,2:25\n*S KotlinDebug\n*F\n+ 1 Destinations.kt\ncom/pymcl/android/ui/Destination$Companion\n*L\n21#1:25,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0008\u001a\u0004\u0018\u00010\u00052\u0008\u0010\t\u001a\u0004\u0018\u00010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/pymcl/android/ui/Destination$Companion;",
        "",
        "<init>",
        "()V",
        "start",
        "Lcom/pymcl/android/ui/Destination;",
        "getStart",
        "()Lcom/pymcl/android/ui/Destination;",
        "fromRoute",
        "route",
        "",
        "PyMCL-Android:app_debug"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/pymcl/android/ui/Destination$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromRoute(Ljava/lang/String;)Lcom/pymcl/android/ui/Destination;
    .locals 7
    .param p1, "route"    # Ljava/lang/String;

    .line 21
    invoke-static {}, Lcom/pymcl/android/ui/Destination;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 25
    .local v1, "$i$f$firstOrNull\\1\\21":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\1":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/pymcl/android/ui/Destination;

    .local v4, "it\\2":Lcom/pymcl/android/ui/Destination;
    const/4 v5, 0x0

    .line 21
    .local v5, "$i$a$-firstOrNull-Destination$Companion$fromRoute$1\\2\\25\\0":I
    invoke-virtual {v4}, Lcom/pymcl/android/ui/Destination;->getRoute()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    .line 25
    .end local v4    # "it\\2":Lcom/pymcl/android/ui/Destination;
    .end local v5    # "$i$a$-firstOrNull-Destination$Companion$fromRoute$1\\2\\25\\0":I
    if-eqz v4, :cond_0

    goto :goto_0

    .line 26
    .end local v3    # "element\\1":Ljava/lang/Object;
    :cond_1
    const/4 v3, 0x0

    .end local v0    # "$this$firstOrNull\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$firstOrNull\\1\\21":I
    :goto_0
    check-cast v3, Lcom/pymcl/android/ui/Destination;

    .line 21
    return-object v3
.end method

.method public final getStart()Lcom/pymcl/android/ui/Destination;
    .locals 1

    .line 20
    invoke-static {}, Lcom/pymcl/android/ui/Destination;->access$getStart$cp()Lcom/pymcl/android/ui/Destination;

    move-result-object v0

    return-object v0
.end method
