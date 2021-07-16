package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean logged = false;
        String userOptions = "1.View Books 2.Search Books 3.Borrow Book 4.Return Book 5.View My Books";
        String testUser="bob";
        String testPassword = "123"; // transient??

        // we didn't implement sign up yet

        Scanner sc = new Scanner(System.in);


        String userName, userPassword;

do {                                        // attempting to login
    System.out.println("Enter Username: ");
    userName = sc.next();
    System.out.println("Enter Password: ");
    userPassword = sc.next();

    if (testUser.equals(userName) && testPassword.equals(userPassword)) {
        System.out.println("login was successful");
        logged = true;
    } else {
        System.out.println("Login Attempt failed");

    }
}while (!logged); // bool that should stop when someone is logged in

        System.out.println("Hello "+userName); // like a user name. get name
        System.out.println("What would you like to do?\nPlease select the numeric value 1, 2, etc\n"+userOptions);


        int userChoice = sc.nextInt();

//System.out.println("Back to Main Menu\n"+userOptions);
        switch (userChoice){
            case 0:
                System.out.println(userChoice+" Was pressed, and attempting to log out! please confirm by using y/n");
                char logoutChoice = sc.next().charAt(0);
                if (logoutChoice =='y'){
                    System.out.println("Logging out");
                    logged = false;
                    userName = "";
                    userPassword = "";
                    // incase we need other things


                    sc.close();// might not need this if we allow another user to log in
                    break;

                }else if (logoutChoice=='n'){
                    System.out.println("User decided not to log out");

                }else {

                }

                break;
            case 1:
                System.out.println("View Books was Selected");
                // view all books or user's current books
                // do stuff here
                break;
            case 2:
                System.out.println("Search Book was Selected");
                // if it did then another scanner is needed here

                break;
            case 3:
                System.out.println("Borrow Book was Selected");
                // now they have to select the book

                break;
            case 4:
                System.out.println("Return Book was Selected");
                // will have to select a book from their current my books

                break;
             case 5:
                System.out.println("View My Books was Selected");
                // will have to view user books if they have any

                break;


             default:
                System.out.println("What you clicked wasn't an option");
                 System.out.println(userOptions);
                // if it did then another scanner is needed here

                break;

        }




    }
}
