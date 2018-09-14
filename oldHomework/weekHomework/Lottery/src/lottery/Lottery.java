package lottery;


import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            int random1 = (int) (Math.random() * 10);
            int random2 = (int) (Math.random() * 10);
            int random3 = (int) (Math.random() * 10);

            System.out.println("Small hint:The numbers are " + random1 + " " + random2 + " " + random3);

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your lucky numbers: ");
            int input1 = input.nextInt();
            int input2 = input.nextInt();
            int input3 = input.nextInt();

            if (random1 == input1 && random2 == input2 && random3 == input3) {
                System.out.println("Jack Pot! You've won 1.000.000 $");
            } else if ((random1 == input1 || random1 == input2 || random1 == input3)
                    && (random2 == input1 || random2 == input2 || random2 == input3)
                    && (random3 == input1 || random3 == input2 || random3 == input3)) {
                System.out.println("Win! Numbers matching but not in order. Reward $1000");
            } else if ((random1 == input1 || random1 == input2 || random1 == input3)
                    && (random2 == input1 || random2 == input2 || random2 == input3)
                    || (random2 == input1 || random2 == input2 || random2 == input3)
                    && (random3 == input1 || random3 == input2 || random3 == input3)
                    || (random1 == input1 || random1 == input2 || random1 == input3)
                    && (random3 == input1 || random3 == input2 || random3 == input3)) {
                //if(input1 == input3)
                System.out.println("Two numbers matching ! Reward $100");
            } else if (random1 == input1 || random1 == input2 || random1 == input3
                    || random2 == input1 || random2 == input2 || random2 == input3
                    || random3 == input1 || random3 == input2 || random3 == input3) {
                System.out.println("Just one matching: - 10 $ for you");
                break;
            } else {
                System.out.println("Fuck off , looser!");
            }
        }
    }
}
