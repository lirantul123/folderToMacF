import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class hello implements ActionListener {
	private static JTextField userText;
	private static JButton button;
	private static JLabel success;
    
    public static void main(String[] args){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(750, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userText = new JTextField(10);
        userText.setBounds(100, 20, 500, 520);
        panel.add(userText);

        button = new JButton("Login");
        button.setBounds(110, 585, 70, 25);
        button.addActionListener(new hello());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(330, 580, 1000 , 25);
        panel.add(success);

        JLabel write3 = new JLabel("length: ");       
        write3.setBounds(120, 555, 1000 , 25);
        panel.add(write3);

        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
		String user = userText.getText();
        for (int i=0; i<user.length(); i++) {
            System.out.println(user.length());  
        }


    }


    
}
