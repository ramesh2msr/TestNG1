cd C:\Users\msramesh\eclipse-workspace\TestNG1
set ProjectPath=C:\Users\msramesh\eclipse-workspace\TestNG
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\testng.xml
pause