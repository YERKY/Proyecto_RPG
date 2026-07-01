//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package modelo;

public class Item {
	
	//CONSTANTES DE ITEMS
	
	//POCIONES DE VIDA
	public static final String POCION_VITALIDAD = "Pocion de Vitalidad";
	public static final String DESCRIPCION_POCION_VITALIDAD = "Brebaje que recupera 10 puntos de salud";
	public static final int PRECIO_POCION_VITALIDAD = 25;
	public static final int EFECTO_POCION_VITALIDAD = 10;
	//POCIONES DE ATAQUE
	public static final String POCION_ATAQUE = "Pocion de Ataque";
	public static final String DESCRIPCION_POCION_ATAQUE = "Brebaje que aumenta el ataque temporalmente";
	public static final int PRECIO_POCION_ATAQUE = 30;
	public static final int EFECTO_POCION_ATAQUE = 2;
	//POCIONES DE DEFENSA
	public static final String POCION_DEFENSA = "Pocion de Defensa";
	public static final String DESCRIPCION_POCION_DEFENSA = "Brebaje que aumenta la defensa temporalmente";
	public static final int PRECIO_POCION_DEFENSA = 30;
	public static final int EFECTO_POCION_DEFENSA = 2;
	//POCIONES DE INTERCAMBIO DE VIDA
	public static final String POCION_INTERCAMBIO = "Pocion de Intercambio";
	public static final String DESCRIPCION_POCION_INTERCAMBIO = "Brebaje que intercambia la cantidad de vida que tienes con la de tu enemigo";
	public static final int PRECIO_POCION_INTERCAMBIO = 80;
	//HECHIZO DE FUEGO
	public static final String HECHIZO_FUEGO = "Hechizo de Fuego";
	public static final String DESCRIPCION_HECHIZO_FUEGO = "Conjuro que, al leerse en voz alta, prende en llamas al enemigo por unos segundos";
	public static final int PRECIO_HECHIZO_FUEGO = 50;
	public static final int EFECTO_HECHIZO_FUEGO = 5;
	//HECHIZO RAYO
	public static final String HECHIZO_RAYO = "Hechizo de Rayo";
	public static final String DESCRIPCION_HECHIZO_RAYO = "Conjuro que, al leerse en voz alta, invoca un rayo que cae sobre el enemigo";
	public static final int PRECIO_HECHIZO_RAYO = 60;
	public static final int EFECTO_HECHIZO_RAYO = 7;
	
	//ARMA CUCHILLO
	public static final String CUCHILLO = "Cuchillo";
	public static final String DESCRIPCION_CUCHILLO = "Pequeña arma punzocortante";
	public static final int PRECIO_CUCHILLO = 20;
	public static final int EFECTO_CUCHILLO = 1;
	//ARMA ESPADA
	public static final String ESPADA = "Espada";
	public static final String DESCRIPCION_ESPADA = "Ancha espada de tamaño considerable, pesa un poco";
	public static final int PRECIO_ESPADA = 85;
	public static final int EFECTO_ESPADA = 3;
	//ARMA KATANA
	public static final String MEGAESPADA = "Katana Rios de Sangre";
	public static final String DESCRIPCION_MEGAESPADA = "Katana maldecida con magia de un Dios de otro reino, su\n"
													  + "hoja esta imbuida en sangre";
	public static final int PRECIO_MEGAESPADA = 150;
	public static final int EFECTO_MEGAESPADA = 6;
	
	//declarations
	private String nombre;
	private String tipo;
	private String descripcion;
	private int precio;
	private int valorEfecto;
	
	//constructors
	public Item() {
		nombre = "vacio";
		tipo = "vacio";
		descripcion = "vacio";
		precio = 1;
		valorEfecto = 0;
	}
	public Item(String name, String type, String description, int price, int effect) {
		nombre = name;
		tipo = type;
		descripcion = description;
		precio = price;
		valorEfecto = effect;
	}
	
	//get y set name
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//get y set type
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//get y set description
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//get y set price
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	//get y set effect
	public int getEfecto() {
		return valorEfecto;
	}
	public void setEfecto(int efecto) {
		this.valorEfecto = efecto;
	}
	
	//toString
	public String toString() {
		return "Item: nombre " + nombre + "\ntipo " + tipo + "\ndescripcion " + descripcion + "\nprecio " + precio + "\nefecto " + valorEfecto;
	}
	
	//APLICAR ITEMS
	public void aplicar(Protagonista protagonista, Enemigo enemigo) {
        if (tipo.equals(POCION_VITALIDAD)) {
            protagonista.recuperarVitalidad(valorEfecto);
        }
        if (tipo.equals(POCION_ATAQUE)) {
            protagonista.aumentarAtaque(valorEfecto);
        }
        if (tipo.equals(POCION_DEFENSA)) {
        	protagonista.aumentarDefensa(valorEfecto);
        }
        if (tipo.equals(Item.POCION_INTERCAMBIO) && enemigo != null) {
        	protagonista.intercambiarVitalidad(enemigo);
        }
        if (tipo.equals(HECHIZO_FUEGO)) {
        	int danoFinal = EFECTO_HECHIZO_FUEGO + (protagonista.getInteligencia() / 2);
			enemigo.recibirDano(danoFinal);
		}
        if (tipo.equals(HECHIZO_RAYO)) {
        	int danoFinal = EFECTO_HECHIZO_RAYO + (protagonista.getInteligencia() / 2);
			enemigo.recibirDano(danoFinal);
        }

    }
	
}
