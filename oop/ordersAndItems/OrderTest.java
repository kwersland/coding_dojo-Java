import java.util.ArrayList;

class OrderTest {
    public static void main(String[] args) {
        System.out.println("------Start Order Test------");

        // Menu Items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.setName("Mocha");
        item2.setName("Latte");
        item3.setName("Drip Coffee");
        item4.setName("Capuccino");

        item1.setPrice(2.5);
        item2.setPrice(4.5);
        item3.setPrice(3.25);
        item4.setPrice(3.0);

        // System.out.println(item1.name);
        // System.out.println(item1.price);

        //Order variables -- order1, order2, etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.setName("Cindhuri");
        order1.setItem(item1);

        order2.setName("Jimmy");
        order3.setName("Noah");
        order4.setName("Sam");

        order2.setItem(item1);
        order3.setItem(item4);
        order4.setItem(item2);
        order1.setReady();
        order4.setItem(item2);
        order4.setItem(item2);
        order2.setReady();


        order1.displayOrder();
        order2.displayOrder();
        order3.displayOrder();
        order4.displayOrder();

        //Application simulations
        //Use this example code to test various orders updates
    }
}