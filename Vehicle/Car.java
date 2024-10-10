
public class Car {

    private int numDoors;
    private boolean isElectric;

    //Constructor parameter
    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Car() {
        super();
        numDoors = 0;
        isElectric = true;
    }

    public Car(int numDoors, boolean isElectric) {
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }

    public void print() {
        System.out.println("num doors " + numDoors);
        System.out.println("is electric " + isElectric);
    }
}
