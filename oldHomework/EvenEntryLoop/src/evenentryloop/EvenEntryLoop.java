
package evenentryloop;

import java.util.Scanner;

public class EvenEntryLoop {

    public static void main(String[] args) {
        
        int num;
        int exit = 999;

        Scanner input = new Scanner (System.in);
        System.out.println("enter an even number or 999 to exit");
        
        num = input.nextInt();
        
//        for (; num / num !=0;){
//            System.out.println("Good job!");
//        
            while (num != 999){
               if(num % 2 == 0){
                System.out.println("Good job!");
                System.out.println("enter another value");   
                num = input.nextInt();  
        }      else if (num % 2 != 0) {
                   System.out.println("Wrong! enter EVEN value");
                   num = input.nextInt(); 
            }  
                
    }
             System.out.println("Good bye");
    }    
}
