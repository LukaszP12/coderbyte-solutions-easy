package Coderbyte;

import java.util.ArrayList;
import java.util.List;

public class ProductDigits {

    public static int ProductDigits(int num) {
        List<String> productDigits = new ArrayList<>();
        for (int i=1;i<=num;i++){
            for (int j=1;j<=num;j++){
                if (i*j == num){
                    productDigits.add("" + i + j);
                }
            }
        }
        int minDigits = productDigits.get(0).length();
        for (String digits : productDigits){
            if (digits.length() < minDigits){
                minDigits = digits.length();
            }
        }

        return minDigits;
    }

    public static void main(String[] args) {
        List<String> productDigits = new ArrayList<>();
        productDigits.add("" + 2 + 4);
        productDigits.stream().forEach(System.out::println);

        if ("10".length() < "20".length()){

        }


    }

}
