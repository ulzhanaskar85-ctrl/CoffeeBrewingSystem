public class CoffeeMachine {
    private BrewingStrategy strategy;
    public CoffeeMachine(BrewingStrategy strategy) {
        this.strategy = strategy;
    }
    public void setStrategy(BrewingStrategy strategy) {
        this.strategy = strategy;
    }
    public void brew() {
        if (strategy == null) {
            throw new IllegalStateException("No brewing strategy is selected.");
        }
        strategy.brewCoffee();
    }
}
