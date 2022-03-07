package pl.lublin.wsei.java.cwiczenia;
import static java.lang.Math.pow;
import static java.lang.Math.log;
public class Main {

    public static void main(String[] args) {
        System.out.printf("%s %12s %12s\n","arg","log2(arg)","sum(arg)");
        int sum = 0;
        for (double i = 0; i < 10; i++) {
            System.out.printf("%3d\t%10d\t%10d\n",(int)pow(2,i),(int)(log(pow(2,i)) / log(2)),sum+=pow(2,i));
        }
    }
}
