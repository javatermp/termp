package term_proj;

//Body2.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Body2 extends JPanel {
	private JButton button;
	private PictureChange ch;

	public Body2(PictureChange temp) {
		setLayout(null);
		ch = temp;

		setPreferredSize(new Dimension(600, 600));
		setBackground(Color.BLACK);

		button = new JButton("ÀüÈ¯2");
		button.setSize(100, 50);
		button.setLocation(250, 450);
		button.addActionListener(new ChangeListener());
		add(button);
	}

	private class ChangeListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			ch.change("picture1");
		}
	}
}