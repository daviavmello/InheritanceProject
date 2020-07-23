import java.util.Scanner;

public class Book extends Item {
    Scanner scnr = new Scanner(System.in);
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
        return bookType + ' ' + bookCount;
    }
    
    // public static void main(String[] args) {
    //     Book book1 = new Book();
    //     book1.setBookType("Asafe");
    //     book1.setBookCount(12);
    //     System.out.println(book1.toString());
    // }
}   