
package data_en_crypto;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author nyx
 */
public class DataEnCrypto_GUI_Basico extends javax.swing.JFrame {

    JPanel jpDiseno;

    JLabel jlTitulo;

    JLabel jlEntrada, jlSalida, jlLlave;

    JScrollPane jspEntrada;

    JTextArea jtaEntrada;

    JScrollPane jspSalida;

    JTextArea jtaSalida;

    JButton jbEntradaEliminar;

    JButton jbEntradaBorrar;

    JButton jbEntradaMostrar;

    JButton jbSalidaEliminar;

    JButton jbSalidaBorrar;

    JButton jbSalidaMostrar;

    JTextField jtfEntrada;

    JButton jbEntradaAbrir;

    JTextField jtfSalida;

    JButton jbSalidaGuardar;

    JPasswordField jpfClave;

    JTextField jtfLlave;

    JButton jbLlaveAbrir;

    JComboBox<Object> jcbAlgoritmo;

    JComboBox jcbModo;

    JButton jbProcesar;

    JButton jbAtras;

    JButton jbSalir;

    public DataEnCrypto_GUI_Basico() {
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setSize(605, 500);

        jpDiseno = new JPanel(null);
        this.setContentPane(jpDiseno);

        jlTitulo = new JLabel("Bienvenidos a DataEnCrypto");
        jlTitulo.setBounds(190, 10, 230, 20);
        jpDiseno.add(jlTitulo);

        jlEntrada = new JLabel("Entrada");
        jlEntrada.setBounds(20, 40, 60, 20);
        jpDiseno.add(jlEntrada);

        jlSalida = new JLabel("Salida");
        jlSalida.setBounds(320, 40, 60, 20);
        jpDiseno.add(jlSalida);

        jtaEntrada = new JTextArea();
        jtaEntrada.setBounds(0, 0, 265, 180);
        jtaEntrada.setEnabled(false);

        jspEntrada = new JScrollPane(jtaEntrada);
        jspEntrada.setBounds(10, 60, 285, 200);
        jspEntrada.setPreferredSize(new Dimension(285, 200));
        jspEntrada.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jspEntrada.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jspEntrada.setEnabled(true);
        jpDiseno.add(jspEntrada);

        jtaSalida = new JTextArea();
        jtaSalida.setBounds(0, 0, 265, 180);
        jtaSalida.setEnabled(false);

        jspSalida = new JScrollPane(jtaSalida);
        jspSalida.setBounds(310, 60, 285, 200);
        jspSalida.setPreferredSize(new Dimension(285, 200));
        jspSalida.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jspSalida.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jspSalida.setEnabled(true);
        jpDiseno.add(jspSalida);

        jbEntradaEliminar = new JButton("Acectar");
        jbEntradaEliminar.setBounds(10, 270, 90, 20);
        jpDiseno.add(jbEntradaEliminar);

        jbEntradaBorrar = new JButton("Borrar");
        jbEntradaBorrar.setBounds(110, 270, 85, 20);
        jpDiseno.add(jbEntradaBorrar);

        jbEntradaMostrar = new JButton("Mostrar");
        jbEntradaMostrar.setBounds(205, 270, 90, 20);
        jpDiseno.add(jbEntradaMostrar);

        jbSalidaEliminar = new JButton("Acectar");
        jbSalidaEliminar.setBounds(310, 270, 90, 20);
        jpDiseno.add(jbSalidaEliminar);

        jbSalidaBorrar = new JButton("Borrar");
        jbSalidaBorrar.setBounds(410, 270, 85, 20);
        jpDiseno.add(jbSalidaBorrar);

        jbSalidaMostrar = new JButton("Mostrar");
        jbSalidaMostrar.setBounds(505, 270, 90, 20);
        jpDiseno.add(jbSalidaMostrar);

        jtfEntrada = new JTextField();
        jtfEntrada.setBounds(10, 300, 185, 20);
        jpDiseno.add(jtfEntrada);

        jbEntradaAbrir = new JButton("Abrir");
        jbEntradaAbrir.setBounds(205, 300, 90, 20);
        jpDiseno.add(jbEntradaAbrir);

        jtfSalida = new JTextField();
        jtfSalida.setBounds(310, 300, 165, 20);
        jpDiseno.add(jtfSalida);

        jbSalidaGuardar = new JButton("Guardar");
        jbSalidaGuardar.setBounds(485, 300, 110, 20);
        jpDiseno.add(jbSalidaGuardar);

        jlLlave = new JLabel("Llave");
        jlLlave.setBounds(235, 350, 60, 20);
        jpDiseno.add(jlLlave);

        jpfClave = new JPasswordField();
        jpfClave.setBounds(10, 350, 215, 20);
        jpDiseno.add(jpfClave);

        jtfLlave = new JTextField();
        jtfLlave.setBounds(10, 380, 185, 20);
        jpDiseno.add(jtfLlave);

        jbLlaveAbrir = new JButton("Abrir");
        jbLlaveAbrir.setBounds(205, 380, 90, 20);
        jpDiseno.add(jbLlaveAbrir);

        Object[] algoritmos = {"", "AutoTexto", "Cesar", "Librereta de un Solo Uso", "Vigenere"};
        jcbAlgoritmo = new JComboBox<Object>(algoritmos);
        jcbAlgoritmo.setBounds(310, 350, 280, 20);
        jpDiseno.add(jcbAlgoritmo);

        Object[] modos = {"", "Encriptar", "Desencriptar"};
        jcbModo = new JComboBox<Object>(modos);
        jcbModo.setBounds(310, 380, 150, 20);
        jpDiseno.add(jcbModo);

        jbProcesar = new JButton("Procesar");
        jbProcesar.setBounds(470, 380, 120, 20);
        jpDiseno.add(jbProcesar);

        jbAtras = new JButton("Atras");
        jbAtras.setBounds(100, 420, 100, 20);
        jpDiseno.add(jbAtras);

        jbSalir = new JButton("Salir");
        jbSalir.setBounds(400, 420, 100, 20);
        jpDiseno.add(jbSalir);

        this.setVisible(true);
    }
}
