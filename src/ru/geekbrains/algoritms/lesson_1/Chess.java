package ru.geekbrains.algoritms.lesson_1;

import java.util.Scanner;

public class Chess {
    public void sameColor() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input coordinate x of first chess cell (from 1 to 8): ");
        int x1 = input.nextInt();
        System.out.println("Input coordinate y of first chess cell (from 1 to 8): ");
        int y1 = input.nextInt();
        System.out.println("Input coordinate x of second chess cell (from 1 to 8): ");
        int x2 = input.nextInt();
        System.out.println("Input coordinate y of second chess cell (from 1 to 8): ");
        int y2 = input.nextInt();
        int diffX = x1-x2;
        int diffY = y1-y2;
        if ((diffX % 2==0 && diffY % 2==0) || (diffX % 2!=0 && diffY % 2!=0)) {
            System.out.println("The chess cells are the same color!");
        }
        else {
            System.out.println("The chess cells are not the same color.");
        }
    }
}
