import javax.swing.*;

public class VOLVER_MENU {
    static JFrame frame_2 = new JFrame();
    public void volver_menu(){
        MENU.frame_3.dispose();
        frame_2.setContentPane(new MENU().panel_menu);
        frame_2.setLocationRelativeTo(null);
        frame_2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame_2.setUndecorated (true);
        frame_2.pack();
        frame_2.setVisible(true);
    }
}
