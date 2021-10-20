package es.studium.ej1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ej01_termometro implements WindowListener, ActionListener
{
	//Todo el constructor:
	//-----------------------
	Frame ventana = new Frame();
	Label etiqueta1 = new Label("Celsius");
	TextField Celsius = new TextField(5);
	Label etiqueta2 = new Label("Fahrenheit");
	TextField Fahrenheit = new TextField(5);
	Button btnFahrenheitCelsius = new Button(" Fahrenheit a Celsius ");
	Button btnCelsiusFahrenheit = new Button(" Celsius a Fahrenheit ");
	//Generando la clase
	public Ej01_termometro()
	{
		//Añadiendo tipo de Layout (tres filas y dos columnas)
		ventana.setLayout(new GridLayout(3,2));
		//Dando tamaño
		ventana.setSize(500,175);
		//Evitando que se pueda modificar
		ventana.setResizable(false);
		//Para el título de la ventana
		ventana.setTitle("Conversión de temperaturas");
		//Colocándola en el centro de la pantalla
		ventana.setLocationRelativeTo(null);
		//Añadiendo los elementos a la ventana (Frame)
		ventana.add(etiqueta1);
		ventana.add(Celsius);
		ventana.add(etiqueta2);
		ventana.add(Fahrenheit);
		ventana.add(btnFahrenheitCelsius);
		ventana.add(btnCelsiusFahrenheit);
		//A continuación, se añade el Listener a los botones
		btnFahrenheitCelsius.addActionListener(this);
		btnCelsiusFahrenheit.addActionListener(this);
		// Del mismo modo, agregamos el Listener a la ventana
		ventana.addWindowListener(this);
		//Haciendo visible la ventana
		ventana.setVisible(true);
	} 
	public static void main(String[] args)
	{
		new Ej01_termometro();
	}
	//Evento para que funcione el aspa de ciere de la ventana
	public void windowClosing(WindowEvent we)
	{
		//Usamos el método exit de la clase System dando valor cero
		System.exit(0);
	}
	public void actionPerformed(ActionEvent ae)
	{
		// Lo primero que debemos hacer es averiguar
		//el botón qué genera este evento
		//----------------------------------------------
		//Podemos crear un objeto al igual que se ha hecho
		//en las clases de programación.
		//En este caso, lo llamamos boton
		//Y le insertamos el getSource del ActionEvent
		Object boton = ae.getSource();
		//Creamos una variable de tipo float para el resultado
		float resultado;
		//Realizamos la comparación:
		/*Si el ActionEvent lo realiza o tiene el botón
		 * CelciusFahrenheit, entonces decimos que el resutado
		 * corresponde con la fórmula que se aprecia
		 */
		if(boton== btnCelsiusFahrenheit)
		{
			//Creamos una variable de tipo float para los grados celsius
			float C;
			//Ponemos en la variable lo que se inserte en la caja de texto
			//Convirtiendolo el texto en float
			C = (float) (Float.parseFloat(Celsius.getText()));
			//Realizamos la siguiente operación
			//Un grado Celcius es igual a ((9/5)+32) grados Fahrenheit
			resultado = (C * (float)(9.0/5.0)) + (32);
			//Colocamos en la caja de texto de Fahrenheit el resultado obtenido
			Fahrenheit.setText(Float.toString(resultado));
		}
		//Si no es ese botón, es decir, que es el otro el que se pulsa
		else
		{
			//Creamos una variable de tipo float para los grados fahrenheit
			float F;
			//Ponemos en la variable lo que se inserte en la caja de texto
			//Convirtiendolo el texto en float
			F = (float)(Float.parseFloat(Fahrenheit.getText()));
			//Realizamos la siguiente operación
			//Un grado Fahrenheit es igual a (-32)*(5/9) grados Celcius
			resultado = ((F - (32)) * ((float)(5.0/9.0) )) ;
			//Colocamos en la caja de texto de celsius el resultado
			Celsius.setText(Float.toString(resultado));
		}
	}
	//Agrupo los eventos vacíos
	public void windowOpened(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowActivated(WindowEvent we){}
	public void windowDeactivated(WindowEvent we){}
}