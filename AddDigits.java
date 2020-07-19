package com.muhammadloiq;

public class AddDigits {
    public static int sumDigits(int number)
    {
        if(number<10)
        {
            return -1;
        }
        int remainder;
        int sum=0;
        while(number!=0)
        {
            remainder=number%10;
            number=number/10;
            sum=sum+remainder;
        }
        return sum;
    }
}
