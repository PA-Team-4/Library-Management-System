package com.company;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
        /*ISBN = null;
        numberOfPages = Integer.parseInt(null);
        title = null;
        publisher = null;
        publishYear = Integer.parseInt(null);
        description = null;
        genre = null; */
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

    public Book(long ISBN, String title, String author, int publishYear, String genre){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
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

    @Override
    public String toString() {

        return  ISBN + ", " + title + ", " + author  + ", " + publishYear + ", " + ", " + genre+"\n";
    }

    public static void main(String[] BookData) throws IOException {

        Book book0 = new Book(); // default constructor
        Book book1 = new Book(254325432,"Test title 1","Mike Jones",2013, "drama");
        Book book2 = new Book(543254325,"Test title 2","Mike Jogfsdnes",2014, "comedy");
        Book book3 = new Book(543254643,"Test title 3","Mike Jogfdsgfnes",2015, "action");
        Book book4 = new Book(978043913,"Harry Potter and the Goblet of Fire","J. K. Rowling",2002, "adventure");
        Book book5 = new Book(978078683,"The Lightning Thief (Percy Jackson and the Olympians Series #1)","Rick Riordan",2006, "adventure");
        Book book6 = new Book(978197470,"Chainsaw Man Vol. 1","Tatsuki Fujimoto",2020, "action");
        Book book7 = new Book(978078683,"Jujutsu Kaisen Vol. 1","Gege Akutami",2019, "action");
        Book book8 = new Book(978145592,"National Electrical Code 2020 (NEC) / Edition 1","(NFPA) National Fire Protection Association",2019, "education");
        Book book9 = new Book(978022645,"The Structure of Scientific Revolutions: 50th-Anniversary Edition / Edition 4","Thomas S. Kuhn & Ian Hacking",2012, "education");


        ArrayList<Book> books = new ArrayList<>();
        File BookDataCSV = new File("BookData.csv");
        PrintWriter out = new PrintWriter(BookDataCSV);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);


        for(Book data: books) {
            out.printf("%d,%s,%s,%d,%s\n", data.getISBN(), data.getTitle(), data.getAuthor(), data.getPublishYear(), data.getGenre());
        }

        out.close();
        /*System.out.println(user0);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5); */
    }
}