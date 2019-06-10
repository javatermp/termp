package term_proj;

//Body1.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Body1 extends JPanel {
	private JButton button;
	private PictureChange ch;

	public Body1(PictureChange temp) {
		setLayout(null);
		ch = temp;
		

		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.BLUE);

		button = new JButton("ÀüÈ¯1");
		button.setSize(100, 50);
		button.setLocation(200, 350);
		button.addActionListener(new ChangeListener());
		add(button);
	}

	private class ChangeListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			ch.change("picture2");
		}
	}
}