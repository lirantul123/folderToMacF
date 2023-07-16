import java.util.Scanner;
import java.util.Random;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class User implements ActionListener {

	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;


	public static void main(String[] args){
		try{
			JPanel panel = new JPanel();
			JFrame frame = new JFrame();
			frame.setSize(500, 240);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			frame.setDefaultCloseOperation(0);

			panel.setLayout(null);

			JLabel userlabel = new JLabel("user:");
			userlabel.setBounds(10, 20, 80, 25);
			panel.add(userlabel);

			JLabel write = new JLabel("write here the name");
			write.setBounds(125, 20, 1000 , 25);
			panel.add(write);

			userText = new JTextField(20);
			userText.setBounds(100, 20, 165, 25);
			panel.add(userText);

			passwordLabel = new JLabel("password:");
			passwordLabel.setBounds(10, 50, 80, 25);
			panel.add(passwordLabel);

			JLabel write2 = new JLabel("write here the password");
			write2.setBounds(110, 50, 1000 , 25);
			panel.add(write2);


			passwordText = new JPasswordField();
			passwordText.setBounds(100, 50, 165, 25);
			panel.add(passwordText);

			button = new JButton("Login");
			button.setBounds(10, 80, 80, 25);
			button.addActionListener(new User());
			panel.add(button);

			success = new JLabel("");
			success.setBounds(10, 140, 500, 25);
			panel.add(success);
			

			frame.setVisible(true);
			
		}catch (Exception e){
			System.out.println("...");
		}


	}
	public void actionPerformed(ActionEvent e){
		String user = userText.getText();
		String password = passwordText.getText();

		if (user.equals("liran") && password.equals("lirantul123")){
			System.out.println();
			System.out.println("..................");
			
			//!game
			int answer, guss;
			final int MAX = 40;
			Random rand = new Random();

			answer = rand.nextInt(MAX) + 1;

			while(true){
				Scanner keyboard = new Scanner(System.in); 
				
				System.out.print("Guss a number between 1-40: ");
					guss = keyboard.nextInt();
					
				if (guss == answer){
					success.setText("It`s realy " + answer + ". Click on LOGIN to play again");
					System.out.println("!END!");
					break;
				}
				else if (guss < answer){
					System.out.println("go up");
					System.out.println();
				}
				else{
					System.out.println("go down");
					System.out.println();
				}
			}
			//game!
				
		
		}
		
		else if (user.length() == 0 || password.length() == 0){
			success.setText("You must write user and password !");
		}

		
		else{
			success.setText("Try again");
			
		}
		

	}
			
}