import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Fraction f1 = new Fraction();
        System.out.print("Enter first numerator: ");
        f1.setNumerator(input.nextInt());
        System.out.print("Enter first denominator: ");
        f1.setDenominator(input.nextInt());

        Fraction f2 = new Fraction();
        System.out.print("Enter second numerator: ");
        f2.setNumerator(input.nextInt());
        System.out.print("Enter second denominator: ");
        f2.setDenominator(input.nextInt());

        Fraction f3 = f1.add(f2);

        System.out.printf("%s + %s = %s\n", f1, f2, f3);
    }
}
