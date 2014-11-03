import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Pane extends JFrame {
	
	private int initialX = 850;
	private int initialY = 1000;

	public Pane(){
		setup();
	}
	
	public void setup(){
		JScrollPane scroll = new JScrollPane();
		add(scroll);
		pack();		
		setSize(initialX, initialY);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
	}
}
