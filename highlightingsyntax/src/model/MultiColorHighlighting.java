package model;

import java.util.ArrayList;

public class MultiColorHighlighting implements ColorHighlighting {

	 String colorHighlighitng(String inputText, ArrayList<String> keyWordColor) {
		for (String keyword : keyWordColor) {
			inputText = inputText.replace(keyword, "[blue]" + keyword + "[blue]");
		}
		return inputText;

	}

	public void colorHighlighitng() {

	}

}
