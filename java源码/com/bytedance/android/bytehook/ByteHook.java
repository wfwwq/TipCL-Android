package com.bytedance.android.bytehook;

/* loaded from: classes7.dex */
public final class ByteHook {
    public static final int ERRNO_INIT_EXCEPTION = 101;
    public static final int ERRNO_LOAD_LIBRARY_EXCEPTION = 100;
    public static final int ERRNO_OK = 0;
    public static final int ERRNO_UNINIT = 1;
    private static final int RECORD_ITEM_ALL = 255;
    private static final int RECORD_ITEM_CALLER_LIB_NAME = 2;
    private static final int RECORD_ITEM_ERRNO = 64;
    private static final int RECORD_ITEM_LIB_NAME = 8;
    private static final int RECORD_ITEM_NEW_ADDR = 32;
    private static final int RECORD_ITEM_OP = 4;
    private static final int RECORD_ITEM_STUB = 128;
    private static final int RECORD_ITEM_SYM_NAME = 16;
    private static final int RECORD_ITEM_TIMESTAMP = 1;
    private static final boolean defaultDebug = false;
    private static final int defaultMode = 0;
    private static final boolean defaultRecordable = false;
    private static final String libName = "bytehook";
    private static final ILibLoader defaultLibLoader = null;
    private static boolean inited = false;
    private static int initStatus = 1;
    private static long initCostMs = -1;

    public interface Config {
        boolean getDebug();

        ILibLoader getLibLoader();

        int getMode();

        boolean getRecordable();

        void setDebug(boolean z);

        void setLibLoader(ILibLoader iLibLoader);

        void setMode(int i);

        void setRecordable(boolean z);
    }

    public enum RecordItem {
        TIMESTAMP,
        CALLER_LIB_NAME,
        OP,
        LIB_NAME,
        SYM_NAME,
        NEW_ADDR,
        ERRNO,
        STUB
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native int nativeAddIgnore(String str);

    private static native String nativeGetArch();

    private static native boolean nativeGetDebug();

    private static native int nativeGetMode();

    private static native boolean nativeGetRecordable();

    private static native String nativeGetRecords(int i);

    private static native String nativeGetVersion();

    private static native int nativeInit(int i, boolean z);

    private static native void nativeSetDebug(boolean z);

    private static native void nativeSetRecordable(boolean z);

    private ByteHook() {
    }

    public static int init() {
        return init(null);
    }

    public static synchronized int init(Config config) {
        if (inited) {
            return initStatus;
        }
        inited = true;
        long ts = System.currentTimeMillis();
        if (config == null) {
            try {
                config = new ConfigBuilder().build();
            } catch (Throwable th) {
                initStatus = 100;
            }
        }
        ILibLoader loader = config.getLibLoader();
        if (loader == null) {
            System.loadLibrary(libName);
        } else {
            loader.loadLibrary(libName);
        }
        try {
            initStatus = nativeInit(config.getMode(), config.getDebug());
        } catch (Throwable th2) {
            initStatus = 101;
        }
        try {
            if (config.getRecordable()) {
                nativeSetRecordable(true);
            }
        } catch (Throwable th3) {
            initStatus = 101;
        }
        initCostMs = System.currentTimeMillis() - ts;
        return initStatus;
    }

    public static int addIgnore(String callerLibName) {
        return nativeAddIgnore(callerLibName);
    }

    public static void setDebug(boolean debug) {
        nativeSetDebug(debug);
    }

    public static boolean getDebug() {
        return nativeGetDebug();
    }

    public static void setRecordable(boolean recordable) {
        nativeSetRecordable(recordable);
    }

    public static boolean getRecordable() {
        return nativeGetRecordable();
    }

    public static Mode getMode() {
        return Mode.values()[nativeGetMode()];
    }

    public static String getArch() {
        try {
            return nativeGetArch();
        } catch (Throwable th) {
            return "";
        }
    }

    public static String getVersion() {
        try {
            return nativeGetVersion();
        } catch (Throwable th) {
            return "";
        }
    }

    public static String getRecords(RecordItem[] items) {
        if (items == null) {
            return null;
        }
        int flags = 0;
        for (RecordItem item : items) {
            switch (item) {
                case TIMESTAMP:
                    flags |= 1;
                    break;
                case CALLER_LIB_NAME:
                    flags |= 2;
                    break;
                case OP:
                    flags |= 4;
                    break;
                case LIB_NAME:
                    flags |= 8;
                    break;
                case SYM_NAME:
                    flags |= 16;
                    break;
                case NEW_ADDR:
                    flags |= 32;
                    break;
                case ERRNO:
                    flags |= 64;
                    break;
                case STUB:
                    flags |= 128;
                    break;
            }
        }
        return nativeGetRecords(flags);
    }

    public static int getInitErrno() {
        return initStatus;
    }

    public static long getInitCostMs() {
        return initCostMs;
    }

    public enum Mode {
        AUTOMATIC(0),
        MANUAL(1);

        private final int value;

        Mode(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    public static final class ConfigBuilder {
        private boolean debug = false;
        private ILibLoader libLoader = ByteHook.defaultLibLoader;
        private int mode = 0;
        private boolean recordable = false;

        public ConfigBuilder setDebug(boolean debug) {
            this.debug = debug;
            return this;
        }

        public ConfigBuilder setLibLoader(ILibLoader libLoader) {
            this.libLoader = libLoader;
            return this;
        }

        public ConfigBuilder setMode(Mode mode) {
            this.mode = mode == null ? Mode.AUTOMATIC.getValue() : mode.getValue();
            return this;
        }

        public ConfigBuilder setRecordable(boolean recordable) {
            this.recordable = recordable;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.bytedance.android.bytehook.ByteHook$ConfigBuilder$1, reason: invalid class name */
        public class AnonymousClass1 implements Config {
            private boolean debug;
            private ILibLoader libLoader;
            private int mode;
            private boolean recordable;

            AnonymousClass1() {
                this.debug = ConfigBuilder.this.debug;
                this.libLoader = ConfigBuilder.this.libLoader;
                this.mode = ConfigBuilder.this.mode;
                this.recordable = ConfigBuilder.this.recordable;
            }

            @Override // com.bytedance.android.bytehook.ByteHook.Config
            public boolean getDebug() {
                return this.debug;
            }

            @Override // com.bytedance.android.bytehook.ByteHook.Config
            public void setDebug(boolean d) {
                this.debug = d;
            }

            @Override // com.bytedance.android.bytehook.ByteHook.Config
            public ILibLoader getLibLoader() {
                return this.libLoader;
            }

            @Override // com.bytedance.android.bytehook.ByteHook.Config
            public void setLibLoader(ILibLoader l) {
                this.libLoader = l;
            }

            @Override // com.bytedance.android.bytehook.ByteHook.Config
            public int getMode() {
                return this.mode;
            }

            @Override // com.bytedance.android.bytehook.ByteHook.Config
            public void setMode(int m) {
                this.mode = m;
            }

            @Override // com.bytedance.android.bytehook.ByteHook.Config
            public boolean getRecordable() {
                return this.recordable;
            }

            @Override // com.bytedance.android.bytehook.ByteHook.Config
            public void setRecordable(boolean r) {
                this.recordable = r;
            }
        }

        public Config build() {
            Config config = new AnonymousClass1();
            return config;
        }
    }
}
