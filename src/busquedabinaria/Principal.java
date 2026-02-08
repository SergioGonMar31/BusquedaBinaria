package busquedabinaria;
import java.util.Scanner;
import utiles.Depurar;
public class Principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int vector[]= {1, 2, 3, 5, 6, 9, 10,17, 18, 19, 20, 21, 28, 29,	31, 33, 35, 38, 40, 41, 42, 43, 44, 45};

		int num=Depurar.entero("Introduce un número entero", sc);

		if(Busqueda(vector, num)!=-1) {
			System.out.println("Se encuentra en la posición: "+ Busqueda(vector, num));
		}else {
			System.out.println("El número no se encuentra en el vector");
		}
		sc.close();
	}

	public static int Busqueda(int[] vector, int numero) {
		int a=0;
		int b=vector.length-1;
		int mitad=0;
		while(a<=b) {
			mitad=a+((b-a)/2);
			if(numero==vector[mitad]) {
				return mitad;
			}
			if(vector[mitad]<numero) {
				a=mitad+1;
			}else{
				b=mitad-1;
			}
		}
		return -1;
	}
}


