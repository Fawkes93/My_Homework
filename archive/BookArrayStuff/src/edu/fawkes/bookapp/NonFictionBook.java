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
public class NonFictionBook extends Book {

    public NonFictionBook(String bookName) {
        super(bookName);
    }
    
    @Override
    public final double setPrice() {
       return super.price = 37.99;
    }

    @Override
    public String toString() {
        System.out.println(this.getBookName()+" books should be more expensive " + this.getPrice());
        return "";
    }
}
