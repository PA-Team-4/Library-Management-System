package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Catalog {

    static ArrayList<Book> value = new ArrayList<>();
    static HashMap<String, ArrayList<Book>> bookTitles = new HashMap<>();
    static HashMap<String, ArrayList<Book>> bookAuthors = new HashMap<>();
    static HashMap<String, ArrayList<Book>> bookGenre = new HashMap<>();
    static HashMap<Integer, ArrayList<Book>> bookPubYear = new HashMap<>();
    static HashMap<Long, ArrayList<Book>> bookISBN = new HashMap<>();


    public static void addBook(Book book) {
        value.add(book);
        bookTitles.put(book.getTitle(), value);
        bookAuthors.put(book.getAuthor(), value);
        bookGenre.put(book.getGenre(), value);
        bookPubYear.put(book.getPublishYear(), value);
        bookISBN.put(book.getISBN(), value);
        book.setNumberOfCopies(book.getNumberOfCopies() + 1);

    }

    public static void removeBook(Book book) {
        bookTitles.remove(book.getTitle());
        bookAuthors.remove(book.getAuthor());
        bookGenre.remove(book.getGenre());
        bookPubYear.remove(book.getPublishYear());
        bookISBN.remove(book.getISBN());

        if (book.getNumberOfCopies() <= 0){
            System.out.println("Error: Cannot remove anymore books");
        }
        else {
            book.setNumberOfCopies(book.getNumberOfCopies() - 1);
        }
    }

    public static void isAvailable(Book book) {
        if (book.getNumberOfCopies() > 0) {
            book.setAvailability(true);
        }
        else {
            book.setAvailability(false);
        }
    }
    public static void PrintList() {
        for(String str: bookTitles.keySet()) {
            System.out.println(str);
        }

        for(String str: bookAuthors.keySet()) {
            System.out.println(str);
        }

        for(String str: bookGenre.keySet()) {
            System.out.println(str);
        }

        for(int str: bookPubYear.keySet()) {
            System.out.println(str);
        }

    }
    public static boolean searchByTitle(Book book) {
        if (bookTitles.containsKey(book.getTitle())){
            return true;
        }
        return false;
    }

    public static boolean searchByISBN(Book book) {
        if (bookISBN.containsKey(book.getISBN())){
            return true;
        }
        return false;
    }

    public static boolean searchByAuthor(Book book){
        if (bookAuthors.containsKey(book.getAuthor())){
            return true;
        }
        return false;
    }
    public static boolean searchByGenre(Book book){
        if (bookGenre.containsKey(book.getGenre())){
            return true;
        }
        return false;
    }
    public static boolean searchPubYear(Book book){
        if (bookPubYear.containsKey(book.getPublishYear())){
            return true;
        }
        return false;
    }
}