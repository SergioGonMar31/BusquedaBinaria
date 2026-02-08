package utiles;
import java.util.Scanner;
public class Depurar {

	public static int entero(String texto, Scanner sc) {
		boolean valido=false;
		int x=0;
		while(!valido) {
			try {
				System.out.println(texto);
				x=Integer.parseInt(sc.nextLine());
				valido=true;
			}catch(NumberFormatException e) {
				System.err.println("Error. Introduce un valor valido");
			}
		}
		return x;
	}
	
	public static double decimal(String texto, Scanner sc) {
		boolean valido=false;
		double x=0;
		while(!valido) {
			try {
				System.out.println(texto);
				x=Double.parseDouble(sc.nextLine());
				valido=true;
			}catch(NumberFormatException e) {
				System.err.println("Error. Introduce un valor valido");
			}
		}
		return x;
	}
	
}
