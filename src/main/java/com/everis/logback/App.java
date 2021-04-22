package com.everis.logback;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author scarnero
 *
 */
public class App {

	/**
	 * LOGGER.
	 */
	final static Logger LOGGER = LoggerFactory.getLogger(App.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Bucle que filtra e imprime los números pares.
		 */
		for (int i = 0; i <= 3000; i++) {
			if (i % 2 == 0) {
				LOGGER.warn("Esto se está mostrando en warn, {}", i);
			}
		}

		/**
		 * Bucle que filtra e imprime los números impares.
		 */
		for (int i = 0; i < 3000; i++) {
			if (i % 2 != 0) {
				LOGGER.error("Esto se está mostrando en error, {}", i);
			}
		}

		/**
		 * Creacion ArrayList.
		 */
		List<String> classroom = new ArrayList<String>();

		/**
		 * Se insertan String al ArrayList.
		 */
		classroom.add("Bárbara");
		classroom.add("Cantón");
		classroom.add("Fernando");
		classroom.add("Pablo");
		classroom.add("William");

		/**
		 * Se crea un Iterator.
		 */
		Iterator<String> iter = classroom.iterator();

		/**
		 * Se recorre el Iterator.
		 */
		while (iter.hasNext()) {
			String elem = iter.next();
			LOGGER.info("Esto se está mostrando en info, {}", elem);
		}

	}

}
