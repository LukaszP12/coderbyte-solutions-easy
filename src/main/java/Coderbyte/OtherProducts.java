package Coderbyte;

public class OtherProducts {

    public static String OtherProducts(int[] arr) {
        int[] intArr = arr;

        int[] results = new int[arr.length];

        for (int i = 0; i < intArr.length; i++) {
            int value = 1;
            for (int j = 0; j < intArr.length; j++) {
                if (i==j){
                    continue;
                }
                value *=intArr[j];
            }
            results[i]=value;
        }

        String solution = "";
        for (int i=0;i<results.length;i++){
            solution += results[i] +"-";
        }

        return (solution.substring(0,solution.length()-1));
    }

    public static void main(String[] args) {

    }

}
