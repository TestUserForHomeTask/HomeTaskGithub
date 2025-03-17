## Environment Details
- Java Version: 22
- TestNG
- Maven
- Lombok: Ensure Lombok extension is installed.

## Local Run
Test run is parallelized by classes
To run tests locally use the following command:
mvn clean test -Ddriver=chrome -DheadlessMode=false -Dsecret=B9CE98F04918610A1F114CA398C22B62 -DsuitePath=sanitySuite

## Environment data:
Environment data is located in the test/resources/env.properties file

## Test data:
Test data is located in the test/resources/test.properties file