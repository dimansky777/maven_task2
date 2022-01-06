package ru.netology.stats;
// кейс 1 : сумма всех продаж
public class StatsService {
    public int sumAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // кейс 2 : Средняя сумма всех продаж
    public int averageAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum / 12;
    }

    // кейс 2.1 : Средняя сумма всех продаж
    public int avgAmount(int[] sales) {
        return sumAmount(sales) / sales.length;
    }


    // кейс 3 : максимальная сумма продаж
    public int maxAmount(int[] sales) {
        int currentMax = sales[0];
        for (int sale : sales) {
            if (sale > currentMax) {
                currentMax = sale;
            }
        }
        return currentMax;
    }

    // кейс 3.1 : Максимальная сумма продаж
    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    // кейс 4 : минимальная сумма продаж
    public int minAmount(int[] sales) {
        int currentMin = sales[0];
        for (int sale : sales) {
            if (sale < currentMin) {
                currentMin = sale;
            }
        }
        return currentMin;
    }


    // кейс 4.1 : минимальная сумма продаж
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    // кейс 5 : Кол. месяцев, где продажи ниже среднего
    public int lowAvgAmount(int[] sales) {
        int months = 0;
            for (int sale : sales) {
                int i = sumAmount(sales) / sales.length;
                if (sale <  i) {
                    months = months +1;
                }
            }
        return months;
    }



    // кейс 6 : Кол. месяцев, где продажи выше среднего
    public int overAvgAmount(int[] sales) {
        int months = 0;
        for (int sale : sales) {
            int i = sumAmount(sales) / sales.length;
            if (sale > i) {
                months = months +1;
            }
        }
        return months;
    }

    }