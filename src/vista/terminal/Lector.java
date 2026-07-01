//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package vista.terminal;

import java.util.Scanner;

public class Lector {
	
	static Scanner scanner = new Scanner(System.in);
	
	public String leerString(String msg) {
		System.out.print(msg);
		return scanner.next();
	}
	public int leerInt(String msg) {
		int numeroValidado = 0;
		boolean valido = false;
		
		while (!valido) {
			System.out.print(msg);
			
			if (scanner.hasNextInt()) {
				numeroValidado = scanner.nextInt();
				valido = true;
				scanner.nextLine();
			} else {
				String invalido = scanner.next();
				System.err.print("\nERROR. (" + invalido + ") no es un valor valido. Intentalo de nuevo:");
				scanner.nextLine();
			}
		}
		return numeroValidado;
	}
	public void limpiarLector() {
		scanner.next();
	}

}
