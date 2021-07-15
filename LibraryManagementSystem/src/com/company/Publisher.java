package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Date;


public class Publisher {
    private int pubID, pubPhone;   //pub instead of Publisher
    private String pubName, pubAddress;
    private Date dateCreated;

//    private ArrayList<Book> works;
//
//
//    private ArrayList<Book> booksToDeliver;
    // arraylist of book objects




    public Publisher(){} //default Constructor

    public Publisher(int pubID, String pubName, int pubPhone, String pubAddress, Date dateCreated){
        this.pubID = pubID;
        this.pubPhone = pubPhone;
        this.pubName = pubName;
        this.pubAddress = pubAddress;
        this.dateCreated = dateCreated;
    }

    public void setPubID(int pubID) {
        this.pubID = pubID;
    }

    public int getPubID() {
        return pubID;
    }

    public void setPubPhone(int pubPhone) {
        this.pubPhone = pubPhone;
    }

    public int getPubPhone() {
        return pubPhone;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubAddress(String pubAddress) {
        this.pubAddress = pubAddress;
    }

    public String getPubAddress() {
        return pubAddress;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

//    public void setBooksToDeliver(ArrayList<Book> booksToDeliver) { //book's arraylist
//        this.booksToDeliver = booksToDeliver;
//    }
//
//    public ArrayList<Book> getBooksToDeliver() { //book's arraylist
//        return booksToDeliver;
//    }

//    protected void bookDelivery(){
//        System.out.println("Some books were ordered\n");
//        System.out.println(booksToDeliver); //this or the one below
//    }

    public static void writePubCSV(String publisherStringValue) throws IOException { // this i'm using to write/append

        Path myPath = Paths.get("Publisher_data.csv");

        try {

            Files.write(myPath, publisherStringValue.getBytes(), StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND); // creates if it doesn't exist, else add
    //        Files.write(myPath, "test".getBytes());// ** nuking it
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void readAFile() { // will have to work on this, most code is in main
        String temp;
        Path myPath = Paths.get("Publisher_data.csv");


        try {
            // need to fill this from main which is below

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        /*
        return "Publisher{" +
                "pubID=" + pubID +
                ", pubPhone=" + pubPhone +
                ", pubName='" + pubName + '\'' +
                ", pubAddress='" + pubAddress + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
         */
        return  pubID +
                ", " + pubPhone +
                ", " + pubName  +
                ", " + pubAddress +
                ", " + dateCreated+"\n";
    }

    public static void main(String[] args) throws IOException {

        Publisher pub0 = new Publisher(); // default constructor

        Publisher pub1 = new Publisher(111,"Test Books",2014446666,"111 Street"
                ,new Date());
        Publisher pub2 = new Publisher(112,"Bird Books",2113455566,"12 bird Street"
                ,new Date());
        Publisher pub3 = new Publisher(123,"Great Books",2015556666,"123 Street"
                ,new Date());
        Publisher pub4 = new Publisher(124,"Amazing Books",2017776666,"124 Street"
                ,new Date());
        Publisher pub5 = new Publisher(125,"Some Books",2018886666,"125 Avenue"
                ,new Date());


        // int pubID, String pubName, int pubPhone, String pubAddress, Date DOB

        System.out.println(pub1.getDateCreated());
        System.out.println(pub0.getDateCreated()); // should be null


        System.out.println(pub1.toString()); // test object
        System.out.println(pub0.toString()); // empty object
        System.out.println("\n\n\n");

        // was to only make the csv file so commented now

//        writePubCSV(pub0.toString()); //making some dummy publishers
//        writePubCSV(pub1.toString());
//        writePubCSV(pub2.toString());
//        writePubCSV(pub3.toString());
//        writePubCSV(pub4.toString());
//        writePubCSV(pub5.toString());


        String temp;
        ArrayList<String> csvLines = new ArrayList<>();

        Path filePath = Paths.get("Publisher_data.csv");
        //GUESS THIS IS BUGGED Not anymore
        try {
            csvLines.addAll(Files.readAllLines(filePath));
            csvLines.forEach(System.out::println);
//            temp = Files.readString(filePath);
//            System.out.println(temp);

        } catch (Exception e) {
            //Print stack trace
            e.printStackTrace();
        }
        System.out.println("\n\n\n");

        String[] tokens=csvLines.get(2).split(",");// 0 would be id 1 phone 2 name 3 address 4 date

        System.out.println("csvArr index 0 is "+ csvLines.get(0));
        System.out.println("csvArr index 1 is "+ csvLines.get(1));
        System.out.println("csvArr index 2 is "+ csvLines.get(2));

        for (String ele : tokens){
            System.out.println(ele+" ");
        }

        int pubID = Integer.parseInt(tokens[0]);
        int pubPhone = Integer.parseInt(tokens[1].trim()); // space was causing a crash
        String pubName = tokens[2];
        String pubAddress = tokens[3];
        String dateCreated = tokens[4];
//        Date dateCreated = Date.from(parse(tokens[4])); // doesn't work

        System.out.println(pubID);
        System.out.println(tokens[0]);
        System.out.println(tokens[4]); // should be date index

//        Path myPath = Paths.get("Publisher_data.csv");
//        try {
//
//            Files.write(myPath, pub1.toString().getBytes());// ** nuking it
//
//        }catch (Exception e){
//            System.out.println(e);
//        }

    }

}
