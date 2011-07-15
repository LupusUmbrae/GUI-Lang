package com.moss.parser;

import java.io.IOException;
import java.util.HashMap;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

public class PropParser {

	public HashMap<String, HashMap<String, String>> propParse()
			throws IOException {
		String test = "c:\\style.txt";
		gssLexer lex = new gssLexer(new ANTLRFileStream(test));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		gssParser parser = new gssParser(tokens);

		HashMap<String, HashMap<String, String>> properties = new HashMap<String, HashMap<String, String>>();

		try {
			properties.putAll(parser.read());
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties;

	}
}
