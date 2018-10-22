
package edu.fawkes.bookapp;

import java.util.ArrayList;

public class BookArray {

    public static void main(String[] args) {
     ArrayList<Book> bookList = new ArrayList<>();
     bookList.add(new FictionBook("Star Wars"));
     bookList.add(new NonFictionBook("World War 2"));
     bookList.add(new FictionBook("Avatar"));
     bookList.add(new NonFictionBook("The life of Vladimir Putin"));
     bookList.add(new FictionBook("The Lord of the Rings"));
     bookList.add(new NonFictionBook("World War 1"));
     bookList.add(new FictionBook("Life on Mars"));
     bookList.add(new NonFictionBook("Stefan cel Mare"));
     bookList.add(new FictionBook("The Illuminati"));
     bookList.add(new NonFictionBook("Linux unhatched"));
     
     for(Book element: bookList){
         element.setPrice();
         System.out.println(element);
     }
    }
}
