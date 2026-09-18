//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package modelo;

public class Combate {
	//declarations
	private Protagonista protagonista;
    private Enemigo enemigo;

    //constructors
    public Combate() {
        this.protagonista = new Protagonista();
        this.enemigo = new Enemigo();
    }    
    
    public Combate(Protagonista protagonista, Enemigo enemigo) {
        this.protagonista = protagonista;
        this.enemigo = enemigo;
    }
    
    //getters and setters
    public Protagonista getProtagonista() {
		return protagonista;
	}

	public void setProtagonista(Protagonista protagonista) {
		this.protagonista = protagonista;
	}

	public Enemigo getEnemigo() {
		return enemigo;
	}

	public void setEnemigo(Enemigo enemigo) {
		this.enemigo = enemigo;
	}
	//toString
	public String toString() {
		return "Combate [protagonista=" + protagonista + ", enemigo=" + enemigo + "]";
	}

	//PROTAGONISTA ATACA
	public boolean protagonistaAtaca(RuedaDelDestino ruleta) {
		if (ruleta.girar(1, 100) <= 80) {
			protagonista.atacar(enemigo);
			return true;
		}
		return false;
    }
	//PROTAGONISTA ATACA (SE LE SUMA EL VALOR DE HABILIDAD)
	public boolean protagonistaAtacaConPotencia(RuedaDelDestino ruleta) {
		if (ruleta.girar(1, 100) <= 45) {
			protagonista.atacarConPotencia(enemigo);
			return true;
		}
		return false;
	}
	//ENEMIGO ATACA
    public boolean enemigoAtaca(RuedaDelDestino ruleta) {
    	if(ruleta.girar(1, 100) <= 80) {
    		enemigo.atacar(protagonista);
    		return true;
    	}
    	return false;
    }
    
    //PROTAGONISTA USA ITEM
    public void protagonistaUsaItem(String tipo) {
    	protagonista.usarItem(tipo, enemigo);
    }
    
    //PROTAGONISTA ACTIVA METODO DE DEFENSA (AFECTA EL RECIBIR DAÑO)
    public void protagonistaDefenderse() {
    	protagonista.activarDefensa();
    }
    
    //PROTAGONISTA ESCAPA
    public boolean protagonistaHuye(RuedaDelDestino ruleta) {
    	if(ruleta.girar(1, 100) <= 50) {
    		return true;
    	}
    	return false;
    }

    //VALORAR SI EL COMBATE TERMINA
    public boolean combateTerminado() {
    	if (protagonista.estaDerrotado() || enemigo.estaDerrotado()) {
    		return true;
		}
        return false;
    }

}
