
public class Caballo implements Runnable {
	private int posicion;
	private int bolsa;
	private String dibujo;
	private Compartido compartido;
	
	public Caballo ()
	{
		this (0,0,"",null);
	}
	


	public Caballo(int posicion, int bolsa, String dibujo, Compartido compartido) {
		super();
		this.posicion = posicion;
		this.bolsa = bolsa;
		this.dibujo = dibujo;
		this.compartido = compartido;
	}
	
	public int getPosicion() {
		return posicion;
	}



	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}



	public int getBolsa() {
		return bolsa;
	}



	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}



	public String getDibujo() {
		return dibujo;
	}



	public void setDibujo(String dibujo) {
		this.dibujo = dibujo;
	}



	public Compartido getCompartido() {
		return compartido;
	}



	public void setCompartido(Compartido compartido) {
		this.compartido = compartido;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (posicion < 100)
		{
			posicion+=10;
			synchronized (compartido)
			{
			bolsa += compartido.cogerRecompensa();
			}
			try {
				Thread.sleep( 10);
			} 
			catch( InterruptedException e ) {
				e.printStackTrace();
			}
		}

	}
	
	public String toString()
	{
		String linea = "";
		
		for (int i = 0; i < posicion; i+=10)
			linea += dibujo;
		
		return linea;
	}

}
