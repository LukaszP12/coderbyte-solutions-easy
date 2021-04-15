package Coderbyte;

public class PowersOfTwo {

    public static String PowersOfTwo(int num){

        for (int i=1; i<= num; i*=2){
            if (i == num){
                return "true";
            }
        }

        return "false";
    }


    public static void main(String[] args) {
        System.out.println(PowersOfTwo(4));
        System.out.println(PowersOfTwo(124));
    }

}
