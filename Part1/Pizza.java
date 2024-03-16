import java.util.ArrayList;
import java.util.List;

public class Pizza {
    
    private Size size;
    private Chain chain;
    private List<String> toppings;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.chain = builder.chain;
        this.toppings = builder.toppings;
    }

    public void eat() {
        System.out.println("Eating " + size.toString().toLowerCase() + " pizza from " 
        + chain.toString().replace("_", " ") + " with toppings: " + String.join(", ", toppings));
    }

    public static class Builder {
        private Size size;
        private Chain chain;
        private List<String> toppings = new ArrayList<>();

        public Builder setSize(Size size) {
            this.size = size;
            return this;
        }

        public Builder setChain(Chain chain) {
            this.chain = chain;
            return this;
        }

        public Builder addPepperoni() {
            this.toppings.add("pepperoni");
            return this;
        }

        public Builder addSausage() {
            this.toppings.add("sausage");
            return this;
        }

        public Builder addMushrooms() {
            this.toppings.add("mushrooms");
            return this;
        }

        public Builder addBacon() {
            this.toppings.add("bacon");
            return this;
        }

        public Builder addOnions() {
            this.toppings.add("onions");
            return this;
        }

        public Builder addExtraCheese() {
            this.toppings.add("extra cheese");
            return this;
        }

        public Builder addPeppers() {
            this.toppings.add("peppers");
            return this;
        }

        public Builder addChicken() {
            this.toppings.add("chicken");
            return this;
        }

        public Builder addOlives() {
            this.toppings.add("olives");
            return this;
        }

        public Builder addSpinach() {
            this.toppings.add("spinach");
            return this;
        }

        public Builder addTomatoAndBasil() {
            this.toppings.add("tomato and basil");
            return this;
        }

        public Builder addBeef() {
            this.toppings.add("beef");
            return this;
        }

        public Builder addHam() {
            this.toppings.add("ham");
            return this;
        }

        public Builder addPesto() {
            this.toppings.add("pesto");
            return this;
        }

        public Builder addSpicyPork() {
            this.toppings.add("spicy pork");
            return this;
        }

        public Builder addHamAndPineapple() {
            this.toppings.add("ham and pineapple");
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    public enum Size { SMALL, MEDIUM, LARGE }
    public enum Chain { PIZZA_HUT, LITTLE_CAESARS, DOMINOS }
}
