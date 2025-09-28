package com.fakerestapi.api;

import com.fakerestapi.data.Author;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AuthorService extends BaseService {

    public Response getAllAuthors() {
        return RestAssured.given()
                .spec(baseSpec).get("/Authors");
    }

    public Response getAuthorsByBookId(int idBook) {
        return RestAssured.given()
                .spec(baseSpec).get("/Authors/authors/books/{idBook}", idBook);
    }

    public Response getAuthorById(int id) {
        return RestAssured.given()
                .spec(baseSpec)
                .get("/Authors/{id}", id);
    }

    public Response createAuthor(Author author) {
        return RestAssured.given()
                .spec(baseSpec).body(author).post("/Authors");
    }

    public Response updateAuthor(int id, Author author) {
        return RestAssured.given()
                .spec(baseSpec).body(author).put("/Authors/{id}", id);
    }

    public Response deleteAuthor(int id) {
        return RestAssured.given()
                .spec(baseSpec).delete("/Authors/{id}", id);
    }
}