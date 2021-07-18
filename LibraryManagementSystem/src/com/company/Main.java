package com.company;


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        boolean logged = false;
        String userOptions = "1.View Books 2.Search Books 3.Borrow Book 4.Return Book 5.View My Books";
        String testUser="bob";
        String testPassword = "123"; // transient??

        String userPath = "C:\\Users\\NCG\\Documents\\TestingEnvironment\\user.csv";
        String line = "";

       /* try {
            BufferedReader br = new BufferedReader(new FileReader(userPath));

            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                System.out.println(values[0]);
                if(values[0].equals("1237")){
                    System.out.println("task complete");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        } */

        // we didn't implement sign up yet

        Scanner sc = new Scanner(System.in);


        String userName, userPassword;

        do {                                        // attempting to login
            System.out.println("Enter Username: ");
            userName = sc.next();
            System.out.println("Enter Password: ");
            userPassword = sc.next();

            try {
                BufferedReader br = new BufferedReader(new FileReader(userPath));

                while((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    if((values[0].equals(userName)) && (values[1].equals(userPassword))) {
                        System.out.println("LOGIN WAS SUCCESSFUL");
                        String accName = values[2];
                        logged = true;
                        break;
                    }

                    if((values[0].equals(userName)) && (!values[1].equals(userPassword))) {
                        System.out.println("PASSWORD INCORRECT");
                        break;
                    }
                    if((!values[0].equals(userName)) && (!values[1].equals(userPassword))) {
                        System.out.println("LOGIN FAILED");
                        break;
                    }

                        /*if(account[1].equals(userPassword) && (values[0].equals(userName))){
                            System.out.println("good");
                        } */


                    //if(values[0].equals(userName) && values.equals(userPassword)){
                    //System.out.println("test successful");

                    //}
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }while (!logged); // bool that should stop when someone is logged in



        System.out.println("WELCOME"); // like a user name. get name
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