package com.github.caciocavallosilano.cacio.ctc;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCStringTransferable.class */
public class CTCStringTransferable implements Transferable {
    private static final DataFlavor[] STRING_DATA_FLAVORS;
    private static final DataFlavor[] HTML_DATA_FLAVORS;
    private final String data;
    private final boolean isHtml;

    static {
        ArrayList<DataFlavor> dataFlavorsList = new ArrayList<>();
        try {
            generateSupportedFlavorTypes(dataFlavorsList);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        STRING_DATA_FLAVORS = (DataFlavor[]) dataFlavorsList.toArray(new DataFlavor[0]);
        try {
            generateSupportedFlavorsForMimeType(dataFlavorsList, "text/html");
        } catch (Exception ex2) {
            ex2.printStackTrace();
        }
        HTML_DATA_FLAVORS = (DataFlavor[]) dataFlavorsList.toArray(new DataFlavor[0]);
    }

    public CTCStringTransferable(String data, String textType) {
        this.data = data;
        this.isHtml = textType.endsWith("html");
    }

    public DataFlavor[] getTransferDataFlavors() {
        return this.isHtml ? HTML_DATA_FLAVORS : STRING_DATA_FLAVORS;
    }

    public boolean isDataFlavorSupported(DataFlavor flavor) {
        return flavor.isFlavorTextType();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: java.awt.datatransfer.UnsupportedFlavorException */
    public Object getTransferData(DataFlavor flavor) throws UnsupportedFlavorException, IOException {
        if (!flavor.isFlavorTextType()) {
            throw new UnsupportedFlavorException(flavor);
        }
        if (CharSequence.class.isAssignableFrom(flavor.getRepresentationClass())) {
            return this.data;
        }
        if (flavor.isRepresentationClassByteBuffer()) {
            return ByteBuffer.wrap(this.data.getBytes(StandardCharsets.UTF_8));
        }
        if (flavor.isRepresentationClassCharBuffer()) {
            return CharBuffer.wrap(this.data);
        }
        if (flavor.isRepresentationClassInputStream()) {
            return new ByteArrayInputStream(this.data.getBytes(StandardCharsets.UTF_8));
        }
        if (flavor.isRepresentationClassReader()) {
            return new StringReader(this.data);
        }
        throw new UnsupportedFlavorException(flavor);
    }

    public static void generateSupportedFlavorsChar(List<DataFlavor> outputFlavors, String mimeType) throws ClassNotFoundException {
        outputFlavors.add(new DataFlavor(((Object) mimeType) + "; class=java.io.Reader; charset=Unicode"));
        outputFlavors.add(new DataFlavor(((Object) mimeType) + "; class=java.lang.String; charset=Unicode"));
        outputFlavors.add(new DataFlavor(((Object) mimeType) + "; class=java.nio.CharBuffer; charset=Unicode"));
        outputFlavors.add(new DataFlavor(((Object) mimeType) + "; class=\"[C\"; charset=Unicode"));
    }

    public static void generateSupportedFlavorsBinary(List<DataFlavor> outputFlavors, String mimeType, String encoding, boolean isDefault) throws ClassNotFoundException {
        outputFlavors.add(new DataFlavor(((Object) mimeType) + "; class=java.io.InputStream; charset=" + ((Object) encoding)));
        if (isDefault) {
            outputFlavors.add(new DataFlavor(((Object) mimeType) + "; class=java.io.InputStream"));
        }
        outputFlavors.add(new DataFlavor(((Object) mimeType) + "; class=java.nio.ByteBuffer; charset=" + ((Object) encoding)));
        outputFlavors.add(new DataFlavor(((Object) mimeType) + "; class=\"[B\"; charset=" + ((Object) encoding)));
    }

    public static void generateSupportedFlavorsForMimeType(List<DataFlavor> outputFlavors, String mimeType) throws ClassNotFoundException {
        generateSupportedFlavorsChar(outputFlavors, mimeType);
        String defaultCharsetName = Charset.defaultCharset().name();
        for (String charset : Charset.availableCharsets().keySet()) {
            generateSupportedFlavorsBinary(outputFlavors, mimeType, charset, defaultCharsetName.equals(charset));
        }
    }

    public static void generateSupportedFlavorTypes(List<DataFlavor> outputFlavors) throws ClassNotFoundException {
        outputFlavors.add(DataFlavor.stringFlavor);
        generateSupportedFlavorsForMimeType(outputFlavors, "text/plain");
        generateSupportedFlavorsForMimeType(outputFlavors, "text/x-java");
        outputFlavors.add(new DataFlavor("application/x-java-jvm-local-objectref; class=java.lang.String"));
    }
}
