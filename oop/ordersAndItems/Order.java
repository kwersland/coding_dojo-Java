import java.util.ArrayList;

class Order {
    
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items;

    public Order(){
        this.name = "Not Provided";
        this.total = 0.0;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public Order(String name, double total) {
        this.name = name;
        this.total = total;
        this.ready = false;
        this.items = new ArrayList<Item>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReady() {
        this.ready = true;
    }

    public double getTotal(){
        return this.total;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

    public void setItem(Item item) {
        this.items.add(item);
        this.total += item.price;
    }

    public ArrayList<String> returnNames(){
        ArrayList<String> names = new ArrayList<String>();
        for (Item item : this.items) {
                String name = item.name;
                names.add(name);
        }
        return names;
    }

    public void displayOrder() {
        System.out.println("-----Order For: "+ this.name + "-----");
        System.out.println("Total: "+this.total);
        System.out.println("Ready? "+this.ready);
        System.out.println("Items: "+ returnNames());
    }
}