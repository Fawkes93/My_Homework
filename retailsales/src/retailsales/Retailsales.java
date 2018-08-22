package retailsales;

import java.util.Scanner;

public class Retailsales {

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      int prodNbr;
      double total = 0;
      
      double prod1 =0;
      double prod2 =0;
      double prod3 =0;
      double prod4 =0;
      double prod5 =0;
      double prod1price =  2.98;
      double prod2price =  4.50;
      double prod3price =  9.98;
      double prod4price =  4.49;
      double prod5price =  6.87;
      
      System.out.println ("Enter product number 1 to 5 (0 to stop and view summary) :");
      
      prodNbr = input.nextInt();
      
      while (prodNbr != 0){
          if (prodNbr >= 1 && prodNbr <= 5)
              switch(prodNbr){
                  
                  case 5:{
                        System.out.print("Enter quantity sold: ");
                        total+=prod5+input.nextDouble();
                        break;
              }
                  case 4:{
                        System.out.print("Enter quantity sold: ");
                        prod4+=input.nextDouble();
                        break;
              }
                  case 3:{
                        System.out.print("Enter quantity sold: ");
                        prod3+=input.nextDouble();
                        break;
              }
                  case 2:{
                        System.out.print("Enter quantity sold: ");
                        prod2+=input.nextDouble();
                        break;
              }
                  case 1:{
                        System.out.print("Enter quantity sold: ");
                        prod1+=input.nextDouble();
                        break;
              }          
                 
                   
          } 
          
          prodNbr = input.nextInt();
          if (prodNbr < 1 && prodNbr > 5)
          System.out.println("No such product! Please enter between 1 and 5");
          prodNbr = input.nextInt();  
              
    }
      System.out.println( "Product 1:" + prod1 * prod1price);
      System.out.printf( "Product 2: $%.2f\n", prod2 * prod2price);
      System.out.printf( "Product 3: $%.2f\n", prod3 * prod3price);
      System.out.printf( "Product 4: $%.2f\n", prod4 * prod4price);
      System.out.printf( "Product 5: $%.2f\n", prod5 * prod5price);
    }
    
}
