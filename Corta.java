package toolkit;
public class Corta {
	public static String corta ( String palavra, int qtdletras) {

		char [] letras = palavra.toCharArray();
		
		if ( qtdletras > letras.length) return palavra;
		// if ( qtdletras > letras.length) return qtdletras = letras.length;

		char [] retorno = new char [qtdletras];
		for ( int i = 0; i < qtdletras; i++)	{
			retorno[i] = letras[i];
		}
	
			return new String(retorno);
	}
}