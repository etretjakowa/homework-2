package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        }


        int clientOS2 = 1;
        int clientDeviceYear = 2018;

        boolean isRequiresLiteVersion = clientDeviceYear < 2015;
        boolean isIos = clientOS2 == 0;

        if (isIos) {

            if (isRequiresLiteVersion) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
        } else {
            if (isRequiresLiteVersion) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }

        }

        int year = 2016;

        if (year % 400 == 0) {
            System.out.println(year + "  год является високосным.");
        } else if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println(year + "  год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        } else {
            System.out.println(year + " год не является високосным.");
        }


        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день.");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня.");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется 3 дня.");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется 4 дня.");
        } else {
            System.out.println("Потребуется более 4 дней.");
        }

        int monthNumber = 14;
        switch (monthNumber){
            case 1:
            case 2:
            case 12:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                    System.out.println("Весенний месяц");
                    break;
            case 6:
            case 7:
            case 8:
                        System.out.println("Летний месяц");
                        break;
            case 9:
            case 10:
            case 11:
                            System.out.println("Осенний месяц");
                            break;
            default:
                System.out.println("Такого месяц не существует!");

        }
    }
}