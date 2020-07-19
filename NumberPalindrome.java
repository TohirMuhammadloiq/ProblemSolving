package com.muhammadloiq;

public class NumberPalindrome {
    public static boolean isPalindrome(int number)
    {
        int reverse=0;
        int lastDigits;
        int extra=number;
        while(number!=0) {
            lastDigits = number % 10;
            reverse = reverse * 10 + lastDigits;
            number = number / 10;
        }
        if(reverse==extra)
        {
            return true;
        }
        return false;
    }
}
