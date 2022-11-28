public class Product {

    private String sku;
    private String description;
    private double price;
    private double tax;
    private String depot;
    private String place;
    private Product product;

    public Product(String sku, String description, double price, double tax, String depot, String place) {
        this.sku = sku;
        this.description = description;
        this.price = price;
        this.tax = tax;
        this.depot = depot;
        this.place = place;
    }

    public Product(String sku, String description, double price, double tax) {
        this.sku = sku;
        this.description = description;
        this.price = price;
        this.tax = tax;
    }

    public Product(String sku, String description) {
        this.sku = sku;
        this.description = description;
    }

    public Product(Product product) {
        this.product = product;
    }

    public void purchase(){
        System.out.println("Product Purchased!");
    }

    public void productProfit(Profitable profitable){
        profitable.netProfit();
    }

    public void productStocks(Locatable locatable){
        locatable.renewStocks();
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getDepot() {
        return depot;
    }

    public void setDepot(String depot) {
        this.depot = depot;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}
