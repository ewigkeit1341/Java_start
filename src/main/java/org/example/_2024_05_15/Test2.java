package org.example._2024_05_15;

//Дано трехзначное число. Вывести на экран все цифры этого числа
//Пример: 345
//Вывод в консоль: Число 345 -> 3, 4, 5
public class Test2 {
    public static void main(String[] args) {
        int numb = 476;
        int a = numb / 100;
        int b = (numb - (a * 100)) / 10;  // int b = (numb%100)/10
        int c = numb % 10;

        System.out.println("Число " + numb + " -> " + a + " " + b + " " + c);
    }
}
