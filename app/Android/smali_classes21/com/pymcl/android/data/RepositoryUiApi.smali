.class public final Lcom/pymcl/android/data/RepositoryUiApi;
.super Ljava/lang/Object;
.source "RepositoryUiApi.kt"

# interfaces
.implements Lcom/pymcl/android/ui/state/LauncherUiApi;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/pymcl/android/data/RepositoryUiApi$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRepositoryUiApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,494:1\n1#2:495\n1#2:507\n1#2:559\n1795#3,10:496\n2068#3:506\n2069#3:508\n1805#3:509\n1960#3,3:510\n1960#3,3:513\n1960#3,3:516\n1960#3,3:519\n1960#3,3:522\n1960#3,3:525\n296#3,2:528\n777#3:530\n873#3,2:531\n296#3,2:533\n1739#3:535\n1814#3,3:536\n1739#3:539\n1814#3,3:540\n1795#3,10:548\n2068#3:558\n2069#3:560\n1805#3:561\n49#4:543\n51#4:547\n49#4:562\n51#4:566\n46#5:544\n51#5:546\n46#5:563\n51#5:565\n105#6:545\n105#6:564\n*S KotlinDebug\n*F\n+ 1 RepositoryUiApi.kt\ncom/pymcl/android/data/RepositoryUiApi\n*L\n119#1:507\n428#1:559\n119#1:496,10\n119#1:506\n119#1:508\n119#1:509\n121#1:510,3\n122#1:513,3\n123#1:516,3\n124#1:519,3\n125#1:522,3\n126#1:525,3\n218#1:528,2\n349#1:530\n349#1:531,2\n377#1:533,2\n414#1:535\n414#1:536,3\n417#1:539\n417#1:540,3\n428#1:548,10\n428#1:558\n428#1:560\n428#1:561\n422#1:543\n422#1:547\n446#1:562\n446#1:566\n422#1:544\n422#1:546\n446#1:563\n446#1:565\n422#1:545\n446#1:564\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00cc\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010$\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u0000 \u00c1\u00012\u00020\u0001:\u0002\u00c1\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0002J2\u0010\u0011\u001a\u0002H\u0012\"\u0004\u0008\u0000\u0010\u00122\u001c\u0010\u0013\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0082@\u00a2\u0006\u0002\u0010\u0017J:\u0010\u0018\u001a\u0002H\u0012\"\u0004\u0008\u0000\u0010\u00122\u0006\u0010\u0019\u001a\u0002H\u00122\u001c\u0010\u0013\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0082@\u00a2\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010!J\u001c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020$0\u001c2\u0006\u0010%\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\'\u001a\u00020(H\u0002J\u0014\u0010)\u001a\u0008\u0012\u0004\u0012\u00020*0\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u0014\u0010+\u001a\u0004\u0018\u00010,2\u0008\u0010-\u001a\u0004\u0018\u00010\u000eH\u0002J$\u0010.\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u001c2\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u00101JN\u00102\u001a\u0002H\u0012\"\u0004\u0008\u0000\u0010\u00122\u001a\u00103\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 042\u001c\u00106\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002H\u00120\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0082@\u00a2\u0006\u0002\u00107JN\u00108\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0008\u0010/\u001a\u0004\u0018\u00010\u000e2\u0008\u0010:\u001a\u0004\u0018\u00010\u000e2\u001a\u00103\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 04H\u0096@\u00a2\u0006\u0002\u0010;J\u0014\u0010<\u001a\u0008\u0012\u0004\u0012\u00020=0\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001eJ \u0010>\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010?\u001a\u0004\u0018\u00010\u000eH\u0096@\u00a2\u0006\u0002\u00101J\u0016\u0010@\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010!J\u0016\u0010A\u001a\u00020 2\u0006\u0010B\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010!J\u001a\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0E0DH\u0016J&\u0010F\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010IJ&\u0010J\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010H\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010IJ(\u0010L\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010M\u001a\u0004\u0018\u00010\u000e2\u0006\u0010N\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010IJ\u001c\u0010O\u001a\u0008\u0012\u0004\u0012\u00020P0\u001c2\u0006\u0010Q\u001a\u00020RH\u0096@\u00a2\u0006\u0002\u0010SJ\u001e\u0010T\u001a\u00020\u000e2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010XJ\u0018\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\u000c2\u0006\u00109\u001a\u00020\u000eH\u0002J\u0018\u0010Y\u001a\u00020Z2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0002J\u0010\u0010&\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0002J\u0018\u0010\\\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0002J\u001e\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`2\u000c\u0010a\u001a\u0008\u0012\u0004\u0012\u00020\u000e0bH\u0002J\u0010\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020fH\u0002J\u0014\u0010g\u001a\u0008\u0012\u0004\u0012\u00020\u000e0bH\u0096@\u00a2\u0006\u0002\u0010\u001eJ<\u0010h\u001a\u0008\u0012\u0004\u0012\u00020^0\u001c2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010j\u001a\u00020\u000e2\u0006\u0010k\u001a\u00020\u000e2\u0006\u0010l\u001a\u00020\u000e2\u0006\u0010m\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010nJ$\u0010o\u001a\u0008\u0012\u0004\u0012\u00020d0\u001c2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010p\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u00101JR\u0010q\u001a\u00020\u000e2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010p\u001a\u00020\u000e2\u0006\u0010r\u001a\u00020\u000e2\u001a\u00103\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 04H\u0096@\u00a2\u0006\u0002\u0010sJ$\u0010t\u001a\u0008\u0012\u0004\u0012\u00020u0\u001c2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u00101J,\u0010v\u001a\u0008\u0012\u0004\u0012\u00020u0\u001c2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010IJ6\u0010w\u001a\u00020 2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010x\u001a\u00020\u000e2\u0006\u0010y\u001a\u00020RH\u0096@\u00a2\u0006\u0002\u0010zJ.\u0010{\u001a\u00020 2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010x\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010|J \u0010}\u001a\u0004\u0018\u00010^2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010~\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u00101JJ\u0010\u007f\u001a\u00020\u000e2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\u000e2\u001a\u00103\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 04H\u0096@\u00a2\u0006\u0002\u0010;J,\u0010\u0080\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0081\u00012\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u00101J\u001f\u0010\u0082\u0001\u001a\u00020R2\u0006\u0010i\u001a\u00020\u000e2\u0006\u0010p\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u00101JV\u0010\u0083\u0001\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u000e2\u0013\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 0\u00142\u0014\u00103\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020 0\u00142\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000eH\u0096@\u00a2\u0006\u0003\u0010\u0086\u0001J#\u0010\u0087\u0001\u001a\u00020 2\u0006\u0010[\u001a\u00020\u000c2\u0007\u0010\u0088\u0001\u001a\u00020\u000e2\u0007\u0010\u0089\u0001\u001a\u00020\u000eH\u0002J\u001b\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u00012\u0007\u0010\u008c\u0001\u001a\u00020RH\u0096@\u00a2\u0006\u0002\u0010SJ\u000c\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0002J\t\u0010\u008f\u0001\u001a\u00020RH\u0016J\t\u0010\u0090\u0001\u001a\u00020 H\u0016J\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u000eH\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u0016\u0010\u0092\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u001e\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010\u001c2\u0006\u0010%\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010!J\u0016\u0010\u0096\u0001\u001a\t\u0012\u0005\u0012\u00030\u0097\u00010\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u009c\u0001\u001a\u00030\u009d\u00012\u0007\u0010-\u001a\u00030\u009e\u0001H\u0002J\u0010\u0010\u009f\u0001\u001a\u00030\u009d\u0001H\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010\u00a0\u0001\u001a\t\u0012\u0005\u0012\u00030\u009d\u00010DH\u0016J\u0010\u0010\u00a1\u0001\u001a\u00030\u009d\u0001H\u0096@\u00a2\u0006\u0002\u0010\u001eJ\t\u0010\u00a2\u0001\u001a\u00020 H\u0002J\u000f\u0010\u00a3\u0001\u001a\u00020 H\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u001a\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\u000e2\u0007\u0010\u00a5\u0001\u001a\u00020\u000eH\u0096@\u00a2\u0006\u0002\u0010!J\u000f\u0010\u00a6\u0001\u001a\u00020 H\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u0016\u0010\u00a7\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00a8\u00010\u001c0DH\u0016J\u0014\u0010\u00a9\u0001\u001a\u0004\u0018\u00010\u000e2\u0007\u0010\u0089\u0001\u001a\u00020\u000eH\u0016J\u0016\u0010\u00b0\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b1\u00010\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\u00b2\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b3\u00010D2\u0007\u0010\u00b4\u0001\u001a\u00020\u000eH\u0016J\u0015\u0010\u00b5\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u0016\u0010\u00b6\u0001\u001a\t\u0012\u0005\u0012\u00030\u00b7\u00010\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u0010\u0010\u00b9\u0001\u001a\u00030\u00ba\u0001H\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\u00bb\u0001\u001a\u00020 2\u0007\u0010-\u001a\u00030\u00ba\u0001H\u0096@\u00a2\u0006\u0003\u0010\u00bc\u0001J\u0016\u0010\u00bd\u0001\u001a\t\u0012\u0005\u0012\u00030\u00be\u00010\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001eJ\u0016\u0010\u00bf\u0001\u001a\t\u0012\u0005\u0012\u00030\u00c0\u00010\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0098\u0001\u001a\u00030\u0099\u00018BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001R!\u0010\u00aa\u0001\u001a\u00030\u00ab\u00018FX\u0086\u0084\u0002\u00a2\u0006\u0010\n\u0006\u0008\u00ae\u0001\u0010\u00af\u0001\u001a\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001R\u0015\u0010\u00b8\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00ca\u0001\u000e\u0008\u00c3\u0001\u0012\t\u0008\u00c4\u0001\u0012\u0004\u0008\u0003\u0010\u0000\u00a8\u0006\u00c2\u0001"
    }
    d2 = {
        "Lcom/pymcl/android/data/RepositoryUiApi;",
        "Lcom/pymcl/android/ui/state/LauncherUiApi;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "ctx",
        "getCtx$PyMCL_Android_app_debug",
        "()Landroid/content/Context;",
        "repo",
        "Lcom/pymcl/android/data/LauncherRepository;",
        "instOrNull",
        "Lcom/pymcl/core/instance/Instance;",
        "name",
        "",
        "instExisting",
        "instForInstall",
        "io",
        "T",
        "b",
        "Lkotlin/Function1;",
        "Lkotlin/coroutines/Continuation;",
        "",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "safe",
        "def",
        "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "listInstances",
        "",
        "Lcom/pymcl/android/ui/state/InstanceRow;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "createInstance",
        "",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "deleteInstance",
        "getInstalledVersions",
        "Lcom/pymcl/android/ui/state/InstalledVersion;",
        "instance",
        "loaderOf",
        "v",
        "Lcom/pymcl/core/version/ResolvedVersion;",
        "getVersionList",
        "Lcom/pymcl/android/ui/state/RemoteVersion;",
        "loaderType",
        "Lcom/pymcl/core/loader/LoaderType;",
        "s",
        "listLoaderVersions",
        "loader",
        "mc",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "withProgress",
        "onProgress",
        "Lkotlin/Function2;",
        "",
        "block",
        "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "installGame",
        "version",
        "loaderVersion",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getAccountRows",
        "Lcom/pymcl/android/ui/state/AccountRow;",
        "setActiveAccount",
        "type",
        "removeAccount",
        "addOfflineAccount",
        "username",
        "startMicrosoftLogin",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lkotlin/Pair;",
        "startAuthlibLogin",
        "api",
        "password",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "startNide8Login",
        "serverId",
        "setAccountSkin",
        "path",
        "model",
        "getJavaList",
        "Lcom/pymcl/android/ui/state/JavaRow;",
        "scan",
        "",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "downloadJava",
        "major",
        "",
        "distro",
        "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "gameDirOf",
        "Ljava/io/File;",
        "i",
        "mcOf",
        "hitOf",
        "Lcom/pymcl/android/ui/state/CatalogHit;",
        "h",
        "Lcom/pymcl/core/mods/ModHit;",
        "favs",
        "",
        "fileOf",
        "Lcom/pymcl/android/ui/state/CatalogFile;",
        "f",
        "Lcom/pymcl/core/mods/ModFile;",
        "favorites",
        "searchCatalog",
        "kind",
        "query",
        "source",
        "gameVersion",
        "category",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getProjectFiles",
        "id",
        "installMod",
        "file",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getInstalledMods",
        "Lcom/pymcl/android/ui/state/InstalledEntry;",
        "getInstalled",
        "setInstalledEnabled",
        "filename",
        "enabled",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "deleteInstalled",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "resolveCatalogLink",
        "url",
        "importLocalFile",
        "checkModUpdates",
        "",
        "toggleFavorite",
        "launchGame",
        "onLog",
        "server",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "rememberLobby",
        "vid",
        "address",
        "collectGameExit",
        "Lcom/pymcl/android/ui/state/GameExitInfo;",
        "userStopped",
        "gameProcess",
        "Landroid/app/ActivityManager$RunningAppProcessInfo;",
        "isGameRunning",
        "stopGame",
        "activeAccountName",
        "fetchNews",
        "Lcom/pymcl/android/ui/state/NewsItem;",
        "getServers",
        "Lcom/pymcl/android/ui/state/ServerRow;",
        "getPlaytime",
        "Lcom/pymcl/android/ui/state/PlaytimeRow;",
        "mp",
        "Lcom/pymcl/multiplayer/MultiplayerController;",
        "getMp",
        "()Lcom/pymcl/multiplayer/MultiplayerController;",
        "toUi",
        "Lcom/pymcl/android/ui/state/MpState;",
        "Lcom/pymcl/multiplayer/MultiplayerState;",
        "terracottaState",
        "terracottaStates",
        "terracottaStart",
        "prepareMp",
        "terracottaHost",
        "terracottaJoin",
        "code",
        "terracottaStop",
        "lanWorlds",
        "Lcom/pymcl/android/ui/state/LanWorldRow;",
        "normalizeDirect",
        "ai",
        "Lcom/pymcl/android/data/AiBridge;",
        "getAi",
        "()Lcom/pymcl/android/data/AiBridge;",
        "ai$delegate",
        "Lkotlin/Lazy;",
        "aiListChats",
        "Lcom/pymcl/android/ui/state/ChatSummary;",
        "aiSend",
        "Lcom/pymcl/android/ui/state/AiItem;",
        "text",
        "aiListModels",
        "aiPermissionRules",
        "Lcom/pymcl/android/ui/state/PermissionRule;",
        "sources",
        "getSettings",
        "Lcom/pymcl/android/ui/state/UiSettings;",
        "saveSettings",
        "(Lcom/pymcl/android/ui/state/UiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "feedbackHistory",
        "Lcom/pymcl/android/ui/state/FeedbackRecord;",
        "helpArticles",
        "Lcom/pymcl/android/ui/state/HelpArticle;",
        "Companion",
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

.field public static final Companion:Lcom/pymcl/android/data/RepositoryUiApi$Companion;

.field public static final LOBBY_NAME:Ljava/lang/String; = "\u9676\u74e6\u8054\u673a\u5927\u5385"

.field private static final SOURCES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final launchLock:Ljava/util/concurrent/atomic/AtomicBoolean;


# instance fields
.field private final ai$delegate:Lkotlin/Lazy;

.field private final ctx:Landroid/content/Context;

.field private final repo:Lcom/pymcl/android/data/LauncherRepository;

.field private final sources:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$8xSYh2OZD6bLjhE-OdlFjlgGV0Q(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/AiBridge;
    .locals 0

    invoke-static {p0}, Lcom/pymcl/android/data/RepositoryUiApi;->ai_delegate$lambda$0(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/AiBridge;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/pymcl/android/data/RepositoryUiApi;->Companion:Lcom/pymcl/android/data/RepositoryUiApi$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/pymcl/android/data/RepositoryUiApi;->$stable:I

    .line 44
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lcom/pymcl/android/data/RepositoryUiApi;->launchLock:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 45
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const-string v2, "auto"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "official"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "bmclapi"

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/pymcl/android/data/RepositoryUiApi;->SOURCES:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi;->ctx:Landroid/content/Context;

    .line 81
    sget-object v0, Lcom/pymcl/android/data/LauncherRepository;->Companion:Lcom/pymcl/android/data/LauncherRepository$Companion;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi;->ctx:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/pymcl/android/data/LauncherRepository$Companion;->get(Landroid/content/Context;)Lcom/pymcl/android/data/LauncherRepository;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi;->repo:Lcom/pymcl/android/data/LauncherRepository;

    .line 450
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/pymcl/android/data/RepositoryUiApi$$ExternalSyntheticLambda0;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;)V

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi;->ai$delegate:Lkotlin/Lazy;

    .line 457
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "auto"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "official"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "bmclapi"

    aput-object v2, v0, v1

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi;->sources:Ljava/util/List;

    .line 41
    return-void
.end method

.method public static final synthetic access$fileOf(Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/core/mods/ModFile;)Lcom/pymcl/android/ui/state/CatalogFile;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;
    .param p1, "f"    # Lcom/pymcl/core/mods/ModFile;

    .line 41
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->fileOf(Lcom/pymcl/core/mods/ModFile;)Lcom/pymcl/android/ui/state/CatalogFile;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$gameDirOf(Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;
    .param p1, "i"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "version"    # Ljava/lang/String;

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/RepositoryUiApi;->gameDirOf(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$gameDirOf(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/RepositoryUiApi;->gameDirOf(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getLaunchLock$cp()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    .line 41
    sget-object v0, Lcom/pymcl/android/data/RepositoryUiApi;->launchLock:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method public static final synthetic access$getMp(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/multiplayer/MultiplayerController;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;

    .line 41
    invoke-direct {p0}, Lcom/pymcl/android/data/RepositoryUiApi;->getMp()Lcom/pymcl/multiplayer/MultiplayerController;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$getRepo$p(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/LauncherRepository;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;

    .line 41
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi;->repo:Lcom/pymcl/android/data/LauncherRepository;

    return-object v0
.end method

.method public static final synthetic access$getSOURCES$cp()Ljava/util/List;
    .locals 1

    .line 41
    sget-object v0, Lcom/pymcl/android/data/RepositoryUiApi;->SOURCES:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getSources$p(Lcom/pymcl/android/data/RepositoryUiApi;)Ljava/util/List;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;

    .line 41
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi;->sources:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$hitOf(Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/core/mods/ModHit;Ljava/util/Set;)Lcom/pymcl/android/ui/state/CatalogHit;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;
    .param p1, "h"    # Lcom/pymcl/core/mods/ModHit;
    .param p2, "favs"    # Ljava/util/Set;

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/RepositoryUiApi;->hitOf(Lcom/pymcl/core/mods/ModHit;Ljava/util/Set;)Lcom/pymcl/android/ui/state/CatalogHit;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$instForInstall(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;
    .param p1, "name"    # Ljava/lang/String;

    .line 41
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->instForInstall(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$instOrNull(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;
    .param p1, "name"    # Ljava/lang/String;

    .line 41
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->instOrNull(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$io(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;
    .param p1, "b"    # Lkotlin/jvm/functions/Function1;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 41
    invoke-direct {p0, p1, p2}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$loaderOf(Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/core/version/ResolvedVersion;)Ljava/lang/String;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;
    .param p1, "v"    # Lcom/pymcl/core/version/ResolvedVersion;

    .line 41
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->loaderOf(Lcom/pymcl/core/version/ResolvedVersion;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$loaderType(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;)Lcom/pymcl/core/loader/LoaderType;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;
    .param p1, "s"    # Ljava/lang/String;

    .line 41
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->loaderType(Ljava/lang/String;)Lcom/pymcl/core/loader/LoaderType;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$prepareMp(Lcom/pymcl/android/data/RepositoryUiApi;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;

    .line 41
    invoke-direct {p0}, Lcom/pymcl/android/data/RepositoryUiApi;->prepareMp()V

    return-void
.end method

.method public static final synthetic access$rememberLobby(Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;
    .param p1, "i"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "vid"    # Ljava/lang/String;
    .param p3, "address"    # Ljava/lang/String;

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/android/data/RepositoryUiApi;->rememberLobby(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$safe(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;
    .param p1, "def"    # Ljava/lang/Object;
    .param p2, "b"    # Lkotlin/jvm/functions/Function1;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$toUi(Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/multiplayer/MultiplayerState;)Lcom/pymcl/android/ui/state/MpState;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;
    .param p1, "s"    # Lcom/pymcl/multiplayer/MultiplayerState;

    .line 41
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->toUi(Lcom/pymcl/multiplayer/MultiplayerState;)Lcom/pymcl/android/ui/state/MpState;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$withProgress(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p0, "$this"    # Lcom/pymcl/android/data/RepositoryUiApi;
    .param p1, "onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p2, "block"    # Lkotlin/jvm/functions/Function1;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/pymcl/android/data/RepositoryUiApi;->withProgress(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private static final ai_delegate$lambda$0(Lcom/pymcl/android/data/RepositoryUiApi;)Lcom/pymcl/android/data/AiBridge;
    .locals 2
    .param p0, "this$0"    # Lcom/pymcl/android/data/RepositoryUiApi;

    .line 450
    new-instance v0, Lcom/pymcl/android/data/AiBridge;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi;->ctx:Landroid/content/Context;

    invoke-direct {v0, v1, p0}, Lcom/pymcl/android/data/AiBridge;-><init>(Landroid/content/Context;Lcom/pymcl/android/data/RepositoryUiApi;)V

    return-object v0
.end method

.method private final fileOf(Lcom/pymcl/core/mods/ModFile;)Lcom/pymcl/android/ui/state/CatalogFile;
    .locals 9
    .param p1, "f"    # Lcom/pymcl/core/mods/ModFile;

    .line 222
    new-instance v0, Lcom/pymcl/android/ui/state/CatalogFile;

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModFile;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModFile;->getGameVersions()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModFile;->getLoaders()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModFile;->getDate()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModFile;->getSize()J

    move-result-wide v5

    const/16 v7, 0x400

    int-to-long v7, v7

    div-long/2addr v5, v7

    long-to-int v5, v5

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModFile;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModFile;->getDisplayName()Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/ui/state/CatalogFile;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final gameDirOf(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;
    .locals 2
    .param p1, "i"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "version"    # Ljava/lang/String;

    .line 215
    move-object v0, p2

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi;->repo:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/pymcl/core/instance/Instance;->settings(Ljava/lang/String;Lcom/pymcl/core/config/ConfigStore;)Lcom/pymcl/core/instance/VersionSettings;

    move-result-object v0

    invoke-virtual {p1}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/pymcl/core/instance/VersionSettings;->gameDir(Ljava/io/File;)Ljava/io/File;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method private final gameDirOf(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
    .locals 1
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;

    .line 217
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->instExisting(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Lcom/pymcl/android/data/RepositoryUiApi;->gameDirOf(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method private final gameProcess()Landroid/app/ActivityManager$RunningAppProcessInfo;
    .locals 10

    .line 377
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi;->ctx:Landroid/content/Context;

    const-string v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.ActivityManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$firstOrNull\\1":Ljava/lang/Iterable;
    const/4 v2, 0x0

    .line 533
    .local v2, "$i$f$firstOrNull\\1\\377":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .local v4, "element\\1":Ljava/lang/Object;
    move-object v5, v4

    check-cast v5, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .local v5, "it\\2":Landroid/app/ActivityManager$RunningAppProcessInfo;
    const/4 v6, 0x0

    .line 377
    .local v6, "$i$a$-firstOrNull-RepositoryUiApi$gameProcess$1\\2\\533\\0":I
    iget-object v7, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    iget-object v8, p0, Lcom/pymcl/android/data/RepositoryUiApi;->ctx:Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, ":game"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    .line 533
    .end local v5    # "it\\2":Landroid/app/ActivityManager$RunningAppProcessInfo;
    .end local v6    # "$i$a$-firstOrNull-RepositoryUiApi$gameProcess$1\\2\\533\\0":I
    if-eqz v5, :cond_0

    move-object v1, v4

    goto :goto_0

    .line 534
    .end local v4    # "element\\1":Ljava/lang/Object;
    :cond_1
    nop

    .end local v0    # "$this$firstOrNull\\1":Ljava/lang/Iterable;
    .end local v2    # "$i$f$firstOrNull\\1\\377":I
    :goto_0
    check-cast v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 377
    :cond_2
    return-object v1
.end method

.method private final getMp()Lcom/pymcl/multiplayer/MultiplayerController;
    .locals 2

    .line 406
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerController;->Companion:Lcom/pymcl/multiplayer/MultiplayerController$Companion;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi;->ctx:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/pymcl/multiplayer/MultiplayerController$Companion;->get(Landroid/content/Context;)Lcom/pymcl/multiplayer/MultiplayerController;

    move-result-object v0

    return-object v0
.end method

.method private final hitOf(Lcom/pymcl/core/mods/ModHit;Ljava/util/Set;)Lcom/pymcl/android/ui/state/CatalogHit;
    .locals 13
    .param p1, "h"    # Lcom/pymcl/core/mods/ModHit;
    .param p2, "favs"    # Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/core/mods/ModHit;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/pymcl/android/ui/state/CatalogHit;"
        }
    .end annotation

    .line 221
    new-instance v0, Lcom/pymcl/android/ui/state/CatalogHit;

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModHit;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModHit;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModHit;->getAuthor()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModHit;->getDownloads()J

    move-result-wide v4

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModHit;->getDesc()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModHit;->getSource()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModHit;->getCategories()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModHit;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-interface {p2, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModHit;->getPageUrl()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {p1}, Lcom/pymcl/core/mods/ModHit;->getIconUrl()Ljava/lang/String;

    move-result-object v12

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v12}, Lcom/pymcl/android/ui/state/CatalogHit;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private final instExisting(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;
    .locals 4
    .param p1, "name"    # Ljava/lang/String;

    .line 91
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->instOrNull(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    sget-object v1, Lcom/pymcl/android/data/RepositoryUiApi;->Companion:Lcom/pymcl/android/data/RepositoryUiApi$Companion;

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi;->repo:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v2

    const-string v3, "default_instance"

    invoke-virtual {v2, v3}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lcom/pymcl/android/data/RepositoryUiApi$Companion;->missingInstanceMessage(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final instForInstall(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;
    .locals 6
    .param p1, "name"    # Ljava/lang/String;

    .line 92
    invoke-direct {p0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->instOrNull(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    if-nez v0, :cond_1

    .line 93
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi;->repo:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->currentInstance()Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    move-object v3, v0

    .line 495
    .local v3, "it\\1":Lcom/pymcl/core/instance/Instance;
    const/4 v4, 0x0

    .line 93
    .local v4, "$i$a$-also-RepositoryUiApi$instForInstall$1\\1\\93\\0":I
    invoke-virtual {v3}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {v3, v2, v1, v2}, Lcom/pymcl/core/instance/Instance;->create$default(Lcom/pymcl/core/instance/Instance;Ljava/util/Map;ILjava/lang/Object;)V

    goto :goto_0

    .end local v3    # "it\\1":Lcom/pymcl/core/instance/Instance;
    .end local v4    # "$i$a$-also-RepositoryUiApi$instForInstall$1\\1\\93\\0":I
    :cond_0
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi;->repo:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/pymcl/core/instance/InstanceManager;->get(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    move-object v3, v0

    .line 495
    .local v3, "it\\2":Lcom/pymcl/core/instance/Instance;
    const/4 v4, 0x0

    .line 93
    .local v4, "$i$a$-also-RepositoryUiApi$instForInstall$2\\2\\93\\0":I
    invoke-static {v3, v2, v1, v2}, Lcom/pymcl/core/instance/Instance;->create$default(Lcom/pymcl/core/instance/Instance;Ljava/util/Map;ILjava/lang/Object;)V

    .end local v3    # "it\\2":Lcom/pymcl/core/instance/Instance;
    .end local v4    # "$i$a$-also-RepositoryUiApi$instForInstall$2\\2\\93\\0":I
    :cond_1
    :goto_0
    return-object v0
.end method

.method private final instOrNull(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;
    .locals 4
    .param p1, "name"    # Ljava/lang/String;

    .line 90
    sget-object v0, Lcom/pymcl/android/data/RepositoryUiApi;->Companion:Lcom/pymcl/android/data/RepositoryUiApi$Companion;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi;->repo:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getInstances()Lcom/pymcl/core/instance/InstanceManager;

    move-result-object v1

    iget-object v2, p0, Lcom/pymcl/android/data/RepositoryUiApi;->repo:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v2

    const-string v3, "default_instance"

    invoke-virtual {v2, v3}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2, p1}, Lcom/pymcl/android/data/RepositoryUiApi$Companion;->findInstance(Lcom/pymcl/core/instance/InstanceManager;Ljava/lang/String;Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v0

    return-object v0
.end method

.method private final io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "b"    # Lkotlin/jvm/functions/Function1;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 94
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$io$2;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/pymcl/android/data/RepositoryUiApi$io$2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method private final loaderOf(Lcom/pymcl/core/version/ResolvedVersion;)Ljava/lang/String;
    .locals 14
    .param p1, "v"    # Lcom/pymcl/core/version/ResolvedVersion;

    .line 119
    invoke-virtual {p1}, Lcom/pymcl/core/version/ResolvedVersion;->getJson()Ljava/util/Map;

    move-result-object v0

    const-string v1, "libraries"

    invoke-static {v0, v1}, Lcom/pymcl/core/util/JsonKt;->arr(Ljava/util/Map;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/pymcl/core/util/JsonKt;->objs(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$mapNotNull\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 496
    .local v1, "$i$f$mapNotNull\\1\\119":I
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination\\2":Ljava/util/Collection;
    move-object v3, v0

    .local v3, "$this$mapNotNullTo\\2":Ljava/lang/Iterable;
    const/4 v4, 0x0

    .line 505
    .local v4, "$i$f$mapNotNullTo\\2\\496":I
    move-object v5, v3

    .local v5, "$this$forEach\\3":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 506
    .local v6, "$i$f$forEach\\3\\505":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element\\3":Ljava/lang/Object;
    move-object v9, v8

    .local v9, "element\\4":Ljava/lang/Object;
    const/4 v10, 0x0

    .line 505
    .local v10, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1\\4\\506\\2":I
    move-object v11, v9

    check-cast v11, Ljava/util/Map;

    .local v11, "it\\6":Ljava/util/Map;
    const/4 v12, 0x0

    .line 119
    .local v12, "$i$a$-mapNotNull-RepositoryUiApi$loaderOf$libs$1\\6\\505\\0":I
    const-string v13, "name"

    invoke-static {v11, v13}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 505
    .end local v11    # "it\\6":Ljava/util/Map;
    .end local v12    # "$i$a$-mapNotNull-RepositoryUiApi$loaderOf$libs$1\\6\\505\\0":I
    if-eqz v11, :cond_0

    .line 507
    .local v11, "it\\4":Ljava/lang/Object;
    const/4 v12, 0x0

    .line 505
    .local v12, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1\\5\\507\\4":I
    invoke-interface {v2, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 506
    .end local v9    # "element\\4":Ljava/lang/Object;
    .end local v10    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1\\4\\506\\2":I
    .end local v11    # "it\\4":Ljava/lang/Object;
    .end local v12    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1\\5\\507\\4":I
    :cond_0
    nop

    .end local v8    # "element\\3":Ljava/lang/Object;
    goto :goto_0

    .line 508
    :cond_1
    nop

    .line 509
    .end local v5    # "$this$forEach\\3":Ljava/lang/Iterable;
    .end local v6    # "$i$f$forEach\\3\\505":I
    nop

    .end local v2    # "destination\\2":Ljava/util/Collection;
    .end local v3    # "$this$mapNotNullTo\\2":Ljava/lang/Iterable;
    .end local v4    # "$i$f$mapNotNullTo\\2\\496":I
    check-cast v2, Ljava/util/List;

    .line 496
    nop

    .line 119
    .end local v0    # "$this$mapNotNull\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$mapNotNull\\1\\119":I
    nop

    .line 120
    .local v2, "libs":Ljava/util/List;
    nop

    .line 121
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any\\7":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 510
    .local v1, "$i$f$any\\7\\121":I
    instance-of v3, v0, Ljava/util/Collection;

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v3, :cond_2

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    move v0, v7

    goto :goto_1

    .line 511
    :cond_2
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element\\7":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it\\8":Ljava/lang/String;
    const/4 v10, 0x0

    .line 121
    .local v10, "$i$a$-any-RepositoryUiApi$loaderOf$1\\8\\511\\0":I
    const-string v11, "net.neoforged"

    invoke-static {v9, v11, v7, v5, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v9

    .line 511
    .end local v9    # "it\\8":Ljava/lang/String;
    .end local v10    # "$i$a$-any-RepositoryUiApi$loaderOf$1\\8\\511\\0":I
    if-eqz v9, :cond_3

    move v0, v4

    goto :goto_1

    .line 512
    .end local v8    # "element\\7":Ljava/lang/Object;
    :cond_4
    move v0, v7

    .line 121
    .end local v0    # "$this$any\\7":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any\\7\\121":I
    :goto_1
    if-eqz v0, :cond_5

    const-string v6, "NeoForge"

    goto/16 :goto_a

    .line 122
    :cond_5
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any\\9":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 513
    .local v1, "$i$f$any\\9\\122":I
    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_6

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_6

    move v0, v7

    goto :goto_4

    .line 514
    :cond_6
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element\\9":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it\\10":Ljava/lang/String;
    const/4 v10, 0x0

    .line 122
    .local v10, "$i$a$-any-RepositoryUiApi$loaderOf$2\\10\\514\\0":I
    const-string v11, "net.minecraftforge:forge"

    invoke-static {v9, v11, v7, v5, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    const-string v11, "net.minecraftforge:fmlloader"

    invoke-static {v9, v11, v7, v5, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    goto :goto_2

    :cond_8
    move v9, v7

    goto :goto_3

    :cond_9
    :goto_2
    move v9, v4

    .line 514
    .end local v9    # "it\\10":Ljava/lang/String;
    .end local v10    # "$i$a$-any-RepositoryUiApi$loaderOf$2\\10\\514\\0":I
    :goto_3
    if-eqz v9, :cond_7

    move v0, v4

    goto :goto_4

    .line 515
    .end local v8    # "element\\9":Ljava/lang/Object;
    :cond_a
    move v0, v7

    .line 122
    .end local v0    # "$this$any\\9":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any\\9\\122":I
    :goto_4
    if-nez v0, :cond_1c

    invoke-virtual {p1}, Lcom/pymcl/core/version/ResolvedVersion;->getMainClass()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    const-string v1, "bootstraplauncher"

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v0, v1, v7, v5, v6}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto/16 :goto_9

    .line 123
    :cond_b
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any\\11":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 516
    .local v1, "$i$f$any\\11\\123":I
    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_c

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_c

    move v0, v7

    goto :goto_5

    .line 517
    :cond_c
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element\\11":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it\\12":Ljava/lang/String;
    const/4 v10, 0x0

    .line 123
    .local v10, "$i$a$-any-RepositoryUiApi$loaderOf$3\\12\\517\\0":I
    const-string v11, "org.quiltmc:quilt-loader"

    invoke-static {v9, v11, v7, v5, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v9

    .line 517
    .end local v9    # "it\\12":Ljava/lang/String;
    .end local v10    # "$i$a$-any-RepositoryUiApi$loaderOf$3\\12\\517\\0":I
    if-eqz v9, :cond_d

    move v0, v4

    goto :goto_5

    .line 518
    .end local v8    # "element\\11":Ljava/lang/Object;
    :cond_e
    move v0, v7

    .line 123
    .end local v0    # "$this$any\\11":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any\\11\\123":I
    :goto_5
    if-eqz v0, :cond_f

    const-string v6, "Quilt"

    goto/16 :goto_a

    .line 124
    :cond_f
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any\\13":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 519
    .local v1, "$i$f$any\\13\\124":I
    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_10

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_10

    move v0, v7

    goto :goto_6

    .line 520
    :cond_10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element\\13":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it\\14":Ljava/lang/String;
    const/4 v10, 0x0

    .line 124
    .local v10, "$i$a$-any-RepositoryUiApi$loaderOf$4\\14\\520\\0":I
    const-string v11, "net.fabricmc:fabric-loader"

    invoke-static {v9, v11, v7, v5, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v9

    .line 520
    .end local v9    # "it\\14":Ljava/lang/String;
    .end local v10    # "$i$a$-any-RepositoryUiApi$loaderOf$4\\14\\520\\0":I
    if-eqz v9, :cond_11

    move v0, v4

    goto :goto_6

    .line 521
    .end local v8    # "element\\13":Ljava/lang/Object;
    :cond_12
    move v0, v7

    .line 124
    .end local v0    # "$this$any\\13":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any\\13\\124":I
    :goto_6
    if-eqz v0, :cond_13

    const-string v6, "Fabric"

    goto/16 :goto_a

    .line 125
    :cond_13
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any\\15":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 522
    .local v1, "$i$f$any\\15\\125":I
    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_14

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_14

    move v0, v7

    goto :goto_7

    .line 523
    :cond_14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_15
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_16

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element\\15":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it\\16":Ljava/lang/String;
    const/4 v10, 0x0

    .line 125
    .local v10, "$i$a$-any-RepositoryUiApi$loaderOf$5\\16\\523\\0":I
    const-string v11, "optifine:"

    invoke-static {v9, v11, v7, v5, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v9

    .line 523
    .end local v9    # "it\\16":Ljava/lang/String;
    .end local v10    # "$i$a$-any-RepositoryUiApi$loaderOf$5\\16\\523\\0":I
    if-eqz v9, :cond_15

    move v0, v4

    goto :goto_7

    .line 524
    .end local v8    # "element\\15":Ljava/lang/Object;
    :cond_16
    move v0, v7

    .line 125
    .end local v0    # "$this$any\\15":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any\\15\\125":I
    :goto_7
    if-eqz v0, :cond_17

    const-string v6, "OptiFine"

    goto :goto_a

    .line 126
    :cond_17
    move-object v0, v2

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$any\\17":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 525
    .local v1, "$i$f$any\\17\\126":I
    instance-of v3, v0, Ljava/util/Collection;

    if-eqz v3, :cond_18

    move-object v3, v0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_18

    move v4, v7

    goto :goto_8

    .line 526
    :cond_18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .local v8, "element\\17":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    .local v9, "it\\18":Ljava/lang/String;
    const/4 v10, 0x0

    .line 126
    .local v10, "$i$a$-any-RepositoryUiApi$loaderOf$6\\18\\526\\0":I
    const-string v11, "com.mumfrey:liteloader"

    invoke-static {v9, v11, v7, v5, v6}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v9

    .line 526
    .end local v9    # "it\\18":Ljava/lang/String;
    .end local v10    # "$i$a$-any-RepositoryUiApi$loaderOf$6\\18\\526\\0":I
    if-eqz v9, :cond_19

    goto :goto_8

    .line 527
    .end local v8    # "element\\17":Ljava/lang/Object;
    :cond_1a
    move v4, v7

    .line 126
    .end local v0    # "$this$any\\17":Ljava/lang/Iterable;
    .end local v1    # "$i$f$any\\17\\126":I
    :goto_8
    if-eqz v4, :cond_1b

    const-string v6, "LiteLoader"

    goto :goto_a

    .line 127
    :cond_1b
    goto :goto_a

    .line 122
    :cond_1c
    :goto_9
    const-string v6, "Forge"

    .line 120
    :goto_a
    return-object v6
.end method

.method private final loaderOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 13
    .param p1, "version"    # Ljava/lang/String;

    .line 218
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLowerCase(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 495
    .local v0, "v\\1":Ljava/lang/String;
    const/4 v1, 0x0

    .line 218
    .local v1, "$i$a$-let-RepositoryUiApi$loaderOf$7\\1\\218\\0":I
    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "neoforge"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    const-string v5, "forge"

    aput-object v5, v2, v3

    const-string v3, "fabric"

    const/4 v5, 0x2

    aput-object v3, v2, v5

    const/4 v3, 0x3

    const-string v6, "quilt"

    aput-object v6, v2, v3

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .local v2, "$this$firstOrNull\\2":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 528
    .local v3, "$i$f$firstOrNull\\2\\218":I
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .local v7, "element\\2":Ljava/lang/Object;
    move-object v9, v7

    check-cast v9, Ljava/lang/String;

    .local v9, "it\\3":Ljava/lang/String;
    const/4 v10, 0x0

    .line 218
    .local v10, "$i$a$-firstOrNull-RepositoryUiApi$loaderOf$7$1\\3\\528\\1":I
    move-object v11, v0

    check-cast v11, Ljava/lang/CharSequence;

    move-object v12, v9

    check-cast v12, Ljava/lang/CharSequence;

    invoke-static {v11, v12, v4, v5, v8}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v8

    .line 528
    .end local v9    # "it\\3":Ljava/lang/String;
    .end local v10    # "$i$a$-firstOrNull-RepositoryUiApi$loaderOf$7$1\\3\\528\\1":I
    if-eqz v8, :cond_0

    move-object v8, v7

    goto :goto_0

    .line 529
    .end local v7    # "element\\2":Ljava/lang/Object;
    :cond_1
    nop

    .line 218
    .end local v2    # "$this$firstOrNull\\2":Ljava/lang/Iterable;
    .end local v3    # "$i$f$firstOrNull\\2\\218":I
    :goto_0
    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_2

    const-string v8, ""

    .end local v0    # "v\\1":Ljava/lang/String;
    .end local v1    # "$i$a$-let-RepositoryUiApi$loaderOf$7\\1\\218\\0":I
    :cond_2
    return-object v8
.end method

.method private final loaderType(Ljava/lang/String;)Lcom/pymcl/core/loader/LoaderType;
    .locals 3
    .param p1, "s"    # Ljava/lang/String;

    .line 136
    const/4 v0, 0x0

    if-eqz p1, :cond_0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "toLowerCase(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v2, "neoforge"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 137
    :cond_1
    sget-object v0, Lcom/pymcl/core/loader/LoaderType;->NEOFORGE:Lcom/pymcl/core/loader/LoaderType;

    goto :goto_2

    .line 136
    :sswitch_1
    const-string v2, "quilt"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    .line 137
    :cond_2
    sget-object v0, Lcom/pymcl/core/loader/LoaderType;->QUILT:Lcom/pymcl/core/loader/LoaderType;

    goto :goto_2

    .line 136
    :sswitch_2
    const-string v2, "forge"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    .line 137
    :cond_3
    sget-object v0, Lcom/pymcl/core/loader/LoaderType;->FORGE:Lcom/pymcl/core/loader/LoaderType;

    goto :goto_2

    .line 136
    :sswitch_3
    const-string v2, "optifine"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_1

    .line 138
    :cond_4
    sget-object v0, Lcom/pymcl/core/loader/LoaderType;->OPTIFINE:Lcom/pymcl/core/loader/LoaderType;

    goto :goto_2

    .line 136
    :sswitch_4
    const-string v2, "fabric"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_1

    .line 137
    :cond_5
    sget-object v0, Lcom/pymcl/core/loader/LoaderType;->FABRIC:Lcom/pymcl/core/loader/LoaderType;

    goto :goto_2

    .line 136
    :sswitch_5
    const-string v2, "liteloader"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_1

    .line 138
    :cond_6
    sget-object v0, Lcom/pymcl/core/loader/LoaderType;->LITELOADER:Lcom/pymcl/core/loader/LoaderType;

    goto :goto_2

    :cond_7
    :goto_1
    nop

    .line 139
    :goto_2
    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x717fd9bf -> :sswitch_5
        -0x4c6c835b -> :sswitch_4
        -0x4b9dd30 -> :sswitch_3
        0x5d18b67 -> :sswitch_2
        0x66f270d -> :sswitch_1
        0x44d220cf -> :sswitch_0
    .end sparse-switch
.end method

.method private final mcOf(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;

    .line 219
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, p0

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi;

    .local v0, "$this$mcOf_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    const/4 v1, 0x0

    .line 220
    .local v1, "$i$a$-runCatching-RepositoryUiApi$mcOf$1\\1\\219\\0":I
    sget-object v2, Lcom/pymcl/core/util/FileUtil;->INSTANCE:Lcom/pymcl/core/util/FileUtil;

    invoke-direct {v0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->instOrNull(Ljava/lang/String;)Lcom/pymcl/core/instance/Instance;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v3, p2}, Lcom/pymcl/core/instance/Instance;->versionJson(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/pymcl/core/util/FileUtil;->readJsonObj(Ljava/io/File;)Ljava/util/Map;

    move-result-object v2

    .local v2, "j\\1":Ljava/util/Map;
    const-string v3, "inheritsFrom"

    invoke-static {v2, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, "id"

    invoke-static {v2, v3}, Lcom/pymcl/core/util/JsonKt;->str(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    move-object v3, p2

    .line 219
    .end local v0    # "$this$mcOf_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    .end local v1    # "$i$a$-runCatching-RepositoryUiApi$mcOf$1\\1\\219\\0":I
    .end local v2    # "j\\1":Ljava/util/Map;
    :cond_0
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 220
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v0, p2

    :cond_1
    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final prepareMp()V
    .locals 17

    .line 427
    move-object/from16 v1, p0

    invoke-direct {v1}, Lcom/pymcl/android/data/RepositoryUiApi;->getMp()Lcom/pymcl/multiplayer/MultiplayerController;

    move-result-object v0

    iget-object v2, v1, Lcom/pymcl/android/data/RepositoryUiApi;->repo:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v2}, Lcom/pymcl/android/data/LauncherRepository;->getAccounts()Lcom/pymcl/core/account/AccountStore;

    move-result-object v2

    invoke-virtual {v2}, Lcom/pymcl/core/account/AccountStore;->active()Lcom/pymcl/core/account/Account;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/pymcl/core/account/Account;->getName()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Lcom/pymcl/multiplayer/MultiplayerController;->setPlayerName(Ljava/lang/String;)V

    .line 428
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    move-object v0, v1

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi;

    .line 495
    .local v0, "$this$prepareMp_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    const/4 v2, 0x0

    .line 428
    .local v2, "$i$a$-runCatching-RepositoryUiApi$prepareMp$configured$1\\1\\428\\0":I
    iget-object v4, v0, Lcom/pymcl/android/data/RepositoryUiApi;->repo:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v4}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v4

    const-string v5, "terracotta_extra_nodes"

    invoke-virtual {v4, v5}, Lcom/pymcl/core/config/ConfigStore;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/pymcl/core/util/JsonKt;->a(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_4

    check-cast v4, Ljava/lang/Iterable;

    .local v4, "$this$mapNotNull\\2":Ljava/lang/Iterable;
    const/4 v5, 0x0

    .line 548
    .local v5, "$i$f$mapNotNull\\2\\428":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    check-cast v6, Ljava/util/Collection;

    .local v6, "destination\\3":Ljava/util/Collection;
    move-object v7, v4

    .local v7, "$this$mapNotNullTo\\3":Ljava/lang/Iterable;
    const/4 v8, 0x0

    .line 557
    .local v8, "$i$f$mapNotNullTo\\3\\548":I
    move-object v9, v7

    .local v9, "$this$forEach\\4":Ljava/lang/Iterable;
    const/4 v10, 0x0

    .line 558
    .local v10, "$i$f$forEach\\4\\557":I
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_3

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    .local v12, "element\\4":Ljava/lang/Object;
    move-object v13, v12

    .local v13, "element\\5":Ljava/lang/Object;
    const/4 v14, 0x0

    .line 557
    .local v14, "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1\\5\\558\\3":I
    move-object v15, v13

    .local v15, "it\\6":Ljava/lang/Object;
    const/16 v16, 0x0

    .line 428
    .local v16, "$i$a$-mapNotNull-RepositoryUiApi$prepareMp$configured$1$1\\6\\557\\1":I
    instance-of v3, v15, Ljava/lang/String;

    if-eqz v3, :cond_1

    move-object v3, v15

    check-cast v3, Ljava/lang/String;

    goto :goto_2

    :cond_1
    const/4 v3, 0x0

    .line 557
    .end local v15    # "it\\6":Ljava/lang/Object;
    .end local v16    # "$i$a$-mapNotNull-RepositoryUiApi$prepareMp$configured$1$1\\6\\557\\1":I
    :goto_2
    if-eqz v3, :cond_2

    .line 559
    .local v3, "it\\5":Ljava/lang/Object;
    const/4 v15, 0x0

    .line 557
    .local v15, "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1\\7\\559\\5":I
    invoke-interface {v6, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 558
    .end local v3    # "it\\5":Ljava/lang/Object;
    .end local v13    # "element\\5":Ljava/lang/Object;
    .end local v14    # "$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1\\5\\558\\3":I
    .end local v15    # "$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1\\7\\559\\5":I
    :cond_2
    nop

    .end local v12    # "element\\4":Ljava/lang/Object;
    goto :goto_1

    .line 560
    :cond_3
    nop

    .line 561
    .end local v9    # "$this$forEach\\4":Ljava/lang/Iterable;
    .end local v10    # "$i$f$forEach\\4\\557":I
    nop

    .end local v6    # "destination\\3":Ljava/util/Collection;
    .end local v7    # "$this$mapNotNullTo\\3":Ljava/lang/Iterable;
    .end local v8    # "$i$f$mapNotNullTo\\3\\548":I
    move-object v3, v6

    check-cast v3, Ljava/util/List;

    .line 548
    nop

    .end local v4    # "$this$mapNotNull\\2":Ljava/lang/Iterable;
    .end local v5    # "$i$f$mapNotNull\\2\\428":I
    goto :goto_3

    .line 428
    :cond_4
    const/4 v3, 0x0

    .end local v0    # "$this$prepareMp_u24lambda_u240\\1":Lcom/pymcl/android/data/RepositoryUiApi;
    .end local v2    # "$i$a$-runCatching-RepositoryUiApi$prepareMp$configured$1\\1\\428\\0":I
    :goto_3
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :goto_4
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v0, 0x0

    :cond_5
    check-cast v0, Ljava/util/List;

    .line 429
    if-eqz v0, :cond_7

    .line 428
    nop

    .line 429
    move-object v2, v0

    .line 495
    .local v2, "it\\8":Ljava/util/List;
    const/4 v3, 0x0

    .line 429
    .local v3, "$i$a$-takeIf-RepositoryUiApi$prepareMp$configured$2\\8\\429\\0":I
    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    .end local v2    # "it\\8":Ljava/util/List;
    .end local v3    # "$i$a$-takeIf-RepositoryUiApi$prepareMp$configured$2\\8\\429\\0":I
    if-nez v4, :cond_6

    goto :goto_5

    :cond_6
    const/4 v0, 0x0

    .line 428
    :goto_5
    if-eqz v0, :cond_7

    goto :goto_6

    .line 429
    :cond_7
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerController;->Companion:Lcom/pymcl/multiplayer/MultiplayerController$Companion;

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerController$Companion;->getDEFAULT_EXTRA_NODES()Ljava/util/List;

    move-result-object v0

    .line 428
    :goto_6
    nop

    .line 430
    .local v0, "configured":Ljava/util/List;
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    .line 495
    .local v2, "it\\9":Ljava/util/Locale;
    const/4 v3, 0x0

    .line 430
    .local v3, "$i$a$-let-RepositoryUiApi$prepareMp$mainland$1\\9\\430\\0":I
    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    const-string v5, "zh"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_a

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    const-string v6, "CN"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v6, 0x1

    if-nez v4, :cond_9

    invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v4

    const-string v7, "getCountry(...)"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/CharSequence;

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_8

    move v4, v6

    goto :goto_7

    :cond_8
    move v4, v5

    :goto_7
    if-eqz v4, :cond_a

    :cond_9
    goto :goto_8

    :cond_a
    move v6, v5

    .line 431
    .end local v2    # "it\\9":Ljava/util/Locale;
    .end local v3    # "$i$a$-let-RepositoryUiApi$prepareMp$mainland$1\\9\\430\\0":I
    .local v6, "mainland":Z
    :goto_8
    invoke-direct {v1}, Lcom/pymcl/android/data/RepositoryUiApi;->getMp()Lcom/pymcl/multiplayer/MultiplayerController;

    move-result-object v2

    sget-object v3, Lcom/pymcl/multiplayer/TerracottaInterop;->INSTANCE:Lcom/pymcl/multiplayer/TerracottaInterop;

    sget-object v4, Lcom/pymcl/multiplayer/TerracottaInterop;->INSTANCE:Lcom/pymcl/multiplayer/TerracottaInterop;

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static {v4, v6, v5, v7, v8}, Lcom/pymcl/multiplayer/TerracottaInterop;->fetchNodes$default(Lcom/pymcl/multiplayer/TerracottaInterop;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lcom/pymcl/multiplayer/TerracottaInterop;->mergeNodes(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/pymcl/multiplayer/MultiplayerController;->setExtraNodes(Ljava/util/List;)V

    .line 432
    return-void
.end method

.method private final rememberLobby(Lcom/pymcl/core/instance/Instance;Ljava/lang/String;Ljava/lang/String;)V
    .locals 19
    .param p1, "i"    # Lcom/pymcl/core/instance/Instance;
    .param p2, "vid"    # Ljava/lang/String;
    .param p3, "address"    # Ljava/lang/String;

    .line 345
    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/pymcl/android/data/RepositoryUiApi;->repo:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v1}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v1

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    invoke-virtual {v2, v3, v1}, Lcom/pymcl/core/instance/Instance;->settings(Ljava/lang/String;Lcom/pymcl/core/config/ConfigStore;)Lcom/pymcl/core/instance/VersionSettings;

    move-result-object v1

    invoke-virtual {v2}, Lcom/pymcl/core/instance/Instance;->getDir()Ljava/io/File;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/pymcl/core/instance/VersionSettings;->applyIsolation(Ljava/io/File;)Ljava/io/File;

    move-result-object v1

    .line 346
    .local v1, "gameDir":Ljava/io/File;
    new-instance v4, Lcom/pymcl/core/instance/ServersStore;

    invoke-direct {v4, v1}, Lcom/pymcl/core/instance/ServersStore;-><init>(Ljava/io/File;)V

    .line 347
    .local v4, "store":Lcom/pymcl/core/instance/ServersStore;
    sget-object v5, Lcom/pymcl/runtime/FclLaunchArgs;->INSTANCE:Lcom/pymcl/runtime/FclLaunchArgs;

    move-object/from16 v6, p3

    invoke-virtual {v5, v6}, Lcom/pymcl/runtime/FclLaunchArgs;->splitAddress(Ljava/lang/String;)Lkotlin/Pair;

    move-result-object v5

    if-nez v5, :cond_0

    return-void

    :cond_0
    invoke-virtual {v5}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, Ljava/lang/String;

    .local v10, "host":Ljava/lang/String;
    invoke-virtual {v5}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    .line 348
    .local v5, "port":I
    new-instance v8, Lcom/pymcl/core/instance/ServerEntry;

    const/16 v7, 0x63dd

    if-ne v5, v7, :cond_1

    const-string v7, ""

    goto :goto_0

    :cond_1
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    :goto_0
    move-object v11, v7

    const/16 v15, 0x28

    const/16 v16, 0x0

    const-string v9, "\u9676\u74e6\u8054\u673a\u5927\u5385"

    const/4 v12, 0x0

    const-string v13, "\u8054\u673a\u81ea\u52a8\u5199\u5165"

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v16}, Lcom/pymcl/core/instance/ServerEntry;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 349
    .local v8, "lobby":Lcom/pymcl/core/instance/ServerEntry;
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-virtual {v4}, Lcom/pymcl/core/instance/ServersStore;->list()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    .local v9, "$this$filter\\1":Ljava/lang/Iterable;
    const/4 v11, 0x0

    .line 530
    .local v11, "$i$f$filter\\1\\349":I
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    check-cast v12, Ljava/util/Collection;

    .local v12, "destination\\2":Ljava/util/Collection;
    move-object v13, v9

    .local v13, "$this$filterTo\\2":Ljava/lang/Iterable;
    const/4 v14, 0x0

    .line 531
    .local v14, "$i$f$filterTo\\2\\530":I
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_1
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_3

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .local v0, "element\\2":Ljava/lang/Object;
    move-object/from16 v16, v0

    check-cast v16, Lcom/pymcl/core/instance/ServerEntry;

    .local v16, "it\\3":Lcom/pymcl/core/instance/ServerEntry;
    const/16 v17, 0x0

    .line 349
    .local v17, "$i$a$-filter-RepositoryUiApi$rememberLobby$1\\3\\531\\0":I
    move-object/from16 v18, v1

    .end local v1    # "gameDir":Ljava/io/File;
    .local v18, "gameDir":Ljava/io/File;
    invoke-virtual/range {v16 .. v16}, Lcom/pymcl/core/instance/ServerEntry;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "\u9676\u74e6\u8054\u673a\u5927\u5385"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    .line 531
    .end local v16    # "it\\3":Lcom/pymcl/core/instance/ServerEntry;
    .end local v17    # "$i$a$-filter-RepositoryUiApi$rememberLobby$1\\3\\531\\0":I
    if-nez v1, :cond_2

    invoke-interface {v12, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v1, v18

    goto :goto_1

    .line 532
    .end local v0    # "element\\2":Ljava/lang/Object;
    .end local v18    # "gameDir":Ljava/io/File;
    .restart local v1    # "gameDir":Ljava/io/File;
    :cond_3
    nop

    .end local v12    # "destination\\2":Ljava/util/Collection;
    .end local v13    # "$this$filterTo\\2":Ljava/lang/Iterable;
    .end local v14    # "$i$f$filterTo\\2\\530":I
    move-object v0, v12

    check-cast v0, Ljava/util/List;

    .line 530
    nop

    .end local v9    # "$this$filter\\1":Ljava/lang/Iterable;
    .end local v11    # "$i$f$filter\\1\\349":I
    check-cast v0, Ljava/lang/Iterable;

    .line 349
    invoke-static {v7, v0}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/pymcl/core/instance/ServersStore;->save(Ljava/util/List;)V

    .line 350
    return-void
.end method

.method private final safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "def"    # Ljava/lang/Object;
    .param p2, "b"    # Lkotlin/jvm/functions/Function1;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 96
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$safe$2;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p1, v2}, Lcom/pymcl/android/data/RepositoryUiApi$safe$2;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 98
    return-object v0
.end method

.method private final toUi(Lcom/pymcl/multiplayer/MultiplayerState;)Lcom/pymcl/android/ui/state/MpState;
    .locals 14
    .param p1, "s"    # Lcom/pymcl/multiplayer/MultiplayerState;

    .line 408
    nop

    .line 409
    instance-of v0, p1, Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/pymcl/android/ui/state/MpState;

    sget-object v2, Lcom/pymcl/android/ui/state/MpPhase;->NotInstalled:Lcom/pymcl/android/ui/state/MpPhase;

    move-object v0, p1

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerState$Unavailable;->getReason()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\u8054\u673a\u5185\u6838\u4e0d\u53ef\u7528\uff1a"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/16 v9, 0x6e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/MpState;-><init>(Lcom/pymcl/android/ui/state/MpPhase;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    .line 410
    :cond_0
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerState$Uninitialized;->INSTANCE:Lcom/pymcl/multiplayer/MultiplayerState$Uninitialized;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v1, Lcom/pymcl/android/ui/state/MpState;

    sget-object v2, Lcom/pymcl/android/ui/state/MpPhase;->Stopped:Lcom/pymcl/android/ui/state/MpPhase;

    const/16 v9, 0x6e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "\u8054\u673a\u5185\u6838\u672a\u542f\u52a8"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/MpState;-><init>(Lcom/pymcl/android/ui/state/MpPhase;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    .line 411
    :cond_1
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerState$Waiting;->INSTANCE:Lcom/pymcl/multiplayer/MultiplayerState$Waiting;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v1, Lcom/pymcl/android/ui/state/MpState;

    sget-object v2, Lcom/pymcl/android/ui/state/MpPhase;->Idle:Lcom/pymcl/android/ui/state/MpPhase;

    const/16 v9, 0x6e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "\u5185\u6838\u8fd0\u884c\u4e2d\uff0c\u7b49\u5f85\u64cd\u4f5c"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/MpState;-><init>(Lcom/pymcl/android/ui/state/MpPhase;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    .line 412
    :cond_2
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerState$HostScanning;->INSTANCE:Lcom/pymcl/multiplayer/MultiplayerState$HostScanning;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v1, Lcom/pymcl/android/ui/state/MpState;

    sget-object v2, Lcom/pymcl/android/ui/state/MpPhase;->HostScanning:Lcom/pymcl/android/ui/state/MpPhase;

    const/16 v9, 0x6e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "\u6b63\u5728\u626b\u63cf\u5c40\u57df\u7f51\u4e16\u754c"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/MpState;-><init>(Lcom/pymcl/android/ui/state/MpPhase;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    .line 413
    :cond_3
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerState$HostStarting;->INSTANCE:Lcom/pymcl/multiplayer/MultiplayerState$HostStarting;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v1, Lcom/pymcl/android/ui/state/MpState;

    sget-object v2, Lcom/pymcl/android/ui/state/MpPhase;->HostScanning:Lcom/pymcl/android/ui/state/MpPhase;

    const/16 v9, 0x6e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "\u6b63\u5728\u542f\u52a8\u623f\u95f4"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/MpState;-><init>(Lcom/pymcl/android/ui/state/MpPhase;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_2

    .line 414
    :cond_4
    instance-of v0, p1, Lcom/pymcl/multiplayer/MultiplayerState$HostOk;

    const-string v1, "HOST"

    const/16 v2, 0xa

    if-eqz v0, :cond_6

    sget-object v4, Lcom/pymcl/android/ui/state/MpPhase;->Hosting:Lcom/pymcl/android/ui/state/MpPhase;

    move-object v0, p1

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerState$HostOk;

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerState$HostOk;->getRoom()Ljava/lang/String;

    move-result-object v5

    move-object v0, p1

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerState$HostOk;

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerState$HostOk;->getProfiles()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map\\1":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 535
    .local v3, "$i$f$map\\1\\414":I
    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v2, v6

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination\\2":Ljava/util/Collection;
    move-object v6, v0

    .local v6, "$this$mapTo\\2":Ljava/lang/Iterable;
    const/4 v7, 0x0

    .line 536
    .local v7, "$i$f$mapTo\\2\\535":I
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 537
    .local v9, "item\\2":Ljava/lang/Object;
    move-object v10, v9

    check-cast v10, Lcom/pymcl/multiplayer/TerracottaProfile;

    .local v10, "it\\3":Lcom/pymcl/multiplayer/TerracottaProfile;
    const/4 v11, 0x0

    .line 414
    .local v11, "$i$a$-map-RepositoryUiApi$toUi$1\\3\\537\\0":I
    invoke-virtual {v10}, Lcom/pymcl/multiplayer/TerracottaProfile;->getName()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10}, Lcom/pymcl/multiplayer/TerracottaProfile;->getKind()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v10

    .line 537
    .end local v10    # "it\\3":Lcom/pymcl/multiplayer/TerracottaProfile;
    .end local v11    # "$i$a$-map-RepositoryUiApi$toUi$1\\3\\537\\0":I
    invoke-interface {v2, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 538
    .end local v9    # "item\\2":Ljava/lang/Object;
    :cond_5
    nop

    .end local v2    # "destination\\2":Ljava/util/Collection;
    .end local v6    # "$this$mapTo\\2":Ljava/lang/Iterable;
    .end local v7    # "$i$f$mapTo\\2\\535":I
    move-object v6, v2

    check-cast v6, Ljava/util/List;

    .line 535
    nop

    .line 414
    .end local v0    # "$this$map\\1":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\1\\414":I
    new-instance v3, Lcom/pymcl/android/ui/state/MpState;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x78

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/pymcl/android/ui/state/MpState;-><init>(Lcom/pymcl/android/ui/state/MpPhase;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v3

    goto/16 :goto_2

    .line 415
    :cond_6
    sget-object v0, Lcom/pymcl/multiplayer/MultiplayerState$GuestConnecting;->INSTANCE:Lcom/pymcl/multiplayer/MultiplayerState$GuestConnecting;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v3, Lcom/pymcl/android/ui/state/MpState;

    sget-object v4, Lcom/pymcl/android/ui/state/MpPhase;->GuestJoining:Lcom/pymcl/android/ui/state/MpPhase;

    const/16 v11, 0x6e

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, "\u6b63\u5728\u8fde\u63a5\u623f\u95f4"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/pymcl/android/ui/state/MpState;-><init>(Lcom/pymcl/android/ui/state/MpPhase;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v3

    goto/16 :goto_2

    .line 416
    :cond_7
    instance-of v0, p1, Lcom/pymcl/multiplayer/MultiplayerState$GuestStarting;

    if-eqz v0, :cond_9

    new-instance v3, Lcom/pymcl/android/ui/state/MpState;

    sget-object v4, Lcom/pymcl/android/ui/state/MpPhase;->GuestJoining:Lcom/pymcl/android/ui/state/MpPhase;

    move-object v0, p1

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerState$GuestStarting;

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerState$GuestStarting;->getDifficulty()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_8

    const-string v0, ""

    :cond_8
    move-object v10, v0

    const/16 v11, 0x2e

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, "\u6b63\u5728\u52a0\u5165\u623f\u95f4"

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/pymcl/android/ui/state/MpState;-><init>(Lcom/pymcl/android/ui/state/MpPhase;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v3

    goto/16 :goto_2

    .line 417
    :cond_9
    instance-of v0, p1, Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;

    if-eqz v0, :cond_b

    sget-object v4, Lcom/pymcl/android/ui/state/MpPhase;->GuestReady:Lcom/pymcl/android/ui/state/MpPhase;

    move-object v0, p1

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;->getProfiles()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$map\\4":Ljava/lang/Iterable;
    const/4 v3, 0x0

    .line 539
    .local v3, "$i$f$map\\4\\417":I
    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    move-object v2, v5

    check-cast v2, Ljava/util/Collection;

    .local v2, "destination\\5":Ljava/util/Collection;
    move-object v5, v0

    .local v5, "$this$mapTo\\5":Ljava/lang/Iterable;
    const/4 v6, 0x0

    .line 540
    .local v6, "$i$f$mapTo\\5\\539":I
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 541
    .local v8, "item\\5":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Lcom/pymcl/multiplayer/TerracottaProfile;

    .local v9, "it\\6":Lcom/pymcl/multiplayer/TerracottaProfile;
    const/4 v10, 0x0

    .line 417
    .local v10, "$i$a$-map-RepositoryUiApi$toUi$2\\6\\541\\0":I
    invoke-virtual {v9}, Lcom/pymcl/multiplayer/TerracottaProfile;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9}, Lcom/pymcl/multiplayer/TerracottaProfile;->getKind()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    .line 541
    .end local v9    # "it\\6":Lcom/pymcl/multiplayer/TerracottaProfile;
    .end local v10    # "$i$a$-map-RepositoryUiApi$toUi$2\\6\\541\\0":I
    invoke-interface {v2, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 542
    .end local v8    # "item\\5":Ljava/lang/Object;
    :cond_a
    nop

    .end local v2    # "destination\\5":Ljava/util/Collection;
    .end local v5    # "$this$mapTo\\5":Ljava/lang/Iterable;
    .end local v6    # "$i$f$mapTo\\5\\539":I
    move-object v6, v2

    check-cast v6, Ljava/util/List;

    .line 539
    nop

    .line 417
    .end local v0    # "$this$map\\4":Ljava/lang/Iterable;
    .end local v3    # "$i$f$map\\4\\417":I
    move-object v0, p1

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;->getUrl()Ljava/lang/String;

    move-result-object v8

    move-object v0, p1

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerState$GuestOk;->getUrl()Ljava/lang/String;

    move-result-object v9

    new-instance v3, Lcom/pymcl/android/ui/state/MpState;

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x4a

    const/4 v12, 0x0

    invoke-direct/range {v3 .. v12}, Lcom/pymcl/android/ui/state/MpState;-><init>(Lcom/pymcl/android/ui/state/MpPhase;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v3

    goto :goto_2

    .line 418
    :cond_b
    instance-of v0, p1, Lcom/pymcl/multiplayer/MultiplayerState$Error;

    if-eqz v0, :cond_c

    new-instance v1, Lcom/pymcl/android/ui/state/MpState;

    sget-object v2, Lcom/pymcl/android/ui/state/MpPhase;->Error:Lcom/pymcl/android/ui/state/MpPhase;

    move-object v0, p1

    check-cast v0, Lcom/pymcl/multiplayer/MultiplayerState$Error;

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerState$Error;->getMessage()Ljava/lang/String;

    move-result-object v6

    const/16 v9, 0x6e

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/pymcl/android/ui/state/MpState;-><init>(Lcom/pymcl/android/ui/state/MpPhase;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 419
    :goto_2
    move-object v2, v1

    .line 495
    .local v2, "it\\7":Lcom/pymcl/android/ui/state/MpState;
    const/4 v0, 0x0

    .line 419
    .local v0, "$i$a$-let-RepositoryUiApi$toUi$3\\7\\419\\0":I
    sget-object v1, Lcom/pymcl/multiplayer/TerracottaInterop;->INSTANCE:Lcom/pymcl/multiplayer/TerracottaInterop;

    invoke-virtual {v1}, Lcom/pymcl/multiplayer/TerracottaInterop;->localIps()Ljava/util/List;

    move-result-object v6

    const/16 v10, 0x77

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v11}, Lcom/pymcl/android/ui/state/MpState;->copy$default(Lcom/pymcl/android/ui/state/MpState;Lcom/pymcl/android/ui/state/MpPhase;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/pymcl/android/ui/state/MpState;

    move-result-object v0

    .end local v0    # "$i$a$-let-RepositoryUiApi$toUi$3\\7\\419\\0":I
    .end local v2    # "it\\7":Lcom/pymcl/android/ui/state/MpState;
    return-object v0

    .line 408
    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private final withProgress(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p2, "block"    # Lkotlin/jvm/functions/Function1;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 149
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$withProgress$2;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p0, p1, v1}, Lcom/pymcl/android/data/RepositoryUiApi$withProgress$2;-><init>(Lkotlin/jvm/functions/Function1;Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, p3}, Lkotlinx/coroutines/CoroutineScopeKt;->coroutineScope(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 152
    return-object v0
.end method


# virtual methods
.method public activeAccountName(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 380
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$activeAccountName$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$activeAccountName$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public addOfflineAccount(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "username"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$1;

    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$1;

    invoke-direct {v0, p0, p2}, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$1;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 187
    iget v3, v0, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$1;->label:I

    packed-switch v3, :pswitch_data_0

    .end local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v1    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v1    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v2, v0, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$1;->L$0:Ljava/lang/Object;

    move-object p1, v2

    check-cast p1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance v3, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$2;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v0, Lcom/pymcl/android/data/RepositoryUiApi$addOfflineAccount$1;->label:I

    invoke-direct {p0, v3, v0}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1

    return-object v2

    :cond_1
    :goto_1
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public aiListChats(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ChatSummary;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 451
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$aiListChats$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/data/RepositoryUiApi$aiListChats$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public aiListModels(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 453
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi;->repo:Lcom/pymcl/android/data/LauncherRepository;

    invoke-virtual {v0}, Lcom/pymcl/android/data/LauncherRepository;->getConfig()Lcom/pymcl/core/config/ConfigStore;

    move-result-object v0

    const-string v1, "ai_model"

    invoke-virtual {v0, v1}, Lcom/pymcl/core/config/ConfigStore;->string(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$aiListModels$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/data/RepositoryUiApi$aiListModels$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public aiPermissionRules(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/PermissionRule;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 454
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$aiPermissionRules$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/data/RepositoryUiApi$aiPermissionRules$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public aiSend(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .param p1, "text"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/android/ui/state/AiItem;",
            ">;"
        }
    .end annotation

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 452
    invoke-virtual {p0}, Lcom/pymcl/android/data/RepositoryUiApi;->getAi()Lcom/pymcl/android/data/AiBridge;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/pymcl/android/data/AiBridge;->sendAsItems(Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public checkModUpdates(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 282
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/pymcl/android/data/RepositoryUiApi$checkModUpdates$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p3}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 285
    return-object v0
.end method

.method public collectGameExit(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "userStopped"    # Z
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/GameExitInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 352
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/pymcl/android/data/RepositoryUiApi$collectGameExit$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;ZLkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p2}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 374
    return-object v0
.end method

.method public createInstance(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$1;

    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$1;

    invoke-direct {v0, p0, p2}, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$1;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 106
    iget v3, v0, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$1;->label:I

    packed-switch v3, :pswitch_data_0

    .end local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v1    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v1    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v2, v0, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$1;->L$0:Ljava/lang/Object;

    move-object p1, v2

    check-cast p1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance v3, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$2;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v0, Lcom/pymcl/android/data/RepositoryUiApi$createInstance$1;->label:I

    invoke-direct {p0, v3, v0}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1

    return-object v2

    :cond_1
    :goto_1
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public deleteInstalled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "filename"    # Ljava/lang/String;
    .param p5, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 262
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$deleteInstalled$2;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    .end local p1    # "kind":Ljava/lang/String;
    .end local p2    # "instance":Ljava/lang/String;
    .end local p3    # "version":Ljava/lang/String;
    .end local p4    # "filename":Ljava/lang/String;
    .local v2, "kind":Ljava/lang/String;
    .local v3, "instance":Ljava/lang/String;
    .local v4, "version":Ljava/lang/String;
    .local v5, "filename":Ljava/lang/String;
    invoke-direct/range {v0 .. v6}, Lcom/pymcl/android/data/RepositoryUiApi$deleteInstalled$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p5}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 265
    return-object p1
.end method

.method public deleteInstance(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 107
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$deleteInstance$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/pymcl/android/data/RepositoryUiApi$deleteInstance$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p2}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public downloadJava(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "major"    # I
    .param p2, "distro"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 212
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$downloadJava$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/pymcl/android/data/RepositoryUiApi$downloadJava$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;ILkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p3}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public favorites(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 224
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$favorites$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/data/RepositoryUiApi$favorites$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public feedbackHistory(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/FeedbackRecord;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 485
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$feedbackHistory$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/data/RepositoryUiApi$feedbackHistory$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 487
    return-object v0
.end method

.method public fetchNews(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/NewsItem;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 382
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$fetchNews$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$fetchNews$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 391
    return-object v0
.end method

.method public getAccountRows(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/AccountRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 176
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/data/RepositoryUiApi$getAccountRows$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 180
    return-object v0
.end method

.method public final getAi()Lcom/pymcl/android/data/AiBridge;
    .locals 1

    .line 450
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi;->ai$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/pymcl/android/data/AiBridge;

    return-object v0
.end method

.method public final getCtx$PyMCL_Android_app_debug()Landroid/content/Context;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/pymcl/android/data/RepositoryUiApi;->ctx:Landroid/content/Context;

    return-object v0
.end method

.method public getInstalled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstalledEntry;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 247
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;

    const/4 v6, 0x0

    move-object v3, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    .end local p1    # "kind":Ljava/lang/String;
    .end local p2    # "instance":Ljava/lang/String;
    .end local p3    # "version":Ljava/lang/String;
    .local v2, "kind":Ljava/lang/String;
    .local v4, "instance":Ljava/lang/String;
    .local v5, "version":Ljava/lang/String;
    invoke-direct/range {v1 .. v6}, Lcom/pymcl/android/data/RepositoryUiApi$getInstalled$2;-><init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p4}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    .line 256
    return-object p1
.end method

.method public getInstalledMods(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstalledEntry;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 246
    const-string v0, "mod"

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/pymcl/android/data/RepositoryUiApi;->getInstalled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getInstalledVersions(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstalledVersion;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 109
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/pymcl/android/data/RepositoryUiApi$getInstalledVersions$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p2}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 116
    return-object v0
.end method

.method public getJavaList(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "scan"    # Z
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/JavaRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 204
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/data/RepositoryUiApi$getJavaList$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p2}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 211
    return-object v0
.end method

.method public getPlaytime(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/PlaytimeRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 399
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$getPlaytime$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/data/RepositoryUiApi$getPlaytime$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 403
    return-object v0
.end method

.method public getProjectFiles(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "id"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/CatalogFile;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 230
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$getProjectFiles$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Lcom/pymcl/android/data/RepositoryUiApi$getProjectFiles$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p3}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getServers(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/ServerRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 394
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/pymcl/android/data/RepositoryUiApi$getServers$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p2}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 398
    return-object v0
.end method

.method public getSettings(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 59
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/UiSettings;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 458
    move-object/from16 v0, p0

    new-instance v1, Lcom/pymcl/android/ui/state/UiSettings;

    const v57, 0x3fffff

    const/16 v58, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

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

    const/16 v56, -0x1

    invoke-direct/range {v1 .. v58}, Lcom/pymcl/android/ui/state/UiSettings;-><init>(ZILjava/lang/String;IIZIZZIZILjava/lang/String;Ljava/lang/String;ZIIIIIIIIZILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;IIILjava/lang/String;ZZZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/pymcl/android/data/RepositoryUiApi$getSettings$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object/from16 v3, p1

    invoke-direct {v0, v1, v2, v3}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    .line 475
    return-object v1
.end method

.method public getVersionList(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/RemoteVersion;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 131
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$getVersionList$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/data/RepositoryUiApi$getVersionList$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 134
    return-object v0
.end method

.method public helpArticles(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/HelpArticle;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 489
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/pymcl/android/ui/state/HelpArticle;

    new-instance v1, Lcom/pymcl/android/ui/state/HelpArticle;

    const-string v2, "\u6e38\u620f\u542f\u52a8\u540e\u9ed1\u5c4f\u600e\u4e48\u529e\uff1f"

    const-string v3, "\u5148\u5728\u8bbe\u7f6e\u91cc\u6362\u4e00\u4e2a\u6e32\u67d3\u5668\uff0c\u518d\u68c0\u67e5 Java \u7248\u672c\u662f\u5426\u5339\u914d\u3002"

    invoke-direct {v1, v2, v3}, Lcom/pymcl/android/ui/state/HelpArticle;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 490
    new-instance v1, Lcom/pymcl/android/ui/state/HelpArticle;

    const-string v2, "\u9996\u6b21\u542f\u52a8\u4e3a\u4ec0\u4e48\u6162\uff1f"

    const-string v3, "\u9996\u6b21\u9700\u8981\u89e3\u538b\u5185\u7f6e Java \u8fd0\u884c\u65f6\u5e76\u4e0b\u8f7d\u6e38\u620f\u6587\u4ef6\uff0c\u4e4b\u540e\u4f1a\u5feb\u5f88\u591a\u3002"

    invoke-direct {v1, v2, v3}, Lcom/pymcl/android/ui/state/HelpArticle;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 489
    nop

    .line 491
    new-instance v1, Lcom/pymcl/android/ui/state/HelpArticle;

    const-string v2, "\u8054\u673a\u9700\u8981\u4ec0\u4e48\u6761\u4ef6\uff1f"

    const-string v3, "\u53cc\u65b9\u90fd\u4e0b\u8f7d\u9676\u74e6\u8054\u673a\u5185\u6838\uff0c\u623f\u4e3b\u5f00\u5c40\u57df\u7f51\u540e\u628a\u9080\u8bf7\u7801\u53d1\u7ed9\u670b\u53cb\u3002"

    invoke-direct {v1, v2, v3}, Lcom/pymcl/android/ui/state/HelpArticle;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    .line 489
    nop

    .line 488
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    .line 492
    return-object v0
.end method

.method public importLocalFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "path"    # Ljava/lang/String;
    .param p5, "onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 272
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v2, p1

    move-object v6, p2

    move-object v5, p3

    move-object v1, p4

    move-object v4, p5

    .end local p1    # "kind":Ljava/lang/String;
    .end local p2    # "instance":Ljava/lang/String;
    .end local p3    # "version":Ljava/lang/String;
    .end local p4    # "path":Ljava/lang/String;
    .end local p5    # "onProgress":Lkotlin/jvm/functions/Function2;
    .local v1, "path":Ljava/lang/String;
    .local v2, "kind":Ljava/lang/String;
    .local v4, "onProgress":Lkotlin/jvm/functions/Function2;
    .local v5, "version":Ljava/lang/String;
    .local v6, "instance":Ljava/lang/String;
    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/data/RepositoryUiApi$importLocalFile$2;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p6}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    .line 281
    return-object p1
.end method

.method public installGame(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "loader"    # Ljava/lang/String;
    .param p4, "loaderVersion"    # Ljava/lang/String;
    .param p5, "onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 154
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v3, p5

    .end local p1    # "instance":Ljava/lang/String;
    .end local p2    # "version":Ljava/lang/String;
    .end local p3    # "loader":Ljava/lang/String;
    .end local p4    # "loaderVersion":Ljava/lang/String;
    .end local p5    # "onProgress":Lkotlin/jvm/functions/Function2;
    .local v2, "instance":Ljava/lang/String;
    .local v3, "onProgress":Lkotlin/jvm/functions/Function2;
    .local v4, "version":Ljava/lang/String;
    .local v5, "loader":Ljava/lang/String;
    .local v6, "loaderVersion":Ljava/lang/String;
    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/data/RepositoryUiApi$installGame$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p6}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    .line 173
    return-object p1
.end method

.method public installMod(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 13
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "id"    # Ljava/lang/String;
    .param p5, "file"    # Ljava/lang/String;
    .param p6, "onProgress"    # Lkotlin/jvm/functions/Function2;
    .param p7, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v9, p7

    instance-of v0, v9, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;

    if-eqz v0, :cond_0

    move-object v0, v9

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;

    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->label:I

    const/high16 v3, -0x80000000

    and-int/2addr v1, v3

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->label:I

    sub-int/2addr v1, v3

    iput v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;

    invoke-direct {v0, p0, v9}, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    :goto_0
    move-object v10, v0

    .local v10, "$continuation":Lkotlin/coroutines/Continuation;
    iget-object v11, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->result:Ljava/lang/Object;

    .local v11, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v12

    .line 231
    iget v0, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->label:I

    packed-switch v0, :pswitch_data_0

    .end local v10    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v11    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v10    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v11    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v0, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->L$5:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function2;

    .end local p6    # "onProgress":Lkotlin/jvm/functions/Function2;
    .local v0, "onProgress":Lkotlin/jvm/functions/Function2;
    iget-object v1, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    .end local p5    # "file":Ljava/lang/String;
    .local v1, "file":Ljava/lang/String;
    iget-object v3, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->L$3:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .end local p4    # "id":Ljava/lang/String;
    .local v3, "id":Ljava/lang/String;
    iget-object v4, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    .end local p3    # "version":Ljava/lang/String;
    .local v4, "version":Ljava/lang/String;
    iget-object v5, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    .end local p2    # "instance":Ljava/lang/String;
    .local v5, "instance":Ljava/lang/String;
    iget-object v6, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->L$0:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    .end local p1    # "kind":Ljava/lang/String;
    .local v6, "kind":Ljava/lang/String;
    invoke-static {v11}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v7, v11

    goto :goto_1

    .end local v0    # "onProgress":Lkotlin/jvm/functions/Function2;
    .end local v1    # "file":Ljava/lang/String;
    .end local v3    # "id":Ljava/lang/String;
    .end local v4    # "version":Ljava/lang/String;
    .end local v5    # "instance":Ljava/lang/String;
    .end local v6    # "kind":Ljava/lang/String;
    .restart local p1    # "kind":Ljava/lang/String;
    .restart local p2    # "instance":Ljava/lang/String;
    .restart local p3    # "version":Ljava/lang/String;
    .restart local p4    # "id":Ljava/lang/String;
    .restart local p5    # "file":Ljava/lang/String;
    .restart local p6    # "onProgress":Lkotlin/jvm/functions/Function2;
    :pswitch_1
    invoke-static {v11}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$installMod$2;

    const/4 v8, 0x0

    move-object v2, p0

    move-object v1, p1

    move-object v6, p2

    move-object/from16 v5, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v8}, Lcom/pymcl/android/data/RepositoryUiApi$installMod$2;-><init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->L$0:Ljava/lang/Object;

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->L$1:Ljava/lang/Object;

    invoke-static/range {p3 .. p3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->L$2:Ljava/lang/Object;

    invoke-static/range {p4 .. p4}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->L$3:Ljava/lang/Object;

    invoke-static/range {p5 .. p5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->L$4:Ljava/lang/Object;

    invoke-static/range {p6 .. p6}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->L$5:Ljava/lang/Object;

    const/4 v1, 0x1

    iput v1, v10, Lcom/pymcl/android/data/RepositoryUiApi$installMod$1;->label:I

    invoke-direct {p0, v0, v10}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_1

    return-object v12

    :cond_1
    move-object v6, p1

    move-object v5, p2

    move-object/from16 v4, p3

    move-object/from16 v3, p4

    move-object/from16 v1, p5

    move-object v7, v0

    move-object/from16 v0, p6

    .end local p1    # "kind":Ljava/lang/String;
    .end local p2    # "instance":Ljava/lang/String;
    .end local p3    # "version":Ljava/lang/String;
    .end local p4    # "id":Ljava/lang/String;
    .end local p5    # "file":Ljava/lang/String;
    .end local p6    # "onProgress":Lkotlin/jvm/functions/Function2;
    .restart local v0    # "onProgress":Lkotlin/jvm/functions/Function2;
    .restart local v1    # "file":Ljava/lang/String;
    .restart local v3    # "id":Ljava/lang/String;
    .restart local v4    # "version":Ljava/lang/String;
    .restart local v5    # "instance":Ljava/lang/String;
    .restart local v6    # "kind":Ljava/lang/String;
    :goto_1
    const-string v8, "io(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    return-object v7

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public isGameRunning()Z
    .locals 1

    .line 378
    invoke-direct {p0}, Lcom/pymcl/android/data/RepositoryUiApi;->gameProcess()Landroid/app/ActivityManager$RunningAppProcessInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public lanWorlds()Lkotlinx/coroutines/flow/Flow;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/LanWorldRow;",
            ">;>;"
        }
    .end annotation

    .line 444
    sget-object v0, Lcom/pymcl/multiplayer/LanDiscovery;->INSTANCE:Lcom/pymcl/multiplayer/LanDiscovery;

    iget-object v1, p0, Lcom/pymcl/android/data/RepositoryUiApi;->ctx:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/pymcl/multiplayer/LanDiscovery;->discover(Landroid/content/Context;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .line 445
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v2, Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$1;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$1;-><init>(Lkotlin/coroutines/Continuation;)V

    check-cast v2, Lkotlin/jvm/functions/Function3;

    invoke-static {v0, v1, v2}, Lkotlinx/coroutines/flow/FlowKt;->scan(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .line 446
    nop

    .local v0, "$this$map\\1":Lkotlinx/coroutines/flow/Flow;
    const/4 v1, 0x0

    .line 562
    .local v1, "$i$f$map\\1\\446":I
    move-object v2, v0

    .local v2, "$this$unsafeTransform\\2":Lkotlinx/coroutines/flow/Flow;
    const/4 v3, 0x0

    .line 563
    .local v3, "$i$f$unsafeTransform\\2\\562":I
    const/4 v4, 0x0

    .line 564
    .local v4, "$i$f$unsafeFlow\\3\\563":I
    new-instance v5, Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$$inlined$map$1;

    invoke-direct {v5, v2}, Lcom/pymcl/android/data/RepositoryUiApi$lanWorlds$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;)V

    check-cast v5, Lkotlinx/coroutines/flow/Flow;

    .line 565
    .end local v4    # "$i$f$unsafeFlow\\3\\563":I
    nop

    .line 566
    .end local v2    # "$this$unsafeTransform\\2":Lkotlinx/coroutines/flow/Flow;
    .end local v3    # "$i$f$unsafeTransform\\2\\562":I
    nop

    .line 446
    .end local v0    # "$this$map\\1":Lkotlinx/coroutines/flow/Flow;
    .end local v1    # "$i$f$map\\1\\446":I
    return-object v5
.end method

.method public launchGame(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1, "instance"    # Ljava/lang/String;
    .param p2, "version"    # Ljava/lang/String;
    .param p3, "onLog"    # Lkotlin/jvm/functions/Function1;
    .param p4, "onProgress"    # Lkotlin/jvm/functions/Function1;
    .param p5, "server"    # Ljava/lang/String;
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 292
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2;

    const/4 v7, 0x0

    move-object v2, p0

    move-object v1, p1

    move-object v3, p2

    move-object v5, p3

    move-object v4, p4

    move-object v6, p5

    .end local p1    # "instance":Ljava/lang/String;
    .end local p2    # "version":Ljava/lang/String;
    .end local p3    # "onLog":Lkotlin/jvm/functions/Function1;
    .end local p4    # "onProgress":Lkotlin/jvm/functions/Function1;
    .end local p5    # "server":Ljava/lang/String;
    .local v1, "instance":Ljava/lang/String;
    .local v3, "version":Ljava/lang/String;
    .local v4, "onProgress":Lkotlin/jvm/functions/Function1;
    .local v5, "onLog":Lkotlin/jvm/functions/Function1;
    .local v6, "server":Ljava/lang/String;
    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/data/RepositoryUiApi$launchGame$2;-><init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p6}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    .line 340
    return-object p1
.end method

.method public listInstances(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/InstanceRow;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 101
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v0

    new-instance v1, Lcom/pymcl/android/data/RepositoryUiApi$listInstances$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/pymcl/android/data/RepositoryUiApi$listInstances$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, v1, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->safe(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 105
    return-object v0
.end method

.method public listLoaderVersions(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "loader"    # Ljava/lang/String;
    .param p2, "mc"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 141
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/pymcl/android/data/RepositoryUiApi$listLoaderVersions$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p3}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 146
    return-object v0
.end method

.method public normalizeDirect(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "address"    # Ljava/lang/String;

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 447
    sget-object v0, Lcom/pymcl/multiplayer/LanDiscovery;->INSTANCE:Lcom/pymcl/multiplayer/LanDiscovery;

    invoke-virtual {v0, p1}, Lcom/pymcl/multiplayer/LanDiscovery;->normalizeDirect(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public removeAccount(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$1;

    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$1;->label:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$1;->label:I

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$1;

    invoke-direct {v0, p0, p2}, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$1;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    .local v0, "$continuation":Lkotlin/coroutines/Continuation;
    :goto_0
    iget-object v1, v0, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$1;->result:Ljava/lang/Object;

    .local v1, "$result":Ljava/lang/Object;
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 186
    iget v3, v0, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$1;->label:I

    packed-switch v3, :pswitch_data_0

    .end local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .end local v1    # "$result":Ljava/lang/Object;
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .restart local v0    # "$continuation":Lkotlin/coroutines/Continuation;
    .restart local v1    # "$result":Ljava/lang/Object;
    :pswitch_0
    iget-object v2, v0, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$1;->L$0:Ljava/lang/Object;

    move-object p1, v2

    check-cast p1, Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    new-instance v3, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$2;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p1, v4}, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x1

    iput v4, v0, Lcom/pymcl/android/data/RepositoryUiApi$removeAccount$1;->label:I

    invoke-direct {p0, v3, v0}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_1

    return-object v2

    :cond_1
    :goto_1
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public resolveCatalogLink(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "url"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/CatalogHit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 266
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p0, p1, v1}, Lcom/pymcl/android/data/RepositoryUiApi$resolveCatalogLink$2;-><init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p3}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 271
    return-object v0
.end method

.method public saveSettings(Lcom/pymcl/android/ui/state/UiSettings;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "s"    # Lcom/pymcl/android/ui/state/UiSettings;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/pymcl/android/ui/state/UiSettings;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 477
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$saveSettings$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/pymcl/android/data/RepositoryUiApi$saveSettings$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lcom/pymcl/android/ui/state/UiSettings;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p2}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 481
    return-object v0
.end method

.method public searchCatalog(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "query"    # Ljava/lang/String;
    .param p3, "source"    # Ljava/lang/String;
    .param p4, "gameVersion"    # Ljava/lang/String;
    .param p5, "category"    # Ljava/lang/String;
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/pymcl/android/ui/state/CatalogHit;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 225
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;

    const/4 v7, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v2, p4

    move-object v6, p5

    .end local p1    # "kind":Ljava/lang/String;
    .end local p2    # "query":Ljava/lang/String;
    .end local p3    # "source":Ljava/lang/String;
    .end local p4    # "gameVersion":Ljava/lang/String;
    .end local p5    # "category":Ljava/lang/String;
    .local v2, "gameVersion":Ljava/lang/String;
    .local v3, "kind":Ljava/lang/String;
    .local v4, "query":Ljava/lang/String;
    .local v5, "source":Ljava/lang/String;
    .local v6, "category":Ljava/lang/String;
    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/data/RepositoryUiApi$searchCatalog$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p6}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    .line 229
    return-object p1
.end method

.method public setAccountSkin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "path"    # Ljava/lang/String;
    .param p3, "model"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 201
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$setAccountSkin$2;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .end local p1    # "name":Ljava/lang/String;
    .end local p2    # "path":Ljava/lang/String;
    .end local p3    # "model":Ljava/lang/String;
    .local v2, "name":Ljava/lang/String;
    .local v3, "path":Ljava/lang/String;
    .local v4, "model":Ljava/lang/String;
    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/data/RepositoryUiApi$setAccountSkin$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p4}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public setActiveAccount(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "type"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 182
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$setActiveAccount$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Lcom/pymcl/android/data/RepositoryUiApi$setActiveAccount$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p3}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 185
    return-object v0
.end method

.method public setInstalledEnabled(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "instance"    # Ljava/lang/String;
    .param p3, "version"    # Ljava/lang/String;
    .param p4, "filename"    # Ljava/lang/String;
    .param p5, "enabled"    # Z
    .param p6, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 257
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    .end local p1    # "kind":Ljava/lang/String;
    .end local p2    # "instance":Ljava/lang/String;
    .end local p3    # "version":Ljava/lang/String;
    .end local p4    # "filename":Ljava/lang/String;
    .end local p5    # "enabled":Z
    .local v2, "kind":Ljava/lang/String;
    .local v3, "instance":Ljava/lang/String;
    .local v4, "version":Ljava/lang/String;
    .local v5, "filename":Ljava/lang/String;
    .local v6, "enabled":Z
    invoke-direct/range {v0 .. v7}, Lcom/pymcl/android/data/RepositoryUiApi$setInstalledEnabled$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p6}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 261
    return-object p1
.end method

.method public startAuthlibLogin(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1, "api"    # Ljava/lang/String;
    .param p2, "username"    # Ljava/lang/String;
    .param p3, "password"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    .line 199
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$startAuthlibLogin$2;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .end local p1    # "api":Ljava/lang/String;
    .end local p2    # "username":Ljava/lang/String;
    .end local p3    # "password":Ljava/lang/String;
    .local v2, "api":Ljava/lang/String;
    .local v3, "username":Ljava/lang/String;
    .local v4, "password":Ljava/lang/String;
    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/data/RepositoryUiApi$startAuthlibLogin$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p4}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public startMicrosoftLogin()Lkotlinx/coroutines/flow/Flow;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 188
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$startMicrosoftLogin$1;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function2;

    invoke-static {v0}, Lkotlinx/coroutines/flow/FlowKt;->channelFlow(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    .line 198
    return-object v0
.end method

.method public startNide8Login(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1, "serverId"    # Ljava/lang/String;
    .param p2, "username"    # Ljava/lang/String;
    .param p3, "password"    # Ljava/lang/String;
    .param p4, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
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

    .line 200
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$startNide8Login$2;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    .end local p1    # "serverId":Ljava/lang/String;
    .end local p2    # "username":Ljava/lang/String;
    .end local p3    # "password":Ljava/lang/String;
    .local v2, "serverId":Ljava/lang/String;
    .local v3, "username":Ljava/lang/String;
    .local v4, "password":Ljava/lang/String;
    invoke-direct/range {v0 .. v5}, Lcom/pymcl/android/data/RepositoryUiApi$startNide8Login$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p4}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public stopGame()V
    .locals 3

    .line 379
    invoke-direct {p0}, Lcom/pymcl/android/data/RepositoryUiApi;->gameProcess()Landroid/app/ActivityManager$RunningAppProcessInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 495
    .local v0, "it\\1":Landroid/app/ActivityManager$RunningAppProcessInfo;
    const/4 v1, 0x0

    .line 379
    .local v1, "$i$a$-let-RepositoryUiApi$stopGame$1\\1\\379\\0":I
    iget v2, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    invoke-static {v2}, Landroid/os/Process;->killProcess(I)V

    .end local v0    # "it\\1":Landroid/app/ActivityManager$RunningAppProcessInfo;
    .end local v1    # "$i$a$-let-RepositoryUiApi$stopGame$1\\1\\379\\0":I
    :cond_0
    return-void
.end method

.method public terracottaHost(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
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

    .line 433
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaHost$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$terracottaHost$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public terracottaJoin(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "code"    # Ljava/lang/String;
    .param p2, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 434
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$terracottaJoin$2;-><init>(Ljava/lang/String;Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p2}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 442
    return-object v0
.end method

.method public terracottaStart(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/MpState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 423
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaStart$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$terracottaStart$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public terracottaState(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/pymcl/android/ui/state/MpState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 421
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$terracottaState$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/pymcl/android/data/RepositoryUiApi$terracottaState$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p1}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public terracottaStates()Lkotlinx/coroutines/flow/Flow;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Lcom/pymcl/android/ui/state/MpState;",
            ">;"
        }
    .end annotation

    .line 422
    invoke-direct {p0}, Lcom/pymcl/android/data/RepositoryUiApi;->getMp()Lcom/pymcl/multiplayer/MultiplayerController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/pymcl/multiplayer/MultiplayerController;->getState()Lkotlinx/coroutines/flow/StateFlow;

    move-result-object v0

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    .local v0, "$this$map\\1":Lkotlinx/coroutines/flow/Flow;
    const/4 v1, 0x0

    .line 543
    .local v1, "$i$f$map\\1\\422":I
    move-object v2, v0

    .local v2, "$this$unsafeTransform\\2":Lkotlinx/coroutines/flow/Flow;
    const/4 v3, 0x0

    .line 544
    .local v3, "$i$f$unsafeTransform\\2\\543":I
    const/4 v4, 0x0

    .line 545
    .local v4, "$i$f$unsafeFlow\\3\\544":I
    new-instance v5, Lcom/pymcl/android/data/RepositoryUiApi$terracottaStates$$inlined$map$1;

    invoke-direct {v5, v2, p0}, Lcom/pymcl/android/data/RepositoryUiApi$terracottaStates$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;Lcom/pymcl/android/data/RepositoryUiApi;)V

    check-cast v5, Lkotlinx/coroutines/flow/Flow;

    .line 546
    .end local v4    # "$i$f$unsafeFlow\\3\\544":I
    nop

    .line 547
    .end local v2    # "$this$unsafeTransform\\2":Lkotlinx/coroutines/flow/Flow;
    .end local v3    # "$i$f$unsafeTransform\\2\\543":I
    nop

    .line 422
    .end local v0    # "$this$map\\1":Lkotlinx/coroutines/flow/Flow;
    .end local v1    # "$i$f$map\\1\\422":I
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v0

    check-cast v0, Lkotlin/coroutines/CoroutineContext;

    invoke-static {v5, v0}, Lkotlinx/coroutines/flow/FlowKt;->flowOn(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/Flow;

    move-result-object v0

    return-object v0
.end method

.method public terracottaStop(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
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

    .line 443
    invoke-direct {p0}, Lcom/pymcl/android/data/RepositoryUiApi;->getMp()Lcom/pymcl/multiplayer/MultiplayerController;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/pymcl/multiplayer/MultiplayerController;->stop(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toggleFavorite(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1, "kind"    # Ljava/lang/String;
    .param p2, "id"    # Ljava/lang/String;
    .param p3, "$completion"    # Lkotlin/coroutines/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 286
    new-instance v0, Lcom/pymcl/android/data/RepositoryUiApi$toggleFavorite$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p2, v1}, Lcom/pymcl/android/data/RepositoryUiApi$toggleFavorite$2;-><init>(Lcom/pymcl/android/data/RepositoryUiApi;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, v0, p3}, Lcom/pymcl/android/data/RepositoryUiApi;->io(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    .line 289
    return-object v0
.end method
