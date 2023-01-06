FROM openjdk:11
ADD target/emsusingsboot-0.0.1-SNAPSHOT.jar emsusingsboot-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java", "-jar", "emsusingsboot-0.0.1-SNAPSHOT.jar" ]