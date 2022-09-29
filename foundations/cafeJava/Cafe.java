public class Cafe {
    public static void main(String[] args) {


        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.75;
        double dripCoffee = 4.30;
        double latte = 5.0;
        double cappuccino = 2.75;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Customer 1
        System.out.println(generalGreeting + customer1);
        System.out.println(isReadyOrder1 ? customer1 + readyMessage + ' ' + displayTotalMessage + dripCoffee: customer1 + pendingMessage);

        // Customer 2
        System.out.println(generalGreeting + customer2);
        System.out.println(isReadyOrder2 ? customer2 + readyMessage + ' ' + displayTotalMessage + latte*2: customer2 + pendingMessage);

        // Customer 3
        System.out.println(generalGreeting + customer3);
        double difference = latte - dripCoffee;
        System.out.println(displayTotalMessage + difference);

        // Customer 4
        System.out.println(generalGreeting + customer4);
        System.out.println(isReadyOrder4 ? customer4 + readyMessage + ' ' + displayTotalMessage + cappuccino: customer4 + pendingMessage);
    }
}