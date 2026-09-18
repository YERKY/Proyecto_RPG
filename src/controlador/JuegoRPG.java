//AARON ARIAS MONTERO C6C760
//JUAN DIEGO CHACON C6E200
package controlador;

import modelo.Bolsa;
import modelo.Cofre;
import modelo.Combate;
import modelo.Enemigo;
import modelo.Generador;
import modelo.Item;
import modelo.Mapa;
import modelo.Narrador;
import modelo.Protagonista;
import modelo.RuedaDelDestino;
import modelo.Tienda;
import vista.terminal.Escritor;
import vista.terminal.Lector;

public class JuegoRPG {
	
	public static final int EXPLORAR_MAPA = 1;
	public static final int VER_PROTAGONISTA = 2;
	public static final int VER_BOLSO = 3;
	public static final int VER_TIENDA = 4;
	public static final int SALIR_JUEGO = 5;

	public static final int ATACAR = 1;
	public static final int ATACAR_POTENCIA = 2;
	public static final int DEFENDERSE = 3;
	public static final int USAR_ITEM = 4;
	public static final int HUIR = 5;
	
	public static final int COMPRAR_ITEM = 1;
	public static final int VENDER_ITEM = 2;
	public static final int SALIR_TIENDA = 3;

	public void iniciarJuego() {
		// DECLARAR
		Escritor escritor;
		Lector lector;
		Protagonista protagonista;
		Generador generador;
		Mapa mapa;
		Narrador narrador;
		RuedaDelDestino ruleta;
		Tienda pulperia;
		Cofre cofre;
		

		// INICIALIZAR
		escritor = new Escritor();
		lector = new Lector();
		protagonista = new Protagonista();
		generador = new Generador();
		mapa = new Mapa();
		narrador = new Narrador();
		ruleta = new RuedaDelDestino();
		pulperia = new Tienda(100, 100, 100, 100, 100, 100);
		cofre = new Cofre();

		//INTRODUCCION
		escritor.escribir(Narrador.INTRODUCCION + Narrador.LEMA);
		// CREACION DE PERSONAJE
		escritor.escribir("\n----CREA TU PERSONAJE----");

		String nombre = lector.leerString("Escribe tu nombre: ");
		int decisionPersonaje = 0;

		while (decisionPersonaje < 1 || decisionPersonaje > 2) {
			decisionPersonaje = lector.leerInt("\n1. Crear personaje aleatorio\n" 
											 + "2. Editar tu propio personaje\n" 
											 + "Seleccione una opcion: ");

			if (decisionPersonaje < 1 || decisionPersonaje > 2) {
				escritor.escribir("\nEso no es una opcion, intente de nuevo:\n");
			}
		}

		switch (decisionPersonaje) {
		case 1:
			//SE GENERA UNO ALEATORIO
			protagonista = generador.generarProtagonista(nombre, ruleta);
			escritor.escribir("\nTu clase es: " + protagonista.getClase());
			break;

		case 2:
			// ELECCION DE ESTADISTICAS
			int vida = 0;
			int ataque = 0;
			int defensa = 0;
			int habilidad = 0;
			int inteligencia = 0;

			while (vida < 1 || vida > 20) {
				vida = lector.leerInt("\nindique la estadistica de vida que desea (1-20): ");

				if (vida < 1 || vida > 20) {
					escritor.escribir("\nNo es un valor permitido, escribalo de nuevo: ");
				}
			}
			while (ataque < 1 || ataque > 4) {
				ataque = lector.leerInt("indique la estadistica de ataque que desea (1-4): ");

				if (ataque < 1 || ataque > 4) {
					escritor.escribir("\nNo es un valor permitido, escribalo de nuevo: ");
				}
			}
			while (defensa < 1 || defensa > 4) {
				defensa = lector.leerInt("indique la estadistica de defensa que desea (1-4): ");

				if (defensa < 1 || defensa > 4) {
					escritor.escribir("\nNo es un valor permitido, escribalo de nuevo: ");
				}
			}
			while (habilidad < 1 || habilidad > 4) {
				habilidad = lector.leerInt("indique la estadistica de habilidad que desea (1-4): ");

				if (habilidad < 1 || habilidad > 4) {
					escritor.escribir("\nNo es un valor permitido, escribalo de nuevo: ");
				}
			}
			while (inteligencia < 1 || inteligencia > 4) {
				inteligencia = lector.leerInt("indique la estadistica de inteligencia que desea (1-4): ");

				if (inteligencia < 1 || inteligencia > 4) {
					escritor.escribir("\nNo es un valor permitido, escribalo de nuevo: ");
				}
			}

			protagonista = new Protagonista(nombre, "Guerrero", vida, ataque, defensa, habilidad, inteligencia,
											new Bolsa(1, 1, 1, 1, 1, 1), vida);

			break;

		default:
			escritor.escribir("opcion invalida");
			break;
		}
		// INICIO DEL JUEGO (MENU PRINCIPAL)
		boolean salirDelJuego = false;

		escritor.escribir("\n" + narrador.introducirProtagonista(protagonista));

		while (!salirDelJuego) {
			int opcionMenuPrincipal = 0;

			while (opcionMenuPrincipal < 1 || opcionMenuPrincipal > 5) {
				opcionMenuPrincipal = lector.leerInt("\n----DECIDE TU SIGUIENTE MOVIMIENTO----\n" 
												   + "1. Explorar Mapa\n" 
												   + "2. Ver protagonista\n"
												   + "3. Ver bolso\n" 
												   + "4. Tienda\n" 
												   + "5. Salir\n" 
												   + "Seleccione una opcion: ");

				if (opcionMenuPrincipal < 1 || opcionMenuPrincipal > 5) {
					escritor.escribir("\nNo es una opcion valida, intentelo de nuevo: ");
				}
			}

			switch (opcionMenuPrincipal) {
			case EXPLORAR_MAPA:
				// DECIDE EXPLORAR MAPAS
				int eleccionDeMapa = 0;

				while (eleccionDeMapa < 1 || eleccionDeMapa > 3) {
					eleccionDeMapa = lector.leerInt("\n----EXPLORACION DE MAPAS----" 
												  + "\n1. " + Mapa.NECROLIMBO 
												  + "\n2. "+ Mapa.LIURNIA 
												  + "\n3. " + Mapa.LEYNDEL 
												  + "\nSeleccione un mapa para explorar: ");

					if (eleccionDeMapa < 1 || eleccionDeMapa > 3) {
						escritor.escribir("\nNo es una opcion valida, intentelo de nuevo: ");
					}
				}

				switch (eleccionDeMapa) {
				case 1:
					mapa = new Mapa(Mapa.NECROLIMBO, Mapa.NECROLIMBO_DESCRIPCION, "Facil");
					break;
				case 2:
					mapa = new Mapa(Mapa.LIURNIA, Mapa.LIURNIA_DESCRIPCION, "Medio");
					break;
				case 3:
					mapa = new Mapa(Mapa.LEYNDEL, Mapa.LEYNDEL_DESCRIPCION, "Dificil");
					break;
				default:
					mapa = new Mapa();
					break;
				}
				// VALORAR SI TIENE NIVEL SUFICIENTE PARA ENTRAR A LOS MAPAS
				if ((mapa.getNombre().equals(Mapa.LIURNIA) && protagonista.getNivel() < 4)) {
					escritor.escribir("\nNecesitas ser nivel 4 para explorar esta zona");
				} else if (mapa.getNombre().equals(Mapa.LEYNDEL) && protagonista.getNivel() < 8) {
					escritor.escribir("\nNecesitas ser nivel 8 para explorar esta zona");
				} else {
					// INICIO DE LA EXPLORACION
					escritor.escribir("\nMapa: " + mapa.getNombre() 
									+ "\nDescripcion: " + mapa.getDescripcion()
									+ "\nDificultad: " + mapa.getDificultad());

					escritor.escribir(narrador.exploracion(mapa));

					int aleatorio = ruleta.girar(1, 100);

					if (aleatorio < 50) {
						// INICIO DE COMBATE
						Combate encuentro = mapa.generarEncuentro(protagonista);

						boolean huye = false;
						int opcionCombate = 0;
						boolean protaAcierta;
						boolean enemigoAcierta;

						escritor.escribir("\n" + narrador.introduccionCombate(encuentro.getEnemigo()));
						escritor.escribir("\n----- UN NUEVO COMBATE HA INICIADO -----");

						while (!encuentro.combateTerminado() && !huye) {
							opcionCombate = 0;

							while (opcionCombate < 1 || opcionCombate > 5) {
								opcionCombate = lector.leerInt("\n----- TOMA UNA DECISION -----" 
															 + "\n1. Atacar"
															 + "\n2. Potenciar Ataque" 
															 + "\n3. Defenderse" 
															 + "\n4. Usar Item" 
															 + "\n5. Huir"
															 + "\nSeleccione una opción: ");
								if (opcionCombate < 1 || opcionCombate > 5) {
									escritor.escribir("\nEso no es una opcion, Intente de nuevo:");
								}
							}

							switch (opcionCombate) {
							case ATACAR:
								protaAcierta = encuentro.protagonistaAtaca(ruleta);

								if (protaAcierta) {
									escritor.escribir(narrador.protaAciertaGolpe(protagonista));
									escritor.escribir("Vitalidad del enemigo: " + encuentro.getEnemigo().getVida());
								} else {
									escritor.escribir(narrador.protaFallaGolpe(protagonista));
								}

								if (!encuentro.combateTerminado()) {
									enemigoAcierta = encuentro.enemigoAtaca(ruleta);

									if (enemigoAcierta) {
										escritor.escribir(narrador.enemigoAciertaGolpe(encuentro.getEnemigo()));
										escritor.escribir("Vitalidad de " + encuentro.getProtagonista().getNombre()
												+ ": " + encuentro.getProtagonista().getVida());
									} else {
										escritor.escribir(narrador.enemigoFallaGolpe(encuentro.getEnemigo()));
									}

								}
								break;

							case ATACAR_POTENCIA:
								protaAcierta = encuentro.protagonistaAtacaConPotencia(ruleta);

								if (protaAcierta) {
									escritor.escribir(narrador.protaAciertaAtaquePotenciado(protagonista));
									escritor.escribir("Vitalidad del enemigo: " + encuentro.getEnemigo().getVida());
								} else {
									escritor.escribir(narrador.protaFallaGolpePotenciado(protagonista));
								}

								if (!encuentro.combateTerminado()) {
									enemigoAcierta = encuentro.enemigoAtaca(ruleta);

									if (enemigoAcierta) {
										escritor.escribir(narrador.enemigoAciertaGolpe(encuentro.getEnemigo()));
										escritor.escribir("Vitalidad de " + protagonista.getNombre() + ": "
												+ protagonista.getVida());
									} else {
										escritor.escribir(narrador.enemigoFallaGolpe(encuentro.getEnemigo()));
									}
								}
								break;

							case DEFENDERSE:
								encuentro.protagonistaDefenderse();
								escritor.escribir(narrador.protaSeDefiende(protagonista));

								if (!encuentro.combateTerminado()) {
									enemigoAcierta = encuentro.enemigoAtaca(ruleta);

									if (enemigoAcierta) {
										escritor.escribir(narrador.enemigoAciertaGolpe(encuentro.getEnemigo()));
										escritor.escribir("Vitalidad de " + protagonista.getNombre() + ": "
												+ protagonista.getVida());
									} else {
										escritor.escribir(narrador.enemigoFallaGolpe(encuentro.getEnemigo()));
									}
								}
								break;

							case USAR_ITEM:
								escritor.escribir("\n--INVENTARIO--\n" 
												+ "1. Pociones de vida: " + protagonista.getBolso().getCantidadPocionesVitalidad() 
												+ "\n2. Pociones de ataque: " + protagonista.getBolso().getCantidadPocionesAtaque()
												+ "\n3. Pociones de defensa: " + protagonista.getBolso().getCantidadPocionesDefensa()
												+ "\n4. Pociones de intercambio: " + protagonista.getBolso().getCantidadPocionesIntercambio()
												+ "\n5. Hechizos de Fuego: " + protagonista.getBolso().getCantidadHechizosFuego()
												+ "\n6. Hechizos de Rayo: " + protagonista.getBolso().getCantidadHechizosRayo());
								
								int pocionEnCombate = 0;

								while (pocionEnCombate < 1 || pocionEnCombate > 6) {
									pocionEnCombate = lector.leerInt("Seleccione el item que desea usar: ");

									if (pocionEnCombate < 1 || pocionEnCombate > 6) {
										escritor.escribir("\nEso no es una opcion, Intente de nuevo:");
									}
								}

								switch (pocionEnCombate) {
								case 1:
									if (protagonista.getBolso().tienePocionVitalidad()) {
										encuentro.protagonistaUsaItem(Item.POCION_VITALIDAD);
										escritor.escribir(narrador.usaItemVida(protagonista));
										escritor.escribir("Vitalidad de " + protagonista.getNombre() + ": " + protagonista.getVida());
									} else {
										escritor.escribir("\nNo tienes este item en tu bolso");
									}
									break;
								case 2:
									if (protagonista.getBolso().tienePocionAtaque()) {
										encuentro.protagonistaUsaItem(Item.POCION_ATAQUE);
										escritor.escribir(narrador.usaItemAtaque(protagonista));
									} else {
										escritor.escribir("\nNo tienes este item en tu bolso");
									}
									break;
								case 3:
									if (protagonista.getBolso().tienePocionDefensa()) {
										encuentro.protagonistaUsaItem(Item.POCION_DEFENSA);
										escritor.escribir(narrador.usaItemDefensa(protagonista));
									} else {
										escritor.escribir("\nNo tienes este item en tu bolso");
									}
									
									break;
								case 4:
									if (protagonista.getBolso().tienePocionIntercambio()) {
										encuentro.protagonistaUsaItem(Item.POCION_INTERCAMBIO);
										escritor.escribir(narrador.usaItemIntercambio(protagonista, encuentro.getEnemigo()));
										escritor.escribir("Vitalidad de " + protagonista.getNombre() + ": " + protagonista.getVida()
														+ "\nVitalidad de " + encuentro.getEnemigo().getNombre() + ": "
														+ encuentro.getEnemigo().getVida());
									} else {
										escritor.escribir("\nNo tienes este item en tu bolso");
									}
									
									break;
								case 5:
									if (protagonista.getBolso().tieneHechizoFuego()) {
										encuentro.protagonistaUsaItem(Item.HECHIZO_FUEGO);
										escritor.escribir(narrador.usaHechizoFuego(protagonista, encuentro.getEnemigo()));
										escritor.escribir("Vitalidad del enemigo: " + encuentro.getEnemigo().getVida());
									} else {
										escritor.escribir("\nNo tienes este item en tu bolso");
									}
									
									break;
								case 6:
									if (protagonista.getBolso().tieneHechizoRayo()) {
										encuentro.protagonistaUsaItem(Item.HECHIZO_RAYO);
										escritor.escribir(narrador.usaHechizoRayo(protagonista, encuentro.getEnemigo()));
										escritor.escribir("Vitalidad del enemigo: " + encuentro.getEnemigo().getVida());
									} else {
										escritor.escribir("\nNo tienes este item en tu bolso");
									}
									
									break;
								default:
									escritor.escribir("\nElija una opcion válida.");
									break;
								}

								if (!encuentro.combateTerminado()) {
									enemigoAcierta = encuentro.enemigoAtaca(ruleta);

									if (enemigoAcierta) {
										escritor.escribir(narrador.enemigoAciertaGolpe(encuentro.getEnemigo()));
										escritor.escribir("Vitalidad de " + protagonista.getNombre() + ": "
												+ protagonista.getVida());
									} else {
										escritor.escribir(narrador.enemigoFallaGolpe(encuentro.getEnemigo()));
									}
								}

								break;

							case HUIR:
								huye = encuentro.protagonistaHuye(ruleta);

								if (huye) {
									escritor.escribir("\n" + protagonista.getNombre() + " ha huido del combate.");
								} else {
									escritor.escribir("\n" + protagonista.getNombre() + " ha fallado en escapar");
									if (!encuentro.combateTerminado()) {
										enemigoAcierta = encuentro.enemigoAtaca(ruleta);

										if (enemigoAcierta) {
											escritor.escribir(narrador.enemigoAciertaGolpe(encuentro.getEnemigo()));
											escritor.escribir("Vitalidad de " + protagonista.getNombre() + ": " + protagonista.getVida());
										} else {
											escritor.escribir(narrador.enemigoFallaGolpe(encuentro.getEnemigo()));
										}
									}
								}

								break;
							}

						}
						// SALIDAS/INSTRUCCIONES FINALES DEL COMBATE
						if (encuentro.getEnemigo().estaDerrotado()) {
							escritor.escribir("\n" + protagonista.getNombre() + " ha obtenido la victoria");
							protagonista.ganar();
							protagonista.ganarDinero(ruleta.girar(30, 70));
							protagonista.aumentarNivel();
							
							if (encuentro.getEnemigo().getNombre().equals(Enemigo.SEPHIROTH)) {
								Enemigo.sephirothDerrotado = true;
								protagonista.setProgreso(protagonista.getProgreso() + 10);
								escritor.escribir("\n" + Narrador.SEPHIROT_DERROTADO);
							}

							escritor.escribir("\n" + narrador.mensajesProgreso(protagonista));

						}

						if (encuentro.getProtagonista().estaDerrotado()) {
							escritor.escribir("\n" + protagonista.getNombre() + " ha sido derrotado.");
							protagonista.gastarDinero(ruleta.girar(10, 30));
							protagonista.perder();

						}

						protagonista.restaurarVitalidad();
						protagonista.quitarAumentos();

						escritor.escribir("\nEL COMBATE HA TERMINADO...");
						if (protagonista.estaDerrotado()) {
							escritor.escribir("\n" + narrador.mensajesDerrotas(protagonista) + Narrador.DERROTA);
						}
						//FIN DEL COMBATE
					} else {
						// ENCUENTRA UN COFRE
						String itemEncontrado = "";
						if (ruleta.girar(1, 100) > 70) {
							itemEncontrado = cofre.generarItem(ruleta);
							protagonista.getBolso().almacenarItem(itemEncontrado);
							escritor.escribir("\nHas tropezado con un cofre en medio del camino, lo abres y\n"
									+ "encuentras " + itemEncontrado + ", procedes a guardarlo en tu bolso.");
						} else {
							itemEncontrado = cofre.generarArma(protagonista, ruleta);
							escritor.escribir("\nHas tropezado con un cofre en medio del camino, lo abres y\n"
											+ "encuentras " + itemEncontrado);

							int decisionArmaEncontrada = 0;
							
							while (decisionArmaEncontrada < 1 || decisionArmaEncontrada > 2) {
								decisionArmaEncontrada = lector.leerInt("\nDeseas cambiar esta arma por la que ya tienes equipada?\n"
																	  + "1. Si\n"
																	  + "2. No\n"
																	  + "Toma una desicion: ");

								if (decisionArmaEncontrada < 1 || decisionArmaEncontrada > 2) {
									escritor.escribir("\nNo es una opcion valida, intentelo de nuevo: ");
								}
							}
							if (decisionArmaEncontrada == 1) {
								protagonista.equiparArma(itemEncontrado);
								escritor.escribir("\nHas equipado " + itemEncontrado);
							} else {
								escritor.escribir("\nDejas el arma en su lugar y sigues tu camino.");
							}

						}

					}
				}

				break;
			case VER_PROTAGONISTA:
				// MOSTRAR ESTADISTICAS DEL PERSONAJE
				escritor.escribir(protagonista.mostrarPersonaje());
				break;
			case VER_BOLSO:
				// MOSTRAR ITEMS DEL BOLSO
				escritor.escribir("\n---TU BOLSO---\n" 
								+ "1. Pociones de vida: " + protagonista.getBolso().getCantidadPocionesVitalidad() 
								+ "\n2. Pociones de ataque: " + protagonista.getBolso().getCantidadPocionesAtaque()
								+ "\n3. Pociones de defensa: " + protagonista.getBolso().getCantidadPocionesDefensa()
								+ "\n4. Pociones de intercambio: " + protagonista.getBolso().getCantidadPocionesIntercambio()
								+ "\n5. Hechizos de Fuego: " + protagonista.getBolso().getCantidadHechizosFuego()
								+ "\n6. Hechizos de Rayo: " + protagonista.getBolso().getCantidadHechizosRayo() + "\n");
				break;
			case VER_TIENDA:
				// ENTRAR A LA TIENDA
				boolean salirTienda = false;
				escritor.escribir("\n----PULPERIA----\n" + Narrador.TIENDA);

				while (!salirTienda) {
					int eleccionEnTienda = 0;

					while (eleccionEnTienda < 1 || eleccionEnTienda > 3) {
						eleccionEnTienda = lector.leerInt("\n1. Comprar Item\n" 
														+ "2. Vender Item\n" 
														+ "3. Salir\n" 
														+ "Seleccione una opcion: ");

						if (eleccionEnTienda < 1 || eleccionEnTienda > 3) {
							escritor.escribir("\nNo es una opcion valida, intentelo de nuevo: ");
						}
					}

					switch (eleccionEnTienda) {
					case COMPRAR_ITEM:
						//USUARIO QUIERE COMPRAR UN ITEM
						int itemElegido = 0;

						while (itemElegido < 1 || itemElegido > 6) {
							itemElegido = lector.leerInt("\nITEMS DISPONIBLES:\n" 
													   + "1. Pociones de vida: " + pulperia.getCantidadPocionesVitalidad() + " (" + Item.PRECIO_POCION_VITALIDAD + " Rupias)"
													   + "\n2. Pociones de ataque: " + pulperia.getCantidadPocionesAtaque() + " (" + Item.PRECIO_POCION_ATAQUE + " Rupias)"
													   + "\n3. Pociones de defensa: " + pulperia.getCantidadPocionesDefensa() + " (" + Item.PRECIO_POCION_DEFENSA + " Rupias)"
													   + "\n4. Pociones de intercambio: " + pulperia.getCantidadPocionesIntercambio() + " (" + Item.PRECIO_POCION_INTERCAMBIO + " Rupias)"
													   + "\n5. Hechizos de Fuego: " + pulperia.getCantidadHechizosFuego() + " (" + Item.PRECIO_HECHIZO_FUEGO + " Rupias)"
													   + "\n6. Hechizos de Rayo: " + pulperia.getCantidadHechizosRayo() + " (" + Item.PRECIO_HECHIZO_RAYO + " Rupias)" + "\n"
													   + "\n[Dinero disponible: " + protagonista.getDinero() + " Rupias]\n\n"
													   + "Selecciona el que quieras comprar: ");

							if (itemElegido < 1 || itemElegido > 6) {
								escritor.escribir("No es una opcion valida, intentelo de nuevo: ");
							}
						}

						switch (itemElegido) {
						case 1:
							if ((protagonista.getDinero() < Item.PRECIO_POCION_VITALIDAD) || !pulperia.tienePocionVitalidad()) {
								escritor.escribir("\nLa tienda no tiene este item disponible o no tienes dinero suficiente.\n");
							} else {
								protagonista.getBolso().almacenarItem(pulperia.comprarItem(protagonista, Item.POCION_VITALIDAD));
								escritor.escribir("\nCompraste una pocion de vitalidad a " + Item.PRECIO_POCION_VITALIDAD + " Rupias");
								escritor.escribir("Dinero actual: " + protagonista.getDinero() + " Rupias");
							}
							break;
						case 2:
							if ((protagonista.getDinero() < Item.PRECIO_POCION_ATAQUE) || !pulperia.tienePocionAtaque()) {
								escritor.escribir("\nLa tienda no tiene este item disponible o no tienes dinero suficiente.\n");
							} else {
								protagonista.getBolso()
										.almacenarItem(pulperia.comprarItem(protagonista, Item.POCION_ATAQUE));
								escritor.escribir("\nCompraste una pocion de ataque a " + Item.PRECIO_POCION_ATAQUE + " Rupias");
								escritor.escribir("Dinero actual: " + protagonista.getDinero() + " Rupias");
							}
							break;
						case 3:
							if ((protagonista.getDinero() < Item.PRECIO_POCION_DEFENSA) || !pulperia.tienePocionDefensa()) {
								escritor.escribir("\nLa tienda no tiene este item disponible o no tienes dinero suficiente.\n");
							} else {
								protagonista.getBolso()
										.almacenarItem(pulperia.comprarItem(protagonista, Item.POCION_DEFENSA));
								escritor.escribir("\nCompraste una pocion de defensa a " + Item.PRECIO_POCION_DEFENSA
												+ " Rupias");
								escritor.escribir("Dinero actual: " + protagonista.getDinero() + " Rupias");
							}
							break;
						case 4:
							if ((protagonista.getDinero() < Item.PRECIO_POCION_INTERCAMBIO) || !pulperia.tienePocionIntercambio()) {
								escritor.escribir("\nLa tienda no tiene este item disponible o no tienes dinero suficiente.\n");
							} else {
								protagonista.getBolso().almacenarItem(pulperia.comprarItem(protagonista, Item.POCION_INTERCAMBIO));
								escritor.escribir("\nCompraste una pocion de intercambio a " + Item.PRECIO_POCION_INTERCAMBIO + " Rupias");
								escritor.escribir("Dinero actual: " + protagonista.getDinero() + " Rupias");
							}
							break;
						case 5:
							if ((protagonista.getDinero() < Item.PRECIO_HECHIZO_FUEGO) || !pulperia.tieneHechizoFuego()) {
								escritor.escribir("\nLa tienda no tiene este item disponible o no tienes dinero suficiente.\n");
							} else {
								protagonista.getBolso().almacenarItem(pulperia.comprarItem(protagonista, Item.HECHIZO_FUEGO));
								escritor.escribir("\nCompraste un hechizo de fuego a " + Item.PRECIO_HECHIZO_FUEGO + " Rupias");
								escritor.escribir("Dinero actual: " + protagonista.getDinero() + " Rupias");
							}
							break;
						case 6:
							if ((protagonista.getDinero() < Item.PRECIO_HECHIZO_RAYO) || !pulperia.tieneHechizoRayo()) {
								escritor.escribir("\nLa tienda no tiene este item disponible o no tienes dinero suficiente.\n");
							} else {
								protagonista.getBolso().almacenarItem(pulperia.comprarItem(protagonista, Item.HECHIZO_RAYO));
								escritor.escribir("\nCompraste un hechizo de rayo a " + Item.PRECIO_HECHIZO_RAYO + " Rupias");
								escritor.escribir("Dinero actual: " + protagonista.getDinero() + " Rupias");
							}
							break;
						default:
							escritor.escribir("opcion invalida");
							break;
						}

						break;
					case VENDER_ITEM:
						// QUIERE VENDER UN ITEM A LA TIENDA
						int itemSeleccionado = 0;

						while (itemSeleccionado < 1 || itemSeleccionado > 6) {
							itemSeleccionado = lector.leerInt("\nITEMS DISPONIBLES EN TU BOLSO:\n" 
															+ "1. Pociones de vida: " + protagonista.getBolso().getCantidadPocionesVitalidad() 
															+ "\n2. Pociones de ataque: " + protagonista.getBolso().getCantidadPocionesAtaque()
															+ "\n3. Pociones de defensa: " + protagonista.getBolso().getCantidadPocionesDefensa()
															+ "\n4. Pociones de intercambio: " + protagonista.getBolso().getCantidadPocionesIntercambio()
															+ "\n5. Hechizos de Fuego: " + protagonista.getBolso().getCantidadHechizosFuego()
															+ "\n6. Hechizos de Rayo: " + protagonista.getBolso().getCantidadHechizosRayo() + "\n"
															+ "Seleccione un item para vender: ");

							if (itemSeleccionado < 1 || itemSeleccionado > 6) {
								escritor.escribir("\nNo es una opcion valida, intentelo de nuevo: ");
							}
						}

						switch (itemSeleccionado) {
						case 1:
							if (!protagonista.getBolso().tienePocionVitalidad()) {
								escritor.escribir("\nNo tienes este item disponible para vender");
							} else {
								pulperia.venderItem(protagonista, Item.POCION_VITALIDAD);
								escritor.escribir("\nSe vendió exitosamente a " + Item.PRECIO_POCION_VITALIDAD
										+ " Rupias.\n" + "Dinero actual: " + protagonista.getDinero());
							}
							break;
						case 2:
							if (!protagonista.getBolso().tienePocionAtaque()) {
								escritor.escribir("\nNo tienes este item disponible para vender");
							} else {
								pulperia.venderItem(protagonista, Item.POCION_ATAQUE);
								escritor.escribir("\nSe vendió exitosamente a " + Item.PRECIO_POCION_ATAQUE
										+ " Rupias.\n" + "Dinero actual: " + protagonista.getDinero());
							}
							break;
						case 3:
							if (!protagonista.getBolso().tienePocionDefensa()) {
								escritor.escribir("\nNo tienes este item disponible para vender");
							} else {
								pulperia.venderItem(protagonista, Item.POCION_DEFENSA);
								escritor.escribir("\nSe vendió exitosamente a " + Item.PRECIO_POCION_DEFENSA
										+ " Rupias.\n" + "Dinero actual: " + protagonista.getDinero());
							}
							break;
						case 4:
							if (!protagonista.getBolso().tienePocionIntercambio()) {
								escritor.escribir("\nNo tienes este item disponible para vender");
							} else {
								pulperia.venderItem(protagonista, Item.POCION_INTERCAMBIO);
								escritor.escribir("\nSe vendió exitosamente a " + Item.PRECIO_POCION_INTERCAMBIO
										+ " Rupias.\n" + "Dinero actual: " + protagonista.getDinero());
							}
							break;
						case 5:
							if (!protagonista.getBolso().tieneHechizoFuego()) {
								escritor.escribir("\nNo tienes este item disponible para vender");
							} else {
								pulperia.venderItem(protagonista, Item.HECHIZO_FUEGO);
								escritor.escribir("\nSe vendió exitosamente a " + Item.PRECIO_HECHIZO_FUEGO
										+ " Rupias.\n" + "Dinero actual: " + protagonista.getDinero());
							}
							break;
						case 6:
							if (!protagonista.getBolso().tieneHechizoRayo()) {
								escritor.escribir("\nNo tienes este item disponible para vender");
							} else {
								pulperia.venderItem(protagonista, Item.HECHIZO_RAYO);
								escritor.escribir("\nSe vendió exitosamente a " + Item.PRECIO_HECHIZO_RAYO
										+ " Rupias.\n" + "Dinero actual: " + protagonista.getDinero());
							}
							break;
						}
						break;
					case SALIR_TIENDA:
						// SALIR DE LA PULPERIA
						salirTienda = true;
						escritor.escribir("\nSaliste de la pulperia");
						break;
					}
				}

				break;
			case SALIR_JUEGO:
				// SALIR DEL JUEGO
				if (!Enemigo.sephirothDerrotado) {
					escritor.escribir("\nDecidiste no seguir luchando mas...");
				} else {
					escritor.escribir("\nDescansas tranquilo, sabiendo que la opresiva amenaza ha sido purgada...");
				}
				salirDelJuego = true;
				break;

			default:
				escritor.escribir("opcion invalida.");
				break;
			}
		}
	}
}