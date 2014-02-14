* Build

mvn clean package

* Test static war

java -jar target/jetty-bootstrap-example-war-1.0.0.jar static.war

=> localhost:8080/test1.html

* Test servlet war

java -jar target/jetty-bootstrap-example-war-1.0.0.jar servlet.war

=> http://localhost:8080/?value=myValue

