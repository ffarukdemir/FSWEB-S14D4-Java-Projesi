package tr.com.workintech.productForSale;

public class Coke extends ProductForSale {

    private double litre;
    public Coke(String type, double price, String description, double litre) {
        super(type, price, description);
        this.litre=litre;
    }

    @Override
    public void showDetails() {
        System.out.println("Type"+ getType()+"Price: "+ getPrice()+ "Description: "+ getDescription()+ "Hacim: "+ litre);

    }


}
