

class DeveloperTest {
    public static void main(String[] args) {
        System.out.println("-------Starting Developer Test-------");
        Developer dev1 = new Developer("Pepper", 2);
        dev1.displayInfo();
        dev1.setSalary(-30);
        dev1.addOneLanguage("Java");
        dev1.addOneLanguage("Meow");


        dev1.displayInfo();

        Developer dev2 = new Developer();

        dev2.displayInfo();
    }
}