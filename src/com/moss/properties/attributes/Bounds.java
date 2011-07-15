package com.moss.properties.attributes;

import javax.swing.JComponent;

public class Bounds {
	public JComponent setBounds(JComponent comp, String size, String pos) {
		// Work out what to set
		if (size != null && pos != null) {
			// set both
			Integer sizeX = Integer.parseInt(size.split(",")[0]);
			Integer sizeY = Integer.parseInt(size.split(",")[1]);
			Integer posX = Integer.parseInt(pos.split(",")[0]);
			Integer posY = Integer.parseInt(pos.split(",")[1]);
			comp.setBounds(posX, posY, sizeX, sizeY);
		} else if(size != null && pos == null) {
			// set size only
			Integer sizeX = Integer.parseInt(size.split(",")[0]);
			Integer sizeY = Integer.parseInt(size.split(",")[1]);
			comp.setSize(sizeX, sizeY);
		}
		return comp;
	}
}
