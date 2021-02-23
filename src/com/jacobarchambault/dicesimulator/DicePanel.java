package com.jacobarchambault.dicesimulator;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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
						2));

		addPicture(image1, "Dice/Die2.png");
		addPicture(image2, "Dice/Die2.png");
	}

	private void addPicture(ImageIcon image, String path) {
		image = new ImageIcon(path);
		picLabel = new JLabel(image);
		add(picLabel);		// Add the labels and text fields to this panel.
	}

	public void showPropertyTax() {
	}
}
