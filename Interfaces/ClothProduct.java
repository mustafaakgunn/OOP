public class ClothProduct extends Product implements Locatable, Profitable{

    private double clothProfitRate = 135;

    public ClothProduct(String sku, String description, double price, double tax, String depot, String place, double clothProfitRate) {
        super(sku, description, price, tax, depot, place);
        this.clothProfitRate = clothProfitRate;
    }

    @Override
    public void renewStocks() {
        System.out.println("Cloth Stocks Renewed...");
    }

    @Override
    public void netProfit() {
        System.out.println("Cloth Net profit rate is: " + getClothProfitRate() );
    }

    public double getClothProfitRate() {
        return clothProfitRate;
    }

    public void setClothProfitRate(double clothProfitRate) {
        this.clothProfitRate = clothProfitRate;
    }

}
