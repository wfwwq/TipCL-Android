@echo off
rem ============================================================
rem touch_regress.bat - semi-automatic touch regression helper
rem Drives standard gestures with "adb shell input", the tester
rem judges each item visually and answers y/n. Summary at end.
rem
rem Coordinate tuning: edit the FRACTIONS below or pass explicit
rem pixels as arguments 2..7: joystickXY lookXY hotbarSlot5XY
rem e.g. touch_regress.bat 200 1400 720 700 720 1330
rem ============================================================
setlocal enabledelayedexpansion

set PKG=com.tipcl.android
set ACT=%PKG%/.LauncherActivity
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

rem ---- screen size ----
set W=
set H=
for /f "tokens=1,2" %%a in ('"%ADB%" shell wm size 2^>nul ^| findstr /r "Physical"') do (
    set W=%%a
    set H=%%b
)
set W=%W:Override=%
set W=%W:Physical=%
set W=%W:size=%
set W=%W::=%
set W=%W: =%
set H=%H: =%
if "%W%"=="" (
    echo [ERROR] cannot read screen size via "wm size".
    exit /b 1
)
echo [OK] screen %W%x%H%

rem ---- default fractional coordinates (adjust if overlay differs) ----
set /a JX=%W%*20/100
set /a JY=%H%*78/100
set /a LX=%W%*60/100
set /a LY=%H%*45/100
set /a HX=%W%*50/100
set /a HY=%H%*92/100
if not "%~1"=="" set JX=%~1
if not "%~2"=="" set JY=%~2
if not "%~3"=="" set LX=%~3
if not "%~4"=="" set LY=%~4
if not "%~5"=="" set HX=%~5
if not "%~6"=="" set HY=%~6
echo [CFG] joystick=(%JX%,%JY%) look=(%LX%,%LY%) hotbar_mid=(%HX%,%HY%)

rem ---- make sure game is up ----
for /f %%p in ('"%ADB%" shell pidof %PKG% 2^>nul') do set RUNNING=%%p
if "%RUNNING%"=="" (
    echo [..] launching game...
    "%ADB%" shell am start -n %ACT% >nul
    timeout /t 5 /nobreak >nul
)
set PASS=0
set FAIL=0

rem ============================================================
rem ITEM 1: joystick holds its pointer, other fingers separate
rem ============================================================
echo.
echo ============================================================
echo ITEM 1/6: joystick pointer binding (multi-finger isolation)
echo Action: script presses joystick area for 3s; YOU then
echo   drag the look area and tap jump yourself while it holds.
echo Expect: joystick stays latched; your drag rotates view;
echo   jump fires once; channels never cross.
echo ============================================================
"%ADB%" shell input swipe %JX% %JY% %JX% %JY% 3000 >nul 2>&1
call :ask 1

rem ============================================================
rem ITEM 2: quick tap in look area = left click (place block)
rem ============================================================
echo.
echo ============================================================
echo ITEM 2/6: look-area tap = left click
echo Action: script performs a fast short tap in look area.
echo Expect: exactly one block placement (LEFT press+release),
echo   no view rotation before it.
echo ============================================================
"%ADB%" shell input tap %LX% %LY% >nul 2>&1
call :ask 2

rem ============================================================
rem ITEM 3: long press >=400ms in look area = hold left (break)
rem ============================================================
echo.
echo ============================================================
echo ITEM 3/6: look-area long press = hold left button
echo Action: script presses look area and holds 1200ms.
echo Expect: after ~400ms breaking starts (hold), stops on up;
echo   nothing happens in the first 400ms.
echo ============================================================
"%ADB%" shell input swipe %LX% %LY% %LX% %LY% 1200 >nul 2>&1
call :ask 3

rem ============================================================
rem ITEM 4: drag in look area = relative mouse move (view turn)
rem ============================================================
echo.
echo ============================================================
echo ITEM 4/6: look-area drag = view rotation
echo Action: script drags horizontally across look area
echo   (two swipes: slow then long) - simulates view turning.
echo Expect: view rotates proportionally, no clicks injected.
echo ============================================================
set /a DX1=%LX%-%W%*15/100
set /a DX2=%LX%+%W%*15/100
"%ADB%" shell input swipe %DX1% %LY% %DX2% %LY% 600 >nul 2>&1
"%ADB%" shell input swipe %DX2% %LY% %DX1% %LY% 900 >nul 2>&1
call :ask 4

rem ============================================================
rem ITEM 5: joystick slip-out beyond 1.5x radius releases keys
rem ============================================================
echo.
echo ============================================================
echo ITEM 5/6: joystick slip-out auto key release
echo Action: script presses joystick then swipes far out
echo   (beyond 1.5x radius) without lifting.
echo Expect: movement keys release the moment the finger leaves
echo   1.5x radius; character stops; no repeat after lift.
echo ============================================================
set /a OX=%JX%+%W%*12/100
set /a OY=%JY%-%H%*6/100
"%ADB%" shell input swipe %JX% %JY% %OX% %OY% 900 500 >nul 2>&1
call :ask 5

rem ============================================================
rem ITEM 6: virtual button slip-out release + hotbar 1..9
rem ============================================================
echo.
echo ============================================================
echo ITEM 6/6: virtual button slip-out + hotbar digit tap
echo Action A: script taps hotbar slot 5.
echo Expect: hotbar selects slot 5 (digit key 5 injected).
echo Action B: YOU hold jump and slide off it - expect immediate
echo   jump release without waiting for finger lift.
echo ============================================================
"%ADB%" shell input tap %HX% %HY% >nul 2>&1
call :ask 6

rem ============================================================
echo.
echo ================= SUMMARY =================
if %PASS% gtr 0 echo   PASS: %PASS%
if %FAIL% gtr 0 echo   FAIL: %FAIL%
echo   total: 6 items
echo ===========================================
if %FAIL% gtr 0 exit /b 1
exit /b 0

:ask
set ANS=
set /p ANS=Item %1 correct? [y/n]:
if /i "%ANS%"=="y" (
    set /a PASS+=1
    echo [PASS] item %1
) else (
    set /a FAIL+=1
    echo [FAIL] item %1
)
goto :eof
endlocal
