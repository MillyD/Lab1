package pl.lublin.wsei.java.cwiczenia;

public class Main {

    public static void main(String[] args) {

        System.out.println("Metoda print: ");
        System.out.print("Ala");
        System.out.print("ma");
        System.out.print("kota");
        System.out.print("\n");

        System.out.println("Metoda println:");
        System.out.println("Ola");
        System.out.println("ma");
        System.out.println("psa");
        System.out.println("Metoda printf:");

        String smt = "Rower";
        double pr = 1234.564;
        int wh = 4;
        System.out.printf("Kasia ma %20s o %d kołach za %.2f zł ",smt,wh,pr);
    }
}
