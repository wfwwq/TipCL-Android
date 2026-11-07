package net.burningtnt.terracotta;

import android.content.Context;
import android.net.VpnService;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.io.IOUtils;

/* loaded from: classes7.dex */
public final class TerracottaAndroidAPI {
    private static final long FD_PENDING = 2147483648L;
    private static final long FD_REJECT = 2147483649L;
    private static volatile VpnServiceRequest pendingRequest;
    private static volatile RuntimeContext runtimeContext;

    public enum RoomType {
        TERRACOTTA_LEGACY,
        PCL2CE,
        SCAFFOLDING
    }

    public interface VpnServiceCallback {
        void onStartVpnService();
    }

    public interface VpnServiceRequest {
        void reject();

        ParcelFileDescriptor startVpnService(VpnService.Builder builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void finishExportLogs0(long j);

    private static native String getMetadata0();

    private static native String getState0();

    private static native void panic0();

    private static native long prepareExportLogs0();

    private static native boolean setGuesting0(String str, String str2, String str3);

    private static native void setScanning0(String str, String str2, String str3);

    private static native void setWaiting0();

    private static native int start0(String str, int i);

    private static native int verifyRoomCode0(String str);

    public static final class Metadata {
        private final String easyTierVersion;
        private final long terracottaCompileTime;
        private final String terracottaVersion;

        public Metadata(String terracottaVersion, long terracottaCompileTime, String easyTierVersion) {
            this.terracottaVersion = terracottaVersion;
            this.terracottaCompileTime = terracottaCompileTime;
            this.easyTierVersion = easyTierVersion;
        }

        public String getTerracottaVersion() {
            return this.terracottaVersion;
        }

        public long getTerracottaCompileTime() {
            return this.terracottaCompileTime;
        }

        public String getEasyTierVersion() {
            return this.easyTierVersion;
        }
    }

    static {
        System.setProperty("net.burningtnt.terracotta.native_location", TerracottaAndroidAPI.class.getName().replace('.', IOUtils.DIR_SEPARATOR_UNIX));
        System.loadLibrary("terracotta");
        pendingRequest = null;
        runtimeContext = null;
    }

    private static final class RuntimeContext {
        private final RandomAccessFile logging;
        private final VpnServiceCallback vpnServiceCallback;

        public RuntimeContext(VpnServiceCallback vpnServiceCallback, RandomAccessFile logging) {
            this.vpnServiceCallback = vpnServiceCallback;
            this.logging = logging;
        }
    }

    public static VpnServiceRequest getPendingVpnServiceRequest() {
        VpnServiceRequest handle = pendingRequest;
        if (handle == null) {
            throw new IllegalStateException("There's no pending VpnService request.");
        }
        return handle;
    }

    public static synchronized Metadata initialize(Context context, VpnServiceCallback callback) {
        String[] parts;
        Objects.requireNonNull(context, "context");
        Objects.requireNonNull(callback, "callback");
        if (runtimeContext != null) {
            throw new IllegalStateException("Terracotta Android has already started.");
        }
        File root = new File(context.getFilesDir(), "net.burningtnt.terracotta");
        File base = new File(root, "rs");
        base.mkdirs();
        if (!base.isDirectory()) {
            throw new RuntimeException("Cannot create net.burningtnt.terracotta/rs directory.");
        }
        try {
            RandomAccessFile logging = new RandomAccessFile(new File(root, "application.log"), "rw");
            int fd = ParcelFileDescriptor.dup(logging.getFD()).detachFd();
            int code = start0(base.getAbsolutePath(), fd);
            if (code != 0) {
                throw new RuntimeException("Cannot start Terracotta Android: " + code);
            }
            runtimeContext = new RuntimeContext(callback, logging);
            parts = getMetadata0().split("\u0000", 4);
            if (parts.length != 3) {
                throw new AssertionError("Should NOT be here.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Metadata(parts[0], Long.parseLong(parts[1]), parts[2]);
    }

    public static String getState() {
        assertStarted();
        return getState0();
    }

    public static void setWaiting() {
        assertStarted();
        setWaiting0();
    }

    public static void setScanning(String room, String player, List<String> extraNodes) {
        assertStarted();
        setScanning0(room, player, extraNodes == null ? null : String.join("\u0000", extraNodes));
    }

    public static boolean setGuesting(String room, String player, List<String> extraNodes) {
        Objects.requireNonNull(room, "room");
        assertStarted();
        return setGuesting0(room, player, extraNodes == null ? null : String.join("\u0000", extraNodes));
    }

    public static RoomType parseRoomCode(String room) {
        Objects.requireNonNull(room, "room");
        assertStarted();
        switch (verifyRoomCode0(room)) {
            case -1:
                return null;
            case 0:
            default:
                throw new AssertionError("Should NOT be here.");
            case 1:
                return RoomType.TERRACOTTA_LEGACY;
            case 2:
                return RoomType.PCL2CE;
            case 3:
                return RoomType.SCAFFOLDING;
        }
    }

    public static Reader collectLogs() throws IOException {
        assertStarted();
        final long ptr = prepareExportLogs0();
        if (ptr == 0) {
            throw new RuntimeException("Cannot export logs from Terracotta Android.");
        }
        final RandomAccessFile file = runtimeContext.logging;
        file.seek(0L);
        return new BufferedReader(new InputStreamReader(new InputStream() { // from class: net.burningtnt.terracotta.TerracottaAndroidAPI.1
            private final AtomicBoolean closed = new AtomicBoolean(false);

            @Override // java.io.InputStream
            public int read() throws IOException {
                assertOpen();
                return file.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] b) throws IOException {
                assertOpen();
                return file.read(b);
            }

            @Override // java.io.InputStream
            public int read(byte[] b, int off, int len) throws IOException {
                assertOpen();
                return file.read(b, off, len);
            }

            @Override // java.io.InputStream
            public int available() throws IOException {
                assertOpen();
                return Math.toIntExact(file.length() - file.getFilePointer());
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                super.close();
                cleanup();
            }

            protected void finalize() throws Throwable {
                super.finalize();
                cleanup();
            }

            private void assertOpen() throws IOException {
                if (this.closed.get()) {
                    throw new IOException("Stream has already been closed");
                }
            }

            private void cleanup() {
                if (this.closed.compareAndSet(false, true)) {
                    TerracottaAndroidAPI.finishExportLogs0(ptr);
                }
            }
        }, StandardCharsets.UTF_8));
    }

    @Deprecated
    public static void panic() {
        panic0();
        throw new AssertionError("Should NOT be here: A RuntimeException should be thrown in panic0");
    }

    private static int onVpnServiceStateChanged(byte ip1, byte ip2, byte ip3, byte ip4, final short network_length, final String cidr) throws UnknownHostException {
        if (pendingRequest != null) {
            throw new AssertionError("Should NOT be here.");
        }
        final AtomicLong fd = new AtomicLong(2147483648L);
        final InetAddress address = InetAddress.getByAddress(new byte[]{ip1, ip2, ip3, ip4});
        pendingRequest = new VpnServiceRequest() { // from class: net.burningtnt.terracotta.TerracottaAndroidAPI.2
            @Override // net.burningtnt.terracotta.TerracottaAndroidAPI.VpnServiceRequest
            public ParcelFileDescriptor startVpnService(VpnService.Builder builder) {
                builder.addAddress(address, network_length).addDnsServer("223.5.5.5").addDnsServer("114.114.114.114");
                if (!cidr.isEmpty()) {
                    for (String part : cidr.split("\u0000")) {
                        String[] parts = part.split("/", 3);
                        if (parts.length != 2) {
                            throw new IllegalArgumentException("Illegal CIDR: " + Arrays.toString(parts));
                        }
                        builder.addRoute(parts[0], Integer.parseInt(parts[1]));
                    }
                }
                ParcelFileDescriptor connection = builder.establish();
                if (connection == null) {
                    throw new RuntimeException("Cannot establish a VPN connection.");
                }
                fd.set(connection.getFd());
                return connection;
            }

            @Override // net.burningtnt.terracotta.TerracottaAndroidAPI.VpnServiceRequest
            public void reject() {
                fd.set(TerracottaAndroidAPI.FD_REJECT);
            }
        };
        runtimeContext.vpnServiceCallback.onStartVpnService();
        long timestamp = System.currentTimeMillis();
        while (true) {
            long value = fd.get();
            if (value != 2147483648L) {
                if (value == FD_REJECT) {
                    pendingRequest = null;
                    throw new IllegalStateException();
                }
                pendingRequest = null;
                if (((int) value) != value) {
                    throw new AssertionError("Should NOT be here.");
                }
                return (int) value;
            }
            if (System.currentTimeMillis() - timestamp >= 30000) {
                Log.wtf("TerracottaAndroidAPI", "VpnService Request hasn't been fulfilled in 30s.");
                throw new IllegalStateException();
            }
            Thread.yield();
        }
    }

    private static void assertStarted() {
        if (runtimeContext == null) {
            throw new IllegalStateException("Terracotta Android hasn't started yet.");
        }
    }
}
