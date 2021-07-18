package com.company;

import java.io.*;
import java.util.Scanner;
import java.lang.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class User {
    private int userID;
    private String password;
    private String name;
    private String address;
    private int areaCode;
    private int phone;
    private String email;
    private boolean custOrLib;


    public User(){
        /*userID = Integer.parseInt(null);
        password = null;
        name = null;
        address = null;
        areaCode = Integer.parseInt(null);
        phone = Integer.parseInt(null);
        email = null;
        custOrLib = true; */
    }

    public User(int userID, String password, String name, String address, int areaCode, int phone, String email){
        this.userID = userID;
        this.password = password;
        this.name = name;
        this.address = address;
        this.areaCode = areaCode;
        this.phone = phone;
        this.email = email;
    }

    public User(int userID, String password, String name, String address, int areaCode, int phone, String email, boolean custOrLib) {
        this.userID = userID;
        this.password = password;
        this.name = name;
        this.address = address;
        this.areaCode = areaCode;
        this.phone = phone;
        this.email = email;
        this.custOrLib = custOrLib;
    }
    

    public int getUserID(){
        return userID;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public int getAreaCode(){
        return areaCode;
    }

    public int getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public boolean getStatus(){
        return custOrLib;
    }

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





    @Override
    public String toString() {

        return  userID + ", " + password + ", " + name  + ", " + address + ", " + areaCode + ", " + phone + ", " + email+"\n";
    }

    public static void main(String[] UserData) throws IOException {

        User user0 = new User(); // default constructor
        User user1 = new User(1234,"Password1","Michael Jones","3132 Street",423,7466117,"tewi7@nhmty.com");
        User user2 = new User(1235,"Password2","Khloe Dolan","111 Street",480,5423835,"teio577@nhmty.com");
        User user3 = new User(1236,"Password3","Alexia Saunders","111 Street",704,9473928,"ewir577@nhmty.com");
        User user4 = new User(1237,"Password4","Mae Khan","111 Street",818,7983572,"tewi37@nhmty.com");
        User user5 = new User(1238,"Password5","Remy Haley","111 Street",903,3020927,"two377@nhmty.com");

        ArrayList<User> users = new ArrayList<>();
        File UserCSV = new File("user.csv");
        PrintWriter out = new PrintWriter(UserCSV);

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
        users.add(user5);

        for(User data: users) {
            out.printf("%d,%s,%s,%s,%d,%d,%s\n", data.getUserID(), data.getPassword(), data.getName(), data.getAddress(), data.getAreaCode(), data.getPhone(), data.getEmail());
        }

        out.close();
        /*System.out.println(user0);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(user4);
        System.out.println(user5); */
    }

    /*public static void AddUser(String[] UserData){
         int newID;
         String newPass;
         String newName;
         String newAddress;
         int newAreaCode;
         int newPhone;
         String newEmail;
         boolean newStatus;

        Scanner scan = new Scanner(System.in);
        newID = scan.nextInt();
        System.out.println("New user ID (numbers only):\n" + newID);

        newPass = scan.next();
        System.out.println("New password:\n" + newPass);

        newName = scan.next();
        System.out.println("Name (first and last):\n" + newName);

        newAddress = scan.next();
        System.out.println("Address:\n" + newAddress);

        newAreaCode = scan.nextInt();
        System.out.println("Phone area code (first 3 digits of phone number):\n" + newAreaCode);

        newPhone = scan.nextInt();
        System.out.println("Rest of Phone number:\n" + newPhone);

        newEmail = scan.next();
        System.out.println("Email:\n" + newID);

        User user6 = new User(newID, newPass, newName, newAddress, newAreaCode, newPhone, newEmail);
    }*/
}
