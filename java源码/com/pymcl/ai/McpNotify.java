package com.pymcl.ai;

import com.pymcl.core.util.JsonKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: McpNotify.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u0004\u0018\u00010\n2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\u0002`\rJ \u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\fj\u0002`\r2\u0006\u0010\u000f\u001a\u00020\u0010J$\u0010\u0011\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\fj\u0004\u0018\u0001`\rJ$\u0010\u0014\u001a\u00020\u00122\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\fj\u0004\u0018\u0001`\rJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/pymcl/ai/McpNotify;", "", "<init>", "()V", "TOOLS_CHANGED", "", "RESOURCES_CHANGED", "PROMPTS_CHANGED", "RESOURCE_UPDATED", "classify", "Lcom/pymcl/ai/McpNotify$Msg;", "o", "", "Lcom/pymcl/core/util/JObj;", "replyFor", "r", "Lcom/pymcl/ai/McpNotify$Msg$Request;", "wantsListener", "", "caps", "canSubscribe", "MAX_LISTENER_FAILS", "", "backoffMs", "", "fails", "Msg", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class McpNotify {
    public static final McpNotify INSTANCE = new McpNotify();
    public static final int MAX_LISTENER_FAILS = 3;
    public static final String PROMPTS_CHANGED = "notifications/prompts/list_changed";
    public static final String RESOURCES_CHANGED = "notifications/resources/list_changed";
    public static final String RESOURCE_UPDATED = "notifications/resources/updated";
    public static final String TOOLS_CHANGED = "notifications/tools/list_changed";

    private McpNotify() {
    }

    /* compiled from: McpNotify.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/pymcl/ai/McpNotify$Msg;", "", "<init>", "()V", "Response", "Notification", "Request", "Lcom/pymcl/ai/McpNotify$Msg$Notification;", "Lcom/pymcl/ai/McpNotify$Msg$Request;", "Lcom/pymcl/ai/McpNotify$Msg$Response;", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static abstract class Msg {
        public /* synthetic */ Msg(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: McpNotify.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0002`\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u001b\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0002`\bHÆ\u0003J6\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u001a\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0002`\bHÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0006HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/pymcl/ai/McpNotify$Msg$Response;", "Lcom/pymcl/ai/McpNotify$Msg;", "id", "", "obj", "", "", "", "Lcom/pymcl/core/util/JObj;", "<init>", "(Ljava/lang/Long;Ljava/util/Map;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getObj", "()Ljava/util/Map;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/util/Map;)Lcom/pymcl/ai/McpNotify$Msg$Response;", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Response extends Msg {
            private final Long id;
            private final Map<String, Object> obj;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Response copy$default(Response response, Long l, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    l = response.id;
                }
                if ((i & 2) != 0) {
                    map = response.obj;
                }
                return response.copy(l, map);
            }

            /* renamed from: component1, reason: from getter */
            public final Long getId() {
                return this.id;
            }

            public final Map<String, Object> component2() {
                return this.obj;
            }

            public final Response copy(Long id, Map<String, Object> obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return new Response(id, obj);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Response)) {
                    return false;
                }
                Response response = (Response) other;
                return Intrinsics.areEqual(this.id, response.id) && Intrinsics.areEqual(this.obj, response.obj);
            }

            public int hashCode() {
                return ((this.id == null ? 0 : this.id.hashCode()) * 31) + this.obj.hashCode();
            }

            public String toString() {
                return "Response(id=" + this.id + ", obj=" + this.obj + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Response(Long id, Map<String, Object> obj) {
                super(null);
                Intrinsics.checkNotNullParameter(obj, "obj");
                this.id = id;
                this.obj = obj;
            }

            public final Long getId() {
                return this.id;
            }

            public final Map<String, Object> getObj() {
                return this.obj;
            }
        }

        private Msg() {
        }

        /* compiled from: McpNotify.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007HÆ\u0003J3\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u001e\b\u0002\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/pymcl/ai/McpNotify$Msg$Notification;", "Lcom/pymcl/ai/McpNotify$Msg;", "method", "", "params", "", "", "Lcom/pymcl/core/util/JObj;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getMethod", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Notification extends Msg {
            private final String method;
            private final Map<String, Object> params;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Notification copy$default(Notification notification, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = notification.method;
                }
                if ((i & 2) != 0) {
                    map = notification.params;
                }
                return notification.copy(str, map);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMethod() {
                return this.method;
            }

            public final Map<String, Object> component2() {
                return this.params;
            }

            public final Notification copy(String method, Map<String, Object> params) {
                Intrinsics.checkNotNullParameter(method, "method");
                return new Notification(method, params);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Notification)) {
                    return false;
                }
                Notification notification = (Notification) other;
                return Intrinsics.areEqual(this.method, notification.method) && Intrinsics.areEqual(this.params, notification.params);
            }

            public int hashCode() {
                return (this.method.hashCode() * 31) + (this.params == null ? 0 : this.params.hashCode());
            }

            public String toString() {
                return "Notification(method=" + this.method + ", params=" + this.params + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Notification(String method, Map<String, Object> map) {
                super(null);
                Intrinsics.checkNotNullParameter(method, "method");
                this.method = method;
                this.params = map;
            }

            public final String getMethod() {
                return this.method;
            }

            public final Map<String, Object> getParams() {
                return this.params;
            }
        }

        /* compiled from: McpNotify.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0003J=\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007j\u0004\u0018\u0001`\bHÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR'\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/pymcl/ai/McpNotify$Msg$Request;", "Lcom/pymcl/ai/McpNotify$Msg;", "id", "", "method", "", "params", "", "Lcom/pymcl/core/util/JObj;", "<init>", "(Ljava/lang/Object;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/Object;", "getMethod", "()Ljava/lang/String;", "getParams", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:ai"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Request extends Msg {
            private final Object id;
            private final String method;
            private final Map<String, Object> params;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Request copy$default(Request request, Object obj, String str, Map map, int i, Object obj2) {
                if ((i & 1) != 0) {
                    obj = request.id;
                }
                if ((i & 2) != 0) {
                    str = request.method;
                }
                if ((i & 4) != 0) {
                    map = request.params;
                }
                return request.copy(obj, str, map);
            }

            /* renamed from: component1, reason: from getter */
            public final Object getId() {
                return this.id;
            }

            /* renamed from: component2, reason: from getter */
            public final String getMethod() {
                return this.method;
            }

            public final Map<String, Object> component3() {
                return this.params;
            }

            public final Request copy(Object id, String method, Map<String, Object> params) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(method, "method");
                return new Request(id, method, params);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Request)) {
                    return false;
                }
                Request request = (Request) other;
                return Intrinsics.areEqual(this.id, request.id) && Intrinsics.areEqual(this.method, request.method) && Intrinsics.areEqual(this.params, request.params);
            }

            public int hashCode() {
                return (((this.id.hashCode() * 31) + this.method.hashCode()) * 31) + (this.params == null ? 0 : this.params.hashCode());
            }

            public String toString() {
                return "Request(id=" + this.id + ", method=" + this.method + ", params=" + this.params + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Request(Object id, String method, Map<String, Object> map) {
                super(null);
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(method, "method");
                this.id = id;
                this.method = method;
                this.params = map;
            }

            public final Object getId() {
                return this.id;
            }

            public final String getMethod() {
                return this.method;
            }

            public final Map<String, Object> getParams() {
                return this.params;
            }
        }
    }

    public final Msg classify(Map<String, Object> o) {
        Intrinsics.checkNotNullParameter(o, "o");
        String method = JsonKt.str(o, "method");
        Object id = o.get("id");
        if (method != null && id == null) {
            return new Msg.Notification(method, JsonKt.obj(o, "params"));
        }
        if (method != null) {
            Intrinsics.checkNotNull(id);
            return new Msg.Request(id, method, JsonKt.obj(o, "params"));
        }
        if (o.containsKey("result") || o.containsKey("error")) {
            return new Msg.Response(JsonKt.m8043long(o, "id"), o);
        }
        return null;
    }

    public final Map<String, Object> replyFor(Msg.Request r) {
        Intrinsics.checkNotNullParameter(r, "r");
        return Intrinsics.areEqual(r.getMethod(), "ping") ? JsonKt.jobj(TuplesKt.to("jsonrpc", "2.0"), TuplesKt.to("id", r.getId()), TuplesKt.to("result", JsonKt.jobj(new Pair[0]))) : JsonKt.jobj(TuplesKt.to("jsonrpc", "2.0"), TuplesKt.to("id", r.getId()), TuplesKt.to("error", JsonKt.jobj(TuplesKt.to("code", -32601L), TuplesKt.to("message", "Method not found: " + r.getMethod()))));
    }

    public final boolean wantsListener(Map<String, Object> caps) {
        if (caps == null) {
            return false;
        }
        return Intrinsics.areEqual((Object) JsonKt.bool(JsonKt.obj(caps, "tools"), "listChanged"), (Object) true) || Intrinsics.areEqual((Object) JsonKt.bool(JsonKt.obj(caps, "resources"), "listChanged"), (Object) true) || Intrinsics.areEqual((Object) JsonKt.bool(JsonKt.obj(caps, "prompts"), "listChanged"), (Object) true) || Intrinsics.areEqual((Object) JsonKt.bool(JsonKt.obj(caps, "resources"), "subscribe"), (Object) true);
    }

    public final boolean canSubscribe(Map<String, Object> caps) {
        return Intrinsics.areEqual((Object) JsonKt.bool(caps != null ? JsonKt.obj(caps, "resources") : null, "subscribe"), (Object) true);
    }

    public final long backoffMs(int fails) {
        return RangesKt.coerceAtMost(1000 << RangesKt.coerceIn(fails - 1, 0, 5), 30000L);
    }
}
