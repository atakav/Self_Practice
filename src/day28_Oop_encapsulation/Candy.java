package day28_Oop_encapsulation;

public class Candy {

    private String name;
    private int quantity;
    private double price;
    private boolean hasPeanut;

    public Candy(String name, int quantity, double price, boolean hasPeanut) {
        this.name = name;
        setQuantity(quantity);
        setPrice(price);
        this.hasPeanut = hasPeanut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity <=0){
            System.err.println("invalid quantity");
        System.exit(1);
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price ==0 ){
            System.out.println("It if free");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasPeanut() {
        return hasPeanut;
    }

    public void setHasPeanut(boolean hasPeanut) {
        this.hasPeanut = hasPeanut;
    }

    public double totalPrice(){
        return price * quantity;
    }


    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", hasPeanut=" + hasPeanut +
                '}';
    }
}
