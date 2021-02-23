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

		addPicture(image1, "Dice/Die1.png");
		addPicture(image2, "Dice/Die2.png");
	}

	private void addPicture(ImageIcon image, String path) {
		image = new ImageIcon(path);
		JLabel picLabel = new JLabel(image);
		add(picLabel);		// Add the labels and text fields to this panel.
	}

	public void showPropertyTax() {
		// Get the assessmentValue.
		double assessmentValue = Double.parseDouble(
				propertyValue.getText()) * .6;
		// Get the property tax.
		double propertyTax = assessmentValue * .0064;
		// Display them.
		JOptionPane.showMessageDialog(
				null,
				String.format(
						"Assessment Value: $%,.2f\nProperty tax: $%,.2f",
						assessmentValue,
						propertyTax));
	}
}
