public class Primos
{
	public static void main (String [] args )
	{
	// resultados observáveis:
	ehPrimo(2); // imprime "primo"
	ehPrimo(7); // imprime "primo"
	ehPrimo(9); // imprime "composto"
	ehPrimo(13); // imprime "primo"
	ehPrimo(15); // imprime "composto"
	ehPrimo(13000); // imprime "composto"
	ehPrimo(13001); // imprime "primo"
	ehPrimo(-3); // nada é impresso
	ehPrimo(0); // nada é impresso
	ehPrimo(1); // nada é impresso
	// teste de performance (opcionais):
	// ehPrimo(830087723); // imprime "composto"
	// ehPrimo(830809711); // imprime "primo"

	
	}
	
	public static String ehPrimo ( int num ) 
	{
		int resto = 999; 
		String primo = "Primo"; 
		if ( num <= 1 ){
			primo = "";
		} else{
			for ( int contador = 2; ( (resto != 0) && (contador < num)); contador++ ){
				if ( num % contador == 0 ) primo = "Eh Composto";
			}
		}
		System.out.println(primo);
		return primo;
	}
				
}