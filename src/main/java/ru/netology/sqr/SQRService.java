package ru.netology.sqr;

public class SQRService {

    public int countSqrt(int range1, int range2) {
        int counter;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= range1 | i * i <= range2) {
                counter = +1;
                System.out.println(counter);
            }
        }
        return 0;
    }

}
