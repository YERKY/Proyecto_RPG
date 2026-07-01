//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package modelo;

public class Protagonista {
	//CONSTANTES DE LAS CLASES DE PROTAGONISTAS
	public static final int CABALLERO_VIDA = 20;
	public static final int CABALLERO_ATAQUE = 3;
	public static final int CABALLERO_DEFENSA = 3;
	public static final int CABALLERO_HABILIDAD = 3;
	public static final int CABALLERO_INTELIGENCIA = 1;
	public static final int CABALLERO_MAXVIDA = CABALLERO_VIDA;
	
	public static final int CAZADOR_VIDA = 17;
	public static final int CAZADOR_ATAQUE = 3;
	public static final int CAZADOR_DEFENSA = 2;
	public static final int CAZADOR_HABILIDAD = 5;
	public static final int CAZADOR_INTELIGENCIA = 2;
	public static final int CAZADOR_MAXVIDA = CAZADOR_VIDA;
	
	public static final int HECHIZERO_VIDA = 15;
	public static final int HECHIZERO_ATAQUE = 2;
	public static final int HECHIZERO_DEFENSA = 2;
	public static final int HECHIZERO_HABILIDAD = 4;
	public static final int HECHIZERO_INTELIGENCIA = 5;
	public static final int HECHIZERO_MAXVIDA = HECHIZERO_VIDA;
	
	public static final int LADRON_VIDA = 15;
	public static final int LADRON_ATAQUE = 3;
	public static final int LADRON_DEFENSA = 2;
	public static final int LADRON_HABILIDAD = 4;
	public static final int LADRON_INTELIGENCIA = 3;
	public static final int LADRON_MAXVIDA = LADRON_VIDA;
	
	//declarations
	private String nombre;
	private String clase;
	private Item arma;
	private int vida;
	private int nivel;
	private int ataque;
	private int defensa;
	private int habilidad;
	private int inteligencia;
	private int dinero;
	private int victorias;
	private int derrotas;
	private int progreso;
	private Bolsa bolso;
	private int vitalidadMaxima;
	private boolean defendiendo;
	private int ataqueBuff;
	private int defensaBuff;

	//constructors
	public Protagonista() {
		nombre = "Rookie";
		clase = "Caballero";
		arma = new Item();
		nivel = 1;
		defensa = 5;
		dinero = 0;
		progreso = 0;
		ataque = 10;
		inteligencia = 1;
		habilidad = 5;
		vida = 100;
		vitalidadMaxima = vida;
		bolso = new Bolsa();
		ataqueBuff = 0;
		defensaBuff = 0;
	}

	public Protagonista(String nombre, String clase, int vida, int ataque, int defensa, int habilidad, int inteligencia,
						Bolsa bolso, int vitalidadMaxima) {
		this.nombre = nombre;
		this.clase = clase;
		this.arma = new Item();
		this.vida = vida;
		this.nivel = 1;
		this.ataque = ataque;
		this.defensa = defensa;
		this.habilidad = habilidad;
		this.inteligencia = inteligencia;
		this.dinero = 0;
		this.victorias = 0;
		this.derrotas = 0;
		this.progreso = 0;
		this.bolso = bolso;
		this.vitalidadMaxima = vitalidadMaxima;
		this.defendiendo = false;
		this.ataqueBuff = 0;
		this.defensaBuff = 0;
	}

	//set y get Nombre
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//set y get Clase
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	//set y get arma
	public Item getArmaEquipada() {
		return arma;
	}

	public void setArmaEquipada(Item arma) {
		this.arma = arma;
	}
	//get y set vida
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	//set y get nivel
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	//set y get fuerza
	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	//set y get defensa
	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	//set y get inteligencia
	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	//set y get dinero
	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	//set y get victorias
	public int getVictorias() {
		return victorias;
	}

	public void setVictorias(int victorias) {
		this.victorias = victorias;
	}
	//set y get derrotas
	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	//set y get progreso
	public int getProgreso() {
		return progreso;
	}

	public void setProgreso(int progreso) {
		this.progreso = progreso;
	}
	//get y set bolso
	public Bolsa getBolso() {
		return bolso;
	}

	public void setBolso(Bolsa bolso) {
		this.bolso = bolso;
	}
	//get y set habilidad
	public int getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(int habilidad) {
		this.habilidad = habilidad;
	}
	//get y set vida maxima
	public int getVitalidadMaxima() {
		return vitalidadMaxima;
	}

	public void setVitalidadMaxima(int vitalidadMaxima) {
		this.vitalidadMaxima = vitalidadMaxima;
	}
	//get y set defendiendo
	public boolean isDefendiendo() {
		return defendiendo;
	}

	public void setDefendiendo(boolean defendiendo) {
		this.defendiendo = defendiendo;
	}
	//get y set buffeo de ataque
	public int getAtaqueBuff() {
		return ataqueBuff;
	}

	public void setAtaqueBuff(int ataqueBuff) {
		this.ataqueBuff = ataqueBuff;
	}
	//get y set buffeo de ataque
	public int getDefensaBuff() {
		return defensaBuff;
	}

	public void setDefensaBuff(int defensaBuff) {
		this.defensaBuff = defensaBuff;
	}

	//toString
	public String toString() {
		return "Protagonista: nombre=" + nombre + "\n vida=" + vida + "\n nivel=" + nivel + "\n fuerza=" + ataque + "\n defensa=" + defensa + "\n destreza=" + habilidad + "\n inteligencia=" + inteligencia + "\n dinero=" + dinero + "\n victorias=" + victorias + "\n derrotas=" + derrotas + "\n progreso=" + progreso + "%";
	}
	
	//MOSTRAR ESTADISTICAS
	public String mostrarPersonaje() {
		return "\n----TU PERSONAJE----\n"
				+ "Nombre: " + nombre + "\n"
				+ "Clase: " + clase + "\n\n"
				+ "Vitalidad: " + vida + "\n"
				+ "Nivel: " + nivel + "\n"
				+ "Ataque: " + ataque + "\n"
				+ "Defensa: "+ defensa + "\n"
				+ "Habilidad: (+" + habilidad + " ataque)\n"
				+ "Inteligencia: " + inteligencia + "\n"
				+ "Arma equipada: " + arma.getNombre() + " (+" + arma.getEfecto() + " ataque)\n\n"
				+ "Dinero Disponible: " + dinero + " Rupias\n\n"
				+ "Victorias: " + victorias + "\n"
				+ "Derrotas: " + derrotas + "\n\n"
				+ "Progreso: " + progreso + "%\n\n";
	}
	
	//REEMPLAZAR ARMA ACTUAL CON LA NUEVA
	public void equiparArma(String tipo) {
		if (tipo.equals(Item.CUCHILLO)) {
			arma = new Item("Cuchillo", Item.CUCHILLO, Item.DESCRIPCION_CUCHILLO, Item.PRECIO_CUCHILLO, Item.EFECTO_CUCHILLO);
		}
		if (tipo.equals(Item.ESPADA)) {
			arma = new Item("Espada", Item.ESPADA, Item.DESCRIPCION_ESPADA, Item.PRECIO_ESPADA, Item.EFECTO_ESPADA);
		}
		if (tipo.equals(Item.MEGAESPADA)) {
			arma = new Item("Katana Rios de Sangre", Item.MEGAESPADA, Item.DESCRIPCION_MEGAESPADA, Item.PRECIO_MEGAESPADA, Item.EFECTO_MEGAESPADA);
		}
	}
	//GET ATAQUE, PERO SUMANDOLE EL DAÑO DEL ARMA EN CASO QUE TENGA UNA EQUIPADA
	public int getAtaqueConArma() {
		if (arma != null) {
			return ataque + arma.getEfecto();
		}
		return ataque;
	}
	//METODO PARA RECIBIR MENOS DAÑO EN EL SIGUIENTE ATAQUE
	public void activarDefensa() {
		defendiendo = true;
	}
	//METODOS DE ATACAR
	public void atacar(Enemigo enemigo) {
		enemigo.recibirDano(getAtaqueConArma());
	}
	public void atacarConPotencia(Enemigo enemigo) {
		enemigo.recibirDano(getAtaqueConArma() + (int)(habilidad / 2));
	}
	//RECIBIR DAÑO
	public void recibirDano(int dano) {
		int danoFinal = (int)(((dano) * 10) / (10 + defensa));
		
		if (defendiendo) {
			danoFinal = (int)(danoFinal / 2);
			defendiendo = false;
		}
		
		if (danoFinal < 1) {
			danoFinal = 1;
		}
		
		vida -= danoFinal;
		if (vida < 0) {
			vida = 0;
		}
	}
	//REUPERA LA VIDA QUE SE INDIQUE
	public void recuperarVitalidad(int cantidad) {
		vida += cantidad;
		
		if (vida > vitalidadMaxima) {
			vida = vitalidadMaxima;
		}
	}
	//INTERCAMBIO DE VIDA ENTRE ENEMIGO Y PROTAGONISTA
	public void intercambiarVitalidad(Enemigo enemigo) {
		int vidaProta = getVida();
		int vidaEnemigo = enemigo.getVida();
		
		setVida(vidaEnemigo);
		enemigo.setVida(vidaProta);
	}
	//AUMENTA LA VITALIDAD AL MAXIMO (SE USA TRAS COMBATE)
	public void restaurarVitalidad() {
		this.vida = vitalidadMaxima;
	}
	//AUMENTO DE ESTAIDSTICAS EN COMBATE
	public void aumentarAtaque(int cantidad) {
		ataque += cantidad;
		ataqueBuff += cantidad;
	}
	public void aumentarDefensa(int cantidad) {
		defensa += cantidad;
		defensaBuff += cantidad;
	}
	//RESTA AUMENTOS DESPUES DEL COMBATE
	public void quitarAumentos() {
		ataque -= ataqueBuff;
		defensa -= defensaBuff;
		ataqueBuff = 0;
		defensaBuff = 0;
	}
	//GANAR Y PERDER DINERO
	public void ganarDinero(int ingreso) {
		dinero += ingreso;
	}
	public void gastarDinero(int cantidad) {
		dinero -= cantidad;
		
		if(dinero < 0) {
			dinero = 0;
		}
	}
	//CADA DOS VICTORIAS PUEDE SUBIR DE NIVEL
	public boolean puedeSubirdeNivel() {
		if((victorias % 2) == 0) {
			return true;
		}
		return false;
	}
	//AUMENTA EL NIVEL +1 CADA DOS VICTORIAS
	public void aumentarNivel() {
		if(puedeSubirdeNivel()) {
			nivel++;
			aumentarAtributos();
			
			if (nivel > 10) {
				nivel = 10;
			}
		}
	}
	//EN NIVELES PARES, ATRIBUTOS SUBEN +1 Y VITALIDAD +2
	public void aumentarAtributos() {
		if(nivel % 2 == 0 && nivel != 1) {
			ataque++;
			defensa++;
			habilidad++;
			inteligencia++;
			vitalidadMaxima += 2;
			
			if(ataque > 10) {
				ataque = 10;
			}
			if(defensa > 10) {
				defensa = 10;
			}
			if(habilidad > 10) {
				habilidad = 10;
			}
			if(inteligencia > 10) {
				inteligencia = 10;
			}
			
			if (nivel == 2) {
				progreso += 30;
			}
			if (nivel == 4) {
				progreso += 30;
			}
			if (nivel == 8) {
				progreso += 30;
			}
		}
	}
	//AUMENTAR VICTORIAS Y DERROTAS
	public void ganar() {
		victorias++;
	}
	public void perder() {
		derrotas++;
	}
	//APLICA ITEMS
	public void usarItem(String tipo, Enemigo enemigo) {
		Item temporal = bolso.sacarItem(tipo);
		
		if (temporal != null) {
			if(tipo.equals(Item.POCION_INTERCAMBIO) && enemigo == null) {
				bolso.almacenarItem(Item.POCION_INTERCAMBIO);
				return;
			}
			if(tipo.equals(Item.HECHIZO_FUEGO) && enemigo == null) {
				bolso.almacenarItem(Item.HECHIZO_FUEGO);
				return;
			}
			if(tipo.equals(Item.HECHIZO_RAYO) && enemigo == null) {
				bolso.almacenarItem(Item.HECHIZO_RAYO);
				return;
			}
			temporal.aplicar(this, enemigo);
		}
		
	}
	//VALORA SI ESTA DERROTADO
	public boolean estaDerrotado() {
		if (vida == 0) {
			return true;
		}
		return false;
	}
	
}
