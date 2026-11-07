.class public final Lcom/pymcl/core/loader/LoaderInstaller;
.super Ljava/lang/Object;
.source "Loaders.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/core/loader/LoaderInstaller$Companion;,
        Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;,
        Lcom/pymcl/core/loader/LoaderInstaller$OptiFineBuild;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLoaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Loaders.kt\ncom/pymcl/core/loader/LoaderInstaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,360:1\n1795#2,10:361\n2068#2:371\n2069#2:373\n1805#2:374\n1795#2,10:376\n2068#2:386\n2069#2:388\n1805#2:389\n777#2:390\n873#2,2:391\n1739#2:393\n1814#2,3:394\n777#2:397\n873#2,2:398\n1739#2:400\n1814#2,3:401\n1544#2:405\n1633#2,2:406\n1739#2:408\n1814#2,3:409\n1635#2,3:412\n777#2:415\n873#2,2:416\n1795#2,10:418\n2068#2:428\n2069#2:430\n1805#2:431\n1960#2,3:432\n1939#2,3:439\n1795#2,10:442\n2068#2:452\n2069#2:455\n1805#2:456\n1739#2:458\n1814#2,3:459\n777#2:462\n873#2,2:463\n1795#2,10:465\n2068#2:475\n2069#2:477\n1805#2:478\n1739#2:479\n1814#2,3:480\n2068#2,2:487\n777#2:489\n873#2,2:490\n1804#2:492\n2068#2:493\n2069#2:495\n1805#2:496\n1849#2,8:497\n1221#2:505\n1739#2:507\n1814#2,3:508\n296#2,2:511\n2945#2,3:513\n1#3:372\n1#3:375\n1#3:387\n1#3:404\n1#3:429\n1#3:453\n1#3:454\n1#3:457\n1#3:476\n1#3:483\n1#3:494\n1#3:506\n129#4:435\n158#4,3:436\n3938#5:484\n4474#5,2:485\n*S KotlinDebug\n*F\n+ 1 Loaders.kt\ncom/pymcl/core/loader/LoaderInstaller\n*L\n53#1:361,10\n53#1:371\n53#1:373\n53#1:374\n58#1:376,10\n58#1:386\n58#1:388\n58#1:389\n59#1:390\n59#1:391,2\n60#1:393\n60#1:394,3\n65#1:397\n65#1:398,2\n65#1:400\n65#1:401,3\n88#1:405\n88#1:406,2\n88#1:408\n88#1:409,3\n88#1:412,3\n144#1:415\n144#1:416,2\n184#1:418,10\n184#1:428\n184#1:430\n184#1:431\n185#1:432,3\n187#1:439,3\n189#1:442,10\n189#1:452\n189#1:455\n189#1:456\n192#1:458\n192#1:459,3\n193#1:462\n193#1:463,2\n212#1:465,10\n212#1:475\n212#1:477\n212#1:478\n215#1:479\n215#1:480,3\n276#1:487,2\n296#1:489\n296#1:490,2\n296#1:492\n296#1:493\n296#1:495\n296#1:496\n297#1:497,8\n297#1:505\n306#1:507\n306#1:508,3\n317#1:511,2\n325#1:513,3\n53#1:372\n58#1:387\n184#1:429\n189#1:454\n212#1:476\n296#1:494\n186#1:435\n186#1:436,3\n276#1:484\n276#1:485,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 w2\u00020\u0001:\u0003wxyB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0014\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0015J&\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J\u0014\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u0014\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010!\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0019H\u0002J\u0014\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010%\u001a\u00020\u0015J:\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010*\u001a\u00020\u00152\n\u0008\u0002\u0010+\u001a\u0004\u0018\u00010\u0015H\u0086@\u00a2\u0006\u0002\u0010,J\u001c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0015J\u0014\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010#\u001a\u00020\u0015J&\u00100\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u00101J&\u00102\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u00101J<\u00104\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u00106\u001a\u00020\u00152\u0006\u0010.\u001a\u000207H\u0082@\u00a2\u0006\u0002\u00108J0\u00109\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u000b2\u0008\u0008\u0002\u0010.\u001a\u000207H\u0086@\u00a2\u0006\u0002\u0010;J8\u0010<\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(2\u0006\u0010=\u001a\u00020>2\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010@j\u0002`AH\u0082@\u00a2\u0006\u0002\u0010BJH\u0010C\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>2\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010@j\u0002`AH\u0082@\u00a2\u0006\u0002\u0010DJT\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150@2\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010=\u001a\u00020>2\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010@j\u0002`A2\u0006\u0010F\u001a\u00020\u000bJ2\u0010G\u001a\u00020H2\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150JH\u0082@\u00a2\u0006\u0002\u0010KJ*\u0010L\u001a\u00020\u00152\u0006\u0010M\u001a\u00020\u00152\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150J2\u0006\u0010N\u001a\u00020\u000bJF\u0010O\u001a\u00020H2\u0006\u0010\'\u001a\u00020(2\u0018\u0010P\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010@j\u0002`A2\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150J2\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J \u0010Q\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u000bH\u0002J\u0014\u0010R\u001a\u0008\u0012\u0004\u0012\u00020S0\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u0014\u0010T\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u001e\u0010U\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010)\u001a\u00020\u00152\u0006\u0010V\u001a\u00020\u0015J\u001a\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150X2\u0006\u0010Y\u001a\u00020\u0015J\u0016\u0010Z\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u0015J\u001e\u0010[\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0002\u0010\\J\u0010\u0010]\u001a\u0002072\u0006\u0010^\u001a\u00020\u000bH\u0002J&\u0010_\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u00101J&\u0010`\u001a\u00020\u000b2\u0006\u0010a\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u0010bJ\u001c\u0010c\u001a\u0008\u0012\u0004\u0012\u00020d0\u00182\u0006\u0010e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015J\u0014\u0010f\u001a\u0008\u0012\u0004\u0012\u00020d0\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u0014\u0010g\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001a\u001a\u00020\u0015J\u0014\u0010h\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010i\u001a\u00020dJ2\u0010j\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00152\n\u0008\u0002\u0010k\u001a\u0004\u0018\u00010dH\u0086@\u00a2\u0006\u0002\u0010lJ*\u0010m\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00010@j\u0002`A2\u0006\u0010n\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(H\u0002J \u0010o\u001a\u00020H2\u0006\u0010=\u001a\u00020>2\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020\u000bH\u0002J8\u0010s\u001a\u00020H2\u0006\u0010\'\u001a\u00020(2\u0006\u0010t\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u000e\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00182\u0006\u0010v\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000c\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\"\u0004\u0008\u0012\u0010\u0013\u00a8\u0006z"
    }
    d2 = {
        "Lcom/pymcl/core/loader/LoaderInstaller;",
        "",
        "http",
        "Lcom/pymcl/core/net/Http;",
        "mirrors",
        "Lcom/pymcl/core/download/Mirrors;",
        "dm",
        "Lcom/pymcl/core/download/DownloadManager;",
        "game",
        "Lcom/pymcl/core/version/GameInstaller;",
        "cacheDir",
        "Ljava/io/File;",
        "javaRunner",
        "Lcom/pymcl/core/loader/JavaProcessRunner;",
        "<init>",
        "(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/download/Mirrors;Lcom/pymcl/core/download/DownloadManager;Lcom/pymcl/core/version/GameInstaller;Ljava/io/File;Lcom/pymcl/core/loader/JavaProcessRunner;)V",
        "getJavaRunner",
        "()Lcom/pymcl/core/loader/JavaProcessRunner;",
        "setJavaRunner",
        "(Lcom/pymcl/core/loader/JavaProcessRunner;)V",
        "getText",
        "",
        "url",
        "fabricVersions",
        "",
        "Lcom/pymcl/core/loader/LoaderVersion;",
        "mc",
        "quiltVersions",
        "metaVersions",
        "t",
        "Lcom/pymcl/core/loader/LoaderType;",
        "forgeVersions",
        "neoforgeVersions",
        "neoPrefix",
        "verKey",
        "v",
        "mavenVersions",
        "xml",
        "installFabricLike",
        "dirs",
        "Lcom/pymcl/core/version/GameDirs;",
        "type",
        "loader",
        "versionId",
        "(Lcom/pymcl/core/version/GameDirs;Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "forgeInstallerUrls",
        "forge",
        "neoforgeInstallerUrls",
        "installForge",
        "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "installNeoForge",
        "version",
        "installWithInstaller",
        "urls",
        "cacheName",
        "",
        "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "installFromInstaller",
        "installer",
        "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "installLegacy",
        "z",
        "Ljava/util/zip/ZipFile;",
        "prof",
        "",
        "Lcom/pymcl/core/util/JObj;",
        "(Lcom/pymcl/core/version/GameDirs;Ljava/util/zip/ZipFile;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "installModern",
        "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;Ljava/util/zip/ZipFile;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "processorData",
        "tmp",
        "prefetchMojmaps",
        "",
        "data",
        "",
        "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "substitute",
        "arg",
        "libDir",
        "runProcessor",
        "p",
        "installViaOfficial",
        "optifineBuilds",
        "Lcom/pymcl/core/loader/LoaderInstaller$OptiFineBuild;",
        "optifineVersions",
        "optifineUrl",
        "patch",
        "splitOptiFine",
        "Lkotlin/Pair;",
        "edition",
        "optifineVersionId",
        "downloadOptiFine",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isZip",
        "f",
        "installOptiFine",
        "installOptiFineAsMod",
        "modsDir",
        "(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "parseLiteLoader",
        "Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;",
        "text",
        "liteloaderBuilds",
        "liteloaderVersions",
        "liteloaderUrls",
        "b",
        "installLiteLoader",
        "build",
        "(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "localLib",
        "name",
        "extract",
        "e",
        "Ljava/util/zip/ZipEntry;",
        "dst",
        "writeTweakVersion",
        "id",
        "libs",
        "tweak",
        "Companion",
        "OptiFineBuild",
        "LiteLoaderBuild",
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
.field public static final Companion:Lcom/pymcl/core/loader/LoaderInstaller$Companion;

.field public static final FABRIC_META:Ljava/lang/String; = "https://meta.fabricmc.net/v2"

.field public static final FORGE_MAVEN:Ljava/lang/String; = "https://maven.minecraftforge.net/net/minecraftforge/forge"

.field private static final FORGE_MAVEN_MIRRORS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final NEOFORGE_LEGACY_MAVEN:Ljava/lang/String; = "https://maven.neoforged.net/releases/net/neoforged/forge"

.field public static final NEOFORGE_MAVEN:Ljava/lang/String; = "https://maven.neoforged.net/releases/net/neoforged/neoforge"

.field public static final QUILT_META:Ljava/lang/String; = "https://meta.quiltmc.org/v3"


# instance fields
.field private final cacheDir:Ljava/io/File;

.field private final dm:Lcom/pymcl/core/download/DownloadManager;

.field private final game:Lcom/pymcl/core/version/GameInstaller;

.field private final http:Lcom/pymcl/core/net/Http;

.field private javaRunner:Lcom/pymcl/core/loader/JavaProcessRunner;

.field private final mirrors:Lcom/pymcl/core/download/Mirrors;


# direct methods
.method public static synthetic $r8$lambda$OzCfF0dAipLOsUR5V1sJjVSIw4w(Ljava/util/Map;Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0, p1}, Lcom/pymcl/core/loader/LoaderInstaller;->substitute$lambda$0(Ljava/util/Map;Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$QaMb7kNEmVGrxcBrGOSi3Dm60cE(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/loader/LoaderInstaller;->verKey$lambda$0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$RA-97oBIL0JMHyE0BxMQ3r76mqc(Lkotlin/Pair;)Ljava/lang/CharSequence;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/loader/LoaderInstaller;->runProcessor$lambda$8(Lkotlin/Pair;)Ljava/lang/CharSequence;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$zMIUjRcVrJmTpPnaOuf_peTTVA4(Lkotlin/text/MatchResult;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/core/loader/LoaderInstaller;->mavenVersions$lambda$0(Lkotlin/text/MatchResult;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/core/loader/LoaderInstaller$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/core/loader/LoaderInstaller$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/core/loader/LoaderInstaller;->Companion:Lcom/pymcl/core/loader/LoaderInstaller$Companion;

    .line 44
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "https://maven.minecraftforge.net/net/minecraftforge/forge"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "https://bmclapi2.bangbang93.com/maven/net/minecraftforge/forge"

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/core/loader/LoaderInstaller;->FORGE_MAVEN_MIRRORS:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/download/Mirrors;Lcom/pymcl/core/download/DownloadManager;Lcom/pymcl/core/version/GameInstaller;Ljava/io/File;Lcom/pymcl/core/loader/JavaProcessRunner;)V
    .locals 1
    .param p1, "http"    # Lcom/pymcl/core/net/Http;
    .param p2, "mirrors"    # Lcom/pymcl/core/download/Mirrors;
    .param p3, "dm"    # Lcom/pymcl/core/download/DownloadManager;
    .param p4, "game"    # Lcom/pymcl/core/version/GameInstaller;
    .param p5, "cacheDir"    # Ljava/io/File;
    .param p6, "javaRunner"    # Lcom/pymcl/core/loader/JavaProcessRunner;

    const-string v0, "http"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mirrors"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dm"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "game"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cacheDir"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaRunner"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/pymcl/core/loader/LoaderInstaller;->http:Lcom/pymcl/core/net/Http;

    iput-object p2, p0, Lcom/pymcl/core/loader/LoaderInstaller;->mirrors:Lcom/pymcl/core/download/Mirrors;

    iput-object p3, p0, Lcom/pymcl/core/loader/LoaderInstaller;->dm:Lcom/pymcl/core/download/DownloadManager;

    .line 36
    iput-object p4, p0, Lcom/pymcl/core/loader/LoaderInstaller;->game:Lcom/pymcl/core/version/GameInstaller;

    iput-object p5, p0, Lcom/pymcl/core/loader/LoaderInstaller;->cacheDir:Ljava/io/File;

    iput-object p6, p0, Lcom/pymcl/core/loader/LoaderInstaller;->javaRunner:Lcom/pymcl/core/loader/JavaProcessRunner;

    .line 34
    return-void
.end method

.method public synthetic constructor <init>(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/download/Mirrors;Lcom/pymcl/core/download/DownloadManager;Lcom/pymcl/core/version/GameInstaller;Ljava/io/File;Lcom/pymcl/core/loader/JavaProcessRunner;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    .line 34
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 36
    sget-object p6, Lcom/pymcl/core/loader/UnavailableJavaRunner;->INSTANCE:Lcom/pymcl/core/loader/UnavailableJavaRunner;

    check-cast p6, Lcom/pymcl/core/loader/JavaProcessRunner;

    move-object v6, p6

    goto :goto_0

    .line 34
    :cond_0
    move-object v6, p6

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v6}, Lcom/pymcl/core/loader/LoaderInstaller;-><init>(Lcom/pymcl/core/net/Http;Lcom/pymcl/core/download/Mirrors;Lcom/pymcl/core/download/DownloadManager;Lcom/pymcl/core/version/GameInstaller;Ljava/io/File;Lcom/pymcl/core/loader/JavaProcessRunner;)V

    .line 37
    return-void
.end method

.method public static final synthetic access$downloadOptiFine(Lcom/pymcl/core/loader/LoaderInstaller;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/loader/LoaderInstaller;
    .param p1, "mc"    # Ljava/lang/String;
    .param p2, "edition"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 34
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/core/loader/LoaderInstaller;->downloadOptiFine(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getFORGE_MAVEN_MIRRORS$cp()Ljava/util/List;
    .locals 1

    .line 34
    sget-object v0, Lcom/pymcl/core/loader/LoaderInstaller;->FORGE_MAVEN_MIRRORS:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$installLegacy(Lcom/pymcl/core/loader/LoaderInstaller;Lcom/pymcl/core/version/GameDirs;Ljava/util/zip/ZipFile;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/loader/LoaderInstaller;
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "z"    # Ljava/util/zip/ZipFile;
    .param p3, "prof"    # Ljava/util/Map;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 34
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pymcl/core/loader/LoaderInstaller;->installLegacy(Lcom/pymcl/core/version/GameDirs;Ljava/util/zip/ZipFile;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$installModern(Lcom/pymcl/core/loader/LoaderInstaller;Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;Ljava/util/zip/ZipFile;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/loader/LoaderInstaller;
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "installer"    # Ljava/io/File;
    .param p4, "z"    # Ljava/util/zip/ZipFile;
    .param p5, "prof"    # Ljava/util/Map;
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 34
    invoke-direct/range {p0 .. p6}, Lcom/pymcl/core/loader/LoaderInstaller;->installModern(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;Ljava/util/zip/ZipFile;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$installWithInstaller(Lcom/pymcl/core/loader/LoaderInstaller;Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/loader/LoaderInstaller;
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "urls"    # Ljava/util/List;
    .param p4, "cacheName"    # Ljava/lang/String;
    .param p5, "forge"    # Z
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 34
    invoke-direct/range {p0 .. p6}, Lcom/pymcl/core/loader/LoaderInstaller;->installWithInstaller(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$prefetchMojmaps(Lcom/pymcl/core/loader/LoaderInstaller;Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/loader/LoaderInstaller;
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "data"    # Ljava/util/Map;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 34
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/pymcl/core/loader/LoaderInstaller;->prefetchMojmaps(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$verKey(Lcom/pymcl/core/loader/LoaderInstaller;Lcom/pymcl/core/loader/LoaderVersion;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/core/loader/LoaderInstaller;
    .param p1, "v"    # Lcom/pymcl/core/loader/LoaderVersion;

    .line 34
    invoke-direct {p0, p1}, Lcom/pymcl/core/loader/LoaderInstaller;->verKey(Lcom/pymcl/core/loader/LoaderVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private final downloadOptiFine(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 23
    .param p1, "mc"    # Ljava/lang/String;
    .param p2, "edition"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/io/File;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;

    iget v4, v3, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v4, v3, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->label:I

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;

    invoke-direct {v3, v0, v2}, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;-><init>(Lcom/pymcl/core/loader/LoaderInstaller;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v8, v3

    .local v8, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v3, v8, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->result:Ljava/lang/Object;

    .local v3, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v11

    .line 225
    iget v4, v8, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->label:I

    packed-switch v4, :pswitch_data_0

    move-object/from16 v12, p2

    .end local v3    # "$result":Ljava/lang/Object;
    .end local v8    # "$continuation":Lkotlin/coroutines/Continuation;
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    .restart local v3    # "$result":Ljava/lang/Object;
    .restart local v8    # "$continuation":Lkotlin/coroutines/Continuation;
    :pswitch_0
    iget-object v4, v8, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/io/File;

    .local v4, "f":Ljava/io/File;
    iget-object v5, v8, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .local v5, "p":Ljava/lang/String;
    iget-object v6, v8, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    .local v6, "t":Ljava/lang/String;
    iget-object v7, v8, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    .end local p2    # "edition":Ljava/lang/String;
    .local v7, "edition":Ljava/lang/String;
    iget-object v9, v8, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->L$0:Ljava/lang/Object;

    move-object v1, v9

    check-cast v1, Ljava/lang/String;

    .end local p1    # "mc":Ljava/lang/String;
    .local v1, "mc":Ljava/lang/String;
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v12, v7

    goto/16 :goto_1

    .end local v1    # "mc":Ljava/lang/String;
    .end local v4    # "f":Ljava/io/File;
    .end local v5    # "p":Ljava/lang/String;
    .end local v6    # "t":Ljava/lang/String;
    .end local v7    # "edition":Ljava/lang/String;
    .restart local p1    # "mc":Ljava/lang/String;
    .restart local p2    # "edition":Ljava/lang/String;
    :pswitch_1
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 226
    move-object/from16 v12, p2

    invoke-virtual {v0, v12}, Lcom/pymcl/core/loader/LoaderInstaller;->splitOptiFine(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v4

    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Ljava/lang/String;

    .local v13, "t":Ljava/lang/String;
    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Ljava/lang/String;

    .line 227
    .local v14, "p":Ljava/lang/String;
    new-instance v4, Ljava/io/File;

    iget-object v5, v0, Lcom/pymcl/core/loader/LoaderInstaller;->cacheDir:Ljava/io/File;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "optifine/OptiFine_"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "_"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ".jar"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 228
    .restart local v4    # "f":Ljava/io/File;
    invoke-direct {v0, v4}, Lcom/pymcl/core/loader/LoaderInstaller;->isZip(Ljava/io/File;)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    move-object/from16 v17, v4

    .end local v4    # "f":Ljava/io/File;
    .local v17, "f":Ljava/io/File;
    iget-object v4, v0, Lcom/pymcl/core/loader/LoaderInstaller;->dm:Lcom/pymcl/core/download/DownloadManager;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "OptiFine "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v15, Lcom/pymcl/core/download/DownloadItem;

    invoke-virtual {v0, v1, v13, v14}, Lcom/pymcl/core/loader/LoaderInstaller;->optifineUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    const/16 v21, 0x1c

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v15 .. v22}, Lcom/pymcl/core/download/DownloadItem;-><init>(Ljava/util/List;Ljava/io/File;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v15

    move-object/from16 v15, v17

    .end local v17    # "f":Ljava/io/File;
    .local v15, "f":Ljava/io/File;
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v8, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->L$0:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v8, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->L$1:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v8, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->L$2:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v8, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->L$3:Ljava/lang/Object;

    iput-object v15, v8, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->L$4:Ljava/lang/Object;

    const/4 v7, 0x1

    iput v7, v8, Lcom/pymcl/core/loader/LoaderInstaller$downloadOptiFine$1;->label:I

    const/4 v7, 0x0

    const/4 v9, 0x4

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lcom/pymcl/core/download/DownloadManager;->downloadAll$default(Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v11, :cond_1

    .line 225
    return-object v11

    .line 228
    :cond_1
    move-object v6, v13

    move-object v5, v14

    move-object v4, v15

    .line 229
    .end local v13    # "t":Ljava/lang/String;
    .end local v14    # "p":Ljava/lang/String;
    .end local v15    # "f":Ljava/io/File;
    .end local p1    # "mc":Ljava/lang/String;
    .end local p2    # "edition":Ljava/lang/String;
    .restart local v1    # "mc":Ljava/lang/String;
    .restart local v4    # "f":Ljava/io/File;
    .restart local v5    # "p":Ljava/lang/String;
    .restart local v6    # "t":Ljava/lang/String;
    .local v12, "edition":Ljava/lang/String;
    :goto_1
    move-object v14, v5

    move-object v13, v6

    goto :goto_2

    .line 228
    .end local v1    # "mc":Ljava/lang/String;
    .end local v5    # "p":Ljava/lang/String;
    .end local v6    # "t":Ljava/lang/String;
    .end local v12    # "edition":Ljava/lang/String;
    .restart local v13    # "t":Ljava/lang/String;
    .restart local v14    # "p":Ljava/lang/String;
    .restart local p1    # "mc":Ljava/lang/String;
    .restart local p2    # "edition":Ljava/lang/String;
    :cond_2
    move-object v15, v4

    .line 229
    .end local p1    # "mc":Ljava/lang/String;
    .end local p2    # "edition":Ljava/lang/String;
    .restart local v1    # "mc":Ljava/lang/String;
    .restart local v12    # "edition":Ljava/lang/String;
    :goto_2
    invoke-direct {v0, v4}, Lcom/pymcl/core/loader/LoaderInstaller;->isZip(Ljava/io/File;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 230
    return-object v4

    .line 229
    :cond_3
    new-instance v5, Lcom/pymcl/core/loader/InstallError;

    const-string v6, "OptiFine \u4e0b\u8f7d\u5185\u5bb9\u4e0d\u662f\u6709\u6548\u7684 jar"

    const/4 v7, 0x2

    const/4 v9, 0x0

    invoke-direct {v5, v6, v9, v7, v9}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final extract(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;)V
    .locals 10
    .param p1, "z"    # Ljava/util/zip/ZipFile;
    .param p2, "e"    # Ljava/util/zip/ZipEntry;
    .param p3, "dst"    # Ljava/io/File;

    .line 334
    invoke-virtual {p3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    invoke-virtual {p1, p2}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v0

    check-cast v0, Ljava/io/Closeable;

    :try_start_0
    move-object v1, v0

    check-cast v1, Ljava/io/InputStream;

    .line 506
    .local v1, "i":Ljava/io/InputStream;
    const/4 v2, 0x0

    .local v2, "$i$a$-use-LoaderInstaller$extract$1":I
    new-instance v3, Ljava/io/FileOutputStream;

    .line 334
    invoke-direct {v3, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    check-cast v3, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    move-object v4, v3

    check-cast v4, Ljava/io/FileOutputStream;

    .line 506
    .local v4, "it":Ljava/io/FileOutputStream;
    const/4 v5, 0x0

    .line 334
    .local v5, "$i$a$-use-LoaderInstaller$extract$1$1":I
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v6, v4

    check-cast v6, Ljava/io/OutputStream;

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static {v1, v6, v7, v8, v9}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v4    # "it":Ljava/io/FileOutputStream;
    .end local v5    # "$i$a$-use-LoaderInstaller$extract$1$1":I
    :try_start_2
    invoke-static {v3, v9}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .end local v1    # "i":Ljava/io/InputStream;
    .end local v2    # "$i$a$-use-LoaderInstaller$extract$1":I
    invoke-static {v0, v9}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    return-void

    .restart local v1    # "i":Ljava/io/InputStream;
    .restart local v2    # "$i$a$-use-LoaderInstaller$extract$1":I
    :catchall_0
    move-exception v4

    .end local v1    # "i":Ljava/io/InputStream;
    .end local v2    # "$i$a$-use-LoaderInstaller$extract$1":I
    .end local p1    # "z":Ljava/util/zip/ZipFile;
    .end local p2    # "e":Ljava/util/zip/ZipEntry;
    .end local p3    # "dst":Ljava/io/File;
    :try_start_3
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .restart local v1    # "i":Ljava/io/InputStream;
    .restart local v2    # "$i$a$-use-LoaderInstaller$extract$1":I
    .restart local p1    # "z":Ljava/util/zip/ZipFile;
    .restart local p2    # "e":Ljava/util/zip/ZipEntry;
    .restart local p3    # "dst":Ljava/io/File;
    :catchall_1
    move-exception v5

    :try_start_4
    invoke-static {v3, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local p1    # "z":Ljava/util/zip/ZipFile;
    .end local p2    # "e":Ljava/util/zip/ZipEntry;
    .end local p3    # "dst":Ljava/io/File;
    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .end local v1    # "i":Ljava/io/InputStream;
    .end local v2    # "$i$a$-use-LoaderInstaller$extract$1":I
    .restart local p1    # "z":Ljava/util/zip/ZipFile;
    .restart local p2    # "e":Ljava/util/zip/ZipEntry;
    .restart local p3    # "dst":Ljava/io/File;
    :catchall_2
    move-exception v1

    .end local p1    # "z":Ljava/util/zip/ZipFile;
    .end local p2    # "e":Ljava/util/zip/ZipEntry;
    .end local p3    # "dst":Ljava/io/File;
    :try_start_5
    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .restart local p1    # "z":Ljava/util/zip/ZipFile;
    .restart local p2    # "e":Ljava/util/zip/ZipEntry;
    .restart local p3    # "dst":Ljava/io/File;
    :catchall_3
    move-exception v2

    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method private final getText(Ljava/lang/String;)Ljava/lang/String;
    .locals 9
    .param p1, "url"    # Ljava/lang/String;

    .line 47
    const/4 v0, 0x0

    .line 48
    .local v0, "e":Ljava/lang/Exception;
    iget-object v1, p0, Lcom/pymcl/core/loader/LoaderInstaller;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v1, p1}, Lcom/pymcl/core/download/Mirrors;->candidates(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v2, v0

    .end local v0    # "e":Ljava/lang/Exception;
    .local v2, "e":Ljava/lang/Exception;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .local v4, "u":Ljava/lang/String;
    :try_start_0
    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderInstaller;->http:Lcom/pymcl/core/net/Http;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/pymcl/core/net/Http;->getText$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .local v0, "x":Ljava/lang/Exception;
    move-object v2, v0

    .end local v0    # "x":Ljava/lang/Exception;
    .end local v4    # "u":Ljava/lang/String;
    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    throw v2
.end method

.method public static synthetic installFabricLike$default(Lcom/pymcl/core/loader/LoaderInstaller;Lcom/pymcl/core/version/GameDirs;Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 73
    and-int/lit8 p7, p7, 0x10

    if-eqz p7, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Lcom/pymcl/core/loader/LoaderInstaller;->installFabricLike(Lcom/pymcl/core/version/GameDirs;Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic installFromInstaller$default(Lcom/pymcl/core/loader/LoaderInstaller;Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 107
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p4, 0x1

    :cond_0
    move v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/pymcl/core/loader/LoaderInstaller;->installFromInstaller(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final installLegacy(Lcom/pymcl/core/version/GameDirs;Ljava/util/zip/ZipFile;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 20
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "z"    # Ljava/util/zip/ZipFile;
    .param p3, "prof"    # Ljava/util/Map;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/GameDirs;",
            "Ljava/util/zip/ZipFile;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    instance-of v0, v4, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;

    if-eqz v0, :cond_0

    move-object v0, v4

    check-cast v0, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;

    iget v5, v0, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->label:I

    const/high16 v6, -0x80000000

    and-int/2addr v5, v6

    if-eqz v5, :cond_0

    iget v5, v0, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->label:I

    sub-int/2addr v5, v6

    iput v5, v0, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;

    invoke-direct {v0, v1, v4}, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;-><init>(Lcom/pymcl/core/loader/LoaderInstaller;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v5, v0

    .local v5, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v6, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->result:Ljava/lang/Object;

    .local v6, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 116
    iget v7, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->label:I

    packed-switch v7, :pswitch_data_0

    .end local v5    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v6    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v5    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v6    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v0, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$7:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    .local v0, "file":Ljava/lang/String;
    iget-object v7, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$6:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    .local v7, "path":Ljava/lang/String;
    iget-object v8, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$5:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .local v8, "id":Ljava/lang/String;
    iget-object v9, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$4:Ljava/lang/Object;

    check-cast v9, Ljava/util/Map;

    .local v9, "ins":Ljava/util/Map;
    iget-object v10, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$3:Ljava/lang/Object;

    check-cast v10, Ljava/util/Map;

    .local v10, "vi":Ljava/util/Map;
    iget-object v11, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$2:Ljava/lang/Object;

    move-object v3, v11

    check-cast v3, Ljava/util/Map;

    .end local p3    # "prof":Ljava/util/Map;
    .local v3, "prof":Ljava/util/Map;
    iget-object v11, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$1:Ljava/lang/Object;

    move-object v2, v11

    check-cast v2, Ljava/util/zip/ZipFile;

    .end local p2    # "z":Ljava/util/zip/ZipFile;
    .local v2, "z":Ljava/util/zip/ZipFile;
    iget-object v11, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v11, "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v17, v6

    goto/16 :goto_4

    .end local v0    # "file":Ljava/lang/String;
    .end local v2    # "z":Ljava/util/zip/ZipFile;
    .end local v3    # "prof":Ljava/util/Map;
    .end local v7    # "path":Ljava/lang/String;
    .end local v8    # "id":Ljava/lang/String;
    .end local v9    # "ins":Ljava/util/Map;
    .end local v10    # "vi":Ljava/util/Map;
    .end local v11    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "z":Ljava/util/zip/ZipFile;
    .restart local p3    # "prof":Ljava/util/Map;
    :pswitch_1
    invoke-static {v6}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 117
    const-string v7, "versionInfo"

    invoke-static {v3, v7}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v10, v7

    .restart local v10    # "vi":Ljava/util/Map;
    const-string v7, "install"

    invoke-static {v3, v7}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v9

    .line 118
    .restart local v9    # "ins":Ljava/util/Map;
    const-string v7, "id"

    invoke-static {v10, v7}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v8, v7

    .line 119
    .restart local v8    # "id":Ljava/lang/String;
    const-string v7, "path"

    invoke-static {v9, v7}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .restart local v7    # "path":Ljava/lang/String;
    const-string v11, "filePath"

    invoke-static {v9, v11}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 120
    .local v11, "file":Ljava/lang/String;
    if-eqz v7, :cond_2

    if-eqz v11, :cond_2

    new-instance v12, Ljava/io/File;

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v13

    sget-object v14, Lcom/pymcl/core/version/Maven;->INSTANCE:Lcom/pymcl/core/version/Maven;

    invoke-virtual {v14, v7}, Lcom/pymcl/core/version/Maven;->path(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v12, v13, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v12, "dst":Ljava/io/File;
    invoke-virtual {v12}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v13

    invoke-virtual {v13}, Ljava/io/File;->mkdirs()Z

    .line 121
    invoke-virtual {v2, v11}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v13

    if-eqz v13, :cond_1

    invoke-virtual {v2, v13}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v13

    check-cast v13, Ljava/io/Closeable;

    :try_start_0
    move-object/from16 v16, v13

    check-cast v16, Ljava/io/InputStream;

    move-object/from16 v17, v16

    .line 404
    .local v17, "i":Ljava/io/InputStream;
    const/16 v16, 0x0

    .local v16, "$i$a$-use-LoaderInstaller$installLegacy$2":I
    new-instance v14, Ljava/io/FileOutputStream;

    .line 121
    invoke-direct {v14, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    check-cast v14, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    move-object/from16 v18, v14

    check-cast v18, Ljava/io/FileOutputStream;

    .line 404
    .local v18, "it":Ljava/io/FileOutputStream;
    const/16 v19, 0x0

    .line 121
    .local v19, "$i$a$-use-LoaderInstaller$installLegacy$2$1":I
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v15, v18

    check-cast v15, Ljava/io/OutputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v2, 0x0

    move-object/from16 v3, v17

    const/4 v4, 0x2

    move-object/from16 v17, v6

    const/4 v6, 0x0

    .end local v6    # "$result":Ljava/lang/Object;
    .local v3, "i":Ljava/io/InputStream;
    .local v17, "$result":Ljava/lang/Object;
    :try_start_2
    invoke-static {v3, v15, v2, v4, v6}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .end local v18    # "it":Ljava/io/FileOutputStream;
    .end local v19    # "$i$a$-use-LoaderInstaller$installLegacy$2$1":I
    :try_start_3
    invoke-static {v14, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .end local v3    # "i":Ljava/io/InputStream;
    .end local v16    # "$i$a$-use-LoaderInstaller$installLegacy$2":I
    invoke-static {v13, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_3

    .restart local v3    # "i":Ljava/io/InputStream;
    .restart local v16    # "$i$a$-use-LoaderInstaller$installLegacy$2":I
    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_1

    .end local v3    # "i":Ljava/io/InputStream;
    .restart local v6    # "$result":Ljava/lang/Object;
    .local v17, "i":Ljava/io/InputStream;
    :catchall_1
    move-exception v0

    move-object/from16 v3, v17

    move-object/from16 v17, v6

    move-object v2, v0

    .end local v5    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v6    # "$result":Ljava/lang/Object;
    .end local v7    # "path":Ljava/lang/String;
    .end local v8    # "id":Ljava/lang/String;
    .end local v9    # "ins":Ljava/util/Map;
    .end local v10    # "vi":Ljava/util/Map;
    .end local v11    # "file":Ljava/lang/String;
    .end local v12    # "dst":Ljava/io/File;
    .end local v16    # "$i$a$-use-LoaderInstaller$installLegacy$2":I
    .end local v17    # "i":Ljava/io/InputStream;
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "z":Ljava/util/zip/ZipFile;
    .end local p3    # "prof":Ljava/util/Map;
    .end local p4    # "$completion":Lkotlin/coroutines/Continuation;
    :goto_1
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .restart local v3    # "i":Ljava/io/InputStream;
    .restart local v5    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v7    # "path":Ljava/lang/String;
    .restart local v8    # "id":Ljava/lang/String;
    .restart local v9    # "ins":Ljava/util/Map;
    .restart local v10    # "vi":Ljava/util/Map;
    .restart local v11    # "file":Ljava/lang/String;
    .restart local v12    # "dst":Ljava/io/File;
    .restart local v16    # "$i$a$-use-LoaderInstaller$installLegacy$2":I
    .local v17, "$result":Ljava/lang/Object;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "z":Ljava/util/zip/ZipFile;
    .restart local p3    # "prof":Ljava/util/Map;
    .restart local p4    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_2
    move-exception v0

    :try_start_5
    invoke-static {v14, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v5    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v7    # "path":Ljava/lang/String;
    .end local v8    # "id":Ljava/lang/String;
    .end local v9    # "ins":Ljava/util/Map;
    .end local v10    # "vi":Ljava/util/Map;
    .end local v11    # "file":Ljava/lang/String;
    .end local v12    # "dst":Ljava/io/File;
    .end local v17    # "$result":Ljava/lang/Object;
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "z":Ljava/util/zip/ZipFile;
    .end local p3    # "prof":Ljava/util/Map;
    .end local p4    # "$completion":Lkotlin/coroutines/Continuation;
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .end local v3    # "i":Ljava/io/InputStream;
    .end local v16    # "$i$a$-use-LoaderInstaller$installLegacy$2":I
    .restart local v5    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v7    # "path":Ljava/lang/String;
    .restart local v8    # "id":Ljava/lang/String;
    .restart local v9    # "ins":Ljava/util/Map;
    .restart local v10    # "vi":Ljava/util/Map;
    .restart local v11    # "file":Ljava/lang/String;
    .restart local v12    # "dst":Ljava/io/File;
    .restart local v17    # "$result":Ljava/lang/Object;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "z":Ljava/util/zip/ZipFile;
    .restart local p3    # "prof":Ljava/util/Map;
    .restart local p4    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_3
    move-exception v0

    move-object v2, v0

    goto :goto_2

    .end local v17    # "$result":Ljava/lang/Object;
    .restart local v6    # "$result":Ljava/lang/Object;
    :catchall_4
    move-exception v0

    move-object/from16 v17, v6

    move-object v2, v0

    .end local v5    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v6    # "$result":Ljava/lang/Object;
    .end local v7    # "path":Ljava/lang/String;
    .end local v8    # "id":Ljava/lang/String;
    .end local v9    # "ins":Ljava/util/Map;
    .end local v10    # "vi":Ljava/util/Map;
    .end local v11    # "file":Ljava/lang/String;
    .end local v12    # "dst":Ljava/io/File;
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "z":Ljava/util/zip/ZipFile;
    .end local p3    # "prof":Ljava/util/Map;
    .end local p4    # "$completion":Lkotlin/coroutines/Continuation;
    :goto_2
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .restart local v5    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v7    # "path":Ljava/lang/String;
    .restart local v8    # "id":Ljava/lang/String;
    .restart local v9    # "ins":Ljava/util/Map;
    .restart local v10    # "vi":Ljava/util/Map;
    .restart local v11    # "file":Ljava/lang/String;
    .restart local v12    # "dst":Ljava/io/File;
    .restart local v17    # "$result":Ljava/lang/Object;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "z":Ljava/util/zip/ZipFile;
    .restart local p3    # "prof":Ljava/util/Map;
    .restart local p4    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_5
    move-exception v0

    invoke-static {v13, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    .end local v17    # "$result":Ljava/lang/Object;
    .restart local v6    # "$result":Ljava/lang/Object;
    :cond_1
    move-object/from16 v17, v6

    .end local v6    # "$result":Ljava/lang/Object;
    .restart local v17    # "$result":Ljava/lang/Object;
    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "installer \u7f3a\u5c11 "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x2

    const/4 v6, 0x0

    invoke-direct {v0, v2, v6, v4, v6}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    .line 120
    .end local v12    # "dst":Ljava/io/File;
    .end local v17    # "$result":Ljava/lang/Object;
    .restart local v6    # "$result":Ljava/lang/Object;
    :cond_2
    move-object/from16 v17, v6

    .line 123
    .end local v6    # "$result":Ljava/lang/Object;
    .restart local v17    # "$result":Ljava/lang/Object;
    :goto_3
    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v3, Ljava/io/File;

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v12, "/"

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v12, ".json"

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v4, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2, v3, v10}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    .line 124
    iget-object v2, v1, Lcom/pymcl/core/loader/LoaderInstaller;->game:Lcom/pymcl/core/version/GameInstaller;

    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$0:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$1:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$2:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$3:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$4:Ljava/lang/Object;

    iput-object v8, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$5:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$6:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->L$7:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, v5, Lcom/pymcl/core/loader/LoaderInstaller$installLegacy$1;->label:I

    move-object/from16 v4, p1

    invoke-virtual {v2, v4, v8, v3, v5}, Lcom/pymcl/core/version/GameInstaller;->completeFiles(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_3

    .line 116
    return-object v0

    .line 124
    :cond_3
    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object v0, v11

    move-object v11, v4

    .line 125
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "z":Ljava/util/zip/ZipFile;
    .end local p3    # "prof":Ljava/util/Map;
    .restart local v0    # "file":Ljava/lang/String;
    .restart local v2    # "z":Ljava/util/zip/ZipFile;
    .local v3, "prof":Ljava/util/Map;
    .local v11, "dirs":Lcom/pymcl/core/version/GameDirs;
    :goto_4
    return-object v8

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic installLiteLoader$default(Lcom/pymcl/core/loader/LoaderInstaller;Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 315
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/pymcl/core/loader/LoaderInstaller;->installLiteLoader(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final installModern(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;Ljava/util/zip/ZipFile;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 31
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "installer"    # Ljava/io/File;
    .param p4, "z"    # Ljava/util/zip/ZipFile;
    .param p5, "prof"    # Ljava/util/Map;
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/GameDirs;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Ljava/util/zip/ZipFile;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v8, p6

    instance-of v0, v8, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;

    if-eqz v0, :cond_0

    move-object v0, v8

    check-cast v0, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;

    iget v4, v0, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->label:I

    const/high16 v5, -0x80000000

    and-int/2addr v4, v5

    if-eqz v4, :cond_0

    iget v4, v0, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->label:I

    sub-int/2addr v4, v5

    iput v4, v0, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;

    invoke-direct {v0, v1, v8}, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;-><init>(Lcom/pymcl/core/loader/LoaderInstaller;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v13, v0

    .local v13, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v4, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->result:Ljava/lang/Object;

    .local v4, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 128
    iget v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->label:I

    const-string v6, "/"

    packed-switch v5, :pswitch_data_0

    move-object/from16 v21, v4

    .end local v4    # "$result":Ljava/lang/Object;
    .end local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v4    # "$result":Ljava/lang/Object;
    .restart local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    :pswitch_0
    iget-object v0, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$10:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    .local v0, "procs":Ljava/util/List;
    iget-object v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$9:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    .local v5, "items":Ljava/util/ArrayList;
    iget-object v6, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$8:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    .local v6, "libs":Ljava/util/List;
    iget-object v7, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$7:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    .local v7, "id":Ljava/lang/String;
    iget-object v9, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$6:Ljava/lang/Object;

    check-cast v9, Ljava/util/Map;

    .local v9, "vj":Ljava/util/Map;
    iget-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$5:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    .local v10, "vEntry":Ljava/lang/String;
    iget-object v11, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$4:Ljava/lang/Object;

    move-object v3, v11

    check-cast v3, Ljava/util/Map;

    .end local p5    # "prof":Ljava/util/Map;
    .local v3, "prof":Ljava/util/Map;
    iget-object v11, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$3:Ljava/lang/Object;

    move-object v2, v11

    check-cast v2, Ljava/util/zip/ZipFile;

    .end local p4    # "z":Ljava/util/zip/ZipFile;
    .local v2, "z":Ljava/util/zip/ZipFile;
    iget-object v11, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$2:Ljava/lang/Object;

    check-cast v11, Ljava/io/File;

    .end local p3    # "installer":Ljava/io/File;
    .local v11, "installer":Ljava/io/File;
    iget-object v12, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .local v12, "mc":Ljava/lang/String;
    iget-object v14, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$0:Ljava/lang/Object;

    check-cast v14, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v14, "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v21, v4

    goto/16 :goto_d

    .end local v0    # "procs":Ljava/util/List;
    .end local v2    # "z":Ljava/util/zip/ZipFile;
    .end local v3    # "prof":Ljava/util/Map;
    .end local v5    # "items":Ljava/util/ArrayList;
    .end local v6    # "libs":Ljava/util/List;
    .end local v7    # "id":Ljava/lang/String;
    .end local v9    # "vj":Ljava/util/Map;
    .end local v10    # "vEntry":Ljava/lang/String;
    .end local v11    # "installer":Ljava/io/File;
    .end local v12    # "mc":Ljava/lang/String;
    .end local v14    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p4    # "z":Ljava/util/zip/ZipFile;
    .restart local p5    # "prof":Ljava/util/Map;
    :pswitch_1
    iget-object v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$12:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    .local v5, "data":Ljava/util/Map;
    iget-object v6, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$11:Ljava/lang/Object;

    check-cast v6, Ljava/io/File;

    .local v6, "tmp":Ljava/io/File;
    iget-object v7, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$10:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    .local v7, "procs":Ljava/util/List;
    iget-object v11, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$9:Ljava/lang/Object;

    check-cast v11, Ljava/util/ArrayList;

    .local v11, "items":Ljava/util/ArrayList;
    iget-object v12, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$8:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    .local v12, "libs":Ljava/util/List;
    iget-object v14, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$7:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    .local v14, "id":Ljava/lang/String;
    iget-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$6:Ljava/lang/Object;

    check-cast v15, Ljava/util/Map;

    .local v15, "vj":Ljava/util/Map;
    iget-object v9, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$5:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    .local v9, "vEntry":Ljava/lang/String;
    iget-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$4:Ljava/lang/Object;

    move-object v3, v10

    check-cast v3, Ljava/util/Map;

    .end local p5    # "prof":Ljava/util/Map;
    .restart local v3    # "prof":Ljava/util/Map;
    iget-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$3:Ljava/lang/Object;

    move-object v2, v10

    check-cast v2, Ljava/util/zip/ZipFile;

    .end local p4    # "z":Ljava/util/zip/ZipFile;
    .restart local v2    # "z":Ljava/util/zip/ZipFile;
    iget-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$2:Ljava/lang/Object;

    check-cast v10, Ljava/io/File;

    move-object/from16 p4, v2

    .end local v2    # "z":Ljava/util/zip/ZipFile;
    .end local p3    # "installer":Ljava/io/File;
    .local v10, "installer":Ljava/io/File;
    .restart local p4    # "z":Ljava/util/zip/ZipFile;
    iget-object v2, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    move-object/from16 p2, v2

    iget-object v2, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v2, "dirs":Lcom/pymcl/core/version/GameDirs;
    :try_start_0
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v21, v4

    move-object v8, v7

    move-object v4, v10

    move-object v10, v5

    move-object v7, v6

    move-object/from16 v5, p4

    move-object v6, v3

    move-object/from16 v3, p2

    goto/16 :goto_9

    .line 151
    .end local v5    # "data":Ljava/util/Map;
    :catchall_0
    move-exception v0

    move-object/from16 v5, p4

    move-object/from16 v21, v4

    move-object v8, v7

    move-object v7, v6

    move-object v6, v3

    move-object v3, v2

    move-object/from16 v2, p2

    goto/16 :goto_b

    .line 128
    .end local v2    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v3    # "prof":Ljava/util/Map;
    .end local v6    # "tmp":Ljava/io/File;
    .end local v7    # "procs":Ljava/util/List;
    .end local v9    # "vEntry":Ljava/lang/String;
    .end local v10    # "installer":Ljava/io/File;
    .end local v11    # "items":Ljava/util/ArrayList;
    .end local v12    # "libs":Ljava/util/List;
    .end local v14    # "id":Ljava/lang/String;
    .end local v15    # "vj":Ljava/util/Map;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p5    # "prof":Ljava/util/Map;
    :pswitch_2
    iget-object v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$9:Ljava/lang/Object;

    check-cast v5, Ljava/util/ArrayList;

    .local v5, "items":Ljava/util/ArrayList;
    iget-object v9, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$8:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    .local v9, "libs":Ljava/util/List;
    iget-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$7:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    .local v10, "id":Ljava/lang/String;
    iget-object v11, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$6:Ljava/lang/Object;

    check-cast v11, Ljava/util/Map;

    .local v11, "vj":Ljava/util/Map;
    iget-object v12, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$5:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    .local v12, "vEntry":Ljava/lang/String;
    iget-object v14, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$4:Ljava/lang/Object;

    move-object v3, v14

    check-cast v3, Ljava/util/Map;

    .end local p5    # "prof":Ljava/util/Map;
    .restart local v3    # "prof":Ljava/util/Map;
    iget-object v14, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$3:Ljava/lang/Object;

    move-object v2, v14

    check-cast v2, Ljava/util/zip/ZipFile;

    .end local p4    # "z":Ljava/util/zip/ZipFile;
    .local v2, "z":Ljava/util/zip/ZipFile;
    iget-object v14, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$2:Ljava/lang/Object;

    check-cast v14, Ljava/io/File;

    .end local p3    # "installer":Ljava/io/File;
    .local v14, "installer":Ljava/io/File;
    iget-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$1:Ljava/lang/Object;

    check-cast v15, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .local v15, "mc":Ljava/lang/String;
    iget-object v7, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v7, "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v12

    move-object v12, v9

    move-object/from16 v9, v16

    move-object/from16 v21, v4

    move-object/from16 v24, v6

    move-object v4, v14

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x2

    move-object v6, v3

    move-object v14, v10

    move-object v3, v15

    move-object v15, v11

    move-object v11, v5

    move-object v5, v2

    move-object v2, v7

    goto/16 :goto_6

    .end local v2    # "z":Ljava/util/zip/ZipFile;
    .end local v3    # "prof":Ljava/util/Map;
    .end local v5    # "items":Ljava/util/ArrayList;
    .end local v7    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v9    # "libs":Ljava/util/List;
    .end local v10    # "id":Ljava/lang/String;
    .end local v11    # "vj":Ljava/util/Map;
    .end local v12    # "vEntry":Ljava/lang/String;
    .end local v14    # "installer":Ljava/io/File;
    .end local v15    # "mc":Ljava/lang/String;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p4    # "z":Ljava/util/zip/ZipFile;
    .restart local p5    # "prof":Ljava/util/Map;
    :pswitch_3
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 129
    const-string v5, "json"

    invoke-static {v3, v5}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    const-string v5, "/version.json"

    :cond_1
    move-object v7, v6

    check-cast v7, Ljava/lang/CharSequence;

    invoke-static {v5, v7}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    .line 130
    .local v5, "vEntry":Ljava/lang/String;
    sget-object v7, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v2, v5}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v9

    if-eqz v9, :cond_13

    invoke-virtual {v2, v9}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v9

    const-string v10, "getInputStream(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v9

    sget-object v10, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v11, Ljava/lang/String;

    invoke-direct {v11, v9, v10}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v7, v11}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    .line 131
    .local v7, "vj":Ljava/util/Map;
    const-string v9, "id"

    invoke-static {v7, v9}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 132
    .local v9, "id":Ljava/lang/String;
    const-string v10, "libraries"

    invoke-static {v3, v10}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v11

    invoke-static {v11}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/util/Collection;

    invoke-static {v7, v10}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    invoke-static {v10}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-static {v11, v10}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v19

    .line 134
    .local v19, "libs":Ljava/util/List;
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v20, v10

    .line 135
    .local v20, "items":Ljava/util/ArrayList;
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map;

    .local v11, "l":Ljava/util/Map;
    const-string v12, "name"

    invoke-static {v11, v12}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_2

    goto :goto_1

    .local v12, "name":Ljava/lang/String;
    :cond_2
    const-string v14, "downloads"

    invoke-static {v11, v14}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    const-string v15, "artifact"

    invoke-static {v14, v15}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v14

    .line 136
    .local v14, "a":Ljava/util/Map;
    const-string v15, "path"

    invoke-static {v14, v15}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_3

    sget-object v15, Lcom/pymcl/core/version/Maven;->INSTANCE:Lcom/pymcl/core/version/Maven;

    invoke-virtual {v15, v12}, Lcom/pymcl/core/version/Maven;->path(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    :cond_3
    move-object/from16 v21, v4

    .end local v4    # "$result":Ljava/lang/Object;
    .local v15, "path":Ljava/lang/String;
    .local v21, "$result":Ljava/lang/Object;
    new-instance v4, Ljava/io/File;

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v8

    invoke-direct {v4, v8, v15}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 137
    .local v4, "dst":Ljava/io/File;
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v22, v10

    const-string v10, "maven/"

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v8

    .line 138
    .local v8, "emb":Ljava/util/zip/ZipEntry;
    if-eqz v8, :cond_5

    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v23

    if-nez v23, :cond_4

    invoke-virtual {v4}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/io/File;->mkdirs()Z

    invoke-virtual {v2, v8}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v23

    move-object/from16 v10, v23

    check-cast v10, Ljava/io/Closeable;

    :try_start_1
    move-object/from16 v23, v10

    check-cast v23, Ljava/io/InputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    move-object/from16 v25, v23

    .line 404
    .local v25, "i":Ljava/io/InputStream;
    const/16 v23, 0x0

    move-object/from16 v26, v8

    .end local v8    # "emb":Ljava/util/zip/ZipEntry;
    .local v23, "$i$a$-use-LoaderInstaller$installModern$2":I
    .local v26, "emb":Ljava/util/zip/ZipEntry;
    :try_start_2
    new-instance v8, Ljava/io/FileOutputStream;

    .line 138
    invoke-direct {v8, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    check-cast v8, Ljava/io/Closeable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    :try_start_3
    move-object/from16 v27, v8

    check-cast v27, Ljava/io/FileOutputStream;

    .line 404
    .local v27, "it":Ljava/io/FileOutputStream;
    const/16 v28, 0x0

    .line 138
    .local v28, "$i$a$-use-LoaderInstaller$installModern$2$1":I
    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object/from16 v29, v11

    .end local v11    # "l":Ljava/util/Map;
    .local v29, "l":Ljava/util/Map;
    :try_start_4
    move-object/from16 v11, v27

    check-cast v11, Ljava/io/OutputStream;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    move-object/from16 v18, v5

    move-object/from16 v24, v6

    move-object/from16 v30, v12

    move-object/from16 v17, v15

    move-object/from16 v12, v25

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v15, 0x0

    .end local v5    # "vEntry":Ljava/lang/String;
    .end local v15    # "path":Ljava/lang/String;
    .end local v25    # "i":Ljava/io/InputStream;
    .local v12, "i":Ljava/io/InputStream;
    .local v17, "path":Ljava/lang/String;
    .local v18, "vEntry":Ljava/lang/String;
    .local v30, "name":Ljava/lang/String;
    :try_start_5
    invoke-static {v12, v11, v15, v5, v6}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .end local v27    # "it":Ljava/io/FileOutputStream;
    .end local v28    # "$i$a$-use-LoaderInstaller$installModern$2$1":I
    :try_start_6
    invoke-static {v8, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .end local v12    # "i":Ljava/io/InputStream;
    .end local v23    # "$i$a$-use-LoaderInstaller$installModern$2":I
    invoke-static {v10, v6}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    goto :goto_4

    .restart local v12    # "i":Ljava/io/InputStream;
    .restart local v23    # "$i$a$-use-LoaderInstaller$installModern$2":I
    :catchall_1
    move-exception v0

    move-object v5, v0

    goto :goto_2

    .end local v17    # "path":Ljava/lang/String;
    .end local v18    # "vEntry":Ljava/lang/String;
    .end local v30    # "name":Ljava/lang/String;
    .restart local v5    # "vEntry":Ljava/lang/String;
    .local v12, "name":Ljava/lang/String;
    .restart local v15    # "path":Ljava/lang/String;
    .restart local v25    # "i":Ljava/io/InputStream;
    :catchall_2
    move-exception v0

    move-object/from16 v18, v5

    move-object/from16 v30, v12

    move-object/from16 v17, v15

    move-object/from16 v12, v25

    move-object v5, v0

    .end local v5    # "vEntry":Ljava/lang/String;
    .end local v15    # "path":Ljava/lang/String;
    .end local v25    # "i":Ljava/io/InputStream;
    .local v12, "i":Ljava/io/InputStream;
    .restart local v17    # "path":Ljava/lang/String;
    .restart local v18    # "vEntry":Ljava/lang/String;
    .restart local v30    # "name":Ljava/lang/String;
    goto :goto_2

    .end local v17    # "path":Ljava/lang/String;
    .end local v18    # "vEntry":Ljava/lang/String;
    .end local v29    # "l":Ljava/util/Map;
    .end local v30    # "name":Ljava/lang/String;
    .restart local v5    # "vEntry":Ljava/lang/String;
    .restart local v11    # "l":Ljava/util/Map;
    .local v12, "name":Ljava/lang/String;
    .restart local v15    # "path":Ljava/lang/String;
    .restart local v25    # "i":Ljava/io/InputStream;
    :catchall_3
    move-exception v0

    move-object/from16 v18, v5

    move-object/from16 v29, v11

    move-object/from16 v30, v12

    move-object/from16 v17, v15

    move-object/from16 v12, v25

    move-object v5, v0

    .end local v4    # "dst":Ljava/io/File;
    .end local v5    # "vEntry":Ljava/lang/String;
    .end local v7    # "vj":Ljava/util/Map;
    .end local v9    # "id":Ljava/lang/String;
    .end local v11    # "l":Ljava/util/Map;
    .end local v12    # "name":Ljava/lang/String;
    .end local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v14    # "a":Ljava/util/Map;
    .end local v15    # "path":Ljava/lang/String;
    .end local v19    # "libs":Ljava/util/List;
    .end local v20    # "items":Ljava/util/ArrayList;
    .end local v21    # "$result":Ljava/lang/Object;
    .end local v23    # "$i$a$-use-LoaderInstaller$installModern$2":I
    .end local v25    # "i":Ljava/io/InputStream;
    .end local v26    # "emb":Ljava/util/zip/ZipEntry;
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "installer":Ljava/io/File;
    .end local p4    # "z":Ljava/util/zip/ZipFile;
    .end local p5    # "prof":Ljava/util/Map;
    .end local p6    # "$completion":Lkotlin/coroutines/Continuation;
    :goto_2
    :try_start_7
    throw v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .restart local v4    # "dst":Ljava/io/File;
    .restart local v7    # "vj":Ljava/util/Map;
    .restart local v9    # "id":Ljava/lang/String;
    .local v12, "i":Ljava/io/InputStream;
    .restart local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v14    # "a":Ljava/util/Map;
    .restart local v17    # "path":Ljava/lang/String;
    .restart local v18    # "vEntry":Ljava/lang/String;
    .restart local v19    # "libs":Ljava/util/List;
    .restart local v20    # "items":Ljava/util/ArrayList;
    .restart local v21    # "$result":Ljava/lang/Object;
    .restart local v23    # "$i$a$-use-LoaderInstaller$installModern$2":I
    .restart local v26    # "emb":Ljava/util/zip/ZipEntry;
    .restart local v29    # "l":Ljava/util/Map;
    .restart local v30    # "name":Ljava/lang/String;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p4    # "z":Ljava/util/zip/ZipFile;
    .restart local p5    # "prof":Ljava/util/Map;
    .restart local p6    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_4
    move-exception v0

    :try_start_8
    invoke-static {v8, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v4    # "dst":Ljava/io/File;
    .end local v7    # "vj":Ljava/util/Map;
    .end local v9    # "id":Ljava/lang/String;
    .end local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v14    # "a":Ljava/util/Map;
    .end local v17    # "path":Ljava/lang/String;
    .end local v18    # "vEntry":Ljava/lang/String;
    .end local v19    # "libs":Ljava/util/List;
    .end local v20    # "items":Ljava/util/ArrayList;
    .end local v21    # "$result":Ljava/lang/Object;
    .end local v26    # "emb":Ljava/util/zip/ZipEntry;
    .end local v29    # "l":Ljava/util/Map;
    .end local v30    # "name":Ljava/lang/String;
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "installer":Ljava/io/File;
    .end local p4    # "z":Ljava/util/zip/ZipFile;
    .end local p5    # "prof":Ljava/util/Map;
    .end local p6    # "$completion":Lkotlin/coroutines/Continuation;
    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .end local v12    # "i":Ljava/io/InputStream;
    .end local v23    # "$i$a$-use-LoaderInstaller$installModern$2":I
    .restart local v4    # "dst":Ljava/io/File;
    .restart local v7    # "vj":Ljava/util/Map;
    .restart local v9    # "id":Ljava/lang/String;
    .restart local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v14    # "a":Ljava/util/Map;
    .restart local v17    # "path":Ljava/lang/String;
    .restart local v18    # "vEntry":Ljava/lang/String;
    .restart local v19    # "libs":Ljava/util/List;
    .restart local v20    # "items":Ljava/util/ArrayList;
    .restart local v21    # "$result":Ljava/lang/Object;
    .restart local v26    # "emb":Ljava/util/zip/ZipEntry;
    .restart local v29    # "l":Ljava/util/Map;
    .restart local v30    # "name":Ljava/lang/String;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p4    # "z":Ljava/util/zip/ZipFile;
    .restart local p5    # "prof":Ljava/util/Map;
    .restart local p6    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_5
    move-exception v0

    move-object v5, v0

    goto :goto_3

    .end local v17    # "path":Ljava/lang/String;
    .end local v18    # "vEntry":Ljava/lang/String;
    .end local v29    # "l":Ljava/util/Map;
    .end local v30    # "name":Ljava/lang/String;
    .restart local v5    # "vEntry":Ljava/lang/String;
    .restart local v11    # "l":Ljava/util/Map;
    .local v12, "name":Ljava/lang/String;
    .restart local v15    # "path":Ljava/lang/String;
    :catchall_6
    move-exception v0

    move-object/from16 v18, v5

    move-object/from16 v29, v11

    move-object/from16 v30, v12

    move-object/from16 v17, v15

    move-object v5, v0

    .end local v5    # "vEntry":Ljava/lang/String;
    .end local v11    # "l":Ljava/util/Map;
    .end local v12    # "name":Ljava/lang/String;
    .end local v15    # "path":Ljava/lang/String;
    .restart local v17    # "path":Ljava/lang/String;
    .restart local v18    # "vEntry":Ljava/lang/String;
    .restart local v29    # "l":Ljava/util/Map;
    .restart local v30    # "name":Ljava/lang/String;
    goto :goto_3

    .end local v17    # "path":Ljava/lang/String;
    .end local v18    # "vEntry":Ljava/lang/String;
    .end local v26    # "emb":Ljava/util/zip/ZipEntry;
    .end local v29    # "l":Ljava/util/Map;
    .end local v30    # "name":Ljava/lang/String;
    .restart local v5    # "vEntry":Ljava/lang/String;
    .restart local v8    # "emb":Ljava/util/zip/ZipEntry;
    .restart local v11    # "l":Ljava/util/Map;
    .restart local v12    # "name":Ljava/lang/String;
    .restart local v15    # "path":Ljava/lang/String;
    :catchall_7
    move-exception v0

    move-object/from16 v18, v5

    move-object/from16 v26, v8

    move-object/from16 v29, v11

    move-object/from16 v30, v12

    move-object/from16 v17, v15

    move-object v5, v0

    .end local v4    # "dst":Ljava/io/File;
    .end local v5    # "vEntry":Ljava/lang/String;
    .end local v7    # "vj":Ljava/util/Map;
    .end local v8    # "emb":Ljava/util/zip/ZipEntry;
    .end local v9    # "id":Ljava/lang/String;
    .end local v11    # "l":Ljava/util/Map;
    .end local v12    # "name":Ljava/lang/String;
    .end local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v14    # "a":Ljava/util/Map;
    .end local v15    # "path":Ljava/lang/String;
    .end local v19    # "libs":Ljava/util/List;
    .end local v20    # "items":Ljava/util/ArrayList;
    .end local v21    # "$result":Ljava/lang/Object;
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "installer":Ljava/io/File;
    .end local p4    # "z":Ljava/util/zip/ZipFile;
    .end local p5    # "prof":Ljava/util/Map;
    .end local p6    # "$completion":Lkotlin/coroutines/Continuation;
    :goto_3
    :try_start_9
    throw v5
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .restart local v4    # "dst":Ljava/io/File;
    .restart local v7    # "vj":Ljava/util/Map;
    .restart local v9    # "id":Ljava/lang/String;
    .restart local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v14    # "a":Ljava/util/Map;
    .restart local v17    # "path":Ljava/lang/String;
    .restart local v18    # "vEntry":Ljava/lang/String;
    .restart local v19    # "libs":Ljava/util/List;
    .restart local v20    # "items":Ljava/util/ArrayList;
    .restart local v21    # "$result":Ljava/lang/Object;
    .restart local v26    # "emb":Ljava/util/zip/ZipEntry;
    .restart local v29    # "l":Ljava/util/Map;
    .restart local v30    # "name":Ljava/lang/String;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p4    # "z":Ljava/util/zip/ZipFile;
    .restart local p5    # "prof":Ljava/util/Map;
    .restart local p6    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_8
    move-exception v0

    invoke-static {v10, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    .end local v17    # "path":Ljava/lang/String;
    .end local v18    # "vEntry":Ljava/lang/String;
    .end local v26    # "emb":Ljava/util/zip/ZipEntry;
    .end local v29    # "l":Ljava/util/Map;
    .end local v30    # "name":Ljava/lang/String;
    .restart local v5    # "vEntry":Ljava/lang/String;
    .restart local v8    # "emb":Ljava/util/zip/ZipEntry;
    .restart local v11    # "l":Ljava/util/Map;
    .restart local v12    # "name":Ljava/lang/String;
    .restart local v15    # "path":Ljava/lang/String;
    :cond_4
    move-object/from16 v18, v5

    move-object/from16 v24, v6

    move-object/from16 v26, v8

    move-object/from16 v29, v11

    move-object/from16 v30, v12

    move-object/from16 v17, v15

    const/4 v5, 0x2

    const/4 v6, 0x0

    .end local v5    # "vEntry":Ljava/lang/String;
    .end local v8    # "emb":Ljava/util/zip/ZipEntry;
    .end local v11    # "l":Ljava/util/Map;
    .end local v12    # "name":Ljava/lang/String;
    .end local v15    # "path":Ljava/lang/String;
    .restart local v17    # "path":Ljava/lang/String;
    .restart local v18    # "vEntry":Ljava/lang/String;
    .restart local v26    # "emb":Ljava/util/zip/ZipEntry;
    .restart local v29    # "l":Ljava/util/Map;
    .restart local v30    # "name":Ljava/lang/String;
    :goto_4
    move-object/from16 v8, p6

    move-object/from16 v5, v18

    move-object/from16 v4, v21

    move-object/from16 v10, v22

    move-object/from16 v6, v24

    goto/16 :goto_1

    .line 139
    .end local v17    # "path":Ljava/lang/String;
    .end local v18    # "vEntry":Ljava/lang/String;
    .end local v26    # "emb":Ljava/util/zip/ZipEntry;
    .end local v29    # "l":Ljava/util/Map;
    .end local v30    # "name":Ljava/lang/String;
    .restart local v5    # "vEntry":Ljava/lang/String;
    .restart local v8    # "emb":Ljava/util/zip/ZipEntry;
    .restart local v11    # "l":Ljava/util/Map;
    .restart local v12    # "name":Ljava/lang/String;
    .restart local v15    # "path":Ljava/lang/String;
    :cond_5
    move-object/from16 v18, v5

    move-object/from16 v24, v6

    move-object/from16 v26, v8

    move-object/from16 v29, v11

    move-object/from16 v30, v12

    move-object/from16 v17, v15

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v15, 0x0

    .end local v5    # "vEntry":Ljava/lang/String;
    .end local v8    # "emb":Ljava/util/zip/ZipEntry;
    .end local v11    # "l":Ljava/util/Map;
    .end local v12    # "name":Ljava/lang/String;
    .end local v15    # "path":Ljava/lang/String;
    .restart local v17    # "path":Ljava/lang/String;
    .restart local v18    # "vEntry":Ljava/lang/String;
    .restart local v26    # "emb":Ljava/util/zip/ZipEntry;
    .restart local v29    # "l":Ljava/util/Map;
    .restart local v30    # "name":Ljava/lang/String;
    const-string v8, "url"

    invoke-static {v14, v8}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object v10, v8

    .line 404
    .local v10, "it":Ljava/lang/String;
    const/4 v11, 0x0

    .line 139
    .local v11, "$i$a$-takeIf-LoaderInstaller$installModern$url$1":I
    move-object v12, v10

    check-cast v12, Ljava/lang/CharSequence;

    if-eqz v12, :cond_6

    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    move-result v12

    if-nez v12, :cond_7

    :cond_6
    const/4 v15, 0x1

    .end local v10    # "it":Ljava/lang/String;
    .end local v11    # "$i$a$-takeIf-LoaderInstaller$installModern$url$1":I
    :cond_7
    if-nez v15, :cond_8

    goto :goto_5

    :cond_8
    move-object v8, v6

    :goto_5
    if-nez v8, :cond_9

    move-object/from16 v8, p6

    move-object/from16 v5, v18

    move-object/from16 v4, v21

    move-object/from16 v10, v22

    move-object/from16 v6, v24

    goto/16 :goto_1

    .line 140
    .local v8, "url":Ljava/lang/String;
    :cond_9
    move-object/from16 v10, v20

    check-cast v10, Ljava/util/Collection;

    iget-object v11, v1, Lcom/pymcl/core/loader/LoaderInstaller;->game:Lcom/pymcl/core/version/GameInstaller;

    const-string v12, "sha1"

    invoke-static {v14, v12}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const-string v15, "size"

    invoke-static {v14, v15}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v15

    invoke-virtual {v11, v8, v4, v12, v15}, Lcom/pymcl/core/version/GameInstaller;->item(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/Long;)Lcom/pymcl/core/download/DownloadItem;

    move-result-object v11

    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v8, p6

    move-object/from16 v5, v18

    move-object/from16 v4, v21

    move-object/from16 v10, v22

    move-object/from16 v6, v24

    goto/16 :goto_1

    .line 141
    .end local v8    # "url":Ljava/lang/String;
    .end local v14    # "a":Ljava/util/Map;
    .end local v17    # "path":Ljava/lang/String;
    .end local v18    # "vEntry":Ljava/lang/String;
    .end local v21    # "$result":Ljava/lang/Object;
    .end local v26    # "emb":Ljava/util/zip/ZipEntry;
    .end local v29    # "l":Ljava/util/Map;
    .end local v30    # "name":Ljava/lang/String;
    .local v4, "$result":Ljava/lang/Object;
    .restart local v5    # "vEntry":Ljava/lang/String;
    :cond_a
    move-object/from16 v21, v4

    move-object/from16 v18, v5

    move-object/from16 v24, v6

    const/4 v5, 0x2

    const/4 v6, 0x0

    .end local v4    # "$result":Ljava/lang/Object;
    .end local v5    # "vEntry":Ljava/lang/String;
    .restart local v18    # "vEntry":Ljava/lang/String;
    .restart local v21    # "$result":Ljava/lang/Object;
    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderInstaller;->dm:Lcom/pymcl/core/download/DownloadManager;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v10, " \u4f9d\u8d56\u5e93"

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v11, v20

    check-cast v11, Ljava/util/List;

    move-object/from16 v8, p1

    iput-object v8, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$0:Ljava/lang/Object;

    move-object/from16 v12, p2

    iput-object v12, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$1:Ljava/lang/Object;

    move-object/from16 v14, p3

    iput-object v14, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$2:Ljava/lang/Object;

    iput-object v2, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$3:Ljava/lang/Object;

    iput-object v3, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$4:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$5:Ljava/lang/Object;

    iput-object v7, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$6:Ljava/lang/Object;

    iput-object v9, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$7:Ljava/lang/Object;

    invoke-static/range {v19 .. v19}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$8:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$9:Ljava/lang/Object;

    const/4 v15, 0x1

    iput v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->label:I

    const/4 v12, 0x0

    const/4 v14, 0x4

    move/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v17, v9

    move-object v9, v4

    move-object/from16 v4, v17

    move-object/from16 v17, v6

    .end local v9    # "id":Ljava/lang/String;
    .local v4, "id":Ljava/lang/String;
    invoke-static/range {v9 .. v15}, Lcom/pymcl/core/download/DownloadManager;->downloadAll$default(Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_b

    .line 128
    return-object v0

    .line 141
    :cond_b
    move-object v6, v3

    move-object v14, v4

    move-object v15, v7

    move-object/from16 v9, v18

    move-object/from16 v12, v19

    move-object/from16 v11, v20

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v18, v5

    move-object v5, v2

    move-object v2, v8

    .line 142
    .end local v7    # "vj":Ljava/util/Map;
    .end local v18    # "vEntry":Ljava/lang/String;
    .end local v19    # "libs":Ljava/util/List;
    .end local v20    # "items":Ljava/util/ArrayList;
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "installer":Ljava/io/File;
    .end local p4    # "z":Ljava/util/zip/ZipFile;
    .end local p5    # "prof":Ljava/util/Map;
    .local v2, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v3, "mc":Ljava/lang/String;
    .local v4, "installer":Ljava/io/File;
    .local v5, "z":Ljava/util/zip/ZipFile;
    .local v6, "prof":Ljava/util/Map;
    .local v9, "vEntry":Ljava/lang/String;
    .local v11, "items":Ljava/util/ArrayList;
    .local v12, "libs":Ljava/util/List;
    .local v14, "id":Ljava/lang/String;
    .local v15, "vj":Ljava/util/Map;
    :goto_6
    sget-object v7, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v8, Ljava/io/File;

    invoke-virtual {v2}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v10

    move-object/from16 p1, v2

    .end local v2    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 p2, v3

    move-object/from16 v3, v24

    .end local v3    # "mc":Ljava/lang/String;
    .restart local p2    # "mc":Ljava/lang/String;
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".json"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v8, v10, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7, v8, v15}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    .line 144
    const-string v2, "processors"

    invoke-static {v6, v2}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 415
    .local v3, "$i$f$filter":I
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    check-cast v7, Ljava/util/Collection;

    .local v7, "destination$iv$iv":Ljava/util/Collection;
    move-object v8, v2

    .local v8, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 416
    .local v10, "$i$f$filterTo":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_7
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_e

    move-object/from16 p3, v2

    .end local v2    # "$this$filter$iv":Ljava/lang/Iterable;
    .local p3, "$this$filter$iv":Ljava/lang/Iterable;
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move/from16 p4, v3

    .end local v3    # "$i$f$filter":I
    .local v2, "element$iv$iv":Ljava/lang/Object;
    .local p4, "$i$f$filter":I
    move-object v3, v2

    check-cast v3, Ljava/util/Map;

    .local v3, "p":Ljava/util/Map;
    const/16 v20, 0x0

    .line 144
    .local v20, "$i$a$-filter-LoaderInstaller$installModern$procs$1":I
    move-object/from16 p5, v4

    .end local v4    # "installer":Ljava/io/File;
    .local p5, "installer":Ljava/io/File;
    const-string v4, "sides"

    invoke-static {v3, v4}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_c

    move-object/from16 v22, v3

    .end local v3    # "p":Ljava/util/Map;
    .local v22, "p":Ljava/util/Map;
    const-string v3, "client"

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_8

    .end local v22    # "p":Ljava/util/Map;
    .restart local v3    # "p":Ljava/util/Map;
    :cond_c
    move-object/from16 v22, v3

    .end local v3    # "p":Ljava/util/Map;
    .restart local v22    # "p":Ljava/util/Map;
    move/from16 v3, v16

    .line 416
    .end local v20    # "$i$a$-filter-LoaderInstaller$installModern$procs$1":I
    .end local v22    # "p":Ljava/util/Map;
    :goto_8
    if-eqz v3, :cond_d

    invoke-interface {v7, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_d
    move-object/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p5

    goto :goto_7

    .line 417
    .end local p3    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local p4    # "$i$f$filter":I
    .end local p5    # "installer":Ljava/io/File;
    .local v2, "$this$filter$iv":Ljava/lang/Iterable;
    .local v3, "$i$f$filter":I
    .restart local v4    # "installer":Ljava/io/File;
    :cond_e
    move-object/from16 p3, v2

    move/from16 p4, v3

    move-object/from16 p5, v4

    .end local v2    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v3    # "$i$f$filter":I
    .end local v4    # "installer":Ljava/io/File;
    .end local v7    # "destination$iv$iv":Ljava/util/Collection;
    .end local v8    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$filterTo":I
    .restart local p3    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local p4    # "$i$f$filter":I
    .restart local p5    # "installer":Ljava/io/File;
    move-object v2, v7

    check-cast v2, Ljava/util/List;

    .line 415
    nop

    .line 144
    .end local p3    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local p4    # "$i$f$filter":I
    move-object v8, v2

    .line 145
    .local v8, "procs":Ljava/util/List;
    move-object v2, v8

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_11

    .line 146
    new-instance v7, Ljava/io/File;

    iget-object v2, v1, Lcom/pymcl/core/loader/LoaderInstaller;->cacheDir:Ljava/io/File;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "forge-tmp-"

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v7, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v1, v7

    .line 404
    .local v1, "it":Ljava/io/File;
    const/4 v2, 0x0

    .line 146
    .local v2, "$i$a$-also-LoaderInstaller$installModern$tmp$1":I
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 147
    .end local v1    # "it":Ljava/io/File;
    .end local v2    # "$i$a$-also-LoaderInstaller$installModern$tmp$1":I
    .local v7, "tmp":Ljava/io/File;
    nop

    .line 148
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p5

    move/from16 v10, v18

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p5    # "installer":Ljava/io/File;
    .local v2, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v3, "mc":Ljava/lang/String;
    .restart local v4    # "installer":Ljava/io/File;
    :try_start_a
    invoke-virtual/range {v1 .. v7}, Lcom/pymcl/core/loader/LoaderInstaller;->processorData(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;Ljava/util/zip/ZipFile;Ljava/util/Map;Ljava/io/File;)Ljava/util/Map;

    move-result-object v16

    move-object/from16 p1, v16

    .line 149
    .local p1, "data":Ljava/util/Map;
    iput-object v2, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$0:Ljava/lang/Object;

    iput-object v3, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$1:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$2:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$3:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$4:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$5:Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$6:Ljava/lang/Object;

    iput-object v14, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$7:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$8:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$9:Ljava/lang/Object;

    iput-object v8, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$10:Ljava/lang/Object;

    iput-object v7, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$11:Ljava/lang/Object;

    move-object/from16 v10, p1

    .end local p1    # "data":Ljava/util/Map;
    .local v10, "data":Ljava/util/Map;
    iput-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$12:Ljava/lang/Object;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_c

    move-object/from16 p5, v4

    const/4 v4, 0x2

    .end local v4    # "installer":Ljava/io/File;
    .restart local p5    # "installer":Ljava/io/File;
    :try_start_b
    iput v4, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->label:I

    invoke-direct {v1, v2, v3, v10, v13}, Lcom/pymcl/core/loader/LoaderInstaller;->prefetchMojmaps(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    if-ne v4, v0, :cond_f

    .line 128
    return-object v0

    .line 149
    :cond_f
    move-object/from16 v4, p5

    .line 150
    .end local p5    # "installer":Ljava/io/File;
    .restart local v4    # "installer":Ljava/io/File;
    :goto_9
    :try_start_c
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_a
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_10

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Ljava/util/Map;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    move-object/from16 p1, v17

    move-object/from16 p2, v4

    move-object/from16 v4, p1

    .local v4, "p":Ljava/util/Map;
    .local p2, "installer":Ljava/io/File;
    :try_start_d
    invoke-direct {v1, v2, v4, v10, v3}, Lcom/pymcl/core/loader/LoaderInstaller;->runProcessor(Lcom/pymcl/core/version/GameDirs;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_9

    move-object/from16 v4, p2

    .end local v4    # "p":Ljava/util/Map;
    goto :goto_a

    .line 151
    .end local v10    # "data":Ljava/util/Map;
    :catchall_9
    move-exception v0

    move-object v10, v3

    move-object v3, v2

    move-object v2, v10

    move-object/from16 v10, p2

    goto :goto_b

    .line 150
    .end local p2    # "installer":Ljava/io/File;
    .local v4, "installer":Ljava/io/File;
    .restart local v10    # "data":Ljava/util/Map;
    :cond_10
    move-object/from16 p2, v4

    .line 151
    .end local v4    # "installer":Ljava/io/File;
    .end local v10    # "data":Ljava/util/Map;
    .restart local p2    # "installer":Ljava/io/File;
    invoke-static {v7}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    move-object v7, v12

    move-object v12, v3

    move-object v3, v6

    move-object v6, v7

    move-object v7, v14

    move-object v14, v2

    move-object v2, v5

    move-object v5, v11

    move-object/from16 v11, p2

    move-object v10, v9

    move-object v9, v15

    goto :goto_c

    .end local p2    # "installer":Ljava/io/File;
    .restart local v4    # "installer":Ljava/io/File;
    :catchall_a
    move-exception v0

    move-object/from16 p2, v4

    move-object v10, v3

    move-object v3, v2

    move-object v2, v10

    move-object/from16 v10, p2

    .end local v4    # "installer":Ljava/io/File;
    .restart local p2    # "installer":Ljava/io/File;
    goto :goto_b

    .end local p2    # "installer":Ljava/io/File;
    .restart local p5    # "installer":Ljava/io/File;
    :catchall_b
    move-exception v0

    move-object v10, v3

    move-object v3, v2

    move-object v2, v10

    move-object/from16 v10, p5

    goto :goto_b

    .end local p5    # "installer":Ljava/io/File;
    .restart local v4    # "installer":Ljava/io/File;
    :catchall_c
    move-exception v0

    move-object/from16 p5, v4

    move-object v10, v3

    move-object v3, v2

    move-object v2, v10

    move-object/from16 v10, p5

    .end local v4    # "installer":Ljava/io/File;
    .local v2, "mc":Ljava/lang/String;
    .local v3, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v10, "installer":Ljava/io/File;
    :goto_b
    invoke-static {v7}, Lkotlin/io/FilesKt;->deleteRecursively(Ljava/io/File;)Z

    throw v0

    .line 145
    .end local v2    # "mc":Ljava/lang/String;
    .end local v3    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v7    # "tmp":Ljava/io/File;
    .end local v10    # "installer":Ljava/io/File;
    .local p1, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local p2, "mc":Ljava/lang/String;
    .restart local p5    # "installer":Ljava/io/File;
    :cond_11
    move-object/from16 v2, p1

    move-object/from16 v3, p2

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .local v2, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v3, "mc":Ljava/lang/String;
    move-object v7, v12

    move-object v12, v3

    move-object v3, v6

    move-object v6, v7

    move-object v7, v14

    move-object v14, v2

    move-object v2, v5

    move-object v5, v11

    move-object/from16 v11, p5

    move-object v10, v9

    move-object v9, v15

    .line 153
    .end local v15    # "vj":Ljava/util/Map;
    .end local p5    # "installer":Ljava/io/File;
    .local v2, "z":Ljava/util/zip/ZipFile;
    .local v3, "prof":Ljava/util/Map;
    .local v5, "items":Ljava/util/ArrayList;
    .local v6, "libs":Ljava/util/List;
    .local v7, "id":Ljava/lang/String;
    .local v9, "vj":Ljava/util/Map;
    .local v10, "vEntry":Ljava/lang/String;
    .local v11, "installer":Ljava/io/File;
    .local v12, "mc":Ljava/lang/String;
    .local v14, "dirs":Lcom/pymcl/core/version/GameDirs;
    :goto_c
    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderInstaller;->game:Lcom/pymcl/core/version/GameInstaller;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$0:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$1:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$2:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$3:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$4:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$5:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$6:Ljava/lang/Object;

    iput-object v7, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$7:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$8:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$9:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$10:Ljava/lang/Object;

    const/4 v15, 0x0

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$11:Ljava/lang/Object;

    iput-object v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->L$12:Ljava/lang/Object;

    const/4 v15, 0x3

    iput v15, v13, Lcom/pymcl/core/loader/LoaderInstaller$installModern$1;->label:I

    const/4 v15, 0x1

    invoke-virtual {v4, v14, v7, v15, v13}, Lcom/pymcl/core/version/GameInstaller;->completeFiles(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_12

    .line 128
    return-object v0

    .line 153
    :cond_12
    move-object v0, v8

    .line 154
    .end local v8    # "procs":Ljava/util/List;
    .restart local v0    # "procs":Ljava/util/List;
    :goto_d
    return-object v7

    .line 130
    .end local v0    # "procs":Ljava/util/List;
    .end local v2    # "z":Ljava/util/zip/ZipFile;
    .end local v3    # "prof":Ljava/util/Map;
    .end local v6    # "libs":Ljava/util/List;
    .end local v7    # "id":Ljava/lang/String;
    .end local v9    # "vj":Ljava/util/Map;
    .end local v10    # "vEntry":Ljava/lang/String;
    .end local v11    # "installer":Ljava/io/File;
    .end local v12    # "mc":Ljava/lang/String;
    .end local v14    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v21    # "$result":Ljava/lang/Object;
    .local v4, "$result":Ljava/lang/Object;
    .local v5, "vEntry":Ljava/lang/String;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .local p3, "installer":Ljava/io/File;
    .local p4, "z":Ljava/util/zip/ZipFile;
    .local p5, "prof":Ljava/util/Map;
    :cond_13
    move-object/from16 v21, v4

    move-object/from16 v18, v5

    const/4 v15, 0x0

    .end local v4    # "$result":Ljava/lang/Object;
    .end local v5    # "vEntry":Ljava/lang/String;
    .restart local v18    # "vEntry":Ljava/lang/String;
    .restart local v21    # "$result":Ljava/lang/Object;
    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "installer \u7f3a\u5c11 "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v5, v18

    .end local v18    # "vEntry":Ljava/lang/String;
    .restart local v5    # "vEntry":Ljava/lang/String;
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x2

    invoke-direct {v0, v4, v15, v10, v15}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final installViaOfficial(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;
    .locals 16
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "installer"    # Ljava/io/File;

    .line 200
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lkotlin/collections/ArraysKt;->toSet([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    .line 201
    .local v0, "before":Ljava/util/Set;
    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getInstanceDir()Ljava/io/File;

    move-result-object v2

    const-string v3, "launcher_profiles.json"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v2, v1

    .line 457
    .local v2, "it":Ljava/io/File;
    const/4 v3, 0x0

    .line 201
    .local v3, "$i$a$-takeIf-LoaderInstaller$installViaOfficial$1":I
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    .end local v2    # "it":Ljava/io/File;
    .end local v3    # "$i$a$-takeIf-LoaderInstaller$installViaOfficial$1":I
    const/4 v2, 0x0

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    const/4 v3, 0x2

    if-eqz v1, :cond_3

    const-string v4, "{\"profiles\":{}}"

    invoke-static {v1, v4, v2, v3, v2}, Lkotlin/io/FilesKt;->writeText$default(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    .line 202
    :cond_3
    move-object/from16 v1, p0

    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderInstaller;->javaRunner:Lcom/pymcl/core/loader/JavaProcessRunner;

    const-string v5, "1.17"

    move-object/from16 v15, p2

    invoke-static {v15, v5}, Lcom/pymcl/core/loader/LoadersKt;->compareMc(Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    if-gez v5, :cond_4

    const/16 v5, 0x8

    goto :goto_1

    :cond_4
    const/16 v5, 0x11

    :goto_1
    invoke-static/range {p3 .. p3}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-array v7, v3, [Ljava/lang/String;

    const/4 v8, 0x0

    const-string v9, "--installClient"

    aput-object v9, v7, v8

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getInstanceDir()Ljava/io/File;

    move-result-object v8

    invoke-virtual {v8}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    aput-object v8, v7, v9

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getInstanceDir()Ljava/io/File;

    move-result-object v9

    const/16 v13, 0x60

    const/4 v14, 0x0

    const-string v7, "net.minecraftforge.installer.SimpleInstaller"

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v4 .. v14}, Lcom/pymcl/core/loader/JavaProcessRunner;->run$default(Lcom/pymcl/core/loader/JavaProcessRunner;ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/io/File;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)I

    move-result v4

    .line 203
    .local v4, "code":I
    if-nez v4, :cond_8

    .line 204
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-static {v5}, Lkotlin/collections/ArraysKt;->toSet([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v5

    :cond_6
    move-object v6, v0

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v5, v6}, Lkotlin/collections/SetsKt;->minus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_7

    return-object v5

    :cond_7
    new-instance v5, Lcom/pymcl/core/loader/InstallError;

    const-string v6, "\u5b98\u65b9\u5b89\u88c5\u5668\u672a\u751f\u6210\u7248\u672c"

    invoke-direct {v5, v6, v2, v3, v2}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v5

    .line 203
    :cond_8
    new-instance v5, Lcom/pymcl/core/loader/InstallError;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u5b98\u65b9\u5b89\u88c5\u5668\u9000\u51fa\u7801 "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, v2, v3, v2}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v5
.end method

.method private final installWithInstaller(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 25
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "urls"    # Ljava/util/List;
    .param p4, "cacheName"    # Ljava/lang/String;
    .param p5, "forge"    # Z
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/GameDirs;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p6

    instance-of v1, v6, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;

    if-eqz v1, :cond_0

    move-object v1, v6

    check-cast v1, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;

    iget v2, v1, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v2, v1, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->label:I

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;

    invoke-direct {v1, v0, v6}, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;-><init>(Lcom/pymcl/core/loader/LoaderInstaller;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v11, v1

    .local v11, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v15, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->result:Ljava/lang/Object;

    .local v15, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 99
    iget v2, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->label:I

    packed-switch v2, :pswitch_data_0

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    move/from16 v5, p5

    .end local v11    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v15    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v11    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v15    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-boolean v1, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->Z$0:Z

    .end local p5    # "forge":Z
    .local v1, "forge":Z
    iget-object v2, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$4:Ljava/lang/Object;

    check-cast v2, Ljava/io/File;

    .local v2, "inst":Ljava/io/File;
    iget-object v3, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .end local p4    # "cacheName":Ljava/lang/String;
    .local v3, "cacheName":Ljava/lang/String;
    iget-object v4, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    .end local p3    # "urls":Ljava/util/List;
    .local v4, "urls":Ljava/util/List;
    iget-object v5, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .local v5, "mc":Ljava/lang/String;
    iget-object v7, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v7, "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v15}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v10, v15

    goto/16 :goto_5

    .end local v1    # "forge":Z
    .end local v2    # "inst":Ljava/io/File;
    .end local v3    # "cacheName":Ljava/lang/String;
    .end local v4    # "urls":Ljava/util/List;
    .end local v5    # "mc":Ljava/lang/String;
    .end local v7    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "urls":Ljava/util/List;
    .restart local p4    # "cacheName":Ljava/lang/String;
    .restart local p5    # "forge":Z
    :pswitch_1
    iget-boolean v2, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->Z$0:Z

    .end local p5    # "forge":Z
    .local v2, "forge":Z
    iget-object v3, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/io/File;

    .local v3, "inst":Ljava/io/File;
    iget-object v4, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    .end local p4    # "cacheName":Ljava/lang/String;
    .local v4, "cacheName":Ljava/lang/String;
    iget-object v5, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    .end local p3    # "urls":Ljava/util/List;
    .local v5, "urls":Ljava/util/List;
    iget-object v7, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .local v7, "mc":Ljava/lang/String;
    iget-object v8, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v8, "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v15}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v24, v5

    move-object v5, v1

    move-object v1, v8

    move-object/from16 v8, v24

    move-object/from16 v24, v4

    move v4, v2

    move-object v2, v7

    move-object/from16 v7, v24

    goto/16 :goto_4

    .end local v2    # "forge":Z
    .end local v3    # "inst":Ljava/io/File;
    .end local v4    # "cacheName":Ljava/lang/String;
    .end local v5    # "urls":Ljava/util/List;
    .end local v7    # "mc":Ljava/lang/String;
    .end local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "urls":Ljava/util/List;
    .restart local p4    # "cacheName":Ljava/lang/String;
    .restart local p5    # "forge":Z
    :pswitch_2
    iget-boolean v2, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->Z$0:Z

    .end local p5    # "forge":Z
    .restart local v2    # "forge":Z
    iget-object v3, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/io/File;

    .restart local v3    # "inst":Ljava/io/File;
    iget-object v4, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    .end local p4    # "cacheName":Ljava/lang/String;
    .restart local v4    # "cacheName":Ljava/lang/String;
    iget-object v5, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    .end local p3    # "urls":Ljava/util/List;
    .restart local v5    # "urls":Ljava/util/List;
    iget-object v7, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$1:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .restart local v7    # "mc":Ljava/lang/String;
    iget-object v8, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v15}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v24, v7

    move v7, v2

    move-object v2, v8

    move-object v8, v3

    move-object v3, v4

    move-object/from16 v4, v24

    goto/16 :goto_2

    .end local v2    # "forge":Z
    .end local v3    # "inst":Ljava/io/File;
    .end local v4    # "cacheName":Ljava/lang/String;
    .end local v5    # "urls":Ljava/util/List;
    .end local v7    # "mc":Ljava/lang/String;
    .end local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "urls":Ljava/util/List;
    .restart local p4    # "cacheName":Ljava/lang/String;
    .restart local p5    # "forge":Z
    :pswitch_3
    invoke-static {v15}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 100
    new-instance v2, Ljava/io/File;

    iget-object v3, v0, Lcom/pymcl/core/loader/LoaderInstaller;->cacheDir:Ljava/io/File;

    move-object/from16 v8, p4

    invoke-direct {v2, v3, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object/from16 v18, v2

    .line 101
    .local v18, "inst":Ljava/io/File;
    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->isFile()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual/range {v18 .. v18}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    if-gez v2, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v9, p2

    move-object/from16 v5, p3

    move/from16 v2, p5

    move-object v3, v8

    move-object/from16 v4, v18

    move-object/from16 v8, p1

    goto :goto_3

    :cond_2
    :goto_1
    iget-object v7, v0, Lcom/pymcl/core/loader/LoaderInstaller;->dm:Lcom/pymcl/core/download/DownloadManager;

    new-instance v16, Lcom/pymcl/core/download/DownloadItem;

    const/16 v22, 0x1c

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, p3

    invoke-direct/range {v16 .. v23}, Lcom/pymcl/core/download/DownloadItem;-><init>(Ljava/util/List;Ljava/io/File;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v18

    .end local v18    # "inst":Ljava/io/File;
    .restart local v3    # "inst":Ljava/io/File;
    invoke-static/range {v16 .. v16}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    move-object/from16 v2, p1

    iput-object v2, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$0:Ljava/lang/Object;

    move-object/from16 v4, p2

    iput-object v4, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$1:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$2:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$3:Ljava/lang/Object;

    iput-object v3, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$4:Ljava/lang/Object;

    move/from16 v5, p5

    iput-boolean v5, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->Z$0:Z

    const/4 v10, 0x1

    iput v10, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->label:I

    const/4 v10, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x0

    invoke-static/range {v7 .. v13}, Lcom/pymcl/core/download/DownloadManager;->downloadAll$default(Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_3

    .line 99
    return-object v1

    .line 101
    :cond_3
    move-object v8, v3

    move v7, v5

    move-object/from16 v5, p3

    move-object/from16 v3, p4

    .line 102
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "urls":Ljava/util/List;
    .end local p4    # "cacheName":Ljava/lang/String;
    .end local p5    # "forge":Z
    .local v2, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v3, "cacheName":Ljava/lang/String;
    .local v4, "mc":Ljava/lang/String;
    .restart local v5    # "urls":Ljava/util/List;
    .local v7, "forge":Z
    .local v8, "inst":Ljava/io/File;
    :goto_2
    move-object v9, v4

    move-object v4, v8

    move-object v8, v2

    move v2, v7

    .end local v7    # "forge":Z
    .local v2, "forge":Z
    .local v4, "inst":Ljava/io/File;
    .local v8, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v9, "mc":Ljava/lang/String;
    :goto_3
    iget-object v7, v0, Lcom/pymcl/core/loader/LoaderInstaller;->game:Lcom/pymcl/core/version/GameInstaller;

    iput-object v8, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$0:Ljava/lang/Object;

    iput-object v9, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$1:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$2:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$3:Ljava/lang/Object;

    iput-object v4, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$4:Ljava/lang/Object;

    iput-boolean v2, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->Z$0:Z

    const/4 v10, 0x2

    iput v10, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->label:I

    const/4 v10, 0x1

    move-object v12, v11

    .end local v11    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v12, "$continuation":Lkotlin/coroutines/Continuation;
    const/4 v11, 0x0

    const/16 v13, 0x8

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lcom/pymcl/core/version/GameInstaller;->installVanilla$default(Lcom/pymcl/core/version/GameInstaller;Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;ZLcom/pymcl/core/version/ManifestEntry;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v11, v12

    .end local v12    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v11    # "$continuation":Lkotlin/coroutines/Continuation;
    if-ne v7, v1, :cond_4

    .line 99
    return-object v1

    .line 102
    :cond_4
    move-object v7, v5

    move-object v5, v1

    move-object v1, v8

    move-object v8, v7

    move-object v7, v3

    move-object v3, v4

    move v4, v2

    move-object v2, v9

    .line 103
    .end local v5    # "urls":Ljava/util/List;
    .end local v9    # "mc":Ljava/lang/String;
    .local v1, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v2, "mc":Ljava/lang/String;
    .local v3, "inst":Ljava/io/File;
    .local v4, "forge":Z
    .local v7, "cacheName":Ljava/lang/String;
    .local v8, "urls":Ljava/util/List;
    :goto_4
    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$0:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$1:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$2:Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$3:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->L$4:Ljava/lang/Object;

    iput-boolean v4, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->Z$0:Z

    const/4 v9, 0x3

    iput v9, v11, Lcom/pymcl/core/loader/LoaderInstaller$installWithInstaller$1;->label:I

    move-object v9, v5

    move-object v5, v11

    .end local v11    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v5, "$continuation":Lkotlin/coroutines/Continuation;
    invoke-virtual/range {v0 .. v5}, Lcom/pymcl/core/loader/LoaderInstaller;->installFromInstaller(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v10

    .end local v5    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v11    # "$continuation":Lkotlin/coroutines/Continuation;
    if-ne v10, v9, :cond_5

    .line 99
    return-object v9

    .line 103
    :cond_5
    move-object v5, v2

    move-object v2, v3

    move-object v3, v7

    move-object v7, v1

    move v1, v4

    move-object v4, v8

    .end local v8    # "urls":Ljava/util/List;
    .local v1, "forge":Z
    .local v2, "inst":Ljava/io/File;
    .local v3, "cacheName":Ljava/lang/String;
    .local v4, "urls":Ljava/util/List;
    .local v5, "mc":Ljava/lang/String;
    .local v7, "dirs":Lcom/pymcl/core/version/GameDirs;
    :goto_5
    return-object v10

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final isZip(Ljava/io/File;)Z
    .locals 7
    .param p1, "f"    # Ljava/io/File;

    .line 232
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x16

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    const/4 v0, 0x1

    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, p0

    check-cast v2, Lcom/pymcl/core/loader/LoaderInstaller;

    .line 483
    .local v2, "$this$isZip_u24lambda_u240":Lcom/pymcl/core/loader/LoaderInstaller;
    const/4 v3, 0x0

    .line 232
    .local v3, "$i$a$-runCatching-LoaderInstaller$isZip$1":I
    new-instance v4, Ljava/util/zip/ZipFile;

    invoke-direct {v4, p1}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    check-cast v4, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    move-object v5, v4

    check-cast v5, Ljava/util/zip/ZipFile;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 483
    .local v5, "it":Ljava/util/zip/ZipFile;
    const/4 v6, 0x0

    .line 232
    .local v6, "$i$a$-use-LoaderInstaller$isZip$1$1":I
    nop

    .end local v5    # "it":Ljava/util/zip/ZipFile;
    .end local v6    # "$i$a$-use-LoaderInstaller$isZip$1$1":I
    const/4 v5, 0x0

    :try_start_2
    invoke-static {v4, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v2    # "$this$isZip_u24lambda_u240":Lcom/pymcl/core/loader/LoaderInstaller;
    .end local v3    # "$i$a$-runCatching-LoaderInstaller$isZip$1":I
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    .restart local v2    # "$this$isZip_u24lambda_u240":Lcom/pymcl/core/loader/LoaderInstaller;
    .restart local v3    # "$i$a$-runCatching-LoaderInstaller$isZip$1":I
    :catchall_0
    move-exception v5

    .end local v2    # "$this$isZip_u24lambda_u240":Lcom/pymcl/core/loader/LoaderInstaller;
    .end local v3    # "$i$a$-runCatching-LoaderInstaller$isZip$1":I
    .end local p1    # "f":Ljava/io/File;
    :try_start_3
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .restart local v2    # "$this$isZip_u24lambda_u240":Lcom/pymcl/core/loader/LoaderInstaller;
    .restart local v3    # "$i$a$-runCatching-LoaderInstaller$isZip$1":I
    .restart local p1    # "f":Ljava/io/File;
    :catchall_1
    move-exception v6

    :try_start_4
    invoke-static {v4, v5}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local p1    # "f":Ljava/io/File;
    throw v6
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .end local v2    # "$this$isZip_u24lambda_u240":Lcom/pymcl/core/loader/LoaderInstaller;
    .end local v3    # "$i$a$-runCatching-LoaderInstaller$isZip$1":I
    .restart local p1    # "f":Ljava/io/File;
    :catchall_2
    move-exception v2

    sget-object v3, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v2, v3

    :cond_0
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1

    move v1, v0

    :cond_1
    return v1
.end method

.method private final localLib(Ljava/lang/String;Lcom/pymcl/core/version/GameDirs;)Ljava/util/Map;
    .locals 10
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/version/GameDirs;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 332
    sget-object v0, Lcom/pymcl/core/version/Maven;->INSTANCE:Lcom/pymcl/core/version/Maven;

    invoke-virtual {v0, p1}, Lcom/pymcl/core/version/Maven;->path(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .local v0, "path":Ljava/lang/String;
    new-instance v1, Ljava/io/File;

    invoke-virtual {p2}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 333
    .local v1, "f":Ljava/io/File;
    const/4 v2, 0x2

    new-array v3, v2, [Lkotlin/Pair;

    const-string v4, "name"

    invoke-static {v4, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    new-array v6, v4, [Lkotlin/Pair;

    const/4 v7, 0x3

    new-array v7, v7, [Lkotlin/Pair;

    const-string v8, "path"

    invoke-static {v8, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v7, v5

    const-string v8, "url"

    const-string v9, ""

    invoke-static {v8, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v7, v4

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    const-string v9, "size"

    invoke-static {v9, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-static {v7}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const-string v7, "artifact"

    invoke-static {v7, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v6, v5

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    const-string v5, "downloads"

    invoke-static {v5, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    aput-object v2, v3, v4

    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    return-object v2
.end method

.method private static final mavenVersions$lambda$0(Lkotlin/text/MatchResult;)Ljava/lang/String;
    .locals 2
    .param p0, "it"    # Lkotlin/text/MatchResult;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    invoke-interface {p0}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final metaVersions(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 20
    .param p1, "t"    # Lcom/pymcl/core/loader/LoaderType;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "mc"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/loader/LoaderType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/loader/LoaderVersion;",
            ">;"
        }
    .end annotation

    .line 53
    sget-object v0, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    invoke-direct {v1, v2}, Lcom/pymcl/core/loader/LoaderInstaller;->getText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/pymcl/core/util/Json;->parse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 361
    .local v3, "$i$f$mapNotNull":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v0

    .local v5, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 370
    .local v6, "$i$f$mapNotNullTo":I
    move-object v7, v5

    .local v7, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 371
    .local v8, "$i$f$forEach":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "element$iv$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 370
    .local v12, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object v13, v11

    check-cast v13, Ljava/util/Map;

    .local v13, "it":Ljava/util/Map;
    const/4 v14, 0x0

    .line 54
    .local v14, "$i$a$-mapNotNull-LoaderInstaller$metaVersions$1":I
    const-string v15, "loader"

    invoke-static {v13, v15}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v15

    move-object/from16 v16, v0

    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v16, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    if-nez v15, :cond_0

    move/from16 v17, v3

    move-object/from16 v18, v5

    move/from16 v19, v6

    const/4 v0, 0x0

    move-object/from16 v3, p1

    move-object/from16 v5, p3

    goto :goto_2

    .local v15, "l":Ljava/util/Map;
    :cond_0
    const-string v0, "version"

    invoke-static {v15, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    move/from16 v17, v3

    move-object/from16 v18, v5

    move/from16 v19, v6

    const/4 v0, 0x0

    move-object/from16 v3, p1

    move-object/from16 v5, p3

    goto :goto_2

    :cond_1
    const-string v2, "stable"

    invoke-static {v15, v2}, Lcom/pymcl/core/util/JsonKt;->bool(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move/from16 v17, v3

    move-object/from16 v18, v5

    move/from16 v19, v6

    goto :goto_1

    :cond_2
    invoke-static {v15, v0}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/CharSequence;

    const-string v2, "beta"

    check-cast v2, Ljava/lang/CharSequence;

    move/from16 v17, v3

    .end local v3    # "$i$f$mapNotNull":I
    .local v17, "$i$f$mapNotNull":I
    const/4 v3, 0x2

    move-object/from16 v18, v5

    .end local v5    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .local v18, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    move/from16 v19, v6

    const/4 v6, 0x0

    .end local v6    # "$i$f$mapNotNullTo":I
    .local v19, "$i$f$mapNotNullTo":I
    invoke-static {v0, v2, v5, v3, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_1

    :cond_3
    move v0, v5

    :goto_1
    new-instance v2, Lcom/pymcl/core/loader/LoaderVersion;

    move-object/from16 v3, p1

    move-object/from16 v5, p3

    invoke-direct {v2, v3, v5, v1, v0}, Lcom/pymcl/core/loader/LoaderVersion;-><init>(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Z)V

    move-object v0, v2

    .line 370
    .end local v13    # "it":Ljava/util/Map;
    .end local v14    # "$i$a$-mapNotNull-LoaderInstaller$metaVersions$1":I
    .end local v15    # "l":Ljava/util/Map;
    :goto_2
    if-eqz v0, :cond_4

    .line 372
    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 370
    .local v1, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 371
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v1    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_4
    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v0, v16

    move/from16 v3, v17

    move-object/from16 v5, v18

    move/from16 v6, v19

    .end local v10    # "element$iv$iv$iv":Ljava/lang/Object;
    goto/16 :goto_0

    .line 373
    .end local v16    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v17    # "$i$f$mapNotNull":I
    .end local v18    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v19    # "$i$f$mapNotNullTo":I
    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .restart local v3    # "$i$f$mapNotNull":I
    .restart local v5    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .restart local v6    # "$i$f$mapNotNullTo":I
    :cond_5
    move-object/from16 v16, v0

    .line 374
    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v7    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$forEach":I
    .restart local v16    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapNotNullTo":I
    move-object v0, v4

    check-cast v0, Ljava/util/List;

    .line 361
    nop

    .line 54
    .end local v3    # "$i$f$mapNotNull":I
    .end local v16    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    return-object v0
.end method

.method private static final parseLiteLoader$build(Ljava/lang/String;Ljava/util/Map;Z)Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .locals 13
    .param p0, "$mc"    # Ljava/lang/String;
    .param p1, "o"    # Ljava/util/Map;
    .param p2, "snap"    # Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;Z)",
            "Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;"
        }
    .end annotation

    .line 286
    const-string v0, "build"

    invoke-static {p1, v0}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    move-object v0, p1

    .line 287
    .local v0, "b":Ljava/util/Map;
    :cond_0
    const-string v1, "version"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    invoke-static {p1, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v3

    :cond_1
    move-object v6, v2

    .line 288
    .local v6, "v":Ljava/lang/String;
    new-instance v4, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    const-string v1, "mcversion"

    invoke-static {p1, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    move-object v5, p0

    goto :goto_0

    :cond_2
    move-object v5, v1

    :goto_0
    const-string v1, "file"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v1, "md5"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v1, "tweakClass"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    const-string v1, "com.mumfrey.liteloader.launch.LiteLoaderTweaker"

    :cond_3
    move-object v9, v1

    .line 289
    const-string v1, "libraries"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    const/4 v1, 0x1

    if-nez p2, :cond_6

    const-string v2, "stream"

    invoke-static {v0, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    const-string v2, "type"

    invoke-static {p1, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_4

    const-string v2, ""

    :cond_4
    const-string v11, "SNAPSHOT"

    invoke-static {v2, v11, v1}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_6

    const/4 v2, 0x2

    const/4 v12, 0x0

    invoke-static {v6, v11, v12, v2, v3}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_1

    :cond_5
    move v11, v12

    goto :goto_2

    :cond_6
    :goto_1
    move v11, v1

    .line 288
    :goto_2
    invoke-direct/range {v4 .. v11}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V

    return-object v4
.end method

.method private final prefetchMojmaps(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 10
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "data"    # Ljava/util/Map;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/GameDirs;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 171
    const-string v0, "MOJMAPS"

    invoke-interface {p3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 172
    .local v0, "target":Ljava/lang/String;
    :cond_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 173
    :cond_1
    sget-object v2, Lcom/pymcl/core/version/ResolvedVersion;->Companion:Lcom/pymcl/core/version/ResolvedVersion$Companion;

    invoke-virtual {p1}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v4, p2

    invoke-static/range {v2 .. v7}, Lcom/pymcl/core/version/ResolvedVersion$Companion;->load$default(Lcom/pymcl/core/version/ResolvedVersion$Companion;Ljava/io/File;Ljava/lang/String;IILjava/lang/Object;)Lcom/pymcl/core/version/ResolvedVersion;

    move-result-object v1

    .line 174
    .local v1, "v":Lcom/pymcl/core/version/ResolvedVersion;
    invoke-virtual {v1}, Lcom/pymcl/core/version/ResolvedVersion;->getJson()Ljava/util/Map;

    move-result-object v2

    const-string v3, "downloads"

    invoke-static {v2, v3}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    const-string v3, "client_mappings"

    invoke-static {v2, v3}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_2

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    .line 175
    .local v2, "cm":Ljava/util/Map;
    :cond_2
    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderInstaller;->dm:Lcom/pymcl/core/download/DownloadManager;

    iget-object v4, p0, Lcom/pymcl/core/loader/LoaderInstaller;->game:Lcom/pymcl/core/version/GameInstaller;

    const-string v5, "url"

    invoke-static {v2, v5}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v7, "sha1"

    invoke-static {v2, v7}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "size"

    invoke-static {v2, v8}, Lcom/pymcl/core/util/JsonKt;->long(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v4, v5, v6, v7, v8}, Lcom/pymcl/core/version/GameInstaller;->item(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Ljava/lang/Long;)Lcom/pymcl/core/download/DownloadItem;

    move-result-object v4

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v8, 0x4

    const/4 v9, 0x0

    const-string v4, "client_mappings"

    const/4 v6, 0x0

    move-object v7, p4

    invoke-static/range {v3 .. v9}, Lcom/pymcl/core/download/DownloadManager;->downloadAll$default(Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    .line 176
    return-object v3
.end method

.method private final runProcessor(Lcom/pymcl/core/version/GameDirs;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)V
    .locals 34
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "p"    # Ljava/util/Map;
    .param p3, "data"    # Ljava/util/Map;
    .param p4, "mc"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/GameDirs;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 184
    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v0, "args"

    invoke-static {v2, v0}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 418
    .local v5, "$i$f$mapNotNull":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v0

    .local v7, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 427
    .local v8, "$i$f$mapNotNullTo":I
    move-object v9, v7

    .local v9, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 428
    .local v10, "$i$f$forEach":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_2

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "element$iv$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 427
    .local v14, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object v15, v13

    .local v15, "it":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 184
    .local v16, "$i$a$-mapNotNull-LoaderInstaller$runProcessor$args$1":I
    instance-of v4, v15, Ljava/lang/String;

    if-eqz v4, :cond_0

    move-object v4, v15

    check-cast v4, Ljava/lang/String;

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 427
    .end local v15    # "it":Ljava/lang/Object;
    .end local v16    # "$i$a$-mapNotNull-LoaderInstaller$runProcessor$args$1":I
    :goto_1
    if-eqz v4, :cond_1

    .line 429
    .local v4, "it$iv$iv":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 427
    .local v15, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v6, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 428
    .end local v4    # "it$iv$iv":Ljava/lang/Object;
    .end local v13    # "element$iv$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    .end local v15    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    :cond_1
    nop

    .end local v12    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 430
    :cond_2
    nop

    .line 431
    .end local v9    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$forEach":I
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapNotNullTo":I
    move-object v4, v6

    check-cast v4, Ljava/util/List;

    .line 418
    nop

    .line 184
    .end local v0    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapNotNull":I
    goto :goto_2

    :cond_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v4

    .line 185
    .local v4, "args":Ljava/util/List;
    :goto_2
    move-object v5, v4

    check-cast v5, Ljava/lang/Iterable;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/collections/CollectionsKt;->windowed$default(Ljava/lang/Iterable;IIZILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 432
    .local v5, "$i$f$any":I
    instance-of v6, v0, Ljava/util/Collection;

    const/4 v8, 0x1

    if-eqz v6, :cond_4

    move-object v6, v0

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_4

    move v0, v7

    goto :goto_4

    .line 433
    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .local v9, "element$iv":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Ljava/util/List;

    .local v10, "it":Ljava/util/List;
    const/4 v11, 0x0

    .line 185
    .local v11, "$i$a$-any-LoaderInstaller$runProcessor$1":I
    invoke-interface {v10, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    const-string v13, "--task"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v10, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    const-string v13, "DOWNLOAD_MOJMAPS"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    move v10, v8

    goto :goto_3

    :cond_6
    move v10, v7

    .line 433
    .end local v10    # "it":Ljava/util/List;
    .end local v11    # "$i$a$-any-LoaderInstaller$runProcessor$1":I
    :goto_3
    if-eqz v10, :cond_5

    move v0, v8

    goto :goto_4

    .line 434
    .end local v9    # "element$iv":Ljava/lang/Object;
    :cond_7
    move v0, v7

    .line 185
    .end local v0    # "$this$any$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$any":I
    :goto_4
    if-eqz v0, :cond_8

    return-void

    .line 186
    :cond_8
    const-string v0, "outputs"

    invoke-static {v2, v0}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_9

    new-array v0, v7, [Lkotlin/Pair;

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    .local v0, "$this$map$iv":Ljava/util/Map;
    :cond_9
    const/4 v5, 0x0

    .line 435
    .local v5, "$i$f$map":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v9

    invoke-direct {v6, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v6, Ljava/util/Collection;

    .restart local v6    # "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v0

    .local v9, "$this$mapTo$iv$iv":Ljava/util/Map;
    const/4 v10, 0x0

    .line 436
    .local v10, "$i$f$mapTo":I
    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    .line 437
    .local v12, "item$iv$iv":Ljava/util/Map$Entry;
    const/4 v13, 0x0

    .local v13, "$i$a$-map-LoaderInstaller$runProcessor$outputs$1":I
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .local v14, "k":Ljava/lang/String;
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v15

    .line 186
    .local v15, "v":Ljava/lang/Object;
    move/from16 v16, v7

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v7

    invoke-virtual {v1, v14, v3, v7}, Lcom/pymcl/core/loader/LoaderInstaller;->substitute(Ljava/lang/String;Ljava/util/Map;Ljava/io/File;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "null cannot be cast to non-null type kotlin.String"

    invoke-static {v15, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, v15

    check-cast v8, Ljava/lang/String;

    move-object/from16 v17, v0

    .end local v0    # "$this$map$iv":Ljava/util/Map;
    .local v17, "$this$map$iv":Ljava/util/Map;
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v1, v8, v3, v0}, Lcom/pymcl/core/loader/LoaderInstaller;->substitute(Ljava/lang/String;Ljava/util/Map;Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v18, v4

    const/4 v8, 0x1

    .end local v4    # "args":Ljava/util/List;
    .local v18, "args":Ljava/util/List;
    new-array v4, v8, [C

    const/16 v8, 0x27

    aput-char v8, v4, v16

    invoke-static {v0, v4}, Lkotlin/text/StringsKt;->trim(Ljava/lang/String;[C)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 437
    .end local v13    # "$i$a$-map-LoaderInstaller$runProcessor$outputs$1":I
    .end local v14    # "k":Ljava/lang/String;
    .end local v15    # "v":Ljava/lang/Object;
    invoke-interface {v6, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v7, v16

    move-object/from16 v0, v17

    move-object/from16 v4, v18

    const/4 v8, 0x1

    goto :goto_5

    .line 438
    .end local v12    # "item$iv$iv":Ljava/util/Map$Entry;
    .end local v17    # "$this$map$iv":Ljava/util/Map;
    .end local v18    # "args":Ljava/util/List;
    .restart local v0    # "$this$map$iv":Ljava/util/Map;
    .restart local v4    # "args":Ljava/util/List;
    :cond_a
    move-object/from16 v17, v0

    move-object/from16 v18, v4

    move/from16 v16, v7

    .end local v0    # "$this$map$iv":Ljava/util/Map;
    .end local v4    # "args":Ljava/util/List;
    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$mapTo$iv$iv":Ljava/util/Map;
    .end local v10    # "$i$f$mapTo":I
    .restart local v17    # "$this$map$iv":Ljava/util/Map;
    .restart local v18    # "args":Ljava/util/List;
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    .line 435
    nop

    .line 186
    .end local v5    # "$i$f$map":I
    .end local v17    # "$this$map$iv":Ljava/util/Map;
    move-object v4, v0

    .line 187
    .local v4, "outputs":Ljava/util/List;
    move-object v0, v4

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v5, 0x2

    if-nez v0, :cond_f

    move-object v0, v4

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$all$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 439
    .local v6, "$i$f$all":I
    instance-of v7, v0, Ljava/util/Collection;

    if-eqz v7, :cond_b

    move-object v7, v0

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_b

    const/4 v8, 0x1

    goto :goto_7

    .line 440
    :cond_b
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lkotlin/Pair;

    const/4 v10, 0x0

    .local v10, "$i$a$-all-LoaderInstaller$runProcessor$2":I
    invoke-virtual {v9}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .local v11, "f":Ljava/lang/String;
    invoke-virtual {v9}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .line 187
    .local v9, "h":Ljava/lang/String;
    new-instance v12, Ljava/io/File;

    invoke-direct {v12, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12}, Ljava/io/File;->isFile()Z

    move-result v12

    if-eqz v12, :cond_d

    sget-object v12, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v13, Ljava/io/File;

    invoke-direct {v13, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v14, 0x0

    invoke-static {v12, v13, v14, v5, v14}, Lcom/pymcl/core/util/FileUtil;->hash$default(Lcom/pymcl/core/util/FileUtil;Ljava/io/File;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x1

    invoke-static {v12, v9, v13}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v12

    if-eqz v12, :cond_d

    const/4 v9, 0x1

    goto :goto_6

    :cond_d
    move/from16 v9, v16

    .line 440
    .end local v9    # "h":Ljava/lang/String;
    .end local v10    # "$i$a$-all-LoaderInstaller$runProcessor$2":I
    .end local v11    # "f":Ljava/lang/String;
    :goto_6
    if-nez v9, :cond_c

    move/from16 v8, v16

    goto :goto_7

    .line 441
    .end local v8    # "element$iv":Ljava/lang/Object;
    :cond_e
    const/4 v8, 0x1

    .line 187
    .end local v0    # "$this$all$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$all":I
    :goto_7
    if-eqz v8, :cond_f

    return-void

    .line 188
    :cond_f
    new-instance v0, Ljava/io/File;

    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v6

    sget-object v7, Lcom/pymcl/core/version/Maven;->INSTANCE:Lcom/pymcl/core/version/Maven;

    const-string v8, "jar"

    invoke-static {v2, v8}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v7, v8}, Lcom/pymcl/core/version/Maven;->path(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v0, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v6, v0

    .line 189
    .local v6, "jar":Ljava/io/File;
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const-string v7, "classpath"

    invoke-static {v2, v7}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_14

    check-cast v7, Ljava/lang/Iterable;

    .local v7, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 442
    .local v8, "$i$f$mapNotNull":I
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    check-cast v9, Ljava/util/Collection;

    .local v9, "destination$iv$iv":Ljava/util/Collection;
    move-object v10, v7

    .local v10, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 451
    .local v11, "$i$f$mapNotNullTo":I
    move-object v12, v10

    .local v12, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 452
    .local v13, "$i$f$forEach":I
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_8
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_13

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v17, v15

    .local v17, "element$iv$iv":Ljava/lang/Object;
    const/16 v19, 0x0

    .line 451
    .local v19, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v20, v17

    .local v20, "it":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 189
    .local v21, "$i$a$-mapNotNull-LoaderInstaller$runProcessor$cp$1":I
    move-object/from16 v5, v20

    .end local v20    # "it":Ljava/lang/Object;
    .local v5, "it":Ljava/lang/Object;
    instance-of v2, v5, Ljava/lang/String;

    if-eqz v2, :cond_10

    move-object v2, v5

    check-cast v2, Ljava/lang/String;

    goto :goto_9

    :cond_10
    const/4 v2, 0x0

    :goto_9
    if-eqz v2, :cond_11

    .line 453
    .local v2, "c":Ljava/lang/String;
    const/16 v20, 0x0

    .line 189
    .local v20, "$i$a$-let-LoaderInstaller$runProcessor$cp$1$1":I
    move-object/from16 v22, v4

    .end local v4    # "outputs":Ljava/util/List;
    .local v22, "outputs":Ljava/util/List;
    new-instance v4, Ljava/io/File;

    move-object/from16 v23, v5

    .end local v5    # "it":Ljava/lang/Object;
    .local v23, "it":Ljava/lang/Object;
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v5

    move-object/from16 v24, v7

    .end local v7    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v24, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    sget-object v7, Lcom/pymcl/core/version/Maven;->INSTANCE:Lcom/pymcl/core/version/Maven;

    invoke-virtual {v7, v2}, Lcom/pymcl/core/version/Maven;->path(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v5, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .end local v2    # "c":Ljava/lang/String;
    .end local v20    # "$i$a$-let-LoaderInstaller$runProcessor$cp$1$1":I
    goto :goto_a

    .end local v22    # "outputs":Ljava/util/List;
    .end local v23    # "it":Ljava/lang/Object;
    .end local v24    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .restart local v4    # "outputs":Ljava/util/List;
    .restart local v5    # "it":Ljava/lang/Object;
    .restart local v7    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    :cond_11
    move-object/from16 v22, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v7

    .end local v4    # "outputs":Ljava/util/List;
    .end local v5    # "it":Ljava/lang/Object;
    .end local v7    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .restart local v22    # "outputs":Ljava/util/List;
    .restart local v23    # "it":Ljava/lang/Object;
    .restart local v24    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 451
    .end local v21    # "$i$a$-mapNotNull-LoaderInstaller$runProcessor$cp$1":I
    .end local v23    # "it":Ljava/lang/Object;
    :goto_a
    if-eqz v4, :cond_12

    .line 454
    .local v4, "it$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 451
    .local v2, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v9, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 452
    .end local v2    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v4    # "it$iv$iv":Ljava/lang/Object;
    .end local v17    # "element$iv$iv":Ljava/lang/Object;
    .end local v19    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_12
    move-object/from16 v2, p2

    move-object/from16 v4, v22

    move-object/from16 v7, v24

    const/4 v5, 0x2

    .end local v15    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_8

    .line 455
    .end local v22    # "outputs":Ljava/util/List;
    .end local v24    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v4, "outputs":Ljava/util/List;
    .restart local v7    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    :cond_13
    move-object/from16 v22, v4

    move-object/from16 v24, v7

    .line 456
    .end local v4    # "outputs":Ljava/util/List;
    .end local v7    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v12    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v13    # "$i$f$forEach":I
    .restart local v22    # "outputs":Ljava/util/List;
    .restart local v24    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    nop

    .end local v9    # "destination$iv$iv":Ljava/util/Collection;
    .end local v10    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v11    # "$i$f$mapNotNullTo":I
    move-object v2, v9

    check-cast v2, Ljava/util/List;

    .line 442
    nop

    .line 189
    .end local v8    # "$i$f$mapNotNull":I
    .end local v24    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    goto :goto_b

    .end local v22    # "outputs":Ljava/util/List;
    .restart local v4    # "outputs":Ljava/util/List;
    :cond_14
    move-object/from16 v22, v4

    .end local v4    # "outputs":Ljava/util/List;
    .restart local v22    # "outputs":Ljava/util/List;
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v2

    :goto_b
    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v25

    .line 190
    .local v25, "cp":Ljava/util/List;
    new-instance v0, Ljava/util/jar/JarFile;

    invoke-direct {v0, v6}, Ljava/util/jar/JarFile;-><init>(Ljava/io/File;)V

    move-object v2, v0

    check-cast v2, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v2

    check-cast v0, Ljava/util/jar/JarFile;

    .line 457
    .local v0, "it":Ljava/util/jar/JarFile;
    const/4 v4, 0x0

    .line 190
    .local v4, "$i$a$-use-LoaderInstaller$runProcessor$main$1":I
    invoke-virtual {v0}, Ljava/util/jar/JarFile;->getManifest()Ljava/util/jar/Manifest;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/jar/Manifest;->getMainAttributes()Ljava/util/jar/Attributes;

    move-result-object v5

    const-string v7, "Main-Class"

    invoke-virtual {v5, v7}, Ljava/util/jar/Attributes;->getValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v26
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v14, 0x0

    .end local v0    # "it":Ljava/util/jar/JarFile;
    .end local v4    # "$i$a$-use-LoaderInstaller$runProcessor$main$1":I
    invoke-static {v2, v14}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    const-string v0, "\u5904\u7406\u5668 "

    if-eqz v26, :cond_1e

    .line 191
    .local v26, "main":Ljava/lang/String;
    const-string v2, "1.17"

    move-object/from16 v4, p4

    invoke-static {v4, v2}, Lcom/pymcl/core/loader/LoadersKt;->compareMc(Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-gez v2, :cond_15

    const/16 v2, 0x8

    goto :goto_c

    :cond_15
    const/16 v2, 0x11

    :goto_c
    move/from16 v24, v2

    .line 192
    .local v24, "major":I
    iget-object v2, v1, Lcom/pymcl/core/loader/LoaderInstaller;->javaRunner:Lcom/pymcl/core/loader/JavaProcessRunner;

    move-object/from16 v5, v18

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 458
    .local v7, "$i$f$map":I
    new-instance v8, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v5, v9}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v5

    .local v9, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 459
    .local v10, "$i$f$mapTo":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_d
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_16

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .line 460
    .local v12, "item$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/lang/String;

    .local v13, "it":Ljava/lang/String;
    const/4 v14, 0x0

    .line 192
    .local v14, "$i$a$-map-LoaderInstaller$runProcessor$code$1":I
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v15

    invoke-virtual {v1, v13, v3, v15}, Lcom/pymcl/core/loader/LoaderInstaller;->substitute(Ljava/lang/String;Ljava/util/Map;Ljava/io/File;)Ljava/lang/String;

    move-result-object v13

    .line 460
    .end local v13    # "it":Ljava/lang/String;
    .end local v14    # "$i$a$-map-LoaderInstaller$runProcessor$code$1":I
    invoke-interface {v8, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_d

    .line 461
    .end local v12    # "item$iv$iv":Ljava/lang/Object;
    :cond_16
    nop

    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$mapTo":I
    move-object/from16 v27, v8

    check-cast v27, Ljava/util/List;

    .line 458
    nop

    .line 192
    .end local v5    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$map":I
    invoke-virtual/range {p1 .. p1}, Lcom/pymcl/core/version/GameDirs;->getInstanceDir()Ljava/io/File;

    move-result-object v28

    const/16 v32, 0x60

    const/16 v33, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    move-object/from16 v23, v2

    invoke-static/range {v23 .. v33}, Lcom/pymcl/core/loader/JavaProcessRunner;->run$default(Lcom/pymcl/core/loader/JavaProcessRunner;ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/io/File;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)I

    move-result v2

    .line 193
    .local v2, "code":I
    move-object/from16 v5, v22

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 462
    .local v7, "$i$f$filter":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .restart local v8    # "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v5

    .local v9, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 463
    .local v10, "$i$f$filterTo":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_e
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Lkotlin/Pair;

    const/4 v14, 0x0

    .local v14, "$i$a$-filter-LoaderInstaller$runProcessor$bad$1":I
    invoke-virtual {v13}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    .local v15, "f":Ljava/lang/String;
    invoke-virtual {v13}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 193
    .local v13, "h":Ljava/lang/String;
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v15}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_18

    sget-object v1, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v15}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    move-object/from16 v17, v5

    const/4 v4, 0x2

    const/4 v5, 0x0

    .end local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    .local v17, "$this$filter$iv":Ljava/lang/Iterable;
    invoke-static {v1, v3, v5, v4, v5}, Lcom/pymcl/core/util/FileUtil;->hash$default(Lcom/pymcl/core/util/FileUtil;Ljava/io/File;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v1, v13, v3}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    if-nez v1, :cond_17

    goto :goto_f

    :cond_17
    move/from16 v1, v16

    goto :goto_10

    .end local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    :cond_18
    move-object/from16 v17, v5

    const/4 v3, 0x1

    .end local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    :goto_f
    move v1, v3

    .line 463
    .end local v13    # "h":Ljava/lang/String;
    .end local v14    # "$i$a$-filter-LoaderInstaller$runProcessor$bad$1":I
    .end local v15    # "f":Ljava/lang/String;
    :goto_10
    if-eqz v1, :cond_19

    invoke-interface {v8, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_19
    move-object/from16 v1, p0

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, v17

    goto :goto_e

    .line 464
    .end local v12    # "element$iv$iv":Ljava/lang/Object;
    .end local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    .restart local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    :cond_1a
    move-object/from16 v17, v5

    .end local v5    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$filterTo":I
    .restart local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    move-object v1, v8

    check-cast v1, Ljava/util/List;

    .line 462
    nop

    .line 193
    .end local v7    # "$i$f$filter":I
    .end local v17    # "$this$filter$iv":Ljava/lang/Iterable;
    nop

    .line 194
    .local v1, "bad":Ljava/util/List;
    if-eqz v2, :cond_1c

    invoke-interface/range {v22 .. v22}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1b

    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1b

    goto :goto_11

    :cond_1b
    new-instance v3, Lcom/pymcl/core/loader/InstallError;

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, " \u9000\u51fa\u7801 "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x2

    const/4 v14, 0x0

    invoke-direct {v3, v0, v14, v4, v14}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v3

    .line 195
    :cond_1c
    :goto_11
    move-object v0, v1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1d

    .line 196
    return-void

    .line 195
    :cond_1d
    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    move-object v7, v1

    check-cast v7, Ljava/lang/Iterable;

    new-instance v13, Lcom/pymcl/core/loader/LoaderInstaller$$ExternalSyntheticLambda0;

    invoke-direct {v13}, Lcom/pymcl/core/loader/LoaderInstaller$$ExternalSyntheticLambda0;-><init>()V

    const/16 v14, 0x1f

    const/4 v15, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v7 .. v15}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u5904\u7406\u5668\u8f93\u51fa\u6821\u9a8c\u5931\u8d25: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v14, 0x0

    invoke-direct {v0, v3, v14, v4, v14}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0

    .line 190
    .end local v1    # "bad":Ljava/util/List;
    .end local v2    # "code":I
    .end local v24    # "major":I
    .end local v26    # "main":Ljava/lang/String;
    :cond_1e
    new-instance v1, Lcom/pymcl/core/loader/InstallError;

    invoke-virtual {v6}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " \u65e0 Main-Class"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v4, 0x2

    const/4 v14, 0x0

    invoke-direct {v1, v0, v14, v4, v14}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1

    :catchall_0
    move-exception v0

    move-object v1, v0

    .end local v6    # "jar":Ljava/io/File;
    .end local v18    # "args":Ljava/util/List;
    .end local v22    # "outputs":Ljava/util/List;
    .end local v25    # "cp":Ljava/util/List;
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "p":Ljava/util/Map;
    .end local p3    # "data":Ljava/util/Map;
    .end local p4    # "mc":Ljava/lang/String;
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .restart local v6    # "jar":Ljava/io/File;
    .restart local v18    # "args":Ljava/util/List;
    .restart local v22    # "outputs":Ljava/util/List;
    .restart local v25    # "cp":Ljava/util/List;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "p":Ljava/util/Map;
    .restart local p3    # "data":Ljava/util/Map;
    .restart local p4    # "mc":Ljava/lang/String;
    :catchall_1
    move-exception v0

    invoke-static {v2, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method private static final runProcessor$lambda$8(Lkotlin/Pair;)Ljava/lang/CharSequence;
    .locals 2
    .param p0, "it"    # Lkotlin/Pair;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getName(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method private static final substitute$lambda$0(Ljava/util/Map;Lkotlin/text/MatchResult;)Ljava/lang/CharSequence;
    .locals 2
    .param p0, "$data"    # Ljava/util/Map;
    .param p1, "it"    # Lkotlin/text/MatchResult;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    invoke-interface {p1}, Lkotlin/text/MatchResult;->getGroupValues()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lkotlin/text/MatchResult;->getValue()Ljava/lang/String;

    move-result-object v0

    :goto_0
    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method private final verKey(Lcom/pymcl/core/loader/LoaderVersion;)Ljava/lang/String;
    .locals 10
    .param p1, "v"    # Lcom/pymcl/core/loader/LoaderVersion;

    .line 69
    invoke-virtual {p1}, Lcom/pymcl/core/loader/LoaderVersion;->getVersion()Ljava/lang/String;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v0, 0x2

    new-array v2, v0, [C

    fill-array-data v2, :array_0

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    const-string v0, "."

    move-object v2, v0

    check-cast v2, Ljava/lang/CharSequence;

    new-instance v7, Lcom/pymcl/core/loader/LoaderInstaller$$ExternalSyntheticLambda2;

    invoke-direct {v7}, Lcom/pymcl/core/loader/LoaderInstaller$$ExternalSyntheticLambda2;-><init>()V

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :array_0
    .array-data 2
        0x2es
        0x2ds
    .end array-data
.end method

.method private static final verKey$lambda$0(Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 3
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    invoke-static {p0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    const/16 v2, 0x30

    invoke-static {v0, v1, v2}, Lkotlin/text/StringsKt;->padStart(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    return-object v0
.end method

.method private final writeTweakVersion(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 9
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "id"    # Ljava/lang/String;
    .param p3, "mc"    # Ljava/lang/String;
    .param p4, "libs"    # Ljava/util/List;
    .param p5, "tweak"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/GameDirs;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 338
    sget-object v0, Lcom/pymcl/core/version/ResolvedVersion;->Companion:Lcom/pymcl/core/version/ResolvedVersion$Companion;

    invoke-virtual {p1}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v2, p3

    .end local p3    # "mc":Ljava/lang/String;
    .local v2, "mc":Ljava/lang/String;
    invoke-static/range {v0 .. v5}, Lcom/pymcl/core/version/ResolvedVersion$Companion;->load$default(Lcom/pymcl/core/version/ResolvedVersion$Companion;Ljava/io/File;Ljava/lang/String;IILjava/lang/Object;)Lcom/pymcl/core/version/ResolvedVersion;

    move-result-object p3

    .line 339
    .local p3, "parent":Lcom/pymcl/core/version/ResolvedVersion;
    invoke-static {}, Ljava/time/OffsetDateTime;->now()Ljava/time/OffsetDateTime;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/time/OffsetDateTime;->withNano(I)Ljava/time/OffsetDateTime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/OffsetDateTime;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "toString(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 340
    .local v0, "now":Ljava/lang/String;
    const/16 v3, 0x8

    new-array v3, v3, [Lkotlin/Pair;

    const-string v4, "id"

    invoke-static {v4, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    aput-object v4, v3, v1

    const-string v4, "inheritsFrom"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    const-string v4, "jar"

    invoke-static {v4, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v6, 0x2

    aput-object v4, v3, v6

    invoke-virtual {p3}, Lcom/pymcl/core/version/ResolvedVersion;->getJson()Ljava/util/Map;

    move-result-object v4

    const-string v6, "type"

    invoke-static {v4, v6}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_0

    const-string v4, "release"

    :cond_0
    invoke-static {v6, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v6, 0x3

    aput-object v4, v3, v6

    const-string v4, "time"

    invoke-static {v4, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v6, 0x4

    aput-object v4, v3, v6

    const-string v4, "releaseTime"

    invoke-static {v4, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v6, 0x5

    aput-object v4, v3, v6

    .line 341
    const-string v4, "mainClass"

    const-string v6, "net.minecraft.launchwrapper.Launch"

    invoke-static {v4, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v6, 0x6

    aput-object v4, v3, v6

    .line 340
    nop

    .line 341
    move-object v4, p4

    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    move-result-object v4

    const-string v6, "libraries"

    invoke-static {v6, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v4

    const/4 v6, 0x7

    aput-object v4, v3, v6

    .line 340
    invoke-static {v3}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    .line 342
    .local v3, "j":Ljava/util/Map;
    invoke-virtual {p3}, Lcom/pymcl/core/version/ResolvedVersion;->getMinecraftArguments()Ljava/lang/String;

    move-result-object v4

    .line 343
    .local v4, "old":Ljava/lang/String;
    const-string v6, "arguments"

    if-eqz v4, :cond_1

    invoke-virtual {p3}, Lcom/pymcl/core/version/ResolvedVersion;->getJson()Ljava/util/Map;

    move-result-object v7

    invoke-static {v7, v6}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v7

    if-nez v7, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v5, " --tweakClass "

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "minecraftArguments"

    invoke-interface {v3, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 344
    :cond_1
    new-array v5, v5, [Lkotlin/Pair;

    const-string v7, "--tweakClass"

    filled-new-array {v7, p5}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const-string v8, "game"

    invoke-static {v8, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v5, v1

    invoke-static {v5}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v3, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    :goto_0
    sget-object v1, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v5, Ljava/io/File;

    invoke-virtual {p1}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "/"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, ".json"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1, v5, v3}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    .line 346
    return-void
.end method


# virtual methods
.method public final fabricVersions(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .param p1, "mc"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/loader/LoaderVersion;",
            ">;"
        }
    .end annotation

    const-string v0, "mc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    sget-object v0, Lcom/pymcl/core/loader/LoaderType;->FABRIC:Lcom/pymcl/core/loader/LoaderType;

    sget-object v1, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v1, p1}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://meta.fabricmc.net/v2/versions/loader/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1, p1}, Lcom/pymcl/core/loader/LoaderInstaller;->metaVersions(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final forgeInstallerUrls(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 24
    .param p1, "mc"    # Ljava/lang/String;
    .param p2, "forge"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "mc"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "forge"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v1, v2, v5, v6, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v1

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 87
    .local v2, "full":Ljava/lang/String;
    :goto_0
    new-array v4, v6, [Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v4, v5

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    .line 88
    .local v3, "alt":Ljava/util/List;
    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$flatMap$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 405
    .local v5, "$i$f$flatMap":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v4

    .local v7, "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 406
    .local v8, "$i$f$flatMapTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 407
    .local v10, "element$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Ljava/lang/String;

    .local v11, "v":Ljava/lang/String;
    const/4 v12, 0x0

    .line 88
    .local v12, "$i$a$-flatMap-LoaderInstaller$forgeInstallerUrls$1":I
    sget-object v13, Lcom/pymcl/core/loader/LoaderInstaller;->FORGE_MAVEN_MIRRORS:Ljava/util/List;

    check-cast v13, Ljava/lang/Iterable;

    .local v13, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 408
    .local v14, "$i$f$map":I
    new-instance v15, Ljava/util/ArrayList;

    move-object/from16 v16, v2

    .end local v2    # "full":Ljava/lang/String;
    .local v16, "full":Ljava/lang/String;
    const/16 v2, 0xa

    invoke-static {v13, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v15, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v2, v15

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v15, v13

    .local v15, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/16 v17, 0x0

    .line 409
    .local v17, "$i$f$mapTo":I
    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_2
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v19

    if-eqz v19, :cond_1

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v19

    .line 410
    .local v19, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v20, v3

    .end local v3    # "alt":Ljava/util/List;
    .local v20, "alt":Ljava/util/List;
    move-object/from16 v3, v19

    check-cast v3, Ljava/lang/String;

    .local v3, "it":Ljava/lang/String;
    const/16 v21, 0x0

    .line 88
    .local v21, "$i$a$-map-LoaderInstaller$forgeInstallerUrls$1$1":I
    move-object/from16 v22, v4

    .end local v4    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .local v22, "$this$flatMap$iv":Ljava/lang/Iterable;
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    move-object/from16 v23, v3

    .end local v3    # "it":Ljava/lang/String;
    .local v23, "it":Ljava/lang/String;
    const-string v3, "/"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/forge-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "-installer.jar"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 410
    .end local v21    # "$i$a$-map-LoaderInstaller$forgeInstallerUrls$1$1":I
    .end local v23    # "it":Ljava/lang/String;
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v3, v20

    move-object/from16 v4, v22

    goto :goto_2

    .line 411
    .end local v19    # "item$iv$iv":Ljava/lang/Object;
    .end local v20    # "alt":Ljava/util/List;
    .end local v22    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .local v3, "alt":Ljava/util/List;
    .restart local v4    # "$this$flatMap$iv":Ljava/lang/Iterable;
    :cond_1
    move-object/from16 v20, v3

    move-object/from16 v22, v4

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "alt":Ljava/util/List;
    .end local v4    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v15    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v17    # "$i$f$mapTo":I
    .restart local v20    # "alt":Ljava/util/List;
    .restart local v22    # "$this$flatMap$iv":Ljava/lang/Iterable;
    check-cast v2, Ljava/util/List;

    .line 408
    nop

    .end local v13    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v14    # "$i$f$map":I
    check-cast v2, Ljava/lang/Iterable;

    .line 88
    nop

    .line 407
    .end local v11    # "v":Ljava/lang/String;
    .end local v12    # "$i$a$-flatMap-LoaderInstaller$forgeInstallerUrls$1":I
    nop

    .line 412
    .local v2, "list$iv$iv":Ljava/lang/Iterable;
    invoke-static {v6, v2}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    move-object/from16 v2, v16

    goto :goto_1

    .line 414
    .end local v10    # "element$iv$iv":Ljava/lang/Object;
    .end local v16    # "full":Ljava/lang/String;
    .end local v20    # "alt":Ljava/util/List;
    .end local v22    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .local v2, "full":Ljava/lang/String;
    .restart local v3    # "alt":Ljava/util/List;
    .restart local v4    # "$this$flatMap$iv":Ljava/lang/Iterable;
    :cond_2
    move-object/from16 v16, v2

    move-object/from16 v20, v3

    move-object/from16 v22, v4

    .end local v2    # "full":Ljava/lang/String;
    .end local v3    # "alt":Ljava/util/List;
    .end local v4    # "$this$flatMap$iv":Ljava/lang/Iterable;
    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$flatMapTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$flatMapTo":I
    .restart local v16    # "full":Ljava/lang/String;
    .restart local v20    # "alt":Ljava/util/List;
    .restart local v22    # "$this$flatMap$iv":Ljava/lang/Iterable;
    move-object v2, v6

    check-cast v2, Ljava/util/List;

    .line 405
    nop

    .end local v5    # "$i$f$flatMap":I
    .end local v22    # "$this$flatMap$iv":Ljava/lang/Iterable;
    check-cast v2, Ljava/util/Collection;

    .line 88
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "https://bmclapi2.bangbang93.com/forge/download?mcversion="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "&version="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "&category=installer&format=jar"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    return-object v2
.end method

.method public final forgeVersions(Ljava/lang/String;)Ljava/util/List;
    .locals 25
    .param p1, "mc"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/loader/LoaderVersion;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v4, p1

    const-string v0, "mc"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    const/4 v9, 0x0

    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/core/loader/LoaderInstaller;

    .line 375
    .local v0, "$this$forgeVersions_u24lambda_u240":Lcom/pymcl/core/loader/LoaderInstaller;
    const/4 v10, 0x0

    .line 57
    .local v10, "$i$a$-runCatching-LoaderInstaller$forgeVersions$1":I
    sget-object v2, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    iget-object v11, v0, Lcom/pymcl/core/loader/LoaderInstaller;->http:Lcom/pymcl/core/net/Http;

    sget-object v3, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v3, v4}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "https://bmclapi2.bangbang93.com/forge/minecraft/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    const/4 v15, 0x6

    const/16 v16, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Lcom/pymcl/core/net/Http;->getText$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/pymcl/core/util/Json;->parse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 58
    move-object v11, v2

    .local v11, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 376
    .local v12, "$i$f$mapNotNull":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    move-object v13, v2

    .local v13, "destination$iv$iv":Ljava/util/Collection;
    move-object v14, v11

    .local v14, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 385
    .local v15, "$i$f$mapNotNullTo":I
    move-object/from16 v16, v14

    .local v16, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/16 v17, 0x0

    .line 386
    .local v17, "$i$f$forEach":I
    invoke-interface/range {v16 .. v16}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v18

    :goto_0
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v19, v2

    .local v19, "element$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v20, v19

    .local v20, "element$iv$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 385
    .local v21, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object/from16 v2, v20

    check-cast v2, Ljava/util/Map;

    .local v2, "o":Ljava/util/Map;
    const/16 v22, 0x0

    .line 58
    .local v22, "$i$a$-mapNotNull-LoaderInstaller$forgeVersions$1$1":I
    const-string v3, "version"

    invoke-static {v2, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_0

    .line 375
    .local v5, "it":Ljava/lang/String;
    const/16 v23, 0x0

    .line 58
    .local v23, "$i$a$-let-LoaderInstaller$forgeVersions$1$1$1":I
    move-object v3, v2

    .end local v2    # "o":Ljava/util/Map;
    .local v3, "o":Ljava/util/Map;
    new-instance v2, Lcom/pymcl/core/loader/LoaderVersion;

    move-object v6, v3

    .end local v3    # "o":Ljava/util/Map;
    .local v6, "o":Ljava/util/Map;
    sget-object v3, Lcom/pymcl/core/loader/LoaderType;->FORGE:Lcom/pymcl/core/loader/LoaderType;

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object/from16 v24, v6

    .end local v6    # "o":Ljava/util/Map;
    .local v24, "o":Ljava/util/Map;
    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/pymcl/core/loader/LoaderVersion;-><init>(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .end local v5    # "it":Ljava/lang/String;
    .end local v23    # "$i$a$-let-LoaderInstaller$forgeVersions$1$1$1":I
    goto :goto_1

    .end local v24    # "o":Ljava/util/Map;
    .restart local v2    # "o":Ljava/util/Map;
    :cond_0
    move-object/from16 v24, v2

    .end local v2    # "o":Ljava/util/Map;
    .restart local v24    # "o":Ljava/util/Map;
    move-object v2, v9

    .line 385
    .end local v22    # "$i$a$-mapNotNull-LoaderInstaller$forgeVersions$1$1":I
    .end local v24    # "o":Ljava/util/Map;
    :goto_1
    if-eqz v2, :cond_1

    .line 387
    .local v2, "it$iv$iv":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 385
    .local v3, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v13, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 386
    .end local v2    # "it$iv$iv":Ljava/lang/Object;
    .end local v3    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v20    # "element$iv$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_1
    nop

    .end local v19    # "element$iv$iv$iv":Ljava/lang/Object;
    goto :goto_0

    .line 388
    :cond_2
    nop

    .line 389
    .end local v16    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v17    # "$i$f$forEach":I
    nop

    .end local v13    # "destination$iv$iv":Ljava/util/Collection;
    .end local v14    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v15    # "$i$f$mapNotNullTo":I
    move-object v2, v13

    check-cast v2, Ljava/util/List;

    .line 376
    nop

    .end local v11    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$mapNotNull":I
    check-cast v2, Ljava/lang/Iterable;

    .line 58
    new-instance v3, Lcom/pymcl/core/loader/LoaderInstaller$forgeVersions$lambda$0$$inlined$compareByDescending$1;

    invoke-direct {v3, v0}, Lcom/pymcl/core/loader/LoaderInstaller$forgeVersions$lambda$0$$inlined$compareByDescending$1;-><init>(Lcom/pymcl/core/loader/LoaderInstaller;)V

    check-cast v3, Ljava/util/Comparator;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    return-object v2

    .end local v0    # "$this$forgeVersions_u24lambda_u240":Lcom/pymcl/core/loader/LoaderInstaller;
    .end local v10    # "$i$a$-runCatching-LoaderInstaller$forgeVersions$1":I
    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    const-string v0, "https://maven.minecraftforge.net/net/minecraftforge/forge/maven-metadata.xml"

    invoke-direct {v1, v0}, Lcom/pymcl/core/loader/LoaderInstaller;->getText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/pymcl/core/loader/LoaderInstaller;->mavenVersions(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 390
    .local v2, "$i$f$filter":I
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .local v3, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v0

    .local v5, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 391
    .local v6, "$i$f$filterTo":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_3
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v10, 0x2

    const-string v11, "-"

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element$iv$iv":Ljava/lang/Object;
    move-object v12, v8

    check-cast v12, Ljava/lang/String;

    .local v12, "it":Ljava/lang/String;
    const/4 v13, 0x0

    .line 59
    .local v13, "$i$a$-filter-LoaderInstaller$forgeVersions$2":I
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/4 v14, 0x0

    invoke-static {v12, v11, v14, v10, v9}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v10

    .line 391
    .end local v12    # "it":Ljava/lang/String;
    .end local v13    # "$i$a$-filter-LoaderInstaller$forgeVersions$2":I
    if-eqz v10, :cond_3

    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 392
    .end local v8    # "element$iv$iv":Ljava/lang/Object;
    :cond_4
    nop

    .end local v3    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$filterTo":I
    check-cast v3, Ljava/util/List;

    .line 390
    nop

    .end local v0    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$filter":I
    check-cast v3, Ljava/lang/Iterable;

    .line 60
    move-object v0, v3

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 393
    .local v12, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v13, v0

    .local v13, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    move-object v14, v2

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .local v14, "destination$iv$iv":Ljava/util/Collection;
    const/4 v15, 0x0

    .line 394
    .local v15, "$i$f$mapTo":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .line 395
    .local v17, "item$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v17

    check-cast v2, Ljava/lang/String;

    .local v2, "it":Ljava/lang/String;
    const/16 v18, 0x0

    .line 60
    .local v18, "$i$a$-map-LoaderInstaller$forgeVersions$3":I
    new-instance v3, Lcom/pymcl/core/loader/LoaderVersion;

    move-object v5, v3

    sget-object v3, Lcom/pymcl/core/loader/LoaderType;->FORGE:Lcom/pymcl/core/loader/LoaderType;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-static {v2, v6}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v9, v10, v9}, Lkotlin/text/StringsKt;->substringBefore$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object/from16 v19, v2

    move-object v2, v5

    move-object v5, v6

    .end local v2    # "it":Ljava/lang/String;
    .local v19, "it":Ljava/lang/String;
    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/pymcl/core/loader/LoaderVersion;-><init>(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 395
    .end local v18    # "$i$a$-map-LoaderInstaller$forgeVersions$3":I
    .end local v19    # "it":Ljava/lang/String;
    invoke-interface {v14, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v4, p1

    goto :goto_3

    .line 396
    .end local v17    # "item$iv$iv":Ljava/lang/Object;
    :cond_5
    nop

    .end local v13    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v14    # "destination$iv$iv":Ljava/util/Collection;
    .end local v15    # "$i$f$mapTo":I
    move-object v2, v14

    check-cast v2, Ljava/util/List;

    .line 393
    nop

    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v12    # "$i$f$map":I
    check-cast v2, Ljava/lang/Iterable;

    .line 60
    new-instance v0, Lcom/pymcl/core/loader/LoaderInstaller$forgeVersions$$inlined$compareByDescending$1;

    invoke-direct {v0, v1}, Lcom/pymcl/core/loader/LoaderInstaller$forgeVersions$$inlined$compareByDescending$1;-><init>(Lcom/pymcl/core/loader/LoaderInstaller;)V

    check-cast v0, Ljava/util/Comparator;

    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    .line 59
    return-object v0
.end method

.method public final getJavaRunner()Lcom/pymcl/core/loader/JavaProcessRunner;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/pymcl/core/loader/LoaderInstaller;->javaRunner:Lcom/pymcl/core/loader/JavaProcessRunner;

    return-object v0
.end method

.method public final installFabricLike(Lcom/pymcl/core/version/GameDirs;Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 17
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "type"    # Lcom/pymcl/core/loader/LoaderType;
    .param p3, "mc"    # Ljava/lang/String;
    .param p4, "loader"    # Ljava/lang/String;
    .param p5, "versionId"    # Ljava/lang/String;
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/GameDirs;",
            "Lcom/pymcl/core/loader/LoaderType;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    instance-of v2, v1, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;

    iget v3, v2, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v3, v2, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->label:I

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;

    invoke-direct {v2, v0, v1}, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;-><init>(Lcom/pymcl/core/loader/LoaderInstaller;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v2

    .local v7, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v2, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->result:Ljava/lang/Object;

    .local v2, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v11

    .line 73
    iget v3, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->label:I

    packed-switch v3, :pswitch_data_0

    move-object/from16 v16, v2

    .end local v2    # "$result":Ljava/lang/Object;
    .end local v7    # "$continuation":Lkotlin/coroutines/Continuation;
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .restart local v2    # "$result":Ljava/lang/Object;
    .restart local v7    # "$continuation":Lkotlin/coroutines/Continuation;
    :pswitch_0
    iget-object v3, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$7:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .local v3, "id":Ljava/lang/String;
    iget-object v4, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$6:Ljava/lang/Object;

    check-cast v4, Ljava/util/Map;

    .local v4, "prof":Ljava/util/Map;
    iget-object v5, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$5:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .local v5, "url":Ljava/lang/String;
    iget-object v6, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    .end local p5    # "versionId":Ljava/lang/String;
    .local v6, "versionId":Ljava/lang/String;
    iget-object v8, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .end local p4    # "loader":Ljava/lang/String;
    .local v8, "loader":Ljava/lang/String;
    iget-object v9, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    .end local p3    # "mc":Ljava/lang/String;
    .local v9, "mc":Ljava/lang/String;
    iget-object v10, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$1:Ljava/lang/Object;

    check-cast v10, Lcom/pymcl/core/loader/LoaderType;

    .end local p2    # "type":Lcom/pymcl/core/loader/LoaderType;
    .local v10, "type":Lcom/pymcl/core/loader/LoaderType;
    iget-object v11, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v11, "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v16, v2

    move-object v13, v8

    move-object v8, v7

    goto/16 :goto_4

    .end local v3    # "id":Ljava/lang/String;
    .end local v4    # "prof":Ljava/util/Map;
    .end local v5    # "url":Ljava/lang/String;
    .end local v6    # "versionId":Ljava/lang/String;
    .end local v8    # "loader":Ljava/lang/String;
    .end local v9    # "mc":Ljava/lang/String;
    .end local v10    # "type":Lcom/pymcl/core/loader/LoaderType;
    .end local v11    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "type":Lcom/pymcl/core/loader/LoaderType;
    .restart local p3    # "mc":Ljava/lang/String;
    .restart local p4    # "loader":Ljava/lang/String;
    .restart local p5    # "versionId":Ljava/lang/String;
    :pswitch_1
    iget-object v3, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$4:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .end local p5    # "versionId":Ljava/lang/String;
    .local v3, "versionId":Ljava/lang/String;
    iget-object v4, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    .end local p4    # "loader":Ljava/lang/String;
    .local v4, "loader":Ljava/lang/String;
    iget-object v5, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .end local p3    # "mc":Ljava/lang/String;
    .local v5, "mc":Ljava/lang/String;
    iget-object v6, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/pymcl/core/loader/LoaderType;

    .end local p2    # "type":Lcom/pymcl/core/loader/LoaderType;
    .local v6, "type":Lcom/pymcl/core/loader/LoaderType;
    iget-object v8, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v8, "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v14, v3

    move-object v13, v4

    move-object v10, v5

    move-object v12, v6

    move-object v4, v8

    move-object v8, v7

    goto :goto_1

    .end local v3    # "versionId":Ljava/lang/String;
    .end local v4    # "loader":Ljava/lang/String;
    .end local v5    # "mc":Ljava/lang/String;
    .end local v6    # "type":Lcom/pymcl/core/loader/LoaderType;
    .end local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "type":Lcom/pymcl/core/loader/LoaderType;
    .restart local p3    # "mc":Ljava/lang/String;
    .restart local p4    # "loader":Ljava/lang/String;
    .restart local p5    # "versionId":Ljava/lang/String;
    :pswitch_2
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    iget-object v3, v0, Lcom/pymcl/core/loader/LoaderInstaller;->game:Lcom/pymcl/core/version/GameInstaller;

    move-object/from16 v4, p1

    iput-object v4, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$0:Ljava/lang/Object;

    move-object/from16 v12, p2

    iput-object v12, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$1:Ljava/lang/Object;

    move-object/from16 v5, p3

    iput-object v5, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$2:Ljava/lang/Object;

    move-object/from16 v13, p4

    iput-object v13, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$3:Ljava/lang/Object;

    move-object/from16 v14, p5

    iput-object v14, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$4:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->label:I

    move-object v8, v7

    .end local v7    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v8, "$continuation":Lkotlin/coroutines/Continuation;
    const/4 v7, 0x0

    const/16 v9, 0x8

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lcom/pymcl/core/version/GameInstaller;->installVanilla$default(Lcom/pymcl/core/version/GameInstaller;Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;ZLcom/pymcl/core/version/ManifestEntry;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v11, :cond_1

    .line 73
    return-object v11

    .line 74
    :cond_1
    move-object/from16 v4, p1

    move-object/from16 v10, p3

    .line 75
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "type":Lcom/pymcl/core/loader/LoaderType;
    .end local p3    # "mc":Ljava/lang/String;
    .end local p4    # "loader":Ljava/lang/String;
    .end local p5    # "versionId":Ljava/lang/String;
    .local v4, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v10, "mc":Ljava/lang/String;
    .local v12, "type":Lcom/pymcl/core/loader/LoaderType;
    .local v13, "loader":Ljava/lang/String;
    .local v14, "versionId":Ljava/lang/String;
    :goto_1
    sget-object v3, Lcom/pymcl/core/loader/LoaderType;->FABRIC:Lcom/pymcl/core/loader/LoaderType;

    const-string v5, "/profile/json"

    const-string v6, "/"

    if-ne v12, v3, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "https://meta.fabricmc.net/v2/versions/loader/"

    goto :goto_2

    :cond_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "https://meta.quiltmc.org/v3/versions/loader/"

    :goto_2
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v15, v3

    .line 76
    .local v15, "url":Ljava/lang/String;
    sget-object v3, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-direct {v0, v15}, Lcom/pymcl/core/loader/LoaderInstaller;->getText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 77
    .local v3, "prof":Ljava/util/Map;
    const-string v5, "id"

    if-nez v14, :cond_3

    invoke-static {v3, v5}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    move-object v7, v14

    .line 78
    .local v7, "id":Ljava/lang/String;
    :goto_3
    invoke-interface {v3, v5, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    sget-object v5, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    new-instance v9, Ljava/io/File;

    invoke-virtual {v4}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v1

    move-object/from16 v16, v2

    .end local v2    # "$result":Ljava/lang/Object;
    .local v16, "$result":Ljava/lang/Object;
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v6, ".json"

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v9, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5, v9, v3}, Lcom/pymcl/core/util/FileUtil;->writeJson(Ljava/io/File;Ljava/lang/Object;)Z

    .line 80
    move-object v1, v3

    .end local v3    # "prof":Ljava/util/Map;
    .local v1, "prof":Ljava/util/Map;
    iget-object v3, v0, Lcom/pymcl/core/loader/LoaderInstaller;->game:Lcom/pymcl/core/version/GameInstaller;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v8, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$0:Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v8, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$1:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v8, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$2:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v8, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$3:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v8, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$4:Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v8, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$5:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v8, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$6:Ljava/lang/Object;

    iput-object v7, v8, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->L$7:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, v8, Lcom/pymcl/core/loader/LoaderInstaller$installFabricLike$1;->label:I

    const/4 v6, 0x0

    move-object v5, v7

    move-object v7, v8

    .end local v8    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v5, "id":Ljava/lang/String;
    .local v7, "$continuation":Lkotlin/coroutines/Continuation;
    const/4 v8, 0x4

    const/4 v9, 0x0

    invoke-static/range {v3 .. v9}, Lcom/pymcl/core/version/GameInstaller;->completeFiles$default(Lcom/pymcl/core/version/GameInstaller;Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v7

    .end local v7    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v8    # "$continuation":Lkotlin/coroutines/Continuation;
    if-ne v2, v11, :cond_4

    .line 73
    return-object v11

    .line 80
    :cond_4
    move-object v11, v4

    move-object v3, v5

    move-object v9, v10

    move-object v10, v12

    move-object v6, v14

    move-object v5, v15

    move-object v4, v1

    .line 81
    .end local v1    # "prof":Ljava/util/Map;
    .end local v12    # "type":Lcom/pymcl/core/loader/LoaderType;
    .end local v14    # "versionId":Ljava/lang/String;
    .end local v15    # "url":Ljava/lang/String;
    .local v3, "id":Ljava/lang/String;
    .local v4, "prof":Ljava/util/Map;
    .local v5, "url":Ljava/lang/String;
    .local v6, "versionId":Ljava/lang/String;
    .restart local v9    # "mc":Ljava/lang/String;
    .local v10, "type":Lcom/pymcl/core/loader/LoaderType;
    .restart local v11    # "dirs":Lcom/pymcl/core/version/GameDirs;
    :goto_4
    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final installForge(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "forge"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/GameDirs;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 96
    invoke-virtual {p0, p2, p3}, Lcom/pymcl/core/loader/LoaderInstaller;->forgeInstallerUrls(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "forge-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-installer.jar"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p4

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p4    # "$completion":Lkotlin/coroutines/Continuation;
    .local v1, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v2, "mc":Ljava/lang/String;
    .local v6, "$completion":Lkotlin/coroutines/Continuation;
    invoke-direct/range {v0 .. v6}, Lcom/pymcl/core/loader/LoaderInstaller;->installWithInstaller(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final installFromInstaller(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 16
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "installer"    # Ljava/io/File;
    .param p4, "forge"    # Z
    .param p5, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/GameDirs;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v8, p4

    move-object/from16 v9, p5

    instance-of v0, v9, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;

    if-eqz v0, :cond_0

    move-object v0, v9

    check-cast v0, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;

    iget v2, v0, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->label:I

    sub-int/2addr v2, v3

    iput v2, v0, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;

    invoke-direct {v0, v1, v9}, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;-><init>(Lcom/pymcl/core/loader/LoaderInstaller;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v7, v0

    .local v7, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v10, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->result:Ljava/lang/Object;

    .local v10, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 107
    iget v2, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->label:I

    packed-switch v2, :pswitch_data_0

    .end local v7    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v10    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v7    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v10    # "$result":Ljava/lang/Object;
    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    iget-boolean v2, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->Z$0:Z

    .end local p4    # "forge":Z
    .local v2, "forge":Z
    iget-object v3, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$5:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    .local v3, "prof":Ljava/util/Map;
    iget-object v4, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/util/zip/ZipFile;

    .local v4, "z":Ljava/util/zip/ZipFile;
    iget-object v5, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/io/Closeable;

    iget-object v6, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/io/File;

    .end local p3    # "installer":Ljava/io/File;
    .local v6, "installer":Ljava/io/File;
    iget-object v8, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .local v8, "mc":Ljava/lang/String;
    iget-object v12, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v12, "dirs":Lcom/pymcl/core/version/GameDirs;
    :try_start_0
    invoke-static {v10}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v11, v10

    goto/16 :goto_5

    .end local v0    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    .end local v2    # "forge":Z
    .end local v3    # "prof":Ljava/util/Map;
    .end local v4    # "z":Ljava/util/zip/ZipFile;
    .end local v6    # "installer":Ljava/io/File;
    .end local v8    # "mc":Ljava/lang/String;
    .end local v12    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p4    # "forge":Z
    :pswitch_1
    const/4 v0, 0x0

    .restart local v0    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    iget-boolean v2, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->Z$0:Z

    .end local p4    # "forge":Z
    .restart local v2    # "forge":Z
    iget-object v3, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$5:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    .restart local v3    # "prof":Ljava/util/Map;
    iget-object v4, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/util/zip/ZipFile;

    .restart local v4    # "z":Ljava/util/zip/ZipFile;
    iget-object v5, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/io/Closeable;

    iget-object v6, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/io/File;

    .end local p3    # "installer":Ljava/io/File;
    .restart local v6    # "installer":Ljava/io/File;
    iget-object v8, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$1:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .restart local v8    # "mc":Ljava/lang/String;
    iget-object v12, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local v12    # "dirs":Lcom/pymcl/core/version/GameDirs;
    :try_start_1
    invoke-static {v10}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v11, v5

    move-object v5, v4

    move-object v4, v6

    move-object v6, v3

    move-object v3, v10

    goto/16 :goto_3

    .end local v0    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    .end local v3    # "prof":Ljava/util/Map;
    .end local v4    # "z":Ljava/util/zip/ZipFile;
    :catchall_0
    move-exception v0

    move-object v3, v0

    move v1, v2

    move-object v4, v6

    move-object v2, v12

    goto/16 :goto_8

    .end local v2    # "forge":Z
    .end local v6    # "installer":Ljava/io/File;
    .end local v8    # "mc":Ljava/lang/String;
    .end local v12    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p4    # "forge":Z
    :pswitch_2
    invoke-static {v10}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance v2, Ljava/util/zip/ZipFile;

    move-object/from16 v4, p3

    invoke-direct {v2, v4}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    move-object v12, v2

    check-cast v12, Ljava/io/Closeable;

    :try_start_2
    move-object v5, v12

    check-cast v5, Ljava/util/zip/ZipFile;

    .local v5, "z":Ljava/util/zip/ZipFile;
    const/4 v13, 0x0

    .line 108
    .local v13, "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    const-string v2, "install_profile.json"

    invoke-virtual {v5, v2}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v2

    if-eqz v2, :cond_8

    .line 404
    .local v2, "it":Ljava/util/zip/ZipEntry;
    const/4 v6, 0x0

    .line 108
    .local v6, "$i$a$-let-LoaderInstaller$installFromInstaller$2$prof$1":I
    sget-object v14, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v5, v2}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v15

    const-string v11, "getInputStream(...)"

    invoke-static {v15, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v15}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v11

    sget-object v15, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v11, v15}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {v14, v3}, Lcom/pymcl/core/util/Json;->obj(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .end local v2    # "it":Ljava/util/zip/ZipEntry;
    .end local v6    # "$i$a$-let-LoaderInstaller$installFromInstaller$2$prof$1":I
    if-eqz v3, :cond_8

    move-object v6, v3

    .line 109
    .local v6, "prof":Ljava/util/Map;
    nop

    .line 110
    const-string v2, "versionInfo"

    invoke-static {v6, v2}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    const-string v3, "processors"

    if-eqz v2, :cond_4

    :try_start_3
    invoke-static {v6, v3}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    const/4 v11, 0x1

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    move v2, v11

    :goto_2
    if-eqz v2, :cond_4

    invoke-static/range {p1 .. p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$0:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$1:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$2:Ljava/lang/Object;

    iput-object v12, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$3:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$4:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$5:Ljava/lang/Object;

    iput-boolean v8, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->Z$0:Z

    iput v11, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->label:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object/from16 v2, p1

    :try_start_4
    invoke-direct {v1, v2, v5, v6, v7}, Lcom/pymcl/core/loader/LoaderInstaller;->installLegacy(Lcom/pymcl/core/version/GameDirs;Ljava/util/zip/ZipFile;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-ne v3, v0, :cond_3

    .line 107
    return-object v0

    .line 110
    :cond_3
    move-object v11, v12

    move v0, v13

    move-object v12, v2

    move v2, v8

    move-object/from16 v8, p2

    .end local v13    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "installer":Ljava/io/File;
    .end local p4    # "forge":Z
    .restart local v0    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    .local v2, "forge":Z
    .local v4, "installer":Ljava/io/File;
    .restart local v8    # "mc":Ljava/lang/String;
    .restart local v12    # "dirs":Lcom/pymcl/core/version/GameDirs;
    :goto_3
    :try_start_5
    check-cast v3, Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    move v13, v0

    goto/16 :goto_6

    .line 107
    .end local v0    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    .end local v5    # "z":Ljava/util/zip/ZipFile;
    .end local v6    # "prof":Ljava/util/Map;
    :catchall_1
    move-exception v0

    move-object v3, v0

    move v1, v2

    move-object v5, v11

    move-object v2, v12

    goto/16 :goto_8

    .end local v2    # "forge":Z
    .end local v4    # "installer":Ljava/io/File;
    .end local v8    # "mc":Ljava/lang/String;
    .end local v12    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p4    # "forge":Z
    :catchall_2
    move-exception v0

    move-object/from16 v2, p1

    goto/16 :goto_7

    .line 110
    .restart local v5    # "z":Ljava/util/zip/ZipFile;
    .restart local v6    # "prof":Ljava/util/Map;
    .restart local v13    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    :cond_4
    move-object/from16 v2, p1

    .line 111
    :try_start_6
    invoke-static {v6, v3}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    if-nez v3, :cond_6

    :try_start_7
    const-string v3, "json"

    invoke-static {v6, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    goto :goto_4

    .line 112
    :cond_5
    invoke-direct/range {p0 .. p3}, Lcom/pymcl/core/loader/LoaderInstaller;->installViaOfficial(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;)Ljava/lang/String;

    move-result-object v3
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    move-object v11, v12

    move-object v12, v2

    move v2, v8

    move-object/from16 v8, p2

    goto :goto_6

    .line 107
    .end local v5    # "z":Ljava/util/zip/ZipFile;
    .end local v6    # "prof":Ljava/util/Map;
    .end local v13    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    :catchall_3
    move-exception v0

    goto :goto_7

    .line 111
    .restart local v5    # "z":Ljava/util/zip/ZipFile;
    .restart local v6    # "prof":Ljava/util/Map;
    .restart local v13    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    :cond_6
    :goto_4
    :try_start_8
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$0:Ljava/lang/Object;

    invoke-static/range {p2 .. p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$1:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$2:Ljava/lang/Object;

    iput-object v12, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$3:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$4:Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->L$5:Ljava/lang/Object;

    iput-boolean v8, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->Z$0:Z

    const/4 v3, 0x2

    iput v3, v7, Lcom/pymcl/core/loader/LoaderInstaller$installFromInstaller$1;->label:I

    move-object/from16 v3, p2

    invoke-direct/range {v1 .. v7}, Lcom/pymcl/core/loader/LoaderInstaller;->installModern(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;Ljava/util/zip/ZipFile;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    if-ne v11, v0, :cond_7

    .line 107
    return-object v0

    .line 111
    :cond_7
    move-object v4, v5

    move-object v3, v6

    move v2, v8

    move-object v5, v12

    move v0, v13

    move-object/from16 v12, p1

    move-object/from16 v8, p2

    move-object/from16 v6, p3

    .end local v5    # "z":Ljava/util/zip/ZipFile;
    .end local v13    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "installer":Ljava/io/File;
    .end local p4    # "forge":Z
    .restart local v0    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    .restart local v2    # "forge":Z
    .restart local v3    # "prof":Ljava/util/Map;
    .local v4, "z":Ljava/util/zip/ZipFile;
    .local v6, "installer":Ljava/io/File;
    .restart local v8    # "mc":Ljava/lang/String;
    .restart local v12    # "dirs":Lcom/pymcl/core/version/GameDirs;
    :goto_5
    :try_start_9
    move-object v1, v11

    check-cast v1, Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    move v13, v0

    move-object v11, v5

    move-object v5, v4

    move-object v4, v6

    move-object v6, v3

    move-object v3, v1

    .line 113
    .end local v0    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    .end local v3    # "prof":Ljava/util/Map;
    .local v4, "installer":Ljava/io/File;
    .restart local v5    # "z":Ljava/util/zip/ZipFile;
    .local v6, "prof":Ljava/util/Map;
    .restart local v13    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    :goto_6
    nop

    .line 107
    .end local v5    # "z":Ljava/util/zip/ZipFile;
    .end local v6    # "prof":Ljava/util/Map;
    .end local v13    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    const/4 v0, 0x0

    invoke-static {v11, v0}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 114
    return-object v3

    .line 108
    .end local v2    # "forge":Z
    .end local v4    # "installer":Ljava/io/File;
    .end local v8    # "mc":Ljava/lang/String;
    .end local v12    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local v5    # "z":Ljava/util/zip/ZipFile;
    .restart local v13    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p4    # "forge":Z
    :cond_8
    :try_start_a
    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    const-string v1, "installer \u7f3a\u5c11 install_profile.json"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .end local v7    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v10    # "$result":Ljava/lang/Object;
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "installer":Ljava/io/File;
    .end local p4    # "forge":Z
    .end local p5    # "$completion":Lkotlin/coroutines/Continuation;
    throw v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 107
    .end local v5    # "z":Ljava/util/zip/ZipFile;
    .end local v13    # "$i$a$-use-LoaderInstaller$installFromInstaller$2":I
    .restart local v7    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v10    # "$result":Ljava/lang/Object;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p4    # "forge":Z
    .restart local p5    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_4
    move-exception v0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    :goto_7
    move-object v3, v0

    move v1, v8

    move-object v5, v12

    move-object/from16 v8, p2

    .end local v7    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v10    # "$result":Ljava/lang/Object;
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "installer":Ljava/io/File;
    .end local p4    # "forge":Z
    .end local p5    # "$completion":Lkotlin/coroutines/Continuation;
    :goto_8
    :try_start_b
    throw v3
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .local v1, "forge":Z
    .local v2, "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local v4    # "installer":Ljava/io/File;
    .restart local v7    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v8    # "mc":Ljava/lang/String;
    .restart local v10    # "$result":Ljava/lang/Object;
    .restart local p5    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_5
    move-exception v0

    invoke-static {v5, v3}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final installLiteLoader(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 27
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "build"    # Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .param p5, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/GameDirs;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p2

    move-object/from16 v9, p3

    move-object/from16 v10, p5

    instance-of v1, v10, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;

    if-eqz v1, :cond_0

    move-object v1, v10

    check-cast v1, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;

    iget v2, v1, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v2, v4

    if-eqz v2, :cond_0

    iget v2, v1, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->label:I

    sub-int/2addr v2, v4

    iput v2, v1, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;

    invoke-direct {v1, v0, v10}, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;-><init>(Lcom/pymcl/core/loader/LoaderInstaller;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v6, v1

    .local v6, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v11, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->result:Ljava/lang/Object;

    .local v11, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v12

    .line 315
    iget v1, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->label:I

    const/4 v13, 0x2

    const/4 v15, 0x0

    const/4 v2, 0x1

    packed-switch v1, :pswitch_data_0

    .end local v6    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v11    # "$result":Ljava/lang/Object;
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .restart local v6    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v11    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v1, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$8:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .local v1, "id":Ljava/lang/String;
    iget-object v2, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$7:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    .local v2, "libs":Ljava/util/List;
    iget-object v4, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$6:Ljava/lang/Object;

    check-cast v4, Ljava/io/File;

    .local v4, "dst":Ljava/io/File;
    iget-object v5, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$5:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .local v5, "name":Ljava/lang/String;
    iget-object v7, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$4:Ljava/lang/Object;

    check-cast v7, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    .local v7, "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    iget-object v8, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$3:Ljava/lang/Object;

    check-cast v8, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    .end local p4    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v8, "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    iget-object v12, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$2:Ljava/lang/Object;

    move-object v9, v12

    check-cast v9, Ljava/lang/String;

    .end local p3    # "version":Ljava/lang/String;
    .local v9, "version":Ljava/lang/String;
    iget-object v12, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$1:Ljava/lang/Object;

    move-object v3, v12

    check-cast v3, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .local v3, "mc":Ljava/lang/String;
    iget-object v12, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$0:Ljava/lang/Object;

    check-cast v12, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v12, "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v11}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_d

    .end local v1    # "id":Ljava/lang/String;
    .end local v2    # "libs":Ljava/util/List;
    .end local v3    # "mc":Ljava/lang/String;
    .end local v4    # "dst":Ljava/io/File;
    .end local v5    # "name":Ljava/lang/String;
    .end local v7    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v8    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v9    # "version":Ljava/lang/String;
    .end local v12    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "version":Ljava/lang/String;
    .restart local p4    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    :pswitch_1
    iget-object v1, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$6:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    .local v1, "dst":Ljava/io/File;
    iget-object v4, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$5:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    .local v4, "name":Ljava/lang/String;
    iget-object v5, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$4:Ljava/lang/Object;

    check-cast v5, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    .local v5, "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    iget-object v7, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$3:Ljava/lang/Object;

    check-cast v7, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    .end local p4    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v7, "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    iget-object v8, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$2:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    .end local p3    # "version":Ljava/lang/String;
    .local v8, "version":Ljava/lang/String;
    iget-object v9, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$1:Ljava/lang/Object;

    move-object v3, v9

    check-cast v3, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .restart local v3    # "mc":Ljava/lang/String;
    iget-object v9, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$0:Ljava/lang/Object;

    check-cast v9, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v9, "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v11}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_6

    .end local v1    # "dst":Ljava/io/File;
    .end local v3    # "mc":Ljava/lang/String;
    .end local v4    # "name":Ljava/lang/String;
    .end local v5    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v7    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v8    # "version":Ljava/lang/String;
    .end local v9    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "version":Ljava/lang/String;
    .restart local p4    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    :pswitch_2
    iget-object v1, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    .local v1, "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    iget-object v4, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    .end local p4    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v4, "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    iget-object v5, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .end local p3    # "version":Ljava/lang/String;
    .local v5, "version":Ljava/lang/String;
    iget-object v7, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$1:Ljava/lang/Object;

    move-object v3, v7

    check-cast v3, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .restart local v3    # "mc":Ljava/lang/String;
    iget-object v7, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v7, "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v11}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v2, v1

    move-object v9, v3

    move-object/from16 v16, v4

    move-object v14, v5

    move-object v1, v7

    goto/16 :goto_3

    .end local v1    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v3    # "mc":Ljava/lang/String;
    .end local v4    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v5    # "version":Ljava/lang/String;
    .end local v7    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "version":Ljava/lang/String;
    .restart local p4    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    :pswitch_3
    invoke-static {v11}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 316
    const-string v1, "1.13"

    invoke-static {v3, v1}, Lcom/pymcl/core/loader/LoadersKt;->compareMc(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    if-gez v1, :cond_16

    .line 317
    if-nez p4, :cond_4

    invoke-virtual {v0, v3}, Lcom/pymcl/core/loader/LoaderInstaller;->liteloaderBuilds(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$firstOrNull$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 511
    .local v4, "$i$f$firstOrNull":I
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element$iv":Ljava/lang/Object;
    move-object v8, v7

    check-cast v8, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    .local v8, "it":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    const/16 v16, 0x0

    .line 317
    .local v16, "$i$a$-firstOrNull-LoaderInstaller$installLiteLoader$b$1":I
    invoke-virtual {v8}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getVersion()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    .line 511
    .end local v8    # "it":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v16    # "$i$a$-firstOrNull-LoaderInstaller$installLiteLoader$b$1":I
    if-eqz v8, :cond_1

    goto :goto_1

    .line 512
    .end local v7    # "element$iv":Ljava/lang/Object;
    :cond_2
    move-object v7, v15

    .line 317
    .end local v1    # "$this$firstOrNull$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$firstOrNull":I
    :goto_1
    check-cast v7, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    if-eqz v7, :cond_3

    goto :goto_2

    :cond_3
    new-instance v1, Lcom/pymcl/core/loader/InstallError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u627e\u4e0d\u5230 LiteLoader "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "\uff08"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v4, "\uff09"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v15, v13, v15}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1

    :cond_4
    move-object/from16 v7, p4

    :goto_2
    move-object v14, v7

    .line 318
    .local v14, "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    iget-object v1, v0, Lcom/pymcl/core/loader/LoaderInstaller;->game:Lcom/pymcl/core/version/GameInstaller;

    move-object/from16 v4, p1

    iput-object v4, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$0:Ljava/lang/Object;

    iput-object v3, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$1:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$2:Ljava/lang/Object;

    invoke-static/range {p4 .. p4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$3:Ljava/lang/Object;

    iput-object v14, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$4:Ljava/lang/Object;

    iput v2, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->label:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/16 v7, 0x8

    const/4 v8, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v1 .. v8}, Lcom/pymcl/core/version/GameInstaller;->installVanilla$default(Lcom/pymcl/core/version/GameInstaller;Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;ZLcom/pymcl/core/version/ManifestEntry;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v12, :cond_5

    .line 315
    return-object v12

    .line 318
    :cond_5
    move-object/from16 v1, p1

    move-object/from16 v16, p4

    move-object v2, v14

    move-object v14, v9

    move-object/from16 v9, p2

    .line 319
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "version":Ljava/lang/String;
    .end local p4    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v1, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v2, "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v9, "mc":Ljava/lang/String;
    .local v14, "version":Ljava/lang/String;
    .local v16, "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    :goto_3
    invoke-virtual {v2}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getVersion()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "com.mumfrey:liteloader:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 320
    .local v3, "name":Ljava/lang/String;
    new-instance v4, Ljava/io/File;

    invoke-virtual {v1}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v5

    sget-object v7, Lcom/pymcl/core/version/Maven;->INSTANCE:Lcom/pymcl/core/version/Maven;

    invoke-virtual {v7, v3}, Lcom/pymcl/core/version/Maven;->path(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v5, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 321
    .local v4, "dst":Ljava/io/File;
    invoke-direct {v0, v4}, Lcom/pymcl/core/loader/LoaderInstaller;->isZip(Ljava/io/File;)Z

    move-result v5

    if-nez v5, :cond_a

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    iget-object v5, v0, Lcom/pymcl/core/loader/LoaderInstaller;->dm:Lcom/pymcl/core/download/DownloadManager;

    invoke-virtual {v2}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getVersion()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "LiteLoader "

    invoke-virtual {v8, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v2}, Lcom/pymcl/core/loader/LoaderInstaller;->liteloaderUrls(Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;)Ljava/util/List;

    move-result-object v20

    invoke-virtual {v2}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getMd5()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_7

    .line 506
    move-object v15, v8

    .local v15, "it":Ljava/lang/String;
    const/16 v19, 0x0

    .line 321
    .local v19, "$i$a$-takeIf-LoaderInstaller$installLiteLoader$2":I
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v13

    move-object/from16 v21, v4

    .end local v4    # "dst":Ljava/io/File;
    .local v21, "dst":Ljava/io/File;
    const/16 v4, 0x20

    if-ne v13, v4, :cond_6

    const/4 v4, 0x1

    goto :goto_4

    :cond_6
    const/4 v4, 0x0

    .end local v15    # "it":Ljava/lang/String;
    .end local v19    # "$i$a$-takeIf-LoaderInstaller$installLiteLoader$2":I
    :goto_4
    if-eqz v4, :cond_8

    move-object/from16 v22, v8

    goto :goto_5

    .end local v21    # "dst":Ljava/io/File;
    .restart local v4    # "dst":Ljava/io/File;
    :cond_7
    move-object/from16 v21, v4

    .end local v4    # "dst":Ljava/io/File;
    .restart local v21    # "dst":Ljava/io/File;
    :cond_8
    const/16 v22, 0x0

    :goto_5
    new-instance v19, Lcom/pymcl/core/download/DownloadItem;

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x18

    const/16 v26, 0x0

    invoke-direct/range {v19 .. v26}, Lcom/pymcl/core/download/DownloadItem;-><init>(Ljava/util/List;Ljava/io/File;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v19 .. v19}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    iput-object v1, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$0:Ljava/lang/Object;

    iput-object v9, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$1:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$2:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$3:Ljava/lang/Object;

    iput-object v2, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$4:Ljava/lang/Object;

    iput-object v3, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$5:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$6:Ljava/lang/Object;

    const/4 v8, 0x2

    iput v8, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->label:I

    move-object v8, v2

    move-object v2, v5

    .end local v2    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v8, "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    const/4 v5, 0x0

    move-object v13, v3

    move-object v3, v7

    .end local v3    # "name":Ljava/lang/String;
    .local v13, "name":Ljava/lang/String;
    const/4 v7, 0x4

    move-object v15, v8

    .end local v8    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v15, "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    const/4 v8, 0x0

    invoke-static/range {v2 .. v8}, Lcom/pymcl/core/download/DownloadManager;->downloadAll$default(Lcom/pymcl/core/download/DownloadManager;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v12, :cond_9

    .line 315
    return-object v12

    .line 321
    :cond_9
    move-object v3, v9

    move-object v4, v13

    move-object v8, v14

    move-object v5, v15

    move-object/from16 v7, v16

    move-object v9, v1

    move-object/from16 v1, v21

    .line 322
    .end local v13    # "name":Ljava/lang/String;
    .end local v14    # "version":Ljava/lang/String;
    .end local v15    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v16    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v21    # "dst":Ljava/io/File;
    .local v1, "dst":Ljava/io/File;
    .local v3, "mc":Ljava/lang/String;
    .local v4, "name":Ljava/lang/String;
    .local v5, "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v7, "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v8, "version":Ljava/lang/String;
    .local v9, "dirs":Lcom/pymcl/core/version/GameDirs;
    :goto_6
    move-object/from16 v21, v1

    move-object v13, v4

    move-object v1, v9

    move-object v9, v8

    move-object v8, v7

    move-object v7, v5

    goto :goto_7

    .line 321
    .end local v5    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v7    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v8    # "version":Ljava/lang/String;
    .local v1, "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local v2    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v3, "name":Ljava/lang/String;
    .local v4, "dst":Ljava/io/File;
    .local v9, "mc":Ljava/lang/String;
    .restart local v14    # "version":Ljava/lang/String;
    .restart local v16    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    :cond_a
    move-object v15, v2

    move-object v13, v3

    move-object/from16 v21, v4

    .end local v2    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v3    # "name":Ljava/lang/String;
    .end local v4    # "dst":Ljava/io/File;
    .restart local v13    # "name":Ljava/lang/String;
    .restart local v15    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .restart local v21    # "dst":Ljava/io/File;
    move-object v3, v9

    move-object v9, v14

    move-object v7, v15

    move-object/from16 v8, v16

    .line 322
    .end local v14    # "version":Ljava/lang/String;
    .end local v15    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v16    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v3, "mc":Ljava/lang/String;
    .local v7, "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v8, "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v9, "version":Ljava/lang/String;
    :goto_7
    invoke-direct {v0, v13, v1}, Lcom/pymcl/core/loader/LoaderInstaller;->localLib(Ljava/lang/String;Lcom/pymcl/core/version/GameDirs;)Ljava/util/Map;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->mutableListOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    .line 323
    .local v4, "libs":Ljava/util/List;
    invoke-virtual {v7}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getLibraries()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v14, "net.minecraft:launchwrapper:"

    const-string v15, "name"

    if-eqz v5, :cond_e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    .local v5, "l":Ljava/util/Map;
    invoke-static {v5, v15}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    if-nez v16, :cond_b

    goto :goto_8

    :cond_b
    move-object/from16 p1, v16

    .line 324
    .local p1, "n":Ljava/lang/String;
    move-object v0, v4

    check-cast v0, Ljava/util/Collection;

    move-object/from16 v16, v1

    move-object/from16 p2, v4

    move-object/from16 p3, v7

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object/from16 v1, p1

    move-object/from16 p1, v2

    const/4 v2, 0x2

    .end local v4    # "libs":Ljava/util/List;
    .end local v7    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local p1    # "n":Ljava/lang/String;
    .local v1, "n":Ljava/lang/String;
    .local v16, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local p2, "libs":Ljava/util/List;
    .local p3, "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    invoke-static {v1, v14, v4, v2, v7}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_c

    const/4 v7, 0x1

    new-array v2, v7, [Lkotlin/Pair;

    invoke-static {v15, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    aput-object v14, v2, v4

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    goto :goto_9

    :cond_c
    const/4 v7, 0x1

    new-array v2, v7, [Lkotlin/Pair;

    invoke-static {v15, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v14

    aput-object v14, v2, v4

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v2

    move-object v4, v2

    .line 506
    .local v4, "o":Ljava/util/Map;
    const/4 v14, 0x0

    .line 324
    .local v14, "$i$a$-also-LoaderInstaller$installLiteLoader$3":I
    const-string v15, "url"

    invoke-static {v5, v15}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    if-eqz v18, :cond_d

    move-object/from16 p4, v18

    .line 506
    .local p4, "it":Ljava/lang/String;
    const/16 v18, 0x0

    .line 324
    .local v18, "$i$a$-let-LoaderInstaller$installLiteLoader$3$1":I
    move-object/from16 v7, p4

    .end local p4    # "it":Ljava/lang/String;
    .local v7, "it":Ljava/lang/String;
    invoke-interface {v4, v15, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .end local v4    # "o":Ljava/util/Map;
    .end local v7    # "it":Ljava/lang/String;
    .end local v14    # "$i$a$-also-LoaderInstaller$installLiteLoader$3":I
    .end local v18    # "$i$a$-let-LoaderInstaller$installLiteLoader$3$1":I
    :cond_d
    :goto_9
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    move-object/from16 v7, p3

    move-object/from16 v1, v16

    goto :goto_8

    .line 325
    .end local v5    # "l":Ljava/util/Map;
    .end local v16    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "libs":Ljava/util/List;
    .end local p3    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v1, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v4, "libs":Ljava/util/List;
    .local v7, "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    :cond_e
    move-object/from16 v16, v1

    move-object/from16 p2, v4

    move-object/from16 p3, v7

    .end local v1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v4    # "libs":Ljava/util/List;
    .end local v7    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .restart local v16    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "libs":Ljava/util/List;
    .restart local p3    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    move-object/from16 v0, p2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$none$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 513
    .local v1, "$i$f$none":I
    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_f

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_f

    const/4 v2, 0x1

    goto :goto_c

    .line 514
    :cond_f
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    .local v5, "it":Ljava/lang/Object;
    const/4 v7, 0x0

    .line 325
    .local v7, "$i$a$-none-LoaderInstaller$installLiteLoader$4":I
    move-object/from16 p1, v0

    .end local v0    # "$this$none$iv":Ljava/lang/Iterable;
    .local p1, "$this$none$iv":Ljava/lang/Iterable;
    invoke-static {v5}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0, v15}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_10

    move/from16 p4, v1

    move-object/from16 v18, v2

    move-object/from16 v20, v4

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v4, 0x0

    .end local v1    # "$i$f$none":I
    .end local v4    # "element$iv":Ljava/lang/Object;
    .local v20, "element$iv":Ljava/lang/Object;
    .local p4, "$i$f$none":I
    invoke-static {v0, v14, v2, v1, v4}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_11

    const/4 v2, 0x1

    goto :goto_b

    .end local v20    # "element$iv":Ljava/lang/Object;
    .end local p4    # "$i$f$none":I
    .restart local v1    # "$i$f$none":I
    .restart local v4    # "element$iv":Ljava/lang/Object;
    :cond_10
    move/from16 p4, v1

    move-object/from16 v18, v2

    move-object/from16 v20, v4

    .end local v1    # "$i$f$none":I
    .end local v4    # "element$iv":Ljava/lang/Object;
    .restart local v20    # "element$iv":Ljava/lang/Object;
    .restart local p4    # "$i$f$none":I
    :cond_11
    const/4 v2, 0x0

    .line 514
    .end local v5    # "it":Ljava/lang/Object;
    .end local v7    # "$i$a$-none-LoaderInstaller$installLiteLoader$4":I
    :goto_b
    if-eqz v2, :cond_12

    const/4 v2, 0x0

    goto :goto_c

    :cond_12
    move-object/from16 v0, p1

    move/from16 v1, p4

    move-object/from16 v2, v18

    goto :goto_a

    .line 515
    .end local v20    # "element$iv":Ljava/lang/Object;
    .end local p1    # "$this$none$iv":Ljava/lang/Iterable;
    .end local p4    # "$i$f$none":I
    .restart local v0    # "$this$none$iv":Ljava/lang/Iterable;
    .restart local v1    # "$i$f$none":I
    :cond_13
    move-object/from16 p1, v0

    move/from16 p4, v1

    .end local v0    # "$this$none$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$none":I
    .restart local p1    # "$this$none$iv":Ljava/lang/Iterable;
    .restart local p4    # "$i$f$none":I
    const/4 v2, 0x1

    .line 325
    .end local p1    # "$this$none$iv":Ljava/lang/Iterable;
    .end local p4    # "$i$f$none":I
    :goto_c
    if-eqz v2, :cond_14

    move-object/from16 v0, p2

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x1

    new-array v2, v1, [Lkotlin/Pair;

    const-string v1, "net.minecraft:launchwrapper:1.12"

    invoke-static {v15, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    const/16 v17, 0x0

    aput-object v1, v2, v17

    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 326
    :cond_14
    invoke-virtual/range {p3 .. p3}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getVersion()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-LiteLoader_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 327
    .local v2, "id":Ljava/lang/String;
    invoke-virtual/range {p3 .. p3}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getTweakClass()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, p0

    move-object/from16 v4, p2

    move-object/from16 v1, v16

    .end local v16    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "libs":Ljava/util/List;
    .local v1, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v4, "libs":Ljava/util/List;
    invoke-direct/range {v0 .. v5}, Lcom/pymcl/core/loader/LoaderInstaller;->writeTweakVersion(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 328
    iget-object v5, v0, Lcom/pymcl/core/loader/LoaderInstaller;->game:Lcom/pymcl/core/version/GameInstaller;

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$0:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$1:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$2:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$3:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$4:Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$5:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$6:Ljava/lang/Object;

    invoke-static {v4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$7:Ljava/lang/Object;

    iput-object v2, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->L$8:Ljava/lang/Object;

    const/4 v7, 0x3

    iput v7, v6, Lcom/pymcl/core/loader/LoaderInstaller$installLiteLoader$1;->label:I

    const/4 v7, 0x1

    invoke-virtual {v5, v1, v2, v7, v6}, Lcom/pymcl/core/version/GameInstaller;->completeFiles(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v12, :cond_15

    .line 315
    return-object v12

    .line 328
    :cond_15
    move-object/from16 v7, p3

    move-object v12, v1

    move-object v1, v2

    move-object v2, v4

    move-object v5, v13

    move-object/from16 v4, v21

    .line 329
    .end local v13    # "name":Ljava/lang/String;
    .end local v21    # "dst":Ljava/io/File;
    .end local p3    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .local v1, "id":Ljava/lang/String;
    .local v2, "libs":Ljava/util/List;
    .local v4, "dst":Ljava/io/File;
    .local v5, "name":Ljava/lang/String;
    .local v7, "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .restart local v12    # "dirs":Lcom/pymcl/core/version/GameDirs;
    :goto_d
    return-object v1

    .line 316
    .end local v1    # "id":Ljava/lang/String;
    .end local v2    # "libs":Ljava/util/List;
    .end local v3    # "mc":Ljava/lang/String;
    .end local v4    # "dst":Ljava/io/File;
    .end local v5    # "name":Ljava/lang/String;
    .end local v7    # "b":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v8    # "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v9    # "version":Ljava/lang/String;
    .end local v12    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local p1, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local p2, "mc":Ljava/lang/String;
    .local p3, "version":Ljava/lang/String;
    .local p4, "build":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    :cond_16
    new-instance v1, Lcom/pymcl/core/loader/InstallError;

    const-string v2, "LiteLoader \u53ea\u652f\u6301 1.12.2 \u53ca\u66f4\u65e9\u7248\u672c"

    const/4 v4, 0x0

    const/4 v8, 0x2

    invoke-direct {v1, v2, v4, v8, v4}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final installNeoForge(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/GameDirs;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 97
    invoke-virtual {p0, p3}, Lcom/pymcl/core/loader/LoaderInstaller;->neoforgeInstallerUrls(Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "neoforge-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-installer.jar"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v6, p4

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p4    # "$completion":Lkotlin/coroutines/Continuation;
    .local v1, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v2, "mc":Ljava/lang/String;
    .local v6, "$completion":Lkotlin/coroutines/Continuation;
    invoke-direct/range {v0 .. v6}, Lcom/pymcl/core/loader/LoaderInstaller;->installWithInstaller(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final installOptiFine(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 44
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "edition"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/GameDirs;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v7, p4

    instance-of v0, v7, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;

    if-eqz v0, :cond_0

    move-object v0, v7

    check-cast v0, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;

    iget v2, v0, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->label:I

    sub-int/2addr v2, v3

    iput v2, v0, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;

    invoke-direct {v0, v1, v7}, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;-><init>(Lcom/pymcl/core/loader/LoaderInstaller;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v13, v0

    .local v13, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v2, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->result:Ljava/lang/Object;

    .local v2, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 238
    iget v3, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->label:I

    const/4 v4, 0x1

    const/4 v5, 0x2

    packed-switch v3, :pswitch_data_0

    move-object/from16 v29, v2

    .end local v2    # "$result":Ljava/lang/Object;
    .end local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v2    # "$result":Ljava/lang/Object;
    .restart local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    :pswitch_0
    iget-object v0, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$8:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    .local v0, "libs":Ljava/util/List;
    iget-object v3, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$7:Ljava/lang/Object;

    check-cast v3, Ljava/io/File;

    .local v3, "libFile":Ljava/io/File;
    iget-object v4, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$6:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    .local v4, "libName":Ljava/lang/String;
    iget-object v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$5:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .local v5, "id":Ljava/lang/String;
    iget-object v6, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$4:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    .local v6, "ed":Ljava/lang/String;
    iget-object v8, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/io/File;

    .local v8, "inst":Ljava/io/File;
    iget-object v9, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$2:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    .end local p3    # "edition":Ljava/lang/String;
    .local v9, "edition":Ljava/lang/String;
    iget-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .local v10, "mc":Ljava/lang/String;
    iget-object v11, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v11, "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v29, v2

    goto/16 :goto_6

    .end local v0    # "libs":Ljava/util/List;
    .end local v3    # "libFile":Ljava/io/File;
    .end local v4    # "libName":Ljava/lang/String;
    .end local v5    # "id":Ljava/lang/String;
    .end local v6    # "ed":Ljava/lang/String;
    .end local v8    # "inst":Ljava/io/File;
    .end local v9    # "edition":Ljava/lang/String;
    .end local v10    # "mc":Ljava/lang/String;
    .end local v11    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "edition":Ljava/lang/String;
    :pswitch_1
    iget-object v3, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .end local p3    # "edition":Ljava/lang/String;
    .local v3, "edition":Ljava/lang/String;
    iget-object v6, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .local v6, "mc":Ljava/lang/String;
    iget-object v8, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v8, "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v9, v2

    move-object v10, v3

    goto :goto_2

    .end local v3    # "edition":Ljava/lang/String;
    .end local v6    # "mc":Ljava/lang/String;
    .end local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "edition":Ljava/lang/String;
    :pswitch_2
    iget-object v3, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .end local p3    # "edition":Ljava/lang/String;
    .restart local v3    # "edition":Ljava/lang/String;
    iget-object v6, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .restart local v6    # "mc":Ljava/lang/String;
    iget-object v8, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/pymcl/core/version/GameDirs;

    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    .end local v3    # "edition":Ljava/lang/String;
    .end local v6    # "mc":Ljava/lang/String;
    .end local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "edition":Ljava/lang/String;
    :pswitch_3
    invoke-static {v2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 239
    iget-object v8, v1, Lcom/pymcl/core/loader/LoaderInstaller;->game:Lcom/pymcl/core/version/GameInstaller;

    move-object/from16 v9, p1

    iput-object v9, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$0:Ljava/lang/Object;

    move-object/from16 v10, p2

    iput-object v10, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$1:Ljava/lang/Object;

    move-object/from16 v3, p3

    iput-object v3, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$2:Ljava/lang/Object;

    iput v4, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->label:I

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/16 v14, 0x8

    const/4 v15, 0x0

    invoke-static/range {v8 .. v15}, Lcom/pymcl/core/version/GameInstaller;->installVanilla$default(Lcom/pymcl/core/version/GameInstaller;Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;ZLcom/pymcl/core/version/ManifestEntry;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_1

    .line 238
    return-object v0

    .line 239
    :cond_1
    move-object/from16 v8, p1

    move-object/from16 v6, p2

    .line 240
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "edition":Ljava/lang/String;
    .restart local v3    # "edition":Ljava/lang/String;
    .restart local v6    # "mc":Ljava/lang/String;
    .restart local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    :goto_1
    iput-object v8, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$0:Ljava/lang/Object;

    iput-object v6, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$1:Ljava/lang/Object;

    iput-object v3, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$2:Ljava/lang/Object;

    iput v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->label:I

    invoke-direct {v1, v6, v3, v13}, Lcom/pymcl/core/loader/LoaderInstaller;->downloadOptiFine(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v0, :cond_2

    .line 238
    return-object v0

    .line 240
    :cond_2
    move-object v10, v3

    .line 238
    .end local v3    # "edition":Ljava/lang/String;
    .local v10, "edition":Ljava/lang/String;
    :goto_2
    move-object v14, v9

    check-cast v14, Ljava/io/File;

    .line 241
    .local v14, "inst":Ljava/io/File;
    const-string v3, "\uff08Forge \u6a21\u7ec4\uff09"

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v10, v3}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    .line 242
    .local v9, "ed":Ljava/lang/String;
    invoke-virtual {v1, v6, v9}, Lcom/pymcl/core/loader/LoaderInstaller;->optifineVersionId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 243
    .local v3, "id":Ljava/lang/String;
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "optifine:OptiFine:"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "_"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    .line 244
    .local v11, "libName":Ljava/lang/String;
    new-instance v15, Ljava/io/File;

    invoke-virtual {v8}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v12

    move/from16 v20, v4

    sget-object v4, Lcom/pymcl/core/version/Maven;->INSTANCE:Lcom/pymcl/core/version/Maven;

    invoke-virtual {v4, v11}, Lcom/pymcl/core/version/Maven;->path(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v15, v12, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v15, "libFile":Ljava/io/File;
    invoke-virtual {v15}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    .line 245
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/List;

    .line 246
    .local v4, "libs":Ljava/util/List;
    new-instance v12, Ljava/util/zip/ZipFile;

    invoke-direct {v12, v14}, Ljava/util/zip/ZipFile;-><init>(Ljava/io/File;)V

    check-cast v12, Ljava/io/Closeable;

    :try_start_0
    move-object/from16 v16, v12

    check-cast v16, Ljava/util/zip/ZipFile;

    move-object/from16 p1, v16

    .local p1, "z":Ljava/util/zip/ZipFile;
    const/16 v27, 0x0

    .line 247
    .local v27, "$i$a$-use-LoaderInstaller$installOptiFine$2":I
    move/from16 v28, v5

    const-string v5, "optifine/Patcher.class"
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_a

    move-object/from16 v29, v2

    move-object/from16 v2, p1

    .end local p1    # "z":Ljava/util/zip/ZipFile;
    .local v2, "z":Ljava/util/zip/ZipFile;
    .local v29, "$result":Ljava/lang/Object;
    :try_start_1
    invoke-virtual {v2, v5}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_9

    const/16 v30, 0x0

    const-string v7, ".jar"

    move-object/from16 p2, v3

    .end local v3    # "id":Ljava/lang/String;
    .local p2, "id":Ljava/lang/String;
    if-eqz v5, :cond_7

    .line 248
    :try_start_2
    new-instance v5, Ljava/io/File;

    invoke-virtual {v8}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-object/from16 v31, v4

    .end local v4    # "libs":Ljava/util/List;
    .local v31, "libs":Ljava/util/List;
    :try_start_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object/from16 v32, v9

    .end local v9    # "ed":Ljava/lang/String;
    .local v32, "ed":Ljava/lang/String;
    :try_start_4
    const-string v9, "/"

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v5, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .local v5, "mcJar":Ljava/io/File;
    invoke-virtual {v5}, Ljava/io/File;->isFile()Z

    move-result v3

    if-eqz v3, :cond_6

    .line 249
    new-instance v3, Ljava/io/File;

    invoke-virtual {v15}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v4

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v9, ".tmp"

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .local v3, "tmpOut":Ljava/io/File;
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 250
    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderInstaller;->javaRunner:Lcom/pymcl/core/loader/JavaProcessRunner;

    const-string v9, "1.17"

    invoke-static {v6, v9}, Lcom/pymcl/core/loader/LoadersKt;->compareMc(Ljava/lang/String;Ljava/lang/String;)I

    move-result v9

    if-gez v9, :cond_3

    const/16 v9, 0x8

    goto :goto_3

    :cond_3
    const/16 v9, 0x11

    :goto_3
    move/from16 v34, v9

    invoke-static {v14}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v35

    const-string v36, "optifine.Patcher"

    .line 251
    move-object/from16 v33, v4

    const/4 v9, 0x3

    new-array v4, v9, [Ljava/lang/String;

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v4, v30

    invoke-virtual {v14}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v4, v20

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v4, v28

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v37

    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderInstaller;->cacheDir:Ljava/io/File;

    .line 250
    const/16 v42, 0x60

    const/16 v43, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    move-object/from16 v38, v4

    invoke-static/range {v33 .. v43}, Lcom/pymcl/core/loader/JavaProcessRunner;->run$default(Lcom/pymcl/core/loader/JavaProcessRunner;ILjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/io/File;JLkotlin/jvm/functions/Function1;ILjava/lang/Object;)I

    move-result v4

    .line 252
    .local v4, "code":I
    if-nez v4, :cond_5

    invoke-direct {v1, v3}, Lcom/pymcl/core/loader/LoaderInstaller;->isZip(Ljava/io/File;)Z

    move-result v9

    if-eqz v9, :cond_5

    .line 253
    invoke-virtual {v15}, Ljava/io/File;->delete()Z

    invoke-virtual {v3, v15}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-nez v9, :cond_4

    const/16 v25, 0x4

    const/16 v26, 0x0

    const/16 v23, 0x1

    const/16 v24, 0x0

    move-object/from16 v21, v3

    move-object/from16 v22, v15

    .end local v3    # "tmpOut":Ljava/io/File;
    .end local v15    # "libFile":Ljava/io/File;
    .local v21, "tmpOut":Ljava/io/File;
    .local v22, "libFile":Ljava/io/File;
    :try_start_5
    invoke-static/range {v21 .. v26}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .end local v22    # "libFile":Ljava/io/File;
    .restart local v15    # "libFile":Ljava/io/File;
    :try_start_6
    invoke-virtual/range {v21 .. v21}, Ljava/io/File;->delete()Z

    goto/16 :goto_4

    .line 246
    .end local v2    # "z":Ljava/util/zip/ZipFile;
    .end local v4    # "code":I
    .end local v5    # "mcJar":Ljava/io/File;
    .end local v15    # "libFile":Ljava/io/File;
    .end local v21    # "tmpOut":Ljava/io/File;
    .end local v27    # "$i$a$-use-LoaderInstaller$installOptiFine$2":I
    .restart local v22    # "libFile":Ljava/io/File;
    :catchall_0
    move-exception v0

    move-object/from16 v15, v22

    move-object/from16 v3, p2

    move-object v4, v0

    move-object/from16 v17, v6

    move-object v2, v8

    move-object/from16 v18, v10

    .end local v22    # "libFile":Ljava/io/File;
    .restart local v15    # "libFile":Ljava/io/File;
    goto/16 :goto_7

    .line 253
    .restart local v2    # "z":Ljava/util/zip/ZipFile;
    .restart local v3    # "tmpOut":Ljava/io/File;
    .restart local v4    # "code":I
    .restart local v5    # "mcJar":Ljava/io/File;
    .restart local v27    # "$i$a$-use-LoaderInstaller$installOptiFine$2":I
    :cond_4
    move-object/from16 v21, v3

    .end local v3    # "tmpOut":Ljava/io/File;
    .restart local v21    # "tmpOut":Ljava/io/File;
    goto/16 :goto_4

    .line 252
    .end local v21    # "tmpOut":Ljava/io/File;
    .restart local v3    # "tmpOut":Ljava/io/File;
    :cond_5
    move-object/from16 v21, v3

    .end local v3    # "tmpOut":Ljava/io/File;
    .restart local v21    # "tmpOut":Ljava/io/File;
    invoke-virtual/range {v21 .. v21}, Ljava/io/File;->delete()Z

    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "OptiFine Patcher \u5931\u8d25\uff08\u9000\u51fa\u7801 "

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "\uff09"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move/from16 v7, v28

    const/4 v9, 0x0

    invoke-direct {v0, v3, v9, v7, v9}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .end local v6    # "mc":Ljava/lang/String;
    .end local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v10    # "edition":Ljava/lang/String;
    .end local v11    # "libName":Ljava/lang/String;
    .end local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v14    # "inst":Ljava/io/File;
    .end local v15    # "libFile":Ljava/io/File;
    .end local v29    # "$result":Ljava/lang/Object;
    .end local v31    # "libs":Ljava/util/List;
    .end local v32    # "ed":Ljava/lang/String;
    .end local p2    # "id":Ljava/lang/String;
    .end local p4    # "$completion":Lkotlin/coroutines/Continuation;
    throw v0

    .line 248
    .end local v4    # "code":I
    .end local v21    # "tmpOut":Ljava/io/File;
    .restart local v6    # "mc":Ljava/lang/String;
    .restart local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local v10    # "edition":Ljava/lang/String;
    .restart local v11    # "libName":Ljava/lang/String;
    .restart local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v14    # "inst":Ljava/io/File;
    .restart local v15    # "libFile":Ljava/io/File;
    .restart local v29    # "$result":Ljava/lang/Object;
    .restart local v31    # "libs":Ljava/util/List;
    .restart local v32    # "ed":Ljava/lang/String;
    .restart local p2    # "id":Ljava/lang/String;
    .restart local p4    # "$completion":Lkotlin/coroutines/Continuation;
    :cond_6
    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "\u7f3a\u5c11\u539f\u7248 jar\uff1a"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v7, 0x2

    const/4 v9, 0x0

    invoke-direct {v0, v3, v9, v7, v9}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .end local v6    # "mc":Ljava/lang/String;
    .end local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v10    # "edition":Ljava/lang/String;
    .end local v11    # "libName":Ljava/lang/String;
    .end local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v14    # "inst":Ljava/io/File;
    .end local v15    # "libFile":Ljava/io/File;
    .end local v29    # "$result":Ljava/lang/Object;
    .end local v31    # "libs":Ljava/util/List;
    .end local v32    # "ed":Ljava/lang/String;
    .end local p2    # "id":Ljava/lang/String;
    .end local p4    # "$completion":Lkotlin/coroutines/Continuation;
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 246
    .end local v2    # "z":Ljava/util/zip/ZipFile;
    .end local v5    # "mcJar":Ljava/io/File;
    .end local v27    # "$i$a$-use-LoaderInstaller$installOptiFine$2":I
    .restart local v6    # "mc":Ljava/lang/String;
    .restart local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local v10    # "edition":Ljava/lang/String;
    .restart local v11    # "libName":Ljava/lang/String;
    .restart local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v14    # "inst":Ljava/io/File;
    .restart local v15    # "libFile":Ljava/io/File;
    .restart local v29    # "$result":Ljava/lang/Object;
    .restart local v31    # "libs":Ljava/util/List;
    .restart local v32    # "ed":Ljava/lang/String;
    .restart local p2    # "id":Ljava/lang/String;
    .restart local p4    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_1
    move-exception v0

    move-object/from16 v3, p2

    move-object v4, v0

    move-object/from16 v17, v6

    move-object v2, v8

    move-object/from16 v18, v10

    goto/16 :goto_7

    .end local v32    # "ed":Ljava/lang/String;
    .restart local v9    # "ed":Ljava/lang/String;
    :catchall_2
    move-exception v0

    move-object/from16 v32, v9

    move-object/from16 v3, p2

    move-object v4, v0

    move-object/from16 v17, v6

    move-object v2, v8

    move-object/from16 v18, v10

    .end local v9    # "ed":Ljava/lang/String;
    .restart local v32    # "ed":Ljava/lang/String;
    goto/16 :goto_7

    .end local v31    # "libs":Ljava/util/List;
    .end local v32    # "ed":Ljava/lang/String;
    .local v4, "libs":Ljava/util/List;
    .restart local v9    # "ed":Ljava/lang/String;
    :catchall_3
    move-exception v0

    move-object/from16 v31, v4

    move-object/from16 v32, v9

    move-object/from16 v3, p2

    move-object v4, v0

    move-object/from16 v17, v6

    move-object v2, v8

    move-object/from16 v18, v10

    .end local v4    # "libs":Ljava/util/List;
    .end local v9    # "ed":Ljava/lang/String;
    .restart local v31    # "libs":Ljava/util/List;
    .restart local v32    # "ed":Ljava/lang/String;
    goto/16 :goto_7

    .line 254
    .end local v31    # "libs":Ljava/util/List;
    .end local v32    # "ed":Ljava/lang/String;
    .restart local v2    # "z":Ljava/util/zip/ZipFile;
    .restart local v4    # "libs":Ljava/util/List;
    .restart local v9    # "ed":Ljava/lang/String;
    .restart local v27    # "$i$a$-use-LoaderInstaller$installOptiFine$2":I
    :cond_7
    move-object/from16 v31, v4

    move-object/from16 v32, v9

    .end local v4    # "libs":Ljava/util/List;
    .end local v9    # "ed":Ljava/lang/String;
    .restart local v31    # "libs":Ljava/util/List;
    .restart local v32    # "ed":Ljava/lang/String;
    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    :try_start_7
    invoke-static/range {v14 .. v19}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    .line 255
    :goto_4
    move-object/from16 v3, v31

    check-cast v3, Ljava/util/Collection;

    invoke-direct {v1, v11, v8}, Lcom/pymcl/core/loader/LoaderInstaller;->localLib(Ljava/lang/String;Lcom/pymcl/core/version/GameDirs;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 256
    const-string v3, "launchwrapper-of.txt"

    invoke-virtual {v2, v3}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v3

    .line 257
    .local v3, "lwTxt":Ljava/util/zip/ZipEntry;
    const-string v4, "launchwrapper-2.0.jar"

    invoke-virtual {v2, v4}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v4
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    .line 258
    .local v4, "lw2":Ljava/util/zip/ZipEntry;
    nop

    .line 259
    if-eqz v3, :cond_9

    :try_start_8
    invoke-virtual {v2, v3}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v5

    const-string v9, "getInputStream(...)"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v5

    sget-object v9, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    move-object/from16 v16, v3

    .end local v3    # "lwTxt":Ljava/util/zip/ZipEntry;
    .local v16, "lwTxt":Ljava/util/zip/ZipEntry;
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v5, v9}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    check-cast v3, Ljava/lang/CharSequence;

    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 260
    .local v3, "v":Ljava/lang/String;
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "launchwrapper-of-"

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v5

    if-eqz v5, :cond_8

    .line 261
    .local v5, "e":Ljava/util/zip/ZipEntry;
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "optifine:launchwrapper-of:"

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .local v7, "n":Ljava/lang/String;
    new-instance v9, Ljava/io/File;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    move-object/from16 v17, v6

    .end local v6    # "mc":Ljava/lang/String;
    .local v17, "mc":Ljava/lang/String;
    :try_start_9
    invoke-virtual {v8}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v6
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    move-object/from16 v18, v10

    .end local v10    # "edition":Ljava/lang/String;
    .local v18, "edition":Ljava/lang/String;
    :try_start_a
    sget-object v10, Lcom/pymcl/core/version/Maven;->INSTANCE:Lcom/pymcl/core/version/Maven;

    invoke-virtual {v10, v7}, Lcom/pymcl/core/version/Maven;->path(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v6, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v1, v2, v5, v9}, Lcom/pymcl/core/loader/LoaderInstaller;->extract(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;)V

    move-object/from16 v6, v31

    check-cast v6, Ljava/util/Collection;

    invoke-direct {v1, v7, v8}, Lcom/pymcl/core/loader/LoaderInstaller;->localLib(Ljava/lang/String;Lcom/pymcl/core/version/GameDirs;)Ljava/util/Map;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v5, v20

    goto/16 :goto_5

    .line 246
    .end local v2    # "z":Ljava/util/zip/ZipFile;
    .end local v3    # "v":Ljava/lang/String;
    .end local v4    # "lw2":Ljava/util/zip/ZipEntry;
    .end local v5    # "e":Ljava/util/zip/ZipEntry;
    .end local v7    # "n":Ljava/lang/String;
    .end local v16    # "lwTxt":Ljava/util/zip/ZipEntry;
    .end local v18    # "edition":Ljava/lang/String;
    .end local v27    # "$i$a$-use-LoaderInstaller$installOptiFine$2":I
    .restart local v10    # "edition":Ljava/lang/String;
    :catchall_4
    move-exception v0

    move-object/from16 v18, v10

    move-object/from16 v3, p2

    move-object v4, v0

    move-object v2, v8

    .end local v10    # "edition":Ljava/lang/String;
    .restart local v18    # "edition":Ljava/lang/String;
    goto/16 :goto_7

    .line 260
    .end local v17    # "mc":Ljava/lang/String;
    .end local v18    # "edition":Ljava/lang/String;
    .restart local v2    # "z":Ljava/util/zip/ZipFile;
    .restart local v3    # "v":Ljava/lang/String;
    .restart local v4    # "lw2":Ljava/util/zip/ZipEntry;
    .restart local v6    # "mc":Ljava/lang/String;
    .restart local v10    # "edition":Ljava/lang/String;
    .restart local v16    # "lwTxt":Ljava/util/zip/ZipEntry;
    .restart local v27    # "$i$a$-use-LoaderInstaller$installOptiFine$2":I
    :cond_8
    move-object/from16 v17, v6

    move-object/from16 v18, v10

    .end local v6    # "mc":Ljava/lang/String;
    .end local v10    # "edition":Ljava/lang/String;
    .restart local v17    # "mc":Ljava/lang/String;
    .restart local v18    # "edition":Ljava/lang/String;
    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u5b89\u88c5\u5668\u7f3a\u5c11 launchwrapper-of-"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x2

    const/4 v9, 0x0

    invoke-direct {v0, v5, v9, v7, v9}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .end local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v11    # "libName":Ljava/lang/String;
    .end local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v14    # "inst":Ljava/io/File;
    .end local v15    # "libFile":Ljava/io/File;
    .end local v17    # "mc":Ljava/lang/String;
    .end local v18    # "edition":Ljava/lang/String;
    .end local v29    # "$result":Ljava/lang/Object;
    .end local v31    # "libs":Ljava/util/List;
    .end local v32    # "ed":Ljava/lang/String;
    .end local p2    # "id":Ljava/lang/String;
    .end local p4    # "$completion":Lkotlin/coroutines/Continuation;
    throw v0

    .line 246
    .end local v2    # "z":Ljava/util/zip/ZipFile;
    .end local v3    # "v":Ljava/lang/String;
    .end local v4    # "lw2":Ljava/util/zip/ZipEntry;
    .end local v16    # "lwTxt":Ljava/util/zip/ZipEntry;
    .end local v27    # "$i$a$-use-LoaderInstaller$installOptiFine$2":I
    .restart local v6    # "mc":Ljava/lang/String;
    .restart local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local v10    # "edition":Ljava/lang/String;
    .restart local v11    # "libName":Ljava/lang/String;
    .restart local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v14    # "inst":Ljava/io/File;
    .restart local v15    # "libFile":Ljava/io/File;
    .restart local v29    # "$result":Ljava/lang/Object;
    .restart local v31    # "libs":Ljava/util/List;
    .restart local v32    # "ed":Ljava/lang/String;
    .restart local p2    # "id":Ljava/lang/String;
    .restart local p4    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_5
    move-exception v0

    move-object/from16 v17, v6

    move-object/from16 v18, v10

    move-object/from16 v3, p2

    move-object v4, v0

    move-object v2, v8

    .end local v6    # "mc":Ljava/lang/String;
    .end local v10    # "edition":Ljava/lang/String;
    .restart local v17    # "mc":Ljava/lang/String;
    .restart local v18    # "edition":Ljava/lang/String;
    goto/16 :goto_7

    .line 262
    .end local v17    # "mc":Ljava/lang/String;
    .end local v18    # "edition":Ljava/lang/String;
    .restart local v2    # "z":Ljava/util/zip/ZipFile;
    .local v3, "lwTxt":Ljava/util/zip/ZipEntry;
    .restart local v4    # "lw2":Ljava/util/zip/ZipEntry;
    .restart local v6    # "mc":Ljava/lang/String;
    .restart local v10    # "edition":Ljava/lang/String;
    .restart local v27    # "$i$a$-use-LoaderInstaller$installOptiFine$2":I
    :cond_9
    move-object/from16 v16, v3

    move-object/from16 v17, v6

    move-object/from16 v18, v10

    .end local v3    # "lwTxt":Ljava/util/zip/ZipEntry;
    .end local v6    # "mc":Ljava/lang/String;
    .end local v10    # "edition":Ljava/lang/String;
    .restart local v16    # "lwTxt":Ljava/util/zip/ZipEntry;
    .restart local v17    # "mc":Ljava/lang/String;
    .restart local v18    # "edition":Ljava/lang/String;
    if-eqz v4, :cond_a

    const-string v3, "optifine:launchwrapper:2.0"

    .local v3, "n":Ljava/lang/String;
    new-instance v5, Ljava/io/File;

    invoke-virtual {v8}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v6

    sget-object v7, Lcom/pymcl/core/version/Maven;->INSTANCE:Lcom/pymcl/core/version/Maven;

    invoke-virtual {v7, v3}, Lcom/pymcl/core/version/Maven;->path(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v1, v2, v4, v5}, Lcom/pymcl/core/loader/LoaderInstaller;->extract(Ljava/util/zip/ZipFile;Ljava/util/zip/ZipEntry;Ljava/io/File;)V

    move-object/from16 v5, v31

    check-cast v5, Ljava/util/Collection;

    invoke-direct {v1, v3, v8}, Lcom/pymcl/core/loader/LoaderInstaller;->localLib(Ljava/lang/String;Lcom/pymcl/core/version/GameDirs;)Ljava/util/Map;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    move/from16 v5, v20

    goto :goto_5

    .line 246
    .end local v2    # "z":Ljava/util/zip/ZipFile;
    .end local v3    # "n":Ljava/lang/String;
    .end local v4    # "lw2":Ljava/util/zip/ZipEntry;
    .end local v16    # "lwTxt":Ljava/util/zip/ZipEntry;
    .end local v27    # "$i$a$-use-LoaderInstaller$installOptiFine$2":I
    :catchall_6
    move-exception v0

    move-object/from16 v3, p2

    move-object v4, v0

    move-object v2, v8

    goto/16 :goto_7

    .line 263
    .restart local v2    # "z":Ljava/util/zip/ZipFile;
    .restart local v4    # "lw2":Ljava/util/zip/ZipEntry;
    .restart local v16    # "lwTxt":Ljava/util/zip/ZipEntry;
    .restart local v27    # "$i$a$-use-LoaderInstaller$installOptiFine$2":I
    :cond_a
    :try_start_b
    move-object/from16 v3, v31

    check-cast v3, Ljava/util/Collection;

    move/from16 v5, v20

    new-array v6, v5, [Lkotlin/Pair;

    const-string v7, "name"

    const-string v9, "net.minecraft:launchwrapper:1.12"

    invoke-static {v7, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    aput-object v7, v6, v30

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v6

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 265
    :goto_5
    nop

    .end local v2    # "z":Ljava/util/zip/ZipFile;
    .end local v4    # "lw2":Ljava/util/zip/ZipEntry;
    .end local v16    # "lwTxt":Ljava/util/zip/ZipEntry;
    .end local v27    # "$i$a$-use-LoaderInstaller$installOptiFine$2":I
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 246
    const/4 v9, 0x0

    invoke-static {v12, v9}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 266
    const-string v6, "optifine.OptiFineTweaker"

    move-object/from16 v3, p2

    move v7, v5

    move-object v2, v8

    move-object/from16 v4, v17

    move-object/from16 v5, v31

    .end local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v17    # "mc":Ljava/lang/String;
    .end local v31    # "libs":Ljava/util/List;
    .end local p2    # "id":Ljava/lang/String;
    .local v2, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v3, "id":Ljava/lang/String;
    .local v4, "mc":Ljava/lang/String;
    .local v5, "libs":Ljava/util/List;
    invoke-direct/range {v1 .. v6}, Lcom/pymcl/core/loader/LoaderInstaller;->writeTweakVersion(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    .line 267
    .end local v4    # "mc":Ljava/lang/String;
    .end local v5    # "libs":Ljava/util/List;
    .restart local v17    # "mc":Ljava/lang/String;
    .restart local v31    # "libs":Ljava/util/List;
    iget-object v4, v1, Lcom/pymcl/core/loader/LoaderInstaller;->game:Lcom/pymcl/core/version/GameInstaller;

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$0:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$1:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$2:Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$3:Ljava/lang/Object;

    invoke-static/range {v32 .. v32}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$4:Ljava/lang/Object;

    iput-object v3, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$5:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$6:Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$7:Ljava/lang/Object;

    invoke-static/range {v31 .. v31}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->L$8:Ljava/lang/Object;

    const/4 v9, 0x3

    iput v9, v13, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFine$1;->label:I

    invoke-virtual {v4, v2, v3, v7, v13}, Lcom/pymcl/core/version/GameInstaller;->completeFiles(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_b

    .line 238
    return-object v0

    .line 267
    :cond_b
    move-object v5, v3

    move-object v4, v11

    move-object v8, v14

    move-object v3, v15

    move-object/from16 v10, v17

    move-object/from16 v9, v18

    move-object/from16 v0, v31

    move-object/from16 v6, v32

    move-object v11, v2

    .line 268
    .end local v2    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v14    # "inst":Ljava/io/File;
    .end local v15    # "libFile":Ljava/io/File;
    .end local v17    # "mc":Ljava/lang/String;
    .end local v18    # "edition":Ljava/lang/String;
    .end local v31    # "libs":Ljava/util/List;
    .end local v32    # "ed":Ljava/lang/String;
    .restart local v0    # "libs":Ljava/util/List;
    .local v3, "libFile":Ljava/io/File;
    .local v4, "libName":Ljava/lang/String;
    .local v5, "id":Ljava/lang/String;
    .local v6, "ed":Ljava/lang/String;
    .local v8, "inst":Ljava/io/File;
    .local v9, "edition":Ljava/lang/String;
    .local v10, "mc":Ljava/lang/String;
    .local v11, "dirs":Lcom/pymcl/core/version/GameDirs;
    :goto_6
    return-object v5

    .line 246
    .end local v0    # "libs":Ljava/util/List;
    .end local v3    # "libFile":Ljava/io/File;
    .end local v4    # "libName":Ljava/lang/String;
    .end local v5    # "id":Ljava/lang/String;
    .end local v6    # "ed":Ljava/lang/String;
    .end local v9    # "edition":Ljava/lang/String;
    .end local v10    # "mc":Ljava/lang/String;
    .local v8, "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v11, "libName":Ljava/lang/String;
    .restart local v14    # "inst":Ljava/io/File;
    .restart local v15    # "libFile":Ljava/io/File;
    .restart local v17    # "mc":Ljava/lang/String;
    .restart local v18    # "edition":Ljava/lang/String;
    .restart local v31    # "libs":Ljava/util/List;
    .restart local v32    # "ed":Ljava/lang/String;
    .restart local p2    # "id":Ljava/lang/String;
    :catchall_7
    move-exception v0

    move-object/from16 v3, p2

    move-object v2, v8

    move-object v4, v0

    .end local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "id":Ljava/lang/String;
    .restart local v2    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v3, "id":Ljava/lang/String;
    goto :goto_7

    .end local v2    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v3    # "id":Ljava/lang/String;
    .end local v17    # "mc":Ljava/lang/String;
    .end local v18    # "edition":Ljava/lang/String;
    .local v6, "mc":Ljava/lang/String;
    .restart local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v10, "edition":Ljava/lang/String;
    .restart local p2    # "id":Ljava/lang/String;
    :catchall_8
    move-exception v0

    move-object/from16 v3, p2

    move-object/from16 v17, v6

    move-object v2, v8

    move-object/from16 v18, v10

    move-object v4, v0

    .end local v6    # "mc":Ljava/lang/String;
    .end local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v10    # "edition":Ljava/lang/String;
    .end local p2    # "id":Ljava/lang/String;
    .restart local v2    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local v3    # "id":Ljava/lang/String;
    .restart local v17    # "mc":Ljava/lang/String;
    .restart local v18    # "edition":Ljava/lang/String;
    goto :goto_7

    .end local v2    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v17    # "mc":Ljava/lang/String;
    .end local v18    # "edition":Ljava/lang/String;
    .end local v31    # "libs":Ljava/util/List;
    .end local v32    # "ed":Ljava/lang/String;
    .local v4, "libs":Ljava/util/List;
    .restart local v6    # "mc":Ljava/lang/String;
    .restart local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .local v9, "ed":Ljava/lang/String;
    .restart local v10    # "edition":Ljava/lang/String;
    :catchall_9
    move-exception v0

    move-object/from16 v31, v4

    move-object/from16 v17, v6

    move-object v2, v8

    move-object/from16 v32, v9

    move-object/from16 v18, v10

    move-object v4, v0

    .end local v4    # "libs":Ljava/util/List;
    .end local v6    # "mc":Ljava/lang/String;
    .end local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v9    # "ed":Ljava/lang/String;
    .end local v10    # "edition":Ljava/lang/String;
    .restart local v2    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local v17    # "mc":Ljava/lang/String;
    .restart local v18    # "edition":Ljava/lang/String;
    .restart local v31    # "libs":Ljava/util/List;
    .restart local v32    # "ed":Ljava/lang/String;
    goto :goto_7

    .end local v17    # "mc":Ljava/lang/String;
    .end local v18    # "edition":Ljava/lang/String;
    .end local v29    # "$result":Ljava/lang/Object;
    .end local v31    # "libs":Ljava/util/List;
    .end local v32    # "ed":Ljava/lang/String;
    .local v2, "$result":Ljava/lang/Object;
    .restart local v4    # "libs":Ljava/util/List;
    .restart local v6    # "mc":Ljava/lang/String;
    .restart local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local v9    # "ed":Ljava/lang/String;
    .restart local v10    # "edition":Ljava/lang/String;
    :catchall_a
    move-exception v0

    move-object/from16 v29, v2

    move-object/from16 v31, v4

    move-object/from16 v17, v6

    move-object v2, v8

    move-object/from16 v32, v9

    move-object/from16 v18, v10

    move-object v4, v0

    .end local v2    # "$result":Ljava/lang/Object;
    .end local v3    # "id":Ljava/lang/String;
    .end local v4    # "libs":Ljava/util/List;
    .end local v6    # "mc":Ljava/lang/String;
    .end local v8    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local v9    # "ed":Ljava/lang/String;
    .end local v10    # "edition":Ljava/lang/String;
    .end local v11    # "libName":Ljava/lang/String;
    .end local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v14    # "inst":Ljava/io/File;
    .end local v15    # "libFile":Ljava/io/File;
    .end local p4    # "$completion":Lkotlin/coroutines/Continuation;
    :goto_7
    :try_start_c
    throw v4
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .local v2, "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local v3    # "id":Ljava/lang/String;
    .restart local v11    # "libName":Ljava/lang/String;
    .restart local v13    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v14    # "inst":Ljava/io/File;
    .restart local v15    # "libFile":Ljava/io/File;
    .restart local v17    # "mc":Ljava/lang/String;
    .restart local v18    # "edition":Ljava/lang/String;
    .restart local v29    # "$result":Ljava/lang/Object;
    .restart local v31    # "libs":Ljava/util/List;
    .restart local v32    # "ed":Ljava/lang/String;
    .restart local p4    # "$completion":Lkotlin/coroutines/Continuation;
    :catchall_b
    move-exception v0

    invoke-static {v12, v4}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final installOptiFineAsMod(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 23
    .param p1, "modsDir"    # Ljava/io/File;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "edition"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/io/File;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    instance-of v4, v3, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;

    iget v5, v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;->label:I

    const/high16 v6, -0x80000000

    and-int/2addr v5, v6

    if-eqz v5, :cond_0

    iget v5, v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;->label:I

    sub-int/2addr v5, v6

    iput v5, v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;

    invoke-direct {v4, v0, v3}, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;-><init>(Lcom/pymcl/core/loader/LoaderInstaller;Lkotlin/coroutines/Continuation;)V

    .local v4, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v5, v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;->result:Ljava/lang/Object;

    .local v5, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v6

    .line 272
    iget v7, v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;->label:I

    const/4 v8, 0x1

    packed-switch v7, :pswitch_data_0

    .end local v4    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v5    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v4    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v5    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v6, v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;->L$2:Ljava/lang/Object;

    move-object v2, v6

    check-cast v2, Ljava/lang/String;

    .end local p3    # "edition":Ljava/lang/String;
    .local v2, "edition":Ljava/lang/String;
    iget-object v6, v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;->L$1:Ljava/lang/Object;

    move-object v1, v6

    check-cast v1, Ljava/lang/String;

    .end local p2    # "mc":Ljava/lang/String;
    .local v1, "mc":Ljava/lang/String;
    iget-object v6, v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;->L$0:Ljava/lang/Object;

    check-cast v6, Ljava/io/File;

    .end local p1    # "modsDir":Ljava/io/File;
    .local v6, "modsDir":Ljava/io/File;
    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v9, v5

    goto :goto_1

    .end local v1    # "mc":Ljava/lang/String;
    .end local v2    # "edition":Ljava/lang/String;
    .end local v6    # "modsDir":Ljava/io/File;
    .restart local p1    # "modsDir":Ljava/io/File;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "edition":Ljava/lang/String;
    :pswitch_1
    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 273
    move-object/from16 v7, p1

    iput-object v7, v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;->L$0:Ljava/lang/Object;

    iput-object v1, v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;->L$1:Ljava/lang/Object;

    iput-object v2, v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;->L$2:Ljava/lang/Object;

    iput v8, v4, Lcom/pymcl/core/loader/LoaderInstaller$installOptiFineAsMod$1;->label:I

    invoke-direct {v0, v1, v2, v4}, Lcom/pymcl/core/loader/LoaderInstaller;->downloadOptiFine(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_1

    .line 272
    return-object v6

    .line 273
    :cond_1
    move-object v6, v7

    .line 272
    .end local p1    # "modsDir":Ljava/io/File;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "edition":Ljava/lang/String;
    .restart local v1    # "mc":Ljava/lang/String;
    .restart local v2    # "edition":Ljava/lang/String;
    .restart local v6    # "modsDir":Ljava/io/File;
    :goto_1
    move-object v10, v9

    check-cast v10, Ljava/io/File;

    .line 274
    .local v10, "inst":Ljava/io/File;
    invoke-virtual {v0, v2}, Lcom/pymcl/core/loader/LoaderInstaller;->splitOptiFine(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v7

    invoke-virtual {v7}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .local v9, "t":Ljava/lang/String;
    invoke-virtual {v7}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 275
    .local v7, "p":Ljava/lang/String;
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 276
    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v11

    const-string v12, ".jar"

    const-string v13, "OptiFine_"

    if-eqz v11, :cond_6

    .local v11, "$this$filter$iv":[Ljava/lang/Object;
    const/4 v14, 0x0

    .line 484
    .local v14, "$i$f$filter":I
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    check-cast v15, Ljava/util/Collection;

    .local v15, "destination$iv$iv":Ljava/util/Collection;
    move-object/from16 p1, v11

    .local p1, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    const/16 v16, 0x0

    .line 485
    .local v16, "$i$f$filterTo":I
    move-object/from16 v8, p1

    .end local p1    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .local v8, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    array-length v0, v8

    move-object/from16 p1, v2

    .end local v2    # "edition":Ljava/lang/String;
    .local p1, "edition":Ljava/lang/String;
    const/4 v2, 0x0

    :goto_2
    if-ge v2, v0, :cond_4

    move/from16 p3, v0

    aget-object v0, v8, v2

    .local v0, "element$iv$iv":Ljava/lang/Object;
    move-object/from16 v17, v0

    .local v17, "it":Ljava/io/File;
    const/16 v18, 0x0

    .line 276
    .local v18, "$i$a$-filter-LoaderInstaller$installOptiFineAsMod$2":I
    move/from16 v19, v2

    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getName(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v20, v4

    .end local v4    # "$continuation":Lkotlin/coroutines/Continuation;
    .local v20, "$continuation":Lkotlin/coroutines/Continuation;
    const/4 v4, 0x2

    move-object/from16 v21, v5

    .end local v5    # "$result":Ljava/lang/Object;
    .local v21, "$result":Ljava/lang/Object;
    const/4 v5, 0x0

    move-object/from16 v22, v8

    const/4 v8, 0x0

    .end local v8    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .local v22, "$this$filterTo$iv$iv":[Ljava/lang/Object;
    invoke-static {v2, v13, v8, v4, v5}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual/range {v17 .. v17}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v12, v8, v4, v5}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x1

    goto :goto_3

    :cond_2
    move v2, v8

    .line 485
    .end local v17    # "it":Ljava/io/File;
    .end local v18    # "$i$a$-filter-LoaderInstaller$installOptiFineAsMod$2":I
    :goto_3
    if-eqz v2, :cond_3

    invoke-interface {v15, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v0    # "element$iv$iv":Ljava/lang/Object;
    :cond_3
    add-int/lit8 v2, v19, 0x1

    move/from16 v0, p3

    move-object/from16 v3, p4

    move-object/from16 v4, v20

    move-object/from16 v5, v21

    move-object/from16 v8, v22

    goto :goto_2

    .line 486
    .end local v20    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v21    # "$result":Ljava/lang/Object;
    .end local v22    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .restart local v4    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v5    # "$result":Ljava/lang/Object;
    .restart local v8    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    :cond_4
    move-object/from16 v20, v4

    move-object/from16 v21, v5

    move-object/from16 v22, v8

    .end local v4    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v5    # "$result":Ljava/lang/Object;
    .end local v8    # "$this$filterTo$iv$iv":[Ljava/lang/Object;
    .end local v15    # "destination$iv$iv":Ljava/util/Collection;
    .end local v16    # "$i$f$filterTo":I
    .restart local v20    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v21    # "$result":Ljava/lang/Object;
    move-object v0, v15

    check-cast v0, Ljava/util/List;

    .line 484
    nop

    .line 276
    .end local v11    # "$this$filter$iv":[Ljava/lang/Object;
    .end local v14    # "$i$f$filter":I
    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach$iv":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 487
    .local v2, "$i$f$forEach":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element$iv":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Ljava/io/File;

    .local v5, "it":Ljava/io/File;
    const/4 v8, 0x0

    .line 276
    .local v8, "$i$a$-forEach-LoaderInstaller$installOptiFineAsMod$3":I
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 487
    .end local v4    # "element$iv":Ljava/lang/Object;
    .end local v5    # "it":Ljava/io/File;
    .end local v8    # "$i$a$-forEach-LoaderInstaller$installOptiFineAsMod$3":I
    goto :goto_4

    .line 488
    :cond_5
    nop

    .end local v0    # "$this$forEach$iv":Ljava/lang/Iterable;
    .end local v2    # "$i$f$forEach":I
    goto :goto_5

    .line 276
    .end local v20    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v21    # "$result":Ljava/lang/Object;
    .end local p1    # "edition":Ljava/lang/String;
    .local v2, "edition":Ljava/lang/String;
    .local v4, "$continuation":Lkotlin/coroutines/Continuation;
    .local v5, "$result":Ljava/lang/Object;
    :cond_6
    move-object/from16 p1, v2

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    .line 277
    .end local v2    # "edition":Ljava/lang/String;
    .end local v4    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v5    # "$result":Ljava/lang/Object;
    .restart local v20    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v21    # "$result":Ljava/lang/Object;
    .restart local p1    # "edition":Ljava/lang/String;
    :goto_5
    new-instance v0, Ljava/io/File;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v6, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v11, v0

    .line 483
    .local v11, "it":Ljava/io/File;
    const/4 v2, 0x0

    .line 277
    .local v2, "$i$a$-also-LoaderInstaller$installOptiFineAsMod$4":I
    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lkotlin/io/FilesKt;->copyTo$default(Ljava/io/File;Ljava/io/File;ZIILjava/lang/Object;)Ljava/io/File;

    .end local v2    # "$i$a$-also-LoaderInstaller$installOptiFineAsMod$4":I
    .end local v11    # "it":Ljava/io/File;
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final liteloaderBuilds(Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .param p1, "mc"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;",
            ">;"
        }
    .end annotation

    const-string v0, "mc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    const/4 v0, 0x0

    .line 301
    .local v0, "err":Ljava/lang/Exception;
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "http://dl.liteloader.com/versions/versions.json"

    aput-object v3, v1, v2

    sget-object v2, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v2, p1}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "https://bmclapi2.bangbang93.com/liteloader/list?mcversion="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .line 506
    .local v1, "it":Ljava/util/List;
    const/4 v2, 0x0

    .line 301
    .local v2, "$i$a$-let-LoaderInstaller$liteloaderBuilds$1":I
    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderInstaller;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v3}, Lcom/pymcl/core/download/Mirrors;->fileMirrorFirst()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->reversed(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v3

    move-object v1, v3

    .end local v1    # "it":Ljava/util/List;
    .end local v2    # "$i$a$-let-LoaderInstaller$liteloaderBuilds$1":I
    :cond_0
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v2, v0

    .end local v0    # "err":Ljava/lang/Exception;
    .local v2, "err":Ljava/lang/Exception;
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 302
    .local v4, "u":Ljava/lang/String;
    :try_start_0
    iget-object v3, p0, Lcom/pymcl/core/loader/LoaderInstaller;->http:Lcom/pymcl/core/net/Http;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/pymcl/core/net/Http;->getText$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/pymcl/core/loader/LoaderInstaller;->parseLiteLoader(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .local v0, "r":Ljava/util/List;
    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v3, :cond_1

    return-object v0

    .end local v0    # "r":Ljava/util/List;
    :catch_0
    move-exception v0

    .local v0, "e":Ljava/lang/Exception;
    move-object v2, v0

    .end local v0    # "e":Ljava/lang/Exception;
    .end local v4    # "u":Ljava/lang/String;
    goto :goto_0

    .line 303
    :cond_2
    if-nez v2, :cond_3

    .line 304
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 303
    :cond_3
    new-instance v0, Lcom/pymcl/core/loader/InstallError;

    invoke-virtual {v2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u83b7\u53d6 LiteLoader \u5217\u8868\u5931\u8d25\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v3, v2

    check-cast v3, Ljava/lang/Throwable;

    invoke-direct {v0, v1, v3}, Lcom/pymcl/core/loader/InstallError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final liteloaderUrls(Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;)Ljava/util/List;
    .locals 7
    .param p1, "b"    # Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "b"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 308
    invoke-virtual {p1}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getVersion()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://bmclapi2.bangbang93.com/maven/com/mumfrey/liteloader/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/liteloader-"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".jar"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 309
    .local v0, "bm":Ljava/lang/String;
    invoke-virtual {p1}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getFile()Ljava/lang/String;

    move-result-object v3

    const-string v4, "http://dl.liteloader.com/versions/com/mumfrey/liteloader/"

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getSnapshot()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getMc()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getFile()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 310
    :cond_0
    invoke-virtual {p1}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getVersion()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getVersion()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 309
    :goto_0
    nop

    .line 311
    .local v1, "off":Ljava/lang/String;
    iget-object v2, p0, Lcom/pymcl/core/loader/LoaderInstaller;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v2}, Lcom/pymcl/core/download/Mirrors;->fileMirrorFirst()Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v2, :cond_1

    new-array v2, v5, [Ljava/lang/String;

    aput-object v0, v2, v4

    aput-object v1, v2, v3

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    goto :goto_1

    :cond_1
    new-array v2, v5, [Ljava/lang/String;

    aput-object v1, v2, v4

    aput-object v0, v2, v3

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :goto_1
    return-object v2
.end method

.method public final liteloaderVersions(Ljava/lang/String;)Ljava/util/List;
    .locals 13
    .param p1, "mc"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/loader/LoaderVersion;",
            ">;"
        }
    .end annotation

    const-string v0, "mc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    invoke-virtual {p0, p1}, Lcom/pymcl/core/loader/LoaderInstaller;->liteloaderBuilds(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 507
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 508
    .local v4, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 509
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    .local v7, "it":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    const/4 v8, 0x0

    .line 306
    .local v8, "$i$a$-map-LoaderInstaller$liteloaderVersions$1":I
    new-instance v9, Lcom/pymcl/core/loader/LoaderVersion;

    sget-object v10, Lcom/pymcl/core/loader/LoaderType;->LITELOADER:Lcom/pymcl/core/loader/LoaderType;

    invoke-virtual {v7}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getVersion()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getSnapshot()Z

    move-result v12

    xor-int/lit8 v12, v12, 0x1

    invoke-direct {v9, v10, p1, v11, v12}, Lcom/pymcl/core/loader/LoaderVersion;-><init>(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 509
    .end local v7    # "it":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v8    # "$i$a$-map-LoaderInstaller$liteloaderVersions$1":I
    invoke-interface {v2, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 510
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 507
    nop

    .line 306
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    return-object v2
.end method

.method public final mavenVersions(Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .param p1, "xml"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "xml"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "<version>([^<]+)</version>"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lkotlin/text/Regex;->findAll$default(Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/sequences/Sequence;

    move-result-object v0

    new-instance v1, Lcom/pymcl/core/loader/LoaderInstaller$$ExternalSyntheticLambda1;

    invoke-direct {v1}, Lcom/pymcl/core/loader/LoaderInstaller$$ExternalSyntheticLambda1;-><init>()V

    invoke-static {v0, v1}, Lkotlin/sequences/SequencesKt;->map(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;

    move-result-object v0

    invoke-static {v0}, Lkotlin/sequences/SequencesKt;->toList(Lkotlin/sequences/Sequence;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final neoPrefix(Ljava/lang/String;)Ljava/lang/String;
    .locals 8
    .param p1, "mc"    # Ljava/lang/String;

    const-string v0, "mc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v0, 0x1

    new-array v2, v0, [C

    const/4 v7, 0x0

    const/16 v3, 0x2e

    aput-char v3, v2, v7

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v1

    .local v1, "p":Ljava/util/List;
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "1"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const-string v3, "0"

    const-string v4, "."

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ge v0, v2, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v7

    :goto_0
    if-eqz v2, :cond_1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    goto :goto_1

    :cond_1
    move v2, v0

    .line 404
    .local v2, "it":I
    const/4 v5, 0x0

    .line 68
    .local v5, "$i$a$-getOrElse-LoaderInstaller$neoPrefix$1":I
    move-object v2, v3

    .end local v2    # "it":I
    .end local v5    # "$i$a$-getOrElse-LoaderInstaller$neoPrefix$1":I
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x2

    if-ge v6, v5, :cond_2

    goto :goto_2

    :cond_2
    move v0, v7

    :goto_2
    if-eqz v0, :cond_3

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    goto :goto_3

    .line 404
    :cond_3
    nop

    .local v6, "it":I
    const/4 v0, 0x0

    .line 68
    .local v0, "$i$a$-getOrElse-LoaderInstaller$neoPrefix$2":I
    nop

    .end local v0    # "$i$a$-getOrElse-LoaderInstaller$neoPrefix$2":I
    .end local v6    # "it":I
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_5

    :cond_4
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v0, v5, :cond_5

    move v7, v0

    :cond_5
    if-eqz v7, :cond_6

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    goto :goto_4

    .line 404
    :cond_6
    nop

    .local v0, "it":I
    const/4 v5, 0x0

    .line 68
    .local v5, "$i$a$-getOrElse-LoaderInstaller$neoPrefix$3":I
    nop

    .end local v0    # "it":I
    .end local v5    # "$i$a$-getOrElse-LoaderInstaller$neoPrefix$3":I
    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_5
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final neoforgeInstallerUrls(Ljava/lang/String;)Ljava/util/List;
    .locals 6
    .param p1, "v"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "v"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    const/4 v0, 0x0

    const-string v1, "1.20.1-"

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v1, v2, v3, v0}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    const-string v1, "https://maven.neoforged.net/releases/net/neoforged/forge"

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    const-string v0, "https://maven.neoforged.net/releases/net/neoforged/neoforge"

    .line 92
    .local v0, "base":Ljava/lang/String;
    :goto_0
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "forge"

    goto :goto_1

    :cond_1
    const-string v1, "neoforge"

    .line 93
    .local v1, "n":Ljava/lang/String;
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "/"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "-"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, "-installer.jar"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .local v4, "u":Ljava/lang/String;
    new-array v3, v3, [Ljava/lang/String;

    aput-object v4, v3, v2

    sget-object v2, Lcom/pymcl/core/download/Mirrors;->Companion:Lcom/pymcl/core/download/Mirrors$Companion;

    invoke-virtual {v2, v4}, Lcom/pymcl/core/download/Mirrors$Companion;->rewriteToBmcl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v3, v5

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 404
    .local v2, "it":Ljava/util/List;
    const/4 v3, 0x0

    .line 93
    .local v3, "$i$a$-let-LoaderInstaller$neoforgeInstallerUrls$1":I
    iget-object v5, p0, Lcom/pymcl/core/loader/LoaderInstaller;->mirrors:Lcom/pymcl/core/download/Mirrors;

    invoke-virtual {v5}, Lcom/pymcl/core/download/Mirrors;->fileMirrorFirst()Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v5, v2

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->reversed(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v5

    move-object v2, v5

    .end local v2    # "it":Ljava/util/List;
    .end local v3    # "$i$a$-let-LoaderInstaller$neoforgeInstallerUrls$1":I
    :cond_2
    return-object v2
.end method

.method public final neoforgeVersions(Ljava/lang/String;)Ljava/util/List;
    .locals 20
    .param p1, "mc"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/loader/LoaderVersion;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "mc"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    const-string v2, "https://maven.neoforged.net/releases/net/neoforged/neoforge/maven-metadata.xml"

    invoke-direct {v0, v2}, Lcom/pymcl/core/loader/LoaderInstaller;->getText(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/pymcl/core/loader/LoaderInstaller;->mavenVersions(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 64
    .local v2, "all":Ljava/util/List;
    invoke-virtual/range {p0 .. p1}, Lcom/pymcl/core/loader/LoaderInstaller;->neoPrefix(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 65
    .local v3, "p":Ljava/lang/String;
    move-object v4, v2

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 397
    .local v5, "$i$f$filter":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v4

    .local v7, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 398
    .local v8, "$i$f$filterTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_0
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v13, 0x0

    if-eqz v10, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element$iv$iv":Ljava/lang/Object;
    move-object v14, v10

    check-cast v14, Ljava/lang/String;

    .local v14, "it":Ljava/lang/String;
    const/4 v15, 0x0

    .line 65
    .local v15, "$i$a$-filter-LoaderInstaller$neoforgeVersions$1":I
    invoke-static {v14, v3, v13, v12, v11}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v11

    .line 398
    .end local v14    # "it":Ljava/lang/String;
    .end local v15    # "$i$a$-filter-LoaderInstaller$neoforgeVersions$1":I
    if-eqz v11, :cond_0

    invoke-interface {v6, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 399
    .end local v10    # "element$iv$iv":Ljava/lang/Object;
    :cond_1
    nop

    .end local v6    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$filterTo":I
    check-cast v6, Ljava/util/List;

    .line 397
    nop

    .end local v4    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v5    # "$i$f$filter":I
    check-cast v6, Ljava/lang/Iterable;

    .line 65
    nop

    .local v6, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 400
    .local v4, "$i$f$map":I
    new-instance v5, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination$iv$iv":Ljava/util/Collection;
    move-object v7, v6

    .local v7, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 401
    .local v8, "$i$f$mapTo":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 402
    .local v10, "item$iv$iv":Ljava/lang/Object;
    move-object v14, v10

    check-cast v14, Ljava/lang/String;

    .restart local v14    # "it":Ljava/lang/String;
    const/4 v15, 0x0

    .line 65
    .local v15, "$i$a$-map-LoaderInstaller$neoforgeVersions$2":I
    new-instance v11, Lcom/pymcl/core/loader/LoaderVersion;

    sget-object v12, Lcom/pymcl/core/loader/LoaderType;->NEOFORGE:Lcom/pymcl/core/loader/LoaderType;

    move-object v13, v14

    check-cast v13, Ljava/lang/CharSequence;

    const-string v18, "beta"

    move-object/from16 v19, v2

    .end local v2    # "all":Ljava/util/List;
    .local v19, "all":Ljava/util/List;
    move-object/from16 v2, v18

    check-cast v2, Ljava/lang/CharSequence;

    move-object/from16 v18, v3

    move/from16 v16, v4

    move-object/from16 v17, v6

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v6, 0x0

    .end local v3    # "p":Ljava/lang/String;
    .end local v4    # "$i$f$map":I
    .end local v6    # "$this$map$iv":Ljava/lang/Iterable;
    .local v16, "$i$f$map":I
    .local v17, "$this$map$iv":Ljava/lang/Iterable;
    .local v18, "p":Ljava/lang/String;
    invoke-static {v13, v2, v6, v4, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-direct {v11, v12, v1, v14, v2}, Lcom/pymcl/core/loader/LoaderVersion;-><init>(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 402
    .end local v14    # "it":Ljava/lang/String;
    .end local v15    # "$i$a$-map-LoaderInstaller$neoforgeVersions$2":I
    invoke-interface {v5, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v11, v3

    move v12, v4

    move v13, v6

    move/from16 v4, v16

    move-object/from16 v6, v17

    move-object/from16 v3, v18

    move-object/from16 v2, v19

    goto :goto_1

    .line 403
    .end local v10    # "item$iv$iv":Ljava/lang/Object;
    .end local v16    # "$i$f$map":I
    .end local v17    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v18    # "p":Ljava/lang/String;
    .end local v19    # "all":Ljava/util/List;
    .restart local v2    # "all":Ljava/util/List;
    .restart local v3    # "p":Ljava/lang/String;
    .restart local v4    # "$i$f$map":I
    .restart local v6    # "$this$map$iv":Ljava/lang/Iterable;
    :cond_2
    move-object/from16 v19, v2

    move-object/from16 v18, v3

    .end local v2    # "all":Ljava/util/List;
    .end local v3    # "p":Ljava/lang/String;
    .end local v5    # "destination$iv$iv":Ljava/util/Collection;
    .end local v7    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapTo":I
    .restart local v18    # "p":Ljava/lang/String;
    .restart local v19    # "all":Ljava/util/List;
    move-object v2, v5

    check-cast v2, Ljava/util/List;

    .line 400
    nop

    .end local v4    # "$i$f$map":I
    .end local v6    # "$this$map$iv":Ljava/lang/Iterable;
    check-cast v2, Ljava/lang/Iterable;

    .line 65
    new-instance v3, Lcom/pymcl/core/loader/LoaderInstaller$neoforgeVersions$$inlined$compareByDescending$1;

    invoke-direct {v3, v0}, Lcom/pymcl/core/loader/LoaderInstaller$neoforgeVersions$$inlined$compareByDescending$1;-><init>(Lcom/pymcl/core/loader/LoaderInstaller;)V

    check-cast v3, Ljava/util/Comparator;

    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v2

    return-object v2
.end method

.method public final optifineBuilds(Ljava/lang/String;)Ljava/util/List;
    .locals 24
    .param p1, "mc"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/loader/LoaderInstaller$OptiFineBuild;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "mc"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    sget-object v1, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    move-object/from16 v2, p0

    iget-object v3, v2, Lcom/pymcl/core/loader/LoaderInstaller;->http:Lcom/pymcl/core/net/Http;

    sget-object v4, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v4, v0}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "https://bmclapi2.bangbang93.com/optifine/"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/pymcl/core/net/Http;->getText$default(Lcom/pymcl/core/net/Http;Ljava/lang/String;Ljava/util/Map;IILjava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/pymcl/core/util/Json;->parse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 465
    .local v3, "$i$f$mapNotNull":I
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    check-cast v4, Ljava/util/Collection;

    .local v4, "destination$iv$iv":Ljava/util/Collection;
    move-object v5, v1

    .local v5, "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 474
    .local v6, "$i$f$mapNotNullTo":I
    move-object v7, v5

    .local v7, "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 475
    .local v8, "$i$f$forEach":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .local v10, "element$iv$iv$iv":Ljava/lang/Object;
    move-object v11, v10

    .local v11, "element$iv$iv":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 474
    .local v12, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    move-object v13, v11

    check-cast v13, Ljava/util/Map;

    .local v13, "o":Ljava/util/Map;
    const/4 v14, 0x0

    .line 213
    .local v14, "$i$a$-mapNotNull-LoaderInstaller$optifineBuilds$1":I
    const-string v15, "type"

    invoke-static {v13, v15}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const/16 v16, 0x0

    move-object/from16 v23, v1

    if-nez v15, :cond_0

    move-object/from16 v17, v16

    move/from16 v16, v3

    goto :goto_3

    .end local v1    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v15, "t":Ljava/lang/String;
    .local v23, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    :cond_0
    const-string v1, "patch"

    invoke-static {v13, v1}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    if-nez v20, :cond_1

    move-object/from16 v17, v16

    move/from16 v16, v3

    goto :goto_3

    :cond_1
    move-object/from16 v1, v20

    .line 214
    .local v1, "p":Ljava/lang/String;
    new-instance v17, Lcom/pymcl/core/loader/LoaderInstaller$OptiFineBuild;

    const-string v2, "mcversion"

    invoke-static {v13, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    move-object/from16 v18, v0

    goto :goto_1

    :cond_2
    move-object/from16 v18, v2

    :goto_1
    const-string v2, "filename"

    invoke-static {v13, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v16, v3

    .end local v3    # "$i$f$mapNotNull":I
    .local v16, "$i$f$mapNotNull":I
    const-string v3, "OptiFine_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ".jar"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    .end local v16    # "$i$f$mapNotNull":I
    .restart local v3    # "$i$f$mapNotNull":I
    :cond_3
    move/from16 v16, v3

    .end local v3    # "$i$f$mapNotNull":I
    .restart local v16    # "$i$f$mapNotNull":I
    :goto_2
    move-object/from16 v21, v2

    const-string v2, "forge"

    invoke-static {v13, v2}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v22

    move-object/from16 v20, v1

    move-object/from16 v19, v15

    .end local v1    # "p":Ljava/lang/String;
    .end local v15    # "t":Ljava/lang/String;
    .local v19, "t":Ljava/lang/String;
    .local v20, "p":Ljava/lang/String;
    invoke-direct/range {v17 .. v22}, Lcom/pymcl/core/loader/LoaderInstaller$OptiFineBuild;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 474
    .end local v13    # "o":Ljava/util/Map;
    .end local v14    # "$i$a$-mapNotNull-LoaderInstaller$optifineBuilds$1":I
    .end local v19    # "t":Ljava/lang/String;
    .end local v20    # "p":Ljava/lang/String;
    :goto_3
    if-eqz v17, :cond_4

    move-object/from16 v1, v17

    .line 476
    .local v1, "it$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x0

    .line 474
    .local v2, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 475
    .end local v1    # "it$iv$iv":Ljava/lang/Object;
    .end local v2    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv":I
    .end local v11    # "element$iv$iv":Ljava/lang/Object;
    .end local v12    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv":I
    :cond_4
    move-object/from16 v2, p0

    move/from16 v3, v16

    move-object/from16 v1, v23

    .end local v10    # "element$iv$iv$iv":Ljava/lang/Object;
    goto/16 :goto_0

    .line 477
    .end local v16    # "$i$f$mapNotNull":I
    .end local v23    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .local v1, "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .restart local v3    # "$i$f$mapNotNull":I
    :cond_5
    move-object/from16 v23, v1

    .line 478
    .end local v1    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    .end local v7    # "$this$forEach$iv$iv$iv":Ljava/lang/Iterable;
    .end local v8    # "$i$f$forEach":I
    .restart local v23    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    nop

    .end local v4    # "destination$iv$iv":Ljava/util/Collection;
    .end local v5    # "$this$mapNotNullTo$iv$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapNotNullTo":I
    move-object v1, v4

    check-cast v1, Ljava/util/List;

    .line 465
    nop

    .line 214
    .end local v3    # "$i$f$mapNotNull":I
    .end local v23    # "$this$mapNotNull$iv":Ljava/lang/Iterable;
    return-object v1
.end method

.method public final optifineUrl(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p1, "mc"    # Ljava/lang/String;
    .param p2, "type"    # Ljava/lang/String;
    .param p3, "patch"    # Ljava/lang/String;

    const-string v0, "mc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "patch"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 216
    sget-object v0, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v0, p1}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v1, p2}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v2, p3}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "https://bmclapi2.bangbang93.com/optifine/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final optifineVersionId(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .param p1, "mc"    # Ljava/lang/String;
    .param p2, "edition"    # Ljava/lang/String;

    const-string v0, "mc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "edition"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    const-string v0, "\uff08Forge \u6a21\u7ec4\uff09"

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {p2, v0}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "-OptiFine_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final optifineVersions(Ljava/lang/String;)Ljava/util/List;
    .locals 13
    .param p1, "mc"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/loader/LoaderVersion;",
            ">;"
        }
    .end annotation

    const-string v0, "mc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 215
    invoke-virtual {p0, p1}, Lcom/pymcl/core/loader/LoaderInstaller;->optifineBuilds(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map$iv":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 479
    .local v1, "$i$f$map":I
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination$iv$iv":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 480
    .local v4, "$i$f$mapTo":I
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 481
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v7, v6

    check-cast v7, Lcom/pymcl/core/loader/LoaderInstaller$OptiFineBuild;

    .local v7, "it":Lcom/pymcl/core/loader/LoaderInstaller$OptiFineBuild;
    const/4 v8, 0x0

    .line 215
    .local v8, "$i$a$-map-LoaderInstaller$optifineVersions$1":I
    new-instance v9, Lcom/pymcl/core/loader/LoaderVersion;

    sget-object v10, Lcom/pymcl/core/loader/LoaderType;->OPTIFINE:Lcom/pymcl/core/loader/LoaderType;

    invoke-virtual {v7}, Lcom/pymcl/core/loader/LoaderInstaller$OptiFineBuild;->getEdition()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7}, Lcom/pymcl/core/loader/LoaderInstaller$OptiFineBuild;->getStable()Z

    move-result v12

    invoke-direct {v9, v10, p1, v11, v12}, Lcom/pymcl/core/loader/LoaderVersion;-><init>(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 481
    .end local v7    # "it":Lcom/pymcl/core/loader/LoaderInstaller$OptiFineBuild;
    .end local v8    # "$i$a$-map-LoaderInstaller$optifineVersions$1":I
    invoke-interface {v2, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 482
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    :cond_0
    nop

    .end local v2    # "destination$iv$iv":Ljava/util/Collection;
    .end local v3    # "$this$mapTo$iv$iv":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapTo":I
    check-cast v2, Ljava/util/List;

    .line 479
    nop

    .line 215
    .end local v0    # "$this$map$iv":Ljava/lang/Iterable;
    .end local v1    # "$i$f$map":I
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->asReversed(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final parseLiteLoader(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 17
    .param p1, "text"    # Ljava/lang/String;
    .param p2, "mc"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "text"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "mc"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 285
    sget-object v2, Lcom/pymcl/core/util/Json;->INSTANCE:Lcom/pymcl/core/util/Json;

    invoke-virtual {v2, v0}, Lcom/pymcl/core/util/Json;->parse(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 290
    .local v2, "root":Ljava/lang/Object;
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 291
    .local v3, "out":Ljava/util/ArrayList;
    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v4

    if-eqz v4, :cond_0

    const-string v5, "versions"

    invoke-static {v4, v5}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 292
    .local v4, "versions":Ljava/util/Map;
    :goto_0
    const/4 v5, 0x0

    if-eqz v4, :cond_6

    .line 293
    invoke-static {v4, v1}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v6

    if-nez v6, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v5

    return-object v5

    .line 294
    .local v6, "m":Ljava/util/Map;
    :cond_1
    const/4 v7, 0x2

    new-array v7, v7, [Lkotlin/Pair;

    const-string v8, "artefacts"

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v7, v5

    const-string v8, "snapshots"

    const/4 v9, 0x1

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    aput-object v8, v7, v9

    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lkotlin/Pair;

    invoke-virtual {v8}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    .local v9, "key":Ljava/lang/String;
    invoke-virtual {v8}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    .line 295
    .local v8, "snap":Z
    invoke-static {v6, v9}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v10

    const-string v11, "com.mumfrey:liteloader"

    invoke-static {v10, v11}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v10

    if-nez v10, :cond_3

    new-array v10, v5, [Lkotlin/Pair;

    invoke-static {v10}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v10

    :cond_3
    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_4
    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/util/Map$Entry;

    invoke-interface {v11}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    .local v12, "k":Ljava/lang/String;
    invoke-interface {v11}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    .local v11, "e":Ljava/lang/Object;
    const-string v13, "latest"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_4

    invoke-static {v11}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v13

    if-eqz v13, :cond_5

    .line 483
    .local v13, "it":Ljava/util/Map;
    const/4 v14, 0x0

    .line 295
    .local v14, "$i$a$-let-LoaderInstaller$parseLiteLoader$1":I
    invoke-static {v1, v13, v8}, Lcom/pymcl/core/loader/LoaderInstaller;->parseLiteLoader$build(Ljava/lang/String;Ljava/util/Map;Z)Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    move-result-object v13

    .end local v13    # "it":Ljava/util/Map;
    .end local v14    # "$i$a$-let-LoaderInstaller$parseLiteLoader$1":I
    if-eqz v13, :cond_5

    .line 483
    .local v13, "it":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    const/4 v14, 0x0

    .line 295
    .local v14, "$i$a$-let-LoaderInstaller$parseLiteLoader$2":I
    move-object v15, v3

    check-cast v15, Ljava/util/Collection;

    invoke-interface {v15, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v13    # "it":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v14    # "$i$a$-let-LoaderInstaller$parseLiteLoader$2":I
    goto :goto_1

    .end local v11    # "e":Ljava/lang/Object;
    .end local v12    # "k":Ljava/lang/String;
    :cond_5
    goto :goto_1

    .line 296
    .end local v6    # "m":Ljava/util/Map;
    .end local v8    # "snap":Z
    .end local v9    # "key":Ljava/lang/String;
    :cond_6
    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-static {v6}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v6

    if-nez v6, :cond_8

    :cond_7
    invoke-static {v2}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v6

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOfNotNull(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    :cond_8
    check-cast v6, Ljava/lang/Iterable;

    .local v6, "$this$filter$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 489
    .local v7, "$i$f$filter":I
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    check-cast v8, Ljava/util/Collection;

    .local v8, "destination$iv$iv":Ljava/util/Collection;
    move-object v9, v6

    .local v9, "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 490
    .local v10, "$i$f$filterTo":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_9
    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Ljava/util/Map;

    .local v13, "it":Ljava/util/Map;
    const/4 v14, 0x0

    .line 296
    .local v14, "$i$a$-filter-LoaderInstaller$parseLiteLoader$3":I
    const-string v15, "mcversion"

    invoke-static {v13, v15}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_a

    move-object v15, v1

    :cond_a
    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    .line 490
    .end local v13    # "it":Ljava/util/Map;
    .end local v14    # "$i$a$-filter-LoaderInstaller$parseLiteLoader$3":I
    if-eqz v13, :cond_9

    invoke-interface {v8, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 491
    .end local v12    # "element$iv$iv":Ljava/lang/Object;
    :cond_b
    nop

    .end local v8    # "destination$iv$iv":Ljava/util/Collection;
    .end local v9    # "$this$filterTo$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$filterTo":I
    check-cast v8, Ljava/util/List;

    .line 489
    nop

    .end local v6    # "$this$filter$iv":Ljava/lang/Iterable;
    .end local v7    # "$i$f$filter":I
    check-cast v8, Ljava/lang/Iterable;

    .line 296
    move-object v6, v3

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination$iv":Ljava/util/Collection;
    .local v8, "$this$mapNotNullTo$iv":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 492
    .local v7, "$i$f$mapNotNullTo":I
    move-object v9, v8

    .local v9, "$this$forEach$iv$iv":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 493
    .local v10, "$i$f$forEach":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_d

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .restart local v12    # "element$iv$iv":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "element$iv":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 492
    .local v14, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv":I
    move-object v15, v13

    check-cast v15, Ljava/util/Map;

    .local v15, "it":Ljava/util/Map;
    const/16 v16, 0x0

    .line 296
    .local v16, "$i$a$-mapNotNullTo-LoaderInstaller$parseLiteLoader$4":I
    invoke-static {v1, v15, v5}, Lcom/pymcl/core/loader/LoaderInstaller;->parseLiteLoader$build(Ljava/lang/String;Ljava/util/Map;Z)Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    move-result-object v15

    .line 492
    .end local v15    # "it":Ljava/util/Map;
    .end local v16    # "$i$a$-mapNotNullTo-LoaderInstaller$parseLiteLoader$4":I
    if-eqz v15, :cond_c

    .line 494
    .local v15, "it$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 492
    .local v16, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv":I
    invoke-interface {v6, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 493
    .end local v13    # "element$iv":Ljava/lang/Object;
    .end local v14    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv":I
    .end local v15    # "it$iv":Ljava/lang/Object;
    .end local v16    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv":I
    :cond_c
    nop

    .end local v12    # "element$iv$iv":Ljava/lang/Object;
    goto :goto_3

    .line 495
    :cond_d
    nop

    .line 496
    .end local v9    # "$this$forEach$iv$iv":Ljava/lang/Iterable;
    .end local v10    # "$i$f$forEach":I
    nop

    .line 297
    .end local v6    # "destination$iv":Ljava/util/Collection;
    .end local v7    # "$i$f$mapNotNullTo":I
    .end local v8    # "$this$mapNotNullTo$iv":Ljava/lang/Iterable;
    :cond_e
    move-object v5, v3

    check-cast v5, Ljava/lang/Iterable;

    .local v5, "$this$distinctBy$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 497
    .local v6, "$i$f$distinctBy":I
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 498
    .local v7, "set$iv":Ljava/util/HashSet;
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 499
    .local v8, "list$iv":Ljava/util/ArrayList;
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_f
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_10

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 500
    .local v10, "e$iv":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;

    .local v11, "it":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    const/4 v12, 0x0

    .line 297
    .local v12, "$i$a$-distinctBy-LoaderInstaller$parseLiteLoader$5":I
    invoke-virtual {v11}, Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;->getVersion()Ljava/lang/String;

    move-result-object v11

    .line 500
    .end local v11    # "it":Lcom/pymcl/core/loader/LoaderInstaller$LiteLoaderBuild;
    .end local v12    # "$i$a$-distinctBy-LoaderInstaller$parseLiteLoader$5":I
    nop

    .line 501
    .local v11, "key$iv":Ljava/lang/Object;
    invoke-virtual {v7, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    .line 502
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 504
    .end local v10    # "e$iv":Ljava/lang/Object;
    .end local v11    # "key$iv":Ljava/lang/Object;
    :cond_10
    move-object v5, v8

    check-cast v5, Ljava/util/List;

    .end local v5    # "$this$distinctBy$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$distinctBy":I
    .end local v7    # "set$iv":Ljava/util/HashSet;
    .end local v8    # "list$iv":Ljava/util/ArrayList;
    check-cast v5, Ljava/lang/Iterable;

    .line 297
    nop

    .local v5, "$this$sortedBy$iv":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 505
    .local v6, "$i$f$sortedBy":I
    new-instance v7, Lcom/pymcl/core/loader/LoaderInstaller$parseLiteLoader$$inlined$sortedBy$1;

    invoke-direct {v7}, Lcom/pymcl/core/loader/LoaderInstaller$parseLiteLoader$$inlined$sortedBy$1;-><init>()V

    check-cast v7, Ljava/util/Comparator;

    invoke-static {v5, v7}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v5

    .line 297
    .end local v5    # "$this$sortedBy$iv":Ljava/lang/Iterable;
    .end local v6    # "$i$f$sortedBy":I
    return-object v5
.end method

.method public final processorData(Lcom/pymcl/core/version/GameDirs;Ljava/lang/String;Ljava/io/File;Ljava/util/zip/ZipFile;Ljava/util/Map;Ljava/io/File;)Ljava/util/Map;
    .locals 23
    .param p1, "dirs"    # Lcom/pymcl/core/version/GameDirs;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "installer"    # Ljava/io/File;
    .param p4, "z"    # Ljava/util/zip/ZipFile;
    .param p5, "prof"    # Ljava/util/Map;
    .param p6, "tmp"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/version/GameDirs;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Ljava/util/zip/ZipFile;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/io/File;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    const-string v0, "dirs"

    move-object/from16 v5, p1

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mc"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "installer"

    move-object/from16 v6, p3

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "z"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "prof"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tmp"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    const/4 v0, 0x6

    new-array v0, v0, [Lkotlin/Pair;

    const-string v7, "SIDE"

    const-string v8, "client"

    invoke-static {v7, v8}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v9, 0x0

    aput-object v7, v0, v9

    new-instance v7, Ljava/io/File;

    invoke-virtual {v5}, Lcom/pymcl/core/version/GameDirs;->getVersionsDir()Ljava/io/File;

    move-result-object v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "/"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v13, ".jar"

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v7, v10, v11}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v7

    const-string v10, "MINECRAFT_JAR"

    invoke-static {v10, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v10, 0x1

    aput-object v7, v0, v10

    const-string v7, "MINECRAFT_VERSION"

    invoke-static {v7, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v11, 0x2

    aput-object v7, v0, v11

    .line 159
    invoke-virtual {v5}, Lcom/pymcl/core/version/GameDirs;->getInstanceDir()Ljava/io/File;

    move-result-object v7

    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v7

    const-string v13, "ROOT"

    invoke-static {v13, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v13, 0x3

    aput-object v7, v0, v13

    .line 158
    nop

    .line 159
    const-string v7, "INSTALLER"

    invoke-virtual {v6}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v13

    invoke-static {v7, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v13, 0x4

    aput-object v7, v0, v13

    .line 158
    nop

    .line 159
    invoke-virtual {v5}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v7

    invoke-virtual {v7}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v7

    const-string v13, "LIBRARY_DIR"

    invoke-static {v13, v7}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v7

    const/4 v13, 0x5

    aput-object v7, v0, v13

    .line 158
    invoke-static {v0}, Lkotlin/collections/MapsKt;->linkedMapOf([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    move-result-object v7

    .line 160
    .local v7, "d":Ljava/util/LinkedHashMap;
    const-string v0, "data"

    invoke-static {v3, v0}, Lcom/pymcl/core/util/JsonKt;->obj(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    new-array v0, v9, [Lkotlin/Pair;

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->jobj([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/String;

    .local v14, "k":Ljava/lang/String;
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    .local v13, "v":Ljava/lang/Object;
    invoke-static {v13}, Lcom/pymcl/core/util/JsonKt;->o(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v15

    invoke-static {v15, v8}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    if-nez v15, :cond_1

    goto :goto_0

    .line 161
    .local v15, "c":Ljava/lang/String;
    :cond_1
    move/from16 v16, v10

    move-object v10, v7

    check-cast v10, Ljava/util/Map;

    .line 162
    move-object/from16 v17, v0

    const-string v0, "["

    const/4 v1, 0x0

    invoke-static {v15, v0, v9, v11, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    const-string v1, "substring(...)"

    if-eqz v0, :cond_2

    const-string v0, "]"

    const/4 v3, 0x0

    invoke-static {v15, v0, v9, v11, v3}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/io/File;

    invoke-virtual {v5}, Lcom/pymcl/core/version/GameDirs;->getLibrariesDir()Ljava/io/File;

    move-result-object v3

    sget-object v9, Lcom/pymcl/core/version/Maven;->INSTANCE:Lcom/pymcl/core/version/Maven;

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v18

    add-int/lit8 v11, v18, -0x1

    move/from16 v5, v16

    invoke-virtual {v15, v5, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v11}, Lcom/pymcl/core/version/Maven;->path(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x2

    goto/16 :goto_4

    .line 163
    :cond_2
    const-string v0, "\'"

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x2

    invoke-static {v15, v0, v5, v9, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-static {v15, v0, v5, v9, v3}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v5, 0x1

    sub-int/2addr v0, v5

    invoke-virtual {v15, v5, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x2

    goto/16 :goto_4

    :cond_3
    const/4 v5, 0x1

    .line 164
    const/4 v0, 0x0

    const/4 v3, 0x0

    const/4 v9, 0x2

    invoke-static {v15, v12, v0, v9, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    sget-object v0, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    move-object v1, v12

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v15, v1}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, Lcom/pymcl/core/util/FileUtil;->safeChild(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    .local v1, "out":Ljava/io/File;
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 165
    move-object v0, v12

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v15, v0}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/zip/ZipFile;->getEntry(Ljava/lang/String;)Ljava/util/zip/ZipEntry;

    move-result-object v0

    if-eqz v0, :cond_4

    move-object v3, v0

    .line 404
    .local v3, "e":Ljava/util/zip/ZipEntry;
    const/4 v9, 0x0

    .line 165
    .local v9, "$i$a$-let-LoaderInstaller$processorData$1":I
    invoke-virtual {v2, v3}, Ljava/util/zip/ZipFile;->getInputStream(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Ljava/io/Closeable;

    :try_start_0
    move-object v0, v11

    check-cast v0, Ljava/io/InputStream;

    move-object/from16 v16, v0

    .line 404
    .local v16, "i":Ljava/io/InputStream;
    const/16 v19, 0x0

    .local v19, "$i$a$-use-LoaderInstaller$processorData$1$1":I
    new-instance v0, Ljava/io/FileOutputStream;

    .line 165
    invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v5, v0

    check-cast v5, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    move-object v0, v5

    check-cast v0, Ljava/io/FileOutputStream;

    .line 404
    .local v0, "it":Ljava/io/FileOutputStream;
    const/16 v20, 0x0

    .line 165
    .local v20, "$i$a$-use-LoaderInstaller$processorData$1$1$1":I
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v21, v0

    .end local v0    # "it":Ljava/io/FileOutputStream;
    .local v21, "it":Ljava/io/FileOutputStream;
    move-object/from16 v0, v21

    check-cast v0, Ljava/io/OutputStream;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v22, v1

    move-object/from16 v1, v16

    const/4 v2, 0x0

    const/4 v4, 0x2

    move-object/from16 v16, v3

    const/4 v3, 0x0

    .end local v3    # "e":Ljava/util/zip/ZipEntry;
    .local v1, "i":Ljava/io/InputStream;
    .local v16, "e":Ljava/util/zip/ZipEntry;
    .local v22, "out":Ljava/io/File;
    :try_start_2
    invoke-static {v1, v0, v3, v4, v2}, Lkotlin/io/ByteStreamsKt;->copyTo$default(Ljava/io/InputStream;Ljava/io/OutputStream;IILjava/lang/Object;)J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .end local v20    # "$i$a$-use-LoaderInstaller$processorData$1$1$1":I
    .end local v21    # "it":Ljava/io/FileOutputStream;
    :try_start_3
    invoke-static {v5, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .end local v1    # "i":Ljava/io/InputStream;
    .end local v19    # "$i$a$-use-LoaderInstaller$processorData$1$1":I
    invoke-static {v11, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v9    # "$i$a$-let-LoaderInstaller$processorData$1":I
    .end local v16    # "e":Ljava/util/zip/ZipEntry;
    goto :goto_3

    .restart local v1    # "i":Ljava/io/InputStream;
    .restart local v9    # "$i$a$-let-LoaderInstaller$processorData$1":I
    .restart local v16    # "e":Ljava/util/zip/ZipEntry;
    .restart local v19    # "$i$a$-use-LoaderInstaller$processorData$1$1":I
    :catchall_0
    move-exception v0

    move-object v2, v0

    goto :goto_1

    .end local v22    # "out":Ljava/io/File;
    .local v1, "out":Ljava/io/File;
    .restart local v3    # "e":Ljava/util/zip/ZipEntry;
    .local v16, "i":Ljava/io/InputStream;
    :catchall_1
    move-exception v0

    move-object/from16 v22, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v3

    move-object v2, v0

    .end local v1    # "out":Ljava/io/File;
    .end local v3    # "e":Ljava/util/zip/ZipEntry;
    .end local v7    # "d":Ljava/util/LinkedHashMap;
    .end local v9    # "$i$a$-let-LoaderInstaller$processorData$1":I
    .end local v13    # "v":Ljava/lang/Object;
    .end local v14    # "k":Ljava/lang/String;
    .end local v15    # "c":Ljava/lang/String;
    .end local v16    # "i":Ljava/io/InputStream;
    .end local v19    # "$i$a$-use-LoaderInstaller$processorData$1$1":I
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "installer":Ljava/io/File;
    .end local p4    # "z":Ljava/util/zip/ZipFile;
    .end local p5    # "prof":Ljava/util/Map;
    .end local p6    # "tmp":Ljava/io/File;
    :goto_1
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .local v1, "i":Ljava/io/InputStream;
    .restart local v7    # "d":Ljava/util/LinkedHashMap;
    .restart local v9    # "$i$a$-let-LoaderInstaller$processorData$1":I
    .restart local v13    # "v":Ljava/lang/Object;
    .restart local v14    # "k":Ljava/lang/String;
    .restart local v15    # "c":Ljava/lang/String;
    .local v16, "e":Ljava/util/zip/ZipEntry;
    .restart local v19    # "$i$a$-use-LoaderInstaller$processorData$1$1":I
    .restart local v22    # "out":Ljava/io/File;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p4    # "z":Ljava/util/zip/ZipFile;
    .restart local p5    # "prof":Ljava/util/Map;
    .restart local p6    # "tmp":Ljava/io/File;
    :catchall_2
    move-exception v0

    :try_start_5
    invoke-static {v5, v2}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .end local v7    # "d":Ljava/util/LinkedHashMap;
    .end local v9    # "$i$a$-let-LoaderInstaller$processorData$1":I
    .end local v13    # "v":Ljava/lang/Object;
    .end local v14    # "k":Ljava/lang/String;
    .end local v15    # "c":Ljava/lang/String;
    .end local v16    # "e":Ljava/util/zip/ZipEntry;
    .end local v22    # "out":Ljava/io/File;
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "installer":Ljava/io/File;
    .end local p4    # "z":Ljava/util/zip/ZipFile;
    .end local p5    # "prof":Ljava/util/Map;
    .end local p6    # "tmp":Ljava/io/File;
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .end local v1    # "i":Ljava/io/InputStream;
    .end local v19    # "$i$a$-use-LoaderInstaller$processorData$1$1":I
    .restart local v7    # "d":Ljava/util/LinkedHashMap;
    .restart local v9    # "$i$a$-let-LoaderInstaller$processorData$1":I
    .restart local v13    # "v":Ljava/lang/Object;
    .restart local v14    # "k":Ljava/lang/String;
    .restart local v15    # "c":Ljava/lang/String;
    .restart local v16    # "e":Ljava/util/zip/ZipEntry;
    .restart local v22    # "out":Ljava/io/File;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p4    # "z":Ljava/util/zip/ZipFile;
    .restart local p5    # "prof":Ljava/util/Map;
    .restart local p6    # "tmp":Ljava/io/File;
    :catchall_3
    move-exception v0

    move-object v1, v0

    goto :goto_2

    .end local v16    # "e":Ljava/util/zip/ZipEntry;
    .end local v22    # "out":Ljava/io/File;
    .local v1, "out":Ljava/io/File;
    .restart local v3    # "e":Ljava/util/zip/ZipEntry;
    :catchall_4
    move-exception v0

    move-object/from16 v22, v1

    move-object/from16 v16, v3

    move-object v1, v0

    .end local v1    # "out":Ljava/io/File;
    .end local v3    # "e":Ljava/util/zip/ZipEntry;
    .end local v7    # "d":Ljava/util/LinkedHashMap;
    .end local v9    # "$i$a$-let-LoaderInstaller$processorData$1":I
    .end local v13    # "v":Ljava/lang/Object;
    .end local v14    # "k":Ljava/lang/String;
    .end local v15    # "c":Ljava/lang/String;
    .end local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .end local p2    # "mc":Ljava/lang/String;
    .end local p3    # "installer":Ljava/io/File;
    .end local p4    # "z":Ljava/util/zip/ZipFile;
    .end local p5    # "prof":Ljava/util/Map;
    .end local p6    # "tmp":Ljava/io/File;
    :goto_2
    :try_start_6
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .restart local v7    # "d":Ljava/util/LinkedHashMap;
    .restart local v9    # "$i$a$-let-LoaderInstaller$processorData$1":I
    .restart local v13    # "v":Ljava/lang/Object;
    .restart local v14    # "k":Ljava/lang/String;
    .restart local v15    # "c":Ljava/lang/String;
    .restart local v16    # "e":Ljava/util/zip/ZipEntry;
    .restart local v22    # "out":Ljava/io/File;
    .restart local p1    # "dirs":Lcom/pymcl/core/version/GameDirs;
    .restart local p2    # "mc":Ljava/lang/String;
    .restart local p3    # "installer":Ljava/io/File;
    .restart local p4    # "z":Ljava/util/zip/ZipFile;
    .restart local p5    # "prof":Ljava/util/Map;
    .restart local p6    # "tmp":Ljava/io/File;
    :catchall_5
    move-exception v0

    invoke-static {v11, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    .end local v9    # "$i$a$-let-LoaderInstaller$processorData$1":I
    .end local v16    # "e":Ljava/util/zip/ZipEntry;
    .end local v22    # "out":Ljava/io/File;
    .restart local v1    # "out":Ljava/io/File;
    :cond_4
    move-object/from16 v22, v1

    const/4 v3, 0x0

    const/4 v4, 0x2

    .end local v1    # "out":Ljava/io/File;
    .restart local v22    # "out":Ljava/io/File;
    :goto_3
    invoke-virtual/range {v22 .. v22}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .end local v22    # "out":Ljava/io/File;
    goto :goto_4

    .line 166
    :cond_5
    const/4 v3, 0x0

    const/4 v4, 0x2

    move-object v0, v15

    .line 161
    :goto_4
    invoke-interface {v10, v14, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v5, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p4

    move v9, v3

    move v11, v4

    move-object/from16 v0, v17

    const/4 v10, 0x1

    move-object/from16 v3, p5

    move-object/from16 v4, p6

    goto/16 :goto_0

    .line 167
    .end local v13    # "v":Ljava/lang/Object;
    .end local v14    # "k":Ljava/lang/String;
    .end local v15    # "c":Ljava/lang/String;
    :cond_6
    move-object v0, v7

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final quiltVersions(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .param p1, "mc"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/pymcl/core/loader/LoaderVersion;",
            ">;"
        }
    .end annotation

    const-string v0, "mc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    sget-object v0, Lcom/pymcl/core/loader/LoaderType;->QUILT:Lcom/pymcl/core/loader/LoaderType;

    sget-object v1, Lcom/pymcl/core/net/Http;->Companion:Lcom/pymcl/core/net/Http$Companion;

    invoke-virtual {v1, p1}, Lcom/pymcl/core/net/Http$Companion;->enc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "https://meta.quiltmc.org/v3/versions/loader/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1, p1}, Lcom/pymcl/core/loader/LoaderInstaller;->metaVersions(Lcom/pymcl/core/loader/LoaderType;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final setJavaRunner(Lcom/pymcl/core/loader/JavaProcessRunner;)V
    .locals 1
    .param p1, "<set-?>"    # Lcom/pymcl/core/loader/JavaProcessRunner;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iput-object p1, p0, Lcom/pymcl/core/loader/LoaderInstaller;->javaRunner:Lcom/pymcl/core/loader/JavaProcessRunner;

    return-void
.end method

.method public final splitOptiFine(Ljava/lang/String;)Lkotlin/Pair;
    .locals 16
    .param p1, "edition"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    const-string v1, "edition"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    const-string v1, "\uff08Forge \u6a21\u7ec4\uff09"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v0, v1}, Lkotlin/text/StringsKt;->removeSuffix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .local v1, "v":Ljava/lang/String;
    move-object v2, v1

    check-cast v2, Ljava/lang/CharSequence;

    const/4 v8, 0x1

    new-array v3, v8, [C

    const/4 v9, 0x0

    const/16 v4, 0x5f

    aput-char v4, v3, v9

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 220
    .local v2, "p":Ljava/util/List;
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x2

    if-lt v3, v4, :cond_0

    move v3, v8

    goto :goto_0

    :cond_0
    move v3, v9

    :goto_0
    if-eqz v3, :cond_2

    .line 221
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v5, 0x3

    const-string v6, "_"

    if-lt v3, v5, :cond_1

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-ne v3, v8, :cond_1

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v3, v9}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object v5, v2

    check-cast v5, Ljava/lang/Iterable;

    invoke-static {v5, v4}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    goto :goto_1

    :cond_1
    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v2

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4, v8}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v4

    :goto_1
    move-object v7, v4

    check-cast v7, Ljava/lang/Iterable;

    move-object v8, v6

    check-cast v8, Ljava/lang/CharSequence;

    const/16 v14, 0x3e

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v15}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    return-object v3

    .line 483
    :cond_2
    const/4 v3, 0x0

    .line 220
    .local v3, "$i$a$-require-LoaderInstaller$splitOptiFine$1":I
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\u65e0\u6cd5\u8bc6\u522b\u7684 OptiFine \u7248\u672c: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .end local v3    # "$i$a$-require-LoaderInstaller$splitOptiFine$1":I
    new-instance v4, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v4
.end method

.method public final substitute(Ljava/lang/String;Ljava/util/Map;Ljava/io/File;)Ljava/lang/String;
    .locals 4
    .param p1, "arg"    # Ljava/lang/String;
    .param p2, "data"    # Ljava/util/Map;
    .param p3, "libDir"    # Ljava/io/File;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/io/File;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "arg"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "data"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "libDir"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 178
    nop

    .line 179
    const-string v0, "["

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "]"

    invoke-static {p1, v0, v1, v2, v3}, Lkotlin/text/StringsKt;->endsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/pymcl/core/version/Maven;->INSTANCE:Lcom/pymcl/core/version/Maven;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v3, "substring(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/pymcl/core/version/Maven;->path(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getPath(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 180
    :cond_0
    new-instance v0, Lkotlin/text/Regex;

    const-string v1, "\\{([A-Z_]+)}"

    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Ljava/lang/CharSequence;

    new-instance v2, Lcom/pymcl/core/loader/LoaderInstaller$$ExternalSyntheticLambda3;

    invoke-direct {v2, p2}, Lcom/pymcl/core/loader/LoaderInstaller$$ExternalSyntheticLambda3;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v1, v2}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v0

    .line 181
    :goto_0
    return-object v0
.end method
