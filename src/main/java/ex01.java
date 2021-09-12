/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = inScan.nextLine();
        System.out.printf("Hello, %s, nice to meet you!\n", name);
    }
}
