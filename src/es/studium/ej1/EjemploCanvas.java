package es.studium.ej1;

import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EjemploCanvas implements WindowListener, KeyListener //Relacionado con el teclado KeyListener
{
	Frame ventana = new Frame("Canvas");
	Canvas lienzo = new Canvas();
	
	public EjemploCanvas() { //CONSTRUCTOR
		ventana.setLayout(new FlowLayout());
		ventana.setSize(500,180);
		ventana.add(lienzo); //Lo Añadimos
		lienzo.requestFocus(); // Que tiene el cursor que esta seleccionado
		ventana.addKeyListener(this); //Añadimos opcion de teclado.
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.addWindowListener(this);
		ventana.setVisible(true);
	}
	public static void main(String[] args)
	{
		new EjemploCanvas();
	}

	@Override
	public void windowActivated(WindowEvent arg0){}

	@Override
	public void windowClosed(WindowEvent arg0){}

	@Override
	public void windowClosing(WindowEvent arg0){
		System.out.println("Usted cerro la ventana...");
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0){}

	@Override
	public void windowDeiconified(WindowEvent arg0){}

	@Override
	public void windowIconified(WindowEvent arg0){}

	@Override
	public void windowOpened(WindowEvent arg0){}
	@Override
	public void keyPressed(KeyEvent pulsacion)  // QUE PULSASTE UNA TECLA. Cualquier tecla
	{
		System.out.println("Pulsaste la tecla con codigo " +
		pulsacion.getKeyCode()); { //pulsacion.getKeyCode te dice el numero de la tecla pulsada
		
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) //Soltaste una tecla
	{
	}
	@Override
	public void keyTyped(KeyEvent arg0) //PULSASTE UNA TECLA 2. ( QUE TIENEN REPRESENTACION EJEMPLO T TIENE REPRESETACION Y CONTROL NO.
	{
	}
}