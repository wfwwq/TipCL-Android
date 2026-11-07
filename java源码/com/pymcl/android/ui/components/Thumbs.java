package com.pymcl.android.ui.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: NetImage.kt */
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000*\u0001\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0013\u001a\u00020\tJ\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00192\u0006\u0010 \u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001bH\u0002J(\u0010!\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010\"J\u0010\u0010#\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020\tR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R2\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b&\u0012\b\b'\u0012\u0004\b\u0003\u0010\u0002¨\u0006%"}, d2 = {"Lcom/pymcl/android/ui/components/Thumbs;", "", "<init>", "()V", "mem", "com/pymcl/android/ui/components/Thumbs$mem$1", "Lcom/pymcl/android/ui/components/Thumbs$mem$1;", "failed", "", "", "kotlin.jvm.PlatformType", "", "locks", "Ljava/util/HashMap;", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlin/collections/HashMap;", "lock", "k", "key", "url", "dir", "Ljava/io/File;", "ctx", "Landroid/content/Context;", "cached", "Landroid/graphics/Bitmap;", "sampleSize", "", "w", "h", "targetPx", "decode", "f", "load", "(Landroid/content/Context;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decodeLocal", "path", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class Thumbs {
    public static final int $stable = 0;
    public static final Thumbs INSTANCE = new Thumbs();
    private static final Set<String> failed;
    private static final HashMap<String, Mutex> locks;
    private static final Thumbs$mem$1 mem;

    /* compiled from: NetImage.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    @DebugMetadata(c = "com.pymcl.android.ui.components.Thumbs", f = "NetImage.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {128, 61}, m = "load", n = {"ctx", "url", "$this$withLock_u24default\\2", "targetPx", "ctx", "url", "$this$withLock_u24default\\2", "targetPx"}, nl = {129, 72}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"}, v = 2)
    /* renamed from: com.pymcl.android.ui.components.Thumbs$load$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Thumbs.this.load(null, null, 0, this);
        }
    }

    private Thumbs() {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.pymcl.android.ui.components.Thumbs$mem$1] */
    static {
        final int iCoerceAtLeast = RangesKt.coerceAtLeast((int) (Runtime.getRuntime().maxMemory() / 16), 4194304);
        mem = new LruCache<String, Bitmap>(iCoerceAtLeast) { // from class: com.pymcl.android.ui.components.Thumbs$mem$1
            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 1, list:
                  (r0v2 ?? I:int) from 0x000e: RETURN (r0v2 ?? I:int)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
                	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
                	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
                */
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.util.LruCache
            public int sizeOf(
            /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 1, list:
                  (r0v2 ?? I:int) from 0x000e: RETURN (r0v2 ?? I:int)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
                	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
                	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
                	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
                */
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:845)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:498)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
                */
        };
        failed = Collections.synchronizedSet(new HashSet());
        locks = new HashMap<>();
    }

    private final Mutex lock(String k) {
        Mutex mutexMutex$default;
        Mutex mutex;
        synchronized (locks) {
            Map map = locks;
            Mutex mutex2 = map.get(k);
            if (mutex2 == null) {
                mutexMutex$default = MutexKt.Mutex$default(false, 1, null);
                map.put(k, mutexMutex$default);
            } else {
                mutexMutex$default = mutex2;
            }
            mutex = mutexMutex$default;
        }
        return mutex;
    }

    public final String key(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return ThumbMath.INSTANCE.cacheKey(url);
    }

    public final File dir(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        File file = new File(ctx.getCacheDir(), "thumbs");
        file.mkdirs();
        return file;
    }

    public final Bitmap cached(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return mem.get(url);
    }

    public final int sampleSize(int w, int h, int targetPx) {
        return ThumbMath.INSTANCE.sampleSize(w, h, targetPx);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ??, still in use, count: 6, list:
          (r0v0 ?? I:com.github.caciocavallosilano.cacio.peer.CacioComponentPeer) from 0x0002: INVOKE (r0v0 ?? I:com.github.caciocavallosilano.cacio.peer.CacioComponentPeer) DIRECT call: com.github.caciocavallosilano.cacio.peer.CacioComponentPeer.postInitSwingComponent():void A[MD:():void (m)]
          (r0v0 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)]) from 0x000e: INVOKE 
          (r1v1 java.lang.String)
          (r0v0 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)])
         STATIC call: android.graphics.BitmapFactory.decodeFile(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap A[MD:(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap (c)]
          (r0v0 ?? I:android.graphics.BitmapFactory$Options A[D('$this$decode_u24lambda_u240\1' android.graphics.BitmapFactory$Options)]) from ?: CAST (android.graphics.BitmapFactory$Options) (r0v0 ?? I:android.graphics.BitmapFactory$Options A[D('$this$decode_u24lambda_u240\1' android.graphics.BitmapFactory$Options)])
          (r0v0 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)]) from ?: CAST (android.graphics.BitmapFactory$Options) (r0v0 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)])
          (r0v0 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)]) from ?: CAST (android.graphics.BitmapFactory$Options) (r0v0 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)])
          (r0v0 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)]) from ?: CAST (android.graphics.BitmapFactory$Options) (r0v0 ?? I:android.graphics.BitmapFactory$Options A[D('o' android.graphics.BitmapFactory$Options)])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.BitmapFactory$Options, com.github.caciocavallosilano.cacio.peer.CacioComponentPeer] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.BitmapFactory$Options, com.github.caciocavallosilano.cacio.peer.CacioComponentPeer] */
    public final android.graphics.Bitmap decode(java.io.File r9, int r10) {
        /*
            r8 = this;
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.postInitSwingComponent()
            r1 = r0
            r2 = 0
            r3 = 1
            r1.inJustDecodeBounds = r3
            java.lang.String r1 = r9.getPath()
            android.graphics.BitmapFactory.decodeFile(r1, r0)
            int r1 = r0.outWidth
            if (r1 > 0) goto L17
            r1 = 0
            return r1
        L17:
            java.lang.String r1 = r9.getPath()
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.postInitSwingComponent()
            r3 = r2
            r4 = 0
            com.pymcl.android.ui.components.Thumbs r5 = com.pymcl.android.ui.components.Thumbs.INSTANCE
            int r6 = r0.outWidth
            int r7 = r0.outHeight
            int r5 = r5.sampleSize(r6, r7, r10)
            r3.inSampleSize = r5
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFile(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.components.Thumbs.decode(java.io.File, int):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad A[Catch: all -> 0x00e5, TRY_LEAVE, TryCatch #1 {all -> 0x00e5, blocks: (B:32:0x00a1, B:35:0x00ad), top: B:52:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(android.content.Context r12, java.lang.String r13, int r14, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.components.Thumbs.load(android.content.Context, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Bitmap decodeLocal(String path) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            Result.Companion companion = Result.INSTANCE;
            Thumbs thumbs = this;
            objM8116constructorimpl = Result.m8116constructorimpl(BitmapFactory.decodeFile(path));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8122isFailureimpl(objM8116constructorimpl)) {
            objM8116constructorimpl = null;
        }
        return (Bitmap) objM8116constructorimpl;
    }
}
