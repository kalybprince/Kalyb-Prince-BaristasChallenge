import java.util.ArrayList;

public class Order {
    private String name = null; 
    private boolean ready = false; 
    private ArrayList<Item> items = null;

    // CONSTRUCTORS
    public Order() {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
    }

    // ORDER METHODS
    public void addItem(Item item) {
        // add Item to items ArrayList
        this.items.add(item);
    }

    public String getStatusMesssage() {
        // return confirmation string
        if (ready) {
            return "Your order is ready";
        } else {
            return "Thank you for waiting.  Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        // return total of all Items in the items ArrayList as float
        double total = 0.0;
        for (int i = 0; i < this.items.size(); i++) {
            total += this.items.get(i).getPrice();
        }
        return total;
    }

    public void display() {
        // print name on customer order and order details
        System.out.printf("Customer name: %s\n", getName());
        for (int i = 0; i < this.items.size(); i++) {
            System.out.printf("%s - $%.2f\n", this.items.get(i).getName(), this.items.get(i).getPrice());
        }
    }
    
    // GETTERS AND SETTERS
    public String getName() {
        return name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void isReady(boolean ready) {
        this.ready = ready;
    }
}

