public class Item {
    private String name;
    private double price;

    // constructors
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // 
}