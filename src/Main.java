public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() { //from 0 to 2_459_000, step 15k per month
        System.out.println("Задача 1");
        int accum = 15000;
        int total = 0;
        int monthForAll = 0;
        while ( total < 2_459_000) {
            total = total + accum;
            monthForAll = total / accum;
            System.out.println("Месяц " + monthForAll + " ,сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() { //from 1 to 10 with for, from 10 to 1 while
        System.out.println("Задача 2");
        int i = 0;
        while ( i<10) {
            i = i + 1;
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (int a=10; a>0; a = a -1) {
            System.out.print(" " + a + " ");
        }
        System.out.println();

    }
    public static void task3() { //population with death and birth
        System.out.println("Задача 3");
        int population = 12_000_000;
        int year = 0;
        while (year < 10) {
            int bithPeoplePerYear = 17 * population/1000;
            int deadPeoplePerYear = 8 * population/1000;
            population = population + (bithPeoplePerYear - deadPeoplePerYear);
            year = year + 1;
            System.out.println("Год " + year + " ,численность населения " + population);
        }
    }
    public static void task4() { //12mln, accum 15k and 7proc. month?
        System.out.println("Задача 4");
        int accum = 15_000;
        int month = 1;
        int total = 0;
        for (; total < 12_000_000; month = month + 1) {
            total = total + total/7;
            total = total + accum;
            System.out.println("Месяц " + month + " ,сумма накоплений " + total);
        }
    }
    public static void task5() { //12mln, accum 15k and 7proc. month? only every sixth month
        System.out.println("Задача 5");
        int accum = 15_000;
        int month = 1;
        int total = 0;
        for (; total < 12_000_000; month = month + 1) {
            total = total + total/7;
            total = total + accum;
            if (month%6 == 0) {
                System.out.println("Месяц " + month + " ,сумма накоплений " + total);
            }
        }
    }
    public static void task6() { //out 7 14 21 28 35 42 49 56 63 70 77 84 91 98 using for
        System.out.println("Задача 6");
        int accum = 15_000;
        long total = 0;
        for (int month = 0; month < 12*9; month = month + 1) {
            total = total + total/7;
            total = total + accum;
            if (month%6 == 0) {
                System.out.println("Месяц " + month + " ,сумма накоплений " + total);
            }
        }
    }
    public static void task7() { //what day is friday?
        System.out.println("Задача 7");
        for (int friday = 1; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() { //savings for the year/month
        System.out.println("Задача 8");
       int nowYear = 2023;
       int beforeNowTwoHundredYear = nowYear - 200;
       int aftNowHundredYear = nowYear + 100;
       for (int yearComet = 0; yearComet < aftNowHundredYear;) {
           if (yearComet > beforeNowTwoHundredYear) {
               System.out.println(yearComet);
           }
           yearComet = yearComet + 79;

       }

    }
}