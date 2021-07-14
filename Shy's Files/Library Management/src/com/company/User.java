package com.company;

import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class User {
    private int userID;
    private String name;
    private String address;
    private int phone;
    private String email;
    private boolean custOrLib;

    public User(){
        userID = Integer.parseInt(null);
        name = null;
        address = null;
        phone = Integer.parseInt(null);
        email = null;
        custOrLib = true;
    }

    public User(int userID, String name, String address, int phone, String email){
        this.userID = userID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public User(int userID, String name, String address, int phone, String email, boolean custOrLib) {
        this.userID = userID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.custOrLib = custOrLib;
    }
    /* getBorrowedBook(): void
        searchUser(name: String): string
        delete User(name: String)
        returnBook(name: String)
        payFine()
     */

    public void getBorrowedBook() {
        // I am assuming this would be getBookDetails() from the book class
    }

    public String SearchUser(String name) {
        Scanner nameSearch = new Scanner(System.in);
        String search = nameSearch.next();

        if(search.equals(name)) {
            return ("UserID: " + userID + "\n" + "Name: " + name + "\n" + "Address: " + address + "\n" + "Phone: " + phone + "\n" + "Email: " + email);
        }
        else {
            return ("USER NOT FOUND");
        }
    }

    public void DeleteUser(String name) {
        // https://www.geeksforgeeks.org/java-program-delete-certain-text-file/
    }
    
}
