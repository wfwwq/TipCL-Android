package com.github.caciocavallosilano.cacio.ctc;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.CharEncoding;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCClipboard.class */
public class CTCClipboard extends Clipboard {
    public static final CTCClipboard INSTANCE = new CTCClipboard();
    private static final Object sSyncLock = new Object();
    private static long lastClipboardCheckTime;

    private static native void nQuerySystemClipboard();

    private static native void nPutClipboardData(String str, String str2);

    private CTCClipboard() {
        super("Android JNI clipboard (text-only)");
    }

    public DataFlavor[] getAvailableDataFlavors() {
        querySystemClipboard();
        return super.getAvailableDataFlavors();
    }

    public Transferable getContents(Object requestor) {
        querySystemClipboard();
        return super.getContents(requestor);
    }

    public Object getData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        querySystemClipboard();
        return super.getData(flavor);
    }

    public boolean isDataFlavorAvailable(DataFlavor flavor) {
        querySystemClipboard();
        return super.isDataFlavorAvailable(flavor);
    }

    public void setContents(Transferable contents, ClipboardOwner owner) throws IOException {
        super.setContents(contents, owner);
        transferTextToOS(contents);
    }

    private static void querySystemClipboard() {
        try {
            synchronized (sSyncLock) {
                if (lastClipboardCheckTime + 300 > System.currentTimeMillis()) {
                    return;
                }
                nQuerySystemClipboard();
                sSyncLock.wait();
            }
        } catch (InterruptedException e) {
            throw new IllegalStateException();
        }
    }

    private static void systemClipboardDataReceived(String clipboardData, String clipboardDataMime) {
        synchronized (sSyncLock) {
            lastClipboardCheckTime = System.currentTimeMillis();
            if (clipboardData != null && clipboardDataMime != null) {
                INSTANCE.contents = new CTCStringTransferable(clipboardData, clipboardDataMime);
            }
            sSyncLock.notifyAll();
        }
    }

    private static void transferTextToOS(Transferable transferable) throws IOException {
        for (DataFlavor flavor : transferable.getTransferDataFlavors()) {
            if (flavor.isFlavorTextType()) {
                String mimeType = flavor.getSubType().equals("html") ? "text/html" : "text/plain";
                try {
                    if (CharSequence.class.isAssignableFrom(flavor.getRepresentationClass())) {
                        nPutClipboardData(transferable.getTransferData(flavor).toString(), mimeType);
                        return;
                    }
                    if (flavor.isRepresentationClassCharBuffer()) {
                        CharBuffer clipData = (CharBuffer) transferable.getTransferData(flavor);
                        nPutClipboardData(new String(clipData.array()), mimeType);
                        return;
                    }
                    if (flavor.isRepresentationClassReader()) {
                        Reader inputStream = (Reader) transferable.getTransferData(flavor);
                        try {
                            StringBuilder stringBuilder = new StringBuilder();
                            char[] buffer = new char[128];
                            while (true) {
                                int i = inputStream.read(buffer);
                                if (i == -1) {
                                    break;
                                } else {
                                    stringBuilder.append(buffer, 0, i);
                                }
                            }
                            nPutClipboardData(stringBuilder.toString(), mimeType);
                            if (inputStream != null) {
                                inputStream.close();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                    if (flavor.isRepresentationClassByteBuffer()) {
                        String charset = flavor.getParameter("charset");
                        if (charset == null) {
                            charset = CharEncoding.UTF_8;
                        }
                        ByteBuffer clipData2 = (ByteBuffer) transferable.getTransferData(flavor);
                        nPutClipboardData(new String(clipData2.array(), charset), mimeType);
                        return;
                    }
                    if (flavor.isRepresentationClassInputStream()) {
                        String charset2 = flavor.getParameter("charset");
                        if (charset2 == null) {
                            charset2 = CharEncoding.UTF_8;
                        }
                        InputStream inputStream2 = (InputStream) transferable.getTransferData(flavor);
                        try {
                            ByteArrayOutputStream baos = new ByteArrayOutputStream();
                            try {
                                byte[] buffer2 = new byte[128];
                                while (true) {
                                    int i2 = inputStream2.read(buffer2);
                                    if (i2 == -1) {
                                        break;
                                    } else {
                                        baos.write(buffer2, 0, i2);
                                    }
                                }
                                nPutClipboardData(baos.toString(charset2), mimeType);
                                baos.close();
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                try {
                                    baos.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                }
                            }
                            throw th5;
                        }
                    }
                } catch (UnsupportedFlavorException | IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
