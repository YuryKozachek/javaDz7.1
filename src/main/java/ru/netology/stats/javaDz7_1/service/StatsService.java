package ru.netology.stats.javaDz7_1.service;

public class StatsService {     //1
    public int sumAllSale(int[] sumMonth) {
        int sumAllMonty = sumMonth[0];
        for (int i = 1; i < sumMonth.length; i++) {
            sumAllMonty += sumMonth[i];
        }
        return sumAllMonty;
    }

    public int midSumSale(int[] sumMonth) {     //2

        return sumAllSale(sumMonth) / sumMonth.length;

    }

    public int monthMaxSum(int[] sumMonth) {        //3
        int maxMonth = 0;
        for (int i = 0; i < sumMonth.length; i++) {
            if (sumMonth[i] >= sumMonth[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int monthMinSum(int[] sumMonth) {        //4
        int minMonth = 0;
        for (int i = 0; i < sumMonth.length; i++) {
            if (sumMonth[i] <= sumMonth[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int monthsMinMidSale(int[] sunMonth) {       //5

        int monthsMinSale = 0;
        for (int i = 0; i < sunMonth.length; i++) {
            if (midSumSale(sunMonth) > sunMonth[i]) {
                monthsMinSale++;
            }
        }
        return monthsMinSale;
    }

    public int monthsMaxMidSale(int[] sunMonth) {       //6

        int monthsMaxSale = 0;
        for (int i = 0; i < sunMonth.length; i++) {
            if (midSumSale(sunMonth) < sunMonth[i]) {
                monthsMaxSale++;
            }
        }
        return monthsMaxSale;
    }

}