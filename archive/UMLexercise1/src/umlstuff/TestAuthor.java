/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umlstuff;

/**
 *
 * @author igor
 */
public class TestAuthor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author fawkes = new Author("Fawkes", "igrusu93@gmail.com", 'F');
        System.out.println(fawkes.toString());
        Book lotr = new Book("LOTR", fawkes, 5.5, 12);
        System.out.println(lotr.toString());
    }

}
