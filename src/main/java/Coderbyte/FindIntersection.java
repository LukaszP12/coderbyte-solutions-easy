package Coderbyte;

public class FindIntersection {

    public static String findIntersection(String[] strArr) {
        // code goes here

        StringBuilder stringBuilder = new StringBuilder();

        // for the ease of use, we can just access the String arrays using indexes
        String str1 = strArr[0];
        String str2 = strArr[1];

        // spliting both String
        String[] arr1 = str1.split(", ");
        String[] arr2 = str2.split(", ");

        int i = 0;
        int j = 0;

        while (true) {
            if ((i >= arr1.length) || (j >= arr2.length)) {
                break;
            }

            int val1 = Integer.parseInt(arr1[i]);
            int val2 = Integer.parseInt(arr2[j]);

            if (val1 == val2) {
                if (stringBuilder.length() != 0) {
                    stringBuilder.append("," + String.valueOf(arr1[i]));
                } else {
                    stringBuilder.append(String.valueOf(arr1[i]));
                }
                i++;
                j++;
            } else if (val1 < val2) {
                i++;
            } else {
                j++;
            }
        }

        // check if there is intersection at all
        if (stringBuilder.length() == 0) {
            stringBuilder.append("false");
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        System.out.println(findIntersection(strings));
    }

}