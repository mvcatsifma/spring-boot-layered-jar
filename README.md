# spring-boot-layered-jar

PoC Build and pack Spring Boot application as a layered jar using buildpacks

This project demonstrates:
* how to build a layered, executable jar
* how to build a OCI image using Cloud Native Buildpacks
* how to biuld a OCI image using Dockerfile
* how to pass build information (e.g. the commit sha) to the app

# Build with Cloud Native Buildpacks

Run `ORG_GRADLE_PROJECT_appBuild=foo gradle bootBuildImage` to build the image using 
Clould Native Buildpacks. The resulting image name will be: `ad-buildsrv-01:5000/ab-layered:foo`.
 
# Build with Docker
 
Run `docker build -t ad-buildsrv-01:5000/sb-layered:baz .` to build the image
using the supplied Dockerfile.  

# references

* [Building Docker Images](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#building-docker-images)
* [Spring Boot Gradle Plugin](https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/gradle-plugin/reference/html/)
