package properties;

import java.awt.Color;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Applier {
	public HashMap<String, HashMap<String, String>> styles = new HashMap<String, HashMap<String, String>>();
	// Create a defaults style, should be overridable in the gss
	public HashMap<String, String> defaults = new HashMap<String, String>();

	public Applier(HashMap<String, HashMap<String, String>> styles) {
		this.styles = styles;
	}

	// Settings
	private final String LAYOUT_MANAGER_ID = "layoutManager";
	private final String SIZE_ID = "size";
	private final String POS_ID = "position";
	//TODO: Add the rest

	// Object Styles
	private final String LABEL_ID = "label";
	private final String BUTTON_ID = "button";
	private final String PANEL_ID = "panel";
	// TODO: Add the rest

	// Managers
	private final String LM_ABSOLUTE = "absolute";
	private final String LM_FLOW = "flow";
	private final String LM_BORDER = "border";
	private final String LM_BOX = "box";
	private final String LM_GRID = "grid";
	private final String LM_GROUP = "group";

	// TODO: Add the rest

	public JComponent apply(JComponent comp, String id) {
		id = (id == null) ? "default" : id;
		HashMap<String, String> style = new HashMap<String, String>();

		// Puts the ID specific styles into current styles, unless styles are
		// null then uses defaults
		style.putAll((styles.get(id) == null) ? defaults : styles.get(id));
		// Do generic settings

		// Add specific settings
		if (comp instanceof JPanel) {
			comp = specApply((JPanel) comp, style);
		} else if (comp instanceof JButton) {
			comp = specApply((JButton) comp, style);
		} else if (comp instanceof JLabel) {
			comp = specApply((JLabel) comp, style);
		}
		return comp;
	}

	private void propDefaults() {
		// setup defaults
		// TODO: I'm sure i need to do this but its just effort and i'd rather
		// hack it to work for now :)
	}

	private Color getColor(String colorId) {
		return null;
	}

	private JComponent specApply(JPanel c, HashMap<String, String> style) {
		HashMap<String, String> lDefaults = new HashMap<String, String>(defaults);
		lDefaults.putAll(styles.get(PANEL_ID));
		// Layout Manager first.. *Gulp*
		String manager = (style.get(LAYOUT_MANAGER_ID) == null) ? lDefaults
				.get(LAYOUT_MANAGER_ID) : style.get(LAYOUT_MANAGER_ID);
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

	private JComponent specApply(JButton c, HashMap<String, String> style) {
		HashMap<String, String> lDefaults = new HashMap<String, String>(defaults);
		lDefaults.putAll(styles.get(BUTTON_ID));
		String size = (style.get(SIZE_ID) == null) ? lDefaults.get(SIZE_ID)
				: style.get(SIZE_ID);
		Integer sizeX = Integer.parseInt(size.split(",")[0]);
		Integer sizeY = Integer.parseInt(size.split(",")[1]);
		String pos = (style.get(POS_ID) == null) ? lDefaults.get(POS_ID) : style
				.get(POS_ID);
		Integer posX = Integer.parseInt(pos.split(",")[0]);
		Integer posY = Integer.parseInt(pos.split(",")[1]);
		c.setBounds(posX, posY, sizeX, sizeY);

		return c;
	}

	private JComponent specApply(JLabel c, HashMap<String, String> style) {
		HashMap<String, String> lDefaults = new HashMap<String, String>(defaults);
		lDefaults.putAll(styles.get(LABEL_ID));

		String size = (style.get(SIZE_ID) == null) ? lDefaults.get(SIZE_ID)
				: style.get(SIZE_ID);
		Integer sizeX = Integer.parseInt(size.split(",")[0]);
		Integer sizeY = Integer.parseInt(size.split(",")[1]);
		String pos = (style.get(POS_ID) == null) ? lDefaults.get(POS_ID)
				: style.get(POS_ID);
		Integer posX = Integer.parseInt(pos.split(",")[0]);
		Integer posY = Integer.parseInt(pos.split(",")[1]);
		c.setBounds(posX, posY, sizeX, sizeY);
		return c;
	}
}
