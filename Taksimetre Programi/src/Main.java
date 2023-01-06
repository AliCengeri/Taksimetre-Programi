import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        System.out.print("Mesafeyi Giriniz : " );
        a = input.nextDouble();
        double b = (a*2.20) + 10;
        b = (20<b) ? b : 20;
        System.out.println(b + " tl");
    }
}