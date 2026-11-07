@echo off
setlocal enabledelayedexpansion
rem ============================================================
rem TipCL 安卓端发行版一键打包
rem 依赖: JDK 17+（java 在 PATH 或 JAVA_HOME 下）
rem 产物: dist\TipCL-0.9.3.apk（zipalign + apksigner v1/v2 签名）
rem ============================================================

set ROOT=%~dp0..
set ANDROID_DIR=%ROOT%\app\Android
set TOOLS=%ROOT%\.tools
set OUT=%ROOT%\dist
set VERSION=0.9.3
set KS=%~dp0keystore\tipcl.keystore
set KS_PASS=tipcl123
set KS_ALIAS=tipcl

set "JAVA=java"
if defined JAVA_HOME set "JAVA=%JAVA_HOME%\bin\java.exe"
%JAVA% -version >nul 2>&1 || (echo [ERROR] 未找到 java，请安装 JDK 17+ 或设置 JAVA_HOME & exit /b 1)

mkdir "%OUT%" >nul 2>&1

rem ---- apktool ----
set APKTOOL=%TOOLS%\apktool.jar
if not exist "%APKTOOL%" (
    echo [1/4] 下载 apktool（阿里云镜像）...
    mkdir "%TOOLS%" >nul 2>&1
    curl -sL -o "%APKTOOL%" "https://maven.aliyun.com/repository/public/org/apktool/apktool-cli/2.10.0/apktool-cli-2.10.0.jar" || (echo [ERROR] apktool 下载失败 & exit /b 1)
)

rem ---- build-tools (zipalign / apksigner) ----
set BT=%TOOLS%\build-tools
if not exist "%BT%\zipalign.exe" (
    echo [2/4] 下载 Android build-tools（Google 官方源）...
    curl -sL -o "%TOOLS%\bt.zip" "https://dl.google.com/android/repository/build-tools_r34-windows.zip" || (echo [ERROR] build-tools 下载失败 & exit /b 1)
    powershell -NoProfile -Command "Expand-Archive -Force '%TOOLS%\bt.zip' '%TOOLS%\bt_tmp'"
    for /d %%D in ("%TOOLS%\bt_tmp\*") do xcopy /E /I /Y "%%D" "%BT%" >nul
    rmdir /S /Q "%TOOLS%\bt_tmp" & del "%TOOLS%\bt.zip"
)

echo [3/4] apktool 重建（约需数分钟）...
%JAVA% -Xmx4g -jar "%APKTOOL%" b "%ANDROID_DIR%" -o "%OUT%\TipCL-unsigned.apk" || (echo [ERROR] apktool 构建失败 & exit /b 1)

echo [4/4] zipalign + 签名...
"%BT%\zipalign.exe" -f -p 4 "%OUT%\TipCL-unsigned.apk" "%OUT%\TipCL-aligned.apk" || (echo [ERROR] zipalign 失败 & exit /b 1)
%JAVA% -jar "%BT%\lib\apksigner.jar" sign --ks "%KS%" --ks-pass pass:%KS_PASS% --ks-key-alias %KS_ALIAS% --out "%OUT%\TipCL-%VERSION%.apk" "%OUT%\TipCL-aligned.apk" || (echo [ERROR] 签名失败 & exit /b 1)
%JAVA% -jar "%BT%\lib\apksigner.jar" verify "%OUT%\TipCL-%VERSION%.apk" || (echo [ERROR] 签名校验失败 & exit /b 1)

del "%OUT%\TipCL-unsigned.apk" "%OUT%\TipCL-aligned.apk"
echo.
echo 完成: %OUT%\TipCL-%VERSION%.apk
endlocal
