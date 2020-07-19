package com.muhammadloiq;

public class TeenNumberChecker {
    public static boolean hasTeen(int first,int second,int third)
    {
        if(first>=13&&first<=19)
        {
            return true;
        }
        else if(second>=13&&second<=19)
        {
            return true;
        }
        else if(third>=13&&third<=19)
        {
            return true;
        }
        return false;
    }
    public static boolean isTeen(int number)
    {
        if(number>=13&&number<=19)
        {
            return true;
        }
        return false;
    }
}
