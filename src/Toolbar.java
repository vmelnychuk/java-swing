import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel {
    private static final long serialVersionUID = 1L;
    private JButton helloButton;
    private JButton goodbyeButton;
    public Toolbar() {
        helloButton = new JButton("hello");
        goodbyeButton = new JButton("goodbye");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloButton);
        add(goodbyeButton);
    }
}
