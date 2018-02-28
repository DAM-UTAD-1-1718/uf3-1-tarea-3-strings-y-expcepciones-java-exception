package Ej3;

import java.io.IOException;
import java.util.Scanner;

public class ej3  {
	Scanner sc= new Scanner(System.in);
	
	
	
		public int ej1(String s) throws ExcepcionIntervalo {
			int result = 0;
			for(int i = 0; i<s.length();i++) {
				if(Character.isDigit(s.charAt(i))) {
					
					result+=Integer.parseInt(Character.toString(s.charAt(i)));
					
				}
				if(result>20) {
					throw new ExcepcionIntervalo("Fuera de Rango"+result);
				}
			}
				return result;
			
		}
	}
class ExcepcionIntervalo extends Exception {
	public ExcepcionIntervalo(String msg) {
		super(msg);
	}
}
