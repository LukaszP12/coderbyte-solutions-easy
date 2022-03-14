package Coderbyte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MostFreeTime {

    public static String MostFreeTime(String[] strArr) {
        ArrayList<int[]> eventMinuteList = new ArrayList<int[]>();
        int[] eventMinute, lastEventMinute;
        String[] eventTimeTextSet;
        for (int i = 0; i < strArr.length; i++) {
            eventTimeTextSet = strArr[i].split("-");
            eventMinute = new int[]{getMinuteOfDay(eventTimeTextSet[0]), getMinuteOfDay(eventTimeTextSet[1])};
            eventMinuteList.add(eventMinute);
        }

        Collections.sort(eventMinuteList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[1];
            }
        });

        int mostFreeTime = 0;
        lastEventMinute = eventMinuteList.get(0);
        for (int i = 1; i < eventMinuteList.size(); i++) {
            eventMinute = eventMinuteList.get(i);
            mostFreeTime = Math.max(eventMinute[0] - lastEventMinute[1], mostFreeTime);
            lastEventMinute = eventMinute;
        }

        return String.format("%02d:%02d", (mostFreeTime / 60), (mostFreeTime % 60));
    }

    public static int getMinuteOfDay(String timeText) {
        int hour = Integer.parseInt(timeText.substring(0, 2));
        int minute = Integer.parseInt(timeText.substring(3, 5));
        if ((timeText.endsWith("PM")) && (hour != 12)) {
            hour += 12;
        } else if ((timeText.endsWith("AM")) && (hour == 12)) {
            hour -= 12;
        }
        minute += hour * 60;

        return minute;
    }

    public static void main(String[] args) {
        String[] strings = {"12:15PM-02:00PM", "09:00AM-10:00AM", "10:30AM-12:00PM"};
        System.out.println(MostFreeTime(strings));

        String[] strings1 = {"12:15PM-02:00PM", "09:00AM-12:11PM", "02:02PM-04:00PM"};
        System.out.println(MostFreeTime(strings1));
    }
}
