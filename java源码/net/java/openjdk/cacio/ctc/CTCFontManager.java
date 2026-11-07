package net.java.openjdk.cacio.ctc;

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
import sun.awt.motif.MFontConfiguration;
import sun.font.CompositeFont;
import sun.font.FcFontConfiguration;
import sun.font.FontAccess;
import sun.font.FontUtilities;
import sun.font.NativeFont;
import sun.font.SunFontManager;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-androidnw-1.10-SNAPSHOT.jar:net/java/openjdk/cacio/ctc/CTCFontManager.class */
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
            if (fileName == null && FontUtilities.isLinux && !isOpenJDK()) {
                if (this.oblmap == null) {
                    initObliqueLucidaFontMap();
                }
                String oblkey = getObliqueLucidaFontID(fontID);
                if (oblkey != null) {
                    fileName = this.oblmap.get(oblkey);
                }
            }
            if (this.fontPath == null && (fileName == null || !fileName.startsWith("/"))) {
                if (FontUtilities.debugFonts()) {
                    System.out.println("** Registering all font paths because can't find file for " + platName);
                }
                this.fontPath = getPlatformFontPath(noType1Font);
                if (this.fontPath == null) {
                    this.fontPath = System.getProperty("cacio.font.path", System.getProperty("java.home") + "/lib/fonts");
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0180 A[Catch: IOException -> 0x02f6, all -> 0x0308, TryCatch #6 {IOException -> 0x02f6, all -> 0x0308, blocks: (B:6:0x0042, B:8:0x0049, B:10:0x007e, B:12:0x0094, B:15:0x00bf, B:21:0x00d9, B:23:0x00ea, B:68:0x02dc, B:26:0x00fe, B:28:0x010c, B:31:0x0120, B:33:0x013b, B:36:0x014a, B:37:0x0155, B:39:0x0180, B:41:0x01cb, B:43:0x01dd, B:44:0x01e7, B:47:0x021a, B:49:0x022f, B:52:0x0258, B:56:0x0267, B:58:0x0271, B:60:0x0277, B:61:0x029b, B:63:0x02ad, B:64:0x02c3, B:65:0x02cb, B:46:0x01ff, B:69:0x02e2), top: B:97:0x0042, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01dd A[Catch: IOException -> 0x01fd, IOException -> 0x02f6, all -> 0x0308, TryCatch #5 {IOException -> 0x01fd, blocks: (B:41:0x01cb, B:43:0x01dd, B:44:0x01e7), top: B:95:0x01cb, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022f A[Catch: IOException -> 0x02f6, all -> 0x0308, TryCatch #6 {IOException -> 0x02f6, all -> 0x0308, blocks: (B:6:0x0042, B:8:0x0049, B:10:0x007e, B:12:0x0094, B:15:0x00bf, B:21:0x00d9, B:23:0x00ea, B:68:0x02dc, B:26:0x00fe, B:28:0x010c, B:31:0x0120, B:33:0x013b, B:36:0x014a, B:37:0x0155, B:39:0x0180, B:41:0x01cb, B:43:0x01dd, B:44:0x01e7, B:47:0x021a, B:49:0x022f, B:52:0x0258, B:56:0x0267, B:58:0x0271, B:60:0x0277, B:61:0x029b, B:63:0x02ad, B:64:0x02c3, B:65:0x02cb, B:46:0x01ff, B:69:0x02e2), top: B:97:0x0042, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0277 A[Catch: IOException -> 0x02f6, all -> 0x0308, TryCatch #6 {IOException -> 0x02f6, all -> 0x0308, blocks: (B:6:0x0042, B:8:0x0049, B:10:0x007e, B:12:0x0094, B:15:0x00bf, B:21:0x00d9, B:23:0x00ea, B:68:0x02dc, B:26:0x00fe, B:28:0x010c, B:31:0x0120, B:33:0x013b, B:36:0x014a, B:37:0x0155, B:39:0x0180, B:41:0x01cb, B:43:0x01dd, B:44:0x01e7, B:47:0x021a, B:49:0x022f, B:52:0x0258, B:56:0x0267, B:58:0x0271, B:60:0x0277, B:61:0x029b, B:63:0x02ad, B:64:0x02c3, B:65:0x02cb, B:46:0x01ff, B:69:0x02e2), top: B:97:0x0042, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ad A[Catch: IOException -> 0x02f6, all -> 0x0308, TryCatch #6 {IOException -> 0x02f6, all -> 0x0308, blocks: (B:6:0x0042, B:8:0x0049, B:10:0x007e, B:12:0x0094, B:15:0x00bf, B:21:0x00d9, B:23:0x00ea, B:68:0x02dc, B:26:0x00fe, B:28:0x010c, B:31:0x0120, B:33:0x013b, B:36:0x014a, B:37:0x0155, B:39:0x0180, B:41:0x01cb, B:43:0x01dd, B:44:0x01e7, B:47:0x021a, B:49:0x022f, B:52:0x0258, B:56:0x0267, B:58:0x0271, B:60:0x0277, B:61:0x029b, B:63:0x02ad, B:64:0x02c3, B:65:0x02cb, B:46:0x01ff, B:69:0x02e2), top: B:97:0x0042, inners: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void registerFontDir(java.lang.String r6) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.java.openjdk.cacio.ctc.CTCFontManager.registerFontDir(java.lang.String):void");
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
        this.oblmap.put("-lucidasans-medium", jreLibDirName + "/fonts/LucidaSansRegular.ttf");
        this.oblmap.put("-lucidasans-bold", jreLibDirName + "/fonts/LucidaSansDemiBold.ttf");
        this.oblmap.put("-lucidatypewriter-medium", jreLibDirName + "/fonts/LucidaTypewriterRegular.ttf");
        this.oblmap.put("-lucidatypewriter-bold", jreLibDirName + "/fonts/LucidaTypewriterBold.ttf");
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
                System.out.println("Font Configuration Font ID is malformed:" + name);
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
                System.out.println("Font Configuration Font ID is malformed:" + name);
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
                    System.out.println("awtfontpath : " + str);
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
            fontConfigDirs.add(jreLibDirName + File.separator + "oblique-fonts");
        }
        fontdirs = (String[]) fontConfigDirs.toArray(new String[0]);
    }

    protected FontConfiguration createFontConfiguration() {
        MFontConfiguration mFontConfiguration = new MFontConfiguration(this);
        if (FontUtilities.isOpenSolaris || ((FontUtilities.isLinux && (!mFontConfiguration.foundOsSpecificFile() || !mFontConfiguration.fontFilesArePresent())) || (FontUtilities.isSolaris && !mFontConfiguration.fontFilesArePresent()))) {
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
        return getFontPathNative(noType1Fonts, true);
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
