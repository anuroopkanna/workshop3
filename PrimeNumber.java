package com.BridgeLabs;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] prime = new int[26];//stores prime numbers
        int[] nonPrime = new int[74];//stores non prime numbers
        int primeSum = 0;
        int primeIndex = 0;
        int nonPrimeIndex = 0;

        for (int i = 1; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                prime[primeIndex] = i;
                primeSum+= i;
                primeIndex++;
            } else {
                nonPrime[nonPrimeIndex] = i;
                nonPrimeIndex++;
            }
        }
            System.out.println("Prime numbers: ");
            for (int i = 0; i < prime.length; i++) {
                System.out.println(prime[i] + " ");
            }
        System.out.println("Length of prime numbers array: "+prime.length);
            System.out.println("Non Prime Numbers: ");
            for (int i = 0; i < nonPrime.length; i++) {
                System.out.println(nonPrime[i] + " ");
            }
        //System.out.println("Length of Non Prime Numbers array: "+nonPrimeIndex);
            System.out.println("\n Sum of Prime Numbers: " + primeSum);
    }
}
