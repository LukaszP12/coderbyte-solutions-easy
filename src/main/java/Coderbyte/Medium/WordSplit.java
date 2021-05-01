package Coderbyte.Medium;

public class WordSplit {

    public static String WordSplit(String[] strArr) {
        String input = strArr[0];
        String[] dictionary = strArr[1].split(",");
        for(int i=1; i<=input.length(); i++){
            String word1 = input.substring(0, i);
            String word2 = input.substring(i, input.length());
            if(existsInDictionary(word1, dictionary) && existsInDictionary(word2, dictionary)){
                return word1+","+word2;
            }
        }
        return "not possible";
    }

    public static boolean existsInDictionary(String word, String[] dictionary){
        for(String entry: dictionary){
            if(word.equals(entry)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] strings = {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"};
        System.out.println(WordSplit(strings));

        String[] strings1 = {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"};
        System.out.println(WordSplit(strings1));
    }
}
