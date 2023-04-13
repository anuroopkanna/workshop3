package com.BridgeLabs;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int prime =0;
        int[] nonPrime=new int[100];
        int nonPrimeIndex=0;
        int primeSum=0;

        System.out.println("non -prime numbers: ");
        for (int i=2;i<=100;i++){
            if (isPrime(i)){
                prime=i;
                System.out.println(i);
                primeSum+=i;

            }else {
                nonPrime[nonPrimeIndex++]=i;
            }
        }
        System.out.println("Prime Numbers: " +prime);
        System.out.println("Non prime numbers: ");
        for (int i=0;i<nonPrimeIndex;i++){
            System.out.println(nonPrime[i]+"");
        }
        System.out.println("Length o Non Prime Numbers: "+nonPrimeIndex );
        System.out.println();
        System.out.println("Sum of prime numbers: "+primeSum);
    }
    public static boolean isPrime(int num){
        if (num<=1){
            return false;
        }
        for (int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
