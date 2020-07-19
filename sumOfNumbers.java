package com.muhammadloiq;

public class sumOfNumbers {
    public static void sum()
    {
        int sum=0;
        int count=0;
        for(int i=1;i<=1000;i++)
        {
            if(i%3==0&&i%5==0)
            {
                sum=sum+i;
                count++;
                if(count==5)
                {
                    break;
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
