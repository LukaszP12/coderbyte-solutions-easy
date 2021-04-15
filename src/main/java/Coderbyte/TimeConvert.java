package Coderbyte;

public class TimeConvert {

    public static String TimeConvert(int num) {
        // code goes here
        int hour = num / 60;
        int min = num - hour*60;

        return hour+":"+min;
    }


    public static void main(String[] args) {
        System.out.println(TimeConvert(126));
    }

}
