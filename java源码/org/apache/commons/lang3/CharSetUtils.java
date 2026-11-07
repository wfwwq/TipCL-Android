package org.apache.commons.lang3;

import java.util.function.Predicate;

/* loaded from: classes24.dex */
public class CharSetUtils {
    public static boolean containsAny(String str, String... set) {
        if (StringUtils.isEmpty(str) || deepEmpty(set)) {
            return false;
        }
        CharSet chars = CharSet.getInstance(set);
        for (char c : str.toCharArray()) {
            if (chars.contains(c)) {
                return true;
            }
        }
        return false;
    }

    public static int count(String str, String... set) {
        if (StringUtils.isEmpty(str) || deepEmpty(set)) {
            return 0;
        }
        CharSet chars = CharSet.getInstance(set);
        int count = 0;
        for (char c : str.toCharArray()) {
            if (chars.contains(c)) {
                count++;
            }
        }
        return count;
    }

    private static boolean deepEmpty(String[] strings) {
        return org.apache.commons.lang3.stream.Streams.of(strings).allMatch(new Predicate() { // from class: org.apache.commons.lang3.CharSetUtils$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return StringUtils.isEmpty((String) obj);
            }
        });
    }

    public static String delete(String str, String... set) {
        if (StringUtils.isEmpty(str) || deepEmpty(set)) {
            return str;
        }
        return modify(str, set, false);
    }

    public static String keep(String str, String... set) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty() || deepEmpty(set)) {
            return "";
        }
        return modify(str, set, true);
    }

    private static String modify(String str, String[] set, boolean expect) {
        CharSet chars = CharSet.getInstance(set);
        StringBuilder buffer = new StringBuilder(str.length());
        char[] chrs = str.toCharArray();
        for (char chr : chrs) {
            if (chars.contains(chr) == expect) {
                buffer.append(chr);
            }
        }
        return buffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e A[PHI: r6
  0x004e: PHI (r6v2 'notInChars' java.lang.Character) = 
  (r6v1 'notInChars' java.lang.Character)
  (r6v4 'notInChars' java.lang.Character)
  (r6v1 'notInChars' java.lang.Character)
 binds: [B:10:0x002c, B:21:0x004a, B:17:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String squeeze(java.lang.String r10, java.lang.String... r11) {
        /*
            boolean r0 = org.apache.commons.lang3.StringUtils.isEmpty(r10)
            if (r0 != 0) goto L5a
            boolean r0 = deepEmpty(r11)
            if (r0 == 0) goto Ld
            goto L5a
        Ld:
            org.apache.commons.lang3.CharSet r0 = org.apache.commons.lang3.CharSet.getInstance(r11)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r2 = r10.length()
            r1.<init>(r2)
            char[] r2 = r10.toCharArray()
            int r3 = r2.length
            r4 = 0
            char r4 = r2[r4]
            r5 = 0
            r6 = 0
            r1.append(r4)
            r7 = 1
        L28:
            if (r7 >= r3) goto L55
            char r8 = r2[r7]
            if (r8 != r4) goto L4e
            if (r5 == 0) goto L37
            char r9 = r5.charValue()
            if (r8 != r9) goto L37
            goto L52
        L37:
            if (r6 == 0) goto L3f
            char r9 = r6.charValue()
            if (r8 == r9) goto L4e
        L3f:
            boolean r9 = r0.contains(r8)
            if (r9 == 0) goto L4a
            java.lang.Character r5 = java.lang.Character.valueOf(r8)
            goto L52
        L4a:
            java.lang.Character r6 = java.lang.Character.valueOf(r8)
        L4e:
            r1.append(r8)
            r4 = r8
        L52:
            int r7 = r7 + 1
            goto L28
        L55:
            java.lang.String r7 = r1.toString()
            return r7
        L5a:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.CharSetUtils.squeeze(java.lang.String, java.lang.String[]):java.lang.String");
    }
}
