package org.apache.commons.compress.harmony.pack200;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.IntUnaryOperator;
import org.apache.commons.io.IOUtils;
import org.objectweb.asm.Type;

/* loaded from: classes24.dex */
public class CpBands extends BandSet {
    private final Set<CPClass> cp_Class;
    private final Set<CPNameAndType> cp_Descr;
    private final Set<CPDouble> cp_Double;
    private final Set<CPMethodOrField> cp_Field;
    private final Set<CPFloat> cp_Float;
    private final Set<CPMethodOrField> cp_Imethod;
    private final Set<CPInt> cp_Int;
    private final Set<CPLong> cp_Long;
    private final Set<CPMethodOrField> cp_Method;
    private final Set<CPSignature> cp_Signature;
    private final Set<CPString> cp_String;
    private final Set<CPUTF8> cp_Utf8;
    private final Set<String> defaultAttributeNames;
    private final Map<Object, CPConstant<?>> objectsToCPConstant;
    private final Segment segment;
    private final Map<String, CPClass> stringsToCpClass;
    private final Map<String, CPMethodOrField> stringsToCpField;
    private final Map<String, CPMethodOrField> stringsToCpIMethod;
    private final Map<String, CPMethodOrField> stringsToCpMethod;
    private final Map<String, CPNameAndType> stringsToCpNameAndType;
    private final Map<String, CPSignature> stringsToCpSignature;
    private final Map<String, CPUTF8> stringsToCpUtf8;

    public CpBands(Segment segment, int effort) {
        super(effort, segment.getSegmentHeader());
        this.defaultAttributeNames = new HashSet();
        this.cp_Utf8 = new TreeSet();
        this.cp_Int = new TreeSet();
        this.cp_Float = new TreeSet();
        this.cp_Long = new TreeSet();
        this.cp_Double = new TreeSet();
        this.cp_String = new TreeSet();
        this.cp_Class = new TreeSet();
        this.cp_Signature = new TreeSet();
        this.cp_Descr = new TreeSet();
        this.cp_Field = new TreeSet();
        this.cp_Method = new TreeSet();
        this.cp_Imethod = new TreeSet();
        this.stringsToCpUtf8 = new HashMap();
        this.stringsToCpNameAndType = new HashMap();
        this.stringsToCpClass = new HashMap();
        this.stringsToCpSignature = new HashMap();
        this.stringsToCpMethod = new HashMap();
        this.stringsToCpField = new HashMap();
        this.stringsToCpIMethod = new HashMap();
        this.objectsToCPConstant = new HashMap();
        this.segment = segment;
        this.defaultAttributeNames.add("AnnotationDefault");
        this.defaultAttributeNames.add("RuntimeVisibleAnnotations");
        this.defaultAttributeNames.add("RuntimeInvisibleAnnotations");
        this.defaultAttributeNames.add("RuntimeVisibleParameterAnnotations");
        this.defaultAttributeNames.add("RuntimeInvisibleParameterAnnotations");
        this.defaultAttributeNames.add("Code");
        this.defaultAttributeNames.add("LineNumberTable");
        this.defaultAttributeNames.add("LocalVariableTable");
        this.defaultAttributeNames.add("LocalVariableTypeTable");
        this.defaultAttributeNames.add("ConstantValue");
        this.defaultAttributeNames.add("Deprecated");
        this.defaultAttributeNames.add("EnclosingMethod");
        this.defaultAttributeNames.add("Exceptions");
        this.defaultAttributeNames.add("InnerClasses");
        this.defaultAttributeNames.add("Signature");
        this.defaultAttributeNames.add("SourceFile");
    }

    private void addCharacters(List<Character> chars, char[] charArray) {
        for (char element : charArray) {
            chars.add(Character.valueOf(element));
        }
    }

    public void addCPClass(String className) {
        getCPClass(className);
    }

    void addCPUtf8(String utf8) {
        getCPUtf8(utf8);
    }

    private void addIndices() {
        for (Set<? extends ConstantPoolEntry> set : Arrays.asList(this.cp_Utf8, this.cp_Int, this.cp_Float, this.cp_Long, this.cp_Double, this.cp_String, this.cp_Class, this.cp_Signature, this.cp_Descr, this.cp_Field, this.cp_Method, this.cp_Imethod)) {
            int j = 0;
            for (ConstantPoolEntry entry : set) {
                entry.setIndex(j);
                j++;
            }
        }
        final Map<CPClass, Integer> classNameToIndex = new HashMap<>();
        this.cp_Field.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CpBands.lambda$addIndices$0(classNameToIndex, (CPMethodOrField) obj);
            }
        });
        classNameToIndex.clear();
        final Map<CPClass, Integer> classNameToConstructorIndex = new HashMap<>();
        this.cp_Method.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CpBands.lambda$addIndices$1(classNameToIndex, classNameToConstructorIndex, (CPMethodOrField) obj);
            }
        });
    }

    static /* synthetic */ void lambda$addIndices$0(Map classNameToIndex, CPMethodOrField mOrF) {
        CPClass cpClassName = mOrF.getClassName();
        Integer index = (Integer) classNameToIndex.get(cpClassName);
        if (index == null) {
            classNameToIndex.put(cpClassName, 1);
            mOrF.setIndexInClass(0);
        } else {
            int theIndex = index.intValue();
            mOrF.setIndexInClass(theIndex);
            classNameToIndex.put(cpClassName, Integer.valueOf(theIndex + 1));
        }
    }

    static /* synthetic */ void lambda$addIndices$1(Map classNameToIndex, Map classNameToConstructorIndex, CPMethodOrField mOrF) {
        CPClass cpClassName = mOrF.getClassName();
        Integer index = (Integer) classNameToIndex.get(cpClassName);
        if (index == null) {
            classNameToIndex.put(cpClassName, 1);
            mOrF.setIndexInClass(0);
        } else {
            int theIndex = index.intValue();
            mOrF.setIndexInClass(theIndex);
            classNameToIndex.put(cpClassName, Integer.valueOf(theIndex + 1));
        }
        if (mOrF.getDesc().getName().equals("<init>")) {
            Integer constructorIndex = (Integer) classNameToConstructorIndex.get(cpClassName);
            if (constructorIndex == null) {
                classNameToConstructorIndex.put(cpClassName, 1);
                mOrF.setIndexInClassForConstructor(0);
            } else {
                int theIndex2 = constructorIndex.intValue();
                mOrF.setIndexInClassForConstructor(theIndex2);
                classNameToConstructorIndex.put(cpClassName, Integer.valueOf(theIndex2 + 1));
            }
        }
    }

    public boolean existsCpClass(String className) {
        return this.stringsToCpClass.containsKey(className);
    }

    public void finaliseBands() {
        addCPUtf8("");
        removeSignaturesFromCpUTF8();
        addIndices();
        this.segmentHeader.setCp_Utf8_count(this.cp_Utf8.size());
        this.segmentHeader.setCp_Int_count(this.cp_Int.size());
        this.segmentHeader.setCp_Float_count(this.cp_Float.size());
        this.segmentHeader.setCp_Long_count(this.cp_Long.size());
        this.segmentHeader.setCp_Double_count(this.cp_Double.size());
        this.segmentHeader.setCp_String_count(this.cp_String.size());
        this.segmentHeader.setCp_Class_count(this.cp_Class.size());
        this.segmentHeader.setCp_Signature_count(this.cp_Signature.size());
        this.segmentHeader.setCp_Descr_count(this.cp_Descr.size());
        this.segmentHeader.setCp_Field_count(this.cp_Field.size());
        this.segmentHeader.setCp_Method_count(this.cp_Method.size());
        this.segmentHeader.setCp_Imethod_count(this.cp_Imethod.size());
    }

    public CPConstant<?> getConstant(Object value) {
        CPConstant<?> constant = this.objectsToCPConstant.get(value);
        if (constant == null) {
            if (value instanceof Integer) {
                CPConstant<?> constant2 = new CPInt(((Integer) value).intValue());
                this.cp_Int.add((CPInt) constant2);
                constant = constant2;
            } else if (value instanceof Long) {
                CPConstant<?> constant3 = new CPLong(((Long) value).longValue());
                this.cp_Long.add((CPLong) constant3);
                constant = constant3;
            } else if (value instanceof Float) {
                CPConstant<?> constant4 = new CPFloat(((Float) value).floatValue());
                this.cp_Float.add((CPFloat) constant4);
                constant = constant4;
            } else if (value instanceof Double) {
                CPConstant<?> constant5 = new CPDouble(((Double) value).doubleValue());
                this.cp_Double.add((CPDouble) constant5);
                constant = constant5;
            } else if (value instanceof String) {
                CPConstant<?> constant6 = new CPString(getCPUtf8((String) value));
                this.cp_String.add((CPString) constant6);
                constant = constant6;
            } else if (value instanceof Type) {
                String className = ((Type) value).getClassName();
                if (className.endsWith("[]")) {
                    String className2 = "[L" + className.substring(0, className.length() - 2);
                    while (className2.endsWith("[]")) {
                        className2 = "[" + className2.substring(0, className2.length() - 2);
                    }
                    className = className2 + ";";
                }
                constant = getCPClass(className);
            }
            this.objectsToCPConstant.put(value, constant);
        }
        return constant;
    }

    public CPClass getCPClass(String className) {
        if (className == null) {
            return null;
        }
        String className2 = className.replace('.', IOUtils.DIR_SEPARATOR_UNIX);
        CPClass cpClass = this.stringsToCpClass.get(className2);
        if (cpClass == null) {
            CPUTF8 cpUtf8 = getCPUtf8(className2);
            cpClass = new CPClass(cpUtf8);
            this.cp_Class.add(cpClass);
            this.stringsToCpClass.put(className2, cpClass);
        }
        if (cpClass.isInnerClass()) {
            this.segment.getClassBands().currentClassReferencesInnerClass(cpClass);
        }
        return cpClass;
    }

    public CPMethodOrField getCPField(CPClass cpClass, String name, String desc) {
        String key = cpClass.toString() + ":" + name + ":" + desc;
        CPMethodOrField cpF = this.stringsToCpField.get(key);
        if (cpF == null) {
            CPNameAndType nAndT = getCPNameAndType(name, desc);
            CPMethodOrField cpF2 = new CPMethodOrField(cpClass, nAndT);
            this.cp_Field.add(cpF2);
            this.stringsToCpField.put(key, cpF2);
            return cpF2;
        }
        return cpF;
    }

    public CPMethodOrField getCPField(String owner, String name, String desc) {
        return getCPField(getCPClass(owner), name, desc);
    }

    public CPMethodOrField getCPIMethod(CPClass cpClass, String name, String desc) {
        String key = cpClass.toString() + ":" + name + ":" + desc;
        CPMethodOrField cpIM = this.stringsToCpIMethod.get(key);
        if (cpIM == null) {
            CPNameAndType nAndT = getCPNameAndType(name, desc);
            CPMethodOrField cpIM2 = new CPMethodOrField(cpClass, nAndT);
            this.cp_Imethod.add(cpIM2);
            this.stringsToCpIMethod.put(key, cpIM2);
            return cpIM2;
        }
        return cpIM;
    }

    public CPMethodOrField getCPIMethod(String owner, String name, String desc) {
        return getCPIMethod(getCPClass(owner), name, desc);
    }

    public CPMethodOrField getCPMethod(CPClass cpClass, String name, String desc) {
        String key = cpClass.toString() + ":" + name + ":" + desc;
        CPMethodOrField cpM = this.stringsToCpMethod.get(key);
        if (cpM == null) {
            CPNameAndType nAndT = getCPNameAndType(name, desc);
            CPMethodOrField cpM2 = new CPMethodOrField(cpClass, nAndT);
            this.cp_Method.add(cpM2);
            this.stringsToCpMethod.put(key, cpM2);
            return cpM2;
        }
        return cpM;
    }

    public CPMethodOrField getCPMethod(String owner, String name, String desc) {
        return getCPMethod(getCPClass(owner), name, desc);
    }

    public CPNameAndType getCPNameAndType(String name, String signature) {
        String descr = name + ":" + signature;
        CPNameAndType nameAndType = this.stringsToCpNameAndType.get(descr);
        if (nameAndType == null) {
            CPNameAndType nameAndType2 = new CPNameAndType(getCPUtf8(name), getCPSignature(signature));
            this.stringsToCpNameAndType.put(descr, nameAndType2);
            this.cp_Descr.add(nameAndType2);
            return nameAndType2;
        }
        return nameAndType;
    }

    public CPSignature getCPSignature(String signature) {
        CPUTF8 signatureUTF8;
        if (signature == null) {
            return null;
        }
        CPSignature cpS = this.stringsToCpSignature.get(signature);
        if (cpS == null) {
            List<CPClass> cpClasses = new ArrayList<>();
            if (signature.length() > 1 && signature.indexOf(76) != -1) {
                List<String> classes = new ArrayList<>();
                char[] chars = signature.toCharArray();
                StringBuilder signatureString = new StringBuilder();
                int i = 0;
                while (i < chars.length) {
                    signatureString.append(chars[i]);
                    if (chars[i] == 'L') {
                        StringBuilder className = new StringBuilder();
                        int j = i + 1;
                        while (true) {
                            if (j < chars.length) {
                                char c = chars[j];
                                if (!Character.isLetter(c) && !Character.isDigit(c) && c != '/' && c != '$' && c != '_') {
                                    classes.add(className.toString());
                                    i = j - 1;
                                    break;
                                }
                                className.append(c);
                                j++;
                            }
                        }
                    }
                    i++;
                }
                removeCpUtf8(signature);
                for (String className2 : classes) {
                    CPClass cpClass = null;
                    if (className2 != null) {
                        String className3 = className2.replace('.', IOUtils.DIR_SEPARATOR_UNIX);
                        CPClass cpClass2 = this.stringsToCpClass.get(className3);
                        cpClass = cpClass2;
                        if (cpClass == null) {
                            CPUTF8 cpUtf8 = getCPUtf8(className3);
                            cpClass = new CPClass(cpUtf8);
                            this.cp_Class.add(cpClass);
                            this.stringsToCpClass.put(className3, cpClass);
                        }
                    }
                    cpClasses.add(cpClass);
                }
                signatureUTF8 = getCPUtf8(signatureString.toString());
            } else {
                signatureUTF8 = getCPUtf8(signature);
            }
            CPSignature cpS2 = new CPSignature(signature, signatureUTF8, cpClasses);
            this.cp_Signature.add(cpS2);
            this.stringsToCpSignature.put(signature, cpS2);
            return cpS2;
        }
        return cpS;
    }

    public CPUTF8 getCPUtf8(String utf8) {
        if (utf8 == null) {
            return null;
        }
        CPUTF8 cpUtf8 = this.stringsToCpUtf8.get(utf8);
        if (cpUtf8 == null) {
            CPUTF8 cpUtf82 = new CPUTF8(utf8);
            this.cp_Utf8.add(cpUtf82);
            this.stringsToCpUtf8.put(utf8, cpUtf82);
            return cpUtf82;
        }
        return cpUtf8;
    }

    @Override // org.apache.commons.compress.harmony.pack200.BandSet
    public void pack(OutputStream out) throws IOException {
        PackingUtils.log("Writing constant pool bands...");
        writeCpUtf8(out);
        writeCpInt(out);
        writeCpFloat(out);
        writeCpLong(out);
        writeCpDouble(out);
        writeCpString(out);
        writeCpClass(out);
        writeCpSignature(out);
        writeCpDescr(out);
        writeCpMethodOrField(this.cp_Field, out, "cp_Field");
        writeCpMethodOrField(this.cp_Method, out, "cp_Method");
        writeCpMethodOrField(this.cp_Imethod, out, "cp_Imethod");
    }

    private void removeCpUtf8(String string) {
        CPUTF8 utf8 = this.stringsToCpUtf8.get(string);
        if (utf8 != null && this.stringsToCpClass.get(string) == null) {
            this.stringsToCpUtf8.remove(string);
            this.cp_Utf8.remove(utf8);
        }
    }

    private void removeSignaturesFromCpUTF8() {
        this.cp_Signature.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.m9813x611111b4((CPSignature) obj);
            }
        });
    }

    /* renamed from: lambda$removeSignaturesFromCpUTF8$2$org-apache-commons-compress-harmony-pack200-CpBands, reason: not valid java name */
    /* synthetic */ void m9813x611111b4(CPSignature signature) {
        String sigStr = signature.getUnderlyingString();
        CPUTF8 utf8 = signature.getSignatureForm();
        String form = utf8.getUnderlyingString();
        if (!sigStr.equals(form)) {
            removeCpUtf8(sigStr);
        }
    }

    private void writeCpClass(OutputStream out) throws IOException {
        PackingUtils.log("Writing " + this.cp_Class.size() + " Class entries...");
        int[] cpClass = new int[this.cp_Class.size()];
        int i = 0;
        for (CPClass cpCl : this.cp_Class) {
            cpClass[i] = cpCl.getIndexInCpUtf8();
            i++;
        }
        byte[] encodedBand = encodeBandInt("cpClass", cpClass, Codec.UDELTA5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from cpClass[" + cpClass.length + "]");
    }

    private void writeCpDescr(OutputStream out) throws IOException {
        PackingUtils.log("Writing " + this.cp_Descr.size() + " Descriptor entries...");
        int[] cpDescrName = new int[this.cp_Descr.size()];
        int[] cpDescrType = new int[this.cp_Descr.size()];
        int i = 0;
        for (CPNameAndType nameAndType : this.cp_Descr) {
            cpDescrName[i] = nameAndType.getNameIndex();
            cpDescrType[i] = nameAndType.getTypeIndex();
            i++;
        }
        byte[] encodedBand = encodeBandInt("cp_Descr_Name", cpDescrName, Codec.DELTA5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from cp_Descr_Name[" + cpDescrName.length + "]");
        byte[] encodedBand2 = encodeBandInt("cp_Descr_Type", cpDescrType, Codec.UDELTA5);
        out.write(encodedBand2);
        PackingUtils.log("Wrote " + encodedBand2.length + " bytes from cp_Descr_Type[" + cpDescrType.length + "]");
    }

    private void writeCpDouble(OutputStream out) throws IOException {
        PackingUtils.log("Writing " + this.cp_Double.size() + " Double entries...");
        int[] highBits = new int[this.cp_Double.size()];
        int[] loBits = new int[this.cp_Double.size()];
        int i = 0;
        for (CPDouble dbl : this.cp_Double) {
            long l = Double.doubleToLongBits(dbl.getDouble());
            highBits[i] = (int) (l >> 32);
            loBits[i] = (int) l;
            i++;
        }
        byte[] encodedBand = encodeBandInt("cp_Double_hi", highBits, Codec.UDELTA5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from cp_Double_hi[" + highBits.length + "]");
        byte[] encodedBand2 = encodeBandInt("cp_Double_lo", loBits, Codec.DELTA5);
        out.write(encodedBand2);
        PackingUtils.log("Wrote " + encodedBand2.length + " bytes from cp_Double_lo[" + loBits.length + "]");
    }

    private void writeCpFloat(OutputStream out) throws IOException {
        PackingUtils.log("Writing " + this.cp_Float.size() + " Float entries...");
        int[] cpFloat = new int[this.cp_Float.size()];
        int i = 0;
        for (CPFloat fl : this.cp_Float) {
            cpFloat[i] = Float.floatToIntBits(fl.getFloat());
            i++;
        }
        byte[] encodedBand = encodeBandInt("cp_Float", cpFloat, Codec.UDELTA5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from cp_Float[" + cpFloat.length + "]");
    }

    private void writeCpInt(OutputStream out) throws IOException {
        PackingUtils.log("Writing " + this.cp_Int.size() + " Integer entries...");
        int[] cpInt = new int[this.cp_Int.size()];
        int i = 0;
        for (CPInt integer : this.cp_Int) {
            cpInt[i] = integer.getInt();
            i++;
        }
        byte[] encodedBand = encodeBandInt("cp_Int", cpInt, Codec.UDELTA5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from cp_Int[" + cpInt.length + "]");
    }

    private void writeCpLong(OutputStream out) throws IOException {
        PackingUtils.log("Writing " + this.cp_Long.size() + " Long entries...");
        int[] highBits = new int[this.cp_Long.size()];
        int[] loBits = new int[this.cp_Long.size()];
        int i = 0;
        for (CPLong lng : this.cp_Long) {
            long l = lng.getLong();
            highBits[i] = (int) (l >> 32);
            loBits[i] = (int) l;
            i++;
        }
        byte[] encodedBand = encodeBandInt("cp_Long_hi", highBits, Codec.UDELTA5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from cp_Long_hi[" + highBits.length + "]");
        byte[] encodedBand2 = encodeBandInt("cp_Long_lo", loBits, Codec.DELTA5);
        out.write(encodedBand2);
        PackingUtils.log("Wrote " + encodedBand2.length + " bytes from cp_Long_lo[" + loBits.length + "]");
    }

    private void writeCpMethodOrField(Set<CPMethodOrField> cp, OutputStream out, String name) throws IOException {
        PackingUtils.log("Writing " + cp.size() + " Method and Field entries...");
        int[] cp_methodOrField_class = new int[cp.size()];
        int[] cp_methodOrField_desc = new int[cp.size()];
        int i = 0;
        for (CPMethodOrField mOrF : cp) {
            cp_methodOrField_class[i] = mOrF.getClassIndex();
            cp_methodOrField_desc[i] = mOrF.getDescIndex();
            i++;
        }
        byte[] encodedBand = encodeBandInt(name + "_class", cp_methodOrField_class, Codec.DELTA5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from " + name + "_class[" + cp_methodOrField_class.length + "]");
        byte[] encodedBand2 = encodeBandInt(name + "_desc", cp_methodOrField_desc, Codec.UDELTA5);
        out.write(encodedBand2);
        PackingUtils.log("Wrote " + encodedBand2.length + " bytes from " + name + "_desc[" + cp_methodOrField_desc.length + "]");
    }

    private void writeCpSignature(OutputStream out) throws IOException {
        PackingUtils.log("Writing " + this.cp_Signature.size() + " Signature entries...");
        int[] cpSignatureForm = new int[this.cp_Signature.size()];
        final List<CPClass> classes = new ArrayList<>();
        int i = 0;
        for (CPSignature cpS : this.cp_Signature) {
            classes.addAll(cpS.getClasses());
            cpSignatureForm[i] = cpS.getIndexInCpUtf8();
            i++;
        }
        int[] cpSignatureClasses = new int[classes.size()];
        Arrays.setAll(cpSignatureClasses, new IntUnaryOperator() { // from class: org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda3
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i2) {
                return ((CPClass) classes.get(i2)).getIndex();
            }
        });
        byte[] encodedBand = encodeBandInt("cpSignatureForm", cpSignatureForm, Codec.DELTA5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from cpSignatureForm[" + cpSignatureForm.length + "]");
        byte[] encodedBand2 = encodeBandInt("cpSignatureClasses", cpSignatureClasses, Codec.UDELTA5);
        out.write(encodedBand2);
        PackingUtils.log("Wrote " + encodedBand2.length + " bytes from cpSignatureClasses[" + cpSignatureClasses.length + "]");
    }

    private void writeCpString(OutputStream out) throws IOException {
        PackingUtils.log("Writing " + this.cp_String.size() + " String entries...");
        int[] cpString = new int[this.cp_String.size()];
        int i = 0;
        for (CPString cpStr : this.cp_String) {
            cpString[i] = cpStr.getIndexInCpUtf8();
            i++;
        }
        byte[] encodedBand = encodeBandInt("cpString", cpString, Codec.UDELTA5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from cpString[" + cpString.length + "]");
    }

    private void writeCpUtf8(OutputStream out) throws IOException {
        int i;
        String first;
        PackingUtils.log("Writing " + this.cp_Utf8.size() + " UTF8 entries...");
        int[] cpUtf8Prefix = new int[this.cp_Utf8.size() - 2];
        int[] cpUtf8Suffix = new int[this.cp_Utf8.size() - 1];
        final List<Character> chars = new ArrayList<>();
        List<Integer> bigSuffix = new ArrayList<>();
        final List<Character> bigChars = new ArrayList<>();
        Object[] cpUtf8Array = this.cp_Utf8.toArray();
        String first2 = ((CPUTF8) cpUtf8Array[1]).getUnderlyingString();
        int i2 = 0;
        cpUtf8Suffix[0] = first2.length();
        addCharacters(chars, first2.toCharArray());
        int i3 = 2;
        while (i3 < cpUtf8Array.length) {
            char[] previous = ((CPUTF8) cpUtf8Array[i3 - 1]).getUnderlyingString().toCharArray();
            String currentStr = ((CPUTF8) cpUtf8Array[i3]).getUnderlyingString();
            char[] current = currentStr.toCharArray();
            int prefix = 0;
            int j = 0;
            while (true) {
                i = i2;
                if (j >= previous.length) {
                    first = first2;
                    break;
                }
                first = first2;
                if (previous[j] != current[j]) {
                    break;
                }
                prefix++;
                j++;
                i2 = i;
                first2 = first;
            }
            cpUtf8Prefix[i3 - 2] = prefix;
            char[] suffix = currentStr.substring(prefix).toCharArray();
            if (suffix.length > 1000) {
                cpUtf8Suffix[i3 - 1] = i;
                bigSuffix.add(Integer.valueOf(suffix.length));
                addCharacters(bigChars, suffix);
            } else {
                cpUtf8Suffix[i3 - 1] = suffix.length;
                addCharacters(chars, suffix);
            }
            i3++;
            i2 = i;
            first2 = first;
        }
        int[] cpUtf8Chars = new int[chars.size()];
        int[] cpUtf8BigSuffix = new int[bigSuffix.size()];
        int[][] cpUtf8BigChars = new int[bigSuffix.size()][];
        Arrays.setAll(cpUtf8Chars, new IntUnaryOperator() { // from class: org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda4
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i4) {
                return ((Character) chars.get(i4)).charValue();
            }
        });
        for (int i4 = 0; i4 < cpUtf8BigSuffix.length; i4++) {
            int numBigChars = bigSuffix.get(i4).intValue();
            cpUtf8BigSuffix[i4] = numBigChars;
            cpUtf8BigChars[i4] = new int[numBigChars];
            Arrays.setAll(cpUtf8BigChars[i4], new IntUnaryOperator() { // from class: org.apache.commons.compress.harmony.pack200.CpBands$$ExternalSyntheticLambda5
                @Override // java.util.function.IntUnaryOperator
                public final int applyAsInt(int i5) {
                    return ((Character) bigChars.remove(0)).charValue();
                }
            });
        }
        byte[] encodedBand = encodeBandInt("cpUtf8Prefix", cpUtf8Prefix, Codec.DELTA5);
        out.write(encodedBand);
        PackingUtils.log("Wrote " + encodedBand.length + " bytes from cpUtf8Prefix[" + cpUtf8Prefix.length + "]");
        byte[] encodedBand2 = encodeBandInt("cpUtf8Suffix", cpUtf8Suffix, Codec.UNSIGNED5);
        out.write(encodedBand2);
        PackingUtils.log("Wrote " + encodedBand2.length + " bytes from cpUtf8Suffix[" + cpUtf8Suffix.length + "]");
        byte[] encodedBand3 = encodeBandInt("cpUtf8Chars", cpUtf8Chars, Codec.CHAR3);
        out.write(encodedBand3);
        PackingUtils.log("Wrote " + encodedBand3.length + " bytes from cpUtf8Chars[" + cpUtf8Chars.length + "]");
        byte[] encodedBand4 = encodeBandInt("cpUtf8BigSuffix", cpUtf8BigSuffix, Codec.DELTA5);
        out.write(encodedBand4);
        PackingUtils.log("Wrote " + encodedBand4.length + " bytes from cpUtf8BigSuffix[" + cpUtf8BigSuffix.length + "]");
        int i5 = 0;
        while (i5 < cpUtf8BigChars.length) {
            byte[] encodedBand5 = encodeBandInt("cpUtf8BigChars " + i5, cpUtf8BigChars[i5], Codec.DELTA5);
            out.write(encodedBand5);
            PackingUtils.log("Wrote " + encodedBand5.length + " bytes from cpUtf8BigChars" + i5 + "[" + cpUtf8BigChars[i5].length + "]");
            i5++;
            cpUtf8Prefix = cpUtf8Prefix;
            cpUtf8Suffix = cpUtf8Suffix;
        }
    }
}
