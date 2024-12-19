package com.juaraKoding.Praktikum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
IntelliJ IDEA 2024.3 (Community Edition)
Build #IC-243.21565.193, built on November 13, 2024
@Author mcputro a.k.a. Mu'ti Cahyono Putro
Created on 19 Dec 2024 18:52
@Last Modified 19 Dec 2024 21:52
Version 1.0
*/
public class Praktikum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> listNumber = new ArrayList<>();
        String strInput;

        System.out.println("Masukkan angka (masukkan karakter lain untuk menghentikan):");

        while (true) {
            strInput = scanner.nextLine();
            // Check if input is a number
            try {
                double doubInput = Double.parseDouble(strInput);
                listNumber.add(doubInput);
            } catch (NumberFormatException e) {
                // If input is not a number, exit the loop
                break;
            }
        }

        // Calculate average
        if (!listNumber.isEmpty()) {
            double total = 0;
            for (double number : listNumber) {
                total += number;
            }
            double average = total / listNumber.size();
            System.out.println("Rata-rata: " + average);
        } else {
            System.out.println("Tidak ada angka yang dimasukkan.");
        }

        scanner.close();
    }
}

