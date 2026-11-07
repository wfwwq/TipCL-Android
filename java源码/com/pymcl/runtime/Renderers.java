package com.pymcl.runtime;

import com.mio.data.Renderer;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.lwjgl.opengl.GL11;

/* compiled from: Renderers.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/pymcl/runtime/Renderers;", "", "<init>", "()V", "GL4ES", "Lcom/mio/data/Renderer;", "getGL4ES", "()Lcom/mio/data/Renderer;", "NG_GL4ES", "getNG_GL4ES", "ZINK", "getZINK", "ALL", "", "getALL", "()Ljava/util/List;", "byId", "id", "", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Renderers {
    public static final Renderers INSTANCE = new Renderers();
    private static final Renderer GL4ES = new Renderer("Holy-GL4ES", "", "libgl4es_114.so", "libEGL.so", "", null, null, Renderer.ID_GL4ES, "", "1.21.4", null, null, null, GL11.GL_RENDER, null);
    private static final Renderer NG_GL4ES = new Renderer("NG-GL4ES", "", "libng_gl4es.so", "libEGL.so", "", null, null, Renderer.ID_NGGL4ES, null, null, null, null, null, 7936, null);
    private static final Renderer ZINK = new Renderer("Zink", "", "libglxshim.so", "libEGL_mesa.so", "", null, null, Renderer.ID_ZINK, null, null, null, null, null, 7936, null);
    private static final List<Renderer> ALL = CollectionsKt.listOf((Object[]) new Renderer[]{GL4ES, NG_GL4ES, ZINK});

    private Renderers() {
    }

    public final Renderer getGL4ES() {
        return GL4ES;
    }

    public final Renderer getNG_GL4ES() {
        return NG_GL4ES;
    }

    public final Renderer getZINK() {
        return ZINK;
    }

    public final List<Renderer> getALL() {
        return ALL;
    }

    public final Renderer byId(String id) {
        Object element$iv;
        Intrinsics.checkNotNullParameter(id, "id");
        Iterable $this$firstOrNull$iv = ALL;
        Iterator it = $this$firstOrNull$iv.iterator();
        while (true) {
            if (it.hasNext()) {
                element$iv = it.next();
                Renderer it2 = (Renderer) element$iv;
                if (Intrinsics.areEqual(it2.getId(), id)) {
                    break;
                }
            } else {
                element$iv = null;
                break;
            }
        }
        Renderer renderer = (Renderer) element$iv;
        return renderer == null ? GL4ES : renderer;
    }
}
