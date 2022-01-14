package com.company;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Michael", "Isabella", "Carina"};

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for(String name : names) {
            System.out.println(name);
        }

    }
}
