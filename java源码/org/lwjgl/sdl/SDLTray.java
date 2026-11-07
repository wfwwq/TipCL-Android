package org.lwjgl.sdl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.sdl.SDL_Surface;
import org.lwjgl.system.APIUtil;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.JNI;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLTray.class */
public class SDLTray {
    public static final int SDL_TRAYENTRY_BUTTON = 1;
    public static final int SDL_TRAYENTRY_CHECKBOX = 2;
    public static final int SDL_TRAYENTRY_SUBMENU = 4;
    public static final int SDL_TRAYENTRY_DISABLED = Integer.MIN_VALUE;
    public static final int SDL_TRAYENTRY_CHECKED = 1073741824;

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl-3.4.1-merged-modules.jar:org/lwjgl/sdl/SDLTray$Functions.class */
    public static final class Functions {
        public static final long CreateTray = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateTray");
        public static final long SetTrayIcon = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTrayIcon");
        public static final long SetTrayTooltip = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTrayTooltip");
        public static final long CreateTrayMenu = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateTrayMenu");
        public static final long CreateTraySubmenu = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_CreateTraySubmenu");
        public static final long GetTrayMenu = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayMenu");
        public static final long GetTraySubmenu = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTraySubmenu");
        public static final long GetTrayEntries = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayEntries");
        public static final long RemoveTrayEntry = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_RemoveTrayEntry");
        public static final long InsertTrayEntryAt = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_InsertTrayEntryAt");
        public static final long SetTrayEntryLabel = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTrayEntryLabel");
        public static final long GetTrayEntryLabel = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayEntryLabel");
        public static final long SetTrayEntryChecked = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTrayEntryChecked");
        public static final long GetTrayEntryChecked = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayEntryChecked");
        public static final long SetTrayEntryEnabled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTrayEntryEnabled");
        public static final long GetTrayEntryEnabled = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayEntryEnabled");
        public static final long SetTrayEntryCallback = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_SetTrayEntryCallback");
        public static final long ClickTrayEntry = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_ClickTrayEntry");
        public static final long DestroyTray = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_DestroyTray");
        public static final long GetTrayEntryParent = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayEntryParent");
        public static final long GetTrayMenuParentEntry = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayMenuParentEntry");
        public static final long GetTrayMenuParentTray = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_GetTrayMenuParentTray");
        public static final long UpdateTrays = APIUtil.apiGetFunctionAddress(SDL.getLibrary(), "SDL_UpdateTrays");

        private Functions() {
        }
    }

    protected SDLTray() {
        throw new UnsupportedOperationException();
    }

    public static long nSDL_CreateTray(long icon, long tooltip) {
        long __functionAddress = Functions.CreateTray;
        return JNI.invokePPP(icon, tooltip, __functionAddress);
    }

    @NativeType("SDL_Tray *")
    public static long SDL_CreateTray(@NativeType("SDL_Surface *") SDL_Surface.Buffer icon, @NativeType("char const *") ByteBuffer tooltip) {
        if (Checks.CHECKS) {
            Checks.checkSafe((CustomBuffer<?>) icon, 1);
            Checks.checkNT1Safe(tooltip);
        }
        return nSDL_CreateTray(MemoryUtil.memAddressSafe(icon), MemoryUtil.memAddressSafe(tooltip));
    }

    @NativeType("SDL_Tray *")
    public static long SDL_CreateTray(@NativeType("SDL_Surface *") SDL_Surface.Buffer icon, @NativeType("char const *") CharSequence tooltip) {
        if (Checks.CHECKS) {
            Checks.checkSafe((CustomBuffer<?>) icon, 1);
        }
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(tooltip, true);
            long tooltipEncoded = tooltip == null ? 0L : stack.getPointerAddress();
            long jNSDL_CreateTray = nSDL_CreateTray(MemoryUtil.memAddressSafe(icon), tooltipEncoded);
            stack.setPointer(stackPointer);
            return jNSDL_CreateTray;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_SetTrayIcon(long tray, long icon) {
        long __functionAddress = Functions.SetTrayIcon;
        if (Checks.CHECKS) {
            Checks.check(tray);
        }
        JNI.invokePPV(tray, icon, __functionAddress);
    }

    public static void SDL_SetTrayIcon(@NativeType("SDL_Tray *") long tray, @NativeType("SDL_Surface *") SDL_Surface icon) {
        nSDL_SetTrayIcon(tray, MemoryUtil.memAddressSafe(icon));
    }

    public static void nSDL_SetTrayTooltip(long tray, long tooltip) {
        long __functionAddress = Functions.SetTrayTooltip;
        if (Checks.CHECKS) {
            Checks.check(tray);
        }
        JNI.invokePPV(tray, tooltip, __functionAddress);
    }

    public static void SDL_SetTrayTooltip(@NativeType("SDL_Tray *") long tray, @NativeType("char const *") ByteBuffer tooltip) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(tooltip);
        }
        nSDL_SetTrayTooltip(tray, MemoryUtil.memAddressSafe(tooltip));
    }

    public static void SDL_SetTrayTooltip(@NativeType("SDL_Tray *") long tray, @NativeType("char const *") CharSequence tooltip) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(tooltip, true);
            long tooltipEncoded = tooltip == null ? 0L : stack.getPointerAddress();
            nSDL_SetTrayTooltip(tray, tooltipEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    @NativeType("SDL_TrayMenu *")
    public static long SDL_CreateTrayMenu(@NativeType("SDL_Tray *") long tray) {
        long __functionAddress = Functions.CreateTrayMenu;
        if (Checks.CHECKS) {
            Checks.check(tray);
        }
        return JNI.invokePP(tray, __functionAddress);
    }

    @NativeType("SDL_TrayMenu *")
    public static long SDL_CreateTraySubmenu(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.CreateTraySubmenu;
        if (Checks.CHECKS) {
            Checks.check(entry);
        }
        return JNI.invokePP(entry, __functionAddress);
    }

    @NativeType("SDL_TrayMenu *")
    public static long SDL_GetTrayMenu(@NativeType("SDL_Tray *") long tray) {
        long __functionAddress = Functions.GetTrayMenu;
        if (Checks.CHECKS) {
            Checks.check(tray);
        }
        return JNI.invokePP(tray, __functionAddress);
    }

    @NativeType("SDL_TrayMenu *")
    public static long SDL_GetTraySubmenu(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.GetTraySubmenu;
        if (Checks.CHECKS) {
            Checks.check(entry);
        }
        return JNI.invokePP(entry, __functionAddress);
    }

    public static long nSDL_GetTrayEntries(long menu, long count) {
        long __functionAddress = Functions.GetTrayEntries;
        if (Checks.CHECKS) {
            Checks.check(menu);
        }
        return JNI.invokePPP(menu, count, __functionAddress);
    }

    @NativeType("SDL_TrayEntry const **")
    public static PointerBuffer SDL_GetTrayEntries(@NativeType("SDL_TrayMenu *") long menu) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        IntBuffer count = stack.callocInt(1);
        try {
            long __result = nSDL_GetTrayEntries(menu, MemoryUtil.memAddress(count));
            PointerBuffer pointerBufferMemPointerBufferSafe = MemoryUtil.memPointerBufferSafe(__result, count.get(0));
            stack.setPointer(stackPointer);
            return pointerBufferMemPointerBufferSafe;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void SDL_RemoveTrayEntry(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.RemoveTrayEntry;
        if (Checks.CHECKS) {
            Checks.check(entry);
        }
        JNI.invokePV(entry, __functionAddress);
    }

    public static long nSDL_InsertTrayEntryAt(long menu, int pos, long label, int flags) {
        long __functionAddress = Functions.InsertTrayEntryAt;
        if (Checks.CHECKS) {
            Checks.check(menu);
        }
        return JNI.invokePPP(menu, pos, label, flags, __functionAddress);
    }

    @NativeType("SDL_TrayEntry *")
    public static long SDL_InsertTrayEntryAt(@NativeType("SDL_TrayMenu *") long menu, int pos, @NativeType("char const *") ByteBuffer label, @NativeType("SDL_TrayEntryFlags") int flags) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(label);
        }
        return nSDL_InsertTrayEntryAt(menu, pos, MemoryUtil.memAddressSafe(label), flags);
    }

    @NativeType("SDL_TrayEntry *")
    public static long SDL_InsertTrayEntryAt(@NativeType("SDL_TrayMenu *") long menu, int pos, @NativeType("char const *") CharSequence label, @NativeType("SDL_TrayEntryFlags") int flags) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            long jNSDL_InsertTrayEntryAt = nSDL_InsertTrayEntryAt(menu, pos, labelEncoded, flags);
            stack.setPointer(stackPointer);
            return jNSDL_InsertTrayEntryAt;
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void nSDL_SetTrayEntryLabel(long entry, long label) {
        long __functionAddress = Functions.SetTrayEntryLabel;
        if (Checks.CHECKS) {
            Checks.check(entry);
        }
        JNI.invokePPV(entry, label, __functionAddress);
    }

    public static void SDL_SetTrayEntryLabel(@NativeType("SDL_TrayEntry *") long entry, @NativeType("char const *") ByteBuffer label) {
        if (Checks.CHECKS) {
            Checks.checkNT1Safe(label);
        }
        nSDL_SetTrayEntryLabel(entry, MemoryUtil.memAddressSafe(label));
    }

    public static void SDL_SetTrayEntryLabel(@NativeType("SDL_TrayEntry *") long entry, @NativeType("char const *") CharSequence label) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8Safe(label, true);
            long labelEncoded = label == null ? 0L : stack.getPointerAddress();
            nSDL_SetTrayEntryLabel(entry, labelEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static long nSDL_GetTrayEntryLabel(long entry) {
        long __functionAddress = Functions.GetTrayEntryLabel;
        if (Checks.CHECKS) {
            Checks.check(entry);
        }
        return JNI.invokePP(entry, __functionAddress);
    }

    @NativeType("char const *")
    public static String SDL_GetTrayEntryLabel(@NativeType("SDL_TrayEntry *") long entry) {
        long __result = nSDL_GetTrayEntryLabel(entry);
        return MemoryUtil.memUTF8Safe(__result);
    }

    public static void SDL_SetTrayEntryChecked(@NativeType("SDL_TrayEntry *") long entry, @NativeType("bool") boolean checked) {
        long __functionAddress = Functions.SetTrayEntryChecked;
        if (Checks.CHECKS) {
            Checks.check(entry);
        }
        JNI.invokePV(entry, checked, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetTrayEntryChecked(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.GetTrayEntryChecked;
        if (Checks.CHECKS) {
            Checks.check(entry);
        }
        return JNI.invokePZ(entry, __functionAddress);
    }

    public static void SDL_SetTrayEntryEnabled(@NativeType("SDL_TrayEntry *") long entry, @NativeType("bool") boolean enabled) {
        long __functionAddress = Functions.SetTrayEntryEnabled;
        if (Checks.CHECKS) {
            Checks.check(entry);
        }
        JNI.invokePV(entry, enabled, __functionAddress);
    }

    @NativeType("bool")
    public static boolean SDL_GetTrayEntryEnabled(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.GetTrayEntryEnabled;
        if (Checks.CHECKS) {
            Checks.check(entry);
        }
        return JNI.invokePZ(entry, __functionAddress);
    }

    public static void nSDL_SetTrayEntryCallback(long entry, long callback, long userdata) {
        long __functionAddress = Functions.SetTrayEntryCallback;
        if (Checks.CHECKS) {
            Checks.check(entry);
        }
        JNI.invokePPPV(entry, callback, userdata, __functionAddress);
    }

    public static void SDL_SetTrayEntryCallback(@NativeType("SDL_TrayEntry *") long entry, @NativeType("SDL_TrayCallback") SDL_TrayCallbackI callback, @NativeType("void *") long userdata) {
        nSDL_SetTrayEntryCallback(entry, MemoryUtil.memAddressSafe(callback), userdata);
    }

    public static void SDL_ClickTrayEntry(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.ClickTrayEntry;
        if (Checks.CHECKS) {
            Checks.check(entry);
        }
        JNI.invokePV(entry, __functionAddress);
    }

    public static void SDL_DestroyTray(@NativeType("SDL_Tray *") long tray) {
        long __functionAddress = Functions.DestroyTray;
        if (Checks.CHECKS) {
            Checks.check(tray);
        }
        JNI.invokePV(tray, __functionAddress);
    }

    @NativeType("SDL_TrayMenu *")
    public static long SDL_GetTrayEntryParent(@NativeType("SDL_TrayEntry *") long entry) {
        long __functionAddress = Functions.GetTrayEntryParent;
        if (Checks.CHECKS) {
            Checks.check(entry);
        }
        return JNI.invokePP(entry, __functionAddress);
    }

    @NativeType("SDL_TrayEntry *")
    public static long SDL_GetTrayMenuParentEntry(@NativeType("SDL_TrayMenu *") long menu) {
        long __functionAddress = Functions.GetTrayMenuParentEntry;
        if (Checks.CHECKS) {
            Checks.check(menu);
        }
        return JNI.invokePP(menu, __functionAddress);
    }

    @NativeType("SDL_Tray *")
    public static long SDL_GetTrayMenuParentTray(@NativeType("SDL_TrayMenu *") long menu) {
        long __functionAddress = Functions.GetTrayMenuParentTray;
        if (Checks.CHECKS) {
            Checks.check(menu);
        }
        return JNI.invokePP(menu, __functionAddress);
    }

    public static void SDL_UpdateTrays() {
        long __functionAddress = Functions.UpdateTrays;
        JNI.invokeV(__functionAddress);
    }
}
