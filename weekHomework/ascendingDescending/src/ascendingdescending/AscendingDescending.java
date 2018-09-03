package ascendingdescending;

import java.util.Scanner;

public class AscendingDescending {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int[] myArr = new int[3];
         
         System.out.println("Enter three numbers: ");
            myArr[0] = input.nextInt(); System.out.println("great! two more: ");
            myArr[1] = input.nextInt(); System.out.println("awesome! one more left: ");
            myArr[2] = input.nextInt();
            
         if (myArr[0] > myArr[1]) {int buffer = myArr[0]; myArr[0] = myArr[1]; myArr[1] = buffer;}

         if (myArr[1] > myArr[2]) {int buffer = myArr[1]; myArr[1] = myArr[2]; myArr[2] = buffer;}

         if (myArr[0] > myArr[1]) {int buffer = myArr[0]; myArr[0] = myArr[1]; myArr[1] = buffer;}
         
        System.out.print("The numbers in ascending order are: "
                + myArr[0] + " " + myArr[1] + " " + myArr[2] );
        System.out.print(" and in descending order are: "
                + myArr[2] + " " + myArr[1] + " " + myArr[0] + "\n!");
    }
}