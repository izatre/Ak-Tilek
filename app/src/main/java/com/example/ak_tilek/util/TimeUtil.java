package com.example.ak_tilek.util;

import java.util.Calendar;

public class TimeUtil {

    private long getTimeFor(int hour, int minute) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        return calendar.getTimeInMillis();
    }
}
