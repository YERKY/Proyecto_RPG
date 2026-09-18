//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package modelo;

public class Cofre {
	//GENERA ITEMS ALEATORIAMENTE
	public String generarItem(RuedaDelDestino ruleta) {
		int aleatorio = ruleta.girar(1, 100);

		if (aleatorio <= 15) {
			return Item.POCION_VITALIDAD;
		} else if (aleatorio <= 31) {
			return Item.POCION_ATAQUE;
		} else if (aleatorio <= 46) {
			return Item.POCION_DEFENSA;
		} else if (aleatorio <= 61) {
			return Item.POCION_INTERCAMBIO;
		} else if (aleatorio <= 76) {
			return Item.HECHIZO_FUEGO;
		} else if (aleatorio <= 100) {
			return Item.HECHIZO_RAYO;
		}

		return "";

	}
	//GENERA ARMAS ALEATORIAMENTE DEPENDIENDO DEL NIVEL DEL JUGADOR
	public String generarArma(Protagonista prota, RuedaDelDestino ruleta) {
		int aleatorio = ruleta.girar(1, 100);
		
		if (prota.getNivel() < 4) {
			return Item.CUCHILLO;
		} 
		
		if (prota.getNivel() < 8) {
			if (aleatorio > 60) {
				return Item.CUCHILLO;
			} else {
				return Item.ESPADA;
			}
		}
		
		if (prota.getNivel() >= 8){
			if (aleatorio > 90) {
				return Item.CUCHILLO;
			} else if (aleatorio > 50) {
				return Item.ESPADA;
			} else {
				return Item.MEGAESPADA;
			}
		}
		return "";
	}
}