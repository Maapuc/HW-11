public class Main {
    public static void main(String[] args) {

        chekYear(2024);
        chekYear(2022);
        chekYear(2021);
        chekYear(2025);
        chekYear(2020);
        chekOs(1, 2015);
        chekOs(0, 2017);
        chekOs(1, 2013);
        chekDistance(60);
        chekDistance(10);
        chekDistance(120);
    }

    {
        System.out.println();
        System.out.println(" Задание № 1");
        System.out.println();
    }

    public static void chekYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "год является високосным");
        } else {
            System.out.println(year + " год не является високосным ");
        }
    }

    {
        System.out.println();
        System.out.println(" Задание № 2");
        System.out.println();
    }

    public static void chekOs(int os, int year) {
        if (os == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 0 && year >= 2015) {
            System.out.println(" Установите версию приложения для iOS по cсылке ");
        }
        if (os == 1 && year < 2015) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 1 && year >= 2015) {
            System.out.println(" Установите версию приложения для Android по cсылке ");


        }
    }

    {
        System.out.println();
        System.out.println(" Задание № 3");
        System.out.println();
    }

    public static void chekDistance(int deliveryDistance) {
        int dey = 1;
        if (deliveryDistance > 100) {
            System.out.println(" Доставки нет ");
        } else {
            if (deliveryDistance > 20) {
                dey++;
            }
            if (deliveryDistance > 60) {
                dey++;
            }
            System.out.println("Потребуется дней: " + dey);
        }
    }
}




