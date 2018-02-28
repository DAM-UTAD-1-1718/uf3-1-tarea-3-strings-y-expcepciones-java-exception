/*
 * @author Sara Correas
 * 28 feb. 2018 
 */

package Ej4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Ej4 {

	static int metodoExcepcion() {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		int resultado = 0;
		//Mientras no se hayan introducido 5 números, se seguirá pidiendo uno y comprobando que es numérico. Así se consigue que el método no termine con la excepción, sino que siga pidiéndolos.
		while (numArray.size() < 5) {
			try {
		//Utilizamos el parseInt para que suceda nuestra excepción en lugar de que el método de un error por InputMismatch
					numArray.add(Integer.parseInt(in.next()));
			} catch (NumberFormatException e) {
				System.out.println("Se han introducido caracteres no numéricos. Introduzca un número.");
			}
		}
		//Fórmula en Java 8 para realizar la sumatoria de un ArrayList
		resultado = numArray.stream().mapToInt(Integer::intValue).sum();
		System.out.println("El resultado de la suma es: " + resultado);
		return resultado;
	}
}
