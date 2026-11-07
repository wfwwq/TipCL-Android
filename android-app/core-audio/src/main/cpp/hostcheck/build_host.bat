@echo off
rem build_host.bat - compile and run openal_shim pure-logic self-test on host.
rem openal_shim.c is the only product source compiled here (no dlfcn/Android,
rem Windows API path inside the shim via LoadLibraryA; real lib absent -> STUB mode).
rem Compiler resolution order:
rem   1. tools\w64devkit\bin\gcc.exe (portable toolchain, see NOTES.md)
rem   2. gcc on PATH
rem   3. clang on PATH
setlocal enabledelayedexpansion

set "SCRIPT_DIR=%~dp0"
cd /d "%SCRIPT_DIR%"
set "OUT_DIR=build_host"
set "TOOLS_GCC=C:\Users\Administrator\tipcl_work\tools\w64devkit\bin\gcc.exe"

set "CC="
if exist "%TOOLS_GCC%" set "CC=%TOOLS_GCC%"
if not defined CC (
    where gcc >nul 2>nul
    if not errorlevel 1 set "CC=gcc"
)
if not defined CC (
    where clang >nul 2>nul
    if not errorlevel 1 set "CC=clang"
)
if not defined CC (
    echo [build_host] ERROR: no C compiler found.
    echo Install w64devkit to C:\Users\Administrator\tipcl_work\tools\w64devkit
    exit /b 1
)
rem gcc needs its own bin (as, ld) on PATH
for %%F in ("%CC%") do set "CC_BIN_DIR=%%~dpF"
set "PATH=%CC_BIN_DIR%;%PATH%"
echo [build_host] compiler: %CC%

if not exist "%OUT_DIR%" mkdir "%OUT_DIR%"

"%CC%" -std=c11 -O1 -Wall -Wextra -Werror -o "%OUT_DIR%\hostcheck.exe" hostcheck_main.c ..\openal_shim.c
if errorlevel 1 (
    echo [build_host] COMPILE FAILED
    exit /b 1
)

echo [build_host] compiled OK, running... (STUB mode)
"%OUT_DIR%\hostcheck.exe"
set "RC=%ERRORLEVEL%"
if not "%RC%"=="0" (
    echo [build_host] hostcheck FAILED ^(STUB, exit %RC%^)
    exit /b %RC%
)

rem Pass-through mode against the real OpenAL Soft (soft_oal.dll), if downloaded
rem into tools\openal-cache. The DLL is found via PATH for this run only, so the
rem STUB run above stays untouched.
set "REAL_DLL=C:\Users\Administrator\tipcl_work\tools\openal-cache\extracted\openal-soft-1.23.1-bin\bin\Win64\soft_oal.dll"
if exist "%REAL_DLL%" (
    echo [build_host] running real-lib pass-through mode with %REAL_DLL%
    set "PATH=C:\Users\Administrator\tipcl_work\tools\openal-cache\extracted\openal-soft-1.23.1-bin\bin\Win64;%PATH%"
    "%OUT_DIR%\hostcheck.exe" --with-real-lib
    set "RC=%ERRORLEVEL%"
    if not "%RC%"=="0" (
        echo [build_host] hostcheck FAILED ^(real-lib, exit %RC%^)
        exit /b %RC%
    )
) else (
    echo [build_host] real soft_oal.dll not in tools\openal-cache, skipping real-lib mode
)

echo [build_host] hostcheck PASSED
exit /b 0
