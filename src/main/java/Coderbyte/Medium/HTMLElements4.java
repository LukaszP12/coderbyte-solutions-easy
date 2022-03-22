package Coderbyte.Medium;

import java.util.Stack;

public class HTMLElements4 {

    public static String HTMLElements4(String str) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '<') continue;
            int left = i;
            int right = i;

            while (str.charAt(right) != '>') {
                right++;
            }

            if (str.charAt(left + 1) != '/') {
                stack.add(str.substring(left + 1, right));
            } else {
                String temp = stack.pop();
                if (!temp.equals(str.substring(left + 2, right))) {
                    return temp;
                }
            }
        }

        if (stack.size() != 0) {
            return stack.pop();
        }
        return "true";
    }

    public static void main(String[] args) {
        String html1 = "<div><div><b></b></div></p>";
        System.out.println(HTMLElements4(html1));

        String html2 = "<div>abc</div><p><em><i>test test test</b></em></p>";
        System.out.println(HTMLElements4(html2));
    }
}
