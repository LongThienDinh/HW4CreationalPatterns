public class Macronutrient implements MacronutrientInterface {
    private String dietPlan;

    public Macronutrient(String dietPlan) {
        this.dietPlan = dietPlan;
    }

    @Override
    public Carb createCarb() {
        return CarbFactory.getInstance().createCarb(dietPlan);
    }

    @Override
    public Protein createProtein() {
        return ProteinFactory.getInstance().createProtein(dietPlan);
    }

    @Override
    public Fat createFat() {
        return FatFactory.getInstance().createFat(dietPlan);
    }
}
