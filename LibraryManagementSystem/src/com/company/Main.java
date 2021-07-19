package com.company;


import org.w3c.dom.UserDataHandler;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {
        boolean logged = false;
        boolean menu = false;
        boolean menuOptions = false;
        String userOptions = "0.Exit Application 1.View Books 2.Search Books 3.View Account Details";

        String userPath = "C:\\Users\\NCG\\Documents\\TestingEnvironment\\user.csv";
        String line = "";

        String bookPath = "C:\\Users\\NCG\\Documents\\TestingEnvironment\\BookData.csv";
        String bookLine = "";

        User user = new User();

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
                        logged = true;
                        break;
                    }

                    if((values[0].equals(userName)) && (!values[1].equals(userPassword))) {
                        System.out.println("PASSWORD INCORRECT");
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

        do {
            System.out.println("What would you like to do?\n" + userOptions);
            String userChoice = sc.next();

            switch (userChoice) {
                case "0":
                    System.out.println(userChoice + " Was pressed, and attempting to log out! please confirm by using y/n");
                    char logoutChoice = sc.next().charAt(0);
                    if (logoutChoice == 'y') {
                        System.out.println("Logging out");
                        logged = false;
                        menu = false;
                        userName = "";
                        userPassword = "";
                        return;
                        // incase we need other things

                    } else if (logoutChoice == 'n') {
                        System.out.println("User decided not to log out");

                    } else {

                    }

                    break;
                case "1":
                    System.out.println("View Books was Selected");

                    Book book = new Book();

                    try {
                        BufferedReader buff = new BufferedReader(new FileReader(bookPath));

                        while ((bookLine = buff.readLine()) != null) {
                            String[] books = bookLine.split(",");
                            System.out.println("ISBN: " + books[0] + "\n" + "Title: " + books[1] + "\n" + "Author: " + books[2] + "\n" + "Year Published: " + books[3] + "\n" + "Genre: " + books[4] + "\n");

                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                    // view all books or user's current books
                    // do stuff here
                    break;
                case "2":
                    System.out.println("Search Book was Selected");
                    System.out.println("How would you like to search?: a.By ISBN b.By Title c.By Author d.By Published year e.By Genre");
                    String bookSearch = sc.next();

                    switch (bookSearch) {
                        case "a":
                            System.out.println("What is the ISBN?");
                            String isbn = sc.next();

                            try {
                                BufferedReader nbuff = new BufferedReader(new FileReader(bookPath));

                                while ((bookLine = nbuff.readLine()) != null) {
                                    String[] books = bookLine.split(",");
                                    if (books[0].equals(isbn)) {
                                        System.out.println("ISBN: " + books[0] + "\n" + "Title: " + books[1] + "\n" + "Author: " + books[2] + "\n" + "Year Published: " + books[3] + "\n" + "Genre: " + books[4] + "\n");
                                    }

                                }
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "b":
                            System.out.println("What is the title? ");
                            String title = sc.next();

                            try {
                                BufferedReader sbuff = new BufferedReader(new FileReader(bookPath));

                                while ((bookLine = sbuff.readLine()) != null) {
                                    String[] books = bookLine.split(",");
                                    if ((books[1].contains(title))) {
                                        System.out.println("ISBN: " + books[0] + "\n" + "Title: " + books[1] + "\n" + "Author: " + books[2] + "\n" + "Year Published: " + books[3] + "\n" + "Genre: " + books[4] + "\n");
                                    }

                                }
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;

                        case "c":
                            System.out.println("Who is the author?");
                            String author = sc.next();

                            try {
                                BufferedReader nbuff = new BufferedReader(new FileReader(bookPath));

                                while ((bookLine = nbuff.readLine()) != null) {
                                    String[] books = bookLine.split(",");
                                    if ((books[2].contains(author))) {
                                        System.out.println("ISBN: " + books[0] + "\n" + "Title: " + books[1] + "\n" + "Author: " + books[2] + "\n" + "Year Published: " + books[3] + "\n" + "Genre: " + books[4] + "\n");
                                    }

                                }
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "d":
                            System.out.println("What year was it published?");
                            String year = sc.next();

                            try {
                                BufferedReader nbuff = new BufferedReader(new FileReader(bookPath));

                                while ((bookLine = nbuff.readLine()) != null) {
                                    String[] books = bookLine.split(",");
                                    if ((books[3].equals(year))) {
                                        System.out.println("ISBN: " + books[0] + "\n" + "Title: " + books[1] + "\n" + "Author: " + books[2] + "\n" + "Year Published: " + books[3] + "\n" + "Genre: " + books[4] + "\n");
                                    }

                                }
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        case "e":
                            System.out.println("What is the genre?");
                            String genre = sc.next();

                            try {
                                BufferedReader nbuff = new BufferedReader(new FileReader(bookPath));

                                while ((bookLine = nbuff.readLine()) != null) {
                                    String[] books = bookLine.split(",");
                                    if ((books[4].contains(genre))) {
                                        System.out.println("ISBN: " + books[0] + "\n" + "Title: " + books[1] + "\n" + "Author: " + books[2] + "\n" + "Year Published: " + books[3] + "\n" + "Genre: " + books[4] + "\n");
                                    }

                                }
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            break;
                        default:

                            System.out.println("What you clicked wasn't an option");
                            System.out.println(userOptions);
                            // if it did then another scanner is needed here

                            break;


                    }
                    break;
                case "3":
                    System.out.println("View Account Info was Selected");

                    try {
                        BufferedReader br = new BufferedReader(new FileReader(userPath));

                        while((line = br.readLine()) != null) {
                            String[] values = line.split(",");
                            if((values[0].equals(userName))) {
                                System.out.println("UserID: " + values[0]);
                                System.out.println("Name: " + values[2]);
                                System.out.println("Address: " + values[3]);
                                System.out.println("Phone: (" + values[4] + ")" + " " +values[5]);
                                System.out.println("Address" + values[6]);
                            }

                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;


                default:
                    System.out.println("What you clicked wasn't an option");
                    System.out.println(userOptions);
                    // if it did then another scanner is needed here

                    break;

            }

        }
        while (!menu);

    }
}