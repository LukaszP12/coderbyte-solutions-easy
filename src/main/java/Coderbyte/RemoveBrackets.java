package Coderbyte;

public class RemoveBrackets {

    public static int RemoveBrackets(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '('){
                sum++;
            } else if (str.charAt(i) == ')'){
                sum--;
            }
        }

        return Math.abs(sum);
    }


    public static int RemoveBrackets2(String str){
        while (str.contains("()")){
            str = str.replace("()", "");
        }
        return (str.length());
    }

    public static String RemoveBrackets3(String str) {

        int mismatch = 0;

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') count++;
            else {
                if (count > 0) count--;
                else mismatch++;
            }
        }

        return String.valueOf(mismatch + count);


    }

    public static void main(String[] args) {
        System.out.println(RemoveBrackets2("(())()((("));
        System.out.println(RemoveBrackets2("(()("));
    }
}
