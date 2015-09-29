import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JButton helloButton;
    private JButton goodbyeButton;
    private TextPanel textPanel;
    public Toolbar() {
        helloButton = new JButton("hello");
        goodbyeButton = new JButton("goodbye");
        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloButton);
        add(goodbyeButton);
    }
    public void setTextPanel(TextPanel textPanel) {
        this.textPanel = textPanel;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        if (clickedButton == helloButton) {
            textPanel.appendText("Hello\n");
        } else if (clickedButton == goodbyeButton) {
            textPanel.appendText("Goodbye\n");
        }
    }
}
