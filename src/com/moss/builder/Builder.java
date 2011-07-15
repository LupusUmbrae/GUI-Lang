package com.moss.builder;

import java.util.HashMap;
import java.util.List;

import javax.swing.JComponent;

import com.moss.tree.Tree;

public class Builder {

	public Builder(HashMap<String, HashMap<String, String>> styles) {
		this.compProp = new com.moss.properties.Applier(styles);
	}

	private com.moss.properties.Applier compProp;

	// Component ID's
	final String JFRAME_ID = "window";
	final String PANEL_ID = "panel";

	// Starts the building
	public Window start(Tree gsl, Window window) {
		window = build(gsl.getType(), gsl.getId(), gsl.getName(),
				gsl.getBodyText(), window);
		window.add(iterate(gsl, null));
		return window;
	}

	private JComponent iterate(Tree tree, JComponent comp) {
		// Work through the tree of stuff
		List<Tree> elements = tree.getChildren();

		for (int i = 0; i < elements.size(); i++) {
			Tree element = elements.get(i);
			String type = element.getType();
			String id = element.getId();
			String name = element.getName();
			String text = element.getBodyText();
			// Find type and create
			if (comp == null) {
				if (element.hasChildren()) {
					if (type.matches(PANEL_ID)) {
						comp = compBuild(type, id, name, text);
						iterate(element, comp);
					} else {
						// Some other elements will have sub elements
						comp = compBuild(type, id, name, text);
						iterate(element, comp);
					}
				} else {
					comp = compBuild(type, id, name, text);
				}
			} else {
				if (element.hasChildren()) {
					if (type.matches(PANEL_ID)) {
						comp.add(compBuild(type, id, name, text));
						iterate(element, comp);
					} else {
						// Some other elements will have sub elements
						comp.add(compBuild(type, id, name, text));
						iterate(element, comp);
					}
				} else {
					comp.add(compBuild(type, id, name, text));
				}
			}

		}
		return comp;
	}

	private Window build(String type, String id, String name, String text,
			Window window) {
		System.out.println("Type: " + type);
		if (type.matches(JFRAME_ID)) {
			window = new Window(id, name);
		}
		return window;
	}

	private JComponent compBuild(String type, String id, String name,
			String text) {
		System.out.println("Type: " + type);
		if (type.matches(PANEL_ID)) {
			Items newComp = new Items(compProp);
			return newComp.create(type, id, name, text);
		} else {
			Items newComp = new Items(compProp);
			return newComp.create(type, id, name, text);
		}
	}

}
