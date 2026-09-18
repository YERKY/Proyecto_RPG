//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package modelo;

public class Narrador {
	//CONSTANTES
	public static final String INTRODUCCION = "\nHace muchos años, los antiguos guardianes protegían el equilibrio entre los distintos \n"
			+ "territorios del reino. Sin embargo, criaturas oscuras comenzaron a aparecer en los mapas \n"
			+ "olvidados y los caminos dejaron de ser seguros.\n"
			+ "Ahora, nuevos aventureros recorren el mundo enfrentando enemigos, explorando lugares \n"
			+ "peligrosos y buscando sobrevivir entre combates, tesoros y misterios.\n"
			+ "Tu protagonista deberá explorar distintos mapas, derrotar enemigos, mejorar sus habilidades \n"
			+ "y tomar decisiones durante la aventura. Cada combate, victoria o derrota formará parte de su\n"
			+ "historia.\n";
	public static final String LEMA = "\nLas posibilidades son múltiples; algunas elecciones son sencillas, otras sensatas, \n"
			+ "unas temerarias y algunas peligrosas. Eres tú quien debe tomar las decisiones. \n"
			+ "Puedes jugar muchas veces y obtener resultados diferentes. Recuerda que tú \n"
			+ "decides la aventura, que tú eres la aventura. Si tomas una decisión imprudente, \n"
			+ "vuelve al principio y empieza de nuevo. No hay opciones acertadas o erróneas, \n"
			+ "sino muchas elecciones posibles. Elige tu propia aventura.";
	public static final String NARRATIVA_INICIAL = "Despiertas en una tierra desconocida solamente con un bolso y un poco de pociones...";
	public static final String NECROLIMBO = "\nCruzas colinas azotadas por el viento y bosques marchitos. El \n"
			+ "crujido de las ramas rotas y los graznidos a lo lejos te recuerdan \n"
			+ "que podrias ser la presa.";
	public static final String LIURNIA = "\nAvanzas con el agua estancada hasta las rodillas bajo \n"
			+ "una niebla perpetua.";
	public static final String LEYNDEL_INICIO = "\nCaminas sobre cenizas calientes entre las ruinas de la \n"
			+ "ciudad que alguna vez fue dorada. El silencio es absoluto, opresivo... \n"
			+ "interrumpido solo por el eco de tus propios pasos.";
	public static final String LEYNDEL_FINAL = "\nCaminas entre las ruinas calcinadas de Leyndel. El aire\n"
			+ "sigue pesado, pero la presencia del ala negra finalmente\n"
			+ "ha desaparecido. Solo queda ceniza.";
	public static final String TIENDA = "\nUn viejo comerciante observa al protagonista desde detrás de un mostrador lleno \n"
			+ "de objetos extraños.\nTe dice: Bienvenido extraño... tengo cosas extrañas a la venta...\n";
	public static final String DERROTA = "\nTe has despertado muy lejos del area de batalla en la que estabas, por alguna\n"
			+ "razon te sientes recuperado, aun después de haber sido destruido en ese combate.";
	public static final String SEPHIROT_DERROTADO = "Las alas del Angel se desvanecen, este es\nel fin de la ambición de Sephirot";
	
	//INTRODUCCION DEL PROTAGONISTA
	public String introducirProtagonista(Protagonista protagonista) {
		return protagonista.getNombre() + ", el Héroe de esta historia, es un " + protagonista.getClase() + " que ha despertado una vez más \n"
										+ "mientras antiguas rutas vuelven a abrirse y las criaturas regresan.";
	}
	//INTRODUCCION DEL COMBATE DEPENDIENDO DEL ENEMIGO
	public String introduccionCombate(Enemigo enemigo) {
		return enemigo.getTextoEntrada();
	}
	//NARRACIONES DEL PROTAGONISTA DURANTE EL COMBATE
	public String protaAciertaGolpe(Protagonista prota) {
		return "\n" + prota.getNombre() + " ataca.";
	}
	public String protaAciertaAtaquePotenciado(Protagonista prota) {
		return "\n" + prota.getNombre() + " se concentra y gracias a su habilidad lanza un ataque poderoso.";
	}
	public String protaFallaGolpe(Protagonista prota) {
		return "\n" + prota.getNombre() + " intenta atacar, pero falla.";
	}
	public String protaFallaGolpePotenciado(Protagonista prota) {
		return "\n" + prota.getNombre() + " se concentra, pero no lo suficiente.";
	}
	public String protaSeDefiende(Protagonista prota) {
		return "\n" + prota.getNombre() + " se pone en guardia y se prepara para recibir el siquiente ataque";
	}
	//NARRACIONES DEL ENEMIGO DURANTE EL COMBATE
	public String enemigoAciertaGolpe(Enemigo enemigo) {
		return enemigo.getNombre() + " utiliza " + enemigo.getNombreDeAtaque();
	}
	public String enemigoFallaGolpe(Enemigo enemigo) {
		return enemigo.getNombre() + " intenta atacar, pero falla.";
	}
	//USO DE ITEMS DURANTE EL COMBATE
	public String usaItemVida(Protagonista prota) {
		return "\n" + prota.getNombre() + " se toma una poción y recupera salud.";
	}
	public String usaItemAtaque(Protagonista prota) {
		return "\n" + prota.getNombre() + " se tome una poción que aumenta su ataque temporalmente.";
	}
	public String usaItemDefensa(Protagonista prota) {
		return "\n" + prota.getNombre() + " se toma una poción que aumenta su defensa temporalmente.";
	}
	public String usaItemIntercambio(Protagonista prota, Enemigo enemigo) {
		return "\n" + prota.getNombre() + " se toma una pocion e intercambia sus puntos de vida con " 
				+ enemigo.getNombre();
	}
	public String usaHechizoFuego(Protagonista prota, Enemigo enemigo) {
		return "\n" + prota.getNombre() + " lee un pergamino y " + enemigo.getNombre()
				+ " empieza a arder en fuego, luego el pergamino se convierte en cenizas";
	}
	public String usaHechizoRayo(Protagonista prota, Enemigo enemigo) {
		return "\n" + prota.getNombre() + " lee un pergamino y a " + enemigo.getNombre() + " le cae un poderoso rayo del cielo, mientras que \nun destello ilumina el campo de batalla y el pergamino desaparece. ";
	}
	//NARRACIONES AL EXPLORAR MAPAS
	public String exploracion(Mapa mapa) {
		if (mapa.getNombre().equals(Mapa.NECROLIMBO)) {
			return NECROLIMBO;
		}
		if (mapa.getNombre().equals(Mapa.LIURNIA)) {
			return LIURNIA;
		}
		if (mapa.getNombre().equals(Mapa.LEYNDEL)) {
			if (Enemigo.sephirothDerrotado) {
				return LEYNDEL_FINAL;
			}
			return LEYNDEL_INICIO;
		}
		return "";
	}
	
	//MENSAJES DESPUES DEL COMBATE DEPENDIENDO DEL ACUMULADOR DE DERROTAS
	public String mensajesDerrotas(Protagonista protagonista) {
		String mensaje = "...";
		
		if (protagonista.getDerrotas() <= 3) {
	        mensaje = "La tierra absorbe tu sangre una vez más. Las fuerzas de este mundo no tienen piedad.";
	    } else if (protagonista.getDerrotas() <= 7) {
	        mensaje = "Tu cuerpo está marcado por cicatrices. Empiezas a dudar si saldrás vivo de aquí.";
	    } else if (protagonista.getDerrotas() <= 12) {
	        mensaje = "La muerte ya es una vieja amiga.";
	    }
		return mensaje;
	}
	//MENSAJES DESPUES DEL COMBATE DEPENDIENDO DEL ACUMULADOR DE VICTORIAS
	public String mensajesProgreso(Protagonista protagonista) {
		String mensaje = "...";

	    if (protagonista.getNivel() >= 8) {
	        if (!Enemigo.sephirothDerrotado) {
	            mensaje = "La antigua gran ciudad se dejo ver y sus cenizas caen sobre tus pies. Sientes una presión divina y un par"
	                    + "\nde ojos fríos observándote desde el cielo. Él te espera.";
	        } else {
	            mensaje = "Recuerdas que ya no hay deidad a la que temer, pero\n"
	            		+ "las cenizas aun te queman los pies...";
	        }
	    }

	    else if (protagonista.getVictorias() >= 12) {
	        mensaje = "Te has convertido en una pesadilla para las bestias. Tu nombre"
	                + "\nresuena con fuerza entre la neblina.";
	    }

	    else if (protagonista.getVictorias() == 6 && protagonista.getNivel() >= 4) {
	        mensaje = "Has purgado Necrolimbo. El aire denso de los pantanos de Liurnia te da la bienvenida... "
	                + "\nes el inicio de un nuevo reto.";
	    }

	    else if (protagonista.getVictorias() >= 2) {
	        mensaje = "Los monstruos menores empiezan a temerte. Tu espada se siente un poco más ligera.";
	    }

	    return mensaje;
	}
}
