public class Main {
    public static void main(String[] args) {
        int contribution = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            i++;
            total = total + total / 100;
            total = total + contribution;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(i);// Задание 1.1

        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }// Задание 1.2
        System.out.println();

        int population = 12000000;
        int m = 0;
        while (m < 10) {
            population = population + population / 1000 * 17 - population / 1000 * 8;
            m++;
            System.out.println("Год" + m + ", численность населения составляет " + population);
        }// Задание 1.3

        int deposit = 15000;
        int n = 0;
        while (deposit <= 12000000) {
            n++;
            deposit = deposit + deposit * 7 / 100;
            System.out.println("Месяц " + n + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println(n);// Задание 2.1

        int deposit1 = 15000;
        int n1 = 0;
        while (deposit1 <= 12000000) {
            n1++;
            deposit1 = deposit1 + deposit1 * 7 / 100;
            if (n1 % 6 == 0) {
                System.out.println("Месяц " + n1 + ", сумма накоплений равна " + deposit1 + " рублей");
            }
        }
        System.out.println(n1);// Задание 2.2

        int dep = 15000;
        for (i = 1; i <= 9 * 12; i++) {
            dep = dep + dep * 7 / 100;
            if (i % 6 == 0) {
                System.out.println("За " + i / 6 + " полугодие сумма накоплений составляет " + dep + " рублей");
            }
        }// Задание 2.3

        int friday = 5;
        int day = 1;
        while (day <= 31) {
            if (day % 7 == friday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
            day++;
        }// Задание 2.4

        int year = 0;
        while (year <= 2122) {
            if (year > 1822) {
                System.out.println("Комета появилась в " + year + " году, в следующий раз появится в " + (year + 79) + " году");
            }
            year = year + 79;
        }// Задание 3.1

        for (int p = 1; p < 11; p++) {
            System.out.println("2*" + p + "=" + (p * 2));
        } // Задание 3.2
    }
}