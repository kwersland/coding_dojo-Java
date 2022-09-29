import java.util.ArrayList;

class Developer {
    // 1. Member variables : what it does
    public String name;
    public int yearsOfCoding;
    public ArrayList<String> languages;
    public int braincell;
    public double salary;
    private static int devCount;
    private static int langCount;
    

    // 2. Constructor
    public Developer(){
        this.name = "Anonymous";
        this.yearsOfCoding = 5;
        this.languages = new ArrayList<String>();
        this.braincell = 30;
        devCount++;
    }

    public Developer(String name, int braincell){
        this.name = name;
        this.braincell = braincell;
        this.languages = new ArrayList<String>();
        this.yearsOfCoding = 10;
        devcount++;
    }

    // 3. Getters and Setters
    // getter: return datatype of variable, no parameters
    // naming: getName, getYearsOfCoding
    public String getName(){
        return this.name;
    }
    public int getYearsOfCoding(){
        return this.yearsOfCoding;
    }
    public double getSalary(){
        return this.salary;
    }
    public int getBraincell(){
        return this.braincell;
    }
    public ArrayList<String> getLanguages() {
        return this.languages;
    }

    // setter : no return, with parameters with some datatype
    public void setName(String name) {
        this.name = name;
    }
    public void setYearsOfCoding(int yearsOfCoding) {
        this.yearsOfCoding = yearsOfCoding;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setBraincell(int braincell) {
        this.braincell = braincell;
    }
    public void setLanguages(ArrayList<String> languages) {
        this.languages = languages;
    }

    //Static
    public static int getDevCount(){
        return devCount;
    }
    public static void setDevCount(int count){

    }

    public static int getTotalLanguages(String lang) {

    }

    // Other Methods
    public void addOneLanguage(String lang) {
        this.languages.add(lang);
        this.salary += 1000;
        this.braincell += 10;
        langCount++;
    }

    public void displayInfo() {
        System.out.println("------"+ this.name + "------");
        System.out.println("Years of Coding: " + this.yearsOfCoding);
        System.out.println("Braincells: " + this.braincell);
        System.out.println("Languages: " + this.languages);
        System.out.println("Salary: " + this.salary);
    }
}