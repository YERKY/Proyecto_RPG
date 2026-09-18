//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package modelo;

public class Mapa {
	//CONSTANTES DE MAPAS
	public static final String NECROLIMBO = "Necrolimbo";
	public static final String NECROLIMBO_DESCRIPCION = "Praderas verdes, acantilados y bosques templados bajo un cielo dorado.";
	
	public static final String LIURNIA = "Liurnia del Lago";
	public static final String LIURNIA_DESCRIPCION = "Un gigantesco humedal mistico y neblinoso de tonos azules.";
	
	public static final String LEYNDEL = "Leyndel, La Capital Del Reino";
	public static final String LEYNDEL_DESCRIPCION = "Una colosal y laberintica ciudad fortificada en piedra blanca.";
	
	//declarations
	private String nombre;
	private String descripcion;
	private String dificultad;
	
	//constructors
	public Mapa() {
		nombre = "";
		descripcion = "";
		dificultad = "";
	}
	
	public Mapa(String nombre, String descripcion, String dificultad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.dificultad = dificultad;
	}

	//set & get methods
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	//toString
	public String toString() {
		return "Mapa [nombre=" + nombre + ", descripcion=" + descripcion + ", dificultad=" + dificultad + "]";
	}
	
	//RETORNA COMBATE CONTRA ENEMIGO ALEATORIO
	public Combate generarEncuentro(Protagonista prota) {
		return new Combate(prota, generarEnemigo(new RuedaDelDestino()));
	}
	//RETORNA 1 DE 3 ENEMIGOS ALEATORIOS DEPENDIENDO DEL MAPA QUE SE HAYA INICIALIZADO
	public Enemigo generarEnemigo(RuedaDelDestino ruleta) {
		
		if(nombre.equals(NECROLIMBO)) {
			switch (ruleta.girar(1, 3)) {
			case 1:
				return new Enemigo(Enemigo.LESHEN, Enemigo.LESHEN_ENTRADA, Enemigo.LESHEN_VIDA, Enemigo.LESHEN_MAXVIDA, Enemigo.LESHEN_ATAQUE,
									Enemigo.LESHEN_DEFENSA, Enemigo.LESHEN_DIFICULTAD, Enemigo.LESHEN_ATAQUENOMBRE);
			case 2:
				return new Enemigo(Enemigo.GRIFO, Enemigo.GRIFO_ENTRADA, Enemigo.GRIFO_VIDA, Enemigo.GRIFO_MAXVIDA, Enemigo.GRIFO_ATAQUE,
									Enemigo.GRIFO_DEFENSA, Enemigo.GRIFO_DIFICULTAD, Enemigo.GRIFO_ATAQUENOMBRE);
			case 3:
				return new Enemigo(Enemigo.DEMONIO, Enemigo.DEMONIO_ENTRADA, Enemigo.DEMONIO_VIDA, Enemigo.DEMONIO_MAXVIDA, Enemigo.DEMONIO_ATAQUE,
									Enemigo.DEMONIO_DEFENSA, Enemigo.DEMONIO_DIFICULTAD, Enemigo.DEMONIO_ATAQUENOMBRE);
			default:
				return null;
			}
		} if (nombre.equals(LIURNIA)) {
			switch (ruleta.girar(1, 3)) {
			case 1:
				return new Enemigo(Enemigo.BRUJA, Enemigo.BRUJA_ENTRADA, Enemigo.BRUJA_VIDA, Enemigo.BRUJA_MAXVIDA, Enemigo.BRUJA_ATAQUE,
									Enemigo.BRUJA_DEFENSA, Enemigo.BRUJA_DIFICULTAD, Enemigo.BRUJA_ATAQUENOMBRE);
			case 2:
				return new Enemigo(Enemigo.ZOMBIE, Enemigo.ZOMBIE_ENTRADA, Enemigo.ZOMBIE_VIDA, Enemigo.ZOMBIE_MAXVIDA, Enemigo.ZOMBIE_ATAQUE,
									Enemigo.ZOMBIE_DEFENSA, Enemigo.ZOMBIE_DIFICULTAD, Enemigo.ZOMBIE_ATAQUENOMBRE);
			case 3:
				return new Enemigo(Enemigo.HOMBRELOBO, Enemigo.HOMBRELOBO_ENTRADA, Enemigo.HOMBRELOBO_VIDA, Enemigo.HOMBRELOBO_MAXVIDA, Enemigo.HOMBRELOBO_ATAQUE,
									Enemigo.HOMBRELOBO_DEFENSA, Enemigo.HOMBRELOBO_DIFICULTAD, Enemigo.HOMBRELOBO_ATAQUENOMBRE);
			default:
				return null;
			}
		} if (nombre.equals(LEYNDEL)) {
			if (!Enemigo.sephirothDerrotado) {
				return new Enemigo(Enemigo.SEPHIROTH, Enemigo.SEPHIROTH_ENTRADA, Enemigo.SEPHIROTH_VIDA, Enemigo.SEPHIROTH_MAXVIDA, Enemigo.SEPHIROTH_ATAQUE,
									Enemigo.SEPHIROTH_DEFENSA, Enemigo.SEPHIROTH_DIFICULTAD, Enemigo.SEPHIROTH_ATAQUENOMBRE);
			} else {
				return new Enemigo(Enemigo.HOMBRELOBO, Enemigo.HOMBRELOBO_ENTRADA, Enemigo.HOMBRELOBO_VIDA, Enemigo.HOMBRELOBO_MAXVIDA, Enemigo.HOMBRELOBO_ATAQUE,
									Enemigo.HOMBRELOBO_DEFENSA, Enemigo.HOMBRELOBO_DIFICULTAD, Enemigo.HOMBRELOBO_ATAQUENOMBRE);
			}
		}
		return null;
	}
}
