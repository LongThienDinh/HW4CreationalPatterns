import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class CarbFactory {
    private static CarbFactory instance;
    private Random random = new Random();

    private CarbFactory() {}

    public static synchronized CarbFactory getInstance() {
        if (instance == null) {
            instance = new CarbFactory();
        }
        return instance;
    }

    public Carb createCarb(String dietPlan) {
        List<Carb> carbs = new ArrayList<>();
        switch (dietPlan) {
            case "Paleo":
                carbs.add(new Pistachio());
                break;
            case "Vegan":
                carbs.add(new Bread());
                carbs.add(new Lentils());
                carbs.add(new Pistachio());
                break;
            case "Nut Allergy":
                carbs.add(new Cheese());
                carbs.add(new Bread());
                carbs.add(new Lentils());
                break;
            default:
                carbs.add(new Cheese());
                carbs.add(new Bread());
                carbs.add(new Lentils());
                carbs.add(new Pistachio());
                break;
        }
        return carbs.get(random.nextInt(carbs.size()));
    }
}