package mx.utng.s24.dp.factory;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


//Declaro una clase que crea JFrame (ventana básica)
public class Cliente extends JFrame{

    private JTextField txtUsuario;
    private JPasswordField txtPassword;



    public Cliente(){
        super("Login");
    }

}
