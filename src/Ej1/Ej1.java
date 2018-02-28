package Ej1;
/*
 *Creado por Elias Periañez
 *28 feb. 2018
 *Como parte del proyecto Tarea Strings y Excepciones
 *Este archivo esta bajo la licencia de Creative Commons Reconocimiento 4.0 Internacional (Más informacion https://creativecommons.org/licenses/by/4.0/)
____________________________________________________
 *Created by Elias Periañez
 *28 feb. 2018
 *As part of the project Tarea Strings y Excepciones
 *This file is under the Creative Commons Attribution 4.0 International (More info here https://creativecommons.org/licenses/by/4.0/)
 */

public class Ej1 {
	/**
	 * Metodo que suma los numeros en el string ignorando letras espacios o simbolos.
	 * @input Cualquier string indiferentemente de su contenido
	 * @param String que transformara
	 * @return La suma de los numeros en el String
	 */
	public int ej1(String s) {
		int result = 0;
		for(int i = 0; i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				result+=Integer.parseInt(Character.toString(s.charAt(i)));
			}
		}
		return result;
	}
}