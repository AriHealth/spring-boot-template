# Spring Boot template

[![Build Status](https://travis-ci.org/AriHealth/spring-boot-template.svg?branch=master)](https://travis-ci.org/AriHealth/spring-boot-template) 
[![codecov.io](https://codecov.io/gh/AriHealth/spring-boot-template/branch/master/graphs/badge.svg)](http://codecov.io/gh/AriHealth/spring-boot-template)
[![Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=net.atos.ari:spring-boot-template&metric=alert_status)](https://sonarcloud.io/dashboard/index/net.atos.ari:spring-boot-template)
[![Docker Build](https://img.shields.io/docker/cloud/build/ccavero/simple-calculator)](https://cloud.docker.com/u/ccavero/repository/docker/ccavero/simple-calculator)
[![Docker Pulls](https://img.shields.io/docker/pulls/ccavero/simple-calculator)](https://cloud.docker.com/u/ccavero/repository/docker/ccavero/simple-calculator)
[![License](https://img.shields.io/badge/License-Apache%202.0-green.svg)](https://opensource.org/licenses/Apache-2.0)

## Description

Spring Boot template for CI with GitHub, Travis CI, SonarCloud and Docker Hub. It exposes an API with this operation:

- [POST] plus

## Technology

- Java 8+
- Maven for Java dependency management
- Spring Boot 
- Lombok for the models

## Functionalities

- Add two numbers without verification

## How to deploy

Compile and package the project with

```
mvn clean package
```

and execute

```
java -jar target/spring-boot-template.jar
```

It can also be run as:

```
mvn spring-boot:run
```

Go to your browser and type http://localhost:8082/swagger-ui.html

## Environment variables

    LOGGING_FOLDER=
    LOGGING_MODE=

## Docker deployment

Build the image:

```
docker build -t health/calculator .
```

Simple deployment:

```
docker run --name calculator -d health/calculator
```

Logging can be also configured using `LOGGING_FOLDER` and sharing a volume (this is useful for example for [ELK](https://www.elastic.co/elk-stack) processing). The level of the logging can be configured with `LOGGING_MODE` (dev|prod):

```
docker run --name calculator -d -v /tmp/log/calculator:/log/calculator -e LOGGING_FOLDER=/log/test -e LOGGING_MODE=dev health/calculator
```

## License

Apache 2.0

By downloading this software, the downloader agrees with the specified terms and conditions of the License Agreement and the particularities of the license provided.
