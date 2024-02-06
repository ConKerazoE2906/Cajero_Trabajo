import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RETIRO extends SALDO{
    JPanel panel_retiro;
    private JButton boton_siete;
    private JButton boton_ocho;
    private JButton boton_nueve;
    private JButton boton_cuatro;
    private JButton boton_cinco;
    private JButton boton_seis;
    private JButton boton_uno;
    private JButton boton_dos;
    private JButton boton_tres;
    private JButton boton_cero;
    private JButton boton_validar;
    private JLabel texto;
    private JButton boton_regresar;
    public JLabel valor_retiro;
    private JLabel simbolo;
    public float retiro;
    public float saldo_1;

    public RETIRO() {
        boton_regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //MENU.frame_3.dispose();
                /*VOLVER_MENU regresar = new VOLVER_MENU();
                regresar.volver_menu();*/
                MENU.frame_3.dispose();
                LOGIN.frame_2.setVisible(true);
            }
        });
        boton_cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="0";
                String texto_pantalla = valor_retiro.getText();
                String valores = texto_pantalla + numero;
                valor_retiro.setText(valores);
            }
        });
        boton_uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="1";
                String texto_pantalla = valor_retiro.getText();
                String valores = texto_pantalla + numero;
                valor_retiro.setText(valores);
            }
        });
        boton_dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="2";
                String texto_pantalla = valor_retiro.getText();
                String valores = texto_pantalla + numero;
                valor_retiro.setText(valores);
            }
        });
        boton_tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="3";
                String texto_pantalla = valor_retiro.getText();
                String valores = texto_pantalla + numero;
                valor_retiro.setText(valores);
            }
        });
        boton_cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="4";
                String texto_pantalla = valor_retiro.getText();
                String valores = texto_pantalla + numero;
                valor_retiro.setText(valores);
            }
        });
        boton_cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="5";
                String texto_pantalla = valor_retiro.getText();
                String valores = texto_pantalla + numero;
                valor_retiro.setText(valores);
            }
        });
        boton_seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="6";
                String texto_pantalla = valor_retiro.getText();
                String valores = texto_pantalla + numero;
                valor_retiro.setText(valores);
            }
        });
        boton_siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="7";
                String texto_pantalla = valor_retiro.getText();
                String valores = texto_pantalla + numero;
                valor_retiro.setText(valores);
            }
        });
        boton_ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="8";
                String texto_pantalla = valor_retiro.getText();
                String valores = texto_pantalla + numero;
                valor_retiro.setText(valores);
            }
        });
        boton_nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="9";
                String texto_pantalla = valor_retiro.getText();
                String valores = texto_pantalla + numero;
                valor_retiro.setText(valores);
            }
        });


        boton_validar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto_pantalla = valor_retiro.getText();
                String valores = texto_pantalla;
                float retiro = Float.parseFloat(valores);
                String saldo="200";
                valor_saldo.setText(saldo);
                float saldo_nuevo= Float.parseFloat(saldo);

                if (retiro<saldo_nuevo){

                    saldo_nuevo=saldo_nuevo-retiro;
                    String saldo_1= String.valueOf(saldo_nuevo);
                    MENU.frame_3.dispose();
                    LOGIN.frame_2.setVisible(true);
                    //valor_saldo.setText(saldo_1);

                }else {
                    JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");
                    MENU.frame_3.dispose();
                    LOGIN.frame_2.dispose();
                }

            }
        });

    }

}
