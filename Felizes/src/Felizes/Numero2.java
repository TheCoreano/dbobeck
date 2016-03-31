package Felizes;

public class Numero2 {
	public static boolean feliz( int numero ){
		boolean resposta = true;
		int quadrados = 0;
		int div = 0;
		int div2 = 0;
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		if ( numero >= 10 && numero <= 99 )	{
			
			 div = ( numero / 10 );
			 div2 = ( numero / 100 );
			 numero2 = (int) ((( div ) - ( Math.floor ( div ))) * 10);
			 numero1 = (int) (Math.floor((( numero - numero2 ) / 10)));
			 numero3 = (int) ((( div2 ) - ( Math.floor ( div2 ))) * 100);
			quadrados = (int) (Math.pow(numero1,2) + Math.pow(numero2,2));

				

				if ( quadrados == 1) resposta = true;
				else resposta = false;
			}  
			if ( numero <= 999)	{
					quadrados = (int) (Math.pow(numero1,2) + Math.pow(numero2,2) + Math.pow(numero3,2));
					if ( quadrados == 1) resposta = true;
					else resposta = false;
				}
				
				//if ( quadrados < 10) resposta = true;
				//else resposta = false;

		/*
		resposta Math.pow(num1,2) + Math.pow(num2,2);
		agr somou
		1 ao quadrado + 3 ao quadrado = 10
		agr mesma logica
		1 ao quadrado + 0 ao quadrado = 1
		deu 1 certo ? entao é menor que 10
		qnd der menor que 10 tu verifica
		if ( resposta == 1 ) feliz;
		else triste;  */
		//}
		return resposta;

	}
}		