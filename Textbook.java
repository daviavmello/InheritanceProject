interface TextbookInterface {
    abstract public void textbookMethod ();
}

public class Textbook extends Book implements TextbookInterface {
    private String textbookType; // Private is considerated best practice in this case
    private int textbookCount;

    public Textbook () {

    }

    public Textbook (String textbookType, int textbookCount) {
        this.textbookCount = textbookCount; // reserved word "this" used to refer to current contructor
        this.textbookType = textbookType;
    }

    public void setTextbookType(String name) {
        textbookType = name;
    }
    
    public void setTextbookCount(int number) {
        textbookCount = number;
    }

    public Integer getTextbookCount() {
        return textbookCount;
    }

    public String getTextbookType() {
        return textbookType;
    }

    @Override
    public String toString () {
        return textbookType + " " + textbookCount + " unit";
    }

    public void textbookMethod () {
        System.out.println("* Textbook");
    }
}   