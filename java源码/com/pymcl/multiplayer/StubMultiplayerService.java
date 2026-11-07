package com.pymcl.multiplayer;

import com.pymcl.multiplayer.RoomState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: Terracotta.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/pymcl/multiplayer/StubMultiplayerService;", "Lcom/pymcl/multiplayer/MultiplayerService;", "<init>", "()V", "available", "", "getAvailable", "()Z", "host", "Lcom/pymcl/multiplayer/RoomState;", "port", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "join", "inviteCode", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "leave", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PyMCL-Android:multiplayer_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StubMultiplayerService implements MultiplayerService {
    private final boolean available;

    @Override // com.pymcl.multiplayer.MultiplayerService
    public boolean getAvailable() {
        return this.available;
    }

    @Override // com.pymcl.multiplayer.MultiplayerService
    public Object host(int port, Continuation<? super RoomState> continuation) {
        return new RoomState.Failed("Terracotta 尚未接入");
    }

    @Override // com.pymcl.multiplayer.MultiplayerService
    public Object join(String inviteCode, Continuation<? super RoomState> continuation) {
        return new RoomState.Failed("Terracotta 尚未接入");
    }

    @Override // com.pymcl.multiplayer.MultiplayerService
    public Object leave(Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
