# cloud foundry connector for mariadb
current cloud foundry connector doesnot understand uri starting with 'mariadb'. 
this is connector for mariadb which can understand following protocol:
```
mariadb://<username>:<password>@<hostname>:<port>/<databasename>.
```

## how to build
```
 gradle clean assemble
```
## how to use (for example with spring music)

1. install to local maven repo
```
mvn install:install-file  -Dfile=spring-cloud-cloudfoundry-connector-extend-1.0.0.BUILD-SNAPSHOT.jar -DgroupId=org.springframework.cloud -DartifactId=spring-cloud-cloudfoundry-connector-extend -Dversion=1.0.0.BUILD-SNAPSHOT -Dpackaging=jar
```
2. clone spring music
```
git clone https://github.com/cloudfoundry-samples/spring-music
```
3. add dependency to your build.gradle
```
  dependencies {
    compile "org.springframework.cloud:spring-cloud-cloudfoundry-connector-extend:1.0.0.BUILD-SNAPSHOT"
```
4. create a user-provided Maridb database service instance
```
$ cf create-user-provided-service mymariadb -p '{"uri":"mariadb://root:secret@dbserver.example.com:3306/mydatabase"}'
```

5. edit your manifest.yml
```
---
applications:
- name: spring-music-mariadb
  memory:  512M
  instances: 1
  host: spring-music-mariadb
  path: build/libs/spring-music.war
  services:
  - mymariadb

```

6. push to cloud foundry
```
cf push -f manifest.yml
```


## reference:
* http://cloud.spring.io/spring-cloud-connectors/spring-cloud-connectors.html
* https://github.com/spring-cloud/spring-cloud-connectors
* https://github.com/cloudfoundry-samples/spring-music
