package com.pymcl.android.ui.components;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.github.caciocavallosilano.cacio.peer.CacioChoicePeer;
import com.pymcl.android.ui.theme.Py;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.lwjgl.system.windows.User32;

/* compiled from: NetImage.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007b\u0002\b\tb\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f¢\u0006\u0004\b\u0007\u0010\b\u001a\u0010\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e\u001aF\u0010\u0010\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\tH\u0007b\u0002\b\tb\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0019²\u0006\f\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u008a\u008e\u0002"}, d2 = {"NetIcon", "", "url", "", "fallbackText", "size", "Landroidx/compose/ui/unit/Dp;", "NetIcon-6a0pyJM", "(Ljava/lang/String;Ljava/lang/String;FLandroidx/compose/runtime/Composer;II)V", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/runtime/ComposableTarget;", "applier", "androidx.compose.ui.UiComposable", "skinFace", "Landroid/graphics/Bitmap;", "src", "SkinFaceImage", "path", "fallback", "Lkotlin/Function0;", "SkinFaceImage-rAjV9yQ", "(Ljava/lang/String;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/ComposableInferredTarget;", "scheme", "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]", "PyMCL-Android:app_debug", "img", "Landroidx/compose/ui/graphics/ImageBitmap;"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class NetImageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NetIcon_6a0pyJM$lambda$6(String str, String str2, float f, int i, int i2, Composer composer, int i3) {
        m7570NetIcon6a0pyJM(str, str2, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkinFaceImage_rAjV9yQ$lambda$1(String str, float f, Function2 function2, int i, Composer composer, int i2) {
        m7571SkinFaceImagerAjV9yQ(str, f, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: NetIcon-6a0pyJM, reason: not valid java name */
    public static final void m7570NetIcon6a0pyJM(final String url, final String fallbackText, float size, Composer $composer, final int $changed, final int i) {
        float size2;
        Composer $composer2;
        final float size3;
        MutableState img$delegate;
        float size4;
        Function0 function0;
        Composer composer;
        String str;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fallbackText, "fallbackText");
        Composer $composer3 = $composer.startRestartGroup(-211965565);
        ComposerKt.sourceInformation($composer3, "C(NetIcon)P(2!,1:c#ui.unit.Dp)89@4295L7,90@4363L7,91@4408L83:NetImage.kt#uiq9q5");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(url) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(fallbackText) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            size2 = size;
        } else if (($changed & 384) == 0) {
            size2 = size;
            $dirty |= $composer3.changed(size2) ? 256 : 128;
        } else {
            size2 = size;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            size3 = size2;
        } else {
            if (i2 != 0) {
                size2 = Dp.m7018constructorimpl(48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211965565, $dirty2, -1, "com.pymcl.android.ui.components.NetIcon (NetImage.kt:88)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context ctx = (Context) objConsume;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer3.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            int iMo383roundToPx0680j_4 = ((Density) objConsume2).mo383roundToPx0680j_4(size2);
            ComposerKt.sourceInformationMarkerStart($composer3, -1835438346, "CC(remember):NetImage.kt#9igjgp");
            boolean z = ($dirty2 & 14) == 4;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Bitmap bitmapCached = Thumbs.INSTANCE.cached(url);
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bitmapCached != null ? AndroidImageBitmap_androidKt.asImageBitmap(bitmapCached) : null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            MutableState img$delegate2 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (StringsKt.isBlank(url) || NetIcon_6a0pyJM$lambda$2(img$delegate2) != null) {
                img$delegate = img$delegate2;
                $composer3.startReplaceGroup(-1063821025);
            } else {
                $composer3.startReplaceGroup(-1835434357);
                ComposerKt.sourceInformation($composer3, "92@4553L52,92@4533L72");
                ComposerKt.sourceInformationMarkerStart($composer3, -1835433737, "CC(remember):NetImage.kt#9igjgp");
                boolean zChanged = $composer3.changed(img$delegate2) | $composer3.changedInstance(ctx) | (($dirty2 & 14) == 4) | $composer3.changed(iMo383roundToPx0680j_4);
                Object objRememberedValue2 = $composer3.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object netImageKt$NetIcon$1$1 = new NetImageKt$NetIcon$1$1(ctx, url, iMo383roundToPx0680j_4, img$delegate2, null);
                    img$delegate = img$delegate2;
                    str = url;
                    Object obj = (Function2) netImageKt$NetIcon$1$1;
                    $composer3.updateRememberedValue(obj);
                    objRememberedValue2 = obj;
                } else {
                    img$delegate = img$delegate2;
                    str = url;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer3, $dirty2 & 14);
            }
            $composer3.endReplaceGroup();
            ImageBitmap i3 = NetIcon_6a0pyJM$lambda$2(img$delegate);
            if (i3 == null) {
                $composer3.startReplaceGroup(-1835430943);
                ComposerKt.sourceInformation($composer3, "94@4641L30");
                size4 = size2;
                UiKt.m7600LetterTileuFdPcIQ(fallbackText, size4, false, $composer3, (($dirty2 >> 3) & 14) | (($dirty2 >> 3) & 112), 4);
                $composer2 = $composer3;
                $composer2.endReplaceGroup();
            } else {
                $composer2 = $composer3;
                size4 = size2;
                $composer2.startReplaceGroup(-1835429479);
                ComposerKt.sourceInformation($composer2, "95@4754L6,95@4681L214");
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM247backgroundbw27NRU$default = BackgroundKt.m247backgroundbw27NRU$default(ClipKt.clip(CacioChoicePeer.mo7501initSwingComponent(), RoundedCornerShapeKt.m1032RoundedCornerShape0680j_4(Dp.m7018constructorimpl(size4 / 4))), Py.INSTANCE.getColors($composer2, 6).m7972getLineSoft0d7_KjU(), null, 2, null);
                ComposerKt.sourceInformationMarkerStart($composer2, 733328855, "CC(Box)P(2,1,3)71@3423L130:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart($composer2, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM247backgroundbw27NRU$default);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((0 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
                if (!($composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer2.startReusableNode();
                if ($composer2.getInserting()) {
                    function0 = constructor;
                    $composer2.createNode(function0);
                } else {
                    function0 = constructor;
                    $composer2.useNode();
                }
                Composer composerM3832constructorimpl = Updater.m3832constructorimpl($composer2);
                Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3832constructorimpl.getInserting()) {
                    composer = $composer2;
                } else {
                    composer = $composer2;
                    if (!Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    }
                    Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i5 = (i4 >> 6) & 14;
                    Composer composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i6 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, 656076598, "C96@4782L107:NetImage.kt#uiq9q5");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    ImageKt.m304Image5hnEew(i3, null, CacioChoicePeer.mo7501initSwingComponent(), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, FilterQuality.INSTANCE.m4491getMediumfv9h1I(), composer2, 24624, 104);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    $composer2.endReplaceGroup();
                }
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i52 = (i4 >> 6) & 14;
                Composer composer22 = composer;
                ComposerKt.sourceInformationMarkerStart(composer22, -2146730711, "C72@3468L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i62 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer22, 656076598, "C96@4782L107:NetImage.kt#uiq9q5");
                Modifier.Companion companion22 = Modifier.INSTANCE;
                ImageKt.m304Image5hnEew(i3, null, CacioChoicePeer.mo7501initSwingComponent(), null, ContentScale.INSTANCE.getCrop(), 0.0f, null, FilterQuality.INSTANCE.m4491getMediumfv9h1I(), composer22, 24624, 104);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            size3 = size4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.NetImageKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return NetImageKt.NetIcon_6a0pyJM$lambda$6(url, fallbackText, size3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final ImageBitmap NetIcon_6a0pyJM$lambda$2(MutableState<ImageBitmap> mutableState) {
        return mutableState.getValue();
    }

    public static final Bitmap skinFace(Bitmap src) {
        Object objM8116constructorimpl;
        Intrinsics.checkNotNullParameter(src, "src");
        if (src.getWidth() < 64 || src.getHeight() < 32) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(8, 8, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            for (int i = 0; i < 8; i++) {
                for (int i2 = 0; i2 < 8; i2++) {
                    int pixel = src.getPixel(i2 + 8, i + 8);
                    int pixel2 = src.getPixel(i2 + 40, i + 8);
                    bitmapCreateBitmap.setPixel(i2, i, (pixel2 >>> 24) > 16 ? pixel2 : (-16777216) | pixel);
                }
            }
            objM8116constructorimpl = Result.m8116constructorimpl(bitmapCreateBitmap);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8116constructorimpl = Result.m8116constructorimpl(ResultKt.createFailure(th));
        }
        return (Bitmap) (Result.m8122isFailureimpl(objM8116constructorimpl) ? null : objM8116constructorimpl);
    }

    /* renamed from: SkinFaceImage-rAjV9yQ, reason: not valid java name */
    public static final void m7571SkinFaceImagerAjV9yQ(final String path, final float size, final Function2<? super Composer, ? super Integer, Unit> fallback, Composer $composer, final int $changed) {
        Bitmap bitmapDecodeLocal;
        Bitmap bitmapSkinFace;
        Intrinsics.checkNotNullParameter(fallback, "fallback");
        Composer $composer2 = $composer.startRestartGroup(-1598125496);
        ComposerKt.sourceInformation($composer2, "C(SkinFaceImage)P(1,2:c#ui.unit.Dp)116@5592L94:NetImage.kt#uiq9q5");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(path) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(size) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(fallback) ? 256 : 128;
        }
        if ($composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1598125496, $dirty, -1, "com.pymcl.android.ui.components.SkinFaceImage (NetImage.kt:115)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1799693414, "CC(remember):NetImage.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            Object objRememberedValue = $composer2.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objAsImageBitmap = (path == null || (bitmapDecodeLocal = Thumbs.INSTANCE.decodeLocal(path)) == null || (bitmapSkinFace = skinFace(bitmapDecodeLocal)) == null) ? null : AndroidImageBitmap_androidKt.asImageBitmap(bitmapSkinFace);
                $composer2.updateRememberedValue(objAsImageBitmap);
                objRememberedValue = objAsImageBitmap;
            }
            ImageBitmap face = (ImageBitmap) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (face == null) {
                $composer2.startReplaceGroup(1799697074);
                ComposerKt.sourceInformation($composer2, "117@5709L10");
                fallback.invoke($composer2, Integer.valueOf(($dirty >> 6) & 14));
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(1799697853);
                ComposerKt.sourceInformation($composer2, "118@5729L149");
                Modifier.Companion companion = Modifier.INSTANCE;
                ImageKt.m304Image5hnEew(face, null, ClipKt.clip(CacioChoicePeer.mo7501initSwingComponent(), RoundedCornerShapeKt.m1032RoundedCornerShape0680j_4(Dp.m7018constructorimpl(size / 8))), null, ContentScale.INSTANCE.getFillBounds(), 0.0f, null, FilterQuality.INSTANCE.m4492getNonefv9h1I(), $composer2, 24624, 104);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.components.NetImageKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NetImageKt.SkinFaceImage_rAjV9yQ$lambda$1(path, size, fallback, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
