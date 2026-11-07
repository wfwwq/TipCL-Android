.class public final Lcom/pymcl/core/instance/Nbt;
.super Ljava/lang/Object;
.source "Playtime.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/pymcl/core/instance/Nbt;",
        "",
        "<init>",
        "()V",
        "serversDat",
        "",
        "l",
        "",
        "Lcom/pymcl/core/instance/ServerEntry;",
        "PyMCL-Android:core"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/pymcl/core/instance/Nbt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/pymcl/core/instance/Nbt;

    invoke-direct {v0}, Lcom/pymcl/core/instance/Nbt;-><init>()V

    sput-object v0, Lcom/pymcl/core/instance/Nbt;->INSTANCE:Lcom/pymcl/core/instance/Nbt;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final serversDat$name(Ljava/io/DataOutputStream;Ljava/lang/String;)V
    .locals 2
    .param p0, "o"    # Ljava/io/DataOutputStream;
    .param p1, "n"    # Ljava/lang/String;

    .line 63
    sget-object v0, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, "getBytes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .local v0, "b":[B
    array-length v1, v0

    invoke-virtual {p0, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    invoke-virtual {p0, v0}, Ljava/io/DataOutputStream;->write([B)V

    return-void
.end method

.method private static final serversDat$str(Ljava/io/DataOutputStream;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0, "o"    # Ljava/io/DataOutputStream;
    .param p1, "k"    # Ljava/lang/String;
    .param p2, "v"    # Ljava/lang/String;

    .line 64
    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Ljava/io/DataOutputStream;->writeByte(I)V

    invoke-static {p0, p1}, Lcom/pymcl/core/instance/Nbt;->serversDat$name(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    invoke-static {p0, p2}, Lcom/pymcl/core/instance/Nbt;->serversDat$name(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final serversDat(Ljava/util/List;)[B
    .locals 9
    .param p1, "l"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/pymcl/core/instance/ServerEntry;",
            ">;)[B"
        }
    .end annotation

    const-string v0, "l"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .local v0, "bo":Ljava/io/ByteArrayOutputStream;
    new-instance v1, Ljava/io/DataOutputStream;

    move-object v2, v0

    check-cast v2, Ljava/io/OutputStream;

    invoke-direct {v1, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 65
    .local v1, "o":Ljava/io/DataOutputStream;
    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    const-string v3, ""

    invoke-static {v1, v3}, Lcom/pymcl/core/instance/Nbt;->serversDat$name(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    .line 66
    const/16 v3, 0x9

    invoke-virtual {v1, v3}, Ljava/io/DataOutputStream;->writeByte(I)V

    const-string v3, "servers"

    invoke-static {v1, v3}, Lcom/pymcl/core/instance/Nbt;->serversDat$name(Ljava/io/DataOutputStream;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeByte(I)V

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 67
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/pymcl/core/instance/ServerEntry;

    .local v3, "s":Lcom/pymcl/core/instance/ServerEntry;
    const-string v5, "name"

    invoke-virtual {v3}, Lcom/pymcl/core/instance/ServerEntry;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v5, v6}, Lcom/pymcl/core/instance/Nbt;->serversDat$str(Ljava/io/DataOutputStream;Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "ip"

    invoke-virtual {v3}, Lcom/pymcl/core/instance/ServerEntry;->getAddress()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v5, v6}, Lcom/pymcl/core/instance/Nbt;->serversDat$str(Ljava/io/DataOutputStream;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/pymcl/core/instance/ServerEntry;->getIcon()Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-lez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    move v5, v4

    :goto_1
    if-eqz v5, :cond_1

    invoke-virtual {v3}, Lcom/pymcl/core/instance/ServerEntry;->getIcon()Ljava/lang/String;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/16 v8, 0x2f

    invoke-static {v5, v8, v4, v6, v7}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    const-string v5, "icon"

    invoke-virtual {v3}, Lcom/pymcl/core/instance/ServerEntry;->getIcon()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v5, v6}, Lcom/pymcl/core/instance/Nbt;->serversDat$str(Ljava/io/DataOutputStream;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v1, v4}, Ljava/io/DataOutputStream;->writeByte(I)V

    .end local v3    # "s":Lcom/pymcl/core/instance/ServerEntry;
    goto :goto_0

    .line 68
    :cond_2
    invoke-virtual {v1, v4}, Ljava/io/DataOutputStream;->writeByte(I)V

    invoke-virtual {v1}, Ljava/io/DataOutputStream;->flush()V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    const-string v3, "toByteArray(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v2
.end method
