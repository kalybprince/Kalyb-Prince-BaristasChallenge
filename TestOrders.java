import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
    
    // instantiate Item object
    Item item1 = new Item("mocha", 2.5);
    Item item2 = new Item("latte", 3.0);

    // instantiate Order objects
    Order order1 = new Order();
    Order order2 = new Order();
    // orders using overloaded constructor
    Order order3 = new Order("Joe");
    Order order4 = new Order("Jane");
    Order order5 = new Order("Jenny");

    // add two items to each order
    order1.addItem(item1);
    order1.addItem(item2);
    
    // order2.addItem(item1);
    // order2.addItem(item2);

    // order3.addItem(item1);
    // order3.addItem(item2);

    // order4.addItem(item1);
    // order4.addItem(item2);

    // order5.addItem(item1);
    // order5.addItem(item2);

    // Test setReady, getStatusMessage, getOrderTotal, and display methods
    order2.isReady(true);
    System.out.println(order2.getStatusMesssage());
    System.out.println(order1.getOrderTotal());
    order1.display();
    }
}