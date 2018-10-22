package ascendingdescending;

import java.util.Scanner;

public class AscendingDescending {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        System.out.println("Enter n: ");
        n = input.nextInt();
        int[] myArr = new int[n];

        System.out.println("Enter three numbers: ");

        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = input.nextInt();
        }

        for (int i = 0; i < myArr.length; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                if (myArr[i] > myArr[j]) {
                    int buffer = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = buffer;
                }
            }
        }
        System.out.print("The numbers in ascending order are: ");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        
        for (int i = 0; i < myArr.length; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                if (myArr[i] < myArr[j]) {
                    int buffer = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = buffer;
                }
            }
        }
        System.out.print("The numbers in descending order are: ");
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        n = input.nextInt();
    }
}
