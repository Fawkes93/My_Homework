package lottery;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        int random1 = (int) (Math.random() * 10);
        int random2 = (int) (Math.random() * 10);
        int random3 = (int) (Math.random() * 10);
        int buffer1, buffer2, buffer3;
        int testBuffer = 0;

        System.out.println("Small hint:The numbers are " + random1 + " " + random2 + " " + random3);
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lucky numbers: ");
        int input1 = input.nextInt();
        int input2 = input.nextInt();
        int input3 = input.nextInt();

        if (input1 == random1) {
            buffer1 = 2;
        } else if ((input1 == random2 && random1 != random2)
                || (input1 == random3 && random1 != random3)) {
            buffer1 = 1;
        } else {
            buffer1 = 0;
        }
        if (input2 == random2) {
            buffer2 = 2;
        } else if ((input2 == random1 && random2 != random1)
                || (input2 == random3 && random2 != random3)) {
            buffer2 = 1;
        } else {
            buffer2 = 0;
        }
        if (input3 == random3) {
            buffer3 = 2;
        } else if ((input1 == random2 && random1 != random2)
                || (input1 == random3 && random1 != random3)) {
            buffer3 = 1;
        } else {
            buffer3 = 0;
        }
        if (input1 < 0 || input2 < 0 || input3 < 0 || input1 > 9 || input2 > 9 || input3 > 9) {
            testBuffer = -10;
        }
        int bufferTotal = (buffer1 + buffer2 + buffer3 + testBuffer);
        switch (bufferTotal) {
            case 6:
                System.out.println("Jack Pot! You've won 1.000.000 $");
                break;
            case 4:
                System.out.println("Two numbers matching ! Reward $100");
                break;
            case 3: {
                if ((buffer1 == buffer2) || (buffer2 == buffer3)) {
                    System.out.println("Win! Numbers matching but not in order. Reward $1000");
                } else {
                    System.out.println("Two numbers matching ! Reward $100");
                }
                break;
            }
            case 2: {
                if ((buffer1 == 2) || (buffer2 == 2) || (buffer3 == 2)) {
                    System.out.println("Just one matching: - 10 $ for you");
                } else {
                    System.out.println("Two numbers matching ! Reward $100");
                }
            }
            break;
            case 1:
                System.out.println("Just one matching: - 10 $ for you");
                break;
            case 0:
                System.out.println("Go home, bro. Azino Tri Topora is not for you !!!");
                break;
            default:
                System.out.println("Enter some real numbers!!!");
        }
    }
}
