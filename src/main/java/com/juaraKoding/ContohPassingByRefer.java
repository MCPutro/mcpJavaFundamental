package com.juaraKoding;

public class ContohPassingByRefer {
    public static void main(String[] args) {
        ClassPassing classPassing = new ClassPassing();
        ClassPassing classPassing1 = classPassing;


        System.out.println(classPassing.getH());
        System.out.println(classPassing1.getH());

        classPassing.setH(10);

        System.out.println(classPassing.getH());
        System.out.println(classPassing1.getH());

    }
}
