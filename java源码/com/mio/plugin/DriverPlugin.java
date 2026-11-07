package com.mio.plugin;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.lwjgl.sdl.SDLRender;

/* compiled from: DriverPlugin.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007b\u0002\b\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000er\u0002\b\r¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/mio/plugin/DriverPlugin;", "", "<init>", "()V", "DEFAULT_DRIVER_LIB", "", "selected", "Lcom/mio/plugin/DriverPlugin$Driver;", "getSelected$annotations", "getSelected", "()Lcom/mio/plugin/DriverPlugin$Driver;", "setSelected", "(Lcom/mio/plugin/DriverPlugin$Driver;)V", "Lkotlin/jvm/JvmStatic;", "init", "", "context", "Landroid/content/Context;", "Driver", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DriverPlugin {
    public static final String DEFAULT_DRIVER_LIB = "libvulkan_freedreno.so";
    public static final DriverPlugin INSTANCE = new DriverPlugin();
    private static Driver selected = new Driver("Turnip", "", null, null, 12, null);

    @JvmStatic
    public static /* synthetic */ void getSelected$annotations() {
    }

    /* compiled from: DriverPlugin.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/mio/plugin/DriverPlugin$Driver;", "", "driver", "", "path", "lib", SDLRender.SDL_GPU_RENDERER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDriver", "()Ljava/lang/String;", "getPath", "getLib", "getGpu", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "PyMCL-Android:runtime_debug"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Driver {
        private final String driver;
        private final String gpu;
        private final String lib;
        private final String path;

        public static /* synthetic */ Driver copy$default(Driver driver, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = driver.driver;
            }
            if ((i & 2) != 0) {
                str2 = driver.path;
            }
            if ((i & 4) != 0) {
                str3 = driver.lib;
            }
            if ((i & 8) != 0) {
                str4 = driver.gpu;
            }
            return driver.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDriver() {
            return this.driver;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLib() {
            return this.lib;
        }

        /* renamed from: component4, reason: from getter */
        public final String getGpu() {
            return this.gpu;
        }

        public final Driver copy(String driver, String path, String lib, String gpu) {
            Intrinsics.checkNotNullParameter(driver, "driver");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(lib, "lib");
            Intrinsics.checkNotNullParameter(gpu, "gpu");
            return new Driver(driver, path, lib, gpu);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Driver)) {
                return false;
            }
            Driver driver = (Driver) other;
            return Intrinsics.areEqual(this.driver, driver.driver) && Intrinsics.areEqual(this.path, driver.path) && Intrinsics.areEqual(this.lib, driver.lib) && Intrinsics.areEqual(this.gpu, driver.gpu);
        }

        public int hashCode() {
            return (((((this.driver.hashCode() * 31) + this.path.hashCode()) * 31) + this.lib.hashCode()) * 31) + this.gpu.hashCode();
        }

        public String toString() {
            return "Driver(driver=" + this.driver + ", path=" + this.path + ", lib=" + this.lib + ", gpu=" + this.gpu + ")";
        }

        public Driver(String driver, String path, String lib, String gpu) {
            Intrinsics.checkNotNullParameter(driver, "driver");
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(lib, "lib");
            Intrinsics.checkNotNullParameter(gpu, "gpu");
            this.driver = driver;
            this.path = path;
            this.lib = lib;
            this.gpu = gpu;
        }

        public /* synthetic */ Driver(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? DriverPlugin.DEFAULT_DRIVER_LIB : str3, (i & 8) != 0 ? "adreno" : str4);
        }

        public final String getDriver() {
            return this.driver;
        }

        public final String getGpu() {
            return this.gpu;
        }

        public final String getLib() {
            return this.lib;
        }

        public final String getPath() {
            return this.path;
        }
    }

    public static final Driver getSelected() {
        return selected;
    }

    public static final void setSelected(Driver driver) {
        Intrinsics.checkNotNullParameter(driver, "<set-?>");
        selected = driver;
    }

    @JvmStatic
    public static final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String nativeLibraryDir = context.getApplicationInfo().nativeLibraryDir;
        Intrinsics.checkNotNullExpressionValue(nativeLibraryDir, "nativeLibraryDir");
        selected = new Driver("Turnip", nativeLibraryDir, null, null, 12, null);
    }
}
