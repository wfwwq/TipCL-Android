package net.java.openjdk.cacio.ctc;

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

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCClipboard.class */
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

    /* JADX WARN: Failed to apply debug info
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnoreUnknown(TypeUpdate.java:74)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:137)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:133)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.searchAndApplyVarDebugInfo(DebugInfoApplyVisitor.java:75)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.lambda$applyDebugInfo$0(DebugInfoApplyVisitor.java:68)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.applyDebugInfo(DebugInfoApplyVisitor.java:68)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoApplyVisitor.visit(DebugInfoApplyVisitor.java:55)
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r12v4 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r13v3 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r13v3 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Multi-variable type inference failed. Error: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because the return value of "jadx.core.dex.nodes.InsnNode.getResult()" is null
    	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.collectRelatedVars(AbstractTypeConstraint.java:31)
    	at jadx.core.dex.visitors.typeinference.AbstractTypeConstraint.<init>(AbstractTypeConstraint.java:19)
    	at jadx.core.dex.visitors.typeinference.TypeSearch$1.<init>(TypeSearch.java:376)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.makeMoveConstraint(TypeSearch.java:376)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.makeConstraint(TypeSearch.java:361)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.collectConstraints(TypeSearch.java:341)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:60)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:116)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0249: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r12 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY] A[D('inputStream' java.io.InputStream)]) A[TRY_LEAVE], block:B:103:0x0249 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x024e: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r13 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:105:0x024e */
    /* JADX WARN: Type inference failed for: r12v4, names: [inputStream], types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Throwable] */
    private static void transferTextToOS(Transferable transferable) throws IOException {
        ?? r12;
        ?? r13;
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
                        Throwable th = null;
                        try {
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
                                    if (0 == 0) {
                                        inputStream.close();
                                        return;
                                    }
                                    try {
                                        inputStream.close();
                                        return;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        return;
                                    }
                                }
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            if (inputStream != null) {
                                if (th != null) {
                                    try {
                                        inputStream.close();
                                    } catch (Throwable th5) {
                                        th.addSuppressed(th5);
                                    }
                                } else {
                                    inputStream.close();
                                }
                            }
                            throw th4;
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
                        try {
                            InputStream inputStream2 = (InputStream) transferable.getTransferData(flavor);
                            Throwable th6 = null;
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            Throwable th7 = null;
                            try {
                                try {
                                    byte[] bArr = new byte[128];
                                    while (true) {
                                        int i2 = inputStream2.read(bArr);
                                        if (i2 == -1) {
                                            break;
                                        } else {
                                            byteArrayOutputStream.write(bArr, 0, i2);
                                        }
                                    }
                                    nPutClipboardData(byteArrayOutputStream.toString(charset2), mimeType);
                                    if (byteArrayOutputStream != null) {
                                        if (0 != 0) {
                                            try {
                                                byteArrayOutputStream.close();
                                            } catch (Throwable th8) {
                                                th7.addSuppressed(th8);
                                            }
                                        } else {
                                            byteArrayOutputStream.close();
                                        }
                                    }
                                    if (inputStream2 != null) {
                                        if (0 == 0) {
                                            inputStream2.close();
                                            return;
                                        }
                                        try {
                                            inputStream2.close();
                                            return;
                                        } catch (Throwable th9) {
                                            th6.addSuppressed(th9);
                                            return;
                                        }
                                    }
                                    return;
                                } catch (Throwable th10) {
                                    th7 = th10;
                                    throw th10;
                                }
                            } catch (Throwable th11) {
                                if (byteArrayOutputStream != null) {
                                    if (th7 != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Throwable th12) {
                                            th7.addSuppressed(th12);
                                        }
                                    } else {
                                        byteArrayOutputStream.close();
                                    }
                                }
                                throw th11;
                            }
                        } catch (Throwable th13) {
                            if (r12 != 0) {
                                if (r13 != 0) {
                                    try {
                                        r12.close();
                                    } catch (Throwable th14) {
                                        r13.addSuppressed(th14);
                                    }
                                } else {
                                    r12.close();
                                }
                            }
                            throw th13;
                        }
                    }
                } catch (UnsupportedFlavorException | IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
