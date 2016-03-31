package Felizes;

public class Main2{
	public static void main(String[] args) {
	System.out.println(Numero2.feliz(1) == true);
	System.out.println(Numero2.feliz(2) == false);
	System.out.println(Numero2.feliz(7) == true);
	System.out.println(Numero2.feliz(9) == false);
	System.out.println(Numero2.feliz(10) == true);
	System.out.println(Numero2.feliz(13) == true);
	System.out.println(Numero2.feliz(15) == false);
	System.out.println(Numero2.feliz(19) == true);
	System.out.println(Numero2.feliz(23) == true);
	System.out.println(Numero2.feliz(27) == false);
	System.out.println(Numero2.feliz(28) == true);
	System.out.println(Numero2.feliz(31) == true);
	// casos de teste opcionais (descomente para observar a performance)
	// System.out.println(Numero.feliz(1808) == true);
	// System.out.println(Numero.feliz(1809) == false);
	// System.out.println(Numero.feliz(9982) == true);
	// System.out.println(Numero.feliz(9983) == false);	
	}
}	