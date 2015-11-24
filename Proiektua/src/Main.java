
import java.awt.EventQueue;

import LP.LogIn;
import LP.principio;



public class Main {

	public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						principio frame = new principio();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	}
		
		
}
