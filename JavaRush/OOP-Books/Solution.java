package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;
        private String title;

        public Book(String author, String title) {
            this.author = author;
            this.title = title;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            if (this instanceof MarkTwainBook)
            {
                return markTwainOutput;
            }
            else
            {
                return agathaChristieOutput;
            }
        }

        public String toString() {
            return getOutputByBookType();
        }
    }

    public static class MarkTwainBook extends Book {

        public MarkTwainBook(String title) {
            super("Mark Twain", title);
        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return super.title;
        }
    }

    public static class AgathaChristieBook extends Book {
        String title

        public AgathaChristieBook(String title) {
            super("Agatha Christie", title);

        }

        @Override
        public Book getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return super.title;
        }
    }
}
