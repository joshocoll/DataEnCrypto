package data_en_crypto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by nyx on 1/29/14 at 7:54 PM.
 */
public class DataEnCrypto_GUI_ASC extends JFrame {

    JPanel jpLayout;

    JTextArea jtaMuestra;

    JScrollPane jspMuestra;

    JButton jbMostrar;

    JTextField jtfArchivo;

    JButton jbGuardarComo;

    JButton jbCancelar;

    JButton jbGuardar;

    public DataEnCrypto_GUI_ASC() {
        super("DataEnCrypto v" + Cargador.getVersion() + " (GUI de Configuracion Avanzada de Salida)");
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.setSize(600, 200);

        jpLayout = new JPanel();
        jpLayout.setLayout(null);
        this.setContentPane(jpLayout);

        jtaMuestra = new JTextArea();
        jtaMuestra.setBounds(0, 0, 400, 60);
        jtaMuestra.setEditable(false);

        jspMuestra = new JScrollPane(jtaMuestra);
        jspMuestra.setBounds(170, 10, 420, 80);
        jspMuestra.setPreferredSize(new Dimension(420, 80));
        jspMuestra.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jspMuestra.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jspMuestra.setEnabled(true);

        jpLayout.add(jspMuestra);

        jbMostrar = new JButton("Mostrar");
        jbMostrar.setBounds(10, 10, 150, 20);
        jbMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //escribir al jtaMuestra aqui
            }
        });
        jpLayout.add(jbMostrar);

        jtfArchivo = new JTextField();
        jtfArchivo.setBounds(10, 100, 420, 20);
        jpLayout.add(jtfArchivo);

        jbGuardarComo = new JButton("Guardar Como");
        jbGuardarComo.setBounds(440, 100, 150, 20);
        jbGuardarComo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser jfcSelector = new JFileChooser(jtfArchivo.getText());
                jtfArchivo.setText("");
                jfcSelector.setDialogTitle("Guardar");
                jfcSelector.setApproveButtonText("Guardar");
                int op = jfcSelector.showSaveDialog(null);
                if (op == JFileChooser.APPROVE_OPTION){
                    jtfArchivo.setText(jfcSelector.getSelectedFile().getAbsolutePath());
                }
            }
        });
        jpLayout.add(jbGuardarComo);

        jbCancelar = new JButton("Cancelar");
        jbCancelar.setBounds(10, 130, 100, 20);
        jbCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                dispose();
            }
        });
        jpLayout.add(jbCancelar);

        jbGuardar = new JButton("Guardar");
        jbGuardar.setBounds(490, 130, 100, 20);
        jbGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (new File(jtfArchivo.getText()).exists()){
                    File arch = new File(jtfArchivo.getText());
                    try {
                        PrintWriter ae = new PrintWriter(arch);
                        //escribir al archivo aqui
                    } catch (FileNotFoundException e1) {

                    }
                }
            }
        });
        jpLayout.add(jbGuardar);

        this.setVisible(true);
    }

}
