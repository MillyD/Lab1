package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        do {
            System.out.println("Podaj liczby do dodania: ");
            num1 = scan.nextInt();
            num2 = scan.nextInt();
            if(num2 == 0 || num1 == 0) break;
            System.out.printf("Wynik dodawania: %d + %d = %d%n", num1, num2, num1 + num2);
        }
        while (true);
    }
}
