@echo off

title Running faster!

set chapter=%1
set codeOrExercise=%2
set javaFile=%3

IF "%codeOrExercise%"=="c" (
    set codeOrExercise=%codigos
) ELSE (
    set codeOrExercise=%exercicios
)

cd capitulo%chapter%
cd %codeOrExercise%

javac %javaFile%.java
java %javaFile%

cd ..\..
