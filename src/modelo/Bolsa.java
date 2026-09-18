//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package modelo;

public class Bolsa {
	
	//declarations
	private int cantidadPocionesVitalidad;
	private int cantidadPocionesAtaque;
	private int cantidadPocionesDefensa;
	private int cantidadPocionesIntercambio;
	private int cantidadHechizosFuego;
	private int cantidadHechizosRayo;
	
	//constructors
	public Bolsa() {
		cantidadPocionesVitalidad = 0;
		cantidadPocionesAtaque = 0;
		cantidadPocionesDefensa = 0;
		cantidadPocionesIntercambio = 0;
		cantidadHechizosFuego = 0;
		cantidadHechizosRayo = 0;
	}

	public Bolsa(int cantidadPocionesVitalidad, int cantidadPocionesAtaque, int cantidadPocionesDefensa,
			int cantidadPocionesIntercambio, int cantidadHechizosFuego, int cantidadHechizosRayo) {
		this.cantidadPocionesVitalidad = cantidadPocionesVitalidad;
		this.cantidadPocionesAtaque = cantidadPocionesAtaque;
		this.cantidadPocionesDefensa = cantidadPocionesDefensa;
		this.cantidadPocionesIntercambio = cantidadPocionesIntercambio;
		this.cantidadHechizosFuego = cantidadHechizosFuego;
		this.cantidadHechizosRayo = cantidadHechizosRayo;
	}

	//setters and getters
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
		return "Bolsa [cantidadPocionesVitalidad=" + cantidadPocionesVitalidad + ", cantidadPocionesAtaque="
				+ cantidadPocionesAtaque + ", cantidadPocionesDefensa=" + cantidadPocionesDefensa
				+ ", cantidadPocionesIntercambio=" + cantidadPocionesIntercambio + ", cantidadHechizosFuego="
				+ cantidadHechizosFuego + ", cantidadHechizosRayo=" + cantidadHechizosRayo + "]";
	}

	//ALMACENAR ITEMS
	public void almacenarItem(String tipo) {
		if (tipo.equals(Item.POCION_VITALIDAD)) {
			cantidadPocionesVitalidad++;
		}
		if (tipo.equals(Item.POCION_ATAQUE)) {
			cantidadPocionesAtaque++;
		}
		if (tipo.equals(Item.POCION_DEFENSA)) {
			cantidadPocionesDefensa++;
		}
		if (tipo.equals(Item.POCION_INTERCAMBIO)) {
			cantidadPocionesIntercambio++;
		}
		if (tipo.equals(Item.HECHIZO_FUEGO)) {
			cantidadHechizosFuego++;
		}
		if (tipo.equals(Item.HECHIZO_RAYO)) {
			cantidadHechizosRayo++;
		}
	}
	//SACAR ITEMS
	public Item sacarItem(String tipo) {
		if (tienePocionVitalidad() && tipo.equals(Item.POCION_VITALIDAD)) {
			cantidadPocionesVitalidad--;
			return new Item("Pocion de vitalidad", Item.POCION_VITALIDAD, Item.DESCRIPCION_POCION_VITALIDAD, Item.PRECIO_POCION_VITALIDAD, Item.EFECTO_POCION_VITALIDAD);
		}
		if (tienePocionAtaque() && tipo.equals(Item.POCION_ATAQUE)) {
			cantidadPocionesAtaque--;
			return new Item("Pocion de ataque", Item.POCION_ATAQUE, Item.DESCRIPCION_POCION_ATAQUE, Item.PRECIO_POCION_ATAQUE, Item.EFECTO_POCION_ATAQUE);
		}
		if (tienePocionDefensa() && tipo.equals(Item.POCION_DEFENSA)) {
			cantidadPocionesDefensa--;
			return new Item("Pocion de defensa", Item.POCION_DEFENSA, Item.DESCRIPCION_POCION_DEFENSA, Item.PRECIO_POCION_DEFENSA, Item.EFECTO_POCION_DEFENSA);
		}
		if (tienePocionIntercambio() && tipo.equals(Item.POCION_INTERCAMBIO)) {
			cantidadPocionesIntercambio--;
			return new Item("Pocion de intercambio", Item.POCION_INTERCAMBIO, Item.DESCRIPCION_POCION_INTERCAMBIO, Item.PRECIO_POCION_INTERCAMBIO, 0);
		}
		if (tieneHechizoFuego() && tipo.equals(Item.HECHIZO_FUEGO)) {
			cantidadHechizosFuego--;
			return new Item("Piromancia", Item.HECHIZO_FUEGO, Item.DESCRIPCION_HECHIZO_FUEGO, Item.PRECIO_HECHIZO_FUEGO, Item.EFECTO_HECHIZO_FUEGO);
		}
		if (tieneHechizoRayo() && tipo.equals(Item.HECHIZO_RAYO)) {
			cantidadHechizosRayo--;
			return new Item("Invocador de Rayo", Item.HECHIZO_RAYO, Item.DESCRIPCION_HECHIZO_RAYO, Item.PRECIO_HECHIZO_RAYO, Item.EFECTO_HECHIZO_RAYO);
		}
		
		return null;
	}
	//METODOS QUE VALORAN SI TIENE ITEMS O NO
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

}
