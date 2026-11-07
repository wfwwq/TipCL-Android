package com.pymcl.multiplayer;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: Terracotta.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦@¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH¦@¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u0010H¦@¢\u0006\u0002\u0010\u0011R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/pymcl/multiplayer/MultiplayerService;", "", "available", "", "getAvailable", "()Z", "host", "Lcom/pymcl/multiplayer/RoomState;", "port", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "join", "inviteCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "leave", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface MultiplayerService {
    boolean getAvailable();

    Object host(int i, Continuation<? super RoomState> continuation);

    Object join(String str, Continuation<? super RoomState> continuation);

    Object leave(Continuation<? super Unit> continuation);
}
