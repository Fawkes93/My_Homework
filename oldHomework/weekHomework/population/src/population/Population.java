package population;

public class Population {
    
    public static void main(String[] args) {
      int popMexico = 121000000;
      int popUSA = 315000000;
      int counter =1;
      do {
          popMexico *= 1.01;
          System.out.println("In " + counter + " years Mexico  population will be " + popMexico);
          popUSA *= 0.9985;
          System.out.println("In " + counter + " years USA population will be " + popUSA);
          counter++; //what if ++counter here???
       }while(popMexico <= popUSA);
        System.out.println("In " + counter + " years Mexico will exceed USA in population");
    }
    
}