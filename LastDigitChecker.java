package com.muhammadloiq;
public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a,int b,int c){
        if((a>=10&&a<=1000)&&(b>=10&&b<=1000)&&(c>=10&&c<=1000))
        {
            int last1 = a % 10;
            int last2 = b % 10;
            int last3 = c % 10;
            if((last1==last2)||(last1==last3)||(last2==last3))
            {
                return true;
            }
        }
        else
        {
            return false;
        }
        return false;
    }
    public static boolean isValid(int num)
    {
        if(num>=10&&num<=1000)
        {
            return true;
        }
        return false;
    }
}
