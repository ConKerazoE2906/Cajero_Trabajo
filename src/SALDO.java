import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SALDO {
    private JButton boton_menu;
    JPanel panel_saldo;
    private JLabel simbolo;
    public JLabel valor_saldo;
    private JButton boton_actualizar;

    static float saldo=0;
    public SALDO() {
        boton_menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*VOLVER_MENU regresar = new VOLVER_MENU();
                regresar.volver_menu();*/
                MENU.frame_3.dispose();
                LOGIN.frame_2.setVisible(true);
            }

        });


        boton_actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor_saldo.setText(String.valueOf(saldo));



            }
        });
    }


}
