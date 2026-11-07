.class public final synthetic Lcom/pymcl/android/ui/PyMclAppKt$WhenMappings;
.super Ljava/lang/Object;
.source "PyMclApp.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/pymcl/android/ui/PyMclAppKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1019
    name = "WhenMappings"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I

.field public static final synthetic $EnumSwitchMapping$1:[I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    invoke-static {}, Lcom/pymcl/android/ui/Destination;->values()[Lcom/pymcl/android/ui/Destination;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    const/4 v1, 0x1

    :try_start_0
    sget-object v2, Lcom/pymcl/android/ui/Destination;->Launch:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v2}, Lcom/pymcl/android/ui/Destination;->ordinal()I

    move-result v2

    aput v1, v0, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    :goto_0
    const/4 v2, 0x2

    :try_start_1
    sget-object v3, Lcom/pymcl/android/ui/Destination;->Versions:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v3}, Lcom/pymcl/android/ui/Destination;->ordinal()I

    move-result v3

    aput v2, v0, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v3

    :goto_1
    const/4 v3, 0x3

    :try_start_2
    sget-object v4, Lcom/pymcl/android/ui/Destination;->Library:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v4}, Lcom/pymcl/android/ui/Destination;->ordinal()I

    move-result v4

    aput v3, v0, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception v4

    :goto_2
    const/4 v4, 0x4

    :try_start_3
    sget-object v5, Lcom/pymcl/android/ui/Destination;->Instances:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v5}, Lcom/pymcl/android/ui/Destination;->ordinal()I

    move-result v5

    aput v4, v0, v5
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_3

    :catch_3
    move-exception v5

    :goto_3
    const/4 v5, 0x5

    :try_start_4
    sget-object v6, Lcom/pymcl/android/ui/Destination;->Java:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v6}, Lcom/pymcl/android/ui/Destination;->ordinal()I

    move-result v6

    aput v5, v0, v6
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    goto :goto_4

    :catch_4
    move-exception v6

    :goto_4
    const/4 v6, 0x6

    :try_start_5
    sget-object v7, Lcom/pymcl/android/ui/Destination;->Accounts:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v7}, Lcom/pymcl/android/ui/Destination;->ordinal()I

    move-result v7

    aput v6, v0, v7
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    goto :goto_5

    :catch_5
    move-exception v7

    :goto_5
    const/4 v7, 0x7

    :try_start_6
    sget-object v8, Lcom/pymcl/android/ui/Destination;->Ai:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v8}, Lcom/pymcl/android/ui/Destination;->ordinal()I

    move-result v8

    aput v7, v0, v8
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_6

    :catch_6
    move-exception v8

    :goto_6
    :try_start_7
    sget-object v8, Lcom/pymcl/android/ui/Destination;->Multiplayer:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v8}, Lcom/pymcl/android/ui/Destination;->ordinal()I

    move-result v8

    const/16 v9, 0x8

    aput v9, v0, v8
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    goto :goto_7

    :catch_7
    move-exception v8

    :goto_7
    :try_start_8
    sget-object v8, Lcom/pymcl/android/ui/Destination;->Servers:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v8}, Lcom/pymcl/android/ui/Destination;->ordinal()I

    move-result v8

    const/16 v9, 0x9

    aput v9, v0, v8
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    goto :goto_8

    :catch_8
    move-exception v8

    :goto_8
    :try_start_9
    sget-object v8, Lcom/pymcl/android/ui/Destination;->Settings:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v8}, Lcom/pymcl/android/ui/Destination;->ordinal()I

    move-result v8

    const/16 v9, 0xa

    aput v9, v0, v8
    :try_end_9
    .catch Ljava/lang/NoSuchFieldError; {:try_start_9 .. :try_end_9} :catch_9

    goto :goto_9

    :catch_9
    move-exception v8

    :goto_9
    :try_start_a
    sget-object v8, Lcom/pymcl/android/ui/Destination;->PlayTime:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v8}, Lcom/pymcl/android/ui/Destination;->ordinal()I

    move-result v8

    const/16 v9, 0xb

    aput v9, v0, v8
    :try_end_a
    .catch Ljava/lang/NoSuchFieldError; {:try_start_a .. :try_end_a} :catch_a

    goto :goto_a

    :catch_a
    move-exception v8

    :goto_a
    :try_start_b
    sget-object v8, Lcom/pymcl/android/ui/Destination;->Tasks:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v8}, Lcom/pymcl/android/ui/Destination;->ordinal()I

    move-result v8

    const/16 v9, 0xc

    aput v9, v0, v8
    :try_end_b
    .catch Ljava/lang/NoSuchFieldError; {:try_start_b .. :try_end_b} :catch_b

    goto :goto_b

    :catch_b
    move-exception v8

    :goto_b
    :try_start_c
    sget-object v8, Lcom/pymcl/android/ui/Destination;->Feedback:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {v8}, Lcom/pymcl/android/ui/Destination;->ordinal()I

    move-result v8

    const/16 v9, 0xd

    aput v9, v0, v8
    :try_end_c
    .catch Ljava/lang/NoSuchFieldError; {:try_start_c .. :try_end_c} :catch_c

    goto :goto_c

    :catch_c
    move-exception v8

    :goto_c
    sput-object v0, Lcom/pymcl/android/ui/PyMclAppKt$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-static {}, Lcom/pymcl/android/ui/state/CatalogKind;->values()[Lcom/pymcl/android/ui/state/CatalogKind;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    :try_start_d
    sget-object v8, Lcom/pymcl/android/ui/state/CatalogKind;->Mod:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v8}, Lcom/pymcl/android/ui/state/CatalogKind;->ordinal()I

    move-result v8

    aput v1, v0, v8
    :try_end_d
    .catch Ljava/lang/NoSuchFieldError; {:try_start_d .. :try_end_d} :catch_d

    goto :goto_d

    :catch_d
    move-exception v1

    :goto_d
    :try_start_e
    sget-object v1, Lcom/pymcl/android/ui/state/CatalogKind;->Mods:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/CatalogKind;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_e
    .catch Ljava/lang/NoSuchFieldError; {:try_start_e .. :try_end_e} :catch_e

    goto :goto_e

    :catch_e
    move-exception v1

    :goto_e
    :try_start_f
    sget-object v1, Lcom/pymcl/android/ui/state/CatalogKind;->Modpack:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/CatalogKind;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_f
    .catch Ljava/lang/NoSuchFieldError; {:try_start_f .. :try_end_f} :catch_f

    goto :goto_f

    :catch_f
    move-exception v1

    :goto_f
    :try_start_10
    sget-object v1, Lcom/pymcl/android/ui/state/CatalogKind;->Datapack:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/CatalogKind;->ordinal()I

    move-result v1

    aput v4, v0, v1
    :try_end_10
    .catch Ljava/lang/NoSuchFieldError; {:try_start_10 .. :try_end_10} :catch_10

    goto :goto_10

    :catch_10
    move-exception v1

    :goto_10
    :try_start_11
    sget-object v1, Lcom/pymcl/android/ui/state/CatalogKind;->Resource:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/CatalogKind;->ordinal()I

    move-result v1

    aput v5, v0, v1
    :try_end_11
    .catch Ljava/lang/NoSuchFieldError; {:try_start_11 .. :try_end_11} :catch_11

    goto :goto_11

    :catch_11
    move-exception v1

    :goto_11
    :try_start_12
    sget-object v1, Lcom/pymcl/android/ui/state/CatalogKind;->Shader:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/CatalogKind;->ordinal()I

    move-result v1

    aput v6, v0, v1
    :try_end_12
    .catch Ljava/lang/NoSuchFieldError; {:try_start_12 .. :try_end_12} :catch_12

    goto :goto_12

    :catch_12
    move-exception v1

    :goto_12
    :try_start_13
    sget-object v1, Lcom/pymcl/android/ui/state/CatalogKind;->World:Lcom/pymcl/android/ui/state/CatalogKind;

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/CatalogKind;->ordinal()I

    move-result v1

    aput v7, v0, v1
    :try_end_13
    .catch Ljava/lang/NoSuchFieldError; {:try_start_13 .. :try_end_13} :catch_13

    goto :goto_13

    :catch_13
    move-exception v1

    :goto_13
    sput-object v0, Lcom/pymcl/android/ui/PyMclAppKt$WhenMappings;->$EnumSwitchMapping$1:[I

    return-void
.end method
