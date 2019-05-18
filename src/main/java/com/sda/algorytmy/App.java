package com.sda.algorytmy;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //ile chce wygenerowac wyrazow
        int a1= scanner.nextInt();
        int d = scanner.nextInt();
        int ciag = 0;
        for (int i =2; i<=n; i++){
            ciag= a1+(i-1)* d;
            System.out.print(ciag +" ");
        }

    }
}
