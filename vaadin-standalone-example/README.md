## Example Vaadin application running as a standalone jar with Jetty Bootstrap

http://jetty-bootstrap.io

### Description
This example show how to have a single executable jar that runs a Vaadin Web application.

### Requirements
- Java 7
- Maven

### How to run
In case you have your war file on the file system (e.g. /tmp/webapp.war), it is as simple as this:
```
mvn package && java -jar target/vaadin-example-0.0.1-SNAPSHOT.jar
```
