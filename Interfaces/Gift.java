public class Gift extends Product implements GiftCard{

    public Gift(String sku, String description) {
        super(sku, description);
    }

    @Override
    public void prepareAGiftCard() {
        System.out.println("Gift Card is prepared!");
    }

}
