package org.apache.commons.lang3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes24.dex */
public class RegExUtils {
    public static Pattern dotAll(String regex) {
        return Pattern.compile(regex, 32);
    }

    public static Matcher dotAllMatcher(String regex, String text) {
        return dotAll(regex).matcher(text);
    }

    public static String removeAll(String text, Pattern regex) {
        return replaceAll(text, regex, "");
    }

    public static String removeAll(String text, String regex) {
        return replaceAll(text, regex, "");
    }

    public static String removeFirst(String text, Pattern regex) {
        return replaceFirst(text, regex, "");
    }

    public static String removeFirst(String text, String regex) {
        return replaceFirst(text, regex, "");
    }

    public static String removePattern(String text, String regex) {
        return replacePattern(text, regex, "");
    }

    public static String replaceAll(String text, Pattern regex, String replacement) {
        if (ObjectUtils.anyNull(text, regex, replacement)) {
            return text;
        }
        return regex.matcher(text).replaceAll(replacement);
    }

    public static String replaceAll(String text, String regex, String replacement) {
        if (ObjectUtils.anyNull(text, regex, replacement)) {
            return text;
        }
        return text.replaceAll(regex, replacement);
    }

    public static String replaceFirst(String text, Pattern regex, String replacement) {
        if (text == null || regex == null || replacement == null) {
            return text;
        }
        return regex.matcher(text).replaceFirst(replacement);
    }

    public static String replaceFirst(String text, String regex, String replacement) {
        if (text == null || regex == null || replacement == null) {
            return text;
        }
        return text.replaceFirst(regex, replacement);
    }

    public static String replacePattern(String text, String regex, String replacement) {
        if (ObjectUtils.anyNull(text, regex, replacement)) {
            return text;
        }
        return dotAllMatcher(regex, text).replaceAll(replacement);
    }
}
