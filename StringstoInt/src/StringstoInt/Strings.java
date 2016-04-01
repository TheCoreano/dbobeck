package StringstoInt;
public class Strings {
	public static int toInt( String word ){
		char[] guardar = word.toCharArray();
        int var = 0;
        for ( int contA1 = 0; ( contA1 < guardar.length ); contA1++ ){
            if ( (int) guardar[contA1] == 32 ) var++; 
            else contA1 = guardar.length;
            
        }
        char[] let = new char[(guardar.length) - var];
        for ( int contA2 = 0; ( contA2 < let.length ); contA2++ ) let[contA2] = guardar[contA2 + var];
   		
   		int asciitab = 0; int factor = 1; int thefinal = 0;
		boolean verdade = true;
		for( int conti = 0; conti < let.length; conti++){
			  asciitab = (int) let[conti];
              if((asciitab >= 48 && asciitab <= 58) || (asciitab == 32)) verdade = true; // De 0 até 9, ou igual ao espaço      
                else	{
                    verdade = false;
                    conti = let.length;
                }
		}
		
        if(verdade == true){
            for(int conti2 = 0; conti2 < let.length - 1; conti2++){
            if( (int) let[conti2] == 32 && (int) let[conti2 - 1] != 32  && (int) let[conti2 + 1] != 32) return 0; // Espaço Letra/Dígito Espaço
            }
            if ( verdade == true ){
                int qntdt = 1;
                for ( int conti3 = 0; ( conti3 < let.length ); conti3++ ){
                    if ( (int) let[conti3] != 32 ) qntdt++;
                }
                int[] volta = new int[qntdt];
                for ( int conti4 = 0; ( conti4 < volta.length - 1 ); conti4++ ){
                    if ( (int) let[conti4] != 32){
                        asciitab = (int) let[conti4];
                        volta[conti4] = (asciitab - 48);
                    }
                }
                for ( int conti5 = volta.length - 1; ( conti5 >= 0 ); conti5-- ){
                    thefinal = thefinal + volta[conti5] * factor;
                    factor = factor * 10;
                }
                thefinal = thefinal / 10;
            }
        }
        return thefinal;
    }
}		