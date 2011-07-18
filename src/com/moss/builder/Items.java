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
		case COLOR_CHOSER:
			break;
		case COMBO_BOX:
			break;
		case FILE_CHOOSER:
			break;
		case FRAME:
			break;
		case INTERNAL_FRAME:
			break;
		case LAYERED_PANE:
			break;
		case LIST:
			break;
		case MENU_BAR:
			break;
		case OPTION_PANE:
			break;
		case POPUP_MENU:
			break;
		case ROOT_PANE:
			break;
		case SCROLL_BAR:
			break;
		case SCROLL_PANE:
			break;
		case SEPARATOR:
			break;
		case SLIDER:
			break;
		case SPINNER:
			break;
		case SPLIT_PANE:
			break;
		case TABBED_PANE:
			break;
		case TABLE:
			break;
		case TABLE_HEADER:
			break;
		case TEXT_COMPONENT:
			break;
		case TOOL_BAR:
			break;
		case TOOL_TIP:
			break;
		case TREE:
			break;
		case VIEWPORT:
			break;
		}
		return null;
	}

	public JComponent properties(JComponent comp, Type type, String id, String name) {
		// Add properties from gss file
		return compProp.apply(comp, type, id, name);
	}
}
