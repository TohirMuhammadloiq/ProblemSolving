package com.muhammadloiq;
public class PerfectNumber {
    public static boolean isPerfectNumber(int number)
    {
        if(number<0)
        {
            return false;
        }
        int sum=0;
        for(int i=1;i<number;i++)
        {
            if(number%i==0)
            {
                System.out.println(i);
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(number==sum)
        {
            return true;
        }
        return false;
    }
}
