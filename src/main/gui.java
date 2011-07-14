package main;

import java.io.IOException;

import javax.swing.SwingUtilities;

import parser.GuiParser;
import parser.PropParser;
import tree.Tree;
import builder.Builder;
import builder.Window;

public class gui {
	
	
	public static void main(String args[]) throws IOException {
		
		
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
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
