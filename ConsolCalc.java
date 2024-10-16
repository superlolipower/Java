
package com.mycompany.mavenproject1;

import java.util.Scanner;

public class ConsolCalc {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение вида: 2 * 6.5");
        String a = sc.nextLine();
        try {
            double result = evaluateExpression(a);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
    
    public static double evaluateExpression(String expression) throws Exception {
        String[] tokens = expression.split(" ");
        if (tokens.length != 3) {
            throw new Exception("Неверный формат. Используйте: число1 операция число2");
        }
        
        double num1 = Double.parseDouble(tokens[0]);
        String operator = tokens[1];
        double num2 = Double.parseDouble(tokens[2]);
        
        switch(operator) {
            case "+": return num1 + num2;
            case "-": return num1 - num2;
            case "/": if (num2 == 0)
            {throw new Exception("Деление на ноль невозможно");
            }
            return num1 / num2;
            default: 
                throw new Exception("Неизвестная операция: " + operator);
            case "*": return num1 * num2;
        }
    }
}
