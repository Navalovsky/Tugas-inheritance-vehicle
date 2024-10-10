
public class Convertible {

    private String roofType;

    //Constructor parameter
    public String getRoofType() {
        return this.roofType;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public Convertible() {
        super();
        roofType = "";
    }

    public Convertible(String roofType) {
        this.roofType = roofType;
    }

    public void print() {
        System.out.println("Roof type: " + roofType);
    }
}
