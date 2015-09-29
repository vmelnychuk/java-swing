import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Toolbar extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JButton helloButton;
    private JButton goodbyeButton;
    private StringListener textListener;
    public Toolbar() {
        helloButton = new JButton("hello");
        goodbyeButton = new JButton("goodbye");
        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(helloButton);
        add(goodbyeButton);
    }
    public void setStringListener(StringListener listener) {
        this.textListener = listener;
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        JButton clickedButton = (JButton) event.getSource();
        if (clickedButton == helloButton) {
            if (textListener != null) {
                textListener.textEmitted("Hello\n");
            }
            
        } else if (clickedButton == goodbyeButton) {
            if (textListener != null) {
                textListener.textEmitted("Goodbye\n");
            }
        }
    }
}
