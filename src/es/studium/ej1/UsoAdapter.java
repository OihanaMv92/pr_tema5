package es.studium.ej1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Ahora heredaremos, no implementaremos
//Esto tiene el inconveniente que no podremos heredar de Frame
//por lo que tendremos que crear el Frame dentro de nuestra clase
public class UsoAdapter extends WindowAdapter
{
	Frame frm = new Frame("Ventana que se Cierra con Adapter");
	public UsoAdapter()
	{
		// Ahora hay que referirse a f
		frm.setLayout(new FlowLayout());
		frm.addWindowListener(this); // añadimos el Listener
		frm.setSize(200,200);
		frm.setVisible(true);
	}
	// Solamente definiremos el método de WindowListener que
	// necesitemos, en este caso windowClosing
	public void windowClosing(WindowEvent we) // no te hace falta tener todos los metodos solo poner el que vas usar tendrias que meterlo a mano
	{
		System.exit(0);
	}
	public static void main(String[] args)
	{
		new UsoAdapter();
	}
}
