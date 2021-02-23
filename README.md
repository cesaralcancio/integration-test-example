# integration-test-example

Simple example using Spring Boot and Maven to create unit and integration tests

## commands

* mvn clean install

Runs only the unit tests


* mvn clean install -Dit

Runs unit tests plus the integration tests. There are two scripts inside src/test/, run-pre-integration.sh and run-post-integration.sh responsible for starting your dependencies, for example, docker containers.  