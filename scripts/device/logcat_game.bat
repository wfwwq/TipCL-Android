@echo off
rem ============================================================
rem logcat_game.bat - capture TipCL.* logs + crash history to logs\
rem Usage: logcat_game.bat [duration_seconds]   (default: 60, 0 = until Ctrl+C)
rem ============================================================
setlocal enabledelayedexpansion
set PKG=com.tipcl.android
set ADB=adb
adb version >nul 2>&1 || set ADB=

if "%ADB%"=="" (
    for %%P in ("%LOCALAPPDATA%\Android\Sdk\platform-tools\adb.exe") do if exist %%P set ADB=%%~fP
)
if "%ADB%"=="" (
    echo [ERROR] adb not found. See install.bat header for setup guidance.
    exit /b 1
)
"%ADB%" get-state >nul 2>&1
if errorlevel 1 (
    echo [ERROR] no device attached. Run: "%ADB%" devices
    exit /b 1
)

set DUR=%~1
if "%DUR%"=="" set DUR=60
set TS=%date:~0,4%%date:~5,2%%date:~8,2%_%time:~0,2%%time:~3,2%%time:~6,2%
set TS=%TS: =0%
if not exist "%~dp0..\..\logs" mkdir "%~dp0..\..\logs"
set OUT=%~dp0..\..\logs\logcat_game_%TS%
mkdir "%OUT%" 2>nul

rem ---- game process pid ----
set PID=
for /f %%p in ('"%ADB%" shell pidof %PKG%') do set PID=%%p
if "%PID%"=="" (
    echo [WARN] game process not running; capturing unfiltered TipCL lines only.
) else (
    echo [OK] pid=%PID%
)

echo [..] capturing %DUR%s of logcat to %OUT%\logcat.txt
if "%PID%"=="" (
    start "" /b cmd /c ""%ADB%" logcat -v time > "%OUT%\logcat.txt" 2>&1"
) else (
    start "" /b cmd /c ""%ADB%" logcat -v time --pid=%PID% > "%OUT%\logcat.txt" 2>&1"
)

rem timed wait (1s per tick, ASCII-safe)
set /a LEFT=%DUR%
:waitloop
if %LEFT% leq 0 goto donewait
timeout /t 1 /nobreak >nul
set /a LEFT-=1
goto waitloop
:donewait
"%ADB%" logcat -c >nul 2>&1

rem ---- crash history: dropbox + am crash + tombstones ----
echo [..] dumping crash history
"%ADB%" shell dumpsys dropbox --print > "%OUT%\dropbox.txt" 2>&1
findstr /i /c:"data_app_crash" /c:"data_app_anr" "%OUT%\dropbox.txt" >nul 2>&1 && (
    echo [CRASH-ENTRIES-FOUND] see dropbox.txt
) || echo [OK] no crash/anr entries in dropbox
"%ADB%" shell dumpsys activity service Crash > "%OUT%\am_crash.txt" 2>&1
"%ADB%" bugreport -d crash "%OUT%\bugreport_crash.txt" >nul 2>&1

rem ---- summarize TipCL tags ----
findstr /r /c:"TipCL[.-]" "%OUT%\logcat.txt" > "%OUT%\tipcl_only.txt" 2>nul
for /f %%c in ('type "%OUT%\tipcl_only.txt" 2^>nul ^| find /c /v ""') do echo [OK] %%c TipCL-tagged lines in tipcl_only.txt

echo [DONE] output in %OUT%
echo   logcat.txt      - full (or per-pid) log
echo   tipcl_only.txt  - TipCL.* filtered lines
echo   dropbox.txt     - historical crash/anr records
echo   am_crash.txt    - am crash service dump
endlocal
