package com.mio.data;

import androidx.autofill.HintConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Renderer.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u0000 92\u00020\u0001:\u00019B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\"\u001a\u00020\u0003J\u0006\u0010#\u001a\u00020\u0003J\u000e\u0010$\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\u0003J\u0014\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004J\n\u0010(\u001a\u00020)H\u0096\u0080\u0004J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\u009b\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003HÆ\u0001J\n\u00108\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014¨\u0006:"}, d2 = {"Lcom/mio/data/Renderer;", "", HintConstants.AUTOFILL_HINT_NAME, "", "des", "glName", "eglName", "path", "boatEnv", "", "pojavEnv", "id", "minMCver", "maxMCver", "pojavRendererId", "source", "displayMaxMCver", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getDes", "getGlName", "getEglName", "getPath", "getBoatEnv", "()Ljava/util/List;", "getPojavEnv", "getId", "getMinMCver", "getMaxMCver", "getPojavRendererId", "getSource", "getDisplayMaxMCver", "getGLPath", "getEGLPath", "isEqual", "", "equals", "other", "hashCode", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "toString", "Companion", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Renderer {
    public static final String ID_FREEDRENO = "8d427e6c-9d22-2d19-db0c-3b9ac2c1543f";
    public static final String ID_GL4ES = "f7e985d8-6d4c-f63c-d9f1-06074dab823a";
    public static final String ID_NGGL4ES = "e7b90ed6-e518-4d4e-93dc-5c7133cd5b31";
    public static final String ID_VGPU = "0fb718e4-64e3-83d4-a974-8204ea1d9f9f";
    public static final String ID_VIRGL = "417a7a93-d9b4-98b9-ec6e-1ea400259c1f";
    public static final String ID_ZINK = "18d93f17-ff53-a319-fa61-58709a77bf87";
    private final List<String> boatEnv;
    private final String des;
    private final String displayMaxMCver;
    private final String eglName;
    private final String glName;
    private final String id;
    private final String maxMCver;
    private final String minMCver;
    private final String name;
    private final String path;
    private final List<String> pojavEnv;
    private final String pojavRendererId;
    private final String source;

    public static /* synthetic */ Renderer copy$default(Renderer renderer, String str, String str2, String str3, String str4, String str5, List list, List list2, String str6, String str7, String str8, String str9, String str10, String str11, int i, Object obj) {
        if ((i & 1) != 0) {
            str = renderer.name;
        }
        return renderer.copy(str, (i & 2) != 0 ? renderer.des : str2, (i & 4) != 0 ? renderer.glName : str3, (i & 8) != 0 ? renderer.eglName : str4, (i & 16) != 0 ? renderer.path : str5, (i & 32) != 0 ? renderer.boatEnv : list, (i & 64) != 0 ? renderer.pojavEnv : list2, (i & 128) != 0 ? renderer.id : str6, (i & 256) != 0 ? renderer.minMCver : str7, (i & 512) != 0 ? renderer.maxMCver : str8, (i & 1024) != 0 ? renderer.pojavRendererId : str9, (i & 2048) != 0 ? renderer.source : str10, (i & 4096) != 0 ? renderer.displayMaxMCver : str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component10, reason: from getter */
    public final String getMaxMCver() {
        return this.maxMCver;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPojavRendererId() {
        return this.pojavRendererId;
    }

    /* renamed from: component12, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component13, reason: from getter */
    public final String getDisplayMaxMCver() {
        return this.displayMaxMCver;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDes() {
        return this.des;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGlName() {
        return this.glName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEglName() {
        return this.eglName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final List<String> component6() {
        return this.boatEnv;
    }

    public final List<String> component7() {
        return this.pojavEnv;
    }

    /* renamed from: component8, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component9, reason: from getter */
    public final String getMinMCver() {
        return this.minMCver;
    }

    public final Renderer copy(String name, String des, String glName, String eglName, String path, List<String> boatEnv, List<String> pojavEnv, String id, String minMCver, String maxMCver, String pojavRendererId, String source, String displayMaxMCver) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(des, "des");
        Intrinsics.checkNotNullParameter(glName, "glName");
        Intrinsics.checkNotNullParameter(eglName, "eglName");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(minMCver, "minMCver");
        Intrinsics.checkNotNullParameter(maxMCver, "maxMCver");
        Intrinsics.checkNotNullParameter(pojavRendererId, "pojavRendererId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(displayMaxMCver, "displayMaxMCver");
        return new Renderer(name, des, glName, eglName, path, boatEnv, pojavEnv, id, minMCver, maxMCver, pojavRendererId, source, displayMaxMCver);
    }

    public String toString() {
        return "Renderer(name=" + this.name + ", des=" + this.des + ", glName=" + this.glName + ", eglName=" + this.eglName + ", path=" + this.path + ", boatEnv=" + this.boatEnv + ", pojavEnv=" + this.pojavEnv + ", id=" + this.id + ", minMCver=" + this.minMCver + ", maxMCver=" + this.maxMCver + ", pojavRendererId=" + this.pojavRendererId + ", source=" + this.source + ", displayMaxMCver=" + this.displayMaxMCver + ")";
    }

    public Renderer(String name, String des, String glName, String eglName, String path, List<String> list, List<String> list2, String id, String minMCver, String maxMCver, String pojavRendererId, String source, String displayMaxMCver) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(des, "des");
        Intrinsics.checkNotNullParameter(glName, "glName");
        Intrinsics.checkNotNullParameter(eglName, "eglName");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(minMCver, "minMCver");
        Intrinsics.checkNotNullParameter(maxMCver, "maxMCver");
        Intrinsics.checkNotNullParameter(pojavRendererId, "pojavRendererId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(displayMaxMCver, "displayMaxMCver");
        this.name = name;
        this.des = des;
        this.glName = glName;
        this.eglName = eglName;
        this.path = path;
        this.boatEnv = list;
        this.pojavEnv = list2;
        this.id = id;
        this.minMCver = minMCver;
        this.maxMCver = maxMCver;
        this.pojavRendererId = pojavRendererId;
        this.source = source;
        this.displayMaxMCver = displayMaxMCver;
    }

    public /* synthetic */ Renderer(String str, String str2, String str3, String str4, String str5, List list, List list2, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, list, list2, str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11);
    }

    public final String getName() {
        return this.name;
    }

    public final String getDes() {
        return this.des;
    }

    public final String getGlName() {
        return this.glName;
    }

    public final String getEglName() {
        return this.eglName;
    }

    public final String getPath() {
        return this.path;
    }

    public final List<String> getBoatEnv() {
        return this.boatEnv;
    }

    public final List<String> getPojavEnv() {
        return this.pojavEnv;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMinMCver() {
        return this.minMCver;
    }

    public final String getMaxMCver() {
        return this.maxMCver;
    }

    public final String getPojavRendererId() {
        return this.pojavRendererId;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getDisplayMaxMCver() {
        return this.displayMaxMCver;
    }

    public final String getGLPath() {
        if (this.path.length() == 0) {
            return this.glName;
        }
        return this.path + "/" + this.glName;
    }

    public final String getEGLPath() {
        if (this.path.length() == 0) {
            return this.eglName;
        }
        return this.path + "/" + this.eglName;
    }

    public final boolean isEqual(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return Intrinsics.areEqual(this.id, id);
    }

    public boolean equals(Object other) {
        if (other instanceof Renderer) {
            return Intrinsics.areEqual(this.id, ((Renderer) other).id);
        }
        return false;
    }

    public int hashCode() {
        return this.id.hashCode();
    }
}
