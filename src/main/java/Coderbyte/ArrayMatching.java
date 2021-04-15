package Coderbyte;

public class ArrayMatching {


    public static String ArrayMatching(String[] strArr) {
        String[] arr1 = strArr[0].replace("[", "").replace("]", "").replace(" ","").split("\\,");
        String[] arr2 = strArr[1].replace("[", "").replace("]", "").replace(" ","").split("\\,");

        StringBuilder sb = new StringBuilder();

        if (arr1.length > arr2.length) {
            for (int i = 0; i < arr2.length; i++) {
                int sum = Integer.parseInt(arr1[i]) + Integer.parseInt(arr2[i]);
                sb.append(sum + "-");
            }
            for (int i = arr2.length; i < arr1.length; i++) {
                int sum = Integer.parseInt(arr1[i]);
                if (i != arr1.length - 1) {
                    sb.append(sum + "-");
                } else {
                    sb.append(sum);
                }
            }
        }

        if (arr1.length < arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                int sum = Integer.parseInt(arr1[i]) + Integer.parseInt(arr2[i]);
                sb.append(sum + "-");
            }
            for (int i = arr1.length; i < arr2.length; i++) {
                int sum = Integer.parseInt(arr2[i]);
                if (i != arr2.length - 1) {
                    sb.append(sum + "-");
                } else {
                    sb.append(sum);
                }
            }
        }

        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                int sum = Integer.parseInt(arr1[i]) + Integer.parseInt(arr2[i]);

                if (i != arr2.length - 1) {
                    sb.append(sum + "-");
                } else {
                    sb.append(sum);
                }

            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"[5, 2, 3]", "[2, 2, 3, 10, 6]"};

        String[] arr1 = strings[0].replace("[", "").replace("]", "").replace(" ","").split("\\,");
        String[] arr2 = strings[1].replace("[", "").replace("]", "").replace(" ","").split("\\,");


        String s = ArrayMatching(strings);
        System.out.println(s);

        // incorrect ones
        String[] strings1 = {"[1, 2, 5, 6]", "[5, 2, 8, 11]"};
        String[] strings2 = {"[2]", "[2]"};
        String[] strings3 = {"[1, 10, 12]", "[1, 10, 12]"};



    }

}
