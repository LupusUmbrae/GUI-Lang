package com.moss.properties;

import java.util.HashMap;

import com.moss.builder.components.Window;

public class Frame {

	public Window apply(Window window, HashMap<String, String> style) {
		if(style.get("size") != null){
			String size = (style.get("size"));
			Integer sizeX = Integer.parseInt(size.split(",")[0]);
			Integer sizeY = Integer.parseInt(size.split(",")[1]);
			window.setSize(sizeX, sizeY);
		}
		return window;
	}
}
