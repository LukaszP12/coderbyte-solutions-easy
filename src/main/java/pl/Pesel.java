package pl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

import static java.lang.Integer.parseInt;

public class Pesel {

    public static boolean isOverAge(String age) throws ParseException,InvalidPeselException {

        try {
            Integer.parseInt(age.substring(0,8));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }

        String year = age.substring(0, 4);
        String month = age.substring(4, 6);
        String day = age.substring(6, 8);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/mm/dd", Locale.ENGLISH);
        Date firstDate = simpleDateFormat.parse(year + "/" + month + "/" + day);
        Date todayDate = simpleDateFormat.parse("2021/04/18");
//        Date todayDate = simpleDateFormat.parse(String.valueOf(LocalDate.now()));

        long difference_In_Time = todayDate.getTime() - firstDate.getTime();

        long difference_In_Seconds = (difference_In_Time / 1000) % 60;

        long difference_In_Minutes
                = (difference_In_Time
                / (1000 * 60))
                % 60;

        long difference_In_Hours
                = (difference_In_Time
                / (1000 * 60 * 60))
                % 24;

        long difference_In_Years
                = (difference_In_Time
                / (1000l * 60 * 60 * 24 * 365));

        long difference_In_Days
                = (difference_In_Time
                / (1000 * 60 * 60 * 24))
                % 365;

        System.out.println(
                difference_In_Years
                        + " years, "
                        + difference_In_Days
                        + " days, "
                        + difference_In_Hours
                        + " hours, "
                        + difference_In_Minutes
                        + " minutes, "
                        + difference_In_Seconds
                        + " seconds");

        return (difference_In_Years>18) ? true : false;
    }

    public static void main(String[] args) throws ParseException, InvalidPeselException {
        boolean overAge = isOverAge("2005042021211");
        System.out.println(overAge);


        System.out.println("2000042021211".substring(0, 4));
        System.out.println("2000042021211".substring(4, 6));
        System.out.println("2000042021211".substring(6, 8));

    }

}
