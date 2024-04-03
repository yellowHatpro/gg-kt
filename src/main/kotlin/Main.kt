package org.example

import kotlin.math.abs
import kotlin.math.round

class Main {
    fun getAcuteAngleOfTime(hour: Int, minute: Int): Int {
        //1. Check if the hour or minute is correct value of not
        if (
            (hour >= 24 || hour < 0) ||
            (minute >= 60 || minute < 0)
        ) return -1;
        //2. Convert to 12-hour format
        val modHour = hour % 12;
        //60 min:  angle of 1 minute
        val angleByMinuteHand = minute * 6;
        val angleByHourHand: Int = modHour * 30;
        val angleDisplacementOfHourHandDueToMinHand = round(minute * 0.5).toInt();
        val angle = abs(angleByMinuteHand - (angleByHourHand + angleDisplacementOfHourHandDueToMinHand) % 360);
        return if (angle > 180) {
            360 - angle;
        } else angle;
    }
}