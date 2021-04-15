package Codility.Iterations;

public class BinaryGap {


    public static int longBinaryGap(int n) {
        int longBinGap = 0;
        int binGap = 0;

        int i = 0;

        while (n > 0) {

            if (n % 2 == 1) {
                i=1;
                if (binGap > longBinGap) {
                    longBinGap = binGap;
                }
                binGap = 0;
            } else {
                if (i == 1){
                    binGap++;
                }
            }
            n = n / 2;

        }

        return longBinGap;
    }

    public static void main(String[] args) {
        System.out.println(longBinaryGap(20));
        System.out.println(Integer.toBinaryString(20));
    }


}