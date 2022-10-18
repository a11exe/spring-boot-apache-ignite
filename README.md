# Sample Apache Ignite - Spring Boot application

Example using Apache Ignite cache and sql queries over cache. 

### Used technologies
- Java 8
- Gradle
- Spring Boot
- Apache Ignite
- RESTful services
- Swagger

## Clone

```
git clone git@github.com:a11exe/spring-boot-apache-ignite.git
```

## Build

```
./gradlew clean build
```

## Run
```
java -DIGNITE_QUIET=false -DIGNITE_JETTY_PORT=8081 -jar build/libs/spring-boot-ignite-*.jar
```

## Use
Open swagger ui [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.htm)

Get person by id:
```
curl -X GET "http://localhost:8080/person/1" -H "accept: */*"
```
Add person:
```
curl -X POST "http://localhost:8080/person" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"age\": 30, \"firstName\": \"Alex\", \"id\": 22, \"lastName\": \"Musk\"}"
```
Change person:
```
curl -X PUT "http://localhost:8080/person/22" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"age\": 35, \"firstName\": \"Bob\", \"id\": 22, \"lastName\": \"Musk\"}"
```
Search person:
```
curl -X GET "http://localhost:8080/person/search?age=35&firstName=Bob" -H "accept: */*"
```
Delete person:
```
curl -X DELETE "http://localhost:8080/person/22" -H "accept: */*"
```