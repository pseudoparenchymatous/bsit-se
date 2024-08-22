import java.util.Scanner;

class Reverse {
  public static void main(String args[]) {
    Scanner console = new Scanner(System.in);
    int number;
    int reverse = 0;
    int quotient;

    System.out.print("Enter a number: ");
    number = console.nextInt();

    while (number != 0) {
      quotient = number % 10;
      reverse = (reverse * 10) + quotient;
      number = number / 10;
    }
    System.out.println("Reverse is " + reverse);
  }
}
