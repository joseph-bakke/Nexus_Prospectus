import java.awt.*;
import javax.swing.*;

public class Main {
	
	public static void main(String args[]){
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Pane mainFrame = new Pane();
				mainFrame.setVisible(true);		
			}
		});
	}
}
