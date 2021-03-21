package Codility.Iterations;

public class BinaryGap1 {

    public static int solution(int n){
        int binaryGap = 0;
        String binaryString = Integer.toBinaryString(n);
        char[] characters = binaryString.toCharArray();
        int j = 0; // this is the binary gap counter
        Character c;
        for (int i=0; i<characters.length;i++){
            c = characters[i];
            if(c.equals('0')) {
                j++;
            }

            if (c.equals('1')) {
                if (j > binaryGap){
                    binaryGap = j;
                }
                j=0;
            }

        }
        System.out.println(binaryGap);

        return binaryGap;
    }

    public static void main(String[] args) {
        System.out.println("The binary gap of " + 20 + " is: " + solution(20));
    }

}
