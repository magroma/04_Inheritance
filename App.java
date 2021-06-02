public class App {
    
    public static void main(String[] args) {
           
        Cat cat1 = new Cat("Grizabella", "white", 29, true);
        ausgabe(cat1.tellYourAttributes("#name"));
        ausgabe(cat1.tellYourAttributes("#color"));

        ausgabe( cat1.tellYourAttributes("#age"));
        ausgabe( cat1.tellYourAttributes("#age"));
        ausgabe( cat1.tellYourAttributes("#age"));
        ausgabe( cat1.tellYourAttributes("#age"));

        System.out.println("-----------------");
        
        Cat cat2 = new Cat("Alonzo", "black", 35, false);
        ausgabe(cat2.tellYourAttributes("#name"));
        ausgabe(cat2.tellYourAttributes("#color"));
        ausgabe(cat2.tellYourAttributes("#age"));

    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }


}
