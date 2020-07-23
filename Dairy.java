import java.util.Scanner;

public class Dairy {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.setItemType("Asafe");
        item1.setNumberOfItems(12);
        System.out.println(item1.getItemType() + item1.getNumberOfItems());
    }
}