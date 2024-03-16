import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class FatFactory {
    private static FatFactory instance;
    private Random random = new Random();

    private FatFactory() {}

    public static synchronized FatFactory getInstance() {
        if (instance == null) {
            instance = new FatFactory();
        }
        return instance;
    }

    public Fat createFat(String dietPlan) {
        List<Fat> fats = new ArrayList<>();
        switch (dietPlan) {
            case "Paleo":
                fats.add(new Avocado());
                fats.add(new Tuna());
                fats.add(new Peanuts()); 
                break;
            case "Vegan":
                fats.add(new Avocado());
                fats.add(new Peanuts());
                break;
            case "Nut Allergy":
                fats.add(new Avocado());
                fats.add(new SourCream());
                fats.add(new Tuna());
                break;
            default:
                fats.add(new Avocado());
                fats.add(new SourCream());
                fats.add(new Tuna());
                fats.add(new Peanuts());
                break;
        }
        return fats.get(random.nextInt(fats.size()));
    }
}