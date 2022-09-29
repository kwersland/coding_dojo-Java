import java.util.ArrayList;

class Developer {
    // 1. Member variables : what it does
    public String name;
    public int yearsOfCoding;
    public ArrayList<String> languages = new ArrayList<String>();
    public int braincell;

    // 2. Constructor


    // Other Methods
    public void displayInfo() {
        System.out.println("------"+ this.name + "------");
        System.out.println("Years of Coding: " + this.yearsOfCoding);
        System.out.println("Braincells: " + this.braincell);
        System.out.println("Languages: " + this.languages);
    }
}