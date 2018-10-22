
package mainpack;

public class Main {

    public static void main(String[] args) {
        MeanMedian ex1 =  new MeanMedian();
        MeanMedian2 ex2 = new MeanMedian2();
        System.out.println(ex1.calculateMean() +" "+ ex1.calculateMedian());
        System.out.println(ex2.calculateMedian2());
    }
    
}
