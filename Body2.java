package term_proj;

//Body2.java

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Body2 extends JPanel {
	private JButton button;
	private JButton map1, map2, map3, map4;
	private static JTextArea log;
	private JScrollPane scroll;
	public static JLabel gold;
	private PictureChange ch;
	static int num;
	static String text;
	static int total_gold = 0, total_exp = 0;

	public Body2(PictureChange temp) {
		setLayout(null);
		ch = temp;

		setPreferredSize(new Dimension(600, 600));

		log = new JTextArea();
		log.disable();
		scroll = new JScrollPane(log);
		scroll.setLocation(50, 100);
		scroll.setSize(300, 400);
		add(scroll);
		
		gold = new JLabel("Gold : ");
		gold.setSize(100, 30);
		gold.setLocation(100, 30);
		add(gold);

		button = new JButton("전환2");
		button.setSize(100, 50);
		button.setLocation(250, 500);
		button.addActionListener(new ChangeListener());
		add(button);

		map1 = new JButton("Map1");
		map1.setSize(80, 50);
		map1.setLocation(400, 100);
		map1.addActionListener(new Map1Listener());
		add(map1);

		map2 = new JButton("Map2");
		map2.setSize(80, 50);
		map2.setLocation(400, 200);
		map2.addActionListener(new Map2Listener());
		add(map2);

		map3 = new JButton("Map3");
		map3.setSize(80, 50);
		map3.setLocation(400, 300);
		map3.addActionListener(new Map3Listener());
		add(map3);

		map4 = new JButton("Map4");
		map4.setSize(80, 50);
		map4.setLocation(400, 400);
		map4.addActionListener(new Map4Listener());
		add(map4);
	}

	static void addLog(Object text) {
		log.append(text + "\n");
		log.setCaretPosition(log.getDocument().getLength());
	}

	private class ChangeListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			ch.change("picture1");
		}
	}

	private class Map1Listener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			num = 1;
			Map1 main = new Map1();
			main.start();
			map1.setEnabled(false);
			map2.setEnabled(true);
			map3.setEnabled(true);
			map4.setEnabled(true);
		}
	}

	private class Map2Listener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			num = 2;
			Map2 main = new Map2();
			main.start();
			map1.setEnabled(true);
			map2.setEnabled(false);
			map3.setEnabled(true);
			map4.setEnabled(true);
		}
	}

	private class Map3Listener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			num = 3;
			Map3 main = new Map3();
			main.start();
			map1.setEnabled(true);
			map2.setEnabled(true);
			map3.setEnabled(false);
			map4.setEnabled(true);
		}
	}

	private class Map4Listener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			num = 4;
			Map4 main = new Map4();
			main.start();
			map1.setEnabled(true);
			map2.setEnabled(true);
			map3.setEnabled(true);
			map4.setEnabled(false);
		}
	}
}

class Map1 extends Thread {
	Random r = new Random();
	private int map1_gold, map1_exp;

	public Map1() {

	}

	public synchronized void run() {
		Body2.addLog("Map1에 입장하였습니다");
		while (Body2.num == 1) {
			map1_gold = r.nextInt(10) + 1;
			Body2.total_gold += map1_gold;
			Body2.addLog(map1_gold);
			Body2.gold.setText("Gold : " + Body2.total_gold);
			try {
				sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Map2 extends Thread {
	Random r = new Random();
	private int map2_gold, map2_exp;

	public Map2() {

	}

	public synchronized void run() {
		Body2.addLog("Map2에 입장하였습니다");
		while (Body2.num == 2) {
			map2_gold = r.nextInt(90) + 11;
			Body2.total_gold += map2_gold;
			Body2.addLog(map2_gold);
			Body2.gold.setText("Gold : " + Body2.total_gold);
			try {
				sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Map3 extends Thread {
	Random r = new Random();
	int map3_gold, map3_exp;

	public Map3() {

	}

	public synchronized void run() {
		Body2.addLog("Map3에 입장하였습니다");
		while (Body2.num == 3) {
			map3_gold = r.nextInt(900) + 101;
			Body2.total_gold += map3_gold;
			Body2.addLog(map3_gold);
			Body2.gold.setText("Gold : " + Body2.total_gold);
			try {
				sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Map4 extends Thread {
	Random r = new Random();
	private int map4_gold, map4_exp;

	public Map4() {

	}

	public synchronized void run() {
		Body2.addLog("Map4에 입장하였습니다");
		while (Body2.num == 4) {
			map4_gold = r.nextInt(9000) + 1001;
			Body2.total_gold += map4_gold;
			Body2.addLog(map4_gold);
			Body2.gold.setText("Gold : " + Body2.total_gold);
			try {
				sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
