package com.moss.properties.attributes;

import javax.swing.JComponent;

public class bounds {
	public JComponent setBounds(JComponent comp, String size, String pos) {
		Integer sizeX = Integer.parseInt(size.split(",")[0]);
		Integer sizeY = Integer.parseInt(size.split(",")[1]);
		Integer posX = Integer.parseInt(pos.split(",")[0]);
		Integer posY = Integer.parseInt(pos.split(",")[1]);
		comp.setBounds(posX, posY, sizeX, sizeY);
		return comp;
	}
}
