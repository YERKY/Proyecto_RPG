//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package modelo;

public class Enemigo {
	//CONSTANTES DE ESTADISTICAS DE ENEMIGOS
	public static final String LESHEN = "Leshen";
	public static final String LESHEN_ENTRADA = "Un cráneo de ciervo emerge entre unas ramas y un enjambre \nde cuervos se abalanza directo a tus ojos...";
	public static final int LESHEN_VIDA = 15;
	public static final int LESHEN_MAXVIDA = LESHEN_VIDA;
	public static final int LESHEN_ATAQUE = 3;
	public static final int LESHEN_DEFENSA = 2;
	public static final String LESHEN_DIFICULTAD = "Medio";
	public static final String LESHEN_ATAQUENOMBRE = "Enjambre de cuervos";

	public static final String GRIFO = "Grifo";
	public static final String GRIFO_ENTRADA = "Una sombra enorme desciende en picada con las garras abiertas y un chirrido agudo...";
	public static final int GRIFO_VIDA = 10;
	public static final int GRIFO_MAXVIDA = GRIFO_VIDA;
	public static final int GRIFO_ATAQUE = 2;
	public static final int GRIFO_DEFENSA = 1;
	public static final String GRIFO_DIFICULTAD = "Facil";
	public static final String GRIFO_ATAQUENOMBRE = "Arañazo";
	
	public static final String DEMONIO = "Demonio";
	public static final String DEMONIO_ENTRADA = "Una masa colosal de tres ojos fijos en ti bufa con \nfuria y te embiste con una fuerza descomunal...";
	public static final int DEMONIO_VIDA = 20;
	public static final int DEMONIO_MAXVIDA = DEMONIO_VIDA;
	public static final int DEMONIO_ATAQUE = 4;
	public static final int DEMONIO_DEFENSA = 3;
	public static final String DEMONIO_DIFICULTAD = "Medio";
	public static final String DEMONIO_ATAQUENOMBRE = "Embestida";
	
	public static final String BRUJA = "Bruja del Pantano";
	public static final String BRUJA_ENTRADA = "Una vieja deforme se muestra y te\nescupe un fango que hace arder tu piel...";
	public static final int BRUJA_VIDA = 25;
	public static final int BRUJA_MAXVIDA = BRUJA_VIDA;
	public static final int BRUJA_ATAQUE = 6;
	public static final int BRUJA_DEFENSA = 3;
	public static final String BRUJA_DIFICULTAD = "Medio";
	public static final String BRUJA_ATAQUENOMBRE = "Bola de fango maldito";
	
	public static final String ZOMBIE = "Zombie Ahogado";
	public static final String ZOMBIE_ENTRADA = "Un brazo podrido rompe el suelo y el hedor a muerte te golpea justo \nantes de que unos dedos infectados se claven en tu cuello...";
	public static final int ZOMBIE_VIDA = 25;
	public static final int ZOMBIE_MAXVIDA = ZOMBIE_VIDA;
	public static final int ZOMBIE_ATAQUE = 5;
	public static final int ZOMBIE_DEFENSA = 2;
	public static final String ZOMBIE_DIFICULTAD = "Facil";
	public static final String ZOMBIE_ATAQUENOMBRE = "Rasguño";
	
	public static final String HOMBRELOBO = "Hombre Lobo";
	public static final String HOMBRELOBO_ENTRADA = "Escuchas un aullido y una bestia enorme salta desde las sombras con \nlas fauses abiertas, chorreando saliva y sangre...";
	public static final int HOMBRELOBO_VIDA = 35;
	public static final int HOMBRELOBO_MAXVIDA = HOMBRELOBO_VIDA;
	public static final int HOMBRELOBO_ATAQUE = 7;
	public static final int HOMBRELOBO_DEFENSA = 4;
	public static final String HOMBRELOBO_DIFICULTAD = "Dificil";
	public static final String HOMBRELOBO_ATAQUENOMBRE = "Mordida";
	
	public static final String SEPHIROTH = "Sephiroth, el Angel de una Ala";
	public static final String SEPHIROTH_ENTRADA = "Un susurro frio inunda tu mente mientras el \n"
													+ "suelo se agrieta. Una figura angelical y caida \n"
													+ "desciende lentamente del cielo envuelta en \n"
													+ "fuego. Su katana, la Masamune, brilla. lista para \n"
													+ "cortar tu destino...";
	public static final int SEPHIROTH_VIDA = 60;
	public static final int SEPHIROTH_MAXVIDA = SEPHIROTH_VIDA;
	public static final int SEPHIROTH_ATAQUE = 8;
	public static final int SEPHIROTH_DEFENSA = 5;
	public static final String SEPHIROTH_DIFICULTAD = "Deidad";
	public static final String SEPHIROTH_ATAQUENOMBRE = "Octa-Corte";
	
	public static boolean sephirothDerrotado = false;
	
	//declaration
	private String nombre;
	private String textoEntrada;
	private int vida;
	private int vidaMaxima;
	private int ataque;
	private int defensa;
	private String dificultad;
	private String nombreDeAtaque;
	
	//constructors
	public Enemigo() {
		nombre = "No-muerto";
		textoEntrada = "Se acerca una persona extraña...";
		vida = 10;
		vidaMaxima = 10;
		ataque = 2;
		defensa = 2;
		dificultad = "Facil";
		nombreDeAtaque = "Golpe";
		restaurarVida();
	}
	public Enemigo(String name, String introText, int life, int maxLife, int attack, int defense, String difficulty, String attackName) {
		nombre = name;
		textoEntrada = introText;
		vida = life;
		vidaMaxima = maxLife;
		ataque = attack;
		defensa = defense;
		dificultad = difficulty;
		nombreDeAtaque = attackName;
		restaurarVida();
	}
	
	//set methods
	public void setNombre(String name) {
		nombre = name;
	}
	public void setTextoEntrada(String textoEntrada) {
		this.textoEntrada = textoEntrada;
	}
	public void setVida(int life) {
		vida = life;
	}
	public void setAtaque(int attack) {
		ataque = attack;
	}
	public void setDefensa(int defense) {
		defensa = defense;
	}
	public void setDificultad(String difficulty) {
		dificultad = difficulty;
	}
	public void setNombreDeAtaque(String attackName) {
		nombreDeAtaque = attackName;
	}
	public void setMaxLife(int maxLife) {
		vidaMaxima = maxLife;
	}
	//get methods
	public String getNombre() {
		return nombre;
	}
	public String getTextoEntrada() {
		return textoEntrada;
	}
	public int getVida() {
		return vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public String getDificultad() {
		return dificultad;
	}
	public String getNombreDeAtaque() {
		return nombreDeAtaque;
	}
	public int getVidaMaxima() {
		return vidaMaxima;
	}
	
	//toString
	public String toString() {
		return "Enemigo: nombre " + nombre + "\nvida " + vida + "\nataque " + ataque + "\ndefensa " + defensa + "\ndificultad " + dificultad + "\nnombre de ataque " + nombreDeAtaque;
	}
	
	//ENEMIGO ATACA
	public void atacar(Protagonista prota) {
		prota.recibirDano(ataque);
	}
	//RECIBE DAÑO
	public void recibirDano(int ataque) {
		int danoFinal = (int)((ataque * 10) / (10 + defensa));
		if (danoFinal < 1) {
			danoFinal = 1;
		}
		
		vida -= danoFinal;
		
		if(vida < 0) {
			vida = 0;
		}
	}
	//RECUPERA LA VIDA AL MAXIMO (SE USA EN CONSTRUCTOR)
	public void restaurarVida() {
		this.vida = vidaMaxima;
	}
	//VALORA SI ESTA DERROTADO
	public boolean estaDerrotado() {
		if (vida == 0) {
			return true;
		}
		return false;
	}

}
