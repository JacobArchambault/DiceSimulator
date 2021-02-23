package com.jacobarchambault.dicesimulator;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DicePanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField propertyValue; // To get property value
	private ImageIcon image1;
	private ImageIcon image2;
	private JLabel picLabel;
	private JLabel picLabel2;

	/**
	 * Constructor
	 */
	public DicePanel() {
		// Create a text field.
		propertyValue = new JTextField(
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

	private void addPicture(ImageIcon image, String path) {
		image = new ImageIcon(path);
		picLabel = new JLabel(image);
		add(picLabel);
	}

	public void showPropertyTax() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 7);
		int randomNum2 = ThreadLocalRandom.current().nextInt(1, 7);
		picLabel.setIcon(new ImageIcon("Dice/Die" + randomNum + ".png"));
		picLabel2.setIcon(new ImageIcon("Dice/Die" + randomNum2 + ".png"));
	}
}
