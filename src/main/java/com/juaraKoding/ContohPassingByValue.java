package com.juaraKoding;

public class ContohPassingByValue {
    public static void main(String[] args) {
        int z = 15;
        ubahVariable(z);
        System.out.println(z);
    }

    public static void ubahVariable(int m){
        m = 14;
    }

}
