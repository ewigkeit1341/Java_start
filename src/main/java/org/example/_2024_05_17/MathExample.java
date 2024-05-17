package org.example._2024_05_17;

import java.math.BigInteger;

public class MathExample {
    public static void main(String[] args) {
        //возведение в степень
//        int a = 3;
//        int b = (int) Math.pow(a, 3);
//        System.out.println(b);

        //извлечение корня
//        double c = Math.sqrt(2);
//        System.out.println(c);


//        BigInteger d = BigInteger.valueOf(15);
//        BigInteger e = BigInteger.valueOf(5);
//
//        BigInteger f = d.add(e);
//        BigInteger j = d.subtract(e);
//        BigInteger h = d.multiply(e);
//        BigInteger k = d.divide(e);
//        System.out.println(f);
//        System.out.println(j);
//        System.out.println(h);
//        System.out.println(k);

//        Задача о зёрнах на шахматной доске
//        Нужно вычеслить: cколько будет зёрен на шахматной доске, если класть
//        на каждую следующую клетку доски вдвое больше зёрен, чем на предыдущую,
//        начиная с одного. (Для не-шахматистов: кол-во клеток на шахматной доске - 64)
//        (использование интернета – 3 балла)

        BigInteger sum = BigInteger.valueOf(0);
        BigInteger sum2 = BigInteger.valueOf(2);
        for (int i = 0; i < 64; i++){
            sum = sum = sum.add(sum2.pow(i));
            System.out.println(sum);
        }



    }
}
