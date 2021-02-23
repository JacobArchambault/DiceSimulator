package com.jacobarchambault.dicesimulator;

import java.awt.GridLayout;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DicePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ImageIcon image1;
	private ImageIcon image2;
	private JLabel picLabel;
	private JLabel picLabel2;

	/**
	 * Constructor
	 */
	public DicePanel() {
		new JTextField(
				10);
		// Create a GridLayout manager.
		setLayout(
				new GridLayout(
						1,
						3));
		image1 = new ImageIcon("Dice/Die1.png");
		picLabel = new JLabel(image1);
		add(picLabel);
		image2 = new ImageIcon("Dice/Die2.png");
		picLabel2 = new JLabel(image2);
		add(picLabel2);
	}

	public void rollDice() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 7);
		int randomNum2 = ThreadLocalRandom.current().nextInt(1, 7);
		picLabel.setIcon(new ImageIcon("Dice/Die" + randomNum + ".png"));
		picLabel2.setIcon(new ImageIcon("Dice/Die" + randomNum2 + ".png"));
	}
}
