package Coderbyte.Medium;

import java.util.Stack;

public class HTMLElements2 {

    public static String HTMLElements2(String str) {
        Stack<String> stack = new Stack<String>();
        StringBuilder sb = new StringBuilder();
        boolean buildingString = false;
        boolean isHead = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '<' && str.charAt(i + 1) != '/') {
                buildingString = true;
                isHead = true;
            } else if (str.charAt(i) == '<' && str.charAt(i + 1) == '/') {
                buildingString = true;
                isHead = false;
            } else if (str.charAt(i) == '>') {
                buildingString = false;
                if (isHead) {
                    stack.push(sb.toString());
                } else {
                    String lastString = stack.pop();
                    if (!lastString.equals(sb.toString())) {
                        return lastString;
                    }
                }
                sb = new StringBuilder();
            } else {
                if (str.charAt(i) != '/' && buildingString) {
                    sb.append(str.charAt(i));
                }
            }
        }

        return stack.isEmpty() ? "true" : stack.pop();
    }

    public static void main(String[] args) {
        String html1 = "<div><div><b></b></div></p>";
        System.out.println(HTMLElements2(html1));

        String html2 = "<div>abc</div><p><em><i>test test test</b></em></p>";
        System.out.println(HTMLElements2(html2));
    }

}
