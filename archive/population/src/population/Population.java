package population;

public class Population {
    
    public static void main(String[] args) {
      int popMexico = 121000000;
      int popUSA = 315000000;
      int counter =0;
      do {
          counter++;
          popMexico *= 1.0101;
          System.out.println("In " + counter +
                  " years Mexico  population will be " + popMexico);
          popUSA *= 0.9985;
          System.out.println("In " + counter + 
                  " years USA population will be " + popUSA);
           //what if ++counter here???
       }while(popMexico <= popUSA);
        System.out.println("\nIn " + counter + 
                " years Mexico will exceed USA in population");
    }
    
}