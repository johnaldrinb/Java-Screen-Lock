import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScreenLock extends JFrame implements ActionListener{

	private int SCREEN_WIDTH = 1380;
	private int SCREEN_HEIGHT = 780;

	private Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private JButton buttonUnlock;
	private JTextField textfield;

	public ScreenLock(){

		init();
	}

	private void init(){

		System.out.println(screenSize);

		setSize(screenSize.width, screenSize.height);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setAlwaysOnTop(true);
		setLocationRelativeTo(null);
		setLayout(null);
		setUndecorated(true);
		setBackground(new Color(0,0,0,0.9f));

		textfield = new JTextField("");
		textfield.setBounds((SCREEN_WIDTH/2) - 250, (SCREEN_HEIGHT/2) - 25, 500, 50);
		//add(textfield);
		//setBorderPainted(false);
		//setContentAreaFilled(false);
		buttonUnlock = new JButton("THIS PC IS LOCKED!");
		buttonUnlock.setBounds((SCREEN_WIDTH/2) - (SCREEN_WIDTH/2), (SCREEN_HEIGHT/2) - 50, SCREEN_WIDTH, 100);
		buttonUnlock.setBorderPainted(false);
		buttonUnlock.setContentAreaFilled(false);
		buttonUnlock.setForeground(Color.WHITE);
		buttonUnlock.setFont(new Font("Consolas", 1, 25));
		buttonUnlock.addActionListener(this);
		add(buttonUnlock);


		setVisible(true);

		// while(true){
		// 	if(!hasFocus()){
		// 		if(textfield.hasFocus()){
		// 		} else {
		// 			requestFocus();
		// 		}
		// 	}
		// }
	}

	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == buttonUnlock){
			setState(1);
		}
	}

	public static void main(String[] args){
		ScreenLock app = new ScreenLock();
	}
}