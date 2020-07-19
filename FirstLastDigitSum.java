package com.muhammadloiq;
public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number)
    {
        if(number<0)
        {
            return -1;
        }
        int sum=0;
        int last = number % 10;
        if(number<10)
        {
            sum=number+number;
        }
        while (number >= 10)
        {
            number = number / 10;
        }
        int first = number;
        sum = last + first;
        return  sum;
    }
}
