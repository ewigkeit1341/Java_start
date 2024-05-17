package org.example._2024_05_17;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter value myValue: ");
//        int myValue = sc.nextInt();
//        String s = sc.nextLine();
//        char ch = sc.nextLine().charAt(0);
//
//        System.out.println(myValue);
//=============================================
//Написать программу которая принимает на вход целые числа X и У.
//Посторить логику такими образом, чтобы при вызове вашей программы происходило следующее:
//при значении Х равным 2 или 3, выводилось значение Х, а если Х=1, выводить значение Y.
//В случае если X или Y будут вне диапазона от 1 до 3 выводить “Error”.
//Пример: myMethod(x = 3, y = 2) – output: X=3
//        myMethod(x = 5, y = 2) – output: X=2
//        myMethod(x = 5, y = 2) – output: Error
//        myMethod(x = 1, y = 2) – output: Y=2


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value X");
        int x = sc.nextInt();
        System.out.println("Enter value Y");
        int y = sc.nextInt();

        if (x < 1 || x > 3 || y < 1 || y > 3) {
            System.out.println("Error");

        if (x == 2 || x == 3) {
            System.out.println(x);
        } else if (x == 1) {
            System.out.println(y);
        }
        }




    }
}
