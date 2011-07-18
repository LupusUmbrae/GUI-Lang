package com.moss.main;

public enum Type {
	LABEL {
		public String toString() {
			return "label";
		}
	},

	BUTTON {
		public String toString() {
			return "button";
		}
	},

	FRAME {
		public String toString() {
			return "window";
		}
	},

	PANEL {
		public String toString() {
			return "panel";
		}
	};

}
