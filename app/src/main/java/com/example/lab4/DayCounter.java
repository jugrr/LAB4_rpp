package com.example.lab4;

import java.util.Calendar;

public class DayCounter {

    private static int currentYear;
    private static int currentMonth;
    private static int currentDay;
    private static int scheduledYear;
    private static int scheduledMonth;
    private static int scheduledDay;

    public DayCounter(int y, int m, int d) {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        currentYear = calendar.get(java.util.Calendar.YEAR);
        currentMonth = calendar.get(Calendar.MONTH) + 1;
        currentDay = calendar.get(Calendar.DATE);
        scheduledYear = y;
        scheduledMonth = m;
        scheduledDay = d;
    }

    public static String counter() {
        int y, m, d;
        y = scheduledYear - currentYear;
        m = scheduledMonth - currentMonth;
        d = scheduledDay - currentDay;
        return String.valueOf(y * 365 + m * 30 + d);
    }
}
