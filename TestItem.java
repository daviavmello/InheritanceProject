public class TestItem {
public static void main(String[] args) {        
        Produce produce1 = new Produce("Lettuce", 2); // Omitting calling the setters to make code look cleaner
        Book book1 = new Book("Holy Bible", 12); 
        Fruit fruit1 = new Fruit("Bananas", 6);
        Dairy dairy1 = new Dairy("Milk jugs", 3);
        Textbook textbook1 = new Textbook("Advanced Java", 1);
        Audiobook audiobook1 = new Audiobook("The power of habits", "Luke Shawn");

        // Call list method
        book1.itemMethod();
        // _________________________________________________
        book1.item();
        System.out.println("The book chosen was: " + book1.toString());
        // _________________________________________________
        textbook1.textbookMethod();
        System.out.println("Textbook to buy: " + textbook1.toString());
        // _________________________________________________
        audiobook1.audiobookMethod();
        System.out.println("Audiobook on wishlist: " + audiobook1.toString());
        // _________________________________________________
        produce1.item();
        System.out.println("Produce is: " + produce1.toString());
        // _________________________________________________
        fruit1.fruitMethod();
        System.out.println("Fruit chosen is: " + fruit1.toString());
        // _________________________________________________
        dairy1.dairyMethod();
        System.out.println("Type of dairy: " + dairy1.toString());
        // _________________________________________________
    }
}