package Coderbyte.Medium;

public class PrimeMover {

    // num is the th prime number

    public static int PrimeMoverWrong(int num) {

        if (num == 1) {
            return 2;
        }

        if (num == 2) {
            return 3;
        }

        int counter = 2;
        for (int i = 4; i < 500; i++) {
            // this does not hold, as a number can also be a product of two prime numbers
            if (i % 2 != 0 && i % 3 != 0) {
                counter++;
                System.out.println(i);
            }
        }

        return -1;
    }

    public static int PrimeMover(int num) {

        int count = 0;
        for (int i = 0; i < Math.pow(10, 4); i++) {
            if(isPrime(i)){
                count++;
            }
            if (count == num){
                return i;
            }
        }

        return (int) Double.POSITIVE_INFINITY; 
    }

    private static boolean isPrime(int number) {
        if (number < 2){return false;}
        for (int i=2; i<=number/2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(PrimeMover(3));
        System.out.println(PrimeMover(9));


        // incorrect result
        System.out.println(PrimeMover(100));
    }

}
