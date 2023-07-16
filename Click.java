import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Click implements ActionListener {

	private static JButton button;
	private static JLabel success;

    public static int x = 0;

	public static void main(String[] args){
		try{
			JPanel panel = new JPanel();
			JFrame frame = new JFrame();
			frame.setSize(350, 160);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);

			panel.setLayout(null);

			button = new JButton("Click on me");
			button.setBounds(100, 30, 120, 25);
			button.addActionListener(new Click());
			panel.add(button);

			success = new JLabel("");
			success.setBounds(105, 80, 500, 25);
			panel.add(success);



			frame.setVisible(true);
			
			success.setText("Number of clicks: " + x);

		}catch (Exception e){
			System.out.println("...");
		}


	}

	public void actionPerformed(ActionEvent e){

		x++;
        success.setText("Number of Clicks: " + x);
		if (x == 50){
			success.setText("You in 50.");
			System.out.println("50");
		}
		if(x == 60){
			System.out.println("60");
		}
		if(x == 70){
			System.out.println("70");
		}
		if(x == 80){
			System.out.println("80");
		}
		if(x == 90){
			System.out.println("90");
		}
		if(x == 100){
			success.setText("You in 100.");
			System.out.println("100");
		}
		if(x == 110){
			System.out.println("110");
		}
		if(x == 120){
			System.out.println("120");
		}
		if(x == 130){
			System.out.println("130");
		}
		if(x == 140){
			System.out.println("140");
		}
		if(x == 150){
			success.setText("You in 150.");
			System.out.println("150");
		}
		if(x == 200){
			success.setText("You in 200.");
		}
		if(x == 250){
			success.setText("You in 250");
		}

		

	}
			
}