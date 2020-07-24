import java.util.Scanner;

public class Produce extends Item {
    Scanner scnr = new Scanner(System.in);
    private String produceType; // Private is considerated best practice in this case
    private int produceCount;

    public Produce () {

    }

    public Produce (String produceType, int produceCount) {
        this.produceCount = produceCount; // reserved word "this" used to refer to current contructor
        this.produceType = produceType;
    }

    public void setProduceType(String name) {
        produceType = name;
    }
    
    public void setProduceCount(int number) {
        produceCount = number;
    }

    public Integer getProduceCount() {
        return produceCount;
    }

    public String getProduceType() {
        return produceType;
    }

    @Override
    public String toString () {
        return produceCount + " " + produceType;
    }
    
    // Overriden abstract method
    public void item() {
        System.out.println("- Produce");
    }
}   