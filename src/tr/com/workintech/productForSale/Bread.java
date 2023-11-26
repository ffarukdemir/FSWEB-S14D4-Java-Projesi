package tr.com.workintech.productForSale;

public class Bread extends ProductForSale{

    private int gram;
    public Bread(String type, double price, String description, int gram) {
        super(type, price, description);
        this.gram=gram;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: "+ getType()+"Price: "+ getPrice()+ "Description: "+ getDescription()+ "Ağırlık: "+ gram);

    }
}
