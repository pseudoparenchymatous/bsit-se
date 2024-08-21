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
    }
}
