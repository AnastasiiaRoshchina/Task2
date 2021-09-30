/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20task2anastasiiaroshchina;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV20Task2AnastasiiaRoshchina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int x = new Scanner(System.in).nextInt();
        int summ = 0;
        while (x > 0) {
            summ += x % 10;
            x /= 10;
        }
        System.out.println("Сумма цифр: " + summ);
    }
    
}
