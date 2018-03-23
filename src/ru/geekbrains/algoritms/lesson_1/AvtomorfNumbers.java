package ru.geekbrains.algoritms.lesson_1;

import java.util.Scanner;

public class AvtomorfNumbers {
    public void numOfNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the natural number:");
        long number=input.nextInt();
        if (number==0) {
            System.out.println("Number of avtomorf numbers: 1");
        }
        else {
            int counter=2;
            for (int i = 5; i < number+1; i+=10) {
                for (int j=i; j<i+2; j++) {
                    if (avtomorf(j)) {
                        counter++;
                    }
                }
            }
            System.out.printf("Number of avtomorf numbers is: %d\n", counter);
        }
    }

    public static boolean avtomorf(long number) {
        int length = String.valueOf(number).length();
        if (number == (long)Math.pow(number, 2) % (long)Math.pow(10, length)) {
            System.out.println(number);
            return true;
        }
        return false;
    }
}
