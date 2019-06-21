package term_proj;

//Body1.java

import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.*;

public class Body1 extends JPanel {
	private JButton button;
	private PictureChange ch;
	private ImageIcon img;
	private JLabel la1, la2;
	private JTextField tf;
	private JPasswordField pf;

	public Body1(PictureChange temp) {
		setLayout(null);
		ch = temp;

		la1 = new JLabel("ID");
		la2 = new JLabel("PW");
		tf = new JTextField();
		pf = new JPasswordField();

		setPreferredSize(new Dimension(500, 300));
		img = new ImageIcon("C:/Users/MELEE/eclipse-workspace/TP/src/TP/Background1.gif");
		
		la1.setBounds(120, 40, 50, 20);
		la1.setForeground(Color.pink);
		la1.setFont(new Font("Serif", Font.BOLD, 15));
		tf.setBounds(150, 40, 200, 35);
		add(la1);
		add(tf);

		la2.setBounds(120, 120, 50, 20);
		la2.setForeground(Color.pink);
		la2.setFont(new Font("Serif", Font.BOLD, 15));
		pf.setBounds(150, 120, 200, 35);
		add(la2);
		add(pf);

		button = new JButton("sign in");
		button.setSize(100, 50);
		button.setLocation(200, 200);
		button.addActionListener(new ChangeListener());
		add(button);
	}

	public void paintComponent(Graphics g)
    {
		super.paintComponent(g);
        g.drawImage(img.getImage(), 0, 0, this);
    }

	private class ChangeListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			ch.change("picture2");
		}
	}
}
