import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import daw.com.Pantalla;
import daw.com.Teclado;

public class AppCronometro {
	private ArrayList<String> nombres;
	
	public AppCronometro ()
	{
		nombres = new ArrayList();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		String nombre,respuesta;
		
		
		AppCronometro app = new AppCronometro();
		
		
		
		Cronometro crono = new Cronometro (app);
		Thread t = new Thread (crono);
		
		t.start();
		
		do
		{
			nombre = Teclado.leerString("nombre");
			app.nombres.add(nombre);
			respuesta = Teclado.leerString("sigo (S/N)");
		}while (respuesta.equals("S"));
		
		app.escribirFichero();	
		crono.parar();
		
		Pantalla.escribirString(crono.toString());
		

	}
	public void escribirFichero () 
	{
		FileWriter bruto;
		PrintWriter filtro;
		
		try
		{
		bruto = new FileWriter ("borrame.txt");
		filtro = new PrintWriter (bruto);
		
		
		
		
		for (String n:nombres)
		{
			Pantalla.escribirString ("\n" + n);
			filtro.println (n);
		}
			
		filtro.close();
		bruto.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
