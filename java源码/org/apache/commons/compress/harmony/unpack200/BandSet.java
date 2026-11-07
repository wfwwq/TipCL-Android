package org.apache.commons.compress.harmony.unpack200;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.function.IntFunction;
import org.apache.commons.compress.harmony.pack200.BHSDCodec;
import org.apache.commons.compress.harmony.pack200.Codec;
import org.apache.commons.compress.harmony.pack200.CodecEncoding;
import org.apache.commons.compress.harmony.pack200.Pack200Exception;
import org.apache.commons.compress.harmony.pack200.PopulationCodec;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPClass;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPDouble;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPFloat;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInteger;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPLong;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPMethodRef;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPString;
import org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8;
import org.apache.commons.compress.utils.ExactMath;

/* loaded from: classes24.dex */
public abstract class BandSet {
    protected SegmentHeader header;
    protected Segment segment;

    public abstract void read(InputStream inputStream) throws IOException;

    public abstract void unpack() throws IOException;

    public BandSet(Segment segment) {
        this.segment = segment;
        this.header = segment.getSegmentHeader();
    }

    public int[] decodeBandInt(String name, InputStream in, BHSDCodec codec, int count) throws IOException {
        int[] band;
        Codec codecUsed;
        int[] getFirst;
        int first;
        if (count < 0) {
            throw new Pack200Exception("count < 0");
        }
        Codec codecUsed2 = codec;
        boolean z = true;
        if (codec.getB() == 1 || count == 0) {
            return codec.decodeInts(count, in);
        }
        int[] getFirst2 = codec.decodeInts(1, in);
        if (getFirst2.length == 0) {
            return getFirst2;
        }
        boolean z2 = false;
        int first2 = getFirst2[0];
        int i = -1;
        if (codec.isSigned() && first2 >= -256 && first2 <= -1) {
            codecUsed2 = CodecEncoding.getCodec((-1) - first2, this.header.getBandHeadersInputStream(), codec);
            band = codecUsed2.decodeInts(count, in);
        } else if (!codec.isSigned() && first2 >= codec.getL() && first2 <= codec.getL() + 255) {
            codecUsed2 = CodecEncoding.getCodec(first2 - codec.getL(), this.header.getBandHeadersInputStream(), codec);
            band = codecUsed2.decodeInts(count, in);
        } else {
            band = codec.decodeInts(count - 1, in, first2);
        }
        if (codecUsed2 instanceof PopulationCodec) {
            PopulationCodec popCodec = (PopulationCodec) codecUsed2;
            int[] favoured = (int[]) popCodec.getFavoured().clone();
            Arrays.sort(favoured);
            int i2 = 0;
            while (i2 < band.length) {
                boolean favouredValue = Arrays.binarySearch(favoured, band[i2]) > i ? z : z2;
                Codec theCodec = favouredValue ? popCodec.getFavouredCodec() : popCodec.getUnfavouredCodec();
                if (!(theCodec instanceof BHSDCodec) || !((BHSDCodec) theCodec).isDelta()) {
                    codecUsed = codecUsed2;
                    getFirst = getFirst2;
                    first = first2;
                } else {
                    BHSDCodec bhsd = (BHSDCodec) theCodec;
                    first = first2;
                    long cardinality = bhsd.cardinality();
                    while (true) {
                        codecUsed = codecUsed2;
                        getFirst = getFirst2;
                        if (band[i2] <= bhsd.largest()) {
                            break;
                        }
                        band[i2] = (int) (band[i2] - cardinality);
                        getFirst2 = getFirst;
                        codecUsed2 = codecUsed;
                    }
                    while (band[i2] < bhsd.smallest()) {
                        band[i2] = ExactMath.add(band[i2], cardinality);
                    }
                }
                i2++;
                first2 = first;
                getFirst2 = getFirst;
                codecUsed2 = codecUsed;
                z = true;
                z2 = false;
                i = -1;
            }
        }
        return band;
    }

    public int[][] decodeBandInt(String name, InputStream in, BHSDCodec defaultCodec, int[] counts) throws IOException {
        int[][] result = new int[counts.length][];
        int totalCount = 0;
        for (int count : counts) {
            totalCount += count;
        }
        int[] twoDResult = decodeBandInt(name, in, defaultCodec, totalCount);
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            if (counts[i] > twoDResult.length) {
                throw new IOException("Counts value exceeds length of twoDResult");
            }
            result[i] = new int[counts[i]];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = twoDResult[index];
                index++;
            }
        }
        return result;
    }

    protected String[] getReferences(final int[] ints, final String[] reference) {
        String[] result = new String[ints.length];
        Arrays.setAll(result, new IntFunction() { // from class: org.apache.commons.compress.harmony.unpack200.BandSet$$ExternalSyntheticLambda0
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return BandSet.lambda$getReferences$0(reference, ints, i);
            }
        });
        return result;
    }

    static /* synthetic */ String lambda$getReferences$0(String[] reference, int[] ints, int i) {
        return reference[ints[i]];
    }

    protected String[][] getReferences(int[][] ints, String[] reference) {
        String[][] result = new String[ints.length][];
        for (int i = 0; i < result.length; i++) {
            result[i] = new String[ints[i].length];
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = reference[ints[i][j]];
            }
        }
        return result;
    }

    public CPClass[] parseCPClassReferences(String name, InputStream in, BHSDCodec codec, int count) throws IOException {
        int[] indices = decodeBandInt(name, in, codec, count);
        CPClass[] result = new CPClass[indices.length];
        for (int i1 = 0; i1 < count; i1++) {
            result[i1] = this.segment.getCpBands().cpClassValue(indices[i1]);
        }
        return result;
    }

    public CPNameAndType[] parseCPDescriptorReferences(String name, InputStream in, BHSDCodec codec, int count) throws IOException {
        CpBands cpBands = this.segment.getCpBands();
        int[] indices = decodeBandInt(name, in, codec, count);
        CPNameAndType[] result = new CPNameAndType[indices.length];
        for (int i1 = 0; i1 < count; i1++) {
            int index = indices[i1];
            result[i1] = cpBands.cpNameAndTypeValue(index);
        }
        return result;
    }

    public CPDouble[] parseCPDoubleReferences(String name, InputStream in, BHSDCodec codec, int count) throws IOException {
        int[] indices = decodeBandInt(name, in, codec, count);
        CPDouble[] result = new CPDouble[indices.length];
        for (int i1 = 0; i1 < count; i1++) {
            result[i1] = this.segment.getCpBands().cpDoubleValue(indices[i1]);
        }
        return result;
    }

    public CPFieldRef[] parseCPFieldRefReferences(String name, InputStream in, BHSDCodec codec, int count) throws IOException {
        CpBands cpBands = this.segment.getCpBands();
        int[] indices = decodeBandInt(name, in, codec, count);
        CPFieldRef[] result = new CPFieldRef[indices.length];
        for (int i1 = 0; i1 < count; i1++) {
            int index = indices[i1];
            result[i1] = cpBands.cpFieldValue(index);
        }
        return result;
    }

    public CPFloat[] parseCPFloatReferences(String name, InputStream in, BHSDCodec codec, int count) throws IOException {
        int[] indices = decodeBandInt(name, in, codec, count);
        CPFloat[] result = new CPFloat[indices.length];
        for (int i1 = 0; i1 < count; i1++) {
            result[i1] = this.segment.getCpBands().cpFloatValue(indices[i1]);
        }
        return result;
    }

    public CPInterfaceMethodRef[] parseCPInterfaceMethodRefReferences(String name, InputStream in, BHSDCodec codec, int count) throws IOException {
        CpBands cpBands = this.segment.getCpBands();
        int[] indices = decodeBandInt(name, in, codec, count);
        CPInterfaceMethodRef[] result = new CPInterfaceMethodRef[indices.length];
        for (int i1 = 0; i1 < count; i1++) {
            result[i1] = cpBands.cpIMethodValue(indices[i1]);
        }
        return result;
    }

    public CPInteger[] parseCPIntReferences(String name, InputStream in, BHSDCodec codec, int count) throws IOException {
        int[] reference = this.segment.getCpBands().getCpInt();
        int[] indices = decodeBandInt(name, in, codec, count);
        CPInteger[] result = new CPInteger[indices.length];
        for (int i1 = 0; i1 < count; i1++) {
            int index = indices[i1];
            if (index < 0 || index >= reference.length) {
                throw new Pack200Exception("Something has gone wrong during parsing references, index = " + index + ", array size = " + reference.length);
            }
            result[i1] = this.segment.getCpBands().cpIntegerValue(index);
        }
        return result;
    }

    public CPLong[] parseCPLongReferences(String name, InputStream in, BHSDCodec codec, int count) throws IOException {
        long[] reference = this.segment.getCpBands().getCpLong();
        int[] indices = decodeBandInt(name, in, codec, count);
        CPLong[] result = new CPLong[indices.length];
        for (int i1 = 0; i1 < count; i1++) {
            int index = indices[i1];
            if (index < 0 || index >= reference.length) {
                throw new Pack200Exception("Something has gone wrong during parsing references, index = " + index + ", array size = " + reference.length);
            }
            result[i1] = this.segment.getCpBands().cpLongValue(index);
        }
        return result;
    }

    public CPMethodRef[] parseCPMethodRefReferences(String name, InputStream in, BHSDCodec codec, int count) throws IOException {
        CpBands cpBands = this.segment.getCpBands();
        int[] indices = decodeBandInt(name, in, codec, count);
        CPMethodRef[] result = new CPMethodRef[indices.length];
        for (int i1 = 0; i1 < count; i1++) {
            result[i1] = cpBands.cpMethodValue(indices[i1]);
        }
        return result;
    }

    public CPUTF8[] parseCPSignatureReferences(String name, InputStream in, BHSDCodec codec, int count) throws IOException {
        int[] indices = decodeBandInt(name, in, codec, count);
        CPUTF8[] result = new CPUTF8[indices.length];
        for (int i1 = 0; i1 < count; i1++) {
            result[i1] = this.segment.getCpBands().cpSignatureValue(indices[i1]);
        }
        return result;
    }

    protected CPUTF8[][] parseCPSignatureReferences(String name, InputStream in, BHSDCodec codec, int[] counts) throws IOException {
        int sum = 0;
        for (int i : counts) {
            sum += i;
        }
        int[] indices = decodeBandInt(name, in, codec, sum);
        CPUTF8[] result1 = new CPUTF8[sum];
        for (int i1 = 0; i1 < sum; i1++) {
            result1[i1] = this.segment.getCpBands().cpSignatureValue(indices[i1]);
        }
        int pos = 0;
        CPUTF8[][] result = new CPUTF8[counts.length][];
        for (int i2 = 0; i2 < counts.length; i2++) {
            int num = counts[i2];
            result[i2] = new CPUTF8[num];
            System.arraycopy(result1, pos, result[i2], 0, num);
            pos += num;
        }
        return result;
    }

    public CPString[] parseCPStringReferences(String name, InputStream in, BHSDCodec codec, int count) throws IOException {
        int[] indices = decodeBandInt(name, in, codec, count);
        CPString[] result = new CPString[indices.length];
        for (int i1 = 0; i1 < count; i1++) {
            result[i1] = this.segment.getCpBands().cpStringValue(indices[i1]);
        }
        return result;
    }

    public CPUTF8[] parseCPUTF8References(String name, InputStream in, BHSDCodec codec, int count) throws IOException {
        int[] indices = decodeBandInt(name, in, codec, count);
        CPUTF8[] result = new CPUTF8[indices.length];
        for (int i1 = 0; i1 < count; i1++) {
            int index = indices[i1];
            result[i1] = this.segment.getCpBands().cpUTF8Value(index);
        }
        return result;
    }

    public CPUTF8[][] parseCPUTF8References(String name, InputStream in, BHSDCodec codec, int[] counts) throws IOException {
        CPUTF8[][] result = new CPUTF8[counts.length][];
        int sum = 0;
        for (int i = 0; i < counts.length; i++) {
            result[i] = new CPUTF8[counts[i]];
            sum += counts[i];
        }
        CPUTF8[] result1 = new CPUTF8[sum];
        int[] indices = decodeBandInt(name, in, codec, sum);
        for (int i1 = 0; i1 < sum; i1++) {
            int index = indices[i1];
            result1[i1] = this.segment.getCpBands().cpUTF8Value(index);
        }
        int pos = 0;
        for (int i2 = 0; i2 < counts.length; i2++) {
            int num = counts[i2];
            result[i2] = new CPUTF8[num];
            System.arraycopy(result1, pos, result[i2], 0, num);
            pos += num;
        }
        return result;
    }

    public long[] parseFlags(String name, InputStream in, int count, BHSDCodec hiCodec, BHSDCodec loCodec) throws IOException {
        return parseFlags(name, in, new int[]{count}, hiCodec, loCodec)[0];
    }

    public long[] parseFlags(String name, InputStream in, int count, BHSDCodec codec, boolean hasHi) throws IOException {
        return parseFlags(name, in, new int[]{count}, hasHi ? codec : null, codec)[0];
    }

    public long[][] parseFlags(String name, InputStream in, int[] counts, BHSDCodec hiCodec, BHSDCodec loCodec) throws IOException {
        int count = counts.length;
        if (count == 0) {
            return new long[][]{new long[0]};
        }
        int sum = 0;
        long[][] result = new long[count][];
        for (int i : counts) {
            sum += i;
        }
        int[] hi = null;
        if (hiCodec != null) {
            hi = decodeBandInt(name, in, hiCodec, sum);
        }
        int[] lo = decodeBandInt(name, in, loCodec, sum);
        int index = 0;
        for (int i2 = 0; i2 < count; i2++) {
            result[i2] = new long[counts[i2]];
            for (int j = 0; j < result[i2].length; j++) {
                if (hi != null) {
                    result[i2][j] = (hi[index] << 32) | (lo[index] & 4294967295L);
                } else {
                    result[i2][j] = lo[index];
                }
                index++;
            }
        }
        return result;
    }

    public long[][] parseFlags(String name, InputStream in, int[] counts, BHSDCodec codec, boolean hasHi) throws IOException {
        return parseFlags(name, in, counts, hasHi ? codec : null, codec);
    }

    public String[] parseReferences(String name, InputStream in, BHSDCodec codec, int count, String[] reference) throws IOException {
        return parseReferences(name, in, codec, new int[]{count}, reference)[0];
    }

    public String[][] parseReferences(String name, InputStream in, BHSDCodec codec, int[] counts, String[] reference) throws IOException {
        int count = counts.length;
        if (count == 0) {
            return new String[][]{new String[0]};
        }
        int sum = 0;
        for (int i : counts) {
            sum += i;
        }
        int[] indices = decodeBandInt(name, in, codec, sum);
        String[] result1 = new String[sum];
        for (int i1 = 0; i1 < sum; i1++) {
            int index = indices[i1];
            if (index < 0 || index >= reference.length) {
                throw new Pack200Exception("Something has gone wrong during parsing references, index = " + index + ", array size = " + reference.length);
            }
            result1[i1] = reference[index];
        }
        String[][] result = new String[count][];
        int pos = 0;
        for (int i2 = 0; i2 < count; i2++) {
            int num = counts[i2];
            result[i2] = new String[num];
            System.arraycopy(result1, pos, result[i2], 0, num);
            pos += num;
        }
        return result;
    }

    public void unpack(InputStream in) throws IOException {
        read(in);
        unpack();
    }
}
