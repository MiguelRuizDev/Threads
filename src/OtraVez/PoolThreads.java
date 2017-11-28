import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolThreads {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ArrayList <Contar> contadores = new ArrayList();
		String valor = "hola";
		Datos valorCompartido = new Datos(valor);
 
		// Crear colección de Threads
		for (int i = 0; i < 20; i++)
			contadores.add(new Contar(valorCompartido));
		
		 
        long init = System.currentTimeMillis();  // Instante inicial del procesamiento
        
        
        ExecutorService executor = Executors.newFixedThreadPool(20);
        
        for (Contar c: contadores) 
            executor.execute(c);
        
        executor.shutdown();	// Cierro el Executor
        
        while (!executor.isTerminated()) {
        	// Espero a que terminen de ejecutarse todos los procesos 
        	// para pasar a las siguientes instrucciones 
        }
        
        /*
        for (Contar c: contadores)
        	c.start();
        */
        long fin = System.currentTimeMillis();	// Instante final del procesamiento
        System.out.println("Tiempo total de procesamiento: "+(fin-init)/1000+" Segundos");
		

		
	}

}
