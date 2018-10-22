/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpack;

/**
 *
 * @author igor
 */
public class MeanMedian2 extends MeanMedian{
    
    int[] numberListOf20 = new int[20];
    
    public double calculateMedian2(){
        System.out.println("enter the numbers: ");
        for(int n = 0; n < numberListOf20.length; n++)
            numberListOf20[n] = sc.nextInt();
        return ((double)numberListOf20[9] + (double)numberListOf20[10]) / 2;
    }
    
}
