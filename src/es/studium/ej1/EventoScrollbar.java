package es.studium.ej1;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoScrollbar extends Frame implements WindowListener,
AdjustmentListener //AdjustmentListener ajustes 
{
	private static final long serialVersionUID = 1L;
	Scrollbar scrHorizontal = new Scrollbar(Scrollbar.HORIZONTAL,1,10,1,265); // 1 donde empieza el 10 tamaño de la barra 1 se mueve de 1 en 1 en la barra 265 -10 que es el ancho 265
	// Empieza en 1, vale 10 el cuadrado, y va desde 1 a 255 (265–10)
	TextField txtCampo = new TextField(5);
	public EventoScrollbar()
	{
		setLayout(new BorderLayout());
		setTitle("Scrollbar");
		txtCampo.setText("1");
		add("North", scrHorizontal);
		add("South", txtCampo);
		scrHorizontal.addAdjustmentListener(this);
		addWindowListener(this);
		setSize(200, 100);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new EventoScrollbar();
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
	public void adjustmentValueChanged(AdjustmentEvent ae) //Cambio de ajuste
	{
		txtCampo.setText(Integer.toString((ae.getValue()))); //sacar el valor getValue de lo que va atras de el cuadrado 
		//(Integer.toString Entero a String txtCampo.setText(
	}
}
