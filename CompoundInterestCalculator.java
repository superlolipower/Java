
package com.mycompany.compoundinterestcalculator;

import java.util.Scanner;

public class CompoundInterestCalculator {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальную сумму: ");
        double principal = scanner.nextDouble();

        System.out.print("Введите годовую процентную ставку (в процентах): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Введите количество периодов (лет): ");
        int periods = scanner.nextInt();

        // Преобразование годовой ставки в десятичную дробь
        double rate = interestRate / 100;

        // Формула расчета сложного процента
        double result = principal * Math.pow(1 + rate, periods);

        System.out.println("Итоговая сумма с учетом сложного процента: " + result);

        scanner.close();
    }
}
