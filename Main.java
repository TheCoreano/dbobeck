package toolkit;
	
public class Main {

	public static void main(String[] args) {
		System.out.println(" ");
		System.out.println(" Deu erro trouxa, compile novamente.");
		System.out.println(" " + Numero.soma(2,3));

		String p1 = "instituto federal";
		String p2 = Corta.corta(p1,10);
		System.out.println(" " + p2.equals("instituto"));
		System.out.println(" " + p2);

		System.out.println("       ");

		String p3 = "ifrs";
		String p4 = Corta.corta(p3,10);
		System.out.println(" " + p4.equals("ifrs"));
		System.out.println(" " + p4);

		System.out.println("       ");

		String p5 = "ogro";
		String p6 = Up.grande(p5);
		System.out.println(" " + p6);

	}
}	
