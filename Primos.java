public class Primos
{
	public static void main (String [] args )
	{
		

		int resp = Verifica(num)
		int numero = Integer.parseInt(System.console(). readLine(" Digite um numero: "));;
		System.out.print(resp);
	
	
	}
}

		// Método !
	
			public static int Verifica ( int num )
			{
				String resp = "";
				//int gambiarra = 0;
				int resto = 2;
				int num1 = num;
				
				while ( num > resto ) { 
					while ( num1 >= resto )	{
						num1 = num1 - resto   // Calcula o resto
					}
					if (( num1 == 0) && ( num1 != 1 )) // Significa que ele não é primo
						{
							resp = "Não primo";
						}
					if (( num1 != 0 ) && ( num1 == 0 ))
						{
							resp = "Primo";
						}
							else { 
								resp = "Composto";
							}
				}	

						return resp;
				
				
			}
				
				}
				
				