package com.moss.properties;

import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRootPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.JToolTip;
import javax.swing.JTree;
import javax.swing.JViewport;
import javax.swing.table.JTableHeader;
import javax.swing.text.JTextComponent;

import com.moss.main.Type;
import com.moss.properties.attributes.Bounds;
import com.moss.properties.attributes.Colour;

public class Applier {
	public HashMap<String, HashMap<String, String>> styles = new HashMap<String, HashMap<String, String>>();

	// Create a defaults style, should be override able in the gss
	public HashMap<String, String> defaults = new HashMap<String, String>();

	// Key Literals from GSS
	private final String LAYOUT_MANAGER_ID = "layoutManager";
	private final String SIZE_ID = "size";
	private final String POS_ID = "position";
	private final String BACKGROUND_COLOUR = "backgroundColour";
	private final String FOREGROUND_COLOUR = "foregroundColour";
	// TODO: Add the rest

	// Managers
	private final String LM_ABSOLUTE = "absolute";
	private final String LM_FLOW = "flow";
	private final String LM_BORDER = "border";
	private final String LM_BOX = "box";
	private final String LM_GRID = "grid";
	private final String LM_GROUP = "group";
	// TODO: Add the rest

	// Attribute Classes
	private Bounds bounds = new Bounds();
	private Colour colour = new Colour();

	public Applier(HashMap<String, HashMap<String, String>> styles) {
		this.styles = styles;
	}

	public JComponent apply(JComponent comp, Type type, String id, String name) {
		HashMap<String, String> style = new HashMap<String, String>();

		// Build item specific styles
		style.putAll(defaults);
		if (styles.get(type.toString()) != null) {
			style.putAll(styles.get(type.toString()));
		}
		if (styles.get(id) != null) {
			style.putAll(styles.get(id));
		}

		// TODO: Do generic settings
		comp.setName(name);
		// Colours.. yes it is spelt right!
		comp.setBackground(colour.colour(style.get(BACKGROUND_COLOUR)));
		comp.setForeground(colour.colour(style.get(FOREGROUND_COLOUR)));

		String size = (style.get(SIZE_ID));
		String pos = (style.get(POS_ID));
		comp = bounds.setBounds(comp, size, pos);

		// Add specific settings
		switch (type) {
		case BUTTON:
			comp = specApply((JButton) comp, style);
			break;
		case COLOR_CHOSER:
			comp = specApply((JColorChooser) comp, style);
			break;
		case COMBO_BOX:
			comp = specApply((JComboBox) comp, style);
			break;
		case FILE_CHOOSER:
			comp = specApply((JFileChooser) comp, style);
			break;
		case FRAME:
			// comp = specApply((JFrame) comp, style);
			break;
		case INTERNAL_FRAME:
			comp = specApply((JInternalFrame) comp, style);
			break;
		case LABEL:
			comp = specApply((JLabel) comp, style);
			break;
		case LAYERED_PANE:
			comp = specApply((JLayeredPane) comp, style);
			break;
		case LIST:
			comp = specApply((JList) comp, style);
			break;
		case MENU_BAR:
			comp = specApply((JMenuBar) comp, style);
			break;
		case OPTION_PANE:
			comp = specApply((JOptionPane) comp, style);
			break;
		case PANEL:
			comp = specApply((JPanel) comp, style);
			break;
		case POPUP_MENU:
			comp = specApply((JPopupMenu) comp, style);
			break;
		case ROOT_PANE:
			comp = specApply((JRootPane) comp, style);
			break;
		case SCROLL_BAR:
			comp = specApply((JScrollBar) comp, style);
			break;
		case SCROLL_PANE:
			comp = specApply((JScrollPane) comp, style);
			break;
		case SEPARATOR:
			comp = specApply((JSeparator) comp, style);
			break;
		case SLIDER:
			comp = specApply((JSlider) comp, style);
			break;
		case SPINNER:
			comp = specApply((JSpinner) comp, style);
			break;
		case SPLIT_PANE:
			comp = specApply((JSplitPane) comp, style);
			break;
		case TABBED_PANE:
			comp = specApply((JTabbedPane) comp, style);
			break;
		case TABLE:
			comp = specApply((JTable) comp, style);
			break;
		case TABLE_HEADER:
			comp = specApply((JTableHeader) comp, style);
			break;
		case TEXT_COMPONENT:
			comp = specApply((JTextComponent) comp, style);
			break;
		case TOOL_BAR:
			comp = specApply((JToolBar) comp, style);
			break;
		case TOOL_TIP:
			comp = specApply((JToolTip) comp, style);
			break;
		case TREE:
			comp = specApply((JTree) comp, style);
			break;
		case VIEWPORT:
			comp = specApply((JViewport) comp, style);
			break;
		}
		return comp;
	}

	@SuppressWarnings("unused")
	private void propDefaults() {
		// setup defaults
		// TODO: I'm sure i need to do this but its just effort and i'd rather
		// hack it to work for now :)
	}

	private JComponent specApply(JButton c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JColorChooser c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JComboBox c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JFileChooser c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JInternalFrame c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JLabel c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JLayeredPane c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JList c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JMenuBar c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JOptionPane c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JPanel c, HashMap<String, String> style) {

		// Layout Manager first.. *Gulp*
		String manager = (style.get(LAYOUT_MANAGER_ID));
		if (manager.matches(LM_ABSOLUTE)) {
			c.setLayout(null);
		} else if (manager.matches(LM_BORDER)) {
			// TODO: Work out how it works then write/cry
		} else if (manager.matches(LM_BOX)) {
			// TODO: Work out how it works then write/cry
		} else if (manager.matches(LM_FLOW)) {
			// TODO: Work out how it works then write/cry
		} else if (manager.matches(LM_GRID)) {
			// TODO: Work out how it works then write/cry
		} else if (manager.matches(LM_GROUP)) {
			// TODO: Work out how it works then write/cry
		}

		// And now the rest of the settings
		return c;
	}

	private JComponent specApply(JPopupMenu c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JRootPane c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JScrollBar c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JScrollPane c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JSeparator c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JSlider c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JSpinner c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JSplitPane c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JTabbedPane c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JTable c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JTableHeader c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JTextComponent c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JToolBar c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JToolTip c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JTree c, HashMap<String, String> style) {

		return c;
	}

	private JComponent specApply(JViewport c, HashMap<String, String> style) {

		return c;
	}

}
