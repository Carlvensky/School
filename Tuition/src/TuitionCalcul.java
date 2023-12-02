public class TuitionCalcul {
    public static void main(String[] args) {
            //initial tuition and annual increase rate
        double initialTuition = 10000.0;
        double annualIncreaseRate = 0.05;

            //calculate tuition for each of the next ten years
        for (int year = 1; year <= 10; year++) {
            initialTuition += initialTuition * annualIncreaseRate;

            //tuition for the first year
            if (year == 1) {
                System.out.printf("Tuition in year %d: $%.2f\n", year, initialTuition);
            }
        }

            //calculate total cost for four years' worth of tuition after the tenth year
        double totalCost = 0.0;
        for (int year = 1; year <= 4; year++) {
            totalCost += initialTuition;
            initialTuition += initialTuition * annualIncreaseRate;
        }

            // Display the tuition in ten years
        System.out.printf("Tuition in ten years: $%.2f\n", initialTuition);

            // Display the total cost for four years' worth of tuition after the tenth year
        System.out.printf("Total cost for four years' worth of tuition after the tenth year: $%.2f\n", totalCost);
    }
}
