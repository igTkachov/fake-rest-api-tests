package com.fakerestapi.util;

import com.fakerestapi.data.Author;
import com.github.javafaker.Faker;

import java.util.concurrent.ThreadLocalRandom;

public class AuthorFactory {

    private static final Faker faker = new Faker();

    public static Author createRandomAuthor() {
        return Author.builder()
                .id(ThreadLocalRandom.current().nextInt(1000, 10000))
                .idBook(ThreadLocalRandom.current().nextInt(1, 100))
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .build();
    }
}
