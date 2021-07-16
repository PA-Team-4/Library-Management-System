package com.company;

public class Book {
    private long ISBN;
    private int numberOfPages;
    private String title;
    private String author;
    private Publisher publisher;
    private int publishYear;
    private String description;
    private boolean availability;
    private int numberOfCopies;
    private String genre;

    public Book(){
        ISBN = Long.parseLong(null);
        numberOfPages = Integer.parseInt(null);
        title = null;
        publisher = null;
        publishYear = Integer.parseInt(null);
        description = null;
        genre = null;
    }

    public Book(long ISBN, int numberOfPages, String title, String author, Publisher publisher, int publishYear, String description, String genre){
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.author = author;
//        this.publisher = publisher;
        this.publishYear = publishYear;
        this.description = description;
        this.genre = genre;
    }

    public void getBookDetails() {
        System.out.println("Title: " + title + "\n" + "ISBN: " + ISBN +"\n"+ "Author: " + author);
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public int getnumberOfPages() {
        return numberOfPages;
    }

    public void setnumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
}