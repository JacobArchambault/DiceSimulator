package com.jacobarchambault.dicesimulator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class DiceSimulator extends JFrame {
	/**
	 * CalcButtonListener is an action listener class for the calcButton component.
	 */
	private class CalcButtonListener implements ActionListener {
		/**
		 * actionPerformed method
		 * 
		 * @param e An ActionEvent object.
		 */
		@Override
		public void actionPerformed(
				ActionEvent e) {
			propertyTaxPanel.showPropertyTax();
		}
	} // End of inner class

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	private DicePanel propertyTaxPanel; // A panel for displaying assessmentValue and tax

	/**
	 * Constructor
	 */
	public DiceSimulator(String title) {
		super(title);
		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(
				WindowConstants.EXIT_ON_CLOSE);
		// Create a PropertyTaxPanel object.
		propertyTaxPanel = new DicePanel();
		// Build the panel that contains the button.
		buildButtonPanel();
		// Add the panels to the content pane.
		add(
				propertyTaxPanel,
				BorderLayout.CENTER);
		// Pack and display the window.
		pack();
		setVisible(
				true);
	}

	/**
	 * The buildButtonPanel method creates a panel containing the calc property tax button.
	 */
	private void buildButtonPanel() {
		// Create a button to calculate the property tax.
		JButton calcButton = new JButton(
				"Calculate Property tax");
		// Add an action listener to the button.
		calcButton.addActionListener(
				new CalcButtonListener());
		// Put the button in its own panel.
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(
				calcButton);
		add(
				buttonPanel,
				BorderLayout.SOUTH);

	}

}
