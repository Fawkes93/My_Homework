package mainpack;

import java.util.Scanner;
import java.util.ArrayList;

public class MeanMedian {

    int[] numberList = new int[5];
//    ArrayList<Integer> numberList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public int calculateMean() {

        System.out.println("Please enter 5 digits: ");
        numberList[0] = sc.nextInt();
        numberList[1] = sc.nextInt();
        numberList[2] = sc.nextInt();
        numberList[3] = sc.nextInt();
        numberList[4] = sc.nextInt();
        int mean = 0;
        for (int n = 0; n < numberList.length; n++) {

            mean += numberList[n];

        }

        return mean / numberList.length;
    }

    public int calculateMedian() {
        int median = 0;
        for (int n = 0; n < numberList.length; n++) {
            if (n == numberList[2]) {
                median = n;
            }
        }

        return median;
    }

}
