public class Book extends Item {
    private String bookType; // Private is considerated best practice in this case
    private int bookCount;

    public Book () {

    }

    public Book(String bookType, int bookCount) {
        this.bookType = bookType; // reserved word "this" used to refer to current contructor
        this.bookCount = bookCount;
    }

    public void setBookType(String name) {
        bookType = name;
    }
    
    public void setBookCount(int number) {
        bookCount = number;
    }

    public String getBookType() {
        return bookType;
    }

    public Integer getBookCount() {
        return bookCount;
    }

    @Override
    public String toString () {
        return bookType + ' ' + bookCount + " units";
    }
    
    public void item() {
        System.out.println("- Book");
    }
}   