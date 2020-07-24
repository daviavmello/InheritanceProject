import java.util.Scanner;

public abstract class Item {
    Scanner scnr = new Scanner(System.in);
    private String itemType; // Private is considerated best practice in this case
    private int numberOfItems;

    abstract void item();

    public Item () {

    }

    public Item (String itemType, int numberOfItems) {
        this.itemType = itemType; // reserved word "this" used to refer to current contructor
        this.numberOfItems = numberOfItems;
    }

    public void setItemType(String name) {
        itemType = name;
    }
    
    public void setNumberOfItems(int number) {
        numberOfItems = number;
    }

    public String getItemType() {
        return itemType;
    }

    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    // public String print() {
    //     return "This is your shopping list! Products are described down below";
    // }
    
}   