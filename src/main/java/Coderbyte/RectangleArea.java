package Coderbyte;

public class RectangleArea {

    public static int RectangleArea(String[] strArr) {


        int width = 0;
        int height = 0;


        return width * height;
    }


    public static void main(String[] args) {
        String[] strings = {"(1 1)", "(1 3)", "(3 1)", "(3 3)"};
        String[] strings1 = {"(0 0)", "(1 0)", "(1 1)", "(0 1)"};

        String replace = strings[0].replace("(", "").replace(")", "");
        String[] split = replace.split(" ");

        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);


        System.out.println(replace);
    }

}
