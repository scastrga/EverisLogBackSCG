package com.everis.practicaLogback;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	/**
	 * Metodo For
	 */
	private static void bucleFor() {
		LOGGER.info("INICIO TRAZA || METODO BUCLE FOR");
		for (int i = 0; i <= 5000; i++) {
			// LOGGER PARA MOSTRAR LAS ITERACIONES
			LOGGER.debug("Num iter {}", i);
		}
		LOGGER.info("FIN TRAZA || METODO BUCLEFOR()");
	}

	/**
	 * Metodo para introducir un numero
	 * 
	 * @return
	 */
	private static int num() {
		LOGGER.info("INICIO TRAZA || METODO NUM()");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca Numero");
		int numTec = sc.nextInt();
		LOGGER.info("FIN TRAZA || METODO NUM()");
		return numTec;
	}

	/**
	 * Metodo para saber si puedes beber
	 */
	private static void canIdrink() throws Exception {
		LOGGER.info("INICIO TRAZA || METODO CANIDRINK()");
		
		/**
		 * Mostrar mensaje para que el usuario indique su edad
		 */
		
		System.out.println("Que edad tienes?");
		
		/**
		 * try catch por si el usuario introduce un numero demasiado grande
		 */
		
		try {
			
			/**
			 * Variable que recoge el numero introducido por el usuario
			 */
			
			int numInt = num();
			
			/**
			 * if para hacer comprobaciones de edad
			 */
			
			if (numInt >= 18 && numInt < 1000) {
				System.out.println("Puedes Beber crack");
				LOGGER.debug("num es mayor que 18");
			} else if (numInt > 1000) {
				System.out.println("No puedes beber, sry");
				throw new Exception("No puedes beber con mas de 1000 años");
			} else {
				System.out.println("No puedes beber, sry");
			}

		} catch (Exception e) {
			LOGGER.error("El numero pasa el limte de edad");
		}

		LOGGER.info("FIN TRAZA || METODO CANIDRINK()");
	}

	final static Logger LOGGER = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) throws Exception {

		LOGGER.info("INICIO TRAZA || MAIN");

		bucleFor();
		canIdrink();

		LOGGER.info("FIN TRAZA || MAIN");

	}
}
