

class Item {

    public String name;
    public double price;

    public Item() {
        this.name = "Not Provided";
        this.price = 0.0;
    }

    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}