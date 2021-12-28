package ru.netology.sqr;

public class SQRService {

    public int countSqrt(int range1, int range2) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= range1 | i * i <= range2) {
                counter = counter +1;
                //  System.out.println(counter);
                return counter;
            }
        }
        return counter;
    }
}
