package com.moss.parser;

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import com.moss.tree.Tree;

public class GuiParser {

	@SuppressWarnings("rawtypes")
	public Tree guiParse() throws IOException {
		String test = "c:\\gui.txt";
		gslLexer lex = new gslLexer(new ANTLRFileStream(test));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		gslParser parser = new gslParser(tokens);

		Tree elements = new Tree();

		try {
			elements = parser.window();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return elements;

	}
}
