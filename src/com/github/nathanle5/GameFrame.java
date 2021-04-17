package com.github.nathanle5;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GameFrame extends JFrame {

	private static final long serialVersionUID = 4543273208336829L;

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public GameFrame() {
		initialize();
	}

	/**
	 * Create the user interface.
	 */
	private void initialize() {
		setResizable(false);
		setTitle("Tic-Tac-Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 415);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
