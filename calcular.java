public class calcular {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int x1 = x ;
		int r1 = soma( x , y );
		int r2 = subtracao( x , y );
		int r3 = multiplicacao( x , y );
		int r4 = divisao( x , y );
		int r5 = resto( x , y );
		int r6 = potencia( x , y , x1 );
		System.out.println( "Soma=" + r1 );
		System.out.println( r1 == 15 ); //true
		System.out.println( "subtracao=" + r2 );
		System.out.println( r2 == 5 ); //true
		System.out.println( "multiplicacao=" + r3 );
		System.out.println( r3 == 50 ); //true
		System.out.println( "divisao=" + r4 );
		System.out.println( r4 == 2 ); //true
		System.out.println( "resto=" + r5 );
		System.out.println( r5 == 0 ); //true
		System.out.println( "potencia=" + r6 );
		System.out.println( r6 == 100000 ); //true
	}
    public static  int soma(int x , int y) {
		int r1 = 0;
		r1 = x + y;
    	return r1;
 	}
 	public static  int subtracao(int x , int y) {
		int r2 = 0;
		r2 = x - y;
    	return r2;
 	}
 	public static  int multiplicacao(int x , int y) {
		int r3 = 0;
		int a = 0;
		while( y > a){
			r3 = r3 + x;
			a++;
		}
    	return r3;
 	}
 	public static  int divisao(int x , int y) {
		int r4 = 0;
		int a = 0;
		while( x > a){
			a = a + y;
			r4++;
		}
    	return r4;
 	}
 	public static  int resto(int x , int y) {
		int r5 = 0;
		if(x >= y ){
		while(x >= y ){
			x = x - y;
		}
		 r5 = x;
		}
		else{
			 r5 = x;
		}
    	return r5;
 	}
 	public static  int potencia(int x , int y , int x1 ) {
 		int r6 = 0;
 		int a = 0;
 		int b = 0;
 		int c = 0;
 		y = y - 1;
 		while( b < y ){
 			while( x > a){
			r6 = r6 + x1;
			a++;
			c = r6 ;
			}
			a = 0;
			b++;
			x = c;
			r6 = 0;
 		}
 		r6 = c;
		return r6;
 	}
}	  	