
public class Contar extends Thread {
	private int contador;
	private Datos valorCompartido;
	
	public Contar ()
	{
		contador = 0;
		valorCompartido = null;
	}
	
	public Contar (Datos valorCompartido)
	{
		this.valorCompartido = valorCompartido;
		contador = 0;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public void run ()
	{
		while( contador < 100 )
		{
			contador+=10;
			synchronized (valorCompartido)
			{

				valorCompartido.valor+=getName();
				System.out.println(this.getName() +  "->"+ contador);
				System.out.println(this.getName() +  " valor ->"+ valorCompartido.valor);
				try {
					sleep( 100 );
				} 
				catch( InterruptedException e ) {
					e.printStackTrace();
				}

				System.out.println(this.getName() +  " valor ->"+ valorCompartido.valor);
				valorCompartido.valor ="hola";
				System.out.println(this.getName() +  " valor ->"+ valorCompartido.valor);
			}


		}

	}

}
