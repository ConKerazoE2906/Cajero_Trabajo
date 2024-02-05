import javax.swing.*;

public class Main {

    static JFrame frame = new JFrame();
    public static void main(String[] args) {

        frame.setUndecorated (true);
        frame.setContentPane(new form1().panel_login);
        frame.setSize(400,200);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);


    }
}