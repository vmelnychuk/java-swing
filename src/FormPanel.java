import java.awt.Dimension;

import javax.swing.JPanel;

public class FormPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    
    public FormPanel() {
        Dimension dimension = getPreferredSize();
        dimension.width = 250;
        setPreferredSize(dimension);
    }
}
