package com.pymcl.core.instance;

import androidx.autofill.HintConstants;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.commons.io.IOUtils;

/* compiled from: Playtime.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\t"}, d2 = {"Lcom/pymcl/core/instance/Nbt;", "", "<init>", "()V", "serversDat", "", "l", "", "Lcom/pymcl/core/instance/ServerEntry;", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Nbt {
    public static final Nbt INSTANCE = new Nbt();

    private Nbt() {
    }

    public final byte[] serversDat(List<ServerEntry> l) throws IOException {
        Intrinsics.checkNotNullParameter(l, "l");
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        DataOutputStream o = new DataOutputStream(bo);
        o.writeByte(10);
        serversDat$name(o, "");
        o.writeByte(9);
        serversDat$name(o, "servers");
        o.writeByte(10);
        o.writeInt(l.size());
        for (ServerEntry s : l) {
            serversDat$str(o, HintConstants.AUTOFILL_HINT_NAME, s.getName());
            serversDat$str(o, "ip", s.getAddress());
            if ((s.getIcon().length() > 0) && !StringsKt.contains$default((CharSequence) s.getIcon(), IOUtils.DIR_SEPARATOR_UNIX, false, 2, (Object) null)) {
                serversDat$str(o, "icon", s.getIcon());
            }
            o.writeByte(0);
        }
        o.writeByte(0);
        o.flush();
        byte[] byteArray = bo.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    private static final void serversDat$name(DataOutputStream o, String n) throws IOException {
        byte[] b = n.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(b, "getBytes(...)");
        o.writeShort(b.length);
        o.write(b);
    }

    private static final void serversDat$str(DataOutputStream o, String k, String v) throws IOException {
        o.writeByte(8);
        serversDat$name(o, k);
        serversDat$name(o, v);
    }
}
