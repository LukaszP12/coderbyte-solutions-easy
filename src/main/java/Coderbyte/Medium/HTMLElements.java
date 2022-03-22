package Coderbyte.Medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class HTMLElements {

    public static String HTMLElements(String str) {
        Deque<String> stack = new ArrayDeque<String>();

        int i =0;
        String tagName;
        while(i < str.length()){
            if(str.charAt(i) == '<'){
                i++;
                StringBuilder builder = new StringBuilder();
                while(str.charAt(i) != '>'){
                    builder.append(str.charAt(i));
                    i++;
                }
                tagName = builder.toString();
                if(tagName.charAt(0) == '/'){
                    String endTag = tagName.substring(1, tagName.length());
                    if(endTag.equals(stack.peek())){
                        stack.poll();
                    }else{
                        return stack.poll();
                    }
                }else{
                    stack.push(tagName);
                }
            }
            i++;
        }

        if(stack.size() > 0){
            return stack.poll();
        }
        return "true";
    }


    public static void main(String[] args) {
        String html1 = "<div><div><b></b></div></p>";
        System.out.println(HTMLElements(html1));

        String html2 = "<div>abc</div><p><em><i>test test test</b></em></p>";
        System.out.println(HTMLElements(html2));
    }

}
