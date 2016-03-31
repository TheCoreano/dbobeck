// Felizes ~Beck
package Felizes;
public class Numero {
	public static boolean feliz( int numero ){
		boolean resposta = false;
			while(numero != 1 && numero != 16){ // Quando chegar no 16 numero = triste;
				int div = ( numero / 10 ); 
				int div2 = ( numero / 100 ); 
				int resto = numero % 10;
				int numero1 = (int)(resto);
				int numero3 = (int)(div2); 
				int numero2 = (int) ((div) - (10 * (div2)));
				numero = (int) (numero1 * numero1) + (numero2 * numero2) + (numero3 * numero3);
			}
			if(numero == 1 ) resposta = true;
				else resposta = false;
					return resposta;
	}
}		