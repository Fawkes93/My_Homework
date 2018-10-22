/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fawkes.bookapp;

/**
 *
 * @author igor
 */
public abstract class Book {

    String bookName;
    double price;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    public abstract double setPrice();
}
