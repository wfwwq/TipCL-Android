@echo off
rem ============================================================
rem run_all.bat - full device regression session
rem install -> logcat capture -> touch regression -> perf sample
rem Produces a markdown session report in logs\.
rem Optional arg: path to APK (passed through to install.bat)
rem ============================================================
setlocal enabledelayedexpansion
set HERE=%~dp0
set ROOT=%HERE%..\..
set TS=%date:~0,4%%date:~5,2%%date:~8,2%_%time:~0,2%%time:~3,2%%time:~6,2%
set TS=%TS: =0%
if not exist "%ROOT%\logs" mkdir "%ROOT%\logs"
set REPORT=%ROOT%\logs\session_%TS%.md

echo # TipCL M5 device regression session report > "%REPORT%"
echo. >> "%REPORT%"
echo - Date: %date% %time% >> "%REPORT%"
echo - Host: %COMPUTERNAME% >> "%REPORT%"
for /f "tokens=2" %%d in ('adb devices 2^>nul ^| findstr /r "device$ unauthorized$"') do echo - Device serial: %%d >> "%REPORT%"
echo. >> "%REPORT%"

echo [1/4] install + launch
echo ## 1. Install >> "%REPORT%"
call "%HERE%install.bat" %~1
if errorlevel 1 (
    echo - Result: **FAILED** - aborting session ^(no app on device^). >> "%REPORT%"
    echo [ABORT] install failed, see above.
    goto done
)
echo - Result: OK, app installed and LauncherActivity started. >> "%REPORT%"

echo [2/4] logcat capture (60s window while you play)
echo. >> "%REPORT%"
echo ## 2. Logcat capture >> "%REPORT%"
call "%HERE%logcat_game.bat" 60
if errorlevel 1 (
    echo - Result: **FAILED**. >> "%REPORT%"
) else (
    echo - Result: OK, captured to latest logs\logcat_game_*. >> "%REPORT%"
)

echo [3/4] touch regression - 6 items, human judgement required
echo. >> "%REPORT%"
echo ## 3. Touch regression (6 items) >> "%REPORT%"
call "%HERE%touch_regress.bat"
if errorlevel 1 (
    echo - Result: **SOME ITEMS FAILED** - see summary above. >> "%REPORT%"
) else (
    echo - Result: all 6 items PASS. >> "%REPORT%"
)

echo [4/4] perf sampling (60s)
echo. >> "%REPORT%"
echo ## 4. Performance sampling >> "%REPORT%"
call "%HERE%perf_sample.bat" 60
if errorlevel 1 (
    echo - Result: **FAILED**. >> "%REPORT%"
) else (
    echo - Result: OK, see latest logs\perf_*\summary.txt. >> "%REPORT%"
)

:done
echo. >> "%REPORT%"
echo ## Notes >> "%REPORT%"
echo - Crash history dump: latest logs\logcat_game_*\dropbox.txt >> "%REPORT%"
echo - Adjust touch_regress coordinates if overlay layout differs. >> "%REPORT%"

echo.
echo [DONE] session report: %REPORT%
type "%REPORT%"
endlocal
