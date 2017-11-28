import java.util.ArrayList;

public class Carrera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compartido compartido = new Compartido (40);
		
		ArrayList<Caballo> caballos = new ArrayList();
		
		boolean fin = false;
		
		// Crear caballos
		caballos.add(new Caballo(0,0,"*",compartido));
		caballos.add(new Caballo(0,0,"+",compartido));
		caballos.add(new Caballo(0,0,"-",compartido));
		caballos.add(new Caballo(0,0,"o",compartido));
		
		// Crear y poner en marcha los hilos
		for (Caballo c:caballos)
		{
			Thread t = new Thread(c); 		
			t.start();
		}
		
		// Controlar la carrera
		while (!fin)
		{
			fin = true;
			for (Caballo c:caballos)
			{
				System.out.println(c.toString());
				fin &= !(c.getPosicion() < 100);
			}
		}
		
		// Hemos llegado al final
		for (Caballo c:caballos)
			System.out.println(c.getBolsa());
		
		System.out.println(compartido.getDinero());
		

	}

}
