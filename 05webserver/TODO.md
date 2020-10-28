
# Install Tomcat

<https://tomcat.apache.org/>

![](https://tomcat.apache.org/images/tomcat.png)

<https://maltronic.io/2016/01/14/easily-install-apache-tomcat-on-mac-os-x-10-11-el-capitan-with-homebrew/>

```
brew install tomcat
```

```
ls /usr/local/Cellar/
```


```
/usr/local/Cellar/tomcat/[version]/bin/catalina run
```
With [version] replaced with your installed version.


Once the server is running you can navigate to the host page at:

<http://localhost:8080/>


Finally

To add and manage applications running on the server you will also need to edit a configuration file:

```
vim /usr/local/Cellar/tomcat/[version]/libexec/conf/tomcat-users.xml
```
With [version] again replaced with your installed version.


Towards the bottom of this short config file you will see a selection of users – all commented out by default. You need to uncomment one of these and give it the extra role “manager-gui” (preferably also changing the username and password for security). The resultant user entry should look something like this:

```
<user username="admin" password="password" roles="tomcat,manager-gui" />
```

After this you can navigate to the page (or click the “Manager App” link on the main Tomcat Server page):

<http://localhost:8080/manager/html>


Here you can view or delete the included sample application and deploy your own. Usually, it’s easiest to deploy applications in a dev / testing environment using an IDE like PHPStorm or NetBeans however, Tomcat’s web interface is useful also. For reference, deployed applications are usually then located under the directory:

```
/usr/local/Cellar/tomcat/[version]/libexec/webapps/
```



# Installing programm


<https://www.mkyong.com/servlet/a-simple-servlet-example-write-deploy-run/>


<https://tulasimadhuri.wordpress.com/2013/05/30/servlet-execution/>

<http://www.javatpoint.com/GenericServlet-class>

