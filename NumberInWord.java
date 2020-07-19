package com.muhammadloiq;

public class NumberInWord {
    public static void numberToWords(int number) {
        if (number >= 0) {
            int reversed = reverse(number);
           int originalNumberDigits = getDigitCount(number);
            for (int i = 0; i < originalNumberDigits; i++) {
                int digit = reversed % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversed /= 10;
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse(int number)
    {
        int reverse=0;
        int lastDigits;
        while(number>=0) {
            lastDigits = number % 10;
            reverse = reverse * 10 + lastDigits;
            number = number / 10;
        }
        return -1;
    }


    public static int getDigitCount(int number)
    {
        if(number>=0) {
            int count = 0;
            if (number == 0) {
                count = 1;
            }
            while (number != 0) {
                number = number / 10;
                count++;
            }
            return count;
        }
        return -1;

    }
}


