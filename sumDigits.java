package com.muhammadloiq;

public class sumDigits {
    public static int CalculateSumOfDigits(int number)
    {
        if(number < 10)
        {
            return -1;
        }
            int sum = 0;
            while(number > 0)
            {
                int digit = number % 10;
                sum += digit;
                number = number / 10;
            }
            return sum;
    }
}

