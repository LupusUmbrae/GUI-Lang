package com.moss.main;

import java.io.IOException;

import javax.swing.SwingUtilities;

import com.moss.builder.Builder;
import com.moss.builder.components.Window;
import com.moss.parser.GuiParser;
import com.moss.parser.PropParser;

public class gui {

	public static void main(String args[]) throws IOException {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				Window window = null;
				GuiParser parser = new GuiParser();
				PropParser gssParser = new PropParser();

				try {
					Builder build = new Builder(gssParser.propParse());
					window = build.start(parser.guiParse(), null);
					window.setVisible(true);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

	}
}
