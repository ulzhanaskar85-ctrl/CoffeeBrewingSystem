public class AeroPress implements BrewingStrategy{
    @Override
    public void brewCoffee(){
        System.out.println("Brewing coffee with Aero Press..");
        System.out.println("1.Placing the filter in the cap.");
        System.out.println("2.Adding ground coffee.");
        System.out.println("3.Pouring hot water.");
        System.out.println("4.Stirring and pressing gently.");
        System.out.println("Coffee is ready!");
    }
}
