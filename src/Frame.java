/**
 * Created by jeffeben on 12/2/17.
 */
public class Frame extends QueryObject{

    private int frameID;
    private String frameType;
    private String materialType;

    public Frame(){}

    public Frame(int frameID, String frameType, String materialType) {
        this.frameID = frameID;
        this.frameType = frameType;
        this.materialType = materialType;
    }

    public int getFrameID() {
        return frameID;
    }

    public String getFrameType() {
        return frameType;
    }

    public String getMaterialType() {
        return materialType;
    }
}
