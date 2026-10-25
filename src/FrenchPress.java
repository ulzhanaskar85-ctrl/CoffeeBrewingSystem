public class FrenchPress implements BrewingStrategy {
    @Override
    public void brewCoffee(){
        System.out.println("Brewing Coffee with French Press..");
        System.out.println("1.Adding ground coffee.");
        System.out.println("2.Pouring hot water.");
        System.out.println("3.Steeping coffee for 4 minutes.");
        System.out.println("4.Pressing the plunger.");
        System.out.println("Coffee is ready!");
    }
}
