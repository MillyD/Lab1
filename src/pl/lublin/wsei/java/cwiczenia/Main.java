package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbe: ");
            int num1 = scan.nextInt();
            if( num1 == 0) break;
            String bin = Integer.toBinaryString(num1);
            String hex = Integer.toHexString(num1).toUpperCase();
            System.out.printf("DEC = %d, BIN = %s, HEX = Ox%s\n",num1,bin,hex);
        }
        while (true);
    }
}
