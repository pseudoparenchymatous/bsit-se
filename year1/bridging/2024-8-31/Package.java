public class Package {
    int weight;
    char shippingMethod;
    double cost;

    public Package(int weight, char shippingMethod) {
        this.weight = weight;
        this.shippingMethod = shippingMethod;
        this.cost = calculateCost();
    }

    public int getWeight() {
        return weight;
    }

    public char getShippingMethod() {
        return shippingMethod;
    }

    public double getCost() {
        return cost;
    }

    private double calculateCost() {
        double airCost[] = { 2.00, 3.00, 4.50 };
        double truckCost[] = { 1.50, 2.35, 3.25 };
        double mailCost[] = { 0.50, 1.50, 2.15 };

        int weightCategory;
        if (weight >= 1 && weight <= 8) {
            weightCategory = 0;
        } else if (weight >= 9 && weight <= 16) {
            weightCategory = 1;
        } else {
            weightCategory = 2;
        }

        double cost = 0.00;
        switch (shippingMethod) {
            case 'A':
                cost = airCost[weightCategory];
                break;
            case 'T':
                cost = truckCost[weightCategory];
                break;
            case 'M':
                cost = mailCost[weightCategory];
                break;
        }

        return cost;
    }

    public void display() {
        System.out.printf("Weight: %d\n", weight);
        System.out.printf("Shipping method: %c\n", shippingMethod);
        System.out.printf("Cost: %.2f\n", cost);
    }
}
