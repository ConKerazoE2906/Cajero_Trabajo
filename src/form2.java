import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form2 extends JFrame{
    private JPanel panel_menu;
    private JLabel taxto;
    private JRadioButton boton_ver_saldo;
    private JRadioButton boton_deposito;
    private JRadioButton boton_retiro;
    private JRadioButton boton_salir;
    static JFrame frame_2 = new JFrame();


    public form2() {
        boton_ver_saldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                frame_2.setUndecorated (true);
                frame_2.setContentPane(new form2().panel_menu);
                frame_2.setSize(400,200);
                frame_2.setLocationRelativeTo(null);
                frame_2.pack();
                frame_2.setVisible(true);;
            }
        });
    }
}
