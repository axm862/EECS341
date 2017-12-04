import java.util.HashMap;

public class AttributeName {

    private static final HashMap dictionary = new HashMap<String, String>(){{
        put("handlebarID", "Width");
        put("handlebarMaterialType", "Material");
        put("cranksetID", "Name");
        put("wheelID", "Name");
        put("wheelSize", "Diameter");
        put("frameID", "Name");
        put("frameType", "Type");
        put("frameMaterialType", "Material");
        put("shifterID", "Name");
        put("family", "Family");
        put("brakeID", "Name");
        put("brakeType", "Mechanism");
        put("frontShockID", "Name");
        put("fs_travel_mm", "Travel");
        put("rearShockID", "Name");
        put("rs_travel_mm", "Travel");
        put("derailleurID", "Name");
        put("manufacturerName", "Manufacturer");
    }};

    public static String toReadableString(String attributeName){
/*        if(attributeName.contains("ID")){
            return "Name";
        }*/
        if(dictionary.containsKey(attributeName)){
            return String.valueOf(dictionary.get(attributeName));
        }
        return attributeName.substring(0, 1).toUpperCase() + attributeName.substring(1);
    }
}
