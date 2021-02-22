package com.jacobarchambault.dicesimulator;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PropertyTaxPanel extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField propertyValue; // To get property value

	/**
	 * Constructor
	 */
	public PropertyTaxPanel() {
		// Create a text field.
		propertyValue = new JTextField(
				10);
		// Create a GridLayout manager.
		setLayout(
				new GridLayout(
						1,
						2));
		// Add the labels and text fields to this panel.
		add(
				new JLabel(
						"Enter the actual property value:"));
		add(
				propertyValue);
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
