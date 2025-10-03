public class Main {
    public static void main(String[] args) {
        // задание  1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        } else if (clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        } else {
            System.out.println("Неподдерживаемая операционная система!");
        }
        // задание 2
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Для Android — «Установите версию приложения для Android по ссылке».");
        } else {
            System.out.println("Неподдерживаемая операционная система!");
        }
        // задание 3
        int year = 2021;
        if (year < 1584) {
            System.out.println("Не корректный год!");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
        // задание 4
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance < 20) {
            deliveryDays += 0;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет!");
        }
        // задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("НЕТ ТАКОГО МЕСЯЦА!");
        }

    }

}






    
