package top.fifthlight.touchcontroller.proxy.client.android.transport;

import android.net.LocalServerSocket;
import android.net.LocalSocket;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import top.fifthlight.touchcontroller.proxy.client.MessageTransport;

/* compiled from: UnixSocketTransport.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Ltop/fifthlight/touchcontroller/proxy/client/android/transport/UnixSocketTransport;", "Ltop/fifthlight/touchcontroller/proxy/client/MessageTransport;", "serverSocket", "Landroid/net/LocalServerSocket;", "<init>", "(Landroid/net/LocalServerSocket;)V", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "clientSocket", "Landroid/net/LocalSocket;", "clientLock", "Ljava/util/concurrent/locks/ReentrantLock;", "acceptClientSocket", "close", "", "send", "buffer", "Ljava/nio/ByteBuffer;", "receive", "", "proxy-client-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes24.dex */
final class UnixSocketTransport implements MessageTransport {
    private final ReentrantLock clientLock;
    private LocalSocket clientSocket;
    private final AtomicBoolean closed;
    private final LocalServerSocket serverSocket;

    public UnixSocketTransport(LocalServerSocket serverSocket) {
        Intrinsics.checkNotNullParameter(serverSocket, "serverSocket");
        this.serverSocket = serverSocket;
        this.closed = new AtomicBoolean(false);
        this.clientLock = new ReentrantLock();
    }

    private final LocalSocket acceptClientSocket() {
        ReentrantLock reentrantLock = this.clientLock;
        reentrantLock.lock();
        try {
            LocalSocket localSocket = this.clientSocket;
            if (localSocket == null) {
                UnixSocketTransport $this$acceptClientSocket_u24lambda_u242_u24lambda_u241 = this;
                LocalSocket $this$acceptClientSocket_u24lambda_u242_u24lambda_u241_u24lambda_u240 = $this$acceptClientSocket_u24lambda_u242_u24lambda_u241.serverSocket.accept();
                $this$acceptClientSocket_u24lambda_u242_u24lambda_u241.clientSocket = $this$acceptClientSocket_u24lambda_u242_u24lambda_u241_u24lambda_u240;
                localSocket = $this$acceptClientSocket_u24lambda_u242_u24lambda_u241_u24lambda_u240;
            }
            reentrantLock.unlock();
            Intrinsics.checkNotNullExpressionValue(localSocket, "withLock(...)");
            return localSocket;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed.compareAndSet(false, true)) {
            LocalSocket localSocket = this.clientSocket;
            if (localSocket != null) {
                localSocket.close();
            }
            this.serverSocket.close();
        }
    }

    @Override // top.fifthlight.touchcontroller.proxy.client.MessageTransport
    public void send(ByteBuffer buffer) throws IOException {
        OutputStream stream;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        while (true) {
            try {
                LocalSocket client = acceptClientSocket();
                try {
                    stream = client.getOutputStream();
                    break;
                } catch (IOException ex) {
                    Log.w("UnixSocketTransport", "Send message failed: ", ex);
                    try {
                        LocalSocket localSocket = this.clientSocket;
                        if (localSocket != null) {
                            localSocket.close();
                        }
                    } catch (IOException e) {
                    }
                    this.clientSocket = null;
                }
            } catch (IOException e2) {
                return;
            }
        }
        if (buffer.remaining() > 255) {
            throw new IOException("Message too big: " + buffer.remaining());
        }
        if (!buffer.hasRemaining()) {
            throw new IllegalArgumentException("Empty message");
        }
        stream.write(buffer.remaining());
        if (buffer.hasArray() && !buffer.isReadOnly()) {
            stream.write(buffer.array(), buffer.position() + buffer.arrayOffset(), buffer.remaining());
            buffer.position(buffer.position() + buffer.remaining());
        } else {
            byte[] array = new byte[buffer.remaining()];
            buffer.get(array);
            stream.write(array);
        }
    }

    @Override // top.fifthlight.touchcontroller.proxy.client.MessageTransport
    public boolean receive(ByteBuffer buffer) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        while (true) {
            try {
                LocalSocket client = acceptClientSocket();
                try {
                    InputStream stream = client.getInputStream();
                    int length = stream.read();
                    if (length == -1) {
                        client.close();
                    } else if (length == 0) {
                        Log.d("UnixSocketTransport", "Ignore empty packet");
                    } else {
                        if (buffer.remaining() < length) {
                            throw new IllegalArgumentException("Buffer overflow: packet length is " + length + ", but the buffer only have " + buffer.remaining());
                        }
                        if (buffer.hasArray()) {
                            byte[] array = buffer.array();
                            int readLen = 0;
                            while (readLen < length) {
                                int len = stream.read(array, buffer.arrayOffset() + buffer.position() + readLen, length - readLen);
                                if (len == -1) {
                                    client.close();
                                } else {
                                    readLen += len;
                                }
                            }
                            buffer.position(buffer.position() + readLen);
                            return true;
                        }
                        byte[] dataBuffer = new byte[length];
                        int readLen2 = 0;
                        while (readLen2 < length) {
                            int len2 = stream.read(dataBuffer, readLen2, length - readLen2);
                            if (len2 == -1) {
                                client.close();
                            } else {
                                readLen2 += len2;
                            }
                        }
                        buffer.put(dataBuffer);
                        return true;
                    }
                } catch (IOException ex) {
                    Log.w("UnixSocketTransport", "Send message failed: ", ex);
                    try {
                        LocalSocket localSocket = this.clientSocket;
                        if (localSocket != null) {
                            localSocket.close();
                        }
                    } catch (IOException e) {
                    }
                    this.clientSocket = null;
                }
            } catch (IOException e2) {
                return false;
            }
        }
    }
}
