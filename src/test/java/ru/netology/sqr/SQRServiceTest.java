package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSqrtCount() {
        SQRService sqrService = new SQRService();
        int range1 = 200;
        int range2 = 300;
       // int counter = 0;
        int expected = 3;
        int actual = sqrService.countSqrt(range1,range2);
        assertEquals(expected, actual);
    }
}