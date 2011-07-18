package com.moss.builder;
/**
 * Creates the swing object based on the type
 */
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.moss.main.Type;

public class Items {

	com.moss.properties.Applier compProp;

	Items(com.moss.properties.Applier compProp) {
		this.compProp = compProp;
	}


	public JComponent create(Type type, String id, String name, String text) {
		// create base component then apply properties
		switch(type){
		case LABEL:
			return properties(new JLabel(text), type, id, name);
		case BUTTON:
			return properties(new JButton(text), type, id, name);
		case PANEL:
			return properties(new JPanel(), type, id, name);
		}
		return null;
	}

	public JComponent properties(JComponent comp, Type type, String id, String name) {
		// Add properties from gss file
		return compProp.apply(comp, type, id, name);
	}
}
