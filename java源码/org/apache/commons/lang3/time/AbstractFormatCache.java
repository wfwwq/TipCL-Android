package org.apache.commons.lang3.time;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import org.apache.commons.lang3.LocaleUtils;
import org.apache.commons.lang3.time.AbstractFormatCache;

/* loaded from: classes24.dex */
abstract class AbstractFormatCache<F extends Format> {
    static final int NONE = -1;
    private static final ConcurrentMap<ArrayKey, String> cDateTimeInstanceCache = new ConcurrentHashMap(7);
    private final ConcurrentMap<ArrayKey, F> cInstanceCache = new ConcurrentHashMap(7);

    protected abstract F createInstance(String str, TimeZone timeZone, Locale locale);

    AbstractFormatCache() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class ArrayKey {
        private final int hashCode;
        private final Object[] keys;

        private static int computeHashCode(Object[] keys) {
            int result = (1 * 31) + Arrays.hashCode(keys);
            return result;
        }

        ArrayKey(Object... keys) {
            this.keys = keys;
            this.hashCode = computeHashCode(keys);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ArrayKey other = (ArrayKey) obj;
            return Arrays.deepEquals(this.keys, other.keys);
        }

        public int hashCode() {
            return this.hashCode;
        }
    }

    static String getPatternForStyle(final Integer dateStyle, final Integer timeStyle, Locale locale) {
        final Locale safeLocale = LocaleUtils.toLocale(locale);
        ArrayKey key = new ArrayKey(dateStyle, timeStyle, safeLocale);
        return cDateTimeInstanceCache.computeIfAbsent(key, new Function() { // from class: org.apache.commons.lang3.time.AbstractFormatCache$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return AbstractFormatCache.lambda$getPatternForStyle$0(dateStyle, timeStyle, safeLocale, (AbstractFormatCache.ArrayKey) obj);
            }
        });
    }

    static /* synthetic */ String lambda$getPatternForStyle$0(Integer dateStyle, Integer timeStyle, Locale safeLocale, ArrayKey k) {
        DateFormat formatter;
        try {
            if (dateStyle == null) {
                formatter = DateFormat.getTimeInstance(timeStyle.intValue(), safeLocale);
            } else if (timeStyle == null) {
                formatter = DateFormat.getDateInstance(dateStyle.intValue(), safeLocale);
            } else {
                formatter = DateFormat.getDateTimeInstance(dateStyle.intValue(), timeStyle.intValue(), safeLocale);
            }
            return ((SimpleDateFormat) formatter).toPattern();
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("No date time pattern for locale: " + safeLocale);
        }
    }

    F getDateInstance(int i, TimeZone timeZone, Locale locale) {
        return (F) getDateTimeInstance(Integer.valueOf(i), (Integer) null, timeZone, locale);
    }

    F getDateTimeInstance(int i, int i2, TimeZone timeZone, Locale locale) {
        return (F) getDateTimeInstance(Integer.valueOf(i), Integer.valueOf(i2), timeZone, locale);
    }

    private F getDateTimeInstance(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        Locale locale2 = LocaleUtils.toLocale(locale);
        return (F) getInstance(getPatternForStyle(num, num2, locale2), timeZone, locale2);
    }

    public F getInstance() {
        return (F) getDateTimeInstance(3, 3, TimeZone.getDefault(), Locale.getDefault());
    }

    public F getInstance(final String pattern, TimeZone timeZone, Locale locale) {
        Objects.requireNonNull(pattern, "pattern");
        final TimeZone actualTimeZone = TimeZones.toTimeZone(timeZone);
        final Locale actualLocale = LocaleUtils.toLocale(locale);
        ArrayKey key = new ArrayKey(pattern, actualTimeZone, actualLocale);
        return this.cInstanceCache.computeIfAbsent(key, new Function() { // from class: org.apache.commons.lang3.time.AbstractFormatCache$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f$0.m9934xcaeba003(pattern, actualTimeZone, actualLocale, (AbstractFormatCache.ArrayKey) obj);
            }
        });
    }

    /* renamed from: lambda$getInstance$1$org-apache-commons-lang3-time-AbstractFormatCache, reason: not valid java name */
    /* synthetic */ Format m9934xcaeba003(String pattern, TimeZone actualTimeZone, Locale actualLocale, ArrayKey k) {
        return createInstance(pattern, actualTimeZone, actualLocale);
    }

    F getTimeInstance(int i, TimeZone timeZone, Locale locale) {
        return (F) getDateTimeInstance((Integer) null, Integer.valueOf(i), timeZone, locale);
    }
}
