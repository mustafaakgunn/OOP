public class Main {

    public static void main(String[] args) {

        // Interfaces are one of the greatest tool of OOP programmer.
        // We can use them for many purposes like implementational obligations to classes, giving identification to classes, loosly coupling, polymorphic-programming etc.

        ClothProduct clothProduct = new ClothProduct("1634631","a blue t-shirt", 29.99, 18, "Yenimahalle", "Ankara", 135);

        Product product = new Product(clothProduct);

        product.productProfit(clothProduct);
        product.productStocks(clothProduct);


    }
}
