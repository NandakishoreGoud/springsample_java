package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Simulator {
	public static void main(String[] args) {

		String input = "if we write a program and compile it, output";
		ArrayList<String> keyWordList = new ArrayList<String>();
		MultiColorHighlighting mm = new MultiColorHighlighting();
		keyWordList.add("as");
		keyWordList.add("if");
		keyWordList.add("and");
		keyWordList.add("then");
		keyWordList.add("when");
		System.out.println(mm.colorHighlighitng(input, keyWordList));

		Syntax model = new ModelSyntax();
		model.setColorHighliting(new MultiColorHighlighting());
		model.performColorHighlighitng();

	}
}
