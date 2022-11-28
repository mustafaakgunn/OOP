public class CompanyComputers extends Product implements CompanyAsset, Profitable {

    private double companyComputerProfitRate = -40;

    public CompanyComputers(String sku, String description, double price, double tax, double companyComputerProfitRate) {
        super(sku, description, price, tax);
        this.companyComputerProfitRate = companyComputerProfitRate;
    }

    @Override
    public void deleteFromInventory() {
        System.out.println("Company computer is deleted from inventory...");
    }

    @Override
    public void netProfit() {
        System.out.println("Company Computer Net profit rate is: " + getCompanyComputerProfitRate() );
    }

    public double getCompanyComputerProfitRate() {
        return companyComputerProfitRate;
    }

    public void setCompanyComputerProfitRate(double companyComputerProfitRate) {
        this.companyComputerProfitRate = companyComputerProfitRate;
    }


}
