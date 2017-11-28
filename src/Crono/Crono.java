package Crono;

public class Crono implements Runnable {

	int contador;
	
	public Crono (){
		contador = 0;
	}
	
	public Crono (int tiempoInicial){
		contador = tiempoInicial;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public String toString(){
		int horas, minutos, segundos;
		String time;
		
		horas = contador / 3600;
		minutos = (contador % 3600) / 60;
		segundos = contador % 60;
		
		return time = String.valueOf(horas) + ":" + String.valueOf(minutos) + ":" + String.valueOf(segundos); 
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while (true){
			try {
				Thread.sleep (1000);
			}
			catch (InterruptedException e){
				System.out.print("Se fue a la puta");
			}
			contador ++;
		}

		
	}
}
