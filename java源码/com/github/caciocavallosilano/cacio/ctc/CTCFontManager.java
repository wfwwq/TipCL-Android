package com.github.caciocavallosilano.cacio.ctc;

import androidx.core.text.util.LocalePreferences;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.plaf.FontUIResource;
import sun.awt.FcFontManager;
import sun.awt.FontConfiguration;
import sun.font.CompositeFont;
import sun.font.FcFontConfiguration;
import sun.font.FontAccess;
import sun.font.FontUtilities;
import sun.font.MFontConfiguration;
import sun.font.NativeFont;
import sun.font.SunFontManager;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/CTCFontManager.class */
public final class CTCFontManager extends FcFontManager {
    private static final int FOUNDRY_FIELD = 1;
    private static final int FAMILY_NAME_FIELD = 2;
    private static final int WEIGHT_NAME_FIELD = 3;
    private static final int SLANT_FIELD = 4;
    private static final int SETWIDTH_NAME_FIELD = 5;
    private static final int ADD_STYLE_NAME_FIELD = 6;
    private static final int PIXEL_SIZE_FIELD = 7;
    private static final int POINT_SIZE_FIELD = 8;
    private static final int RESOLUTION_X_FIELD = 9;
    private static final int RESOLUTION_Y_FIELD = 10;
    private static final int SPACING_FIELD = 11;
    private static final int AVERAGE_WIDTH_FIELD = 12;
    private static final int CHARSET_REGISTRY_FIELD = 13;
    private static final int CHARSET_ENCODING_FIELD = 14;
    private static Map xFontDirsMap;
    HashMap<String, String> oblmap = null;
    private static Map fontNameMap = new HashMap();
    private static Map xlfdMap = new HashMap();
    private static HashSet<String> fontConfigDirs = null;
    private static HashMap registeredDirs = new HashMap();
    private static String[] fontdirs = null;

    public static CTCFontManager getInstance() {
        return SunFontManager.getInstance();
    }

    public String getFileNameFromPlatformName(String platName) {
        if (platName.startsWith("/")) {
            return platName;
        }
        String fontID = specificFontIDForName(platName);
        String fileName = super.getFileNameFromPlatformName(platName);
        if (fileName != null) {
            if (isHeadless() && fileName.startsWith("-")) {
                return null;
            }
            if (fileName.startsWith("/")) {
                Vector xVal = (Vector) xlfdMap.get(fileName);
                if (xVal == null) {
                    if (getFontConfiguration().needToSearchForFile(fileName)) {
                        fileName = null;
                    }
                    if (fileName != null) {
                        Vector xVal2 = new Vector();
                        xVal2.add(platName);
                        xlfdMap.put(fileName, xVal2);
                    }
                } else if (!xVal.contains(platName)) {
                    xVal.add(platName);
                }
            }
            if (fileName != null) {
                fontNameMap.put(fontID, fileName);
                return fileName;
            }
        }
        if (fontID != null) {
            fileName = (String) fontNameMap.get(fontID);
            if (this.fontPath == null && (fileName == null || !fileName.startsWith("/"))) {
                if (FontUtilities.debugFonts()) {
                    System.out.println("** Registering all font paths because can't find file for " + ((Object) platName));
                }
                this.fontPath = getPlatformFontPath(noType1Font);
                if (this.fontPath == null) {
                    this.fontPath = System.getProperty("cacio.font.path", ((Object) System.getProperty("java.home")) + "/lib/fonts");
                }
                registerFontDirs(this.fontPath);
                if (FontUtilities.debugFonts()) {
                    System.out.println("** Finished registering all font paths");
                }
                fileName = (String) fontNameMap.get(fontID);
            }
            if (fileName == null && !isHeadless()) {
                fileName = getCacioFontName(platName);
            }
            if (fileName == null) {
                fontID = switchFontIDForName(platName);
                fileName = (String) fontNameMap.get(fontID);
            }
            if (fileName != null) {
                fontNameMap.put(fontID, fileName);
            }
        }
        return fileName;
    }

    protected String[] getNativeNames(String fontFileName, String platformName) {
        Vector nativeNames = (Vector) xlfdMap.get(fontFileName);
        if (nativeNames == null) {
            if (platformName == null) {
                return null;
            }
            String[] natNames = {platformName};
            return natNames;
        }
        int len = nativeNames.size();
        return (String[]) nativeNames.toArray(new String[len]);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x031c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x031f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018c A[Catch: IOException -> 0x0339, all -> 0x034b, TryCatch #6 {IOException -> 0x0339, all -> 0x034b, blocks: (B:6:0x004e, B:8:0x0055, B:10:0x008a, B:12:0x00a0, B:15:0x00cb, B:21:0x00e5, B:23:0x00f6, B:68:0x031f, B:26:0x010a, B:28:0x0118, B:31:0x012c, B:33:0x0147, B:36:0x0156, B:37:0x0161, B:39:0x018c, B:41:0x01eb, B:43:0x01fd, B:44:0x0207, B:47:0x0246, B:49:0x025b, B:52:0x0291, B:56:0x02a0, B:58:0x02aa, B:60:0x02b0, B:61:0x02de, B:63:0x02f0, B:64:0x0306, B:65:0x030e, B:46:0x021f, B:69:0x0325), top: B:97:0x004e, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fd A[Catch: IOException -> 0x021d, IOException -> 0x0339, all -> 0x034b, TryCatch #5 {IOException -> 0x021d, blocks: (B:41:0x01eb, B:43:0x01fd, B:44:0x0207), top: B:95:0x01eb, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x025b A[Catch: IOException -> 0x0339, all -> 0x034b, TryCatch #6 {IOException -> 0x0339, all -> 0x034b, blocks: (B:6:0x004e, B:8:0x0055, B:10:0x008a, B:12:0x00a0, B:15:0x00cb, B:21:0x00e5, B:23:0x00f6, B:68:0x031f, B:26:0x010a, B:28:0x0118, B:31:0x012c, B:33:0x0147, B:36:0x0156, B:37:0x0161, B:39:0x018c, B:41:0x01eb, B:43:0x01fd, B:44:0x0207, B:47:0x0246, B:49:0x025b, B:52:0x0291, B:56:0x02a0, B:58:0x02aa, B:60:0x02b0, B:61:0x02de, B:63:0x02f0, B:64:0x0306, B:65:0x030e, B:46:0x021f, B:69:0x0325), top: B:97:0x004e, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02b0 A[Catch: IOException -> 0x0339, all -> 0x034b, TryCatch #6 {IOException -> 0x0339, all -> 0x034b, blocks: (B:6:0x004e, B:8:0x0055, B:10:0x008a, B:12:0x00a0, B:15:0x00cb, B:21:0x00e5, B:23:0x00f6, B:68:0x031f, B:26:0x010a, B:28:0x0118, B:31:0x012c, B:33:0x0147, B:36:0x0156, B:37:0x0161, B:39:0x018c, B:41:0x01eb, B:43:0x01fd, B:44:0x0207, B:47:0x0246, B:49:0x025b, B:52:0x0291, B:56:0x02a0, B:58:0x02aa, B:60:0x02b0, B:61:0x02de, B:63:0x02f0, B:64:0x0306, B:65:0x030e, B:46:0x021f, B:69:0x0325), top: B:97:0x004e, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02f0 A[Catch: IOException -> 0x0339, all -> 0x034b, TryCatch #6 {IOException -> 0x0339, all -> 0x034b, blocks: (B:6:0x004e, B:8:0x0055, B:10:0x008a, B:12:0x00a0, B:15:0x00cb, B:21:0x00e5, B:23:0x00f6, B:68:0x031f, B:26:0x010a, B:28:0x0118, B:31:0x012c, B:33:0x0147, B:36:0x0156, B:37:0x0161, B:39:0x018c, B:41:0x01eb, B:43:0x01fd, B:44:0x0207, B:47:0x0246, B:49:0x025b, B:52:0x0291, B:56:0x02a0, B:58:0x02aa, B:60:0x02b0, B:61:0x02de, B:63:0x02f0, B:64:0x0306, B:65:0x030e, B:46:0x021f, B:69:0x0325), top: B:97:0x004e, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void registerFontDir(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.caciocavallosilano.cacio.ctc.CTCFontManager.registerFontDir(java.lang.String):void");
    }

    public void loadFonts() {
        super.loadFonts();
        xFontDirsMap = null;
        xlfdMap = new HashMap(1);
        fontNameMap = new HashMap(1);
    }

    private String getObliqueLucidaFontID(String fontID) {
        if (fontID.startsWith("-lucidasans-medium-i-normal") || fontID.startsWith("-lucidasans-bold-i-normal") || fontID.startsWith("-lucidatypewriter-medium-i-normal") || fontID.startsWith("-lucidatypewriter-bold-i-normal")) {
            return fontID.substring(0, fontID.indexOf("-i-"));
        }
        return null;
    }

    private static String getCacioFontName(String platName) {
        String xlfd = platName.replaceAll("%d", "*");
        if (NativeFont.fontExists(xlfd)) {
            return xlfd;
        }
        return null;
    }

    private void initObliqueLucidaFontMap() {
        this.oblmap = new HashMap<>();
        this.oblmap.put("-lucidasans-medium", ((Object) jreLibDirName) + "/fonts/LucidaSansRegular.ttf");
        this.oblmap.put("-lucidasans-bold", ((Object) jreLibDirName) + "/fonts/LucidaSansDemiBold.ttf");
        this.oblmap.put("-lucidatypewriter-medium", ((Object) jreLibDirName) + "/fonts/LucidaTypewriterRegular.ttf");
        this.oblmap.put("-lucidatypewriter-bold", ((Object) jreLibDirName) + "/fonts/LucidaTypewriterBold.ttf");
    }

    private boolean isHeadless() {
        return true;
    }

    private String specificFontIDForName(String name) {
        int[] hPos = new int[14];
        int hyphenCnt = 1;
        int pos = 1;
        while (pos != -1 && hyphenCnt < 14) {
            pos = name.indexOf(45, pos);
            if (pos != -1) {
                int i = hyphenCnt;
                hyphenCnt++;
                hPos[i] = pos;
                pos++;
            }
        }
        if (hyphenCnt != 14) {
            if (FontUtilities.debugFonts()) {
                System.out.println("Font Configuration Font ID is malformed:" + ((Object) name));
            }
            return name;
        }
        StringBuffer sb = new StringBuffer(name.substring(hPos[1], hPos[5]));
        sb.append(name.substring(hPos[12]));
        String retval = sb.toString().toLowerCase(Locale.ENGLISH);
        return retval;
    }

    private String switchFontIDForName(String name) {
        int[] hPos = new int[14];
        int hyphenCnt = 1;
        int pos = 1;
        while (pos != -1 && hyphenCnt < 14) {
            pos = name.indexOf(45, pos);
            if (pos != -1) {
                int i = hyphenCnt;
                hyphenCnt++;
                hPos[i] = pos;
                pos++;
            }
        }
        if (hyphenCnt != 14) {
            if (FontUtilities.debugFonts()) {
                System.out.println("Font Configuration Font ID is malformed:" + ((Object) name));
            }
            return name;
        }
        String slant = name.substring(hPos[3] + 1, hPos[4]);
        String family = name.substring(hPos[1] + 1, hPos[2]);
        String registry = name.substring(hPos[12] + 1, hPos[13]);
        String encoding = name.substring(hPos[13] + 1);
        if (slant.equals("i")) {
            slant = "o";
        } else if (slant.equals("o")) {
            slant = "i";
        }
        if (family.equals("itc zapfdingbats") && registry.equals(LocalePreferences.FirstDayOfWeek.SUNDAY) && encoding.equals("fontspecific")) {
            registry = "adobe";
        }
        StringBuffer sb = new StringBuffer(name.substring(hPos[1], hPos[3] + 1));
        sb.append(slant);
        sb.append(name.substring(hPos[4], hPos[5] + 1));
        sb.append(registry);
        sb.append(name.substring(hPos[13]));
        String retval = sb.toString().toLowerCase(Locale.ENGLISH);
        return retval;
    }

    public String getFileNameFromXLFD(String name) {
        String fileName = null;
        String fontID = specificFontIDForName(name);
        if (fontID != null) {
            fileName = (String) fontNameMap.get(fontID);
            if (fileName == null) {
                fileName = (String) fontNameMap.get(switchFontIDForName(name));
            }
            if (fileName == null) {
                fileName = getDefaultFontFile();
            }
        }
        return fileName;
    }

    protected void registerFontDirs(String pathName) {
        StringTokenizer parser = new StringTokenizer(pathName, File.pathSeparator);
        while (parser.hasMoreTokens()) {
            try {
                String dirPath = parser.nextToken();
                if (dirPath != null && !registeredDirs.containsKey(dirPath)) {
                    registeredDirs.put(dirPath, null);
                    registerFontDir(dirPath);
                }
            } catch (NoSuchElementException e) {
                return;
            }
        }
    }

    protected void addFontToPlatformFontPath(String platformName) {
        getPlatformFontPathFromFontConfig();
        if (xFontDirsMap != null) {
            String fontID = specificFontIDForName(platformName);
            String dirName = (String) xFontDirsMap.get(fontID);
            if (dirName != null) {
                fontConfigDirs.add(dirName);
            }
        }
    }

    private void getPlatformFontPathFromFontConfig() {
        if (fontConfigDirs == null) {
            fontConfigDirs = getFontConfiguration().getAWTFontPathSet();
            if (FontUtilities.debugFonts() && fontConfigDirs != null) {
                String[] names = (String[]) fontConfigDirs.toArray(new String[0]);
                for (String str : names) {
                    System.out.println("awtfontpath : " + ((Object) str));
                }
            }
        }
    }

    protected void registerPlatformFontsUsedByFontConfiguration() {
        getPlatformFontPathFromFontConfig();
        if (fontConfigDirs == null) {
            return;
        }
        if (FontUtilities.isLinux) {
            fontConfigDirs.add(((Object) jreLibDirName) + ((Object) File.separator) + "oblique-fonts");
        }
        fontdirs = (String[]) fontConfigDirs.toArray(new String[0]);
    }

    protected FontConfiguration createFontConfiguration() {
        MFontConfiguration mFontConfiguration = new MFontConfiguration(this);
        if (FontUtilities.isLinux && (!mFontConfiguration.foundOsSpecificFile() || !mFontConfiguration.fontFilesArePresent())) {
            FcFontConfiguration fcFontConfig = new FcFontConfiguration(this);
            if (fcFontConfig.init()) {
                return fcFontConfig;
            }
        }
        mFontConfiguration.init();
        return mFontConfiguration;
    }

    public FontConfiguration createFontConfiguration(boolean preferLocaleFonts, boolean preferPropFonts) {
        return new MFontConfiguration(this, preferLocaleFonts, preferPropFonts);
    }

    protected synchronized String getFontPath(boolean noType1Fonts) {
        isHeadless();
        return super.getFontPath(noType1Fonts);
    }

    protected FontUIResource getFontConfigFUIR(String family, int style, int size) {
        CompositeFont font2D = getFontConfigManager().getFontConfigFont(family, style);
        if (font2D == null) {
            return new FontUIResource(family, style, size);
        }
        FontUIResource fuir = new FontUIResource(font2D.getFamilyName((Locale) null), style, size);
        FontAccess.getFontAccess().setFont2D(fuir, font2D.handle);
        FontAccess.getFontAccess().setCreatedFont(fuir);
        return fuir;
    }
}
