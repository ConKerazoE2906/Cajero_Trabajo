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
    private JButton boton_salir;
    private JPasswordField password;
    static JFrame frame_2 = new JFrame();

    public LOGIN() {

        boton_cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="0";
                String texto_pantalla = password.getText();
                String valores = texto_pantalla + numero;
                password.setText(valores);
            }
        });
        boton_uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="1";
                String texto_pantalla = password.getText();
                String valores = texto_pantalla + numero;
                password.setText(valores);
            }
        });
        boton_dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="2";
                String texto_pantalla = password.getText();
                String valores = texto_pantalla + numero;
                password.setText(valores);
            }
        });
        boton_tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="3";
                String texto_pantalla = password.getText();
                String valores = texto_pantalla + numero;
                password.setText(valores);
            }
        });

        boton_cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="4";
                String texto_pantalla = password.getText();
                String valores = texto_pantalla + numero;
                password.setText(valores);
            }
        });
        boton_cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="5";
                String texto_pantalla = password.getText();
                String valores = texto_pantalla + numero;
                password.setText(valores);
            }
        });
        boton_seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="6";
                String texto_pantalla = password.getText();
                String valores = texto_pantalla + numero;
                password.setText(valores);
            }
        });
        boton_siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="7";
                String texto_pantalla = password.getText();
                String valores = texto_pantalla + numero;
                password.setText(valores);
            }
        });
        boton_ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="8";
                String texto_pantalla = password.getText();
                String valores = texto_pantalla + numero;
                password.setText(valores);
            }
        });
        boton_nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numero="9";
                String texto_pantalla = password.getText();
                String valores = texto_pantalla + numero;
                password.setText(valores);
            }
        });
        boton_salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.dispose();
            }
        });


        boton_validar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String clave_ingreso = "1234";
                String texto_pantalla = password.getText();
                String valores = texto_pantalla;

                try{
                    if (clave_ingreso.equals(valores)){

                        Main.frame.dispose();
                        frame_2.setUndecorated (true);
                        frame_2.setContentPane(new MENU().panel_menu);
                        frame_2.setSize(400,200);
                        frame_2.setLocationRelativeTo(null);
                        frame_2.pack();
                        frame_2.setVisible(true);
                        //System.out.println("hola");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "CREDENCIALES INCORRECTAS");
                        Main.frame.dispose();
                        //System.out.println("adios");

                    }

                } catch (Exception ex){
                    System.out.println(ex);
                }
            }
        });
    }
}
