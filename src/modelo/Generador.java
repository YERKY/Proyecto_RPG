//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package modelo;

public class Generador {
	//GENERA UNO DE LOS CUATRO PROTAGONISTAS QUE CREAMOS
	public Protagonista generarProtagonista(String nombre, RuedaDelDestino ruleta) {
		
		switch (ruleta.girar(1, 4)) {
		case 1:
			return new Protagonista(nombre, "Caballero", Protagonista.CABALLERO_VIDA, Protagonista.CABALLERO_ATAQUE, 
									Protagonista.CABALLERO_DEFENSA, Protagonista.CABALLERO_HABILIDAD, Protagonista.CABALLERO_INTELIGENCIA,
									new Bolsa(3, 0, 3, 1, 0, 0), Protagonista.CABALLERO_MAXVIDA);
		case 2:
			return new Protagonista(nombre, "Cazador", Protagonista.CAZADOR_VIDA, Protagonista.CAZADOR_ATAQUE, 
									Protagonista.CAZADOR_DEFENSA, Protagonista.CAZADOR_HABILIDAD, Protagonista.CAZADOR_INTELIGENCIA, 
									new Bolsa(2, 2, 1, 1, 0, 0), Protagonista.CAZADOR_MAXVIDA);
		case 3:
			return new Protagonista(nombre, "Hechicero", Protagonista.HECHIZERO_VIDA, Protagonista.HECHIZERO_ATAQUE, 
									Protagonista.HECHIZERO_DEFENSA, Protagonista.HECHIZERO_HABILIDAD, Protagonista.HECHIZERO_INTELIGENCIA, 
									new Bolsa(2, 0, 0, 1, 3, 3), Protagonista.HECHIZERO_MAXVIDA);
		case 4:
			return new Protagonista(nombre, "Ladrón", Protagonista.LADRON_VIDA, Protagonista.LADRON_ATAQUE, 
									Protagonista.LADRON_DEFENSA, Protagonista.LADRON_HABILIDAD, Protagonista.LADRON_INTELIGENCIA, 
									new Bolsa(2, 2, 1, 1, 1, 1), Protagonista.LADRON_MAXVIDA);
		default:
			return null;
		}
	}

}
