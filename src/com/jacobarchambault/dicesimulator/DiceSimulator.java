package com.jacobarchambault.dicesimulator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
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
			dicePanel.rollDice();
			pack();
		}
	} // End of inner class

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DicePanel dicePanel; // A panel for displaying dice images.

	/**
	 * Constructor
	 */
	public DiceSimulator(
			String title) {
		super(
				title);
		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(
				WindowConstants.EXIT_ON_CLOSE);
		// Create a DicePanel object.
		dicePanel = new DicePanel();
		buildMenuBar();
		// Build the panel that contains the button.
		buildButtonPanel();
		// Add the panels to the content pane.
		add(
				dicePanel,
				BorderLayout.CENTER);
		// Pack and display the window.
		pack();
		setVisible(
				true);
	}

	/**
	 * The buildButtonPanel method creates a panel containing the Roll the dice
	 * button.
	 */
	private void buildButtonPanel() {
		// Create a button to roll dice.
		JButton calcButton = new JButton(
				"Roll the dice");
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

	private void buildMenuBar() {
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu(
				"File");
		JMenuItem diceRoller = new JMenuItem(
				"Click here to roll the dice");
		diceRoller.addActionListener(new CalcButtonListener());
		menu.add(
				diceRoller);
		menubar.add(
				menu);
		setJMenuBar(
				menubar);
	}

}
