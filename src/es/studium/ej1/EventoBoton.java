package es.studium.ej1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoBoton implements ActionListener, WindowListener // implementar oyentes apartir de implements y abre otro main
// Windows para cerrar ventana con la x
{
	Frame ventana = new Frame("Eventos"); // Titulo
	Button btnAceptar = new Button("Aceptar"); //boton
	Button btnCancelar = new Button("Cancelar"); //boton 2
	Button btnSalir = new Button("Salir"); //boton 2
	EventoBoton()
	{
		ventana.setTitle("Evento" ); // Titulo Evento pero no hace falta por que se puso en frame
		ventana.setSize(230,100); // Tamaño
		ventana.setLayout(new FlowLayout()); // tamaño del boton asi ocupa solo lo de las letras
		btnAceptar.addActionListener(this); // para que escuche el boton lo del actionListener
		btnCancelar.addActionListener(this); // para que escuche el boton lo del actionListener 2 boton
		btnSalir.addActionListener(this); 
		ventana.setResizable(false); // que no se cambie tamaño
		ventana.setLocationRelativeTo(null); //ventana en el centro
		ventana.add(btnAceptar); // boton
		ventana.add(btnCancelar); // 2 boton
		ventana.add(btnSalir); 
		ventana.addWindowListener(this); // para meter en la ventana la x asi baja alo generado abajo
		ventana.setVisible(true); //SiempreUltima hacemos ventana visible
	}
	public static void main(String[] args)
	{
		new EventoBoton();

	}
	@Override
	public void actionPerformed(ActionEvent EventoGenerado)
	{
		if(EventoGenerado.getSource().equals(btnAceptar)) // necesitamos un si para ver si es aceptar o cancelar getSource donde se produce este evento
			//eventogenerado cuando usuario pulse boton
		{
			System.out.println("Pulsaste el boton aceptar.."); // eso sale por consola con implements ActionListener
		}
		if (EventoGenerado.getSource().equals(btnCancelar)){
			System.out.println("Pulsaste el boton cancelar.."); // esto es para el segundo boton
		}
		if (EventoGenerado.getSource().equals(btnSalir)){ // esto es para salir desde el boton sin la x
			System.out.println("Hasta luego lucas..");
			System.exit(0);
		}

	}
	@Override
	public void windowActivated(WindowEvent arg0) //Primero o segundo plano
	{
		// TODO Auto-generated method stub

	}
	@Override
	public void windowClosed(WindowEvent arg0) //justo despues de cerrarse ventana pero antes de cerrarse de todo
	{
		// TODO Auto-generated method stub

	}
	@Override
	public void windowClosing(WindowEvent arg0)
	{
		System.exit(0); // Cierra programa

	}
	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}
	@Override
	public void windowDeiconified(WindowEvent arg0) //restaurado
	{
		System.out.println("me han restaurado..");
	}
	@Override
	public void windowIconified(WindowEvent arg0) //minimizado
	{
			System.out.println("me han minimizado..");

	}
	@Override
	public void windowOpened(WindowEvent arg0) //Cuando se abre ventana
	{
		// TODO Auto-generated method stub

	}

}
