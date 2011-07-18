package com.moss.main;

public enum Type {
	LABEL {
		@Override
		public String toString() {
			return "label";
		}
	},

	BUTTON {
		@Override
		public String toString() {
			return "button";
		}
	},

	FRAME {
		@Override
		public String toString() {
			return "window";
		}
	},

	PANEL {
		@Override
		public String toString() {
			return "panel";
		}
	},

	COLOR_CHOSER {
	},

	COMBO_BOX {
	},

	FILE_CHOOSER {
	},

	INTERNAL_FRAME {
	},

	LAYERED_PANE {
	},

	LIST {
	},

	MENU_BAR {
	},

	OPTION_PANE {
	},

	POPUP_MENU {
	},

	ROOT_PANE {
	},

	SCROLL_BAR {
	},

	SCROLL_PANE {
	},

	SEPARATOR {
	},

	SLIDER {
	},

	SPINNER {
	},

	SPLIT_PANE {
	},

	TABBED_PANE {
	},

	TABLE {
	},

	TABLE_HEADER {
	},

	TEXT_COMPONENT {
	},

	TOOL_BAR {
	},

	TOOL_TIP {
	},

	TREE {
	},

	VIEWPORT {
	};

}
