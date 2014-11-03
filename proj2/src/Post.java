import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class Post extends JPanel{
	
	private int initialX = 850;
	private int initialY = 1000;
	
	public Post(){
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setup();
	}  
	
	public void setup(){	
		/*Icon*/
		//JPanel link = new JPanel();
		//link.setSize(initwid, initwid);
		/*Title and Author*/
		JPanel info = new JPanel();
		info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));
		add(info);
	}
}
