/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umlstuff;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(String name, Author author, double price) {
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty) {
        this.author = author;
        this.name = name;
        this.price = price;
        this.qty = qty;

    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
    
    public void setPrice (double price){
        this.price = price;
    }
    
    public void setQty (int qty){
        this.qty = qty;
    }
    
    @Override
    public String toString(){
        return "Book " + name + " Author "+ author.toString() + " price: " + price + " quantity: "  + qty;
    }
}
