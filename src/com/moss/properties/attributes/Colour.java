package com.moss.properties.attributes;

import java.awt.Color;

public class Colour {

	public Color colour(String nm) {
		if(nm == null){
			return null;
		}
		nm.toLowerCase();
		if (nm.startsWith("#")) {
			nm = nm.substring(1);
			return Color.decode(Integer.valueOf(nm, 16).toString());
		} else if (nm.matches("black")) {
			return Color.BLACK;
		} else if (nm.matches("blue")) {
			return Color.BLUE;
		} else if (nm.matches("cyan")) {
			return Color.CYAN;
		} else if (nm.matches("dark gray")) {
			return Color.DARK_GRAY;
		} else if (nm.matches("gray")) {
			return Color.GRAY;
		} else if (nm.matches("green")) {
			return Color.GREEN;
		} else if (nm.matches("light gray")) {
			return Color.LIGHT_GRAY;
		} else if (nm.matches("magenta")) {
			return Color.MAGENTA;
		} else if (nm.matches("orange")) {
			return Color.ORANGE;
		} else if (nm.matches("pink")) {
			return Color.PINK;
		} else if (nm.matches("red")) {
			return Color.RED;
		} else if (nm.matches("white")) {
			return Color.WHITE;
		} else if (nm.matches("yellow")) {
			return Color.YELLOW;
		} else {
			String[] rgb = nm.split(",");
			if (rgb.length == 3){
				String r = Integer.toHexString(Integer.parseInt(rgb[0]));
				String g = Integer.toHexString(Integer.parseInt(rgb[1]));
				String b = Integer.toHexString(Integer.parseInt(rgb[2]));
				
				return Color.decode(Integer.valueOf(r+g+b, 16).toString());
			}else{
				return null;
			}
		}
	}

}
