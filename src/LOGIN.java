import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOGIN extends JFrame {
    javax.swing.JPanel panel_login;
    private JButton boton_siete;
    private JButton boton_ocho;
    private JButton boton_nueve;
    private JButton boton_cinco;
    private JButton boton_seis;
    private JButton boton_uno;
    private JButton boton_dos;
    private JButton boton_tres;
    private JButton boton_cuatro;
    private JButton boton_validar;
    private JButton boton_cero;
    private JLabel texto;
    private JLabel numeros_pantalla;

    public LOGIN() {
        boton_cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*String texto_pantalla = numeros_pantalla.getText();
                String valores = numeros_pantalla + "0";
                numeros_pantalla.setText(valores);*/
            }
        });
        boton_uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*String texto_pantalla = numeros_pantalla.getText();
                String valores = numeros_pantalla + "1";
                numeros_pantalla.setText(valores);*/
            }
        });
    }
}
