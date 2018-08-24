
package inbetween;

import java.util.Scanner;

public class Inbetween {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a, b;
        int c;
                
        System.out.println("Enter the numbers:");
	a=input.nextInt();
        b=input.nextInt();
        System.out.println("The inbetween nbrs are");
//        while ( a<b){
//            for(c=a+1; ;a++){
//            System.out.println(c);
//            }
//        
//    
//        }
        for (;a<b;++a){
        System.out.println(a);
        }
        for (;a>b;--a){
        System.out.println(a);
        }
    }
    
    
    

}
