package toolkit;
public class Up {
	public static String grande (String text) {
		char [] letras = text.toCharArray();
		char [] retorno = new char [letras.length];
		int teste;
		for ( int i = 0; i < letras.length; i++)	{
			teste = ((int)letras[i]) - 32;
			if( (teste >= 65 ) && (teste <= 90)) retorno[i] = (char) teste;

		}
	
			return new String(retorno);
	}
}