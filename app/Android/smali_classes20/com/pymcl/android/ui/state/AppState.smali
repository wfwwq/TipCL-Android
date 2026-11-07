.class public final Lcom/pymcl/android/ui/state/AppState;
.super Ljava/lang/Object;
.source "AppState.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/ui/state/AppState$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAppState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppState.kt\ncom/pymcl/android/ui/state/AppState\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,341:1\n47#2,4:342\n85#3:346\n113#3,2:347\n85#3:349\n113#3,2:350\n85#3:352\n113#3,2:353\n85#3:355\n113#3,2:356\n85#3:358\n113#3,2:359\n85#3:361\n113#3,2:362\n85#3:364\n113#3,2:365\n85#3:367\n113#3,2:368\n85#3:370\n113#3,2:371\n85#3:373\n113#3,2:374\n85#3:376\n113#3,2:377\n85#3:379\n113#3,2:380\n85#3:382\n113#3,2:383\n1960#4,3:385\n1739#4:388\n1814#4,3:389\n777#4:392\n873#4,2:393\n1739#4:395\n1814#4,3:396\n363#4,7:399\n1739#4:406\n1814#4,3:407\n296#4,2:410\n2945#4,3:412\n1739#4:415\n1814#4,3:416\n296#4,2:419\n1960#4,3:422\n1#5:421\n*S KotlinDebug\n*F\n+ 1 AppState.kt\ncom/pymcl/android/ui/state/AppState\n*L\n141#1:342,4\n67#1:346\n67#1:347,2\n68#1:349\n68#1:350,2\n70#1:352\n70#1:353,2\n72#1:355\n72#1:356,2\n77#1:358\n77#1:359,2\n78#1:361\n78#1:362,2\n79#1:364\n79#1:365,2\n81#1:367\n81#1:368,2\n83#1:370\n83#1:371,2\n84#1:373\n84#1:374,2\n89#1:376\n89#1:377,2\n91#1:379\n91#1:380,2\n94#1:382\n94#1:383,2\n98#1:385,3\n108#1:388\n108#1:389,3\n111#1:392\n111#1:393,2\n111#1:395\n111#1:396,3\n144#1:399,7\n153#1:406\n153#1:407,3\n154#1:410,2\n157#1:412,3\n160#1:415\n160#1:416,3\n161#1:419,2\n177#1:422,3\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u0007\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010#\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000e\u0010i\u001a\u00020\u001a2\u0006\u0010j\u001a\u00020)J\u0006\u0010s\u001a\u00020tJ\u000e\u0010}\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020\u0013J\u0010\u0010}\u001a\u00020~2\u0008\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\u0010\u0010\u0082\u0001\u001a\u00020~2\u0007\u0010\u0080\u0001\u001a\u00020-J\u0014\u0010\u0083\u0001\u001a\u00020~2\u000b\u0008\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010-J&\u0010\u0086\u0001\u001a\u00020~2\u0007\u0010\u0087\u0001\u001a\u00020)2\t\u0008\u0002\u0010\u0088\u0001\u001a\u00020)2\t\u0008\u0002\u0010\u0089\u0001\u001a\u00020)J\u001d\u0010\u008a\u0001\u001a\u00020~2\u0014\u0010\u008b\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u008c\u0001J;\u0010\u008f\u0001\u001a\u00030\u0090\u00012+\u0010\u0091\u0001\u001a&\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020~0\u0093\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0092\u0001\u00a2\u0006\u0003\u0008\u0094\u0001\u00a2\u0006\u0003\u0010\u0095\u0001J(\u0010\u0096\u0001\u001a\u00020~2\u0007\u0010\u0097\u0001\u001a\u00020)2\u0014\u0010\u008b\u0001\u001a\u000f\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u0002030\u008c\u0001H\u0002J\u0008\u0010\u0098\u0001\u001a\u00030\u0090\u0001J\u0010\u0010\u0099\u0001\u001a\u00020~H\u0086@\u00a2\u0006\u0003\u0010\u009a\u0001J\u0010\u0010\u009f\u0001\u001a\u00020\u001a2\u0007\u0010\u0097\u0001\u001a\u00020)J\u0010\u0010\u00a0\u0001\u001a\u00020\u001a2\u0007\u0010\u0097\u0001\u001a\u00020)J\'\u0010\u00a1\u0001\u001a\u0017\u0012\u0006\u0012\u0004\u0018\u00010?\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020~0\u0092\u00012\u0007\u0010\u0097\u0001\u001a\u00020)H\u0002J\u0093\u0001\u0010\u00a2\u0001\u001a\u00020\u001a2\u0007\u0010\u0087\u0001\u001a\u00020)2\t\u0008\u0002\u0010\u0089\u0001\u001a\u00020)2\u000b\u0008\u0002\u0010\u00a3\u0001\u001a\u0004\u0018\u00010)2\u0016\u0008\u0002\u0010\u00a4\u0001\u001a\u000f\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020~0\u008c\u00012K\u0010\u0091\u0001\u001aF\u0008\u0001\u0012*\u0012(\u0012\u0006\u0012\u0004\u0018\u00010?\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020~0\u0092\u0001\u00a2\u0006\u000e\u0008\u00a5\u0001\u0012\t\u0008j\u0012\u0005\u0008\u0008(\u00a6\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020)0\u0093\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0092\u0001\u00a2\u0006\u0003\u0010\u00a7\u0001J/\u0010\u00a8\u0001\u001a\u00020\u001a2\u0007\u0010\u00a9\u0001\u001a\u00020)2\u0007\u0010\u00aa\u0001\u001a\u00020)2\t\u0010\u00ab\u0001\u001a\u0004\u0018\u00010)2\t\u0010\u00ac\u0001\u001a\u0004\u0018\u00010)J\u0014\u0010\u00ae\u0001\u001a\u00020~2\u000b\u0008\u0002\u0010\u00af\u0001\u001a\u0004\u0018\u00010)J\u001d\u0010\u00b0\u0001\u001a\u00020~2\u0007\u0010\u00a9\u0001\u001a\u00020)2\u000b\u0008\u0002\u0010\u00aa\u0001\u001a\u0004\u0018\u00010)J\u0007\u0010\u00b1\u0001\u001a\u00020~J\n\u0010\u00b2\u0001\u001a\u00030\u0090\u0001H\u0002J\u0010\u0010\u00b3\u0001\u001a\u00020~H\u0082@\u00a2\u0006\u0003\u0010\u009a\u0001J\u0008\u0010\u00b4\u0001\u001a\u00030\u0090\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00138F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u0012\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008 \u0010\u0012\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR/\u0010!\u001a\u0004\u0018\u00010\u001a2\u0008\u0010\n\u001a\u0004\u0018\u00010\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008&\u0010\u0012\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\u0017\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020)0(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0017\u0010,\u001a\u0008\u0012\u0004\u0012\u00020-0(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010+R\u0017\u0010/\u001a\u0008\u0012\u0004\u0012\u0002000(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010+R\u0017\u00102\u001a\u0008\u0012\u0004\u0012\u0002030(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u0010+R+\u00105\u001a\u00020)2\u0006\u0010\n\u001a\u00020)8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008:\u0010\u0012\u001a\u0004\u00086\u00107\"\u0004\u00088\u00109R+\u0010;\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008>\u0010\u0012\u001a\u0004\u0008<\u0010\u001d\"\u0004\u0008=\u0010\u001fR/\u0010@\u001a\u0004\u0018\u00010?2\u0008\u0010\n\u001a\u0004\u0018\u00010?8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008E\u0010\u0012\u001a\u0004\u0008A\u0010B\"\u0004\u0008C\u0010DR\u0017\u0010F\u001a\u0008\u0012\u0004\u0012\u00020)0(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008G\u0010+R+\u0010H\u001a\u00020)2\u0006\u0010\n\u001a\u00020)8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008K\u0010\u0012\u001a\u0004\u0008I\u00107\"\u0004\u0008J\u00109R+\u0010L\u001a\u00020)2\u0006\u0010\n\u001a\u00020)8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008O\u0010\u0012\u001a\u0004\u0008M\u00107\"\u0004\u0008N\u00109R+\u0010P\u001a\u00020)2\u0006\u0010\n\u001a\u00020)8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008S\u0010\u0012\u001a\u0004\u0008Q\u00107\"\u0004\u0008R\u00109R\u0017\u0010T\u001a\u0008\u0012\u0004\u0012\u00020)0(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008U\u0010+R\u0017\u0010V\u001a\u0008\u0012\u0004\u0012\u00020W0(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008X\u0010+R\u0017\u0010Y\u001a\u0008\u0012\u0004\u0012\u00020)0(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008Z\u0010+R+\u0010[\u001a\u00020)2\u0006\u0010\n\u001a\u00020)8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008^\u0010\u0012\u001a\u0004\u0008\\\u00107\"\u0004\u0008]\u00109R+\u0010_\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008b\u0010\u0012\u001a\u0004\u0008`\u0010\u001d\"\u0004\u0008a\u0010\u001fR+\u0010c\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008f\u0010\u0012\u001a\u0004\u0008d\u0010\u001d\"\u0004\u0008e\u0010\u001fR\u0017\u0010g\u001a\u0008\u0012\u0004\u0012\u00020)0(\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008h\u0010+R\u0014\u0010k\u001a\u0008\u0012\u0004\u0012\u00020)0lX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010m\u001a\u0004\u0018\u00010)X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008n\u00107\"\u0004\u0008o\u00109R\u001a\u0010p\u001a\u00020\u001aX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008q\u0010\u001d\"\u0004\u0008r\u0010\u001fR\u0011\u0010u\u001a\u00020v8F\u00a2\u0006\u0006\u001a\u0004\u0008w\u0010xR\u0011\u0010y\u001a\u00020z\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008{\u0010|R\u0010\u0010\u0084\u0001\u001a\u00030\u0085\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u008d\u0001\u001a\u00030\u008e\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u009b\u0001\u001a\u00030\u009c\u0001X\u0080\u0004\u00a2\u0006\n\n\u0000\u001a\u0006\u0008\u009d\u0001\u0010\u009e\u0001R\u000f\u0010\u00ad\u0001\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000e\u0008\u00b6\u0001\u0012\t\u0008\u00b7\u0001\u0012\u0004\u0008\u0003\u0010\u0000\u00a8\u0006\u00b5\u0001"
    }
    d2 = {
        "Lcom/pymcl/android/ui/state/AppState;",
        "",
        "api",
        "Lcom/pymcl/android/ui/state/LauncherUiApi;",
        "scope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "<init>",
        "(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlinx/coroutines/CoroutineScope;)V",
        "getApi",
        "()Lcom/pymcl/android/ui/state/LauncherUiApi;",
        "<set-?>",
        "Lcom/pymcl/android/ui/state/UiSettings;",
        "settings",
        "getSettings",
        "()Lcom/pymcl/android/ui/state/UiSettings;",
        "setSettings",
        "(Lcom/pymcl/android/ui/state/UiSettings;)V",
        "settings$delegate",
        "Landroidx/compose/runtime/MutableState;",
        "Lcom/pymcl/android/ui/state/NavKey;",
        "current",
        "getCurrent",
        "()Lcom/pymcl/android/ui/state/NavKey;",
        "setCurrent",
        "(Lcom/pymcl/android/ui/state/NavKey;)V",
        "current$delegate",
        "",
        "navForward",
        "getNavForward",
        "()Z",
        "setNavForward",
        "(Z)V",
        "navForward$delegate",
        "sideCollapsed",
        "getSideCollapsed",
        "()Ljava/lang/Boolean;",
        "setSideCollapsed",
        "(Ljava/lang/Boolean;)V",
        "sideCollapsed$delegate",
        "expandedSections",
        "Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "",
        "getExpandedSections",
        "()Landroidx/compose/runtime/snapshots/SnapshotStateList;",
        "dialogs",
        "Lcom/pymcl/android/ui/state/DialogSpec;",
        "getDialogs",
        "toasts",
        "Lcom/pymcl/android/ui/state/Toast;",
        "getToasts",
        "tasks",
        "Lcom/pymcl/android/ui/state/TaskRow;",
        "getTasks",
        "bridge",
        "getBridge",
        "()Ljava/lang/String;",
        "setBridge",
        "(Ljava/lang/String;)V",
        "bridge$delegate",
        "gameRunning",
        "getGameRunning",
        "setGameRunning",
        "gameRunning$delegate",
        "",
        "launchProgress",
        "getLaunchProgress",
        "()Ljava/lang/Float;",
        "setLaunchProgress",
        "(Ljava/lang/Float;)V",
        "launchProgress$delegate",
        "launchLog",
        "getLaunchLog",
        "selectedInstance",
        "getSelectedInstance",
        "setSelectedInstance",
        "selectedInstance$delegate",
        "selectedVersion",
        "getSelectedVersion",
        "setSelectedVersion",
        "selectedVersion$delegate",
        "activeAccount",
        "getActiveAccount",
        "setActiveAccount",
        "activeAccount$delegate",
        "instanceNames",
        "getInstanceNames",
        "installedVersions",
        "Lcom/pymcl/android/ui/state/InstalledVersion;",
        "getInstalledVersions",
        "accountNames",
        "getAccountNames",
        "notes",
        "getNotes",
        "setNotes",
        "notes$delegate",
        "launching",
        "getLaunching",
        "setLaunching",
        "launching$delegate",
        "dataLoaded",
        "getDataLoaded",
        "setDataLoaded",
        "dataLoaded$delegate",
        "activeInstalls",
        "getActiveInstalls",
        "installingInstance",
        "name",
        "activeTaskKeys",
        "",
        "pendingLaunchServer",
        "getPendingLaunchServer$PyMCL_Android_app_debug",
        "setPendingLaunchServer$PyMCL_Android_app_debug",
        "pendingLaunch",
        "getPendingLaunch$PyMCL_Android_app_debug",
        "setPendingLaunch$PyMCL_Android_app_debug",
        "gateInput",
        "Lcom/pymcl/android/ui/state/LaunchGate$Input;",
        "launchVerdict",
        "Lcom/pymcl/android/ui/state/LaunchGate$Verdict;",
        "getLaunchVerdict",
        "()Lcom/pymcl/android/ui/state/LaunchGate$Verdict;",
        "modWatcher",
        "Lcom/pymcl/android/ui/state/ModUpdateWatcher;",
        "getModWatcher",
        "()Lcom/pymcl/android/ui/state/ModUpdateWatcher;",
        "navigate",
        "",
        "k",
        "d",
        "Lcom/pymcl/android/ui/Destination;",
        "open",
        "close",
        "toastSeq",
        "",
        "toast",
        "title",
        "body",
        "kind",
        "updateSettings",
        "f",
        "Lkotlin/Function1;",
        "errors",
        "Lkotlinx/coroutines/CoroutineExceptionHandler;",
        "launch",
        "Lkotlinx/coroutines/Job;",
        "block",
        "Lkotlin/Function2;",
        "Lkotlin/coroutines/Continuation;",
        "Lkotlin/ExtensionFunctionType;",
        "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;",
        "updateTask",
        "id",
        "refreshData",
        "reload",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "taskJobs",
        "Lcom/pymcl/android/ui/state/TaskJobs;",
        "getTaskJobs$PyMCL_Android_app_debug",
        "()Lcom/pymcl/android/ui/state/TaskJobs;",
        "cancelTask",
        "canCancel",
        "progressOf",
        "runTask",
        "dedupeKey",
        "onDone",
        "Lkotlin/ParameterName;",
        "progress",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Z",
        "installVersion",
        "instance",
        "version",
        "loader",
        "loaderVersion",
        "userStopped",
        "startGame",
        "server",
        "startGameFor",
        "resumePendingLaunch",
        "watchGame",
        "handleGameExit",
        "loadInitial",
        "PyMCL-Android:app_debug",
        "Landroidx/compose/runtime/internal/StabilityInferred;",
        "parameters"
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
.field public static final $stable:I


# instance fields
.field private final accountNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final activeAccount$delegate:Landroidx/compose/runtime/MutableState;

.field private final activeInstalls:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final activeTaskKeys:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final api:Lcom/pymcl/android/ui/state/LauncherUiApi;

.field private final bridge$delegate:Landroidx/compose/runtime/MutableState;

.field private final current$delegate:Landroidx/compose/runtime/MutableState;

.field private final dataLoaded$delegate:Landroidx/compose/runtime/MutableState;

.field private final dialogs:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/DialogSpec;",
            ">;"
        }
    .end annotation
.end field

.field private final errors:Lkotlinx/coroutines/CoroutineExceptionHandler;

.field private final expandedSections:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final gameRunning$delegate:Landroidx/compose/runtime/MutableState;

.field private final installedVersions:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/InstalledVersion;",
            ">;"
        }
    .end annotation
.end field

.field private final instanceNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final launchLog:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final launchProgress$delegate:Landroidx/compose/runtime/MutableState;

.field private final launching$delegate:Landroidx/compose/runtime/MutableState;

.field private final modWatcher:Lcom/pymcl/android/ui/state/ModUpdateWatcher;

.field private final navForward$delegate:Landroidx/compose/runtime/MutableState;

.field private final notes$delegate:Landroidx/compose/runtime/MutableState;

.field private pendingLaunch:Z

.field private pendingLaunchServer:Ljava/lang/String;

.field private final scope:Lkotlinx/coroutines/CoroutineScope;

.field private final selectedInstance$delegate:Landroidx/compose/runtime/MutableState;

.field private final selectedVersion$delegate:Landroidx/compose/runtime/MutableState;

.field private final settings$delegate:Landroidx/compose/runtime/MutableState;

.field private final sideCollapsed$delegate:Landroidx/compose/runtime/MutableState;

.field private final taskJobs:Lcom/pymcl/android/ui/state/TaskJobs;

.field private final tasks:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/TaskRow;",
            ">;"
        }
    .end annotation
.end field

.field private toastSeq:J

.field private final toasts:Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/Toast;",
            ">;"
        }
    .end annotation
.end field

.field private userStopped:Z


# direct methods
.method public static synthetic $r8$lambda$GRJMK2AQLPJR2U3wWfMMFzHyAq4(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/pymcl/android/ui/state/AppState;->progressOf$lambda$0(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$WnMooyzcSR3YeulcZYiSPNiNlyA(Lcom/pymcl/android/ui/state/NavKey;)I
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/ui/state/AppState;->navigate$lambda$0(Lcom/pymcl/android/ui/state/NavKey;)I

    move-result p0

    return p0
.end method

.method public static synthetic $r8$lambda$iwN-0Qkd2h1VivDq7FPmqlAD10Q(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/ui/state/AppState;->runTask$lambda$0(Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$nncc9W21y9zU_BF9sfQhBK_2j9o(Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/ui/state/AppState;->cancelTask$lambda$0(Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/pymcl/android/ui/state/AppState;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/pymcl/android/ui/state/LauncherUiApi;Lkotlinx/coroutines/CoroutineScope;)V
    .locals 62
    .param p1, "api"    # Lcom/pymcl/android/ui/state/LauncherUiApi;
    .param p2, "scope"    # Lkotlinx/coroutines/CoroutineScope;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "api"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "scope"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Lcom/pymcl/android/ui/state/AppState;->api:Lcom/pymcl/android/ui/state/LauncherUiApi;

    iput-object v2, v0, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    .line 67
    new-instance v4, Lcom/pymcl/android/ui/state/UiSettings;

    const v60, 0x3fffff

    const/16 v61, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, -0x1

    invoke-direct/range {v4 .. v61}, Lcom/pymcl/android/ui/state/UiSettings;-><init>(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v5, 0x2

    invoke-static {v4, v3, v5, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/ui/state/AppState;->settings$delegate:Landroidx/compose/runtime/MutableState;

    .line 68
    new-instance v4, Lcom/pymcl/android/ui/state/NavKey;

    sget-object v6, Lcom/pymcl/android/ui/Destination;->Launch:Lcom/pymcl/android/ui/Destination;

    invoke-direct {v4, v6, v3, v5, v3}, Lcom/pymcl/android/ui/state/NavKey;-><init>(Lcom/pymcl/android/ui/Destination;Lcom/pymcl/android/ui/state/CatalogKind;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v4, v3, v5, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/ui/state/AppState;->current$delegate:Landroidx/compose/runtime/MutableState;

    .line 70
    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6, v3, v5, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v6

    iput-object v6, v0, Lcom/pymcl/android/ui/state/AppState;->navForward$delegate:Landroidx/compose/runtime/MutableState;

    .line 72
    invoke-static {v3, v3, v5, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v6

    iput-object v6, v0, Lcom/pymcl/android/ui/state/AppState;->sideCollapsed$delegate:Landroidx/compose/runtime/MutableState;

    .line 73
    new-array v4, v4, [Ljava/lang/String;

    const-string v6, "download"

    const/4 v7, 0x0

    .line 78
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    .line 73
    aput-object v6, v4, v7

    invoke-static {v4}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/ui/state/AppState;->expandedSections:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 74
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/ui/state/AppState;->dialogs:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 75
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/ui/state/AppState;->toasts:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 76
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/ui/state/AppState;->tasks:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 77
    const-string v4, "ok"

    invoke-static {v4, v3, v5, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/ui/state/AppState;->bridge$delegate:Landroidx/compose/runtime/MutableState;

    .line 78
    invoke-static {v8, v3, v5, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/ui/state/AppState;->gameRunning$delegate:Landroidx/compose/runtime/MutableState;

    .line 79
    invoke-static {v3, v3, v5, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/ui/state/AppState;->launchProgress$delegate:Landroidx/compose/runtime/MutableState;

    .line 80
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/ui/state/AppState;->launchLog:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 81
    const-string v4, ""

    invoke-static {v4, v3, v5, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v6

    iput-object v6, v0, Lcom/pymcl/android/ui/state/AppState;->selectedInstance$delegate:Landroidx/compose/runtime/MutableState;

    .line 83
    invoke-static {v4, v3, v5, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v6

    iput-object v6, v0, Lcom/pymcl/android/ui/state/AppState;->selectedVersion$delegate:Landroidx/compose/runtime/MutableState;

    .line 84
    invoke-static {v4, v3, v5, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v6

    iput-object v6, v0, Lcom/pymcl/android/ui/state/AppState;->activeAccount$delegate:Landroidx/compose/runtime/MutableState;

    .line 86
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v6

    iput-object v6, v0, Lcom/pymcl/android/ui/state/AppState;->instanceNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 87
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v6

    iput-object v6, v0, Lcom/pymcl/android/ui/state/AppState;->installedVersions:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 88
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v6

    iput-object v6, v0, Lcom/pymcl/android/ui/state/AppState;->accountNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 89
    invoke-static {v4, v3, v5, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/ui/state/AppState;->notes$delegate:Landroidx/compose/runtime/MutableState;

    .line 91
    invoke-static {v8, v3, v5, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/ui/state/AppState;->launching$delegate:Landroidx/compose/runtime/MutableState;

    .line 94
    invoke-static {v8, v3, v5, v3}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    move-result-object v3

    iput-object v3, v0, Lcom/pymcl/android/ui/state/AppState;->dataLoaded$delegate:Landroidx/compose/runtime/MutableState;

    .line 97
    invoke-static {}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateListOf()Landroidx/compose/runtime/snapshots/SnapshotStateList;

    move-result-object v3

    iput-object v3, v0, Lcom/pymcl/android/ui/state/AppState;->activeInstalls:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 100
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v3, Ljava/util/Set;

    iput-object v3, v0, Lcom/pymcl/android/ui/state/AppState;->activeTaskKeys:Ljava/util/Set;

    .line 115
    new-instance v3, Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    invoke-direct {v3, v0}, Lcom/pymcl/android/ui/state/ModUpdateWatcher;-><init>(Lcom/pymcl/android/ui/state/AppState;)V

    iput-object v3, v0, Lcom/pymcl/android/ui/state/AppState;->modWatcher:Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    .line 141
    const/4 v3, 0x0

    .line 342
    .local v3, "$i$f$CoroutineExceptionHandler\\1\\141":I
    sget-object v4, Lkotlinx/coroutines/CoroutineExceptionHandler;->Key:Lkotlinx/coroutines/CoroutineExceptionHandler$Key;

    new-instance v5, Lcom/pymcl/android/ui/state/AppState$special$$inlined$CoroutineExceptionHandler$1;

    invoke-direct {v5, v4, v0}, Lcom/pymcl/android/ui/state/AppState$special$$inlined$CoroutineExceptionHandler$1;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$Key;Lcom/pymcl/android/ui/state/AppState;)V

    check-cast v5, Lkotlinx/coroutines/CoroutineExceptionHandler;

    .line 345
    nop

    .line 141
    .end local v3    # "$i$f$CoroutineExceptionHandler\\1\\141":I
    iput-object v5, v0, Lcom/pymcl/android/ui/state/AppState;->errors:Lkotlinx/coroutines/CoroutineExceptionHandler;

    .line 167
    new-instance v3, Lcom/pymcl/android/ui/state/TaskJobs;

    invoke-direct {v3}, Lcom/pymcl/android/ui/state/TaskJobs;-><init>()V

    iput-object v3, v0, Lcom/pymcl/android/ui/state/AppState;->taskJobs:Lcom/pymcl/android/ui/state/TaskJobs;

    .line 66
    return-void
.end method

.method public static final synthetic access$getActiveTaskKeys$p(Lcom/pymcl/android/ui/state/AppState;)Ljava/util/Set;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/AppState;

    .line 66
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->activeTaskKeys:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic access$getScope$p(Lcom/pymcl/android/ui/state/AppState;)Lkotlinx/coroutines/CoroutineScope;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/AppState;

    .line 66
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    return-object v0
.end method

.method public static final synthetic access$handleGameExit(Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/AppState;
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 66
    invoke-direct {p0, p1}, Lcom/pymcl/android/ui/state/AppState;->handleGameExit(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$progressOf(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;)Lkotlin/jvm/functions/Function2;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/AppState;
    .param p1, "id"    # Ljava/lang/String;

    .line 66
    invoke-direct {p0, p1}, Lcom/pymcl/android/ui/state/AppState;->progressOf(Ljava/lang/String;)Lkotlin/jvm/functions/Function2;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$setLaunching(Lcom/pymcl/android/ui/state/AppState;Z)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/AppState;
    .param p1, "<set-?>"    # Z

    .line 66
    invoke-direct {p0, p1}, Lcom/pymcl/android/ui/state/AppState;->setLaunching(Z)V

    return-void
.end method

.method public static final synthetic access$setUserStopped$p(Lcom/pymcl/android/ui/state/AppState;Z)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/AppState;
    .param p1, "<set-?>"    # Z

    .line 66
    iput-boolean p1, p0, Lcom/pymcl/android/ui/state/AppState;->userStopped:Z

    return-void
.end method

.method public static final synthetic access$updateTask(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/AppState;
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "f"    # Lkotlin/jvm/functions/Function1;

    .line 66
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/ui/state/AppState;->updateTask(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$watchGame(Lcom/pymcl/android/ui/state/AppState;)Lkotlinx/coroutines/Job;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/ui/state/AppState;

    .line 66
    invoke-direct {p0}, Lcom/pymcl/android/ui/state/AppState;->watchGame()Lkotlinx/coroutines/Job;

    move-result-object v0

    return-object v0
.end method

.method private static final cancelTask$lambda$0(Lcom/pymcl/android/ui/state/TaskRow;)Lcom/pymcl/android/ui/state/TaskRow;
    .locals 10
    .param p0, "it"    # Lcom/pymcl/android/ui/state/TaskRow;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    sget-object v5, Lcom/pymcl/android/ui/state/TaskState;->Cancelled:Lcom/pymcl/android/ui/state/TaskState;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "\u5df2\u53d6\u6d88"

    invoke-static {v1, v0}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x27

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    .end local p0    # "it":Lcom/pymcl/android/ui/state/TaskRow;
    .local v1, "it":Lcom/pymcl/android/ui/state/TaskRow;
    invoke-static/range {v1 .. v9}, Lcom/pymcl/android/ui/state/TaskRow;->copy$default(Lcom/pymcl/android/ui/state/TaskRow;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/android/ui/state/TaskRow;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic close$default(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/DialogSpec;ILjava/lang/Object;)V
    .locals 0

    .line 126
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/state/AppState;->close(Lcom/pymcl/android/ui/state/DialogSpec;)V

    return-void
.end method

.method private final handleGameExit(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 24
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    instance-of v0, v7, Lcom/pymcl/android/ui/state/AppState$handleGameExit$1;

    if-eqz v0, :cond_0

    move-object v0, v7

    check-cast v0, Lcom/pymcl/android/ui/state/AppState$handleGameExit$1;

    iget v2, v0, Lcom/pymcl/android/ui/state/AppState$handleGameExit$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v2, v3

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/pymcl/android/ui/state/AppState$handleGameExit$1;->label:I

    sub-int/2addr v2, v3

    iput v2, v0, Lcom/pymcl/android/ui/state/AppState$handleGameExit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/ui/state/AppState$handleGameExit$1;

    invoke-direct {v0, v1, v7}, Lcom/pymcl/android/ui/state/AppState$handleGameExit$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v8, v0

    .local v8, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v9, v8, Lcom/pymcl/android/ui/state/AppState$handleGameExit$1;->result:Ljava/lang/Object;

    .local v9, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 306
    iget v2, v8, Lcom/pymcl/android/ui/state/AppState$handleGameExit$1;->label:I

    packed-switch v2, :pswitch_data_0

    .end local v8    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v9    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v8    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v9    # "$result":Ljava/lang/Object;
    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-AppState$handleGameExit$e$1\\1\\307\\0":I
    iget-object v2, v8, Lcom/pymcl/android/ui/state/AppState$handleGameExit$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/pymcl/android/ui/state/AppState;

    .local v2, "$this$handleGameExit_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/AppState;
    :try_start_0
    invoke-static {v9}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v4, v9

    goto :goto_1

    .end local v0    # "$i$a$-runCatching-AppState$handleGameExit$e$1\\1\\307\\0":I
    .end local v2    # "$this$handleGameExit_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/AppState;
    :pswitch_1
    invoke-static {v9}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 307
    :try_start_1
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v2, v1

    check-cast v2, Lcom/pymcl/android/ui/state/AppState;

    .line 421
    .restart local v2    # "$this$handleGameExit_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/AppState;
    const/4 v3, 0x0

    .line 307
    .local v3, "$i$a$-runCatching-AppState$handleGameExit$e$1\\1\\307\\0":I
    iget-object v4, v2, Lcom/pymcl/android/ui/state/AppState;->api:Lcom/pymcl/android/ui/state/LauncherUiApi;

    iget-boolean v5, v2, Lcom/pymcl/android/ui/state/AppState;->userStopped:Z

    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v8, Lcom/pymcl/android/ui/state/AppState$handleGameExit$1;->L$0:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v8, Lcom/pymcl/android/ui/state/AppState$handleGameExit$1;->label:I

    invoke-interface {v4, v5, v8}, Lcom/pymcl/android/ui/state/LauncherUiApi;->collectGameExit(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_1

    .line 306
    return-object v0

    .line 307
    :cond_1
    move v0, v3

    .end local v3    # "$i$a$-runCatching-AppState$handleGameExit$e$1\\1\\307\\0":I
    .restart local v0    # "$i$a$-runCatching-AppState$handleGameExit$e$1\\1\\307\\0":I
    :goto_1
    check-cast v4, Lcom/pymcl/android/ui/state/GameExitInfo;

    .end local v0    # "$i$a$-runCatching-AppState$handleGameExit$e$1\\1\\307\\0":I
    .end local v2    # "$this$handleGameExit_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/AppState;
    invoke-static {v4}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_2
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 421
    .local v2, "it\\3":Ljava/lang/Throwable;
    const/4 v3, 0x0

    .line 307
    .local v3, "$i$a$-onFailure-AppState$handleGameExit$e$2\\3\\307\\0":I
    iget-object v4, v1, Lcom/pymcl/android/ui/state/AppState;->launchLog:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v4, Ljava/util/Collection;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v6, "[PyMCL] \u8bfb\u53d6\u9000\u51fa\u4fe1\u606f\u5931\u8d25\uff1a{0}"

    invoke-static {v6, v5}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .end local v2    # "it\\3":Ljava/lang/Throwable;
    .end local v3    # "$i$a$-onFailure-AppState$handleGameExit$e$2\\3\\307\\0":I
    :cond_2
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v0, 0x0

    :cond_3
    check-cast v0, Lcom/pymcl/android/ui/state/GameExitInfo;

    if-nez v0, :cond_4

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 308
    .local v0, "e":Lcom/pymcl/android/ui/state/GameExitInfo;
    :cond_4
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/GameExitInfo;->getDurationSec()J

    move-result-wide v2

    const/16 v4, 0x3c

    int-to-long v4, v4

    div-long v10, v2, v4

    .line 309
    .local v10, "mins":J
    iget-object v2, v1, Lcom/pymcl/android/ui/state/AppState;->launchLog:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/GameExitInfo;->getExitCode()Ljava/lang/Integer;

    move-result-object v3

    const/4 v6, 0x0

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_6

    :cond_5
    const-string v3, "\u672a\u77e5"

    new-array v12, v6, [Ljava/lang/Object;

    invoke-static {v3, v12}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    :cond_6
    invoke-static {v10, v11}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/GameExitInfo;->getDurationSec()J

    move-result-wide v13

    rem-long/2addr v13, v4

    invoke-static {v13, v14}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v4

    filled-new-array {v3, v12, v4}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "[PyMCL] \u9000\u51fa\u7801 {0} \u00b7 \u672c\u6b21\u6e38\u620f {1} \u5206 {2} \u79d2\uff08\u5df2\u8bb0\u5165\u6e38\u620f\u65f6\u957f\uff09"

    invoke-static {v4, v3}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 310
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/GameExitInfo;->getCrash()Lcom/pymcl/android/ui/state/CrashInfo;

    move-result-object v2

    if-eqz v2, :cond_7

    .line 312
    sget-object v2, Lcom/pymcl/android/data/CrashScenes;->INSTANCE:Lcom/pymcl/android/data/CrashScenes;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/GameExitInfo;->getDurationSec()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/pymcl/android/data/CrashScenes;->ofGameExit(J)Lcom/pymcl/android/ui/state/CrashScene;

    move-result-object v21

    .line 313
    .local v21, "scene":Lcom/pymcl/android/ui/state/CrashScene;
    invoke-virtual/range {v21 .. v21}, Lcom/pymcl/android/ui/state/CrashScene;->getTitle()Ljava/lang/String;

    move-result-object v2

    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/GameExitInfo;->getCrash()Lcom/pymcl/android/ui/state/CrashInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/pymcl/android/ui/state/CrashInfo;->getTitle()Ljava/lang/String;

    move-result-object v3

    const-string v4, "error"

    invoke-virtual {v1, v2, v3, v4}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lcom/pymcl/android/ui/state/DialogSpec$Crash;

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/GameExitInfo;->getCrash()Lcom/pymcl/android/ui/state/CrashInfo;

    move-result-object v12

    const/16 v22, 0xff

    const/16 v23, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v12 .. v23}, Lcom/pymcl/android/ui/state/CrashInfo;->copy$default(Lcom/pymcl/android/ui/state/CrashInfo;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/pymcl/android/ui/state/CrashScene;ILjava/lang/Object;)Lcom/pymcl/android/ui/state/CrashInfo;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/pymcl/android/ui/state/DialogSpec$Crash;-><init>(Lcom/pymcl/android/ui/state/CrashInfo;)V

    check-cast v2, Lcom/pymcl/android/ui/state/DialogSpec;

    invoke-virtual {v1, v2}, Lcom/pymcl/android/ui/state/AppState;->open(Lcom/pymcl/android/ui/state/DialogSpec;)V

    .end local v21    # "scene":Lcom/pymcl/android/ui/state/CrashScene;
    goto :goto_3

    .line 315
    :cond_7
    iget-boolean v2, v1, Lcom/pymcl/android/ui/state/AppState;->userStopped:Z

    if-nez v2, :cond_8

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/GameExitInfo;->getDurationSec()J

    move-result-wide v2

    const-wide/16 v4, 0x3c

    cmp-long v2, v2, v4

    if-ltz v2, :cond_8

    invoke-static {v10, v11}, Lkotlin/coroutines/jvm/internal/Boxing;->boxLong(J)Ljava/lang/Long;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "\u672c\u6b21\u6e38\u73a9 {0} \u5206\u949f"

    invoke-static {v3, v2}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v2, "\u6e38\u620f\u5df2\u9000\u51fa"

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/pymcl/android/ui/state/AppState;->toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 316
    :cond_8
    :goto_3
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final navigate$lambda$0(Lcom/pymcl/android/ui/state/NavKey;)I
    .locals 2
    .param p0, "n"    # Lcom/pymcl/android/ui/state/NavKey;

    const-string v0, "n"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    invoke-static {}, Lcom/pymcl/android/ui/Destination;->getEntries()Lkotlin/enums/EnumEntries;

    move-result-object v0

    invoke-virtual {p0}, Lcom/pymcl/android/ui/state/NavKey;->getDest()Lcom/pymcl/android/ui/Destination;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/enums/EnumEntries;->indexOf(Ljava/lang/Object;)I

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    invoke-virtual {p0}, Lcom/pymcl/android/ui/state/NavKey;->getCatalog()Lcom/pymcl/android/ui/state/CatalogKind;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/CatalogKind;->ordinal()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method private final progressOf(Ljava/lang/String;)Lkotlin/jvm/functions/Function2;
    .locals 1
    .param p1, "id"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlin/jvm/functions/Function2<",
            "Ljava/lang/Float;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 180
    new-instance v0, Lcom/pymcl/android/ui/state/AppState$$ExternalSyntheticLambda3;

    invoke-direct {v0, p0, p1}, Lcom/pymcl/android/ui/state/AppState$$ExternalSyntheticLambda3;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;)V

    .line 182
    return-object v0
.end method

.method private static final progressOf$lambda$0(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;)Lkotlin/Unit;
    .locals 8
    .param p0, "this$0"    # Lcom/pymcl/android/ui/state/AppState;
    .param p1, "$id"    # Ljava/lang/String;
    .param p2, "p"    # Ljava/lang/Float;
    .param p3, "d"    # Ljava/lang/String;

    const-string v0, "d"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 181
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v2, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    .end local p0    # "this$0":Lcom/pymcl/android/ui/state/AppState;
    .end local p1    # "$id":Ljava/lang/String;
    .end local p2    # "p":Ljava/lang/Float;
    .end local p3    # "d":Ljava/lang/String;
    .local v3, "this$0":Lcom/pymcl/android/ui/state/AppState;
    .local v4, "$id":Ljava/lang/String;
    .local v5, "p":Ljava/lang/Float;
    .local v6, "d":Ljava/lang/String;
    invoke-direct/range {v2 .. v7}, Lcom/pymcl/android/ui/state/AppState$progressOf$1$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .end local v3    # "this$0":Lcom/pymcl/android/ui/state/AppState;
    .end local v4    # "$id":Ljava/lang/String;
    .end local v5    # "p":Ljava/lang/Float;
    .end local v6    # "d":Ljava/lang/String;
    .restart local p0    # "this$0":Lcom/pymcl/android/ui/state/AppState;
    .restart local p1    # "$id":Ljava/lang/String;
    .restart local p2    # "p":Ljava/lang/Float;
    .restart local p3    # "d":Ljava/lang/String;
    move-object v4, v2

    check-cast v4, Lkotlin/jvm/functions/Function2;

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 182
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic runTask$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Z
    .locals 6

    .line 185
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const-string p2, "download"

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const/4 p3, 0x0

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    new-instance p4, Lcom/pymcl/android/ui/state/AppState$$ExternalSyntheticLambda1;

    invoke-direct {p4}, Lcom/pymcl/android/ui/state/AppState$$ExternalSyntheticLambda1;-><init>()V

    :cond_2
    move-object v4, p4

    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/pymcl/android/ui/state/AppState;->runTask(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Z

    move-result p0

    return p0
.end method

.method private static final runTask$lambda$0(Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 185
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private final setCurrent(Lcom/pymcl/android/ui/state/NavKey;)V
    .locals 5
    .param p1, "<set-?>"    # Lcom/pymcl/android/ui/state/NavKey;

    .line 68
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->current$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p1

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 350
    .local v4, "$i$f$setValue\\1\\68":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 351
    nop

    .line 68
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\68":I
    return-void
.end method

.method private final setDataLoaded(Z)V
    .locals 5
    .param p1, "<set-?>"    # Z

    .line 94
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->dataLoaded$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 383
    .local v4, "$i$f$setValue\\1\\94":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 384
    nop

    .line 94
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\94":I
    return-void
.end method

.method private final setLaunching(Z)V
    .locals 5
    .param p1, "<set-?>"    # Z

    .line 91
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->launching$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 380
    .local v4, "$i$f$setValue\\1\\91":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 381
    nop

    .line 91
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\91":I
    return-void
.end method

.method private final setNavForward(Z)V
    .locals 5
    .param p1, "<set-?>"    # Z

    .line 70
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->navForward$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 353
    .local v4, "$i$f$setValue\\1\\70":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 354
    nop

    .line 70
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\70":I
    return-void
.end method

.method public static synthetic startGame$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 242
    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/pymcl/android/ui/state/AppState;->startGame(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic startGameFor$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 280
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/pymcl/android/ui/state/AppState;->startGameFor(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic toast$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 129
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const-string p2, ""

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const-string p3, "ok"

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private final updateTask(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 8
    .param p1, "id"    # Ljava/lang/String;
    .param p2, "f"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/android/ui/state/TaskRow;",
            "Lcom/pymcl/android/ui/state/TaskRow;",
            ">;)V"
        }
    .end annotation

    .line 144
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->tasks:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/util/List;

    .local v0, "$this$indexOfFirst\\1":Ljava/util/List;
    const/4 v1, 0x0

    .line 399
    .local v1, "$i$f$indexOfFirst\\1\\144":I
    const/4 v2, 0x0

    .line 400
    .local v2, "index\\1":I
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 401
    .local v4, "item\\1":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Lcom/pymcl/android/ui/state/TaskRow;

    .local v5, "it\\2":Lcom/pymcl/android/ui/state/TaskRow;
    const/4 v6, 0x0

    .line 144
    .local v6, "$i$a$-indexOfFirst-AppState$updateTask$i$1\\2\\401\\0":I
    invoke-virtual {v5}, Lcom/pymcl/android/ui/state/TaskRow;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    .line 401
    .end local v5    # "it\\2":Lcom/pymcl/android/ui/state/TaskRow;
    .end local v6    # "$i$a$-indexOfFirst-AppState$updateTask$i$1\\2\\401\\0":I
    if-eqz v5, :cond_0

    .line 402
    goto :goto_1

    .line 403
    :cond_0
    nop

    .end local v4    # "item\\1":Ljava/lang/Object;
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 405
    :cond_1
    const/4 v3, -0x1

    move v2, v3

    .line 144
    .end local v0    # "$this$indexOfFirst\\1":Ljava/util/List;
    .end local v1    # "$i$f$indexOfFirst\\1\\144":I
    .end local v2    # "index\\1":I
    :goto_1
    nop

    .local v2, "i":I
    if-ltz v2, :cond_2

    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->tasks:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState;->tasks:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v1, v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method

.method private final watchGame()Lkotlinx/coroutines/Job;
    .locals 6

    .line 299
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v1, Lcom/pymcl/android/ui/state/AppState$watchGame$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/ui/state/AppState$watchGame$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    .line 303
    return-object v0
.end method


# virtual methods
.method public final canCancel(Ljava/lang/String;)Z
    .locals 10
    .param p1, "id"    # Ljava/lang/String;

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->taskJobs:Lcom/pymcl/android/ui/state/TaskJobs;

    invoke-virtual {v0, p1}, Lcom/pymcl/android/ui/state/TaskJobs;->canCancel(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->tasks:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any\\1":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 422
    .local v2, "$i$f$any\\1\\177":I
    instance-of v3, v0, Ljava/util/Collection;

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    move v0, v1

    goto :goto_1

    .line 423
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    .local v5, "element\\1":Ljava/lang/Object;
    move-object v6, v5

    check-cast v6, Lcom/pymcl/android/ui/state/TaskRow;

    .local v6, "it\\2":Lcom/pymcl/android/ui/state/TaskRow;
    const/4 v7, 0x0

    .line 177
    .local v7, "$i$a$-any-AppState$canCancel$1\\2\\423\\0":I
    invoke-virtual {v6}, Lcom/pymcl/android/ui/state/TaskRow;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-virtual {v6}, Lcom/pymcl/android/ui/state/TaskRow;->getState()Lcom/pymcl/android/ui/state/TaskState;

    move-result-object v8

    sget-object v9, Lcom/pymcl/android/ui/state/TaskState;->Running:Lcom/pymcl/android/ui/state/TaskState;

    if-ne v8, v9, :cond_2

    move v6, v4

    goto :goto_0

    :cond_2
    move v6, v1

    .line 423
    .end local v6    # "it\\2":Lcom/pymcl/android/ui/state/TaskRow;
    .end local v7    # "$i$a$-any-AppState$canCancel$1\\2\\423\\0":I
    :goto_0
    if-eqz v6, :cond_1

    move v0, v4

    goto :goto_1

    .line 424
    .end local v5    # "element\\1":Ljava/lang/Object;
    :cond_3
    move v0, v1

    .line 177
    .end local v0    # "$this$any\\1":Ljava/lang/Iterable;
    .end local v2    # "$i$f$any\\1\\177":I
    :goto_1
    if-eqz v0, :cond_4

    move v1, v4

    :cond_4
    return v1
.end method

.method public final cancelTask(Ljava/lang/String;)Z
    .locals 1
    .param p1, "id"    # Ljava/lang/String;

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->taskJobs:Lcom/pymcl/android/ui/state/TaskJobs;

    invoke-virtual {v0, p1}, Lcom/pymcl/android/ui/state/TaskJobs;->cancel(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 172
    :cond_0
    new-instance v0, Lcom/pymcl/android/ui/state/AppState$$ExternalSyntheticLambda2;

    invoke-direct {v0}, Lcom/pymcl/android/ui/state/AppState$$ExternalSyntheticLambda2;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/pymcl/android/ui/state/AppState;->updateTask(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 173
    const/4 v0, 0x1

    return v0
.end method

.method public final close(Lcom/pymcl/android/ui/state/DialogSpec;)V
    .locals 1
    .param p1, "d"    # Lcom/pymcl/android/ui/state/DialogSpec;

    .line 126
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->dialogs:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    if-nez p1, :cond_0

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->removeLastOrNull(Ljava/util/List;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    :goto_0
    return-void
.end method

.method public final gateInput()Lcom/pymcl/android/ui/state/LaunchGate$Input;
    .locals 20

    .line 106
    move-object/from16 v0, p0

    .line 107
    iget-object v1, v0, Lcom/pymcl/android/ui/state/AppState;->instanceNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->toList()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getSelectedInstance()Ljava/lang/String;

    move-result-object v4

    .line 108
    iget-object v1, v0, Lcom/pymcl/android/ui/state/AppState;->installedVersions:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v1, Ljava/lang/Iterable;

    .local v1, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 388
    .local v2, "$i$f$map\\1\\108":I
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v5, Ljava/util/Collection;

    .local v5, "destination\\2":Ljava/util/Collection;
    move-object v7, v1

    .local v7, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 389
    .local v8, "$i$f$mapTo\\2\\388":I
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_0

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    .line 390
    .local v10, "item\\2":Ljava/lang/Object;
    move-object v11, v10

    check-cast v11, Lcom/pymcl/android/ui/state/InstalledVersion;

    .local v11, "it\\3":Lcom/pymcl/android/ui/state/InstalledVersion;
    const/4 v12, 0x0

    .line 108
    .local v12, "$i$a$-map-AppState$gateInput$1\\3\\390\\0":I
    invoke-virtual {v11}, Lcom/pymcl/android/ui/state/InstalledVersion;->getId()Ljava/lang/String;

    move-result-object v11

    .line 390
    .end local v11    # "it\\3":Lcom/pymcl/android/ui/state/InstalledVersion;
    .end local v12    # "$i$a$-map-AppState$gateInput$1\\3\\390\\0":I
    invoke-interface {v5, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 391
    .end local v10    # "item\\2":Ljava/lang/Object;
    :cond_0
    nop

    .end local v5    # "destination\\2":Ljava/util/Collection;
    .end local v7    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapTo\\2\\388":I
    check-cast v5, Ljava/util/List;

    .line 388
    nop

    .line 108
    .end local v1    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v2    # "$i$f$map\\1\\108":I
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getSelectedVersion()Ljava/lang/String;

    move-result-object v1

    .line 109
    iget-object v2, v0, Lcom/pymcl/android/ui/state/AppState;->accountNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    const/4 v7, 0x1

    xor-int/2addr v2, v7

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getGameRunning()Z

    move-result v8

    .line 110
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getLaunching()Z

    move-result v9

    if-nez v9, :cond_2

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getLaunchProgress()Ljava/lang/Float;

    move-result-object v9

    if-eqz v9, :cond_1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    move v9, v7

    :goto_2
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/AppState;->getSelectedInstance()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v10}, Lcom/pymcl/android/ui/state/AppState;->installingInstance(Ljava/lang/String;)Z

    move-result v10

    .line 111
    iget-object v11, v0, Lcom/pymcl/android/ui/state/AppState;->installedVersions:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v11, Ljava/lang/Iterable;

    .local v11, "$this$filter\\4":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 392
    .local v12, "$i$f$filter\\4\\111":I
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    check-cast v13, Ljava/util/Collection;

    .local v13, "destination\\5":Ljava/util/Collection;
    move-object v14, v11

    .local v14, "$this$filterTo\\5":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 393
    .local v15, "$i$f$filterTo\\5\\392":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_3
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_4

    move/from16 v17, v7

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element\\5":Ljava/lang/Object;
    move-object/from16 v18, v7

    check-cast v18, Lcom/pymcl/android/ui/state/InstalledVersion;

    .local v18, "it\\6":Lcom/pymcl/android/ui/state/InstalledVersion;
    const/16 v19, 0x0

    .line 111
    .local v19, "$i$a$-filter-AppState$gateInput$2\\6\\393\\0":I
    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/android/ui/state/InstalledVersion;->getIncomplete()Z

    move-result v18

    .line 393
    .end local v18    # "it\\6":Lcom/pymcl/android/ui/state/InstalledVersion;
    .end local v19    # "$i$a$-filter-AppState$gateInput$2\\6\\393\\0":I
    if-eqz v18, :cond_3

    invoke-interface {v13, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_3
    move/from16 v7, v17

    goto :goto_3

    .line 394
    .end local v7    # "element\\5":Ljava/lang/Object;
    :cond_4
    move/from16 v17, v7

    .end local v13    # "destination\\5":Ljava/util/Collection;
    .end local v14    # "$this$filterTo\\5":Ljava/lang/Iterable;
    .end local v15    # "$i$f$filterTo\\5\\392":I
    move-object v7, v13

    check-cast v7, Ljava/util/List;

    .line 392
    nop

    .end local v11    # "$this$filter\\4":Ljava/lang/Iterable;
    .end local v12    # "$i$f$filter\\4\\111":I
    check-cast v7, Ljava/lang/Iterable;

    .line 111
    nop

    .local v7, "$this$map\\7":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 395
    .local v11, "$i$f$map\\7\\111":I
    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v7, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v12, v6}, Ljava/util/ArrayList;-><init>(I)V

    move-object v6, v12

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination\\8":Ljava/util/Collection;
    move-object v12, v7

    .local v12, "$this$mapTo\\8":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 396
    .local v13, "$i$f$mapTo\\8\\395":I
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_5

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .line 397
    .local v15, "item\\8":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Lcom/pymcl/android/ui/state/InstalledVersion;

    .local v16, "it\\9":Lcom/pymcl/android/ui/state/InstalledVersion;
    const/16 v18, 0x0

    .line 111
    .local v18, "$i$a$-map-AppState$gateInput$3\\9\\397\\0":I
    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/android/ui/state/InstalledVersion;->getId()Ljava/lang/String;

    move-result-object v0

    .line 397
    .end local v16    # "it\\9":Lcom/pymcl/android/ui/state/InstalledVersion;
    .end local v18    # "$i$a$-map-AppState$gateInput$3\\9\\397\\0":I
    invoke-interface {v6, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    goto :goto_4

    .line 398
    .end local v15    # "item\\8":Ljava/lang/Object;
    :cond_5
    nop

    .end local v6    # "destination\\8":Ljava/util/Collection;
    .end local v12    # "$this$mapTo\\8":Ljava/lang/Iterable;
    .end local v13    # "$i$f$mapTo\\8\\395":I
    move-object v0, v6

    check-cast v0, Ljava/util/List;

    .line 395
    nop

    .end local v7    # "$this$map\\7":Ljava/lang/Iterable;
    .end local v11    # "$i$f$map\\7\\111":I
    check-cast v0, Ljava/lang/Iterable;

    .line 111
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/pymcl/android/ui/state/AppState;->getDataLoaded()Z

    move-result v0

    .line 106
    xor-int/lit8 v12, v0, 0x1

    move v7, v2

    new-instance v2, Lcom/pymcl/android/ui/state/LaunchGate$Input;

    move-object v6, v1

    invoke-direct/range {v2 .. v12}, Lcom/pymcl/android/ui/state/LaunchGate$Input;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;ZZZZLjava/util/Set;Z)V

    .line 112
    return-object v2
.end method

.method public final getAccountNames()Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 88
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->accountNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object v0
.end method

.method public final getActiveAccount()Ljava/lang/String;
    .locals 4

    .line 84
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->activeAccount$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 373
    .local v3, "$i$f$getValue\\1\\84":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\84":I
    check-cast v0, Ljava/lang/String;

    .line 84
    return-object v0
.end method

.method public final getActiveInstalls()Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 97
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->activeInstalls:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object v0
.end method

.method public final getApi()Lcom/pymcl/android/ui/state/LauncherUiApi;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->api:Lcom/pymcl/android/ui/state/LauncherUiApi;

    return-object v0
.end method

.method public final getBridge()Ljava/lang/String;
    .locals 4

    .line 77
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->bridge$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 358
    .local v3, "$i$f$getValue\\1\\77":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\77":I
    check-cast v0, Ljava/lang/String;

    .line 77
    return-object v0
.end method

.method public final getCurrent()Lcom/pymcl/android/ui/state/NavKey;
    .locals 4

    .line 68
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->current$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 349
    .local v3, "$i$f$getValue\\1\\68":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\68":I
    check-cast v0, Lcom/pymcl/android/ui/state/NavKey;

    .line 68
    return-object v0
.end method

.method public final getDataLoaded()Z
    .locals 4

    .line 94
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->dataLoaded$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 382
    .local v3, "$i$f$getValue\\1\\94":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\94":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 94
    return v0
.end method

.method public final getDialogs()Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/DialogSpec;",
            ">;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->dialogs:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object v0
.end method

.method public final getExpandedSections()Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 73
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->expandedSections:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object v0
.end method

.method public final getGameRunning()Z
    .locals 4

    .line 78
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->gameRunning$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 361
    .local v3, "$i$f$getValue\\1\\78":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\78":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 78
    return v0
.end method

.method public final getInstalledVersions()Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/InstalledVersion;",
            ">;"
        }
    .end annotation

    .line 87
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->installedVersions:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object v0
.end method

.method public final getInstanceNames()Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->instanceNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object v0
.end method

.method public final getLaunchLog()Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->launchLog:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object v0
.end method

.method public final getLaunchProgress()Ljava/lang/Float;
    .locals 4

    .line 79
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->launchProgress$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 364
    .local v3, "$i$f$getValue\\1\\79":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\79":I
    check-cast v0, Ljava/lang/Float;

    .line 79
    return-object v0
.end method

.method public final getLaunchVerdict()Lcom/pymcl/android/ui/state/LaunchGate$Verdict;
    .locals 2

    .line 113
    sget-object v0, Lcom/pymcl/android/ui/state/LaunchGate;->INSTANCE:Lcom/pymcl/android/ui/state/LaunchGate;

    invoke-virtual {p0}, Lcom/pymcl/android/ui/state/AppState;->gateInput()Lcom/pymcl/android/ui/state/LaunchGate$Input;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/state/LaunchGate;->check(Lcom/pymcl/android/ui/state/LaunchGate$Input;)Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    move-result-object v0

    return-object v0
.end method

.method public final getLaunching()Z
    .locals 4

    .line 91
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->launching$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 379
    .local v3, "$i$f$getValue\\1\\91":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\91":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 91
    return v0
.end method

.method public final getModWatcher()Lcom/pymcl/android/ui/state/ModUpdateWatcher;
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->modWatcher:Lcom/pymcl/android/ui/state/ModUpdateWatcher;

    return-object v0
.end method

.method public final getNavForward()Z
    .locals 4

    .line 70
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->navForward$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 352
    .local v3, "$i$f$getValue\\1\\70":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\70":I
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 70
    return v0
.end method

.method public final getNotes()Ljava/lang/String;
    .locals 4

    .line 89
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->notes$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 376
    .local v3, "$i$f$getValue\\1\\89":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\89":I
    check-cast v0, Ljava/lang/String;

    .line 89
    return-object v0
.end method

.method public final getPendingLaunch$PyMCL_Android_app_debug()Z
    .locals 1

    .line 103
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/AppState;->pendingLaunch:Z

    return v0
.end method

.method public final getPendingLaunchServer$PyMCL_Android_app_debug()Ljava/lang/String;
    .locals 1

    .line 102
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->pendingLaunchServer:Ljava/lang/String;

    return-object v0
.end method

.method public final getSelectedInstance()Ljava/lang/String;
    .locals 4

    .line 81
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->selectedInstance$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 367
    .local v3, "$i$f$getValue\\1\\81":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\81":I
    check-cast v0, Ljava/lang/String;

    .line 81
    return-object v0
.end method

.method public final getSelectedVersion()Ljava/lang/String;
    .locals 4

    .line 83
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->selectedVersion$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 370
    .local v3, "$i$f$getValue\\1\\83":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\83":I
    check-cast v0, Ljava/lang/String;

    .line 83
    return-object v0
.end method

.method public final getSettings()Lcom/pymcl/android/ui/state/UiSettings;
    .locals 4

    .line 67
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->settings$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 346
    .local v3, "$i$f$getValue\\1\\67":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\67":I
    check-cast v0, Lcom/pymcl/android/ui/state/UiSettings;

    .line 67
    return-object v0
.end method

.method public final getSideCollapsed()Ljava/lang/Boolean;
    .locals 4

    .line 72
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->sideCollapsed$delegate:Landroidx/compose/runtime/MutableState;

    check-cast v0, Landroidx/compose/runtime/State;

    .local v0, "$this$getValue\\1":Landroidx/compose/runtime/State;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p0

    .local v2, "this_\\1":Ljava/lang/Object;
    const/4 v3, 0x0

    .line 355
    .local v3, "$i$f$getValue\\1\\72":I
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    move-result-object v0

    .end local v0    # "$this$getValue\\1":Landroidx/compose/runtime/State;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "this_\\1":Ljava/lang/Object;
    .end local v3    # "$i$f$getValue\\1\\72":I
    check-cast v0, Ljava/lang/Boolean;

    .line 72
    return-object v0
.end method

.method public final getTaskJobs$PyMCL_Android_app_debug()Lcom/pymcl/android/ui/state/TaskJobs;
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->taskJobs:Lcom/pymcl/android/ui/state/TaskJobs;

    return-object v0
.end method

.method public final getTasks()Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/TaskRow;",
            ">;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->tasks:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object v0
.end method

.method public final getToasts()Landroidx/compose/runtime/snapshots/SnapshotStateList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/compose/runtime/snapshots/SnapshotStateList<",
            "Lcom/pymcl/android/ui/state/Toast;",
            ">;"
        }
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->toasts:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    return-object v0
.end method

.method public final installVersion(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 20
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "loader"    # Ljava/lang/String;
    .param p4, "loaderVersion"    # Ljava/lang/String;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    const-string v0, "instance"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "version"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 211
    sget-object v0, Lcom/pymcl/android/ui/state/InstallKeys;->INSTANCE:Lcom/pymcl/android/ui/state/InstallKeys;

    move-object/from16 v5, p4

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/pymcl/android/ui/state/InstallKeys;->key(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 212
    .local v7, "key":Ljava/lang/String;
    iget-object v0, v1, Lcom/pymcl/android/ui/state/AppState;->activeInstalls:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v0, v7}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    const-string v0, "\u300c{0}\u300d\u6b63\u5728\u5b89\u88c5\uff0c\u8fdb\u5ea6\u770b\u4e0b\u8f7d\u4efb\u52a1"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v0, v8}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v8, "info"

    const-string v9, "\u5df2\u5728\u961f\u5217\u4e2d"

    invoke-virtual {v1, v9, v0, v8}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return v6

    .line 213
    :cond_0
    iget-object v0, v1, Lcom/pymcl/android/ui/state/AppState;->activeInstalls:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 214
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "install-"

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v10, "-"

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 215
    .local v12, "id":Ljava/lang/String;
    iget-object v0, v1, Lcom/pymcl/android/ui/state/AppState;->tasks:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    if-eqz v4, :cond_1

    .line 421
    move-object/from16 v8, p3

    .local v8, "it\\1":Ljava/lang/String;
    const/4 v9, 0x0

    .line 215
    .local v9, "$i$a$-let-AppState$installVersion$1\\1\\215\\0":I
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .end local v8    # "it\\1":Ljava/lang/String;
    .end local v9    # "$i$a$-let-AppState$installVersion$1\\1\\215\\0":I
    if-nez v8, :cond_2

    :cond_1
    const-string v8, ""

    :cond_2
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    const-string v9, "\u5b89\u88c5 {0}"

    invoke-static {v9, v8}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v13

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    sget-object v15, Lcom/pymcl/android/ui/state/TaskState;->Running:Lcom/pymcl/android/ui/state/TaskState;

    new-instance v11, Lcom/pymcl/android/ui/state/TaskRow;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x30

    const/16 v19, 0x0

    invoke-direct/range {v11 .. v19}, Lcom/pymcl/android/ui/state/TaskRow;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v6, v11}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(ILjava/lang/Object;)V

    .line 216
    iget-object v13, v1, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    sget-object v15, Lkotlinx/coroutines/CoroutineStart;->LAZY:Lkotlinx/coroutines/CoroutineStart;

    new-instance v0, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;

    const/4 v8, 0x0

    move-object v6, v12

    .end local v12    # "id":Ljava/lang/String;
    .local v6, "id":Ljava/lang/String;
    invoke-direct/range {v0 .. v8}, Lcom/pymcl/android/ui/state/AppState$installVersion$job$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .end local v6    # "id":Ljava/lang/String;
    .restart local v12    # "id":Ljava/lang/String;
    move-object/from16 v16, v0

    check-cast v16, Lkotlin/jvm/functions/Function2;

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/4 v14, 0x0

    invoke-static/range {v13 .. v18}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    .line 232
    .local v0, "job":Lkotlinx/coroutines/Job;
    iget-object v2, v1, Lcom/pymcl/android/ui/state/AppState;->taskJobs:Lcom/pymcl/android/ui/state/TaskJobs;

    invoke-virtual {v2, v12, v0}, Lcom/pymcl/android/ui/state/TaskJobs;->register(Ljava/lang/String;Lkotlinx/coroutines/Job;)V

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->start()Z

    .line 233
    const/4 v2, 0x1

    return v2
.end method

.method public final installingInstance(Ljava/lang/String;)Z
    .locals 10
    .param p1, "name"    # Ljava/lang/String;

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->activeInstalls:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 385
    .local v1, "$i$f$any\\1\\98":I
    instance-of v2, v0, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 386
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element\\1":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Ljava/lang/String;

    .local v5, "it\\2":Ljava/lang/String;
    const/4 v6, 0x0

    .line 98
    .local v6, "$i$a$-any-AppState$installingInstance$1\\2\\386\\0":I
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v8, "|"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x2

    const/4 v9, 0x0

    invoke-static {v5, v7, v3, v8, v9}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v5

    .line 386
    .end local v5    # "it\\2":Ljava/lang/String;
    .end local v6    # "$i$a$-any-AppState$installingInstance$1\\2\\386\\0":I
    if-eqz v5, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    .line 387
    .end local v4    # "element\\1":Ljava/lang/Object;
    :cond_2
    nop

    .line 98
    .end local v0    # "$this$any\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any\\1\\98":I
    :goto_0
    return v3
.end method

.method public final launch(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;
    .locals 7
    .param p1, "block"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lkotlinx/coroutines/CoroutineScope;",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lkotlinx/coroutines/Job;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->errors:Lkotlinx/coroutines/CoroutineExceptionHandler;

    move-object v2, v0

    check-cast v2, Lkotlin/coroutines/CoroutineContext;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v4, p1

    .end local p1    # "block":Lkotlin/jvm/functions/Function2;
    .local v4, "block":Lkotlin/jvm/functions/Function2;
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object p1

    return-object p1
.end method

.method public final loadInitial()Lkotlinx/coroutines/Job;
    .locals 6

    .line 318
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v1, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/ui/state/AppState$loadInitial$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    .line 325
    return-object v0
.end method

.method public final navigate(Lcom/pymcl/android/ui/Destination;)V
    .locals 2
    .param p1, "d"    # Lcom/pymcl/android/ui/Destination;

    const-string v0, "d"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    new-instance v0, Lcom/pymcl/android/ui/state/NavKey;

    sget-object v1, Lcom/pymcl/android/ui/Destination;->Library:Lcom/pymcl/android/ui/Destination;

    if-ne p1, v1, :cond_0

    sget-object v1, Lcom/pymcl/android/ui/state/CatalogKind;->Mod:Lcom/pymcl/android/ui/state/CatalogKind;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {v0, p1, v1}, Lcom/pymcl/android/ui/state/NavKey;-><init>(Lcom/pymcl/android/ui/Destination;Lcom/pymcl/android/ui/state/CatalogKind;)V

    invoke-virtual {p0, v0}, Lcom/pymcl/android/ui/state/AppState;->navigate(Lcom/pymcl/android/ui/state/NavKey;)V

    return-void
.end method

.method public final navigate(Lcom/pymcl/android/ui/state/NavKey;)V
    .locals 3
    .param p1, "k"    # Lcom/pymcl/android/ui/state/NavKey;

    const-string v0, "k"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    invoke-virtual {p0}, Lcom/pymcl/android/ui/state/AppState;->getCurrent()Lcom/pymcl/android/ui/state/NavKey;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 119
    :cond_0
    new-instance v0, Lcom/pymcl/android/ui/state/AppState$$ExternalSyntheticLambda0;

    invoke-direct {v0}, Lcom/pymcl/android/ui/state/AppState$$ExternalSyntheticLambda0;-><init>()V

    .line 120
    .local v0, "order":Lkotlin/jvm/functions/Function1;
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0}, Lcom/pymcl/android/ui/state/AppState;->getCurrent()Lcom/pymcl/android/ui/state/NavKey;

    move-result-object v2

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-lt v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-direct {p0, v1}, Lcom/pymcl/android/ui/state/AppState;->setNavForward(Z)V

    .line 121
    invoke-direct {p0, p1}, Lcom/pymcl/android/ui/state/AppState;->setCurrent(Lcom/pymcl/android/ui/state/NavKey;)V

    .line 122
    return-void
.end method

.method public final open(Lcom/pymcl/android/ui/state/DialogSpec;)V
    .locals 1
    .param p1, "d"    # Lcom/pymcl/android/ui/state/DialogSpec;

    const-string v0, "d"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 125
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->dialogs:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final refreshData()Lkotlinx/coroutines/Job;
    .locals 6

    .line 147
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v1, Lcom/pymcl/android/ui/state/AppState$refreshData$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/ui/state/AppState$refreshData$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    move-object v3, v1

    check-cast v3, Lkotlin/jvm/functions/Function2;

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    return-object v0
.end method

.method public final reload(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 22
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    instance-of v0, v2, Lcom/pymcl/android/ui/state/AppState$reload$1;

    if-eqz v0, :cond_0

    move-object v0, v2

    check-cast v0, Lcom/pymcl/android/ui/state/AppState$reload$1;

    iget v3, v0, Lcom/pymcl/android/ui/state/AppState$reload$1;->label:I

    const/high16 v4, -0x80000000

    and-int/2addr v3, v4

    if-eqz v3, :cond_0

    iget v3, v0, Lcom/pymcl/android/ui/state/AppState$reload$1;->label:I

    sub-int/2addr v3, v4

    iput v3, v0, Lcom/pymcl/android/ui/state/AppState$reload$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/ui/state/AppState$reload$1;

    invoke-direct {v0, v1, v2}, Lcom/pymcl/android/ui/state/AppState$reload$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v3, v0

    .local v3, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v4, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->result:Ljava/lang/Object;

    .local v4, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 150
    iget v5, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->label:I

    const/16 v6, 0xa

    const-string v7, ""

    const/4 v9, 0x1

    packed-switch v5, :pswitch_data_0

    .end local v3    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v4    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v3    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v4    # "$result":Ljava/lang/Object;
    :pswitch_0
    const/4 v0, 0x0

    .local v0, "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    iget-object v5, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    .local v5, "vers\\1":Ljava/util/List;
    iget-object v10, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    .local v10, "inst\\1":Ljava/util/List;
    iget-object v11, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lcom/pymcl/android/ui/state/AppState;

    .local v11, "$this$reload_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/AppState;
    :try_start_0
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v6, v4

    goto/16 :goto_a

    .end local v0    # "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    .end local v5    # "vers\\1":Ljava/util/List;
    .end local v10    # "inst\\1":Ljava/util/List;
    .end local v11    # "$this$reload_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/AppState;
    :pswitch_1
    const/4 v5, 0x0

    .local v5, "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    iget-object v10, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    .restart local v10    # "inst\\1":Ljava/util/List;
    iget-object v11, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lcom/pymcl/android/ui/state/AppState;

    .restart local v11    # "$this$reload_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/AppState;
    :try_start_1
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v8, v4

    goto/16 :goto_4

    .end local v5    # "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    .end local v10    # "inst\\1":Ljava/util/List;
    .end local v11    # "$this$reload_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/AppState;
    :pswitch_2
    const/4 v5, 0x0

    .restart local v5    # "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    iget-object v10, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->L$0:Ljava/lang/Object;

    check-cast v10, Lcom/pymcl/android/ui/state/AppState;

    .local v10, "$this$reload_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/AppState;
    :try_start_2
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v11, v4

    goto :goto_1

    .end local v5    # "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    .end local v10    # "$this$reload_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/AppState;
    :pswitch_3
    invoke-static {v4}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 151
    :try_start_3
    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v5, v1

    check-cast v5, Lcom/pymcl/android/ui/state/AppState;

    move-object v10, v5

    .restart local v10    # "$this$reload_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/AppState;
    const/4 v5, 0x0

    .line 152
    .restart local v5    # "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    iget-object v11, v10, Lcom/pymcl/android/ui/state/AppState;->api:Lcom/pymcl/android/ui/state/LauncherUiApi;

    iput-object v10, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->L$0:Ljava/lang/Object;

    iput v9, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->label:I

    invoke-interface {v11, v3}, Lcom/pymcl/android/ui/state/LauncherUiApi;->listInstances(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v0, :cond_1

    .line 150
    return-object v0

    :cond_1
    :goto_1
    check-cast v11, Ljava/util/List;

    .line 153
    .local v11, "inst\\1":Ljava/util/List;
    iget-object v12, v10, Lcom/pymcl/android/ui/state/AppState;->instanceNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v12}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    iget-object v12, v10, Lcom/pymcl/android/ui/state/AppState;->instanceNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v12, Ljava/util/Collection;

    move-object v13, v11

    check-cast v13, Ljava/lang/Iterable;

    .local v13, "$this$map\\2":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 406
    .local v14, "$i$f$map\\2\\153":I
    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v13, v6}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v15, v8}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v15, Ljava/util/Collection;

    .local v15, "destination\\3":Ljava/util/Collection;
    move-object v8, v13

    .local v8, "$this$mapTo\\3":Ljava/lang/Iterable;
    const/16 v16, 0x0

    .line 407
    .local v16, "$i$f$mapTo\\3\\406":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_2
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_2

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    .line 408
    .local v18, "item\\3":Ljava/lang/Object;
    move-object/from16 v19, v18

    check-cast v19, Lcom/pymcl/android/ui/state/InstanceRow;

    .local v19, "it\\4":Lcom/pymcl/android/ui/state/InstanceRow;
    const/16 v20, 0x0

    .line 153
    .local v20, "$i$a$-map-AppState$reload$2$1\\4\\408\\1":I
    invoke-virtual/range {v19 .. v19}, Lcom/pymcl/android/ui/state/InstanceRow;->getName()Ljava/lang/String;

    move-result-object v9

    .line 408
    .end local v19    # "it\\4":Lcom/pymcl/android/ui/state/InstanceRow;
    .end local v20    # "$i$a$-map-AppState$reload$2$1\\4\\408\\1":I
    invoke-interface {v15, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/4 v9, 0x1

    goto :goto_2

    .line 409
    .end local v18    # "item\\3":Ljava/lang/Object;
    :cond_2
    nop

    .end local v8    # "$this$mapTo\\3":Ljava/lang/Iterable;
    .end local v15    # "destination\\3":Ljava/util/Collection;
    .end local v16    # "$i$f$mapTo\\3\\406":I
    move-object v8, v15

    check-cast v8, Ljava/util/List;

    .line 406
    nop

    .end local v13    # "$this$map\\2":Ljava/lang/Iterable;
    .end local v14    # "$i$f$map\\2\\153":I
    check-cast v8, Ljava/lang/Iterable;

    .line 153
    invoke-static {v12, v8}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 154
    iget-object v8, v10, Lcom/pymcl/android/ui/state/AppState;->instanceNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v10}, Lcom/pymcl/android/ui/state/AppState;->getSelectedInstance()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    move-object v8, v11

    check-cast v8, Ljava/lang/Iterable;

    .local v8, "$this$firstOrNull\\5":Ljava/lang/Iterable;
    const/4 v9, 0x0

    .line 410
    .local v9, "$i$f$firstOrNull\\5\\154":I
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :cond_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    .local v13, "element\\5":Ljava/lang/Object;
    move-object v14, v13

    check-cast v14, Lcom/pymcl/android/ui/state/InstanceRow;

    .local v14, "it\\6":Lcom/pymcl/android/ui/state/InstanceRow;
    const/4 v15, 0x0

    .line 154
    .local v15, "$i$a$-firstOrNull-AppState$reload$2$2\\6\\410\\1":I
    invoke-virtual {v14}, Lcom/pymcl/android/ui/state/InstanceRow;->isDefault()Z

    move-result v16

    .line 410
    .end local v14    # "it\\6":Lcom/pymcl/android/ui/state/InstanceRow;
    .end local v15    # "$i$a$-firstOrNull-AppState$reload$2$2\\6\\410\\1":I
    if-eqz v16, :cond_3

    goto :goto_3

    .line 411
    .end local v13    # "element\\5":Ljava/lang/Object;
    :cond_4
    const/4 v13, 0x0

    .line 154
    .end local v8    # "$this$firstOrNull\\5":Ljava/lang/Iterable;
    .end local v9    # "$i$f$firstOrNull\\5\\154":I
    :goto_3
    check-cast v13, Lcom/pymcl/android/ui/state/InstanceRow;

    if-eqz v13, :cond_5

    invoke-virtual {v13}, Lcom/pymcl/android/ui/state/InstanceRow;->getName()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_6

    :cond_5
    iget-object v8, v10, Lcom/pymcl/android/ui/state/AppState;->instanceNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v8, Ljava/util/List;

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_6

    move-object v8, v7

    :cond_6
    invoke-virtual {v10, v8}, Lcom/pymcl/android/ui/state/AppState;->setSelectedInstance(Ljava/lang/String;)V

    .line 155
    :cond_7
    iget-object v8, v10, Lcom/pymcl/android/ui/state/AppState;->api:Lcom/pymcl/android/ui/state/LauncherUiApi;

    invoke-virtual {v10}, Lcom/pymcl/android/ui/state/AppState;->getSelectedInstance()Ljava/lang/String;

    move-result-object v9

    iput-object v10, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->L$0:Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    iput-object v12, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->L$1:Ljava/lang/Object;

    const/4 v12, 0x2

    iput v12, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->label:I

    invoke-interface {v8, v9, v3}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getInstalledVersions(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v0, :cond_8

    .line 150
    return-object v0

    .line 155
    :cond_8
    move-object/from16 v21, v11

    move-object v11, v10

    move-object/from16 v10, v21

    .line 150
    .local v10, "inst\\1":Ljava/util/List;
    .local v11, "$this$reload_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/AppState;
    :goto_4
    check-cast v8, Ljava/util/List;

    .line 156
    .local v8, "vers\\1":Ljava/util/List;
    iget-object v9, v11, Lcom/pymcl/android/ui/state/AppState;->installedVersions:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v9}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    iget-object v9, v11, Lcom/pymcl/android/ui/state/AppState;->installedVersions:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v9, Ljava/util/Collection;

    move-object v12, v8

    check-cast v12, Ljava/lang/Iterable;

    invoke-static {v9, v12}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 157
    invoke-virtual {v11}, Lcom/pymcl/android/ui/state/AppState;->getSelectedVersion()Ljava/lang/String;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    move-result v9

    if-lez v9, :cond_9

    const/4 v9, 0x1

    goto :goto_5

    :cond_9
    const/4 v9, 0x0

    :goto_5
    if-eqz v9, :cond_d

    move-object v9, v8

    check-cast v9, Ljava/lang/Iterable;

    .local v9, "$this$none\\7":Ljava/lang/Iterable;
    const/4 v13, 0x0

    .line 412
    .local v13, "$i$f$none\\7\\157":I
    instance-of v14, v9, Ljava/util/Collection;

    if-eqz v14, :cond_a

    move-object v14, v9

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_a

    const/4 v6, 0x1

    goto :goto_7

    .line 413
    :cond_a
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_6
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_c

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    .local v15, "element\\7":Ljava/lang/Object;
    move-object/from16 v16, v15

    check-cast v16, Lcom/pymcl/android/ui/state/InstalledVersion;

    .local v16, "it\\8":Lcom/pymcl/android/ui/state/InstalledVersion;
    const/16 v17, 0x0

    .line 157
    .local v17, "$i$a$-none-AppState$reload$2$3\\8\\413\\1":I
    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/android/ui/state/InstalledVersion;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Lcom/pymcl/android/ui/state/AppState;->getSelectedVersion()Ljava/lang/String;

    move-result-object v6

    invoke-static {v12, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    .line 413
    .end local v16    # "it\\8":Lcom/pymcl/android/ui/state/InstalledVersion;
    .end local v17    # "$i$a$-none-AppState$reload$2$3\\8\\413\\1":I
    if-eqz v6, :cond_b

    const/4 v6, 0x0

    goto :goto_7

    :cond_b
    const/16 v6, 0xa

    goto :goto_6

    .line 414
    .end local v15    # "element\\7":Ljava/lang/Object;
    :cond_c
    const/4 v6, 0x1

    .line 157
    .end local v9    # "$this$none\\7":Ljava/lang/Iterable;
    .end local v13    # "$i$f$none\\7\\157":I
    :goto_7
    if-eqz v6, :cond_d

    invoke-virtual {v11}, Lcom/pymcl/android/ui/state/AppState;->getLaunchProgress()Ljava/lang/Float;

    move-result-object v6

    if-nez v6, :cond_d

    invoke-virtual {v11, v7}, Lcom/pymcl/android/ui/state/AppState;->setSelectedVersion(Ljava/lang/String;)V

    .line 158
    :cond_d
    invoke-virtual {v11}, Lcom/pymcl/android/ui/state/AppState;->getSelectedVersion()Ljava/lang/String;

    move-result-object v6

    check-cast v6, Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_e

    const/4 v12, 0x1

    goto :goto_8

    :cond_e
    const/4 v12, 0x0

    :goto_8
    if-eqz v12, :cond_11

    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/pymcl/android/ui/state/InstalledVersion;

    if-eqz v6, :cond_f

    invoke-virtual {v6}, Lcom/pymcl/android/ui/state/InstalledVersion;->getId()Ljava/lang/String;

    move-result-object v6

    goto :goto_9

    :cond_f
    const/4 v6, 0x0

    :goto_9
    if-nez v6, :cond_10

    move-object v6, v7

    :cond_10
    invoke-virtual {v11, v6}, Lcom/pymcl/android/ui/state/AppState;->setSelectedVersion(Ljava/lang/String;)V

    .line 159
    :cond_11
    iget-object v6, v11, Lcom/pymcl/android/ui/state/AppState;->api:Lcom/pymcl/android/ui/state/LauncherUiApi;

    iput-object v11, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->L$0:Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->L$1:Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->L$2:Ljava/lang/Object;

    const/4 v9, 0x3

    iput v9, v3, Lcom/pymcl/android/ui/state/AppState$reload$1;->label:I

    invoke-interface {v6, v3}, Lcom/pymcl/android/ui/state/LauncherUiApi;->getAccountRows(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_12

    .line 150
    return-object v0

    .line 159
    :cond_12
    move v0, v5

    move-object v5, v8

    .line 150
    .end local v8    # "vers\\1":Ljava/util/List;
    .restart local v0    # "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    .local v5, "vers\\1":Ljava/util/List;
    :goto_a
    check-cast v6, Ljava/util/List;

    .line 160
    .local v6, "accs\\1":Ljava/util/List;
    iget-object v8, v11, Lcom/pymcl/android/ui/state/AppState;->accountNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->clear()V

    iget-object v8, v11, Lcom/pymcl/android/ui/state/AppState;->accountNames:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v8, Ljava/util/Collection;

    move-object v9, v6

    check-cast v9, Ljava/lang/Iterable;

    .local v9, "$this$map\\9":Ljava/lang/Iterable;
    const/4 v12, 0x0

    .line 415
    .local v12, "$i$f$map\\9\\160":I
    new-instance v13, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v9, v14}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v13, Ljava/util/Collection;

    .local v13, "destination\\10":Ljava/util/Collection;
    move-object v14, v9

    .local v14, "$this$mapTo\\10":Ljava/lang/Iterable;
    const/4 v15, 0x0

    .line 416
    .local v15, "$i$f$mapTo\\10\\415":I
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_b
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_13

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    .line 417
    .local v17, "item\\10":Ljava/lang/Object;
    move-object/from16 v18, v17

    check-cast v18, Lcom/pymcl/android/ui/state/AccountRow;

    .local v18, "it\\11":Lcom/pymcl/android/ui/state/AccountRow;
    const/16 v19, 0x0

    .line 160
    .local v19, "$i$a$-map-AppState$reload$2$4\\11\\417\\1":I
    move/from16 v20, v0

    .end local v0    # "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    .local v20, "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    invoke-virtual/range {v18 .. v18}, Lcom/pymcl/android/ui/state/AccountRow;->getName()Ljava/lang/String;

    move-result-object v0

    .line 417
    .end local v18    # "it\\11":Lcom/pymcl/android/ui/state/AccountRow;
    .end local v19    # "$i$a$-map-AppState$reload$2$4\\11\\417\\1":I
    invoke-interface {v13, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v0, v20

    goto :goto_b

    .line 418
    .end local v17    # "item\\10":Ljava/lang/Object;
    .end local v20    # "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    .restart local v0    # "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    :cond_13
    move/from16 v20, v0

    .end local v0    # "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    .end local v13    # "destination\\10":Ljava/util/Collection;
    .end local v14    # "$this$mapTo\\10":Ljava/lang/Iterable;
    .end local v15    # "$i$f$mapTo\\10\\415":I
    .restart local v20    # "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    move-object v0, v13

    check-cast v0, Ljava/util/List;

    .line 415
    nop

    .end local v9    # "$this$map\\9":Ljava/lang/Iterable;
    .end local v12    # "$i$f$map\\9\\160":I
    check-cast v0, Ljava/lang/Iterable;

    .line 160
    invoke-static {v8, v0}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 161
    move-object v0, v6

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull\\12":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 419
    .local v8, "$i$f$firstOrNull\\12\\161":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_15

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element\\12":Ljava/lang/Object;
    move-object v13, v12

    check-cast v13, Lcom/pymcl/android/ui/state/AccountRow;

    .local v13, "it\\13":Lcom/pymcl/android/ui/state/AccountRow;
    const/4 v14, 0x0

    .line 161
    .local v14, "$i$a$-firstOrNull-AppState$reload$2$5\\13\\419\\1":I
    invoke-virtual {v13}, Lcom/pymcl/android/ui/state/AccountRow;->getActive()Z

    move-result v15

    .line 419
    .end local v13    # "it\\13":Lcom/pymcl/android/ui/state/AccountRow;
    .end local v14    # "$i$a$-firstOrNull-AppState$reload$2$5\\13\\419\\1":I
    if-eqz v15, :cond_14

    goto :goto_c

    .line 420
    .end local v12    # "element\\12":Ljava/lang/Object;
    :cond_15
    const/4 v12, 0x0

    .line 161
    .end local v0    # "$this$firstOrNull\\12":Ljava/lang/Iterable;
    .end local v8    # "$i$f$firstOrNull\\12\\161":I
    :goto_c
    check-cast v12, Lcom/pymcl/android/ui/state/AccountRow;

    if-eqz v12, :cond_16

    invoke-virtual {v12}, Lcom/pymcl/android/ui/state/AccountRow;->getName()Ljava/lang/String;

    move-result-object v8

    goto :goto_d

    :cond_16
    const/4 v8, 0x0

    :goto_d
    if-nez v8, :cond_17

    goto :goto_e

    :cond_17
    move-object v7, v8

    :goto_e
    invoke-virtual {v11, v7}, Lcom/pymcl/android/ui/state/AppState;->setActiveAccount(Ljava/lang/String;)V

    .line 162
    nop

    .end local v5    # "vers\\1":Ljava/util/List;
    .end local v6    # "accs\\1":Ljava/util/List;
    .end local v10    # "inst\\1":Ljava/util/List;
    .end local v11    # "$this$reload_u24lambda_u240\\1":Lcom/pymcl/android/ui/state/AppState;
    .end local v20    # "$i$a$-runCatching-AppState$reload$2\\1\\151\\0":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 151
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_f

    :catchall_0
    move-exception v0

    sget-object v5, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 162
    :goto_f
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_18

    .line 421
    .local v0, "it\\15":Ljava/lang/Throwable;
    const/4 v5, 0x0

    .line 162
    .local v5, "$i$a$-onFailure-AppState$reload$3\\15\\162\\0":I
    iget-object v6, v1, Lcom/pymcl/android/ui/state/AppState;->launchLog:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v6, Ljava/util/Collection;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    const-string v8, "[PyMCL] \u8bfb\u53d6\u6570\u636e\u5931\u8d25\uff1a{0}"

    invoke-static {v8, v7}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 163
    .end local v0    # "it\\15":Ljava/lang/Throwable;
    .end local v5    # "$i$a$-onFailure-AppState$reload$3\\15\\162\\0":I
    :cond_18
    const/4 v5, 0x1

    invoke-direct {v1, v5}, Lcom/pymcl/android/ui/state/AppState;->setDataLoaded(Z)V

    .line 164
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final resumePendingLaunch()V
    .locals 8

    .line 292
    iget-boolean v0, p0, Lcom/pymcl/android/ui/state/AppState;->pendingLaunch:Z

    if-nez v0, :cond_0

    return-void

    .line 293
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/pymcl/android/ui/state/AppState;->pendingLaunch:Z

    .line 294
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->pendingLaunchServer:Ljava/lang/String;

    .local v0, "s":Ljava/lang/String;
    const/4 v1, 0x0

    iput-object v1, p0, Lcom/pymcl/android/ui/state/AppState;->pendingLaunchServer:Ljava/lang/String;

    .line 295
    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v3, Lcom/pymcl/android/ui/state/AppState$resumePendingLaunch$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/pymcl/android/ui/state/AppState$resumePendingLaunch$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v5, v3

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 296
    return-void
.end method

.method public final runTask(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Z
    .locals 14
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "kind"    # Ljava/lang/String;
    .param p3, "dedupeKey"    # Ljava/lang/String;
    .param p4, "onDone"    # Lkotlin/jvm/functions/Function1;
    .param p5, "block"    # Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    move-object/from16 v6, p2

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDone"

    move-object/from16 v9, p4

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    move-object/from16 v10, p5

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 186
    if-nez p3, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object/from16 v0, p3

    :goto_0
    move-object v11, v0

    .line 187
    .local v11, "key":Ljava/lang/String;
    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState;->activeTaskKeys:Ljava/util/Set;

    monitor-enter v1

    .line 421
    const/4 v0, 0x0

    .line 187
    .local v0, "$i$a$-synchronized-AppState$runTask$2\\1\\187\\0":I
    :try_start_0
    iget-object v3, p0, Lcom/pymcl/android/ui/state/AppState;->activeTaskKeys:Ljava/util/Set;

    invoke-interface {v3, v11}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v12, 0x0

    if-nez v3, :cond_1

    :try_start_1
    const-string v3, "\u5df2\u5728\u961f\u5217\u4e2d"

    const-string v4, "\u300c{0}\u300d\u6b63\u5728\u8fdb\u884c\uff0c\u8fdb\u5ea6\u770b\u4e0b\u8f7d\u4efb\u52a1"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "info"

    invoke-virtual {p0, v3, v4, v5}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .end local v0    # "$i$a$-synchronized-AppState$runTask$2\\1\\187\\0":I
    monitor-exit v1

    return v12

    :catchall_0
    move-exception v0

    move-object v10, v11

    goto :goto_1

    :cond_1
    :try_start_2
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    .line 188
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "t-"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 189
    .local v1, "id":Ljava/lang/String;
    iget-object v13, p0, Lcom/pymcl/android/ui/state/AppState;->tasks:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    new-instance v0, Lcom/pymcl/android/ui/state/TaskRow;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    sget-object v4, Lcom/pymcl/android/ui/state/TaskState;->Running:Lcom/pymcl/android/ui/state/TaskState;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-direct/range {v0 .. v8}, Lcom/pymcl/android/ui/state/TaskRow;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Lcom/pymcl/android/ui/state/TaskState;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v13, v12, v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(ILjava/lang/Object;)V

    .line 190
    iget-object v8, p0, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    sget-object v12, Lkotlinx/coroutines/CoroutineStart;->LAZY:Lkotlinx/coroutines/CoroutineStart;

    new-instance v0, Lcom/pymcl/android/ui/state/AppState$runTask$job$1;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p1

    move-object v3, v1

    move-object v5, v9

    move-object v1, v10

    move-object v6, v11

    .end local v1    # "id":Ljava/lang/String;
    .end local v11    # "key":Ljava/lang/String;
    .local v3, "id":Ljava/lang/String;
    .local v6, "key":Ljava/lang/String;
    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/ui/state/AppState$runTask$job$1;-><init>(Lkotlin/jvm/functions/Function2;Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v1, v3

    move-object v10, v6

    .end local v3    # "id":Ljava/lang/String;
    .end local v6    # "key":Ljava/lang/String;
    .restart local v1    # "id":Ljava/lang/String;
    .local v10, "key":Ljava/lang/String;
    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x1

    const/4 v3, 0x0

    move-object v2, v8

    move-object v4, v12

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    move-result-object v0

    .line 205
    .local v0, "job":Lkotlinx/coroutines/Job;
    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState;->taskJobs:Lcom/pymcl/android/ui/state/TaskJobs;

    invoke-virtual {v2, v1, v0}, Lcom/pymcl/android/ui/state/TaskJobs;->register(Ljava/lang/String;Lkotlinx/coroutines/Job;)V

    invoke-interface {v0}, Lkotlinx/coroutines/Job;->start()Z

    .line 206
    const/4 v2, 0x1

    return v2

    .line 187
    .end local v0    # "job":Lkotlinx/coroutines/Job;
    .end local v1    # "id":Ljava/lang/String;
    .end local v10    # "key":Ljava/lang/String;
    .restart local v11    # "key":Ljava/lang/String;
    :catchall_1
    move-exception v0

    move-object v10, v11

    .end local v11    # "key":Ljava/lang/String;
    .restart local v10    # "key":Ljava/lang/String;
    :goto_1
    monitor-exit v1

    throw v0
.end method

.method public final setActiveAccount(Ljava/lang/String;)V
    .locals 5
    .param p1, "<set-?>"    # Ljava/lang/String;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->activeAccount$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p1

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 374
    .local v4, "$i$f$setValue\\1\\84":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 375
    nop

    .line 84
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\84":I
    return-void
.end method

.method public final setBridge(Ljava/lang/String;)V
    .locals 5
    .param p1, "<set-?>"    # Ljava/lang/String;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 77
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->bridge$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p1

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 359
    .local v4, "$i$f$setValue\\1\\77":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 360
    nop

    .line 77
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\77":I
    return-void
.end method

.method public final setGameRunning(Z)V
    .locals 5
    .param p1, "<set-?>"    # Z

    .line 78
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->gameRunning$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 362
    .local v4, "$i$f$setValue\\1\\78":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 363
    nop

    .line 78
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\78":I
    return-void
.end method

.method public final setLaunchProgress(Ljava/lang/Float;)V
    .locals 5
    .param p1, "<set-?>"    # Ljava/lang/Float;

    .line 79
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->launchProgress$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p1

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 365
    .local v4, "$i$f$setValue\\1\\79":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 366
    nop

    .line 79
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\79":I
    return-void
.end method

.method public final setNotes(Ljava/lang/String;)V
    .locals 5
    .param p1, "<set-?>"    # Ljava/lang/String;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 89
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->notes$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p1

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 377
    .local v4, "$i$f$setValue\\1\\89":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 378
    nop

    .line 89
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\89":I
    return-void
.end method

.method public final setPendingLaunch$PyMCL_Android_app_debug(Z)V
    .locals 0
    .param p1, "<set-?>"    # Z

    .line 103
    iput-boolean p1, p0, Lcom/pymcl/android/ui/state/AppState;->pendingLaunch:Z

    return-void
.end method

.method public final setPendingLaunchServer$PyMCL_Android_app_debug(Ljava/lang/String;)V
    .locals 0
    .param p1, "<set-?>"    # Ljava/lang/String;

    .line 102
    iput-object p1, p0, Lcom/pymcl/android/ui/state/AppState;->pendingLaunchServer:Ljava/lang/String;

    return-void
.end method

.method public final setSelectedInstance(Ljava/lang/String;)V
    .locals 5
    .param p1, "<set-?>"    # Ljava/lang/String;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->selectedInstance$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p1

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 368
    .local v4, "$i$f$setValue\\1\\81":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 369
    nop

    .line 81
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\81":I
    return-void
.end method

.method public final setSelectedVersion(Ljava/lang/String;)V
    .locals 5
    .param p1, "<set-?>"    # Ljava/lang/String;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->selectedVersion$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p1

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 371
    .local v4, "$i$f$setValue\\1\\83":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 372
    nop

    .line 83
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\83":I
    return-void
.end method

.method public final setSettings(Lcom/pymcl/android/ui/state/UiSettings;)V
    .locals 5
    .param p1, "<set-?>"    # Lcom/pymcl/android/ui/state/UiSettings;

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->settings$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p1

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 347
    .local v4, "$i$f$setValue\\1\\67":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 348
    nop

    .line 67
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\67":I
    return-void
.end method

.method public final setSideCollapsed(Ljava/lang/Boolean;)V
    .locals 5
    .param p1, "<set-?>"    # Ljava/lang/Boolean;

    .line 72
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->sideCollapsed$delegate:Landroidx/compose/runtime/MutableState;

    .local v0, "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    const/4 v1, 0x0

    .local v1, "property\\1":Lkotlin/reflect/KProperty;
    move-object v2, p1

    .local v2, "value\\1":Ljava/lang/Object;
    move-object v3, p0

    .local v3, "this_\\1":Ljava/lang/Object;
    const/4 v4, 0x0

    .line 356
    .local v4, "$i$f$setValue\\1\\72":I
    invoke-interface {v0, v2}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 357
    nop

    .line 72
    .end local v0    # "$this$setValue\\1":Landroidx/compose/runtime/MutableState;
    .end local v1    # "property\\1":Lkotlin/reflect/KProperty;
    .end local v2    # "value\\1":Ljava/lang/Object;
    .end local v3    # "this_\\1":Ljava/lang/Object;
    .end local v4    # "$i$f$setValue\\1\\72":I
    return-void
.end method

.method public final startGame(Ljava/lang/String;)V
    .locals 10
    .param p1, "server"    # Ljava/lang/String;

    .line 243
    invoke-virtual {p0}, Lcom/pymcl/android/ui/state/AppState;->getLaunchVerdict()Lcom/pymcl/android/ui/state/LaunchGate$Verdict;

    move-result-object v0

    .line 244
    .local v0, "v":Lcom/pymcl/android/ui/state/LaunchGate$Verdict;
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->getAction()Lcom/pymcl/android/ui/state/LaunchGate$Action;

    move-result-object v1

    sget-object v2, Lcom/pymcl/android/ui/state/AppState$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/LaunchGate$Action;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const-string v2, "warn"

    const/4 v3, 0x0

    const/4 v4, 0x1

    packed-switch v1, :pswitch_data_0

    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    .line 250
    :pswitch_0
    nop

    .line 252
    invoke-direct {p0, v4}, Lcom/pymcl/android/ui/state/AppState;->setLaunching(Z)V

    .line 253
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->getVersion()Ljava/lang/String;

    move-result-object v1

    .line 254
    .local v1, "ver":Ljava/lang/String;
    iget-object v4, p0, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v2, Lcom/pymcl/android/ui/state/AppState$startGame$2;

    invoke-direct {v2, v1, p1, p0, v3}, Lcom/pymcl/android/ui/state/AppState$startGame$2;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    move-object v7, v2

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 277
    return-void

    .line 249
    .end local v1    # "ver":Ljava/lang/String;
    :pswitch_1
    iput-boolean v4, p0, Lcom/pymcl/android/ui/state/AppState;->pendingLaunch:Z

    iput-object p1, p0, Lcom/pymcl/android/ui/state/AppState;->pendingLaunchServer:Ljava/lang/String;

    sget-object v1, Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;->INSTANCE:Lcom/pymcl/android/ui/state/DialogSpec$AccountGate;

    check-cast v1, Lcom/pymcl/android/ui/state/DialogSpec;

    invoke-virtual {p0, v1}, Lcom/pymcl/android/ui/state/AppState;->open(Lcom/pymcl/android/ui/state/DialogSpec;)V

    return-void

    .line 248
    :pswitch_2
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->getDetail()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v2}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/pymcl/android/ui/Destination;->Instances:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {p0, v1}, Lcom/pymcl/android/ui/state/AppState;->navigate(Lcom/pymcl/android/ui/Destination;)V

    return-void

    .line 247
    :pswitch_3
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->getDetail()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v2}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/pymcl/android/ui/Destination;->Versions:Lcom/pymcl/android/ui/Destination;

    invoke-virtual {p0, v1}, Lcom/pymcl/android/ui/state/AppState;->navigate(Lcom/pymcl/android/ui/Destination;)V

    return-void

    .line 246
    :pswitch_4
    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->getStatus()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lcom/pymcl/android/ui/state/LaunchGate$Verdict;->getDetail()Ljava/lang/String;

    move-result-object v2

    const-string v3, "info"

    invoke-virtual {p0, v1, v2, v3}, Lcom/pymcl/android/ui/state/AppState;->toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 245
    :pswitch_5
    iput-boolean v4, p0, Lcom/pymcl/android/ui/state/AppState;->userStopped:Z

    iget-object v1, p0, Lcom/pymcl/android/ui/state/AppState;->api:Lcom/pymcl/android/ui/state/LauncherUiApi;

    invoke-interface {v1}, Lcom/pymcl/android/ui/state/LauncherUiApi;->stopGame()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/pymcl/android/ui/state/AppState;->setGameRunning(Z)V

    invoke-virtual {p0, v3}, Lcom/pymcl/android/ui/state/AppState;->setLaunchProgress(Ljava/lang/Float;)V

    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState;->launchLog:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v2, Ljava/util/Collection;

    const-string v4, "[PyMCL] \u5df2\u505c\u6b62"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4, v1}, Lcom/pymcl/android/ui/i18n/I18nKt;->tr(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-object v4, p0, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v1, Lcom/pymcl/android/ui/state/AppState$startGame$1;

    invoke-direct {v1, p0, v3}, Lcom/pymcl/android/ui/state/AppState$startGame$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lkotlin/coroutines/Continuation;)V

    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function2;

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final startGameFor(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;

    const-string v0, "instance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    invoke-virtual {p0}, Lcom/pymcl/android/ui/state/AppState;->getGameRunning()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/pymcl/android/ui/state/AppState;->getLaunching()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/pymcl/android/ui/state/AppState;->getLaunchProgress()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 282
    :cond_0
    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/pymcl/android/ui/state/AppState$startGameFor$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 288
    return-void

    .line 281
    :cond_1
    :goto_0
    const/4 v0, 0x1

    invoke-static {p0, v1, v0, v1}, Lcom/pymcl/android/ui/state/AppState;->startGame$default(Lcom/pymcl/android/ui/state/AppState;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final toast(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8
    .param p1, "title"    # Ljava/lang/String;
    .param p2, "body"    # Ljava/lang/String;
    .param p3, "kind"    # Ljava/lang/String;

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    new-instance v1, Lcom/pymcl/android/ui/state/Toast;

    iget-wide v2, p0, Lcom/pymcl/android/ui/state/AppState;->toastSeq:J

    const-wide/16 v4, 0x1

    add-long/2addr v2, v4

    iput-wide v2, p0, Lcom/pymcl/android/ui/state/AppState;->toastSeq:J

    iget-wide v2, p0, Lcom/pymcl/android/ui/state/AppState;->toastSeq:J

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/pymcl/android/ui/state/Toast;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .local v1, "t":Lcom/pymcl/android/ui/state/Toast;
    iget-object v0, p0, Lcom/pymcl/android/ui/state/AppState;->toasts:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 132
    iget-object v2, p0, Lcom/pymcl/android/ui/state/AppState;->scope:Lkotlinx/coroutines/CoroutineScope;

    new-instance v0, Lcom/pymcl/android/ui/state/AppState$toast$1;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v3}, Lcom/pymcl/android/ui/state/AppState$toast$1;-><init>(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/Toast;Lkotlin/coroutines/Continuation;)V

    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/BuildersKt;->launch$default(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Job;

    .line 133
    return-void
.end method

.method public final updateSettings(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p1, "f"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/pymcl/android/ui/state/UiSettings;",
            "Lcom/pymcl/android/ui/state/UiSettings;",
            ">;)V"
        }
    .end annotation

    const-string v0, "f"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    invoke-virtual {p0}, Lcom/pymcl/android/ui/state/AppState;->getSettings()Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/ui/state/UiSettings;

    invoke-virtual {p0, v0}, Lcom/pymcl/android/ui/state/AppState;->setSettings(Lcom/pymcl/android/ui/state/UiSettings;)V

    .line 137
    sget-object v0, Lcom/pymcl/android/ui/i18n/I18n;->INSTANCE:Lcom/pymcl/android/ui/i18n/I18n;

    invoke-virtual {p0}, Lcom/pymcl/android/ui/state/AppState;->getSettings()Lcom/pymcl/android/ui/state/UiSettings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/pymcl/android/ui/state/UiSettings;->getLanguage()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    sget-object v1, Lcom/pymcl/android/ui/i18n/I18n$Lang;->En:Lcom/pymcl/android/ui/i18n/I18n$Lang;

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/pymcl/android/ui/i18n/I18n$Lang;->Zh:Lcom/pymcl/android/ui/i18n/I18n$Lang;

    :goto_0
    invoke-virtual {v0, v1}, Lcom/pymcl/android/ui/i18n/I18n;->set(Lcom/pymcl/android/ui/i18n/I18n$Lang;)V

    .line 138
    return-void
.end method
