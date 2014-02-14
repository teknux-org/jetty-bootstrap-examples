# JSP Standalone Web Application Example

http://jetty-bootstrap.io

## Description

This sample project demonstrate how to simply embed your war application into a standalone executable jar with jetty boostrap.

This is a multi-module maven project. the *web-application* is a simple war maven project (like you are probably using), to make this war run by itself we added a *jetty-bootstrap-runner* that includes the jetty-boostrap library and a simple Main to make the jar executable and deploys the war file.

The rest is magic done by Maven and the Maven Shade Plugin. To see how it works have a look at the *jetty-bootstrap-runner/pom.xml* 

## How to run

```
mvn package
java -jar jetty-boostrap-runner/target/jetty-boostrap-runner-*.jar
```