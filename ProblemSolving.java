package com.muhammadloiq;
public class ProblemSolving{


        public int countPrimeNumbersFromGivenIntegers(int starting, int ending){
            int count = 0;
            System.out.println("Hello Tohir! ");
            for(int i = starting; i<ending; i++){

                if(this.isPrime(i)){
                    System.out.println("Prime number is " + i);
                    count++;
                }

            }
            return count;
        }

        public boolean isPrime(int n)
        {
            if(n<=1) {
                return false;
            }
            for(int i=2;i<n;i++) {
                if(n%i==0) {
                    return false;
                }
            }
            return true;
        }

}
