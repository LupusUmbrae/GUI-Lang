package com.moss.builder.components;

import javax.swing.JFrame;



public class Window extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Window(String id, String name) {
		setTitle("Simple example");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public Window create() {
		return this;
	}
}
