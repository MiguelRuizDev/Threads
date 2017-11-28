
public class TestPrioridad {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contar alto,bajo;
		
		// Creamos un thread en 200, ya adelantado
		bajo = new Contar( 200 );
		// El otro comienza desde cero
		alto = new Contar( 0 );
		// Al que comienza en 200 le asignamos prioridad mínima
		bajo.setPriority( Thread.MIN_PRIORITY );
		// Y al otro máxima
		alto.setPriority( Thread.MAX_PRIORITY );
		

		// Arrancamos los dos threads, y vamos repintando hasta que el thread
		// que tiene prioridad más alta alcanza o supera al que tiene prioridad
		// más baja, pero empezó a contar más alto
		
		bajo.start();
		alto.start();
		
		while( alto.getContador() < bajo.getContador() )
		{
			System.out.println("Alto: "+ alto.getContador());
			System.out.println("Bajo: "+ bajo.getContador());
		}
		
		bajo.stop();
		alto.stop();
	
		
		
		
		System.out.println ("Alto ya es mayor que bajo");
		
		System.out.println( "Prioridad baja es "+bajo.getPriority() );
		System.out.println( "Prioridad alta es "+alto.getPriority() );
		}
}
