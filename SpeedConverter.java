package com.muhammadloiq;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometresPerHour)
    {
        if(kilometresPerHour < 0)
        {
            return -1;
        }
        long milesPerHour = Math.round(kilometresPerHour / 1.609);
                return milesPerHour;

    }
    public  static void printConversion(double kilometresPerHour)
    {
        if(kilometresPerHour < 0)
        {
            System.out.println("Invalid value");
        }
        long milesPerHour = Math.round(kilometresPerHour / 1.609);
        System.out.println(kilometresPerHour + "km/h = " + milesPerHour + " mi/h");
    }
}
