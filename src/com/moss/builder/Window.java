package com.moss.builder;

import javax.swing.JFrame;

public class Window extends JFrame {

	Window(String id, String name) {
		setTitle("Simple example");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	Window create() {
		return this;
	}
}