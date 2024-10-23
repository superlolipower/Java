// Проверить, явдяется ли год вискосоным, в случае неваерно введенных данных обработать и выбросить исключительную ситуацию
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input Year: ");
            int year = scanner.nextInt();

            if (isLeapYear(year)) {
                System.out.println(year + " - is leap year.");
            } else {
                System.out.println(year + " - is not leap year.");
            }

        } catch (Exception e) {
            System.out.println("Ошибка ввода данных. Пожалуйста, введите год в числовом формате.");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 == 0 && year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }
}
