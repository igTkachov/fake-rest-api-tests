package com.fakerestapi.util;


import com.fakerestapi.data.Book;
import com.github.javafaker.Faker;


import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.concurrent.ThreadLocalRandom;


public class BookFactory {
    private static final Faker faker = new Faker();

    public static Book createRandomBook() {
        return Book.builder()
                .id(ThreadLocalRandom.current().nextInt(1000, 10000))
                .title(faker.book().title())
                .description(faker.lorem().sentence(10))
                .pageCount(ThreadLocalRandom.current().nextInt(50, 500))
                .excerpt(faker.lorem().paragraph(3))
                .publishDate(OffsetDateTime.now(ZoneOffset.UTC).toString())
                .build();
    }
}