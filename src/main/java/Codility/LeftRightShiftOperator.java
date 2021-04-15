package Codility;

public class LeftRightShiftOperator {

    public static void main(String[] args) {
        int a = 8; // 1 0 0 0

        // left shift operator (addition)
        int b = a << 2; // 1 0 0 0 0 0 // add 2 more zeros and now it represents 32

        System.out.println(b);

        // right shift operator (removal)
        int c = a >> 2; /// 1 0 it removes 2 zeros
        System.out.println(c);

        // it does not matter what the ending is
        int d = 25 >> 2; // 1 1 0 0 1 -> 1 1 0 = 4 + 2 + 0 (after removing 2 zeros)
        System.out.println(d);

        // 1 << 30
        System.out.println(1 << 30);
    }

}
