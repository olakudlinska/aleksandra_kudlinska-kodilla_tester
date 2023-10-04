public class SimpleArray {
    public static void main(String[] args) {
String[] dishes = new String[5];
dishes[0] = "pizza";
dishes[1] = "pasta";
dishes[2] = "dumplings";
dishes[3] = "stew";
dishes[4] = "chili con carne";
String dish = dishes[3];
System.out.println(dish);
int numberOfElements = dishes.length;
System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");

    }
}