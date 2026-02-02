@echo off
rem Compile sources into local bin directory and run the main class
javac -d bin interfaceproblems\*.java
if errorlevel 1 (
  echo Compilation failed.
  exit /b %errorlevel%
)
java -cp bin interfaceproblems.mainclass
