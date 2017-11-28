
public class Contar extends Thread {
	private int contador;
	
	public Contar ()
	{
		contador = 0;
	}
	
	public Contar (int contador)
	{
		this.contador = contador;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public void run ()
	{
		while( true )
		{
		contador+=10;
		System.out.println(this.getName() +  "->"+ contador);
		try {
			sleep( 10 );
		} 
		catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}

}

}
