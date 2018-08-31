package denomination;
import java.util.Scanner;
public class Denomination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount: ");
        int i = input.nextInt();
        int remtwenty, remten, remfive, remone;

        while (i % 20 > 0 || i % 20 ==0){
            remtwenty = i / 20;
                System.out.println("You have "+ remtwenty + " notes of $20 ");
            if((i % 20) / 10 > 0){
            remten = (i % 20) / 10;
                System.out.println("and " + remten + " notes of $10 ");
            }
            if((i % 10) / 5 > 0){
            remfive = (i % 10) / 5;
                System.out.println("and " + remfive + " notes of $5 ");
            }
            if (i % 5  > 0){
            remone = i % 5;
                System.out.println("and " + remone + " notes of $1 ");
            }
            System.out.println("\n Enter new number:");
            i = input.nextInt();
            if (i == 0){
            System.out.println("Good bye !");
            break;
        }   
        }
    }
}
