package org.apache.commons.lang3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: classes24.dex */
public class EnumUtils {
    private static final String CANNOT_STORE_S_S_VALUES_IN_S_BITS = "Cannot store %s %s values in %s bits";
    private static final String ENUM_CLASS_MUST_BE_DEFINED = "EnumClass must be defined.";
    private static final String NULL_ELEMENTS_NOT_PERMITTED = "null elements not permitted";
    private static final String S_DOES_NOT_SEEM_TO_BE_AN_ENUM_TYPE = "%s does not seem to be an Enum type";

    private static <E extends Enum<E>> Class<E> asEnum(Class<E> enumClass) {
        Objects.requireNonNull(enumClass, ENUM_CLASS_MUST_BE_DEFINED);
        Validate.isTrue(enumClass.isEnum(), S_DOES_NOT_SEEM_TO_BE_AN_ENUM_TYPE, enumClass);
        return enumClass;
    }

    private static <E extends Enum<E>> Class<E> checkBitVectorable(Class<E> enumClass) {
        Enum[] enumArr = (Enum[]) asEnum(enumClass).getEnumConstants();
        Validate.isTrue(enumArr.length <= 64, CANNOT_STORE_S_S_VALUES_IN_S_BITS, Integer.valueOf(enumArr.length), enumClass.getSimpleName(), 64);
        return enumClass;
    }

    @SafeVarargs
    public static <E extends Enum<E>> long generateBitVector(Class<E> enumClass, E... values) {
        Validate.noNullElements(values);
        return generateBitVector(enumClass, Arrays.asList(values));
    }

    public static <E extends Enum<E>> long generateBitVector(Class<E> enumClass, Iterable<? extends E> values) {
        checkBitVectorable(enumClass);
        Objects.requireNonNull(values, "values");
        long total = 0;
        for (E constant : values) {
            Objects.requireNonNull(constant, NULL_ELEMENTS_NOT_PERMITTED);
            total |= 1 << constant.ordinal();
        }
        return total;
    }

    @SafeVarargs
    public static <E extends Enum<E>> long[] generateBitVectors(Class<E> enumClass, E... values) {
        asEnum(enumClass);
        Validate.noNullElements(values);
        EnumSet<E> condensed = EnumSet.noneOf(enumClass);
        Collections.addAll(condensed, values);
        long[] result = new long[((enumClass.getEnumConstants().length - 1) / 64) + 1];
        Iterator it = condensed.iterator();
        while (it.hasNext()) {
            Enum r3 = (Enum) it.next();
            int iOrdinal = r3.ordinal() / 64;
            result[iOrdinal] = result[iOrdinal] | (1 << (r3.ordinal() % 64));
        }
        ArrayUtils.reverse(result);
        return result;
    }

    public static <E extends Enum<E>> long[] generateBitVectors(Class<E> enumClass, Iterable<? extends E> values) {
        asEnum(enumClass);
        Objects.requireNonNull(values, "values");
        final EnumSet<E> condensed = EnumSet.noneOf(enumClass);
        values.forEach(new Consumer() { // from class: org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                condensed.add((Enum) Objects.requireNonNull((Enum) obj, EnumUtils.NULL_ELEMENTS_NOT_PERMITTED));
            }
        });
        long[] result = new long[((enumClass.getEnumConstants().length - 1) / 64) + 1];
        Iterator it = condensed.iterator();
        while (it.hasNext()) {
            Enum r3 = (Enum) it.next();
            int iOrdinal = r3.ordinal() / 64;
            result[iOrdinal] = result[iOrdinal] | (1 << (r3.ordinal() % 64));
        }
        ArrayUtils.reverse(result);
        return result;
    }

    public static <E extends Enum<E>> E getEnum(Class<E> cls, String str) {
        return (E) getEnum(cls, str, null);
    }

    public static <E extends Enum<E>> E getEnum(Class<E> cls, String str, E e) {
        if (str == null) {
            return e;
        }
        try {
            return (E) Enum.valueOf(cls, str);
        } catch (IllegalArgumentException e2) {
            return e;
        }
    }

    public static <E extends Enum<E>> E getEnumIgnoreCase(Class<E> cls, String str) {
        return (E) getEnumIgnoreCase(cls, str, null);
    }

    public static <E extends Enum<E>> E getEnumIgnoreCase(Class<E> cls, String str, E e) {
        return (E) getFirstEnumIgnoreCase(cls, str, new EnumUtils$$ExternalSyntheticLambda2(), e);
    }

    public static <E extends Enum<E>> List<E> getEnumList(Class<E> enumClass) {
        return new ArrayList(Arrays.asList(enumClass.getEnumConstants()));
    }

    public static <E extends Enum<E>> Map<String, E> getEnumMap(Class<E> enumClass) {
        return getEnumMap(enumClass, new EnumUtils$$ExternalSyntheticLambda2());
    }

    public static <E extends Enum<E>, K> Map<K, E> getEnumMap(Class<E> enumClass, final Function<E, K> keyFunction) {
        Stream streamOf = Stream.of((Object[]) enumClass.getEnumConstants());
        Objects.requireNonNull(keyFunction);
        return (Map) streamOf.collect(Collectors.toMap(new Function() { // from class: org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return keyFunction.apply((Enum) obj);
            }
        }, Function.identity()));
    }

    public static <E extends Enum<E>> E getEnumSystemProperty(Class<E> cls, String str, E e) {
        if (cls == null || str == null) {
            return e;
        }
        return (E) getEnum(cls, System.getProperty(str), e);
    }

    public static <E extends Enum<E>> E getFirstEnumIgnoreCase(Class<E> enumClass, final String enumName, final Function<E, String> stringFunction, E defaultEnum) {
        if (enumName == null || !enumClass.isEnum()) {
            return defaultEnum;
        }
        return (E) Stream.of((Object[]) enumClass.getEnumConstants()).filter(new Predicate() { // from class: org.apache.commons.lang3.EnumUtils$$ExternalSyntheticLambda1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return enumName.equalsIgnoreCase((String) stringFunction.apply((Enum) obj));
            }
        }).findFirst().orElse(defaultEnum);
    }

    public static <E extends Enum<E>> boolean isValidEnum(Class<E> enumClass, String enumName) {
        return getEnum(enumClass, enumName) != null;
    }

    public static <E extends Enum<E>> boolean isValidEnumIgnoreCase(Class<E> enumClass, String enumName) {
        return getEnumIgnoreCase(enumClass, enumName) != null;
    }

    public static <E extends Enum<E>> EnumSet<E> processBitVector(Class<E> enumClass, long value) {
        checkBitVectorable(enumClass).getEnumConstants();
        return processBitVectors(enumClass, value);
    }

    public static <E extends Enum<E>> EnumSet<E> processBitVectors(Class<E> enumClass, long... values) {
        EnumSet<E> results = EnumSet.noneOf(asEnum(enumClass));
        long[] lvalues = ArrayUtils.clone((long[]) Objects.requireNonNull(values, "values"));
        ArrayUtils.reverse(lvalues);
        for (E constant : enumClass.getEnumConstants()) {
            int block = constant.ordinal() / 64;
            if (block < lvalues.length && (lvalues[block] & (1 << (constant.ordinal() % 64))) != 0) {
                results.add(constant);
            }
        }
        return results;
    }
}
