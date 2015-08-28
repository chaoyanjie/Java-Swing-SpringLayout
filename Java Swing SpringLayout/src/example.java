import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingUtilities;

public class example extends JFrame{
	private static final long serialVersionUID = 1L;
	private SpringLayout layout;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JPanel panel;
	public example(){
		panel = new JPanel();
		button1 = new JButton("Button");
		button2 = new JButton("Click");
		button3 = new JButton("John");
		layout = new SpringLayout();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.setLayout(layout);
		// button1
		layout.putConstraint(SpringLayout.WEST, button1, 5, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.NORTH, button1, 5, SpringLayout.NORTH, panel);
		// button2
		layout.putConstraint(SpringLayout.WEST, button2, 5, SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.NORTH, button2, 100, SpringLayout.NORTH, panel);
		// button3
		layout.putConstraint(SpringLayout.EAST, button3, -25, SpringLayout.EAST, panel);
		layout.putConstraint(SpringLayout.SOUTH, button3, -25, SpringLayout.SOUTH, panel);
		
		add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new example();
            }
        }); // Erzeugt einen neuen Thread, der eine Instanz von JFrame erzeugt
	}
}
