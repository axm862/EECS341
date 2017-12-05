import javax.swing.*;

public class ModelName extends NerfedQueryObject{
    public ModelName(JCheckBox jCheckBox) {
        super(jCheckBox);
    }

    @Override
    public void addAttributes() {
        attributeList.add(new JPanelVarchar("ModelName"));
    }
}
