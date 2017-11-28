package Crono;
import java.util.Scanner;

public class AppCrono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PREPARAMOS LA LECTURA
		String nombre;
		int edad;
		Scanner scan = new Scanner(System.in);
		
		//ARRANCAMOS EL HILO DEL CRONO
		Crono crono = new Crono();
		Thread hilo = new Thread(crono);
		
		hilo.start();
		
		//CUERPO DEL PROGRAMA PARA "HACER TIEMPO"
		System.out.println("Dime tu nombre");
		nombre = scan.nextLine();
		
		System.out.println("Dime tu edad");
		edad = scan.nextInt();

		//PARAMOS EL HILO
		hilo.stop();
		
		//MOSTRAMOS EL CRONO
		System.out.println(crono.toString());
	}

}
