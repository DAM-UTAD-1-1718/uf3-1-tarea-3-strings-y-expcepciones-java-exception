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
		//Mientras no se hayan introducido 5 n�meros, se seguir� pidiendo uno y comprobando que es num�rico. As� se consigue que el m�todo no termine con la excepci�n, sino que siga pidi�ndolos.
		while (numArray.size() < 5) {
			try {
		//Utilizamos el parseInt para que suceda nuestra excepci�n en lugar de que el m�todo de un programa por InputMismatch
					numArray.add(Integer.parseInt(in.next()));
			} catch (NumberFormatException e) {
				System.out.println("Se han introducido caracteres no num�ricos. Introduzca un n�mero.");
			}
		}
		//F�rmula en Java 8 para realizar la sumatoria de un ArrayList
		resultado = numArray.stream().mapToInt(Integer::intValue).sum();
		System.out.println("El resultado de la suma es: " + resultado);
		return resultado;
	}
}
