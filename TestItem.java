public class TestItem {
public static void main(String[] args) {
        // Item item1 = new Item();
        // item1.setItemType("Asafe");
        // item1.setNumberOfItems(12);
        // System.out.println(item1.toString());

        Produce produce1 = new Produce("Banana", 6); // Omitting setters to make code look cleaner
        Book book1 = new Book("Asafe", 12); 
        
        System.out.println("The book chosen was: " + book1.toString());
        System.out.println("Produce is: " + produce1.toString());
    }
}