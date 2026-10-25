public class PourOver implements BrewingStrategy {
    @Override
    public void brewCoffee(){
        System.out.println("brewing coffee with Pour Over..");
        System.out.println("1.Preparing the paper filter.");
        System.out.println("2.Adding ground coffee.");
        System.out.println("3.Pouring hot water slowly.");
        System.out.println("4.Letting the coffee drip.");
        System.out.println("Coffee is ready!");
    }
}
