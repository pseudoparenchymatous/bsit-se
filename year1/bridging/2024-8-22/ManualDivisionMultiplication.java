import java.util.Scanner;

class ManualDivisionMultiplication {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int firstNumber, secondNumber, quotient, remainder, product;

        System.out.print("Enter first number: ");
        firstNumber = console.nextInt();
        remainder = firstNumber;

        System.out.print("Enter second number: ");
        secondNumber = console.nextInt();

        quotient = 0;
        while (remainder >= secondNumber) {
            remainder = remainder - secondNumber;
            quotient = quotient + 1;
        }

        product = 0;
        while (secondNumber > 0) {
            product = product + firstNumber;
            secondNumber = secondNumber - 1;
        }

        System.out.println("Quotient is " + quotient);
        System.out.println("Remainder is " + remainder);
        System.out.println("Product is " + product);
    }
}

