import java.util.HashMap;

public class AttributeName {

    private static final HashMap dictionary = new HashMap<String, String>(){{
        put("handlebarID".toLowerCase(), "Handlebar Width");
        put("handlebarMaterialType".toLowerCase(), "Material");
        put("cranksetID".toLowerCase(), "Crankset Name");
        put("wheelID".toLowerCase(), "Wheel Name");
        put("wheelSize".toLowerCase(), "Wheel Diameter");
        put("frameID".toLowerCase(), "Frame Name");
        put("frameType".toLowerCase(), "Type");
        put("frameMaterialType".toLowerCase(), "Material");
        put("shifterID".toLowerCase(), "Shifter Name");
        put("family".toLowerCase(), "Family");
        put("brakeID".toLowerCase(), "Brake Name");
        put("brakeType".toLowerCase(), "Mechanism");
        put("frontShockID".toLowerCase(), "Front Shock Name");
        put("fs_travel_mm".toLowerCase(), "Travel");
        put("rearShockID".toLowerCase(), "Rear Shock Name");
        put("rs_travel_mm".toLowerCase(), "Travel");
        put("derailleurID".toLowerCase(), "Derailleur Name");
        put("manufacturerName".toLowerCase(), "Manufacturer");
        put("derailleurfamily".toLowerCase(), "Derailleur Family");
        put("modelname".toLowerCase(), "Model Name");
    }};

    public static String toReadableString(String attributeName){
        if(dictionary.containsKey(attributeName.toLowerCase())){
            return String.valueOf(dictionary.get(attributeName.toLowerCase()));
        }
        return attributeName.substring(0, 1).toUpperCase() + attributeName.substring(1);
    }
}
