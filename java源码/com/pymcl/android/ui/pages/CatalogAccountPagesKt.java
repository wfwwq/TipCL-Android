package com.pymcl.android.ui.pages;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.pymcl.android.ui.components.BtnKind;
import com.pymcl.android.ui.components.Ico;
import com.pymcl.android.ui.components.NetImageKt;
import com.pymcl.android.ui.components.TagTone;
import com.pymcl.android.ui.components.UiKt;
import com.pymcl.android.ui.i18n.I18nFmt;
import com.pymcl.android.ui.i18n.I18nKt;
import com.pymcl.android.ui.state.AccountRow;
import com.pymcl.android.ui.state.AppState;
import com.pymcl.android.ui.state.CatalogHit;
import com.pymcl.android.ui.state.CatalogKind;
import com.pymcl.android.ui.state.CatalogRules;
import com.pymcl.android.ui.state.DialogSpec;
import com.pymcl.android.ui.state.InstalledEntry;
import com.pymcl.android.ui.state.LatestOnly;
import com.pymcl.android.ui.theme.Py;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.windows.User32;

/* compiled from: CatalogAccountPages.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u001a/\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0007b\u0002\b\u0012b\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015¢\u0006\u0002\u0010\u0011\u001aM\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH\u0003b\u0002\b\u0012b\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015¢\u0006\u0002\u0010\u001d\u001a\u000e\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 \u001a\u0010\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\u0001H\u0002\u001a'\u0010#\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007b\u0002\b\u0012b\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015¢\u0006\u0002\u0010$\u001a1\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020(H\u0007b\u0002\b\u0012b\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015¢\u0006\u0004\b)\u0010*\u001a\u001f\u00100\u001a\u00020\rH\u0003b\u0002\b\u0012b\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015¢\u0006\u0002\u00101\" \u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\" \u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\u0005X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b.\u0010/¨\u00062²\u0006\n\u00103\u001a\u000204X\u008a\u008e\u0002²\u0006\n\u00105\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u00106\u001a\u000204X\u008a\u008e\u0002²\u0006\n\u00107\u001a\u000204X\u008a\u008e\u0002²\u0006\n\u00108\u001a\u000204X\u008a\u008e\u0002²\u0006\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u008a\u008e\u0002²\u0006\u0012\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0004X\u008a\u008e\u0002²\u0006\f\u0010;\u001a\u0004\u0018\u00010\u0001X\u008a\u008e\u0002²\u0006\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u0004X\u008a\u008e\u0002²\u0006\u0010\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010?X\u008a\u008e\u0002²\u0006\u0016\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00180AX\u008a\u008e\u0002²\u0006\u0016\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010AX\u008a\u008e\u0002²\u0006\n\u0010C\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\f\u0010D\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002²\u0006\u0010\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u0004X\u008a\u008e\u0002²\u0006\f\u0010G\u001a\u0004\u0018\u00010\u0001X\u008a\u008e\u0002"}, d2 = {"sub", "", "Lcom/pymcl/android/ui/state/CatalogKind;", "CATEGORIES", "", "Lkotlin/Pair;", "copyUriToCache", "Ljava/io/File;", "ctx", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "CatalogPage", "", "state", "Lcom/pymcl/android/ui/state/AppState;", "kind", "(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/Composable;", "Landroidx/compose/runtime/ComposableTarget;", "applier", "androidx.compose.ui.UiComposable", "HitCard", "hit", "Lcom/pymcl/android/ui/state/CatalogHit;", "fav", "", "onFav", "Lkotlin/Function0;", "(Lcom/pymcl/android/ui/state/AppState;Lcom/pymcl/android/ui/state/CatalogKind;Lcom/pymcl/android/ui/state/CatalogHit;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "fmtCount", "n", "", "typeLabel", "t", "AccountPage", "(Lcom/pymcl/android/ui/state/AppState;Landroidx/compose/runtime/Composer;I)V", "SkinFront", HintConstants.AUTOFILL_HINT_NAME, "size", "Landroidx/compose/ui/unit/Dp;", "SkinFront-ziNgDLE", "(Ljava/lang/String;FLandroidx/compose/runtime/Composer;I)V", "_u", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/unit/TextUnit;", "get_u$annotations", "()V", "_i", "(Landroidx/compose/runtime/Composer;I)V", "PyMCL-Android:app_debug", "mode", "", "query", "source", "category", "gvIndex", "gameVersions", "hits", "error", "installed", "Lcom/pymcl/android/ui/state/InstalledEntry;", "favs", "", "favHits", "", "updates", "checking", "pendingExport", "rows", "Lcom/pymcl/android/ui/state/AccountRow;", "skinPath"}, k = 2, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes22.dex */
public final class CatalogAccountPagesKt {
    private static final List<Pair<String, String>> CATEGORIES = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("全部", ""), TuplesKt.to("优化", "optimization"), TuplesKt.to("实用", "utility"), TuplesKt.to("库", "library"), TuplesKt.to("科技", "technology"), TuplesKt.to("魔法", "magic"), TuplesKt.to("冒险", "adventure"), TuplesKt.to("装饰", "decoration"), TuplesKt.to("世界生成", "worldgen"), TuplesKt.to("游戏机制", "game-mechanics"), TuplesKt.to("存储", "storage")});
    private static final Pair<FontWeight, TextUnit> _u = new Pair<>(FontWeight.INSTANCE.getBold(), TextUnit.m7202boximpl(TextUnitKt.getSp(1)));

    /* compiled from: CatalogAccountPages.kt */
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogKind.values().length];
            try {
                iArr[CatalogKind.Mods.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[CatalogKind.Mod.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[CatalogKind.Modpack.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[CatalogKind.Datapack.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[CatalogKind.Resource.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[CatalogKind.Shader.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[CatalogKind.World.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$6(AppState appState, int i, Composer composer, int i2) {
        AccountPage(appState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$48(AppState appState, CatalogKind catalogKind, int i, Composer composer, int i2) {
        CatalogPage(appState, catalogKind, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HitCard$lambda$1(AppState appState, CatalogKind catalogKind, CatalogHit catalogHit, boolean z, Function0 function0, int i, Composer composer, int i2) {
        HitCard(appState, catalogKind, catalogHit, z, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SkinFront_ziNgDLE$lambda$1(String str, float f, int i, Composer composer, int i2) {
        m7734SkinFrontziNgDLE(str, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _i$lambda$0(int i, Composer composer, int i2) {
        _i(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private static /* synthetic */ void get_u$annotations() {
    }

    private static final String sub(CatalogKind $this$sub) {
        switch (WhenMappings.$EnumSwitchMapping$0[$this$sub.ordinal()]) {
            case 1:
                return "管理所选实例里已装的模组；要装新的切到「搜索下载」";
            case 2:
                return "从 Modrinth / CurseForge 搜模组，装进所选实例";
            case 3:
                return "一键安装整合包到独立实例";
            case 4:
                return "数据包会放进实例 datapacks 目录";
            case 5:
                return "资源包会放进实例 resourcepacks 目录";
            case 6:
                return "光影包会放进实例 shaderpacks 目录";
            case 7:
                return "世界地图会解压成实例存档";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final File copyUriToCache(Context ctx, Uri uri) throws IOException {
        FileOutputStream fileOutputStream;
        String string;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String fallback = "import-" + System.currentTimeMillis();
        String str = fallback;
        Cursor cursorQuery = ctx.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            fileOutputStream = cursorQuery;
            try {
                Cursor cursor = fileOutputStream;
                if (cursor.moveToFirst() && (string = cursor.getString(0)) != null) {
                    str = string;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
            } finally {
            }
        }
        File out = new File(ctx.getCacheDir(), "imports/" + CatalogRules.INSTANCE.safeImportName(str, fallback));
        File parentFile = out.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        InputStream inputStreamOpenInputStream = ctx.getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            throw new IOException("无法读取所选文件");
        }
        fileOutputStream = inputStreamOpenInputStream;
        try {
            InputStream inputStream = fileOutputStream;
            fileOutputStream = new FileOutputStream(out);
            try {
                ByteStreamsKt.copyTo$default(inputStream, fileOutputStream, 0, 2, null);
                CloseableKt.closeFinally(fileOutputStream, null);
                CloseableKt.closeFinally(fileOutputStream, null);
                return out;
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0239  */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r44v15 */
    /* JADX WARN: Type inference failed for: r44v16 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CatalogPage(final com.pymcl.android.ui.state.AppState r42, final com.pymcl.android.ui.state.CatalogKind r43, androidx.compose.runtime.Composer r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.CatalogAccountPagesKt.CatalogPage(com.pymcl.android.ui.state.AppState, com.pymcl.android.ui.state.CatalogKind, androidx.compose.runtime.Composer, int):void");
    }

    private static final int CatalogPage$lambda$1(MutableIntState $mode$delegate) {
        return $mode$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String CatalogPage$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CatalogPage$lambda$7(MutableIntState $source$delegate) {
        return $source$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CatalogPage$lambda$10(MutableIntState $category$delegate) {
        return $category$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int CatalogPage$lambda$13(MutableIntState $gvIndex$delegate) {
        return $gvIndex$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> CatalogPage$lambda$16(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    private static final List<CatalogHit> CatalogPage$lambda$19(MutableState<List<CatalogHit>> mutableState) {
        return mutableState.getValue();
    }

    private static final String CatalogPage$lambda$22(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final List<InstalledEntry> CatalogPage$lambda$25(MutableState<List<InstalledEntry>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<String> CatalogPage$lambda$28(MutableState<Set<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, CatalogHit> CatalogPage$lambda$31(MutableState<Map<String, CatalogHit>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<String, String> CatalogPage$lambda$34(MutableState<Map<String, String>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean CatalogPage$lambda$37(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CatalogPage$lambda$38(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job CatalogPage$search(AppState $state, LatestOnly searchSeq, CatalogKind $kind, List<String> list, MutableState<List<CatalogHit>> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableIntState source$delegate, MutableState<List<String>> mutableState4, MutableIntState gvIndex$delegate, MutableIntState category$delegate, MutableState<Set<String>> mutableState5, MutableState<Map<String, CatalogHit>> mutableState6) {
        return $state.launch(new CatalogAccountPagesKt$CatalogPage$search$1(searchSeq, $state, $kind, list, mutableState, mutableState2, mutableState3, source$delegate, mutableState4, gvIndex$delegate, category$delegate, mutableState5, mutableState6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job CatalogPage$reloadInstalled(AppState $state, CatalogKind $kind, String inst, String ver, MutableState<List<InstalledEntry>> mutableState) {
        return $state.launch(new CatalogAccountPagesKt$CatalogPage$reloadInstalled$1($state, $kind, inst, ver, mutableState, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$40$0(final AppState $state, final CatalogKind $kind, final String $inst, final String $ver, final MutableState $installed$delegate, Context $ctx, Uri uri) {
        if (uri != null) {
            AppState.runTask$default($state, I18nKt.tr("导入", new Object[0]) + StringUtils.SPACE + I18nKt.tr($kind.getTitle(), new Object[0]), null, "import|" + $kind.getKey() + "|" + uri, new Function1() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CatalogAccountPagesKt.CatalogPage$lambda$40$0$0($state, $kind, $inst, $ver, $installed$delegate, (String) obj);
                }
            }, new CatalogAccountPagesKt$CatalogPage$picker$1$1$2($state, $kind, $inst, $ver, $ctx, uri, null), 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$40$0$0(AppState $state, CatalogKind $kind, String $inst, String $ver, MutableState $installed$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CatalogPage$reloadInstalled($state, $kind, $inst, $ver, $installed$delegate);
        return Unit.INSTANCE;
    }

    private static final File CatalogPage$lambda$42(MutableState<File> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$44$0(AppState $state, MutableState $pendingExport$delegate, Context $ctx, Uri uri) {
        File f = CatalogPage$lambda$42($pendingExport$delegate);
        $pendingExport$delegate.setValue(null);
        if (f != null) {
            $state.launch(new CatalogAccountPagesKt$CatalogPage$exportSaver$1$1$1(uri, $state, f, $ctx, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:171:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0580 A[LOOP:2: B:93:0x057a->B:95:0x0580, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit CatalogPage$lambda$47(final com.pymcl.android.ui.state.CatalogKind r57, final androidx.compose.runtime.MutableState r58, final com.pymcl.android.ui.state.AppState r59, final androidx.compose.runtime.MutableState r60, final java.lang.String r61, final java.lang.String r62, final androidx.compose.runtime.MutableIntState r63, final androidx.activity.compose.ManagedActivityResultLauncher r64, final androidx.activity.compose.ManagedActivityResultLauncher r65, final androidx.compose.runtime.MutableState r66, final androidx.compose.runtime.MutableState r67, final com.pymcl.android.ui.state.LatestOnly r68, final androidx.compose.runtime.MutableState r69, final androidx.compose.runtime.MutableState r70, final androidx.compose.runtime.MutableIntState r71, final java.util.List r72, final androidx.compose.runtime.MutableIntState r73, final androidx.compose.runtime.MutableState r74, final androidx.compose.runtime.MutableIntState r75, final androidx.compose.runtime.MutableState r76, final androidx.compose.runtime.MutableState r77, final androidx.compose.runtime.MutableState r78, androidx.compose.foundation.layout.ColumnScope r79, androidx.compose.runtime.Composer r80, int r81) {
        /*
            Method dump skipped, instructions count: 2368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.CatalogAccountPagesKt.CatalogPage$lambda$47(com.pymcl.android.ui.state.CatalogKind, androidx.compose.runtime.MutableState, com.pymcl.android.ui.state.AppState, androidx.compose.runtime.MutableState, java.lang.String, java.lang.String, androidx.compose.runtime.MutableIntState, androidx.activity.compose.ManagedActivityResultLauncher, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, com.pymcl.android.ui.state.LatestOnly, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, java.util.List, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$0(final CatalogKind $kind, final MutableState $checking$delegate, final AppState $state, final MutableState $updates$delegate, final String $inst, final String $ver, final MutableIntState $mode$delegate, final ManagedActivityResultLauncher $exportSaver, final ManagedActivityResultLauncher $picker, final MutableState $pendingExport$delegate, RowScope Section, Composer $composer, int $changed) {
        Object obj;
        String str;
        Composer composer;
        final String str2 = $inst;
        Composer composer2 = $composer;
        Intrinsics.checkNotNullParameter(Section, "$this$Section");
        ComposerKt.sourceInformation(composer2, "C128@7525L425,128@7487L463,146@8677L33,146@8635L75:CatalogAccountPages.kt#vz4689");
        if (composer2.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-139892697, $changed, -1, "com.pymcl.android.ui.pages.CatalogPage.<anonymous>.<anonymous> (CatalogAccountPages.kt:119)");
            }
            if ($kind == CatalogKind.Mod || $kind == CatalogKind.Mods) {
                composer2.startReplaceGroup(-1292891376);
                ComposerKt.sourceInformation(composer2, "119@7073L401,119@6985L489");
                String str3 = CatalogPage$lambda$37($checking$delegate) ? "处理中…" : "检查更新";
                BtnKind btnKind = BtnKind.Normal;
                ImageVector refresh = Ico.INSTANCE.getRefresh();
                boolean z = !CatalogPage$lambda$37($checking$delegate);
                ComposerKt.sourceInformationMarkerStart(composer2, -1292888648, "CC(remember):CatalogAccountPages.kt#9igjgp");
                boolean zChanged = composer2.changed($checking$delegate) | composer2.changedInstance($state) | composer2.changed($updates$delegate) | composer2.changed(str2) | composer2.changed($ver) | composer2.changed($mode$delegate);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    obj = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CatalogAccountPagesKt.CatalogPage$lambda$47$0$0$0($state, $checking$delegate, $inst, $ver, $updates$delegate, $mode$delegate);
                        }
                    };
                    str2 = $inst;
                    $composer.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                str = "CC(remember):CatalogAccountPages.kt#9igjgp";
                UiKt.Btn(str3, btnKind, refresh, z, false, null, false, (Function0) obj, $composer, 48, 112);
                composer2 = $composer;
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1424457061);
                composer2.endReplaceGroup();
                str = "CC(remember):CatalogAccountPages.kt#9igjgp";
            }
            BtnKind btnKind2 = BtnKind.Normal;
            ImageVector link = Ico.INSTANCE.getLink();
            ComposerKt.sourceInformationMarkerStart(composer2, -1292874160, str);
            boolean zChangedInstance = composer2.changedInstance($state) | composer2.changed($kind.ordinal());
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CatalogAccountPagesKt.CatalogPage$lambda$47$0$1$0($state, $kind);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            Composer composer3 = composer2;
            UiKt.Btn("链接安装", btnKind2, link, false, false, null, false, (Function0) objRememberedValue2, composer3, 54, 120);
            if ($kind != CatalogKind.Modpack) {
                composer3.startReplaceGroup(-1292858887);
                ComposerKt.sourceInformation(composer3, "136@8038L584,136@7996L626");
                BtnKind btnKind3 = BtnKind.Normal;
                ImageVector download = Ico.INSTANCE.getDownload();
                ComposerKt.sourceInformationMarkerStart(composer3, -1292857585, str);
                boolean zChangedInstance2 = composer3.changedInstance($state) | composer3.changed($kind.ordinal()) | composer3.changed(str2) | composer3.changed($ver) | composer3.changedInstance($exportSaver);
                Object objRememberedValue3 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CatalogAccountPagesKt.CatalogPage$lambda$47$0$2$0($state, $kind, str2, $ver, $exportSaver, $pendingExport$delegate);
                        }
                    };
                    $composer.updateRememberedValue(objRememberedValue3);
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                UiKt.Btn("全部导出", btnKind3, download, false, false, null, false, (Function0) objRememberedValue3, composer3, 54, 120);
                composer = composer3;
                composer.endReplaceGroup();
            } else {
                composer = composer3;
                composer.startReplaceGroup(-1423318245);
                composer.endReplaceGroup();
            }
            BtnKind btnKind4 = BtnKind.Normal;
            ImageVector upload = Ico.INSTANCE.getUpload();
            ComposerKt.sourceInformationMarkerStart(composer, -1292837688, str);
            boolean zChangedInstance3 = composer.changedInstance($picker);
            Object objRememberedValue4 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CatalogAccountPagesKt.CatalogPage$lambda$47$0$3$0($picker);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue4 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            UiKt.Btn("导入本地文件", btnKind4, upload, false, false, null, false, (Function0) objRememberedValue4, composer, 54, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$0$0$0(AppState $state, MutableState $checking$delegate, String $inst, String $ver, MutableState $updates$delegate, MutableIntState $mode$delegate) {
        CatalogPage$lambda$38($checking$delegate, true);
        $state.launch(new CatalogAccountPagesKt$CatalogPage$3$1$1$1$1($state, $inst, $ver, $updates$delegate, $mode$delegate, $checking$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$0$1$0(final AppState $state, final CatalogKind $kind) {
        $state.open(new DialogSpec.Prompt("链接安装", "Modrinth / CurseForge 链接", null, null, new Function1() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CatalogAccountPagesKt.CatalogPage$lambda$47$0$1$0$0($state, $kind, (String) obj);
            }
        }, 12, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$0$1$0$0(AppState $state, CatalogKind $kind, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        $state.launch(new CatalogAccountPagesKt$CatalogPage$3$1$2$1$1$1($state, $kind, url, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$0$2$0(AppState $state, CatalogKind $kind, String $inst, String $ver, ManagedActivityResultLauncher $exportSaver, MutableState $pendingExport$delegate) {
        AppState.runTask$default($state, I18nKt.tr("全部导出", new Object[0]) + " · " + I18nKt.tr($kind.getTitle(), new Object[0]), null, null, null, new CatalogAccountPagesKt$CatalogPage$3$1$3$1$1($state, $kind, $inst, $ver, $exportSaver, $pendingExport$delegate, null), 14, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$0$3$0(ManagedActivityResultLauncher $picker) {
        $picker.launch(new String[]{"*/*"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$1$0$0(MutableIntState $mode$delegate, int it) {
        $mode$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0556 A[LOOP:0: B:71:0x0550->B:73:0x0556, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x076f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit CatalogPage$lambda$47$2(final com.pymcl.android.ui.state.CatalogKind r61, androidx.compose.runtime.MutableState r62, com.pymcl.android.ui.state.AppState r63, com.pymcl.android.ui.state.LatestOnly r64, androidx.compose.runtime.MutableState r65, androidx.compose.runtime.MutableState r66, final androidx.compose.runtime.MutableIntState r67, final java.util.List r68, final androidx.compose.runtime.MutableIntState r69, final androidx.compose.runtime.MutableState r70, final androidx.compose.runtime.MutableIntState r71, final androidx.compose.runtime.MutableState r72, final androidx.compose.runtime.MutableState r73, androidx.compose.foundation.layout.ColumnScope r74, androidx.compose.runtime.Composer r75, int r76) {
        /*
            Method dump skipped, instructions count: 1913
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.CatalogAccountPagesKt.CatalogPage$lambda$47$2(com.pymcl.android.ui.state.CatalogKind, androidx.compose.runtime.MutableState, com.pymcl.android.ui.state.AppState, com.pymcl.android.ui.state.LatestOnly, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, java.util.List, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$2$0$0$0(MutableState $query$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $query$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$2$0$1$0(AppState $state, LatestOnly $searchSeq, CatalogKind $kind, List $sources, MutableState $hits$delegate, MutableState $error$delegate, MutableState $query$delegate, MutableIntState $source$delegate, MutableState $gameVersions$delegate, MutableIntState $gvIndex$delegate, MutableIntState $category$delegate, MutableState $favs$delegate, MutableState $favHits$delegate) {
        CatalogPage$search($state, $searchSeq, $kind, $sources, $hits$delegate, $error$delegate, $query$delegate, $source$delegate, $gameVersions$delegate, $gvIndex$delegate, $category$delegate, $favs$delegate, $favHits$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$2$0$2$0(AppState $state, LatestOnly $searchSeq, CatalogKind $kind, List $sources, MutableState $hits$delegate, MutableState $error$delegate, MutableState $query$delegate, MutableIntState $source$delegate, MutableState $gameVersions$delegate, MutableIntState $gvIndex$delegate, MutableIntState $category$delegate, MutableState $favs$delegate, MutableState $favHits$delegate) {
        CatalogPage$search($state, $searchSeq, $kind, $sources, $hits$delegate, $error$delegate, $query$delegate, $source$delegate, $gameVersions$delegate, $gvIndex$delegate, $category$delegate, $favs$delegate, $favHits$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$2$1$0$0(MutableIntState $source$delegate, AppState $state, LatestOnly $searchSeq, CatalogKind $kind, List $sources, MutableState $hits$delegate, MutableState $error$delegate, MutableState $query$delegate, MutableState $gameVersions$delegate, MutableIntState $gvIndex$delegate, MutableIntState $category$delegate, MutableState $favs$delegate, MutableState $favHits$delegate, int it) {
        $source$delegate.setIntValue(it);
        CatalogPage$search($state, $searchSeq, $kind, $sources, $hits$delegate, $error$delegate, $query$delegate, $source$delegate, $gameVersions$delegate, $gvIndex$delegate, $category$delegate, $favs$delegate, $favHits$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$2$1$2$0(MutableIntState $category$delegate, AppState $state, LatestOnly $searchSeq, CatalogKind $kind, List $sources, MutableState $hits$delegate, MutableState $error$delegate, MutableState $query$delegate, MutableIntState $source$delegate, MutableState $gameVersions$delegate, MutableIntState $gvIndex$delegate, MutableState $favs$delegate, MutableState $favHits$delegate, int it) {
        $category$delegate.setIntValue(it);
        CatalogPage$search($state, $searchSeq, $kind, $sources, $hits$delegate, $error$delegate, $query$delegate, $source$delegate, $gameVersions$delegate, $gvIndex$delegate, $category$delegate, $favs$delegate, $favHits$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$2$1$3$0(MutableIntState $gvIndex$delegate, AppState $state, LatestOnly $searchSeq, CatalogKind $kind, List $sources, MutableState $hits$delegate, MutableState $error$delegate, MutableState $query$delegate, MutableIntState $source$delegate, MutableState $gameVersions$delegate, MutableIntState $category$delegate, MutableState $favs$delegate, MutableState $favHits$delegate, int it) {
        $gvIndex$delegate.setIntValue(it);
        CatalogPage$search($state, $searchSeq, $kind, $sources, $hits$delegate, $error$delegate, $query$delegate, $source$delegate, $gameVersions$delegate, $gvIndex$delegate, $category$delegate, $favs$delegate, $favHits$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$2$1$4$0(MutableState $query$delegate, MutableIntState $source$delegate, MutableIntState $category$delegate, MutableIntState $gvIndex$delegate, AppState $state, LatestOnly $searchSeq, CatalogKind $kind, List $sources, MutableState $hits$delegate, MutableState $error$delegate, MutableState $gameVersions$delegate, MutableState $favs$delegate, MutableState $favHits$delegate) {
        $query$delegate.setValue("");
        $source$delegate.setIntValue(0);
        $category$delegate.setIntValue(0);
        $gvIndex$delegate.setIntValue(0);
        CatalogPage$search($state, $searchSeq, $kind, $sources, $hits$delegate, $error$delegate, $query$delegate, $source$delegate, $gameVersions$delegate, $gvIndex$delegate, $category$delegate, $favs$delegate, $favHits$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$4$1$0(AppState $state, CatalogKind $kind, CatalogHit $hit, MutableState $favs$delegate, MutableState $favHits$delegate) {
        $state.launch(new CatalogAccountPagesKt$CatalogPage$3$5$1$1$1($state, $kind, $hit, $favs$delegate, $favHits$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$5$0$0(AppState $state) {
        $state.open(DialogSpec.GlobalMods.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$5$1$0(AppState $state, CatalogKind $kind, String $inst, String $ver, MutableState $installed$delegate) {
        CatalogPage$reloadInstalled($state, $kind, $inst, $ver, $installed$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$6$0(final CatalogKind $kind, final InstalledEntry $e, final AppState $state, final String $inst, final String $ver, final MutableState $installed$delegate, final MutableState $updates$delegate, RowScope RowCard, Composer $composer, int $changed) {
        AppState appState;
        String str;
        String str2;
        Composer composer;
        CatalogKind catalogKind;
        InstalledEntry installedEntry;
        Composer composer2;
        Function0 function0;
        Function0 function02;
        Composer composer3;
        String str3;
        String str4;
        AppState appState2;
        InstalledEntry installedEntry2;
        final MutableState mutableState = $installed$delegate;
        Intrinsics.checkNotNullParameter(RowCard, "$this$RowCard");
        ComposerKt.sourceInformation($composer, "C189@12039L647,200@13060L247,200@13034L273:CatalogAccountPages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(RowCard) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1237189585, $dirty2, -1, "com.pymcl.android.ui.pages.CatalogPage.<anonymous>.<anonymous>.<anonymous> (CatalogAccountPages.kt:187)");
            }
            if ($kind != CatalogKind.World) {
                $composer.startReplaceGroup(-766747812);
                ComposerKt.sourceInformation($composer, "187@11773L151,187@11753L171");
                boolean enabled = $e.getEnabled();
                ComposerKt.sourceInformationMarkerStart($composer, -766747192, "CC(remember):CatalogAccountPages.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($state) | $composer.changed($kind.ordinal()) | $composer.changed($inst) | $composer.changed($ver) | $composer.changedInstance($e) | $composer.changed(mutableState);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda18
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CatalogAccountPagesKt.CatalogPage$lambda$47$6$0$0$0($state, $kind, $inst, $ver, $e, mutableState, ((Boolean) obj).booleanValue());
                        }
                    };
                    mutableState = mutableState;
                    catalogKind = $kind;
                    $composer.updateRememberedValue(objRememberedValue);
                } else {
                    catalogKind = $kind;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                str = $inst;
                str2 = $ver;
                composer = $composer;
                installedEntry = $e;
                appState = $state;
                UiKt.PySwitch(enabled, false, (Function1) objRememberedValue, composer, 0, 2);
            } else {
                appState = $state;
                str = $inst;
                str2 = $ver;
                composer = $composer;
                catalogKind = $kind;
                installedEntry = $e;
                composer.startReplaceGroup(2000785937);
            }
            composer.endReplaceGroup();
            if (catalogKind != CatalogKind.World) {
                composer.startReplaceGroup(-766740685);
                ComposerKt.sourceInformation(composer, "188@11980L34");
                NetImageKt.m7570NetIcon6a0pyJM(installedEntry.getIconUrl(), installedEntry.getTitle(), Dp.m7018constructorimpl(36), composer, 384, 0);
                composer2 = composer;
            } else {
                composer2 = composer;
                composer2.startReplaceGroup(2000875217);
            }
            composer2.endReplaceGroup();
            Composer composer4 = composer2;
            Modifier modifierWeight$default = RowScope.weight$default(RowCard, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierWeight$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM3832constructorimpl = Updater.m3832constructorimpl($composer);
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1753661769, "C190@12097L504,195@12630L30:CatalogAccountPages.kt#vz4689");
            Arrangement.Horizontal horizontalM619spacedBy0680j_4 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(6));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM619spacedBy0680j_4, centerVertically, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((432 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor2;
                $composer.createNode(function02);
            } else {
                function02 = constructor2;
                $composer.useNode();
            }
            Composer composerM3832constructorimpl2 = Updater.m3832constructorimpl($composer);
            Updater.m3839setimpl(composerM3832constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3832constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3832constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3839setimpl(composerM3832constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1256853144, "C191@12235L23:CatalogAccountPages.kt#vz4689");
            UiKt.H3(installedEntry.getTitle(), null, true, $composer, 384, 2);
            if (installedEntry.getVersion().length() > 0) {
                $composer.startReplaceGroup(929289066);
                ComposerKt.sourceInformation($composer, "191@12288L31");
                UiKt.Tag(installedEntry.getVersion(), TagTone.Neutral, false, $composer, 48, 4);
            } else {
                $composer.startReplaceGroup(-1256780233);
            }
            $composer.endReplaceGroup();
            if (installedEntry.getShared()) {
                $composer.startReplaceGroup(929290566);
                ComposerKt.sourceInformation($composer, "191@12335L27");
                UiKt.Tag("实例共享目录", TagTone.Info, false, $composer, 54, 4);
            } else {
                $composer.startReplaceGroup(-1256737577);
            }
            $composer.endReplaceGroup();
            if (installedEntry.getSource().length() > 0) {
                $composer.startReplaceGroup(929293362);
                ComposerKt.sourceInformation($composer, "192@12422L39");
                UiKt.Tag(installedEntry.getSource(), TagTone.Info, true, $composer, 432, 0);
            } else {
                $composer.startReplaceGroup(-1256639369);
            }
            $composer.endReplaceGroup();
            String str5 = CatalogPage$lambda$34($updates$delegate).get(installedEntry.getFilename());
            if (str5 == null) {
                $composer.startReplaceGroup(-1256584066);
                $composer.endReplaceGroup();
                composer3 = $composer;
            } else {
                $composer.startReplaceGroup(-1256584065);
                ComposerKt.sourceInformation($composer, "*193@12521L48");
                composer3 = $composer;
                UiKt.Tag(I18nKt.tr("可更新：{0}", str5), TagTone.Warn, true, composer3, 432, 0);
                Unit unit = Unit.INSTANCE;
                composer3.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Mono(installedEntry.getFilename(), null, 1, $composer, 384, 2);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (CatalogPage$lambda$34($updates$delegate).containsKey(installedEntry.getFilename())) {
                composer4.startReplaceGroup(-766715882);
                ComposerKt.sourceInformation(composer4, "197@12786L223,197@12748L261");
                BtnKind btnKind = BtnKind.Soft;
                ImageVector download = Ico.INSTANCE.getDownload();
                ComposerKt.sourceInformationMarkerStart(composer4, -766714704, "CC(remember):CatalogAccountPages.kt#9igjgp");
                boolean zChangedInstance2 = composer4.changedInstance(appState) | composer4.changedInstance(installedEntry) | composer4.changed($updates$delegate) | composer4.changed(mutableState) | composer4.changed($kind.ordinal()) | composer4.changed(str) | composer4.changed(str2);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final String str6 = str2;
                    final String str7 = str;
                    final InstalledEntry installedEntry3 = installedEntry;
                    final AppState appState3 = appState;
                    objRememberedValue2 = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CatalogAccountPagesKt.CatalogPage$lambda$47$6$0$2$0(appState3, installedEntry3, $updates$delegate, $kind, str7, str6, mutableState);
                        }
                    };
                    appState2 = appState3;
                    installedEntry2 = installedEntry3;
                    $composer.updateRememberedValue(objRememberedValue2);
                } else {
                    appState2 = appState;
                    installedEntry2 = installedEntry;
                }
                ComposerKt.sourceInformationMarkerEnd(composer4);
                str3 = $inst;
                str4 = $ver;
                UiKt.Btn("更新", btnKind, download, false, false, null, false, (Function0) objRememberedValue2, composer4, 54, 120);
                composer4.endReplaceGroup();
            } else {
                str3 = str;
                str4 = str2;
                appState2 = appState;
                installedEntry2 = installedEntry;
                composer4.startReplaceGroup(2001862257);
                composer4.endReplaceGroup();
            }
            BtnKind btnKind2 = BtnKind.Danger;
            ComposerKt.sourceInformationMarkerStart(composer4, -766705912, "CC(remember):CatalogAccountPages.kt#9igjgp");
            boolean zChangedInstance3 = composer4.changedInstance(appState2) | composer4.changedInstance(installedEntry2) | composer4.changed($kind.ordinal()) | composer4.changed(str3) | composer4.changed(str4) | composer4.changed($installed$delegate);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                final String str8 = str4;
                final String str9 = str3;
                final InstalledEntry installedEntry4 = installedEntry2;
                final AppState appState4 = appState2;
                objRememberedValue3 = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CatalogAccountPagesKt.CatalogPage$lambda$47$6$0$3$0(appState4, installedEntry4, $kind, str9, str8, $installed$delegate);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer4);
            UiKt.Btn("删除", btnKind2, null, false, false, null, false, (Function0) objRememberedValue3, composer4, 54, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$6$0$0$0(AppState $state, CatalogKind $kind, String $inst, String $ver, InstalledEntry $e, MutableState $installed$delegate, boolean on) {
        $state.launch(new CatalogAccountPagesKt$CatalogPage$3$7$1$1$1$1($state, $kind, $inst, $ver, $e, on, $installed$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$6$0$2$0(final AppState $state, final InstalledEntry $e, final MutableState $updates$delegate, final CatalogKind $kind, final String $inst, final String $ver, final MutableState $installed$delegate) {
        AppState.runTask$default($state, I18nKt.tr("更新", new Object[0]) + StringUtils.SPACE + $e.getTitle(), null, null, new Function1() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CatalogAccountPagesKt.CatalogPage$lambda$47$6$0$2$0$0($e, $updates$delegate, $state, $kind, $inst, $ver, $installed$delegate, (String) obj);
            }
        }, new CatalogAccountPagesKt$CatalogPage$3$7$1$3$1$2($state, $inst, $ver, $e, null), 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$6$0$2$0$0(InstalledEntry $e, MutableState $updates$delegate, AppState $state, CatalogKind $kind, String $inst, String $ver, MutableState $installed$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $updates$delegate.setValue(MapsKt.minus(CatalogPage$lambda$34($updates$delegate), $e.getFilename()));
        CatalogPage$reloadInstalled($state, $kind, $inst, $ver, $installed$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$6$0$3$0(final AppState $state, final InstalledEntry $e, final CatalogKind $kind, final String $inst, final String $ver, final MutableState $installed$delegate) {
        $state.open(new DialogSpec.Confirm("删除确认", I18nKt.tr("将删除「{0}」，不可恢复。", $e.getFilename()), "删除", true, true, new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CatalogAccountPagesKt.CatalogPage$lambda$47$6$0$3$0$0($state, $kind, $inst, $ver, $e, $installed$delegate);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$6$0$3$0$0(AppState $state, CatalogKind $kind, String $inst, String $ver, InstalledEntry $e, MutableState $installed$delegate) {
        $state.launch(new CatalogAccountPagesKt$CatalogPage$3$7$1$4$1$1$1($state, $kind, $inst, $ver, $e, $installed$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CatalogPage$lambda$47$8$0$0(AppState $state, CatalogKind $kind, CatalogHit $hit, MutableState $favs$delegate) {
        $state.launch(new CatalogAccountPagesKt$CatalogPage$3$8$1$1$1($state, $kind, $hit, $favs$delegate, null));
        return Unit.INSTANCE;
    }

    private static final void HitCard(final AppState state, final CatalogKind kind, final CatalogHit hit, final boolean fav, final Function0<Unit> function0, Composer $composer, final int $changed) {
        boolean z;
        Function0<Unit> function02;
        Composer $composer2 = $composer.startRestartGroup(-1894813491);
        ComposerKt.sourceInformation($composer2, "C(HitCard)P(4,2,1)218@14123L7,219@14143L1098,219@14135L1106:CatalogAccountPages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(kind.ordinal()) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= ($changed & 512) == 0 ? $composer2.changed(hit) : $composer2.changedInstance(hit) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            z = fav;
            $dirty |= $composer2.changed(z) ? 2048 : 1024;
        } else {
            z = fav;
        }
        if (($changed & 24576) == 0) {
            function02 = function0;
            $dirty |= $composer2.changedInstance(function02) ? 16384 : 8192;
        } else {
            function02 = function0;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1894813491, $dirty2, -1, "com.pymcl.android.ui.pages.HitCard (CatalogAccountPages.kt:217)");
            }
            ProvidableCompositionLocal<UriHandler> localUriHandler = CompositionLocalsKt.getLocalUriHandler();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localUriHandler);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final UriHandler uri = (UriHandler) objConsume;
            final boolean z2 = z;
            final Function0<Unit> function03 = function02;
            UiKt.RowCard(null, false, null, ComposableLambdaKt.rememberComposableLambda(-828784415, true, new Function3() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CatalogAccountPagesKt.HitCard$lambda$0(hit, z2, function03, state, kind, uri, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CatalogAccountPagesKt.HitCard$lambda$1(state, kind, hit, fav, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit HitCard$lambda$0(final CatalogHit $hit, boolean $fav, Function0 $onFav, final AppState $state, final CatalogKind $kind, final UriHandler $uri, RowScope RowCard, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Color colorM4380boximpl;
        String str;
        int i;
        final RowScope rowScope;
        Composer composer;
        Intrinsics.checkNotNullParameter(RowCard, "$this$RowCard");
        ComposerKt.sourceInformation($composer, "C220@14153L38,221@14200L678,232@14887L99,234@15161L74,234@15130L105:CatalogAccountPages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(RowCard) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-828784415, $dirty2, -1, "com.pymcl.android.ui.pages.HitCard.<anonymous> (CatalogAccountPages.kt:220)");
            }
            NetImageKt.m7570NetIcon6a0pyJM($hit.getIconUrl(), $hit.getTitle(), Dp.m7018constructorimpl(48), $composer, 384, 0);
            Modifier modifierWeight$default = RowScope.weight$default(RowCard, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierWeight$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((0 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM3832constructorimpl = Updater.m3832constructorimpl($composer);
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i3 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1517330650, "C222@14242L192,225@14447L41,226@14501L367:CatalogAccountPages.kt#vz4689");
            Arrangement.Horizontal horizontalM619spacedBy0680j_4 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(6));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM619spacedBy0680j_4, centerVertically, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i5 = ((((432 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor2;
                $composer.createNode(function02);
            } else {
                function02 = constructor2;
                $composer.useNode();
            }
            Composer composerM3832constructorimpl2 = Updater.m3832constructorimpl($composer);
            Updater.m3839setimpl(composerM3832constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3832constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3832constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3839setimpl(composerM3832constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i6 = (i5 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i7 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1719114384, "C223@14364L25,223@14391L29:CatalogAccountPages.kt#vz4689");
            UiKt.H3($hit.getTitle(), null, true, $composer, 384, 2);
            UiKt.Small($hit.getAuthor(), null, true, $composer, 384, 2);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Muted($hit.getDesc(), null, true, 2, $composer, GL11.GL_AUTO_NORMAL, 2);
            Modifier modifierM742paddingqDBjuR0$default = PaddingKt.m742paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m7018constructorimpl(3), 0.0f, 0.0f, 13, null);
            Arrangement.Horizontal horizontalM619spacedBy0680j_42 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(6));
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM619spacedBy0680j_42, centerVertically2, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierM742paddingqDBjuR0$default);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i8 = ((((438 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function03 = constructor3;
                $composer.createNode(function03);
            } else {
                function03 = constructor3;
                $composer.useNode();
            }
            Composer composerM3832constructorimpl3 = Updater.m3832constructorimpl($composer);
            Updater.m3839setimpl(composerM3832constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3832constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3832constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3839setimpl(composerM3832constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = (i8 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i10 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1726963880, "C227@14653L41,229@14799L55:CatalogAccountPages.kt#vz4689");
            UiKt.Tag($hit.getSource(), TagTone.Info, true, $composer, 432, 0);
            $composer.startReplaceGroup(-1191215038);
            ComposerKt.sourceInformation($composer, "*228@14744L36");
            Iterator it = CollectionsKt.take($hit.getCategories(), 3).iterator();
            while (it.hasNext()) {
                UiKt.Tag((String) it.next(), TagTone.Neutral, true, $composer, 432, 0);
            }
            $composer.endReplaceGroup();
            UiKt.Small(fmtCount($hit.getDownloads()) + I18nKt.tr(" 次下载", new Object[0]), null, true, $composer, 384, 2);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Ico ico = Ico.INSTANCE;
            ImageVector star = $fav ? ico.getStar() : ico.getStarOutline();
            String strTr = I18nKt.tr("收藏", new Object[0]);
            if ($fav) {
                $composer.startReplaceGroup(-1892846779);
                ComposerKt.sourceInformation($composer, "232@14957L6");
                long jM7987getWarn0d7_KjU = Py.INSTANCE.getColors($composer, 6).m7987getWarn0d7_KjU();
                $composer.endReplaceGroup();
                colorM4380boximpl = Color.m4380boximpl(jM7987getWarn0d7_KjU);
            } else {
                $composer.startReplaceGroup(1451301916);
                $composer.endReplaceGroup();
                colorM4380boximpl = null;
            }
            UiKt.m7597IconBtndrOMvmE(star, strTr, colorM4380boximpl, $onFav, $composer, 0, 0);
            if ($hit.getInstalled()) {
                $composer.startReplaceGroup(-1892845173);
                ComposerKt.sourceInformation($composer, "233@15014L10");
                UiKt.Tag("已安装", null, false, $composer, 6, 6);
                composer = $composer;
                composer.endReplaceGroup();
                str = "CC(remember):CatalogAccountPages.kt#9igjgp";
                i = 0;
                rowScope = RowCard;
            } else {
                $composer.startReplaceGroup(-1892844580);
                ComposerKt.sourceInformation($composer, "233@15071L50,233@15030L91");
                BtnKind btnKind = BtnKind.Primary;
                ImageVector download = Ico.INSTANCE.getDownload();
                ComposerKt.sourceInformationMarkerStart($composer, -1892843309, "CC(remember):CatalogAccountPages.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($state) | $composer.changed($kind.ordinal()) | $composer.changedInstance($hit);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CatalogAccountPagesKt.HitCard$lambda$0$1$0($state, $kind, $hit);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                str = "CC(remember):CatalogAccountPages.kt#9igjgp";
                i = 0;
                rowScope = RowCard;
                UiKt.Btn("安装", btnKind, download, false, false, null, false, (Function0) objRememberedValue, $composer, 54, 120);
                composer = $composer;
                composer.endReplaceGroup();
            }
            ImageVector link = Ico.INSTANCE.getLink();
            String strTr2 = I18nKt.tr("打开介绍页", new Object[i]);
            ComposerKt.sourceInformationMarkerStart(composer, -1892840405, str);
            boolean zChangedInstance2 = composer.changedInstance($hit) | (($dirty2 & 14) != 4 ? i : true) | composer.changedInstance($uri);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CatalogAccountPagesKt.HitCard$lambda$0$2$0($hit, rowScope, $uri);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            UiKt.m7597IconBtndrOMvmE(link, strTr2, null, (Function0) objRememberedValue2, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HitCard$lambda$0$1$0(AppState $state, CatalogKind $kind, CatalogHit $hit) {
        $state.open(new DialogSpec.CatalogFiles($kind, $hit));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HitCard$lambda$0$2$0(CatalogHit $hit, RowScope $this_RowCard, UriHandler $uri) {
        if ($hit.getPageUrl().length() > 0) {
            try {
                Result.Companion companion = Result.INSTANCE;
                $uri.openUri($hit.getPageUrl());
                Result.m8116constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m8116constructorimpl(ResultKt.createFailure(th));
            }
        }
        return Unit.INSTANCE;
    }

    public static final String fmtCount(long n) {
        return I18nFmt.INSTANCE.count(n);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String typeLabel(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1548612125: goto L2b;
                case -646511651: goto L1f;
                case -94228242: goto L14;
                case 104814652: goto L8;
                default: goto L7;
            }
        L7:
            goto L37
        L8:
            java.lang.String r0 = "nide8"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L11
            goto L7
        L11:
            java.lang.String r0 = "统一通行证"
            goto L39
        L14:
            java.lang.String r0 = "microsoft"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L7
            java.lang.String r0 = "微软"
            goto L39
        L1f:
            java.lang.String r0 = "authlib"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L28
            goto L7
        L28:
            java.lang.String r0 = "皮肤站"
            goto L39
        L2b:
            java.lang.String r0 = "offline"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L34
            goto L7
        L34:
            java.lang.String r0 = "离线"
            goto L39
        L37:
            java.lang.String r0 = "其他"
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.CatalogAccountPagesKt.typeLabel(java.lang.String):java.lang.String");
    }

    public static final void AccountPage(final AppState state, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(state, "state");
        Composer $composer2 = $composer.startRestartGroup(-1310781203);
        ComposerKt.sourceInformation($composer2, "C(AccountPage)245@15600L58,247@15754L12,247@15733L33,248@15806L41,248@15771L76,249@15863L2869,249@15852L2880:CatalogAccountPages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer2.changed(state) : $composer2.changedInstance(state) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1310781203, $dirty, -1, "com.pymcl.android.ui.pages.AccountPage (CatalogAccountPages.kt:244)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -1235316665, "CC(remember):CatalogAccountPages.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState rows$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -1235311783, "CC(remember):CatalogAccountPages.kt#9igjgp");
            boolean z = ($dirty & 14) == 4 || (($dirty & 8) != 0 && $composer2.changedInstance(state));
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new CatalogAccountPagesKt$AccountPage$1$1(state, rows$delegate, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer2, 6);
            Integer numValueOf = Integer.valueOf(state.getDialogs().size());
            ComposerKt.sourceInformationMarkerStart($composer2, -1235310090, "CC(remember):CatalogAccountPages.kt#9igjgp");
            boolean z2 = ($dirty & 14) == 4 || (($dirty & 8) != 0 && $composer2.changedInstance(state));
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (Function2) new CatalogAccountPagesKt$AccountPage$2$1(state, rows$delegate, null);
                $composer2.updateRememberedValue(obj2);
                objRememberedValue3 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, $composer2, 0);
            UiKt.ScrollBody(null, ComposableLambdaKt.rememberComposableLambda(-1012069024, true, new Function3() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return CatalogAccountPagesKt.AccountPage$lambda$5(state, rows$delegate, (ColumnScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), $composer2, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return CatalogAccountPagesKt.AccountPage$lambda$6(state, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final List<AccountRow> AccountPage$lambda$1(MutableState<List<AccountRow>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Job AccountPage$reload(AppState $state, MutableState<List<AccountRow>> mutableState) {
        return $state.launch(new CatalogAccountPagesKt$AccountPage$reload$1($state, mutableState, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$5(final AppState $state, final MutableState $rows$delegate, ColumnScope ScrollBody, Composer $composer, int $changed) {
        Object next;
        Intrinsics.checkNotNullParameter(ScrollBody, "$this$ScrollBody");
        ComposerKt.sourceInformation($composer, "C250@15908L404,250@15873L439,258@16403L574,258@16373L604,291@18696L30:CatalogAccountPages.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1012069024, $changed, -1, "com.pymcl.android.ui.pages.AccountPage.<anonymous> (CatalogAccountPages.kt:250)");
            }
            UiKt.Section("账号", "启动游戏时使用标记为「当前」的账号", null, false, ComposableLambdaKt.rememberComposableLambda(1617183634, true, new Function3() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CatalogAccountPagesKt.AccountPage$lambda$5$0($state, $rows$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 24630, 12);
            Iterator it = AccountPage$lambda$1($rows$delegate).iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (((AccountRow) next).getActive()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            final AccountRow active = (AccountRow) next;
            UiKt.m7594CardDzVHIIc(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1060105488, true, new Function3() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CatalogAccountPagesKt.AccountPage$lambda$5$2(active, $rows$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 3078, 6);
            if (AccountPage$lambda$1($rows$delegate).isEmpty()) {
                $composer.startReplaceGroup(-1935686535);
                ComposerKt.sourceInformation($composer, "269@17006L57");
                UiKt.Empty(Ico.INSTANCE.getPerson(), "还没有账号", "添加离线账号，或用微软 / 皮肤站 / 统一通行证登录", null, $composer, 432, 8);
            } else {
                $composer.startReplaceGroup(123314338);
            }
            $composer.endReplaceGroup();
            $composer.startReplaceGroup(-1935682710);
            ComposerKt.sourceInformation($composer, "*271@17133L1544,271@17104L1573");
            for (final AccountRow accountRow : AccountPage$lambda$1($rows$delegate)) {
                UiKt.RowCard(null, accountRow.getActive(), null, ComposableLambdaKt.rememberComposableLambda(486839496, true, new Function3() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda48
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return CatalogAccountPagesKt.AccountPage$lambda$5$3$0(accountRow, $state, $rows$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 3072, 5);
            }
            $composer.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m771height3ABfNKs(Modifier.INSTANCE, Dp.m7018constructorimpl(60)), $composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$5$0(final AppState $state, final MutableState $rows$delegate, RowScope Section, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Section, "$this$Section");
        ComposerKt.sourceInformation($composer, "C251@15962L37,251@15922L77,252@16038L41,252@16012L67,253@16121L39,253@16092L68,254@16202L37,254@16173L66,255@16290L12,255@16252L50:CatalogAccountPages.kt#vz4689");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1617183634, $changed, -1, "com.pymcl.android.ui.pages.AccountPage.<anonymous>.<anonymous> (CatalogAccountPages.kt:251)");
            }
            BtnKind btnKind = BtnKind.Primary;
            ImageVector add = Ico.INSTANCE.getAdd();
            ComposerKt.sourceInformationMarkerStart($composer, -664687113, "CC(remember):CatalogAccountPages.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($state);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CatalogAccountPagesKt.AccountPage$lambda$5$0$0$0($state);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("添加离线账号", btnKind, add, false, false, null, false, (Function0) objRememberedValue, $composer, 54, 120);
            BtnKind btnKind2 = BtnKind.Soft;
            ComposerKt.sourceInformationMarkerStart($composer, -664684677, "CC(remember):CatalogAccountPages.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($state);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CatalogAccountPagesKt.AccountPage$lambda$5$0$1$0($state);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("微软登录", btnKind2, null, false, false, null, false, (Function0) objRememberedValue2, $composer, 54, 124);
            BtnKind btnKind3 = BtnKind.Normal;
            ComposerKt.sourceInformationMarkerStart($composer, -664682023, "CC(remember):CatalogAccountPages.kt#9igjgp");
            boolean zChangedInstance3 = $composer.changedInstance($state);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CatalogAccountPagesKt.AccountPage$lambda$5$0$2$0($state);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("皮肤站登录", btnKind3, null, false, false, null, false, (Function0) objRememberedValue3, $composer, 54, 124);
            BtnKind btnKind4 = BtnKind.Normal;
            ComposerKt.sourceInformationMarkerStart($composer, -664679433, "CC(remember):CatalogAccountPages.kt#9igjgp");
            boolean zChangedInstance4 = $composer.changedInstance($state);
            Object objRememberedValue4 = $composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CatalogAccountPagesKt.AccountPage$lambda$5$0$3$0($state);
                    }
                };
                $composer.updateRememberedValue(obj4);
                objRememberedValue4 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("统一通行证", btnKind4, null, false, false, null, false, (Function0) objRememberedValue4, $composer, 54, 124);
            BtnKind btnKind5 = BtnKind.Ghost;
            ImageVector refresh = Ico.INSTANCE.getRefresh();
            ComposerKt.sourceInformationMarkerStart($composer, -664676642, "CC(remember):CatalogAccountPages.kt#9igjgp");
            boolean zChangedInstance5 = $composer.changedInstance($state);
            Object objRememberedValue5 = $composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj5 = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CatalogAccountPagesKt.AccountPage$lambda$5$0$4$0($state, $rows$delegate);
                    }
                };
                $composer.updateRememberedValue(obj5);
                objRememberedValue5 = obj5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("刷新", btnKind5, refresh, false, false, null, false, (Function0) objRememberedValue5, $composer, 54, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$5$0$0$0(AppState $state) {
        $state.open(DialogSpec.OfflineAdd.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$5$0$1$0(AppState $state) {
        $state.open(DialogSpec.MicrosoftLogin.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$5$0$2$0(AppState $state) {
        $state.open(DialogSpec.AuthlibLogin.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$5$0$3$0(AppState $state) {
        $state.open(DialogSpec.Nide8Login.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$5$0$4$0(AppState $state, MutableState $rows$delegate) {
        AccountPage$reload($state, $rows$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AccountPage$lambda$5$2(com.pymcl.android.ui.state.AccountRow r84, androidx.compose.runtime.MutableState r85, androidx.compose.foundation.layout.ColumnScope r86, androidx.compose.runtime.Composer r87, int r88) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.CatalogAccountPagesKt.AccountPage$lambda$5$2(com.pymcl.android.ui.state.AccountRow, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$5$3$0(final AccountRow $a, final AppState $state, final MutableState $rows$delegate, RowScope RowCard, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Composer composer;
        Intrinsics.checkNotNullParameter(RowCard, "$this$RowCard");
        ComposerKt.sourceInformation($composer, "C272@17167L70,273@17297L77,273@17254L120,274@17422L28,274@17391L59,275@17467L450,283@18293L370,283@18267L396:CatalogAccountPages.kt#vz4689");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(RowCard) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(486839496, $dirty2, -1, "com.pymcl.android.ui.pages.AccountPage.<anonymous>.<anonymous>.<anonymous> (CatalogAccountPages.kt:272)");
            }
            String name = $a.getName();
            int size = $state.getDialogs().size();
            ComposerKt.sourceInformationMarkerStart($composer, -298678450, "CC(remember):CatalogAccountPages.kt#9igjgp");
            boolean zChanged = $composer.changed(name) | $composer.changed(size);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            MutableState skinPath$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            String name2 = $a.getName();
            Integer numValueOf = Integer.valueOf($state.getDialogs().size());
            ComposerKt.sourceInformationMarkerStart($composer, -298674283, "CC(remember):CatalogAccountPages.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($a) | $composer.changed(skinPath$delegate) | $composer.changedInstance($state);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new CatalogAccountPagesKt$AccountPage$3$3$1$1$1($a, $state, skinPath$delegate, null);
                $composer.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.LaunchedEffect(name2, numValueOf, (Function2) objRememberedValue2, $composer, 0);
            NetImageKt.m7571SkinFaceImagerAjV9yQ(AccountPage$lambda$5$3$0$1(skinPath$delegate), Dp.m7018constructorimpl(36), ComposableLambdaKt.rememberComposableLambda(-547342244, true, new Function2() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CatalogAccountPagesKt.AccountPage$lambda$5$3$0$4($a, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 432);
            Modifier modifierWeight$default = RowScope.weight$default(RowCard, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, -483455358, "CC(Column)P(2,3,1)87@4442L61,88@4508L133:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierWeight$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM3832constructorimpl = Updater.m3832constructorimpl($composer);
            Updater.m3839setimpl(composerM3832constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3832constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3832constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3839setimpl(composerM3832constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -384672921, "C89@4556L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -852065913, "C276@17517L285:CatalogAccountPages.kt#vz4689");
            Arrangement.Horizontal horizontalM619spacedBy0680j_4 = Arrangement.INSTANCE.m619spacedBy0680j_4(Dp.m7018constructorimpl(6));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 693286680, "CC(Row)P(2,1,3)99@5124L58,100@5187L130:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM619spacedBy0680j_4, centerVertically, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1323940314, "CC(Layout)P(!1,2)79@3206L23,82@3357L359:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash($composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((432 << 3) & 112) << 6) & User32.WM_PENWINFIRST) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -692256719, "CC(ReusableComposeNode)P(1,2)355@14017L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor2;
                $composer.createNode(function02);
            } else {
                function02 = constructor2;
                $composer.useNode();
            }
            Composer composerM3832constructorimpl2 = Updater.m3832constructorimpl($composer);
            Updater.m3839setimpl(composerM3832constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3839setimpl(composerM3832constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3832constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3832constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3832constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3832constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3839setimpl(composerM3832constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, -407735110, "C101@5232L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1826785276, "C277@17647L22,277@17671L84:CatalogAccountPages.kt#vz4689");
            UiKt.H3($a.getName(), null, true, $composer, 384, 2);
            UiKt.Tag(typeLabel($a.getType()), Intrinsics.areEqual($a.getType(), "microsoft") ? TagTone.Info : TagTone.Neutral, false, $composer, 0, 4);
            if ($a.getActive()) {
                $composer.startReplaceGroup(1998595051);
                ComposerKt.sourceInformation($composer, "277@17771L9");
                UiKt.Tag("当前", null, false, $composer, 6, 6);
            } else {
                $composer.startReplaceGroup(1826913088);
            }
            $composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if ($a.getUuid().length() > 0) {
                $composer.startReplaceGroup(1357997560);
                ComposerKt.sourceInformation($composer, "279@17848L26");
                UiKt.Mono($a.getUuid(), null, 1, $composer, 384, 2);
                composer = $composer;
            } else {
                composer = $composer;
                composer.startReplaceGroup(1357998577);
                ComposerKt.sourceInformation(composer, "279@17880L19");
                UiKt.Muted("离线模式，无正版验证", null, false, 0, composer, 6, 14);
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if ($a.getActive()) {
                $composer.startReplaceGroup(-668131334);
            } else {
                $composer.startReplaceGroup(-298653302);
                ComposerKt.sourceInformation($composer, "281@17975L168,281@17949L194");
                BtnKind btnKind = BtnKind.Soft;
                ComposerKt.sourceInformationMarkerStart($composer, -298652496, "CC(remember):CatalogAccountPages.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($state) | $composer.changedInstance($a);
                Object objRememberedValue3 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CatalogAccountPagesKt.AccountPage$lambda$5$3$0$6$0($state, $a, $rows$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue3 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                UiKt.Btn("设为当前", btnKind, null, false, false, null, false, (Function0) objRememberedValue3, $composer, 54, 124);
            }
            $composer.endReplaceGroup();
            if (Intrinsics.areEqual($a.getType(), "offline")) {
                $composer.startReplaceGroup(-298645879);
                ComposerKt.sourceInformation($composer, "282@18211L39,282@18185L65");
                BtnKind btnKind2 = BtnKind.Normal;
                ComposerKt.sourceInformationMarkerStart($composer, -298645073, "CC(remember):CatalogAccountPages.kt#9igjgp");
                boolean zChangedInstance3 = $composer.changedInstance($state) | $composer.changedInstance($a);
                Object objRememberedValue4 = $composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CatalogAccountPagesKt.AccountPage$lambda$5$3$0$7$0($state, $a);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                    objRememberedValue4 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                UiKt.Btn("皮肤", btnKind2, null, false, false, null, false, (Function0) objRememberedValue4, $composer, 54, 124);
            } else {
                $composer.startReplaceGroup(-668025190);
            }
            $composer.endReplaceGroup();
            BtnKind btnKind3 = BtnKind.Danger;
            ComposerKt.sourceInformationMarkerStart($composer, -298642118, "CC(remember):CatalogAccountPages.kt#9igjgp");
            boolean zChangedInstance4 = $composer.changedInstance($state) | $composer.changedInstance($a);
            Object objRememberedValue5 = $composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CatalogAccountPagesKt.AccountPage$lambda$5$3$0$8$0($state, $a, $rows$delegate);
                    }
                };
                $composer.updateRememberedValue(obj4);
                objRememberedValue5 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            UiKt.Btn("删除", btnKind3, null, false, false, null, false, (Function0) objRememberedValue5, $composer, 54, 124);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final String AccountPage$lambda$5$3$0$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$5$3$0$4(AccountRow $a, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C274@17424L24:CatalogAccountPages.kt#vz4689");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-547342244, $changed, -1, "com.pymcl.android.ui.pages.AccountPage.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CatalogAccountPages.kt:274)");
            }
            m7734SkinFrontziNgDLE($a.getName(), Dp.m7018constructorimpl(36), $composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$5$3$0$6$0(AppState $state, AccountRow $a, MutableState $rows$delegate) {
        $state.launch(new CatalogAccountPagesKt$AccountPage$3$3$1$4$1$1($state, $a, $rows$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$5$3$0$7$0(AppState $state, AccountRow $a) {
        $state.open(new DialogSpec.Skin($a.getName()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$5$3$0$8$0(final AppState $state, final AccountRow $a, final MutableState $rows$delegate) {
        $state.open(new DialogSpec.Confirm("删除账号", I18nKt.tr("将删除「{0}」。微软账号的刷新令牌也会一并丢失，需要重新走设备码登录。", $a.getName()), "删除", true, true, new Function0() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CatalogAccountPagesKt.AccountPage$lambda$5$3$0$8$0$0($state, $a, $rows$delegate);
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPage$lambda$5$3$0$8$0$0(AppState $state, AccountRow $a, MutableState $rows$delegate) {
        $state.launch(new CatalogAccountPagesKt$AccountPage$3$3$1$6$1$1$1($state, $a, $rows$delegate, null));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0476 A[EDGE_INSN: B:105:0x0476->B:97:0x0476 BREAK  A[LOOP:0: B:41:0x0273->B:96:0x043d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x049e  */
    /* renamed from: SkinFront-ziNgDLE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7734SkinFrontziNgDLE(final java.lang.String r75, final float r76, androidx.compose.runtime.Composer r77, final int r78) {
        /*
            Method dump skipped, instructions count: 1208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.android.ui.pages.CatalogAccountPagesKt.m7734SkinFrontziNgDLE(java.lang.String, float, androidx.compose.runtime.Composer, int):void");
    }

    private static final void _i(Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1098010899);
        ComposerKt.sourceInformation($composer2, "C(_i)316@19903L19:CatalogAccountPages.kt#vz4689");
        if ($composer2.shouldExecute($changed != 0, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1098010899, $changed, -1, "com.pymcl.android.ui.pages._i (CatalogAccountPages.kt:316)");
            }
            IconKt.m2300Iconww6aTOc(Ico.INSTANCE.getAdd(), (String) null, (Modifier) null, 0L, $composer2, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.pymcl.android.ui.pages.CatalogAccountPagesKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CatalogAccountPagesKt._i$lambda$0($changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
