package org.example;

public class Post {

    private String title;
    private String author;
    private String datePublished;
    private int rate;

    private int numberOfWords;

    public Post(String title, String author, String datePublished, int rate, int numberOfWords) {
        this.title = title;
        this.author = author;
        this.datePublished = datePublished;
        this.rate = rate;
    }
}
