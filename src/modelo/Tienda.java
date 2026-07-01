//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package modelo;

public class Tienda {
	//declarations
	private int cantidadPocionesVitalidad;
	private int cantidadPocionesAtaque;
	private int cantidadPocionesDefensa;
	private int cantidadPocionesIntercambio;
	private int cantidadHechizosFuego;
	private int cantidadHechizosRayo;
		
	//constructors
	public Tienda() {
		cantidadPocionesVitalidad = 0;
		cantidadPocionesAtaque = 0;
		cantidadPocionesDefensa = 0;
		cantidadPocionesIntercambio = 0;
		cantidadHechizosFuego = 0;
		cantidadHechizosRayo = 0;
	}
	public Tienda(int cantidadPocionesVitalidad, int cantidadPocionesAtaque, int cantidadPocionesDefensa,
			int cantidadPocionesIntercambio, int cantidadHechizosFuego, int cantidadHechizosRayo) {
		this.cantidadPocionesVitalidad = cantidadPocionesVitalidad;
		this.cantidadPocionesAtaque = cantidadPocionesAtaque;
		this.cantidadPocionesDefensa = cantidadPocionesDefensa;
		this.cantidadPocionesIntercambio = cantidadPocionesIntercambio;
		this.cantidadHechizosFuego = cantidadHechizosFuego;
		this.cantidadHechizosRayo = cantidadHechizosRayo;
	}
	//getters and setters
	public int getCantidadPocionesVitalidad() {
		return cantidadPocionesVitalidad;
	}

	public void setCantidadPocionesVitalidad(int cantidadPocionesVitalidad) {
		this.cantidadPocionesVitalidad = cantidadPocionesVitalidad;
	}

	public int getCantidadPocionesAtaque() {
		return cantidadPocionesAtaque;
	}

	public void setCantidadPocionesAtaque(int cantidadPocionesAtaque) {
		this.cantidadPocionesAtaque = cantidadPocionesAtaque;
	}

	public int getCantidadPocionesDefensa() {
		return cantidadPocionesDefensa;
	}

	public void setCantidadPocionesDefensa(int cantidadPocionesDefensa) {
		this.cantidadPocionesDefensa = cantidadPocionesDefensa;
	}

	public int getCantidadPocionesIntercambio() {
		return cantidadPocionesIntercambio;
	}

	public void setCantidadPocionesIntercambio(int cantidadPocionesIntercambio) {
		this.cantidadPocionesIntercambio = cantidadPocionesIntercambio;
	}

	public int getCantidadHechizosFuego() {
		return cantidadHechizosFuego;
	}
	public void setCantidadHechizosFuego(int cantidadHechizosFuego) {
		this.cantidadHechizosFuego = cantidadHechizosFuego;
	}
	public int getCantidadHechizosRayo() {
		return cantidadHechizosRayo;
	}
	public void setCantidadHechizosRayo(int cantidadHechizosRayo) {
		this.cantidadHechizosRayo = cantidadHechizosRayo;
	}
	//toString
	public String toString() {
		return "Tienda [cantidadPocionesVitalidad=" + cantidadPocionesVitalidad + ", cantidadPocionesAtaque="
				+ cantidadPocionesAtaque + ", cantidadPocionesDefensa=" + cantidadPocionesDefensa
				+ ", cantidadPocionesIntercambio=" + cantidadPocionesIntercambio + ", cantidadHechizosFuego="
				+ cantidadHechizosFuego + ", cantidadHechizosRayo=" + cantidadHechizosRayo + "]";
	}
	//VALORA SI TIENE ITEMS O NO
	public boolean tienePocionVitalidad() {
		if (cantidadPocionesVitalidad > 0) {
			return true;
		}
	    return false;
	}
	public boolean tienePocionAtaque() {
		if (cantidadPocionesAtaque > 0) {
				return true;
		}
		return false;
	}
	public boolean tienePocionDefensa() {
		if (cantidadPocionesDefensa > 0) {
			return true;
		}
		return false;
	}
	public boolean tienePocionIntercambio() {
		if (cantidadPocionesIntercambio > 0) {
			return true;
		}
		return false;
	}
	public boolean tieneHechizoFuego() {
		if (cantidadHechizosFuego > 0) {
			return true;
		}
		return false;
	}
	public boolean tieneHechizoRayo() {
		if (cantidadHechizosRayo > 0) {
			return true;
		}
		return false;
	}
	//METODO PARA QUE EL USUARIO COMPRE ITEMS	
	public String comprarItem(Protagonista prota, String tipo) {
		if (tienePocionVitalidad() && tipo.equals(Item.POCION_VITALIDAD)) {
			cantidadPocionesVitalidad--;
			prota.gastarDinero(Item.PRECIO_POCION_VITALIDAD);
			return Item.POCION_VITALIDAD;
		}
		if (tienePocionAtaque() && tipo.equals(Item.POCION_ATAQUE)) {
			cantidadPocionesAtaque--;
			prota.gastarDinero(Item.PRECIO_POCION_ATAQUE);
			return Item.POCION_ATAQUE;
		}
		if (tienePocionDefensa() && tipo.equals(Item.POCION_DEFENSA)) {
			cantidadPocionesDefensa--;
			prota.gastarDinero(Item.PRECIO_POCION_DEFENSA);
			return Item.POCION_DEFENSA;
		}
		if(tienePocionIntercambio() && tipo.equals(Item.POCION_INTERCAMBIO)) {
			cantidadPocionesIntercambio--;
			prota.gastarDinero(Item.PRECIO_POCION_INTERCAMBIO);
			return Item.POCION_INTERCAMBIO;
		}
		if (tieneHechizoFuego() && tipo.equals(Item.HECHIZO_FUEGO)) {
			cantidadHechizosFuego--;
			prota.gastarDinero(Item.PRECIO_HECHIZO_FUEGO);
			return Item.HECHIZO_FUEGO;
		}
		if (tieneHechizoRayo() && tipo.equals(Item.HECHIZO_RAYO)) {
			cantidadHechizosRayo--;
			prota.gastarDinero(Item.PRECIO_HECHIZO_RAYO);
			return Item.HECHIZO_RAYO;
		}
		
		return null;
	}
	//METODO PARA QUE EL USUARIO VENDA ITEMS	
	public void venderItem(Protagonista prota, String tipo) {
		if (tipo.equals(Item.POCION_VITALIDAD)) {
			prota.getBolso().sacarItem(Item.POCION_VITALIDAD);
			cantidadPocionesVitalidad++;
			prota.ganarDinero(Item.PRECIO_POCION_VITALIDAD);
		}
		if (tipo.equals(Item.POCION_ATAQUE)) {
			prota.getBolso().sacarItem(Item.POCION_ATAQUE);
			cantidadPocionesAtaque++;
			prota.ganarDinero(Item.PRECIO_POCION_ATAQUE);
		}
		if (tipo.equals(Item.POCION_DEFENSA)) {
			prota.getBolso().sacarItem(Item.POCION_DEFENSA);
			cantidadPocionesDefensa++;
			prota.ganarDinero(Item.PRECIO_POCION_DEFENSA);
		}
		if (tipo.equals(Item.POCION_INTERCAMBIO)) {
			prota.getBolso().sacarItem(Item.POCION_INTERCAMBIO);
			cantidadPocionesIntercambio++;
			prota.ganarDinero(Item.PRECIO_POCION_INTERCAMBIO);
		}
		if (tipo.equals(Item.HECHIZO_FUEGO)) {
			prota.getBolso().sacarItem(Item.HECHIZO_FUEGO);
			cantidadHechizosFuego++;
			prota.ganarDinero(Item.PRECIO_HECHIZO_FUEGO);
		}
		if (tipo.equals(Item.HECHIZO_RAYO)) {
			prota.getBolso().sacarItem(Item.HECHIZO_RAYO);
			cantidadHechizosRayo++;
			prota.ganarDinero(Item.PRECIO_HECHIZO_RAYO);
		}
	}
}
