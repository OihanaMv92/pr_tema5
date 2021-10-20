package es.studium.ej1;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class EventoList extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	// Creaci�n de una lista con 4 elementos visibles y que no
	// permite multiselecci�n
	List lista = new List ( 3, false ); //Para ver cuanto queremos mostrar //false que solo puedes elegir un elemento
	public EventoList()
	{
		setLayout(new FlowLayout());
		setTitle("Lista con colores");
		lista.add("Blanco");
		lista.add("magenta");
		lista.add("Azul");
		lista.add("Verde");
		lista.add("Amarillo");
		lista.add("Rosa");
		add(lista);
		addWindowListener(this);
		// Para implementar el doble clic del rat�n
		// Si s�lo quisi�ramos una pulsaci�n, lista.addItemListener
		lista.addActionListener(this);
		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoList();
	}
	public void actionPerformed(ActionEvent ae)
	{
		if("magenta".equals(lista.getSelectedItem())) //getSelectedItem Elemento seleccionado 
		{
			setBackground(Color.magenta);
		}
		else if("Azul".equals(lista.getSelectedItem()))
		{
			setBackground(Color.cyan);
		}
		else if("Verde".equals(lista.getSelectedItem()))
		{
		setBackground(Color.green);
		}
		else if("Amarillo".equals(lista.getSelectedItem()))
		{
		setBackground(Color.yellow);
		}
		else if("Rosa".equals(lista.getSelectedItem()))
		{
		setBackground(Color.pink);
		}
		else
		{
		setBackground(Color.white);
		}
		}
		public void windowActivated(WindowEvent we) {}
		public void windowClosed(WindowEvent we) {}
		public void windowClosing(WindowEvent we)
		{
		System.exit(0);
		}
		public void windowDeactivated(WindowEvent we) {}
		public void windowDeiconified(WindowEvent we) {}
		public void windowIconified(WindowEvent we) {}
		public void windowOpened(WindowEvent we) {}
		}
