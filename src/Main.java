public class Main {
    public void main(String[] args) {
        System.out.println("-- Coffee Brewing System --\n");

        BrewingStrategy frenchPress = new FrenchPress();

        CoffeeMachine coffeeMachine = new CoffeeMachine(frenchPress);

        System.out.println("Selected method: French Press");

        coffeeMachine.brew();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        BrewingStrategy pourOver = new PourOver();

        coffeeMachine.setStrategy(pourOver);

        System.out.println("Selected method: Pour Over");

        coffeeMachine.brew();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        BrewingStrategy aeroPress = new AeroPress();

        coffeeMachine.setStrategy(aeroPress);

        System.out.println("Selected method: Aero Press");

        coffeeMachine.brew();
    }
}
