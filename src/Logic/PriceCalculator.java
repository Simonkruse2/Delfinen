package Logic;

public class PriceCalculator {

    public double Price(int age) throws Exception{
        double price = 0;
        
            if (age < 18) {
                price = 1000.0;
            }
            if (age >= 18) {
                price = 1600.0;
            }
            if (age >= 60) {
                price = 1600.0 * 0.75;
            }
            return price;

    }
}
