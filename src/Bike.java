/**
 * Created by jeffeben on 12/2/17.
 */
public class Bike extends QueryObject{

    private String modelName;
    private Manufacturer manufacturer;
    private Derailleur derailleur;
    private RearShock rearshock;
    private FrontShock frontshock;
    private Brake brake;
    private Shifter shifter;
    private Frame frame;
    private Wheel wheel;
    private Crankset crankset;
    private Handlebar handlebar;
    private int price;
    private int year;
    private String pictureBinary;

    public Bike(String modelName, Manufacturer manufacturer, Derailleur derailleur, RearShock rearshock, FrontShock frontshock, Brake brake, Shifter shifter, Frame frame, Wheel wheel, Crankset crankset, Handlebar handlebar, int price, int year, String pictureBinary) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.derailleur = derailleur;
        this.rearshock = rearshock;
        this.frontshock = frontshock;
        this.brake = brake;
        this.shifter = shifter;
        this.frame = frame;
        this.wheel = wheel;
        this.crankset = crankset;
        this.handlebar = handlebar;
        this.price = price;
        this.year = year;
        this.pictureBinary = pictureBinary;
    }

    public String getModelName() {
        return modelName;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Derailleur getDerailleur() {
        return derailleur;
    }

    public RearShock getRearshock() {
        return rearshock;
    }

    public FrontShock getFrontshock() {
        return frontshock;
    }

    public Brake getBrake() {
        return brake;
    }

    public Shifter getShifter() {
        return shifter;
    }

    public Frame getFrame() {
        return frame;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Crankset getCrankset() {
        return crankset;
    }

    public Handlebar getHandlebar() {
        return handlebar;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getPictureBinary() {
        return pictureBinary;
    }
}
