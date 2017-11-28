import java.util.ArrayList;

import daw.com.Pantalla;

public class Cronometro implements Runnable {
	
	private int contador;
	private boolean fin;
	private AppCronometro app;
	
	public Cronometro (AppCronometro app)
	{
		this(0,false,null);
		this.app = app;
	}
	
	public Cronometro ()
	{
		this(0,false,null);
	}

	public Cronometro(int contador, boolean fin,AppCronometro app) 
	{
		super();
		this.contador = contador;
		this.fin = fin;
		this.app = app;
	}
	
	


	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	public boolean isFin() {
		return fin;
	}

	public void setFin(boolean fin) {
		this.fin = fin;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!fin)
		{
			contador ++; // incrementamos un segundo

			
				try {
					Thread.sleep(1000); // dormir un segundo
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				if (contador % 10 == 0)
					app.escribirFichero();
				
		}
		

	}

	@Override
	public String toString() {
		String reloj = "";
		
		int horas, minutos, segundos;
		
		horas = contador / 3600;
		
		minutos = (contador % 3600) / 60;
		
		segundos = contador % 60;
		
		reloj ="\n"+ horas + ":" + minutos + ":" + segundos;
		
		return reloj;
	}
	
	public void parar()
	{
		fin = true;
	}
	
	

}
