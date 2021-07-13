package com.company;

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

    @Override
    public String toString() {
        return "Publisher{" +
                "pubID=" + pubID +
                ", pubPhone=" + pubPhone +
                ", pubName='" + pubName + '\'' +
                ", pubAddress='" + pubAddress + '\'' +
                ", dateCreated=" + dateCreated +
                '}';
    }

    public static void main(String[] args) {

        Publisher pub1 = new Publisher(111,"TestPublisher",2015556666,"123 Street"
                ,new Date());
        // int pubID, String pubName, int pubPhone, String pubAddress, Date DOB

        Publisher pub2 = new Publisher(); // default constructor
        System.out.println(pub2.getDateCreated()); // should be null
        System.out.println(pub1.getDateCreated());

        System.out.println(pub1.toString());
        System.out.println(pub2.toString());
    }

}
