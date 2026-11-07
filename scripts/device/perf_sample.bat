@echo off
rem ============================================================
rem perf_sample.bat - sample perf while playing, 60s window
rem Usage: perf_sample.bat [seconds]   (default 60)
rem Output: logs\perf_<ts>\ gfxinfo.txt cpuinfo.txt meminfo.txt
rem         summary.txt   fps/jank/cpu/mem digest
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
    echo [ERROR] no device attached.
    exit /b 1
)

set SECS=%~1
if "%SECS%"=="" set SECS=60

for /f %%p in ('"%ADB%" shell pidof %PKG% 2^>nul') do set PID=%%p
if "%PID%"=="" (
    echo [..] launching game...
    "%ADB%" shell am start -n %PKG%/.LauncherActivity >nul
    timeout /t 5 /nobreak >nul
    for /f %%p in ('"%ADB%" shell pidof %PKG% 2^>nul') do set PID=%%p
)
if "%PID%"=="" (
    echo [ERROR] game process not found after launch.
    exit /b 1
)
echo [OK] pid=%PID%

set TS=%date:~0,4%%date:~5,2%%date:~8,2%_%time:~0,2%%time:~3,2%%time:~6,2%
set TS=%TS: =0%
set OUT=%~dp0..\..\logs\perf_%TS%
mkdir "%OUT%" 2>nul
echo [..] sampling %SECS%s, warm-up: reset gfxinfo stats

"%ADB%" shell dumpsys gfxinfo %PKG% reset >nul 2>&1

set /a TICKS=%SECS%/5
if %TICKS% lss 1 set TICKS=1
rem cpu/mem sampled every 5s into one running file
for /l %%i in (1,1,%TICKS%) do (
    echo --- tick %%i/%TICKS% --- >> "%OUT%\cpu_samples.txt"
    "%ADB%" shell top -n 1 -b | findstr /i "tipcl" >> "%OUT%\cpu_samples.txt" 2>&1
    echo --- tick %%i --- >> "%OUT%\mem_samples.txt"
    "%ADB%" shell dumpsys meminfo %PKG% | findstr /r /c:"TOTAL PSS" /c:"Native Heap" /c:"Graphics" >> "%OUT%\mem_samples.txt" 2>&1
    timeout /t 5 /nobreak >nul
)

"%ADB%" shell dumpsys gfxinfo %PKG% > "%OUT%\gfxinfo.txt" 2>&1
"%ADB%" shell dumpsys cpuinfo > "%OUT%\cpuinfo.txt" 2>&1
"%ADB%" shell dumpsys meminfo %PKG% > "%OUT%\meminfo.txt" 2>&1

rem ---- summary ----
> "%OUT%\summary.txt" echo TipCL perf summary %TS% (%SECS%s window, pid %PID%)
for /f "tokens=*" %%l in ('findstr /r /c:"Total frames" /c:"Janky frames" /c:"50th" /c:"90th" /c:"95th" /c:"99th" "%OUT%\gfxinfo.txt" 2^>nul') do >> "%OUT%\summary.txt" echo GFX %%l
for /f "tokens=*" %%l in ('findstr /r /c:"TOTAL PSS" "%OUT%\meminfo.txt" 2^>nul') do >> "%OUT%\summary.txt" echo MEM %%l
for /f "tokens=*" %%l in ('findstr /i /c:"tipcl" "%OUT%\cpuinfo.txt" 2^>nul') do >> "%OUT%\summary.txt" echo CPU %%l

echo [DONE] summary:
type "%OUT%\summary.txt"
echo.
echo [DONE] full output in %OUT%
endlocal
