public class ConsultacyProduct extends Product implements Profitable {

    private double consultancyProfitRate = 325;

    public ConsultacyProduct(String sku, String description, double price, double tax, double consultancyProfitRate) {
        super(sku, description, price, tax);
        this.consultancyProfitRate = consultancyProfitRate;
    }

    @Override
    public void netProfit() {
        System.out.println("Consultancy Net profit rate is: " + getConsultancyProfitRate());
    }

    public double getConsultancyProfitRate() {
        return consultancyProfitRate;
    }

    public void setConsultancyProfitRate(double consultancyProfitRate) {
        this.consultancyProfitRate = consultancyProfitRate;
    }
}
