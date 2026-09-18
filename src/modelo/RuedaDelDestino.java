//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package modelo;

public class RuedaDelDestino {
	//GENERAR VALOR ALEATORIO ENTRE EL RANGO
	public int girar(int min, int max) {
		return (int)(min + Math.random() * (max - min + 1));
	}

}
