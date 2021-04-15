package Coderbyte;

public class ChangingSequence {

    public static int ChangingSequence(int[] arr) {
        boolean growing = false;

        if (arr[0] < arr[1]){
            growing = true;
        } else if (arr[0] > arr[1]){
            growing = false;
        }

        int changingIndex = getChangingIndex(arr, growing);

        return changingIndex;
    }


    private static int getChangingIndex(int[] arr, boolean increasing) {

        for (int i = 1; i < arr.length; i++) {
            if(increasing){
                if(arr[i]<arr[i-1]){
                    return i-1;
                }
            }

            if(!increasing){
                if(arr[i]>arr[i-1]){
                    return i-1;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {-4, -2, 9, 10};
        System.out.println(ChangingSequence(ints));

        int[] ints1 = {5, 4, 3, 2, 10, 11};
        System.out.println(ChangingSequence(ints1));

    }

}
