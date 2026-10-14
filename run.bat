@echo off
setlocal enabledelayedexpansion
cd /d "%~dp0"

if exist out rmdir /s /q out
mkdir out

(for /r src %%f in (*.java) do (
  set "p=%%f"
  echo "!p:\=/!"
)) > out\sources.txt

javac -d out @out\sources.txt || exit /b 1
java -cp out rush.Main %*
