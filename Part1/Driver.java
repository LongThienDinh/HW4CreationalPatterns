public class Driver {

    public static void main(String[] args) {
        Pizza largePizzaHut = new Pizza.Builder()
            .setSize(Pizza.Size.LARGE)
            .setChain(Pizza.Chain.PIZZA_HUT)
            .addPepperoni()
            .addOlives()
            .addMushrooms()
            .build();
        largePizzaHut.eat();

        Pizza SmallpizzaHut = new Pizza.Builder()
            .setSize(Pizza.Size.SMALL)
            .setChain(Pizza.Chain.PIZZA_HUT)
            .addPepperoni()
            .addMushrooms()
            .build();
        SmallpizzaHut.eat();

        Pizza MediumLittleCaesars = new Pizza.Builder()
            .setSize(Pizza.Size.MEDIUM)
            .setChain(Pizza.Chain.LITTLE_CAESARS)
            .addOnions()
            .addExtraCheese()
            .addSausage()
            .addBacon()
            .addChicken()
            .addBeef()
            .addOlives()
            .addSpinach()
            .build();
        MediumLittleCaesars.eat();

        Pizza smallLittleCaesars= new Pizza.Builder()
            .setSize(Pizza.Size.SMALL)
            .setChain(Pizza.Chain.LITTLE_CAESARS)
            .addHam()
            .addHamAndPineapple()
            .addMushrooms()
            .addChicken()
            .addSpinach()
            .addPeppers()
            .build();
        smallLittleCaesars.eat();

        Pizza smallDominos = new Pizza.Builder()
            .setSize(Pizza.Size.SMALL)
            .setChain(Pizza.Chain.DOMINOS)
            .addTomatoAndBasil()
            .build();
        smallDominos.eat();

        Pizza largeDominos = new Pizza.Builder()
            .setSize(Pizza.Size.LARGE)
            .setChain(Pizza.Chain.DOMINOS)
            .addPesto()
            .addChicken()
            .addPeppers()
            .build();
        largeDominos.eat();
    }
}
