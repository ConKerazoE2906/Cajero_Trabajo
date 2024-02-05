import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SALDO {
    private JButton boton_menu;
    JPanel panel_saldo;
    private JLabel simbolo;
    public JLabel valor_saldo;
    private JButton boton_actualizar;

    public SALDO() {
        boton_menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VOLVER_MENU regresar = new VOLVER_MENU();
                regresar.volver_menu();
                //MENU.frame_3.dispose();

            }

        });
                //valor_saldo.setText(saldo);

    }


    //retirar
    /*public void saldo_actulizado(){
        String saldo = "200";
        valor_saldo.setText(saldo);
        float saldo_1 = Float.parseFloat(saldo);

        if (){
            saldo_1=saldo_1-retiro;
        }
    }*/
}
