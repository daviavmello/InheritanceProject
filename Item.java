public abstract class Item {

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

    @Override
    public String toString () {
        return numberOfItems + " " + itemType;
    }

    public void itemMethod() {
        System.out.println("This is your shopping list! Products are described down below:");
    }
    
}   