import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MENU extends JFrame{
    JPanel panel_menu;
    private JLabel taxto;
    private JRadioButton boton_ver_saldo;
    private JRadioButton boton_deposito;
    private JRadioButton boton_retiro;
    private JRadioButton boton_salir;
    static JFrame frame_3 = new JFrame();


    public MENU() {
        boton_ver_saldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame_3.setUndecorated (true);
                frame_3.setContentPane(new SALDO().panel_saldo);
                frame_3.setSize(400,200);
                frame_3.setLocationRelativeTo(null);
                frame_3.pack();
                frame_3.setVisible(true);;
            }
        });

        boton_retiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_3.setUndecorated (true);
                frame_3.setContentPane(new RETIRO().panel_retiro);
                frame_3.setSize(400,200);
                frame_3.setLocationRelativeTo(null);
                frame_3.pack();
                frame_3.setVisible(true);
            }
        });
        boton_deposito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame_3.setUndecorated (true);
                frame_3.setContentPane(new DEPOSITO().panel_deposito);
                frame_3.setSize(400,200);
                frame_3.setLocationRelativeTo(null);
                frame_3.pack();
                frame_3.setVisible(true);
            }
        });
    }
}
