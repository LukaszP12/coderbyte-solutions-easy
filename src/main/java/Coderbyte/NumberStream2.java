package Coderbyte;

public class NumberStream2 {


    public static Boolean NumberStream(String str) {
        for(int i=0;i<str.length();i++){
            Integer number = Integer.valueOf(""+str.charAt(i));
            StringBuilder builder = new StringBuilder();
            for (int j=0;j<number; j++){
                builder.append(number);
            }
            if (str.contains(builder.toString())){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }

}
