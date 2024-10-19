public class Main {

    public static void main(String[] args) {
        checkLeapYear(2024);
        versionApp(2024, 0);
        int deliveryDistance = 10;
        checkDeliveryDays(deliveryDistance);
    }

    public static void checkLeapYear(int year) {
        // task 1
        System.out.println("Task 1");
        String leapYearMessage = isLeapYear(year) ?
                year + " год — високосный год." :
                year + " год — невисокосный год.";
        System.out.println(leapYearMessage);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void versionApp(int clientDeviceYear, int clientOS) {
        // task 2
        System.out.println("Task 2");
        String appVersionMessage;

        if (clientOS == 0) { // iOS
            appVersionMessage = (clientDeviceYear == 2024) ?
                    "Установите обычную версию приложения для iOS по ссылке." :
                    "Установите облегченную версию приложения для iOS по ссылке.";
        } else { // Android
            appVersionMessage = (clientDeviceYear == 2024) ?
                    "Установите обычную версию приложения для Android по ссылке." :
                    "Установите облегченную версию приложения для Android по ссылке.";
        }
        System.out.println(appVersionMessage);
    }

    public static void checkDeliveryDays(int km) {
        // task 3
        System.out.println("Task 3");
        int days = calculateDeliveryDays(km);
        if (days > 0) {
            System.out.println("Потребуется дней для доставки: " + days);
        } else {
            System.out.println("Доставки нет.");
        }
    }

    public static int calculateDeliveryDays(int km) {
        if (km <= 20) {
            return 1;
        } else if (km < 60) {
            return 2;
        } else if (km < 100) {
            return 3;
        } else {
            return 0;
        }
    }
}