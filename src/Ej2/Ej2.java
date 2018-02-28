package Ej2;
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

public class Ej2 {
	
	/**
	 * Metodo que coloca las mayusculas correctamente, es decir, al principio y detras de cada punto
	 * @param String a transformar
	 * @input Cualquier string indiferentemente de su contenido
	 * @return String con mayusculas colocadas correctamente
	 */
	public String ej2(String s) {
		boolean nextMayus = false;
		String result = "";
		for(int i = 0; i<s.length();i++) {
			if(Character.toString(s.charAt(i)).equals(".")) {
				result+=Character.toString(s.charAt(i));
				nextMayus = true;
			}else if(nextMayus && Character.isAlphabetic(s.charAt(i))) {
				result+=Character.toString(s.charAt(i)).toUpperCase();
				nextMayus = false;
			}else if(i!=0){
				result+=Character.toString(s.charAt(i));
			}
			if(i==0) {
				result+=Character.toString(s.charAt(i)).toUpperCase();
			}
		}

		return result;
	}
}