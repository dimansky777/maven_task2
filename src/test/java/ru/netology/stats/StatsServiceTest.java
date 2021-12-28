package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sumAmount() {
        StatsService service = new StatsService();
        int[] factorySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.sumAmount(factorySales);

        assertEquals(expected, actual);
    }

    @Test
    void averageAmount() {
        StatsService service = new StatsService();
        int[] factorySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.averageAmount(factorySales);

        assertEquals(expected, actual);
    }

    @Test
    void avgAmount() {
        StatsService service = new StatsService();
        int[] factorySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.avgAmount(factorySales);

        assertEquals(expected, actual);
    }

    @Test
    void maxAmount() {
        StatsService service = new StatsService();
        int[] factorySales = {8, 122, 133, 144, 155, 213, 19, 30, 73, 14, 134, 18};
        int expected = 213;

        int actual = service.maxAmount(factorySales);

        assertEquals(expected, actual);
    }


    @Test
    void minAmount() {
        StatsService service = new StatsService();
        int[] factorySales = {8, 122, 133, 144, 155, 213, 19, 30, 73, 14, 134, 1};
        int expected = 1;

        int actual = service.minAmount(factorySales);

        assertEquals(expected, actual);
    }

    @Test
    void minSales() {
        StatsService service = new StatsService();
        long[] factorySales = {8, 122, 133, 144, 155, 213, 19, 30, 73, 14, 134, 1};
        int expected = 12;

        long actual = service.minSales(factorySales);

        assertEquals(expected, actual);
    }

    @Test
    void maxSales() {
        StatsService service = new StatsService();
        long[] factorySales = {8, 122, 133, 144, 155, 213, 19, 30, 73, 14, 134, 1};
        int expected = 6;

        long actual = service.maxSales(factorySales);

        assertEquals(expected, actual);
    }

    @Test
    void lowAvgAmount() {
        StatsService service = new StatsService();
        int[] factorySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.lowAvgAmount(factorySales);

        assertEquals(expected, actual);
    }

    @Test
    void overAvgAmount() {
        StatsService service = new StatsService();
        int[] factorySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.overAvgAmount(factorySales);

        assertEquals(expected, actual);
    }
}