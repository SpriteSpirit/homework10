import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //==================================//
        System.out.println("Задание 1");
        System.out.println("Enter year:");
        leapYear(scanner.nextInt());
        //==================================//
        System.out.println("Задание 2");
        System.out.println("Enter 0 — iOS, 1 — Android and the year of device:");
        checkOS(scanner.nextInt(), scanner.nextInt());
        //==================================//
        System.out.println("Задание 3");
        System.out.println("Enter distance from office to delivery address:");
        checkDeliveryDistance(scanner.nextInt());
    }

    public static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) System.out.println(year + " is a leap year");
        else System.out.println(year + " is not a leap year");
    }


    private static void checkOS(int os, int year) {
        int currentYear = LocalDate.now().getYear();

        if (year < currentYear && os == 0) {
            System.out.printf("OS: iOS, year: %d. Please install the lite from the link%n%n", year);
        } else if (year < currentYear && os == 1) {
            System.out.printf("OS: Android, year: %d. Please install the lite from the link%n%n", year);
        } else {
            if (os == 0) {
                System.out.printf("OS: iOS, year: %d. Please install the new version from the link%n%n", year);
            } else {
                System.out.printf("OS: Android, year: %d. Please install the new version from the link%n%n", year);
            }
        }
    }

    private static void checkDeliveryDistance(int distance) {
        int day = 1;
        if (distance <= 20) System.out.printf("Delivery will take %d day%n", day);
        else if (distance <= 60) {
            day += 1;
            System.out.printf("Delivery will take %d day%n", day);
        } else if (distance <= 100) {
            day += 2;
            System.out.printf("Delivery will take %d day%n", day);
        } else System.out.println("No delivery");
    }
}