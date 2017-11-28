
public class Compartido {
	private int dinero;

	public Compartido(int dinero) {
		this.dinero = dinero;
	}
	
	public Compartido() {
		this.dinero = 0;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
	public  int cogerRecompensa ()
	{
		int valor = 0;
		
		if (dinero > 0)
		{	
			dinero -= 5;
			valor = 5;
		}
		
		return valor;
	}

}
