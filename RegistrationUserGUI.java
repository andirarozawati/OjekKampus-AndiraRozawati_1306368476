

import java.awt.*;  
import javax.swing.*;   
import java.awt.event.*; 

/**
 * Class registrasi dalam versi GUI 
 */

public class RegistrationUserGUI extends JFrame implements ActionListener {

    
    private JLabel labelName, labelPhone, labelEmail, labelPassword, labelPassword2;
    private JLabel labelError, labelRegistration; 
    private JTextField textName, textPhone, textEmail, textPassword, textPassword2;
    private JButton submitButton, clearButton;
    private Container contentPane;

    /**
     * Membuat GUI
     */
    public RegistrationUserGUI() {
        createGUI();
    } 

    /**
     * Mendeskripsikan Label,Field, dan lain-lain yang akan dibuat dalam GUI
     */
    private void createGUI() {
        try {
            
            contentPane = getContentPane();
            contentPane.setLayout(null);    
            setFont(new Font("TimesRoman", Font.ITALIC, 14));

            // create the name label
            labelName = new JLabel();   
            labelName.setText("Name");  
            labelName.setLocation(38, 10);  
            labelName.setSize(200, 25); 
            labelName.setForeground(Color.BLACK);
            contentPane.add(labelName); 

            // create the name text box
            textName = new JTextField();    
            textName.setText("");   
            textName.setToolTipText("Masukkan nama panjang anda");
            textName.setLocation(75, 10);   
            textName.setSize(200, 25);   
            contentPane.add(textName); 

            // create the phone label
            labelPhone = new JLabel();
            labelPhone.setText("Phone");
            labelPhone.setLocation(35, 50);
            labelPhone.setSize(300, 25);
            labelPhone.setForeground(Color.BLACK);
            contentPane.add(labelPhone);
            
            // create the phone text box
            textPhone = new JTextField();
            textPhone.setText("");
            textPhone.setToolTipText("Masukkan nomer telepon anda dengan awalan 021/08");
            textPhone.setLocation(75, 50);
            textPhone.setSize(130, 25);
            contentPane.add(textPhone);
            
            // create the email label
            labelEmail = new JLabel();
            labelEmail.setText("Email");
            labelEmail.setLocation(38, 90);
            labelEmail.setSize(300, 25);
            labelEmail.setForeground(Color.BLACK);
            contentPane.add(labelEmail);
            
            // create the email text box
            textEmail = new JTextField();
            textEmail.setText("");
            textEmail.setToolTipText("Masukan email valid anda dengan berisikan ' @ '");
            textEmail.setLocation(75, 90);
            textEmail.setSize(130, 25);
            contentPane.add(textEmail);
            
            // create the password label 
            labelPassword = new JLabel();
            labelPassword.setText("Password");
            labelPassword.setLocation(15, 130);
            labelPassword.setSize(300, 25);
            labelPassword.setForeground(Color.BLACK);
            contentPane.add(labelPassword);
            
            // create the password text box
            textPassword = new JTextField();
            textPassword.setText("");
            textPassword.setToolTipText("Harus password yang sesuai");
            textPassword.setLocation(75, 130);
            textPassword.setSize(130, 25);
            contentPane.add(textPassword);
            
            // creat the password2 label
            labelPassword2 = new JLabel();
            labelPassword2.setText("Re-Password");
            labelPassword2.setLocation(5, 170);
            labelPassword2.setSize(300, 25);
            labelPassword2.setForeground(Color.BLACK);
            contentPane.add(labelPassword2);

            // create the password2 text box
            textPassword2 = new JTextField();
            textPassword2.setText("");
            textPassword2.setToolTipText("Password tidak sesuai, Password harus sesuai");
            textPassword2.setLocation(88, 170);
            textPassword2.setSize(130, 25);
            contentPane.add(textPassword2);
            
            // create the submit button
            submitButton = new JButton();
            submitButton.setText("Submit");
            submitButton.setToolTipText("Tekan \"submit \" setelah anda yakin data anda sudah benar");
            submitButton.setLocation(125, 450);
            submitButton.setSize(100, 30);
            contentPane.add(submitButton);
            submitButton.addActionListener(this);

            clearButton = new JButton();
            clearButton.setText("Clear");
            clearButton.setToolTipText("Tekan \"clear \"jika anda ingin menghapus data anda");
            clearButton.setLocation(250, 450);
            clearButton.setSize(100, 30);
            contentPane.add(clearButton);
            clearButton.addActionListener(this);

            // create the error label
            labelError = new JLabel();
            labelError.setText("Please correct items in red");
            labelError.setLocation(150, 500);
            labelError.setSize(190, 25);
            labelError.setForeground(Color.RED);
            labelError.setVisible(false);
            contentPane.add(labelError);

            // create the registration label
            labelRegistration = new JLabel();
            labelRegistration.setText("Terima Kasih");
            labelRegistration.setLocation(145, 500);
            labelRegistration.setSize(190, 25);
            labelRegistration.setForeground(Color.BLACK);
            labelRegistration.setVisible(false);
            contentPane.add(labelRegistration);

      
            setTitle("Registrasi"); 
            setSize(475, 600); 
            setVisible(true);
        } catch (Exception e) {
        }
    }
    
    /**
     * Menjalankan create GUI
     */
    public static void main(String args[]) {
        RegistrationUserGUI application = new RegistrationUserGUI();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
   /**
    * Method untuk action atas isian registratsi
    */
    public void actionPerformed(ActionEvent event) {
        try {
            if (event.getActionCommand().equals("Submit")) {
                
                if (checkName() & checkPhone() & checkEmail() & checkPassword()) {
                    labelRegistration.setVisible(true); 
                    labelError.setVisible(false);       
                    submitButton.removeActionListener(this); 
                    clearButton.removeActionListener(this);  
                } else {
                    labelError.setVisible(true);   
                    labelRegistration.setVisible(false); 
                }
            } if (event.getActionCommand().equals("Clear")) 
                {
                textName.setText("");
                textPhone.setText("");
                textEmail.setText("");
                textPassword.setText("");
                textPassword2.setText("");
                labelError.setVisible(false);
                labelRegistration.setVisible(false);
                labelName.setForeground(Color.BLACK);
                labelPhone.setForeground(Color.BLACK);
                labelEmail.setForeground(Color.BLACK);
                labelPassword.setForeground(Color.BLACK);
                labelPassword2.setForeground(Color.BLACK);
            }
        } catch (Exception e) { }
    }

    
    private boolean checkName() {
        if (textName.getText().length() == 0) {
            labelName.setForeground(Color.RED); //nama salah
            return false;
        } else {
            labelName.setForeground(Color.BLACK); //name benar
            return true;
        }
    } 

    /**
     * Method untuk mengecek phone number 
     */
    private boolean checkPhone() {
            
            if (textPhone.getText().startsWith("021") || textPhone.getText().startsWith("08")) 
            {
                labelPhone.setForeground(Color.BLACK);  //benar
                return true;
            } else {
                labelPhone.setForeground(Color.RED);    //salah
                return false;
            }
            
    } 
    
    /**
     * Cek Apakah Format Email sudah benar
     * 
     */
    private boolean checkEmail() {
        if (textEmail.getText().contains("@"))
        {
            labelEmail.setForeground(Color.BLACK);  //email benar
                return true;
        } else
        {
            labelEmail.setForeground(Color.RED);    //email salah
                return false;
        }
    } 
    
    /**
     * Apakah password pertama dan kedua benar
     */
    private boolean checkPassword() {
        if (textPassword.getText().equals(textPassword2.getText()))
            
        {
            labelPassword.setForeground(Color.BLACK);   //passwords sesuai
            labelPassword2.setForeground(Color.BLACK);
                return true;
        } else
        {
            labelPassword.setForeground(Color.RED); //passwords tidak sesuai
            labelPassword2.setForeground(Color.RED);
                return false;
        }
    } 
    
}

