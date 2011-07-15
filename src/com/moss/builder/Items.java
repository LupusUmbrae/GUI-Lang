package com.moss.builder;
/**
 * Creates the swing object based on the type
 */
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
			return properties(new JLabel(text), LABEL_ID, id, name);
		} else if (type.matches(BUTTON_ID)) {
			return properties(new JButton(text), BUTTON_ID, id, name);
		} else if (type.matches(PANEL_ID)) {
			return properties(new JPanel(), PANEL_ID, id, name);
		}
		return null;
	}

	public JComponent properties(JComponent comp, String type, String id, String name) {
		// Add properties from gss file
		return compProp.apply(comp, type, id, name);
	}
}
