
public class MultiHola {

    public static void main( String args[] ) {
        TestTh t1,t2;
        OtroThread t3;
        Thread t3Thread;

        // Creamos los threads
        t1 = new TestTh( "Thread 1",(int)(Math.random()*2000) );
        t2 = new TestTh( "Thread 2",(int)(Math.random()*2000) );
        t3 = new OtroThread( "Thread 3",(int)(Math.random()*2000) );
        t3Thread = new Thread (t3);
        
        // Arrancamos los threads
        t1.start();
        t2.start();
        t3Thread.start();
        }
 
}
