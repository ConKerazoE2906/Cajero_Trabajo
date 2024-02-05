import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SALDO {
    private JButton boton_menu;
    JPanel panel_saldo;
    private JLabel simbolo;
    private JLabel valor_saldo;

    public SALDO() {
        boton_menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MENU.frame_3.dispose();
                /*VOLVER_MENU regresar = new VOLVER_MENU();
                regresar.volver_menu();*/
            }
        });
    }
}
