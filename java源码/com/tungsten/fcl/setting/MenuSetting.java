package com.tungsten.fcl.setting;

import org.lwjgl.util.freetype.FreeType;

/* loaded from: classes3.dex */
public class MenuSetting {
    private boolean forceResolution;
    private int forceResolutionWidth = 1920;
    private int forceResolutionHeight = FreeType.TT_MS_LANGID_FAEROESE_FAEROE_ISLANDS;

    public boolean isForceResolution() {
        return this.forceResolution;
    }

    public void setForceResolution(boolean v) {
        this.forceResolution = v;
    }

    public int getForceResolutionWidth() {
        return this.forceResolutionWidth;
    }

    public void setForceResolutionWidth(int v) {
        this.forceResolutionWidth = v;
    }

    public int getForceResolutionHeight() {
        return this.forceResolutionHeight;
    }

    public void setForceResolutionHeight(int v) {
        this.forceResolutionHeight = v;
    }
}
