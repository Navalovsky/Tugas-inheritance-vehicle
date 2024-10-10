
public class Bicycle {

    private String bikeType;

    //Constructor parameter
    public String getBikeType() {
        return this.bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public Bicycle() {
        super();
        bikeType = "";
    }

    public Bicycle(String bikeType) {
        this.bikeType = bikeType;
    }

    public void print() {
        System.out.print("Bike Type: " + bikeType);
    }
}
