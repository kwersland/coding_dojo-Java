import java.util.ArrayList;
public class CafeUtil {

    public int getStreakGoal(int weeks) {
        int sum = 0;
        for (int i = 1; i <= weeks; i++) {
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double sum = 0;
        for(double item : prices) {
            sum += item;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            String item = menuItems.get(i);
            System.out.println(i + " " + item);
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        int inline = customers.size();
        System.out.println("There are "+ inline + " people ahead of you.");
        customers.add(userName);
        System.out.println(customers);
    }
}