import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {
    private JPanel Panel1;
    private JTextField userF;
    private JPasswordField passwordFl;
    private JButton LOGINButton;

    public form1() {
        super("Login");
        setContentPane(Panel1);
        LOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user= userF.getText();
                String password= passwordFl.getText();
                if (user.equals("emilio") && password.equals("12345")){
                    JOptionPane.showMessageDialog(form1.this,"Bienvenido al programa");
                    form2 menu=new form2();
                    menu.setSize(400,400);
                    menu.setVisible(true);
                    menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(form1.this,"User or password incorrect");
                }

            }
        });
    }
}
