@echo off
rem ============================================================
rem install.bat - detect adb, install TipCL APK, launch app
rem Usage: install.bat [path\to\app.apk]
rem APK search order: dist\, android-app\app\build\outputs\apk\
rem ============================================================
setlocal enabledelayedexpansion
set PKG=com.tipcl.android
set ACT=%PKG%/.LauncherActivity

rem ---- step 1: locate adb ----
set ADB=adb
adb version >nul 2>&1
if errorlevel 1 (
    for %%P in ("%LOCALAPPDATA%\Android\Sdk\platform-tools\adb.exe" "C:\Android\platform-tools\adb.exe") do (
        if exist %%P set ADB=%%~fP
    )
)
adb version >nul 2>&1
if errorlevel 1 (
    if not "%ADB%"=="adb" "%ADB%" version >nul 2>&1
)
"%ADB%" version >nul 2>&1
if errorlevel 1 (
    echo [ERROR] adb not found in PATH or common SDK locations.
    echo Fix: install Android platform-tools, then either
    echo   - add adb.exe folder to PATH, or
    echo   - set ANDROID_HOME so that %%ANDROID_HOME%%\platform-tools\adb.exe exists.
    exit /b 1
)
echo [OK] adb found: %ADB%

rem ---- step 2: check device ----
"%ADB%" get-state >nul 2>&1
if errorlevel 1 (
    echo [ERROR] no device/emulator attached. Enable USB debugging and run:
    echo   "%ADB%" devices
    exit /b 1
)
for /f "skip=1 tokens=1,2" %%i in ('"%ADB%" devices') do (
    if not "%%j"=="" echo [DEV] %%i state=%%j
)

rem ---- step 3: find APK (arg wins, then dist, then gradle outputs) ----
set APK=%~1
if not "%APK%"=="" if not exist "%APK%" (
    echo [ERROR] given APK not found: %APK%
    exit /b 1
)
if "%APK%"=="" (
    for %%F in ("%~dp0..\..\dist\*.apk") do set APK=%%~fF
)
if "%APK%"=="" (
    for /r "%~dp0..\..\android-app\app\build\outputs\apk" %%F in (*.apk) do (
        echo %%F | findstr /i "release debug" >nul && set APK=%%~fF
    )
)
if "%APK%"=="" (
    echo [ERROR] no APK found.
    echo Build one first: scripts\build_rewrite_release.bat
    echo or download the CI artifact from GitHub Releases, then run:
    echo   install.bat path\to\tipcl-*.apk
    exit /b 1
)
echo [OK] APK: %APK%

rem ---- step 4: install ----
echo [..] installing...
"%ADB%" install -r "%APK%"
if errorlevel 1 (
    echo [ERROR] install failed. Try uninstall first:
    echo   "%ADB%" uninstall %PKG%
    exit /b 1
)

rem ---- step 5: launch ----
echo [..] launching %ACT%
"%ADB%" shell am start -n %ACT%
if errorlevel 1 (
    echo [ERROR] launch failed; check logcat: logcat_game.bat
    exit /b 1
)
echo [DONE] installed and launched.
endlocal
