package com.pymcl.android.ui.components;

import androidx.autofill.HintConstants;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.text.util.LocalePreferences;
import com.pymcl.runtime.settings.SettingsProtocol;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: Ico.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\ba\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002R*\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0015\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u0011\u0010\u0019\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u0011\u0010\u001b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000eR\u0011\u0010\u001d\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u0011\u0010\u001f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b \u0010\u000eR\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\"\u0010\u000eR\u0011\u0010#\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b$\u0010\u000eR\u0011\u0010%\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b&\u0010\u000eR\u0011\u0010'\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b(\u0010\u000eR\u0011\u0010)\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b*\u0010\u000eR\u0011\u0010+\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b,\u0010\u000eR\u0011\u0010-\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b.\u0010\u000eR\u0011\u0010/\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b0\u0010\u000eR\u0011\u00101\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b2\u0010\u000eR\u0011\u00103\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b4\u0010\u000eR\u0011\u00105\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b6\u0010\u000eR\u0011\u00107\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b8\u0010\u000eR\u0011\u00109\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b:\u0010\u000eR\u0011\u0010;\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b<\u0010\u000eR\u0011\u0010=\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b>\u0010\u000eR\u0011\u0010?\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b@\u0010\u000eR\u0011\u0010A\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bB\u0010\u000eR\u0011\u0010C\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bD\u0010\u000eR\u0011\u0010E\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bF\u0010\u000eR\u0011\u0010G\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bH\u0010\u000eR\u0011\u0010I\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bJ\u0010\u000eR\u0011\u0010K\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bL\u0010\u000eR\u0011\u0010M\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bN\u0010\u000eR\u0011\u0010O\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bP\u0010\u000eR\u0011\u0010Q\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bR\u0010\u000eR\u0011\u0010S\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bT\u0010\u000eR\u0011\u0010U\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bV\u0010\u000eR\u0011\u0010W\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bX\u0010\u000eR\u0011\u0010Y\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bZ\u0010\u000eR\u0011\u0010[\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\\\u0010\u000eR\u0011\u0010]\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b^\u0010\u000eR\u0011\u0010_\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b`\u0010\u000eR\u0011\u0010a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bb\u0010\u000eR\u0011\u0010c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bd\u0010\u000eR\u0011\u0010e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bf\u0010\u000eR\u0011\u0010g\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bh\u0010\u000eÊ\u0001\f\bj\u0012\b\bk\u0012\u0004\b\u0003\u0010\u0002¨\u0006i"}, d2 = {"Lcom/pymcl/android/ui/components/Ico;", "", "<init>", "()V", "cache", "Ljava/util/HashMap;", "", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lkotlin/collections/HashMap;", SettingsProtocol.EXTRA_VALUE, HintConstants.AUTOFILL_HINT_NAME, "d", "Play", "getPlay", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "Stop", "getStop", "Cube", "getCube", "Download", "getDownload", "Grass", "getGrass", "Puzzle", "getPuzzle", "Box", "getBox", "Data", "getData", "Image", "getImage", "Sun", "getSun", "Moon", "getMoon", "Globe", "getGlobe", "Person", "getPerson", "Coffee", "getCoffee", "Sparkle", "getSparkle", "Wifi", "getWifi", "Server", "getServer", "Clock", "getClock", "Help", "getHelp", "Gear", "getGear", "More", "getMore", "Folder", "getFolder", "Add", "getAdd", "Close", "getClose", "Check", "getCheck", "Refresh", "getRefresh", "Search", "getSearch", "Delete", "getDelete", "Edit", "getEdit", "Star", "getStar", "StarOutline", "getStarOutline", "Copy", "getCopy", "Send", "getSend", "Link", "getLink", "ChevronDown", "getChevronDown", "ChevronRight", "getChevronRight", "ChevronLeft", "getChevronLeft", "Menu", "getMenu", "Warning", "getWarning", "Info", "getInfo", "Pin", "getPin", "Shield", "getShield", "Upload", "getUpload", "Chat", "getChat", "Undo", "getUndo", "Grip", "getGrip", "PyMCL-Android:app_debug", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes21.dex */
public final class Ico {
    public static final int $stable = 0;
    public static final Ico INSTANCE = new Ico();
    private static final HashMap<String, ImageVector> cache = new HashMap<>();

    private Ico() {
    }

    private final ImageVector v(String name, String d) {
        ImageVector imageVectorBuild;
        Map map = cache;
        ImageVector imageVector = map.get(name);
        if (imageVector == null) {
            imageVectorBuild = ImageVector.Builder.m5087addPathoIyEayM$default(new ImageVector.Builder(name, Dp.m7018constructorimpl(24), Dp.m7018constructorimpl(24), 24.0f, 24.0f, 0L, 0, false, 224, null), VectorKt.addPathNodes(d), 0, null, new SolidColor(Color.INSTANCE.m4416getBlack0d7_KjU(), null), 0.0f, null, 0.0f, 0.0f, 0, 0, 0.0f, 0.0f, 0.0f, 0.0f, 16374, null).build();
            map.put(name, imageVectorBuild);
        } else {
            imageVectorBuild = imageVector;
        }
        return imageVectorBuild;
    }

    public final ImageVector getPlay() {
        return v("play", "M8,5v14l11,-7z");
    }

    public final ImageVector getStop() {
        return v("stop", "M6,6h12v12H6z");
    }

    public final ImageVector getCube() {
        return v("cube", "M21,16.5c0,.38-.21,.71-.53,.88l-7.9,4.44c-.16,.12-.36,.18-.57,.18s-.41,-.06-.57,-.18l-7.9,-4.44A.991,.991 0,0 1,3 16.5v-9c0,-.38.21,-.71.53,-.88l7.9,-4.44c.16,-.12.36,-.18.57,-.18s.41,.06.57,.18l7.9,4.44c.32,.17.53,.5.53,.88v9zM12,4.15L6.04,7.5 12,10.85l5.96,-3.35L12,4.15zM5,15.91l6,3.38v-6.71L5,9.21v6.7zm14,0v-6.7l-6,3.37v6.71l6,-3.38z");
    }

    public final ImageVector getDownload() {
        return v("download", "M5,20h14v-2H5v2zM19,9h-4V3H9v6H5l7,7 7,-7z");
    }

    public final ImageVector getGrass() {
        return v("grass", "M4,20h16v2H4zM12,2l-5,9h10zM5,12l-3,7h6zM19,12l-3,7h6z");
    }

    public final ImageVector getPuzzle() {
        return v("puzzle", "M20.5,11H19V7c0,-1.1-.9,-2-2,-2h-4V3.5C13,2.12 11.88,1 10.5,1S8,2.12 8,3.5V5H4c-1.1,0-1.99,.9-1.99,2v3.8H3.5c1.49,0 2.7,1.21 2.7,2.7s-1.21,2.7-2.7,2.7H2V20c0,1.1.9,2 2,2h3.8v-1.5c0,-1.49 1.21,-2.7 2.7,-2.7 1.49,0 2.7,1.21 2.7,2.7V22H17c1.1,0 2,-.9 2,-2v-4h1.5c1.38,0 2.5,-1.12 2.5,-2.5S21.88,11 20.5,11z");
    }

    public final ImageVector getBox() {
        return v("box", "M20,6h-8l-2,-2H4c-1.1,0-1.99,.9-1.99,2L2,18c0,1.1.9,2 2,2h16c1.1,0 2,-.9 2,-2V8c0,-1.1-.9,-2-2,-2zm0,12H4V8h16v10z");
    }

    public final ImageVector getData() {
        return v("data", "M4,6H2v14c0,1.1.9,2 2,2h14v-2H4V6zm16,-4H8c-1.1,0-2,.9-2,2v12c0,1.1.9,2 2,2h12c1.1,0 2,-.9 2,-2V4c0,-1.1-.9,-2-2,-2zm-1,9H9V9h10v2zm-4,4H9v-2h6v2zm4,-8H9V5h10v2z");
    }

    public final ImageVector getImage() {
        return v("image", "M21,19V5c0,-1.1-.9,-2-2,-2H5c-1.1,0-2,.9-2,2v14c0,1.1.9,2 2,2h14c1.1,0 2,-.9 2,-2zM8.5,13.5l2.5,3.01L14.5,12l4.5,6H5l3.5,-4.5z");
    }

    public final ImageVector getSun() {
        return v(LocalePreferences.FirstDayOfWeek.SUNDAY, "M12,7c-2.76,0-5,2.24-5,5s2.24,5 5,5 5,-2.24 5,-5-2.24,-5-5,-5zM2,13h2c.55,0 1,-.45 1,-1s-.45,-1-1,-1H2c-.55,0-1,.45-1,1s.45,1 1,1zm18,0h2c.55,0 1,-.45 1,-1s-.45,-1-1,-1h-2c-.55,0-1,.45-1,1s.45,1 1,1zM11,2v2c0,.55.45,1 1,1s1,-.45 1,-1V2c0,-.55-.45,-1-1,-1s-1,.45-1,1zm0,18v2c0,.55.45,1 1,1s1,-.45 1,-1v-2c0,-.55-.45,-1-1,-1s-1,.45-1,1z");
    }

    public final ImageVector getMoon() {
        return v("moon", "M12,3c-4.97,0-9,4.03-9,9s4.03,9 9,9 9,-4.03 9,-9c0,-.46-.04,-.92-.1,-1.36-.98,1.37-2.58,2.26-4.4,2.26-2.98,0-5.4,-2.42-5.4,-5.4 0,-1.81.89,-3.42 2.26,-4.4C12.92,3.04 12.46,3 12,3z");
    }

    public final ImageVector getGlobe() {
        return v("globe", "M12,2C6.48,2 2,6.48 2,12s4.48,10 10,10 10,-4.48 10,-10S17.52,2 12,2zm-1,17.93c-3.95,-.49-7,-3.85-7,-7.93 0,-.62.08,-1.21.21,-1.79L9,15v1c0,1.1.9,2 2,2v1.93zm6.9,-2.54c-.26,-.81-1,-1.39-1.9,-1.39h-1v-3c0,-.55-.45,-1-1,-1H8v-2h2c.55,0 1,-.45 1,-1V7h2c1.1,0 2,-.9 2,-2v-.41c2.93,1.19 5,4.06 5,7.41 0,2.08-.8,3.97-2.1,5.39z");
    }

    public final ImageVector getPerson() {
        return v("person", "M12,12c2.21,0 4,-1.79 4,-4s-1.79,-4-4,-4-4,1.79-4,4 1.79,4 4,4zm0,2c-2.67,0-8,1.34-8,4v2h16v-2c0,-2.66-5.33,-4-8,-4z");
    }

    public final ImageVector getCoffee() {
        return v("coffee", "M20,3H4v10c0,2.21 1.79,4 4,4h6c2.21,0 4,-1.79 4,-4v-3h2c1.11,0 2,-.89 2,-2V5c0,-1.11-.89,-2-2,-2zm0,5h-2V5h2v3zM4,19h16v2H4z");
    }

    public final ImageVector getSparkle() {
        return v("sparkle", "M19,9l1.25,-2.75L23,5l-2.75,-1.25L19,1l-1.25,2.75L15,5l2.75,1.25L19,9zm-7.5,.5L9,4 6.5,9.5 1,12l5.5,2.5L9,20l2.5,-5.5L17,12l-5.5,-2.5zM19,15l-1.25,2.75L15,19l2.75,1.25L19,23l1.25,-2.75L23,19l-2.75,-1.25L19,15z");
    }

    public final ImageVector getWifi() {
        return v("wifi", "M1,9l2,2c4.97,-4.97 13.03,-4.97 18,0l2,-2C16.93,2.93 7.08,2.93 1,9zm8,8l3,3 3,-3c-1.65,-1.66-4.34,-1.66-6,0zm-4,-4l2,2c2.76,-2.76 7.24,-2.76 10,0l2,-2C15.14,9.14 8.87,9.14 5,13z");
    }

    public final ImageVector getServer() {
        return v("server", "M20,13H4c-.55,0-1,.45-1,1v6c0,.55.45,1 1,1h16c.55,0 1,-.45 1,-1v-6c0,-.55-.45,-1-1,-1zM7,19c-1.1,0-2,-.9-2,-2s.9,-2 2,-2 2,.9 2,2-.9,2-2,2zM20,3H4c-.55,0-1,.45-1,1v6c0,.55.45,1 1,1h16c.55,0 1,-.45 1,-1V4c0,-.55-.45,-1-1,-1zM7,9c-1.1,0-2,-.9-2,-2s.9,-2 2,-2 2,.9 2,2-.9,2-2,2z");
    }

    public final ImageVector getClock() {
        return v("clock", "M11.99,2C6.47,2 2,6.48 2,12s4.47,10 9.99,10C17.52,22 22,17.52 22,12S17.52,2 11.99,2zM12,20c-4.42,0-8,-3.58-8,-8s3.58,-8 8,-8 8,3.58 8,8-3.58,8-8,8zm.5,-13H11v6l5.25,3.15 .75,-1.23-4.5,-2.67z");
    }

    public final ImageVector getHelp() {
        return v("help", "M12,2C6.48,2 2,6.48 2,12s4.48,10 10,10 10,-4.48 10,-10S17.52,2 12,2zm1,17h-2v-2h2v2zm2.07,-7.75l-.9,.92C13.45,12.9 13,13.5 13,15h-2v-.5c0,-1.1.45,-2.1 1.17,-2.83l1.24,-1.26c.37,-.36.59,-.86.59,-1.41 0,-1.1-.9,-2-2,-2s-2,.9-2,2H8c0,-2.21 1.79,-4 4,-4s4,1.79 4,4c0,.88-.36,1.68-.93,2.25z");
    }

    public final ImageVector getGear() {
        return v("gear", "M19.14,12.94c.04,-.3.06,-.61.06,-.94 0,-.32-.02,-.64-.07,-.94l2.03,-1.58c.18,-.14.23,-.41.12,-.61l-1.92,-3.32c-.12,-.22-.37,-.29-.59,-.22l-2.39,.96c-.5,-.38-1.03,-.7-1.62,-.94L14.4,2.81c-.04,-.24-.24,-.41-.48,-.41h-3.84c-.24,0-.43,.17-.47,.41L9.25,5.35C8.66,5.59 8.12,5.92 7.63,6.29L5.24,5.33c-.22,-.08-.47,0-.59,.22L2.74,8.87C2.62,9.08 2.66,9.34 2.86,9.48l2.03,1.58C4.84,11.36 4.8,11.69 4.8,12s.02,.64.07,.94l-2.03,1.58c-.18,.14-.23,.41-.12,.61l1.92,3.32c.12,.22.37,.29.59,.22l2.39,-.96c.5,.38 1.03,.7 1.62,.94l.36,2.54c.05,.24.24,.41.48,.41h3.84c.24,0 .44,-.17.47,-.41l.36,-2.54c.59,-.24 1.13,-.56 1.62,-.94l2.39,.96c.22,.08.47,0 .59,-.22l1.92,-3.32c.12,-.22.07,-.47-.12,-.61l-2.01,-1.58zM12,15.6c-1.98,0-3.6,-1.62-3.6,-3.6s1.62,-3.6 3.6,-3.6 3.6,1.62 3.6,3.6-1.62,3.6-3.6,3.6z");
    }

    public final ImageVector getMore() {
        return v("more", "M6,10c-1.1,0-2,.9-2,2s.9,2 2,2 2,-.9 2,-2-.9,-2-2,-2zm12,0c-1.1,0-2,.9-2,2s.9,2 2,2 2,-.9 2,-2-.9,-2-2,-2zm-6,0c-1.1,0-2,.9-2,2s.9,2 2,2 2,-.9 2,-2-.9,-2-2,-2z");
    }

    public final ImageVector getFolder() {
        return v("folder", "M10,4H4c-1.1,0-1.99,.9-1.99,2L2,18c0,1.1.9,2 2,2h16c1.1,0 2,-.9 2,-2V8c0,-1.1-.9,-2-2,-2h-8l-2,-2z");
    }

    public final ImageVector getAdd() {
        return v("add", "M19,13h-6v6h-2v-6H5v-2h6V5h2v6h6v2z");
    }

    public final ImageVector getClose() {
        return v("close", "M19,6.41L17.59,5 12,10.59 6.41,5 5,6.41 10.59,12 5,17.59 6.41,19 12,13.41 17.59,19 19,17.59 13.41,12z");
    }

    public final ImageVector getCheck() {
        return v("check", "M9,16.17L4.83,12l-1.42,1.41L9,19 21,7l-1.41,-1.41z");
    }

    public final ImageVector getRefresh() {
        return v("refresh", "M17.65,6.35C16.2,4.9 14.21,4 12,4c-4.42,0-7.99,3.58-7.99,8s3.57,8 7.99,8c3.73,0 6.84,-2.55 7.73,-6h-2.08c-.82,2.33-3.04,4-5.65,4-3.31,0-6,-2.69-6,-6s2.69,-6 6,-6c1.66,0 3.14,.69 4.22,1.78L13,11h7V4l-2.35,2.35z");
    }

    public final ImageVector getSearch() {
        return v("search", "M15.5,14h-.79l-.28,-.27C15.41,12.59 16,11.11 16,9.5 16,5.91 13.09,3 9.5,3S3,5.91 3,9.5 5.91,16 9.5,16c1.61,0 3.09,-.59 4.23,-1.57l.27,.28v.79l5,4.99L20.49,19l-4.99,-5zm-6,0C7.01,14 5,11.99 5,9.5S7.01,5 9.5,5 14,7.01 14,9.5 11.99,14 9.5,14z");
    }

    public final ImageVector getDelete() {
        return v("delete", "M6,19c0,1.1.9,2 2,2h8c1.1,0 2,-.9 2,-2V7H6v12zM19,4h-3.5l-1,-1h-5l-1,1H5v2h14V4z");
    }

    public final ImageVector getEdit() {
        return v("edit", "M3,17.25V21h3.75L17.81,9.94l-3.75,-3.75L3,17.25zM20.71,7.04c.39,-.39.39,-1.02 0,-1.41l-2.34,-2.34c-.39,-.39-1.02,-.39-1.41,0l-1.83,1.83 3.75,3.75 1.83,-1.83z");
    }

    public final ImageVector getStar() {
        return v("star", "M12,17.27L18.18,21l-1.64,-7.03L22,9.24l-7.19,-.61L12,2 9.19,8.63 2,9.24l5.46,4.73L5.82,21z");
    }

    public final ImageVector getStarOutline() {
        return v("starO", "M22,9.24l-7.19,-.62L12,2 9.19,8.63 2,9.24l5.46,4.73L5.82,21 12,17.27 18.18,21l-1.63,-7.03L22,9.24zM12,15.4l-3.76,2.27 1,-4.28 -3.32,-2.88 4.38,-.38L12,6.1l1.71,4.04 4.38,.38 -3.32,2.88 1,4.28L12,15.4z");
    }

    public final ImageVector getCopy() {
        return v("copy", "M16,1H4c-1.1,0-2,.9-2,2v14h2V3h12V1zm3,4H8c-1.1,0-2,.9-2,2v14c0,1.1.9,2 2,2h11c1.1,0 2,-.9 2,-2V7c0,-1.1-.9,-2-2,-2zm0,16H8V7h11v14z");
    }

    public final ImageVector getSend() {
        return v("send", "M2.01,21L23,12 2.01,3 2,10l15,2 -15,2z");
    }

    public final ImageVector getLink() {
        return v("link", "M3.9,12c0,-1.71 1.39,-3.1 3.1,-3.1h4V7H7c-2.76,0-5,2.24-5,5s2.24,5 5,5h4v-1.9H7c-1.71,0-3.1,-1.39-3.1,-3.1zM8,13h8v-2H8v2zm9,-6h-4v1.9h4c1.71,0 3.1,1.39 3.1,3.1s-1.39,3.1-3.1,3.1h-4V17h4c2.76,0 5,-2.24 5,-5s-2.24,-5-5,-5z");
    }

    public final ImageVector getChevronDown() {
        return v("chevD", "M16.59,8.59L12,13.17 7.41,8.59 6,10l6,6 6,-6z");
    }

    public final ImageVector getChevronRight() {
        return v("chevR", "M10,6L8.59,7.41 13.17,12l-4.58,4.59L10,18l6,-6z");
    }

    public final ImageVector getChevronLeft() {
        return v("chevL", "M15.41,7.41L14,6l-6,6 6,6 1.41,-1.41L10.83,12z");
    }

    public final ImageVector getMenu() {
        return v("menu", "M3,18h18v-2H3v2zm0,-5h18v-2H3v2zm0,-7v2h18V6H3z");
    }

    public final ImageVector getWarning() {
        return v("warn", "M1,21h22L12,2 1,21zm12,-3h-2v-2h2v2zm0,-4h-2v-4h2v4z");
    }

    public final ImageVector getInfo() {
        return v("info", "M12,2C6.48,2 2,6.48 2,12s4.48,10 10,10 10,-4.48 10,-10S17.52,2 12,2zm1,15h-2v-6h2v6zm0,-8h-2V7h2v2z");
    }

    public final ImageVector getPin() {
        return v("pin", "M16,12V4h1V2H7v2h1v8l-2,2v2h5.2v6h1.6v-6H18v-2l-2,-2z");
    }

    public final ImageVector getShield() {
        return v("shield", "M12,1L3,5v6c0,5.55 3.84,10.74 9,12 5.16,-1.26 9,-6.45 9,-12V5l-9,-4z");
    }

    public final ImageVector getUpload() {
        return v("upload", "M9,16h6v-6h4l-7,-7 -7,7h4zm-4,2h14v2H5z");
    }

    public final ImageVector getChat() {
        return v("chat", "M20,2H4c-1.1,0-1.99,.9-1.99,2L2,22l4,-4h14c1.1,0 2,-.9 2,-2V4c0,-1.1-.9,-2-2,-2zM6,9h12v2H6V9zm8,5H6v-2h8v2zm4,-6H6V6h12v2z");
    }

    public final ImageVector getUndo() {
        return v("undo", "M12.5,8c-2.65,0-5.05,.99-6.9,2.6L2,7v9h9l-3.62,-3.62c1.39,-1.16 3.16,-1.88 5.12,-1.88 3.54,0 6.55,2.31 7.6,5.5l2.37,-.78C21.08,11.03 17.15,8 12.5,8z");
    }

    public final ImageVector getGrip() {
        return v("grip", "M11,18c0,1.1-.9,2-2,2s-2,-.9-2,-2 .9,-2 2,-2 2,.9 2,2zm-2,-8c-1.1,0-2,.9-2,2s.9,2 2,2 2,-.9 2,-2-.9,-2-2,-2zm0,-6c-1.1,0-2,.9-2,2s.9,2 2,2 2,-.9 2,-2-.9,-2-2,-2zm6,4c1.1,0 2,-.9 2,-2s-.9,-2-2,-2-2,.9-2,2 .9,2 2,2zm0,2c-1.1,0-2,.9-2,2s.9,2 2,2 2,-.9 2,-2-.9,-2-2,-2zm0,6c-1.1,0-2,.9-2,2s.9,2 2,2 2,-.9 2,-2-.9,-2-2,-2z");
    }
}
