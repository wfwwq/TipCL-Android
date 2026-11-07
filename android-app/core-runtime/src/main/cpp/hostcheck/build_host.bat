@echo off
rem build_host.bat - compile and run glfw_stub pure-logic self-test on host.
rem glfw_stub.c is the only product source compiled here (plain C, no EGL/JNI/Android).
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

"%CC%" -std=c11 -O1 -Wall -Wextra -Werror -o "%OUT_DIR%\hostcheck.exe" hostcheck_main.c ..\glfw_stub.c -lpthread
if errorlevel 1 (
    echo [build_host] COMPILE FAILED
    exit /b 1
)

echo [build_host] compiled OK, running...
"%OUT_DIR%\hostcheck.exe"
set "RC=%ERRORLEVEL%"
if "%RC%"=="0" (
    echo [build_host] hostcheck PASSED
) else (
    echo [build_host] hostcheck FAILED ^(exit %RC%^)
)
exit /b %RC%
