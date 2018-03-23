package ru.geekbrains.algoritms.lesson_1;

public class MainClass {
    public static void main(String[] args) {
        //4
        AlgorithmEvklida exercise_4 = new AlgorithmEvklida();
        exercise_4.greatestDivision();

        //1
        Chess exercise_1 = new Chess();
        exercise_1.sameColor();

        //2
        AvtomorfNumbers exercise_2 = new AvtomorfNumbers();
        exercise_2.numOfNumbers();

        //3
        Eratosfen exercise_3 = new Eratosfen();
        System.out.println(exercise_3.primeNumber());
    }
}
