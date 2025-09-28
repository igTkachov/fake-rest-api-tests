# FakeRestApiTests

Test for FakeRestApi using Java, JUnit 5, RestAssured and Allure reports.

## Requirements

- Java 17+
- Maven 3+

## Clone repository

```bash
git clone https://github.com/igTkachov/fake-rest-api-tests.git
cd fake-rest-api-tests
```
## Execute tests

```bash
cd FakeRestApiTests
mvn clean test
```

## Running a specific test class:
```bash
mvn -Dtest=BooksApiTest test
mvn -Dtest=AuthorsApiTest test
```

## Reporting (Allure) 
### For Mac
```bash
brew install allure

allure generate target/allure-results -o target/allure-report --clean
allure open target/allure-report
```
### For Ubuntu
```bash
sudo apt-add-repository ppa:qameta/allure
sudo apt-get update
sudo apt-get install allure

allure generate target/allure-results -o target/allure-report --clean
allure open target/allure-report
```
