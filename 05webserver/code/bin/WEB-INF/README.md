Now to generate the “.class file”  we need to set the

“classpath” of command prompt to  “servlet-api.jar”; because the implementation classes of all the interfaces are defined under this jar file only. “servlet-api.jar” will be present in Tomcat à   that  is stored  in ‘Tomcat5.5/common/lib’.[or any lib folder of Tomcat]

Open “command prompt” and do the followng: (Say My Tomcat is present in F drive)

First change the directory location to “src” folder
Then set the classpath as:
set classpath= F:\Apache Software Foundation\apache-tomcat-5.5.35\common\lib\servlet-api.jar;

Then compile the program using “javac”
javac MyFirstServlet.java

Paste the generated .class file in “classes” folder.



```


javac src/com/mkyong/ServletDemo1.java
-classpath "C:\Program Files\Java\j2ee\lib\javaee.jar" -d classes


```



<https://tulasimadhuri.wordpress.com/2013/05/30/servlet-execution/>

open `WEB-INF` folder

```
javac -classpath "/usr/local/Cellar/tomcat/8.5.5/libexec/lib/servlet-api.jar" -d classes src/MyFirstServlet.java
```
