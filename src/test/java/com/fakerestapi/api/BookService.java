package com.fakerestapi.api;


import com.fakerestapi.data.Book;
import io.restassured.RestAssured;
import io.restassured.response.Response;


public class BookService extends BaseService {

    public Response getAllBooks() {
        return RestAssured.given()
                .spec(baseSpec)
                .get("/Books");
    }

    public Response getBookById(int id) {
        return RestAssured.given()
                .spec(baseSpec)
                .get("/Books/{id}", id);
    }

    public Response createBook(Book book) {
        return RestAssured.given()
                .spec(baseSpec)
                .body(book)
                .post("/Books");
    }

    public Response updateBook(int id, Book book) {
        return RestAssured.given()
                .spec(baseSpec)
                .body(book)
                .put("/Books/{id}", id);
    }

    public Response deleteBook(int id) {
        return RestAssured.given()
                .spec(baseSpec)
                .delete("/Books/{id}", id);
    }
}