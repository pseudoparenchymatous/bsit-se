public class Fraction {
    private int numerator;
    private int denominator;

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add(Fraction f2) {
        Fraction result = new Fraction();

        int commonMultiple = denominator * f2.getDenominator();
        int numerator1 = commonMultiple / denominator * numerator;
        int numerator2 = commonMultiple / f2.getDenominator() * f2.getNumerator();
        
        result.setNumerator(numerator1 + numerator2);
        result.setDenominator(commonMultiple);
        result.simplify();

        return result;
    }

    public Fraction subtract(Fraction f2) {
        Fraction result = new Fraction();

        int commonMultiple = denominator * f2.getDenominator();
        int numerator1 = commonMultiple / denominator * numerator;
        int numerator2 = commonMultiple / f2.getDenominator() * f2.getNumerator();

        result.setNumerator(numerator1 - numerator2);
        result.setDenominator(commonMultiple);
        result.simplify();

        return result;
    }

    public Fraction multiply(Fraction f2) {
        Fraction result = new Fraction();

        result.setNumerator(numerator * f2.getNumerator());
        result.setDenominator(denominator * f2.getDenominator());
        result.simplify();

        return result;
    }

    public Fraction divide(Fraction f2) {
        Fraction result = new Fraction();

        result.setNumerator(numerator * f2.getDenominator());
        result.setDenominator(denominator * f2.getNumerator());
        result.simplify();

        return result;
    }

    private void simplify() {
        int smaller;
        if (numerator > denominator) {
            smaller = denominator;
        } else {
            smaller = numerator;
        }

        int gcf = 1;
        for (int i = 2; i <= smaller; i++) {
            int remainder1 = numerator % i;
            int remainder2 = denominator % i;
            if (remainder1 + remainder2 == 0) {
                gcf = i;
            }
        }

        numerator = numerator / gcf;
        denominator = denominator / gcf;

    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
