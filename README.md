# JWT With Spring
<p align="center">
</p>

---

<li> Welcome to JWt with spring, this is an implementation of jwt to secure spring boot api

##  📝Table of content

---
- [Built Using](#built).
- [Features](#features).
- [Requirements](#requirements).
- [Installation Steps](#installation).
- [Api documentation](#api).
- [concepts and patterns used](#concepts).
- [Acknowledgements](#acknowledgements).


## ⛏️ Built Using <a name = "built"></a>

---
- [MySQL](https://www.mongodb.com/) - Database
- [Java](https://docs.oracle.com/en/java/) - Programming Language
- [Spring boot](https://spring.io/projects/spring-boot) - Web Framework
- [Spring Security](https://docs.spring.io/spring-security/reference/index.html) - security framework of spring
- [JWT](https://jwt.io/) 
## 🧐Features <a name = "features"></a>

---
- public Api endpoints for login, register
- private Api endpoint for demo


## 🔧Requirements <a name = "requirements"></a>

---
- java => 17
- spring boot => 3.2.3
- maven
- MySQL

## 🚀 Installation Steps <a name = "installation"></a>

---

First clone this repository, install the dependencies, and setup your .env file.

````
git clone https://github.com/VlixAli/Jwt-with-spring-
mvn clean install
cd src/main/resources
cp .env.example .env
````

then run the following commands to run the project

````
cd ../../../
mvn spring-boot:run
````

the application will be available at [http://localhost:8080](http://localhost:8080)

## ✍️ Api documentation <a name = "api"></a>

---
for how to use it check the documentation [JWT-with-spring](https://documenter.getpostman.com/view/23171948/2sA35D6jB2)

## 🎈 concepts and patterns used <a name = "concepts"></a>

- service design pattern 
- repository design pattern 
- DTO for requests and responses


## 🎉 Acknowledgements <a name = "acknowledgements"></a>

---
 This project was created following this tutorial [Spring Boot 3 + Spring Security 6 - JWT Authentication and Authorization](https://www.youtube.com/watch?v=KxqlJblhzfI) On youtube