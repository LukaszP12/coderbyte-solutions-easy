package Coderbyte.Medium;

public class StringReduction {

    public static int StringReduction(String str) {

        String result="";
        int sum='a'+'b'+'c';
        boolean done = false;

        while(!done){
            done=true;
            result="";
            for(int i=0; i<str.length(); i++){
                if(i+1<str.length() && str.charAt(i)!=str.charAt(i+1) ){
                    result += (char)(sum-str.charAt(i)-str.charAt(i+1));
                    i++;
                    done=false;
                }
                else result+=str.charAt(i);
            }
            str=result;
        }

        return result.length();
    }


    public static void main(String[] args) {
        System.out.println(StringReduction("abcabc"));
    }

}
