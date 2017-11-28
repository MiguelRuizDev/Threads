
import java.awt.*;
import java.applet.Applet;

public class App1Thread extends Applet implements Runnable {
    Thread t;
    int contador;

    public void init() {
        contador = 0;
        t = new Thread( this );
        t.start();
        }

    public void run() {
        while( true )
            {
            contador++;
            repaint();
            try {
                t.sleep( 10 );
            } catch( InterruptedException e ) {
                ;        
                };
            }
        }

    public boolean mouseDown( Event evt,int x,int y ) {
        t.stop();
        return( true );
        }

    public void paint( Graphics g ) {
        g.drawString( Integer.toString( contador ),10,10 );
        System.out.println( "Contador = "+contador );
        }

    public void stop() {
        t.stop();
        }
    }