/**
 * Created by jeffeben on 12/2/17.
 */
public class Manufacturer extends QueryObject{

    private String manufacturerName;
    private String address;
    private String website;

    public Manufacturer(){}

    public Manufacturer(String manufacturerName, String address, String website) {
        this.manufacturerName = manufacturerName;
        this.address = address;
        this.website = website;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public String getAddress() {
        return address;
    }

    public String getWebsite() {
        return website;
    }
}
