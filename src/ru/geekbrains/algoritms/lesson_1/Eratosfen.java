package ru.geekbrains.algoritms.lesson_1;

import java.util.Scanner;

public class Eratosfen {
    public String primeNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = input.nextInt();
        long startTime = System.currentTimeMillis();
        int primeNumber=0;
        int counter=0;
        int[] arr = new int[number-1];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+2;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=-1) {
                primeNumber=arr[i];
                System.out.println(primeNumber);
                for (int j = i+primeNumber; j < arr.length; j+=primeNumber) {
                        arr[j]=-1;
                }
                counter++;
            }
        }
        long timeSpend = System.currentTimeMillis() - startTime;
        return ("Number of prime numbers: " + counter + "\n, the biggest prime number: " + primeNumber +
                "\n Program runs: " + timeSpend + "ms");
    }
}
