package ru.geekbrains.algoritms.lesson_1;

import java.util.Scanner;

public class AlgorithmEvklida {
    public void greatestDivision() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = input.nextInt();
        System.out.println("Input second number: ");
        int b = input.nextInt();
        if (a==b) {
            System.out.println("Numbers are equals");
        }
        else {
            if (a < b) {
                int c = a;
                a = b;
                b = c;
            }
            do {
                int c = a % b;
                a = b;
                b = c;
            } while (b != 0);
        }
        System.out.printf("The greatest common division of numbers is: %d\n", a);
    }
}
