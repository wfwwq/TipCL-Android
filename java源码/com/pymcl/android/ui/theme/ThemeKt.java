package com.pymcl.android.ui.theme;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.swing.JPanel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*  JADX ERROR: NullPointerException in pass: ProcessKotlinInternals
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.processMth(ProcessKotlinInternals.java:93)
    	at jadx.core.dex.visitors.kotlin.ProcessKotlinInternals.visit(ProcessKotlinInternals.java:84)
    */
/* compiled from: Theme.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u0004\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0007\u001a\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 \u001a'\u0010!\u001a\u00020\u00012\u0006\u0010\u0000\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010%\u001a\u00020\t*\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\b'\u001a\u0012\u0010(\u001a\u00020\t*\u00020\t2\u0006\u0010)\u001a\u00020*\u001ah\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u00020;2\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010=\u001a\u00020*2\b\b\u0002\u0010>\u001a\u0002032\b\b\u0002\u0010?\u001a\u0002062\u0011\u0010@\u001a\r\u0012\u0004\u0012\u0002090A¢\u0006\u0002\bBH\u0007b\u0002\bBb\f\bE\u0012\b\bF\u0012\u0004\b\b(G¢\u0006\u0004\bC\u0010D\"\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\"#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0,¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.\"\u0017\u0010/\u001a\b\u0012\u0004\u0012\u0002000,¢\u0006\b\n\u0000\u001a\u0004\b1\u0010.\"\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002030,¢\u0006\b\n\u0000\u001a\u0004\b4\u0010.\"\u0017\u00105\u001a\b\u0012\u0004\u0012\u0002060,¢\u0006\b\n\u0000\u001a\u0004\b7\u0010.¨\u0006H"}, d2 = {"c", "Landroidx/compose/ui/graphics/Color;", "hex", "", "(J)J", "a", "", "(JF)J", "LightPalette", "Lcom/pymcl/android/ui/theme/PyColors;", "getLightPalette", "()Lcom/pymcl/android/ui/theme/PyColors;", "DarkPalette", "getDarkPalette", "AccentPresets", "", "Lkotlin/Pair;", "", "getAccentPresets", "()Ljava/util/List;", "contrast", "", "b", "contrast--OWjLjI", "(JJ)D", "mix", "t", "mix-jxsXWHM", "(JJF)J", "ensureWhiteSurface", "ratio", "ensureWhiteSurface-DxMtmZc", "(JD)J", "ensureTextContrast", "bg", "ensureTextContrast-jxsXWHM", "(JJD)J", "withAccent", "seed", "withAccent-0Yiz4hI", "withBackground", "p", "Lcom/pymcl/android/ui/theme/BgPreset;", "LocalPyColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalPyColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalPyType", "Lcom/pymcl/android/ui/theme/PyType;", "getLocalPyType", "LocalPyShapes", "Lcom/pymcl/android/ui/theme/PyShapes;", "getLocalPyShapes", "LocalPyMotion", "Lcom/pymcl/android/ui/theme/PyMotion;", "getLocalPyMotion", "PyMclTheme", "", "dark", "", "accent", "background", "shapes", "motion", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "PyMclTheme-3lEaxcQ", "(ZLandroidx/compose/ui/graphics/Color;Lcom/pymcl/android/ui/theme/BgPreset;Lcom/pymcl/android/ui/theme/PyShapes;Lcom/pymcl/android/ui/theme/PyMotion;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/ComposableInferredTarget;", "scheme", "[0[0]]", "PyMCL-Android:app_debug"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ThemeKt {
    private static final List<Pair<String, Color>> AccentPresets;
    private static final PyColors DarkPalette;
    private static final PyColors LightPalette;
    private static final ProvidableCompositionLocal<PyColors> LocalPyColors;
    private static final ProvidableCompositionLocal<PyMotion> LocalPyMotion;
    private static final ProvidableCompositionLocal<PyShapes> LocalPyShapes;
    private static final ProvidableCompositionLocal<PyType> LocalPyType;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PyMclTheme_3lEaxcQ$lambda$1(boolean z, Color color, BgPreset bgPreset, PyShapes pyShapes, PyMotion pyMotion, Function2 function2, int i, int i2, Composer composer, int i3) {
        m8006PyMclTheme3lEaxcQ(z, color, bgPreset, pyShapes, pyMotion, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect register number in instruction: 0x000e: INVOKE (r90 I:javax.swing.JPanel), (r91 I:java.awt.LayoutManager) VIRTUAL call: javax.swing.JPanel.setLayout(java.awt.LayoutManager):void, expected to be less than 91
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:79)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    /* renamed from: withAccent-0Yiz4hI, reason: not valid java name */
    public static final com.pymcl.android.ui.theme.PyColors m8011withAccent0Yiz4hI(com.pymcl.android.ui.theme.PyColors r89, androidx.compose.ui.graphics.Color r90) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.theme.ThemeKt.m8011withAccent0Yiz4hI(com.pymcl.android.ui.theme.PyColors, androidx.compose.ui.graphics.Color):com.pymcl.android.ui.theme.PyColors");
    }

    private static final long c(long hex) {
        return ColorKt.Color(4278190080L | hex);
    }

    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:161)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private static final long c(
    /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
        java.lang.IllegalArgumentException: Illegal Capacity: -1
        	at java.base/java.util.ArrayList.<init>(ArrayList.java:161)
        	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
        	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
        	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
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

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r70v0 ??, still in use, count: 1, list:
          (r70v0 ?? I:long) from 0x01f8: INVOKE 
          (r0v0 ?? I:com.pymcl.android.ui.theme.PyColors)
          (r1v8 ?? I:boolean)
          (r2v0 ?? I:long)
          (r4v1 ?? I:long)
          (r8v0 ?? I:long)
          (r8v1 ?? I:long)
          (r10v1 ?? I:long)
          (r16v0 ?? I:long)
          (r18v1 ?? I:long)
          (r20v1 ?? I:long)
          (r22v1 ?? I:long)
          (r24v0 ?? I:long)
          (r26v1 ?? I:long)
          (r24v1 ?? I:long)
          (r26v2 ?? I:long)
          (r32v1 ?? I:long)
          (r28v1 ?? I:long)
          (r36v1 ?? I:long)
          (r38v1 ?? I:long)
          (r36v2 ?? I:long)
          (r44v1 ?? I:long)
          (r46v1 ?? I:long)
          (r48v1 ?? I:long)
          (r50v1 ?? I:long)
          (r46v2 ?? I:long)
          (r48v2 ?? I:long)
          (r58v1 ?? I:long)
          (r52v1 ?? I:long)
          (r62v1 ?? I:long)
          (r56v1 ?? I:long)
          (r66v1 ?? I:long)
          (r60v1 ?? I:long)
          (r70v0 ?? I:long)
          (r72v1 ?? I:long)
          (r68v1 ?? I:long)
          (r76v0 ?? I:long)
          (r12v3 ?? I:long)
          (r0v2 ?? I:long)
          (r0v4 ?? I:long)
          (r2v4 ?? I:long)
          (r0v6 ?? I:java.util.List)
          (r96v0 ?? I:long)
          (r0v8 ?? I:java.util.List)
          (r98v4 ?? I:long)
          (r0v10 ?? I:java.util.List)
          (r85v0 ?? I:kotlin.jvm.internal.DefaultConstructorMarker)
         DIRECT call: com.pymcl.android.ui.theme.PyColors.<init>(boolean, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, java.util.List, long, java.util.List, long, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker):void A[MD:(boolean, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, long, java.util.List, long, java.util.List, long, java.util.List, kotlin.jvm.internal.DefaultConstructorMarker):void (m)] (LINE:59)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    static {
        /*
            Method dump skipped, instructions count: 1066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.theme.ThemeKt.<clinit>():void");
    }

    public static final PyColors getLightPalette() {
        return LightPalette;
    }

    public static final PyColors getDarkPalette() {
        return DarkPalette;
    }

    public static final List<Pair<String, Color>> getAccentPresets() {
        return AccentPresets;
    }

    /* renamed from: contrast--OWjLjI, reason: not valid java name */
    private static final double m8007contrastOWjLjI(long a, long b) {
        double la = ColorKt.m4442luminance8_81llA(a) + 0.05d;
        double lb = ColorKt.m4442luminance8_81llA(b) + 0.05d;
        return Math.max(la, lb) / Math.min(la, lb);
    }

    /* renamed from: mix-jxsXWHM, reason: not valid java name */
    private static final long m8010mixjxsXWHM(long a, long b, float t) {
        return ColorKt.m4441lerpjxsXWHM(a, b, t);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 ??, still in use, count: 1, list:
          (r4v1 ?? I:long) from 0x001f: INVOKE (r0v2 ?? I:long A[D('x' long)]) = (r0v1 ?? I:long A[D('x' long)]), (r4v1 ?? I:long), (r2v4 ?? I:float) STATIC call: com.pymcl.android.ui.theme.ThemeKt.mix-jxsXWHM(long, long, float):long A[MD:(long, long, float):long (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    /* renamed from: ensureWhiteSurface-DxMtmZc, reason: not valid java name */
    private static final long m8009ensureWhiteSurfaceDxMtmZc(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v1 ??, still in use, count: 1, list:
          (r4v1 ?? I:long) from 0x001f: INVOKE (r0v2 ?? I:long A[D('x' long)]) = (r0v1 ?? I:long A[D('x' long)]), (r4v1 ?? I:long), (r2v4 ?? I:float) STATIC call: com.pymcl.android.ui.theme.ThemeKt.mix-jxsXWHM(long, long, float):long A[MD:(long, long, float):long (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r6v0 ??
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

    /* renamed from: ensureTextContrast-jxsXWHM, reason: not valid java name */
    private static final long m8008ensureTextContrastjxsXWHM(long c, long bg, double ratio) {
        long target;
        long x = c;
        int i = 0;
        if (ColorKt.m4442luminance8_81llA(bg) > 0.5f) {
            new JPanel();
        } else {
            target = Color.INSTANCE.m4427getWhite0d7_KjU();
        }
        while (m8007contrastOWjLjI(x, bg) < ratio) {
            int i2 = i + 1;
            if (i >= 40) {
                break;
            }
            x = m8010mixjxsXWHM(x, target, 0.05f);
            i = i2;
        }
        return x;
    }

    /* JADX WARN: Type inference failed for: r23v0, types: [long, void] */
    public static final PyColors withBackground(PyColors $this$withBackground, BgPreset p) {
        Intrinsics.checkNotNullParameter($this$withBackground, "<this>");
        Intrinsics.checkNotNullParameter(p, "p");
        if (p == BgPreset.Default) {
            return $this$withBackground;
        }
        Iterable darkC = $this$withBackground.getDark() ? p.getDarkC() : p.getLight();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(darkC, 10));
        Iterator it = darkC.iterator();
        while (it.hasNext()) {
            arrayList.add(Color.m4380boximpl(c(((Number) it.next()).longValue())));
        }
        List l = (List) arrayList;
        return PyColors.m7907copybvzJcY$default($this$withBackground, false, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ((Color) l.get(0)).setLayout(p), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, CollectionsKt.drop(l, 1), -2049, 2047, null);
    }

    public static final ProvidableCompositionLocal<PyColors> getLocalPyColors() {
        return LocalPyColors;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PyType LocalPyType$lambda$0() {
        return new PyType(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static final ProvidableCompositionLocal<PyType> getLocalPyType() {
        return LocalPyType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PyShapes LocalPyShapes$lambda$0() {
        return new PyShapes(0.0f, 0.0f, false, 7, null);
    }

    public static final ProvidableCompositionLocal<PyShapes> getLocalPyShapes() {
        return LocalPyShapes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PyMotion LocalPyMotion$lambda$0() {
        return new PyMotion(false, 0.0f, 3, null);
    }

    public static final ProvidableCompositionLocal<PyMotion> getLocalPyMotion() {
        return LocalPyMotion;
    }

    /* renamed from: PyMclTheme-3lEaxcQ, reason: not valid java name */
    public static final void m8006PyMclTheme3lEaxcQ(boolean dark, Color accent, BgPreset background, PyShapes shapes, PyMotion motion, final Function2<? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int $dirty) {
        boolean dark2;
        Color accent2;
        PyShapes shapes2;
        char c;
        PyMotion motion2;
        final BgPreset background2;
        PyMotion motion3;
        final Color accent3;
        final PyShapes shapes3;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer2 = $composer.startRestartGroup(-374456895);
        ComposerKt.sourceInformation($composer2, "C(PyMclTheme)P(3,0:c#ui.graphics.Color!1,5,4)206@11854L70,206@11714L210:Theme.kt#vwsk90");
        int $dirty2 = $changed;
        int i = $dirty & 1;
        if (i != 0) {
            $dirty2 |= 6;
            dark2 = dark;
        } else if (($changed & 6) == 0) {
            dark2 = dark;
            $dirty2 |= $composer2.changed(dark2) ? 4 : 2;
        } else {
            dark2 = dark;
        }
        int i2 = $dirty & 2;
        if (i2 != 0) {
            $dirty2 |= 48;
            accent2 = accent;
        } else if (($changed & 48) == 0) {
            accent2 = accent;
            $dirty2 |= $composer2.changed(accent2) ? 32 : 16;
        } else {
            accent2 = accent;
        }
        int i3 = $dirty & 4;
        if (i3 != 0) {
            $dirty2 |= 384;
        } else if (($changed & 384) == 0) {
            $dirty2 |= $composer2.changed(background == null ? -1 : background.ordinal()) ? 256 : 128;
        }
        int i4 = $dirty & 8;
        if (i4 != 0) {
            $dirty2 |= 3072;
            shapes2 = shapes;
        } else if (($changed & 3072) == 0) {
            shapes2 = shapes;
            $dirty2 |= $composer2.changed(shapes2) ? 2048 : 1024;
        } else {
            shapes2 = shapes;
        }
        int i5 = $dirty & 16;
        if (i5 != 0) {
            $dirty2 |= 24576;
            motion2 = motion;
            c = 2;
        } else {
            c = 2;
            if (($changed & 24576) == 0) {
                motion2 = motion;
                $dirty2 |= $composer2.changed(motion2) ? 16384 : 8192;
            } else {
                motion2 = motion;
            }
        }
        if (($changed & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            $dirty2 |= $composer2.changedInstance(content) ? 131072 : 65536;
        }
        if ($composer2.shouldExecute(($dirty2 & 74899) != 74898, $dirty2 & 1)) {
            boolean dark3 = i != 0 ? false : dark2;
            if (i2 != 0) {
                accent2 = null;
            }
            BgPreset background3 = i3 != 0 ? BgPreset.Default : background;
            if (i4 != 0) {
                shapes2 = new PyShapes(0.0f, 0.0f, false, 7, null);
            }
            if (i5 != 0) {
                motion2 = new PyMotion(false, 0.0f, 3, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-374456895, $dirty2, -1, "com.pymcl.android.ui.theme.PyMclTheme (Theme.kt:192)");
            }
            PyColors p = withBackground(m8011withAccent0Yiz4hI(dark3 ? DarkPalette : LightPalette, accent2), background3);
            final ColorScheme scheme = dark3 ? ColorSchemeKt.m2082darkColorSchemeCXl9yA$default(p.m7954getAccentStrong0d7_KjU(), p.m7976getOnAccentStrong0d7_KjU(), p.m7952getAccentSoft0d7_KjU(), p.m7955getAccentText0d7_KjU(), 0L, p.m7949getAccent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, p.m7957getCanvas0d7_KjU(), p.m7967getInk0d7_KjU(), p.m7980getPaper0d7_KjU(), p.m7967getInk0d7_KjU(), p.m7981getPaper20d7_KjU(), p.m7970getInkSoft0d7_KjU(), 0L, 0L, 0L, p.m7959getDanger0d7_KjU(), 0L, 0L, 0L, p.m7971getLine0d7_KjU(), p.m7972getLineSoft0d7_KjU(), 0L, 0L, p.m7980getPaper0d7_KjU(), p.m7981getPaper20d7_KjU(), p.m7981getPaper20d7_KjU(), p.m7980getPaper0d7_KjU(), 0L, 0L, 867704784, 12, null) : ColorSchemeKt.m2086lightColorSchemeCXl9yA$default(p.m7954getAccentStrong0d7_KjU(), p.m7976getOnAccentStrong0d7_KjU(), p.m7952getAccentSoft0d7_KjU(), p.m7955getAccentText0d7_KjU(), 0L, p.m7949getAccent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, p.m7957getCanvas0d7_KjU(), p.m7967getInk0d7_KjU(), p.m7980getPaper0d7_KjU(), p.m7967getInk0d7_KjU(), p.m7981getPaper20d7_KjU(), p.m7970getInkSoft0d7_KjU(), 0L, 0L, 0L, p.m7959getDanger0d7_KjU(), 0L, 0L, 0L, p.m7971getLine0d7_KjU(), p.m7972getLineSoft0d7_KjU(), 0L, 0L, p.m7980getPaper0d7_KjU(), p.m7981getPaper20d7_KjU(), p.m7981getPaper20d7_KjU(), p.m7980getPaper0d7_KjU(), 0L, 0L, 867704784, 12, null);
            PyType type = new PyType(null, null, null, null, null, null, null, null, null, 511, null);
            ProvidedValue[] providedValueArr = new ProvidedValue[4];
            providedValueArr[0] = LocalPyColors.provides(p);
            providedValueArr[1] = LocalPyType.provides(type);
            providedValueArr[c] = LocalPyShapes.provides(shapes2);
            providedValueArr[3] = LocalPyMotion.provides(motion2);
            boolean dark4 = dark3;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(1742131841, true, new Function2() { // from class: com.pymcl.android.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.PyMclTheme_3lEaxcQ$lambda$0(scheme, content, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            dark2 = dark4;
            background2 = background3;
            motion3 = motion2;
            accent3 = accent2;
            shapes3 = shapes2;
        } else {
            $composer2.skipToGroupEnd();
            background2 = background;
            motion3 = motion2;
            accent3 = accent2;
            shapes3 = shapes2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean dark5 = dark2;
            final PyMotion motion4 = motion3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.theme.ThemeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.PyMclTheme_3lEaxcQ$lambda$1(dark5, accent3, background2, shapes3, motion4, content, $changed, $dirty, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PyMclTheme_3lEaxcQ$lambda$0(ColorScheme $scheme, Function2 $content, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C207@11864L54:Theme.kt#vwsk90");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1742131841, $changed, -1, "com.pymcl.android.ui.theme.PyMclTheme.<anonymous> (Theme.kt:207)");
            }
            MaterialThemeKt.MaterialTheme($scheme, null, null, $content, $composer, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
