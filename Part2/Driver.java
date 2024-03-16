public class Driver {
    public static void main(String[] args) {
        Customer[] customers = {
            new Customer("Alice", "No Restriction"),
            new Customer("Bob", "Paleo"),
            new Customer("Charlie", "Vegan"),
            new Customer("Diana", "Nut Allergy"),
            new Customer("Edward", "Paleo"),
            new Customer("Fiona", "Vegan")
        };

        for (Customer customer : customers) {
            Macronutrient mealService = new Macronutrient(customer.getDietPlan());
            Carb carb = mealService.createCarb();
            Protein protein = mealService.createProtein();
            Fat fat = mealService.createFat();
            String mealSummary = String.format("%s with %s diet plan consisting of %s, %s, and %s",
                    customer.getName(), customer.getDietPlan(), carb.getName(), protein.getName(), fat.getName());
            System.out.println("* " + mealSummary);
        }
    }
}
