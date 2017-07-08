# spring-cloud-sample

## Project Generate by Maven

### Configure server

```shell
 mvn archetype:generate -DgroupId=spring.cloud.on.docker -DartifactId=config-server -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

This project is used as configure center. It reads the data from github repository.

This configure server start up on port 9900 that configured in the application.yml.


### Registry server

```shell
 mvn archetype:generate -DgroupId=spring.cloud.on.docker -DartifactId=registry-server -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Services registration based on eureka.
see: https://github.com/spring-cloud-samples/eureka

### Calculator server

```shell
 mvn archetype:generate -DgroupId=spring.cloud.on.docker -DartifactId=calculator-server -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Provide basic calculate method(plus/minus etc).

### Formula server

```shell
 mvn archetype:generate -DgroupId=spring.cloud.on.docker -DartifactId=formula-server -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Provide formula calculate by invoke the calculate server.

### Cuboid server

```shell
 mvn archetype:generate -DgroupId=spring.cloud.on.docker -DartifactId=cuboid-server -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

As the application service that provide interface to calculate the value of cuboid attribute.


### Gateway server

```shell
 mvn archetype:generate -DgroupId=spring.cloud.on.docker -DartifactId=gateway-server -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```