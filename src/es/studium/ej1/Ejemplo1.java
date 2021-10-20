package es.studium.ej1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejemplo1 implements WindowListener, ActionListener
{
        Frame ventana = new Frame("Ventana");
        Button btnBoton = new Button("Pulsar...");
        
        public Ejemplo1()
        {
                ventana.setSize(250,100);
                ventana.setLayout(new FlowLayout());
                btnBoton.addActionListener(this);
                ventana.add(btnBoton);
                ventana.setResizable(false);
                ventana.setLocationRelativeTo(null);
                ventana.addWindowListener(this);
                ventana.setVisible(true);
        }
        
        public static void main(String[] args)
        {
                new Ejemplo1();
        }

        public void windowClosing(WindowEvent arg0)
        {
                System.out.println("Saliendo...");
                System.exit(0);
        }
        @Override
        public void actionPerformed(ActionEvent arg0)
        {
                System.out.println("Pulsaste el botón");        
        }
        
        @Override
        public void windowActivated(WindowEvent arg0){}
        @Override
        public void windowClosed(WindowEvent arg0){}
        @Override
        public void windowDeactivated(WindowEvent arg0){}
        @Override
        public void windowDeiconified(WindowEvent e){}
        @Override
        public void windowIconified(WindowEvent e){}
        @Override
        public void windowOpened(WindowEvent e){}
}
