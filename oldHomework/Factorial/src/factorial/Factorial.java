
package factorial;


public class Factorial {

    public static void main(String[] args) {
        long i = 1L;
        long product = 1L;
        long counter = 1L;
        for (; i<=20; i++){
            product = counter * i;
            counter = product;
            System.out.println("");
        }
    }
    
}

public class Biginteger {

    public static void main(String[] args) {
        long i = 1L;
        long product = 1L;
        long counter = 1L;
        BigInteger bigIntereger = new BigInteger (val: "1");
        BigInteger savedValue = new BigInteger (val: "1")
        for (; i<=100; i++){
            bigInteger = savedValue.multiply(new BigInteger(val:))
            counter = product;
            System.out.println("");
        }
    }
    
}