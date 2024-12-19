package com.juaraKoding.Praktikum;

/*
IntelliJ IDEA 2024.3 (Community Edition)
Build #IC-243.21565.193, built on November 13, 2024
@Author mcputro a.k.a. Mu'ti Cahyono Putro
Created on 13 Dec 2024 15:25
@Last Modified 14 Dec 2024 08:25
Version 1.0
*/

import java.util.Scanner;

// Ouput dari input Tid4k $@ma adalah 268
public class Praktikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan string: ");

        // data string yang akan diproses
        String strData = scanner.nextLine();

        // hapus huruf kecil a-z
        // String strDataWithoutLowerCase = strData.replaceAll("[a-z]", "");

        // mengubah string menjadi array karakter
        char[] arrCharData = strData.toCharArray();
        int intSum = 0;

        // menambahkan nilai ASCII setiap karakter
        for (char ch : arrCharData) {
            // tidak ikut menghitung huruf kecil a-z
            if (ch >= 97 && ch <= 122){
                continue;
            }

            intSum += ch;
        }

        // menampilkan hasil penjumlahan
        System.out.println("Hasil : "+intSum);
        scanner.close();
    }
}
