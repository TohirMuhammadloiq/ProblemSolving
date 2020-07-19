package com.muhammadloiq;
import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner key = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (true) {
            count = count + 1;
            System.out.println("Enter " + count + "-number: ");
            boolean isAnInt = key.hasNextInt();
            if (isAnInt) {
                int number = key.nextInt();
                sum = sum + number;
            } else {
                break;
            }
        }
        double average;
        average=sum/(count-2);
        Math.round(average);
      //  round(average);
        System.out.println("SUM = " + sum + " AVG = " + (long) average);
    }
 /*   public static long round(double average)
    {
        long avg =  Math.round((long) average);
        return avg;
    }*/
 /*import java . util . Scanner ;

    public class InputCalculator {
        public static void inputThenPrintSumAndAverage() {
            Scanner input = new Scanner(System.in);

            int sum = 0 ;
            int count = 0;

            while(input.hasNextInt()) {
                int number = input.nextInt();
                sum += number;
                count++;
            }
            System.out.println("SUM = " + sum + " AVG = " +  Math.round((double) (sum) / (double) (count)));
            input.close();
        }
    }*/
}
