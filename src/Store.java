import tr.com.workintech.productForSale.Bread;
import tr.com.workintech.productForSale.Chocolate;
import tr.com.workintech.productForSale.Coke;
import tr.com.workintech.productForSale.ProductForSale;

public class Store {
    public static void main(String[] args) {

        Chocolate chocolate = new Chocolate("Bitter", 5, "Sağlıklı", 20);
        Coke coke= new Coke("Light", 35, "Sağlıksız", 1.5);
        Bread bread =new Bread("kepeksiz", 8.5, "tuzsuz", 250);
        ProductForSale[] prods={chocolate, coke, bread};



        listProducts(prods);
    }

    public static void listProducts(ProductForSale[] products) {
for (ProductForSale product: products){
    product.showDetails();
}
    }
}