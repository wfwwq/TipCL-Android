package com.pymcl.core.config;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LauncherPaths.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\tR\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\tR\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\tR\u0011\u0010\u0019\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\tR\u0011\u0010\u001b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\tR\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\tR\u0011\u0010\u001f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b \u0010\tR\u0011\u0010!\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\tR\u0011\u0010#\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b$\u0010\tR\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\tR\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\t¨\u0006)"}, d2 = {"Lcom/pymcl/core/config/LauncherPaths;", "", "root", "Ljava/io/File;", "instancesDirName", "", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "getRoot", "()Ljava/io/File;", "value", "instancesDir", "getInstancesDir", "setInstancesDir$PyMCL_Android_core", "(Ljava/io/File;)V", "resolve", "p", "setInstancesDir", "", "configFile", "getConfigFile", "accountsFile", "getAccountsFile", "playtimeFile", "getPlaytimeFile", "authlibInjectorJar", "getAuthlibInjectorJar", "nide8Jar", "getNide8Jar", "cacheDir", "getCacheDir", "skinsDir", "getSkinsDir", "exportsDir", "getExportsDir", "sharedDir", "getSharedDir", "javaDir", "getJavaDir", "errorLog", "getErrorLog", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LauncherPaths {
    private File instancesDir;
    private final File root;

    public LauncherPaths(File root, String instancesDirName) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(instancesDirName, "instancesDirName");
        this.root = root;
        this.instancesDir = resolve(instancesDirName);
    }

    public /* synthetic */ LauncherPaths(File file, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i & 2) != 0 ? ".minecraft" : str);
    }

    public final File getRoot() {
        return this.root;
    }

    public final File getInstancesDir() {
        return this.instancesDir;
    }

    public final void setInstancesDir$PyMCL_Android_core(File file) {
        Intrinsics.checkNotNullParameter(file, "<set-?>");
        this.instancesDir = file;
    }

    public final File resolve(String p) {
        Intrinsics.checkNotNullParameter(p, "p");
        File it = new File(p);
        return it.isAbsolute() ? it : new File(this.root, p);
    }

    public final void setInstancesDir(String p) {
        Intrinsics.checkNotNullParameter(p, "p");
        this.instancesDir = resolve(p);
    }

    public final File getConfigFile() {
        return new File(this.root, "config.json");
    }

    public final File getAccountsFile() {
        return new File(this.root, "accounts.json");
    }

    public final File getPlaytimeFile() {
        return new File(this.root, "playtime.json");
    }

    public final File getAuthlibInjectorJar() {
        return new File(this.root, "authlib-injector.jar");
    }

    public final File getNide8Jar() {
        return new File(this.root, "nide8auth.jar");
    }

    public final File getCacheDir() {
        return new File(this.root, "cache");
    }

    public final File getSkinsDir() {
        return new File(this.root, "skins");
    }

    public final File getExportsDir() {
        return new File(this.root, "exports");
    }

    public final File getSharedDir() {
        return new File(this.root, "shared");
    }

    public final File getJavaDir() {
        return new File(this.root, "java");
    }

    public final File getErrorLog() {
        return new File(this.root, "pymcl-error.log");
    }
}
