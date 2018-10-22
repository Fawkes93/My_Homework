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
public class UseBook {

    public static void main(String[] args) {
        Book harryPotter = new FictionBook("Harry Potter"); // works with both Book and FictionBook
        Book thinkingJava = new NonFictionBook("Thinking java");
        thinkingJava.setPrice();
        harryPotter.setPrice();
        System.out.println("Harry Potter books should be cheaper " + harryPotter.getPrice());
        System.out.println("Java books should be more expensive " + thinkingJava.getPrice());
    }
}
