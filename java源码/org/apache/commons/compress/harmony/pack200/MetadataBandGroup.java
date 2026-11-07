package org.apache.commons.compress.harmony.pack200;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToIntFunction;

/* loaded from: classes24.dex */
public class MetadataBandGroup extends BandSet {
    public static final int CONTEXT_CLASS = 0;
    public static final int CONTEXT_FIELD = 1;
    public static final int CONTEXT_METHOD = 2;
    public List<String> T;
    public IntList anno_N;
    public List<CPConstant<?>> caseD_KD;
    public List<CPConstant<?>> caseF_KF;
    public List<CPConstant<?>> caseI_KI;
    public List<CPConstant<?>> caseJ_KJ;
    public IntList casearray_N;
    public List<CPSignature> casec_RS;
    public List<CPUTF8> caseec_RU;
    public List<CPSignature> caseet_RS;
    public List<CPUTF8> cases_RU;
    private final int context;
    private final CpBands cpBands;
    public List<CPUTF8> name_RU;
    public List<CPUTF8> nestname_RU;
    public IntList nestpair_N;
    public List<CPSignature> nesttype_RS;
    private int numBackwardsCalls;
    public IntList pair_N;
    public IntList param_NB;
    private final String type;
    public List<CPSignature> type_RS;

    public MetadataBandGroup(String type, int context, CpBands cpBands, SegmentHeader segmentHeader, int effort) {
        super(effort, segmentHeader);
        this.param_NB = new IntList();
        this.anno_N = new IntList();
        this.type_RS = new ArrayList();
        this.pair_N = new IntList();
        this.name_RU = new ArrayList();
        this.T = new ArrayList();
        this.caseI_KI = new ArrayList();
        this.caseD_KD = new ArrayList();
        this.caseF_KF = new ArrayList();
        this.caseJ_KJ = new ArrayList();
        this.casec_RS = new ArrayList();
        this.caseet_RS = new ArrayList();
        this.caseec_RU = new ArrayList();
        this.cases_RU = new ArrayList();
        this.casearray_N = new IntList();
        this.nesttype_RS = new ArrayList();
        this.nestpair_N = new IntList();
        this.nestname_RU = new ArrayList();
        this.type = type;
        this.cpBands = cpBands;
        this.context = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addAnnotation(java.lang.String r7, java.util.List<java.lang.String> r8, java.util.List<java.lang.String> r9, java.util.List<java.lang.Object> r10, java.util.List<java.lang.Integer> r11, java.util.List<java.lang.String> r12, java.util.List<java.lang.String> r13, java.util.List<java.lang.Integer> r14) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.harmony.pack200.MetadataBandGroup.addAnnotation(java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void");
    }

    /* renamed from: lambda$addAnnotation$0$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m9814x38f307eb(String name) {
        this.name_RU.add(this.cpBands.getCPUtf8(name));
    }

    /* renamed from: lambda$addAnnotation$1$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m9815x2c828c2c(String element) {
        this.nesttype_RS.add(this.cpBands.getCPSignature(element));
    }

    /* renamed from: lambda$addAnnotation$2$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m9816x2012106d(String element) {
        this.nestname_RU.add(this.cpBands.getCPUtf8(element));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addParameterAnnotation(int r8, int[] r9, org.apache.commons.compress.harmony.pack200.IntList r10, java.util.List<java.lang.String> r11, java.util.List<java.lang.String> r12, java.util.List<java.lang.String> r13, java.util.List<java.lang.Object> r14, java.util.List<java.lang.Integer> r15, java.util.List<java.lang.String> r16, java.util.List<java.lang.String> r17, java.util.List<java.lang.Integer> r18) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.harmony.pack200.MetadataBandGroup.addParameterAnnotation(int, int[], org.apache.commons.compress.harmony.pack200.IntList, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void");
    }

    /* renamed from: lambda$addParameterAnnotation$3$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m9817x334022ef(String desc) {
        this.type_RS.add(this.cpBands.getCPSignature(desc));
    }

    /* renamed from: lambda$addParameterAnnotation$4$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m9818x26cfa730(String name) {
        this.name_RU.add(this.cpBands.getCPUtf8(name));
    }

    /* renamed from: lambda$addParameterAnnotation$5$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m9819x1a5f2b71(String type) {
        this.nesttype_RS.add(this.cpBands.getCPSignature(type));
    }

    /* renamed from: lambda$addParameterAnnotation$6$org-apache-commons-compress-harmony-pack200-MetadataBandGroup, reason: not valid java name */
    /* synthetic */ void m9820xdeeafb2(String name) {
        this.nestname_RU.add(this.cpBands.getCPUtf8(name));
    }

    public boolean hasContent() {
        return this.type_RS.size() > 0;
    }

    public void incrementAnnoN() {
        this.anno_N.increment(this.anno_N.size() - 1);
    }

    public void newEntryInAnnoN() {
        this.anno_N.add(1);
    }

    private String nextString(Iterator<Object> valuesIterator) {
        return (String) valuesIterator.next();
    }

    public int numBackwardsCalls() {
        return this.numBackwardsCalls;
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(OutputStream out) throws IOException {
        String contextStr;
        PackingUtils.log("Writing metadata band group...");
        if (hasContent()) {
            if (this.context == 0) {
                contextStr = "Class";
            } else if (this.context == 1) {
                contextStr = "Field";
            } else {
                contextStr = "Method";
            }
            if (!this.type.equals("AD")) {
                if (this.type.indexOf(80) != -1) {
                    byte[] encodedBand = encodeBandInt(contextStr + "_" + this.type + " param_NB", this.param_NB.toArray(), Codec.BYTE1);
                    out.write(encodedBand);
                    PackingUtils.log("Wrote " + encodedBand.length + " bytes from " + contextStr + "_" + this.type + " anno_N[" + this.param_NB.size() + "]");
                }
                byte[] encodedBand2 = encodeBandInt(contextStr + "_" + this.type + " anno_N", this.anno_N.toArray(), Codec.UNSIGNED5);
                out.write(encodedBand2);
                PackingUtils.log("Wrote " + encodedBand2.length + " bytes from " + contextStr + "_" + this.type + " anno_N[" + this.anno_N.size() + "]");
                byte[] encodedBand3 = encodeBandInt(contextStr + "_" + this.type + " type_RS", cpEntryListToArray(this.type_RS), Codec.UNSIGNED5);
                out.write(encodedBand3);
                PackingUtils.log("Wrote " + encodedBand3.length + " bytes from " + contextStr + "_" + this.type + " type_RS[" + this.type_RS.size() + "]");
                byte[] encodedBand4 = encodeBandInt(contextStr + "_" + this.type + " pair_N", this.pair_N.toArray(), Codec.UNSIGNED5);
                out.write(encodedBand4);
                PackingUtils.log("Wrote " + encodedBand4.length + " bytes from " + contextStr + "_" + this.type + " pair_N[" + this.pair_N.size() + "]");
                byte[] encodedBand5 = encodeBandInt(contextStr + "_" + this.type + " name_RU", cpEntryListToArray(this.name_RU), Codec.UNSIGNED5);
                out.write(encodedBand5);
                PackingUtils.log("Wrote " + encodedBand5.length + " bytes from " + contextStr + "_" + this.type + " name_RU[" + this.name_RU.size() + "]");
            }
            byte[] encodedBand6 = encodeBandInt(contextStr + "_" + this.type + " T", tagListToArray(this.T), Codec.BYTE1);
            out.write(encodedBand6);
            PackingUtils.log("Wrote " + encodedBand6.length + " bytes from " + contextStr + "_" + this.type + " T[" + this.T.size() + "]");
            byte[] encodedBand7 = encodeBandInt(contextStr + "_" + this.type + " caseI_KI", cpEntryListToArray(this.caseI_KI), Codec.UNSIGNED5);
            out.write(encodedBand7);
            PackingUtils.log("Wrote " + encodedBand7.length + " bytes from " + contextStr + "_" + this.type + " caseI_KI[" + this.caseI_KI.size() + "]");
            byte[] encodedBand8 = encodeBandInt(contextStr + "_" + this.type + " caseD_KD", cpEntryListToArray(this.caseD_KD), Codec.UNSIGNED5);
            out.write(encodedBand8);
            PackingUtils.log("Wrote " + encodedBand8.length + " bytes from " + contextStr + "_" + this.type + " caseD_KD[" + this.caseD_KD.size() + "]");
            byte[] encodedBand9 = encodeBandInt(contextStr + "_" + this.type + " caseF_KF", cpEntryListToArray(this.caseF_KF), Codec.UNSIGNED5);
            out.write(encodedBand9);
            PackingUtils.log("Wrote " + encodedBand9.length + " bytes from " + contextStr + "_" + this.type + " caseF_KF[" + this.caseF_KF.size() + "]");
            byte[] encodedBand10 = encodeBandInt(contextStr + "_" + this.type + " caseJ_KJ", cpEntryListToArray(this.caseJ_KJ), Codec.UNSIGNED5);
            out.write(encodedBand10);
            PackingUtils.log("Wrote " + encodedBand10.length + " bytes from " + contextStr + "_" + this.type + " caseJ_KJ[" + this.caseJ_KJ.size() + "]");
            byte[] encodedBand11 = encodeBandInt(contextStr + "_" + this.type + " casec_RS", cpEntryListToArray(this.casec_RS), Codec.UNSIGNED5);
            out.write(encodedBand11);
            PackingUtils.log("Wrote " + encodedBand11.length + " bytes from " + contextStr + "_" + this.type + " casec_RS[" + this.casec_RS.size() + "]");
            byte[] encodedBand12 = encodeBandInt(contextStr + "_" + this.type + " caseet_RS", cpEntryListToArray(this.caseet_RS), Codec.UNSIGNED5);
            out.write(encodedBand12);
            PackingUtils.log("Wrote " + encodedBand12.length + " bytes from " + contextStr + "_" + this.type + " caseet_RS[" + this.caseet_RS.size() + "]");
            byte[] encodedBand13 = encodeBandInt(contextStr + "_" + this.type + " caseec_RU", cpEntryListToArray(this.caseec_RU), Codec.UNSIGNED5);
            out.write(encodedBand13);
            PackingUtils.log("Wrote " + encodedBand13.length + " bytes from " + contextStr + "_" + this.type + " caseec_RU[" + this.caseec_RU.size() + "]");
            byte[] encodedBand14 = encodeBandInt(contextStr + "_" + this.type + " cases_RU", cpEntryListToArray(this.cases_RU), Codec.UNSIGNED5);
            out.write(encodedBand14);
            PackingUtils.log("Wrote " + encodedBand14.length + " bytes from " + contextStr + "_" + this.type + " cases_RU[" + this.cases_RU.size() + "]");
            byte[] encodedBand15 = encodeBandInt(contextStr + "_" + this.type + " casearray_N", this.casearray_N.toArray(), Codec.UNSIGNED5);
            out.write(encodedBand15);
            PackingUtils.log("Wrote " + encodedBand15.length + " bytes from " + contextStr + "_" + this.type + " casearray_N[" + this.casearray_N.size() + "]");
            byte[] encodedBand16 = encodeBandInt(contextStr + "_" + this.type + " nesttype_RS", cpEntryListToArray(this.nesttype_RS), Codec.UNSIGNED5);
            out.write(encodedBand16);
            PackingUtils.log("Wrote " + encodedBand16.length + " bytes from " + contextStr + "_" + this.type + " nesttype_RS[" + this.nesttype_RS.size() + "]");
            byte[] encodedBand17 = encodeBandInt(contextStr + "_" + this.type + " nestpair_N", this.nestpair_N.toArray(), Codec.UNSIGNED5);
            out.write(encodedBand17);
            PackingUtils.log("Wrote " + encodedBand17.length + " bytes from " + contextStr + "_" + this.type + " nestpair_N[" + this.nestpair_N.size() + "]");
            byte[] encodedBand18 = encodeBandInt(contextStr + "_" + this.type + " nestname_RU", cpEntryListToArray(this.nestname_RU), Codec.UNSIGNED5);
            out.write(encodedBand18);
            PackingUtils.log("Wrote " + encodedBand18.length + " bytes from " + contextStr + "_" + this.type + " nestname_RU[" + this.nestname_RU.size() + "]");
        }
    }

    public void removeLatest() {
        int latest = this.anno_N.remove(this.anno_N.size() - 1);
        for (int i = 0; i < latest; i++) {
            this.type_RS.remove(this.type_RS.size() - 1);
            int pairs = this.pair_N.remove(this.pair_N.size() - 1);
            for (int j = 0; j < pairs; j++) {
                removeOnePair();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void removeOnePair() {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.harmony.pack200.MetadataBandGroup.removeOnePair():void");
    }

    private int[] tagListToArray(List<String> list) {
        return list.stream().mapToInt(new ToIntFunction() { // from class: org.apache.commons.compress.harmony.pack200.MetadataBandGroup$$ExternalSyntheticLambda0
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((String) obj).charAt(0);
            }
        }).toArray();
    }
}
