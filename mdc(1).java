public class mdc{
	public static void main(String[] args) {
		System.out.println(mdc(12, 18) == 6); 
		System.out.println(mdc(82, 90) == 2);
		System.out.println(mdc(36, 90) == 18);
		System.out.println(mdc(821, 90) == 1);
	}
	public static int mdc(int n1,int n2){
		int maior = 0,divisor = 0,resto = 9999, mdc = 0;
    	if ( n1 >= n2 ) {
    		maior = n1;
    		divisor = n2;
    	}
    	else{
    		maior = n2; 
    		divisor = n1;
    	} 
    	while ( resto != 0){
    		resto = maior % divisor;
    		maior = divisor;
    		divisor = resto;
    	} 
    	mdc = maior;
		return mdc;
	}
}