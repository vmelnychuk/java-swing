import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private TextPanel textPanel;
    private Toolbar toolbar;
    private FormPanel formPanel;
    
    public MainFrame() {
        super("Hello World");
        setSize(600, 500);
        setLayout(new BorderLayout());
        
        textPanel = new TextPanel();
        toolbar = new Toolbar();
        formPanel = new FormPanel();
        
        toolbar.setStringListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                textPanel.appendText(text);
            }
        });
        
        add(formPanel, BorderLayout.WEST);
        add(toolbar, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
