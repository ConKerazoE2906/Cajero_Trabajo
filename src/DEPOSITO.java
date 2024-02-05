import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DEPOSITO {
    JPanel panel_deposito;
    private JLabel texto;
    private JButton boton_siete;
    private JButton boton_ocho;
    private JButton boton_nueve;
    private JButton boton_seis;
    private JButton boton_cinco;
    private JButton boton_cuatro;
    private JLabel valor_deposito;
    private JButton boton_validar;
    private JButton boton_tres;
    private JButton boton_dos;
    private JButton boton_cero;
    private JButton boton_uno;
    private JButton boton_regresar;

    public DEPOSITO() {
        boton_regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*VOLVER_MENU regresar = new VOLVER_MENU();
                regresar.volver_menu();*/
                MENU.frame_3.dispose();
            }
        });


        boton_cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="0";
                String texto_pantalla = valor_deposito.getText();
                String valores = texto_pantalla + numero;
                valor_deposito.setText(valores);
            }
        });
        boton_uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="1";
                String texto_pantalla = valor_deposito.getText();
                String valores = texto_pantalla + numero;
                valor_deposito.setText(valores);
            }
        });
        boton_dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="2";
                String texto_pantalla = valor_deposito.getText();
                String valores = texto_pantalla + numero;
                valor_deposito.setText(valores);
            }
        });
        boton_tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="3";
                String texto_pantalla = valor_deposito.getText();
                String valores = texto_pantalla + numero;
                valor_deposito.setText(valores);
            }
        });
        boton_cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="4";
                String texto_pantalla = valor_deposito.getText();
                String valores = texto_pantalla + numero;
                valor_deposito.setText(valores);
            }
        });
        boton_cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="5";
                String texto_pantalla = valor_deposito.getText();
                String valores = texto_pantalla + numero;
                valor_deposito.setText(valores);
            }
        });
        boton_seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="6";
                String texto_pantalla = valor_deposito.getText();
                String valores = texto_pantalla + numero;
                valor_deposito.setText(valores);
            }
        });


        boton_siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="7";
                String texto_pantalla = valor_deposito.getText();
                String valores = texto_pantalla + numero;
                valor_deposito.setText(valores);
            }
        });
        boton_ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="8";
                String texto_pantalla = valor_deposito.getText();
                String valores = texto_pantalla + numero;
                valor_deposito.setText(valores);
            }
        });
        boton_nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="9";
                String texto_pantalla = valor_deposito.getText();
                String valores = texto_pantalla + numero;
                valor_deposito.setText(valores);
            }
        });
        boton_validar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto_pantalla = valor_deposito.getText();
                //Este valor se suma al saldo
                String valores = texto_pantalla;
            }
        });
        boton_validar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto_pantalla = valor_deposito.getText();
                String valores = texto_pantalla;
                float retiro = Float.parseFloat(valores);
                System.out.println(1+retiro);

            }
        });
    }
}
