package com.moss.builder;

import java.util.HashMap;
import java.util.List;

import javax.swing.JComponent;

import com.moss.builder.components.Window;
import com.moss.main.Type;
import com.moss.properties.Frame;
import com.moss.tree.Tree;

public class Builder {

	private HashMap<String, String> windowStyles = new HashMap<String, String>();

	
	private com.moss.properties.Applier compProp; 
	// Component ID's
	final String JFRAME_ID = "window";

	final String PANEL_ID = "panel";
	public Builder(HashMap<String, HashMap<String, String>> styles) {
		this.compProp = new com.moss.properties.Applier(styles);
		if(styles.get(JFRAME_ID) !=null){
			windowStyles = styles.get(JFRAME_ID);
		}
	}

	private Window build(Type type, String id, String name, String text,
			Window window) {
		System.out.println("Type: " + type);
		if (type == Type.FRAME) {
			Frame windowStlye = new Frame();
			window = new Window(id, name);
			window = windowStlye.apply(window, windowStyles);
		}
		return window;
	}

	private JComponent compBuild(Type type, String id, String name,
			String text) {
		System.out.println("Type: " + type);
		if (type == Type.PANEL) {
			Items newComp = new Items(compProp);
			return newComp.create(type, id, name, text);
		} else {
			Items newComp = new Items(compProp);
			return newComp.create(type, id, name, text);
		}
	}

	private JComponent iterate(Tree tree, JComponent comp) {
		// Work through the tree of stuff
		List<Tree> elements = tree.getChildren();

		for (int i = 0; i < elements.size(); i++) {
			Tree element = elements.get(i);
			Type type = element.getType();
			String id = element.getId();
			String name = element.getName();
			String text = element.getBodyText();
			// Find type and create
			if (comp == null) {
				if (element.hasChildren()) {
					switch(type){
					case PANEL:
						comp = compBuild(type, id, name, text);
						iterate(element, comp);
						break;
					default:
						// Some other elements will have sub elements
						comp = compBuild(type, id, name, text);
						iterate(element, comp);
						break;
					}
				} else {
					comp = compBuild(type, id, name, text);
				}
			} else {
				if (element.hasChildren()) {
					switch(type){
					case PANEL:
						comp.add(compBuild(type, id, name, text));
						iterate(element, comp);
						break;
					default:
						// Some other elements will have sub elements
						comp.add(compBuild(type, id, name, text));
						iterate(element, comp);
						break;
					}
				} else {
					comp.add(compBuild(type, id, name, text));
				}
			}

		}
		return comp;
	}

	// Starts the building
	public Window start(Tree gsl, Window window) {
		window = build(gsl.getType(), gsl.getId(), gsl.getName(),
				gsl.getBodyText(), window);
		window.add(iterate(gsl, null));
		return window;
	}

}
