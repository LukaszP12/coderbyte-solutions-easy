package Coderbyte.Medium;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLElements3 {

    public static String HTMLElements3(String str) {
        ArrayList<String> stack = new ArrayList<String>();
        String res = "";

        Pattern pattern = Pattern.compile("(<[A-Za-z0-9\\/]*>)");
        Matcher m = pattern.matcher(str);
        while (m.find()) {
            if (stack.size() == 0) {
                stack.add(m.group(1));
            } else {
                if (compareE(stack.get(stack.size() - 1), m.group(0))) {
                    stack.remove(stack.size() - 1);
                } else {
                    stack.add(m.group(1));
                }
            }
        }

        if (stack.size() == 0) {
            return "true";
        }

        for (int i = 0; i < (stack.size() / 2 + 1); i++) {
            if (!compareE(stack.get(i), stack.get(stack.size() - 1 - i))) {
                if (checkFormatting(stack.get(stack.size() - 1 - i), false)) {
                    res = stack.get(i).replaceAll("<", "").replaceAll(">", "").trim();
                } else {
                    res = stack.get(stack.size() - 1 - i).replaceAll("<", "").replaceAll("/", "").replaceAll(">", "").trim();
                    break;
                }
            }
        }

        return res;
    }

    public static boolean checkFormatting(String str, boolean bStart) {
        if (bStart) {
            if (str.charAt(0) == '<' && str.charAt(1) != '/' && str.charAt(str.length() - 1) == '>') {
                return true;
            }
        } else {
            if (str.charAt(0) == '<' && str.charAt(1) == '/' && str.charAt(str.length() - 1) == '>') {
                return true;
            }
        }

        return false;
    }

    public static boolean compareE(String strStart, String strEnd) {
        strStart = strStart.replaceAll("<", "").replaceAll(">", "").trim();
        strEnd = strEnd.replaceAll("</", "").replaceAll(">", "").trim();

        if (strStart.equals(strEnd)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String html1 = "<div><div><b></b></div></p>";
        System.out.println(HTMLElements3(html1));

        String html2 = "<div>abc</div><p><em><i>test test test</b></em></p>";
        System.out.println(HTMLElements3(html2));
    }
}
