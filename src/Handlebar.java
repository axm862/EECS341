/**
 * Created by jeffeben on 12/2/17.
 */
public class Handlebar extends QueryObject{

    private int handleBarID;

    private double width;

    private String materialType;

    public Handlebar(int handleBarID, double width, String materialType) {
        this.handleBarID = handleBarID;
        this.width = width;
        this.materialType = materialType;
    }

    public int getHandleBarID() {
        return handleBarID;
    }

    public double getWidth() {
        return width;
    }

    public String getMaterialType() {
        return materialType;
    }
}
