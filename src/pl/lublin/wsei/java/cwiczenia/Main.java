package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setName("ВЕЛИЧКО Глуховский"); //VELYCHKO glukhovsky
        Account acc2 = new Account();
        acc2.setName("Наталія Кличко"); //Nataliya Klychko
        Account acc3 = new Account();
        acc3.setName("Олена Леоненко"); //Olena Leonenko
        Account acc4 = new Account();
        acc4.setName("JARosław Węgierski");

        System.out.println(acc1.getName());
        System.out.println(acc2.getName());
        System.out.println(acc3.getName());
        System.out.println(acc4.getName());


    }
}
