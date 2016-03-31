package Felizes;

public class Main{
	public static void main(String[] args) {
	System.out.println(Numero.feliz(1) == true);
	System.out.println(Numero.feliz(2) == false);
	System.out.println(Numero.feliz(7) == true);
	System.out.println(Numero.feliz(9) == false);
	System.out.println(Numero.feliz(10) == true);
	System.out.println(Numero.feliz(13) == true);
	System.out.println(Numero.feliz(15) == false);
	System.out.println(Numero.feliz(19) == true);
	System.out.println(Numero.feliz(23) == true);
	System.out.println(Numero.feliz(27) == false);
	System.out.println(Numero.feliz(28) == true);
	System.out.println(Numero.feliz(31) == true);
	// casos de teste opcionais (descomente para observar a performance)
	// System.out.println(Numero.feliz(1808) == true);
	// System.out.println(Numero.feliz(1809) == false);
	// System.out.println(Numero.feliz(9982) == true);
	// System.out.println(Numero.feliz(9983) == false);	
	}
}	