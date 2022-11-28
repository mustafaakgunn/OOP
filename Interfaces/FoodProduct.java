public class FoodProduct extends Product implements Locatable, Profitable{

    private double foodProductProfitRate = 95;

    public FoodProduct(String sku, String description, double price, double tax, String depot, String place, double foodProductProfitRate) {
        super(sku, description, price, tax, depot, place);
        this.foodProductProfitRate = foodProductProfitRate;
    }

    @Override
    public void renewStocks() {
        System.out.println("Food Stocks Renewed...");
    }

    @Override
    public void netProfit() {
        System.out.println("Food Net profit rate is: " + getFoodProductProfitRate() );
    }

    public double getFoodProductProfitRate() {
        return foodProductProfitRate;
    }

    public void setFoodProductProfitRate(double foodProductProfitRate) {
        this.foodProductProfitRate = foodProductProfitRate;
    }
}
