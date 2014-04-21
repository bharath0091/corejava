package com.bharath0091.file;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("click");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(button);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
