// File: Ex02CustomAssertionsExample.java
// Package: com.coherentsolutions.advanced.java.section02

package com.coherentsolutions.advanced.java.section02;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Ex02CustomAssertionsExample
 *
 * Demonstrates custom assertions using AssertThat and Hamcrest matchers.
 */
public class Ex02CustomAssertionsExample {

    /**
     * A simple Book class for custom assertions.
     */
    class Book {
        String title;
        String author;
        int pages;

        Book(String title, String author, int pages) {
            this.title = title;
            this.author = author;
            this.pages = pages;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getPages() {
            return pages;
        }
    }

    /**
     * Test method to demonstrate custom assertions using AssertThat.
     */
    @Test
    void testBookProperties() {
        Book book = new Book("Java for Beginners", "John Doe", 450);

        // Custom assertions with AssertThat and Hamcrest matchers
        assertThat(book.getTitle(), is("Java for Beginners"));
        assertThat(book.getAuthor(), startsWith("John"));
        assertThat(book.getPages(), greaterThan(300));
    }
}
