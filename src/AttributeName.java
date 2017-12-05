import java.util.HashMap;

public class AttributeName {

    private static final HashMap dictionary = new HashMap<String, String>(){{
        put("handlebarID", "Handlebar Width");
        put("handlebarMaterialType", "Material");
        put("cranksetID", "Crankset Name");
        put("wheelID", "Wheel Name");
        put("wheelSize", "Wheel Diameter");
        put("frameID", "Frame Name");
        put("frameType", "Type");
        put("frameMaterialType", "Material");
        put("shifterID", "Shifter Name");
        put("family", "Family");
        put("brakeID", "Brake Name");
        put("brakeType", "Mechanism");
        put("frontShockID", "Front Shock Name");
        put("fs_travel_mm", "Travel");
        put("rearShockID", "Rear Shock Name");
        put("rs_travel_mm", "Travel");
        put("derailleurID", "Derailleur Name");
        put("manufacturerName", "Manufacturer");
    }};

    public static String toReadableString(String attributeName){
        if(dictionary.containsKey(attributeName)){
            return String.valueOf(dictionary.get(attributeName));
        }
        return attributeName.substring(0, 1).toUpperCase() + attributeName.substring(1);
    }
}
