package com.metanit;

public class Main {

    public static void main(String[] args) {
        getNewDate(28, 02, 2011);
    }

    public static void getNewDate(int day, int month, int year) {
        int[] daysInMonth = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;
        if (day == daysInMonth[month]) {
            nextDay = 1;
            nextMonth++;
            if (month == 12) {
                nextMonth = 1;
                nextYear++;
            }

        } else {
            nextDay++;
        }
        System.out.println(nextDay + "." + nextMonth + "." + nextYear);
    }


}
