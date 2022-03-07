package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbe: ");
            int num1 = scan.nextInt();
            if (num1 == 0) break;
            String bin = leftPad(Integer.toBinaryString(num1), '0', 4);
            String hex = leftPad(Integer.toHexString(num1).toUpperCase(),'0',3);
            System.out.printf("DEC = %d, BIN = %s, HEX = %%%s\n", num1, bin, hex);
        }
        while (true);
    }
    public static String leftPad(String aText, char aChar, int aWidth) {
        String res = aText;
        for (int i = 0; i < aWidth; i++) {
            res = aChar + res;
        }
        return res;
    }
}
