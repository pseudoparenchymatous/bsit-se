public class InsuredPackage extends Package {
    double additionalCost;

    public InsuredPackage(int weight, char shippingMethod) {
        super(weight, shippingMethod);
        this.additionalCost = calculateAdditionalCost();
    }

    public double getAdditionalCost() {
        return additionalCost;
    }

    private double calculateAdditionalCost() {
        double additionalCost = 0.00;
        if (cost >= 0.00 && cost <= 1.00) {
            additionalCost = 2.45;
        } else if (cost >= 1.01 && cost <= 3.00) {
            additionalCost = 3.95;
        } else {
            additionalCost = 5.55;
        }

        return additionalCost;
    }
}
