public class TestItem {
public static void main(String[] args) {
        Produce produce1 = new Produce("Lettuce", 2); // Omitting setters to make code look cleaner
        Book book1 = new Book("Holy Bible", 12); 
        Fruit fruit1 = new Fruit("Bananas", 6);
        

        book1.item();
        System.out.println("The book chosen was: " + book1.toString());
        // _________________________________________________
        produce1.item();
        System.out.println("Produce is: " + produce1.toString());
        // _________________________________________________
        fruit1.fruitMethod();
        System.out.println("Fruit chosen is: " + fruit1.toString());
    }
}