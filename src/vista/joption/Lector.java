//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package vista.joption;

import javax.swing.JOptionPane;

public class Lector {
	
	public String leerString(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	public int leerInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}

}
