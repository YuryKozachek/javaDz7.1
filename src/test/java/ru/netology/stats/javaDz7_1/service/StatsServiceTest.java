package ru.netology.stats.javaDz7_1.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class StatsServiceTest {
    @Test//1
    public void serviceAllSumSale() {
        StatsService service = new StatsService();
        int[] sumMonth = {5, 4, 7, 3, 9, 8, 5, 3, 5, 2, 3, 4};
        int expected = 58;
        int actual = service.sumAllSale(sumMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test//2
    public void serviceMidSumSale() {
        StatsService service = new StatsService();
        int[] midSumMonth = {5, 4, 7, 3, 9, 8, 5, 3, 5, 2, 3, 4};
        int expected = 4;
        int actual = service.midSumSale(midSumMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test//3
    public void serviceMonthMaxSum() {
        StatsService service = new StatsService();
        int[] maxSumMonth = {3, 7, 5, 9, 6, 22, 6, 8, 1, 7, 22, 4};
        int expected = 10;
        int actual = service.monthMaxSum(maxSumMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test//4
    public void serviceMonthMinSum() {
        StatsService service = new StatsService();
        int[] minSumMonth = {5, 13, 12, 8, 9, 4, 3, 7, 2, 6, 4, 2};
        int expected = 11;
        int actual = service.monthMinSum(minSumMonth);
        Assertions.assertEquals(expected, actual);
    }

    @Test//5
    public void serviceMonthsMinMidSale() {
        StatsService service = new StatsService();
        int[] monthsMinMidSale = {57, 63, 35, 88, 20, 99, 21, 43, 55, 67, 45, 83};
        int expected = 6;
        int actual = service.monthsMinMidSale(monthsMinMidSale);
        Assertions.assertEquals(expected, actual);
    }

    @Test//6
    public void serviceMonthsMaxMidSale() {
        StatsService service = new StatsService();
        int[] monthsMaxMidSale = {57, 63, 95, 88, 20, 99, 81, 43, 55, 60, 45, 83};
        int expected = 5;
        int actual = service.monthsMaxMidSale(monthsMaxMidSale);
        Assertions.assertEquals(expected, actual);
    }
}
