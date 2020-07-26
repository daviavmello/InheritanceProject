interface DairyInterface {
    abstract public void dairyMethod ();
}

public class Dairy extends Produce implements DairyInterface {
    private String dairyType; // Private is considerated best practice in this case
    private int dairyCount;

    public Dairy () {

    }

    public Dairy (String dairyType, int dairyCount) {
        this.dairyCount = dairyCount; // reserved word "this" used to refer to current contructor
        this.dairyType = dairyType;
    }

    public void setDairyType(String name) {
        dairyType = name;
    }
    
    public void setDairyCount(int number) {
        dairyCount = number;
    }

    public Integer getDairyCount() {
        return dairyCount;
    }

    public String getDairyType() {
        return dairyType;
    }

    @Override
    public String toString () {
        return dairyCount + " " + dairyType;
    }

    public void dairyMethod () {
        System.out.println("* Dairy");
    }
}   