package com.fakerestapi.api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public abstract class BaseService {

    protected final RequestSpecification baseSpec;

    protected BaseService() {
        baseSpec = RestAssured.given()
                .baseUri("https://fakerestapi.azurewebsites.net")
                .basePath("/api/v1")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON);
    }
}
