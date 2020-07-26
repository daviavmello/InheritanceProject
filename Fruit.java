interface FruitInterface {
    abstract public void fruitMethod ();
}

public class Fruit extends Produce implements FruitInterface {
    private String fruitType; // Private is considerated best practice in this case
    private int fruitCount;

    public Fruit () {

    }

    public Fruit (String fruitType, int fruitCount) {
        this.fruitCount = fruitCount; // reserved word "this" used to refer to current contructor
        this.fruitType = fruitType;
    }

    public void setFruitType(String name) {
        fruitType = name;
    }
    
    public void setFruitCount(int number) {
        fruitCount = number;
    }

    public Integer getFruitCount() {
        return fruitCount;
    }

    public String getFruitType() {
        return fruitType;
    }

    @Override
    public String toString () {
        return fruitCount + " " + fruitType;
    }

    public void fruitMethod () {
        System.out.println("* Fruit");
    }
}   