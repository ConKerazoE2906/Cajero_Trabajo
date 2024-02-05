import javax.swing.*;

public class DINERO extends SALDO{

    public float retirar_dinero(float n, float r){

        if (r<n){
            n=n-r;
            //String R =String.valueOf(n);
            //valor_saldo.setText(R);

        }else {
            JOptionPane.showMessageDialog(null, "SALDO INSUFICIENTE");
        }
        return n;
    }

    public float depositar_dinero(float n, float d){

        n=n+d;
        //String R =String.valueOf(n);
        //valor_saldo.setText(R);
        return n;
    }
}
