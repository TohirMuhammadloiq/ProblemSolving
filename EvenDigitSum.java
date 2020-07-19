package com.muhammadloiq;

public class EvenDigitSum {
   /* public static int getEvenDigitNumber(int number)
    {
        if(number<0)
        {
            return -1;
        }
        int sum=0;
        int evenDigits;
        while(number!=0)
        {
            evenDigits=number%10;
            if(checkEvenNumbers(evenDigits))
            {
                sum=sum+evenDigits;
            }
            number=number/10;
        }
        return sum;
    }
    public static boolean checkEvenNumbers(int number)
    {
        if(number%2==0)
        {
            return true;
        }
        return false;
    }
    */
   public static int getEvenDigitNumber(int number)
   {
       if(number<0)
       {
           return -1;
       }
       int sum=0;
       int evenDigits;
       while(number!=0)
       {
           evenDigits=number%10;
           if(evenDigits%2==0)
           {
               sum=sum+evenDigits;
           }
           number=number/10;
       }
       return sum;
   }

}
