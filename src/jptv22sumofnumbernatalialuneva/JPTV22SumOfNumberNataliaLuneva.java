/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22sumofnumbernatalialuneva;

import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class JPTV22SumOfNumberNataliaLuneva {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();
        if (number >= 100 && number <= 999) {
            int digit1 = number / 100; 
            int digit2 = (number / 10) % 10;  
            int digit3 = number % 10;  
            int sum = digit1 + digit2 + digit3;

            System.out.println("Сумма цифр: " + sum);
        } else {
            System.out.println("Введенное число не является трехзначным.");
        }
    }
}


