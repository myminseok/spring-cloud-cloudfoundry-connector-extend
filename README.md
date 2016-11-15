# spring-cloud cloud foundry connector for mariadb

## build

```
 gradle clean assemble
```

## install to local maven repo
```
mvn install:install-file  -Dfile=spring-cloud-cloudfoundry-connector-extend-1.0.0.BUILD-SNAPSHOT.jar -DgroupId=org.springframework.cloud -DartifactId=spring-cloud-cloudfoundry-connector-extend -Dversion=1.0.0.BUILD-SNAPSHOT -Dpackaging=jar
```

## add to your build.gradle
```
  dependencies {
    compile "org.springframework.cloud:spring-cloud-cloudfoundry-connector-extend:1.0.0.BUILD-SNAPSHOT"
```

## reference:
* http://cloud.spring.io/spring-cloud-connectors/spring-cloud-connectors.html
* https://github.com/spring-cloud/spring-cloud-connectors
* https://github.com/cloudfoundry-samples/spring-music
