package com.muhammadloiq;

public class FirstLastDigitAdd {
    public static int sumFirstAndLastDigits(int number)
    {
        if(number<0)
        {
            return -1;
        }
        int lastDigits;
        int sumFirstAndLast;
        lastDigits=number%10;
        while(number>=10)
        {
            number=number/10;
        }
        sumFirstAndLast=lastDigits+number;
        return sumFirstAndLast;
    }
}
