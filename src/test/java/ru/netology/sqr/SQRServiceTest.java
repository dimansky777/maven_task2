package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSqrtCount() {
        SQRService sqrService = new SQRService();
        int range1 = 100;
        int range2 = 300;
        System.out.println(sqrService);
    }
}