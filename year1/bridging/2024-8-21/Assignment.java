class Centimeters {
    public static void main(String args[]) {
        // 25mins
        int cm = 31300;
        int yd = cm / 9144;
        int ft = cm % 9144 / 3048;
        int in = cm % 9144 % 3048 / 254;

        System.out.printf("Enter length in centimeters: %.0f", cm / 100.0);
        System.out.printf("\n %d yards", yd);
        System.out.printf(" %d feet", ft);
        System.out.printf(" %d inches", in);

        // Alternate version 19mins
        // int cm = 31300;
        // int yd = cm / 254 / 36;
        // int ft = cm / 254 / 12 % 3;
        // int in = cm / 243 / 12 / 3 % 254;

        // System.out.printf("Enter length in centimeters: %.0f", cm / 100.0);
        // System.out.printf("\n %d yards", yd);
        // System.out.printf(" %d feet", ft);
        // System.out.printf(" %d inches", in);

        // 3mins
        // int cm = 313;
        // double yd = cm / 2.54 / 36;
        // double ft = cm / 2.54 / 12 % 3;
        // double in = cm / 2.54 / 12 / 3 % 254;
        // System.out.printf("Enter length in centimeters: %d", cm);
        // System.out.printf("\n %.0f yards", yd);
        // System.out.printf(" %.0f feet", ft);
        // System.out.printf(" %.0f inches", in);
    }
}

