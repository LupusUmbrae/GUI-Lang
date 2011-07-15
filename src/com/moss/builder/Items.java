package com.moss.builder;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Items {

	com.moss.properties.Applier compProp;

	Items(com.moss.properties.Applier compProp) {
		this.compProp = compProp;
	}

	final String LABEL_ID = "label";
	final String BUTTON_ID = "button";
	final String PANEL_ID = "panel";

	public JComponent create(String type, String id, String name, String text) {
		// create base component then apply properties
		if (type.matches(LABEL_ID)) {
			return properties(new JLabel(text), id);
		} else if (type.matches(BUTTON_ID)) {
			return properties(new JButton(text), id);
		} else if (type.matches(PANEL_ID)) {
			return properties(new JPanel(), id);
		}
		return null;
	}

	public JComponent properties(JComponent comp, String id) {
		// Add properties from gss file
		return compProp.apply(comp, id);
	}
}
