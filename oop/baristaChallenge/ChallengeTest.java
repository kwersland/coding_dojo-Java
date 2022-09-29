
public class ChallengeTest {
    public static void main(String[] args) {
        
        Item item1 = new Item("cappucino", 5.25);
        Item item2 = new Item("Mocha", 6.25);
        Item item3 = new Item("Latte", 4.25);
        Item item4 = new Item("Drip Coffee", 3.5);

        // Guest Orders
        Order order1 = new Order();
        Order order2 = new Order();

        // Overloaded orders
        Order order3 = new Order("John");
        Order order4 = new Order("Sam");
        Order order5 = new Order("James");

        // order 1 
        order1.addItem(item1);
        order1.addItem(item3);

        order1.setReady(true);

        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());
        order1.display();

        // order 2
        order2.addItem(item2);
        order2.addItem(item1);

        System.out.println(order2.getStatusMessage());
        System.out.println(order2.getOrderTotal());
        order2.display();

        // order 3
        order3.addItem(item1);
        order3.addItem(item4);

        order3.setReady(true);

        System.out.println(order3.getStatusMessage());
        System.out.println(order3.getOrderTotal());
        order3.display();

        // order 4
        order4.addItem(item2);
        order4.addItem(item3);
        System.out.println(order4.getStatusMessage());
        System.out.println(order4.getOrderTotal());
        order4.display();

        // order 5
        order5.addItem(item4);
        order5.addItem(item4);
        System.out.println(order5.getStatusMessage());
        System.out.println(order5.getOrderTotal());
        order5.display();

    }
}